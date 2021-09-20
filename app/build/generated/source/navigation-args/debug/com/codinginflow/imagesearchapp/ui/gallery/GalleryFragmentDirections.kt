package com.codinginflow.imagesearchapp.ui.gallery

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.codinginflow.imagesearchapp.R
import com.codinginflow.imagesearchapp.data.UnsplashPhoto
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class GalleryFragmentDirections private constructor() {
  private data class ActionGalleryFragmentToDetailsFragment(
    val photo: UnsplashPhoto
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_galleryFragment_to_detailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(UnsplashPhoto::class.java)) {
        result.putParcelable("photo", this.photo as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(UnsplashPhoto::class.java)) {
        result.putSerializable("photo", this.photo as Serializable)
      } else {
        throw UnsupportedOperationException(UnsplashPhoto::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionGalleryFragmentToDetailsFragment(photo: UnsplashPhoto): NavDirections =
        ActionGalleryFragmentToDetailsFragment(photo)
  }
}
