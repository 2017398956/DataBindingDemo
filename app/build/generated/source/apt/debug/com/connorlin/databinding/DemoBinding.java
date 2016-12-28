package com.connorlin.databinding;
import com.connorlin.databinding.R;
import com.connorlin.databinding.BR;
import android.view.View;
public class DemoBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.listView, 4);
        sViewsWithIds.put(R.id.empty_view, 5);
    }
    // views
    public final android.widget.Button btnAdd;
    public final android.widget.EditText editName;
    public final android.widget.EditText editPhone;
    public final android.widget.TextView emptyView;
    public final android.widget.ListView listView;
    private final android.widget.RelativeLayout mboundView0;
    // variables
    private com.connorlin.databinding.handler.DemoHandler mHandler;
    private com.connorlin.databinding.model.ObservableContact mContact;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editNameandroidTextA = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of contact.name
            //         is contact.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editName);
            // localize variables for thread safety
            // contact
            com.connorlin.databinding.model.ObservableContact contact = mContact;
            // contact != null
            boolean contactObjectnull = false;
            // contact.name
            java.lang.String nameContact = null;



            contactObjectnull = (contact) != (null);
            if (contactObjectnull) {




                contact.setName((java.lang.String) (callbackArg_0));
            }
        }
    };
    private android.databinding.InverseBindingListener editPhoneandroidText = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of contact.phone
            //         is contact.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editPhone);
            // localize variables for thread safety
            // contact
            com.connorlin.databinding.model.ObservableContact contact = mContact;
            // contact != null
            boolean contactObjectnull = false;
            // contact.phone
            java.lang.String phoneContact = null;



            contactObjectnull = (contact) != (null);
            if (contactObjectnull) {




                contact.setPhone((java.lang.String) (callbackArg_0));
            }
        }
    };

    public DemoBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.btnAdd = (android.widget.Button) bindings[3];
        this.btnAdd.setTag(null);
        this.editName = (android.widget.EditText) bindings[1];
        this.editName.setTag(null);
        this.editPhone = (android.widget.EditText) bindings[2];
        this.editPhone.setTag(null);
        this.emptyView = (android.widget.TextView) bindings[5];
        this.listView = (android.widget.ListView) bindings[4];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            case BR.handler :
                setHandler((com.connorlin.databinding.handler.DemoHandler) variable);
                return true;
            case BR.contact :
                setContact((com.connorlin.databinding.model.ObservableContact) variable);
                return true;
        }
        return false;
    }

    public void setHandler(com.connorlin.databinding.handler.DemoHandler handler) {
        this.mHandler = handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public com.connorlin.databinding.handler.DemoHandler getHandler() {
        return mHandler;
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
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
            case BR.phone: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
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
        android.view.View.OnClickListener androidViewViewOnCli = null;
        com.connorlin.databinding.handler.DemoHandler handler = mHandler;
        com.connorlin.databinding.model.ObservableContact contact = mContact;
        int nameContactLengthNam = 0;
        int phoneContactLengthPh = 0;
        boolean NameContactLengthNam1 = false;
        java.lang.String nameContact = null;
        boolean NameContactLengthNam2 = false;
        boolean PhoneContactLengthPh1 = false;

        if ((dirtyFlags & 0x12L) != 0) {



                if (handler != null) {
                    // read handler::onClick
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(handler));
                }
        }
        if ((dirtyFlags & 0x1dL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (contact != null) {
                        // read contact.phone
                        phoneContact = contact.getPhone();
                    }
            }

                if (contact != null) {
                    // read contact.name
                    nameContact = contact.getName();
                }


                if (nameContact != null) {
                    // read contact.name.length()
                    nameContactLengthNam = nameContact.length();
                }


                // read contact.name.length() > 1
                NameContactLengthNam2 = (nameContactLengthNam) > (1);
                if((dirtyFlags & 0x1dL) != 0) {
                    if (NameContactLengthNam2) {
                        dirtyFlags |= 0x40L;
                    } else {
                        dirtyFlags |= 0x20L;
                    }}
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (contact != null) {
                    // read contact.phone
                    phoneContact = contact.getPhone();
                }


                if (phoneContact != null) {
                    // read contact.phone.length()
                    phoneContactLengthPh = phoneContact.length();
                }


                // read contact.phone.length() == 11
                PhoneContactLengthPh1 = (phoneContactLengthPh) == (11);
        }

        if ((dirtyFlags & 0x1dL) != 0) {

                // read contact.name.length() > 1 ? contact.phone.length() == 11 : false
                NameContactLengthNam1 = (NameContactLengthNam2) ? (PhoneContactLengthPh1) : (false);
        }
        // batch finished
        if ((dirtyFlags & 0x1dL) != 0) {
            // api target 1

            this.btnAdd.setEnabled(NameContactLengthNam1);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(androidViewViewOnCli);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editName, nameContact);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editName, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editNameandroidTextA);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPhone, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPhoneandroidText);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editPhone, phoneContact);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.connorlin.databinding.handler.DemoHandler value;
        public OnClickListenerImpl setValue(com.connorlin.databinding.handler.DemoHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static DemoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DemoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<DemoBinding>inflate(inflater, com.connorlin.databinding.R.layout.activity_demo, root, attachToRoot, bindingComponent);
    }
    public static DemoBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DemoBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.connorlin.databinding.R.layout.activity_demo, null, false), bindingComponent);
    }
    public static DemoBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DemoBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_demo_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new DemoBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): contact
        flag 1 (0x2L): handler
        flag 2 (0x3L): contact.name
        flag 3 (0x4L): contact.phone
        flag 4 (0x5L): null
        flag 5 (0x6L): contact.name.length() > 1 ? contact.phone.length() == 11 : false
        flag 6 (0x7L): contact.name.length() > 1 ? contact.phone.length() == 11 : false
    flag mapping end*/
    //end
}