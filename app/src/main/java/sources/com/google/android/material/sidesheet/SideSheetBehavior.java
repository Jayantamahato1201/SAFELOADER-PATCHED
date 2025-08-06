package com.google.android.material.sidesheet;

import A.i;
import E0.g;
import E0.k;
import F0.b;
import F0.d;
import F0.f;
import F0.h;
import I.O;
import R.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cheatbox.R;
import j0.C0219a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import v.C0489a;

public class SideSheetBehavior<V extends View> extends C0489a {

    /* renamed from: a  reason: collision with root package name */
    public i f2057a;
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f2058c;

    /* renamed from: d  reason: collision with root package name */
    public final k f2059d;

    /* renamed from: e  reason: collision with root package name */
    public final h f2060e = new h(this);
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2061g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f2062h = 5;

    /* renamed from: i  reason: collision with root package name */
    public e f2063i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2064j;

    /* renamed from: k  reason: collision with root package name */
    public final float f2065k = 0.1f;

    /* renamed from: l  reason: collision with root package name */
    public int f2066l;

    /* renamed from: m  reason: collision with root package name */
    public int f2067m;

    /* renamed from: n  reason: collision with root package name */
    public int f2068n;

    /* renamed from: o  reason: collision with root package name */
    public int f2069o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference f2070p;

    /* renamed from: q  reason: collision with root package name */
    public WeakReference f2071q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2072r = -1;

    /* renamed from: s  reason: collision with root package name */
    public VelocityTracker f2073s;

    /* renamed from: t  reason: collision with root package name */
    public int f2074t;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashSet f2075u = new LinkedHashSet();

    /* renamed from: v  reason: collision with root package name */
    public final d f2076v = new d(this, 0);

    public SideSheetBehavior() {
    }

    public final void c(v.d dVar) {
        this.f2070p = null;
        this.f2063i = null;
    }

