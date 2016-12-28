package com.connorlin.databinding.databinding;
import com.connorlin.databinding.R;
import com.connorlin.databinding.BR;
import android.view.View;
public class ActivityAttributeSettersBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    private final android.widget.LinearLayout mboundView0;
    private final com.connorlin.databinding.view.Card mboundView1;
    private final android.widget.ImageView mboundView2;
    private final android.widget.TextView mboundView3;
    // variables
    private com.connorlin.databinding.model.User mUser;
    private java.lang.String mUrl;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAttributeSettersBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.connorlin.databinding.view.Card) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
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
            case BR.user :
                setUser((com.connorlin.databinding.model.User) variable);
                return true;
            case BR.url :
                setUrl((java.lang.String) variable);
                return true;
        }
        return false;
    }

    public void setUser(com.connorlin.databinding.model.User user) {
        this.mUser = user;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public com.connorlin.databinding.model.User getUser() {
        return mUser;
    }
    public void setUrl(java.lang.String url) {
        this.mUrl = url;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.url);
        super.requestRebind();
    }
    public java.lang.String getUrl() {
        return mUrl;
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
        com.connorlin.databinding.model.User user = mUser;
        java.lang.String url = mUrl;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView1.setObject(user);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.connorlin.databinding.utils.Utils.loadImage(this.mboundView2, url, android.databinding.DynamicUtil.getDrawableFromResource(mboundView2, R.drawable.ic_launcher));
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, mboundView3.getResources().getString(R.string.zhuanti));
            com.connorlin.databinding.utils.Utils.setFont(this.mboundView3, "zhuanti");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityAttributeSettersBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityAttributeSettersBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityAttributeSettersBinding>inflate(inflater, com.connorlin.databinding.R.layout.activity_attribute_setters, root, attachToRoot, bindingComponent);
    }
    public static ActivityAttributeSettersBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityAttributeSettersBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.connorlin.databinding.R.layout.activity_attribute_setters, null, false), bindingComponent);
    }
    public static ActivityAttributeSettersBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityAttributeSettersBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_attribute_setters_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityAttributeSettersBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): url
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}