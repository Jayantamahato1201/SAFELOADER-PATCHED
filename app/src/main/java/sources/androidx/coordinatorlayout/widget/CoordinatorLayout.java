package androidx.coordinatorlayout.widget;

import A.i;
import H.c;
import I.B;
import I.C0021m;
import I.C0022n;
import I.C0023o;
import I.C0024p;
import I.D;
import I.O;
import I.t0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.emoji2.text.r;
import b0.C0089m;
import com.cheatbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import k.C0241f0;
import n.k;
import u.C0487a;
import v.C0489a;
import v.b;
import v.d;
import v.e;
import v.f;
import v.g;
import y.C0498a;

public class CoordinatorLayout extends ViewGroup implements C0021m, C0022n {

    /* renamed from: t  reason: collision with root package name */
    public static final String f1084t;

    /* renamed from: u  reason: collision with root package name */
    public static final Class[] f1085u = {Context.class, AttributeSet.class};

    /* renamed from: v  reason: collision with root package name */
    public static final ThreadLocal f1086v = new ThreadLocal();

    /* renamed from: w  reason: collision with root package name */
    public static final C0089m f1087w = new C0089m(3);

    /* renamed from: x  reason: collision with root package name */
    public static final c f1088x = new c();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1089a = new ArrayList();
    public final r b = new r(4);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1090c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1091d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1092e = new int[2];
    public final int[] f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1093g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1094h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f1095i;

    /* renamed from: j  reason: collision with root package name */
    public View f1096j;

    /* renamed from: k  reason: collision with root package name */
    public View f1097k;

    /* renamed from: l  reason: collision with root package name */
    public e f1098l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1099m;

    /* renamed from: n  reason: collision with root package name */
    public t0 f1100n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1101o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f1102p;

    /* renamed from: q  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1103q;

    /* renamed from: r  reason: collision with root package name */
    public C0241f0 f1104r;

