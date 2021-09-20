package com.codinginflow.imagesearchapp.data;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.codinginflow.imagesearchapp.api.UnsplashApi;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/codinginflow/imagesearchapp/data/UnsplashRepository;", "", "unsplashApi", "Lcom/codinginflow/imagesearchapp/api/UnsplashApi;", "(Lcom/codinginflow/imagesearchapp/api/UnsplashApi;)V", "getSearchResults", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/codinginflow/imagesearchapp/data/UnsplashPhoto;", "query", "", "app_debug"})
@javax.inject.Singleton()
public final class UnsplashRepository {
    private final com.codinginflow.imagesearchapp.api.UnsplashApi unsplashApi = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.codinginflow.imagesearchapp.data.UnsplashPhoto>> getSearchResults(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @javax.inject.Inject()
    public UnsplashRepository(@org.jetbrains.annotations.NotNull()
    com.codinginflow.imagesearchapp.api.UnsplashApi unsplashApi) {
        super();
    }
}