package com.guglielmoboi.cstimergraph.database.solve;

import java.lang.System;

@androidx.room.Entity(tableName = "solves_table")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001J\t\u0010(\u001a\u00020\bH\u00d6\u0001R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000f\u00a8\u0006)"}, d2 = {"Lcom/guglielmoboi/cstimergraph/database/solve/SolveEntity;", "", "solveId", "", "solveIndex", "", "number", "timeStr", "", "comment", "scramble", "dateTime", "time", "(JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComment", "()Ljava/lang/String;", "getDateTime", "getNumber", "()I", "getScramble", "getSolveId", "()J", "setSolveId", "(J)V", "getSolveIndex", "getTime", "getTimeStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class SolveEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long solveId;
    @androidx.room.ColumnInfo(name = "solve_index")
    private final int solveIndex = 0;
    @androidx.room.ColumnInfo(name = "number")
    private final int number = 0;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "time_string")
    private final java.lang.String timeStr = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "comment")
    private final java.lang.String comment = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "scramble")
    private final java.lang.String scramble = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "date_time")
    private final java.lang.String dateTime = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "time")
    private final java.lang.String time = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.database.solve.SolveEntity copy(long solveId, int solveIndex, int number, @org.jetbrains.annotations.NotNull
    java.lang.String timeStr, @org.jetbrains.annotations.NotNull
    java.lang.String comment, @org.jetbrains.annotations.NotNull
    java.lang.String scramble, @org.jetbrains.annotations.NotNull
    java.lang.String dateTime, @org.jetbrains.annotations.NotNull
    java.lang.String time) {
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
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public SolveEntity(long solveId, int solveIndex, int number, @org.jetbrains.annotations.NotNull
    java.lang.String timeStr, @org.jetbrains.annotations.NotNull
    java.lang.String comment, @org.jetbrains.annotations.NotNull
    java.lang.String scramble, @org.jetbrains.annotations.NotNull
    java.lang.String dateTime, @org.jetbrains.annotations.NotNull
    java.lang.String time) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getSolveId() {
        return 0L;
    }
    
    public final void setSolveId(long p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getSolveIndex() {
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
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getComment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScramble() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTime() {
        return null;
    }
}