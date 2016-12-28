package com.connorlin.databinding.databinding;
import com.connorlin.databinding.R;
import com.connorlin.databinding.BR;
import android.view.View;
public class ActivityNormalObjectBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.TextView mboundView1;
    private final android.widget.TextView mboundView2;
    // variables
    private com.connorlin.databinding.model.Contact mContact;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNormalObjectBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.contact :
                setContact((com.connorlin.databinding.model.Contact) variable);
                return true;
        }
        return false;
    }

    public void setContact(com.connorlin.databinding.model.Contact contact) {
        this.mContact = contact;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.contact);
        super.requestRebind();
    }
    public com.connorlin.databinding.model.Contact getContact() {
        return mContact;
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
        java.lang.String phoneContact = null;
        com.connorlin.databinding.model.Contact contact = mContact;
        java.lang.String nameContact = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (contact != null) {
                    // read contact.phone
                    phoneContact = contact.getPhone();
                    // read contact.name
                    nameContact = contact.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, nameContact);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, phoneContact);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityNormalObjectBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityNormalObjectBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityNormalObjectBinding>inflate(inflater, com.connorlin.databinding.R.layout.activity_normal_object, root, attachToRoot, bindingComponent);
    }
    public static ActivityNormalObjectBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityNormalObjectBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.connorlin.databinding.R.layout.activity_normal_object, null, false), bindingComponent);
    }
    public static ActivityNormalObjectBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityNormalObjectBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_normal_object_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityNormalObjectBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): contact
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}