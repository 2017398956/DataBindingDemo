package com.connorlin.databinding.databinding;
import com.connorlin.databinding.R;
import com.connorlin.databinding.BR;
import android.view.View;
public class ActivityConvertersBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.TextView mboundView1;
    private final android.view.View mboundView2;
    // variables
    private android.databinding.ObservableBoolean mIsError;
    private java.util.List<com.connorlin.databinding.model.User> mList;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityConvertersBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.view.View) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.isError :
                setIsError((android.databinding.ObservableBoolean) variable);
                return true;
            case BR.list :
                setList((java.util.List<com.connorlin.databinding.model.User>) variable);
                return true;
        }
        return false;
    }

    public void setIsError(android.databinding.ObservableBoolean isError) {
        updateRegistration(0, isError);
        this.mIsError = isError;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isError);
        super.requestRebind();
    }
    public android.databinding.ObservableBoolean getIsError() {
        return mIsError;
    }
    public void setList(java.util.List<com.connorlin.databinding.model.User> list) {
        this.mList = list;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.list);
        super.requestRebind();
    }
    public java.util.List<com.connorlin.databinding.model.User> getList() {
        return mList;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIsError((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIsError(android.databinding.ObservableBoolean isError, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
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
        int isErrorGetIsErrorAnd = 0;
        android.databinding.ObservableBoolean isError = mIsError;
        boolean isErrorGetIsError = false;
        com.connorlin.databinding.model.User listGetListInt0 = null;
        java.util.List<com.connorlin.databinding.model.User> list = mList;

        if ((dirtyFlags & 0x5L) != 0) {



                if (isError != null) {
                    // read isError.get()
                    isErrorGetIsError = isError.get();
                }
                if((dirtyFlags & 0x5L) != 0) {
                    if (isErrorGetIsError) {
                        dirtyFlags |= 0x10L;
                    } else {
                        dirtyFlags |= 0x8L;
                    }}


                // read isError.get() ? @android:color/colorAccent : @android:color/colorPrimary
                isErrorGetIsErrorAnd = (isErrorGetIsError) ? (android.databinding.DynamicUtil.getColorFromResource(mboundView2, R.color.colorAccent)) : (android.databinding.DynamicUtil.getColorFromResource(mboundView2, R.color.colorPrimary));
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (list != null) {
                    // read list.get(0)
                    listGetListInt0 = list.get(0);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, com.connorlin.databinding.context.ConvertersActivity.convertUserToCharSequence(listGetListInt0));
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView2, com.connorlin.databinding.context.ConvertersActivity.convertColorToDrawable(isErrorGetIsErrorAnd));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityConvertersBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityConvertersBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityConvertersBinding>inflate(inflater, com.connorlin.databinding.R.layout.activity_converters, root, attachToRoot, bindingComponent);
    }
    public static ActivityConvertersBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityConvertersBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.connorlin.databinding.R.layout.activity_converters, null, false), bindingComponent);
    }
    public static ActivityConvertersBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityConvertersBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_converters_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityConvertersBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): isError
        flag 1 (0x2L): list
        flag 2 (0x3L): null
        flag 3 (0x4L): isError.get() ? @android:color/colorAccent : @android:color/colorPrimary
        flag 4 (0x5L): isError.get() ? @android:color/colorAccent : @android:color/colorPrimary
    flag mapping end*/
    //end
}