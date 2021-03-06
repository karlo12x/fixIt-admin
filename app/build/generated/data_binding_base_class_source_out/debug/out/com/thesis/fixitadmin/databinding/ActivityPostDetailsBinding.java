// Generated by view binder compiler. Do not edit!
package com.thesis.fixitadmin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.thesis.fixitadmin.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPostDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircleImageView circleImageView3;

  @NonNull
  public final ConstraintLayout constraintLayout11;

  @NonNull
  public final ConstraintLayout constraintLayout5;

  @NonNull
  public final ConstraintLayout constraintLayout7;

  @NonNull
  public final ConstraintLayout constraintLayout9;

  @NonNull
  public final ImageView eye;

  @NonNull
  public final ConstraintLayout header;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView11;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ProgressBar load;

  @NonNull
  public final ImageView more;

  @NonNull
  public final TextView name;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final RelativeLayout relativeLayout3;

  @NonNull
  public final EditText textBox;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView username;

  @NonNull
  public final VideoView videoView;

  @NonNull
  public final RelativeLayout viewLy;

  @NonNull
  public final ConstraintLayout viewlt;

  @NonNull
  public final TextView views;

  private ActivityPostDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull CircleImageView circleImageView3, @NonNull ConstraintLayout constraintLayout11,
      @NonNull ConstraintLayout constraintLayout5, @NonNull ConstraintLayout constraintLayout7,
      @NonNull ConstraintLayout constraintLayout9, @NonNull ImageView eye,
      @NonNull ConstraintLayout header, @NonNull ImageView imageView10,
      @NonNull ImageView imageView11, @NonNull ImageView imageView2, @NonNull ImageView imageView3,
      @NonNull ImageView imageView4, @NonNull ProgressBar load, @NonNull ImageView more,
      @NonNull TextView name, @NonNull RecyclerView recyclerView,
      @NonNull RelativeLayout relativeLayout3, @NonNull EditText textBox,
      @NonNull TextView textView11, @NonNull TextView textView2, @NonNull TextView username,
      @NonNull VideoView videoView, @NonNull RelativeLayout viewLy,
      @NonNull ConstraintLayout viewlt, @NonNull TextView views) {
    this.rootView = rootView;
    this.circleImageView3 = circleImageView3;
    this.constraintLayout11 = constraintLayout11;
    this.constraintLayout5 = constraintLayout5;
    this.constraintLayout7 = constraintLayout7;
    this.constraintLayout9 = constraintLayout9;
    this.eye = eye;
    this.header = header;
    this.imageView10 = imageView10;
    this.imageView11 = imageView11;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.load = load;
    this.more = more;
    this.name = name;
    this.recyclerView = recyclerView;
    this.relativeLayout3 = relativeLayout3;
    this.textBox = textBox;
    this.textView11 = textView11;
    this.textView2 = textView2;
    this.username = username;
    this.videoView = videoView;
    this.viewLy = viewLy;
    this.viewlt = viewlt;
    this.views = views;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPostDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPostDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_post_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPostDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.circleImageView3;
      CircleImageView circleImageView3 = ViewBindings.findChildViewById(rootView, id);
      if (circleImageView3 == null) {
        break missingId;
      }

      id = R.id.constraintLayout11;
      ConstraintLayout constraintLayout11 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout11 == null) {
        break missingId;
      }

      id = R.id.constraintLayout5;
      ConstraintLayout constraintLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout5 == null) {
        break missingId;
      }

      id = R.id.constraintLayout7;
      ConstraintLayout constraintLayout7 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout7 == null) {
        break missingId;
      }

      id = R.id.constraintLayout9;
      ConstraintLayout constraintLayout9 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout9 == null) {
        break missingId;
      }

      id = R.id.eye;
      ImageView eye = ViewBindings.findChildViewById(rootView, id);
      if (eye == null) {
        break missingId;
      }

      id = R.id.header;
      ConstraintLayout header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView11;
      ImageView imageView11 = ViewBindings.findChildViewById(rootView, id);
      if (imageView11 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.load;
      ProgressBar load = ViewBindings.findChildViewById(rootView, id);
      if (load == null) {
        break missingId;
      }

      id = R.id.more;
      ImageView more = ViewBindings.findChildViewById(rootView, id);
      if (more == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.relativeLayout3;
      RelativeLayout relativeLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout3 == null) {
        break missingId;
      }

      id = R.id.textBox;
      EditText textBox = ViewBindings.findChildViewById(rootView, id);
      if (textBox == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.username;
      TextView username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      id = R.id.videoView;
      VideoView videoView = ViewBindings.findChildViewById(rootView, id);
      if (videoView == null) {
        break missingId;
      }

      id = R.id.view_ly;
      RelativeLayout viewLy = ViewBindings.findChildViewById(rootView, id);
      if (viewLy == null) {
        break missingId;
      }

      id = R.id.viewlt;
      ConstraintLayout viewlt = ViewBindings.findChildViewById(rootView, id);
      if (viewlt == null) {
        break missingId;
      }

      id = R.id.views;
      TextView views = ViewBindings.findChildViewById(rootView, id);
      if (views == null) {
        break missingId;
      }

      return new ActivityPostDetailsBinding((ConstraintLayout) rootView, circleImageView3,
          constraintLayout11, constraintLayout5, constraintLayout7, constraintLayout9, eye, header,
          imageView10, imageView11, imageView2, imageView3, imageView4, load, more, name,
          recyclerView, relativeLayout3, textBox, textView11, textView2, username, videoView,
          viewLy, viewlt, views);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
