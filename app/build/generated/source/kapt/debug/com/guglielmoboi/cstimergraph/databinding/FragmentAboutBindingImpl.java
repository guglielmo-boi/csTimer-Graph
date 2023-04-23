package com.guglielmoboi.cstimergraph.databinding;
import com.guglielmoboi.cstimergraph.R;
import com.guglielmoboi.cstimergraph.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAboutBindingImpl extends FragmentAboutBinding implements com.guglielmoboi.cstimergraph.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.aboutHeader, 7);
        sViewsWithIds.put(R.id.divider12, 8);
        sViewsWithIds.put(R.id.logo, 9);
        sViewsWithIds.put(R.id.textView2, 10);
        sViewsWithIds.put(R.id.appVersion, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAboutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentAboutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (android.view.View) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (android.widget.ImageView) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (android.widget.TextView) bindings[10]
            );
        this.contactUsButton.setTag(null);
        this.contributorsButton.setTag(null);
        this.feedbackButton.setTag(null);
        this.licenseButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rateAppButton.setTag(null);
        this.sourceCodeButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 2);
        mCallback17 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 3);
        mCallback15 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 1);
        mCallback18 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 4);
        mCallback19 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 5);
        mCallback20 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 6);
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
            setViewModel((com.guglielmoboi.cstimergraph.fragments.about.AboutViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.guglielmoboi.cstimergraph.fragments.about.AboutViewModel ViewModel) {
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
        com.guglielmoboi.cstimergraph.fragments.about.AboutViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.contactUsButton.setOnClickListener(mCallback16);
            this.contributorsButton.setOnClickListener(mCallback18);
            this.feedbackButton.setOnClickListener(mCallback17);
            this.licenseButton.setOnClickListener(mCallback20);
            this.rateAppButton.setOnClickListener(mCallback15);
            this.sourceCodeButton.setOnClickListener(mCallback19);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.fragments.about.AboutViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onContactUsButtonClicked();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.fragments.about.AboutViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onFeedbackButtonClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.fragments.about.AboutViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onRateAppButtonClicked();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.fragments.about.AboutViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onContributorsButtonClicked();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.fragments.about.AboutViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onSourceCodeButtonClicked();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.fragments.about.AboutViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onLicenseButtonClicked();
                }
                break;
            }
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