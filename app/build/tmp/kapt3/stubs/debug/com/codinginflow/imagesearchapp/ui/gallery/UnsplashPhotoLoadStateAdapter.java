package com.codinginflow.imagesearchapp.ui.gallery;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.paging.LoadState;
import androidx.paging.LoadStateAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.codinginflow.imagesearchapp.databinding.UnsplashPhotoLoadStateFooterBinding;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0010B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoLoadStateAdapter;", "Landroidx/paging/LoadStateAdapter;", "Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoLoadStateAdapter$LoadStateViewHolder;", "retry", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getRetry", "()Lkotlin/jvm/functions/Function0;", "onBindViewHolder", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "LoadStateViewHolder", "app_debug"})
public final class UnsplashPhotoLoadStateAdapter extends androidx.paging.LoadStateAdapter<com.codinginflow.imagesearchapp.ui.gallery.UnsplashPhotoLoadStateAdapter.LoadStateViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codinginflow.imagesearchapp.ui.gallery.UnsplashPhotoLoadStateAdapter.LoadStateViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
    androidx.paging.LoadState loadState) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.codinginflow.imagesearchapp.ui.gallery.UnsplashPhotoLoadStateAdapter.LoadStateViewHolder holder, @org.jetbrains.annotations.NotNull()
    androidx.paging.LoadState loadState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getRetry() {
        return null;
    }
    
    public UnsplashPhotoLoadStateAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoLoadStateAdapter$LoadStateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mBinding", "Lcom/codinginflow/imagesearchapp/databinding/UnsplashPhotoLoadStateFooterBinding;", "(Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoLoadStateAdapter;Lcom/codinginflow/imagesearchapp/databinding/UnsplashPhotoLoadStateFooterBinding;)V", "bindData", "", "loadState", "Landroidx/paging/LoadState;", "app_debug"})
    public final class LoadStateViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.codinginflow.imagesearchapp.databinding.UnsplashPhotoLoadStateFooterBinding mBinding = null;
        
        public final void bindData(@org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
        }
        
        public LoadStateViewHolder(@org.jetbrains.annotations.NotNull()
        com.codinginflow.imagesearchapp.databinding.UnsplashPhotoLoadStateFooterBinding mBinding) {
            super(null);
        }
    }
}