    /* renamed from: s  reason: collision with root package name */
    public final C0023o f1105s = new Object();

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        f1084t = str;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, I.o] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin);
        int[] iArr = C0487a.f4724a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.MT_Bin, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.MT_Bin, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1095i = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.f1095i;
                iArr2[i2] = (int) (((float) iArr2[i2]) * f2);
            }
        }
        this.f1102p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new v.c(this));
        WeakHashMap weakHashMap = O.f393a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f1088x.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i2, Rect rect, Rect rect2, d dVar, int i3, int i4) {
        int i5;
        int i6;
        int i7 = dVar.f4730c;
        if (i7 == 0) {
            i7 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i2);
        int i8 = dVar.f4731d;
        if ((i8 & 7) == 0) {
            i8 |= 8388611;
        }
        if ((i8 & 112) == 0) {
            i8 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, i2);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        if (i11 == 1) {
            i5 = rect.left + (rect.width() / 2);
        } else if (i11 != 5) {
            i5 = rect.left;
        } else {
            i5 = rect.right;
        }
        if (i12 == 16) {
            i6 = rect.top + (rect.height() / 2);
        } else if (i12 != 80) {
            i6 = rect.top;
        } else {
            i6 = rect.bottom;
        }
        if (i9 == 1) {
            i5 -= i3 / 2;
        } else if (i9 != 5) {
            i5 -= i3;
        }
        if (i10 == 16) {
            i6 -= i4 / 2;
        } else if (i10 != 80) {
            i6 -= i4;
        }
        rect2.set(i5, i6, i3 + i5, i4 + i6);
    }

    public static d n(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.b) {
            b bVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (b) cls.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    C0489a aVar = (C0489a) bVar.value().getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    C0489a aVar2 = dVar.f4729a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f4729a = aVar;
                        dVar.b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            dVar.b = true;
        }
        return dVar;
    }

    public static void u(View view, int i2) {
        d dVar = (d) view.getLayoutParams();
        int i3 = dVar.f4735i;
        if (i3 != i2) {
            O.j(view, i2 - i3);
            dVar.f4735i = i2;
        }
    }

    public static void v(View view, int i2) {
        d dVar = (d) view.getLayoutParams();
        int i3 = dVar.f4736j;
        if (i3 != i2) {
            O.k(view, i2 - i3);
            dVar.f4736j = i2;
        }
    }

    public final void a(View view, View view2, int i2, int i3) {
        C0023o oVar = this.f1105s;
        if (i3 == 1) {
            oVar.b = i2;
        } else {
            oVar.f456a = i2;
        }
        this.f1097k = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((d) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    public final void b(View view, int i2) {
        C0023o oVar = this.f1105s;
        if (i2 == 1) {
            oVar.b = 0;
        } else {
            oVar.f456a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i2)) {
                C0489a aVar = dVar.f4729a;
                if (aVar != null) {
                    aVar.p(childAt, view, i2);
                }
                if (i2 == 0) {
                    dVar.f4739m = false;
                } else if (i2 == 1) {
                    dVar.f4740n = false;
                }
            }
        }
        this.f1097k = null;
    }

    public final void c(View view, int i2, int i3, int[] iArr, int i4) {
        C0489a aVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int i8 = i4;
                if (dVar.a(i8) && (aVar = dVar.f4729a) != null) {
                    int[] iArr2 = this.f1092e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i2, i3, iArr2, i8);
                    if (i2 > 0) {
                        min = Math.max(i5, iArr2[0]);
                    } else {
                        min = Math.min(i5, iArr2[0]);
                    }
                    i5 = min;
                    if (i3 > 0) {
                        min2 = Math.max(i6, iArr2[1]);
                    } else {
                        min2 = Math.min(i6, iArr2[1]);
                    }
                    i6 = min2;
                    z2 = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z2) {
            p(1);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final void d(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        C0489a aVar;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i6;
            } else {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i6) && (aVar = dVar.f4729a) != null) {
                    int[] iArr2 = this.f1092e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i3, i4, i5, iArr2);
                    if (i4 > 0) {
                        i7 = Math.max(i7, iArr2[0]);
                    } else {
                        i7 = Math.min(i7, iArr2[0]);
                    }
                    if (i5 > 0) {
                        i8 = Math.max(i8, iArr2[1]);
                    } else {
                        i8 = Math.min(i8, iArr2[1]);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z2) {
            p(1);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j2) {
        C0489a aVar = ((d) view.getLayoutParams()).f4729a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    public final void drawableStateChanged() {
        boolean z2;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1102p;
        if (drawable == null || !drawable.isStateful()) {
            z2 = false;
        } else {
            z2 = drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        d(view, i2, i3, i4, i5, 0, this.f);
    }

    public final boolean f(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                C0489a aVar = dVar.f4729a;
                if (aVar != null) {
                    boolean o2 = aVar.o(childAt, i2, i3);
                    z2 |= o2;
                    if (i3 == 0) {
                        dVar.f4739m = o2;
                    } else if (i3 == 1) {
                        dVar.f4740n = o2;
                    }
                } else if (i3 == 0) {
                    dVar.f4739m = false;
                } else if (i3 == 1) {
                    dVar.f4740n = false;
                }
            }
        }
        return z2;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f1089a);
    }

    public final t0 getLastWindowInsets() {
        return this.f1100n;
    }

    public int getNestedScrollAxes() {
        C0023o oVar = this.f1105s;
        return oVar.b | oVar.f456a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1102p;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(d dVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - dVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        k kVar = (k) this.b.b;
        int i2 = kVar.f3706h;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) kVar.j(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVar.h(i3));
            }
        }
        ArrayList arrayList3 = this.f1091d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = g.f4744a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f4744a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i2) {
        int[] iArr = this.f1095i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        }
    }

    public final boolean o(View view, int i2, int i3) {
        c cVar = f1088x;
        Rect g2 = g();
        k(view, g2);
        try {
            return g2.contains(i2, i3);
        } finally {
            g2.setEmpty();
            cVar.c(g2);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f1099m) {
            if (this.f1098l == null) {
                this.f1098l = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1098l);
        }
        if (this.f1100n == null) {
            WeakHashMap weakHashMap = O.f393a;
            if (getFitsSystemWindows()) {
                B.c(this);
            }
        }
        this.f1094h = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f1099m && this.f1098l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1098l);
        }
        View view = this.f1097k;
        if (view != null) {
            b(view, 0);
        }
        this.f1094h = false;
    }

    public final void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (this.f1101o && this.f1102p != null) {
            t0 t0Var = this.f1100n;
            if (t0Var != null) {
                i2 = t0Var.d();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.f1102p.setBounds(0, 0, getWidth(), i2);
                this.f1102p.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r2 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r2;
        }
        t(true);
        return r2;
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        C0489a aVar;
        WeakHashMap weakHashMap = O.f393a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1089a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((aVar = ((d) view.getLayoutParams()).f4729a) == null || !aVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r28, int r29) {
        /*
            r27 = this;
            r0 = r27
            r6 = 1
            r0.s()
            int r1 = r0.getChildCount()
            r7 = 0
            r2 = 0
        L_0x000c:
            if (r2 >= r1) goto L_0x0031
            android.view.View r3 = r0.getChildAt(r2)
            androidx.emoji2.text.r r4 = r0.b
            java.lang.Object r4 = r4.b
            n.k r4 = (n.k) r4
            int r5 = r4.f3706h
            r8 = 0
        L_0x001b:
            if (r8 >= r5) goto L_0x002f
            java.lang.Object r9 = r4.j(r8)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x002d
            r1 = 1
            goto L_0x0032
        L_0x002d:
            int r8 = r8 + r6
            goto L_0x001b
        L_0x002f:
            int r2 = r2 + r6
            goto L_0x000c
        L_0x0031:
            r1 = 0
        L_0x0032:
            boolean r2 = r0.f1099m
            if (r1 == r2) goto L_0x0066
            if (r1 == 0) goto L_0x0053
            boolean r1 = r0.f1094h
            if (r1 == 0) goto L_0x0050
            v.e r1 = r0.f1098l
            if (r1 != 0) goto L_0x0047
            v.e r1 = new v.e
            r1.<init>(r0)
            r0.f1098l = r1
        L_0x0047:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            v.e r2 = r0.f1098l
            r1.addOnPreDrawListener(r2)
        L_0x0050:
            r0.f1099m = r6
            goto L_0x0066
        L_0x0053:
            boolean r1 = r0.f1094h
            if (r1 == 0) goto L_0x0064
            v.e r1 = r0.f1098l
            if (r1 == 0) goto L_0x0064
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            v.e r2 = r0.f1098l
            r1.removeOnPreDrawListener(r2)
        L_0x0064:
            r0.f1099m = r7
        L_0x0066:
            int r8 = r0.getPaddingLeft()
            int r1 = r0.getPaddingTop()
            int r9 = r0.getPaddingRight()
            int r2 = r0.getPaddingBottom()
            java.util.WeakHashMap r3 = I.O.f393a
            int r10 = r0.getLayoutDirection()
            if (r10 != r6) goto L_0x0080
            r11 = 1
            goto L_0x0081
        L_0x0080:
            r11 = 0
        L_0x0081:
            int r12 = android.view.View.MeasureSpec.getMode(r28)
            int r13 = android.view.View.MeasureSpec.getSize(r28)
            int r14 = android.view.View.MeasureSpec.getMode(r29)
            int r15 = android.view.View.MeasureSpec.getSize(r29)
            int r16 = r8 + r9
            int r17 = r1 + r2
            int r1 = r0.getSuggestedMinimumWidth()
            int r2 = r0.getSuggestedMinimumHeight()
            I.t0 r3 = r0.f1100n
            if (r3 == 0) goto L_0x00aa
            boolean r3 = r0.getFitsSystemWindows()
            if (r3 == 0) goto L_0x00aa
            r18 = 1
            goto L_0x00ac
        L_0x00aa:
            r18 = 0
        L_0x00ac:
            java.util.ArrayList r3 = r0.f1089a
            int r4 = r3.size()
            r5 = 0
            r6 = 0
            r19 = 1
        L_0x00b6:
            if (r5 >= r4) goto L_0x01de
            java.lang.Object r20 = r3.get(r5)
            android.view.View r20 = (android.view.View) r20
            int r7 = r20.getVisibility()
            r22 = r1
            r1 = 8
            if (r7 != r1) goto L_0x00d8
            r20 = r3
            r23 = r4
            r24 = r8
            r25 = r9
            r1 = r22
            r21 = 0
            r22 = r5
            goto L_0x01d1
        L_0x00d8:
            android.view.ViewGroup$LayoutParams r1 = r20.getLayoutParams()
            r7 = r1
            v.d r7 = (v.d) r7
            int r1 = r7.f4732e
            if (r1 < 0) goto L_0x0126
            if (r12 == 0) goto L_0x0126
            int r1 = r0.m(r1)
            r23 = r1
            int r1 = r7.f4730c
            if (r1 != 0) goto L_0x00f2
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00f2:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r10)
            r1 = r1 & 7
            r24 = r2
            r2 = 3
            if (r1 != r2) goto L_0x00ff
            if (r11 == 0) goto L_0x0104
        L_0x00ff:
            r2 = 5
            if (r1 != r2) goto L_0x0113
            if (r11 == 0) goto L_0x0113
        L_0x0104:
            int r1 = r13 - r9
            int r1 = r1 - r23
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        L_0x010d:
            r26 = r4
            r4 = r1
            r1 = r26
            goto L_0x012b
        L_0x0113:
            if (r1 != r2) goto L_0x0117
            if (r11 == 0) goto L_0x011c
        L_0x0117:
            r2 = 3
            if (r1 != r2) goto L_0x0124
            if (r11 == 0) goto L_0x0124
        L_0x011c:
            int r1 = r23 - r8
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            goto L_0x010d
        L_0x0124:
            r2 = 0
            goto L_0x0129
        L_0x0126:
            r24 = r2
            goto L_0x0124
        L_0x0129:
            r1 = r4
            r4 = 0
        L_0x012b:
            if (r18 == 0) goto L_0x015e
            boolean r21 = r20.getFitsSystemWindows()
            if (r21 != 0) goto L_0x015e
            I.t0 r2 = r0.f1100n
            int r2 = r2.b()
            r23 = r1
            I.t0 r1 = r0.f1100n
            int r1 = r1.c()
            int r1 = r1 + r2
            I.t0 r2 = r0.f1100n
            int r2 = r2.d()
            r25 = r1
            I.t0 r1 = r0.f1100n
            int r1 = r1.a()
            int r1 = r1 + r2
            int r2 = r13 - r25
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r12)
            int r1 = r15 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            goto L_0x0164
        L_0x015e:
            r23 = r1
            r2 = r28
            r1 = r29
        L_0x0164:
            v.a r0 = r7.f4729a
            if (r0 == 0) goto L_0x018c
            r21 = r3
            r3 = r2
            r2 = r20
            r20 = r21
            r21 = 0
            r25 = r9
            r9 = r24
            r24 = r8
            r8 = r22
            r22 = r5
            r5 = r1
            r1 = r27
            boolean r0 = r0.h(r1, r2, r3, r4, r5)
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            if (r0 != 0) goto L_0x0189
            goto L_0x01a1
        L_0x0189:
            r0 = r27
            goto L_0x01a7
        L_0x018c:
            r21 = r4
            r4 = r1
            r1 = r20
            r20 = r3
            r3 = r21
            r25 = r9
            r9 = r24
            r21 = 0
            r24 = r8
            r8 = r22
            r22 = r5
        L_0x01a1:
            r5 = 0
            r0 = r27
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01a7:
            int r2 = r1.getMeasuredWidth()
            int r2 = r2 + r16
            int r3 = r7.leftMargin
            int r2 = r2 + r3
            int r3 = r7.rightMargin
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r8, r2)
            int r3 = r1.getMeasuredHeight()
            int r3 = r3 + r17
            int r4 = r7.topMargin
            int r3 = r3 + r4
            int r4 = r7.bottomMargin
            int r3 = r3 + r4
            int r3 = java.lang.Math.max(r9, r3)
            int r1 = r1.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r6, r1)
            r1 = r2
            r2 = r3
        L_0x01d1:
            int r5 = r22 + 1
            r3 = r20
            r4 = r23
            r8 = r24
            r9 = r25
            r7 = 0
            goto L_0x00b6
        L_0x01de:
            r8 = r1
            r9 = r2
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r6
            r2 = r28
            int r1 = android.view.View.resolveSizeAndState(r8, r2, r1)
            int r2 = r6 << 16
            r3 = r29
            int r2 = android.view.View.resolveSizeAndState(r9, r3, r2)
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    C0489a aVar = dVar.f4729a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        C0489a aVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f4729a) != null) {
                    z2 |= aVar.i(view);
                }
            }
        }
        return z2;
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        c(view, i2, i3, iArr, 0);
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f);
        SparseArray sparseArray = fVar.f4743h;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            C0489a aVar = n(childAt).f4729a;
            if (!(id == -1 || aVar == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, Q.b, v.f] */
    public final Parcelable onSaveInstanceState() {
        Parcelable n2;
        ? bVar = new Q.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            C0489a aVar = ((d) childAt.getLayoutParams()).f4729a;
            if (!(id == -1 || aVar == null || (n2 = aVar.n(childAt)) == null)) {
                sparseArray.append(id, n2);
            }
        }
        bVar.f4743h = sparseArray;
        return bVar;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f1096j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = 0
            goto L_0x002a
        L_0x0017:
            r3 = 0
        L_0x0018:
            android.view.View r6 = r0.f1096j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            v.d r6 = (v.d) r6
            v.a r6 = r6.f4729a
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f1096j
            boolean r6 = r6.q(r7, r1)
        L_0x002a:
            android.view.View r7 = r0.f1096j
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r9 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            return r6
        L_0x0054:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0047 A[EDGE_INSN: B:125:0x0047->B:8:0x0047 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(int r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.util.WeakHashMap r7 = I.O.f393a
            int r8 = r0.getLayoutDirection()
            java.util.ArrayList r7 = r0.f1089a
            int r14 = r7.size()
            android.graphics.Rect r15 = g()
            android.graphics.Rect r9 = g()
            android.graphics.Rect r10 = g()
            r12 = 0
        L_0x001d:
            H.c r13 = f1088x
            if (r12 >= r14) goto L_0x02cd
            java.lang.Object r16 = r7.get(r12)
            r2 = r16
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r16 = r2.getLayoutParams()
            r3 = r16
            v.d r3 = (v.d) r3
            if (r1 != 0) goto L_0x004b
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x004b
            r6 = r9
            r5 = r10
            r18 = r12
            r2 = r14
            r3 = 0
            r9 = 48
            r10 = 80
            r11 = 3
            r13 = 5
        L_0x0047:
            r17 = 1
            goto L_0x02c6
        L_0x004b:
            r4 = 0
        L_0x004c:
            if (r4 >= r12) goto L_0x00f9
            java.lang.Object r5 = r7.get(r4)
            android.view.View r5 = (android.view.View) r5
            r17 = 1
            android.view.View r6 = r3.f4738l
            if (r6 != r5) goto L_0x00de
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            v.d r5 = (v.d) r5
            android.view.View r6 = r5.f4737k
            if (r6 == 0) goto L_0x00de
            r6 = r9
            android.graphics.Rect r9 = g()
            android.graphics.Rect r11 = g()
            r19 = r10
            android.graphics.Rect r10 = g()
            r20 = r4
            android.view.View r4 = r5.f4737k
            r0.k(r4, r9)
            r4 = 0
            r0.i(r2, r11, r4)
            r18 = r12
            int r12 = r2.getMeasuredWidth()
            r21 = r13
            int r13 = r2.getMeasuredHeight()
            r4 = r21
            r21 = r7
            r7 = r11
            r11 = r5
            r5 = r19
            l(r8, r9, r10, r11, r12, r13)
            r22 = r14
            int r14 = r10.left
            r23 = r5
            int r5 = r7.left
            if (r14 != r5) goto L_0x00a8
            int r5 = r10.top
            int r14 = r7.top
            if (r5 == r14) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r5 = 0
            goto L_0x00a9
        L_0x00a8:
            r5 = 1
        L_0x00a9:
            r0.h(r11, r10, r12, r13)
            int r12 = r10.left
            int r13 = r7.left
            int r12 = r12 - r13
            int r13 = r10.top
            int r14 = r7.top
            int r13 = r13 - r14
            if (r12 == 0) goto L_0x00bb
            I.O.j(r2, r12)
        L_0x00bb:
            if (r13 == 0) goto L_0x00c0
            I.O.k(r2, r13)
        L_0x00c0:
            if (r5 == 0) goto L_0x00cb
            v.a r5 = r11.f4729a
            if (r5 == 0) goto L_0x00cb
            android.view.View r11 = r11.f4737k
            r5.d(r0, r2, r11)
        L_0x00cb:
            r9.setEmpty()
            r4.c(r9)
            r7.setEmpty()
            r4.c(r7)
            r10.setEmpty()
            r4.c(r10)
            goto L_0x00ea
        L_0x00de:
            r20 = r4
            r21 = r7
            r6 = r9
            r23 = r10
            r18 = r12
            r4 = r13
            r22 = r14
        L_0x00ea:
            int r5 = r20 + 1
            r13 = r4
            r4 = r5
            r9 = r6
            r12 = r18
            r7 = r21
            r14 = r22
            r10 = r23
            goto L_0x004c
        L_0x00f9:
            r21 = r7
            r6 = r9
            r23 = r10
            r18 = r12
            r4 = r13
            r22 = r14
            r5 = 1
            r0.i(r2, r6, r5)
            int r5 = r3.f4733g
            if (r5 == 0) goto L_0x015f
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x015f
            int r5 = r3.f4733g
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r8)
            r7 = r5 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0132
            r9 = 80
            if (r7 == r9) goto L_0x0122
            goto L_0x013c
        L_0x0122:
            int r7 = r15.bottom
            int r9 = r0.getHeight()
            int r10 = r6.top
            int r9 = r9 - r10
            int r7 = java.lang.Math.max(r7, r9)
            r15.bottom = r7
            goto L_0x013c
        L_0x0132:
            int r7 = r15.top
            int r9 = r6.bottom
            int r7 = java.lang.Math.max(r7, r9)
            r15.top = r7
        L_0x013c:
            r5 = r5 & 7
            r7 = 3
            if (r5 == r7) goto L_0x0155
            r7 = 5
            if (r5 == r7) goto L_0x0145
            goto L_0x015f
        L_0x0145:
            int r5 = r15.right
            int r7 = r0.getWidth()
            int r9 = r6.left
            int r7 = r7 - r9
            int r5 = java.lang.Math.max(r5, r7)
            r15.right = r5
            goto L_0x015f
        L_0x0155:
            int r5 = r15.left
            int r7 = r6.right
            int r5 = java.lang.Math.max(r5, r7)
            r15.left = r5
        L_0x015f:
            int r3 = r3.f4734h
            if (r3 == 0) goto L_0x0270
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L_0x0270
            java.util.WeakHashMap r3 = I.O.f393a
            boolean r3 = r2.isLaidOut()
            if (r3 != 0) goto L_0x0173
            goto L_0x0270
        L_0x0173:
            int r3 = r2.getWidth()
            if (r3 <= 0) goto L_0x0270
            int r3 = r2.getHeight()
            if (r3 > 0) goto L_0x0181
            goto L_0x0270
        L_0x0181:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            v.d r3 = (v.d) r3
            v.a r5 = r3.f4729a
            android.graphics.Rect r7 = g()
            android.graphics.Rect r9 = g()
            int r10 = r2.getLeft()
            int r11 = r2.getTop()
            int r12 = r2.getRight()
            int r13 = r2.getBottom()
            r9.set(r10, r11, r12, r13)
            if (r5 == 0) goto L_0x01d7
            boolean r5 = r5.a(r2)
            if (r5 == 0) goto L_0x01d7
            boolean r5 = r9.contains(r7)
            if (r5 == 0) goto L_0x01b3
            goto L_0x01da
        L_0x01b3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r7.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r9.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d7:
            r7.set(r9)
        L_0x01da:
            r9.setEmpty()
            r4.c(r9)
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L_0x01ee
            r7.setEmpty()
            r4.c(r7)
            goto L_0x0270
        L_0x01ee:
            int r5 = r3.f4734h
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r8)
            r9 = 48
            r10 = r5 & 48
            if (r10 != r9) goto L_0x020e
            int r10 = r7.top
            int r11 = r3.topMargin
            int r10 = r10 - r11
            int r11 = r3.f4736j
            int r10 = r10 - r11
            int r11 = r15.top
            if (r10 >= r11) goto L_0x020e
            int r11 = r11 - r10
            v(r2, r11)
            r11 = 1
        L_0x020b:
            r10 = 80
            goto L_0x0210
        L_0x020e:
            r11 = 0
            goto L_0x020b
        L_0x0210:
            r12 = r5 & 80
            if (r12 != r10) goto L_0x022a
            int r12 = r0.getHeight()
            int r13 = r7.bottom
            int r12 = r12 - r13
            int r13 = r3.bottomMargin
            int r12 = r12 - r13
            int r13 = r3.f4736j
            int r12 = r12 + r13
            int r13 = r15.bottom
            if (r12 >= r13) goto L_0x022a
            int r12 = r12 - r13
            v(r2, r12)
            r11 = 1
        L_0x022a:
            if (r11 != 0) goto L_0x0230
            r11 = 0
            v(r2, r11)
        L_0x0230:
            r11 = 3
            r12 = r5 & 3
            if (r12 != r11) goto L_0x0248
            int r12 = r7.left
            int r13 = r3.leftMargin
            int r12 = r12 - r13
            int r13 = r3.f4735i
            int r12 = r12 - r13
            int r13 = r15.left
            if (r12 >= r13) goto L_0x0248
            int r13 = r13 - r12
            u(r2, r13)
            r12 = 1
        L_0x0246:
            r13 = 5
            goto L_0x024a
        L_0x0248:
            r12 = 0
            goto L_0x0246
        L_0x024a:
            r5 = r5 & r13
            if (r5 != r13) goto L_0x0263
            int r5 = r0.getWidth()
            int r14 = r7.right
            int r5 = r5 - r14
            int r14 = r3.rightMargin
            int r5 = r5 - r14
            int r3 = r3.f4735i
            int r5 = r5 + r3
            int r3 = r15.right
            if (r5 >= r3) goto L_0x0263
            int r5 = r5 - r3
            u(r2, r5)
            r12 = 1
        L_0x0263:
            r3 = 0
            if (r12 != 0) goto L_0x0269
            u(r2, r3)
        L_0x0269:
            r7.setEmpty()
            r4.c(r7)
            goto L_0x0277
        L_0x0270:
            r3 = 0
            r9 = 48
            r10 = 80
            r11 = 3
            r13 = 5
        L_0x0277:
            r4 = 2
            if (r1 == r4) goto L_0x02a1
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            v.d r4 = (v.d) r4
            android.graphics.Rect r4 = r4.f4741o
            r5 = r23
            r5.set(r4)
            boolean r4 = r5.equals(r6)
            if (r4 == 0) goto L_0x0293
            r7 = r21
            r2 = r22
            goto L_0x0047
        L_0x0293:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            v.d r2 = (v.d) r2
            android.graphics.Rect r2 = r2.f4741o
            r2.set(r6)
        L_0x029e:
            r17 = 1
            goto L_0x02a4
        L_0x02a1:
            r5 = r23
            goto L_0x029e
        L_0x02a4:
            int r12 = r18 + 1
            r2 = r22
        L_0x02a8:
            r7 = r21
            if (r12 >= r2) goto L_0x0047
            java.lang.Object r4 = r7.get(r12)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r14 = r4.getLayoutParams()
            v.d r14 = (v.d) r14
            v.a r14 = r14.f4729a
            if (r14 == 0) goto L_0x02bf
            r14.b(r4)
        L_0x02bf:
            r17 = 1
            int r12 = r12 + 1
            r21 = r7
            goto L_0x02a8
        L_0x02c6:
            int r12 = r18 + 1
            r14 = r2
            r10 = r5
            r9 = r6
            goto L_0x001d
        L_0x02cd:
            r6 = r9
            r5 = r10
            r4 = r13
            r15.setEmpty()
            r4.c(r15)
            r6.setEmpty()
            r4.c(r6)
            r5.setEmpty()
            r4.c(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i2) {
        int i3;
        d dVar = (d) view.getLayoutParams();
        View view2 = dVar.f4737k;
        if (view2 != null || dVar.f == -1) {
            c cVar = f1088x;
            if (view2 != null) {
                Rect g2 = g();
                Rect g3 = g();
                try {
                    k(view2, g2);
                    d dVar2 = (d) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    l(i2, g2, g3, dVar2, measuredWidth, measuredHeight);
                    h(dVar2, g3, measuredWidth, measuredHeight);
                    view.layout(g3.left, g3.top, g3.right, g3.bottom);
                    g2.setEmpty();
                    cVar.c(g2);
                    g3.setEmpty();
                    cVar.c(g3);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    g2.setEmpty();
                    cVar.c(g2);
                    g3.setEmpty();
                    cVar.c(g3);
                    throw th2;
                }
            } else {
                int i4 = i2;
                int i5 = dVar.f4732e;
                if (i5 >= 0) {
                    d dVar3 = (d) view.getLayoutParams();
                    int i6 = dVar3.f4730c;
                    if (i6 == 0) {
                        i6 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i6, i4);
                    int i7 = absoluteGravity & 7;
                    int i8 = absoluteGravity & 112;
                    int width = getWidth();
                    int height = getHeight();
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i4 == 1) {
                        i5 = width - i5;
                    }
                    int m2 = m(i5) - measuredWidth2;
                    if (i7 == 1) {
                        m2 += measuredWidth2 / 2;
                    } else if (i7 == 5) {
                        m2 += measuredWidth2;
                    }
                    if (i8 == 16) {
                        i3 = measuredHeight2 / 2;
                    } else if (i8 != 80) {
                        i3 = 0;
                    } else {
                        i3 = measuredHeight2;
                    }
                    int max = Math.max(getPaddingLeft() + dVar3.leftMargin, Math.min(m2, ((width - getPaddingRight()) - measuredWidth2) - dVar3.rightMargin));
                    int max2 = Math.max(getPaddingTop() + dVar3.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - dVar3.bottomMargin));
                    view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    return;
                }
                d dVar4 = (d) view.getLayoutParams();
                Rect g4 = g();
                g4.set(getPaddingLeft() + dVar4.leftMargin, getPaddingTop() + dVar4.topMargin, (getWidth() - getPaddingRight()) - dVar4.rightMargin, (getHeight() - getPaddingBottom()) - dVar4.bottomMargin);
                if (this.f1100n != null) {
                    WeakHashMap weakHashMap = O.f393a;
                    if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                        g4.left = this.f1100n.b() + g4.left;
                        g4.top = this.f1100n.d() + g4.top;
                        g4.right -= this.f1100n.c();
                        g4.bottom -= this.f1100n.a();
                    }
                }
                Rect g5 = g();
                int i9 = dVar4.f4730c;
                if ((i9 & 7) == 0) {
                    i9 |= 8388611;
                }
                if ((i9 & 112) == 0) {
                    i9 |= 48;
                }
                Gravity.apply(i9, view.getMeasuredWidth(), view.getMeasuredHeight(), g4, g5, i4);
                view.layout(g5.left, g5.top, g5.right, g5.bottom);
                g4.setEmpty();
                cVar.c(g4);
                g5.setEmpty();
                cVar.c(g5);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public final boolean r(MotionEvent motionEvent, int i2) {
        int i3;
        MotionEvent motionEvent2 = motionEvent;
        int i4 = i2;
        int actionMasked = motionEvent2.getActionMasked();
        ArrayList arrayList = this.f1090c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            if (isChildrenDrawingOrderEnabled) {
                i3 = getChildDrawingOrder(childCount, i5);
            } else {
                i3 = i5;
            }
            arrayList.add(getChildAt(i3));
        }
        C0089m mVar = f1087w;
        if (mVar != null) {
            Collections.sort(arrayList, mVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            C0489a aVar = ((d) view.getLayoutParams()).f4729a;
            if (z2 && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i4 == 0) {
                        aVar.f(this, view, motionEvent3);
                    } else if (i4 == 1) {
                        aVar.q(view, motionEvent3);
                    }
                }
            } else if (!z2 && aVar != null) {
                if (i4 == 0) {
                    z2 = aVar.f(this, view, motionEvent2);
                } else if (i4 == 1) {
                    z2 = aVar.q(view, motionEvent2);
                }
                if (z2) {
                    this.f1096j = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        C0489a aVar = ((d) view.getLayoutParams()).f4729a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.f1093g) {
            t(false);
            this.f1093g = true;
        }
    }

    public final void s() {
        H.b bVar;
        ArrayList arrayList = this.f1089a;
        arrayList.clear();
        r rVar = this.b;
        k kVar = (k) rVar.b;
        int i2 = kVar.f3706h;
        int i3 = 0;
        while (true) {
            bVar = (H.b) rVar.f1183a;
            if (i3 >= i2) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) kVar.j(i3);
            if (arrayList2 != null) {
                arrayList2.clear();
                bVar.c(arrayList2);
            }
            i3++;
        }
        kVar.clear();
        int childCount = getChildCount();
        int i4 = 0;
        loop1:
        while (true) {
            k kVar2 = (k) rVar.b;
            if (i4 < childCount) {
                View childAt = getChildAt(i4);
                d n2 = n(childAt);
                int i5 = n2.f;
                if (i5 == -1) {
                    n2.f4738l = null;
                    n2.f4737k = null;
                } else {
                    View view = n2.f4737k;
                    if (view != null && view.getId() == i5) {
                        View view2 = n2.f4737k;
                        ViewParent parent = view2.getParent();
                        while (parent != this) {
                            if (parent == null || parent == childAt) {
                                n2.f4738l = null;
                                n2.f4737k = null;
                            } else {
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                }
                                parent = parent.getParent();
                            }
                        }
                        n2.f4738l = view2;
                    }
                    View findViewById = findViewById(i5);
                    n2.f4737k = findViewById;
                    if (findViewById != null) {
                        if (findViewById != this) {
                            ViewParent parent2 = findViewById.getParent();
                            while (true) {
                                if (parent2 == this || parent2 == null) {
                                    n2.f4738l = findViewById;
                                } else if (parent2 != childAt) {
                                    if (parent2 instanceof View) {
                                        findViewById = (View) parent2;
                                    }
                                    parent2 = parent2.getParent();
                                } else if (isInEditMode()) {
                                    n2.f4738l = null;
                                    n2.f4737k = null;
                                } else {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            }
                        } else if (isInEditMode()) {
                            n2.f4738l = null;
                            n2.f4737k = null;
                        } else {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else if (isInEditMode()) {
                        n2.f4738l = null;
                        n2.f4737k = null;
                    } else {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i5) + " to anchor view " + childAt);
                    }
                }
                if (!kVar2.containsKey(childAt)) {
                    kVar2.put(childAt, (Object) null);
                }
                for (int i6 = 0; i6 < childCount; i6++) {
                    if (i6 != i4) {
                        View childAt2 = getChildAt(i6);
                        if (childAt2 != n2.f4738l) {
                            WeakHashMap weakHashMap = O.f393a;
                            int layoutDirection = getLayoutDirection();
                            int absoluteGravity = Gravity.getAbsoluteGravity(((d) childAt2.getLayoutParams()).f4733g, layoutDirection);
                            if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n2.f4734h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                                C0489a aVar = n2.f4729a;
                                if (aVar != null) {
                                    aVar.b(childAt);
                                }
                            }
                        }
                        if (!kVar2.containsKey(childAt2) && !kVar2.containsKey(childAt2)) {
                            kVar2.put(childAt2, (Object) null);
                        }
                        if (kVar2.containsKey(childAt2) && kVar2.containsKey(childAt)) {
                            ArrayList arrayList3 = (ArrayList) kVar2.getOrDefault(childAt2, (Object) null);
                            if (arrayList3 == null) {
                                arrayList3 = (ArrayList) bVar.a();
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                kVar2.put(childAt2, arrayList3);
                            }
                            arrayList3.add(childAt);
                        }
                    }
                }
                i4++;
            } else {
                ArrayList arrayList4 = (ArrayList) rVar.f1184c;
                arrayList4.clear();
                HashSet hashSet = (HashSet) rVar.f1185d;
                hashSet.clear();
                int i7 = kVar2.f3706h;
                for (int i8 = 0; i8 < i7; i8++) {
                    rVar.a(kVar2.h(i8), arrayList4, hashSet);
                }
                arrayList.addAll(arrayList4);
                Collections.reverse(arrayList);
                return;
            }
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1103q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z2;
        Drawable drawable2 = this.f1102p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1102p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1102p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f1102p;
                WeakHashMap weakHashMap = O.f393a;
                i.p0(drawable4, getLayoutDirection());
                Drawable drawable5 = this.f1102p;
                if (getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawable5.setVisible(z2, false);
                this.f1102p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = O.f393a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = C0498a.b(getContext(), i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i2) {
        boolean z2;
        super.setVisibility(i2);
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.f1102p;
        if (drawable != null && drawable.isVisible() != z2) {
            this.f1102p.setVisible(z2, false);
        }
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0489a aVar = ((d) childAt.getLayoutParams()).f4729a;
            if (aVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    aVar.f(this, childAt, obtain);
                } else {
                    aVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((d) getChildAt(i3).getLayoutParams()).getClass();
        }
        this.f1096j = null;
        this.f1093g = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f1102p) {
            return true;
        }
        return false;
    }

    public final void w() {
        WeakHashMap weakHashMap = O.f393a;
        if (getFitsSystemWindows()) {
            if (this.f1104r == null) {
                this.f1104r = new C0241f0((Object) this);
            }
            D.u(this, this.f1104r);
            setSystemUiVisibility(1280);
            return;
        }
        D.u(this, (C0024p) null);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }
}
