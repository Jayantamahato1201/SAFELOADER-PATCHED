package androidx.appcompat.widget;

import A.d;
import H0.m;
import I.B;
import I.C0021m;
import I.C0022n;
import I.C0023o;
import I.D;
import I.O;
import I.i0;
import I.j0;
import I.k0;
import I.l0;
import I.r0;
import I.t0;
import Q0.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.cheatbox.R;
import e.C0129K;
import j.C0209m;
import j.y;
import java.util.WeakHashMap;
import k.C0232c;
import k.C0235d;
import k.C0238e;
import k.C0248j;
import k.C0264r0;
import k.C0266s0;
import k.r1;
import k.w1;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0264r0, C0021m, C0022n {

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f937B = {R.attr.MT_Bin, 16842841};

    /* renamed from: A  reason: collision with root package name */
    public final C0023o f938A;

    /* renamed from: a  reason: collision with root package name */
    public int f939a;
    public int b = 0;

    /* renamed from: c  reason: collision with root package name */
    public ContentFrameLayout f940c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f941d;

    /* renamed from: e  reason: collision with root package name */
    public C0266s0 f942e;
    public Drawable f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f943g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f944h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f945i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f946j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f947k;

    /* renamed from: l  reason: collision with root package name */
    public int f948l;

    /* renamed from: m  reason: collision with root package name */
    public int f949m;

    /* renamed from: n  reason: collision with root package name */
    public final Rect f950n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    public final Rect f951o = new Rect();

    /* renamed from: p  reason: collision with root package name */
    public final Rect f952p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public t0 f953q;

    /* renamed from: r  reason: collision with root package name */
    public t0 f954r;

    /* renamed from: s  reason: collision with root package name */
    public t0 f955s;

    /* renamed from: t  reason: collision with root package name */
    public t0 f956t;

    /* renamed from: u  reason: collision with root package name */
    public C0235d f957u;

    /* renamed from: v  reason: collision with root package name */
    public OverScroller f958v;

    /* renamed from: w  reason: collision with root package name */
    public ViewPropertyAnimator f959w;

    /* renamed from: x  reason: collision with root package name */
    public final m f960x;

    /* renamed from: y  reason: collision with root package name */
    public final C0232c f961y;

    /* renamed from: z  reason: collision with root package name */
    public final C0232c f962z;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, I.o] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        t0 t0Var = t0.b;
        this.f953q = t0Var;
        this.f954r = t0Var;
        this.f955s = t0Var;
        this.f956t = t0Var;
        this.f960x = new m(4, (Object) this);
        this.f961y = new C0232c(this, 0);
        this.f962z = new C0232c(this, 1);
        i(context);
        this.f938A = new Object();
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        int i2;
        C0238e eVar = (C0238e) view.getLayoutParams();
        int i3 = eVar.leftMargin;
        int i4 = rect.left;
        if (i3 != i4) {
            eVar.leftMargin = i4;
            z3 = true;
        } else {
            z3 = false;
        }
        int i5 = eVar.topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            eVar.topMargin = i6;
            z3 = true;
        }
        int i7 = eVar.rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            eVar.rightMargin = i8;
            z3 = true;
        }
        if (!z2 || eVar.bottomMargin == (i2 = rect.bottom)) {
            return z3;
        }
        eVar.bottomMargin = i2;
        return true;
    }

    public final void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public final void b(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void c(View view, int i2, int i3, int[] iArr, int i4) {
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0238e;
    }

    public final void d(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        e(view, i2, i3, i4, i5, i6);
    }

    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f != null && !this.f943g) {
            if (this.f941d.getVisibility() == 0) {
                i2 = (int) (this.f941d.getTranslationY() + ((float) this.f941d.getBottom()) + 0.5f);
            } else {
                i2 = 0;
            }
            this.f.setBounds(0, i2, getWidth(), this.f.getIntrinsicHeight() + i2);
            this.f.draw(canvas);
        }
    }

    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public final boolean f(View view, View view2, int i2, int i3) {
        if (i3 != 0 || !onStartNestedScroll(view, view2, i2)) {
            return false;
        }
        return true;
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f941d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        C0023o oVar = this.f938A;
        return oVar.b | oVar.f456a;
    }

    public CharSequence getTitle() {
        k();
        return ((w1) this.f942e).f3579a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f961y);
        removeCallbacks(this.f962z);
        ViewPropertyAnimator viewPropertyAnimator = this.f959w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        boolean z2;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f937B);
        boolean z3 = false;
        this.f939a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        if (drawable == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z3 = true;
        }
        this.f943g = z3;
        this.f958v = new OverScroller(context);
    }

    public final void j(int i2) {
        k();
        if (i2 == 2) {
            ((w1) this.f942e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 5) {
            ((w1) this.f942e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public final void k() {
        C0266s0 s0Var;
        if (this.f940c == null) {
            this.f940c = (ContentFrameLayout) findViewById(R.id.MT_Bin);
            this.f941d = (ActionBarContainer) findViewById(R.id.MT_Bin);
            View findViewById = findViewById(R.id.MT_Bin);
            if (findViewById instanceof C0266s0) {
                s0Var = (C0266s0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                s0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f942e = s0Var;
        }
    }

    public final void l(C0209m mVar, y yVar) {
        k();
        w1 w1Var = (w1) this.f942e;
        C0248j jVar = w1Var.f3589m;
        Toolbar toolbar = w1Var.f3579a;
        if (jVar == null) {
            w1Var.f3589m = new C0248j(toolbar.getContext());
        }
        C0248j jVar2 = w1Var.f3589m;
        jVar2.f3478e = yVar;
        if (mVar != null || toolbar.f1041a != null) {
            toolbar.f();
            C0209m mVar2 = toolbar.f1041a.f963p;
            if (mVar2 != mVar) {
                if (mVar2 != null) {
                    mVar2.r(toolbar.f1034K);
                    mVar2.r(toolbar.f1035L);
                }
                if (toolbar.f1035L == null) {
                    toolbar.f1035L = new r1(toolbar);
                }
                jVar2.f3489q = true;
                if (mVar != null) {
                    mVar.b(jVar2, toolbar.f1048j);
                    mVar.b(toolbar.f1035L, toolbar.f1048j);
                } else {
                    jVar2.c(toolbar.f1048j, (C0209m) null);
                    toolbar.f1035L.c(toolbar.f1048j, (C0209m) null);
                    jVar2.g();
                    toolbar.f1035L.g();
                }
                toolbar.f1041a.setPopupTheme(toolbar.f1049k);
                toolbar.f1041a.setPresenter(jVar2);
                toolbar.f1034K = jVar2;
                toolbar.u();
            }
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        t0 g2 = t0.g(this, windowInsets);
        boolean g3 = g(this.f941d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = O.f393a;
        Rect rect = this.f950n;
        D.b(this, g2, rect);
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        r0 r0Var = g2.f464a;
        t0 l2 = r0Var.l(i2, i3, i4, i5);
        this.f953q = l2;
        boolean z2 = true;
        if (!this.f954r.equals(l2)) {
            this.f954r = this.f953q;
            g3 = true;
        }
        Rect rect2 = this.f951o;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z2 = g3;
        }
        if (z2) {
            requestLayout();
        }
        return r0Var.a().f464a.c().f464a.b().f();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = O.f393a;
        B.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0238e eVar = (C0238e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = eVar.leftMargin + paddingLeft;
                int i8 = eVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    public final void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        l0 l0Var;
        k();
        int i5 = i2;
        int i6 = i3;
        measureChildWithMargins(this.f941d, i5, 0, i6, 0);
        C0238e eVar = (C0238e) this.f941d.getLayoutParams();
        int max = Math.max(0, this.f941d.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f941d.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f941d.getMeasuredState());
        WeakHashMap weakHashMap = O.f393a;
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i4 = this.f939a;
            if (this.f945i && this.f941d.getTabContainer() != null) {
                i4 += this.f939a;
            }
        } else {
            i4 = this.f941d.getVisibility() != 8 ? this.f941d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f950n;
        Rect rect2 = this.f952p;
        rect2.set(rect);
        t0 t0Var = this.f953q;
        this.f955s = t0Var;
        if (this.f944h || z2) {
            d b2 = d.b(t0Var.b(), this.f955s.d() + i4, this.f955s.c(), this.f955s.a());
            t0 t0Var2 = this.f955s;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                l0Var = new k0(t0Var2);
            } else if (i7 >= 29) {
                l0Var = new j0(t0Var2);
            } else {
                l0Var = new i0(t0Var2);
            }
            l0Var.g(b2);
            this.f955s = l0Var.b();
        } else {
            rect2.top += i4;
            rect2.bottom = rect2.bottom;
            this.f955s = t0Var.f464a.l(0, i4, 0, 0);
        }
        g(this.f940c, rect2, true);
        if (!this.f956t.equals(this.f955s)) {
            t0 t0Var3 = this.f955s;
            this.f956t = t0Var3;
            ContentFrameLayout contentFrameLayout = this.f940c;
            WindowInsets f2 = t0Var3.f();
            if (f2 != null) {
                WindowInsets a2 = B.a(contentFrameLayout, f2);
                if (!a2.equals(f2)) {
                    t0.g(contentFrameLayout, a2);
                }
            }
        }
        measureChildWithMargins(this.f940c, i5, 0, i6, 0);
        C0238e eVar2 = (C0238e) this.f940c.getLayoutParams();
        int max3 = Math.max(max, this.f940c.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f940c.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f940c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i5, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i6, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f946j || !z2) {
            return false;
        }
        this.f958v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f958v.getFinalY() > this.f941d.getHeight()) {
            h();
            this.f962z.run();
        } else {
            h();
            this.f961y.run();
        }
        this.f947k = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f948l + i3;
        this.f948l = i6;
        setActionBarHideOffset(i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (e.C0129K) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            I.o r1 = r0.f938A
            r1.f456a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f948l = r1
            r0.h()
            k.d r1 = r0.f957u
            if (r1 == 0) goto L_0x001d
            e.K r1 = (e.C0129K) r1
            i.k r2 = r1.D
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.D = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f941d.getVisibility() != 0) {
            return false;
        }
        return this.f946j;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f946j && !this.f947k) {
            if (this.f948l <= this.f941d.getHeight()) {
                h();
                postDelayed(this.f961y, 600);
                return;
            }
            h();
            postDelayed(this.f962z, 600);
        }
    }

    public final void onWindowSystemUiVisibilityChanged(int i2) {
        boolean z2;
        boolean z3;
        super.onWindowSystemUiVisibilityChanged(i2);
        k();
        int i3 = this.f949m ^ i2;
        this.f949m = i2;
        if ((i2 & 4) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 256) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0235d dVar = this.f957u;
        if (dVar != null) {
            C0129K k2 = (C0129K) dVar;
            k2.f2472z = !z3;
            if (z2 || !z3) {
                if (k2.f2450A) {
                    k2.f2450A = false;
                    k2.k0(true);
                }
            } else if (!k2.f2450A) {
                k2.f2450A = true;
                k2.k0(true);
            }
        }
        if ((i3 & 256) != 0 && this.f957u != null) {
            WeakHashMap weakHashMap = O.f393a;
            B.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.b = i2;
        C0235d dVar = this.f957u;
        if (dVar != null) {
            ((C0129K) dVar).f2471y = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f941d.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f941d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0235d dVar) {
        this.f957u = dVar;
        if (getWindowToken() != null) {
            ((C0129K) this.f957u).f2471y = this.b;
            int i2 = this.f949m;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = O.f393a;
                B.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f945i = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f946j) {
            this.f946j = z2;
            if (!z2) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        k();
        w1 w1Var = (w1) this.f942e;
        w1Var.f3581d = i2 != 0 ? l.v(w1Var.f3579a.getContext(), i2) : null;
        w1Var.c();
    }

    public void setLogo(int i2) {
        Drawable drawable;
        k();
        w1 w1Var = (w1) this.f942e;
        if (i2 != 0) {
            drawable = l.v(w1Var.f3579a.getContext(), i2);
        } else {
            drawable = null;
        }
        w1Var.f3582e = drawable;
        w1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        boolean z3;
        this.f944h = z2;
        if (!z2 || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f943g = z3;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((w1) this.f942e).f3587k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        w1 w1Var = (w1) this.f942e;
        if (!w1Var.f3583g) {
            w1Var.f3584h = charSequence;
            if ((w1Var.b & 8) != 0) {
                Toolbar toolbar = w1Var.f3579a;
                toolbar.setTitle(charSequence);
                if (w1Var.f3583g) {
                    O.q(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        w1 w1Var = (w1) this.f942e;
        w1Var.f3581d = drawable;
        w1Var.c();
    }
}
