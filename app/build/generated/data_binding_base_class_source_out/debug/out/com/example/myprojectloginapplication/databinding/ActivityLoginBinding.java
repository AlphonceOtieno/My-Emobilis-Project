// Generated by view binder compiler. Do not edit!
package com.example.myprojectloginapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
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

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView BookingButton;

  @NonNull
  public final AppCompatButton Dash;

  @NonNull
  public final TextView GoogleSignIn;

  @NonNull
  public final TextView SignUpLink;

  @NonNull
  public final EditText mEdtEmail;

  @NonNull
  public final EditText mEdtPassword;

  @NonNull
  public final TextView mTvSignUp;

  @NonNull
  public final TextView ortext;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull ImageView BookingButton,
      @NonNull AppCompatButton Dash, @NonNull TextView GoogleSignIn, @NonNull TextView SignUpLink,
      @NonNull EditText mEdtEmail, @NonNull EditText mEdtPassword, @NonNull TextView mTvSignUp,
      @NonNull TextView ortext) {
    this.rootView = rootView;
    this.BookingButton = BookingButton;
    this.Dash = Dash;
    this.GoogleSignIn = GoogleSignIn;
    this.SignUpLink = SignUpLink;
    this.mEdtEmail = mEdtEmail;
    this.mEdtPassword = mEdtPassword;
    this.mTvSignUp = mTvSignUp;
    this.ortext = ortext;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BookingButton;
      ImageView BookingButton = ViewBindings.findChildViewById(rootView, id);
      if (BookingButton == null) {
        break missingId;
      }

      id = R.id.Dash;
      AppCompatButton Dash = ViewBindings.findChildViewById(rootView, id);
      if (Dash == null) {
        break missingId;
      }

      id = R.id.GoogleSignIn;
      TextView GoogleSignIn = ViewBindings.findChildViewById(rootView, id);
      if (GoogleSignIn == null) {
        break missingId;
      }

      id = R.id.SignUpLink;
      TextView SignUpLink = ViewBindings.findChildViewById(rootView, id);
      if (SignUpLink == null) {
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

      id = R.id.mTvSignUp;
      TextView mTvSignUp = ViewBindings.findChildViewById(rootView, id);
      if (mTvSignUp == null) {
        break missingId;
      }

      id = R.id.ortext;
      TextView ortext = ViewBindings.findChildViewById(rootView, id);
      if (ortext == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, BookingButton, Dash, GoogleSignIn,
          SignUpLink, mEdtEmail, mEdtPassword, mTvSignUp, ortext);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}