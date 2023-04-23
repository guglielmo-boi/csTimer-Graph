package com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u0016\u0010\u0007\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u0016\u0010\b\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u0016\u0010\t\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u0016\u0010\n\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u0016\u0010\f\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u0016\u0010\r\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u0016\u0010\u000e\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u0016\u0010\u000f\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u0016\u0010\u0010\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"NULL_VALUE_STRING", "", "setSessionBestAverageFive", "", "Landroid/widget/TextView;", "item", "Lcom/guglielmoboi/cstimergraph/solvedata/session/Session;", "setSessionBestAverageTwelve", "setSessionBestSolve", "setSessionEndDateTime", "setSessionMean", "setSessionName", "setSessionStartDateTime", "setSessionWorstAverageFive", "setSessionWorstAverageTwelve", "setSessionWorstSolve", "setSolvesCount", "app_debug"})
public final class BindingAdaptersKt {
    private static final java.lang.String NULL_VALUE_STRING = "";
    
    @androidx.databinding.BindingAdapter(value = {"sessionName"})
    public static final void setSessionName(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setSessionName, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.session.Session item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sessionStartDateTime"})
    public static final void setSessionStartDateTime(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setSessionStartDateTime, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.session.Session item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sessionEndDateTime"})
    public static final void setSessionEndDateTime(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setSessionEndDateTime, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.session.Session item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sessionSolvesCount"})
    public static final void setSolvesCount(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setSolvesCount, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.session.Session item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sessionMean"})
    public static final void setSessionMean(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setSessionMean, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.session.Session item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sessionBestSolveTime"})
    public static final void setSessionBestSolve(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setSessionBestSolve, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.session.Session item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sessionWorstSolveTime"})
    public static final void setSessionWorstSolve(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setSessionWorstSolve, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.session.Session item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sessionBestAverageFive"})
    public static final void setSessionBestAverageFive(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setSessionBestAverageFive, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.session.Session item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sessionWorstAverageFive"})
    public static final void setSessionWorstAverageFive(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setSessionWorstAverageFive, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.session.Session item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sessionBestAverageTwelve"})
    public static final void setSessionBestAverageTwelve(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setSessionBestAverageTwelve, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.session.Session item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sessionWorstAverageTwelve"})
    public static final void setSessionWorstAverageTwelve(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setSessionWorstAverageTwelve, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.session.Session item) {
    }
}