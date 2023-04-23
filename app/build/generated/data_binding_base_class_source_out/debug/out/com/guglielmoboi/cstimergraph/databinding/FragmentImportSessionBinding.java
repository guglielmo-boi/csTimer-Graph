// Generated by data binding compiler. Do not edit!
package com.guglielmoboi.cstimergraph.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.guglielmoboi.cstimergraph.R;
import com.guglielmoboi.cstimergraph.fragments.importsession.ImportSessionViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentImportSessionBinding extends ViewDataBinding {
  @NonNull
  public final ImageView desktopComputerIcon;

  @NonNull
  public final View divider0;

  @NonNull
  public final View divider1;

  @NonNull
  public final View divider2;

  @NonNull
  public final View divider3;

  @NonNull
  public final View divider8;

  @NonNull
  public final ImageButton importButton;

  @NonNull
  public final TextView importHeader;

  @NonNull
  public final ImageView mobileIcon;

  @NonNull
  public final ConstraintLayout tutorialLayout;

  @NonNull
  public final ImageView tutorialMobile0;

  @NonNull
  public final ImageView tutorialMobile1;

  @NonNull
  public final ImageView tutorialMobile2;

  @NonNull
  public final ConstraintLayout tutorialMobileConstraintLayout;

  @NonNull
  public final TextView tutorialMobileHeader;

  @NonNull
  public final HorizontalScrollView tutorialMobileScrollView;

  @NonNull
  public final ImageView tutorialPc0;

  @NonNull
  public final ImageView tutorialPc1;

  @NonNull
  public final ImageView tutorialPc2;

  @NonNull
  public final ConstraintLayout tutorialPcConstraintLayout;

  @NonNull
  public final TextView tutorialPcHeader;

  @NonNull
  public final HorizontalScrollView tutorialPcScrollView;

  @NonNull
  public final ScrollView tutorialScrollView;

  @NonNull
  public final TextView tutorialSubHeader0;

  @NonNull
  public final TextView tutorialSubHeader1;

  @Bindable
  protected ImportSessionViewModel mViewModel;

  protected FragmentImportSessionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView desktopComputerIcon, View divider0, View divider1, View divider2, View divider3,
      View divider8, ImageButton importButton, TextView importHeader, ImageView mobileIcon,
      ConstraintLayout tutorialLayout, ImageView tutorialMobile0, ImageView tutorialMobile1,
      ImageView tutorialMobile2, ConstraintLayout tutorialMobileConstraintLayout,
      TextView tutorialMobileHeader, HorizontalScrollView tutorialMobileScrollView,
      ImageView tutorialPc0, ImageView tutorialPc1, ImageView tutorialPc2,
      ConstraintLayout tutorialPcConstraintLayout, TextView tutorialPcHeader,
      HorizontalScrollView tutorialPcScrollView, ScrollView tutorialScrollView,
      TextView tutorialSubHeader0, TextView tutorialSubHeader1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.desktopComputerIcon = desktopComputerIcon;
    this.divider0 = divider0;
    this.divider1 = divider1;
    this.divider2 = divider2;
    this.divider3 = divider3;
    this.divider8 = divider8;
    this.importButton = importButton;
    this.importHeader = importHeader;
    this.mobileIcon = mobileIcon;
    this.tutorialLayout = tutorialLayout;
    this.tutorialMobile0 = tutorialMobile0;
    this.tutorialMobile1 = tutorialMobile1;
    this.tutorialMobile2 = tutorialMobile2;
    this.tutorialMobileConstraintLayout = tutorialMobileConstraintLayout;
    this.tutorialMobileHeader = tutorialMobileHeader;
    this.tutorialMobileScrollView = tutorialMobileScrollView;
    this.tutorialPc0 = tutorialPc0;
    this.tutorialPc1 = tutorialPc1;
    this.tutorialPc2 = tutorialPc2;
    this.tutorialPcConstraintLayout = tutorialPcConstraintLayout;
    this.tutorialPcHeader = tutorialPcHeader;
    this.tutorialPcScrollView = tutorialPcScrollView;
    this.tutorialScrollView = tutorialScrollView;
    this.tutorialSubHeader0 = tutorialSubHeader0;
    this.tutorialSubHeader1 = tutorialSubHeader1;
  }

  public abstract void setViewModel(@Nullable ImportSessionViewModel viewModel);

  @Nullable
  public ImportSessionViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentImportSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_import_session, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentImportSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentImportSessionBinding>inflateInternal(inflater, R.layout.fragment_import_session, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentImportSessionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_import_session, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentImportSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentImportSessionBinding>inflateInternal(inflater, R.layout.fragment_import_session, null, false, component);
  }

  public static FragmentImportSessionBinding bind(@NonNull View view) {
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
  public static FragmentImportSessionBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentImportSessionBinding)bind(component, view, R.layout.fragment_import_session);
  }
}