// Generated by view binder compiler. Do not edit!
package com.example.myprojectloginapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myprojectloginapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDoctorLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton BookingButton;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final EditText mEdtDocEmail;

  @NonNull
  public final EditText mEdtDocPassword;

  @NonNull
  public final TextView mTvSignUp;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final View view2;

  private ActivityDoctorLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton BookingButton, @NonNull ImageView imageView2,
      @NonNull EditText mEdtDocEmail, @NonNull EditText mEdtDocPassword,
      @NonNull TextView mTvSignUp, @NonNull TextView textView10, @NonNull TextView textView4,
      @NonNull View view2) {
    this.rootView = rootView;
    this.BookingButton = BookingButton;
    this.imageView2 = imageView2;
    this.mEdtDocEmail = mEdtDocEmail;
    this.mEdtDocPassword = mEdtDocPassword;
    this.mTvSignUp = mTvSignUp;
    this.textView10 = textView10;
    this.textView4 = textView4;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDoctorLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDoctorLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_doctor_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDoctorLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BookingButton;
      AppCompatButton BookingButton = ViewBindings.findChildViewById(rootView, id);
      if (BookingButton == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.mEdtDocEmail;
      EditText mEdtDocEmail = ViewBindings.findChildViewById(rootView, id);
      if (mEdtDocEmail == null) {
        break missingId;
      }

      id = R.id.mEdtDocPassword;
      EditText mEdtDocPassword = ViewBindings.findChildViewById(rootView, id);
      if (mEdtDocPassword == null) {
        break missingId;
      }

      id = R.id.mTvSignUp;
      TextView mTvSignUp = ViewBindings.findChildViewById(rootView, id);
      if (mTvSignUp == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      return new ActivityDoctorLoginBinding((ConstraintLayout) rootView, BookingButton, imageView2,
          mEdtDocEmail, mEdtDocPassword, mTvSignUp, textView10, textView4, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
