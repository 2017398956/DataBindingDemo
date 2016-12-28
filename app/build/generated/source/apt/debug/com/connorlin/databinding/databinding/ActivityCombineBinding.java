package com.connorlin.databinding.databinding;
import com.connorlin.databinding.R;
import com.connorlin.databinding.BR;
import android.view.View;
public class ActivityCombineBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(14);
        sIncludes.setIncludes(0, 
            new String[] {"include"},
            new int[] {13},
            new int[] {R.layout.include});
        sViewsWithIds = null;
    }
    // views
    private final android.widget.LinearLayout mboundView0;
    private final com.connorlin.databinding.databinding.IncludeBinding mboundView01;
    private final android.widget.TextView mboundView1;
    private final android.widget.TextView mboundView10;
    private final android.widget.TextView mboundView11;
    private final android.widget.TextView mboundView12;
    private final android.widget.TextView mboundView2;
    private final android.widget.TextView mboundView3;
    private final android.widget.TextView mboundView4;
    private final android.widget.TextView mboundView5;
    private final android.widget.TextView mboundView6;
    private final android.widget.TextView mboundView7;
    private final android.widget.TextView mboundView8;
    private final android.widget.TextView mboundView9;
    // variables
    private com.connorlin.databinding.handler.ContextHandler mHandler;
    private int mNum;
    private java.util.Map<java.lang.String,java.lang.String> mMap;
    private com.connorlin.databinding.model.User mUser;
    private java.util.List<com.connorlin.databinding.model.User> mUserList;
    private java.lang.String mTest;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCombineBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.connorlin.databinding.databinding.IncludeBinding) bindings[13];
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
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
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        mboundView01.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.handler :
                setHandler((com.connorlin.databinding.handler.ContextHandler) variable);
                return true;
            case BR.num :
                setNum((int) variable);
                return true;
            case BR.map :
                setMap((java.util.Map<java.lang.String,java.lang.String>) variable);
                return true;
            case BR.user :
                setUser((com.connorlin.databinding.model.User) variable);
                return true;
            case BR.userList :
                setUserList((java.util.List<com.connorlin.databinding.model.User>) variable);
                return true;
            case BR.test :
                setTest((java.lang.String) variable);
                return true;
        }
        return false;
    }

    public void setHandler(com.connorlin.databinding.handler.ContextHandler handler) {
        this.mHandler = handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public com.connorlin.databinding.handler.ContextHandler getHandler() {
        return mHandler;
    }
    public void setNum(int num) {
        this.mNum = num;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.num);
        super.requestRebind();
    }
    public int getNum() {
        return mNum;
    }
    public void setMap(java.util.Map<java.lang.String,java.lang.String> map) {
        this.mMap = map;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.map);
        super.requestRebind();
    }
    public java.util.Map<java.lang.String,java.lang.String> getMap() {
        return mMap;
    }
    public void setUser(com.connorlin.databinding.model.User user) {
        this.mUser = user;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public com.connorlin.databinding.model.User getUser() {
        return mUser;
    }
    public void setUserList(java.util.List<com.connorlin.databinding.model.User> userList) {
        this.mUserList = userList;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.userList);
        super.requestRebind();
    }
    public java.util.List<com.connorlin.databinding.model.User> getUserList() {
        return mUserList;
    }
    public void setTest(java.lang.String test) {
        this.mTest = test;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.test);
        super.requestRebind();
    }
    public java.lang.String getTest() {
        return mTest;
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
        java.lang.String firstNameUser = null;
        java.lang.String androidStringFullnam = null;
        java.lang.String handlerLoadStringHan = null;
        java.lang.String androidStringLastnam = null;
        java.lang.String lastNameUserObjectnu = null;
        java.lang.String mapString2 = null;
        java.lang.String fullNameUser = null;
        com.connorlin.databinding.model.User userListNum = null;
        com.connorlin.databinding.handler.ContextHandler handler = mHandler;
        java.lang.String myStringUtilsCapital = null;
        int num = mNum;
        java.lang.String lastNameUser = null;
        java.util.Map<java.lang.String,java.lang.String> map = mMap;
        com.connorlin.databinding.model.User user = mUser;
        java.util.List<com.connorlin.databinding.model.User> userList = mUserList;
        java.lang.String test = mTest;
        java.lang.String userListNumToStringU = null;
        int ageUser = 0;
        java.lang.String stringValueOfStringA = null;
        java.lang.String stringAgeStringValue = null;
        int isAdultUserVISIBLEVi = 0;
        boolean isAdultUser = false;
        java.lang.String androidStringFirstna = null;
        java.lang.String androidPluralsSample = null;
        boolean LastNameUserObjectnu1 = false;

        if ((dirtyFlags & 0x41L) != 0) {



                if (handler != null) {
                    // read handler.loadString(context)
                    handlerLoadStringHan = handler.loadString(getRoot().getContext());
                }
        }
        if ((dirtyFlags & 0x52L) != 0) {


            if ((dirtyFlags & 0x42L) != 0) {

                    // read @android:plurals/sample_plurals
                    androidPluralsSample = mboundView11.getResources().getQuantityString(R.plurals.sample_plurals, num);
            }

                if (userList != null) {
                    // read userList[num]
                    userListNum = getFromList(userList, num);
                }


                if (userListNum != null) {
                    // read userList[num].toString()
                    userListNumToStringU = userListNum.toString();
                }
        }
        if ((dirtyFlags & 0x44L) != 0) {



                if (map != null) {
                    // read map["2"]
                    mapString2 = map.get("2");
                }
        }
        if ((dirtyFlags & 0x48L) != 0) {



                if (user != null) {
                    // read user.firstName
                    firstNameUser = user.getFirstName();
                    // read user.fullName
                    fullNameUser = user.getFullName();
                    // read user.lastName
                    lastNameUser = user.getLastName();
                    // read user.age
                    ageUser = user.getAge();
                    // read user.isAdult
                    isAdultUser = user.isAdult();
                }
                if((dirtyFlags & 0x48L) != 0) {
                    if (isAdultUser) {
                        dirtyFlags |= 0x400L;
                    } else {
                        dirtyFlags |= 0x200L;
                    }}


                // read MyStringUtils.capitalize(user.firstName)
                myStringUtilsCapital = com.connorlin.databinding.utils.MyStringUtils.capitalize(firstNameUser);
                // read @android:string/fullname
                androidStringFullnam = mboundView5.getResources().getString(R.string.fullname, fullNameUser);
                // read user.lastName == null
                LastNameUserObjectnu1 = (lastNameUser) == (null);
                // read String.valueOf(user.age)
                stringValueOfStringA = java.lang.String.valueOf(ageUser);
                // read user.isAdult ? View.VISIBLE : View.GONE
                isAdultUserVISIBLEVi = (isAdultUser) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
                if((dirtyFlags & 0x48L) != 0) {
                    if (LastNameUserObjectnu1) {
                        dirtyFlags |= 0x100L;
                    } else {
                        dirtyFlags |= 0x80L;
                    }}


                // read @android:string/firstname
                androidStringFirstna = mboundView3.getResources().getString(R.string.firstname, myStringUtilsCapital);
                // read ("Age :") + (String.valueOf(user.age))
                stringAgeStringValue = ("Age :") + (stringValueOfStringA);
        }
        if ((dirtyFlags & 0x60L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x48L) != 0) {

                // read user.lastName == null ? "Default LastName" : user.lastName
                lastNameUserObjectnu = (LastNameUserObjectnu1) ? ("Default LastName") : (lastNameUser);


                // read @android:string/lastname
                androidStringLastnam = mboundView4.getResources().getString(R.string.lastname, lastNameUserObjectnu);
        }
        // batch finished
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            this.mboundView01.setUser(user);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, firstNameUser);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, lastNameUser);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, androidStringFirstna);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, androidStringLastnam);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, androidStringFullnam);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, stringAgeStringValue);
            this.mboundView7.setVisibility(isAdultUserVISIBLEVi);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, test);
        }
        if ((dirtyFlags & 0x42L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, androidPluralsSample);
        }
        if ((dirtyFlags & 0x41L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, handlerLoadStringHan);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, userListNumToStringU);
        }
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, mapString2);
        }
        mboundView01.executePendingBindings();
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityCombineBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityCombineBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityCombineBinding>inflate(inflater, com.connorlin.databinding.R.layout.activity_combine, root, attachToRoot, bindingComponent);
    }
    public static ActivityCombineBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityCombineBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.connorlin.databinding.R.layout.activity_combine, null, false), bindingComponent);
    }
    public static ActivityCombineBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityCombineBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_combine_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityCombineBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): num
        flag 2 (0x3L): map
        flag 3 (0x4L): user
        flag 4 (0x5L): userList
        flag 5 (0x6L): test
        flag 6 (0x7L): null
        flag 7 (0x8L): user.lastName == null ? "Default LastName" : user.lastName
        flag 8 (0x9L): user.lastName == null ? "Default LastName" : user.lastName
        flag 9 (0xaL): user.isAdult ? View.VISIBLE : View.GONE
        flag 10 (0xbL): user.isAdult ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}