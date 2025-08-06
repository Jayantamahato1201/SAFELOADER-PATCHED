package I;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.cheatbox.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class N {

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f390d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f391a;
    public SparseArray b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f392c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f391a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a2 = a(viewGroup.getChildAt(childCount));
                if (a2 != null) {
                    return a2;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.MT_Bin);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
