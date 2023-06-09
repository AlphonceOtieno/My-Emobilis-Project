// Generated by view binder compiler. Do not edit!
package com.example.myprojectloginapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myprojectloginapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySpecialitySelectionScrollViewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView dermertology;

  @NonNull
  public final CardView generalSurgery;

  @NonNull
  public final CardView nephrology;

  @NonNull
  public final CardView obgyn;

  @NonNull
  public final CardView obsetrics;

  @NonNull
  public final CardView orthopaedics;

  @NonNull
  public final CardView paediatrics;

  @NonNull
  public final ScrollView scrollView3;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final Toolbar toolbar4;

  @NonNull
  public final CardView vascular;

  private ActivitySpecialitySelectionScrollViewBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView dermertology, @NonNull CardView generalSurgery,
      @NonNull CardView nephrology, @NonNull CardView obgyn, @NonNull CardView obsetrics,
      @NonNull CardView orthopaedics, @NonNull CardView paediatrics,
      @NonNull ScrollView scrollView3, @NonNull TextView textView, @NonNull TextView textView2,
      @NonNull Toolbar toolbar4, @NonNull CardView vascular) {
    this.rootView = rootView;
    this.dermertology = dermertology;
    this.generalSurgery = generalSurgery;
    this.nephrology = nephrology;
    this.obgyn = obgyn;
    this.obsetrics = obsetrics;
    this.orthopaedics = orthopaedics;
    this.paediatrics = paediatrics;
    this.scrollView3 = scrollView3;
    this.textView = textView;
    this.textView2 = textView2;
    this.toolbar4 = toolbar4;
    this.vascular = vascular;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySpecialitySelectionScrollViewBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySpecialitySelectionScrollViewBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_speciality_selection_scroll_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySpecialitySelectionScrollViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dermertology;
      CardView dermertology = ViewBindings.findChildViewById(rootView, id);
      if (dermertology == null) {
        break missingId;
      }

      id = R.id.general_surgery;
      CardView generalSurgery = ViewBindings.findChildViewById(rootView, id);
      if (generalSurgery == null) {
        break missingId;
      }

      id = R.id.nephrology;
      CardView nephrology = ViewBindings.findChildViewById(rootView, id);
      if (nephrology == null) {
        break missingId;
      }

      id = R.id.obgyn;
      CardView obgyn = ViewBindings.findChildViewById(rootView, id);
      if (obgyn == null) {
        break missingId;
      }

      id = R.id.obsetrics;
      CardView obsetrics = ViewBindings.findChildViewById(rootView, id);
      if (obsetrics == null) {
        break missingId;
      }

      id = R.id.orthopaedics;
      CardView orthopaedics = ViewBindings.findChildViewById(rootView, id);
      if (orthopaedics == null) {
        break missingId;
      }

      id = R.id.paediatrics;
      CardView paediatrics = ViewBindings.findChildViewById(rootView, id);
      if (paediatrics == null) {
        break missingId;
      }

      id = R.id.scrollView3;
      ScrollView scrollView3 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView3 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.toolbar4;
      Toolbar toolbar4 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar4 == null) {
        break missingId;
      }

      id = R.id.vascular;
      CardView vascular = ViewBindings.findChildViewById(rootView, id);
      if (vascular == null) {
        break missingId;
      }

      return new ActivitySpecialitySelectionScrollViewBinding((ConstraintLayout) rootView,
          dermertology, generalSurgery, nephrology, obgyn, obsetrics, orthopaedics, paediatrics,
          scrollView3, textView, textView2, toolbar4, vascular);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
