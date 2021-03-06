// Generated by view binder compiler. Do not edit!
package com.thesis.fixitadmin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.thesis.fixitadmin.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUpdatePostBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircleImageView circleImageView3;

  @NonNull
  public final ConstraintLayout constraintLayout3;

  @NonNull
  public final ConstraintLayout constraintLayout6;

  @NonNull
  public final ConstraintLayout header;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView22;

  @NonNull
  public final ImageView imageView29;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView97;

  @NonNull
  public final ImageView meme;

  @NonNull
  public final TextView name;

  @NonNull
  public final ProgressBar pb;

  @NonNull
  public final Button postIt;

  @NonNull
  public final EditText postText;

  @NonNull
  public final Button postVine;

  @NonNull
  public final ConstraintLayout remove;

  @NonNull
  public final ConstraintLayout updateRemove;

  @NonNull
  public final TextView username;

  @NonNull
  public final VideoView vines;

  @NonNull
  public final ConstraintLayout vinesLt;

  private ActivityUpdatePostBinding(@NonNull ConstraintLayout rootView,
      @NonNull CircleImageView circleImageView3, @NonNull ConstraintLayout constraintLayout3,
      @NonNull ConstraintLayout constraintLayout6, @NonNull ConstraintLayout header,
      @NonNull ImageView imageView, @NonNull ImageView imageView22, @NonNull ImageView imageView29,
      @NonNull ImageView imageView5, @NonNull ImageView imageView97, @NonNull ImageView meme,
      @NonNull TextView name, @NonNull ProgressBar pb, @NonNull Button postIt,
      @NonNull EditText postText, @NonNull Button postVine, @NonNull ConstraintLayout remove,
      @NonNull ConstraintLayout updateRemove, @NonNull TextView username, @NonNull VideoView vines,
      @NonNull ConstraintLayout vinesLt) {
    this.rootView = rootView;
    this.circleImageView3 = circleImageView3;
    this.constraintLayout3 = constraintLayout3;
    this.constraintLayout6 = constraintLayout6;
    this.header = header;
    this.imageView = imageView;
    this.imageView22 = imageView22;
    this.imageView29 = imageView29;
    this.imageView5 = imageView5;
    this.imageView97 = imageView97;
    this.meme = meme;
    this.name = name;
    this.pb = pb;
    this.postIt = postIt;
    this.postText = postText;
    this.postVine = postVine;
    this.remove = remove;
    this.updateRemove = updateRemove;
    this.username = username;
    this.vines = vines;
    this.vinesLt = vinesLt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUpdatePostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUpdatePostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_update_post, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUpdatePostBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.circleImageView3;
      CircleImageView circleImageView3 = ViewBindings.findChildViewById(rootView, id);
      if (circleImageView3 == null) {
        break missingId;
      }

      id = R.id.constraintLayout3;
      ConstraintLayout constraintLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout3 == null) {
        break missingId;
      }

      id = R.id.constraintLayout6;
      ConstraintLayout constraintLayout6 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout6 == null) {
        break missingId;
      }

      id = R.id.header;
      ConstraintLayout header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView22;
      ImageView imageView22 = ViewBindings.findChildViewById(rootView, id);
      if (imageView22 == null) {
        break missingId;
      }

      id = R.id.imageView29;
      ImageView imageView29 = ViewBindings.findChildViewById(rootView, id);
      if (imageView29 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView97;
      ImageView imageView97 = ViewBindings.findChildViewById(rootView, id);
      if (imageView97 == null) {
        break missingId;
      }

      id = R.id.meme;
      ImageView meme = ViewBindings.findChildViewById(rootView, id);
      if (meme == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.pb;
      ProgressBar pb = ViewBindings.findChildViewById(rootView, id);
      if (pb == null) {
        break missingId;
      }

      id = R.id.post_it;
      Button postIt = ViewBindings.findChildViewById(rootView, id);
      if (postIt == null) {
        break missingId;
      }

      id = R.id.post_text;
      EditText postText = ViewBindings.findChildViewById(rootView, id);
      if (postText == null) {
        break missingId;
      }

      id = R.id.post_vine;
      Button postVine = ViewBindings.findChildViewById(rootView, id);
      if (postVine == null) {
        break missingId;
      }

      id = R.id.remove;
      ConstraintLayout remove = ViewBindings.findChildViewById(rootView, id);
      if (remove == null) {
        break missingId;
      }

      id = R.id.update_remove;
      ConstraintLayout updateRemove = ViewBindings.findChildViewById(rootView, id);
      if (updateRemove == null) {
        break missingId;
      }

      id = R.id.username;
      TextView username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      id = R.id.vines;
      VideoView vines = ViewBindings.findChildViewById(rootView, id);
      if (vines == null) {
        break missingId;
      }

      id = R.id.vines_lt;
      ConstraintLayout vinesLt = ViewBindings.findChildViewById(rootView, id);
      if (vinesLt == null) {
        break missingId;
      }

      return new ActivityUpdatePostBinding((ConstraintLayout) rootView, circleImageView3,
          constraintLayout3, constraintLayout6, header, imageView, imageView22, imageView29,
          imageView5, imageView97, meme, name, pb, postIt, postText, postVine, remove, updateRemove,
          username, vines, vinesLt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
