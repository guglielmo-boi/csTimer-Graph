package com.guglielmoboi.cstimergraph.database.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH\u0002J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ!\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010%\u001a\u0004\u0018\u00010 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010&\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ+\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u0019\u0010-\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010.\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/guglielmoboi/cstimergraph/database/repository/Repository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "sessionsDatabase", "Lcom/guglielmoboi/cstimergraph/database/session/SessionsDao;", "solvesDatabase", "Lcom/guglielmoboi/cstimergraph/database/solve/SolvesDao;", "buildSession", "Lcom/guglielmoboi/cstimergraph/solvedata/session/Session;", "sessionEntity", "Lcom/guglielmoboi/cstimergraph/database/session/SessionEntity;", "(Lcom/guglielmoboi/cstimergraph/database/session/SessionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildSessions", "", "sessionsEntities", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildSolves", "Lcom/guglielmoboi/cstimergraph/solvedata/solve/Solve;", "solvesEntities", "Lcom/guglielmoboi/cstimergraph/database/solve/SolveEntity;", "clearSession", "", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSolves", "clearSolvesWithinIndexes", "firstSolveIndex", "", "lastSolveIndex", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSessions", "getAllSolves", "getMaxSolveIndex", "getSessionWithId", "getSolvesWithinIndexes", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSession", "insertSolve", "solveEntity", "(Lcom/guglielmoboi/cstimergraph/database/solve/SolveEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSession", "updateSolve", "app_debug"})
public final class Repository {
    private final com.guglielmoboi.cstimergraph.database.solve.SolvesDao solvesDatabase = null;
    private final com.guglielmoboi.cstimergraph.database.session.SessionsDao sessionsDatabase = null;
    
    public Repository(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    private final java.util.List<com.guglielmoboi.cstimergraph.solvedata.solve.Solve> buildSolves(java.util.List<com.guglielmoboi.cstimergraph.database.solve.SolveEntity> solvesEntities) {
        return null;
    }
    
    private final java.lang.Object buildSession(com.guglielmoboi.cstimergraph.database.session.SessionEntity sessionEntity, kotlin.coroutines.Continuation<? super com.guglielmoboi.cstimergraph.solvedata.session.Session> continuation) {
        return null;
    }
    
    private final java.lang.Object buildSessions(java.util.List<com.guglielmoboi.cstimergraph.database.session.SessionEntity> sessionsEntities, kotlin.coroutines.Continuation<? super java.util.List<com.guglielmoboi.cstimergraph.solvedata.session.Session>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertSolve(@org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.database.solve.SolveEntity solveEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateSolve(@org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.database.solve.SolveEntity solveEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearSolves(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearSolvesWithinIndexes(int firstSolveIndex, int lastSolveIndex, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getSolvesWithinIndexes(java.lang.Integer firstSolveIndex, java.lang.Integer lastSolveIndex, kotlin.coroutines.Continuation<? super java.util.List<com.guglielmoboi.cstimergraph.database.solve.SolveEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAllSolves(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.guglielmoboi.cstimergraph.solvedata.solve.Solve>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMaxSolveIndex(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertSession(@org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.database.session.SessionEntity sessionEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateSession(@org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.database.session.SessionEntity sessionEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearSessions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearSession(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSessionWithId(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.guglielmoboi.cstimergraph.solvedata.session.Session> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAllSessions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.guglielmoboi.cstimergraph.solvedata.session.Session>> continuation) {
        return null;
    }
}