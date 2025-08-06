package androidx.recyclerview.widget;

import E.l;
import E0.e;
import F.c;
import F.g;
import H0.E;
import I.C0020l;
import I.C0023o;
import I.D;
import I.O;
import Q.b;
import R.d;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b0.C0071A;
import b0.C0072B;
import b0.C0074D;
import b0.C0075E;
import b0.C0076F;
import b0.C0077a;
import b0.C0078b;
import b0.C0088l;
import b0.C0090n;
import b0.C0092p;
import b0.C0098w;
import b0.G;
import b0.J;
import b0.K;
import b0.L;
import b0.M;
import b0.N;
import b0.P;
import b0.Q;
import b0.S;
import b0.V;
import b0.W;
import b0.X;
import b0.Y;
import b0.a0;
import b0.i0;
import com.cheatbox.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.C0292e;
import n.k;

public class RecyclerView extends ViewGroup {

    /* renamed from: s0  reason: collision with root package name */
    public static final int[] f1478s0 = {16843830};

    /* renamed from: t0  reason: collision with root package name */
    public static final boolean f1479t0;

    /* renamed from: u0  reason: collision with root package name */
    public static final boolean f1480u0 = true;

    /* renamed from: v0  reason: collision with root package name */
    public static final Class[] f1481v0;

    /* renamed from: w0  reason: collision with root package name */
    public static final d f1482w0 = new d(1);

    /* renamed from: A  reason: collision with root package name */
    public int f1483A;

    /* renamed from: B  reason: collision with root package name */
    public int f1484B;

    /* renamed from: C  reason: collision with root package name */
    public C0075E f1485C;
    public EdgeEffect D;

    /* renamed from: E  reason: collision with root package name */
    public EdgeEffect f1486E;

    /* renamed from: F  reason: collision with root package name */
    public EdgeEffect f1487F;

    /* renamed from: G  reason: collision with root package name */
    public EdgeEffect f1488G;

    /* renamed from: H  reason: collision with root package name */
    public C0076F f1489H;

    /* renamed from: I  reason: collision with root package name */
    public int f1490I;

    /* renamed from: J  reason: collision with root package name */
    public int f1491J;

    /* renamed from: K  reason: collision with root package name */
    public VelocityTracker f1492K;

    /* renamed from: L  reason: collision with root package name */
    public int f1493L;

    /* renamed from: M  reason: collision with root package name */
    public int f1494M;

    /* renamed from: N  reason: collision with root package name */
    public int f1495N;

    /* renamed from: O  reason: collision with root package name */
    public int f1496O;

    /* renamed from: P  reason: collision with root package name */
    public int f1497P;

    /* renamed from: Q  reason: collision with root package name */
    public L f1498Q;

    /* renamed from: R  reason: collision with root package name */
    public final int f1499R;

    /* renamed from: S  reason: collision with root package name */
    public final int f1500S;

    /* renamed from: T  reason: collision with root package name */
    public final float f1501T;

    /* renamed from: U  reason: collision with root package name */
    public final float f1502U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f1503V;

    /* renamed from: W  reason: collision with root package name */
    public final X f1504W;

    /* renamed from: a  reason: collision with root package name */
    public final e f1505a;

    /* renamed from: a0  reason: collision with root package name */
    public C0092p f1506a0;
    public final P b;

    /* renamed from: b0  reason: collision with root package name */
    public final C0090n f1507b0;

    /* renamed from: c  reason: collision with root package name */
    public S f1508c;

    /* renamed from: c0  reason: collision with root package name */
    public final V f1509c0;

    /* renamed from: d  reason: collision with root package name */
    public final g f1510d;

    /* renamed from: d0  reason: collision with root package name */
    public M f1511d0;

    /* renamed from: e  reason: collision with root package name */
    public final N.g f1512e;
    public ArrayList e0;
    public final c f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1513f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1514g;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f1515g0;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f1516h;

    /* renamed from: h0  reason: collision with root package name */
    public final C0071A f1517h0;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f1518i;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1519i0;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f1520j;

    /* renamed from: j0  reason: collision with root package name */
    public a0 f1521j0;

    /* renamed from: k  reason: collision with root package name */
    public C0072B f1522k;

    /* renamed from: k0  reason: collision with root package name */
    public final int[] f1523k0;

    /* renamed from: l  reason: collision with root package name */
    public J f1524l;

    /* renamed from: l0  reason: collision with root package name */
    public C0020l f1525l0;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f1526m;

    /* renamed from: m0  reason: collision with root package name */
    public final int[] f1527m0;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f1528n;
    public final int[] n0;

    /* renamed from: o  reason: collision with root package name */
    public C0088l f1529o;

    /* renamed from: o0  reason: collision with root package name */
    public final int[] f1530o0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1531p;

    /* renamed from: p0  reason: collision with root package name */
    public final ArrayList f1532p0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1533q;

    /* renamed from: q0  reason: collision with root package name */
    public final E f1534q0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1535r;

    /* renamed from: r0  reason: collision with root package name */
    public final C0071A f1536r0;

    /* renamed from: s  reason: collision with root package name */
    public int f1537s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1538t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1539u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1540v;

    /* renamed from: w  reason: collision with root package name */
    public int f1541w;

    /* renamed from: x  reason: collision with root package name */
    public final AccessibilityManager f1542x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1543y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1544z;

