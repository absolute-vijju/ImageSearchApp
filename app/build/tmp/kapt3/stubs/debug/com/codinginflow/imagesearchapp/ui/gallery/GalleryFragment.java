package com.codinginflow.imagesearchapp.ui.gallery;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.paging.LoadState;
import com.codinginflow.imagesearchapp.R;
import com.codinginflow.imagesearchapp.data.UnsplashPhoto;
import com.codinginflow.imagesearchapp.databinding.FragmentGalleryBinding;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcom/codinginflow/imagesearchapp/ui/gallery/GalleryFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoAdapter$OnItemClickListener;", "()V", "_binding", "Lcom/codinginflow/imagesearchapp/databinding/FragmentGalleryBinding;", "binding", "getBinding", "()Lcom/codinginflow/imagesearchapp/databinding/FragmentGalleryBinding;", "viewModel", "Lcom/codinginflow/imagesearchapp/ui/gallery/GalleryViewModel;", "getViewModel", "()Lcom/codinginflow/imagesearchapp/ui/gallery/GalleryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onItemClick", "photo", "Lcom/codinginflow/imagesearchapp/data/UnsplashPhoto;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class GalleryFragment extends androidx.fragment.app.Fragment implements com.codinginflow.imagesearchapp.ui.gallery.UnsplashPhotoAdapter.OnItemClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.codinginflow.imagesearchapp.databinding.FragmentGalleryBinding _binding;
    private java.util.HashMap _$_findViewCache;
    
    private final com.codinginflow.imagesearchapp.ui.gallery.GalleryViewModel getViewModel() {
        return null;
    }
    
    private final com.codinginflow.imagesearchapp.databinding.FragmentGalleryBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.codinginflow.imagesearchapp.data.UnsplashPhoto photo) {
    }
    
    public GalleryFragment() {
        super();
    }
}