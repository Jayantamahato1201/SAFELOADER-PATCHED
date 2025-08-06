package b0;

import android.view.View;
import java.util.List;

/* renamed from: b0.u  reason: case insensitive filesystem */
public final class C0096u {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1773a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f1774c;

    /* renamed from: d  reason: collision with root package name */
    public int f1775d;

    /* renamed from: e  reason: collision with root package name */
    public int f1776e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f1777g;

    /* renamed from: h  reason: collision with root package name */
    public int f1778h;

    /* renamed from: i  reason: collision with root package name */
    public int f1779i;

    /* renamed from: j  reason: collision with root package name */
    public int f1780j;

    /* renamed from: k  reason: collision with root package name */
    public List f1781k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1782l;

    public final void a(View view) {
        int b2;
        int size = this.f1781k.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = ((Y) this.f1781k.get(i3)).f1628a;
            K k2 = (K) view3.getLayoutParams();
            if (view3 != view && !k2.f1590a.h() && (b2 = (k2.f1590a.b() - this.f1775d) * this.f1776e) >= 0 && b2 < i2) {
                view2 = view3;
                if (b2 == 0) {
                    break;
                }
                i2 = b2;
            }
        }
        if (view2 == null) {
            this.f1775d = -1;
        } else {
            this.f1775d = ((K) view2.getLayoutParams()).f1590a.b();
        }
    }

    public final View b(P p2) {
        List list = this.f1781k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((Y) this.f1781k.get(i2)).f1628a;
                K k2 = (K) view.getLayoutParams();
                if (!k2.f1590a.h() && this.f1775d == k2.f1590a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = p2.i(this.f1775d, Long.MAX_VALUE).f1628a;
        this.f1775d += this.f1776e;
        return view2;
    }
}
