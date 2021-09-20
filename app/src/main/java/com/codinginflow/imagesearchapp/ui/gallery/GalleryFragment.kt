package com.codinginflow.imagesearchapp.ui.gallery

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import com.codinginflow.imagesearchapp.R
import com.codinginflow.imagesearchapp.data.UnsplashPhoto
import com.codinginflow.imagesearchapp.databinding.FragmentGalleryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GalleryFragment : Fragment(R.layout.fragment_gallery),
    UnsplashPhotoAdapter.OnItemClickListener {

    private val viewModel by viewModels<GalleryViewModel>()

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentGalleryBinding.bind(view)

        val unsplashPhotoAdapter = UnsplashPhotoAdapter(this)

        binding.apply {
            rvPhotos.setHasFixedSize(true)
            rvPhotos.itemAnimator = null
            rvPhotos.adapter = unsplashPhotoAdapter.withLoadStateHeaderAndFooter(
                header = UnsplashPhotoLoadStateAdapter {
                    unsplashPhotoAdapter.retry()
                },
                footer = UnsplashPhotoLoadStateAdapter {
                    unsplashPhotoAdapter.retry()
                },
            )
            btnRetry.setOnClickListener { unsplashPhotoAdapter.retry() }
        }

        viewModel.photos.observe(viewLifecycleOwner) {
            unsplashPhotoAdapter.submitData(viewLifecycleOwner.lifecycle, it)
        }

        unsplashPhotoAdapter.addLoadStateListener { loadState ->
            binding.apply {
                progressBar.isVisible = loadState.source.refresh is LoadState.Loading
                rvPhotos.isVisible = loadState.source.refresh is LoadState.NotLoading
                btnRetry.isVisible = loadState.source.refresh is LoadState.Error
                tvError.isVisible = loadState.source.refresh is LoadState.Error

                // empty view
                if (loadState.source.refresh is LoadState.NotLoading &&
                    loadState.append.endOfPaginationReached &&
                    unsplashPhotoAdapter.itemCount < 1
                ) {
                    rvPhotos.isVisible = false
                    tvEmpty.isVisible = true
                } else
                    tvEmpty.isVisible = false
            }
        }

        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.menu_gallery, menu)

        val searchItem = menu.findItem(R.id.mSearch)
        val searchView = searchItem.actionView as SearchView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let {
                    binding.rvPhotos.scrollToPosition(0)
                    viewModel.searchPhotos(it)
                    searchView.clearFocus() // Hide the keyboard
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemClick(photo: UnsplashPhoto) {
        GalleryFragmentDirections.actionGalleryFragmentToDetailsFragment(photo).apply {
            findNavController().navigate(this)
        }
    }
}