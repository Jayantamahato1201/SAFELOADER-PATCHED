package androidx.recyclerview.widget;

import F.c;
import H0.E;
import I.O;
import J.k;
import Q0.l;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.g;
import b0.C0090n;
import b0.C0098w;
import b0.I;
import b0.J;
import b0.K;
import b0.P;
import b0.U;
import b0.V;
import b0.c0;
import b0.d0;
import b0.f0;
import b0.g0;
import b0.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

public class StaggeredGridLayoutManager extends J implements U {

    /* renamed from: A  reason: collision with root package name */
    public int f1545A = Integer.MIN_VALUE;

    /* renamed from: B  reason: collision with root package name */
    public final c f1546B;

    /* renamed from: C  reason: collision with root package name */
    public final int f1547C;
    public boolean D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f1548E;

    /* renamed from: F  reason: collision with root package name */
    public f0 f1549F;

    /* renamed from: G  reason: collision with root package name */
    public final Rect f1550G;

    /* renamed from: H  reason: collision with root package name */
    public final c0 f1551H;

    /* renamed from: I  reason: collision with root package name */
    public final boolean f1552I;

    /* renamed from: J  reason: collision with root package name */
    public int[] f1553J;

    /* renamed from: K  reason: collision with root package name */
    public final E f1554K;

    /* renamed from: p  reason: collision with root package name */
    public final int f1555p = -1;

    /* renamed from: q  reason: collision with root package name */
    public final g0[] f1556q;

    /* renamed from: r  reason: collision with root package name */
    public final g f1557r;

    /* renamed from: s  reason: collision with root package name */
    public final g f1558s;

    /* renamed from: t  reason: collision with root package name */
    public final int f1559t;

    /* renamed from: u  reason: collision with root package name */
    public int f1560u;

    /* renamed from: v  reason: collision with root package name */
    public final r f1561v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1562w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1563x = false;

    /* renamed from: y  reason: collision with root package name */
    public final BitSet f1564y;

