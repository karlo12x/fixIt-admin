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

public final class ActivityVerifyOTPBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button5;

  @NonNull
  public final TextView description;

  @NonNull
  public final EditText editText;

  @NonNull
  public final ImageView imgUsername;

  @NonNull
  public final ProgressBar progressBar7;

  @NonNull
  public final RelativeLayout relativeLayout11;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView title;

  private ActivityVerifyOTPBinding(@NonNull ConstraintLayout rootView, @NonNull Button button5,
      @NonNull TextView description, @NonNull EditText editText, @NonNull ImageView imgUsername,
      @NonNull ProgressBar progressBar7, @NonNull RelativeLayout relativeLayout11,
      @NonNull TextView textView7, @NonNull TextView title) {
    this.rootView = rootView;
    this.button5 = button5;
    this.description = description;
    this.editText = editText;
    this.imgUsername = imgUsername;
    this.progressBar7 = progressBar7;
    this.relativeLayout11 = relativeLayout11;
    this.textView7 = textView7;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVerifyOTPBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVerifyOTPBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_verify_o_t_p, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVerifyOTPBinding bind(@NonNull View rootView) {
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

      id = R.id.editText;
      EditText editText = ViewBindings.findChildViewById(rootView, id);
      if (editText == null) {
        break missingId;
      }

      id = R.id.img_username;
      ImageView imgUsername = ViewBindings.findChildViewById(rootView, id);
      if (imgUsername == null) {
        break missingId;
      }

      id = R.id.progressBar7;
      ProgressBar progressBar7 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar7 == null) {
        break missingId;
      }

      id = R.id.relativeLayout11;
      RelativeLayout relativeLayout11 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout11 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ActivityVerifyOTPBinding((ConstraintLayout) rootView, button5, description,
          editText, imgUsername, progressBar7, relativeLayout11, textView7, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
