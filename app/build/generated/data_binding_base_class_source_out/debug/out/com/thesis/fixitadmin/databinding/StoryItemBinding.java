// Generated by view binder compiler. Do not edit!
package com.thesis.fixitadmin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.rishabhharit.roundedimageview.RoundedImageView;
import com.thesis.fixitadmin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class StoryItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RoundedImageView storyPhoto;

  @NonNull
  public final RoundedImageView storyPhotoSeen;

  @NonNull
  public final TextView storyUsername;

  private StoryItemBinding(@NonNull LinearLayout rootView, @NonNull RoundedImageView storyPhoto,
      @NonNull RoundedImageView storyPhotoSeen, @NonNull TextView storyUsername) {
    this.rootView = rootView;
    this.storyPhoto = storyPhoto;
    this.storyPhotoSeen = storyPhotoSeen;
    this.storyUsername = storyUsername;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StoryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.story_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StoryItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.story_photo;
      RoundedImageView storyPhoto = ViewBindings.findChildViewById(rootView, id);
      if (storyPhoto == null) {
        break missingId;
      }

      id = R.id.story_photo_seen;
      RoundedImageView storyPhotoSeen = ViewBindings.findChildViewById(rootView, id);
      if (storyPhotoSeen == null) {
        break missingId;
      }

      id = R.id.story_username;
      TextView storyUsername = ViewBindings.findChildViewById(rootView, id);
      if (storyUsername == null) {
        break missingId;
      }

      return new StoryItemBinding((LinearLayout) rootView, storyPhoto, storyPhotoSeen,
          storyUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
