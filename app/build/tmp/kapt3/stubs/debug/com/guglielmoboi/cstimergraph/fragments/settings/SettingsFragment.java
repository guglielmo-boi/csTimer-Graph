package com.guglielmoboi.cstimergraph.fragments.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J0\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0016\u0010#\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0016J\b\u0010$\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/settings/SettingsFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "()V", "application", "Landroid/app/Application;", "binding", "Lcom/guglielmoboi/cstimergraph/databinding/FragmentSettingsBinding;", "darkThemeSwitch", "Lcom/google/android/material/switchmaterial/SwitchMaterial;", "homeScreenSpinner", "Landroid/widget/Spinner;", "sharedPreferences", "Landroid/content/SharedPreferences;", "viewModel", "Lcom/guglielmoboi/cstimergraph/fragments/settings/SettingsViewModel;", "viewModelFactory", "Lcom/guglielmoboi/cstimergraph/fragments/settings/SettingsViewModelFactory;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "position", "", "id", "", "onNothingSelected", "setupUI", "app_debug"})
public final class SettingsFragment extends androidx.fragment.app.Fragment implements android.widget.AdapterView.OnItemSelectedListener {
    private android.content.SharedPreferences sharedPreferences;
    private android.app.Application application;
    private com.guglielmoboi.cstimergraph.fragments.settings.SettingsViewModel viewModel;
    private com.guglielmoboi.cstimergraph.fragments.settings.SettingsViewModelFactory viewModelFactory;
    private com.guglielmoboi.cstimergraph.databinding.FragmentSettingsBinding binding;
    private com.google.android.material.switchmaterial.SwitchMaterial darkThemeSwitch;
    private android.widget.Spinner homeScreenSpinner;
    
    public SettingsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupUI() {
    }
    
    @java.lang.Override
    public void onItemSelected(@org.jetbrains.annotations.Nullable
    android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable
    android.view.View view, int position, long id) {
    }
    
    @java.lang.Override
    public void onNothingSelected(@org.jetbrains.annotations.Nullable
    android.widget.AdapterView<?> parent) {
    }
}