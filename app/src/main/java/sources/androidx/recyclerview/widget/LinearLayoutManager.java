package androidx.recyclerview.widget;

import Q0.l;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.g;
import b0.C0090n;
import b0.C0094s;
import b0.C0095t;
import b0.C0096u;
import b0.C0097v;
import b0.C0098w;
import b0.I;
import b0.J;
import b0.K;
import b0.P;
import b0.U;
import b0.V;

public class LinearLayoutManager extends J implements U {

    /* renamed from: A  reason: collision with root package name */
    public final C0094s f1464A = new C0094s();

    /* renamed from: B  reason: collision with root package name */
    public final C0095t f1465B = new Object();

    /* renamed from: C  reason: collision with root package name */
    public final int f1466C = 2;
    public final int[] D = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public int f1467p = 1;

    /* renamed from: q  reason: collision with root package name */
    public C0096u f1468q;

    /* renamed from: r  reason: collision with root package name */
    public g f1469r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1470s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f1471t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1472u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1473v = false;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f1474w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f1475x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f1476y = Integer.MIN_VALUE;

    /* renamed from: z  reason: collision with root package name */
    public C0097v f1477z = null;

    /* JADX WARNING: type inference failed for: r2v1, types: [b0.t, java.lang.Object] */
    public LinearLayoutManager(int i2) {
        Z0(i2);
        c((String) null);
        if (this.f1471t) {
            this.f1471t = false;
            l0();
        }
    }

