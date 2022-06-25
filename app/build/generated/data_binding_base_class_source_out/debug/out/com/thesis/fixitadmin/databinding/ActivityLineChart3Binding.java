// Generated by view binder compiler. Do not edit!
package com.thesis.fixitadmin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.thesis.fixitadmin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLineChart3Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView EmergencyTv;

  @NonNull
  public final ImageView backtoA;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final LineChart lineChart;

  @NonNull
  public final Button print;

  private ActivityLineChart3Binding(@NonNull ConstraintLayout rootView,
      @NonNull TextView EmergencyTv, @NonNull ImageView backtoA, @NonNull CardView cardView,
      @NonNull LineChart lineChart, @NonNull Button print) {
    this.rootView = rootView;
    this.EmergencyTv = EmergencyTv;
    this.backtoA = backtoA;
    this.cardView = cardView;
    this.lineChart = lineChart;
    this.print = print;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLineChart3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLineChart3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_line_chart3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLineChart3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.EmergencyTv;
      TextView EmergencyTv = ViewBindings.findChildViewById(rootView, id);
      if (EmergencyTv == null) {
        break missingId;
      }

      id = R.id.backtoA;
      ImageView backtoA = ViewBindings.findChildViewById(rootView, id);
      if (backtoA == null) {
        break missingId;
      }

      id = R.id.card_view;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.lineChart;
      LineChart lineChart = ViewBindings.findChildViewById(rootView, id);
      if (lineChart == null) {
        break missingId;
      }

      id = R.id.print;
      Button print = ViewBindings.findChildViewById(rootView, id);
      if (print == null) {
        break missingId;
      }

      return new ActivityLineChart3Binding((ConstraintLayout) rootView, EmergencyTv, backtoA,
          cardView, lineChart, print);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
