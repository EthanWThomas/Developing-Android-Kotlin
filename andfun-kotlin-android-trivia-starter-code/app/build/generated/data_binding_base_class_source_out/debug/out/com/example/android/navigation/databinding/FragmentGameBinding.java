// Generated by data binding compiler. Do not edit!
package com.example.android.navigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.navigation.GameFragment;
import com.example.android.navigation.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentGameBinding extends ViewDataBinding {
  @NonNull
  public final RadioButton firstAnswerRadioButton;

  @NonNull
  public final RadioButton fourthAnswerRadioButton;

  @NonNull
  public final ConstraintLayout frameLayout;

  @NonNull
  public final ImageView questionImage;

  @NonNull
  public final RadioGroup questionRadioGroup;

  @NonNull
  public final TextView questionText;

  @NonNull
  public final RadioButton secondAnswerRadioButton;

  @NonNull
  public final Button submitButton;

  @NonNull
  public final RadioButton thirdAnswerRadioButton;

  @Bindable
  protected GameFragment mGame;

  protected FragmentGameBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RadioButton firstAnswerRadioButton, RadioButton fourthAnswerRadioButton,
      ConstraintLayout frameLayout, ImageView questionImage, RadioGroup questionRadioGroup,
      TextView questionText, RadioButton secondAnswerRadioButton, Button submitButton,
      RadioButton thirdAnswerRadioButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.firstAnswerRadioButton = firstAnswerRadioButton;
    this.fourthAnswerRadioButton = fourthAnswerRadioButton;
    this.frameLayout = frameLayout;
    this.questionImage = questionImage;
    this.questionRadioGroup = questionRadioGroup;
    this.questionText = questionText;
    this.secondAnswerRadioButton = secondAnswerRadioButton;
    this.submitButton = submitButton;
    this.thirdAnswerRadioButton = thirdAnswerRadioButton;
  }

  public abstract void setGame(@Nullable GameFragment game);

  @Nullable
  public GameFragment getGame() {
    return mGame;
  }

  @NonNull
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_game, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentGameBinding>inflateInternal(inflater, R.layout.fragment_game, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_game, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentGameBinding>inflateInternal(inflater, R.layout.fragment_game, null, false, component);
  }

  public static FragmentGameBinding bind(@NonNull View view) {
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
  public static FragmentGameBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentGameBinding)bind(component, view, R.layout.fragment_game);
  }
}
