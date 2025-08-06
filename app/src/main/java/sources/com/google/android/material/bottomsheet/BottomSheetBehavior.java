package com.google.android.material.bottomsheet;

import A.i;
import E0.f;
import E0.g;
import E0.k;
import F.c;
import F.l;
import F0.d;
import F0.h;
import G.j;
import H0.F;
import I.B;
import I.C0009a;
import I.C0010b;
import I.C0012d;
import I.D;
import I.O;
import I.a0;
import I.b0;
import I.d0;
import K.a;
import R.e;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cheatbox.R;
import j0.C0219a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k.X;
import o0.C0304a;
import t0.C0486a;
import v.C0489a;

public class BottomSheetBehavior<V extends View> extends C0489a {

    /* renamed from: A  reason: collision with root package name */
    public final h f1846A = new h(this);

    /* renamed from: B  reason: collision with root package name */
    public final ValueAnimator f1847B;

    /* renamed from: C  reason: collision with root package name */
    public final int f1848C;
    public int D;

    /* renamed from: E  reason: collision with root package name */
    public int f1849E;

    /* renamed from: F  reason: collision with root package name */
    public final float f1850F = 0.5f;

    /* renamed from: G  reason: collision with root package name */
    public int f1851G;

    /* renamed from: H  reason: collision with root package name */
    public final float f1852H = -1.0f;

    /* renamed from: I  reason: collision with root package name */
    public boolean f1853I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f1854J;

    /* renamed from: K  reason: collision with root package name */
    public final boolean f1855K = true;

    /* renamed from: L  reason: collision with root package name */
    public int f1856L = 4;

    /* renamed from: M  reason: collision with root package name */
    public e f1857M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f1858N;

    /* renamed from: O  reason: collision with root package name */
    public int f1859O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f1860P;

    /* renamed from: Q  reason: collision with root package name */
    public final float f1861Q = 0.1f;

    /* renamed from: R  reason: collision with root package name */
    public int f1862R;

    /* renamed from: S  reason: collision with root package name */
    public int f1863S;

    /* renamed from: T  reason: collision with root package name */
    public int f1864T;

    /* renamed from: U  reason: collision with root package name */
    public WeakReference f1865U;

    /* renamed from: V  reason: collision with root package name */
    public WeakReference f1866V;

    /* renamed from: W  reason: collision with root package name */
    public final ArrayList f1867W = new ArrayList();

    /* renamed from: X  reason: collision with root package name */
    public VelocityTracker f1868X;

    /* renamed from: Y  reason: collision with root package name */
    public int f1869Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f1870Z = -1;

    /* renamed from: a  reason: collision with root package name */
    public final int f1871a = 0;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1872a0;
    public boolean b = true;

    /* renamed from: b0  reason: collision with root package name */
    public HashMap f1873b0;

    /* renamed from: c  reason: collision with root package name */
    public final float f1874c;

    /* renamed from: c0  reason: collision with root package name */
    public final SparseIntArray f1875c0 = new SparseIntArray();

    /* renamed from: d  reason: collision with root package name */
    public final int f1876d;

    /* renamed from: d0  reason: collision with root package name */
    public final d f1877d0 = new d(this, 1);

    /* renamed from: e  reason: collision with root package name */
    public int f1878e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public int f1879g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1880h;

    /* renamed from: i  reason: collision with root package name */
    public final g f1881i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f1882j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1883k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final int f1884l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f1885m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1886n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1887o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f1888p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f1889q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f1890r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f1891s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f1892t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f1893u;

    /* renamed from: v  reason: collision with root package name */
    public int f1894v;

    /* renamed from: w  reason: collision with root package name */
    public int f1895w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f1896x;

    /* renamed from: y  reason: collision with root package name */
    public final k f1897y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1898z;

    public BottomSheetBehavior() {
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = O.f393a;
        if (D.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View v2 = v(viewGroup.getChildAt(i2));
            if (v2 != null) {
                return v2;
            }
        }
        return null;
    }

    public static int w(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    public final void A(int i2) {
        if (i2 == -1) {
            if (!this.f) {
                this.f = true;
            } else {
                return;
            }
        } else if (this.f || this.f1878e != i2) {
            this.f = false;
            this.f1878e = Math.max(0, i2);
        } else {
            return;
        }
        I();
    }

    public final void B(int i2) {
        String str;
        int i3;
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            if (i2 == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            sb.append(str);
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f1853I || i2 != 5) {
            if (i2 != 6 || !this.b || y(i2) > this.D) {
                i3 = i2;
            } else {
                i3 = 3;
            }
            WeakReference weakReference = this.f1865U;
            if (weakReference == null || weakReference.get() == null) {
                C(i2);
                return;
            }
            View view = (View) this.f1865U.get();
            X x2 = new X(this, view, i3);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = O.f393a;
                if (view.isAttachedToWindow()) {
                    view.post(x2);
                    return;
                }
            }
            x2.run();
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
        }
    }

