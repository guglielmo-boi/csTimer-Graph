package com.guglielmoboi.cstimergraph.solvedata.solve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004BO\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\u0011\u0010&\u001a\u00020\b2\u0006\u0010\'\u001a\u00020\u0000H\u0096\u0002J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003J\t\u0010,\u001a\u00020\rH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u0010.\u001a\u00020\u000bH\u00c6\u0003J\t\u0010/\u001a\u00020\u0012H\u00c6\u0003J\t\u00100\u001a\u00020\u0014H\u00c6\u0003Je\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u00c6\u0001J\u0013\u00102\u001a\u0002032\b\u0010\'\u001a\u0004\u0018\u000104H\u00d6\u0003J\t\u00105\u001a\u00020\bH\u00d6\u0001J\u0006\u00106\u001a\u00020\u0003J\b\u00107\u001a\u00020\u000bH\u0016R\u0011\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017\u00a8\u00068"}, d2 = {"Lcom/guglielmoboi/cstimergraph/solvedata/solve/Solve;", "", "solveEntity", "Lcom/guglielmoboi/cstimergraph/database/solve/SolveEntity;", "(Lcom/guglielmoboi/cstimergraph/database/solve/SolveEntity;)V", "id", "", "index", "", "number", "timeStr", "", "time", "Lcom/guglielmoboi/cstimergraph/solvedata/solve/SolveTime;", "solvePenalty", "Lcom/guglielmoboi/cstimergraph/solvedata/solve/SolvePenalty;", "comment", "scramble", "Lcom/guglielmoboi/cstimergraph/solvedata/solve/Scramble;", "dateTime", "Lcom/guglielmoboi/cstimergraph/util/datetime/DateTime;", "(JIILjava/lang/String;Lcom/guglielmoboi/cstimergraph/solvedata/solve/SolveTime;Lcom/guglielmoboi/cstimergraph/solvedata/solve/SolvePenalty;Ljava/lang/String;Lcom/guglielmoboi/cstimergraph/solvedata/solve/Scramble;Lcom/guglielmoboi/cstimergraph/util/datetime/DateTime;)V", "getComment", "()Ljava/lang/String;", "getDateTime", "()Lcom/guglielmoboi/cstimergraph/util/datetime/DateTime;", "getId", "()J", "getIndex", "()I", "getNumber", "getScramble", "()Lcom/guglielmoboi/cstimergraph/solvedata/solve/Scramble;", "getSolvePenalty", "()Lcom/guglielmoboi/cstimergraph/solvedata/solve/SolvePenalty;", "getTime", "()Lcom/guglielmoboi/cstimergraph/solvedata/solve/SolveTime;", "getTimeStr", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "", "hashCode", "toSolveEntity", "toString", "app_debug"})
public final class Solve implements java.lang.Comparable<com.guglielmoboi.cstimergraph.solvedata.solve.Solve> {
    private final long id = 0L;
    private final int index = 0;
    private final int number = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String timeStr = null;
    @org.jetbrains.annotations.NotNull
    private final com.guglielmoboi.cstimergraph.solvedata.solve.SolveTime time = null;
    @org.jetbrains.annotations.Nullable
    private final com.guglielmoboi.cstimergraph.solvedata.solve.SolvePenalty solvePenalty = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String comment = null;
    @org.jetbrains.annotations.NotNull
    private final com.guglielmoboi.cstimergraph.solvedata.solve.Scramble scramble = null;
    @org.jetbrains.annotations.NotNull
    private final com.guglielmoboi.cstimergraph.util.datetime.DateTime dateTime = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.solvedata.solve.Solve copy(long id, int index, int number, @org.jetbrains.annotations.NotNull
    java.lang.String timeStr, @org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.solvedata.solve.SolveTime time, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.solve.SolvePenalty solvePenalty, @org.jetbrains.annotations.NotNull
    java.lang.String comment, @org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.solvedata.solve.Scramble scramble, @org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.util.datetime.DateTime dateTime) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    public Solve(long id, int index, int number, @org.jetbrains.annotations.NotNull
    java.lang.String timeStr, @org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.solvedata.solve.SolveTime time, @org.jetbrains.annotations.Nullable
    com.guglielmoboi.cstimergraph.solvedata.solve.SolvePenalty solvePenalty, @org.jetbrains.annotations.NotNull
    java.lang.String comment, @org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.solvedata.solve.Scramble scramble, @org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.util.datetime.DateTime dateTime) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getIndex() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimeStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.solvedata.solve.SolveTime component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.solvedata.solve.SolveTime getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.guglielmoboi.cstimergraph.solvedata.solve.SolvePenalty component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.guglielmoboi.cstimergraph.solvedata.solve.SolvePenalty getSolvePenalty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getComment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.solvedata.solve.Scramble component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.solvedata.solve.Scramble getScramble() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.util.datetime.DateTime component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.util.datetime.DateTime getDateTime() {
        return null;
    }
    
    public Solve(@org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.database.solve.SolveEntity solveEntity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override
    public int compareTo(@org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.solvedata.solve.Solve other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.database.solve.SolveEntity toSolveEntity() {
        return null;
    }
}