package com.guglielmoboi.cstimergraph.fragments.viewsessions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/ViewSessionsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "application", "Landroid/app/Application;", "binding", "Lcom/guglielmoboi/cstimergraph/databinding/FragmentViewSessionsBinding;", "importSessionResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "navArgs", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/ViewSessionsFragmentArgs;", "navController", "Landroidx/navigation/NavController;", "sessionAdapter", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/SessionAdapter;", "sessionListener", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/sessionlistener/SessionListener;", "viewModel", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/ViewSessionsViewModel;", "viewModelFactory", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/ViewSessionsViewModelFactory;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ViewSessionsFragment extends androidx.fragment.app.Fragment {
    private android.app.Application application;
    private com.guglielmoboi.cstimergraph.fragments.viewsessions.ViewSessionsFragmentArgs navArgs;
    private com.guglielmoboi.cstimergraph.fragments.viewsessions.ViewSessionsViewModel viewModel;
    private com.guglielmoboi.cstimergraph.fragments.viewsessions.ViewSessionsViewModelFactory viewModelFactory;
    private com.guglielmoboi.cstimergraph.databinding.FragmentViewSessionsBinding binding;
    private androidx.navigation.NavController navController;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManager;
    private com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionListener sessionListener;
    private com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.SessionAdapter sessionAdapter;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> importSessionResultLauncher;
    
    public ViewSessionsFragment() {
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