package com.codinginflow.imagesearchapp.ui.gallery;

import com.codinginflow.imagesearchapp.data.UnsplashRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GalleryViewModel_AssistedFactory_Factory implements Factory<GalleryViewModel_AssistedFactory> {
  private final Provider<UnsplashRepository> repositoryProvider;

  public GalleryViewModel_AssistedFactory_Factory(Provider<UnsplashRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GalleryViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static GalleryViewModel_AssistedFactory_Factory create(
      Provider<UnsplashRepository> repositoryProvider) {
    return new GalleryViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static GalleryViewModel_AssistedFactory newInstance(
      Provider<UnsplashRepository> repository) {
    return new GalleryViewModel_AssistedFactory(repository);
  }
}
