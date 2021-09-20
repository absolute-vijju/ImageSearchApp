// Generated by view binder compiler. Do not edit!
package com.codinginflow.imagesearchapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.codinginflow.imagesearchapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGalleryBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnRetry;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rvPhotos;

  @NonNull
  public final TextView tvEmpty;

  @NonNull
  public final TextView tvError;

  private FragmentGalleryBinding(@NonNull RelativeLayout rootView, @NonNull Button btnRetry,
      @NonNull ProgressBar progressBar, @NonNull RecyclerView rvPhotos, @NonNull TextView tvEmpty,
      @NonNull TextView tvError) {
    this.rootView = rootView;
    this.btnRetry = btnRetry;
    this.progressBar = progressBar;
    this.rvPhotos = rvPhotos;
    this.tvEmpty = tvEmpty;
    this.tvError = tvError;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGalleryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_gallery, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGalleryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnRetry;
      Button btnRetry = rootView.findViewById(id);
      if (btnRetry == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rvPhotos;
      RecyclerView rvPhotos = rootView.findViewById(id);
      if (rvPhotos == null) {
        break missingId;
      }

      id = R.id.tvEmpty;
      TextView tvEmpty = rootView.findViewById(id);
      if (tvEmpty == null) {
        break missingId;
      }

      id = R.id.tvError;
      TextView tvError = rootView.findViewById(id);
      if (tvError == null) {
        break missingId;
      }

      return new FragmentGalleryBinding((RelativeLayout) rootView, btnRetry, progressBar, rvPhotos,
          tvEmpty, tvError);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}