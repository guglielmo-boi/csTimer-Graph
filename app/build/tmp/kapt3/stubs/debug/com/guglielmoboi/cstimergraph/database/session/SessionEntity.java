package com.guglielmoboi.cstimergraph.database.session;

import java.lang.System;

@androidx.room.Entity(tableName = "sessions_table")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\tH\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e\u00a8\u0006&"}, d2 = {"Lcom/guglielmoboi/cstimergraph/database/session/SessionEntity;", "", "sessionId", "", "name", "", "startDateTime", "endDateTime", "firstSolveIndex", "", "lastSolveIndex", "size", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", "getEndDateTime", "()Ljava/lang/String;", "getFirstSolveIndex", "()I", "getLastSolveIndex", "getName", "getSessionId", "()J", "setSessionId", "(J)V", "getSize", "getStartDateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class SessionEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long sessionId;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "start_date_time")
    private final java.lang.String startDateTime = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "end_date_time")
    private final java.lang.String endDateTime = null;
    @androidx.room.ColumnInfo(name = "first_solve_index")
    private final int firstSolveIndex = 0;
    @androidx.room.ColumnInfo(name = "last_solve_index")
    private final int lastSolveIndex = 0;
    @androidx.room.ColumnInfo(name = "size")
    private final int size = 0;
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.database.session.SessionEntity copy(long sessionId, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String startDateTime, @org.jetbrains.annotations.NotNull
    java.lang.String endDateTime, int firstSolveIndex, int lastSolveIndex, int size) {
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
    
    public SessionEntity(long sessionId, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String startDateTime, @org.jetbrains.annotations.NotNull
    java.lang.String endDateTime, int firstSolveIndex, int lastSolveIndex, int size) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getSessionId() {
        return 0L;
    }
    
    public final void setSessionId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStartDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEndDateTime() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getFirstSolveIndex() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getLastSolveIndex() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getSize() {
        return 0;
    }
}