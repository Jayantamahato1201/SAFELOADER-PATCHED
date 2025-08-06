package b0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b0.j  reason: case insensitive filesystem */
public final class C0086j extends M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0088l f1716a;

    public C0086j(C0088l lVar) {
        this.f1716a = lVar;
    }

    public final void b(RecyclerView recyclerView, int i2, int i3) {
        boolean z2;
        boolean z3;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0088l lVar = this.f1716a;
        int computeVerticalScrollRange = lVar.f1737s.computeVerticalScrollRange();
        int i4 = lVar.f1736r;
        int i5 = computeVerticalScrollRange - i4;
        int i6 = lVar.f1721a;
        if (i5 <= 0 || i4 < i6) {
            z2 = false;
        } else {
            z2 = true;
        }
        lVar.f1738t = z2;
        int computeHorizontalScrollRange = lVar.f1737s.computeHorizontalScrollRange();
        int i7 = lVar.f1735q;
        if (computeHorizontalScrollRange - i7 <= 0 || i7 < i6) {
            z3 = false;
        } else {
            z3 = true;
        }
        lVar.f1739u = z3;
        boolean z4 = lVar.f1738t;
        if (z4 || z3) {
            if (z4) {
                float f = (float) i4;
                lVar.f1730l = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                lVar.f1729k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
            }
            if (lVar.f1739u) {
                float f2 = (float) computeHorizontalScrollOffset;
                float f3 = (float) i7;
                lVar.f1733o = (int) ((((f3 / 2.0f) + f2) * f3) / ((float) computeHorizontalScrollRange));
                lVar.f1732n = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
            }
            int i8 = lVar.f1740v;
            if (i8 == 0 || i8 == 1) {
                lVar.f(1);
            }
        } else if (lVar.f1740v != 0) {
            lVar.f(0);
        }
    }
}
