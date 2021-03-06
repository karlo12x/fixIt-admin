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
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.thesis.fixitadmin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button3;

  @NonNull
  public final TextView description;

  @NonNull
  public final EditText email;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final ImageView imgPassword;

  @NonNull
  public final ImageView imgUsername;

  @NonNull
  public final EditText password;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RelativeLayout relativeLayout4;

  @NonNull
  public final RelativeLayout relativeLayout5;

  @NonNull
  public final TextView title;

  private ActivitySignInBinding(@NonNull ConstraintLayout rootView, @NonNull Button button3,
      @NonNull TextView description, @NonNull EditText email, @NonNull Guideline guideline3,
      @NonNull ImageView imgPassword, @NonNull ImageView imgUsername, @NonNull EditText password,
      @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout4,
      @NonNull RelativeLayout relativeLayout5, @NonNull TextView title) {
    this.rootView = rootView;
    this.button3 = button3;
    this.description = description;
    this.email = email;
    this.guideline3 = guideline3;
    this.imgPassword = imgPassword;
    this.imgUsername = imgUsername;
    this.password = password;
    this.progressBar = progressBar;
    this.relativeLayout4 = relativeLayout4;
    this.relativeLayout5 = relativeLayout5;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
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

      id = R.id.guideline3;
      Guideline guideline3 = ViewBindings.findChildViewById(rootView, id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.img_password;
      ImageView imgPassword = ViewBindings.findChildViewById(rootView, id);
      if (imgPassword == null) {
        break missingId;
      }

      id = R.id.img_username;
      ImageView imgUsername = ViewBindings.findChildViewById(rootView, id);
      if (imgUsername == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.relativeLayout4;
      RelativeLayout relativeLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout4 == null) {
        break missingId;
      }

      id = R.id.relativeLayout5;
      RelativeLayout relativeLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout5 == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ConstraintLayout) rootView, button3, description, email,
          guideline3, imgPassword, imgUsername, password, progressBar, relativeLayout4,
          relativeLayout5, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
