
package android.databinding;
import com.example.lenovo.beatbox.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 26;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.example.lenovo.beatbox.R.layout.fragment_beat_box:
                    return com.example.lenovo.beatbox.databinding.FragmentBeatBoxBinding.bind(view, bindingComponent);
                case com.example.lenovo.beatbox.R.layout.list_itme_sound:
                    return com.example.lenovo.beatbox.databinding.ListItmeSoundBinding.bind(view, bindingComponent);
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
            case 1112774621: {
                if(tag.equals("layout/fragment_beat_box_0")) {
                    return com.example.lenovo.beatbox.R.layout.fragment_beat_box;
                }
                break;
            }
            case -1729548512: {
                if(tag.equals("layout/list_itme_sound_0")) {
                    return com.example.lenovo.beatbox.R.layout.list_itme_sound;
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
            ,"title"
            ,"viewModel"};
    }
}