    public void A0(V v2, int[] iArr) {
        int i2;
        int i3;
        if (v2.f1609a != -1) {
            i2 = this.f1469r.l();
        } else {
            i2 = 0;
        }
        if (this.f1468q.f == -1) {
            i3 = 0;
        } else {
            i3 = i2;
            i2 = 0;
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public void B0(V v2, C0096u uVar, C0090n nVar) {
        int i2 = uVar.f1775d;
        if (i2 >= 0 && i2 < v2.b()) {
            nVar.a(i2, Math.max(0, uVar.f1777g));
        }
    }

    public final int C0(V v2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1469r;
        boolean z2 = !this.f1474w;
        return l.o(v2, gVar, J0(z2), I0(z2), this, this.f1474w);
    }

    public final int D0(V v2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1469r;
        boolean z2 = !this.f1474w;
        return l.p(v2, gVar, J0(z2), I0(z2), this, this.f1474w, this.f1472u);
    }

    public final int E0(V v2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1469r;
        boolean z2 = !this.f1474w;
        return l.q(v2, gVar, J0(z2), I0(z2), this, this.f1474w);
    }

    public final int F0(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 == 130 && this.f1467p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f1467p == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f1467p == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f1467p == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f1467p != 1 && S0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f1467p != 1 && S0()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [b0.u, java.lang.Object] */
    public final void G0() {
        if (this.f1468q == null) {
            ? obj = new Object();
            obj.f1773a = true;
            obj.f1778h = 0;
            obj.f1779i = 0;
            obj.f1781k = null;
            this.f1468q = obj;
        }
    }

    public final int H0(P p2, C0096u uVar, V v2, boolean z2) {
        int i2;
        int i3 = uVar.f1774c;
        int i4 = uVar.f1777g;
        if (i4 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                uVar.f1777g = i4 + i3;
            }
            V0(p2, uVar);
        }
        int i5 = uVar.f1774c + uVar.f1778h;
        while (true) {
            if ((!uVar.f1782l && i5 <= 0) || (i2 = uVar.f1775d) < 0 || i2 >= v2.b()) {
                break;
            }
            C0095t tVar = this.f1465B;
            tVar.f1771c = 0;
            tVar.f1770a = false;
            tVar.b = false;
            tVar.f1772d = false;
            T0(p2, v2, uVar, tVar);
            if (!tVar.f1770a) {
                int i6 = uVar.b;
                int i7 = tVar.f1771c;
                uVar.b = (uVar.f * i7) + i6;
                if (!tVar.b || uVar.f1781k != null || !v2.f1613g) {
                    uVar.f1774c -= i7;
                    i5 -= i7;
                }
                int i8 = uVar.f1777g;
                if (i8 != Integer.MIN_VALUE) {
                    int i9 = i8 + i7;
                    uVar.f1777g = i9;
                    int i10 = uVar.f1774c;
                    if (i10 < 0) {
                        uVar.f1777g = i9 + i10;
                    }
                    V0(p2, uVar);
                }
                if (z2 && tVar.f1772d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - uVar.f1774c;
    }

    public final View I0(boolean z2) {
        if (this.f1472u) {
            return M0(0, v(), z2);
        }
        return M0(v() - 1, -1, z2);
    }

    public final View J0(boolean z2) {
        if (this.f1472u) {
            return M0(v() - 1, -1, z2);
        }
        return M0(0, v(), z2);
    }

    public final int K0() {
        View M02 = M0(v() - 1, -1, false);
        if (M02 == null) {
            return -1;
        }
        return J.H(M02);
    }

    public final boolean L() {
        return true;
    }

    public final View L0(int i2, int i3) {
        int i4;
        int i5;
        G0();
        if (i3 <= i2 && i3 >= i2) {
            return u(i2);
        }
        if (this.f1469r.e(u(i2)) < this.f1469r.k()) {
            i5 = 16644;
            i4 = 16388;
        } else {
            i5 = 4161;
            i4 = 4097;
        }
        if (this.f1467p == 0) {
            return this.f1578c.u(i2, i3, i5, i4);
        }
        return this.f1579d.u(i2, i3, i5, i4);
    }

    public final View M0(int i2, int i3, boolean z2) {
        int i4;
        G0();
        if (z2) {
            i4 = 24579;
        } else {
            i4 = 320;
        }
        if (this.f1467p == 0) {
            return this.f1578c.u(i2, i3, i4, 320);
        }
        return this.f1579d.u(i2, i3, i4, 320);
    }

    public View N0(P p2, V v2, int i2, int i3, int i4) {
        int i5;
        G0();
        int k2 = this.f1469r.k();
        int g2 = this.f1469r.g();
        if (i3 > i2) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View u2 = u(i2);
            int H2 = J.H(u2);
            if (H2 >= 0 && H2 < i4) {
                if (((K) u2.getLayoutParams()).f1590a.h()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else if (this.f1469r.e(u2) < g2 && this.f1469r.b(u2) >= k2) {
                    return u2;
                } else {
                    if (view == null) {
                        view = u2;
                    }
                }
            }
            i2 += i5;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public final int O0(int i2, P p2, V v2, boolean z2) {
        int g2;
        int g3 = this.f1469r.g() - i2;
        if (g3 <= 0) {
            return 0;
        }
        int i3 = -Y0(-g3, p2, v2);
        int i4 = i2 + i3;
        if (!z2 || (g2 = this.f1469r.g() - i4) <= 0) {
            return i3;
        }
        this.f1469r.o(g2);
        return g2 + i3;
    }

    public final int P0(int i2, P p2, V v2, boolean z2) {
        int k2;
        int k3 = i2 - this.f1469r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i3 = -Y0(k3, p2, v2);
        int i4 = i2 + i3;
        if (!z2 || (k2 = i4 - this.f1469r.k()) <= 0) {
            return i3;
        }
        this.f1469r.o(-k2);
        return i3 - k2;
    }

    public final View Q0() {
        int i2;
        if (this.f1472u) {
            i2 = 0;
        } else {
            i2 = v() - 1;
        }
        return u(i2);
    }

    public final View R0() {
        int i2;
        if (this.f1472u) {
            i2 = v() - 1;
        } else {
            i2 = 0;
        }
        return u(i2);
    }

    public View S(View view, int i2, P p2, V v2) {
        int F02;
        View view2;
        View view3;
        X0();
        if (!(v() == 0 || (F02 = F0(i2)) == Integer.MIN_VALUE)) {
            G0();
            b1(F02, (int) (((float) this.f1469r.l()) * 0.33333334f), false, v2);
            C0096u uVar = this.f1468q;
            uVar.f1777g = Integer.MIN_VALUE;
            uVar.f1773a = false;
            H0(p2, uVar, v2, true);
            if (F02 == -1) {
                if (this.f1472u) {
                    view2 = L0(v() - 1, -1);
                } else {
                    view2 = L0(0, v());
                }
            } else if (this.f1472u) {
                view2 = L0(0, v());
            } else {
                view2 = L0(v() - 1, -1);
            }
            if (F02 == -1) {
                view3 = R0();
            } else {
                view3 = Q0();
            }
            if (!view3.hasFocusable()) {
                return view2;
            }
            if (view2 == null) {
                return null;
            }
            return view3;
        }
        return null;
    }

    public final boolean S0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    public final void T(AccessibilityEvent accessibilityEvent) {
        int i2;
        super.T(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(0, v(), false);
            if (M02 == null) {
                i2 = -1;
            } else {
                i2 = J.H(M02);
            }
            accessibilityEvent.setFromIndex(i2);
            accessibilityEvent.setToIndex(K0());
        }
    }

    public void T0(P p2, V v2, C0096u uVar, C0095t tVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        View b = uVar.b(p2);
        if (b == null) {
            tVar.f1770a = true;
            return;
        }
        K k2 = (K) b.getLayoutParams();
        if (uVar.f1781k == null) {
            boolean z4 = this.f1472u;
            if (uVar.f == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z4 == z3) {
                b(b, -1, false);
            } else {
                b(b, 0, false);
            }
        } else {
            boolean z5 = this.f1472u;
            if (uVar.f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z5 == z2) {
                b(b, -1, true);
            } else {
                b(b, 0, true);
            }
        }
        K k3 = (K) b.getLayoutParams();
        Rect J2 = this.b.J(b);
        int i6 = J2.left + J2.right;
        int i7 = J2.top + J2.bottom;
        int w2 = J.w(d(), this.f1588n, this.f1586l, F() + E() + k3.leftMargin + k3.rightMargin + i6, k3.width);
        int w3 = J.w(e(), this.f1589o, this.f1587m, D() + G() + k3.topMargin + k3.bottomMargin + i7, k3.height);
        if (u0(b, w2, w3, k3)) {
            b.measure(w2, w3);
        }
        tVar.f1771c = this.f1469r.c(b);
        if (this.f1467p == 1) {
            if (S0()) {
                i5 = this.f1588n - F();
                i4 = i5 - this.f1469r.d(b);
            } else {
                i4 = E();
                i5 = this.f1469r.d(b) + i4;
            }
            if (uVar.f == -1) {
                i2 = uVar.b;
                i3 = i2 - tVar.f1771c;
            } else {
                i3 = uVar.b;
                i2 = tVar.f1771c + i3;
            }
        } else {
            int G2 = G();
            int d2 = this.f1469r.d(b) + G2;
            if (uVar.f == -1) {
                int i8 = uVar.b;
                int i9 = i8 - tVar.f1771c;
                int i10 = G2;
                i5 = i8;
                i2 = d2;
                i4 = i9;
                i3 = i10;
            } else {
                int i11 = uVar.b;
                int i12 = tVar.f1771c + i11;
                int i13 = d2;
                i4 = i11;
                i2 = i13;
                int i14 = i12;
                i3 = G2;
                i5 = i14;
            }
        }
        J.N(b, i4, i3, i5, i2);
        if (k2.f1590a.h() || k2.f1590a.k()) {
            tVar.b = true;
        }
        tVar.f1772d = b.hasFocusable();
    }

    public final void V0(P p2, C0096u uVar) {
        if (uVar.f1773a && !uVar.f1782l) {
            int i2 = uVar.f1777g;
            int i3 = uVar.f1779i;
            if (uVar.f == -1) {
                int v2 = v();
                if (i2 >= 0) {
                    int f = (this.f1469r.f() - i2) + i3;
                    if (this.f1472u) {
                        for (int i4 = 0; i4 < v2; i4++) {
                            View u2 = u(i4);
                            if (this.f1469r.e(u2) < f || this.f1469r.n(u2) < f) {
                                W0(p2, 0, i4);
                                return;
                            }
                        }
                        return;
                    }
                    int i5 = v2 - 1;
                    for (int i6 = i5; i6 >= 0; i6--) {
                        View u3 = u(i6);
                        if (this.f1469r.e(u3) < f || this.f1469r.n(u3) < f) {
                            W0(p2, i5, i6);
                            return;
                        }
                    }
                }
            } else if (i2 >= 0) {
                int i7 = i2 - i3;
                int v3 = v();
                if (this.f1472u) {
                    int i8 = v3 - 1;
                    for (int i9 = i8; i9 >= 0; i9--) {
                        View u4 = u(i9);
                        if (this.f1469r.b(u4) > i7 || this.f1469r.m(u4) > i7) {
                            W0(p2, i8, i9);
                            return;
                        }
                    }
                    return;
                }
                for (int i10 = 0; i10 < v3; i10++) {
                    View u5 = u(i10);
                    if (this.f1469r.b(u5) > i7 || this.f1469r.m(u5) > i7) {
                        W0(p2, 0, i10);
                        return;
                    }
                }
            }
        }
    }

    public final void W0(P p2, int i2, int i3) {
        if (i2 != i3) {
            if (i3 > i2) {
                for (int i4 = i3 - 1; i4 >= i2; i4--) {
                    View u2 = u(i4);
                    j0(i4);
                    p2.f(u2);
                }
                return;
            }
            while (i2 > i3) {
                View u3 = u(i2);
                j0(i2);
                p2.f(u3);
                i2--;
            }
        }
    }

    public final void X0() {
        if (this.f1467p == 1 || !S0()) {
            this.f1472u = this.f1471t;
        } else {
            this.f1472u = !this.f1471t;
        }
    }

    public final int Y0(int i2, P p2, V v2) {
        int i3;
        if (!(v() == 0 || i2 == 0)) {
            G0();
            this.f1468q.f1773a = true;
            if (i2 > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int abs = Math.abs(i2);
            b1(i3, abs, true, v2);
            C0096u uVar = this.f1468q;
            int H02 = H0(p2, uVar, v2, false) + uVar.f1777g;
            if (H02 >= 0) {
                if (abs > H02) {
                    i2 = i3 * H02;
                }
                this.f1469r.o(-i2);
                this.f1468q.f1780j = i2;
                return i2;
            }
        }
        return 0;
    }

    public final void Z0(int i2) {
        if (i2 == 0 || i2 == 1) {
            c((String) null);
            if (i2 != this.f1467p || this.f1469r == null) {
                g a2 = g.a(this, i2);
                this.f1469r = a2;
                this.f1464A.f1766a = a2;
                this.f1467p = i2;
                l0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(A.g.f(i2, "invalid orientation:"));
    }

    public final PointF a(int i2) {
        if (v() == 0) {
            return null;
        }
        boolean z2 = false;
        int i3 = 1;
        if (i2 < J.H(u(0))) {
            z2 = true;
        }
        if (z2 != this.f1472u) {
            i3 = -1;
        }
        if (this.f1467p == 0) {
            return new PointF((float) i3, 0.0f);
        }
        return new PointF(0.0f, (float) i3);
    }

    public void a1(boolean z2) {
        c((String) null);
        if (this.f1473v != z2) {
            this.f1473v = z2;
            l0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0291  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b0(b0.P r18, b0.V r19) {
        /*
            r17 = this;
            r0 = r17
            r2 = r19
            b0.v r1 = r0.f1477z
            r6 = -1
            if (r1 != 0) goto L_0x000d
            int r1 = r0.f1475x
            if (r1 == r6) goto L_0x0017
        L_0x000d:
            int r1 = r2.b()
            if (r1 != 0) goto L_0x0017
            r17.g0(r18)
            return
        L_0x0017:
            b0.v r1 = r0.f1477z
            if (r1 == 0) goto L_0x0021
            int r1 = r1.f
            if (r1 < 0) goto L_0x0021
            r0.f1475x = r1
        L_0x0021:
            r0.G0()
            b0.u r1 = r0.f1468q
            r7 = 0
            r1.f1773a = r7
            r0.X0()
            androidx.recyclerview.widget.RecyclerView r1 = r0.b
            if (r1 != 0) goto L_0x0031
            goto L_0x0043
        L_0x0031:
            android.view.View r1 = r1.getFocusedChild()
            if (r1 == 0) goto L_0x0043
            N.g r3 = r0.f1577a
            java.lang.Object r3 = r3.f607d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            b0.s r9 = r0.f1464A
            boolean r3 = r9.f1769e
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1
            if (r3 == 0) goto L_0x0081
            int r3 = r0.f1475x
            if (r3 != r6) goto L_0x0081
            b0.v r3 = r0.f1477z
            if (r3 == 0) goto L_0x0056
            goto L_0x0081
        L_0x0056:
            if (r1 == 0) goto L_0x0075
            androidx.emoji2.text.g r3 = r0.f1469r
            int r3 = r3.e(r1)
            androidx.emoji2.text.g r4 = r0.f1469r
            int r4 = r4.g()
            if (r3 >= r4) goto L_0x0079
            androidx.emoji2.text.g r3 = r0.f1469r
            int r3 = r3.b(r1)
            androidx.emoji2.text.g r4 = r0.f1469r
            int r4 = r4.k()
            if (r3 > r4) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            r1 = r18
            goto L_0x0296
        L_0x0079:
            int r3 = b0.J.H(r1)
            r9.c(r1, r3)
            goto L_0x0075
        L_0x0081:
            r9.d()
            boolean r1 = r0.f1472u
            boolean r3 = r0.f1473v
            r1 = r1 ^ r3
            r9.f1768d = r1
            boolean r1 = r2.f1613g
            if (r1 != 0) goto L_0x018c
            int r1 = r0.f1475x
            if (r1 != r6) goto L_0x0095
            goto L_0x018c
        L_0x0095:
            if (r1 < 0) goto L_0x0188
            int r3 = r2.b()
            if (r1 < r3) goto L_0x009f
            goto L_0x0188
        L_0x009f:
            int r1 = r0.f1475x
            r9.b = r1
            b0.v r3 = r0.f1477z
            if (r3 == 0) goto L_0x00d0
            int r4 = r3.f
            if (r4 < 0) goto L_0x00d0
            boolean r1 = r3.f1784h
            r9.f1768d = r1
            if (r1 == 0) goto L_0x00c2
            androidx.emoji2.text.g r1 = r0.f1469r
            int r1 = r1.g()
            b0.v r3 = r0.f1477z
            int r3 = r3.f1783g
            int r1 = r1 - r3
            r9.f1767c = r1
        L_0x00be:
            r1 = r18
            goto L_0x0294
        L_0x00c2:
            androidx.emoji2.text.g r1 = r0.f1469r
            int r1 = r1.k()
            b0.v r3 = r0.f1477z
            int r3 = r3.f1783g
            int r1 = r1 + r3
            r9.f1767c = r1
            goto L_0x00be
        L_0x00d0:
            int r3 = r0.f1476y
            if (r3 != r10) goto L_0x0168
            android.view.View r1 = r0.q(r1)
            if (r1 == 0) goto L_0x0145
            androidx.emoji2.text.g r3 = r0.f1469r
            int r3 = r3.c(r1)
            androidx.emoji2.text.g r4 = r0.f1469r
            int r4 = r4.l()
            if (r3 <= r4) goto L_0x00ec
            r9.a()
            goto L_0x00be
        L_0x00ec:
            androidx.emoji2.text.g r3 = r0.f1469r
            int r3 = r3.e(r1)
            androidx.emoji2.text.g r4 = r0.f1469r
            int r4 = r4.k()
            int r3 = r3 - r4
            if (r3 >= 0) goto L_0x0106
            androidx.emoji2.text.g r1 = r0.f1469r
            int r1 = r1.k()
            r9.f1767c = r1
            r9.f1768d = r7
            goto L_0x00be
        L_0x0106:
            androidx.emoji2.text.g r3 = r0.f1469r
            int r3 = r3.g()
            androidx.emoji2.text.g r4 = r0.f1469r
            int r4 = r4.b(r1)
            int r3 = r3 - r4
            if (r3 >= 0) goto L_0x0120
            androidx.emoji2.text.g r1 = r0.f1469r
            int r1 = r1.g()
            r9.f1767c = r1
            r9.f1768d = r11
            goto L_0x00be
        L_0x0120:
            boolean r3 = r9.f1768d
            if (r3 == 0) goto L_0x013b
            androidx.emoji2.text.g r3 = r0.f1469r
            int r1 = r3.b(r1)
            androidx.emoji2.text.g r3 = r0.f1469r
            int r4 = r3.f1153a
            if (r10 != r4) goto L_0x0132
            r4 = 0
            goto L_0x0139
        L_0x0132:
            int r4 = r3.l()
            int r3 = r3.f1153a
            int r4 = r4 - r3
        L_0x0139:
            int r4 = r4 + r1
            goto L_0x0141
        L_0x013b:
            androidx.emoji2.text.g r3 = r0.f1469r
            int r4 = r3.e(r1)
        L_0x0141:
            r9.f1767c = r4
            goto L_0x00be
        L_0x0145:
            int r1 = r0.v()
            if (r1 <= 0) goto L_0x0163
            android.view.View r1 = r0.u(r7)
            int r1 = b0.J.H(r1)
            int r3 = r0.f1475x
            if (r3 >= r1) goto L_0x0159
            r1 = 1
            goto L_0x015a
        L_0x0159:
            r1 = 0
        L_0x015a:
            boolean r3 = r0.f1472u
            if (r1 != r3) goto L_0x0160
            r1 = 1
            goto L_0x0161
        L_0x0160:
            r1 = 0
        L_0x0161:
            r9.f1768d = r1
        L_0x0163:
            r9.a()
            goto L_0x00be
        L_0x0168:
            boolean r1 = r0.f1472u
            r9.f1768d = r1
            if (r1 == 0) goto L_0x017b
            androidx.emoji2.text.g r1 = r0.f1469r
            int r1 = r1.g()
            int r3 = r0.f1476y
            int r1 = r1 - r3
            r9.f1767c = r1
            goto L_0x00be
        L_0x017b:
            androidx.emoji2.text.g r1 = r0.f1469r
            int r1 = r1.k()
            int r3 = r0.f1476y
            int r1 = r1 + r3
            r9.f1767c = r1
            goto L_0x00be
        L_0x0188:
            r0.f1475x = r6
            r0.f1476y = r10
        L_0x018c:
            int r1 = r0.v()
            if (r1 != 0) goto L_0x0196
        L_0x0192:
            r1 = r18
            goto L_0x0284
        L_0x0196:
            androidx.recyclerview.widget.RecyclerView r1 = r0.b
            if (r1 != 0) goto L_0x019b
            goto L_0x01ad
        L_0x019b:
            android.view.View r1 = r1.getFocusedChild()
            if (r1 == 0) goto L_0x01ad
            N.g r3 = r0.f1577a
            java.lang.Object r3 = r3.f607d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x01ae
        L_0x01ad:
            r1 = 0
        L_0x01ae:
            if (r1 == 0) goto L_0x01db
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            b0.K r3 = (b0.K) r3
            b0.Y r4 = r3.f1590a
            boolean r4 = r4.h()
            if (r4 != 0) goto L_0x01db
            b0.Y r4 = r3.f1590a
            int r4 = r4.b()
            if (r4 < 0) goto L_0x01db
            b0.Y r3 = r3.f1590a
            int r3 = r3.b()
            int r4 = r2.b()
            if (r3 >= r4) goto L_0x01db
            int r3 = b0.J.H(r1)
            r9.c(r1, r3)
            goto L_0x00be
        L_0x01db:
            boolean r1 = r0.f1470s
            boolean r3 = r0.f1473v
            if (r1 == r3) goto L_0x01e2
            goto L_0x0192
        L_0x01e2:
            boolean r1 = r9.f1768d
            if (r1 == 0) goto L_0x0214
            boolean r1 = r0.f1472u
            if (r1 == 0) goto L_0x01fa
            int r4 = r0.v()
            int r5 = r2.b()
            r3 = 0
            r1 = r18
            android.view.View r3 = r0.N0(r1, r2, r3, r4, r5)
            goto L_0x022b
        L_0x01fa:
            int r0 = r17.v()
            int r3 = r0 + -1
            int r5 = r19.b()
            r4 = -1
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r3 = r0.N0(r1, r2, r3, r4, r5)
        L_0x020f:
            r1 = r18
            r2 = r19
            goto L_0x0241
        L_0x0214:
            boolean r1 = r0.f1472u
            if (r1 == 0) goto L_0x022e
            int r1 = r0.v()
            int r3 = r1 + -1
            int r5 = r19.b()
            r4 = -1
            r1 = r18
            r2 = r19
            android.view.View r3 = r0.N0(r1, r2, r3, r4, r5)
        L_0x022b:
            r0 = r17
            goto L_0x020f
        L_0x022e:
            int r4 = r17.v()
            int r5 = r19.b()
            r3 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r3 = r0.N0(r1, r2, r3, r4, r5)
        L_0x0241:
            if (r3 == 0) goto L_0x0284
            int r4 = b0.J.H(r3)
            r9.b(r3, r4)
            boolean r4 = r2.f1613g
            if (r4 != 0) goto L_0x0294
            boolean r4 = r0.z0()
            if (r4 == 0) goto L_0x0294
            androidx.emoji2.text.g r4 = r0.f1469r
            int r4 = r4.e(r3)
            androidx.emoji2.text.g r5 = r0.f1469r
            int r5 = r5.g()
            if (r4 >= r5) goto L_0x0270
            androidx.emoji2.text.g r4 = r0.f1469r
            int r3 = r4.b(r3)
            androidx.emoji2.text.g r4 = r0.f1469r
            int r4 = r4.k()
            if (r3 >= r4) goto L_0x0294
        L_0x0270:
            boolean r3 = r9.f1768d
            if (r3 == 0) goto L_0x027b
            androidx.emoji2.text.g r3 = r0.f1469r
            int r3 = r3.g()
            goto L_0x0281
        L_0x027b:
            androidx.emoji2.text.g r3 = r0.f1469r
            int r3 = r3.k()
        L_0x0281:
            r9.f1767c = r3
            goto L_0x0294
        L_0x0284:
            r9.a()
            boolean r3 = r0.f1473v
            if (r3 == 0) goto L_0x0291
            int r3 = r2.b()
            int r3 = r3 - r11
            goto L_0x0292
        L_0x0291:
            r3 = 0
        L_0x0292:
            r9.b = r3
        L_0x0294:
            r9.f1769e = r11
        L_0x0296:
            b0.u r3 = r0.f1468q
            int r4 = r3.f1780j
            if (r4 < 0) goto L_0x029e
            r4 = 1
            goto L_0x029f
        L_0x029e:
            r4 = -1
        L_0x029f:
            r3.f = r4
            int[] r3 = r0.D
            r3[r7] = r7
            r3[r11] = r7
            r0.A0(r2, r3)
            r4 = r3[r7]
            int r4 = java.lang.Math.max(r7, r4)
            androidx.emoji2.text.g r5 = r0.f1469r
            int r5 = r5.k()
            int r5 = r5 + r4
            r3 = r3[r11]
            int r3 = java.lang.Math.max(r7, r3)
            androidx.emoji2.text.g r4 = r0.f1469r
            int r4 = r4.h()
            int r4 = r4 + r3
            boolean r3 = r2.f1613g
            if (r3 == 0) goto L_0x0300
            int r3 = r0.f1475x
            if (r3 == r6) goto L_0x0300
            int r12 = r0.f1476y
            if (r12 == r10) goto L_0x0300
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L_0x0300
            boolean r10 = r0.f1472u
            if (r10 == 0) goto L_0x02eb
            androidx.emoji2.text.g r10 = r0.f1469r
            int r10 = r10.g()
            androidx.emoji2.text.g r12 = r0.f1469r
            int r3 = r12.b(r3)
            int r10 = r10 - r3
            int r3 = r0.f1476y
        L_0x02e9:
            int r10 = r10 - r3
            goto L_0x02fb
        L_0x02eb:
            androidx.emoji2.text.g r10 = r0.f1469r
            int r3 = r10.e(r3)
            androidx.emoji2.text.g r10 = r0.f1469r
            int r10 = r10.k()
            int r3 = r3 - r10
            int r10 = r0.f1476y
            goto L_0x02e9
        L_0x02fb:
            if (r10 <= 0) goto L_0x02ff
            int r5 = r5 + r10
            goto L_0x0300
        L_0x02ff:
            int r4 = r4 - r10
        L_0x0300:
            boolean r3 = r9.f1768d
            if (r3 == 0) goto L_0x030a
            boolean r3 = r0.f1472u
            if (r3 == 0) goto L_0x030e
        L_0x0308:
            r6 = 1
            goto L_0x030e
        L_0x030a:
            boolean r3 = r0.f1472u
            if (r3 == 0) goto L_0x0308
        L_0x030e:
            r0.U0(r1, r2, r9, r6)
            r17.p(r18)
            b0.u r3 = r0.f1468q
            androidx.emoji2.text.g r6 = r0.f1469r
            int r6 = r6.i()
            if (r6 != 0) goto L_0x0328
            androidx.emoji2.text.g r6 = r0.f1469r
            int r6 = r6.f()
            if (r6 != 0) goto L_0x0328
            r6 = 1
            goto L_0x0329
        L_0x0328:
            r6 = 0
        L_0x0329:
            r3.f1782l = r6
            b0.u r3 = r0.f1468q
            r3.getClass()
            b0.u r3 = r0.f1468q
            r3.f1779i = r7
            boolean r3 = r9.f1768d
            if (r3 == 0) goto L_0x037d
            int r3 = r9.b
            int r6 = r9.f1767c
            r0.d1(r3, r6)
            b0.u r3 = r0.f1468q
            r3.f1778h = r5
            r0.H0(r1, r3, r2, r7)
            b0.u r3 = r0.f1468q
            int r5 = r3.b
            int r6 = r3.f1775d
            int r3 = r3.f1774c
            if (r3 <= 0) goto L_0x0351
            int r4 = r4 + r3
        L_0x0351:
            int r3 = r9.b
            int r10 = r9.f1767c
            r0.c1(r3, r10)
            b0.u r3 = r0.f1468q
            r3.f1778h = r4
            int r4 = r3.f1775d
            int r10 = r3.f1776e
            int r4 = r4 + r10
            r3.f1775d = r4
            r0.H0(r1, r3, r2, r7)
            b0.u r3 = r0.f1468q
            int r4 = r3.b
            int r3 = r3.f1774c
            if (r3 <= 0) goto L_0x03c1
            r0.d1(r6, r5)
            b0.u r5 = r0.f1468q
            r5.f1778h = r3
            r0.H0(r1, r5, r2, r7)
            b0.u r3 = r0.f1468q
            int r5 = r3.b
            goto L_0x03c1
        L_0x037d:
            int r3 = r9.b
            int r6 = r9.f1767c
            r0.c1(r3, r6)
            b0.u r3 = r0.f1468q
            r3.f1778h = r4
            r0.H0(r1, r3, r2, r7)
            b0.u r3 = r0.f1468q
            int r4 = r3.b
            int r6 = r3.f1775d
            int r3 = r3.f1774c
            if (r3 <= 0) goto L_0x0396
            int r5 = r5 + r3
        L_0x0396:
            int r3 = r9.b
            int r10 = r9.f1767c
            r0.d1(r3, r10)
            b0.u r3 = r0.f1468q
            r3.f1778h = r5
            int r5 = r3.f1775d
            int r10 = r3.f1776e
            int r5 = r5 + r10
            r3.f1775d = r5
            r0.H0(r1, r3, r2, r7)
            b0.u r3 = r0.f1468q
            int r5 = r3.b
            int r3 = r3.f1774c
            if (r3 <= 0) goto L_0x03c1
            r0.c1(r6, r4)
            b0.u r4 = r0.f1468q
            r4.f1778h = r3
            r0.H0(r1, r4, r2, r7)
            b0.u r3 = r0.f1468q
            int r4 = r3.b
        L_0x03c1:
            int r3 = r0.v()
            if (r3 <= 0) goto L_0x03e6
            boolean r3 = r0.f1472u
            boolean r6 = r0.f1473v
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x03db
            int r3 = r0.O0(r4, r1, r2, r11)
            int r5 = r5 + r3
            int r4 = r4 + r3
            int r3 = r0.P0(r5, r1, r2, r7)
        L_0x03d8:
            int r5 = r5 + r3
            int r4 = r4 + r3
            goto L_0x03e6
        L_0x03db:
            int r3 = r0.P0(r5, r1, r2, r11)
            int r5 = r5 + r3
            int r4 = r4 + r3
            int r3 = r0.O0(r4, r1, r2, r7)
            goto L_0x03d8
        L_0x03e6:
            boolean r3 = r2.f1617k
            if (r3 == 0) goto L_0x0480
            int r3 = r0.v()
            if (r3 == 0) goto L_0x0480
            boolean r3 = r2.f1613g
            if (r3 != 0) goto L_0x0480
            boolean r3 = r0.z0()
            if (r3 != 0) goto L_0x03fc
            goto L_0x0480
        L_0x03fc:
            java.util.List r3 = r1.f1599d
            int r6 = r3.size()
            android.view.View r10 = r0.u(r7)
            int r10 = b0.J.H(r10)
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x040d:
            if (r12 >= r6) goto L_0x043e
            java.lang.Object r15 = r3.get(r12)
            b0.Y r15 = (b0.Y) r15
            boolean r16 = r15.h()
            if (r16 == 0) goto L_0x041c
            goto L_0x043a
        L_0x041c:
            int r11 = r15.b()
            if (r11 >= r10) goto L_0x0424
            r11 = 1
            goto L_0x0425
        L_0x0424:
            r11 = 0
        L_0x0425:
            boolean r8 = r0.f1472u
            android.view.View r15 = r15.f1628a
            if (r11 == r8) goto L_0x0433
            androidx.emoji2.text.g r8 = r0.f1469r
            int r8 = r8.c(r15)
            int r13 = r13 + r8
            goto L_0x043a
        L_0x0433:
            androidx.emoji2.text.g r8 = r0.f1469r
            int r8 = r8.c(r15)
            int r14 = r14 + r8
        L_0x043a:
            int r12 = r12 + 1
            r11 = 1
            goto L_0x040d
        L_0x043e:
            b0.u r6 = r0.f1468q
            r6.f1781k = r3
            if (r13 <= 0) goto L_0x045e
            android.view.View r3 = r0.R0()
            int r3 = b0.J.H(r3)
            r0.d1(r3, r5)
            b0.u r3 = r0.f1468q
            r3.f1778h = r13
            r3.f1774c = r7
            r5 = 0
            r3.a(r5)
            b0.u r3 = r0.f1468q
            r0.H0(r1, r3, r2, r7)
        L_0x045e:
            if (r14 <= 0) goto L_0x047b
            android.view.View r3 = r0.Q0()
            int r3 = b0.J.H(r3)
            r0.c1(r3, r4)
            b0.u r3 = r0.f1468q
            r3.f1778h = r14
            r3.f1774c = r7
            r5 = 0
            r3.a(r5)
            b0.u r3 = r0.f1468q
            r0.H0(r1, r3, r2, r7)
            goto L_0x047c
        L_0x047b:
            r5 = 0
        L_0x047c:
            b0.u r1 = r0.f1468q
            r1.f1781k = r5
        L_0x0480:
            boolean r1 = r2.f1613g
            if (r1 != 0) goto L_0x048d
            androidx.emoji2.text.g r1 = r0.f1469r
            int r2 = r1.l()
            r1.f1153a = r2
            goto L_0x0490
        L_0x048d:
            r9.d()
        L_0x0490:
            boolean r1 = r0.f1473v
            r0.f1470s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.b0(b0.P, b0.V):void");
    }

    public final void b1(int i2, int i3, boolean z2, V v2) {
        boolean z3;
        int i4;
        int i5;
        C0096u uVar = this.f1468q;
        boolean z4 = false;
        int i6 = 1;
        if (this.f1469r.i() == 0 && this.f1469r.f() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        uVar.f1782l = z3;
        this.f1468q.f = i2;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(v2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i2 == 1) {
            z4 = true;
        }
        C0096u uVar2 = this.f1468q;
        if (z4) {
            i4 = max2;
        } else {
            i4 = max;
        }
        uVar2.f1778h = i4;
        if (!z4) {
            max = max2;
        }
        uVar2.f1779i = max;
        if (z4) {
            uVar2.f1778h = this.f1469r.h() + i4;
            View Q02 = Q0();
            C0096u uVar3 = this.f1468q;
            if (this.f1472u) {
                i6 = -1;
            }
            uVar3.f1776e = i6;
            int H2 = J.H(Q02);
            C0096u uVar4 = this.f1468q;
            uVar3.f1775d = H2 + uVar4.f1776e;
            uVar4.b = this.f1469r.b(Q02);
            i5 = this.f1469r.b(Q02) - this.f1469r.g();
        } else {
            View R0 = R0();
            C0096u uVar5 = this.f1468q;
            uVar5.f1778h = this.f1469r.k() + uVar5.f1778h;
            C0096u uVar6 = this.f1468q;
            if (!this.f1472u) {
                i6 = -1;
            }
            uVar6.f1776e = i6;
            int H3 = J.H(R0);
            C0096u uVar7 = this.f1468q;
            uVar6.f1775d = H3 + uVar7.f1776e;
            uVar7.b = this.f1469r.e(R0);
            i5 = (-this.f1469r.e(R0)) + this.f1469r.k();
        }
        C0096u uVar8 = this.f1468q;
        uVar8.f1774c = i3;
        if (z2) {
            uVar8.f1774c = i3 - i5;
        }
        uVar8.f1777g = i5;
    }

    public final void c(String str) {
        if (this.f1477z == null) {
            super.c(str);
        }
    }

    public void c0(V v2) {
        this.f1477z = null;
        this.f1475x = -1;
        this.f1476y = Integer.MIN_VALUE;
        this.f1464A.d();
    }

    public final void c1(int i2, int i3) {
        int i4;
        this.f1468q.f1774c = this.f1469r.g() - i3;
        C0096u uVar = this.f1468q;
        if (this.f1472u) {
            i4 = -1;
        } else {
            i4 = 1;
        }
        uVar.f1776e = i4;
        uVar.f1775d = i2;
        uVar.f = 1;
        uVar.b = i3;
        uVar.f1777g = Integer.MIN_VALUE;
    }

    public final boolean d() {
        if (this.f1467p == 0) {
            return true;
        }
        return false;
    }

    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0097v) {
            this.f1477z = (C0097v) parcelable;
            l0();
        }
    }

    public final void d1(int i2, int i3) {
        int i4;
        this.f1468q.f1774c = i3 - this.f1469r.k();
        C0096u uVar = this.f1468q;
        uVar.f1775d = i2;
        if (this.f1472u) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        uVar.f1776e = i4;
        uVar.f = -1;
        uVar.b = i3;
        uVar.f1777g = Integer.MIN_VALUE;
    }

    public final boolean e() {
        if (this.f1467p == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, b0.v] */
    /* JADX WARNING: type inference failed for: r1v9, types: [android.os.Parcelable, java.lang.Object, b0.v] */
    public final Parcelable e0() {
        C0097v vVar = this.f1477z;
        if (vVar != null) {
            ? obj = new Object();
            obj.f = vVar.f;
            obj.f1783g = vVar.f1783g;
            obj.f1784h = vVar.f1784h;
            return obj;
        }
        ? obj2 = new Object();
        if (v() > 0) {
            G0();
            boolean z2 = this.f1470s ^ this.f1472u;
            obj2.f1784h = z2;
            if (z2) {
                View Q02 = Q0();
                obj2.f1783g = this.f1469r.g() - this.f1469r.b(Q02);
                obj2.f = J.H(Q02);
                return obj2;
            }
            View R0 = R0();
            obj2.f = J.H(R0);
            obj2.f1783g = this.f1469r.e(R0) - this.f1469r.k();
            return obj2;
        }
        obj2.f = -1;
        return obj2;
    }

    public final void h(int i2, int i3, V v2, C0090n nVar) {
        int i4;
        if (this.f1467p != 0) {
            i2 = i3;
        }
        if (v() != 0 && i2 != 0) {
            G0();
            if (i2 > 0) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            b1(i4, Math.abs(i2), true, v2);
            B0(v2, this.f1468q, nVar);
        }
    }

    public final void i(int i2, C0090n nVar) {
        int i3;
        boolean z2;
        C0097v vVar = this.f1477z;
        int i4 = -1;
        if (vVar == null || (i3 = vVar.f) < 0) {
            X0();
            z2 = this.f1472u;
            i3 = this.f1475x;
            if (i3 == -1) {
                if (z2) {
                    i3 = i2 - 1;
                } else {
                    i3 = 0;
                }
            }
        } else {
            z2 = vVar.f1784h;
        }
        if (!z2) {
            i4 = 1;
        }
        for (int i5 = 0; i5 < this.f1466C && i3 >= 0 && i3 < i2; i5++) {
            nVar.a(i3, 0);
            i3 += i4;
        }
    }

    public final int j(V v2) {
        return C0(v2);
    }

    public int k(V v2) {
        return D0(v2);
    }

    public int l(V v2) {
        return E0(v2);
    }

    public final int m(V v2) {
        return C0(v2);
    }

    public int m0(int i2, P p2, V v2) {
        if (this.f1467p == 1) {
            return 0;
        }
        return Y0(i2, p2, v2);
    }

    public int n(V v2) {
        return D0(v2);
    }

    public final void n0(int i2) {
        this.f1475x = i2;
        this.f1476y = Integer.MIN_VALUE;
        C0097v vVar = this.f1477z;
        if (vVar != null) {
            vVar.f = -1;
        }
        l0();
    }

    public int o(V v2) {
        return E0(v2);
    }

    public int o0(int i2, P p2, V v2) {
        if (this.f1467p == 0) {
            return 0;
        }
        return Y0(i2, p2, v2);
    }

    public final View q(int i2) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H2 = i2 - J.H(u(0));
        if (H2 >= 0 && H2 < v2) {
            View u2 = u(H2);
            if (J.H(u2) == i2) {
                return u2;
            }
        }
        return super.q(i2);
    }

    public K r() {
        return new K(-2, -2);
    }

    public final boolean v0() {
        if (!(this.f1587m == 1073741824 || this.f1586l == 1073741824)) {
            int v2 = v();
            for (int i2 = 0; i2 < v2; i2++) {
                ViewGroup.LayoutParams layoutParams = u(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void x0(RecyclerView recyclerView, int i2) {
        C0098w wVar = new C0098w(recyclerView.getContext());
        wVar.f1785a = i2;
        y0(wVar);
    }

    public boolean z0() {
        if (this.f1477z == null && this.f1470s == this.f1473v) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [b0.t, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        I I2 = J.I(context, attributeSet, i2, i3);
        Z0(I2.f1574a);
        boolean z2 = I2.f1575c;
        c((String) null);
        if (z2 != this.f1471t) {
            this.f1471t = z2;
            l0();
        }
        a1(I2.f1576d);
    }

    public final void R(RecyclerView recyclerView) {
    }

    public void U0(P p2, V v2, C0094s sVar, int i2) {
    }
}
