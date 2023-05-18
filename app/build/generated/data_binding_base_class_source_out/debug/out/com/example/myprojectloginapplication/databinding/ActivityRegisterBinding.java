// Generated by view binder compiler. Do not edit!
package com.example.myprojectloginapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myprojectloginapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView DoctorRegisterLink;

  @NonNull
  public final AppCompatButton Log;

  @NonNull
  public final Button SignUpButton;

  @NonNull
  public final TextView Signinlink;

  @NonNull
  public final EditText mEdtEmail;

  @NonNull
  public final EditText mEdtPassword;

  @NonNull
  public final EditText mEdtPasswordConfirmation;

  @NonNull
  public final EditText mEdtUserEmail;

  @NonNull
  public final EditText mEdtUserPhoneNumber;

  private ActivityRegisterBinding(@NonNull LinearLayout rootView,
      @NonNull TextView DoctorRegisterLink, @NonNull AppCompatButton Log,
      @NonNull Button SignUpButton, @NonNull TextView Signinlink, @NonNull EditText mEdtEmail,
      @NonNull EditText mEdtPassword, @NonNull EditText mEdtPasswordConfirmation,
      @NonNull EditText mEdtUserEmail, @NonNull EditText mEdtUserPhoneNumber) {
    this.rootView = rootView;
    this.DoctorRegisterLink = DoctorRegisterLink;
    this.Log = Log;
    this.SignUpButton = SignUpButton;
    this.Signinlink = Signinlink;
    this.mEdtEmail = mEdtEmail;
    this.mEdtPassword = mEdtPassword;
    this.mEdtPasswordConfirmation = mEdtPasswordConfirmation;
    this.mEdtUserEmail = mEdtUserEmail;
    this.mEdtUserPhoneNumber = mEdtUserPhoneNumber;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.DoctorRegisterLink;
      TextView DoctorRegisterLink = ViewBindings.findChildViewById(rootView, id);
      if (DoctorRegisterLink == null) {
        break missingId;
      }

      id = R.id.Log;
      AppCompatButton Log = ViewBindings.findChildViewById(rootView, id);
      if (Log == null) {
        break missingId;
      }

      id = R.id.SignUpButton;
      Button SignUpButton = ViewBindings.findChildViewById(rootView, id);
      if (SignUpButton == null) {
        break missingId;
      }

      id = R.id.Signinlink;
      TextView Signinlink = ViewBindings.findChildViewById(rootView, id);
      if (Signinlink == null) {
        break missingId;
      }

      id = R.id.mEdtEmail;
      EditText mEdtEmail = ViewBindings.findChildViewById(rootView, id);
      if (mEdtEmail == null) {
        break missingId;
      }

      id = R.id.mEdtPassword;
      EditText mEdtPassword = ViewBindings.findChildViewById(rootView, id);
      if (mEdtPassword == null) {
        break missingId;
      }

      id = R.id.mEdtPasswordConfirmation;
      EditText mEdtPasswordConfirmation = ViewBindings.findChildViewById(rootView, id);
      if (mEdtPasswordConfirmation == null) {
        break missingId;
      }

      id = R.id.mEdtUserEmail;
      EditText mEdtUserEmail = ViewBindings.findChildViewById(rootView, id);
      if (mEdtUserEmail == null) {
        break missingId;
      }

      id = R.id.mEdtUserPhoneNumber;
      EditText mEdtUserPhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (mEdtUserPhoneNumber == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((LinearLayout) rootView, DoctorRegisterLink, Log,
          SignUpButton, Signinlink, mEdtEmail, mEdtPassword, mEdtPasswordConfirmation,
          mEdtUserEmail, mEdtUserPhoneNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
