package com.guglielmoboi.cstimergraph.databinding;
import com.guglielmoboi.cstimergraph.R;
import com.guglielmoboi.cstimergraph.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogContributorsBindingImpl extends DialogContributorsBinding implements com.guglielmoboi.cstimergraph.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.contributorsHeader, 7);
        sViewsWithIds.put(R.id.developerIcon, 8);
        sViewsWithIds.put(R.id.developerName, 9);
        sViewsWithIds.put(R.id.designerIcon, 10);
        sViewsWithIds.put(R.id.designerName, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogContributorsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private DialogContributorsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[4]
            );
        this.emailButton.setTag(null);
        this.emailButton2.setTag(null);
        this.githubButton.setTag(null);
        this.instagramButton.setTag(null);
        this.instagramButton2.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.stackoverflowButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 6);
        mCallback5 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 4);
        mCallback6 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 2);
        mCallback4 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 3);
        mCallback2 = new com.guglielmoboi.cstimergraph.generated.callback.OnClickListener(this, 1);
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
            setViewModel((com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModel ViewModel) {
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
        com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.emailButton.setOnClickListener(mCallback2);
            this.emailButton2.setOnClickListener(mCallback6);
            this.githubButton.setOnClickListener(mCallback4);
            this.instagramButton.setOnClickListener(mCallback3);
            this.instagramButton2.setOnClickListener(mCallback7);
            this.stackoverflowButton.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onInstagramDesignerButtonClicked();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onStackoverflowDeveloperButtonClicked();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onEmailDesignerButtonClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onInstagramDeveloperButtonClicked();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onGithubDeveloperButtonClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onEmailDeveloperButtonClicked();
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