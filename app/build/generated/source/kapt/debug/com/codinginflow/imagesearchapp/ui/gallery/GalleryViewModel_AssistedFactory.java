package com.codinginflow.imagesearchapp.ui.gallery;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.codinginflow.imagesearchapp.data.UnsplashRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class GalleryViewModel_AssistedFactory implements ViewModelAssistedFactory<GalleryViewModel> {
  private final Provider<UnsplashRepository> repository;

  @Inject
  GalleryViewModel_AssistedFactory(Provider<UnsplashRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public GalleryViewModel create(SavedStateHandle arg0) {
    return new GalleryViewModel(repository.get(), arg0);
  }
}
