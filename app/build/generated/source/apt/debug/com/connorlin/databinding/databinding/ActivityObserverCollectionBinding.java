package com.connorlin.databinding.databinding;
import com.connorlin.databinding.R;
import com.connorlin.databinding.BR;
import android.view.View;
public class ActivityObserverCollectionBinding extends android.databinding.ViewDataBinding  {

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
    private final android.widget.TextView mboundView3;
    private final android.widget.TextView mboundView4;
    private final android.widget.TextView mboundView5;
    private final android.widget.TextView mboundView6;
    // variables
    private android.databinding.ObservableMap<java.lang.String,java.lang.String> mUser;
    private android.databinding.ObservableList<java.lang.String> mUserList;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityObserverCollectionBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
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
                setUser((android.databinding.ObservableMap<java.lang.String,java.lang.String>) variable);
                return true;
            case BR.userList :
                setUserList((android.databinding.ObservableList<java.lang.String>) variable);
                return true;
        }
        return false;
    }

    public void setUser(android.databinding.ObservableMap<java.lang.String,java.lang.String> user) {
        updateRegistration(0, user);
        this.mUser = user;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public android.databinding.ObservableMap<java.lang.String,java.lang.String> getUser() {
        return mUser;
    }
    public void setUserList(android.databinding.ObservableList<java.lang.String> userList) {
        updateRegistration(1, userList);
        this.mUserList = userList;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.userList);
        super.requestRebind();
    }
    public android.databinding.ObservableList<java.lang.String> getUserList() {
        return mUserList;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUser((android.databinding.ObservableMap<java.lang.String,java.lang.String>) object, fieldId);
            case 1 :
                return onChangeUserList((android.databinding.ObservableList<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUser(android.databinding.ObservableMap<java.lang.String,java.lang.String> user, int fieldId) {
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
    private boolean onChangeUserList(android.databinding.ObservableList<java.lang.String> userList, int fieldId) {
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
        java.lang.String userStringFirstName = null;
        java.lang.String userListInt2 = null;
        java.lang.String userStringLastName = null;
        java.lang.String userStringAge = null;
        java.lang.String userListInt1 = null;
        java.lang.String userListInt0 = null;
        android.databinding.ObservableMap<java.lang.String,java.lang.String> user = mUser;
        android.databinding.ObservableList<java.lang.String> userList = mUserList;

        if ((dirtyFlags & 0x5L) != 0) {



                if (user != null) {
                    // read user["firstName"]
                    userStringFirstName = user.get("firstName");
                    // read user["lastName"]
                    userStringLastName = user.get("lastName");
                    // read user["age"]
                    userStringAge = user.get("age");
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (userList != null) {
                    // read userList[2]
                    userListInt2 = getFromList(userList, 2);
                    // read userList[1]
                    userListInt1 = getFromList(userList, 1);
                    // read userList[0]
                    userListInt0 = getFromList(userList, 0);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, userStringFirstName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, userStringLastName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, userStringAge);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, userListInt0);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, userListInt1);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, userListInt2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityObserverCollectionBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityObserverCollectionBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityObserverCollectionBinding>inflate(inflater, com.connorlin.databinding.R.layout.activity_observer_collection, root, attachToRoot, bindingComponent);
    }
    public static ActivityObserverCollectionBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityObserverCollectionBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.connorlin.databinding.R.layout.activity_observer_collection, null, false), bindingComponent);
    }
    public static ActivityObserverCollectionBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityObserverCollectionBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_observer_collection_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityObserverCollectionBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): userList
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}