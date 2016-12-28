package com.connorlin.databinding.databinding;
import com.connorlin.databinding.R;
import com.connorlin.databinding.BR;
import android.view.View;
public class ActivityObserverFieldBinding extends android.databinding.ViewDataBinding  {

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
    private com.connorlin.databinding.model.ObservableFieldContact mContact;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityObserverFieldBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 2);
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.contact :
                setContact((com.connorlin.databinding.model.ObservableFieldContact) variable);
                return true;
        }
        return false;
    }

    public void setContact(com.connorlin.databinding.model.ObservableFieldContact contact) {
        this.mContact = contact;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.contact);
        super.requestRebind();
    }
    public com.connorlin.databinding.model.ObservableFieldContact getContact() {
        return mContact;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMPhoneContac((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeMNameContact((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMPhoneContac(android.databinding.ObservableField<java.lang.String> mPhoneContact, int fieldId) {
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
    private boolean onChangeMNameContact(android.databinding.ObservableField<java.lang.String> mNameContact, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
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
        com.connorlin.databinding.model.ObservableFieldContact contact = mContact;
        android.databinding.ObservableField<java.lang.String> mPhoneContact = null;
        java.lang.String mNameContact = null;
        android.databinding.ObservableField<java.lang.String> mNameContact1 = null;
        java.lang.String mPhoneContact1 = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (contact != null) {
                        // read contact.mPhone
                        mPhoneContact = contact.mPhone;
                    }
                    updateRegistration(0, mPhoneContact);


                    if (mPhoneContact != null) {
                        // read contact.mPhone.get()
                        mPhoneContact1 = mPhoneContact.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (contact != null) {
                        // read contact.mName
                        mNameContact1 = contact.mName;
                    }
                    updateRegistration(1, mNameContact1);


                    if (mNameContact1 != null) {
                        // read contact.mName.get()
                        mNameContact = mNameContact1.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mNameContact);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, mPhoneContact1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityObserverFieldBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityObserverFieldBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityObserverFieldBinding>inflate(inflater, com.connorlin.databinding.R.layout.activity_observer_field, root, attachToRoot, bindingComponent);
    }
    public static ActivityObserverFieldBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityObserverFieldBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.connorlin.databinding.R.layout.activity_observer_field, null, false), bindingComponent);
    }
    public static ActivityObserverFieldBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityObserverFieldBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_observer_field_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityObserverFieldBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): contact.mPhone
        flag 1 (0x2L): contact.mName
        flag 2 (0x3L): contact
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}