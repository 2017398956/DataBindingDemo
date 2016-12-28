package com.connorlin.databinding.databinding;
import com.connorlin.databinding.R;
import com.connorlin.databinding.BR;
import android.view.View;
public class RecyclerItemBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.Button btnItem;
    private final android.widget.LinearLayout mboundView0;
    // variables
    private com.connorlin.databinding.model.RecyclerItem mItem;
    private com.connorlin.databinding.handler.Presenter mPresenter;
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds);
        this.btnItem = (android.widget.Button) bindings[1];
        this.btnItem.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            case BR.item :
                setItem((com.connorlin.databinding.model.RecyclerItem) variable);
                return true;
            case BR.presenter :
                setPresenter((com.connorlin.databinding.handler.Presenter) variable);
                return true;
        }
        return false;
    }

    public void setItem(com.connorlin.databinding.model.RecyclerItem item) {
        this.mItem = item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public com.connorlin.databinding.model.RecyclerItem getItem() {
        return mItem;
    }
    public void setPresenter(com.connorlin.databinding.handler.Presenter presenter) {
        this.mPresenter = presenter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.presenter);
        super.requestRebind();
    }
    public com.connorlin.databinding.handler.Presenter getPresenter() {
        return mPresenter;
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
        com.connorlin.databinding.model.RecyclerItem item = mItem;
        java.lang.String typeItem = null;
        com.connorlin.databinding.handler.Presenter presenter = mPresenter;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.type
                    typeItem = item.getType();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.btnItem, typeItem);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnItem.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.connorlin.databinding.model.RecyclerItem item = mItem;
        // presenter
        com.connorlin.databinding.handler.Presenter presenter = mPresenter;
        // presenter != null
        boolean presenterObjectnull = false;



        presenterObjectnull = (presenter) != (null);
        if (presenterObjectnull) {




            presenter.onTypeClick(getRoot().getContext(), item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static RecyclerItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static RecyclerItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<RecyclerItemBinding>inflate(inflater, com.connorlin.databinding.R.layout.recycler_item, root, attachToRoot, bindingComponent);
    }
    public static RecyclerItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static RecyclerItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.connorlin.databinding.R.layout.recycler_item, null, false), bindingComponent);
    }
    public static RecyclerItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static RecyclerItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/recycler_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new RecyclerItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): presenter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}