// Generated by data binding compiler. Do not edit!
package com.guglielmoboi.cstimergraph.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.guglielmoboi.cstimergraph.R;
import com.guglielmoboi.cstimergraph.fragments.donate.DonateViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDonateBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton button;

  @NonNull
  public final View divider14;

  @NonNull
  public final View divider15;

  @NonNull
  public final TextView donateHeader;

  @NonNull
  public final TextView donateListHeader;

  @NonNull
  public final TextView donateListText;

  @NonNull
  public final TextView donateText;

  @Bindable
  protected DonateViewModel mViewModel;

  protected FragmentDonateBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton button, View divider14, View divider15, TextView donateHeader,
      TextView donateListHeader, TextView donateListText, TextView donateText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.button = button;
    this.divider14 = divider14;
    this.divider15 = divider15;
    this.donateHeader = donateHeader;
    this.donateListHeader = donateListHeader;
    this.donateListText = donateListText;
    this.donateText = donateText;
  }

  public abstract void setViewModel(@Nullable DonateViewModel viewModel);

  @Nullable
  public DonateViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentDonateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_donate, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDonateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDonateBinding>inflateInternal(inflater, R.layout.fragment_donate, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDonateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_donate, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDonateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDonateBinding>inflateInternal(inflater, R.layout.fragment_donate, null, false, component);
  }

  public static FragmentDonateBinding bind(@NonNull View view) {
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
  public static FragmentDonateBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDonateBinding)bind(component, view, R.layout.fragment_donate);
  }
}
