package b0;

import F.c;
import I.O;
import J.k;
import J.l;
import N.g;
import a0.C0043a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class J {

    /* renamed from: a  reason: collision with root package name */
    public g f1577a;
    public RecyclerView b;

    /* renamed from: c  reason: collision with root package name */
    public final c f1578c;

    /* renamed from: d  reason: collision with root package name */
    public final c f1579d;

    /* renamed from: e  reason: collision with root package name */
    public C0098w f1580e;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1581g = false;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1582h = true;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1583i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f1584j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1585k;

    /* renamed from: l  reason: collision with root package name */
    public int f1586l;

    /* renamed from: m  reason: collision with root package name */
    public int f1587m;

    /* renamed from: n  reason: collision with root package name */
    public int f1588n;

    /* renamed from: o  reason: collision with root package name */
    public int f1589o;

    public J() {
        H h2 = new H(this, 0);
        H h3 = new H(this, 1);
        this.f1578c = new c(h2);
        this.f1579d = new c(h3);
    }

    public static int A(View view) {
        Rect rect = ((K) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((K) view.getLayoutParams()).f1590a.b();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [b0.I, java.lang.Object] */
    public static I I(Context context, AttributeSet attributeSet, int i2, int i3) {
        ? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0043a.f826a, i2, i3);
        obj.f1574a = obtainStyledAttributes.getInt(0, 1);
        obj.b = obtainStyledAttributes.getInt(10, 1);
        obj.f1575c = obtainStyledAttributes.getBoolean(9, false);
        obj.f1576d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean M(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i2) {
                return true;
            }
            return false;
        } else if (size >= i2) {
            return true;
        } else {
            return false;
        }
    }

    public static void N(View view, int i2, int i3, int i4, int i5) {
        K k2 = (K) view.getLayoutParams();
        Rect rect = k2.b;
        view.layout(i2 + rect.left + k2.leftMargin, i3 + rect.top + k2.topMargin, (i4 - rect.right) - k2.rightMargin, (i5 - rect.bottom) - k2.bottomMargin);
    }

    public static int g(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i3, i4));
        }
        if (mode != 1073741824) {
            return Math.max(i3, i4);
        }
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r6 == 1073741824) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x001e
            if (r8 < 0) goto L_0x0013
        L_0x0010:
            r6 = 1073741824(0x40000000, float:2.0)
            goto L_0x0032
        L_0x0013:
            if (r8 != r1) goto L_0x001b
            if (r6 == r2) goto L_0x0023
            if (r6 == 0) goto L_0x001b
            if (r6 == r3) goto L_0x0023
        L_0x001b:
            r6 = 0
            r8 = 0
            goto L_0x0032
        L_0x001e:
            if (r8 < 0) goto L_0x0021
            goto L_0x0010
        L_0x0021:
            if (r8 != r1) goto L_0x0025
        L_0x0023:
            r8 = r5
            goto L_0x0032
        L_0x0025:
            if (r8 != r0) goto L_0x001b
            if (r6 == r2) goto L_0x002f
            if (r6 != r3) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            r8 = r5
            r6 = 0
            goto L_0x0032
        L_0x002f:
            r8 = r5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0032:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.J.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((K) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int B() {
        C0072B b2;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            b2 = recyclerView.getAdapter();
        } else {
            b2 = null;
        }
        if (b2 != null) {
            return b2.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = O.f393a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(P p2, V v2) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.f1522k == null || !e()) {
            return 1;
        }
        return this.b.f1522k.a();
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((K) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.b.f1520j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i2) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int n2 = recyclerView.f1512e.n();
            for (int i3 = 0; i3 < n2; i3++) {
                recyclerView.f1512e.m(i3).offsetLeftAndRight(i2);
            }
        }
    }

    public void P(int i2) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int n2 = recyclerView.f1512e.n();
            for (int i3 = 0; i3 < n2; i3++) {
                recyclerView.f1512e.m(i3).offsetTopAndBottom(i2);
            }
        }
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i2, P p2, V v2);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        P p2 = recyclerView.b;
        V v2 = recyclerView.f1509c0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            C0072B b2 = this.b.f1522k;
            if (b2 != null) {
                accessibilityEvent.setItemCount(b2.a());
            }
        }
    }

    public final void U(View view, l lVar) {
        Y I2 = RecyclerView.I(view);
        if (I2 != null && !I2.h() && !((ArrayList) this.f1577a.f607d).contains(I2.f1628a)) {
            RecyclerView recyclerView = this.b;
            V(recyclerView.b, recyclerView.f1509c0, view, lVar);
        }
    }

    public void V(P p2, V v2, View view, l lVar) {
        int i2;
        int i3;
        if (e()) {
            i2 = H(view);
        } else {
            i2 = 0;
        }
        if (d()) {
            i3 = H(view);
        } else {
            i3 = 0;
        }
        lVar.i(k.a(false, i2, 1, i3, 1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.View r9, int r10, boolean r11) {
        /*
            r8 = this;
            b0.Y r0 = androidx.recyclerview.widget.RecyclerView.I(r9)
            r1 = 0
            r2 = 1
            if (r11 != 0) goto L_0x0017
            boolean r11 = r0.h()
            if (r11 == 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView r11 = r8.b
            F.c r11 = r11.f
            r11.I(r0)
            goto L_0x0033
        L_0x0017:
            androidx.recyclerview.widget.RecyclerView r11 = r8.b
            F.c r11 = r11.f
            java.lang.Object r11 = r11.b
            n.k r11 = (n.k) r11
            java.lang.Object r3 = r11.getOrDefault(r0, r1)
            b0.i0 r3 = (b0.i0) r3
            if (r3 != 0) goto L_0x002e
            b0.i0 r3 = b0.i0.a()
            r11.put(r0, r3)
        L_0x002e:
            int r11 = r3.f1714a
            r11 = r11 | r2
            r3.f1714a = r11
        L_0x0033:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            b0.K r11 = (b0.K) r11
            boolean r3 = r0.p()
            r4 = 0
            if (r3 != 0) goto L_0x0133
            boolean r3 = r0.i()
            if (r3 == 0) goto L_0x0048
            goto L_0x0133
        L_0x0048:
            android.view.ViewParent r3 = r9.getParent()
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            r6 = -1
            if (r3 != r5) goto L_0x010e
            N.g r3 = r8.f1577a
            java.lang.Object r5 = r3.b
            b0.A r5 = (b0.C0071A) r5
            androidx.recyclerview.widget.RecyclerView r5 = r5.f1567a
            int r5 = r5.indexOfChild(r9)
            if (r5 != r6) goto L_0x0061
        L_0x005f:
            r5 = -1
            goto L_0x0071
        L_0x0061:
            java.lang.Object r3 = r3.f606c
            b0.b r3 = (b0.C0078b) r3
            boolean r7 = r3.d(r5)
            if (r7 == 0) goto L_0x006c
            goto L_0x005f
        L_0x006c:
            int r3 = r3.b(r5)
            int r5 = r5 - r3
        L_0x0071:
            if (r10 != r6) goto L_0x0079
            N.g r10 = r8.f1577a
            int r10 = r10.n()
        L_0x0079:
            if (r5 == r6) goto L_0x00eb
            if (r5 == r10) goto L_0x014e
            androidx.recyclerview.widget.RecyclerView r9 = r8.b
            b0.J r9 = r9.f1524l
            android.view.View r3 = r9.u(r5)
            if (r3 == 0) goto L_0x00ce
            r9.u(r5)
            N.g r6 = r9.f1577a
            r6.i(r5)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            b0.K r5 = (b0.K) r5
            b0.Y r6 = androidx.recyclerview.widget.RecyclerView.I(r3)
            boolean r7 = r6.h()
            if (r7 == 0) goto L_0x00bc
            androidx.recyclerview.widget.RecyclerView r7 = r9.b
            F.c r7 = r7.f
            java.lang.Object r7 = r7.b
            n.k r7 = (n.k) r7
            java.lang.Object r1 = r7.getOrDefault(r6, r1)
            b0.i0 r1 = (b0.i0) r1
            if (r1 != 0) goto L_0x00b6
            b0.i0 r1 = b0.i0.a()
            r7.put(r6, r1)
        L_0x00b6:
            int r7 = r1.f1714a
            r2 = r2 | r7
            r1.f1714a = r2
            goto L_0x00c3
        L_0x00bc:
            androidx.recyclerview.widget.RecyclerView r1 = r9.b
            F.c r1 = r1.f
            r1.I(r6)
        L_0x00c3:
            N.g r9 = r9.f1577a
            boolean r1 = r6.h()
            r9.h(r3, r10, r5, r1)
            goto L_0x014e
        L_0x00ce:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot move a child from non-existing index:"
            r11.<init>(r0)
            r11.append(r5)
            androidx.recyclerview.widget.RecyclerView r9 = r9.b
            java.lang.String r9 = r9.toString()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x00eb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
            r11.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            int r9 = r0.indexOfChild(r9)
            r11.append(r9)
            androidx.recyclerview.widget.RecyclerView r9 = r8.b
            java.lang.String r9 = r9.y()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x010e:
            N.g r1 = r8.f1577a
            r1.g(r9, r10, r4)
            r11.f1591c = r2
            b0.w r10 = r8.f1580e
            if (r10 == 0) goto L_0x014e
            boolean r1 = r10.f1788e
            if (r1 == 0) goto L_0x014e
            androidx.recyclerview.widget.RecyclerView r1 = r10.b
            r1.getClass()
            b0.Y r1 = androidx.recyclerview.widget.RecyclerView.I(r9)
            if (r1 == 0) goto L_0x012c
            int r6 = r1.b()
        L_0x012c:
            int r1 = r10.f1785a
            if (r6 != r1) goto L_0x014e
            r10.f = r9
            goto L_0x014e
        L_0x0133:
            boolean r1 = r0.i()
            if (r1 == 0) goto L_0x013f
            b0.P r1 = r0.f1639n
            r1.j(r0)
            goto L_0x0145
        L_0x013f:
            int r1 = r0.f1635j
            r1 = r1 & -33
            r0.f1635j = r1
        L_0x0145:
            N.g r1 = r8.f1577a
            android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
            r1.h(r9, r10, r2, r4)
        L_0x014e:
            boolean r9 = r11.f1592d
            if (r9 == 0) goto L_0x0159
            android.view.View r9 = r0.f1628a
            r9.invalidate()
            r11.f1592d = r4
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.J.b(android.view.View, int, boolean):void");
    }

    public abstract void b0(P p2, V v2);

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(V v2);

    public abstract boolean d();

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(K k2) {
        if (k2 != null) {
            return true;
        }
        return false;
    }

    public final void g0(P p2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.I(u(v2)).o()) {
                View u2 = u(v2);
                j0(v2);
                p2.f(u2);
            }
        }
    }

    public final void h0(P p2) {
        ArrayList arrayList;
        int size = p2.f1597a.size();
        int i2 = size - 1;
        while (true) {
            arrayList = p2.f1597a;
            if (i2 < 0) {
                break;
            }
            View view = ((Y) arrayList.get(i2)).f1628a;
            Y I2 = RecyclerView.I(view);
            if (!I2.o()) {
                I2.n(false);
                if (I2.j()) {
                    this.b.removeDetachedView(view, false);
                }
                C0076F f2 = this.b.f1489H;
                if (f2 != null) {
                    f2.d(I2);
                }
                I2.n(true);
                Y I3 = RecyclerView.I(view);
                I3.f1639n = null;
                I3.f1640o = false;
                I3.f1635j &= -33;
                p2.g(I3);
            }
            i2--;
        }
        arrayList.clear();
        ArrayList arrayList2 = p2.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public final void i0(View view, P p2) {
        g gVar = this.f1577a;
        C0071A a2 = (C0071A) gVar.b;
        int indexOfChild = a2.f1567a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C0078b) gVar.f606c).f(indexOfChild)) {
                gVar.H(view);
            }
            a2.h(indexOfChild);
        }
        p2.f(view);
    }

    public abstract int j(V v2);

    public final void j0(int i2) {
        if (u(i2) != null) {
            g gVar = this.f1577a;
            int v2 = gVar.v(i2);
            C0071A a2 = (C0071A) gVar.b;
            View childAt = a2.f1567a.getChildAt(v2);
            if (childAt != null) {
                if (((C0078b) gVar.f606c).f(v2)) {
                    gVar.H(childAt);
                }
                a2.h(v2);
            }
        }
    }

    public abstract int k(V v2);

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ab, code lost:
        if ((r5.bottom - r10) > r2) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f1588n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f1589o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L_0x005c
            if (r2 == 0) goto L_0x0057
            goto L_0x0064
        L_0x0057:
            int r2 = java.lang.Math.max(r6, r10)
            goto L_0x0064
        L_0x005c:
            if (r6 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            int r6 = java.lang.Math.min(r4, r2)
        L_0x0063:
            r2 = r6
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            int r1 = java.lang.Math.min(r5, r11)
        L_0x006b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto L_0x00ae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L_0x007c
            goto L_0x00b3
        L_0x007c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.f1588n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f1589o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.f1516h
            r8.y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto L_0x00b3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto L_0x00b3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto L_0x00b3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            if (r11 != 0) goto L_0x00b4
            if (r10 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            return r0
        L_0x00b4:
            if (r12 == 0) goto L_0x00ba
            r9.scrollBy(r11, r10)
            return r7
        L_0x00ba:
            r9.Z(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.J.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(V v2);

    public final void l0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int m(V v2);

    public abstract int m0(int i2, P p2, V v2);

    public abstract int n(V v2);

    public abstract void n0(int i2);

    public abstract int o(V v2);

    public abstract int o0(int i2, P p2, V v2);

    public final void p(P p2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            Y I2 = RecyclerView.I(u2);
            if (!I2.o()) {
                if (!I2.f() || I2.h() || this.b.f1522k.b) {
                    u(v2);
                    this.f1577a.i(v2);
                    p2.h(u2);
                    this.b.f.I(I2);
                } else {
                    j0(v2);
                    p2.g(I2);
                }
            }
        }
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public View q(int i2) {
        int v2 = v();
        for (int i3 = 0; i3 < v2; i3++) {
            View u2 = u(i3);
            Y I2 = RecyclerView.I(u2);
            if (I2 != null && I2.b() == i2 && !I2.o() && (this.b.f1509c0.f1613g || !I2.h())) {
                return u2;
            }
        }
        return null;
    }

    public final void q0(int i2, int i3) {
        this.f1588n = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.f1586l = mode;
        if (mode == 0 && !RecyclerView.f1479t0) {
            this.f1588n = 0;
        }
        this.f1589o = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.f1587m = mode2;
        if (mode2 == 0 && !RecyclerView.f1479t0) {
            this.f1589o = 0;
        }
    }

    public abstract K r();

    public void r0(Rect rect, int i2, int i3) {
        int F2 = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = O.f393a;
        this.b.setMeasuredDimension(g(i2, F2, recyclerView.getMinimumWidth()), g(i3, D, this.b.getMinimumHeight()));
    }

    public K s(Context context, AttributeSet attributeSet) {
        return new K(context, attributeSet);
    }

    public final void s0(int i2, int i3) {
        int v2 = v();
        if (v2 == 0) {
            this.b.n(i2, i3);
            return;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < v2; i8++) {
            View u2 = u(i8);
            Rect rect = this.b.f1516h;
            y(u2, rect);
            int i9 = rect.left;
            if (i9 < i6) {
                i6 = i9;
            }
            int i10 = rect.right;
            if (i10 > i4) {
                i4 = i10;
            }
            int i11 = rect.top;
            if (i11 < i7) {
                i7 = i11;
            }
            int i12 = rect.bottom;
            if (i12 > i5) {
                i5 = i12;
            }
        }
        this.b.f1516h.set(i6, i7, i4, i5);
        r0(this.b.f1516h, i2, i3);
    }

    public K t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof K) {
            return new K((K) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new K((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new K(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.f1577a = null;
            this.f1588n = 0;
            this.f1589o = 0;
        } else {
            this.b = recyclerView;
            this.f1577a = recyclerView.f1512e;
            this.f1588n = recyclerView.getWidth();
            this.f1589o = recyclerView.getHeight();
        }
        this.f1586l = 1073741824;
        this.f1587m = 1073741824;
    }

    public final View u(int i2) {
        g gVar = this.f1577a;
        if (gVar != null) {
            return gVar.m(i2);
        }
        return null;
    }

    public final boolean u0(View view, int i2, int i3, K k2) {
        if (view.isLayoutRequested() || !this.f1582h || !M(view.getWidth(), i2, k2.width) || !M(view.getHeight(), i3, k2.height)) {
            return true;
        }
        return false;
    }

    public final int v() {
        g gVar = this.f1577a;
        if (gVar != null) {
            return gVar.n();
        }
        return 0;
    }

    public boolean v0() {
        return false;
    }

    public final boolean w0(View view, int i2, int i3, K k2) {
        if (!this.f1582h || !M(view.getMeasuredWidth(), i2, k2.width) || !M(view.getMeasuredHeight(), i3, k2.height)) {
            return true;
        }
        return false;
    }

    public int x(P p2, V v2) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.f1522k == null || !d()) {
            return 1;
        }
        return this.b.f1522k.a();
    }

    public abstract void x0(RecyclerView recyclerView, int i2);

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f1478s0;
        K k2 = (K) view.getLayoutParams();
        Rect rect2 = k2.b;
        rect.set((view.getLeft() - rect2.left) - k2.leftMargin, (view.getTop() - rect2.top) - k2.topMargin, view.getRight() + rect2.right + k2.rightMargin, view.getBottom() + rect2.bottom + k2.bottomMargin);
    }

    public final void y0(C0098w wVar) {
        C0098w wVar2 = this.f1580e;
        if (!(wVar2 == null || wVar == wVar2 || !wVar2.f1788e)) {
            wVar2.i();
        }
        this.f1580e = wVar;
        RecyclerView recyclerView = this.b;
        X x2 = recyclerView.f1504W;
        x2.f1626l.removeCallbacks(x2);
        x2.f1622h.abortAnimation();
        if (wVar.f1790h) {
            Log.w("RecyclerView", "An instance of " + wVar.getClass().getSimpleName() + " was started more than once. Each instance of" + wVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        wVar.b = recyclerView;
        wVar.f1786c = this;
        int i2 = wVar.f1785a;
        if (i2 != -1) {
            recyclerView.f1509c0.f1609a = i2;
            wVar.f1788e = true;
            wVar.f1787d = true;
            wVar.f = recyclerView.f1524l.q(i2);
            wVar.b.f1504W.a();
            wVar.f1790h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public boolean z0() {
        return false;
    }

    public void Q(RecyclerView recyclerView) {
    }

    public void d0(Parcelable parcelable) {
    }

    public void f0(int i2) {
    }

    public void X() {
    }

    public void W(int i2, int i3) {
    }

    public void Y(int i2, int i3) {
    }

    public void Z(int i2, int i3) {
    }

    public void a0(int i2, int i3) {
    }

    public void i(int i2, C0090n nVar) {
    }

    public void h(int i2, int i3, V v2, C0090n nVar) {
    }
}
