package com.guglielmoboi.cstimergraph.dialogs.contributors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/guglielmoboi/cstimergraph/dialogs/contributors/ContributorsDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "application", "Landroid/app/Application;", "binding", "Lcom/guglielmoboi/cstimergraph/databinding/DialogContributorsBinding;", "emailDesignerResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "emailDeveloperResultLauncher", "viewDesignerInstagramResultLauncher", "viewDeveloperGithubResultLauncher", "viewDeveloperInstagramResultLauncher", "viewDeveloperStackoverflowResultLauncher", "viewModel", "Lcom/guglielmoboi/cstimergraph/dialogs/contributors/ContributorsViewModel;", "viewModelFactory", "Lcom/guglielmoboi/cstimergraph/dialogs/contributors/ContributorsViewModelFactory;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class ContributorsDialog extends androidx.fragment.app.DialogFragment {
    private android.app.Application application;
    private com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModel viewModel;
    private com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModelFactory viewModelFactory;
    private com.guglielmoboi.cstimergraph.databinding.DialogContributorsBinding binding;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> emailDeveloperResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> viewDeveloperInstagramResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> viewDeveloperGithubResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> viewDeveloperStackoverflowResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> emailDesignerResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> viewDesignerInstagramResultLauncher;
    @org.jetbrains.annotations.NotNull
    public static final com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "ContributorsDialog";
    
    public ContributorsDialog() {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/guglielmoboi/cstimergraph/dialogs/contributors/ContributorsDialog$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}