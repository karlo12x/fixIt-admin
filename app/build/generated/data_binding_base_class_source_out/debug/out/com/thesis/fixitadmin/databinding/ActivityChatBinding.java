// Generated by view binder compiler. Do not edit!
package com.thesis.fixitadmin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
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

public final class ActivityChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView chat;

  @NonNull
  public final CircleImageView circleImageView3;

  @NonNull
  public final ConstraintLayout constraintLayout4;

  @NonNull
  public final ConstraintLayout constraintLayout49;

  @NonNull
  public final ConstraintLayout constraintLayout5;

  @NonNull
  public final ConstraintLayout constraintLayout99;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView11;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final ImageView more;

  @NonNull
  public final TextView name;

  @NonNull
  public final RelativeLayout relativeLayout15;

  @NonNull
  public final EditText textBox;

  @NonNull
  public final TextView username;

  private ActivityChatBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView chat,
      @NonNull CircleImageView circleImageView3, @NonNull ConstraintLayout constraintLayout4,
      @NonNull ConstraintLayout constraintLayout49, @NonNull ConstraintLayout constraintLayout5,
      @NonNull ConstraintLayout constraintLayout99, @NonNull ImageView imageView10,
      @NonNull ImageView imageView11, @NonNull ImageView imageView9, @NonNull ImageView more,
      @NonNull TextView name, @NonNull RelativeLayout relativeLayout15, @NonNull EditText textBox,
      @NonNull TextView username) {
    this.rootView = rootView;
    this.chat = chat;
    this.circleImageView3 = circleImageView3;
    this.constraintLayout4 = constraintLayout4;
    this.constraintLayout49 = constraintLayout49;
    this.constraintLayout5 = constraintLayout5;
    this.constraintLayout99 = constraintLayout99;
    this.imageView10 = imageView10;
    this.imageView11 = imageView11;
    this.imageView9 = imageView9;
    this.more = more;
    this.name = name;
    this.relativeLayout15 = relativeLayout15;
    this.textBox = textBox;
    this.username = username;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chat;
      RecyclerView chat = ViewBindings.findChildViewById(rootView, id);
      if (chat == null) {
        break missingId;
      }

      id = R.id.circleImageView3;
      CircleImageView circleImageView3 = ViewBindings.findChildViewById(rootView, id);
      if (circleImageView3 == null) {
        break missingId;
      }

      id = R.id.constraintLayout4;
      ConstraintLayout constraintLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout4 == null) {
        break missingId;
      }

      id = R.id.constraintLayout49;
      ConstraintLayout constraintLayout49 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout49 == null) {
        break missingId;
      }

      id = R.id.constraintLayout5;
      ConstraintLayout constraintLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout5 == null) {
        break missingId;
      }

      id = R.id.constraintLayout99;
      ConstraintLayout constraintLayout99 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout99 == null) {
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

      id = R.id.imageView9;
      ImageView imageView9 = ViewBindings.findChildViewById(rootView, id);
      if (imageView9 == null) {
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

      id = R.id.relativeLayout15;
      RelativeLayout relativeLayout15 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout15 == null) {
        break missingId;
      }

      id = R.id.textBox;
      EditText textBox = ViewBindings.findChildViewById(rootView, id);
      if (textBox == null) {
        break missingId;
      }

      id = R.id.username;
      TextView username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new ActivityChatBinding((ConstraintLayout) rootView, chat, circleImageView3,
          constraintLayout4, constraintLayout49, constraintLayout5, constraintLayout99, imageView10,
          imageView11, imageView9, more, name, relativeLayout15, textBox, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}