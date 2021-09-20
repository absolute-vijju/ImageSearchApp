package com.codinginflow.imagesearchapp.data;

import androidx.paging.PagingSource;
import com.codinginflow.imagesearchapp.api.UnsplashApi;
import retrofit2.HttpException;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ+\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/codinginflow/imagesearchapp/data/UnsplashPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/codinginflow/imagesearchapp/data/UnsplashPhoto;", "unsplashApi", "Lcom/codinginflow/imagesearchapp/api/UnsplashApi;", "query", "", "(Lcom/codinginflow/imagesearchapp/api/UnsplashApi;Ljava/lang/String;)V", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UnsplashPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.codinginflow.imagesearchapp.data.UnsplashPhoto> {
    private final com.codinginflow.imagesearchapp.api.UnsplashApi unsplashApi = null;
    private final java.lang.String query = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.codinginflow.imagesearchapp.data.UnsplashPhoto>> p1) {
        return null;
    }
    
    public UnsplashPagingSource(@org.jetbrains.annotations.NotNull()
    com.codinginflow.imagesearchapp.api.UnsplashApi unsplashApi, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        super();
    }
}