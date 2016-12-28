package com.connorlin.databinding.databinding;
import com.connorlin.databinding.R;
import com.connorlin.databinding.BR;
import android.view.View;
public class ActivityEventBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnCheckedChangeListener.Listener, android.databinding.generated.callback.OnClickListener.Listener {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.Button mboundView1;
    private final android.widget.Button mboundView2;
    private final android.widget.Button mboundView3;
    private final android.widget.CheckBox mboundView4;
    // variables
    private com.connorlin.databinding.task.Task mTask;
    private com.connorlin.databinding.handler.EventHandler mHandler;
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback3;
    private final android.view.View.OnClickListener mCallback2;
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    // Inverse Binding Event Handlers

    public ActivityEventBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.CheckBox) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new android.databinding.generated.callback.OnCheckedChangeListener(this, 3);
        mCallback2 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            case BR.task :
                setTask((com.connorlin.databinding.task.Task) variable);
                return true;
            case BR.handler :
                setHandler((com.connorlin.databinding.handler.EventHandler) variable);
                return true;
        }
        return false;
    }

    public void setTask(com.connorlin.databinding.task.Task task) {
        this.mTask = task;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.task);
        super.requestRebind();
    }
    public com.connorlin.databinding.task.Task getTask() {
        return mTask;
    }
    public void setHandler(com.connorlin.databinding.handler.EventHandler handler) {
        this.mHandler = handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public com.connorlin.databinding.handler.EventHandler getHandler() {
        return mHandler;
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
        com.connorlin.databinding.task.Task task = mTask;
        com.connorlin.databinding.handler.EventHandler handler = mHandler;
        android.view.View.OnClickListener androidViewViewOnCli = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (handler != null) {
                    // read handler::onClickFriend
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(handler));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(androidViewViewOnCli);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback1);
            this.mboundView3.setOnClickListener(mCallback2);
            android.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView4, mCallback3, (android.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.connorlin.databinding.handler.EventHandler value;
        public OnClickListenerImpl setValue(com.connorlin.databinding.handler.EventHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickFriend(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // handler != null
        boolean handlerObjectnull = false;
        // task
        com.connorlin.databinding.task.Task task = mTask;
        // handler
        com.connorlin.databinding.handler.EventHandler handler = mHandler;



        handlerObjectnull = (handler) != (null);
        if (handlerObjectnull) {




            handler.onCompletedChanged(task, callbackArg_1);
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler != null
                boolean handlerObjectnull = false;
                // task
                com.connorlin.databinding.task.Task task = mTask;
                // handler
                com.connorlin.databinding.handler.EventHandler handler = mHandler;



                handlerObjectnull = (handler) != (null);
                if (handlerObjectnull) {




                    handler.onTaskClickWithParams(callbackArg_0, task);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler != null
                boolean handlerObjectnull = false;
                // task
                com.connorlin.databinding.task.Task task = mTask;
                // handler
                com.connorlin.databinding.handler.EventHandler handler = mHandler;



                handlerObjectnull = (handler) != (null);
                if (handlerObjectnull) {



                    handler.onTaskClick(task);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityEventBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityEventBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityEventBinding>inflate(inflater, com.connorlin.databinding.R.layout.activity_event, root, attachToRoot, bindingComponent);
    }
    public static ActivityEventBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityEventBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.connorlin.databinding.R.layout.activity_event, null, false), bindingComponent);
    }
    public static ActivityEventBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityEventBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_event_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityEventBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): task
        flag 1 (0x2L): handler
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}