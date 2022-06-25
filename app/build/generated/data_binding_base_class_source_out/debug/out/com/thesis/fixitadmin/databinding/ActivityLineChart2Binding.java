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

public final class ActivityLineChart2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView EmergencyTv;

  @NonNull
  public final TextView EmergencyTv1;

  @NonNull
  public final ImageView backtoA;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CardView cardView1;

  @NonNull
  public final LineChart lineChart;

  @NonNull
  public final LineChart lineChart1;

  @NonNull
  public final Button print;

  private ActivityLineChart2Binding(@NonNull ConstraintLayout rootView,
      @NonNull TextView EmergencyTv, @NonNull TextView EmergencyTv1, @NonNull ImageView backtoA,
      @NonNull CardView cardView, @NonNull CardView cardView1, @NonNull LineChart lineChart,
      @NonNull LineChart lineChart1, @NonNull Button print) {
    this.rootView = rootView;
    this.EmergencyTv = EmergencyTv;
    this.EmergencyTv1 = EmergencyTv1;
    this.backtoA = backtoA;
    this.cardView = cardView;
    this.cardView1 = cardView1;
    this.lineChart = lineChart;
    this.lineChart1 = lineChart1;
    this.print = print;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLineChart2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLineChart2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_line_chart2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLineChart2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.EmergencyTv;
      TextView EmergencyTv = ViewBindings.findChildViewById(rootView, id);
      if (EmergencyTv == null) {
        break missingId;
      }

      id = R.id.EmergencyTv1;
      TextView EmergencyTv1 = ViewBindings.findChildViewById(rootView, id);
      if (EmergencyTv1 == null) {
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

      id = R.id.card_view1;
      CardView cardView1 = ViewBindings.findChildViewById(rootView, id);
      if (cardView1 == null) {
        break missingId;
      }

      id = R.id.lineChart;
      LineChart lineChart = ViewBindings.findChildViewById(rootView, id);
      if (lineChart == null) {
        break missingId;
      }

      id = R.id.lineChart1;
      LineChart lineChart1 = ViewBindings.findChildViewById(rootView, id);
      if (lineChart1 == null) {
        break missingId;
      }

      id = R.id.print;
      Button print = ViewBindings.findChildViewById(rootView, id);
      if (print == null) {
        break missingId;
      }

      return new ActivityLineChart2Binding((ConstraintLayout) rootView, EmergencyTv, EmergencyTv1,
          backtoA, cardView, cardView1, lineChart, lineChart1, print);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
