package k;

import A.i;
import I.O;
import P.b;
import Q0.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import d.a;
import j.C0194D;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class L0 implements C0194D {

    /* renamed from: A  reason: collision with root package name */
    public static final Method f3367A;

    /* renamed from: B  reason: collision with root package name */
    public static final Method f3368B;

    /* renamed from: C  reason: collision with root package name */
    public static final Method f3369C;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3370a;
    public ListAdapter b;

    /* renamed from: c  reason: collision with root package name */
    public C0280z0 f3371c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3372d = -2;

    /* renamed from: e  reason: collision with root package name */
    public int f3373e = -2;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f3374g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3375h = 1002;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3376i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3377j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3378k;

    /* renamed from: l  reason: collision with root package name */
    public int f3379l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final int f3380m = Integer.MAX_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public b f3381n;

    /* renamed from: o  reason: collision with root package name */
    public View f3382o;

    /* renamed from: p  reason: collision with root package name */
    public AdapterView.OnItemClickListener f3383p;

    /* renamed from: q  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f3384q;

    /* renamed from: r  reason: collision with root package name */
    public final I0 f3385r = new I0(this, 1);

    /* renamed from: s  reason: collision with root package name */
    public final K0 f3386s = new K0(this);

    /* renamed from: t  reason: collision with root package name */
    public final J0 f3387t = new J0(this);

    /* renamed from: u  reason: collision with root package name */
    public final I0 f3388u = new I0(this, 0);

    /* renamed from: v  reason: collision with root package name */
    public final Handler f3389v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f3390w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public Rect f3391x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3392y;

    /* renamed from: z  reason: collision with root package name */
    public final B f3393z;

    static {
        int i2 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        Class<PopupWindow> cls2 = PopupWindow.class;
        if (i2 <= 28) {
            try {
                f3367A = cls2.getDeclaredMethod("setClipToScreenEnabled", new Class[]{cls});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3369C = cls2.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f3368B = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, cls});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [android.widget.PopupWindow, k.B] */
    public L0(Context context, AttributeSet attributeSet, int i2) {
        Drawable drawable;
        int resourceId;
        this.f3370a = context;
        this.f3389v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2205o, i2, 0);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3374g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3376i = true;
        }
        obtainStyledAttributes.recycle();
        ? popupWindow = new PopupWindow(context, attributeSet, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f2209s, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            i.q0(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes2.getDrawable(0);
        } else {
            drawable = l.v(context, resourceId);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f3393z = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final void a(int i2) {
        this.f = i2;
    }

    public final boolean b() {
        return this.f3393z.isShowing();
    }

    public final int d() {
        return this.f;
    }

    public final void dismiss() {
        B b2 = this.f3393z;
        b2.dismiss();
        b2.setContentView((View) null);
        this.f3371c = null;
        this.f3389v.removeCallbacks(this.f3385r);
    }

    public final void f() {
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        C0280z0 z0Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        C0280z0 z0Var2 = this.f3371c;
        B b2 = this.f3393z;
        Context context = this.f3370a;
        if (z0Var2 == null) {
            C0280z0 q2 = q(context, !this.f3392y);
            this.f3371c = q2;
            q2.setAdapter(this.b);
            this.f3371c.setOnItemClickListener(this.f3383p);
            this.f3371c.setFocusable(true);
            this.f3371c.setFocusableInTouchMode(true);
            this.f3371c.setOnItemSelectedListener(new F0(0, this));
            this.f3371c.setOnScrollListener(this.f3387t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3384q;
            if (onItemSelectedListener != null) {
                this.f3371c.setOnItemSelectedListener(onItemSelectedListener);
            }
            b2.setContentView(this.f3371c);
        } else {
            ViewGroup viewGroup = (ViewGroup) b2.getContentView();
        }
        Drawable background = b2.getBackground();
        Rect rect = this.f3390w;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i2 = rect.bottom + i10;
            if (!this.f3376i) {
                this.f3374g = -i10;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        if (b2.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        View view = this.f3382o;
        int i11 = this.f3374g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f3368B;
            if (method != null) {
                try {
                    i3 = ((Integer) method.invoke(b2, new Object[]{view, Integer.valueOf(i11), Boolean.valueOf(z2)})).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            i3 = b2.getMaxAvailableHeight(view, i11);
        } else {
            i3 = G0.a(b2, view, i11, z2);
        }
        int i12 = this.f3372d;
        if (i12 == -1) {
            i4 = i3 + i2;
        } else {
            int i13 = this.f3373e;
            if (i13 == -2) {
                i7 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            } else if (i13 != -1) {
                i7 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else {
                i7 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            }
            int a2 = this.f3371c.a(i7, i3);
            if (a2 > 0) {
                i8 = this.f3371c.getPaddingBottom() + this.f3371c.getPaddingTop() + i2;
            } else {
                i8 = 0;
            }
            i4 = a2 + i8;
        }
        if (this.f3393z.getInputMethodMode() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        i.u0(b2, this.f3375h);
        if (b2.isShowing()) {
            View view2 = this.f3382o;
            WeakHashMap weakHashMap = O.f393a;
            if (view2.isAttachedToWindow()) {
                int i14 = this.f3373e;
                if (i14 == -1) {
                    i14 = -1;
                } else if (i14 == -2) {
                    i14 = this.f3382o.getWidth();
                }
                if (i12 == -1) {
                    if (z3) {
                        i12 = i4;
                    } else {
                        i12 = -1;
                    }
                    if (z3) {
                        if (this.f3373e == -1) {
                            i6 = -1;
                        } else {
                            i6 = 0;
                        }
                        b2.setWidth(i6);
                        b2.setHeight(0);
                    } else {
                        if (this.f3373e == -1) {
                            i9 = -1;
                        }
                        b2.setWidth(i9);
                        b2.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = i4;
                }
                b2.setOutsideTouchable(true);
                int i15 = i14;
                View view3 = this.f3382o;
                int i16 = this.f;
                int i17 = this.f3374g;
                if (i15 < 0) {
                    i15 = -1;
                }
                if (i12 < 0) {
                    i5 = -1;
                } else {
                    i5 = i12;
                }
                b2.update(view3, i16, i17, i15, i5);
                return;
            }
            return;
        }
        int i18 = this.f3373e;
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = this.f3382o.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = i4;
        }
        b2.setWidth(i18);
        b2.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3367A;
            if (method2 != null) {
                try {
                    method2.invoke(b2, new Object[]{Boolean.TRUE});
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            H0.b(b2, true);
        }
        b2.setOutsideTouchable(true);
        b2.setTouchInterceptor(this.f3386s);
        if (this.f3378k) {
            i.q0(b2, this.f3377j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f3369C;
            if (method3 != null) {
                try {
                    method3.invoke(b2, new Object[]{this.f3391x});
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            H0.a(b2, this.f3391x);
        }
        b2.showAsDropDown(this.f3382o, this.f, this.f3374g, this.f3379l);
        this.f3371c.setSelection(-1);
        if ((!this.f3392y || this.f3371c.isInTouchMode()) && (z0Var = this.f3371c) != null) {
            z0Var.setListSelectionHidden(true);
            z0Var.requestLayout();
        }
        if (!this.f3392y) {
            this.f3389v.post(this.f3388u);
        }
    }

    public final int g() {
        if (!this.f3376i) {
            return 0;
        }
        return this.f3374g;
    }

    public final Drawable h() {
        return this.f3393z.getBackground();
    }

    public final C0280z0 j() {
        return this.f3371c;
    }

    public final void l(Drawable drawable) {
        this.f3393z.setBackgroundDrawable(drawable);
    }

    public final void m(int i2) {
        this.f3374g = i2;
        this.f3376i = true;
    }

    public void n(ListAdapter listAdapter) {
        b bVar = this.f3381n;
        if (bVar == null) {
            this.f3381n = new b(1, this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3381n);
        }
        C0280z0 z0Var = this.f3371c;
        if (z0Var != null) {
            z0Var.setAdapter(this.b);
        }
    }

    public C0280z0 q(Context context, boolean z2) {
        return new C0280z0(context, z2);
    }

    public final void r(int i2) {
        Drawable background = this.f3393z.getBackground();
        if (background != null) {
            Rect rect = this.f3390w;
            background.getPadding(rect);
            this.f3373e = rect.left + rect.right + i2;
            return;
        }
        this.f3373e = i2;
    }
}
