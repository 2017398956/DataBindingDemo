package com.connorlin.databinding;
import com.connorlin.databinding.R;
import com.connorlin.databinding.BR;
import android.view.View;
public class TwoWayBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.EditText editText;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.TextView mboundView2;
    // variables
    private com.connorlin.databinding.model.ObservableFieldContact mContact;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editTextandroidTextA = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of contact.mName.get()
            //         is contact.mName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText);
            // localize variables for thread safety
            // contact
            com.connorlin.databinding.model.ObservableFieldContact contact = mContact;
            // contact.mName
            android.databinding.ObservableField<java.lang.String> mNameContact = null;
            // contact != null
            boolean contactObjectnull = false;
            // contact.mName.get()
            java.lang.String MNameContact1 = null;
            // contact.mName != null
            boolean mNameContactObjectnu = false;



            contactObjectnull = (contact) != (null);
            if (contactObjectnull) {


                mNameContact = contact.mName;

                mNameContactObjectnu = (mNameContact) != (null);
                if (mNameContactObjectnu) {




                    mNameContact.set((java.lang.String) (callbackArg_0));
                }
            }
        }
    };

    public TwoWayBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.editText = (android.widget.EditText) bindings[1];
        this.editText.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
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
            case BR.contact :
                setContact((com.connorlin.databinding.model.ObservableFieldContact) variable);
                return true;
        }
        return false;
    }

    public void setContact(com.connorlin.databinding.model.ObservableFieldContact contact) {
        this.mContact = contact;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
                return onChangeMNameContact((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMNameContact(android.databinding.ObservableField<java.lang.String> mNameContact, int fieldId) {
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
        com.connorlin.databinding.model.ObservableFieldContact contact = mContact;
        java.lang.String mNameContact = null;
        android.databinding.ObservableField<java.lang.String> mNameContact1 = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (contact != null) {
                    // read contact.mName
                    mNameContact1 = contact.mName;
                }
                updateRegistration(0, mNameContact1);


                if (mNameContact1 != null) {
                    // read contact.mName.get()
                    mNameContact = mNameContact1.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText, mNameContact);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, mNameContact);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextandroidTextA);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static TwoWayBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static TwoWayBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<TwoWayBinding>inflate(inflater, com.connorlin.databinding.R.layout.activity_two_way, root, attachToRoot, bindingComponent);
    }
    public static TwoWayBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static TwoWayBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.connorlin.databinding.R.layout.activity_two_way, null, false), bindingComponent);
    }
    public static TwoWayBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static TwoWayBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_two_way_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new TwoWayBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): contact.mName
        flag 1 (0x2L): contact
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}