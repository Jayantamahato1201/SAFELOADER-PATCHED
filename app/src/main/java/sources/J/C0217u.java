package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: j.u  reason: case insensitive filesystem */
public abstract class C0217u implements C0194D, z, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Rect f3162a;

    public static int m(ListAdapter listAdapter, Context context, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    public static boolean u(C0209m mVar) {
        int size = mVar.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = mVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(C0211o oVar) {
        return false;
    }

    public final boolean h(C0211o oVar) {
        return false;
    }

    public abstract void l(C0209m mVar);

    public abstract void n(View view);

    public abstract void o(boolean z2);

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        C0206j jVar;
        int i3;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            jVar = (C0206j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            jVar = (C0206j) listAdapter;
        }
        C0209m mVar = jVar.f3099a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i2);
        if (!(this instanceof C0203g)) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        mVar.q(menuItem, this, i3);
    }

    public abstract void p(int i2);

    public abstract void q(int i2);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z2);

    public abstract void t(int i2);

    public final void c(Context context, C0209m mVar) {
    }
}
