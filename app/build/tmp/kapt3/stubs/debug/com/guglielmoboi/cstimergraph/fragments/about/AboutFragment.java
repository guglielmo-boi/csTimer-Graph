package com.guglielmoboi.cstimergraph.fragments.about;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/about/AboutFragment;", "Landroidx/fragment/app/Fragment;", "()V", "application", "Landroid/app/Application;", "binding", "Lcom/guglielmoboi/cstimergraph/databinding/FragmentAboutBinding;", "contactUsResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "contributorsDialog", "Lcom/guglielmoboi/cstimergraph/dialogs/contributors/ContributorsDialog;", "feedbackResultLauncher", "licenseDialog", "Lcom/guglielmoboi/cstimergraph/dialogs/license/LicenseDialog;", "rateAppResultLauncher", "viewContributorsResultLauncher", "viewLicenseResultLauncher", "viewModel", "Lcom/guglielmoboi/cstimergraph/fragments/about/AboutViewModel;", "viewModelFactory", "Lcom/guglielmoboi/cstimergraph/fragments/about/AboutViewModelFactory;", "viewSourceCodeResultLauncher", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class AboutFragment extends androidx.fragment.app.Fragment {
    private android.app.Application application;
    private com.guglielmoboi.cstimergraph.fragments.about.AboutViewModel viewModel;
    private com.guglielmoboi.cstimergraph.fragments.about.AboutViewModelFactory viewModelFactory;
    private com.guglielmoboi.cstimergraph.databinding.FragmentAboutBinding binding;
    private com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsDialog contributorsDialog;
    private com.guglielmoboi.cstimergraph.dialogs.license.LicenseDialog licenseDialog;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> rateAppResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> contactUsResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> feedbackResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> viewContributorsResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> viewSourceCodeResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> viewLicenseResultLauncher;
    
    public AboutFragment() {
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
}