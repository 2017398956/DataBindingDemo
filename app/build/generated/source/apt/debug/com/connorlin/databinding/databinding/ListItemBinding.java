package com.connorlin.databinding.databinding;
import com.connorlin.databinding.R;
import com.connorlin.databinding.BR;
import android.view.View;
public class ListItemBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    private final android.widget.LinearLayout mboundView0;
    public final android.widget.TextView text1;
    public final android.widget.TextView text2;
    // variables
    private com.connorlin.databinding.model.ObservableContact mContact;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.text1 = (android.widget.TextView) bindings[1];
        this.text1.setTag(null);
        this.text2 = (android.widget.TextView) bindings[2];
        this.text2.setTag(null);
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
                setContact((com.connorlin.databinding.model.ObservableContact) variable);
                return true;
        }
        return false;
    }

    public void setContact(com.connorlin.databinding.model.ObservableContact contact) {
        updateRegistration(0, contact);
        this.mContact = contact;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.contact);
        super.requestRebind();
    }
    public com.connorlin.databinding.model.ObservableContact getContact() {
        return mContact;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeContact((com.connorlin.databinding.model.ObservableContact) object, fieldId);
        }
        return false;
    }
    private boolean onChangeContact(com.connorlin.databinding.model.ObservableContact contact, int fieldId) {
        switch (fieldId) {
            case BR.name: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
            case BR.phone: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
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
        java.lang.String phoneContact = null;
        com.connorlin.databinding.model.ObservableContact contact = mContact;
        java.lang.String nameContact = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (contact != null) {
                        // read contact.phone
                        phoneContact = contact.getPhone();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (contact != null) {
                        // read contact.name
                        nameContact = contact.getName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.text1, nameContact);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.text2, phoneContact);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ListItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ListItemBinding>inflate(inflater, com.connorlin.databinding.R.layout.list_item, root, attachToRoot, bindingComponent);
    }
    public static ListItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.connorlin.databinding.R.layout.list_item, null, false), bindingComponent);
    }
    public static ListItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/list_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ListItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): contact
        flag 1 (0x2L): contact.name
        flag 2 (0x3L): contact.phone
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}