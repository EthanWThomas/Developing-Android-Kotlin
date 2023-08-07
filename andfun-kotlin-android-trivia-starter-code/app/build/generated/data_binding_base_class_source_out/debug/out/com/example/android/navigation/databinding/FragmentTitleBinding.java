// Generated by data binding compiler. Do not edit!
package com.example.android.navigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.navigation.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTitleBinding extends ViewDataBinding {
  @NonNull
  public final Button playButton;

  @NonNull
  public final ConstraintLayout titleConstraint;

  @NonNull
  public final ImageView titleImage;

  protected FragmentTitleBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button playButton, ConstraintLayout titleConstraint, ImageView titleImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.playButton = playButton;
    this.titleConstraint = titleConstraint;
    this.titleImage = titleImage;
  }

  @NonNull
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_title, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTitleBinding>inflateInternal(inflater, R.layout.fragment_title, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_title, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTitleBinding>inflateInternal(inflater, R.layout.fragment_title, null, false, component);
  }

  public static FragmentTitleBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentTitleBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTitleBinding)bind(component, view, R.layout.fragment_title);
  }
}
