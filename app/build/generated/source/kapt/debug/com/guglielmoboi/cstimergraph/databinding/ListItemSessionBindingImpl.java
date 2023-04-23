package com.guglielmoboi.cstimergraph.databinding;
import com.guglielmoboi.cstimergraph.R;
import com.guglielmoboi.cstimergraph.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemSessionBindingImpl extends ListItemSessionBinding implements com.guglielmoboi.cstimergraph.generated.callback.OnLongClickListener.Listener, com.guglielmoboi.cstimergraph.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.betweenDates, 13);
        sViewsWithIds.put(R.id.sessionMeanHeader, 14);
        sViewsWithIds.put(R.id.bestSolveHeader, 15);
        sViewsWithIds.put(R.id.worstSolveHeader, 16);
        sViewsWithIds.put(R.id.bestAvg5Header, 17);
        sViewsWithIds.put(R.id.WorstAvg5Header, 18);
        sViewsWithIds.put(R.id.bestAvg12Header, 19);
        sViewsWithIds.put(R.id.worstAvg12Header, 20);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnLongClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemSessionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ListItemSessionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[16]
            );
        this.bestAvg12.setTag(null);
        this.bestAvg5.setTag(null);
        this.bestSolve.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mean.setTag(null);
        this.sessionEndDateTime.setTag(null);
        this.sessionName.setTag(null);
        this.sessionStartDateTime.setTag(null);
        this.solvesCount.setTag(null);
        this.worstAvg12.setTag(null);
        this.worstAvg5.setTag(null);
        this.worstSolve.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.guglielmoboi.cstimergraph.generated.callback.OnLongClickListener(this, 2);
        mCallback11 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.session == variableId) {
            setSession((com.guglielmoboi.cstimergraph.solvedata.session.Session) variable);
        }
        else if (BR.sessionListener == variableId) {
            setSessionListener((com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSession(@Nullable com.guglielmoboi.cstimergraph.solvedata.session.Session Session) {
        this.mSession = Session;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.session);
        super.requestRebind();
    }
    public void setSessionListener(@Nullable com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionListener SessionListener) {
        this.mSessionListener = SessionListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.sessionListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.guglielmoboi.cstimergraph.solvedata.session.Session session = mSession;
        com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionListener sessionListener = mSessionListener;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.BindingAdaptersKt.setSessionBestAverageTwelve(this.bestAvg12, session);
            com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.BindingAdaptersKt.setSessionBestAverageFive(this.bestAvg5, session);
            com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.BindingAdaptersKt.setSessionBestSolve(this.bestSolve, session);
            com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.BindingAdaptersKt.setSessionMean(this.mean, session);
            com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.BindingAdaptersKt.setSessionEndDateTime(this.sessionEndDateTime, session);
            com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.BindingAdaptersKt.setSessionName(this.sessionName, session);
            com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.BindingAdaptersKt.setSessionStartDateTime(this.sessionStartDateTime, session);
            com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.BindingAdaptersKt.setSolvesCount(this.solvesCount, session);
            com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.BindingAdaptersKt.setSessionWorstAverageTwelve(this.worstAvg12, session);
            com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.BindingAdaptersKt.setSessionWorstAverageFive(this.worstAvg5, session);
            com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.BindingAdaptersKt.setSessionWorstSolve(this.worstSolve, session);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback11);
            this.mboundView1.setOnLongClickListener(mCallback12);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // sessionListener.sessionLongClickListener != null
        boolean sessionListenerSessionLongClickListenerJavaLangObjectNull = false;
        // sessionListener.sessionLongClickListener
        com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionLongClickListener sessionListenerSessionLongClickListener = null;
        // session
        com.guglielmoboi.cstimergraph.solvedata.session.Session session = mSession;
        // sessionListener
        com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionListener sessionListener = mSessionListener;
        // sessionListener.sessionLongClickListener.onLongClick(session)
        boolean sessionListenerSessionLongClickListenerOnLongClickSession = false;
        // sessionListener != null
        boolean sessionListenerJavaLangObjectNull = false;



        sessionListenerJavaLangObjectNull = (sessionListener) != (null);
        if (sessionListenerJavaLangObjectNull) {


            sessionListenerSessionLongClickListener = sessionListener.getSessionLongClickListener();

            sessionListenerSessionLongClickListenerJavaLangObjectNull = (sessionListenerSessionLongClickListener) != (null);
            if (sessionListenerSessionLongClickListenerJavaLangObjectNull) {



                sessionListenerSessionLongClickListenerOnLongClickSession = sessionListenerSessionLongClickListener.onLongClick(session);
            }
        }
        return sessionListenerSessionLongClickListenerOnLongClickSession;
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // sessionListener.sessionClickListener != null
        boolean sessionListenerSessionClickListenerJavaLangObjectNull = false;
        // sessionListener.sessionClickListener
        com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionClickListener sessionListenerSessionClickListener = null;
        // session
        com.guglielmoboi.cstimergraph.solvedata.session.Session session = mSession;
        // sessionListener
        com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionListener sessionListener = mSessionListener;
        // sessionListener != null
        boolean sessionListenerJavaLangObjectNull = false;



        sessionListenerJavaLangObjectNull = (sessionListener) != (null);
        if (sessionListenerJavaLangObjectNull) {


            sessionListenerSessionClickListener = sessionListener.getSessionClickListener();

            sessionListenerSessionClickListenerJavaLangObjectNull = (sessionListenerSessionClickListener) != (null);
            if (sessionListenerSessionClickListenerJavaLangObjectNull) {



                sessionListenerSessionClickListener.onClick(session);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): session
        flag 1 (0x2L): sessionListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}