    public final void C(int i2) {
        if (this.f1856L != i2) {
            this.f1856L = i2;
            if (!(i2 == 4 || i2 == 3 || i2 == 6)) {
                boolean z2 = this.f1853I;
            }
            WeakReference weakReference = this.f1865U;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i2 == 3) {
                    H(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    H(false);
                }
                G(i2, true);
                ArrayList arrayList = this.f1867W;
                if (arrayList.size() <= 0) {
                    F();
                } else {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final boolean D(View view, float f2) {
        if (this.f1854J) {
            return true;
        }
        if (view.getTop() < this.f1851G) {
            return false;
        }
        int t2 = t();
        if (Math.abs(((f2 * this.f1861Q) + ((float) view.getTop())) - ((float) this.f1851G)) / ((float) t2) > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r3 != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r1.o(r3.getLeft(), r0) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            R.e r1 = r2.f1857M
            if (r1 == 0) goto L_0x0040
            if (r5 == 0) goto L_0x0015
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L_0x0040
            goto L_0x0032
        L_0x0015:
            int r5 = r3.getLeft()
            r1.f702r = r3
            r3 = -1
            r1.f688c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L_0x0030
            int r5 = r1.f687a
            if (r5 != 0) goto L_0x0030
            android.view.View r5 = r1.f702r
            if (r5 == 0) goto L_0x0030
            r5 = 0
            r1.f702r = r5
        L_0x0030:
            if (r3 == 0) goto L_0x0040
        L_0x0032:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            F0.h r3 = r2.f1846A
            r3.a(r4)
            return
        L_0x0040:
            r2.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int i2;
        boolean z2;
        C0010b bVar;
        WeakReference weakReference = this.f1865U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            O.m(view, 524288);
            O.i(view, 0);
            O.m(view, 262144);
            O.i(view, 0);
            O.m(view, 1048576);
            O.i(view, 0);
            SparseIntArray sparseIntArray = this.f1875c0;
            int i3 = sparseIntArray.get(0, -1);
            if (i3 != -1) {
                O.m(view, i3);
                O.i(view, 0);
                sparseIntArray.delete(0);
            }
            int i4 = 6;
            if (!this.b && this.f1856L != 6) {
                String string = view.getResources().getString(R.string.MT_Bin);
                l lVar = new l(this, 6);
                ArrayList e2 = O.e(view);
                int i5 = 0;
                while (true) {
                    if (i5 >= e2.size()) {
                        int i6 = -1;
                        for (int i7 = 0; i7 < 32 && i6 == -1; i7++) {
                            int i8 = O.f396e[i7];
                            boolean z3 = true;
                            for (int i9 = 0; i9 < e2.size(); i9++) {
                                if (((J.g) e2.get(i9)).a() != i8) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                z3 &= z2;
                            }
                            if (z3) {
                                i6 = i8;
                            }
                        }
                        i2 = i6;
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((J.g) e2.get(i5)).f485a).getLabel())) {
                        i2 = ((J.g) e2.get(i5)).a();
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i2 != -1) {
                    J.g gVar = new J.g((Object) null, i2, string, lVar, (Class) null);
                    View.AccessibilityDelegate c2 = O.c(view);
                    if (c2 == null) {
                        bVar = null;
                    } else if (c2 instanceof C0009a) {
                        bVar = ((C0009a) c2).f406a;
                    } else {
                        bVar = new C0010b(c2);
                    }
                    if (bVar == null) {
                        bVar = new C0010b();
                    }
                    O.p(view, bVar);
                    O.m(view, gVar.a());
                    O.e(view).add(gVar);
                    O.i(view, 0);
                }
                sparseIntArray.put(0, i2);
            }
            if (this.f1853I && this.f1856L != 5) {
                O.n(view, J.g.f482j, new l(this, 5));
            }
            int i10 = this.f1856L;
            if (i10 == 3) {
                if (this.b) {
                    i4 = 4;
                }
                O.n(view, J.g.f481i, new l(this, i4));
            } else if (i10 == 4) {
                if (this.b) {
                    i4 = 3;
                }
                O.n(view, J.g.f480h, new l(this, i4));
            } else if (i10 == 6) {
                O.n(view, J.g.f481i, new l(this, 4));
                O.n(view, J.g.f480h, new l(this, 3));
            }
        }
    }

    public final void G(int i2, boolean z2) {
        boolean z3;
        g gVar = this.f1881i;
        ValueAnimator valueAnimator = this.f1847B;
        if (i2 != 2) {
            if (this.f1856L != 3 || (!this.f1896x && !z())) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f1898z != z3 && gVar != null) {
                this.f1898z = z3;
                float f2 = 1.0f;
                if (!z2 || valueAnimator == null) {
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.cancel();
                    }
                    if (this.f1898z) {
                        f2 = s();
                    }
                    f fVar = gVar.f118a;
                    if (fVar.f109i != f2) {
                        fVar.f109i = f2;
                        gVar.f121e = true;
                        gVar.invalidateSelf();
                    }
                } else if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                } else {
                    float f3 = gVar.f118a.f109i;
                    if (z3) {
                        f2 = s();
                    }
                    valueAnimator.setFloatValues(new float[]{f3, f2});
                    valueAnimator.start();
                }
            }
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f1865U;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z2) {
                    if (this.f1873b0 == null) {
                        this.f1873b0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.f1865U.get() && z2) {
                        this.f1873b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z2) {
                    this.f1873b0 = null;
                }
            }
        }
    }

    public final void I() {
        View view;
        if (this.f1865U != null) {
            r();
            if (this.f1856L == 4 && (view = (View) this.f1865U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void c(v.d dVar) {
        this.f1865U = null;
        this.f1857M = null;
    }

    public final void e() {
        this.f1865U = null;
        this.f1857M = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r9.f1855K
            if (r0 != 0) goto L_0x000e
            goto L_0x00dc
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0023
            r9.f1869Y = r4
            r9.f1870Z = r4
            android.view.VelocityTracker r5 = r9.f1868X
            if (r5 == 0) goto L_0x0023
            r5.recycle()
            r9.f1868X = r3
        L_0x0023:
            android.view.VelocityTracker r5 = r9.f1868X
            if (r5 != 0) goto L_0x002d
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.f1868X = r5
        L_0x002d:
            android.view.VelocityTracker r5 = r9.f1868X
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0046
            if (r0 == r2) goto L_0x003b
            r11 = 3
            if (r0 == r11) goto L_0x003b
            goto L_0x0089
        L_0x003b:
            r9.f1872a0 = r1
            r9.f1869Y = r4
            boolean r11 = r9.f1858N
            if (r11 == 0) goto L_0x0089
            r9.f1858N = r1
            return r1
        L_0x0046:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f1870Z = r7
            int r7 = r9.f1856L
            if (r7 == r5) goto L_0x0078
            java.lang.ref.WeakReference r7 = r9.f1866V
            if (r7 == 0) goto L_0x0061
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0062
        L_0x0061:
            r7 = r3
        L_0x0062:
            if (r7 == 0) goto L_0x0078
            int r8 = r9.f1870Z
            boolean r7 = r10.o(r7, r6, r8)
            if (r7 == 0) goto L_0x0078
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f1869Y = r7
            r9.f1872a0 = r2
        L_0x0078:
            int r7 = r9.f1869Y
            if (r7 != r4) goto L_0x0086
            int r7 = r9.f1870Z
            boolean r11 = r10.o(r11, r6, r7)
            if (r11 != 0) goto L_0x0086
            r11 = 1
            goto L_0x0087
        L_0x0086:
            r11 = 0
        L_0x0087:
            r9.f1858N = r11
        L_0x0089:
            boolean r11 = r9.f1858N
            if (r11 != 0) goto L_0x0098
            R.e r11 = r9.f1857M
            if (r11 == 0) goto L_0x0098
            boolean r11 = r11.p(r12)
            if (r11 == 0) goto L_0x0098
            goto L_0x00da
        L_0x0098:
            java.lang.ref.WeakReference r11 = r9.f1866V
            if (r11 == 0) goto L_0x00a3
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a3:
            if (r0 != r5) goto L_0x00db
            if (r3 == 0) goto L_0x00db
            boolean r11 = r9.f1858N
            if (r11 != 0) goto L_0x00db
            int r11 = r9.f1856L
            if (r11 == r2) goto L_0x00db
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.o(r3, r11, r0)
            if (r10 != 0) goto L_0x00db
            R.e r10 = r9.f1857M
            if (r10 == 0) goto L_0x00db
            int r10 = r9.f1870Z
            if (r10 == r4) goto L_0x00db
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            R.e r11 = r9.f1857M
            int r11 = r11.b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00db
        L_0x00da:
            return r2
        L_0x00db:
            return r1
        L_0x00dc:
            r9.f1858N = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r6v16, types: [y0.n, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v18, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        boolean z2;
        int i3 = this.f1884l;
        g gVar = this.f1881i;
        WeakHashMap weakHashMap = O.f393a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1865U == null) {
            this.f1879g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.MT_Bin);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 29 || this.f1886n || this.f) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f1887o || this.f1888p || this.f1889q || this.f1891s || this.f1892t || this.f1893u || z2) {
                j jVar = new j(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ? obj = new Object();
                obj.f4847a = paddingStart;
                obj.b = paddingEnd;
                obj.f4848c = paddingBottom;
                D.u(view, new c((Object) jVar, 20, (Object) obj));
                if (view.isAttachedToWindow()) {
                    B.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            C0012d dVar = new C0012d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new d0(dVar));
            } else {
                PathInterpolator pathInterpolator = b0.f410e;
                Object tag = view.getTag(R.id.MT_Bin);
                a0 a0Var = new a0(view, dVar);
                view.setTag(R.id.MT_Bin, a0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(a0Var);
                }
            }
            this.f1865U = new WeakReference(view);
            Context context = view.getContext();
            C0486a.r(context, R.attr.MT_Bin, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            C0486a.q(context, R.attr.MT_Bin, 300);
            C0486a.q(context, R.attr.MT_Bin, 150);
            C0486a.q(context, R.attr.MT_Bin, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.MT_Bin);
            resources.getDimension(R.dimen.MT_Bin);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1852H;
                if (f2 == -1.0f) {
                    f2 = D.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1882j;
                if (colorStateList != null) {
                    O.r(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f1857M == null) {
            this.f1857M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1877d0);
        }
        int top2 = view.getTop();
        coordinatorLayout.q(view, i2);
        this.f1863S = coordinatorLayout.getWidth();
        this.f1864T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f1862R = height;
        int i5 = this.f1864T;
        int i6 = i5 - height;
        int i7 = this.f1895w;
        if (i6 < i7) {
            if (this.f1890r) {
                if (i3 != -1) {
                    i5 = Math.min(i5, i3);
                }
                this.f1862R = i5;
            } else {
                int i8 = i5 - i7;
                if (i3 != -1) {
                    i8 = Math.min(i8, i3);
                }
                this.f1862R = i8;
            }
        }
        this.D = Math.max(0, this.f1864T - this.f1862R);
        this.f1849E = (int) ((1.0f - this.f1850F) * ((float) this.f1864T));
        r();
        int i9 = this.f1856L;
        if (i9 == 3) {
            O.k(view, x());
        } else if (i9 == 6) {
            O.k(view, this.f1849E);
        } else if (this.f1853I && i9 == 5) {
            O.k(view, this.f1864T);
        } else if (i9 == 4) {
            O.k(view, this.f1851G);
        } else if (i9 == 1 || i9 == 2) {
            O.k(view, top2 - view.getTop());
        }
        G(this.f1856L, false);
        this.f1866V = new WeakReference(v(view));
        ArrayList arrayList = this.f1867W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f1883k, marginLayoutParams.width), w(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1884l, marginLayoutParams.height));
        return true;
    }

    public final boolean i(View view) {
        WeakReference weakReference = this.f1866V;
        if (weakReference == null || view != weakReference.get() || this.f1856L == 3) {
            return false;
        }
        return true;
    }

    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        View view3;
        if (i4 != 1) {
            WeakReference weakReference = this.f1866V;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top2 = view.getTop();
                int i5 = top2 - i3;
                if (i3 > 0) {
                    if (i5 < x()) {
                        int x2 = top2 - x();
                        iArr[1] = x2;
                        O.k(view, -x2);
                        C(3);
                    } else if (this.f1855K) {
                        iArr[1] = i3;
                        O.k(view, -i3);
                        C(1);
                    } else {
                        return;
                    }
                } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
                    int i6 = this.f1851G;
                    if (i5 > i6 && !this.f1853I) {
                        int i7 = top2 - i6;
                        iArr[1] = i7;
                        O.k(view, -i7);
                        C(4);
                    } else if (this.f1855K) {
                        iArr[1] = i3;
                        O.k(view, -i3);
                        C(1);
                    } else {
                        return;
                    }
                }
                u(view.getTop());
                this.f1859O = i3;
                this.f1860P = true;
            }
        }
    }

    public final void m(View view, Parcelable parcelable) {
        C0304a aVar = (C0304a) parcelable;
        int i2 = this.f1871a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f1878e = aVar.f3730i;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.b = aVar.f3731j;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.f1853I = aVar.f3732k;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.f1854J = aVar.f3733l;
            }
        }
        int i3 = aVar.f3729h;
        if (i3 == 1 || i3 == 2) {
            this.f1856L = 4;
        } else {
            this.f1856L = i3;
        }
    }

    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C0304a(this);
    }

    public final boolean o(View view, int i2, int i3) {
        this.f1859O = 0;
        this.f1860P = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r4.getTop() <= r3.f1849E) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (java.lang.Math.abs(r5 - r3.D) < java.lang.Math.abs(r5 - r3.f1851G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r5 < java.lang.Math.abs(r5 - r3.f1851G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f1851G)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if (java.lang.Math.abs(r5 - r3.f1849E) < java.lang.Math.abs(r5 - r3.f1851G)) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto L_0x000f
            r3.C(r1)
            return
        L_0x000f:
            java.lang.ref.WeakReference r6 = r3.f1866V
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto L_0x00b5
            boolean r5 = r3.f1860P
            if (r5 != 0) goto L_0x001f
            goto L_0x00b5
        L_0x001f:
            int r5 = r3.f1859O
            r6 = 6
            if (r5 <= 0) goto L_0x0034
            boolean r5 = r3.b
            if (r5 == 0) goto L_0x002a
            goto L_0x00af
        L_0x002a:
            int r5 = r4.getTop()
            int r0 = r3.f1849E
            if (r5 <= r0) goto L_0x00af
            goto L_0x00ae
        L_0x0034:
            boolean r5 = r3.f1853I
            if (r5 == 0) goto L_0x0055
            android.view.VelocityTracker r5 = r3.f1868X
            if (r5 != 0) goto L_0x003e
            r5 = 0
            goto L_0x004d
        L_0x003e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f1874c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f1868X
            int r0 = r3.f1869Y
            float r5 = r5.getYVelocity(r0)
        L_0x004d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L_0x0055
            r1 = 5
            goto L_0x00af
        L_0x0055:
            int r5 = r3.f1859O
            r0 = 4
            if (r5 != 0) goto L_0x0093
            int r5 = r4.getTop()
            boolean r2 = r3.b
            if (r2 == 0) goto L_0x0074
            int r6 = r3.D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f1851G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L_0x0097
            goto L_0x00af
        L_0x0074:
            int r2 = r3.f1849E
            if (r5 >= r2) goto L_0x0083
            int r0 = r3.f1851G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto L_0x00ae
            goto L_0x00af
        L_0x0083:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f1851G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L_0x0097
            goto L_0x00ae
        L_0x0093:
            boolean r5 = r3.b
            if (r5 == 0) goto L_0x0099
        L_0x0097:
            r1 = 4
            goto L_0x00af
        L_0x0099:
            int r5 = r4.getTop()
            int r1 = r3.f1849E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f1851G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L_0x0097
        L_0x00ae:
            r1 = 6
        L_0x00af:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.f1860P = r5
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f1856L;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f1857M;
        if (eVar != null && (this.f1855K || i2 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1869Y = -1;
            this.f1870Z = -1;
            VelocityTracker velocityTracker = this.f1868X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1868X = null;
            }
        }
        if (this.f1868X == null) {
            this.f1868X = VelocityTracker.obtain();
        }
        this.f1868X.addMovement(motionEvent);
        if (this.f1857M != null && ((this.f1855K || this.f1856L == 1) && actionMasked == 2 && !this.f1858N)) {
            float abs = Math.abs(((float) this.f1870Z) - motionEvent.getY());
            e eVar2 = this.f1857M;
            if (abs > ((float) eVar2.b)) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1858N;
    }

    public final void r() {
        int t2 = t();
        if (this.b) {
            this.f1851G = Math.max(this.f1864T - t2, this.D);
        } else {
            this.f1851G = this.f1864T - t2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float s() {
        /*
            r5 = this;
            E0.g r0 = r5.f1881i
            r1 = 0
            if (r0 == 0) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.f1865U
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0079
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.f1865U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L_0x0079
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x0079
            E0.g r2 = r5.f1881i
            E0.f r3 = r2.f118a
            E0.k r3 = r3.f103a
            E0.c r3 = r3.f152e
            android.graphics.RectF r2 = r2.f()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = r0.getRoundedCorner(0)
            if (r3 == 0) goto L_0x004e
            int r3 = r3.getRadius()
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            float r3 = r3 / r2
            goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            E0.g r2 = r5.f1881i
            E0.f r4 = r2.f118a
            E0.k r4 = r4.f103a
            E0.c r4 = r4.f
            android.graphics.RectF r2 = r2.f()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = r0.getRoundedCorner(1)
            if (r0 == 0) goto L_0x0074
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0074
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0074
            float r1 = r0 / r2
        L_0x0074:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
        int i2;
        if (this.f) {
            return Math.min(Math.max(this.f1879g, this.f1864T - ((this.f1863S * 9) / 16)), this.f1862R) + this.f1894v;
        }
        if (this.f1886n || this.f1887o || (i2 = this.f1885m) <= 0) {
            return this.f1878e + this.f1894v;
        }
        return Math.max(this.f1878e, i2 + this.f1880h);
    }

    public final void u(int i2) {
        if (((View) this.f1865U.get()) != null) {
            ArrayList arrayList = this.f1867W;
            if (!arrayList.isEmpty()) {
                int i3 = this.f1851G;
                if (i2 <= i3 && i3 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final int x() {
        int i2;
        if (this.b) {
            return this.D;
        }
        int i3 = this.f1848C;
        if (this.f1890r) {
            i2 = 0;
        } else {
            i2 = this.f1895w;
        }
        return Math.max(i3, i2);
    }

    public final int y(int i2) {
        if (i2 == 3) {
            return x();
        }
        if (i2 == 4) {
            return this.f1851G;
        }
        if (i2 == 5) {
            return this.f1864T;
        }
        if (i2 == 6) {
            return this.f1849E;
        }
        throw new IllegalArgumentException(A.g.f(i2, "Invalid state to get top offset: "));
    }

    public final boolean z() {
        WeakReference weakReference = this.f1865U;
        if (!(weakReference == null || weakReference.get() == null)) {
            int[] iArr = new int[2];
            ((View) this.f1865U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        this.f1880h = context.getResources().getDimensionPixelSize(R.dimen.MT_Bin);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0219a.f3176a);
        int i3 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1882j = i.H(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f1897y = k.b(context, attributeSet, R.attr.MT_Bin, R.style.MT_Bin).a();
        }
        k kVar = this.f1897y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f1881i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1882j;
            if (colorStateList != null) {
                this.f1881i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f1881i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{s(), 1.0f});
        this.f1847B = ofFloat;
        ofFloat.setDuration(500);
        this.f1847B.addUpdateListener(new F(2, this));
        this.f1852H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1883k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1884l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            A(i2);
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f1853I != z2) {
            this.f1853I = z2;
            if (!z2 && this.f1856L == 5) {
                B(4);
            }
            F();
        }
        this.f1886n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.b != z3) {
            this.b = z3;
            if (this.f1865U != null) {
                r();
            }
            C((!this.b || this.f1856L != 6) ? this.f1856L : i3);
            G(this.f1856L, true);
            F();
        }
        this.f1854J = obtainStyledAttributes.getBoolean(12, false);
        this.f1855K = obtainStyledAttributes.getBoolean(4, true);
        this.f1871a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f1850F = f2;
        if (this.f1865U != null) {
            this.f1849E = (int) ((1.0f - f2) * ((float) this.f1864T));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset >= 0) {
                this.f1848C = dimensionPixelOffset;
                G(this.f1856L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i4 = peekValue2.data;
            if (i4 >= 0) {
                this.f1848C = i4;
                G(this.f1856L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f1876d = obtainStyledAttributes.getInt(11, 500);
        this.f1887o = obtainStyledAttributes.getBoolean(17, false);
        this.f1888p = obtainStyledAttributes.getBoolean(18, false);
        this.f1889q = obtainStyledAttributes.getBoolean(19, false);
        this.f1890r = obtainStyledAttributes.getBoolean(20, true);
        this.f1891s = obtainStyledAttributes.getBoolean(14, false);
        this.f1892t = obtainStyledAttributes.getBoolean(15, false);
        this.f1893u = obtainStyledAttributes.getBoolean(16, false);
        this.f1896x = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.f1874c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }
}
