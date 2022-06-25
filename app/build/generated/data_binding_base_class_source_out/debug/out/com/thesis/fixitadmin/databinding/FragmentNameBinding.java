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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.thesis.fixitadmin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNameBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout cardViewf;

  @NonNull
  public final ImageView imgName;

  @NonNull
  public final ImageView menu;

  @NonNull
  public final EditText name;

  @NonNull
  public final RelativeLayout nameLayout;

  @NonNull
  public final ProgressBar progressBar8;

  @NonNull
  public final ImageView settings;

  @NonNull
  public final TextView username;

  private FragmentNameBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout cardViewf, @NonNull ImageView imgName, @NonNull ImageView menu,
      @NonNull EditText name, @NonNull RelativeLayout nameLayout, @NonNull ProgressBar progressBar8,
      @NonNull ImageView settings, @NonNull TextView username) {
    this.rootView = rootView;
    this.cardViewf = cardViewf;
    this.imgName = imgName;
    this.menu = menu;
    this.name = name;
    this.nameLayout = nameLayout;
    this.progressBar8 = progressBar8;
    this.settings = settings;
    this.username = username;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_name, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardViewf;
      ConstraintLayout cardViewf = ViewBindings.findChildViewById(rootView, id);
      if (cardViewf == null) {
        break missingId;
      }

      id = R.id.img_name;
      ImageView imgName = ViewBindings.findChildViewById(rootView, id);
      if (imgName == null) {
        break missingId;
      }

      id = R.id.menu;
      ImageView menu = ViewBindings.findChildViewById(rootView, id);
      if (menu == null) {
        break missingId;
      }

      id = R.id.name;
      EditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.nameLayout;
      RelativeLayout nameLayout = ViewBindings.findChildViewById(rootView, id);
      if (nameLayout == null) {
        break missingId;
      }

      id = R.id.progressBar8;
      ProgressBar progressBar8 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar8 == null) {
        break missingId;
      }

      id = R.id.settings;
      ImageView settings = ViewBindings.findChildViewById(rootView, id);
      if (settings == null) {
        break missingId;
      }

      id = R.id.username;
      TextView username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new FragmentNameBinding((ConstraintLayout) rootView, cardViewf, imgName, menu, name,
          nameLayout, progressBar8, settings, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
