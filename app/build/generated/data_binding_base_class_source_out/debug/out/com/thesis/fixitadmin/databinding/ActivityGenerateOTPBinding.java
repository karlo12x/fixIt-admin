// Generated by view binder compiler. Do not edit!
package com.thesis.fixitadmin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.thesis.fixitadmin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGenerateOTPBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button5;

  @NonNull
  public final TextView description;

  @NonNull
  public final EditText email;

  @NonNull
  public final ImageView imgUsername;

  @NonNull
  public final ProgressBar progressBar6;

  @NonNull
  public final RelativeLayout relativeLayout11;

  @NonNull
  public final TextView title;

  private ActivityGenerateOTPBinding(@NonNull ConstraintLayout rootView, @NonNull Button button5,
      @NonNull TextView description, @NonNull EditText email, @NonNull ImageView imgUsername,
      @NonNull ProgressBar progressBar6, @NonNull RelativeLayout relativeLayout11,
      @NonNull TextView title) {
    this.rootView = rootView;
    this.button5 = button5;
    this.description = description;
    this.email = email;
    this.imgUsername = imgUsername;
    this.progressBar6 = progressBar6;
    this.relativeLayout11 = relativeLayout11;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGenerateOTPBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGenerateOTPBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_generate_o_t_p, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGenerateOTPBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.img_username;
      ImageView imgUsername = ViewBindings.findChildViewById(rootView, id);
      if (imgUsername == null) {
        break missingId;
      }

      id = R.id.progressBar6;
      ProgressBar progressBar6 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar6 == null) {
        break missingId;
      }

      id = R.id.relativeLayout11;
      RelativeLayout relativeLayout11 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout11 == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ActivityGenerateOTPBinding((ConstraintLayout) rootView, button5, description,
          email, imgUsername, progressBar6, relativeLayout11, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
