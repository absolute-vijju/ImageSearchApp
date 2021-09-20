package com.codinginflow.imagesearchapp.data;

import com.codinginflow.imagesearchapp.api.UnsplashApi;
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
public final class UnsplashRepository_Factory implements Factory<UnsplashRepository> {
  private final Provider<UnsplashApi> unsplashApiProvider;

  public UnsplashRepository_Factory(Provider<UnsplashApi> unsplashApiProvider) {
    this.unsplashApiProvider = unsplashApiProvider;
  }

  @Override
  public UnsplashRepository get() {
    return newInstance(unsplashApiProvider.get());
  }

  public static UnsplashRepository_Factory create(Provider<UnsplashApi> unsplashApiProvider) {
    return new UnsplashRepository_Factory(unsplashApiProvider);
  }

  public static UnsplashRepository newInstance(UnsplashApi unsplashApi) {
    return new UnsplashRepository(unsplashApi);
  }
}
