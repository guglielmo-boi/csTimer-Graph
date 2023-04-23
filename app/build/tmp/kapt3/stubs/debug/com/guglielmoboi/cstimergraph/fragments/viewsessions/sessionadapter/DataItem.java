package com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/DataItem;", "", "()V", "id", "", "getId", "()J", "PaddingItem", "SessionItem", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/DataItem$SessionItem;", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/DataItem$PaddingItem;", "app_debug"})
public abstract class DataItem {
    
    private DataItem() {
        super();
    }
    
    public abstract long getId();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/DataItem$SessionItem;", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/DataItem;", "session", "Lcom/guglielmoboi/cstimergraph/solvedata/session/Session;", "(Lcom/guglielmoboi/cstimergraph/solvedata/session/Session;)V", "id", "", "getId", "()J", "getSession", "()Lcom/guglielmoboi/cstimergraph/solvedata/session/Session;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SessionItem extends com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.DataItem {
        @org.jetbrains.annotations.NotNull
        private final com.guglielmoboi.cstimergraph.solvedata.session.Session session = null;
        private final long id = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.DataItem.SessionItem copy(@org.jetbrains.annotations.NotNull
        com.guglielmoboi.cstimergraph.solvedata.session.Session session) {
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
        
        public SessionItem(@org.jetbrains.annotations.NotNull
        com.guglielmoboi.cstimergraph.solvedata.session.Session session) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.guglielmoboi.cstimergraph.solvedata.session.Session component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.guglielmoboi.cstimergraph.solvedata.session.Session getSession() {
            return null;
        }
        
        @java.lang.Override
        public long getId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/DataItem$PaddingItem;", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/DataItem;", "()V", "id", "", "getId", "()J", "app_debug"})
    public static final class PaddingItem extends com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.DataItem {
        @org.jetbrains.annotations.NotNull
        public static final com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.DataItem.PaddingItem INSTANCE = null;
        private static final long id = -9223372036854775808L;
        
        private PaddingItem() {
            super();
        }
        
        @java.lang.Override
        public long getId() {
            return 0L;
        }
    }
}