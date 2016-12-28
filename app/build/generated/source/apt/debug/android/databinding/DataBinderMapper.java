
package android.databinding;
import com.connorlin.databinding.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 17;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.connorlin.databinding.R.layout.activity_event:
                    return com.connorlin.databinding.databinding.ActivityEventBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.include:
                    return com.connorlin.databinding.databinding.IncludeBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.recycler_item:
                    return com.connorlin.databinding.databinding.RecyclerItemBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.activity_demo:
                    return com.connorlin.databinding.DemoBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.activity_view_stub:
                    return com.connorlin.databinding.databinding.ActivityViewStubBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.activity_observer_collection:
                    return com.connorlin.databinding.databinding.ActivityObserverCollectionBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.activity_observer:
                    return com.connorlin.databinding.databinding.ActivityObserverBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.activity_two_way:
                    return com.connorlin.databinding.TwoWayBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.activity_observer_field:
                    return com.connorlin.databinding.databinding.ActivityObserverFieldBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.list_item:
                    return com.connorlin.databinding.databinding.ListItemBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.activity_attribute_setters:
                    return com.connorlin.databinding.databinding.ActivityAttributeSettersBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.activity_main:
                    return com.connorlin.databinding.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.activity_combine:
                    return com.connorlin.databinding.databinding.ActivityCombineBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.activity_normal_object:
                    return com.connorlin.databinding.databinding.ActivityNormalObjectBinding.bind(view, bindingComponent);
                case com.connorlin.databinding.R.layout.activity_converters:
                    return com.connorlin.databinding.databinding.ActivityConvertersBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -1956078880: {
                if(tag.equals("layout/activity_event_0")) {
                    return com.connorlin.databinding.R.layout.activity_event;
                }
                break;
            }
            case -563795532: {
                if(tag.equals("layout/include_0")) {
                    return com.connorlin.databinding.R.layout.include;
                }
                break;
            }
            case -1142597345: {
                if(tag.equals("layout/recycler_item_0")) {
                    return com.connorlin.databinding.R.layout.recycler_item;
                }
                break;
            }
            case 169904927: {
                if(tag.equals("layout/activity_demo_0")) {
                    return com.connorlin.databinding.R.layout.activity_demo;
                }
                break;
            }
            case 259184718: {
                if(tag.equals("layout/activity_view_stub_0")) {
                    return com.connorlin.databinding.R.layout.activity_view_stub;
                }
                break;
            }
            case -2064564243: {
                if(tag.equals("layout/activity_observer_collection_0")) {
                    return com.connorlin.databinding.R.layout.activity_observer_collection;
                }
                break;
            }
            case -407809582: {
                if(tag.equals("layout/activity_observer_0")) {
                    return com.connorlin.databinding.R.layout.activity_observer;
                }
                break;
            }
            case 1663237378: {
                if(tag.equals("layout/activity_two_way_0")) {
                    return com.connorlin.databinding.R.layout.activity_two_way;
                }
                break;
            }
            case -1106483635: {
                if(tag.equals("layout/activity_observer_field_0")) {
                    return com.connorlin.databinding.R.layout.activity_observer_field;
                }
                break;
            }
            case -739838624: {
                if(tag.equals("layout/list_item_0")) {
                    return com.connorlin.databinding.R.layout.list_item;
                }
                break;
            }
            case 58383415: {
                if(tag.equals("layout/activity_attribute_setters_0")) {
                    return com.connorlin.databinding.R.layout.activity_attribute_setters;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.connorlin.databinding.R.layout.activity_main;
                }
                break;
            }
            case -434069755: {
                if(tag.equals("layout/activity_combine_0")) {
                    return com.connorlin.databinding.R.layout.activity_combine;
                }
                break;
            }
            case 862083485: {
                if(tag.equals("layout/activity_normal_object_0")) {
                    return com.connorlin.databinding.R.layout.activity_normal_object;
                }
                break;
            }
            case 99391439: {
                if(tag.equals("layout/activity_converters_0")) {
                    return com.connorlin.databinding.R.layout.activity_converters;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"contact"
            ,"handler"
            ,"isError"
            ,"item"
            ,"list"
            ,"map"
            ,"name"
            ,"num"
            ,"phone"
            ,"presenter"
            ,"task"
            ,"test"
            ,"url"
            ,"user"
            ,"userList"};
    }
}