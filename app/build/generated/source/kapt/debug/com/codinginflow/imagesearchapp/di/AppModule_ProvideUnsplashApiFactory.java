package com.codinginflow.imagesearchapp.di;

import com.codinginflow.imagesearchapp.api.UnsplashApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideUnsplashApiFactory implements Factory<UnsplashApi> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideUnsplashApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public UnsplashApi get() {
    return provideUnsplashApi(retrofitProvider.get());
  }

  public static AppModule_ProvideUnsplashApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideUnsplashApiFactory(retrofitProvider);
  }

  public static UnsplashApi provideUnsplashApi(Retrofit retrofit) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideUnsplashApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
