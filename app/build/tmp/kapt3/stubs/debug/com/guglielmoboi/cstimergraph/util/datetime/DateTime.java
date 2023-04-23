package com.guglielmoboi.cstimergraph.util.datetime;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0000H\u0096\u0002J\u0013\u0010!\u001a\u00020\"2\b\u0010 \u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u0010H\u0016J\b\u0010%\u001a\u00020\u0003H\u0016J\u0006\u0010&\u001a\u00020\u0003R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/guglielmoboi/cstimergraph/util/datetime/DateTime;", "", "dateString", "", "timeString", "(Ljava/lang/String;Ljava/lang/String;)V", "dateTimeString", "(Ljava/lang/String;)V", "date", "Lcom/guglielmoboi/cstimergraph/util/datetime/Date;", "time", "Lcom/guglielmoboi/cstimergraph/util/datetime/Time;", "(Lcom/guglielmoboi/cstimergraph/util/datetime/Date;Lcom/guglielmoboi/cstimergraph/util/datetime/Time;)V", "getDate", "()Lcom/guglielmoboi/cstimergraph/util/datetime/Date;", "day", "", "getDay", "()I", "hour", "getHour", "minute", "getMinute", "month", "getMonth", "second", "getSecond", "getTime", "()Lcom/guglielmoboi/cstimergraph/util/datetime/Time;", "year", "getYear", "compareTo", "other", "equals", "", "", "hashCode", "toString", "toStringFormatted", "app_debug"})
public final class DateTime implements java.lang.Comparable<com.guglielmoboi.cstimergraph.util.datetime.DateTime> {
    @org.jetbrains.annotations.NotNull
    private final com.guglielmoboi.cstimergraph.util.datetime.Date date = null;
    @org.jetbrains.annotations.NotNull
    private final com.guglielmoboi.cstimergraph.util.datetime.Time time = null;
    
    public DateTime(@org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.util.datetime.Date date, @org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.util.datetime.Time time) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.util.datetime.Date getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guglielmoboi.cstimergraph.util.datetime.Time getTime() {
        return null;
    }
    
    public DateTime(@org.jetbrains.annotations.NotNull
    java.lang.String dateString, @org.jetbrains.annotations.NotNull
    java.lang.String timeString) {
        super();
    }
    
    public DateTime(@org.jetbrains.annotations.NotNull
    java.lang.String dateTimeString) {
        super();
    }
    
    private final int getDay() {
        return 0;
    }
    
    private final int getMonth() {
        return 0;
    }
    
    private final int getYear() {
        return 0;
    }
    
    private final int getHour() {
        return 0;
    }
    
    private final int getMinute() {
        return 0;
    }
    
    private final int getSecond() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
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
    
    @java.lang.Override
    public int compareTo(@org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.util.datetime.DateTime other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String toStringFormatted() {
        return null;
    }
}