    static {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        f1479t0 = z2;
        Class cls = Integer.TYPE;
        f1481v0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Bin);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView D2 = D(viewGroup.getChildAt(i2));
            if (D2 != null) {
                return D2;
            }
        }
        return null;
    }

    public static Y I(View view) {
        if (view == null) {
            return null;
        }
        return ((K) view.getLayoutParams()).f1590a;
    }

    private C0020l getScrollingChildHelper() {
        if (this.f1525l0 == null) {
            this.f1525l0 = new C0020l(this);
        }
        return this.f1525l0;
    }

    public static void j(Y y2) {
        WeakReference weakReference = y2.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != y2.f1628a) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            y2.b = null;
        }
    }

    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f1528n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0088l lVar = (C0088l) arrayList.get(i2);
            int i3 = lVar.f1740v;
            if (i3 == 1) {
                boolean d2 = lVar.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = lVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d2 || c2)) {
                    if (c2) {
                        lVar.f1741w = 1;
                        lVar.f1734p = (float) ((int) motionEvent.getX());
                    } else if (d2) {
                        lVar.f1741w = 2;
                        lVar.f1731m = (float) ((int) motionEvent.getY());
                    }
                    lVar.f(2);
                }
            } else if (i3 != 2) {
                continue;
            }
            if (action != 3) {
                this.f1529o = lVar;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int n2 = this.f1512e.n();
        if (n2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < n2; i4++) {
            Y I2 = I(this.f1512e.m(i4));
            if (!I2.o()) {
                int b2 = I2.b();
                if (b2 < i2) {
                    i2 = b2;
                }
                if (b2 > i3) {
                    i3 = b2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final Y E(int i2) {
        Y y2 = null;
        if (this.f1543y) {
            return null;
        }
        int x2 = this.f1512e.x();
        for (int i3 = 0; i3 < x2; i3++) {
            Y I2 = I(this.f1512e.w(i3));
            if (I2 != null && !I2.h() && F(I2) == i2) {
                if (!((ArrayList) this.f1512e.f607d).contains(I2.f1628a)) {
                    return I2;
                }
                y2 = I2;
            }
        }
        return y2;
    }

    public final int F(Y y2) {
        boolean z2;
        if ((y2.f1635j & 524) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !y2.e()) {
            return -1;
        }
        g gVar = this.f1510d;
        int i2 = y2.f1629c;
        ArrayList arrayList = (ArrayList) gVar.f198c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0077a aVar = (C0077a) arrayList.get(i3);
            int i4 = aVar.f1646a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = aVar.b;
                    if (i5 <= i2) {
                        int i6 = aVar.f1647c;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = aVar.b;
                    if (i7 == i2) {
                        i2 = aVar.f1647c;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (aVar.f1647c <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (aVar.b <= i2) {
                i2 += aVar.f1647c;
            }
        }
        return i2;
    }

    public final long G(Y y2) {
        if (this.f1522k.b) {
            return y2.f1631e;
        }
        return (long) y2.f1629c;
    }

    public final Y H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        K k2 = (K) view.getLayoutParams();
        boolean z2 = k2.f1591c;
        Rect rect = k2.b;
        if (!z2 || (this.f1509c0.f1613g && (k2.f1590a.k() || k2.f1590a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1526m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.f1516h;
            rect2.set(0, 0, 0, 0);
            ((G) arrayList.get(i2)).getClass();
            ((K) view.getLayoutParams()).f1590a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        k2.f1591c = false;
        return rect;
    }

    public final boolean K() {
        if (!this.f1535r || this.f1543y || this.f1510d.g()) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if (this.f1483A > 0) {
            return true;
        }
        return false;
    }

    public final void M(int i2) {
        if (this.f1524l != null) {
            setScrollState(2);
            this.f1524l.n0(i2);
            awakenScrollBars();
        }
    }

    public final void N() {
        int x2 = this.f1512e.x();
        for (int i2 = 0; i2 < x2; i2++) {
            ((K) this.f1512e.w(i2).getLayoutParams()).f1591c = true;
        }
        ArrayList arrayList = this.b.f1598c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            K k2 = (K) ((Y) arrayList.get(i3)).f1628a.getLayoutParams();
            if (k2 != null) {
                k2.f1591c = true;
            }
        }
    }

    public final void O(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int x2 = this.f1512e.x();
        for (int i5 = 0; i5 < x2; i5++) {
            Y I2 = I(this.f1512e.w(i5));
            if (I2 != null && !I2.o()) {
                int i6 = I2.f1629c;
                V v2 = this.f1509c0;
                if (i6 >= i4) {
                    I2.l(-i3, z2);
                    v2.f = true;
                } else if (i6 >= i2) {
                    I2.a(8);
                    I2.l(-i3, z2);
                    I2.f1629c = i2 - 1;
                    v2.f = true;
                }
            }
        }
        P p2 = this.b;
        ArrayList arrayList = p2.f1598c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Y y2 = (Y) arrayList.get(size);
            if (y2 != null) {
                int i7 = y2.f1629c;
                if (i7 >= i4) {
                    y2.l(-i3, z2);
                } else if (i7 >= i2) {
                    y2.a(8);
                    p2.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f1483A++;
    }

    public final void Q(boolean z2) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i3 = this.f1483A - 1;
        this.f1483A = i3;
        if (i3 < 1) {
            this.f1483A = 0;
            if (z2) {
                int i4 = this.f1541w;
                this.f1541w = 0;
                if (!(i4 == 0 || (accessibilityManager = this.f1542x) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f1532p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Y y2 = (Y) arrayList.get(size);
                    if (y2.f1628a.getParent() == this && !y2.o() && (i2 = y2.f1642q) != -1) {
                        WeakHashMap weakHashMap = O.f393a;
                        y2.f1628a.setImportantForAccessibility(i2);
                        y2.f1642q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1491J) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f1491J = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f1495N = x2;
            this.f1493L = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f1496O = y2;
            this.f1494M = y2;
        }
    }

    public final void S() {
        if (!this.f1519i0 && this.f1531p) {
            WeakHashMap weakHashMap = O.f393a;
            postOnAnimation(this.f1534q0);
            this.f1519i0 = true;
        }
    }

    public final void T(Y y2, C0023o oVar) {
        y2.f1635j &= -8193;
        boolean z2 = this.f1509c0.f1614h;
        c cVar = this.f;
        if (z2 && y2.k() && !y2.h() && !y2.o()) {
            ((C0292e) cVar.f194c).f(G(y2), y2);
        }
        k kVar = (k) cVar.b;
        i0 i0Var = (i0) kVar.getOrDefault(y2, (Object) null);
        if (i0Var == null) {
            i0Var = i0.a();
            kVar.put(y2, i0Var);
        }
        i0Var.b = oVar;
        i0Var.f1714a |= 4;
    }

    public final void U(View view, View view2) {
        View view3;
        boolean z2;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1516h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof K) {
            K k2 = (K) layoutParams;
            if (!k2.f1591c) {
                int i2 = rect.left;
                Rect rect2 = k2.b;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        J j2 = this.f1524l;
        boolean z3 = !this.f1535r;
        if (view2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        j2.k0(this, view, this.f1516h, z3, z2);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f1492K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        c0(0);
        EdgeEffect edgeEffect = this.D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1486E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1486E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1487F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1487F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1488G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1488G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = O.f393a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean W(int r18, int r19, android.view.MotionEvent r20) {
        /*
            r17 = this;
            r0 = r17
            r8 = r18
            r9 = r19
            r0.m()
            b0.B r1 = r0.f1522k
            int[] r7 = r0.f1530o0
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x0021
            r7[r11] = r11
            r7[r10] = r11
            r0.X(r8, r9, r7)
            r1 = r7[r11]
            r2 = r7[r10]
            int r3 = r8 - r1
            int r4 = r9 - r2
            goto L_0x0025
        L_0x0021:
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0025:
            java.util.ArrayList r5 = r0.f1526m
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0030
            r0.invalidate()
        L_0x0030:
            r7[r11] = r11
            r7[r10] = r11
            int[] r5 = r0.f1527m0
            r6 = 0
            r0.s(r1, r2, r3, r4, r5, r6, r7)
            r5 = r7[r11]
            int r3 = r3 - r5
            r6 = r7[r10]
            int r4 = r4 - r6
            if (r5 != 0) goto L_0x0047
            if (r6 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r5 = 0
            goto L_0x0048
        L_0x0047:
            r5 = 1
        L_0x0048:
            int r6 = r0.f1495N
            int[] r7 = r0.f1527m0
            r12 = r7[r11]
            int r6 = r6 - r12
            r0.f1495N = r6
            int r6 = r0.f1496O
            r7 = r7[r10]
            int r6 = r6 - r7
            r0.f1496O = r6
            int[] r6 = r0.n0
            r13 = r6[r11]
            int r13 = r13 + r12
            r6[r11] = r13
            r12 = r6[r10]
            int r12 = r12 + r7
            r6[r10] = r12
            int r6 = r0.getOverScrollMode()
            r7 = 2
            if (r6 == r7) goto L_0x010c
            if (r20 == 0) goto L_0x0076
            int r6 = r20.getSource()
            r7 = 8194(0x2002, float:1.1482E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x007a
        L_0x0076:
            r16 = 1
            goto L_0x0108
        L_0x007a:
            float r6 = r20.getX()
            float r3 = (float) r3
            float r7 = r20.getY()
            float r4 = (float) r4
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            int r14 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r14 >= 0) goto L_0x00a6
            r0.v()
            android.widget.EdgeEffect r14 = r0.D
            float r15 = -r3
            r16 = 1
            int r10 = r0.getWidth()
            float r10 = (float) r10
            float r15 = r15 / r10
            int r10 = r0.getHeight()
            float r10 = (float) r10
            float r7 = r7 / r10
            float r7 = r12 - r7
            O.d.a(r14, r15, r7)
        L_0x00a4:
            r7 = 1
            goto L_0x00c3
        L_0x00a6:
            r16 = 1
            int r10 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x00c2
            r0.w()
            android.widget.EdgeEffect r10 = r0.f1487F
            int r14 = r0.getWidth()
            float r14 = (float) r14
            float r14 = r3 / r14
            int r15 = r0.getHeight()
            float r15 = (float) r15
            float r7 = r7 / r15
            O.d.a(r10, r14, r7)
            goto L_0x00a4
        L_0x00c2:
            r7 = 0
        L_0x00c3:
            int r10 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x00de
            r0.x()
            android.widget.EdgeEffect r7 = r0.f1486E
            float r10 = -r4
            int r12 = r0.getHeight()
            float r12 = (float) r12
            float r10 = r10 / r12
            int r12 = r0.getWidth()
            float r12 = (float) r12
            float r6 = r6 / r12
            O.d.a(r7, r10, r6)
        L_0x00dc:
            r7 = 1
            goto L_0x00f9
        L_0x00de:
            int r10 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f9
            r0.u()
            android.widget.EdgeEffect r7 = r0.f1488G
            int r10 = r0.getHeight()
            float r10 = (float) r10
            float r10 = r4 / r10
            int r14 = r0.getWidth()
            float r14 = (float) r14
            float r6 = r6 / r14
            float r12 = r12 - r6
            O.d.a(r7, r10, r12)
            goto L_0x00dc
        L_0x00f9:
            if (r7 != 0) goto L_0x0103
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0103
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0108
        L_0x0103:
            java.util.WeakHashMap r3 = I.O.f393a
            r0.postInvalidateOnAnimation()
        L_0x0108:
            r17.l(r18, r19)
            goto L_0x010e
        L_0x010c:
            r16 = 1
        L_0x010e:
            if (r1 != 0) goto L_0x0112
            if (r2 == 0) goto L_0x0115
        L_0x0112:
            r0.t(r1, r2)
        L_0x0115:
            boolean r3 = r0.awakenScrollBars()
            if (r3 != 0) goto L_0x011e
            r0.invalidate()
        L_0x011e:
            if (r5 != 0) goto L_0x0126
            if (r1 != 0) goto L_0x0126
            if (r2 == 0) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            return r11
        L_0x0126:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.W(int, int, android.view.MotionEvent):boolean");
    }

    public final void X(int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        Y y2;
        N.g gVar = this.f1512e;
        a0();
        P();
        int i6 = l.f93a;
        Trace.beginSection("RV Scroll");
        V v2 = this.f1509c0;
        z(v2);
        P p2 = this.b;
        if (i2 != 0) {
            i4 = this.f1524l.m0(i2, p2, v2);
        } else {
            i4 = 0;
        }
        if (i3 != 0) {
            i5 = this.f1524l.o0(i3, p2, v2);
        } else {
            i5 = 0;
        }
        Trace.endSection();
        int n2 = gVar.n();
        for (int i7 = 0; i7 < n2; i7++) {
            View m2 = gVar.m(i7);
            Y H2 = H(m2);
            if (!(H2 == null || (y2 = H2.f1634i) == null)) {
                int left = m2.getLeft();
                int top2 = m2.getTop();
                View view = y2.f1628a;
                if (left != view.getLeft() || top2 != view.getTop()) {
                    view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
                }
            }
        }
        Q(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = i4;
            iArr[1] = i5;
        }
    }

    public final void Y(int i2) {
        C0098w wVar;
        if (!this.f1539u) {
            setScrollState(0);
            X x2 = this.f1504W;
            x2.f1626l.removeCallbacks(x2);
            x2.f1622h.abortAnimation();
            J j2 = this.f1524l;
            if (!(j2 == null || (wVar = j2.f1580e) == null)) {
                wVar.i();
            }
            J j3 = this.f1524l;
            if (j3 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            j3.n0(i2);
            awakenScrollBars();
        }
    }

    public final void Z(int i2, int i3, boolean z2) {
        J j2 = this.f1524l;
        if (j2 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1539u) {
            int i4 = 0;
            if (!j2.d()) {
                i2 = 0;
            }
            if (!this.f1524l.e()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (z2) {
                    if (i2 != 0) {
                        i4 = 1;
                    }
                    if (i3 != 0) {
                        i4 |= 2;
                    }
                    getScrollingChildHelper().g(i4, 1);
                }
                this.f1504W.b(i2, i3, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final void a0() {
        int i2 = this.f1537s + 1;
        this.f1537s = i2;
        if (i2 == 1 && !this.f1539u) {
            this.f1538t = false;
        }
    }

    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        J j2 = this.f1524l;
        if (j2 != null) {
            j2.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b0(boolean z2) {
        if (this.f1537s < 1) {
            this.f1537s = 1;
        }
        if (!z2 && !this.f1539u) {
            this.f1538t = false;
        }
        if (this.f1537s == 1) {
            if (z2 && this.f1538t && !this.f1539u && this.f1524l != null && this.f1522k != null) {
                o();
            }
            if (!this.f1539u) {
                this.f1538t = false;
            }
        }
        this.f1537s--;
    }

    public final void c0(int i2) {
        getScrollingChildHelper().h(i2);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof K) || !this.f1524l.f((K) layoutParams)) {
            return false;
        }
        return true;
    }

    public final int computeHorizontalScrollExtent() {
        J j2 = this.f1524l;
        if (j2 != null && j2.d()) {
            return this.f1524l.j(this.f1509c0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        J j2 = this.f1524l;
        if (j2 != null && j2.d()) {
            return this.f1524l.k(this.f1509c0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        J j2 = this.f1524l;
        if (j2 != null && j2.d()) {
            return this.f1524l.l(this.f1509c0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        J j2 = this.f1524l;
        if (j2 != null && j2.e()) {
            return this.f1524l.m(this.f1509c0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        J j2 = this.f1524l;
        if (j2 != null && j2.e()) {
            return this.f1524l.n(this.f1509c0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        J j2 = this.f1524l;
        if (j2 != null && j2.e()) {
            return this.f1524l.o(this.f1509c0);
        }
        return 0;
    }

    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5 = true;
        super.draw(canvas);
        ArrayList arrayList = this.f1526m;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ((G) arrayList.get(i4)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            if (this.f1514g) {
                i3 = getPaddingBottom();
            } else {
                i3 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i3), 0.0f);
            EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1486E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1514g) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1486E;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z4 = false;
            } else {
                z4 = true;
            }
            z2 |= z4;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1487F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f1514g) {
                i2 = getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-i2), (float) (-width));
            EdgeEffect edgeEffect6 = this.f1487F;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1488G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1514g) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f1488G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z2 |= z6;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.f1489H == null || arrayList.size() <= 0 || !this.f1489H.f()) {
            z5 = z2;
        }
        if (z5) {
            WeakHashMap weakHashMap = O.f393a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void f(Y y2) {
        boolean z2;
        View view = y2.f1628a;
        if (view.getParent() == this) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b.j(H(view));
        if (y2.j()) {
            this.f1512e.h(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.f1512e.g(view, -1, true);
        } else {
            N.g gVar = this.f1512e;
            int indexOfChild = ((C0071A) gVar.b).f1567a.indexOfChild(view);
            if (indexOfChild >= 0) {
                ((C0078b) gVar.f606c).h(indexOfChild);
                gVar.y(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x015f, code lost:
        if (r7 > 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x017d, code lost:
        if (r5 > 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0180, code lost:
        if (r7 < 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0183, code lost:
        if (r5 < 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x018c, code lost:
        if ((r5 * r6) < 0) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0195, code lost:
        if ((r5 * r6) > 0) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0199 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cc A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            b0.J r3 = r0.f1524l
            r3.getClass()
            b0.B r3 = r0.f1522k
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0021
            b0.J r3 = r0.f1524l
            if (r3 == 0) goto L_0x0021
            boolean r3 = r0.L()
            if (r3 != 0) goto L_0x0021
            boolean r3 = r0.f1539u
            if (r3 != 0) goto L_0x0021
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            b0.V r7 = r0.f1509c0
            b0.P r8 = r0.b
            r9 = 17
            r11 = 33
            r13 = 0
            r14 = 2
            if (r3 == 0) goto L_0x0095
            if (r2 == r14) goto L_0x0036
            if (r2 != r4) goto L_0x0095
        L_0x0036:
            b0.J r3 = r0.f1524l
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x004d
            if (r2 != r14) goto L_0x0043
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x0045
        L_0x0043:
            r3 = 33
        L_0x0045:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x004d
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 != 0) goto L_0x0079
            b0.J r15 = r0.f1524l
            boolean r15 = r15.d()
            if (r15 == 0) goto L_0x0079
            b0.J r3 = r0.f1524l
            int r3 = r3.C()
            if (r3 != r4) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            if (r2 != r14) goto L_0x0067
            r15 = 1
            goto L_0x0068
        L_0x0067:
            r15 = 0
        L_0x0068:
            r3 = r3 ^ r15
            if (r3 == 0) goto L_0x006e
            r3 = 66
            goto L_0x0070
        L_0x006e:
            r3 = 17
        L_0x0070:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x0078
            r3 = 1
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            if (r3 == 0) goto L_0x0090
            r0.m()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto L_0x0085
            goto L_0x00a6
        L_0x0085:
            r0.a0()
            b0.J r3 = r0.f1524l
            r3.S(r1, r2, r8, r7)
            r0.b0(r5)
        L_0x0090:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto L_0x00b5
        L_0x0095:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto L_0x00b4
            if (r3 == 0) goto L_0x00b4
            r0.m()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto L_0x00a7
        L_0x00a6:
            return r13
        L_0x00a7:
            r0.a0()
            b0.J r3 = r0.f1524l
            android.view.View r3 = r3.S(r1, r2, r8, r7)
            r0.b0(r5)
            goto L_0x00b5
        L_0x00b4:
            r3 = r6
        L_0x00b5:
            if (r3 == 0) goto L_0x00cc
            boolean r6 = r3.hasFocusable()
            if (r6 != 0) goto L_0x00cc
            android.view.View r4 = r0.getFocusedChild()
            if (r4 != 0) goto L_0x00c8
            android.view.View r1 = super.focusSearch(r17, r18)
            return r1
        L_0x00c8:
            r0.U(r3, r13)
            return r1
        L_0x00cc:
            if (r3 == 0) goto L_0x00d7
            if (r3 != r0) goto L_0x00d1
            goto L_0x00d7
        L_0x00d1:
            android.view.View r6 = r0.A(r3)
            if (r6 != 0) goto L_0x00da
        L_0x00d7:
            r4 = 0
            goto L_0x0197
        L_0x00da:
            if (r1 != 0) goto L_0x00de
            goto L_0x0197
        L_0x00de:
            android.view.View r6 = r16.A(r17)
            if (r6 != 0) goto L_0x00e6
            goto L_0x0197
        L_0x00e6:
            int r6 = r1.getWidth()
            int r7 = r1.getHeight()
            android.graphics.Rect r8 = r0.f1516h
            r8.set(r5, r5, r6, r7)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Rect r13 = r0.f1518i
            r13.set(r5, r5, r6, r7)
            r0.offsetDescendantRectToMyCoords(r1, r8)
            r0.offsetDescendantRectToMyCoords(r3, r13)
            b0.J r6 = r0.f1524l
            int r6 = r6.C()
            if (r6 != r4) goto L_0x0110
            r6 = -1
            goto L_0x0111
        L_0x0110:
            r6 = 1
        L_0x0111:
            int r15 = r8.left
            int r5 = r13.left
            if (r15 < r5) goto L_0x011b
            int r7 = r8.right
            if (r7 > r5) goto L_0x0123
        L_0x011b:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 >= r12) goto L_0x0123
            r5 = 1
            goto L_0x0130
        L_0x0123:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 > r12) goto L_0x012b
            if (r15 < r12) goto L_0x012f
        L_0x012b:
            if (r15 <= r5) goto L_0x012f
            r5 = -1
            goto L_0x0130
        L_0x012f:
            r5 = 0
        L_0x0130:
            int r7 = r8.top
            int r12 = r13.top
            if (r7 < r12) goto L_0x013a
            int r15 = r8.bottom
            if (r15 > r12) goto L_0x0142
        L_0x013a:
            int r15 = r8.bottom
            int r10 = r13.bottom
            if (r15 >= r10) goto L_0x0142
            r7 = 1
            goto L_0x014f
        L_0x0142:
            int r8 = r8.bottom
            int r10 = r13.bottom
            if (r8 > r10) goto L_0x014a
            if (r7 < r10) goto L_0x014e
        L_0x014a:
            if (r7 <= r12) goto L_0x014e
            r7 = -1
            goto L_0x014f
        L_0x014e:
            r7 = 0
        L_0x014f:
            if (r2 == r4) goto L_0x018f
            if (r2 == r14) goto L_0x0186
            if (r2 == r9) goto L_0x0183
            if (r2 == r11) goto L_0x0180
            r6 = 66
            if (r2 == r6) goto L_0x017d
            r6 = 130(0x82, float:1.82E-43)
            if (r2 != r6) goto L_0x0162
            if (r7 <= 0) goto L_0x00d7
            goto L_0x0197
        L_0x0162:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid direction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r0.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x017d:
            if (r5 <= 0) goto L_0x00d7
            goto L_0x0197
        L_0x0180:
            if (r7 >= 0) goto L_0x00d7
            goto L_0x0197
        L_0x0183:
            if (r5 >= 0) goto L_0x00d7
            goto L_0x0197
        L_0x0186:
            if (r7 > 0) goto L_0x0197
            if (r7 != 0) goto L_0x00d7
            int r5 = r5 * r6
            if (r5 < 0) goto L_0x00d7
            goto L_0x0197
        L_0x018f:
            if (r7 < 0) goto L_0x0197
            if (r7 != 0) goto L_0x00d7
            int r5 = r5 * r6
            if (r5 > 0) goto L_0x00d7
        L_0x0197:
            if (r4 == 0) goto L_0x019a
            return r3
        L_0x019a:
            android.view.View r1 = super.focusSearch(r17, r18)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(G g2) {
        J j2 = this.f1524l;
        if (j2 != null) {
            j2.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1526m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(g2);
        N();
        requestLayout();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        J j2 = this.f1524l;
        if (j2 != null) {
            return j2.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        J j2 = this.f1524l;
        if (j2 != null) {
            return j2.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C0072B getAdapter() {
        return this.f1522k;
    }

    public int getBaseline() {
        J j2 = this.f1524l;
        if (j2 == null) {
            return super.getBaseline();
        }
        j2.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.f1514g;
    }

    public a0 getCompatAccessibilityDelegate() {
        return this.f1521j0;
    }

    public C0075E getEdgeEffectFactory() {
        return this.f1485C;
    }

    public C0076F getItemAnimator() {
        return this.f1489H;
    }

    public int getItemDecorationCount() {
        return this.f1526m.size();
    }

    public J getLayoutManager() {
        return this.f1524l;
    }

    public int getMaxFlingVelocity() {
        return this.f1500S;
    }

    public int getMinFlingVelocity() {
        return this.f1499R;
    }

    public long getNanoTime() {
        if (f1480u0) {
            return System.nanoTime();
        }
        return 0;
    }

    public L getOnFlingListener() {
        return this.f1498Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1503V;
    }

    public b0.O getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.f1490I;
    }

    public final void h(M m2) {
        if (this.e0 == null) {
            this.e0 = new ArrayList();
        }
        this.e0.add(m2);
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
            }
            throw new IllegalStateException(str);
        } else if (this.f1484B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    public final boolean isAttachedToWindow() {
        return this.f1531p;
    }

    public final boolean isLayoutSuppressed() {
        return this.f1539u;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f443d;
    }

    public final void k() {
        int x2 = this.f1512e.x();
        for (int i2 = 0; i2 < x2; i2++) {
            Y I2 = I(this.f1512e.w(i2));
            if (!I2.o()) {
                I2.f1630d = -1;
                I2.f1632g = -1;
            }
        }
        P p2 = this.b;
        ArrayList arrayList = p2.f1598c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Y y2 = (Y) arrayList.get(i3);
            y2.f1630d = -1;
            y2.f1632g = -1;
        }
        ArrayList arrayList2 = p2.f1597a;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Y y3 = (Y) arrayList2.get(i4);
            y3.f1630d = -1;
            y3.f1632g = -1;
        }
        ArrayList arrayList3 = p2.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                Y y4 = (Y) p2.b.get(i5);
                y4.f1630d = -1;
                y4.f1632g = -1;
            }
        }
    }

    public final void l(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.D;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.D.onRelease();
            z2 = this.D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1487F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f1487F.onRelease();
            z2 |= this.f1487F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1486E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f1486E.onRelease();
            z2 |= this.f1486E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1488G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f1488G.onRelease();
            z2 |= this.f1488G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = O.f393a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        g gVar = this.f1510d;
        if (!this.f1535r || this.f1543y) {
            int i2 = l.f93a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
        } else if (gVar.g()) {
            gVar.getClass();
            if (gVar.g()) {
                int i3 = l.f93a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = O.f393a;
        setMeasuredDimension(J.g(i2, paddingRight, getMinimumWidth()), J.g(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: b0.Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: b0.Y} */
    /* JADX WARNING: type inference failed for: r11v0, types: [b0.Y] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r13v6, types: [java.lang.Object, I.o] */
    /* JADX WARNING: type inference failed for: r7v32 */
    /* JADX WARNING: type inference failed for: r7v33 */
    /* JADX WARNING: type inference failed for: r7v34 */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0334, code lost:
        if (((java.util.ArrayList) r0.f1512e.f607d).contains(getFocusedChild()) == false) goto L_0x03f7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r21 = this;
            r0 = r21
            b0.B r1 = r0.f1522k
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x000e:
            b0.J r1 = r0.f1524l
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x0018:
            b0.V r1 = r0.f1509c0
            r3 = 0
            r1.f1615i = r3
            int r4 = r1.f1611d
            r5 = 1
            if (r4 != r5) goto L_0x002e
            r0.p()
            b0.J r4 = r0.f1524l
            r4.p0(r0)
            r0.q()
            goto L_0x0068
        L_0x002e:
            F.g r4 = r0.f1510d
            java.lang.Object r6 = r4.f199d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0045
            java.lang.Object r4 = r4.f198c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0045
            goto L_0x0060
        L_0x0045:
            b0.J r4 = r0.f1524l
            int r4 = r4.f1588n
            int r6 = r0.getWidth()
            if (r4 != r6) goto L_0x0060
            b0.J r4 = r0.f1524l
            int r4 = r4.f1589o
            int r6 = r0.getHeight()
            if (r4 == r6) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            b0.J r4 = r0.f1524l
            r4.p0(r0)
            goto L_0x0068
        L_0x0060:
            b0.J r4 = r0.f1524l
            r4.p0(r0)
            r0.q()
        L_0x0068:
            r4 = 4
            r1.a(r4)
            r0.a0()
            r0.P()
            r1.f1611d = r5
            boolean r6 = r1.f1616j
            r7 = 0
            b0.P r8 = r0.b
            F.c r9 = r0.f
            if (r6 == 0) goto L_0x0295
            N.g r6 = r0.f1512e
            int r6 = r6.n()
            int r6 = r6 - r5
        L_0x0084:
            if (r6 < 0) goto L_0x01c0
            N.g r10 = r0.f1512e
            android.view.View r10 = r10.m(r6)
            b0.Y r10 = I(r10)
            boolean r11 = r10.o()
            if (r11 == 0) goto L_0x009a
            r17 = 1
            goto L_0x01ba
        L_0x009a:
            long r11 = r0.G(r10)
            b0.F r13 = r0.f1489H
            r13.getClass()
            I.o r13 = new I.o
            r13.<init>()
            r13.a(r10)
            java.lang.Object r14 = r9.f194c
            n.e r14 = (n.C0292e) r14
            java.lang.Object r14 = r14.e(r11, r7)
            b0.Y r14 = (b0.Y) r14
            if (r14 == 0) goto L_0x01b5
            boolean r15 = r14.o()
            if (r15 != 0) goto L_0x01b5
            java.lang.Object r15 = r9.b
            n.k r15 = (n.k) r15
            java.lang.Object r16 = r15.getOrDefault(r14, r7)
            r17 = 1
            r5 = r16
            b0.i0 r5 = (b0.i0) r5
            if (r5 == 0) goto L_0x00d5
            int r5 = r5.f1714a
            r5 = r5 & 1
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            java.lang.Object r15 = r15.getOrDefault(r10, r7)
            b0.i0 r15 = (b0.i0) r15
            if (r15 == 0) goto L_0x00e6
            int r15 = r15.f1714a
            r15 = r15 & 1
            if (r15 == 0) goto L_0x00e6
            r15 = 1
            goto L_0x00e7
        L_0x00e6:
            r15 = 0
        L_0x00e7:
            if (r5 == 0) goto L_0x00f0
            if (r14 != r10) goto L_0x00f0
            r9.a(r10, r13)
            goto L_0x01ba
        L_0x00f0:
            I.o r7 = r9.H(r14, r4)
            r9.a(r10, r13)
            r13 = 8
            I.o r13 = r9.H(r10, r13)
            if (r7 != 0) goto L_0x018d
            N.g r5 = r0.f1512e
            int r5 = r5.n()
            r7 = 0
        L_0x0106:
            if (r7 >= r5) goto L_0x016c
            N.g r13 = r0.f1512e
            android.view.View r13 = r13.m(r7)
            b0.Y r13 = I(r13)
            if (r13 != r10) goto L_0x0115
            goto L_0x0169
        L_0x0115:
            long r18 = r0.G(r13)
            int r15 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0169
            b0.B r1 = r0.f1522k
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x0148
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x0148
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r0.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0148:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r0.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0169:
            int r7 = r7 + 1
            goto L_0x0106
        L_0x016c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r5.<init>(r7)
            r5.append(r14)
            java.lang.String r7 = " cannot be found but it is necessary for "
            r5.append(r7)
            r5.append(r10)
            java.lang.String r7 = r0.y()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            goto L_0x01ba
        L_0x018d:
            r14.n(r3)
            if (r5 == 0) goto L_0x0195
            r0.f(r14)
        L_0x0195:
            if (r14 == r10) goto L_0x01a9
            if (r15 == 0) goto L_0x019c
            r0.f(r10)
        L_0x019c:
            r14.f1633h = r10
            r0.f(r14)
            r8.j(r14)
            r10.n(r3)
            r10.f1634i = r14
        L_0x01a9:
            b0.F r5 = r0.f1489H
            boolean r5 = r5.a(r14, r10, r7, r13)
            if (r5 == 0) goto L_0x01ba
            r0.S()
            goto L_0x01ba
        L_0x01b5:
            r17 = 1
            r9.a(r10, r13)
        L_0x01ba:
            int r6 = r6 + -1
            r5 = 1
            r7 = 0
            goto L_0x0084
        L_0x01c0:
            r17 = 1
            java.lang.Object r2 = r9.b
            n.k r2 = (n.k) r2
            int r4 = r2.f3706h
            int r4 = r4 + -1
        L_0x01ca:
            if (r4 < 0) goto L_0x0293
            java.lang.Object r5 = r2.h(r4)
            r11 = r5
            b0.Y r11 = (b0.Y) r11
            java.lang.Object r5 = r2.i(r4)
            b0.i0 r5 = (b0.i0) r5
            int r6 = r5.f1714a
            r7 = r6 & 3
            r10 = 3
            b0.A r12 = r0.f1536r0
            if (r7 != r10) goto L_0x01f0
            androidx.recyclerview.widget.RecyclerView r6 = r12.f1567a
            b0.J r7 = r6.f1524l
            android.view.View r10 = r11.f1628a
            b0.P r6 = r6.b
            r7.i0(r10, r6)
        L_0x01ed:
            r7 = 0
            goto L_0x0283
        L_0x01f0:
            r7 = r6 & 1
            if (r7 == 0) goto L_0x020a
            I.o r6 = r5.b
            if (r6 != 0) goto L_0x0204
            androidx.recyclerview.widget.RecyclerView r6 = r12.f1567a
            b0.J r7 = r6.f1524l
            android.view.View r10 = r11.f1628a
            b0.P r6 = r6.b
            r7.i0(r10, r6)
            goto L_0x01ed
        L_0x0204:
            I.o r7 = r5.f1715c
            r12.g(r11, r6, r7)
            goto L_0x01ed
        L_0x020a:
            r7 = r6 & 14
            r10 = 14
            if (r7 != r10) goto L_0x0218
            I.o r6 = r5.b
            I.o r7 = r5.f1715c
            r12.f(r11, r6, r7)
            goto L_0x01ed
        L_0x0218:
            r7 = r6 & 12
            r10 = 12
            if (r7 != r10) goto L_0x026a
            I.o r6 = r5.b
            I.o r7 = r5.f1715c
            r12.getClass()
            r11.n(r3)
            androidx.recyclerview.widget.RecyclerView r10 = r12.f1567a
            boolean r12 = r10.f1543y
            if (r12 == 0) goto L_0x023a
            b0.F r12 = r10.f1489H
            boolean r6 = r12.a(r11, r11, r6, r7)
            if (r6 == 0) goto L_0x0268
            r10.S()
            goto L_0x0268
        L_0x023a:
            b0.F r12 = r10.f1489H
            b0.i r12 = (b0.C0085i) r12
            r12.getClass()
            int r13 = r6.f456a
            int r14 = r7.f456a
            if (r13 != r14) goto L_0x0254
            int r15 = r6.b
            int r3 = r7.b
            if (r15 == r3) goto L_0x024e
            goto L_0x0254
        L_0x024e:
            r12.c(r11)
            r3 = r10
            r6 = 0
            goto L_0x0263
        L_0x0254:
            int r3 = r6.b
            int r15 = r7.b
            r20 = r13
            r13 = r3
            r3 = r10
            r10 = r12
            r12 = r20
            boolean r6 = r10.g(r11, r12, r13, r14, r15)
        L_0x0263:
            if (r6 == 0) goto L_0x0268
            r3.S()
        L_0x0268:
            r3 = 0
            goto L_0x01ed
        L_0x026a:
            r3 = r6 & 4
            if (r3 == 0) goto L_0x0276
            I.o r3 = r5.b
            r7 = 0
            r12.g(r11, r3, r7)
        L_0x0274:
            r3 = 0
            goto L_0x0283
        L_0x0276:
            r7 = 0
            r3 = r6 & 8
            if (r3 == 0) goto L_0x0274
            I.o r3 = r5.b
            I.o r6 = r5.f1715c
            r12.f(r11, r3, r6)
            goto L_0x0274
        L_0x0283:
            r5.f1714a = r3
            r5.b = r7
            r5.f1715c = r7
            H.b r3 = b0.i0.f1713d
            r3.c(r5)
            int r4 = r4 + -1
            r3 = 0
            goto L_0x01ca
        L_0x0293:
            r7 = 0
            goto L_0x0297
        L_0x0295:
            r17 = 1
        L_0x0297:
            b0.J r2 = r0.f1524l
            r2.h0(r8)
            int r2 = r1.f1612e
            r1.b = r2
            r3 = 0
            r0.f1543y = r3
            r0.f1544z = r3
            r1.f1616j = r3
            r1.f1617k = r3
            b0.J r2 = r0.f1524l
            r2.f = r3
            java.util.ArrayList r2 = r8.b
            if (r2 == 0) goto L_0x02b4
            r2.clear()
        L_0x02b4:
            b0.J r2 = r0.f1524l
            boolean r4 = r2.f1585k
            if (r4 == 0) goto L_0x02c1
            r2.f1584j = r3
            r2.f1585k = r3
            r8.k()
        L_0x02c1:
            b0.J r2 = r0.f1524l
            r2.c0(r1)
            r2 = 1
            r0.Q(r2)
            r0.b0(r3)
            java.lang.Object r2 = r9.b
            n.k r2 = (n.k) r2
            r2.clear()
            java.lang.Object r2 = r9.f194c
            n.e r2 = (n.C0292e) r2
            r2.b()
            int[] r2 = r0.f1523k0
            r4 = r2[r3]
            r17 = 1
            r5 = r2[r17]
            r0.C(r2)
            r6 = r2[r3]
            if (r6 != r4) goto L_0x02f1
            r2 = r2[r17]
            if (r2 == r5) goto L_0x02ef
            goto L_0x02f1
        L_0x02ef:
            r2 = 0
            goto L_0x02f2
        L_0x02f1:
            r2 = 1
        L_0x02f2:
            if (r2 == 0) goto L_0x02f7
            r0.t(r3, r3)
        L_0x02f7:
            boolean r2 = r0.f1503V
            r4 = -1
            r6 = -1
            if (r2 == 0) goto L_0x03f7
            b0.B r2 = r0.f1522k
            if (r2 == 0) goto L_0x03f7
            boolean r2 = r0.hasFocus()
            if (r2 == 0) goto L_0x03f7
            int r2 = r0.getDescendantFocusability()
            r8 = 393216(0x60000, float:5.51013E-40)
            if (r2 == r8) goto L_0x03f7
            int r2 = r0.getDescendantFocusability()
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r8) goto L_0x0320
            boolean r2 = r0.isFocused()
            if (r2 == 0) goto L_0x0320
            goto L_0x03f7
        L_0x0320:
            boolean r2 = r0.isFocused()
            if (r2 != 0) goto L_0x0338
            android.view.View r2 = r0.getFocusedChild()
            N.g r8 = r0.f1512e
            java.lang.Object r8 = r8.f607d
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r2 = r8.contains(r2)
            if (r2 != 0) goto L_0x0338
            goto L_0x03f7
        L_0x0338:
            long r8 = r1.f1619m
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x037e
            b0.B r2 = r0.f1522k
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x037e
            if (r2 != 0) goto L_0x0347
            goto L_0x037e
        L_0x0347:
            N.g r2 = r0.f1512e
            int r2 = r2.x()
            r11 = r7
            r10 = 0
        L_0x034f:
            if (r10 >= r2) goto L_0x037f
            N.g r12 = r0.f1512e
            android.view.View r12 = r12.w(r10)
            b0.Y r12 = I(r12)
            if (r12 == 0) goto L_0x037b
            boolean r13 = r12.h()
            if (r13 != 0) goto L_0x037b
            long r13 = r12.f1631e
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 != 0) goto L_0x037b
            N.g r11 = r0.f1512e
            java.lang.Object r11 = r11.f607d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            android.view.View r13 = r12.f1628a
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L_0x0379
            r11 = r12
            goto L_0x037b
        L_0x0379:
            r11 = r12
            goto L_0x037f
        L_0x037b:
            int r10 = r10 + 1
            goto L_0x034f
        L_0x037e:
            r11 = r7
        L_0x037f:
            if (r11 == 0) goto L_0x0398
            N.g r2 = r0.f1512e
            java.lang.Object r2 = r2.f607d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            android.view.View r8 = r11.f1628a
            boolean r2 = r2.contains(r8)
            if (r2 != 0) goto L_0x0398
            boolean r2 = r8.hasFocusable()
            if (r2 != 0) goto L_0x0396
            goto L_0x0398
        L_0x0396:
            r7 = r8
            goto L_0x03de
        L_0x0398:
            N.g r2 = r0.f1512e
            int r2 = r2.n()
            if (r2 <= 0) goto L_0x03de
            int r2 = r1.f1618l
            if (r2 == r6) goto L_0x03a5
            r3 = r2
        L_0x03a5:
            int r2 = r1.b()
            r8 = r3
        L_0x03aa:
            if (r8 >= r2) goto L_0x03c0
            b0.Y r9 = r0.E(r8)
            if (r9 != 0) goto L_0x03b3
            goto L_0x03c0
        L_0x03b3:
            android.view.View r9 = r9.f1628a
            boolean r10 = r9.hasFocusable()
            if (r10 == 0) goto L_0x03bd
            r7 = r9
            goto L_0x03de
        L_0x03bd:
            int r8 = r8 + 1
            goto L_0x03aa
        L_0x03c0:
            int r2 = java.lang.Math.min(r2, r3)
            r17 = 1
            int r2 = r2 + -1
        L_0x03c8:
            if (r2 < 0) goto L_0x03de
            b0.Y r3 = r0.E(r2)
            if (r3 != 0) goto L_0x03d1
            goto L_0x03de
        L_0x03d1:
            android.view.View r3 = r3.f1628a
            boolean r8 = r3.hasFocusable()
            if (r8 == 0) goto L_0x03db
            r7 = r3
            goto L_0x03de
        L_0x03db:
            int r2 = r2 + -1
            goto L_0x03c8
        L_0x03de:
            if (r7 == 0) goto L_0x03f7
            int r2 = r1.f1620n
            long r8 = (long) r2
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x03f4
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x03f4
            boolean r3 = r2.isFocusable()
            if (r3 == 0) goto L_0x03f4
            r7 = r2
        L_0x03f4:
            r7.requestFocus()
        L_0x03f7:
            r1.f1619m = r4
            r1.f1618l = r6
            r1.f1620n = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, b0.p] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r1 >= 30.0f) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f1483A = r0
            r1 = 1
            r5.f1531p = r1
            boolean r2 = r5.f1535r
            if (r2 == 0) goto L_0x0015
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            r5.f1535r = r2
            b0.J r2 = r5.f1524l
            if (r2 == 0) goto L_0x0021
            r2.f1581g = r1
            r2.Q(r5)
        L_0x0021:
            r5.f1519i0 = r0
            boolean r0 = f1480u0
            if (r0 == 0) goto L_0x0076
            java.lang.ThreadLocal r0 = b0.C0092p.f1753j
            java.lang.Object r1 = r0.get()
            b0.p r1 = (b0.C0092p) r1
            r5.f1506a0 = r1
            if (r1 != 0) goto L_0x006f
            b0.p r1 = new b0.p
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1757i = r2
            r5.f1506a0 = r1
            java.util.WeakHashMap r1 = I.O.f393a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0063:
            b0.p r2 = r5.f1506a0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f1756h = r3
            r0.set(r2)
        L_0x006f:
            b0.p r0 = r5.f1506a0
            java.util.ArrayList r0 = r0.f
            r0.add(r5)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public final void onDetachedFromWindow() {
        C0092p pVar;
        C0098w wVar;
        super.onDetachedFromWindow();
        C0076F f2 = this.f1489H;
        if (f2 != null) {
            f2.e();
        }
        setScrollState(0);
        X x2 = this.f1504W;
        x2.f1626l.removeCallbacks(x2);
        x2.f1622h.abortAnimation();
        J j2 = this.f1524l;
        if (!(j2 == null || (wVar = j2.f1580e) == null)) {
            wVar.i();
        }
        this.f1531p = false;
        J j3 = this.f1524l;
        if (j3 != null) {
            j3.f1581g = false;
            j3.R(this);
        }
        this.f1532p0.clear();
        removeCallbacks(this.f1534q0);
        this.f.getClass();
        do {
        } while (i0.f1713d.a() != null);
        if (f1480u0 && (pVar = this.f1506a0) != null) {
            pVar.f.remove(this);
            this.f1506a0 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1526m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((G) arrayList.get(i2)).a(this);
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.f1524l != null && !this.f1539u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f1524l.e()) {
                    f3 = -motionEvent.getAxisValue(9);
                } else {
                    f3 = 0.0f;
                }
                if (this.f1524l.d()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        W((int) (f2 * this.f1501T), (int) (f3 * this.f1502U), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1524l.e()) {
                        f3 = -axisValue;
                    } else if (this.f1524l.d()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        W((int) (f2 * this.f1501T), (int) (f3 * this.f1502U), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            W((int) (f2 * this.f1501T), (int) (f3 * this.f1502U), motionEvent);
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.f1539u) {
            this.f1529o = null;
            if (B(motionEvent)) {
                V();
                setScrollState(0);
                return true;
            }
            J j2 = this.f1524l;
            if (j2 != null) {
                boolean d2 = j2.d();
                boolean e2 = this.f1524l.e();
                if (this.f1492K == null) {
                    this.f1492K = VelocityTracker.obtain();
                }
                this.f1492K.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f1540v) {
                        this.f1540v = false;
                    }
                    this.f1491J = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.f1495N = x2;
                    this.f1493L = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.f1496O = y2;
                    this.f1494M = y2;
                    if (this.f1490I == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        c0(1);
                    }
                    int[] iArr = this.n0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    if (e2) {
                        d2 |= true;
                    }
                    getScrollingChildHelper().g(d2 ? 1 : 0, 0);
                } else if (actionMasked == 1) {
                    this.f1492K.clear();
                    c0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1491J);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1491J + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f1490I != 1) {
                        int i2 = x3 - this.f1493L;
                        int i3 = y3 - this.f1494M;
                        if (!d2 || Math.abs(i2) <= this.f1497P) {
                            z2 = false;
                        } else {
                            this.f1495N = x3;
                            z2 = true;
                        }
                        if (e2 && Math.abs(i3) > this.f1497P) {
                            this.f1496O = y3;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f1491J = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1495N = x4;
                    this.f1493L = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1496O = y4;
                    this.f1494M = y4;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                if (this.f1490I == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = l.f93a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f1535r = true;
    }

    public final void onMeasure(int i2, int i3) {
        J j2 = this.f1524l;
        if (j2 == null) {
            n(i2, i3);
            return;
        }
        boolean L2 = j2.L();
        V v2 = this.f1509c0;
        if (L2) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f1524l.b.n(i2, i3);
            if ((mode != 1073741824 || mode2 != 1073741824) && this.f1522k != null) {
                if (v2.f1611d == 1) {
                    p();
                }
                this.f1524l.q0(i2, i3);
                v2.f1615i = true;
                q();
                this.f1524l.s0(i2, i3);
                if (this.f1524l.v0()) {
                    this.f1524l.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    v2.f1615i = true;
                    q();
                    this.f1524l.s0(i2, i3);
                }
            }
        } else if (this.f1533q) {
            this.f1524l.b.n(i2, i3);
        } else if (v2.f1617k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            C0072B b2 = this.f1522k;
            if (b2 != null) {
                v2.f1612e = b2.a();
            } else {
                v2.f1612e = 0;
            }
            a0();
            this.f1524l.b.n(i2, i3);
            b0(false);
            v2.f1613g = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof S)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        S s2 = (S) parcelable;
        this.f1508c = s2;
        super.onRestoreInstanceState(s2.f);
        J j2 = this.f1524l;
        if (j2 != null && (parcelable2 = this.f1508c.f1603h) != null) {
            j2.d0(parcelable2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, Q.b, b0.S] */
    public final Parcelable onSaveInstanceState() {
        ? bVar = new b(super.onSaveInstanceState());
        S s2 = this.f1508c;
        if (s2 != null) {
            bVar.f1603h = s2.f1603h;
            return bVar;
        }
        J j2 = this.f1524l;
        if (j2 != null) {
            bVar.f1603h = j2.e0();
            return bVar;
        }
        bVar.f1603h = null;
        return bVar;
    }

    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            this.f1488G = null;
            this.f1486E = null;
            this.f1487F = null;
            this.D = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0401, code lost:
        if (r2 < r5) goto L_0x03c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0211  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            r30 = this;
            r0 = r30
            r6 = r31
            boolean r1 = r0.f1539u
            r7 = 0
            if (r1 != 0) goto L_0x000d
            boolean r1 = r0.f1540v
            if (r1 == 0) goto L_0x0010
        L_0x000d:
            r3 = 0
            goto L_0x04a0
        L_0x0010:
            b0.l r1 = r0.f1529o
            r8 = 1
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            if (r1 != 0) goto L_0x0028
            int r1 = r6.getAction()
            if (r1 != 0) goto L_0x0022
            r1 = 0
            goto L_0x012d
        L_0x0022:
            boolean r1 = r30.B(r31)
            goto L_0x012d
        L_0x0028:
            int r9 = r1.f1740v
            if (r9 != 0) goto L_0x002e
            goto L_0x0122
        L_0x002e:
            int r9 = r6.getAction()
            if (r9 != 0) goto L_0x006e
            float r9 = r6.getX()
            float r10 = r6.getY()
            boolean r9 = r1.d(r9, r10)
            float r10 = r6.getX()
            float r11 = r6.getY()
            boolean r10 = r1.c(r10, r11)
            if (r9 != 0) goto L_0x0050
            if (r10 == 0) goto L_0x0122
        L_0x0050:
            if (r10 == 0) goto L_0x005d
            r1.f1741w = r8
            float r9 = r6.getX()
            int r9 = (int) r9
            float r9 = (float) r9
            r1.f1734p = r9
            goto L_0x0069
        L_0x005d:
            if (r9 == 0) goto L_0x0069
            r1.f1741w = r2
            float r9 = r6.getY()
            int r9 = (int) r9
            float r9 = (float) r9
            r1.f1731m = r9
        L_0x0069:
            r1.f(r2)
            goto L_0x0122
        L_0x006e:
            int r9 = r6.getAction()
            if (r9 != r8) goto L_0x0083
            int r9 = r1.f1740v
            if (r9 != r2) goto L_0x0083
            r1.f1731m = r5
            r1.f1734p = r5
            r1.f(r8)
            r1.f1741w = r7
            goto L_0x0122
        L_0x0083:
            int r9 = r6.getAction()
            if (r9 != r2) goto L_0x0122
            int r9 = r1.f1740v
            if (r9 != r2) goto L_0x0122
            r1.g()
            int r9 = r1.f1741w
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r1.b
            if (r9 != r8) goto L_0x00db
            float r9 = r6.getX()
            int[] r14 = r1.f1743y
            r14[r7] = r11
            int r12 = r1.f1735q
            int r12 = r12 - r11
            r14[r8] = r12
            float r13 = (float) r11
            float r12 = (float) r12
            float r9 = java.lang.Math.min(r12, r9)
            float r13 = java.lang.Math.max(r13, r9)
            int r9 = r1.f1733o
            float r9 = (float) r9
            float r9 = r9 - r13
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x00bc
            goto L_0x00db
        L_0x00bc:
            float r12 = r1.f1734p
            androidx.recyclerview.widget.RecyclerView r9 = r1.f1737s
            int r15 = r9.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r9 = r1.f1737s
            int r16 = r9.computeHorizontalScrollOffset()
            int r9 = r1.f1735q
            r17 = r9
            int r9 = b0.C0088l.e(r12, r13, r14, r15, r16, r17)
            if (r9 == 0) goto L_0x00d9
            androidx.recyclerview.widget.RecyclerView r12 = r1.f1737s
            r12.scrollBy(r9, r7)
        L_0x00d9:
            r1.f1734p = r13
        L_0x00db:
            int r9 = r1.f1741w
            if (r9 != r2) goto L_0x0122
            float r9 = r6.getY()
            int[] r14 = r1.f1742x
            r14[r7] = r11
            int r12 = r1.f1736r
            int r12 = r12 - r11
            r14[r8] = r12
            float r11 = (float) r11
            float r12 = (float) r12
            float r9 = java.lang.Math.min(r12, r9)
            float r13 = java.lang.Math.max(r11, r9)
            int r9 = r1.f1730l
            float r9 = (float) r9
            float r9 = r9 - r13
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x0103
            goto L_0x0122
        L_0x0103:
            float r12 = r1.f1731m
            androidx.recyclerview.widget.RecyclerView r9 = r1.f1737s
            int r15 = r9.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r9 = r1.f1737s
            int r16 = r9.computeVerticalScrollOffset()
            int r9 = r1.f1736r
            r17 = r9
            int r9 = b0.C0088l.e(r12, r13, r14, r15, r16, r17)
            if (r9 == 0) goto L_0x0120
            androidx.recyclerview.widget.RecyclerView r10 = r1.f1737s
            r10.scrollBy(r7, r9)
        L_0x0120:
            r1.f1731m = r13
        L_0x0122:
            int r1 = r6.getAction()
            if (r1 == r4) goto L_0x012a
            if (r1 != r8) goto L_0x012c
        L_0x012a:
            r0.f1529o = r3
        L_0x012c:
            r1 = 1
        L_0x012d:
            if (r1 == 0) goto L_0x0136
            r0.V()
            r0.setScrollState(r7)
            return r8
        L_0x0136:
            b0.J r1 = r0.f1524l
            if (r1 != 0) goto L_0x013c
            goto L_0x000d
        L_0x013c:
            boolean r9 = r1.d()
            b0.J r1 = r0.f1524l
            boolean r10 = r1.e()
            android.view.VelocityTracker r1 = r0.f1492K
            if (r1 != 0) goto L_0x0150
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.f1492K = r1
        L_0x0150:
            int r1 = r6.getActionMasked()
            int r11 = r6.getActionIndex()
            int[] r12 = r0.n0
            if (r1 != 0) goto L_0x0160
            r12[r8] = r7
            r12[r7] = r7
        L_0x0160:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r6)
            r14 = r12[r7]
            float r14 = (float) r14
            r15 = r12[r8]
            float r15 = (float) r15
            r13.offsetLocation(r14, r15)
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x046e
            java.lang.String r15 = "RecyclerView"
            if (r1 == r8) goto L_0x0281
            if (r1 == r2) goto L_0x01aa
            if (r1 == r4) goto L_0x01a2
            r2 = 5
            if (r1 == r2) goto L_0x0186
            r2 = 6
            if (r1 == r2) goto L_0x0181
            goto L_0x0495
        L_0x0181:
            r30.R(r31)
            goto L_0x0495
        L_0x0186:
            int r1 = r6.getPointerId(r11)
            r0.f1491J = r1
            float r1 = r6.getX(r11)
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f1495N = r1
            r0.f1493L = r1
            float r1 = r6.getY(r11)
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f1496O = r1
            r0.f1494M = r1
            goto L_0x0495
        L_0x01a2:
            r0.V()
            r0.setScrollState(r7)
            goto L_0x0495
        L_0x01aa:
            int r1 = r0.f1491J
            int r1 = r6.findPointerIndex(r1)
            if (r1 >= 0) goto L_0x01cb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error processing scroll; pointer index for id "
            r1.<init>(r2)
            int r2 = r0.f1491J
            r1.append(r2)
            java.lang.String r2 = " not found. Did any MotionEvents get skipped?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r15, r1)
            return r7
        L_0x01cb:
            float r2 = r6.getX(r1)
            float r2 = r2 + r14
            int r11 = (int) r2
            float r1 = r6.getY(r1)
            float r1 = r1 + r14
            int r14 = (int) r1
            int r1 = r0.f1495N
            int r1 = r1 - r11
            int r2 = r0.f1496O
            int r2 = r2 - r14
            int r3 = r0.f1490I
            if (r3 == r8) goto L_0x0214
            if (r9 == 0) goto L_0x01f8
            if (r1 <= 0) goto L_0x01ed
            int r3 = r0.f1497P
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r7, r1)
            goto L_0x01f4
        L_0x01ed:
            int r3 = r0.f1497P
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r7, r1)
        L_0x01f4:
            if (r1 == 0) goto L_0x01f8
            r3 = 1
            goto L_0x01f9
        L_0x01f8:
            r3 = 0
        L_0x01f9:
            if (r10 == 0) goto L_0x020f
            if (r2 <= 0) goto L_0x0205
            int r4 = r0.f1497P
            int r2 = r2 - r4
            int r2 = java.lang.Math.max(r7, r2)
            goto L_0x020c
        L_0x0205:
            int r4 = r0.f1497P
            int r2 = r2 + r4
            int r2 = java.lang.Math.min(r7, r2)
        L_0x020c:
            if (r2 == 0) goto L_0x020f
            r3 = 1
        L_0x020f:
            if (r3 == 0) goto L_0x0214
            r0.setScrollState(r8)
        L_0x0214:
            r15 = r1
            r16 = r2
            int r1 = r0.f1490I
            if (r1 != r8) goto L_0x0495
            int[] r3 = r0.f1530o0
            r3[r7] = r7
            r3[r8] = r7
            if (r9 == 0) goto L_0x0225
            r1 = r15
            goto L_0x0226
        L_0x0225:
            r1 = 0
        L_0x0226:
            if (r10 == 0) goto L_0x022b
            r2 = r16
            goto L_0x022c
        L_0x022b:
            r2 = 0
        L_0x022c:
            int[] r4 = r0.f1527m0
            r5 = 0
            boolean r1 = r0.r(r1, r2, r3, r4, r5)
            int[] r2 = r0.f1527m0
            if (r1 == 0) goto L_0x0253
            r1 = r3[r7]
            int r15 = r15 - r1
            r1 = r3[r8]
            int r16 = r16 - r1
            r1 = r12[r7]
            r3 = r2[r7]
            int r1 = r1 + r3
            r12[r7] = r1
            r1 = r12[r8]
            r3 = r2[r8]
            int r1 = r1 + r3
            r12[r8] = r1
            android.view.ViewParent r1 = r0.getParent()
            r1.requestDisallowInterceptTouchEvent(r8)
        L_0x0253:
            r1 = r16
            r3 = r2[r7]
            int r11 = r11 - r3
            r0.f1495N = r11
            r2 = r2[r8]
            int r14 = r14 - r2
            r0.f1496O = r14
            if (r9 == 0) goto L_0x0263
            r2 = r15
            goto L_0x0264
        L_0x0263:
            r2 = 0
        L_0x0264:
            if (r10 == 0) goto L_0x0267
            r7 = r1
        L_0x0267:
            boolean r2 = r0.W(r2, r7, r6)
            if (r2 == 0) goto L_0x0274
            android.view.ViewParent r2 = r0.getParent()
            r2.requestDisallowInterceptTouchEvent(r8)
        L_0x0274:
            b0.p r2 = r0.f1506a0
            if (r2 == 0) goto L_0x0495
            if (r15 != 0) goto L_0x027c
            if (r1 == 0) goto L_0x0495
        L_0x027c:
            r2.a(r0, r15, r1)
            goto L_0x0495
        L_0x0281:
            android.view.VelocityTracker r1 = r0.f1492K
            r1.addMovement(r13)
            android.view.VelocityTracker r1 = r0.f1492K
            int r4 = r0.f1500S
            float r6 = (float) r4
            r11 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r11, r6)
            if (r9 == 0) goto L_0x029c
            android.view.VelocityTracker r1 = r0.f1492K
            int r6 = r0.f1491J
            float r1 = r1.getXVelocity(r6)
            float r1 = -r1
            goto L_0x029d
        L_0x029c:
            r1 = 0
        L_0x029d:
            if (r10 == 0) goto L_0x02a9
            android.view.VelocityTracker r6 = r0.f1492K
            int r9 = r0.f1491J
            float r6 = r6.getYVelocity(r9)
            float r6 = -r6
            goto L_0x02aa
        L_0x02a9:
            r6 = 0
        L_0x02aa:
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x02b6
            int r9 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x02b3
            goto L_0x02b6
        L_0x02b3:
            r3 = 0
            goto L_0x0467
        L_0x02b6:
            int r1 = (int) r1
            int r6 = (int) r6
            b0.J r9 = r0.f1524l
            if (r9 != 0) goto L_0x02c2
            java.lang.String r1 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r15, r1)
            goto L_0x02b3
        L_0x02c2:
            boolean r10 = r0.f1539u
            if (r10 == 0) goto L_0x02c7
            goto L_0x02b3
        L_0x02c7:
            boolean r9 = r9.d()
            b0.J r10 = r0.f1524l
            boolean r10 = r10.e()
            int r11 = r0.f1499R
            if (r9 == 0) goto L_0x02db
            int r12 = java.lang.Math.abs(r1)
            if (r12 >= r11) goto L_0x02dc
        L_0x02db:
            r1 = 0
        L_0x02dc:
            if (r10 == 0) goto L_0x02e4
            int r12 = java.lang.Math.abs(r6)
            if (r12 >= r11) goto L_0x02e5
        L_0x02e4:
            r6 = 0
        L_0x02e5:
            if (r1 != 0) goto L_0x02ea
            if (r6 != 0) goto L_0x02ea
            goto L_0x02b3
        L_0x02ea:
            float r11 = (float) r1
            float r12 = (float) r6
            boolean r14 = r0.dispatchNestedPreFling(r11, r12)
            if (r14 != 0) goto L_0x02b3
            if (r9 != 0) goto L_0x02f9
            if (r10 == 0) goto L_0x02f7
            goto L_0x02f9
        L_0x02f7:
            r14 = 0
            goto L_0x02fa
        L_0x02f9:
            r14 = 1
        L_0x02fa:
            r0.dispatchNestedFling(r11, r12, r14)
            b0.L r11 = r0.f1498Q
            if (r11 == 0) goto L_0x040d
            b0.z r11 = (b0.C0101z) r11
            androidx.recyclerview.widget.RecyclerView r12 = r11.f1802a
            b0.J r12 = r12.getLayoutManager()
            if (r12 != 0) goto L_0x030d
            goto L_0x040d
        L_0x030d:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f1802a
            b0.B r15 = r15.getAdapter()
            if (r15 != 0) goto L_0x0317
            goto L_0x040d
        L_0x0317:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f1802a
            int r15 = r15.getMinFlingVelocity()
            int r3 = java.lang.Math.abs(r6)
            if (r3 > r15) goto L_0x0329
            int r3 = java.lang.Math.abs(r1)
            if (r3 <= r15) goto L_0x040d
        L_0x0329:
            boolean r3 = r12 instanceof b0.U
            if (r3 != 0) goto L_0x032f
            goto L_0x040d
        L_0x032f:
            if (r3 != 0) goto L_0x0335
            r15 = 0
            r17 = 0
            goto L_0x0343
        L_0x0335:
            b0.y r15 = new b0.y
            r17 = 0
            androidx.recyclerview.widget.RecyclerView r5 = r11.f1802a
            android.content.Context r5 = r5.getContext()
            r7 = 0
            r15.<init>(r11, r5, r7)
        L_0x0343:
            if (r15 != 0) goto L_0x0347
            goto L_0x040d
        L_0x0347:
            int r5 = r12.B()
            if (r5 != 0) goto L_0x0353
        L_0x034d:
            r2 = -1
            r3 = -1
            r20 = 1
            goto L_0x0404
        L_0x0353:
            boolean r18 = r12.e()
            if (r18 == 0) goto L_0x035e
            androidx.emoji2.text.g r11 = r11.e(r12)
            goto L_0x036a
        L_0x035e:
            boolean r18 = r12.d()
            if (r18 == 0) goto L_0x0369
            androidx.emoji2.text.g r11 = r11.d(r12)
            goto L_0x036a
        L_0x0369:
            r11 = 0
        L_0x036a:
            if (r11 != 0) goto L_0x036d
            goto L_0x034d
        L_0x036d:
            int r2 = r12.v()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2147483647(0x7fffffff, float:NaN)
            r21 = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            r16 = 0
            r19 = 0
            r20 = 1
        L_0x0384:
            if (r8 >= r2) goto L_0x03aa
            r22 = r2
            android.view.View r2 = r12.u(r8)
            if (r2 != 0) goto L_0x0391
            r23 = r8
            goto L_0x03a5
        L_0x0391:
            r23 = r8
            int r8 = b0.C0101z.b(r2, r11)
            if (r8 > 0) goto L_0x039e
            if (r8 <= r7) goto L_0x039e
            r19 = r2
            r7 = r8
        L_0x039e:
            if (r8 < 0) goto L_0x03a5
            if (r8 >= r3) goto L_0x03a5
            r16 = r2
            r3 = r8
        L_0x03a5:
            int r8 = r23 + 1
            r2 = r22
            goto L_0x0384
        L_0x03aa:
            boolean r2 = r12.d()
            if (r2 == 0) goto L_0x03b6
            if (r1 <= 0) goto L_0x03b4
        L_0x03b2:
            r2 = 1
            goto L_0x03b9
        L_0x03b4:
            r2 = 0
            goto L_0x03b9
        L_0x03b6:
            if (r6 <= 0) goto L_0x03b4
            goto L_0x03b2
        L_0x03b9:
            if (r2 == 0) goto L_0x03c3
            if (r16 == 0) goto L_0x03c3
            int r2 = b0.J.H(r16)
        L_0x03c1:
            r3 = -1
            goto L_0x0404
        L_0x03c3:
            if (r2 != 0) goto L_0x03cc
            if (r19 == 0) goto L_0x03cc
            int r2 = b0.J.H(r19)
            goto L_0x03c1
        L_0x03cc:
            if (r2 == 0) goto L_0x03d0
            r16 = r19
        L_0x03d0:
            if (r16 != 0) goto L_0x03d4
        L_0x03d2:
            r2 = -1
            goto L_0x03c1
        L_0x03d4:
            int r3 = b0.J.H(r16)
            int r7 = r12.B()
            if (r21 == 0) goto L_0x03f6
            r8 = r12
            b0.U r8 = (b0.U) r8
            int r7 = r7 + -1
            android.graphics.PointF r7 = r8.a(r7)
            if (r7 == 0) goto L_0x03f6
            float r8 = r7.x
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 < 0) goto L_0x03f8
            float r7 = r7.y
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r7 >= 0) goto L_0x03f6
            goto L_0x03f8
        L_0x03f6:
            r7 = 0
            goto L_0x03f9
        L_0x03f8:
            r7 = 1
        L_0x03f9:
            if (r7 != r2) goto L_0x03fd
            r2 = -1
            goto L_0x03fe
        L_0x03fd:
            r2 = 1
        L_0x03fe:
            int r2 = r2 + r3
            if (r2 < 0) goto L_0x03d2
            if (r2 < r5) goto L_0x03c1
            goto L_0x03d2
        L_0x0404:
            if (r2 != r3) goto L_0x0407
            goto L_0x040f
        L_0x0407:
            r15.f1785a = r2
            r12.y0(r15)
            goto L_0x046a
        L_0x040d:
            r20 = 1
        L_0x040f:
            if (r14 == 0) goto L_0x02b3
            if (r10 == 0) goto L_0x0415
            r9 = r9 | 2
        L_0x0415:
            I.l r2 = r0.getScrollingChildHelper()
            r3 = 1
            r2.g(r9, r3)
            int r2 = -r4
            int r1 = java.lang.Math.min(r1, r4)
            int r24 = java.lang.Math.max(r2, r1)
            int r1 = java.lang.Math.min(r6, r4)
            int r25 = java.lang.Math.max(r2, r1)
            b0.X r1 = r0.f1504W
            androidx.recyclerview.widget.RecyclerView r2 = r1.f1626l
            r3 = 2
            r2.setScrollState(r3)
            r3 = 0
            r1.f1621g = r3
            r1.f = r3
            android.view.animation.Interpolator r3 = r1.f1623i
            R.d r4 = f1482w0
            if (r3 == r4) goto L_0x044e
            r1.f1623i = r4
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2, r4)
            r1.f1622h = r3
        L_0x044e:
            android.widget.OverScroller r2 = r1.f1622h
            r26 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = 2147483647(0x7fffffff, float:NaN)
            r22 = 0
            r23 = 0
            r28 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = 2147483647(0x7fffffff, float:NaN)
            r21 = r2
            r21.fling(r22, r23, r24, r25, r26, r27, r28, r29)
            r1.a()
            goto L_0x046a
        L_0x0467:
            r0.setScrollState(r3)
        L_0x046a:
            r0.V()
            goto L_0x049a
        L_0x046e:
            r3 = 0
            int r1 = r6.getPointerId(r3)
            r0.f1491J = r1
            float r1 = r6.getX()
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f1495N = r1
            r0.f1493L = r1
            float r1 = r6.getY()
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f1496O = r1
            r0.f1494M = r1
            if (r10 == 0) goto L_0x048d
            r9 = r9 | 2
        L_0x048d:
            I.l r1 = r0.getScrollingChildHelper()
            r3 = 0
            r1.g(r9, r3)
        L_0x0495:
            android.view.VelocityTracker r1 = r0.f1492K
            r1.addMovement(r13)
        L_0x049a:
            r13.recycle()
            r20 = 1
            return r20
        L_0x04a0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [java.lang.Object, I.o] */
    /* JADX WARNING: type inference failed for: r9v6, types: [java.lang.Object, I.o] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0226 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r22 = this;
            r0 = r22
            b0.V r1 = r0.f1509c0
            r2 = 1
            r1.a(r2)
            r0.z(r1)
            r3 = 0
            r1.f1615i = r3
            r0.a0()
            F.c r4 = r0.f
            java.lang.Object r5 = r4.b
            n.k r5 = (n.k) r5
            r5.clear()
            java.lang.Object r5 = r4.f194c
            n.e r5 = (n.C0292e) r5
            r5.b()
            r0.P()
            boolean r6 = r0.f1543y
            if (r6 == 0) goto L_0x0041
            F.g r6 = r0.f1510d
            java.lang.Object r7 = r6.f198c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r6.l(r7)
            java.lang.Object r7 = r6.f199d
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r6.l(r7)
            boolean r6 = r0.f1544z
            if (r6 == 0) goto L_0x0041
            b0.J r6 = r0.f1524l
            r6.X()
        L_0x0041:
            b0.F r6 = r0.f1489H
            if (r6 == 0) goto L_0x032c
            b0.J r6 = r0.f1524l
            boolean r6 = r6.z0()
            if (r6 == 0) goto L_0x032c
            F.g r6 = r0.f1510d
            java.lang.Object r7 = r6.f198c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r8 = r6.f
            A.j r8 = (A.j) r8
            r8.getClass()
        L_0x005a:
            int r9 = r7.size()
            r10 = 1
            int r9 = r9 - r10
            r12 = 0
        L_0x0061:
            r13 = -1
            r14 = 8
            if (r9 < 0) goto L_0x0077
            java.lang.Object r15 = r7.get(r9)
            b0.a r15 = (b0.C0077a) r15
            int r15 = r15.f1646a
            if (r15 != r14) goto L_0x0073
            if (r12 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0073:
            r12 = 1
        L_0x0074:
            int r9 = r9 + -1
            goto L_0x0061
        L_0x0077:
            r9 = -1
        L_0x0078:
            r12 = 4
            r15 = 2
            if (r9 == r13) goto L_0x022a
            int r14 = r9 + 1
            java.lang.Object r16 = r7.get(r9)
            r11 = r16
            b0.a r11 = (b0.C0077a) r11
            java.lang.Object r16 = r7.get(r14)
            r13 = r16
            b0.a r13 = (b0.C0077a) r13
            int r2 = r13.f1646a
            if (r2 == r10) goto L_0x01fb
            r18 = 0
            java.lang.Object r3 = r8.b
            F.g r3 = (F.g) r3
            if (r2 == r15) goto L_0x00ff
            if (r2 == r12) goto L_0x009e
            goto L_0x0226
        L_0x009e:
            int r2 = r11.f1647c
            int r15 = r13.b
            if (r2 >= r15) goto L_0x00a9
            int r15 = r15 + -1
            r13.b = r15
            goto L_0x00ba
        L_0x00a9:
            int r10 = r13.f1647c
            int r15 = r15 + r10
            if (r2 >= r15) goto L_0x00ba
            int r10 = r10 + -1
            r13.f1647c = r10
            int r2 = r11.b
            r10 = 1
            b0.a r2 = r3.j(r12, r2, r10)
            goto L_0x00bc
        L_0x00ba:
            r2 = r18
        L_0x00bc:
            int r10 = r11.b
            int r15 = r13.b
            if (r10 > r15) goto L_0x00c7
            int r15 = r15 + 1
            r13.b = r15
            goto L_0x00d9
        L_0x00c7:
            int r12 = r13.f1647c
            int r15 = r15 + r12
            if (r10 >= r15) goto L_0x00d9
            int r15 = r15 - r10
            int r10 = r10 + 1
            r12 = 4
            b0.a r18 = r3.j(r12, r10, r15)
            int r10 = r13.f1647c
            int r10 = r10 - r15
            r13.f1647c = r10
        L_0x00d9:
            r10 = r18
            r7.set(r14, r11)
            int r11 = r13.f1647c
            if (r11 <= 0) goto L_0x00e6
            r7.set(r9, r13)
            goto L_0x00f3
        L_0x00e6:
            r7.remove(r9)
            r3.getClass()
            java.lang.Object r3 = r3.b
            H.b r3 = (H.b) r3
            r3.c(r13)
        L_0x00f3:
            if (r2 == 0) goto L_0x00f8
            r7.add(r9, r2)
        L_0x00f8:
            if (r10 == 0) goto L_0x0226
            r7.add(r9, r10)
            goto L_0x0226
        L_0x00ff:
            int r2 = r11.b
            int r10 = r11.f1647c
            if (r2 >= r10) goto L_0x0117
            int r12 = r13.b
            if (r12 != r2) goto L_0x0113
            int r12 = r13.f1647c
            int r2 = r10 - r2
            if (r12 != r2) goto L_0x0113
            r2 = 0
        L_0x0110:
            r17 = 1
            goto L_0x0126
        L_0x0113:
            r2 = 0
        L_0x0114:
            r17 = 0
            goto L_0x0126
        L_0x0117:
            int r12 = r13.b
            int r15 = r10 + 1
            if (r12 != r15) goto L_0x0124
            int r12 = r13.f1647c
            int r2 = r2 - r10
            if (r12 != r2) goto L_0x0124
            r2 = 1
            goto L_0x0110
        L_0x0124:
            r2 = 1
            goto L_0x0114
        L_0x0126:
            int r12 = r13.b
            if (r10 >= r12) goto L_0x012f
            int r12 = r12 + -1
            r13.b = r12
            goto L_0x0151
        L_0x012f:
            int r15 = r13.f1647c
            int r12 = r12 + r15
            if (r10 >= r12) goto L_0x0151
            int r15 = r15 + -1
            r13.f1647c = r15
            r2 = 2
            r11.f1646a = r2
            r10 = 1
            r11.f1647c = r10
            int r2 = r13.f1647c
            if (r2 != 0) goto L_0x0226
            r7.remove(r14)
            r3.getClass()
            java.lang.Object r2 = r3.b
            H.b r2 = (H.b) r2
            r2.c(r13)
            goto L_0x0226
        L_0x0151:
            int r10 = r11.b
            int r12 = r13.b
            if (r10 > r12) goto L_0x015c
            int r12 = r12 + 1
            r13.b = r12
            goto L_0x0170
        L_0x015c:
            int r15 = r13.f1647c
            int r12 = r12 + r15
            if (r10 >= r12) goto L_0x0170
            int r12 = r12 - r10
            int r10 = r10 + 1
            r15 = 2
            b0.a r18 = r3.j(r15, r10, r12)
            int r10 = r11.b
            int r12 = r13.b
            int r10 = r10 - r12
            r13.f1647c = r10
        L_0x0170:
            r10 = r18
            if (r17 == 0) goto L_0x0186
            r7.set(r9, r13)
            r7.remove(r14)
            r3.getClass()
            java.lang.Object r2 = r3.b
            H.b r2 = (H.b) r2
            r2.c(r11)
            goto L_0x0226
        L_0x0186:
            if (r2 == 0) goto L_0x01b7
            if (r10 == 0) goto L_0x01a0
            int r2 = r11.b
            int r3 = r10.b
            if (r2 <= r3) goto L_0x0195
            int r3 = r10.f1647c
            int r2 = r2 - r3
            r11.b = r2
        L_0x0195:
            int r2 = r11.f1647c
            int r3 = r10.b
            if (r2 <= r3) goto L_0x01a0
            int r3 = r10.f1647c
            int r2 = r2 - r3
            r11.f1647c = r2
        L_0x01a0:
            int r2 = r11.b
            int r3 = r13.b
            if (r2 <= r3) goto L_0x01ab
            int r3 = r13.f1647c
            int r2 = r2 - r3
            r11.b = r2
        L_0x01ab:
            int r2 = r11.f1647c
            int r3 = r13.b
            if (r2 <= r3) goto L_0x01e5
            int r3 = r13.f1647c
            int r2 = r2 - r3
            r11.f1647c = r2
            goto L_0x01e5
        L_0x01b7:
            if (r10 == 0) goto L_0x01cf
            int r2 = r11.b
            int r3 = r10.b
            if (r2 < r3) goto L_0x01c4
            int r3 = r10.f1647c
            int r2 = r2 - r3
            r11.b = r2
        L_0x01c4:
            int r2 = r11.f1647c
            int r3 = r10.b
            if (r2 < r3) goto L_0x01cf
            int r3 = r10.f1647c
            int r2 = r2 - r3
            r11.f1647c = r2
        L_0x01cf:
            int r2 = r11.b
            int r3 = r13.b
            if (r2 < r3) goto L_0x01da
            int r3 = r13.f1647c
            int r2 = r2 - r3
            r11.b = r2
        L_0x01da:
            int r2 = r11.f1647c
            int r3 = r13.b
            if (r2 < r3) goto L_0x01e5
            int r3 = r13.f1647c
            int r2 = r2 - r3
            r11.f1647c = r2
        L_0x01e5:
            r7.set(r9, r13)
            int r2 = r11.b
            int r3 = r11.f1647c
            if (r2 == r3) goto L_0x01f2
            r7.set(r14, r11)
            goto L_0x01f5
        L_0x01f2:
            r7.remove(r14)
        L_0x01f5:
            if (r10 == 0) goto L_0x0226
            r7.add(r9, r10)
            goto L_0x0226
        L_0x01fb:
            int r2 = r11.f1647c
            int r3 = r13.b
            if (r2 >= r3) goto L_0x0204
            r17 = -1
            goto L_0x0206
        L_0x0204:
            r17 = 0
        L_0x0206:
            int r10 = r11.b
            if (r10 >= r3) goto L_0x020c
            int r17 = r17 + 1
        L_0x020c:
            if (r3 > r10) goto L_0x0213
            int r3 = r13.f1647c
            int r10 = r10 + r3
            r11.b = r10
        L_0x0213:
            int r3 = r13.b
            if (r3 > r2) goto L_0x021c
            int r10 = r13.f1647c
            int r2 = r2 + r10
            r11.f1647c = r2
        L_0x021c:
            int r3 = r3 + r17
            r13.b = r3
            r7.set(r9, r13)
            r7.set(r14, r11)
        L_0x0226:
            r2 = 1
            r3 = 0
            goto L_0x005a
        L_0x022a:
            int r2 = r7.size()
            r3 = 0
        L_0x022f:
            if (r3 >= r2) goto L_0x0328
            java.lang.Object r8 = r7.get(r3)
            b0.a r8 = (b0.C0077a) r8
            int r9 = r8.f1646a
            r10 = 1
            if (r9 == r10) goto L_0x0318
            java.lang.Object r10 = r6.b
            H.b r10 = (H.b) r10
            java.lang.Object r11 = r6.f200e
            b0.A r11 = (b0.C0071A) r11
            r15 = 2
            if (r9 == r15) goto L_0x02b4
            r12 = 4
            if (r9 == r12) goto L_0x0257
            if (r9 == r14) goto L_0x0253
        L_0x024c:
            r21 = r2
        L_0x024e:
            r12 = 2
            r19 = 1
            goto L_0x0320
        L_0x0253:
            r6.k(r8)
            goto L_0x024c
        L_0x0257:
            int r9 = r8.b
            int r12 = r8.f1647c
            int r12 = r12 + r9
            r13 = r9
            r14 = -1
            r15 = 0
        L_0x025f:
            if (r9 >= r12) goto L_0x029a
            b0.Y r21 = r11.b(r9)
            if (r21 != 0) goto L_0x026d
            boolean r21 = r6.b(r9)
            if (r21 == 0) goto L_0x0271
        L_0x026d:
            r21 = r2
            r2 = 4
            goto L_0x0286
        L_0x0271:
            r21 = r2
            r2 = 1
            if (r14 != r2) goto L_0x0281
            r2 = 4
            b0.a r13 = r6.j(r2, r13, r15)
            r6.k(r13)
            r13 = r9
            r15 = 0
            goto L_0x0282
        L_0x0281:
            r2 = 4
        L_0x0282:
            r14 = 0
        L_0x0283:
            r19 = 1
            goto L_0x0293
        L_0x0286:
            if (r14 != 0) goto L_0x0291
            b0.a r13 = r6.j(r2, r13, r15)
            r6.d(r13)
            r13 = r9
            r15 = 0
        L_0x0291:
            r14 = 1
            goto L_0x0283
        L_0x0293:
            int r15 = r15 + 1
            int r9 = r9 + 1
            r2 = r21
            goto L_0x025f
        L_0x029a:
            r21 = r2
            int r2 = r8.f1647c
            if (r15 == r2) goto L_0x02a9
            r10.c(r8)
            r12 = 4
            b0.a r8 = r6.j(r12, r13, r15)
            goto L_0x02aa
        L_0x02a9:
            r12 = 4
        L_0x02aa:
            if (r14 != 0) goto L_0x02b0
            r6.d(r8)
            goto L_0x024e
        L_0x02b0:
            r6.k(r8)
            goto L_0x024e
        L_0x02b4:
            r21 = r2
            r12 = 4
            int r2 = r8.b
            int r9 = r8.f1647c
            int r9 = r9 + r2
            r13 = r2
            r14 = 0
            r15 = -1
        L_0x02bf:
            if (r13 >= r9) goto L_0x02fe
            b0.Y r20 = r11.b(r13)
            if (r20 != 0) goto L_0x02cd
            boolean r20 = r6.b(r13)
            if (r20 == 0) goto L_0x02cf
        L_0x02cd:
            r12 = 2
            goto L_0x02e0
        L_0x02cf:
            r12 = 1
            if (r15 != r12) goto L_0x02dc
            r12 = 2
            b0.a r15 = r6.j(r12, r2, r14)
            r6.k(r15)
            r15 = 1
            goto L_0x02de
        L_0x02dc:
            r12 = 2
            r15 = 0
        L_0x02de:
            r12 = 0
            goto L_0x02ee
        L_0x02e0:
            if (r15 != 0) goto L_0x02eb
            b0.a r15 = r6.j(r12, r2, r14)
            r6.d(r15)
            r12 = 1
            goto L_0x02ec
        L_0x02eb:
            r12 = 0
        L_0x02ec:
            r15 = r12
            r12 = 1
        L_0x02ee:
            if (r15 == 0) goto L_0x02f6
            int r13 = r13 - r14
            int r9 = r9 - r14
            r14 = 1
        L_0x02f3:
            r19 = 1
            goto L_0x02f9
        L_0x02f6:
            int r14 = r14 + 1
            goto L_0x02f3
        L_0x02f9:
            int r13 = r13 + 1
            r15 = r12
            r12 = 4
            goto L_0x02bf
        L_0x02fe:
            r19 = 1
            int r9 = r8.f1647c
            if (r14 == r9) goto L_0x030d
            r10.c(r8)
            r12 = 2
            b0.a r8 = r6.j(r12, r2, r14)
            goto L_0x030e
        L_0x030d:
            r12 = 2
        L_0x030e:
            if (r15 != 0) goto L_0x0314
            r6.d(r8)
            goto L_0x0320
        L_0x0314:
            r6.k(r8)
            goto L_0x0320
        L_0x0318:
            r21 = r2
            r12 = 2
            r19 = 1
            r6.k(r8)
        L_0x0320:
            int r3 = r3 + 1
            r2 = r21
            r14 = 8
            goto L_0x022f
        L_0x0328:
            r7.clear()
            goto L_0x0331
        L_0x032c:
            F.g r2 = r0.f1510d
            r2.c()
        L_0x0331:
            boolean r2 = r0.f1513f0
            r3 = 1
            r6 = 0
            if (r2 != 0) goto L_0x033e
            boolean r2 = r0.f1515g0
            if (r2 == 0) goto L_0x033c
            goto L_0x033e
        L_0x033c:
            r2 = 0
            goto L_0x033f
        L_0x033e:
            r2 = 1
        L_0x033f:
            boolean r7 = r0.f1535r
            if (r7 == 0) goto L_0x035d
            b0.F r7 = r0.f1489H
            if (r7 == 0) goto L_0x035d
            boolean r7 = r0.f1543y
            if (r7 != 0) goto L_0x0353
            if (r2 != 0) goto L_0x0353
            b0.J r8 = r0.f1524l
            boolean r8 = r8.f
            if (r8 == 0) goto L_0x035d
        L_0x0353:
            if (r7 == 0) goto L_0x035b
            b0.B r7 = r0.f1522k
            boolean r7 = r7.b
            if (r7 == 0) goto L_0x035d
        L_0x035b:
            r7 = 1
            goto L_0x035e
        L_0x035d:
            r7 = 0
        L_0x035e:
            b0.V r8 = r0.f1509c0
            r8.f1616j = r7
            if (r7 == 0) goto L_0x0377
            if (r2 == 0) goto L_0x0377
            boolean r2 = r0.f1543y
            if (r2 != 0) goto L_0x0377
            b0.F r2 = r0.f1489H
            if (r2 == 0) goto L_0x0377
            b0.J r2 = r0.f1524l
            boolean r2 = r2.z0()
            if (r2 == 0) goto L_0x0377
            goto L_0x0378
        L_0x0377:
            r3 = 0
        L_0x0378:
            r8.f1617k = r3
            boolean r2 = r0.f1503V
            r3 = 0
            if (r2 == 0) goto L_0x038e
            boolean r2 = r0.hasFocus()
            if (r2 == 0) goto L_0x038e
            b0.B r2 = r0.f1522k
            if (r2 == 0) goto L_0x038e
            android.view.View r2 = r0.getFocusedChild()
            goto L_0x038f
        L_0x038e:
            r2 = r3
        L_0x038f:
            if (r2 != 0) goto L_0x0393
        L_0x0391:
            r2 = r3
            goto L_0x039e
        L_0x0393:
            android.view.View r2 = r0.A(r2)
            if (r2 != 0) goto L_0x039a
            goto L_0x0391
        L_0x039a:
            b0.Y r2 = r0.H(r2)
        L_0x039e:
            r6 = -1
            r8 = -1
            if (r2 != 0) goto L_0x03aa
            r1.f1619m = r6
            r1.f1618l = r8
            r1.f1620n = r8
            goto L_0x03f7
        L_0x03aa:
            b0.B r9 = r0.f1522k
            boolean r9 = r9.b
            if (r9 == 0) goto L_0x03b2
            long r6 = r2.f1631e
        L_0x03b2:
            r1.f1619m = r6
            boolean r6 = r0.f1543y
            if (r6 == 0) goto L_0x03ba
        L_0x03b8:
            r6 = -1
            goto L_0x03cc
        L_0x03ba:
            boolean r6 = r2.h()
            if (r6 == 0) goto L_0x03c3
            int r6 = r2.f1630d
            goto L_0x03cc
        L_0x03c3:
            androidx.recyclerview.widget.RecyclerView r6 = r2.f1643r
            if (r6 != 0) goto L_0x03c8
            goto L_0x03b8
        L_0x03c8:
            int r6 = r6.F(r2)
        L_0x03cc:
            r1.f1618l = r6
            android.view.View r2 = r2.f1628a
            int r6 = r2.getId()
        L_0x03d4:
            boolean r7 = r2.isFocused()
            if (r7 != 0) goto L_0x03f5
            boolean r7 = r2 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x03f5
            boolean r7 = r2.hasFocus()
            if (r7 == 0) goto L_0x03f5
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r2 = r2.getFocusedChild()
            int r7 = r2.getId()
            if (r7 == r8) goto L_0x03d4
            int r6 = r2.getId()
            goto L_0x03d4
        L_0x03f5:
            r1.f1620n = r6
        L_0x03f7:
            boolean r2 = r1.f1616j
            if (r2 == 0) goto L_0x0401
            boolean r2 = r0.f1515g0
            if (r2 == 0) goto L_0x0401
            r2 = 1
            goto L_0x0402
        L_0x0401:
            r2 = 0
        L_0x0402:
            r1.f1614h = r2
            r2 = 0
            r0.f1515g0 = r2
            r0.f1513f0 = r2
            boolean r2 = r1.f1617k
            r1.f1613g = r2
            b0.B r2 = r0.f1522k
            int r2 = r2.a()
            r1.f1612e = r2
            int[] r2 = r0.f1523k0
            r0.C(r2)
            boolean r2 = r1.f1616j
            java.lang.Object r4 = r4.b
            n.k r4 = (n.k) r4
            if (r2 == 0) goto L_0x0498
            N.g r2 = r0.f1512e
            int r2 = r2.n()
            r6 = 0
        L_0x0429:
            if (r6 >= r2) goto L_0x0498
            N.g r7 = r0.f1512e
            android.view.View r7 = r7.m(r6)
            b0.Y r7 = I(r7)
            boolean r9 = r7.o()
            if (r9 != 0) goto L_0x0495
            boolean r9 = r7.f()
            if (r9 == 0) goto L_0x0448
            b0.B r9 = r0.f1522k
            boolean r9 = r9.b
            if (r9 != 0) goto L_0x0448
            goto L_0x0495
        L_0x0448:
            b0.F r9 = r0.f1489H
            b0.C0076F.b(r7)
            r7.c()
            r9.getClass()
            I.o r9 = new I.o
            r9.<init>()
            r9.a(r7)
            java.lang.Object r10 = r4.getOrDefault(r7, r3)
            b0.i0 r10 = (b0.i0) r10
            if (r10 != 0) goto L_0x046a
            b0.i0 r10 = b0.i0.a()
            r4.put(r7, r10)
        L_0x046a:
            r10.b = r9
            int r9 = r10.f1714a
            r9 = r9 | 4
            r10.f1714a = r9
            boolean r9 = r1.f1614h
            if (r9 == 0) goto L_0x0495
            boolean r9 = r7.k()
            if (r9 == 0) goto L_0x0495
            boolean r9 = r7.h()
            if (r9 != 0) goto L_0x0495
            boolean r9 = r7.o()
            if (r9 != 0) goto L_0x0495
            boolean r9 = r7.f()
            if (r9 != 0) goto L_0x0495
            long r9 = r0.G(r7)
            r5.f(r9, r7)
        L_0x0495:
            int r6 = r6 + 1
            goto L_0x0429
        L_0x0498:
            boolean r2 = r1.f1617k
            r5 = 2
            if (r2 == 0) goto L_0x0538
            N.g r2 = r0.f1512e
            int r2 = r2.x()
            r6 = 0
        L_0x04a4:
            if (r6 >= r2) goto L_0x04c1
            N.g r7 = r0.f1512e
            android.view.View r7 = r7.w(r6)
            b0.Y r7 = I(r7)
            boolean r9 = r7.o()
            if (r9 != 0) goto L_0x04be
            int r9 = r7.f1630d
            if (r9 != r8) goto L_0x04be
            int r9 = r7.f1629c
            r7.f1630d = r9
        L_0x04be:
            int r6 = r6 + 1
            goto L_0x04a4
        L_0x04c1:
            boolean r2 = r1.f
            r6 = 0
            r1.f = r6
            b0.J r6 = r0.f1524l
            b0.P r7 = r0.b
            r6.b0(r7, r1)
            r1.f = r2
            r2 = 0
        L_0x04d0:
            N.g r6 = r0.f1512e
            int r6 = r6.n()
            if (r2 >= r6) goto L_0x0533
            N.g r6 = r0.f1512e
            android.view.View r6 = r6.m(r2)
            b0.Y r6 = I(r6)
            boolean r7 = r6.o()
            if (r7 == 0) goto L_0x04e9
            goto L_0x0530
        L_0x04e9:
            java.lang.Object r7 = r4.getOrDefault(r6, r3)
            b0.i0 r7 = (b0.i0) r7
            if (r7 == 0) goto L_0x04f8
            int r7 = r7.f1714a
            r7 = r7 & 4
            if (r7 == 0) goto L_0x04f8
            goto L_0x0530
        L_0x04f8:
            b0.C0076F.b(r6)
            int r7 = r6.f1635j
            r7 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x0503
            r7 = 1
            goto L_0x0504
        L_0x0503:
            r7 = 0
        L_0x0504:
            b0.F r8 = r0.f1489H
            r6.c()
            r8.getClass()
            I.o r8 = new I.o
            r8.<init>()
            r8.a(r6)
            if (r7 == 0) goto L_0x051a
            r0.T(r6, r8)
            goto L_0x0530
        L_0x051a:
            java.lang.Object r7 = r4.getOrDefault(r6, r3)
            b0.i0 r7 = (b0.i0) r7
            if (r7 != 0) goto L_0x0529
            b0.i0 r7 = b0.i0.a()
            r4.put(r6, r7)
        L_0x0529:
            int r6 = r7.f1714a
            r6 = r6 | r5
            r7.f1714a = r6
            r7.b = r8
        L_0x0530:
            int r2 = r2 + 1
            goto L_0x04d0
        L_0x0533:
            r0.k()
        L_0x0536:
            r2 = 1
            goto L_0x053c
        L_0x0538:
            r0.k()
            goto L_0x0536
        L_0x053c:
            r0.Q(r2)
            r2 = 0
            r0.b0(r2)
            r1.f1611d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        boolean z2;
        a0();
        P();
        V v2 = this.f1509c0;
        v2.a(6);
        this.f1510d.c();
        v2.f1612e = this.f1522k.a();
        v2.f1610c = 0;
        v2.f1613g = false;
        this.f1524l.b0(this.b, v2);
        v2.f = false;
        this.f1508c = null;
        if (!v2.f1616j || this.f1489H == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        v2.f1616j = z2;
        v2.f1611d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    public final void removeDetachedView(View view, boolean z2) {
        Y I2 = I(view);
        if (I2 != null) {
            if (I2.j()) {
                I2.f1635j &= -257;
            } else if (!I2.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I2 + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z2);
    }

    public final void requestChildFocus(View view, View view2) {
        C0098w wVar = this.f1524l.f1580e;
        if ((wVar == null || !wVar.f1788e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1524l.k0(this, view, rect, z2, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1528n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0088l) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void requestLayout() {
        if (this.f1537s != 0 || this.f1539u) {
            this.f1538t = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void scrollBy(int i2, int i3) {
        J j2 = this.f1524l;
        if (j2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1539u) {
            boolean d2 = j2.d();
            boolean e2 = this.f1524l.e();
            if (d2 || e2) {
                if (!d2) {
                    i2 = 0;
                }
                if (!e2) {
                    i3 = 0;
                }
                W(i2, i3, (MotionEvent) null);
            }
        }
    }

    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2;
        if (L()) {
            int i3 = 0;
            if (accessibilityEvent != null) {
                i2 = accessibilityEvent.getContentChangeTypes();
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                i3 = i2;
            }
            this.f1541w |= i3;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(a0 a0Var) {
        this.f1521j0 = a0Var;
        O.p(this, a0Var);
    }

    public void setAdapter(C0072B b2) {
        setLayoutFrozen(false);
        C0072B b3 = this.f1522k;
        e eVar = this.f1505a;
        if (b3 != null) {
            b3.f1568a.unregisterObserver(eVar);
            this.f1522k.getClass();
        }
        C0076F f2 = this.f1489H;
        if (f2 != null) {
            f2.e();
        }
        J j2 = this.f1524l;
        P p2 = this.b;
        if (j2 != null) {
            j2.g0(p2);
            this.f1524l.h0(p2);
        }
        p2.f1597a.clear();
        p2.d();
        g gVar = this.f1510d;
        gVar.l((ArrayList) gVar.f198c);
        gVar.l((ArrayList) gVar.f199d);
        C0072B b4 = this.f1522k;
        this.f1522k = b2;
        if (b2 != null) {
            b2.f1568a.registerObserver(eVar);
        }
        C0072B b5 = this.f1522k;
        p2.f1597a.clear();
        p2.d();
        b0.O c2 = p2.c();
        if (b4 != null) {
            c2.b--;
        }
        if (c2.b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = c2.f1596a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((N) sparseArray.valueAt(i2)).f1593a.clear();
                i2++;
            }
        }
        if (b5 != null) {
            c2.b++;
        }
        this.f1509c0.f = true;
        this.f1544z |= false;
        this.f1543y = true;
        int x2 = this.f1512e.x();
        for (int i3 = 0; i3 < x2; i3++) {
            Y I2 = I(this.f1512e.w(i3));
            if (I2 != null && !I2.o()) {
                I2.a(6);
            }
        }
        N();
        P p3 = this.b;
        ArrayList arrayList = p3.f1598c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Y y2 = (Y) arrayList.get(i4);
            if (y2 != null) {
                y2.a(6);
                y2.a(1024);
            }
        }
        C0072B b6 = p3.f1602h.f1522k;
        if (b6 == null || !b6.b) {
            p3.d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0074D d2) {
        if (d2 != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1514g) {
            this.f1488G = null;
            this.f1486E = null;
            this.f1487F = null;
            this.D = null;
        }
        this.f1514g = z2;
        super.setClipToPadding(z2);
        if (this.f1535r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0075E e2) {
        e2.getClass();
        this.f1485C = e2;
        this.f1488G = null;
        this.f1486E = null;
        this.f1487F = null;
        this.D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1533q = z2;
    }

    public void setItemAnimator(C0076F f2) {
        C0076F f3 = this.f1489H;
        if (f3 != null) {
            f3.e();
            this.f1489H.f1569a = null;
        }
        this.f1489H = f2;
        if (f2 != null) {
            f2.f1569a = this.f1517h0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        P p2 = this.b;
        p2.f1600e = i2;
        p2.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(J j2) {
        RecyclerView recyclerView;
        C0098w wVar;
        if (j2 != this.f1524l) {
            setScrollState(0);
            X x2 = this.f1504W;
            x2.f1626l.removeCallbacks(x2);
            x2.f1622h.abortAnimation();
            J j3 = this.f1524l;
            if (!(j3 == null || (wVar = j3.f1580e) == null)) {
                wVar.i();
            }
            J j4 = this.f1524l;
            P p2 = this.b;
            if (j4 != null) {
                C0076F f2 = this.f1489H;
                if (f2 != null) {
                    f2.e();
                }
                this.f1524l.g0(p2);
                this.f1524l.h0(p2);
                p2.f1597a.clear();
                p2.d();
                if (this.f1531p) {
                    J j5 = this.f1524l;
                    j5.f1581g = false;
                    j5.R(this);
                }
                this.f1524l.t0((RecyclerView) null);
                this.f1524l = null;
            } else {
                p2.f1597a.clear();
                p2.d();
            }
            N.g gVar = this.f1512e;
            ((C0078b) gVar.f606c).g();
            ArrayList arrayList = (ArrayList) gVar.f607d;
            int size = arrayList.size() - 1;
            while (true) {
                recyclerView = ((C0071A) gVar.b).f1567a;
                if (size < 0) {
                    break;
                }
                Y I2 = I((View) arrayList.get(size));
                if (I2 != null) {
                    int i2 = I2.f1641p;
                    if (recyclerView.L()) {
                        I2.f1642q = i2;
                        recyclerView.f1532p0.add(I2);
                    } else {
                        WeakHashMap weakHashMap = O.f393a;
                        I2.f1628a.setImportantForAccessibility(i2);
                    }
                    I2.f1641p = 0;
                }
                arrayList.remove(size);
                size--;
            }
            int childCount = recyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                I(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.f1524l = j2;
            if (j2 != null) {
                if (j2.b == null) {
                    j2.t0(this);
                    if (this.f1531p) {
                        J j6 = this.f1524l;
                        j6.f1581g = true;
                        j6.Q(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + j2 + " is already attached to a RecyclerView:" + j2.b.y());
                }
            }
            p2.k();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        C0020l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f443d) {
            WeakHashMap weakHashMap = O.f393a;
            D.z(scrollingChildHelper.f442c);
        }
        scrollingChildHelper.f443d = z2;
    }

    public void setOnFlingListener(L l2) {
        this.f1498Q = l2;
    }

    @Deprecated
    public void setOnScrollListener(M m2) {
        this.f1511d0 = m2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1503V = z2;
    }

    public void setRecycledViewPool(b0.O o2) {
        P p2 = this.b;
        b0.O o3 = p2.f1601g;
        if (o3 != null) {
            o3.b--;
        }
        p2.f1601g = o2;
        if (o2 != null && p2.f1602h.getAdapter() != null) {
            p2.f1601g.b++;
        }
    }

    public void setScrollState(int i2) {
        C0098w wVar;
        if (i2 != this.f1490I) {
            this.f1490I = i2;
            if (i2 != 2) {
                X x2 = this.f1504W;
                x2.f1626l.removeCallbacks(x2);
                x2.f1622h.abortAnimation();
                J j2 = this.f1524l;
                if (!(j2 == null || (wVar = j2.f1580e) == null)) {
                    wVar.i();
                }
            }
            J j3 = this.f1524l;
            if (j3 != null) {
                j3.f0(i2);
            }
            M m2 = this.f1511d0;
            if (m2 != null) {
                m2.a(this, i2);
            }
            ArrayList arrayList = this.e0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((M) this.e0.get(size)).a(this, i2);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.f1497P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f1497P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(W w2) {
        this.b.getClass();
    }

    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final void suppressLayout(boolean z2) {
        C0098w wVar;
        if (z2 != this.f1539u) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1539u = false;
                if (!(!this.f1538t || this.f1524l == null || this.f1522k == null)) {
                    requestLayout();
                }
                this.f1538t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1539u = true;
            this.f1540v = true;
            setScrollState(0);
            X x2 = this.f1504W;
            x2.f1626l.removeCallbacks(x2);
            x2.f1622h.abortAnimation();
            J j2 = this.f1524l;
            if (j2 != null && (wVar = j2.f1580e) != null) {
                wVar.i();
            }
        }
    }

    public final void t(int i2, int i3) {
        this.f1484B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        M m2 = this.f1511d0;
        if (m2 != null) {
            m2.b(this, i2, i3);
        }
        ArrayList arrayList = this.e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((M) this.e0.get(size)).b(this, i2, i3);
            }
        }
        this.f1484B--;
    }

    public final void u() {
        if (this.f1488G == null) {
            this.f1485C.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1488G = edgeEffect;
            if (this.f1514g) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void v() {
        if (this.D == null) {
            this.f1485C.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.D = edgeEffect;
            if (this.f1514g) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void w() {
        if (this.f1487F == null) {
            this.f1485C.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1487F = edgeEffect;
            if (this.f1514g) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void x() {
        if (this.f1486E == null) {
            this.f1485C.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1486E = edgeEffect;
            if (this.f1514g) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f1522k + ", layout:" + this.f1524l + ", context:" + getContext();
    }

    public final void z(V v2) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f1504W.f1622h;
            overScroller.getFinalX();
            overScroller.getCurrX();
            v2.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        v2.getClass();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: b0.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: b0.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v53, resolved type: b0.n} */
    /* JADX WARNING: type inference failed for: r0v8, types: [b0.E, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [b0.i, java.lang.Object, b0.F] */
    /* JADX WARNING: type inference failed for: r3v18, types: [java.lang.Object, b0.V] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r4 = r22
            r6 = r23
            r20.<init>(r21, r22, r23)
            E0.e r0 = new E0.e
            r3 = 22
            r0.<init>(r3, r1)
            r1.f1505a = r0
            b0.P r0 = new b0.P
            r0.<init>(r1)
            r1.b = r0
            F.c r0 = new F.c
            r3 = 13
            r0.<init>((int) r3)
            r1.f = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f1516h = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f1518i = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.f1520j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1526m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1528n = r0
            r9 = 0
            r1.f1537s = r9
            r1.f1543y = r9
            r1.f1544z = r9
            r1.f1483A = r9
            r1.f1484B = r9
            b0.E r0 = new b0.E
            r0.<init>()
            r1.f1485C = r0
            b0.i r0 = new b0.i
            r0.<init>()
            r10 = 0
            r0.f1569a = r10
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.b = r3
            r7 = 120(0x78, double:5.93E-322)
            r0.f1570c = r7
            r0.f1571d = r7
            r7 = 250(0xfa, double:1.235E-321)
            r0.f1572e = r7
            r0.f = r7
            r11 = 1
            r0.f1701g = r11
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f1702h = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f1703i = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f1704j = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f1705k = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f1706l = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f1707m = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f1708n = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f1709o = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f1710p = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f1711q = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f1712r = r3
            r1.f1489H = r0
            r1.f1490I = r9
            r0 = -1
            r1.f1491J = r0
            r3 = 1
            r1.f1501T = r3
            r1.f1502U = r3
            r1.f1503V = r11
            b0.X r3 = new b0.X
            r3.<init>(r1)
            r1.f1504W = r3
            boolean r3 = f1480u0
            if (r3 == 0) goto L_0x00e3
            b0.n r3 = new b0.n
            r3.<init>()
            goto L_0x00e4
        L_0x00e3:
            r3 = r10
        L_0x00e4:
            r1.f1507b0 = r3
            b0.V r3 = new b0.V
            r3.<init>()
            r3.f1609a = r0
            r3.b = r9
            r3.f1610c = r9
            r3.f1611d = r11
            r3.f1612e = r9
            r3.f = r9
            r3.f1613g = r9
            r3.f1614h = r9
            r3.f1615i = r9
            r3.f1616j = r9
            r3.f1617k = r9
            r1.f1509c0 = r3
            r1.f1513f0 = r9
            r1.f1515g0 = r9
            b0.A r3 = new b0.A
            r3.<init>(r1)
            r1.f1517h0 = r3
            r1.f1519i0 = r9
            r12 = 2
            int[] r5 = new int[r12]
            r1.f1523k0 = r5
            int[] r5 = new int[r12]
            r1.f1527m0 = r5
            int[] r5 = new int[r12]
            r1.n0 = r5
            int[] r5 = new int[r12]
            r1.f1530o0 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.f1532p0 = r5
            H0.E r5 = new H0.E
            r7 = 9
            r5.<init>(r7, r1)
            r1.f1534q0 = r5
            b0.A r5 = new b0.A
            r5.<init>(r1)
            r1.f1536r0 = r5
            r1.setScrollContainer(r11)
            r1.setFocusableInTouchMode(r11)
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r2)
            int r7 = r5.getScaledTouchSlop()
            r1.f1497P = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r7 < r8) goto L_0x0155
            java.lang.reflect.Method r13 = I.T.f398a
            float r13 = I.P.a(r5)
            goto L_0x0159
        L_0x0155:
            float r13 = I.T.a(r5, r2)
        L_0x0159:
            r1.f1501T = r13
            if (r7 < r8) goto L_0x0162
            float r13 = I.P.b(r5)
            goto L_0x0166
        L_0x0162:
            float r13 = I.T.a(r5, r2)
        L_0x0166:
            r1.f1502U = r13
            int r13 = r5.getScaledMinimumFlingVelocity()
            r1.f1499R = r13
            int r5 = r5.getScaledMaximumFlingVelocity()
            r1.f1500S = r5
            int r5 = r1.getOverScrollMode()
            if (r5 != r12) goto L_0x017c
            r5 = 1
            goto L_0x017d
        L_0x017c:
            r5 = 0
        L_0x017d:
            r1.setWillNotDraw(r5)
            b0.F r5 = r1.f1489H
            r5.f1569a = r3
            F.g r3 = new F.g
            b0.A r5 = new b0.A
            r5.<init>(r1)
            r3.<init>((b0.C0071A) r5)
            r1.f1510d = r3
            N.g r3 = new N.g
            b0.A r5 = new b0.A
            r5.<init>(r1)
            r3.<init>((b0.C0071A) r5)
            r1.f1512e = r3
            java.util.WeakHashMap r3 = I.O.f393a
            if (r7 < r8) goto L_0x01a5
            int r3 = I.F.c(r1)
            goto L_0x01a6
        L_0x01a5:
            r3 = 0
        L_0x01a6:
            r13 = 8
            if (r3 != 0) goto L_0x01af
            if (r7 < r8) goto L_0x01af
            I.F.m(r1, r13)
        L_0x01af:
            int r3 = r1.getImportantForAccessibility()
            if (r3 != 0) goto L_0x01b8
            r1.setImportantForAccessibility(r11)
        L_0x01b8:
            android.content.Context r3 = r1.getContext()
            java.lang.String r5 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.f1542x = r3
            b0.a0 r3 = new b0.a0
            r3.<init>(r1)
            r1.setAccessibilityDelegateCompat(r3)
            int[] r3 = a0.C0043a.f826a
            android.content.res.TypedArray r5 = r2.obtainStyledAttributes(r4, r3, r6, r9)
            r14 = 29
            if (r7 < r14) goto L_0x01db
            r1.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, 0)
        L_0x01db:
            r15 = r2
            r2 = r5
            java.lang.String r13 = r2.getString(r13)
            int r3 = r2.getInt(r12, r0)
            if (r3 != r0) goto L_0x01ec
            r0 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r0)
        L_0x01ec:
            boolean r0 = r2.getBoolean(r11, r11)
            r1.f1514g = r0
            r0 = 3
            boolean r3 = r2.getBoolean(r0, r9)
            r4 = 4
            if (r3 == 0) goto L_0x026a
            r3 = 6
            android.graphics.drawable.Drawable r3 = r2.getDrawable(r3)
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            r5 = 7
            android.graphics.drawable.Drawable r5 = r2.getDrawable(r5)
            android.graphics.drawable.Drawable r6 = r2.getDrawable(r4)
            android.graphics.drawable.StateListDrawable r6 = (android.graphics.drawable.StateListDrawable) r6
            r7 = 5
            android.graphics.drawable.Drawable r7 = r2.getDrawable(r7)
            if (r3 == 0) goto L_0x0252
            if (r5 == 0) goto L_0x0252
            if (r6 == 0) goto L_0x0252
            if (r7 == 0) goto L_0x0252
            android.content.Context r8 = r1.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r16 = 3
            b0.l r0 = new b0.l
            r4 = 2131099794(0x7f060092, float:1.7811951E38)
            int r4 = r8.getDimensionPixelSize(r4)
            r18 = 2
            r12 = 2131099796(0x7f060094, float:1.7811955E38)
            int r12 = r8.getDimensionPixelSize(r12)
            r14 = 2131099795(0x7f060093, float:1.7811953E38)
            int r8 = r8.getDimensionPixelOffset(r14)
            r11 = r6
            r6 = r4
            r4 = r11
            r14 = r23
            r16 = r2
            r2 = r3
            r3 = r5
            r5 = r7
            r7 = r12
            r11 = 4
            r17 = 3
            r19 = 1
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0277
        L_0x0252:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Trying to set fast scroller without both required drawables."
            r2.<init>(r3)
            java.lang.String r3 = r1.y()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x026a:
            r12 = r22
            r14 = r23
            r16 = r2
            r11 = 4
            r17 = 3
            r18 = 2
            r19 = 1
        L_0x0277:
            r16.recycle()
            java.lang.String r2 = ": Could not instantiate the LayoutManager: "
            if (r13 == 0) goto L_0x03da
            java.lang.String r0 = r13.trim()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x03da
            char r3 = r0.charAt(r9)
            r4 = 46
            if (r3 != r4) goto L_0x02a5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r15.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x02a3:
            r3 = r0
            goto L_0x02cb
        L_0x02a5:
            java.lang.String r3 = "."
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x02ae
            goto L_0x02a3
        L_0x02ae:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r5 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r5 = r5.getPackage()
            java.lang.String r5 = r5.getName()
            r3.append(r5)
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x02a3
        L_0x02cb:
            boolean r0 = r1.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            if (r0 == 0) goto L_0x02e8
            java.lang.Class r0 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            goto L_0x02ec
        L_0x02da:
            r0 = move-exception
            goto L_0x0348
        L_0x02dc:
            r0 = move-exception
            goto L_0x0366
        L_0x02df:
            r0 = move-exception
            goto L_0x0384
        L_0x02e2:
            r0 = move-exception
            goto L_0x03a0
        L_0x02e5:
            r0 = move-exception
            goto L_0x03bc
        L_0x02e8:
            java.lang.ClassLoader r0 = r15.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
        L_0x02ec:
            java.lang.Class r0 = java.lang.Class.forName(r3, r9, r0)     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            java.lang.Class<b0.J> r4 = b0.J.class
            java.lang.Class r4 = r0.asSubclass(r4)     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            java.lang.Class[] r0 = f1481v0     // Catch:{ NoSuchMethodException -> 0x0311 }
            java.lang.reflect.Constructor r0 = r4.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0311 }
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ NoSuchMethodException -> 0x0311 }
            r5[r9] = r15     // Catch:{ NoSuchMethodException -> 0x0311 }
            r5[r19] = r12     // Catch:{ NoSuchMethodException -> 0x0311 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch:{ NoSuchMethodException -> 0x0311 }
            r5[r18] = r6     // Catch:{ NoSuchMethodException -> 0x0311 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ NoSuchMethodException -> 0x0311 }
            r5[r17] = r6     // Catch:{ NoSuchMethodException -> 0x0311 }
            r10 = r5
        L_0x030f:
            r4 = 1
            goto L_0x0318
        L_0x0311:
            r0 = move-exception
            r5 = r0
            java.lang.reflect.Constructor r0 = r4.getConstructor(r10)     // Catch:{ NoSuchMethodException -> 0x0326 }
            goto L_0x030f
        L_0x0318:
            r0.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            java.lang.Object r0 = r0.newInstance(r10)     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            b0.J r0 = (b0.J) r0     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            r1.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            goto L_0x03da
        L_0x0326:
            r0 = move-exception
            r0.initCause(r5)     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            r5.<init>()     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            java.lang.String r6 = r12.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            r5.append(r6)     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            java.lang.String r6 = ": Error creating LayoutManager "
            r5.append(r6)     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            r5.append(r3)     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            java.lang.String r5 = r5.toString()     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            r4.<init>(r5, r0)     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
            throw r4     // Catch:{ ClassNotFoundException -> 0x02e5, InvocationTargetException -> 0x02e2, InstantiationException -> 0x02df, IllegalAccessException -> 0x02dc, ClassCastException -> 0x02da }
        L_0x0348:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r12.getPositionDescription()
            r4.append(r5)
            java.lang.String r5 = ": Class is not a LayoutManager "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x0366:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r12.getPositionDescription()
            r4.append(r5)
            java.lang.String r5 = ": Cannot access non-public constructor "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x0384:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r12.getPositionDescription()
            r5.append(r6)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r0)
            throw r4
        L_0x03a0:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r12.getPositionDescription()
            r5.append(r6)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r0)
            throw r4
        L_0x03bc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r12.getPositionDescription()
            r4.append(r5)
            java.lang.String r5 = ": Unable to find LayoutManager "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x03da:
            int r0 = android.os.Build.VERSION.SDK_INT
            int[] r3 = f1478s0
            android.content.res.TypedArray r5 = r15.obtainStyledAttributes(r12, r3, r14, r9)
            r2 = 29
            if (r0 < r2) goto L_0x03ec
            r4 = r12
            r6 = r14
            r2 = r15
            r1.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, 0)
        L_0x03ec:
            r4 = 1
            boolean r0 = r5.getBoolean(r9, r4)
            r5.recycle()
            r1.setNestedScrollingEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        J j2 = this.f1524l;
        if (j2 != null) {
            return j2.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public void setRecyclerListener(Q q2) {
    }
}
