package b0;

import android.view.View;
import androidx.emoji2.text.g;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b0.z  reason: case insensitive filesystem */
public final class C0101z extends L {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f1802a;
    public final b0 b = new b0(this);

    /* renamed from: c  reason: collision with root package name */
    public C0099x f1803c;

    /* renamed from: d  reason: collision with root package name */
    public C0099x f1804d;

    public static int b(View view, g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(J j2, g gVar) {
        int v2 = j2.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l2 = (gVar.l() / 2) + gVar.k();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < v2; i3++) {
            View u2 = j2.u(i3);
            int abs = Math.abs(((gVar.c(u2) / 2) + gVar.e(u2)) - l2);
            if (abs < i2) {
                view = u2;
                i2 = abs;
            }
        }
        return view;
    }

    public final int[] a(J j2, View view) {
        int[] iArr = new int[2];
        if (j2.d()) {
            iArr[0] = b(view, d(j2));
        } else {
            iArr[0] = 0;
        }
        if (j2.e()) {
            iArr[1] = b(view, e(j2));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final g d(J j2) {
        C0099x xVar = this.f1804d;
        if (xVar == null || ((J) xVar.b) != j2) {
            this.f1804d = new C0099x(j2, 0);
        }
        return this.f1804d;
    }

    public final g e(J j2) {
        C0099x xVar = this.f1803c;
        if (xVar == null || ((J) xVar.b) != j2) {
            this.f1803c = new C0099x(j2, 1);
        }
        return this.f1803c;
    }

    public final void f() {
        J layoutManager;
        View view;
        RecyclerView recyclerView = this.f1802a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.d()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a2 = a(layoutManager, view);
                int i2 = a2[0];
                if (i2 != 0 || a2[1] != 0) {
                    this.f1802a.Z(i2, a2[1], false);
                }
            }
        }
    }
}
