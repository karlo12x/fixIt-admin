// Generated by view binder compiler. Do not edit!
package com.thesis.fixitadmin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import com.thesis.fixitadmin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySingleBarChartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView EmergencyTv;

  @NonNull
  public final BarChart barChart;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView test;

  private ActivitySingleBarChartBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView EmergencyTv, @NonNull BarChart barChart, @NonNull CardView cardView,
      @NonNull TextView test) {
    this.rootView = rootView;
    this.EmergencyTv = EmergencyTv;
    this.barChart = barChart;
    this.cardView = cardView;
    this.test = test;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySingleBarChartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySingleBarChartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_single_bar_chart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySingleBarChartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.EmergencyTv;
      TextView EmergencyTv = ViewBindings.findChildViewById(rootView, id);
      if (EmergencyTv == null) {
        break missingId;
      }

      id = R.id.barChart;
      BarChart barChart = ViewBindings.findChildViewById(rootView, id);
      if (barChart == null) {
        break missingId;
      }

      id = R.id.card_view;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.test;
      TextView test = ViewBindings.findChildViewById(rootView, id);
      if (test == null) {
        break missingId;
      }

      return new ActivitySingleBarChartBinding((ConstraintLayout) rootView, EmergencyTv, barChart,
          cardView, test);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
