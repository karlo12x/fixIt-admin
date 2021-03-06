// Generated by view binder compiler. Do not edit!
package com.thesis.fixitadmin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.thesis.fixitadmin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ShareVidBottomSheetBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout appvid;

  @NonNull
  public final ConstraintLayout chatvid;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  private ShareVidBottomSheetBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout appvid, @NonNull ConstraintLayout chatvid,
      @NonNull ImageView imageView5, @NonNull ImageView imageView6) {
    this.rootView = rootView;
    this.appvid = appvid;
    this.chatvid = chatvid;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ShareVidBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ShareVidBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.share_vid_bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ShareVidBottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appvid;
      ConstraintLayout appvid = ViewBindings.findChildViewById(rootView, id);
      if (appvid == null) {
        break missingId;
      }

      id = R.id.chatvid;
      ConstraintLayout chatvid = ViewBindings.findChildViewById(rootView, id);
      if (chatvid == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      return new ShareVidBottomSheetBinding((ConstraintLayout) rootView, appvid, chatvid,
          imageView5, imageView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
