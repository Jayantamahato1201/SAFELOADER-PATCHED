package com.google.android.material.carousel;

import A.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0100y;
import b0.J;
import b0.K;
import b0.P;
import b0.U;
import b0.V;
import com.cheatbox.R;
import j0.C0219a;
import q0.C0309a;
import q0.C0310b;
import q0.C0311c;
import q0.C0313e;

public class CarouselLayoutManager extends J implements U {

    /* renamed from: p  reason: collision with root package name */
    public final C0313e f1923p;

    /* renamed from: q  reason: collision with root package name */
    public C0311c f1924q;

    /* renamed from: r  reason: collision with root package name */
    public final View.OnLayoutChangeListener f1925r;

    public CarouselLayoutManager() {
        C0313e eVar = new C0313e();
        new C0310b();
        this.f1925r = new C0309a(this);
        this.f1923p = eVar;
        l0();
        C0(0);
    }

    public final boolean A0() {
        if (this.f1924q.f3856a == 0) {
            return true;
        }
        return false;
    }

    public final boolean B0() {
        if (!A0() || C() != 1) {
            return false;
        }
        return true;
    }

    public final void C0(int i2) {
        C0311c cVar;
        if (i2 == 0 || i2 == 1) {
            c((String) null);
            C0311c cVar2 = this.f1924q;
            if (cVar2 == null || i2 != cVar2.f3856a) {
                if (i2 == 0) {
                    cVar = new C0311c(this, 1);
                } else if (i2 == 1) {
                    cVar = new C0311c(this, 0);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
                this.f1924q = cVar;
                l0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(g.f(i2, "invalid orientation:"));
    }

    public final boolean L() {
        return true;
    }

    public final void Q(RecyclerView recyclerView) {
        C0313e eVar = this.f1923p;
        Context context = recyclerView.getContext();
        float f = eVar.f3858a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.MT_Bin);
        }
        eVar.f3858a = f;
        float f2 = eVar.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.MT_Bin);
        }
        eVar.b = f2;
        l0();
        recyclerView.addOnLayoutChangeListener(this.f1925r);
    }

    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1925r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r6 == 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (B0() != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r6 == 1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (B0() != false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View S(android.view.View r4, int r5, b0.P r6, b0.V r7) {
        /*
            r3 = this;
            int r6 = r3.v()
            if (r6 != 0) goto L_0x0008
            goto L_0x0097
        L_0x0008:
            q0.c r6 = r3.f1924q
            int r6 = r6.f3856a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L_0x0047
            r2 = 2
            if (r5 == r2) goto L_0x003d
            r2 = 17
            if (r5 == r2) goto L_0x004c
            r2 = 33
            if (r5 == r2) goto L_0x0049
            r2 = 66
            if (r5 == r2) goto L_0x003f
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L_0x003b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L_0x0038:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0055
        L_0x003b:
            if (r6 != r1) goto L_0x0038
        L_0x003d:
            r5 = 1
            goto L_0x0055
        L_0x003f:
            if (r6 != 0) goto L_0x0038
            boolean r5 = r3.B0()
            if (r5 == 0) goto L_0x003d
        L_0x0047:
            r5 = -1
            goto L_0x0055
        L_0x0049:
            if (r6 != r1) goto L_0x0038
            goto L_0x0047
        L_0x004c:
            if (r6 != 0) goto L_0x0038
            boolean r5 = r3.B0()
            if (r5 == 0) goto L_0x0047
            goto L_0x003d
        L_0x0055:
            if (r5 != r7) goto L_0x0058
            goto L_0x0097
        L_0x0058:
            r6 = 0
            if (r5 != r0) goto L_0x008c
            int r4 = b0.J.H(r4)
            if (r4 != 0) goto L_0x0062
            goto L_0x0097
        L_0x0062:
            android.view.View r4 = r3.u(r6)
            int r4 = b0.J.H(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L_0x007b
            int r5 = r3.B()
            if (r4 < r5) goto L_0x0074
            goto L_0x007b
        L_0x0074:
            q0.c r4 = r3.f1924q
            r4.a()
            r4 = 0
            throw r4
        L_0x007b:
            boolean r4 = r3.B0()
            if (r4 == 0) goto L_0x0087
            int r4 = r3.v()
            int r6 = r4 + -1
        L_0x0087:
            android.view.View r4 = r3.u(r6)
            return r4
        L_0x008c:
            int r4 = b0.J.H(r4)
            int r5 = r3.B()
            int r5 = r5 - r1
            if (r4 != r5) goto L_0x0099
        L_0x0097:
            r4 = 0
            return r4
        L_0x0099:
            int r4 = r3.v()
            int r4 = r4 - r1
            android.view.View r4 = r3.u(r4)
            int r4 = b0.J.H(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto L_0x00b7
            int r5 = r3.B()
            if (r4 < r5) goto L_0x00b0
            goto L_0x00b7
        L_0x00b0:
            q0.c r4 = r3.f1924q
            r4.a()
            r4 = 0
            throw r4
        L_0x00b7:
            boolean r4 = r3.B0()
            if (r4 == 0) goto L_0x00be
            goto L_0x00c4
        L_0x00be:
            int r4 = r3.v()
            int r6 = r4 + -1
        L_0x00c4:
            android.view.View r4 = r3.u(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.S(android.view.View, int, b0.P, b0.V):android.view.View");
    }

    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(J.H(u(0)));
            accessibilityEvent.setToIndex(J.H(u(v() - 1)));
        }
    }

    public final void W(int i2, int i3) {
        B();
    }

    public final void Z(int i2, int i3) {
        B();
    }

    public final PointF a(int i2) {
        return null;
    }

    public final void b0(P p2, V v2) {
        int i2;
        if (v2.b() > 0) {
            if (A0()) {
                i2 = this.f1588n;
            } else {
                i2 = this.f1589o;
            }
            if (((float) i2) > 0.0f) {
                B0();
                View view = p2.i(0, Long.MAX_VALUE).f1628a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        g0(p2);
    }

    public final void c0(V v2) {
        if (v() != 0) {
            J.H(u(0));
        }
    }

    public final boolean d() {
        return A0();
    }

    public final boolean e() {
        return !A0();
    }

    public final int j(V v2) {
        v();
        return 0;
    }

    public final int k(V v2) {
        return 0;
    }

    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    public final int l(V v2) {
        return 0;
    }

    public final int m(V v2) {
        v();
        return 0;
    }

    public final int m0(int i2, P p2, V v2) {
        if (!A0() || v() == 0 || i2 == 0) {
            return 0;
        }
        View view = p2.i(0, Long.MAX_VALUE).f1628a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final int n(V v2) {
        return 0;
    }

    public final void n0(int i2) {
    }

    public final int o(V v2) {
        return 0;
    }

    public final int o0(int i2, P p2, V v2) {
        if (!e() || v() == 0 || i2 == 0) {
            return 0;
        }
        View view = p2.i(0, Long.MAX_VALUE).f1628a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final K r() {
        return new K(-2, -2);
    }

    public final void x0(RecyclerView recyclerView, int i2) {
        C0100y yVar = new C0100y(this, recyclerView.getContext(), 1);
        yVar.f1785a = i2;
        y0(yVar);
    }

    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (A0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        new C0310b();
        this.f1925r = new C0309a(this);
        this.f1923p = new C0313e();
        l0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0219a.b);
            obtainStyledAttributes.getInt(0, 0);
            l0();
            C0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
