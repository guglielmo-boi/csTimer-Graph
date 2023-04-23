package com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0017\u0018\u0019B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0016\u0010\u0013\u001a\u00020\r2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/SessionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/DataItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "sessionListener", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/sessionlistener/SessionListener;", "(Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/sessionlistener/SessionListener;)V", "adapterScope", "Lkotlinx/coroutines/CoroutineScope;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitListWithPadding", "list", "", "Lcom/guglielmoboi/cstimergraph/solvedata/session/Session;", "Companion", "TextViewHolder", "ViewHolder", "app_debug"})
public final class SessionAdapter extends androidx.recyclerview.widget.ListAdapter<com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.DataItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionListener sessionListener = null;
    private final kotlinx.coroutines.CoroutineScope adapterScope = null;
    @org.jetbrains.annotations.NotNull
    public static final com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.SessionAdapter.Companion Companion = null;
    private static final int ITEM_VIEW_TYPE_PADDING = 0;
    private static final int ITEM_VIEW_TYPE_SESSION = 1;
    
    public SessionAdapter(@org.jetbrains.annotations.NotNull
    com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionListener sessionListener) {
        super(null);
    }
    
    public final void submitListWithPadding(@org.jetbrains.annotations.Nullable
    java.util.List<com.guglielmoboi.cstimergraph.solvedata.session.Session> list) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/SessionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/guglielmoboi/cstimergraph/databinding/ListItemSessionBinding;", "(Lcom/guglielmoboi/cstimergraph/databinding/ListItemSessionBinding;)V", "getBinding", "()Lcom/guglielmoboi/cstimergraph/databinding/ListItemSessionBinding;", "bind", "", "item", "Lcom/guglielmoboi/cstimergraph/solvedata/session/Session;", "sessionListener", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/sessionlistener/SessionListener;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.guglielmoboi.cstimergraph.databinding.ListItemSessionBinding binding = null;
        @org.jetbrains.annotations.NotNull
        public static final com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.SessionAdapter.ViewHolder.Companion Companion = null;
        
        private ViewHolder(com.guglielmoboi.cstimergraph.databinding.ListItemSessionBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.guglielmoboi.cstimergraph.databinding.ListItemSessionBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.guglielmoboi.cstimergraph.solvedata.session.Session item, @org.jetbrains.annotations.NotNull
        com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionListener sessionListener) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/SessionAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/SessionAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.SessionAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/SessionAdapter$TextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "Companion", "app_debug"})
    public static final class TextViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        public static final com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.SessionAdapter.TextViewHolder.Companion Companion = null;
        
        public TextViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/SessionAdapter$TextViewHolder$Companion;", "", "()V", "from", "Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/SessionAdapter$TextViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.SessionAdapter.TextViewHolder from(@org.jetbrains.annotations.NotNull
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/guglielmoboi/cstimergraph/fragments/viewsessions/sessionadapter/SessionAdapter$Companion;", "", "()V", "ITEM_VIEW_TYPE_PADDING", "", "ITEM_VIEW_TYPE_SESSION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}