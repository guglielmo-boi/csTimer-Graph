package com.guglielmoboi.cstimergraph.databinding;
import com.guglielmoboi.cstimergraph.R;
import com.guglielmoboi.cstimergraph.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentImportSessionBindingImpl extends FragmentImportSessionBinding implements com.guglielmoboi.cstimergraph.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.importHeader, 2);
        sViewsWithIds.put(R.id.divider8, 3);
        sViewsWithIds.put(R.id.tutorialScrollView, 4);
        sViewsWithIds.put(R.id.tutorialLayout, 5);
        sViewsWithIds.put(R.id.tutorialSubHeader0, 6);
        sViewsWithIds.put(R.id.tutorialPcHeader, 7);
        sViewsWithIds.put(R.id.desktopComputerIcon, 8);
        sViewsWithIds.put(R.id.tutorialPcScrollView, 9);
        sViewsWithIds.put(R.id.tutorialPcConstraintLayout, 10);
        sViewsWithIds.put(R.id.divider0, 11);
        sViewsWithIds.put(R.id.tutorialPc0, 12);
        sViewsWithIds.put(R.id.tutorialPc1, 13);
        sViewsWithIds.put(R.id.tutorialPc2, 14);
        sViewsWithIds.put(R.id.divider1, 15);
        sViewsWithIds.put(R.id.tutorialMobileHeader, 16);
        sViewsWithIds.put(R.id.mobileIcon, 17);
        sViewsWithIds.put(R.id.tutorialMobileScrollView, 18);
        sViewsWithIds.put(R.id.tutorialMobileConstraintLayout, 19);
        sViewsWithIds.put(R.id.divider2, 20);
        sViewsWithIds.put(R.id.tutorialMobile0, 21);
        sViewsWithIds.put(R.id.tutorialMobile1, 22);
        sViewsWithIds.put(R.id.tutorialMobile2, 23);
        sViewsWithIds.put(R.id.divider3, 24);
        sViewsWithIds.put(R.id.tutorialSubHeader1, 25);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentImportSessionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private FragmentImportSessionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[8]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[3]
            , (android.widget.ImageButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (android.widget.TextView) bindings[16]
            , (android.widget.HorizontalScrollView) bindings[18]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.HorizontalScrollView) bindings[9]
            , (android.widget.ScrollView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[25]
            );
        this.importButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.guglielmoboi.cstimergraph.fragments.importsession.ImportSessionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.guglielmoboi.cstimergraph.fragments.importsession.ImportSessionViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
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
        com.guglielmoboi.cstimergraph.fragments.importsession.ImportSessionViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.importButton.setOnClickListener(mCallback13);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.guglielmoboi.cstimergraph.fragments.importsession.ImportSessionViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onImportButtonClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}