    public final void e() {
        this.f2070p = null;
        this.f2063i = null;
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || O.d(view) != null) && this.f2061g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f2073s) != null) {
                velocityTracker.recycle();
                this.f2073s = null;
            }
            if (this.f2073s == null) {
                this.f2073s = VelocityTracker.obtain();
            }
            this.f2073s.addMovement(motionEvent);
            if (actionMasked == 0) {
                this.f2074t = (int) motionEvent.getX();
            } else if ((actionMasked == 1 || actionMasked == 3) && this.f2064j) {
                this.f2064j = false;
                return false;
            }
            if (this.f2064j || (eVar = this.f2063i) == null || !eVar.p(motionEvent)) {
                return false;
            }
            return true;
        }
        this.f2064j = true;
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r3v26, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            E0.g r2 = r10.b
            java.util.WeakHashMap r3 = I.O.f393a
            boolean r3 = r11.getFitsSystemWindows()
            if (r3 == 0) goto L_0x0015
            boolean r3 = r12.getFitsSystemWindows()
            if (r3 != 0) goto L_0x0015
            r12.setFitsSystemWindows(r1)
        L_0x0015:
            java.lang.ref.WeakReference r3 = r10.f2070p
            r4 = 5
            r5 = 0
            if (r3 != 0) goto L_0x00ac
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r12)
            r10.f2070p = r3
            android.content.Context r3 = r12.getContext()
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r6 = K.a.b(r5, r5, r5, r6)
            r7 = 2130903821(0x7f03030d, float:1.741447E38)
            t0.C0486a.r(r3, r7, r6)
            r6 = 2130903804(0x7f0302fc, float:1.7414436E38)
            r7 = 300(0x12c, float:4.2E-43)
            t0.C0486a.q(r3, r6, r7)
            r6 = 2130903809(0x7f030301, float:1.7414446E38)
            r7 = 150(0x96, float:2.1E-43)
            t0.C0486a.q(r3, r6, r7)
            r6 = 2130903808(0x7f030300, float:1.7414444E38)
            r7 = 100
            t0.C0486a.q(r3, r6, r7)
            android.content.res.Resources r3 = r12.getResources()
            r6 = 2131099830(0x7f0600b6, float:1.7812024E38)
            r3.getDimension(r6)
            r6 = 2131099829(0x7f0600b5, float:1.7812022E38)
            r3.getDimension(r6)
            r6 = 2131099831(0x7f0600b7, float:1.7812026E38)
            r3.getDimension(r6)
            if (r2 == 0) goto L_0x0075
            r12.setBackground(r2)
            float r3 = r10.f
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0071
            float r3 = I.D.i(r12)
        L_0x0071:
            r2.i(r3)
            goto L_0x007c
        L_0x0075:
            android.content.res.ColorStateList r3 = r10.f2058c
            if (r3 == 0) goto L_0x007c
            I.O.r(r12, r3)
        L_0x007c:
            int r3 = r10.f2062h
            if (r3 != r4) goto L_0x0082
            r3 = 4
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            int r6 = r12.getVisibility()
            if (r6 == r3) goto L_0x008c
            r12.setVisibility(r3)
        L_0x008c:
            r10.u()
            int r3 = r12.getImportantForAccessibility()
            if (r3 != 0) goto L_0x0098
            r12.setImportantForAccessibility(r1)
        L_0x0098:
            java.lang.CharSequence r3 = I.O.d(r12)
            if (r3 != 0) goto L_0x00ac
            android.content.res.Resources r3 = r12.getResources()
            r6 = 2131689693(0x7f0f00dd, float:1.9008409E38)
            java.lang.String r3 = r3.getString(r6)
            I.O.q(r12, r3)
        L_0x00ac:
            android.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams()
            v.d r3 = (v.d) r3
            int r3 = r3.f4730c
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r13)
            r6 = 3
            if (r3 != r6) goto L_0x00bd
            r3 = 1
            goto L_0x00be
        L_0x00bd:
            r3 = 0
        L_0x00be:
            A.i r7 = r10.f2057a
            if (r7 == 0) goto L_0x00c8
            int r7 = r7.S()
            if (r7 == r3) goto L_0x015c
        L_0x00c8:
            E0.k r7 = r10.f2059d
            r8 = 0
            if (r3 != 0) goto L_0x0114
            F0.a r3 = new F0.a
            r3.<init>(r10, r1)
            r10.f2057a = r3
            if (r7 == 0) goto L_0x015c
            java.lang.ref.WeakReference r3 = r10.f2070p
            if (r3 == 0) goto L_0x00f1
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x00f1
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            boolean r9 = r9 instanceof v.d
            if (r9 == 0) goto L_0x00f1
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r8 = r3
            v.d r8 = (v.d) r8
        L_0x00f1:
            if (r8 == 0) goto L_0x00f8
            int r3 = r8.rightMargin
            if (r3 <= 0) goto L_0x00f8
            goto L_0x015c
        L_0x00f8:
            E0.j r3 = r7.e()
            E0.a r7 = new E0.a
            r7.<init>(r5)
            r3.f = r7
            E0.a r7 = new E0.a
            r7.<init>(r5)
            r3.f143g = r7
            E0.k r3 = r3.a()
            if (r2 == 0) goto L_0x015c
            r2.setShapeAppearanceModel(r3)
            goto L_0x015c
        L_0x0114:
            if (r3 != r1) goto L_0x01ff
            F0.a r3 = new F0.a
            r3.<init>(r10, r0)
            r10.f2057a = r3
            if (r7 == 0) goto L_0x015c
            java.lang.ref.WeakReference r3 = r10.f2070p
            if (r3 == 0) goto L_0x013a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x013a
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            boolean r9 = r9 instanceof v.d
            if (r9 == 0) goto L_0x013a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r8 = r3
            v.d r8 = (v.d) r8
        L_0x013a:
            if (r8 == 0) goto L_0x0141
            int r3 = r8.leftMargin
            if (r3 <= 0) goto L_0x0141
            goto L_0x015c
        L_0x0141:
            E0.j r3 = r7.e()
            E0.a r7 = new E0.a
            r7.<init>(r5)
            r3.f142e = r7
            E0.a r7 = new E0.a
            r7.<init>(r5)
            r3.f144h = r7
            E0.k r3 = r3.a()
            if (r2 == 0) goto L_0x015c
            r2.setShapeAppearanceModel(r3)
        L_0x015c:
            R.e r2 = r10.f2063i
            if (r2 != 0) goto L_0x016d
            R.e r2 = new R.e
            android.content.Context r3 = r11.getContext()
            F0.d r5 = r10.f2076v
            r2.<init>(r3, r11, r5)
            r10.f2063i = r2
        L_0x016d:
            A.i r2 = r10.f2057a
            int r2 = r2.Q(r12)
            r11.q(r12, r13)
            int r13 = r11.getWidth()
            r10.f2067m = r13
            A.i r13 = r10.f2057a
            int r13 = r13.R(r11)
            r10.f2068n = r13
            int r13 = r12.getWidth()
            r10.f2066l = r13
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            if (r13 == 0) goto L_0x0199
            A.i r3 = r10.f2057a
            int r13 = r3.f(r13)
            goto L_0x019a
        L_0x0199:
            r13 = 0
        L_0x019a:
            r10.f2069o = r13
            int r13 = r10.f2062h
            if (r13 == r1) goto L_0x01c4
            r3 = 2
            if (r13 == r3) goto L_0x01c4
            if (r13 == r6) goto L_0x01cc
            if (r13 != r4) goto L_0x01ae
            A.i r13 = r10.f2057a
            int r0 = r13.M()
            goto L_0x01cc
        L_0x01ae:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unexpected value: "
            r12.<init>(r13)
            int r13 = r10.f2062h
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x01c4:
            A.i r13 = r10.f2057a
            int r13 = r13.Q(r12)
            int r0 = r2 - r13
        L_0x01cc:
            I.O.j(r12, r0)
            java.lang.ref.WeakReference r12 = r10.f2071q
            if (r12 != 0) goto L_0x01e5
            int r12 = r10.f2072r
            r13 = -1
            if (r12 == r13) goto L_0x01e5
            android.view.View r11 = r11.findViewById(r12)
            if (r11 == 0) goto L_0x01e5
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r11)
            r10.f2071q = r12
        L_0x01e5:
            java.util.LinkedHashSet r11 = r10.f2075u
            java.util.Iterator r11 = r11.iterator()
        L_0x01eb:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01fe
            java.lang.Object r12 = r11.next()
            if (r12 != 0) goto L_0x01f8
            goto L_0x01eb
        L_0x01f8:
            java.lang.ClassCastException r11 = new java.lang.ClassCastException
            r11.<init>()
            throw r11
        L_0x01fe:
            return r1
        L_0x01ff:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Invalid sheet edge position value: "
            r12.<init>(r13)
            r12.append(r3)
            java.lang.String r13 = ". Must be 0 or 1."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    public final void m(View view, Parcelable parcelable) {
        int i2 = ((f) parcelable).f227h;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.f2062h = i2;
    }

    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new f(this);
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2062h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.f2063i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2073s) != null) {
            velocityTracker.recycle();
            this.f2073s = null;
        }
        if (this.f2073s == null) {
            this.f2073s = VelocityTracker.obtain();
        }
        this.f2073s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f2064j && s()) {
            float abs = Math.abs(((float) this.f2074t) - motionEvent.getX());
            e eVar = this.f2063i;
            if (abs > ((float) eVar.b)) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2064j;
    }

    public final void r(int i2) {
        View view;
        int i3;
        if (this.f2062h != i2) {
            this.f2062h = i2;
            WeakReference weakReference = this.f2070p;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (this.f2062h == 5) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                if (view.getVisibility() != i3) {
                    view.setVisibility(i3);
                }
                Iterator it = this.f2075u.iterator();
                if (!it.hasNext()) {
                    u();
                    return;
                }
                throw A.g.e(it);
            }
        }
    }

    public final boolean s() {
        if (this.f2063i == null) {
            return false;
        }
        if (this.f2061g || this.f2062h == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r1.o(r0, r3.getTop()) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r3 != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L_0x0019
            r0 = 5
            if (r4 != r0) goto L_0x000d
            A.i r0 = r2.f2057a
            int r0 = r0.M()
            goto L_0x001f
        L_0x000d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = A.g.f(r4, r5)
            r3.<init>(r4)
            throw r3
        L_0x0019:
            A.i r0 = r2.f2057a
            int r0 = r0.L()
        L_0x001f:
            R.e r1 = r2.f2063i
            if (r1 == 0) goto L_0x0057
            if (r5 == 0) goto L_0x0030
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L_0x0057
            goto L_0x004d
        L_0x0030:
            int r5 = r3.getTop()
            r1.f702r = r3
            r3 = -1
            r1.f688c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L_0x004b
            int r5 = r1.f687a
            if (r5 != 0) goto L_0x004b
            android.view.View r5 = r1.f702r
            if (r5 == 0) goto L_0x004b
            r5 = 0
            r1.f702r = r5
        L_0x004b:
            if (r3 == 0) goto L_0x0057
        L_0x004d:
            r3 = 2
            r2.r(r3)
            F0.h r3 = r2.f2060e
            r3.a(r4)
            return
        L_0x0057:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f2070p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            O.m(view, 262144);
            O.i(view, 0);
            O.m(view, 1048576);
            O.i(view, 0);
            if (this.f2062h != 5) {
                O.n(view, J.g.f482j, new b(this, 5));
            }
            if (this.f2062h != 3) {
                O.n(view, J.g.f480h, new b(this, 3));
            }
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0219a.f3197x);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2058c = i.H(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f2059d = k.b(context, attributeSet, 0, R.style.MT_Bin).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2072r = resourceId;
            WeakReference weakReference = this.f2071q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2071q = null;
            WeakReference weakReference2 = this.f2070p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = O.f393a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f2059d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f2058c;
            if (colorStateList != null) {
                this.b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f2061g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
