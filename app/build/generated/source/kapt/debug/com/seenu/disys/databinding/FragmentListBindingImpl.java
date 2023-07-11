package com.seenu.disys.databinding;
import com.seenu.disys.R;
import com.seenu.disys.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentListBindingImpl extends FragmentListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout2, 2);
        sViewsWithIds.put(R.id.imageButton, 3);
        sViewsWithIds.put(R.id.textView, 4);
        sViewsWithIds.put(R.id.rv__record, 5);
        sViewsWithIds.put(R.id.progress_bar, 6);
        sViewsWithIds.put(R.id.addButton, 7);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ProgressBar) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.networkStatus.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.networkstatus == variableId) {
            setNetworkstatus((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNetworkstatus(@Nullable java.lang.Boolean Networkstatus) {
        this.mNetworkstatus = Networkstatus;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.networkstatus);
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
        java.lang.Boolean networkstatus = mNetworkstatus;
        int networkstatusViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxNetworkstatus = false;

        if ((dirtyFlags & 0x3L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(networkstatus)
                androidxDatabindingViewDataBindingSafeUnboxNetworkstatus = androidx.databinding.ViewDataBinding.safeUnbox(networkstatus);
            if((dirtyFlags & 0x3L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxNetworkstatus) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(networkstatus) ? View.GONE : View.VISIBLE
                networkstatusViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxNetworkstatus) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.networkStatus.setVisibility(networkstatusViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): networkstatus
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(networkstatus) ? View.GONE : View.VISIBLE
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(networkstatus) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}