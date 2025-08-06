package androidx.recyclerview.widget;

import A.g;
import F.c;
import I.O;
import J.k;
import J.l;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import b0.C0090n;
import b0.C0093q;
import b0.C0094s;
import b0.C0095t;
import b0.C0096u;
import b0.J;
import b0.K;
import b0.P;
import b0.V;
import java.util.Arrays;
import java.util.WeakHashMap;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E  reason: collision with root package name */
    public boolean f1456E = false;

    /* renamed from: F  reason: collision with root package name */
    public int f1457F = -1;

    /* renamed from: G  reason: collision with root package name */
    public int[] f1458G;

    /* renamed from: H  reason: collision with root package name */
    public View[] f1459H;

    /* renamed from: I  reason: collision with root package name */
    public final SparseIntArray f1460I = new SparseIntArray();

    /* renamed from: J  reason: collision with root package name */
    public final SparseIntArray f1461J = new SparseIntArray();

    /* renamed from: K  reason: collision with root package name */
    public final c f1462K = new c(10);

    /* renamed from: L  reason: collision with root package name */
    public final Rect f1463L = new Rect();

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        l1(J.I(context, attributeSet, i2, i3).b);
    }

    public final void B0(V v2, C0096u uVar, C0090n nVar) {
        int i2 = this.f1457F;
        for (int i3 = 0; i3 < this.f1457F && (r3 = uVar.f1775d) >= 0 && r3 < v2.b() && i2 > 0; i3++) {
            nVar.a(uVar.f1775d, Math.max(0, uVar.f1777g));
            this.f1462K.getClass();
            i2--;
            uVar.f1775d += uVar.f1776e;
        }
    }

    public final int J(P p2, V v2) {
        if (this.f1467p == 0) {
            return this.f1457F;
        }
        if (v2.b() < 1) {
            return 0;
        }
        return h1(v2.b() - 1, p2, v2) + 1;
    }

    public final View N0(P p2, V v2, int i2, int i3, int i4) {
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
            if (H2 >= 0 && H2 < i4 && i1(H2, p2, v2) == 0) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e2, code lost:
        if (r13 == r10) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0107, code lost:
        if (r13 == r9) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (((java.util.ArrayList) r0.f1577a.f607d).contains(r3) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View S(android.view.View r23, int r24, b0.P r25, b0.V r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            r4 = 0
            if (r3 != 0) goto L_0x000e
            r5 = r23
            goto L_0x0023
        L_0x000e:
            r5 = r23
            android.view.View r3 = r3.A(r5)
            if (r3 != 0) goto L_0x0017
            goto L_0x0023
        L_0x0017:
            N.g r6 = r0.f1577a
            java.lang.Object r6 = r6.f607d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x0024
        L_0x0023:
            r3 = r4
        L_0x0024:
            if (r3 != 0) goto L_0x0027
            goto L_0x0038
        L_0x0027:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            b0.q r6 = (b0.C0093q) r6
            int r7 = r6.f1758e
            int r6 = r6.f
            int r6 = r6 + r7
            android.view.View r5 = super.S(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0039
        L_0x0038:
            return r4
        L_0x0039:
            r5 = r24
            int r5 = r0.F0(r5)
            r9 = 1
            if (r5 != r9) goto L_0x0044
            r5 = 1
            goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            boolean r10 = r0.f1472u
            r11 = -1
            if (r5 == r10) goto L_0x0052
            int r5 = r0.v()
            int r5 = r5 - r9
            r10 = -1
            r12 = -1
            goto L_0x0059
        L_0x0052:
            int r5 = r0.v()
            r10 = r5
            r5 = 0
            r12 = 1
        L_0x0059:
            int r13 = r0.f1467p
            if (r13 != r9) goto L_0x0065
            boolean r13 = r0.S0()
            if (r13 == 0) goto L_0x0065
            r13 = 1
            goto L_0x0066
        L_0x0065:
            r13 = 0
        L_0x0066:
            int r14 = r0.h1(r5, r1, r2)
            r16 = r4
            r11 = r5
            r8 = -1
            r9 = 0
            r15 = -1
            r5 = r16
            r4 = 0
        L_0x0073:
            r17 = r5
            if (r11 == r10) goto L_0x0142
            int r5 = r0.h1(r11, r1, r2)
            android.view.View r1 = r0.u(r11)
            if (r1 != r3) goto L_0x0083
            goto L_0x0142
        L_0x0083:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0097
            if (r5 == r14) goto L_0x0097
            if (r16 == 0) goto L_0x008f
            goto L_0x0142
        L_0x008f:
            r18 = r3
            r19 = r9
            r21 = r10
            goto L_0x0133
        L_0x0097:
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            b0.q r5 = (b0.C0093q) r5
            int r2 = r5.f1758e
            r18 = r3
            int r3 = r5.f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00af
            if (r2 != r7) goto L_0x00af
            if (r3 != r6) goto L_0x00af
            return r1
        L_0x00af:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b7
            if (r16 == 0) goto L_0x00bf
        L_0x00b7:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c4
            if (r17 != 0) goto L_0x00c4
        L_0x00bf:
            r19 = r9
            r21 = r10
            goto L_0x0109
        L_0x00c4:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e8
            if (r10 <= r9) goto L_0x00db
        L_0x00d8:
            r19 = r9
            goto L_0x0109
        L_0x00db:
            if (r10 != r9) goto L_0x00e5
            if (r2 <= r15) goto L_0x00e1
            r10 = 1
            goto L_0x00e2
        L_0x00e1:
            r10 = 0
        L_0x00e2:
            if (r13 != r10) goto L_0x00e5
            goto L_0x00d8
        L_0x00e5:
            r19 = r9
            goto L_0x0133
        L_0x00e8:
            if (r16 != 0) goto L_0x00e5
            r19 = r9
            F.c r9 = r0.f1578c
            boolean r9 = r9.A(r1)
            if (r9 == 0) goto L_0x00fd
            F.c r9 = r0.f1579d
            boolean r9 = r9.A(r1)
            if (r9 == 0) goto L_0x00fd
            goto L_0x0133
        L_0x00fd:
            if (r10 <= r4) goto L_0x0100
            goto L_0x0109
        L_0x0100:
            if (r10 != r4) goto L_0x0133
            if (r2 <= r8) goto L_0x0106
            r9 = 1
            goto L_0x0107
        L_0x0106:
            r9 = 0
        L_0x0107:
            if (r13 != r9) goto L_0x0133
        L_0x0109:
            boolean r9 = r1.hasFocusable()
            if (r9 == 0) goto L_0x0121
            int r5 = r5.f1758e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r9 = r3 - r2
            r16 = r1
            r15 = r5
            r5 = r17
            goto L_0x0137
        L_0x0121:
            int r4 = r5.f1758e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r2 = r3 - r2
            r5 = r1
            r8 = r4
            r9 = r19
            r4 = r2
            goto L_0x0137
        L_0x0133:
            r5 = r17
            r9 = r19
        L_0x0137:
            int r11 = r11 + r12
            r1 = r25
            r2 = r26
            r3 = r18
            r10 = r21
            goto L_0x0073
        L_0x0142:
            if (r16 == 0) goto L_0x0145
            return r16
        L_0x0145:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S(android.view.View, int, b0.P, b0.V):android.view.View");
    }

    public final void T0(P p2, V v2, C0096u uVar, C0095t tVar) {
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        View b;
        P p3 = p2;
        V v3 = v2;
        C0096u uVar2 = uVar;
        C0095t tVar2 = tVar;
        int j2 = this.f1469r.j();
        if (j2 != 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (v() > 0) {
            i2 = this.f1458G[this.f1457F];
        } else {
            i2 = 0;
        }
        if (z2) {
            m1();
        }
        if (uVar2.f1776e == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i12 = this.f1457F;
        if (!z3) {
            i12 = i1(uVar2.f1775d, p3, v3) + j1(uVar2.f1775d, p3, v3);
        }
        int i13 = 0;
        while (i13 < this.f1457F && (r14 = uVar2.f1775d) >= 0 && r14 < v3.b() && i12 > 0) {
            int i14 = uVar2.f1775d;
            int j12 = j1(i14, p3, v3);
            if (j12 <= this.f1457F) {
                i12 -= j12;
                if (i12 < 0 || (b = uVar2.b(p3)) == null) {
                    break;
                }
                this.f1459H[i13] = b;
                i13++;
            } else {
                throw new IllegalArgumentException("Item at position " + i14 + " requires " + j12 + " spans but GridLayoutManager has only " + this.f1457F + " spans.");
            }
        }
        if (i13 == 0) {
            tVar2.f1770a = true;
            return;
        }
        if (z3) {
            i4 = i13;
            i5 = 0;
            i3 = 1;
        } else {
            i5 = i13 - 1;
            i4 = -1;
            i3 = -1;
        }
        int i15 = 0;
        while (i5 != i4) {
            View view = this.f1459H[i5];
            C0093q qVar = (C0093q) view.getLayoutParams();
            int j13 = j1(J.H(view), p3, v3);
            qVar.f = j13;
            qVar.f1758e = i15;
            i15 += j13;
            i5 += i3;
        }
        float f = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            View view2 = this.f1459H[i17];
            if (uVar2.f1781k != null) {
                z4 = false;
                if (z3) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z3) {
                z4 = false;
                b(view2, -1, false);
            } else {
                z4 = false;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.f1463L;
            if (recyclerView == null) {
                rect.set(z4 ? 1 : 0, z4, z4, z4);
            } else {
                rect.set(recyclerView.J(view2));
            }
            k1(view2, j2, z4);
            int c2 = this.f1469r.c(view2);
            if (c2 > i16) {
                i16 = c2;
            }
            float d2 = (((float) this.f1469r.d(view2)) * 1.0f) / ((float) ((C0093q) view2.getLayoutParams()).f);
            if (d2 > f) {
                f = d2;
            }
        }
        if (z2) {
            e1(Math.max(Math.round(f * ((float) this.f1457F)), i2));
            i16 = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                View view3 = this.f1459H[i18];
                k1(view3, 1073741824, true);
                int c3 = this.f1469r.c(view3);
                if (c3 > i16) {
                    i16 = c3;
                }
            }
        }
        for (int i19 = 0; i19 < i13; i19++) {
            View view4 = this.f1459H[i19];
            if (this.f1469r.c(view4) != i16) {
                C0093q qVar2 = (C0093q) view4.getLayoutParams();
                Rect rect2 = qVar2.b;
                int i20 = rect2.top + rect2.bottom + qVar2.topMargin + qVar2.bottomMargin;
                int i21 = rect2.left + rect2.right + qVar2.leftMargin + qVar2.rightMargin;
                int g12 = g1(qVar2.f1758e, qVar2.f);
                if (this.f1467p == 1) {
                    i11 = J.w(false, g12, 1073741824, i21, qVar2.width);
                    i10 = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    i10 = J.w(false, g12, 1073741824, i20, qVar2.height);
                    i11 = makeMeasureSpec;
                }
                if (w0(view4, i11, i10, (K) view4.getLayoutParams())) {
                    view4.measure(i11, i10);
                }
            }
        }
        tVar2.f1771c = i16;
        if (this.f1467p == 1) {
            if (uVar2.f == -1) {
                int i22 = uVar2.b;
                int i23 = i22;
                i6 = i22 - i16;
                i9 = i23;
            } else {
                i6 = uVar2.b;
                i9 = i6 + i16;
            }
            i8 = 0;
            i7 = 0;
        } else {
            if (uVar2.f == -1) {
                int i24 = uVar2.b;
                i8 = i24 - i16;
                i7 = i24;
            } else {
                int i25 = uVar2.b;
                i7 = i25 + i16;
                i8 = i25;
            }
            i9 = 0;
            i6 = 0;
        }
        for (int i26 = 0; i26 < i13; i26++) {
            View view5 = this.f1459H[i26];
            C0093q qVar3 = (C0093q) view5.getLayoutParams();
            if (this.f1467p != 1) {
                int G2 = G() + this.f1458G[qVar3.f1758e];
                i6 = G2;
                i9 = this.f1469r.d(view5) + G2;
            } else if (S0()) {
                int E2 = E() + this.f1458G[this.f1457F - qVar3.f1758e];
                i7 = E2;
                i8 = E2 - this.f1469r.d(view5);
            } else {
                i8 = E() + this.f1458G[qVar3.f1758e];
                i7 = this.f1469r.d(view5) + i8;
            }
            J.N(view5, i8, i6, i7, i9);
            if (qVar3.f1590a.h() || qVar3.f1590a.k()) {
                tVar2.b = true;
            }
            tVar2.f1772d = view5.hasFocusable() | tVar2.f1772d;
        }
        Arrays.fill(this.f1459H, (Object) null);
    }

    public final void U0(P p2, V v2, C0094s sVar, int i2) {
        boolean z2;
        m1();
        if (v2.b() > 0 && !v2.f1613g) {
            if (i2 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i12 = i1(sVar.b, p2, v2);
            if (z2) {
                while (i12 > 0) {
                    int i3 = sVar.b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    sVar.b = i4;
                    i12 = i1(i4, p2, v2);
                }
            } else {
                int b = v2.b() - 1;
                int i5 = sVar.b;
                while (i5 < b) {
                    int i6 = i5 + 1;
                    int i13 = i1(i6, p2, v2);
                    if (i13 <= i12) {
                        break;
                    }
                    i5 = i6;
                    i12 = i13;
                }
                sVar.b = i5;
            }
        }
        f1();
    }

    public final void V(P p2, V v2, View view, l lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0093q)) {
            U(view, lVar);
            return;
        }
        C0093q qVar = (C0093q) layoutParams;
        int h12 = h1(qVar.f1590a.b(), p2, v2);
        if (this.f1467p == 0) {
            lVar.i(k.a(false, qVar.f1758e, qVar.f, h12, 1));
        } else {
            lVar.i(k.a(false, h12, 1, qVar.f1758e, qVar.f));
        }
    }

    public final void W(int i2, int i3) {
        c cVar = this.f1462K;
        cVar.y();
        ((SparseIntArray) cVar.f194c).clear();
    }

    public final void X() {
        c cVar = this.f1462K;
        cVar.y();
        ((SparseIntArray) cVar.f194c).clear();
    }

    public final void Y(int i2, int i3) {
        c cVar = this.f1462K;
        cVar.y();
        ((SparseIntArray) cVar.f194c).clear();
    }

    public final void Z(int i2, int i3) {
        c cVar = this.f1462K;
        cVar.y();
        ((SparseIntArray) cVar.f194c).clear();
    }

    public final void a0(int i2, int i3) {
        c cVar = this.f1462K;
        cVar.y();
        ((SparseIntArray) cVar.f194c).clear();
    }

    public final void a1(boolean z2) {
        if (!z2) {
            super.a1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final void b0(P p2, V v2) {
        boolean z2 = v2.f1613g;
        SparseIntArray sparseIntArray = this.f1461J;
        SparseIntArray sparseIntArray2 = this.f1460I;
        if (z2) {
            int v3 = v();
            for (int i2 = 0; i2 < v3; i2++) {
                C0093q qVar = (C0093q) u(i2).getLayoutParams();
                int b = qVar.f1590a.b();
                sparseIntArray2.put(b, qVar.f);
                sparseIntArray.put(b, qVar.f1758e);
            }
        }
        super.b0(p2, v2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void c0(V v2) {
        super.c0(v2);
        this.f1456E = false;
    }

    public final void e1(int i2) {
        int i3;
        int[] iArr = this.f1458G;
        int i4 = this.f1457F;
        if (!(iArr != null && iArr.length == i4 + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i4 + 1)];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.f1458G = iArr;
    }

    public final boolean f(K k2) {
        return k2 instanceof C0093q;
    }

    public final void f1() {
        View[] viewArr = this.f1459H;
        if (viewArr == null || viewArr.length != this.f1457F) {
            this.f1459H = new View[this.f1457F];
        }
    }

    public final int g1(int i2, int i3) {
        if (this.f1467p != 1 || !S0()) {
            int[] iArr = this.f1458G;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f1458G;
        int i4 = this.f1457F;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public final int h1(int i2, P p2, V v2) {
        boolean z2 = v2.f1613g;
        c cVar = this.f1462K;
        if (!z2) {
            int i3 = this.f1457F;
            cVar.getClass();
            return c.w(i2, i3);
        }
        int b = p2.b(i2);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
            return 0;
        }
        int i4 = this.f1457F;
        cVar.getClass();
        return c.w(b, i4);
    }

    public final int i1(int i2, P p2, V v2) {
        boolean z2 = v2.f1613g;
        c cVar = this.f1462K;
        if (!z2) {
            int i3 = this.f1457F;
            cVar.getClass();
            return i2 % i3;
        }
        int i4 = this.f1461J.get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int b = p2.b(i2);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 0;
        }
        int i5 = this.f1457F;
        cVar.getClass();
        return b % i5;
    }

    public final int j1(int i2, P p2, V v2) {
        boolean z2 = v2.f1613g;
        c cVar = this.f1462K;
        if (!z2) {
            cVar.getClass();
            return 1;
        }
        int i3 = this.f1460I.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (p2.b(i2) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 1;
        }
        cVar.getClass();
        return 1;
    }

    public final int k(V v2) {
        return D0(v2);
    }

    public final void k1(View view, int i2, boolean z2) {
        int i3;
        int i4;
        boolean z3;
        C0093q qVar = (C0093q) view.getLayoutParams();
        Rect rect = qVar.b;
        int i5 = rect.top + rect.bottom + qVar.topMargin + qVar.bottomMargin;
        int i6 = rect.left + rect.right + qVar.leftMargin + qVar.rightMargin;
        int g12 = g1(qVar.f1758e, qVar.f);
        if (this.f1467p == 1) {
            i3 = J.w(false, g12, i2, i6, qVar.width);
            i4 = J.w(true, this.f1469r.l(), this.f1587m, i5, qVar.height);
        } else {
            int w2 = J.w(false, g12, i2, i5, qVar.height);
            int w3 = J.w(true, this.f1469r.l(), this.f1586l, i6, qVar.width);
            i4 = w2;
            i3 = w3;
        }
        K k2 = (K) view.getLayoutParams();
        if (z2) {
            z3 = w0(view, i3, i4, k2);
        } else {
            z3 = u0(view, i3, i4, k2);
        }
        if (z3) {
            view.measure(i3, i4);
        }
    }

    public final int l(V v2) {
        return E0(v2);
    }

    public final void l1(int i2) {
        if (i2 != this.f1457F) {
            this.f1456E = true;
            if (i2 >= 1) {
                this.f1457F = i2;
                this.f1462K.y();
                l0();
                return;
            }
            throw new IllegalArgumentException(g.f(i2, "Span count should be at least 1. Provided "));
        }
    }

    public final int m0(int i2, P p2, V v2) {
        m1();
        f1();
        return super.m0(i2, p2, v2);
    }

    public final void m1() {
        int D;
        int G2;
        if (this.f1467p == 1) {
            D = this.f1588n - F();
            G2 = E();
        } else {
            D = this.f1589o - D();
            G2 = G();
        }
        e1(D - G2);
    }

    public final int n(V v2) {
        return D0(v2);
    }

    public final int o(V v2) {
        return E0(v2);
    }

    public final int o0(int i2, P p2, V v2) {
        m1();
        f1();
        return super.o0(i2, p2, v2);
    }

    public final K r() {
        if (this.f1467p == 0) {
            return new C0093q(-2, -1);
        }
        return new C0093q(-1, -2);
    }

    public final void r0(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        if (this.f1458G == null) {
            super.r0(rect, i2, i3);
        }
        int F2 = F() + E();
        int D = D() + G();
        if (this.f1467p == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = O.f393a;
            i5 = J.g(i3, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f1458G;
            i4 = J.g(i2, iArr[iArr.length - 1] + F2, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = O.f393a;
            i4 = J.g(i2, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f1458G;
            i5 = J.g(i3, iArr2[iArr2.length - 1] + D, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(i4, i5);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [b0.K, b0.q] */
    public final K s(Context context, AttributeSet attributeSet) {
        ? k2 = new K(context, attributeSet);
        k2.f1758e = -1;
        k2.f = 0;
        return k2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [b0.K, b0.q] */
    /* JADX WARNING: type inference failed for: r0v2, types: [b0.K, b0.q] */
    public final K t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? k2 = new K((ViewGroup.MarginLayoutParams) layoutParams);
            k2.f1758e = -1;
            k2.f = 0;
            return k2;
        }
        ? k3 = new K(layoutParams);
        k3.f1758e = -1;
        k3.f = 0;
        return k3;
    }

    public final int x(P p2, V v2) {
        if (this.f1467p == 1) {
            return this.f1457F;
        }
        if (v2.b() < 1) {
            return 0;
        }
        return h1(v2.b() - 1, p2, v2) + 1;
    }

    public final boolean z0() {
        if (this.f1477z != null || this.f1456E) {
            return false;
        }
        return true;
    }

    public GridLayoutManager(int i2) {
        super(1);
        l1(i2);
    }
}
