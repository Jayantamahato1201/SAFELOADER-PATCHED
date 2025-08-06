package b0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1688a = new ArrayList();
    public int b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f1689c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f1690d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final int f1691e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public g0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f = staggeredGridLayoutManager;
        this.f1691e = i2;
    }

    public final void a() {
        ArrayList arrayList = this.f1688a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.f1689c = this.f.f1557r.b(view);
        ((d0) view.getLayoutParams()).getClass();
    }

    public final void b() {
        this.f1688a.clear();
        this.b = Integer.MIN_VALUE;
        this.f1689c = Integer.MIN_VALUE;
        this.f1690d = 0;
    }

    public final int c() {
        boolean z2 = this.f.f1562w;
        ArrayList arrayList = this.f1688a;
        if (z2) {
            return e(arrayList.size() - 1, -1);
        }
        return e(0, arrayList.size());
    }

    public final int d() {
        boolean z2 = this.f.f1562w;
        ArrayList arrayList = this.f1688a;
        if (z2) {
            return e(0, arrayList.size());
        }
        return e(arrayList.size() - 1, -1);
    }

    public final int e(int i2, int i3) {
        int i4;
        boolean z2;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int k2 = staggeredGridLayoutManager.f1557r.k();
        int g2 = staggeredGridLayoutManager.f1557r.g();
        if (i3 > i2) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        while (i2 != i3) {
            View view = (View) this.f1688a.get(i2);
            int e2 = staggeredGridLayoutManager.f1557r.e(view);
            int b2 = staggeredGridLayoutManager.f1557r.b(view);
            boolean z3 = false;
            if (e2 <= g2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (b2 >= k2) {
                z3 = true;
            }
            if (z2 && z3 && (e2 < k2 || b2 > g2)) {
                return J.H(view);
            }
            i2 += i4;
        }
        return -1;
    }

    public final int f(int i2) {
        int i3 = this.f1689c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f1688a.size() == 0) {
            return i2;
        }
        a();
        return this.f1689c;
    }

    public final View g(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        ArrayList arrayList = this.f1688a;
        View view = null;
        if (i3 == -1) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                View view2 = (View) arrayList.get(i4);
                if ((staggeredGridLayoutManager.f1562w && J.H(view2) <= i2) || ((!staggeredGridLayoutManager.f1562w && J.H(view2) >= i2) || !view2.hasFocusable())) {
                    break;
                }
                i4++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.f1562w && J.H(view3) >= i2) || ((!staggeredGridLayoutManager.f1562w && J.H(view3) <= i2) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public final int h(int i2) {
        int i3 = this.b;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f1688a.size() == 0) {
            return i2;
        }
        View view = (View) this.f1688a.get(0);
        this.b = this.f.f1557r.e(view);
        ((d0) view.getLayoutParams()).getClass();
        return this.b;
    }
}