    /* renamed from: z  reason: collision with root package name */
    public int f1565z = -1;

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Object, b0.r] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        c cVar = new c(11, false);
        this.f1546B = cVar;
        this.f1547C = 2;
        this.f1550G = new Rect();
        this.f1551H = new c0(this);
        this.f1552I = true;
        this.f1554K = new E(10, this);
        I I2 = J.I(context, attributeSet, i2, i3);
        int i4 = I2.f1574a;
        if (i4 == 0 || i4 == 1) {
            c((String) null);
            if (i4 != this.f1559t) {
                this.f1559t = i4;
                g gVar = this.f1557r;
                this.f1557r = this.f1558s;
                this.f1558s = gVar;
                l0();
            }
            int i5 = I2.b;
            c((String) null);
            if (i5 != this.f1555p) {
                int[] iArr = (int[]) cVar.b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                cVar.f194c = null;
                l0();
                this.f1555p = i5;
                this.f1564y = new BitSet(this.f1555p);
                this.f1556q = new g0[this.f1555p];
                for (int i6 = 0; i6 < this.f1555p; i6++) {
                    this.f1556q[i6] = new g0(this, i6);
                }
                l0();
            }
            boolean z2 = I2.f1575c;
            c((String) null);
            f0 f0Var = this.f1549F;
            if (!(f0Var == null || f0Var.f1681m == z2)) {
                f0Var.f1681m = z2;
            }
            this.f1562w = z2;
            l0();
            ? obj = new Object();
            obj.f1759a = true;
            obj.f = 0;
            obj.f1763g = 0;
            this.f1561v = obj;
            this.f1557r = g.a(this, this.f1559t);
            this.f1558s = g.a(this, 1 - this.f1559t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int c1(int i2, int i3, int i4) {
        int mode;
        if ((i3 != 0 || i4 != 0) && ((mode = View.MeasureSpec.getMode(i2)) == Integer.MIN_VALUE || mode == 1073741824)) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode);
        }
        return i2;
    }

    public final boolean A0() {
        int i2;
        if (!(v() == 0 || this.f1547C == 0 || !this.f1581g)) {
            if (this.f1563x) {
                i2 = K0();
                J0();
            } else {
                i2 = J0();
                K0();
            }
            c cVar = this.f1546B;
            if (i2 == 0 && O0() != null) {
                int[] iArr = (int[]) cVar.b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                cVar.f194c = null;
                this.f = true;
                l0();
                return true;
            }
        }
        return false;
    }

    public final int B0(V v2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1557r;
        boolean z2 = !this.f1552I;
        return l.o(v2, gVar, G0(z2), F0(z2), this, this.f1552I);
    }

    public final int C0(V v2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1557r;
        boolean z2 = !this.f1552I;
        return l.p(v2, gVar, G0(z2), F0(z2), this, this.f1552I, this.f1563x);
    }

    public final int D0(V v2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1557r;
        boolean z2 = !this.f1552I;
        return l.q(v2, gVar, G0(z2), F0(z2), this, this.f1552I);
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x026e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E0(b0.P r20, b0.r r21, b0.V r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.BitSet r3 = r0.f1564y
            int r4 = r0.f1555p
            r5 = 0
            r6 = 1
            r3.set(r5, r4, r6)
            b0.r r3 = r0.f1561v
            boolean r4 = r3.f1765i
            if (r4 == 0) goto L_0x0020
            int r4 = r2.f1762e
            if (r4 != r6) goto L_0x001d
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002f
        L_0x001d:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x002f
        L_0x0020:
            int r4 = r2.f1762e
            if (r4 != r6) goto L_0x002a
            int r4 = r2.f1763g
            int r9 = r2.b
            int r4 = r4 + r9
            goto L_0x002f
        L_0x002a:
            int r4 = r2.f
            int r9 = r2.b
            int r4 = r4 - r9
        L_0x002f:
            int r9 = r2.f1762e
            r10 = 0
        L_0x0032:
            int r11 = r0.f1555p
            if (r10 >= r11) goto L_0x004d
            b0.g0[] r11 = r0.f1556q
            r11 = r11[r10]
            java.util.ArrayList r11 = r11.f1688a
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0043
            goto L_0x004a
        L_0x0043:
            b0.g0[] r11 = r0.f1556q
            r11 = r11[r10]
            r0.b1(r11, r9, r4)
        L_0x004a:
            int r10 = r10 + 1
            goto L_0x0032
        L_0x004d:
            boolean r9 = r0.f1563x
            if (r9 == 0) goto L_0x0058
            androidx.emoji2.text.g r9 = r0.f1557r
            int r9 = r9.g()
            goto L_0x005e
        L_0x0058:
            androidx.emoji2.text.g r9 = r0.f1557r
            int r9 = r9.k()
        L_0x005e:
            r10 = 0
        L_0x005f:
            int r11 = r2.f1760c
            if (r11 < 0) goto L_0x006b
            int r12 = r22.b()
            if (r11 >= r12) goto L_0x006b
            r11 = 1
            goto L_0x006c
        L_0x006b:
            r11 = 0
        L_0x006c:
            r12 = -1
            if (r11 == 0) goto L_0x026c
            boolean r11 = r3.f1765i
            if (r11 != 0) goto L_0x007b
            java.util.BitSet r11 = r0.f1564y
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x026c
        L_0x007b:
            int r10 = r2.f1760c
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            b0.Y r10 = r1.i(r10, r13)
            android.view.View r10 = r10.f1628a
            int r11 = r2.f1760c
            int r13 = r2.f1761d
            int r11 = r11 + r13
            r2.f1760c = r11
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            b0.d0 r11 = (b0.d0) r11
            b0.Y r13 = r11.f1590a
            int r13 = r13.b()
            F.c r14 = r0.f1546B
            java.lang.Object r15 = r14.b
            int[] r15 = (int[]) r15
            if (r15 == 0) goto L_0x00aa
            int r8 = r15.length
            if (r13 < r8) goto L_0x00a7
            goto L_0x00aa
        L_0x00a7:
            r8 = r15[r13]
            goto L_0x00ab
        L_0x00aa:
            r8 = -1
        L_0x00ab:
            if (r8 != r12) goto L_0x010e
            int r8 = r2.f1762e
            boolean r8 = r0.S0(r8)
            if (r8 == 0) goto L_0x00bc
            int r8 = r0.f1555p
            int r8 = r8 - r6
            r15 = -1
            r16 = -1
            goto L_0x00c2
        L_0x00bc:
            int r8 = r0.f1555p
            r15 = r8
            r8 = 0
            r16 = 1
        L_0x00c2:
            int r7 = r2.f1762e
            r17 = 0
            if (r7 != r6) goto L_0x00e8
            androidx.emoji2.text.g r7 = r0.f1557r
            int r7 = r7.k()
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x00d1:
            if (r8 == r15) goto L_0x00e5
            b0.g0[] r12 = r0.f1556q
            r12 = r12[r8]
            int r6 = r12.f(r7)
            if (r6 >= r5) goto L_0x00e0
            r5 = r6
            r17 = r12
        L_0x00e0:
            int r8 = r8 + r16
            r6 = 1
            r12 = -1
            goto L_0x00d1
        L_0x00e5:
            r5 = r17
            goto L_0x0102
        L_0x00e8:
            androidx.emoji2.text.g r5 = r0.f1557r
            int r5 = r5.g()
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00f0:
            if (r8 == r15) goto L_0x00e5
            b0.g0[] r7 = r0.f1556q
            r7 = r7[r8]
            int r12 = r7.h(r5)
            if (r12 <= r6) goto L_0x00ff
            r17 = r7
            r6 = r12
        L_0x00ff:
            int r8 = r8 + r16
            goto L_0x00f0
        L_0x0102:
            r14.s(r13)
            java.lang.Object r6 = r14.b
            int[] r6 = (int[]) r6
            int r7 = r5.f1691e
            r6[r13] = r7
            goto L_0x0112
        L_0x010e:
            b0.g0[] r5 = r0.f1556q
            r5 = r5[r8]
        L_0x0112:
            r11.f1663e = r5
            int r6 = r2.f1762e
            r7 = 1
            if (r6 != r7) goto L_0x011f
            r6 = 0
            r8 = -1
            r0.b(r10, r8, r6)
            goto L_0x0123
        L_0x011f:
            r6 = 0
            r0.b(r10, r6, r6)
        L_0x0123:
            int r8 = r0.f1559t
            if (r8 != r7) goto L_0x0149
            int r7 = r0.f1560u
            int r8 = r0.f1586l
            int r12 = r11.width
            int r7 = b0.J.w(r6, r7, r8, r6, r12)
            int r6 = r0.f1589o
            int r8 = r0.f1587m
            int r12 = r0.G()
            int r13 = r0.D()
            int r13 = r13 + r12
            int r12 = r11.height
            r14 = 1
            int r6 = b0.J.w(r14, r6, r8, r13, r12)
            r0.Q0(r10, r7, r6)
            goto L_0x016b
        L_0x0149:
            r14 = 1
            int r6 = r0.f1588n
            int r7 = r0.f1586l
            int r8 = r0.E()
            int r12 = r0.F()
            int r12 = r12 + r8
            int r8 = r11.width
            int r6 = b0.J.w(r14, r6, r7, r12, r8)
            int r7 = r0.f1560u
            int r8 = r0.f1587m
            int r12 = r11.height
            r13 = 0
            int r7 = b0.J.w(r13, r7, r8, r13, r12)
            r0.Q0(r10, r6, r7)
        L_0x016b:
            int r6 = r2.f1762e
            if (r6 != r14) goto L_0x017b
            int r6 = r5.f(r9)
            androidx.emoji2.text.g r7 = r0.f1557r
            int r7 = r7.c(r10)
            int r7 = r7 + r6
            goto L_0x0187
        L_0x017b:
            int r7 = r5.h(r9)
            androidx.emoji2.text.g r6 = r0.f1557r
            int r6 = r6.c(r10)
            int r6 = r7 - r6
        L_0x0187:
            int r8 = r2.f1762e
            r14 = 1
            if (r8 != r14) goto L_0x01cb
            b0.g0 r8 = r11.f1663e
            r8.getClass()
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            b0.d0 r11 = (b0.d0) r11
            r11.f1663e = r8
            java.util.ArrayList r12 = r8.f1688a
            r12.add(r10)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.f1689c = r13
            int r12 = r12.size()
            r14 = 1
            if (r12 != r14) goto L_0x01ab
            r8.b = r13
        L_0x01ab:
            b0.Y r12 = r11.f1590a
            boolean r12 = r12.h()
            if (r12 != 0) goto L_0x01bb
            b0.Y r11 = r11.f1590a
            boolean r11 = r11.k()
            if (r11 == 0) goto L_0x01c8
        L_0x01bb:
            int r11 = r8.f1690d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = r8.f
            androidx.emoji2.text.g r12 = r12.f1557r
            int r12 = r12.c(r10)
            int r12 = r12 + r11
            r8.f1690d = r12
        L_0x01c8:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0208
        L_0x01cb:
            b0.g0 r8 = r11.f1663e
            r8.getClass()
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            b0.d0 r11 = (b0.d0) r11
            r11.f1663e = r8
            java.util.ArrayList r12 = r8.f1688a
            r13 = 0
            r12.add(r13, r10)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.b = r13
            int r12 = r12.size()
            r14 = 1
            if (r12 != r14) goto L_0x01eb
            r8.f1689c = r13
        L_0x01eb:
            b0.Y r12 = r11.f1590a
            boolean r12 = r12.h()
            if (r12 != 0) goto L_0x01fb
            b0.Y r11 = r11.f1590a
            boolean r11 = r11.k()
            if (r11 == 0) goto L_0x0208
        L_0x01fb:
            int r11 = r8.f1690d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = r8.f
            androidx.emoji2.text.g r12 = r12.f1557r
            int r12 = r12.c(r10)
            int r12 = r12 + r11
            r8.f1690d = r12
        L_0x0208:
            boolean r8 = r0.P0()
            if (r8 == 0) goto L_0x022d
            int r8 = r0.f1559t
            r14 = 1
            if (r8 != r14) goto L_0x022d
            androidx.emoji2.text.g r8 = r0.f1558s
            int r8 = r8.g()
            int r11 = r0.f1555p
            int r11 = r11 - r14
            int r12 = r5.f1691e
            int r11 = r11 - r12
            int r12 = r0.f1560u
            int r11 = r11 * r12
            int r8 = r8 - r11
            androidx.emoji2.text.g r11 = r0.f1558s
            int r11 = r11.c(r10)
            int r11 = r8 - r11
            goto L_0x0241
        L_0x022d:
            int r8 = r5.f1691e
            int r11 = r0.f1560u
            int r8 = r8 * r11
            androidx.emoji2.text.g r11 = r0.f1558s
            int r11 = r11.k()
            int r11 = r11 + r8
            androidx.emoji2.text.g r8 = r0.f1558s
            int r8 = r8.c(r10)
            int r8 = r8 + r11
        L_0x0241:
            int r12 = r0.f1559t
            r14 = 1
            if (r12 != r14) goto L_0x024a
            b0.J.N(r10, r11, r6, r8, r7)
            goto L_0x024d
        L_0x024a:
            b0.J.N(r10, r6, r11, r7, r8)
        L_0x024d:
            int r6 = r3.f1762e
            r0.b1(r5, r6, r4)
            r0.U0(r1, r3)
            boolean r6 = r3.f1764h
            if (r6 == 0) goto L_0x0267
            boolean r6 = r10.hasFocusable()
            if (r6 == 0) goto L_0x0267
            java.util.BitSet r6 = r0.f1564y
            int r5 = r5.f1691e
            r7 = 0
            r6.set(r5, r7)
        L_0x0267:
            r5 = 0
            r6 = 1
            r10 = 1
            goto L_0x005f
        L_0x026c:
            if (r10 != 0) goto L_0x0271
            r0.U0(r1, r3)
        L_0x0271:
            int r1 = r3.f1762e
            r8 = -1
            if (r1 != r8) goto L_0x0288
            androidx.emoji2.text.g r1 = r0.f1557r
            int r1 = r1.k()
            int r1 = r0.M0(r1)
            androidx.emoji2.text.g r3 = r0.f1557r
            int r3 = r3.k()
            int r3 = r3 - r1
            goto L_0x029a
        L_0x0288:
            androidx.emoji2.text.g r1 = r0.f1557r
            int r1 = r1.g()
            int r1 = r0.L0(r1)
            androidx.emoji2.text.g r3 = r0.f1557r
            int r3 = r3.g()
            int r3 = r1 - r3
        L_0x029a:
            if (r3 <= 0) goto L_0x02a3
            int r1 = r2.b
            int r1 = java.lang.Math.min(r1, r3)
            return r1
        L_0x02a3:
            r18 = 0
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.E0(b0.P, b0.r, b0.V):int");
    }

    public final View F0(boolean z2) {
        int k2 = this.f1557r.k();
        int g2 = this.f1557r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e2 = this.f1557r.e(u2);
            int b = this.f1557r.b(u2);
            if (b > k2 && e2 < g2) {
                if (b <= g2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final View G0(boolean z2) {
        int k2 = this.f1557r.k();
        int g2 = this.f1557r.g();
        int v2 = v();
        View view = null;
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = u(i2);
            int e2 = this.f1557r.e(u2);
            if (this.f1557r.b(u2) > k2 && e2 < g2) {
                if (e2 >= k2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final void H0(P p2, V v2, boolean z2) {
        int g2;
        int L02 = L0(Integer.MIN_VALUE);
        if (L02 != Integer.MIN_VALUE && (g2 = this.f1557r.g() - L02) > 0) {
            int i2 = g2 - (-Y0(-g2, p2, v2));
            if (z2 && i2 > 0) {
                this.f1557r.o(i2);
            }
        }
    }

    public final void I0(P p2, V v2, boolean z2) {
        int k2;
        int M02 = M0(Integer.MAX_VALUE);
        if (M02 != Integer.MAX_VALUE && (k2 = M02 - this.f1557r.k()) > 0) {
            int Y02 = k2 - Y0(k2, p2, v2);
            if (z2 && Y02 > 0) {
                this.f1557r.o(-Y02);
            }
        }
    }

    public final int J(P p2, V v2) {
        if (this.f1559t == 0) {
            return this.f1555p;
        }
        return super.J(p2, v2);
    }

    public final int J0() {
        if (v() == 0) {
            return 0;
        }
        return J.H(u(0));
    }

    public final int K0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return J.H(u(v2 - 1));
    }

    public final boolean L() {
        if (this.f1547C != 0) {
            return true;
        }
        return false;
    }

    public final int L0(int i2) {
        int f = this.f1556q[0].f(i2);
        for (int i3 = 1; i3 < this.f1555p; i3++) {
            int f2 = this.f1556q[i3].f(i2);
            if (f2 > f) {
                f = f2;
            }
        }
        return f;
    }

    public final int M0(int i2) {
        int h2 = this.f1556q[0].h(i2);
        for (int i3 = 1; i3 < this.f1555p; i3++) {
            int h3 = this.f1556q[i3].h(i2);
            if (h3 < h2) {
                h2 = h3;
            }
        }
        return h2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N0(int r10, int r11, int r12) {
        /*
            r9 = this;
            boolean r0 = r9.f1563x
            if (r0 == 0) goto L_0x0009
            int r0 = r9.K0()
            goto L_0x000d
        L_0x0009:
            int r0 = r9.J0()
        L_0x000d:
            r1 = 8
            if (r12 != r1) goto L_0x001b
            if (r10 >= r11) goto L_0x0017
            int r2 = r11 + 1
        L_0x0015:
            r3 = r10
            goto L_0x001e
        L_0x0017:
            int r2 = r10 + 1
            r3 = r11
            goto L_0x001e
        L_0x001b:
            int r2 = r10 + r11
            goto L_0x0015
        L_0x001e:
            F.c r4 = r9.f1546B
            java.lang.Object r5 = r4.b
            int[] r5 = (int[]) r5
            r6 = -1
            if (r5 != 0) goto L_0x0029
            goto L_0x00a9
        L_0x0029:
            int r5 = r5.length
            if (r3 < r5) goto L_0x002e
            goto L_0x00a9
        L_0x002e:
            java.lang.Object r5 = r4.f194c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L_0x0036
        L_0x0034:
            r5 = -1
            goto L_0x0090
        L_0x0036:
            if (r5 != 0) goto L_0x0039
            goto L_0x0053
        L_0x0039:
            int r5 = r5.size()
            int r5 = r5 + -1
        L_0x003f:
            if (r5 < 0) goto L_0x0053
            java.lang.Object r7 = r4.f194c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = r7.get(r5)
            b0.e0 r7 = (b0.e0) r7
            int r8 = r7.f
            if (r8 != r3) goto L_0x0050
            goto L_0x0054
        L_0x0050:
            int r5 = r5 + -1
            goto L_0x003f
        L_0x0053:
            r7 = 0
        L_0x0054:
            if (r7 == 0) goto L_0x005d
            java.lang.Object r5 = r4.f194c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.remove(r7)
        L_0x005d:
            java.lang.Object r5 = r4.f194c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r7 = 0
        L_0x0066:
            if (r7 >= r5) goto L_0x007a
            java.lang.Object r8 = r4.f194c
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r7)
            b0.e0 r8 = (b0.e0) r8
            int r8 = r8.f
            if (r8 < r3) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            int r7 = r7 + 1
            goto L_0x0066
        L_0x007a:
            r7 = -1
        L_0x007b:
            if (r7 == r6) goto L_0x0034
            java.lang.Object r5 = r4.f194c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r7)
            b0.e0 r5 = (b0.e0) r5
            java.lang.Object r8 = r4.f194c
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.remove(r7)
            int r5 = r5.f
        L_0x0090:
            if (r5 != r6) goto L_0x00a0
            java.lang.Object r5 = r4.b
            int[] r5 = (int[]) r5
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            java.lang.Object r5 = r4.b
            int[] r5 = (int[]) r5
            int r5 = r5.length
            goto L_0x00a9
        L_0x00a0:
            java.lang.Object r7 = r4.b
            int[] r7 = (int[]) r7
            int r5 = r5 + 1
            java.util.Arrays.fill(r7, r3, r5, r6)
        L_0x00a9:
            r5 = 1
            if (r12 == r5) goto L_0x00bd
            r6 = 2
            if (r12 == r6) goto L_0x00b9
            if (r12 == r1) goto L_0x00b2
            goto L_0x00c0
        L_0x00b2:
            r4.C(r10, r5)
            r4.B(r11, r5)
            goto L_0x00c0
        L_0x00b9:
            r4.C(r10, r11)
            goto L_0x00c0
        L_0x00bd:
            r4.B(r10, r11)
        L_0x00c0:
            if (r2 > r0) goto L_0x00c3
            goto L_0x00d5
        L_0x00c3:
            boolean r10 = r9.f1563x
            if (r10 == 0) goto L_0x00cc
            int r10 = r9.J0()
            goto L_0x00d0
        L_0x00cc:
            int r10 = r9.K0()
        L_0x00d0:
            if (r3 > r10) goto L_0x00d5
            r9.l0()
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0(int, int, int):void");
    }

    public final void O(int i2) {
        super.O(i2);
        for (int i3 = 0; i3 < this.f1555p; i3++) {
            g0 g0Var = this.f1556q[i3];
            int i4 = g0Var.b;
            if (i4 != Integer.MIN_VALUE) {
                g0Var.b = i4 + i2;
            }
            int i5 = g0Var.f1689c;
            if (i5 != Integer.MIN_VALUE) {
                g0Var.f1689c = i5 + i2;
            }
        }
    }

    public final View O0() {
        char c2;
        boolean z2;
        boolean z3;
        int v2 = v();
        int i2 = v2 - 1;
        BitSet bitSet = new BitSet(this.f1555p);
        bitSet.set(0, this.f1555p, true);
        int i3 = -1;
        if (this.f1559t != 1 || !P0()) {
            c2 = 65535;
        } else {
            c2 = 1;
        }
        if (this.f1563x) {
            v2 = -1;
        } else {
            i2 = 0;
        }
        if (i2 < v2) {
            i3 = 1;
        }
        while (i2 != v2) {
            View u2 = u(i2);
            d0 d0Var = (d0) u2.getLayoutParams();
            if (bitSet.get(d0Var.f1663e.f1691e)) {
                g0 g0Var = d0Var.f1663e;
                if (this.f1563x) {
                    int i4 = g0Var.f1689c;
                    if (i4 == Integer.MIN_VALUE) {
                        g0Var.a();
                        i4 = g0Var.f1689c;
                    }
                    if (i4 < this.f1557r.g()) {
                        ArrayList arrayList = g0Var.f1688a;
                        ((d0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u2;
                    }
                } else {
                    int i5 = g0Var.b;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) g0Var.f1688a.get(0);
                        g0Var.b = g0Var.f.f1557r.e(view);
                        ((d0) view.getLayoutParams()).getClass();
                        i5 = g0Var.b;
                    }
                    if (i5 > this.f1557r.k()) {
                        ((d0) ((View) g0Var.f1688a.get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                }
                bitSet.clear(d0Var.f1663e.f1691e);
            }
            i2 += i3;
            if (i2 != v2) {
                View u3 = u(i2);
                if (this.f1563x) {
                    int b = this.f1557r.b(u2);
                    int b2 = this.f1557r.b(u3);
                    if (b < b2) {
                        return u2;
                    }
                    if (b != b2) {
                        continue;
                    }
                } else {
                    int e2 = this.f1557r.e(u2);
                    int e3 = this.f1557r.e(u3);
                    if (e2 > e3) {
                        return u2;
                    }
                    if (e2 != e3) {
                        continue;
                    }
                }
                if (d0Var.f1663e.f1691e - ((d0) u3.getLayoutParams()).f1663e.f1691e < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c2 < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 != z3) {
                    return u2;
                }
            }
        }
        return null;
    }

    public final void P(int i2) {
        super.P(i2);
        for (int i3 = 0; i3 < this.f1555p; i3++) {
            g0 g0Var = this.f1556q[i3];
            int i4 = g0Var.b;
            if (i4 != Integer.MIN_VALUE) {
                g0Var.b = i4 + i2;
            }
            int i5 = g0Var.f1689c;
            if (i5 != Integer.MIN_VALUE) {
                g0Var.f1689c = i5 + i2;
            }
        }
    }

    public final boolean P0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    public final void Q0(View view, int i2, int i3) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.f1550G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        d0 d0Var = (d0) view.getLayoutParams();
        int c1 = c1(i2, d0Var.leftMargin + rect.left, d0Var.rightMargin + rect.right);
        int c12 = c1(i3, d0Var.topMargin + rect.top, d0Var.bottomMargin + rect.bottom);
        if (u0(view, c1, c12, d0Var)) {
            view.measure(c1, c12);
        }
    }

    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1554K);
        }
        for (int i2 = 0; i2 < this.f1555p; i2++) {
            this.f1556q[i2].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a6, code lost:
        if (r12 != r0.f1563x) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01aa, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0421, code lost:
        if (A0() != false) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0198, code lost:
        if (r0.f1563x != false) goto L_0x01aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R0(b0.P r17, b0.V r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            b0.f0 r3 = r0.f1549F
            r4 = -1
            b0.c0 r5 = r0.f1551H
            if (r3 != 0) goto L_0x0011
            int r3 = r0.f1565z
            if (r3 == r4) goto L_0x001e
        L_0x0011:
            int r3 = r2.b()
            if (r3 != 0) goto L_0x001e
            r16.g0(r17)
            r5.a()
            return
        L_0x001e:
            boolean r3 = r5.f1657e
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x002f
            int r3 = r0.f1565z
            if (r3 != r4) goto L_0x002f
            b0.f0 r3 = r0.f1549F
            if (r3 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = 0
            goto L_0x0030
        L_0x002f:
            r3 = 1
        L_0x0030:
            F.c r8 = r0.f1546B
            r9 = 0
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = r5.f1658g
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L_0x0220
            r5.a()
            b0.f0 r12 = r0.f1549F
            if (r12 == 0) goto L_0x00c3
            int r13 = r12.f1676h
            if (r13 <= 0) goto L_0x0088
            int r14 = r0.f1555p
            if (r13 != r14) goto L_0x007a
            r12 = 0
        L_0x0049:
            int r13 = r0.f1555p
            if (r12 >= r13) goto L_0x0088
            b0.g0[] r13 = r0.f1556q
            r13 = r13[r12]
            r13.b()
            b0.f0 r13 = r0.f1549F
            int[] r14 = r13.f1677i
            r14 = r14[r12]
            if (r14 == r11) goto L_0x006f
            boolean r13 = r13.f1682n
            if (r13 == 0) goto L_0x0068
            androidx.emoji2.text.g r13 = r0.f1557r
            int r13 = r13.g()
        L_0x0066:
            int r14 = r14 + r13
            goto L_0x006f
        L_0x0068:
            androidx.emoji2.text.g r13 = r0.f1557r
            int r13 = r13.k()
            goto L_0x0066
        L_0x006f:
            b0.g0[] r13 = r0.f1556q
            r13 = r13[r12]
            r13.b = r14
            r13.f1689c = r14
            int r12 = r12 + 1
            goto L_0x0049
        L_0x007a:
            r12.f1677i = r9
            r12.f1676h = r6
            r12.f1678j = r6
            r12.f1679k = r9
            r12.f1680l = r9
            int r13 = r12.f1675g
            r12.f = r13
        L_0x0088:
            b0.f0 r12 = r0.f1549F
            boolean r13 = r12.f1683o
            r0.f1548E = r13
            boolean r12 = r12.f1681m
            r0.c(r9)
            b0.f0 r13 = r0.f1549F
            if (r13 == 0) goto L_0x009d
            boolean r14 = r13.f1681m
            if (r14 == r12) goto L_0x009d
            r13.f1681m = r12
        L_0x009d:
            r0.f1562w = r12
            r0.l0()
            r0.X0()
            b0.f0 r12 = r0.f1549F
            int r13 = r12.f
            if (r13 == r4) goto L_0x00b2
            r0.f1565z = r13
            boolean r13 = r12.f1682n
            r5.f1655c = r13
            goto L_0x00b6
        L_0x00b2:
            boolean r13 = r0.f1563x
            r5.f1655c = r13
        L_0x00b6:
            int r13 = r12.f1678j
            if (r13 <= r7) goto L_0x00ca
            int[] r13 = r12.f1679k
            r8.b = r13
            java.util.ArrayList r12 = r12.f1680l
            r8.f194c = r12
            goto L_0x00ca
        L_0x00c3:
            r0.X0()
            boolean r12 = r0.f1563x
            r5.f1655c = r12
        L_0x00ca:
            boolean r12 = r2.f1613g
            if (r12 != 0) goto L_0x01dd
            int r12 = r0.f1565z
            if (r12 != r4) goto L_0x00d4
            goto L_0x01dd
        L_0x00d4:
            if (r12 < 0) goto L_0x01d9
            int r13 = r2.b()
            if (r12 < r13) goto L_0x00de
            goto L_0x01d9
        L_0x00de:
            b0.f0 r12 = r0.f1549F
            if (r12 == 0) goto L_0x00f3
            int r13 = r12.f
            if (r13 == r4) goto L_0x00f3
            int r12 = r12.f1676h
            if (r12 >= r7) goto L_0x00eb
            goto L_0x00f3
        L_0x00eb:
            r5.b = r11
            int r12 = r0.f1565z
            r5.f1654a = r12
            goto L_0x021e
        L_0x00f3:
            int r12 = r0.f1565z
            android.view.View r12 = r0.q(r12)
            if (r12 == 0) goto L_0x0188
            boolean r13 = r0.f1563x
            if (r13 == 0) goto L_0x0104
            int r13 = r0.K0()
            goto L_0x0108
        L_0x0104:
            int r13 = r0.J0()
        L_0x0108:
            r5.f1654a = r13
            int r13 = r0.f1545A
            if (r13 == r11) goto L_0x013a
            boolean r13 = r5.f1655c
            if (r13 == 0) goto L_0x0126
            androidx.emoji2.text.g r13 = r0.f1557r
            int r13 = r13.g()
            int r14 = r0.f1545A
            int r13 = r13 - r14
            androidx.emoji2.text.g r14 = r0.f1557r
            int r12 = r14.b(r12)
            int r13 = r13 - r12
            r5.b = r13
            goto L_0x021e
        L_0x0126:
            androidx.emoji2.text.g r13 = r0.f1557r
            int r13 = r13.k()
            int r14 = r0.f1545A
            int r13 = r13 + r14
            androidx.emoji2.text.g r14 = r0.f1557r
            int r12 = r14.e(r12)
            int r13 = r13 - r12
            r5.b = r13
            goto L_0x021e
        L_0x013a:
            androidx.emoji2.text.g r13 = r0.f1557r
            int r13 = r13.c(r12)
            androidx.emoji2.text.g r14 = r0.f1557r
            int r14 = r14.l()
            if (r13 <= r14) goto L_0x015d
            boolean r12 = r5.f1655c
            if (r12 == 0) goto L_0x0153
            androidx.emoji2.text.g r12 = r0.f1557r
            int r12 = r12.g()
            goto L_0x0159
        L_0x0153:
            androidx.emoji2.text.g r12 = r0.f1557r
            int r12 = r12.k()
        L_0x0159:
            r5.b = r12
            goto L_0x021e
        L_0x015d:
            androidx.emoji2.text.g r13 = r0.f1557r
            int r13 = r13.e(r12)
            androidx.emoji2.text.g r14 = r0.f1557r
            int r14 = r14.k()
            int r13 = r13 - r14
            if (r13 >= 0) goto L_0x0171
            int r12 = -r13
            r5.b = r12
            goto L_0x021e
        L_0x0171:
            androidx.emoji2.text.g r13 = r0.f1557r
            int r13 = r13.g()
            androidx.emoji2.text.g r14 = r0.f1557r
            int r12 = r14.b(r12)
            int r13 = r13 - r12
            if (r13 >= 0) goto L_0x0184
            r5.b = r13
            goto L_0x021e
        L_0x0184:
            r5.b = r11
            goto L_0x021e
        L_0x0188:
            int r12 = r0.f1565z
            r5.f1654a = r12
            int r13 = r0.f1545A
            if (r13 != r11) goto L_0x01bf
            int r13 = r0.v()
            if (r13 != 0) goto L_0x019b
            boolean r12 = r0.f1563x
            if (r12 == 0) goto L_0x01a8
            goto L_0x01aa
        L_0x019b:
            int r13 = r0.J0()
            if (r12 >= r13) goto L_0x01a3
            r12 = 1
            goto L_0x01a4
        L_0x01a3:
            r12 = 0
        L_0x01a4:
            boolean r13 = r0.f1563x
            if (r12 == r13) goto L_0x01aa
        L_0x01a8:
            r12 = 0
            goto L_0x01ab
        L_0x01aa:
            r12 = 1
        L_0x01ab:
            r5.f1655c = r12
            if (r12 == 0) goto L_0x01b6
            androidx.emoji2.text.g r12 = r10.f1557r
            int r12 = r12.g()
            goto L_0x01bc
        L_0x01b6:
            androidx.emoji2.text.g r12 = r10.f1557r
            int r12 = r12.k()
        L_0x01bc:
            r5.b = r12
            goto L_0x01d6
        L_0x01bf:
            boolean r12 = r5.f1655c
            if (r12 == 0) goto L_0x01cd
            androidx.emoji2.text.g r12 = r10.f1557r
            int r12 = r12.g()
            int r12 = r12 - r13
            r5.b = r12
            goto L_0x01d6
        L_0x01cd:
            androidx.emoji2.text.g r12 = r10.f1557r
            int r12 = r12.k()
            int r12 = r12 + r13
            r5.b = r12
        L_0x01d6:
            r5.f1656d = r7
            goto L_0x021e
        L_0x01d9:
            r0.f1565z = r4
            r0.f1545A = r11
        L_0x01dd:
            boolean r12 = r0.D
            if (r12 == 0) goto L_0x01fe
            int r12 = r2.b()
            int r13 = r0.v()
            int r13 = r13 - r7
        L_0x01ea:
            if (r13 < 0) goto L_0x01fc
            android.view.View r14 = r0.u(r13)
            int r14 = b0.J.H(r14)
            if (r14 < 0) goto L_0x01f9
            if (r14 >= r12) goto L_0x01f9
            goto L_0x021a
        L_0x01f9:
            int r13 = r13 + -1
            goto L_0x01ea
        L_0x01fc:
            r14 = 0
            goto L_0x021a
        L_0x01fe:
            int r12 = r2.b()
            int r13 = r0.v()
            r14 = 0
        L_0x0207:
            if (r14 >= r13) goto L_0x01fc
            android.view.View r15 = r0.u(r14)
            int r15 = b0.J.H(r15)
            if (r15 < 0) goto L_0x0217
            if (r15 >= r12) goto L_0x0217
            r14 = r15
            goto L_0x021a
        L_0x0217:
            int r14 = r14 + 1
            goto L_0x0207
        L_0x021a:
            r5.f1654a = r14
            r5.b = r11
        L_0x021e:
            r5.f1657e = r7
        L_0x0220:
            b0.f0 r12 = r0.f1549F
            if (r12 != 0) goto L_0x0243
            int r12 = r0.f1565z
            if (r12 != r4) goto L_0x0243
            boolean r12 = r5.f1655c
            boolean r13 = r0.D
            if (r12 != r13) goto L_0x0236
            boolean r12 = r0.P0()
            boolean r13 = r0.f1548E
            if (r12 == r13) goto L_0x0243
        L_0x0236:
            java.lang.Object r12 = r8.b
            int[] r12 = (int[]) r12
            if (r12 == 0) goto L_0x023f
            java.util.Arrays.fill(r12, r4)
        L_0x023f:
            r8.f194c = r9
            r5.f1656d = r7
        L_0x0243:
            int r8 = r0.v()
            if (r8 <= 0) goto L_0x02ee
            b0.f0 r8 = r0.f1549F
            if (r8 == 0) goto L_0x0251
            int r8 = r8.f1676h
            if (r8 >= r7) goto L_0x02ee
        L_0x0251:
            boolean r8 = r5.f1656d
            if (r8 == 0) goto L_0x0270
            r3 = 0
        L_0x0256:
            int r8 = r0.f1555p
            if (r3 >= r8) goto L_0x02ee
            b0.g0[] r8 = r0.f1556q
            r8 = r8[r3]
            r8.b()
            int r8 = r5.b
            if (r8 == r11) goto L_0x026d
            b0.g0[] r9 = r0.f1556q
            r9 = r9[r3]
            r9.b = r8
            r9.f1689c = r8
        L_0x026d:
            int r3 = r3 + 1
            goto L_0x0256
        L_0x0270:
            if (r3 != 0) goto L_0x028e
            int[] r3 = r5.f
            if (r3 != 0) goto L_0x0277
            goto L_0x028e
        L_0x0277:
            r3 = 0
        L_0x0278:
            int r8 = r0.f1555p
            if (r3 >= r8) goto L_0x02ee
            b0.g0[] r8 = r0.f1556q
            r8 = r8[r3]
            r8.b()
            int[] r9 = r5.f
            r9 = r9[r3]
            r8.b = r9
            r8.f1689c = r9
            int r3 = r3 + 1
            goto L_0x0278
        L_0x028e:
            r3 = 0
        L_0x028f:
            int r8 = r0.f1555p
            if (r3 >= r8) goto L_0x02cd
            b0.g0[] r8 = r0.f1556q
            r8 = r8[r3]
            boolean r9 = r0.f1563x
            int r12 = r5.b
            if (r9 == 0) goto L_0x02a2
            int r13 = r8.f(r11)
            goto L_0x02a6
        L_0x02a2:
            int r13 = r8.h(r11)
        L_0x02a6:
            r8.b()
            if (r13 != r11) goto L_0x02ac
            goto L_0x02ca
        L_0x02ac:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = r8.f
            if (r9 == 0) goto L_0x02b8
            androidx.emoji2.text.g r15 = r14.f1557r
            int r15 = r15.g()
            if (r13 < r15) goto L_0x02ca
        L_0x02b8:
            if (r9 != 0) goto L_0x02c3
            androidx.emoji2.text.g r9 = r14.f1557r
            int r9 = r9.k()
            if (r13 <= r9) goto L_0x02c3
            goto L_0x02ca
        L_0x02c3:
            if (r12 == r11) goto L_0x02c6
            int r13 = r13 + r12
        L_0x02c6:
            r8.f1689c = r13
            r8.b = r13
        L_0x02ca:
            int r3 = r3 + 1
            goto L_0x028f
        L_0x02cd:
            b0.g0[] r3 = r0.f1556q
            int r8 = r3.length
            int[] r9 = r5.f
            if (r9 == 0) goto L_0x02d7
            int r9 = r9.length
            if (r9 >= r8) goto L_0x02de
        L_0x02d7:
            b0.g0[] r9 = r10.f1556q
            int r9 = r9.length
            int[] r9 = new int[r9]
            r5.f = r9
        L_0x02de:
            r9 = 0
        L_0x02df:
            if (r9 >= r8) goto L_0x02ee
            int[] r10 = r5.f
            r12 = r3[r9]
            int r12 = r12.h(r11)
            r10[r9] = r12
            int r9 = r9 + 1
            goto L_0x02df
        L_0x02ee:
            r16.p(r17)
            b0.r r3 = r0.f1561v
            r3.f1759a = r6
            androidx.emoji2.text.g r8 = r0.f1558s
            int r8 = r8.l()
            int r9 = r0.f1555p
            int r9 = r8 / r9
            r0.f1560u = r9
            androidx.emoji2.text.g r9 = r0.f1558s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r8 = r5.f1654a
            r0.a1(r8, r2)
            boolean r8 = r5.f1655c
            if (r8 == 0) goto L_0x0327
            r0.Z0(r4)
            r0.E0(r1, r3, r2)
            r0.Z0(r7)
            int r4 = r5.f1654a
            int r8 = r3.f1761d
            int r4 = r4 + r8
            r3.f1760c = r4
            r0.E0(r1, r3, r2)
            goto L_0x033a
        L_0x0327:
            r0.Z0(r7)
            r0.E0(r1, r3, r2)
            r0.Z0(r4)
            int r4 = r5.f1654a
            int r8 = r3.f1761d
            int r4 = r4 + r8
            r3.f1760c = r4
            r0.E0(r1, r3, r2)
        L_0x033a:
            androidx.emoji2.text.g r3 = r0.f1558s
            int r3 = r3.i()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L_0x0346
            goto L_0x03e7
        L_0x0346:
            int r3 = r0.v()
            r4 = 0
            r8 = 0
        L_0x034c:
            if (r8 >= r3) goto L_0x036e
            android.view.View r9 = r0.u(r8)
            androidx.emoji2.text.g r10 = r0.f1558s
            int r10 = r10.c(r9)
            float r10 = (float) r10
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x035e
            goto L_0x036b
        L_0x035e:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            b0.d0 r9 = (b0.d0) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r10)
        L_0x036b:
            int r8 = r8 + 1
            goto L_0x034c
        L_0x036e:
            int r8 = r0.f1560u
            int r9 = r0.f1555p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            androidx.emoji2.text.g r9 = r0.f1558s
            int r9 = r9.i()
            if (r9 != r11) goto L_0x038b
            androidx.emoji2.text.g r9 = r0.f1558s
            int r9 = r9.l()
            int r4 = java.lang.Math.min(r4, r9)
        L_0x038b:
            int r9 = r0.f1555p
            int r9 = r4 / r9
            r0.f1560u = r9
            androidx.emoji2.text.g r9 = r0.f1558s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.f1560u
            if (r4 != r8) goto L_0x039f
            goto L_0x03e7
        L_0x039f:
            r4 = 0
        L_0x03a0:
            if (r4 >= r3) goto L_0x03e7
            android.view.View r9 = r0.u(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            b0.d0 r10 = (b0.d0) r10
            r10.getClass()
            boolean r11 = r0.P0()
            if (r11 == 0) goto L_0x03cd
            int r11 = r0.f1559t
            if (r11 != r7) goto L_0x03cd
            int r11 = r0.f1555p
            int r11 = r11 - r7
            b0.g0 r10 = r10.f1663e
            int r10 = r10.f1691e
            int r11 = r11 - r10
            int r10 = -r11
            int r11 = r0.f1560u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03e4
        L_0x03cd:
            b0.g0 r10 = r10.f1663e
            int r10 = r10.f1691e
            int r11 = r0.f1560u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r12 = r0.f1559t
            if (r12 != r7) goto L_0x03e0
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03e4
        L_0x03e0:
            int r11 = r11 - r10
            r9.offsetTopAndBottom(r11)
        L_0x03e4:
            int r4 = r4 + 1
            goto L_0x03a0
        L_0x03e7:
            int r3 = r0.v()
            if (r3 <= 0) goto L_0x03fe
            boolean r3 = r0.f1563x
            if (r3 == 0) goto L_0x03f8
            r0.H0(r1, r2, r7)
            r0.I0(r1, r2, r6)
            goto L_0x03fe
        L_0x03f8:
            r0.I0(r1, r2, r7)
            r0.H0(r1, r2, r6)
        L_0x03fe:
            if (r19 == 0) goto L_0x0424
            boolean r3 = r2.f1613g
            if (r3 != 0) goto L_0x0424
            int r3 = r0.f1547C
            if (r3 == 0) goto L_0x0424
            int r3 = r0.v()
            if (r3 <= 0) goto L_0x0424
            android.view.View r3 = r0.O0()
            if (r3 == 0) goto L_0x0424
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r3 == 0) goto L_0x041d
            H0.E r4 = r0.f1554K
            r3.removeCallbacks(r4)
        L_0x041d:
            boolean r3 = r0.A0()
            if (r3 == 0) goto L_0x0424
            goto L_0x0425
        L_0x0424:
            r7 = 0
        L_0x0425:
            boolean r3 = r2.f1613g
            if (r3 == 0) goto L_0x042c
            r5.a()
        L_0x042c:
            boolean r3 = r5.f1655c
            r0.D = r3
            boolean r3 = r0.P0()
            r0.f1548E = r3
            if (r7 == 0) goto L_0x043e
            r5.a()
            r0.R0(r1, r2, r6)
        L_0x043e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0(b0.P, b0.V, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (r8.f1559t == 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
        if (r8.f1559t == 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
        if (P0() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        if (P0() == false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View S(android.view.View r9, int r10, b0.P r11, b0.V r12) {
        /*
            r8 = this;
            int r0 = r8.v()
            r1 = 0
            if (r0 != 0) goto L_0x0009
            goto L_0x0161
        L_0x0009:
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            if (r0 != 0) goto L_0x000e
            goto L_0x0021
        L_0x000e:
            android.view.View r9 = r0.A(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x0021
        L_0x0015:
            N.g r0 = r8.f1577a
            java.lang.Object r0 = r0.f607d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r9 = r1
        L_0x0022:
            if (r9 != 0) goto L_0x0026
            goto L_0x0161
        L_0x0026:
            r8.X0()
            r0 = 1
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0067
            r4 = 2
            if (r10 == r4) goto L_0x005b
            r4 = 17
            if (r10 == r4) goto L_0x0056
            r4 = 33
            if (r10 == r4) goto L_0x0050
            r4 = 66
            if (r10 == r4) goto L_0x004b
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x0045
        L_0x0042:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0073
        L_0x0045:
            int r10 = r8.f1559t
            if (r10 != r0) goto L_0x0042
        L_0x0049:
            r10 = 1
            goto L_0x0073
        L_0x004b:
            int r10 = r8.f1559t
            if (r10 != 0) goto L_0x0042
            goto L_0x0049
        L_0x0050:
            int r10 = r8.f1559t
            if (r10 != r0) goto L_0x0042
        L_0x0054:
            r10 = -1
            goto L_0x0073
        L_0x0056:
            int r10 = r8.f1559t
            if (r10 != 0) goto L_0x0042
        L_0x005a:
            goto L_0x0054
        L_0x005b:
            int r10 = r8.f1559t
            if (r10 != r0) goto L_0x0060
            goto L_0x0049
        L_0x0060:
            boolean r10 = r8.P0()
            if (r10 == 0) goto L_0x0049
            goto L_0x0054
        L_0x0067:
            int r10 = r8.f1559t
            if (r10 != r0) goto L_0x006c
            goto L_0x005a
        L_0x006c:
            boolean r10 = r8.P0()
            if (r10 == 0) goto L_0x0054
            goto L_0x0049
        L_0x0073:
            if (r10 != r3) goto L_0x0077
            goto L_0x0161
        L_0x0077:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            b0.d0 r3 = (b0.d0) r3
            r3.getClass()
            b0.g0 r3 = r3.f1663e
            if (r10 != r0) goto L_0x0089
            int r4 = r8.K0()
            goto L_0x008d
        L_0x0089:
            int r4 = r8.J0()
        L_0x008d:
            r8.a1(r4, r12)
            r8.Z0(r10)
            b0.r r5 = r8.f1561v
            int r6 = r5.f1761d
            int r6 = r6 + r4
            r5.f1760c = r6
            androidx.emoji2.text.g r6 = r8.f1557r
            int r6 = r6.l()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.b = r6
            r5.f1764h = r0
            r6 = 0
            r5.f1759a = r6
            r8.E0(r11, r5, r12)
            boolean r11 = r8.f1563x
            r8.D = r11
            android.view.View r11 = r3.g(r4, r10)
            if (r11 == 0) goto L_0x00be
            if (r11 == r9) goto L_0x00be
            return r11
        L_0x00be:
            boolean r11 = r8.S0(r10)
            if (r11 == 0) goto L_0x00d9
            int r11 = r8.f1555p
            int r11 = r11 - r0
        L_0x00c7:
            if (r11 < 0) goto L_0x00ee
            b0.g0[] r12 = r8.f1556q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00d6
            if (r12 == r9) goto L_0x00d6
            return r12
        L_0x00d6:
            int r11 = r11 + -1
            goto L_0x00c7
        L_0x00d9:
            r11 = 0
        L_0x00da:
            int r12 = r8.f1555p
            if (r11 >= r12) goto L_0x00ee
            b0.g0[] r12 = r8.f1556q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00eb
            if (r12 == r9) goto L_0x00eb
            return r12
        L_0x00eb:
            int r11 = r11 + 1
            goto L_0x00da
        L_0x00ee:
            boolean r11 = r8.f1562w
            r11 = r11 ^ r0
            if (r10 != r2) goto L_0x00f5
            r12 = 1
            goto L_0x00f6
        L_0x00f5:
            r12 = 0
        L_0x00f6:
            if (r11 != r12) goto L_0x00fa
            r11 = 1
            goto L_0x00fb
        L_0x00fa:
            r11 = 0
        L_0x00fb:
            if (r11 == 0) goto L_0x0102
            int r12 = r3.c()
            goto L_0x0106
        L_0x0102:
            int r12 = r3.d()
        L_0x0106:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x010f
            if (r12 == r9) goto L_0x010f
            return r12
        L_0x010f:
            boolean r10 = r8.S0(r10)
            if (r10 == 0) goto L_0x013e
            int r10 = r8.f1555p
            int r10 = r10 - r0
        L_0x0118:
            if (r10 < 0) goto L_0x0161
            int r12 = r3.f1691e
            if (r10 != r12) goto L_0x011f
            goto L_0x013b
        L_0x011f:
            if (r11 == 0) goto L_0x012a
            b0.g0[] r12 = r8.f1556q
            r12 = r12[r10]
            int r12 = r12.c()
            goto L_0x0132
        L_0x012a:
            b0.g0[] r12 = r8.f1556q
            r12 = r12[r10]
            int r12 = r12.d()
        L_0x0132:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x013b
            if (r12 == r9) goto L_0x013b
            return r12
        L_0x013b:
            int r10 = r10 + -1
            goto L_0x0118
        L_0x013e:
            int r10 = r8.f1555p
            if (r6 >= r10) goto L_0x0161
            if (r11 == 0) goto L_0x014d
            b0.g0[] r10 = r8.f1556q
            r10 = r10[r6]
            int r10 = r10.c()
            goto L_0x0155
        L_0x014d:
            b0.g0[] r10 = r8.f1556q
            r10 = r10[r6]
            int r10 = r10.d()
        L_0x0155:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L_0x015e
            if (r10 == r9) goto L_0x015e
            return r10
        L_0x015e:
            int r6 = r6 + 1
            goto L_0x013e
        L_0x0161:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S(android.view.View, int, b0.P, b0.V):android.view.View");
    }

    public final boolean S0(int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f1559t == 0) {
            if (i2 == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 != this.f1563x) {
                return true;
            }
            return false;
        }
        if (i2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == this.f1563x) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == P0()) {
            return true;
        }
        return false;
    }

    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View G02 = G0(false);
            View F02 = F0(false);
            if (G02 != null && F02 != null) {
                int H2 = J.H(G02);
                int H3 = J.H(F02);
                if (H2 < H3) {
                    accessibilityEvent.setFromIndex(H2);
                    accessibilityEvent.setToIndex(H3);
                    return;
                }
                accessibilityEvent.setFromIndex(H3);
                accessibilityEvent.setToIndex(H2);
            }
        }
    }

    public final void T0(int i2, V v2) {
        int i3;
        int i4;
        if (i2 > 0) {
            i4 = K0();
            i3 = 1;
        } else {
            i4 = J0();
            i3 = -1;
        }
        r rVar = this.f1561v;
        rVar.f1759a = true;
        a1(i4, v2);
        Z0(i3);
        rVar.f1760c = i4 + rVar.f1761d;
        rVar.b = Math.abs(i2);
    }

    public final void U0(P p2, r rVar) {
        int i2;
        int i3;
        if (rVar.f1759a && !rVar.f1765i) {
            if (rVar.b != 0) {
                int i4 = 1;
                if (rVar.f1762e == -1) {
                    int i5 = rVar.f;
                    int h2 = this.f1556q[0].h(i5);
                    while (i4 < this.f1555p) {
                        int h3 = this.f1556q[i4].h(i5);
                        if (h3 > h2) {
                            h2 = h3;
                        }
                        i4++;
                    }
                    int i6 = i5 - h2;
                    if (i6 < 0) {
                        i3 = rVar.f1763g;
                    } else {
                        i3 = rVar.f1763g - Math.min(i6, rVar.b);
                    }
                    V0(p2, i3);
                    return;
                }
                int i7 = rVar.f1763g;
                int f = this.f1556q[0].f(i7);
                while (i4 < this.f1555p) {
                    int f2 = this.f1556q[i4].f(i7);
                    if (f2 < f) {
                        f = f2;
                    }
                    i4++;
                }
                int i8 = f - rVar.f1763g;
                if (i8 < 0) {
                    i2 = rVar.f;
                } else {
                    i2 = Math.min(i8, rVar.b) + rVar.f;
                }
                W0(p2, i2);
            } else if (rVar.f1762e == -1) {
                V0(p2, rVar.f1763g);
            } else {
                W0(p2, rVar.f);
            }
        }
    }

    public final void V(P p2, V v2, View view, J.l lVar) {
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof d0)) {
            U(view, lVar);
            return;
        }
        d0 d0Var = (d0) layoutParams;
        if (this.f1559t == 0) {
            g0 g0Var = d0Var.f1663e;
            if (g0Var == null) {
                i3 = -1;
            } else {
                i3 = g0Var.f1691e;
            }
            lVar.i(k.a(false, i3, 1, -1, -1));
            return;
        }
        g0 g0Var2 = d0Var.f1663e;
        if (g0Var2 == null) {
            i2 = -1;
        } else {
            i2 = g0Var2.f1691e;
        }
        lVar.i(k.a(false, -1, -1, i2, 1));
    }

    public final void V0(P p2, int i2) {
        int v2 = v() - 1;
        while (v2 >= 0) {
            View u2 = u(v2);
            if (this.f1557r.e(u2) >= i2 && this.f1557r.n(u2) >= i2) {
                d0 d0Var = (d0) u2.getLayoutParams();
                d0Var.getClass();
                if (d0Var.f1663e.f1688a.size() != 1) {
                    g0 g0Var = d0Var.f1663e;
                    ArrayList arrayList = g0Var.f1688a;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    d0 d0Var2 = (d0) view.getLayoutParams();
                    d0Var2.f1663e = null;
                    if (d0Var2.f1590a.h() || d0Var2.f1590a.k()) {
                        g0Var.f1690d -= g0Var.f.f1557r.c(view);
                    }
                    if (size == 1) {
                        g0Var.b = Integer.MIN_VALUE;
                    }
                    g0Var.f1689c = Integer.MIN_VALUE;
                    i0(u2, p2);
                    v2--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void W(int i2, int i3) {
        N0(i2, i3, 1);
    }

    public final void W0(P p2, int i2) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f1557r.b(u2) <= i2 && this.f1557r.m(u2) <= i2) {
                d0 d0Var = (d0) u2.getLayoutParams();
                d0Var.getClass();
                if (d0Var.f1663e.f1688a.size() != 1) {
                    g0 g0Var = d0Var.f1663e;
                    ArrayList arrayList = g0Var.f1688a;
                    View view = (View) arrayList.remove(0);
                    d0 d0Var2 = (d0) view.getLayoutParams();
                    d0Var2.f1663e = null;
                    if (arrayList.size() == 0) {
                        g0Var.f1689c = Integer.MIN_VALUE;
                    }
                    if (d0Var2.f1590a.h() || d0Var2.f1590a.k()) {
                        g0Var.f1690d -= g0Var.f.f1557r.c(view);
                    }
                    g0Var.b = Integer.MIN_VALUE;
                    i0(u2, p2);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void X() {
        c cVar = this.f1546B;
        int[] iArr = (int[]) cVar.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        cVar.f194c = null;
        l0();
    }

    public final void X0() {
        if (this.f1559t == 1 || !P0()) {
            this.f1563x = this.f1562w;
        } else {
            this.f1563x = !this.f1562w;
        }
    }

    public final void Y(int i2, int i3) {
        N0(i2, i3, 8);
    }

    public final int Y0(int i2, P p2, V v2) {
        if (v() == 0 || i2 == 0) {
            return 0;
        }
        T0(i2, v2);
        r rVar = this.f1561v;
        int E02 = E0(p2, rVar, v2);
        if (rVar.b >= E02) {
            if (i2 < 0) {
                i2 = -E02;
            } else {
                i2 = E02;
            }
        }
        this.f1557r.o(-i2);
        this.D = this.f1563x;
        rVar.b = 0;
        U0(p2, rVar);
        return i2;
    }

    public final void Z(int i2, int i3) {
        N0(i2, i3, 2);
    }

    public final void Z0(int i2) {
        boolean z2;
        r rVar = this.f1561v;
        rVar.f1762e = i2;
        boolean z3 = this.f1563x;
        int i3 = 1;
        if (i2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z3 != z2) {
            i3 = -1;
        }
        rVar.f1761d = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r4 != r3.f1563x) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3.f1563x != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto L_0x000e
            boolean r4 = r3.f1563x
            if (r4 == 0) goto L_0x001b
        L_0x000c:
            r1 = 1
            goto L_0x001b
        L_0x000e:
            int r0 = r3.J0()
            if (r4 >= r0) goto L_0x0016
            r4 = 1
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            boolean r0 = r3.f1563x
            if (r4 == r0) goto L_0x000c
        L_0x001b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L_0x0024
            r4 = 0
            return r4
        L_0x0024:
            int r0 = r3.f1559t
            r2 = 0
            if (r0 != 0) goto L_0x002f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L_0x002f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    public final void a0(int i2, int i3) {
        N0(i2, i3, 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a1(int r5, b0.V r6) {
        /*
            r4 = this;
            b0.r r0 = r4.f1561v
            r1 = 0
            r0.b = r1
            r0.f1760c = r5
            b0.w r2 = r4.f1580e
            r3 = 1
            if (r2 == 0) goto L_0x0012
            boolean r2 = r2.f1788e
            if (r2 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0034
            int r6 = r6.f1609a
            r2 = -1
            if (r6 == r2) goto L_0x0034
            boolean r2 = r4.f1563x
            if (r6 >= r5) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            if (r2 != r5) goto L_0x002b
            androidx.emoji2.text.g r5 = r4.f1557r
            int r5 = r5.l()
        L_0x0029:
            r6 = 0
            goto L_0x0036
        L_0x002b:
            androidx.emoji2.text.g r5 = r4.f1557r
            int r5 = r5.l()
            r6 = r5
            r5 = 0
            goto L_0x0036
        L_0x0034:
            r5 = 0
            goto L_0x0029
        L_0x0036:
            androidx.recyclerview.widget.RecyclerView r2 = r4.b
            if (r2 == 0) goto L_0x0051
            boolean r2 = r2.f1514g
            if (r2 == 0) goto L_0x0051
            androidx.emoji2.text.g r2 = r4.f1557r
            int r2 = r2.k()
            int r2 = r2 - r6
            r0.f = r2
            androidx.emoji2.text.g r6 = r4.f1557r
            int r6 = r6.g()
            int r6 = r6 + r5
            r0.f1763g = r6
            goto L_0x005d
        L_0x0051:
            androidx.emoji2.text.g r2 = r4.f1557r
            int r2 = r2.f()
            int r2 = r2 + r5
            r0.f1763g = r2
            int r5 = -r6
            r0.f = r5
        L_0x005d:
            r0.f1764h = r1
            r0.f1759a = r3
            androidx.emoji2.text.g r5 = r4.f1557r
            int r5 = r5.i()
            if (r5 != 0) goto L_0x0072
            androidx.emoji2.text.g r5 = r4.f1557r
            int r5 = r5.f()
            if (r5 != 0) goto L_0x0072
            r1 = 1
        L_0x0072:
            r0.f1765i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a1(int, b0.V):void");
    }

    public final void b0(P p2, V v2) {
        R0(p2, v2, true);
    }

    public final void b1(g0 g0Var, int i2, int i3) {
        int i4 = g0Var.f1690d;
        int i5 = g0Var.f1691e;
        if (i2 == -1) {
            int i6 = g0Var.b;
            if (i6 == Integer.MIN_VALUE) {
                View view = (View) g0Var.f1688a.get(0);
                g0Var.b = g0Var.f.f1557r.e(view);
                ((d0) view.getLayoutParams()).getClass();
                i6 = g0Var.b;
            }
            if (i6 + i4 <= i3) {
                this.f1564y.set(i5, false);
                return;
            }
            return;
        }
        int i7 = g0Var.f1689c;
        if (i7 == Integer.MIN_VALUE) {
            g0Var.a();
            i7 = g0Var.f1689c;
        }
        if (i7 - i4 >= i3) {
            this.f1564y.set(i5, false);
        }
    }

    public final void c(String str) {
        if (this.f1549F == null) {
            super.c(str);
        }
    }

    public final void c0(V v2) {
        this.f1565z = -1;
        this.f1545A = Integer.MIN_VALUE;
        this.f1549F = null;
        this.f1551H.a();
    }

    public final boolean d() {
        if (this.f1559t == 0) {
            return true;
        }
        return false;
    }

    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof f0) {
            this.f1549F = (f0) parcelable;
            l0();
        }
    }

    public final boolean e() {
        if (this.f1559t == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [b0.f0, android.os.Parcelable, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v28, types: [b0.f0, android.os.Parcelable, java.lang.Object] */
    public final Parcelable e0() {
        int i2;
        View view;
        int i3;
        int k2;
        int[] iArr;
        f0 f0Var = this.f1549F;
        if (f0Var != null) {
            ? obj = new Object();
            obj.f1676h = f0Var.f1676h;
            obj.f = f0Var.f;
            obj.f1675g = f0Var.f1675g;
            obj.f1677i = f0Var.f1677i;
            obj.f1678j = f0Var.f1678j;
            obj.f1679k = f0Var.f1679k;
            obj.f1681m = f0Var.f1681m;
            obj.f1682n = f0Var.f1682n;
            obj.f1683o = f0Var.f1683o;
            obj.f1680l = f0Var.f1680l;
            return obj;
        }
        ? obj2 = new Object();
        obj2.f1681m = this.f1562w;
        obj2.f1682n = this.D;
        obj2.f1683o = this.f1548E;
        c cVar = this.f1546B;
        if (cVar == null || (iArr = (int[]) cVar.b) == null) {
            obj2.f1678j = 0;
        } else {
            obj2.f1679k = iArr;
            obj2.f1678j = iArr.length;
            obj2.f1680l = (ArrayList) cVar.f194c;
        }
        int i4 = -1;
        if (v() > 0) {
            if (this.D) {
                i2 = K0();
            } else {
                i2 = J0();
            }
            obj2.f = i2;
            if (this.f1563x) {
                view = F0(true);
            } else {
                view = G0(true);
            }
            if (view != null) {
                i4 = J.H(view);
            }
            obj2.f1675g = i4;
            int i5 = this.f1555p;
            obj2.f1676h = i5;
            obj2.f1677i = new int[i5];
            for (int i6 = 0; i6 < this.f1555p; i6++) {
                if (this.D) {
                    i3 = this.f1556q[i6].f(Integer.MIN_VALUE);
                    if (i3 != Integer.MIN_VALUE) {
                        k2 = this.f1557r.g();
                    } else {
                        obj2.f1677i[i6] = i3;
                    }
                } else {
                    i3 = this.f1556q[i6].h(Integer.MIN_VALUE);
                    if (i3 != Integer.MIN_VALUE) {
                        k2 = this.f1557r.k();
                    } else {
                        obj2.f1677i[i6] = i3;
                    }
                }
                i3 -= k2;
                obj2.f1677i[i6] = i3;
            }
            return obj2;
        }
        obj2.f = -1;
        obj2.f1675g = -1;
        obj2.f1676h = 0;
        return obj2;
    }

    public final boolean f(K k2) {
        return k2 instanceof d0;
    }

    public final void f0(int i2) {
        if (i2 == 0) {
            A0();
        }
    }

    public final void h(int i2, int i3, V v2, C0090n nVar) {
        r rVar;
        int f;
        int i4;
        if (this.f1559t != 0) {
            i2 = i3;
        }
        if (v() != 0 && i2 != 0) {
            T0(i2, v2);
            int[] iArr = this.f1553J;
            if (iArr == null || iArr.length < this.f1555p) {
                this.f1553J = new int[this.f1555p];
            }
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = this.f1555p;
                rVar = this.f1561v;
                if (i6 >= i8) {
                    break;
                }
                if (rVar.f1761d == -1) {
                    f = rVar.f;
                    i4 = this.f1556q[i6].h(f);
                } else {
                    f = this.f1556q[i6].f(rVar.f1763g);
                    i4 = rVar.f1763g;
                }
                int i9 = f - i4;
                if (i9 >= 0) {
                    this.f1553J[i7] = i9;
                    i7++;
                }
                i6++;
            }
            Arrays.sort(this.f1553J, 0, i7);
            while (i5 < i7) {
                int i10 = rVar.f1760c;
                if (i10 >= 0 && i10 < v2.b()) {
                    nVar.a(rVar.f1760c, this.f1553J[i5]);
                    rVar.f1760c += rVar.f1761d;
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    public final int j(V v2) {
        return B0(v2);
    }

    public final int k(V v2) {
        return C0(v2);
    }

    public final int l(V v2) {
        return D0(v2);
    }

    public final int m(V v2) {
        return B0(v2);
    }

    public final int m0(int i2, P p2, V v2) {
        return Y0(i2, p2, v2);
    }

    public final int n(V v2) {
        return C0(v2);
    }

    public final void n0(int i2) {
        f0 f0Var = this.f1549F;
        if (!(f0Var == null || f0Var.f == i2)) {
            f0Var.f1677i = null;
            f0Var.f1676h = 0;
            f0Var.f = -1;
            f0Var.f1675g = -1;
        }
        this.f1565z = i2;
        this.f1545A = Integer.MIN_VALUE;
        l0();
    }

    public final int o(V v2) {
        return D0(v2);
    }

    public final int o0(int i2, P p2, V v2) {
        return Y0(i2, p2, v2);
    }

    public final K r() {
        if (this.f1559t == 0) {
            return new K(-2, -1);
        }
        return new K(-1, -2);
    }

    public final void r0(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.f1555p;
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f1559t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = O.f393a;
            i5 = J.g(i3, height, recyclerView.getMinimumHeight());
            i4 = J.g(i2, (this.f1560u * i6) + F2, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = O.f393a;
            i4 = J.g(i2, width, recyclerView2.getMinimumWidth());
            i5 = J.g(i3, (this.f1560u * i6) + D2, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(i4, i5);
    }

    public final K s(Context context, AttributeSet attributeSet) {
        return new K(context, attributeSet);
    }

    public final K t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new K((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new K(layoutParams);
    }

    public final int x(P p2, V v2) {
        if (this.f1559t == 1) {
            return this.f1555p;
        }
        return super.x(p2, v2);
    }

    public final void x0(RecyclerView recyclerView, int i2) {
        C0098w wVar = new C0098w(recyclerView.getContext());
        wVar.f1785a = i2;
        y0(wVar);
    }

    public final boolean z0() {
        if (this.f1549F == null) {
            return true;
        }
        return false;
    }
}
