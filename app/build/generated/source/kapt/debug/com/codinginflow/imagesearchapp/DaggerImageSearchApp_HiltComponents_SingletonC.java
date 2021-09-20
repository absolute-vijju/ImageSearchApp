package com.codinginflow.imagesearchapp;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.codinginflow.imagesearchapp.api.UnsplashApi;
import com.codinginflow.imagesearchapp.data.UnsplashRepository;
import com.codinginflow.imagesearchapp.di.AppModule;
import com.codinginflow.imagesearchapp.di.AppModule_ProvideRetrofitFactory;
import com.codinginflow.imagesearchapp.di.AppModule_ProvideUnsplashApiFactory;
import com.codinginflow.imagesearchapp.ui.gallery.GalleryFragment;
import com.codinginflow.imagesearchapp.ui.gallery.GalleryViewModel_AssistedFactory;
import com.codinginflow.imagesearchapp.ui.gallery.GalleryViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerImageSearchApp_HiltComponents_SingletonC extends ImageSearchApp_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object unsplashApi = new MemoizedSentinel();

  private volatile Object unsplashRepository = new MemoizedSentinel();

  private volatile Provider<UnsplashRepository> unsplashRepositoryProvider;

  private DaggerImageSearchApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRetrofitFactory.provideRetrofit();
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private UnsplashApi getUnsplashApi() {
    Object local = unsplashApi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = unsplashApi;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideUnsplashApiFactory.provideUnsplashApi(getRetrofit());
          unsplashApi = DoubleCheck.reentrantCheck(unsplashApi, local);
        }
      }
    }
    return (UnsplashApi) local;
  }

  private UnsplashRepository getUnsplashRepository() {
    Object local = unsplashRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = unsplashRepository;
        if (local instanceof MemoizedSentinel) {
          local = new UnsplashRepository(getUnsplashApi());
          unsplashRepository = DoubleCheck.reentrantCheck(unsplashRepository, local);
        }
      }
    }
    return (UnsplashRepository) local;
  }

  private Provider<UnsplashRepository> getUnsplashRepositoryProvider() {
    Object local = unsplashRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      unsplashRepositoryProvider = (Provider<UnsplashRepository>) local;
    }
    return (Provider<UnsplashRepository>) local;
  }

  @Override
  public void injectImageSearchApp(ImageSearchApp imageSearchApp) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public ImageSearchApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerImageSearchApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements ImageSearchApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public ImageSearchApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends ImageSearchApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements ImageSearchApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public ImageSearchApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends ImageSearchApp_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<GalleryViewModel_AssistedFactory> galleryViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private GalleryViewModel_AssistedFactory getGalleryViewModel_AssistedFactory() {
        return GalleryViewModel_AssistedFactory_Factory.newInstance(DaggerImageSearchApp_HiltComponents_SingletonC.this.getUnsplashRepositoryProvider());
      }

      private Provider<GalleryViewModel_AssistedFactory> getGalleryViewModel_AssistedFactoryProvider(
          ) {
        Object local = galleryViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          galleryViewModel_AssistedFactoryProvider = (Provider<GalleryViewModel_AssistedFactory>) local;
        }
        return (Provider<GalleryViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.codinginflow.imagesearchapp.ui.gallery.GalleryViewModel", (Provider) getGalleryViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerImageSearchApp_HiltComponents_SingletonC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements ImageSearchApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public ImageSearchApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends ImageSearchApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerImageSearchApp_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectGalleryFragment(GalleryFragment arg0) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements ImageSearchApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public ImageSearchApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends ImageSearchApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements ImageSearchApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public ImageSearchApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends ImageSearchApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.codinginflow.imagesearchapp.ui.gallery.GalleryViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getGalleryViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements ImageSearchApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public ImageSearchApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends ImageSearchApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.codinginflow.imagesearchapp.data.UnsplashRepository 
        return (T) DaggerImageSearchApp_HiltComponents_SingletonC.this.getUnsplashRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
