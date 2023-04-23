package com.guglielmoboi.cstimergraph.fragments.detailsession;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0015H\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/detailsession/DetailSessionViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "repository", "Lcom/guglielmoboi/cstimergraph/database/repository/Repository;", "sessionId", "", "application", "Landroid/app/Application;", "(Lcom/guglielmoboi/cstimergraph/database/repository/Repository;JLandroid/app/Application;)V", "_session", "Landroidx/lifecycle/MutableLiveData;", "Lcom/guglielmoboi/cstimergraph/solvedata/session/Session;", "job", "Lkotlinx/coroutines/CompletableJob;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "session", "Landroidx/lifecycle/LiveData;", "getSession", "()Landroidx/lifecycle/LiveData;", "createSession", "", "drawChart", "chartView", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView;", "onCleared", "app_debug"})
public final class DetailSessionViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.guglielmoboi.cstimergraph.database.repository.Repository repository = null;
    private final long sessionId = 0L;
    private kotlinx.coroutines.CompletableJob job;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private androidx.lifecycle.MutableLiveData<com.guglielmoboi.cstimergraph.solvedata.session.Session> _session;
    
    public DetailSessionViewModel(@org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.database.repository.Repository repository, long sessionId, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.guglielmoboi.cstimergraph.solvedata.session.Session> getSession() {
        return null;
    }
    
    public final void createSession() {
    }
    
    public final void drawChart(@org.jetbrains.annotations.NotNull
    com.github.aachartmodel.aainfographics.aachartcreator.AAChartView chartView) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}