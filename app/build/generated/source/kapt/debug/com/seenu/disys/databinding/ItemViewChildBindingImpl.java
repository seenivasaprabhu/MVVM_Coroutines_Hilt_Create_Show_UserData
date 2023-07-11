package com.seenu.disys.databinding;
import com.seenu.disys.R;
import com.seenu.disys.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemViewChildBindingImpl extends ItemViewChildBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView9, 8);
        sViewsWithIds.put(R.id.textView6, 9);
        sViewsWithIds.put(R.id.textView7, 10);
        sViewsWithIds.put(R.id.textView8, 11);
        sViewsWithIds.put(R.id.view2, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemViewChildBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ItemViewChildBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.view.View) bindings[12]
            );
        this.constraintLayout.setTag(null);
        this.imgConnectionStatus.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView3.setTag(null);
        this.textView4.setTag(null);
        this.textView5.setTag(null);
        this.txtName.setTag(null);
        this.txtStatus.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.item == variableId) {
            setItem((com.seenu.disys.data.entities.Data) variable);
        }
        else if (BR.status == variableId) {
            setStatus((java.lang.Boolean) variable);
        }
        else if (BR.name == variableId) {
            setName((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.seenu.disys.data.entities.Data Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setStatus(@Nullable java.lang.Boolean Status) {
        this.mStatus = Status;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.status);
        super.requestRebind();
    }
    public void setName(@Nullable java.lang.String Name) {
        this.mName = Name;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.name);
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
        com.seenu.disys.data.entities.Data item = mItem;
        java.lang.Boolean status = mStatus;
        java.lang.String name = mName;
        android.graphics.drawable.Drawable statusImgConnectionStatusAndroidDrawableIcTrueImgConnectionStatusAndroidDrawableIcFalse = null;
        java.lang.String statusTxtStatusAndroidStringStatusActiveTxtStatusAndroidStringStatusInactive = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxStatus = false;
        java.lang.String itemGenderJavaLangObjectNullItemGenderTextView4AndroidStringNoData = null;
        boolean itemGenderJavaLangObjectNull = false;
        boolean itemEmailJavaLangObjectNull = false;
        java.lang.String itemGender = null;
        android.graphics.drawable.Drawable statusConstraintLayoutAndroidDrawableIcBorderConstraintLayoutAndroidDrawableIcFalseBorder = null;
        int statusTxtStatusAndroidColorGreenTxtStatusAndroidColorRed = 0;
        int itemId = 0;
        java.lang.String integerToStringItemId = null;
        java.lang.String itemEmail = null;
        java.lang.String itemEmailJavaLangObjectNullItemEmailTextView3AndroidStringNoData = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (item != null) {
                    // read item.gender
                    itemGender = item.getGender();
                    // read item.id
                    itemId = item.getId();
                    // read item.email
                    itemEmail = item.getEmail();
                }


                // read item.gender != null
                itemGenderJavaLangObjectNull = (itemGender) != (null);
                // read Integer.toString(item.id)
                integerToStringItemId = java.lang.Integer.toString(itemId);
                // read item.email != null
                itemEmailJavaLangObjectNull = (itemEmail) != (null);
            if((dirtyFlags & 0x9L) != 0) {
                if(itemGenderJavaLangObjectNull) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x9L) != 0) {
                if(itemEmailJavaLangObjectNull) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(status)
                androidxDatabindingViewDataBindingSafeUnboxStatus = androidx.databinding.ViewDataBinding.safeUnbox(status);
            if((dirtyFlags & 0xaL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxStatus) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x1000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:drawable/ic_true : @android:drawable/ic_false
                statusImgConnectionStatusAndroidDrawableIcTrueImgConnectionStatusAndroidDrawableIcFalse = ((androidxDatabindingViewDataBindingSafeUnboxStatus) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgConnectionStatus.getContext(), R.drawable.ic_true)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgConnectionStatus.getContext(), R.drawable.ic_false)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:string/status_active : @android:string/status_inactive
                statusTxtStatusAndroidStringStatusActiveTxtStatusAndroidStringStatusInactive = ((androidxDatabindingViewDataBindingSafeUnboxStatus) ? (txtStatus.getResources().getString(R.string.status_active)) : (txtStatus.getResources().getString(R.string.status_inactive)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:drawable/ic_border : @android:drawable/ic_false_border
                statusConstraintLayoutAndroidDrawableIcBorderConstraintLayoutAndroidDrawableIcFalseBorder = ((androidxDatabindingViewDataBindingSafeUnboxStatus) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(constraintLayout.getContext(), R.drawable.ic_border)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(constraintLayout.getContext(), R.drawable.ic_false_border)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:color/green : @android:color/red
                statusTxtStatusAndroidColorGreenTxtStatusAndroidColorRed = ((androidxDatabindingViewDataBindingSafeUnboxStatus) ? (getColorFromResource(txtStatus, R.color.green)) : (getColorFromResource(txtStatus, R.color.red)));
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x9L) != 0) {

                // read item.gender != null ? item.gender : @android:string/no_data
                itemGenderJavaLangObjectNullItemGenderTextView4AndroidStringNoData = ((itemGenderJavaLangObjectNull) ? (itemGender) : (textView4.getResources().getString(R.string.no_data)));
                // read item.email != null ? item.email : @android:string/no_data
                itemEmailJavaLangObjectNullItemEmailTextView3AndroidStringNoData = ((itemEmailJavaLangObjectNull) ? (itemEmail) : (textView3.getResources().getString(R.string.no_data)));
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.constraintLayout, statusConstraintLayoutAndroidDrawableIcBorderConstraintLayoutAndroidDrawableIcFalseBorder);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgConnectionStatus, statusImgConnectionStatusAndroidDrawableIcTrueImgConnectionStatusAndroidDrawableIcFalse);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtStatus, statusTxtStatusAndroidStringStatusActiveTxtStatusAndroidStringStatusInactive);
            this.txtStatus.setTextColor(statusTxtStatusAndroidColorGreenTxtStatusAndroidColorRed);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, itemEmailJavaLangObjectNullItemEmailTextView3AndroidStringNoData);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView4, itemGenderJavaLangObjectNullItemGenderTextView4AndroidStringNoData);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, integerToStringItemId);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtName, name);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): status
        flag 2 (0x3L): name
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:drawable/ic_true : @android:drawable/ic_false
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:drawable/ic_true : @android:drawable/ic_false
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:string/status_active : @android:string/status_inactive
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:string/status_active : @android:string/status_inactive
        flag 8 (0x9L): item.gender != null ? item.gender : @android:string/no_data
        flag 9 (0xaL): item.gender != null ? item.gender : @android:string/no_data
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:drawable/ic_border : @android:drawable/ic_false_border
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:drawable/ic_border : @android:drawable/ic_false_border
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:color/green : @android:color/red
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(status) ? @android:color/green : @android:color/red
        flag 14 (0xfL): item.email != null ? item.email : @android:string/no_data
        flag 15 (0x10L): item.email != null ? item.email : @android:string/no_data
    flag mapping end*/
    //end
}