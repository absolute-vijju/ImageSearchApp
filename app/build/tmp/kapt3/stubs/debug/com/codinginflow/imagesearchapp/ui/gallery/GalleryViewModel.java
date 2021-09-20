package com.codinginflow.imagesearchapp.ui.gallery;

import androidx.hilt.Assisted;
import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.codinginflow.imagesearchapp.data.UnsplashRepository;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tR\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/codinginflow/imagesearchapp/ui/gallery/GalleryViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/codinginflow/imagesearchapp/data/UnsplashRepository;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/codinginflow/imagesearchapp/data/UnsplashRepository;Landroidx/lifecycle/SavedStateHandle;)V", "currentQuery", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "photos", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/codinginflow/imagesearchapp/data/UnsplashPhoto;", "getPhotos", "()Landroidx/lifecycle/LiveData;", "searchPhotos", "", "query", "Companion", "app_debug"})
public final class GalleryViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> currentQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.codinginflow.imagesearchapp.data.UnsplashPhoto>> photos = null;
    private final com.codinginflow.imagesearchapp.data.UnsplashRepository repository = null;
    private static final java.lang.String CURRENT_QUERY = "current_query";
    private static final java.lang.String DEFAULT_QUERY = "cats";
    public static final com.codinginflow.imagesearchapp.ui.gallery.GalleryViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.codinginflow.imagesearchapp.data.UnsplashPhoto>> getPhotos() {
        return null;
    }
    
    public final void searchPhotos(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public GalleryViewModel(@org.jetbrains.annotations.NotNull()
    com.codinginflow.imagesearchapp.data.UnsplashRepository repository, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/codinginflow/imagesearchapp/ui/gallery/GalleryViewModel$Companion;", "", "()V", "CURRENT_QUERY", "", "DEFAULT_QUERY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}