package com.codinginflow.imagesearchapp.api;

import com.codinginflow.imagesearchapp.BuildConfig;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/codinginflow/imagesearchapp/api/UnsplashApi;", "", "searchPhotos", "Lcom/codinginflow/imagesearchapp/api/UnsplashResponse;", "query", "", "page", "", "perPage", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface UnsplashApi {
    public static final com.codinginflow.imagesearchapp.api.UnsplashApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.unsplash.com/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLIENT_ID = "beJX8ekcaTIFGp0Cf5gvHynMdVkbTqvw1U19y-dJ3w0";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/photos")
    @retrofit2.http.Headers(value = {"Accept-Version: v1", "Authorization: Client-ID beJX8ekcaTIFGp0Cf5gvHynMdVkbTqvw1U19y-dJ3w0"})
    public abstract java.lang.Object searchPhotos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int perPage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codinginflow.imagesearchapp.api.UnsplashResponse> p3);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/codinginflow/imagesearchapp/api/UnsplashApi$Companion;", "", "()V", "BASE_URL", "", "CLIENT_ID", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://api.unsplash.com/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CLIENT_ID = "beJX8ekcaTIFGp0Cf5gvHynMdVkbTqvw1U19y-dJ3w0";
        
        private Companion() {
            super();
        }
    }
}