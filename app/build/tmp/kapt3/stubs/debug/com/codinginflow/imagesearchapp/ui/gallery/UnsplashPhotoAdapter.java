package com.codinginflow.imagesearchapp.ui.gallery;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.codinginflow.imagesearchapp.R;
import com.codinginflow.imagesearchapp.data.UnsplashPhoto;
import com.codinginflow.imagesearchapp.databinding.ItemUnsplashPhotoBinding;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/codinginflow/imagesearchapp/data/UnsplashPhoto;", "Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoAdapter$PhotoViewHolder;", "onItemClickListener", "Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoAdapter$OnItemClickListener;", "(Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoAdapter$OnItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "OnItemClickListener", "PhotoViewHolder", "app_debug"})
public final class UnsplashPhotoAdapter extends androidx.paging.PagingDataAdapter<com.codinginflow.imagesearchapp.data.UnsplashPhoto, com.codinginflow.imagesearchapp.ui.gallery.UnsplashPhotoAdapter.PhotoViewHolder> {
    private final com.codinginflow.imagesearchapp.ui.gallery.UnsplashPhotoAdapter.OnItemClickListener onItemClickListener = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.codinginflow.imagesearchapp.data.UnsplashPhoto> PHOTO_COMPARATOR = null;
    public static final com.codinginflow.imagesearchapp.ui.gallery.UnsplashPhotoAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codinginflow.imagesearchapp.ui.gallery.UnsplashPhotoAdapter.PhotoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.codinginflow.imagesearchapp.ui.gallery.UnsplashPhotoAdapter.PhotoViewHolder holder, int position) {
    }
    
    public UnsplashPhotoAdapter(@org.jetbrains.annotations.NotNull()
    com.codinginflow.imagesearchapp.ui.gallery.UnsplashPhotoAdapter.OnItemClickListener onItemClickListener) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoAdapter$PhotoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/codinginflow/imagesearchapp/databinding/ItemUnsplashPhotoBinding;", "(Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoAdapter;Lcom/codinginflow/imagesearchapp/databinding/ItemUnsplashPhotoBinding;)V", "bind", "", "photo", "Lcom/codinginflow/imagesearchapp/data/UnsplashPhoto;", "app_debug"})
    public final class PhotoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.codinginflow.imagesearchapp.databinding.ItemUnsplashPhotoBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.codinginflow.imagesearchapp.data.UnsplashPhoto photo) {
        }
        
        public PhotoViewHolder(@org.jetbrains.annotations.NotNull()
        com.codinginflow.imagesearchapp.databinding.ItemUnsplashPhotoBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoAdapter$OnItemClickListener;", "", "onItemClick", "", "photo", "Lcom/codinginflow/imagesearchapp/data/UnsplashPhoto;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.codinginflow.imagesearchapp.data.UnsplashPhoto photo);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/codinginflow/imagesearchapp/ui/gallery/UnsplashPhotoAdapter$Companion;", "", "()V", "PHOTO_COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/codinginflow/imagesearchapp/data/UnsplashPhoto;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}