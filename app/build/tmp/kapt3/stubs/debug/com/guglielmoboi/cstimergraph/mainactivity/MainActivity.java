package com.guglielmoboi.cstimergraph.mainactivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/guglielmoboi/cstimergraph/mainactivity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/guglielmoboi/cstimergraph/databinding/ActivityMainBinding;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "navController", "Landroidx/navigation/NavController;", "navView", "Lcom/google/android/material/navigation/NavigationView;", "sharedPreferences", "Landroid/content/SharedPreferences;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "toolbarDrawerToggle", "Landroidx/appcompat/app/ActionBarDrawerToggle;", "viewModel", "Lcom/guglielmoboi/cstimergraph/mainactivity/MainActivityViewModel;", "viewModelFactory", "Lcom/guglielmoboi/cstimergraph/mainactivity/MainActivityViewModelFactory;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onSupportNavigateUp", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.content.SharedPreferences sharedPreferences;
    private com.guglielmoboi.cstimergraph.mainactivity.MainActivityViewModel viewModel;
    private com.guglielmoboi.cstimergraph.mainactivity.MainActivityViewModelFactory viewModelFactory;
    private com.guglielmoboi.cstimergraph.databinding.ActivityMainBinding binding;
    private androidx.drawerlayout.widget.DrawerLayout drawerLayout;
    private androidx.appcompat.widget.Toolbar toolbar;
    private androidx.appcompat.app.ActionBarDrawerToggle toolbarDrawerToggle;
    private com.google.android.material.navigation.NavigationView navView;
    private androidx.navigation.NavController navController;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public boolean onSupportNavigateUp() {
        return false;
    }
}