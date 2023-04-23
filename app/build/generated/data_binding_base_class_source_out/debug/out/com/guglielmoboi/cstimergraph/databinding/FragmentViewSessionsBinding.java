// Generated by data binding compiler. Do not edit!
package com.guglielmoboi.cstimergraph.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.guglielmoboi.cstimergraph.R;
import com.guglielmoboi.cstimergraph.fragments.viewsessions.ViewSessionsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentViewSessionsBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton deleteSessionsButton;

  @NonNull
  public final View divider10;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final FloatingActionButton importSessionButton;

  @NonNull
  public final TextView sessionsHeader;

  @NonNull
  public final RecyclerView sessionsList;

  @NonNull
  public final CoordinatorLayout viewSessionsLayout;

  @Bindable
  protected ViewSessionsViewModel mViewModel;

  protected FragmentViewSessionsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton deleteSessionsButton, View divider10, FrameLayout frameLayout,
      FloatingActionButton importSessionButton, TextView sessionsHeader, RecyclerView sessionsList,
      CoordinatorLayout viewSessionsLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.deleteSessionsButton = deleteSessionsButton;
    this.divider10 = divider10;
    this.frameLayout = frameLayout;
    this.importSessionButton = importSessionButton;
    this.sessionsHeader = sessionsHeader;
    this.sessionsList = sessionsList;
    this.viewSessionsLayout = viewSessionsLayout;
  }

  public abstract void setViewModel(@Nullable ViewSessionsViewModel viewModel);

  @Nullable
  public ViewSessionsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentViewSessionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_view_sessions, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentViewSessionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentViewSessionsBinding>inflateInternal(inflater, R.layout.fragment_view_sessions, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentViewSessionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_view_sessions, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentViewSessionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentViewSessionsBinding>inflateInternal(inflater, R.layout.fragment_view_sessions, null, false, component);
  }

  public static FragmentViewSessionsBinding bind(@NonNull View view) {
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
  public static FragmentViewSessionsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentViewSessionsBinding)bind(component, view, R.layout.fragment_view_sessions);
  }
}