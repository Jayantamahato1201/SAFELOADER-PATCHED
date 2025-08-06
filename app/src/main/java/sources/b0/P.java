package b0;

import I.C0010b;
import I.O;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1597a;
    public ArrayList b = null;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1598c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List f1599d;

    /* renamed from: e  reason: collision with root package name */
    public int f1600e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public O f1601g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1602h;

    public P(RecyclerView recyclerView) {
        this.f1602h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1597a = arrayList;
        this.f1599d = Collections.unmodifiableList(arrayList);
        this.f1600e = 2;
        this.f = 2;
    }

    public final void a(Y y2, boolean z2) {
        boolean z3;
        C0010b bVar;
        RecyclerView.j(y2);
        RecyclerView recyclerView = this.f1602h;
        a0 a0Var = recyclerView.f1521j0;
        if (a0Var != null) {
            Z z4 = a0Var.f1649e;
            if (z4 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            View view = y2.f1628a;
            if (z3) {
                bVar = (C0010b) z4.f1645e.remove(view);
            } else {
                bVar = null;
            }
            O.p(view, bVar);
        }
        if (z2 && recyclerView.f1509c0 != null) {
            recyclerView.f.J(y2);
        }
        y2.f1643r = null;
        O c2 = c();
        c2.getClass();
        int i2 = y2.f;
        ArrayList arrayList = c2.a(i2).f1593a;
        if (((N) c2.f1596a.get(i2)).b > arrayList.size()) {
            y2.m();
            arrayList.add(y2);
        }
    }

    public final int b(int i2) {
        RecyclerView recyclerView = this.f1602h;
        if (i2 < 0 || i2 >= recyclerView.f1509c0.b()) {
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.f1509c0.b() + recyclerView.y());
        } else if (!recyclerView.f1509c0.f1613g) {
            return i2;
        } else {
            return recyclerView.f1510d.f(i2, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [b0.O, java.lang.Object] */
    public final O c() {
        if (this.f1601g == null) {
            ? obj = new Object();
            obj.f1596a = new SparseArray();
            obj.b = 0;
            this.f1601g = obj;
        }
        return this.f1601g;
    }

    public final void d() {
        ArrayList arrayList = this.f1598c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        if (RecyclerView.f1480u0) {
            C0090n nVar = this.f1602h.f1507b0;
            int[] iArr = nVar.f1747c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            nVar.f1748d = 0;
        }
    }

    public final void e(int i2) {
        ArrayList arrayList = this.f1598c;
        a((Y) arrayList.get(i2), true);
        arrayList.remove(i2);
    }

    public final void f(View view) {
        Y I2 = RecyclerView.I(view);
        boolean j2 = I2.j();
        RecyclerView recyclerView = this.f1602h;
        if (j2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I2.i()) {
            I2.f1639n.j(I2);
        } else if (I2.p()) {
            I2.f1635j &= -33;
        }
        g(I2);
        if (recyclerView.f1489H != null && !I2.g()) {
            recyclerView.f1489H.d(I2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00af A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(b0.Y r12) {
        /*
            r11 = this;
            boolean r0 = r12.i()
            r1 = 0
            r2 = 1
            androidx.recyclerview.widget.RecyclerView r3 = r11.f1602h
            android.view.View r4 = r12.f1628a
            if (r0 != 0) goto L_0x00ea
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0014
            goto L_0x00ea
        L_0x0014:
            boolean r0 = r12.j()
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r12.o()
            if (r0 != 0) goto L_0x00b7
            int r0 = r12.f1635j
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = I.O.f393a
            boolean r0 = r4.hasTransientState()
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            b0.B r4 = r3.f1522k
            boolean r4 = r12.g()
            if (r4 == 0) goto L_0x00a7
            int r4 = r11.f
            if (r4 <= 0) goto L_0x009e
            int r4 = r12.f1635j
            r4 = r4 & 526(0x20e, float:7.37E-43)
            if (r4 == 0) goto L_0x0044
            goto L_0x009e
        L_0x0044:
            java.util.ArrayList r4 = r11.f1598c
            int r5 = r4.size()
            int r6 = r11.f
            if (r5 < r6) goto L_0x0055
            if (r5 <= 0) goto L_0x0055
            r11.e(r1)
            int r5 = r5 + -1
        L_0x0055:
            boolean r6 = androidx.recyclerview.widget.RecyclerView.f1480u0
            if (r6 == 0) goto L_0x0099
            if (r5 <= 0) goto L_0x0099
            b0.n r6 = r3.f1507b0
            int r7 = r12.f1629c
            int[] r8 = r6.f1747c
            if (r8 == 0) goto L_0x0074
            int r8 = r6.f1748d
            int r8 = r8 * 2
            r9 = 0
        L_0x0068:
            if (r9 >= r8) goto L_0x0074
            int[] r10 = r6.f1747c
            r10 = r10[r9]
            if (r10 != r7) goto L_0x0071
            goto L_0x0099
        L_0x0071:
            int r9 = r9 + 2
            goto L_0x0068
        L_0x0074:
            int r5 = r5 - r2
        L_0x0075:
            if (r5 < 0) goto L_0x0098
            java.lang.Object r6 = r4.get(r5)
            b0.Y r6 = (b0.Y) r6
            int r6 = r6.f1629c
            b0.n r7 = r3.f1507b0
            int[] r8 = r7.f1747c
            if (r8 == 0) goto L_0x0098
            int r8 = r7.f1748d
            int r8 = r8 * 2
            r9 = 0
        L_0x008a:
            if (r9 >= r8) goto L_0x0098
            int[] r10 = r7.f1747c
            r10 = r10[r9]
            if (r10 != r6) goto L_0x0095
            int r5 = r5 + -1
            goto L_0x0075
        L_0x0095:
            int r9 = r9 + 2
            goto L_0x008a
        L_0x0098:
            int r5 = r5 + r2
        L_0x0099:
            r4.add(r5, r12)
            r4 = 1
            goto L_0x009f
        L_0x009e:
            r4 = 0
        L_0x009f:
            if (r4 != 0) goto L_0x00a6
            r11.a(r12, r2)
            r1 = r4
            goto L_0x00a8
        L_0x00a6:
            r1 = r4
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            F.c r3 = r3.f
            r3.J(r12)
            if (r1 != 0) goto L_0x00b6
            if (r2 != 0) goto L_0x00b6
            if (r0 == 0) goto L_0x00b6
            r0 = 0
            r12.f1643r = r0
        L_0x00b6:
            return
        L_0x00b7:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r0.<init>(r1)
            java.lang.String r1 = r3.y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x00cf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = r3.y()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L_0x00ea:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Scrapped or attached views may not be recycled. isScrap:"
            r5.<init>(r6)
            boolean r12 = r12.i()
            r5.append(r12)
            java.lang.String r12 = " isAttached:"
            r5.append(r12)
            android.view.ViewParent r12 = r4.getParent()
            if (r12 == 0) goto L_0x0106
            r1 = 1
        L_0x0106:
            r5.append(r1)
            java.lang.String r12 = r3.y()
            r5.append(r12)
            java.lang.String r12 = r5.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.P.g(b0.Y):void");
    }

    public final void h(View view) {
        boolean z2;
        C0076F f2;
        Y I2 = RecyclerView.I(view);
        if ((I2.f1635j & 12) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        RecyclerView recyclerView = this.f1602h;
        if (!z2 && I2.k() && (f2 = recyclerView.f1489H) != null) {
            C0085i iVar = (C0085i) f2;
            if (I2.c().isEmpty() && iVar.f1701g && !I2.f()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                I2.f1639n = this;
                I2.f1640o = true;
                this.b.add(I2);
                return;
            }
        }
        if (!I2.f() || I2.h() || recyclerView.f1522k.b) {
            I2.f1639n = this;
            I2.f1640o = false;
            this.f1597a.add(I2);
            return;
        }
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: b0.Y} */
    /* JADX WARNING: type inference failed for: r2v42, types: [java.lang.Object, I.o] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d4, code lost:
        if (r11.f != 0) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02d9, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x042c, code lost:
        if (r11.f() == false) goto L_0x042f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x053a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b0.Y i(int r28, long r29) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = -1
            r3 = 1
            androidx.recyclerview.widget.RecyclerView r4 = r1.f1602h
            if (r0 < 0) goto L_0x0542
            b0.V r5 = r4.f1509c0
            int r5 = r5.b()
            if (r0 >= r5) goto L_0x0542
            b0.V r5 = r4.f1509c0
            boolean r6 = r5.f1613g
            r8 = 0
            r9 = 32
            if (r6 == 0) goto L_0x0084
            java.util.ArrayList r6 = r1.b
            if (r6 == 0) goto L_0x007d
            int r6 = r6.size()
            if (r6 != 0) goto L_0x0026
            goto L_0x007d
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r10 >= r6) goto L_0x0043
            java.util.ArrayList r11 = r1.b
            java.lang.Object r11 = r11.get(r10)
            b0.Y r11 = (b0.Y) r11
            boolean r12 = r11.p()
            if (r12 != 0) goto L_0x0041
            int r12 = r11.b()
            if (r12 != r0) goto L_0x0041
            r11.a(r9)
            goto L_0x007e
        L_0x0041:
            int r10 = r10 + r3
            goto L_0x0027
        L_0x0043:
            b0.B r10 = r4.f1522k
            boolean r10 = r10.b
            if (r10 == 0) goto L_0x007d
            F.g r10 = r4.f1510d
            int r10 = r10.f(r0, r8)
            if (r10 <= 0) goto L_0x007d
            b0.B r11 = r4.f1522k
            int r11 = r11.a()
            if (r10 >= r11) goto L_0x007d
            b0.B r11 = r4.f1522k
            long r10 = r11.b(r10)
            r12 = 0
        L_0x0060:
            if (r12 >= r6) goto L_0x007d
            java.util.ArrayList r13 = r1.b
            java.lang.Object r13 = r13.get(r12)
            b0.Y r13 = (b0.Y) r13
            boolean r14 = r13.p()
            if (r14 != 0) goto L_0x007b
            long r14 = r13.f1631e
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 != 0) goto L_0x007b
            r13.a(r9)
            r11 = r13
            goto L_0x007e
        L_0x007b:
            int r12 = r12 + r3
            goto L_0x0060
        L_0x007d:
            r11 = 0
        L_0x007e:
            if (r11 == 0) goto L_0x0082
            r6 = 1
            goto L_0x0086
        L_0x0082:
            r6 = 0
            goto L_0x0086
        L_0x0084:
            r6 = 0
            r11 = 0
        L_0x0086:
            java.util.ArrayList r10 = r1.f1598c
            java.util.ArrayList r12 = r1.f1597a
            if (r11 != 0) goto L_0x0230
            int r11 = r12.size()
            r13 = 0
        L_0x0091:
            if (r13 >= r11) goto L_0x00bf
            java.lang.Object r14 = r12.get(r13)
            b0.Y r14 = (b0.Y) r14
            boolean r15 = r14.p()
            if (r15 != 0) goto L_0x00bd
            int r15 = r14.b()
            if (r15 != r0) goto L_0x00bd
            boolean r15 = r14.f()
            if (r15 != 0) goto L_0x00bd
            boolean r15 = r5.f1613g
            if (r15 != 0) goto L_0x00b5
            boolean r15 = r14.h()
            if (r15 != 0) goto L_0x00bd
        L_0x00b5:
            r14.a(r9)
            r11 = r14
            r17 = 1
            goto L_0x01b2
        L_0x00bd:
            int r13 = r13 + r3
            goto L_0x0091
        L_0x00bf:
            N.g r11 = r4.f1512e
            java.lang.Object r11 = r11.f607d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r13 = r11.size()
            r14 = 0
        L_0x00ca:
            if (r14 >= r13) goto L_0x00ef
            java.lang.Object r15 = r11.get(r14)
            android.view.View r15 = (android.view.View) r15
            b0.Y r16 = androidx.recyclerview.widget.RecyclerView.I(r15)
            r17 = 1
            int r3 = r16.b()
            if (r3 != r0) goto L_0x00eb
            boolean r3 = r16.f()
            if (r3 != 0) goto L_0x00eb
            boolean r3 = r16.h()
            if (r3 != 0) goto L_0x00eb
            goto L_0x00f2
        L_0x00eb:
            int r14 = r14 + 1
            r3 = 1
            goto L_0x00ca
        L_0x00ef:
            r17 = 1
            r15 = 0
        L_0x00f2:
            if (r15 == 0) goto L_0x018a
            b0.Y r3 = androidx.recyclerview.widget.RecyclerView.I(r15)
            N.g r11 = r4.f1512e
            java.lang.Object r13 = r11.b
            b0.A r13 = (b0.C0071A) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.f1567a
            int r13 = r13.indexOfChild(r15)
            if (r13 < 0) goto L_0x0176
            java.lang.Object r14 = r11.f606c
            b0.b r14 = (b0.C0078b) r14
            boolean r16 = r14.d(r13)
            if (r16 == 0) goto L_0x0162
            r14.a(r13)
            r11.H(r15)
            N.g r11 = r4.f1512e
            java.lang.Object r13 = r11.b
            b0.A r13 = (b0.C0071A) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.f1567a
            int r13 = r13.indexOfChild(r15)
            if (r13 != r2) goto L_0x0126
        L_0x0124:
            r13 = -1
            goto L_0x0136
        L_0x0126:
            java.lang.Object r11 = r11.f606c
            b0.b r11 = (b0.C0078b) r11
            boolean r14 = r11.d(r13)
            if (r14 == 0) goto L_0x0131
            goto L_0x0124
        L_0x0131:
            int r11 = r11.b(r13)
            int r13 = r13 - r11
        L_0x0136:
            if (r13 == r2) goto L_0x0147
            N.g r11 = r4.f1512e
            r11.i(r13)
            r1.h(r15)
            r11 = 8224(0x2020, float:1.1524E-41)
            r3.a(r11)
            r11 = r3
            goto L_0x01b2
        L_0x0147:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "layout index should not be -1 after unhiding a view:"
            r2.<init>(r5)
            r2.append(r3)
            java.lang.String r3 = r4.y()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0162:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0176:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "view is not a child, cannot hide "
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x018a:
            int r3 = r10.size()
            r11 = 0
        L_0x018f:
            if (r11 >= r3) goto L_0x01b1
            java.lang.Object r13 = r10.get(r11)
            b0.Y r13 = (b0.Y) r13
            boolean r14 = r13.f()
            if (r14 != 0) goto L_0x01ae
            int r14 = r13.b()
            if (r14 != r0) goto L_0x01ae
            boolean r14 = r13.d()
            if (r14 != 0) goto L_0x01ae
            r10.remove(r11)
            r11 = r13
            goto L_0x01b2
        L_0x01ae:
            int r11 = r11 + 1
            goto L_0x018f
        L_0x01b1:
            r11 = 0
        L_0x01b2:
            if (r11 == 0) goto L_0x0232
            boolean r3 = r11.h()
            if (r3 == 0) goto L_0x01bd
            boolean r3 = r5.f1613g
            goto L_0x01eb
        L_0x01bd:
            int r3 = r11.f1629c
            if (r3 < 0) goto L_0x0215
            b0.B r13 = r4.f1522k
            int r13 = r13.a()
            if (r3 >= r13) goto L_0x0215
            boolean r3 = r5.f1613g
            if (r3 != 0) goto L_0x01d8
            b0.B r3 = r4.f1522k
            r3.getClass()
            int r3 = r11.f
            if (r3 == 0) goto L_0x01d8
        L_0x01d6:
            r3 = 0
            goto L_0x01eb
        L_0x01d8:
            b0.B r3 = r4.f1522k
            boolean r13 = r3.b
            if (r13 == 0) goto L_0x01ea
            long r13 = r11.f1631e
            int r15 = r11.f1629c
            long r15 = r3.b(r15)
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x01d6
        L_0x01ea:
            r3 = 1
        L_0x01eb:
            if (r3 != 0) goto L_0x0213
            r3 = 4
            r11.a(r3)
            boolean r3 = r11.i()
            if (r3 == 0) goto L_0x0202
            android.view.View r3 = r11.f1628a
            r4.removeDetachedView(r3, r8)
            b0.P r3 = r11.f1639n
            r3.j(r11)
            goto L_0x020e
        L_0x0202:
            boolean r3 = r11.p()
            if (r3 == 0) goto L_0x020e
            int r3 = r11.f1635j
            r3 = r3 & -33
            r11.f1635j = r3
        L_0x020e:
            r1.g(r11)
            r11 = 0
            goto L_0x0232
        L_0x0213:
            r6 = 1
            goto L_0x0232
        L_0x0215:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r3 = r4.y()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0230:
            r17 = 1
        L_0x0232:
            r15 = 4
            r18 = 0
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r11 != 0) goto L_0x03d6
            F.g r3 = r4.f1510d
            int r3 = r3.f(r0, r8)
            if (r3 < 0) goto L_0x03a7
            r22 = -1
            b0.B r2 = r4.f1522k
            int r2 = r2.a()
            if (r3 >= r2) goto L_0x03a7
            b0.B r2 = r4.f1522k
            r2.getClass()
            b0.B r2 = r4.f1522k
            r23 = 3
            boolean r13 = r2.b
            if (r13 == 0) goto L_0x02e3
            long r13 = r2.b(r3)
            int r2 = r12.size()
            int r2 = r2 + -1
        L_0x0266:
            if (r2 < 0) goto L_0x02b3
            java.lang.Object r11 = r12.get(r2)
            b0.Y r11 = (b0.Y) r11
            long r7 = r11.f1631e
            int r26 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r26 != 0) goto L_0x02af
            boolean r7 = r11.p()
            if (r7 != 0) goto L_0x02af
            int r7 = r11.f
            if (r7 != 0) goto L_0x0294
            r11.a(r9)
            boolean r2 = r11.h()
            if (r2 == 0) goto L_0x02de
            boolean r2 = r5.f1613g
            if (r2 != 0) goto L_0x02de
            int r2 = r11.f1635j
            r2 = r2 & -15
            r2 = r2 | 2
            r11.f1635j = r2
            goto L_0x02de
        L_0x0294:
            r12.remove(r2)
            android.view.View r7 = r11.f1628a
            r8 = 0
            r4.removeDetachedView(r7, r8)
            b0.Y r7 = androidx.recyclerview.widget.RecyclerView.I(r7)
            r11 = 0
            r7.f1639n = r11
            r7.f1640o = r8
            int r8 = r7.f1635j
            r8 = r8 & -33
            r7.f1635j = r8
            r1.g(r7)
        L_0x02af:
            int r2 = r2 + -1
            r8 = 0
            goto L_0x0266
        L_0x02b3:
            int r2 = r10.size()
            int r2 = r2 + -1
        L_0x02b9:
            if (r2 < 0) goto L_0x02d9
            java.lang.Object r7 = r10.get(r2)
            b0.Y r7 = (b0.Y) r7
            long r8 = r7.f1631e
            int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x02db
            boolean r8 = r7.d()
            if (r8 != 0) goto L_0x02db
            int r8 = r7.f
            if (r8 != 0) goto L_0x02d6
            r10.remove(r2)
            r11 = r7
            goto L_0x02de
        L_0x02d6:
            r1.e(r2)
        L_0x02d9:
            r11 = 0
            goto L_0x02de
        L_0x02db:
            int r2 = r2 + -1
            goto L_0x02b9
        L_0x02de:
            if (r11 == 0) goto L_0x02e3
            r11.f1629c = r3
            r6 = 1
        L_0x02e3:
            if (r11 != 0) goto L_0x0323
            b0.O r2 = r1.c()
            android.util.SparseArray r2 = r2.f1596a
            r8 = 0
            java.lang.Object r2 = r2.get(r8)
            b0.N r2 = (b0.N) r2
            if (r2 == 0) goto L_0x031b
            java.util.ArrayList r2 = r2.f1593a
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x031b
            int r3 = r2.size()
            int r3 = r3 + -1
        L_0x0302:
            if (r3 < 0) goto L_0x031b
            java.lang.Object r7 = r2.get(r3)
            b0.Y r7 = (b0.Y) r7
            boolean r7 = r7.d()
            if (r7 != 0) goto L_0x0318
            java.lang.Object r2 = r2.remove(r3)
            r11 = r2
            b0.Y r11 = (b0.Y) r11
            goto L_0x031c
        L_0x0318:
            int r3 = r3 + -1
            goto L_0x0302
        L_0x031b:
            r11 = 0
        L_0x031c:
            if (r11 == 0) goto L_0x0323
            r11.m()
            int[] r2 = androidx.recyclerview.widget.RecyclerView.f1478s0
        L_0x0323:
            if (r11 != 0) goto L_0x03a4
            long r2 = r4.getNanoTime()
            int r7 = (r29 > r20 ? 1 : (r29 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x0348
            b0.O r7 = r1.f1601g
            r8 = 0
            b0.N r7 = r7.a(r8)
            long r7 = r7.f1594c
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x0342
            long r7 = r7 + r2
            int r9 = (r7 > r29 ? 1 : (r7 == r29 ? 0 : -1))
            if (r9 >= 0) goto L_0x0340
            goto L_0x0342
        L_0x0340:
            r7 = 0
            goto L_0x0343
        L_0x0342:
            r7 = 1
        L_0x0343:
            if (r7 != 0) goto L_0x0348
            r25 = 0
            return r25
        L_0x0348:
            r25 = 0
            b0.B r7 = r4.f1522k
            r7.getClass()
            java.lang.String r8 = "RV CreateView"
            int r9 = E.l.f93a     // Catch:{ all -> 0x0394 }
            android.os.Trace.beginSection(r8)     // Catch:{ all -> 0x0394 }
            b0.Y r11 = r7.d(r4)     // Catch:{ all -> 0x0394 }
            android.view.View r7 = r11.f1628a
            android.view.ViewParent r8 = r7.getParent()     // Catch:{ all -> 0x0394 }
            if (r8 != 0) goto L_0x0396
            r8 = 0
            r11.f = r8     // Catch:{ all -> 0x0394 }
            android.os.Trace.endSection()
            boolean r8 = androidx.recyclerview.widget.RecyclerView.f1480u0
            if (r8 == 0) goto L_0x0379
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.D(r7)
            if (r7 == 0) goto L_0x0379
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r7)
            r11.b = r8
        L_0x0379:
            long r7 = r4.getNanoTime()
            b0.O r9 = r1.f1601g
            long r7 = r7 - r2
            r2 = 0
            b0.N r3 = r9.a(r2)
            long r9 = r3.f1594c
            int r2 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x038c
            goto L_0x0391
        L_0x038c:
            long r9 = r9 / r15
            long r9 = r9 * r23
            long r7 = r7 / r15
            long r7 = r7 + r9
        L_0x0391:
            r3.f1594c = r7
            goto L_0x03d9
        L_0x0394:
            r0 = move-exception
            goto L_0x039e
        L_0x0396:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0394 }
            java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r2)     // Catch:{ all -> 0x0394 }
            throw r0     // Catch:{ all -> 0x0394 }
        L_0x039e:
            int r2 = E.l.f93a
            android.os.Trace.endSection()
            throw r0
        L_0x03a4:
            r25 = 0
            goto L_0x03d9
        L_0x03a7:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Inconsistency detected. Invalid item position "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = "(offset:"
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = ").state:"
            r6.append(r0)
            int r0 = r5.b()
            r6.append(r0)
            java.lang.String r0 = r4.y()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.<init>(r0)
            throw r2
        L_0x03d6:
            r23 = 3
            goto L_0x03a4
        L_0x03d9:
            if (r6 == 0) goto L_0x0408
            boolean r2 = r5.f1613g
            if (r2 != 0) goto L_0x0408
            int r2 = r11.f1635j
            r3 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x03e7
            r3 = 1
            goto L_0x03e8
        L_0x03e7:
            r3 = 0
        L_0x03e8:
            if (r3 == 0) goto L_0x0408
            r2 = r2 & -8193(0xffffffffffffdfff, float:NaN)
            r11.f1635j = r2
            boolean r2 = r5.f1616j
            if (r2 == 0) goto L_0x0408
            b0.C0076F.b(r11)
            b0.F r2 = r4.f1489H
            r11.c()
            r2.getClass()
            I.o r2 = new I.o
            r2.<init>()
            r2.a(r11)
            r4.T(r11, r2)
        L_0x0408:
            boolean r2 = r5.f1613g
            android.view.View r3 = r11.f1628a
            if (r2 == 0) goto L_0x0417
            boolean r2 = r11.e()
            if (r2 == 0) goto L_0x0417
            r11.f1632g = r0
            goto L_0x042f
        L_0x0417:
            boolean r2 = r11.e()
            if (r2 == 0) goto L_0x0434
            int r2 = r11.f1635j
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0425
            r2 = 1
            goto L_0x0426
        L_0x0425:
            r2 = 0
        L_0x0426:
            if (r2 != 0) goto L_0x0434
            boolean r2 = r11.f()
            if (r2 == 0) goto L_0x042f
            goto L_0x0434
        L_0x042f:
            r0 = 0
            r7 = 1
            r8 = 0
            goto L_0x0514
        L_0x0434:
            F.g r2 = r4.f1510d
            r8 = 0
            int r2 = r2.f(r0, r8)
            r11.f1643r = r4
            int r7 = r11.f
            long r9 = r4.getNanoTime()
            int r12 = (r29 > r20 ? 1 : (r29 == r20 ? 0 : -1))
            if (r12 == 0) goto L_0x045d
            b0.O r12 = r1.f1601g
            b0.N r7 = r12.a(r7)
            long r12 = r7.f1595d
            int r7 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x045d
            long r12 = r12 + r9
            int r7 = (r12 > r29 ? 1 : (r12 == r29 ? 0 : -1))
            if (r7 >= 0) goto L_0x0459
            goto L_0x045d
        L_0x0459:
            r0 = 0
            r7 = 1
            goto L_0x0514
        L_0x045d:
            b0.B r7 = r4.f1522k
            r7.getClass()
            r11.f1629c = r2
            boolean r12 = r7.b
            if (r12 == 0) goto L_0x046e
            long r12 = r7.b(r2)
            r11.f1631e = r12
        L_0x046e:
            int r12 = r11.f1635j
            r12 = r12 & -520(0xfffffffffffffdf8, float:NaN)
            r12 = r12 | 1
            r11.f1635j = r12
            int r12 = E.l.f93a
            java.lang.String r12 = "RV OnBindView"
            android.os.Trace.beginSection(r12)
            r11.c()
            r7.c(r11, r2)
            java.util.ArrayList r2 = r11.f1636k
            if (r2 == 0) goto L_0x048a
            r2.clear()
        L_0x048a:
            int r2 = r11.f1635j
            r2 = r2 & -1025(0xfffffffffffffbff, float:NaN)
            r11.f1635j = r2
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r7 = r2 instanceof b0.K
            if (r7 == 0) goto L_0x049d
            b0.K r2 = (b0.K) r2
            r7 = 1
            r2.f1591c = r7
        L_0x049d:
            android.os.Trace.endSection()
            long r12 = r4.getNanoTime()
            b0.O r2 = r1.f1601g
            int r7 = r11.f
            long r12 = r12 - r9
            b0.N r2 = r2.a(r7)
            long r9 = r2.f1595d
            int r7 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x04b4
            goto L_0x04b9
        L_0x04b4:
            long r9 = r9 / r15
            long r9 = r9 * r23
            long r12 = r12 / r15
            long r12 = r12 + r9
        L_0x04b9:
            r2.f1595d = r12
            android.view.accessibility.AccessibilityManager r2 = r4.f1542x
            if (r2 == 0) goto L_0x04c7
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L_0x04c7
            r2 = 1
            goto L_0x04c8
        L_0x04c7:
            r2 = 0
        L_0x04c8:
            if (r2 == 0) goto L_0x050c
            java.util.WeakHashMap r2 = I.O.f393a
            int r2 = r3.getImportantForAccessibility()
            r7 = 1
            if (r2 != 0) goto L_0x04d6
            r3.setImportantForAccessibility(r7)
        L_0x04d6:
            b0.a0 r2 = r4.f1521j0
            if (r2 != 0) goto L_0x04db
            goto L_0x050d
        L_0x04db:
            b0.Z r2 = r2.f1649e
            if (r2 == 0) goto L_0x04e1
            r9 = 1
            goto L_0x04e2
        L_0x04e1:
            r9 = 0
        L_0x04e2:
            if (r9 == 0) goto L_0x0508
            r2.getClass()
            android.view.View$AccessibilityDelegate r9 = I.O.c(r3)
            if (r9 != 0) goto L_0x04f0
            r9 = r25
            goto L_0x04ff
        L_0x04f0:
            boolean r10 = r9 instanceof I.C0009a
            if (r10 == 0) goto L_0x04f9
            I.a r9 = (I.C0009a) r9
            I.b r9 = r9.f406a
            goto L_0x04ff
        L_0x04f9:
            I.b r10 = new I.b
            r10.<init>(r9)
            r9 = r10
        L_0x04ff:
            if (r9 == 0) goto L_0x0508
            if (r9 == r2) goto L_0x0508
            java.util.WeakHashMap r10 = r2.f1645e
            r10.put(r3, r9)
        L_0x0508:
            I.O.p(r3, r2)
            goto L_0x050d
        L_0x050c:
            r7 = 1
        L_0x050d:
            boolean r2 = r5.f1613g
            if (r2 == 0) goto L_0x0513
            r11.f1632g = r0
        L_0x0513:
            r0 = 1
        L_0x0514:
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            if (r2 != 0) goto L_0x0524
            android.view.ViewGroup$LayoutParams r2 = r4.generateDefaultLayoutParams()
            b0.K r2 = (b0.K) r2
            r3.setLayoutParams(r2)
            goto L_0x0536
        L_0x0524:
            boolean r5 = r4.checkLayoutParams(r2)
            if (r5 != 0) goto L_0x0534
            android.view.ViewGroup$LayoutParams r2 = r4.generateLayoutParams((android.view.ViewGroup.LayoutParams) r2)
            b0.K r2 = (b0.K) r2
            r3.setLayoutParams(r2)
            goto L_0x0536
        L_0x0534:
            b0.K r2 = (b0.K) r2
        L_0x0536:
            r2.f1590a = r11
            if (r6 == 0) goto L_0x053e
            if (r0 == 0) goto L_0x053e
            r3 = 1
            goto L_0x053f
        L_0x053e:
            r3 = 0
        L_0x053f:
            r2.f1592d = r3
            return r11
        L_0x0542:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid item position "
            r3.<init>(r5)
            r3.append(r0)
            java.lang.String r5 = "("
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = "). Item count:"
            r3.append(r0)
            b0.V r0 = r4.f1509c0
            int r0 = r0.b()
            r3.append(r0)
            java.lang.String r0 = r4.y()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.P.i(int, long):b0.Y");
    }

    public final void j(Y y2) {
        if (y2.f1640o) {
            this.b.remove(y2);
        } else {
            this.f1597a.remove(y2);
        }
        y2.f1639n = null;
        y2.f1640o = false;
        y2.f1635j &= -33;
    }

    public final void k() {
        int i2;
        J j2 = this.f1602h.f1524l;
        if (j2 != null) {
            i2 = j2.f1584j;
        } else {
            i2 = 0;
        }
        this.f = this.f1600e + i2;
        ArrayList arrayList = this.f1598c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            e(size);
        }
    }
}
