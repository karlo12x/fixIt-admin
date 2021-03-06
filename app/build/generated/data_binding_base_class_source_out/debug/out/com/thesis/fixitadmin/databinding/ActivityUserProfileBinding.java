// Generated by view binder compiler. Do not edit!
package com.thesis.fixitadmin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.thesis.fixitadmin.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUserProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView bio;

  @NonNull
  public final ImageView bioImg;

  @NonNull
  public final RelativeLayout bioLayout;

  @NonNull
  public final CircleImageView circularImageView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final RelativeLayout container;

  @NonNull
  public final NestedScrollView cv;

  @NonNull
  public final Button follow;

  @NonNull
  public final RelativeLayout followersly;

  @NonNull
  public final Button following;

  @NonNull
  public final RelativeLayout followingly;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final ConstraintLayout header;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final TextView link;

  @NonNull
  public final TextView location;

  @NonNull
  public final ImageView locationImg;

  @NonNull
  public final RelativeLayout locationLayout;

  @NonNull
  public final Button message;

  @NonNull
  public final TextView noFollowers;

  @NonNull
  public final TextView noFollowing;

  @NonNull
  public final TextView noPost;

  @NonNull
  public final ProgressBar pb;

  @NonNull
  public final RecyclerView postView;

  @NonNull
  public final RelativeLayout relativeLayout12;

  @NonNull
  public final RelativeLayout relativeLayout16;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final ImageView webImg;

  @NonNull
  public final RelativeLayout webLayout;

  private ActivityUserProfileBinding(@NonNull RelativeLayout rootView, @NonNull TextView bio,
      @NonNull ImageView bioImg, @NonNull RelativeLayout bioLayout,
      @NonNull CircleImageView circularImageView, @NonNull ConstraintLayout constraintLayout,
      @NonNull ConstraintLayout constraintLayout2, @NonNull RelativeLayout container,
      @NonNull NestedScrollView cv, @NonNull Button follow, @NonNull RelativeLayout followersly,
      @NonNull Button following, @NonNull RelativeLayout followingly, @NonNull Guideline guideline2,
      @NonNull ConstraintLayout header, @NonNull ImageView imageView3,
      @NonNull ImageView imageView4, @NonNull TextView link, @NonNull TextView location,
      @NonNull ImageView locationImg, @NonNull RelativeLayout locationLayout,
      @NonNull Button message, @NonNull TextView noFollowers, @NonNull TextView noFollowing,
      @NonNull TextView noPost, @NonNull ProgressBar pb, @NonNull RecyclerView postView,
      @NonNull RelativeLayout relativeLayout12, @NonNull RelativeLayout relativeLayout16,
      @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView9,
      @NonNull ImageView webImg, @NonNull RelativeLayout webLayout) {
    this.rootView = rootView;
    this.bio = bio;
    this.bioImg = bioImg;
    this.bioLayout = bioLayout;
    this.circularImageView = circularImageView;
    this.constraintLayout = constraintLayout;
    this.constraintLayout2 = constraintLayout2;
    this.container = container;
    this.cv = cv;
    this.follow = follow;
    this.followersly = followersly;
    this.following = following;
    this.followingly = followingly;
    this.guideline2 = guideline2;
    this.header = header;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.link = link;
    this.location = location;
    this.locationImg = locationImg;
    this.locationLayout = locationLayout;
    this.message = message;
    this.noFollowers = noFollowers;
    this.noFollowing = noFollowing;
    this.noPost = noPost;
    this.pb = pb;
    this.postView = postView;
    this.relativeLayout12 = relativeLayout12;
    this.relativeLayout16 = relativeLayout16;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView9 = textView9;
    this.webImg = webImg;
    this.webLayout = webLayout;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUserProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUserProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_user_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUserProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bio;
      TextView bio = ViewBindings.findChildViewById(rootView, id);
      if (bio == null) {
        break missingId;
      }

      id = R.id.bio_img;
      ImageView bioImg = ViewBindings.findChildViewById(rootView, id);
      if (bioImg == null) {
        break missingId;
      }

      id = R.id.bio_layout;
      RelativeLayout bioLayout = ViewBindings.findChildViewById(rootView, id);
      if (bioLayout == null) {
        break missingId;
      }

      id = R.id.circularImageView;
      CircleImageView circularImageView = ViewBindings.findChildViewById(rootView, id);
      if (circularImageView == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.constraintLayout2;
      ConstraintLayout constraintLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout2 == null) {
        break missingId;
      }

      RelativeLayout container = (RelativeLayout) rootView;

      id = R.id.cv;
      NestedScrollView cv = ViewBindings.findChildViewById(rootView, id);
      if (cv == null) {
        break missingId;
      }

      id = R.id.follow;
      Button follow = ViewBindings.findChildViewById(rootView, id);
      if (follow == null) {
        break missingId;
      }

      id = R.id.followersly;
      RelativeLayout followersly = ViewBindings.findChildViewById(rootView, id);
      if (followersly == null) {
        break missingId;
      }

      id = R.id.following;
      Button following = ViewBindings.findChildViewById(rootView, id);
      if (following == null) {
        break missingId;
      }

      id = R.id.followingly;
      RelativeLayout followingly = ViewBindings.findChildViewById(rootView, id);
      if (followingly == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.header;
      ConstraintLayout header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
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

      id = R.id.link;
      TextView link = ViewBindings.findChildViewById(rootView, id);
      if (link == null) {
        break missingId;
      }

      id = R.id.location;
      TextView location = ViewBindings.findChildViewById(rootView, id);
      if (location == null) {
        break missingId;
      }

      id = R.id.location_img;
      ImageView locationImg = ViewBindings.findChildViewById(rootView, id);
      if (locationImg == null) {
        break missingId;
      }

      id = R.id.location_layout;
      RelativeLayout locationLayout = ViewBindings.findChildViewById(rootView, id);
      if (locationLayout == null) {
        break missingId;
      }

      id = R.id.message;
      Button message = ViewBindings.findChildViewById(rootView, id);
      if (message == null) {
        break missingId;
      }

      id = R.id.noFollowers;
      TextView noFollowers = ViewBindings.findChildViewById(rootView, id);
      if (noFollowers == null) {
        break missingId;
      }

      id = R.id.noFollowing;
      TextView noFollowing = ViewBindings.findChildViewById(rootView, id);
      if (noFollowing == null) {
        break missingId;
      }

      id = R.id.noPost;
      TextView noPost = ViewBindings.findChildViewById(rootView, id);
      if (noPost == null) {
        break missingId;
      }

      id = R.id.pb;
      ProgressBar pb = ViewBindings.findChildViewById(rootView, id);
      if (pb == null) {
        break missingId;
      }

      id = R.id.postView;
      RecyclerView postView = ViewBindings.findChildViewById(rootView, id);
      if (postView == null) {
        break missingId;
      }

      id = R.id.relativeLayout12;
      RelativeLayout relativeLayout12 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout12 == null) {
        break missingId;
      }

      id = R.id.relativeLayout16;
      RelativeLayout relativeLayout16 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout16 == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      id = R.id.web_img;
      ImageView webImg = ViewBindings.findChildViewById(rootView, id);
      if (webImg == null) {
        break missingId;
      }

      id = R.id.web_layout;
      RelativeLayout webLayout = ViewBindings.findChildViewById(rootView, id);
      if (webLayout == null) {
        break missingId;
      }

      return new ActivityUserProfileBinding((RelativeLayout) rootView, bio, bioImg, bioLayout,
          circularImageView, constraintLayout, constraintLayout2, container, cv, follow,
          followersly, following, followingly, guideline2, header, imageView3, imageView4, link,
          location, locationImg, locationLayout, message, noFollowers, noFollowing, noPost, pb,
          postView, relativeLayout12, relativeLayout16, textView10, textView11, textView9, webImg,
          webLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
