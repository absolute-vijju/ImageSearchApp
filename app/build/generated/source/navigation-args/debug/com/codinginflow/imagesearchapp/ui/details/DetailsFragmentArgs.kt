package com.codinginflow.imagesearchapp.ui.details

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.codinginflow.imagesearchapp.data.UnsplashPhoto
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class DetailsFragmentArgs(
  val photo: UnsplashPhoto
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
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

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __photo : UnsplashPhoto?
      if (bundle.containsKey("photo")) {
        if (Parcelable::class.java.isAssignableFrom(UnsplashPhoto::class.java) ||
            Serializable::class.java.isAssignableFrom(UnsplashPhoto::class.java)) {
          __photo = bundle.get("photo") as UnsplashPhoto?
        } else {
          throw UnsupportedOperationException(UnsplashPhoto::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__photo == null) {
          throw IllegalArgumentException("Argument \"photo\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"photo\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__photo)
    }
  }
}
