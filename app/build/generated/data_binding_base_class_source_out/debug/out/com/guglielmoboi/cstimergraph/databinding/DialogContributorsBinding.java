// Generated by data binding compiler. Do not edit!
package com.guglielmoboi.cstimergraph.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.guglielmoboi.cstimergraph.R;
import com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogContributorsBinding extends ViewDataBinding {
  @NonNull
  public final TextView contributorsHeader;

  @NonNull
  public final ImageView designerIcon;

  @NonNull
  public final TextView designerName;

  @NonNull
  public final ImageView developerIcon;

  @NonNull
  public final TextView developerName;

  @NonNull
  public final AppCompatImageButton emailButton;

  @NonNull
  public final AppCompatImageButton emailButton2;

  @NonNull
  public final AppCompatImageButton githubButton;

  @NonNull
  public final AppCompatImageButton instagramButton;

  @NonNull
  public final AppCompatImageButton instagramButton2;

  @NonNull
  public final AppCompatImageButton stackoverflowButton;

  @Bindable
  protected ContributorsViewModel mViewModel;

  protected DialogContributorsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView contributorsHeader, ImageView designerIcon, TextView designerName,
      ImageView developerIcon, TextView developerName, AppCompatImageButton emailButton,
      AppCompatImageButton emailButton2, AppCompatImageButton githubButton,
      AppCompatImageButton instagramButton, AppCompatImageButton instagramButton2,
      AppCompatImageButton stackoverflowButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contributorsHeader = contributorsHeader;
    this.designerIcon = designerIcon;
    this.designerName = designerName;
    this.developerIcon = developerIcon;
    this.developerName = developerName;
    this.emailButton = emailButton;
    this.emailButton2 = emailButton2;
    this.githubButton = githubButton;
    this.instagramButton = instagramButton;
    this.instagramButton2 = instagramButton2;
    this.stackoverflowButton = stackoverflowButton;
  }

  public abstract void setViewModel(@Nullable ContributorsViewModel viewModel);

  @Nullable
  public ContributorsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DialogContributorsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_contributors, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogContributorsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogContributorsBinding>inflateInternal(inflater, R.layout.dialog_contributors, root, attachToRoot, component);
  }

  @NonNull
  public static DialogContributorsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_contributors, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogContributorsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogContributorsBinding>inflateInternal(inflater, R.layout.dialog_contributors, null, false, component);
  }

  public static DialogContributorsBinding bind(@NonNull View view) {
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
  public static DialogContributorsBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogContributorsBinding)bind(component, view, R.layout.dialog_contributors);
  }
}
