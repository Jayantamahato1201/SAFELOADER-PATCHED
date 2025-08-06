package e;

import A.j;
import F.c;
import H0.C0008i;
import I.B;
import I.D;
import I.O;
import I.V;
import Q0.l;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.cheatbox.R;
import d.a;
import i.C0185j;
import i.C0186k;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0235d;
import k.C0266s0;
import k.X0;
import k.w1;

/* renamed from: e.K  reason: case insensitive filesystem */
public final class C0129K extends l implements C0235d {

    /* renamed from: J  reason: collision with root package name */
    public static final AccelerateInterpolator f2448J = new AccelerateInterpolator();

    /* renamed from: K  reason: collision with root package name */
    public static final DecelerateInterpolator f2449K = new DecelerateInterpolator();

    /* renamed from: A  reason: collision with root package name */
    public boolean f2450A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f2451B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f2452C = true;
    public C0186k D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f2453E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f2454F;

    /* renamed from: G  reason: collision with root package name */
    public final C0127I f2455G = new C0127I(this, 0);

    /* renamed from: H  reason: collision with root package name */
    public final C0127I f2456H = new C0127I(this, 1);

    /* renamed from: I  reason: collision with root package name */
    public final j f2457I = new j(24, (Object) this);

    /* renamed from: l  reason: collision with root package name */
    public Context f2458l;

    /* renamed from: m  reason: collision with root package name */
    public Context f2459m;

    /* renamed from: n  reason: collision with root package name */
    public ActionBarOverlayLayout f2460n;

    /* renamed from: o  reason: collision with root package name */
    public ActionBarContainer f2461o;

    /* renamed from: p  reason: collision with root package name */
    public C0266s0 f2462p;

    /* renamed from: q  reason: collision with root package name */
    public ActionBarContextView f2463q;

    /* renamed from: r  reason: collision with root package name */
    public final View f2464r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2465s;

    /* renamed from: t  reason: collision with root package name */
    public C0128J f2466t;

    /* renamed from: u  reason: collision with root package name */
    public C0128J f2467u;

    /* renamed from: v  reason: collision with root package name */
    public c f2468v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2469w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f2470x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public int f2471y = 0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2472z = true;

    public C0129K(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        h0(decorView);
        if (!z2) {
            this.f2464r = decorView.findViewById(16908290);
        }
    }

    public final void f0(boolean z2) {
        V v2;
        V v3;
        long j2;
        if (z2) {
            if (!this.f2451B) {
                this.f2451B = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2460n;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                k0(false);
            }
        } else if (this.f2451B) {
            this.f2451B = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2460n;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            k0(false);
        }
        ActionBarContainer actionBarContainer = this.f2461o;
        WeakHashMap weakHashMap = O.f393a;
        if (actionBarContainer.isLaidOut()) {
            if (z2) {
                w1 w1Var = (w1) this.f2462p;
                v3 = O.a(w1Var.f3579a);
                v3.a(0.0f);
                v3.c(100);
                v3.d(new C0185j(w1Var, 4));
                v2 = this.f2463q.i(0, 200);
            } else {
                w1 w1Var2 = (w1) this.f2462p;
                V a2 = O.a(w1Var2.f3579a);
                a2.a(1.0f);
                a2.c(200);
                a2.d(new C0185j(w1Var2, 0));
                V v4 = a2;
                v3 = this.f2463q.i(8, 100);
                v2 = v4;
            }
            C0186k kVar = new C0186k();
            ArrayList arrayList = kVar.f2974a;
            arrayList.add(v3);
            View view = (View) v3.f399a.get();
            if (view != null) {
                j2 = view.animate().getDuration();
            } else {
                j2 = 0;
            }
            View view2 = (View) v2.f399a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j2);
            }
            arrayList.add(v2);
            kVar.b();
        } else if (z2) {
            ((w1) this.f2462p).f3579a.setVisibility(4);
            this.f2463q.setVisibility(0);
        } else {
            ((w1) this.f2462p).f3579a.setVisibility(0);
            this.f2463q.setVisibility(8);
        }
    }

    public final Context g0() {
        if (this.f2459m == null) {
            TypedValue typedValue = new TypedValue();
            this.f2458l.getTheme().resolveAttribute(R.attr.MT_Bin, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f2459m = new ContextThemeWrapper(this.f2458l, i2);
            } else {
                this.f2459m = this.f2458l;
            }
        }
        return this.f2459m;
    }

    public final void h0(View view) {
        C0266s0 s0Var;
        boolean z2;
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.MT_Bin);
        this.f2460n = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.MT_Bin);
        if (findViewById instanceof C0266s0) {
            s0Var = (C0266s0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            s0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f2462p = s0Var;
        this.f2463q = (ActionBarContextView) view.findViewById(R.id.MT_Bin);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.MT_Bin);
        this.f2461o = actionBarContainer;
        C0266s0 s0Var2 = this.f2462p;
        if (s0Var2 == null || this.f2463q == null || actionBarContainer == null) {
            throw new IllegalStateException(C0129K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((w1) s0Var2).f3579a.getContext();
        this.f2458l = context;
        if ((((w1) this.f2462p).b & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f2465s = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f2462p.getClass();
        j0(context.getResources().getBoolean(R.bool.MT_Bin));
        TypedArray obtainStyledAttributes = this.f2458l.obtainStyledAttributes((AttributeSet) null, a.f2193a, R.attr.MT_Bin, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2460n;
            if (actionBarOverlayLayout2.f944h) {
                this.f2454F = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2461o;
            WeakHashMap weakHashMap = O.f393a;
            D.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void i0(boolean z2) {
        int i2;
        if (!this.f2465s) {
            if (z2) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            w1 w1Var = (w1) this.f2462p;
            int i3 = w1Var.b;
            this.f2465s = true;
            w1Var.a((i2 & 4) | (i3 & -5));
        }
    }

    public final void j0(boolean z2) {
        if (!z2) {
            ((w1) this.f2462p).getClass();
            this.f2461o.setTabContainer((X0) null);
        } else {
            this.f2461o.setTabContainer((X0) null);
            ((w1) this.f2462p).getClass();
        }
        this.f2462p.getClass();
        ((w1) this.f2462p).f3579a.setCollapsible(false);
        this.f2460n.setHasNonEmbeddedTabs(false);
    }

    public final void k0(boolean z2) {
        boolean z3;
        boolean z4 = this.f2450A;
        if (!this.f2451B && z4) {
            z3 = false;
        } else {
            z3 = true;
        }
        View view = this.f2464r;
        C0008i iVar = null;
        j jVar = this.f2457I;
        if (z3) {
            if (!this.f2452C) {
                this.f2452C = true;
                C0186k kVar = this.D;
                if (kVar != null) {
                    kVar.a();
                }
                this.f2461o.setVisibility(0);
                int i2 = this.f2471y;
                C0127I i3 = this.f2456H;
                if (i2 != 0 || (!this.f2453E && !z2)) {
                    this.f2461o.setAlpha(1.0f);
                    this.f2461o.setTranslationY(0.0f);
                    if (this.f2472z && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    i3.a();
                } else {
                    this.f2461o.setTranslationY(0.0f);
                    float f = (float) (-this.f2461o.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.f2461o.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f2461o.setTranslationY(f);
                    C0186k kVar2 = new C0186k();
                    V a2 = O.a(this.f2461o);
                    a2.e(0.0f);
                    View view2 = (View) a2.f399a.get();
                    if (view2 != null) {
                        if (jVar != null) {
                            iVar = new C0008i(jVar, view2);
                        }
                        view2.animate().setUpdateListener(iVar);
                    }
                    boolean z5 = kVar2.f2977e;
                    ArrayList arrayList = kVar2.f2974a;
                    if (!z5) {
                        arrayList.add(a2);
                    }
                    if (this.f2472z && view != null) {
                        view.setTranslationY(f);
                        V a3 = O.a(view);
                        a3.e(0.0f);
                        if (!kVar2.f2977e) {
                            arrayList.add(a3);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f2449K;
                    boolean z6 = kVar2.f2977e;
                    if (!z6) {
                        kVar2.f2975c = decelerateInterpolator;
                    }
                    if (!z6) {
                        kVar2.b = 250;
                    }
                    if (!z6) {
                        kVar2.f2976d = i3;
                    }
                    this.D = kVar2;
                    kVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2460n;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = O.f393a;
                    B.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f2452C) {
            this.f2452C = false;
            C0186k kVar3 = this.D;
            if (kVar3 != null) {
                kVar3.a();
            }
            int i4 = this.f2471y;
            C0127I i5 = this.f2455G;
            if (i4 != 0 || (!this.f2453E && !z2)) {
                i5.a();
                return;
            }
            this.f2461o.setAlpha(1.0f);
            this.f2461o.setTransitioning(true);
            C0186k kVar4 = new C0186k();
            float f2 = (float) (-this.f2461o.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.f2461o.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            V a4 = O.a(this.f2461o);
            a4.e(f2);
            View view3 = (View) a4.f399a.get();
            if (view3 != null) {
                if (jVar != null) {
                    iVar = new C0008i(jVar, view3);
                }
                view3.animate().setUpdateListener(iVar);
            }
            boolean z7 = kVar4.f2977e;
            ArrayList arrayList2 = kVar4.f2974a;
            if (!z7) {
                arrayList2.add(a4);
            }
            if (this.f2472z && view != null) {
                V a5 = O.a(view);
                a5.e(f2);
                if (!kVar4.f2977e) {
                    arrayList2.add(a5);
                }
            }
            AccelerateInterpolator accelerateInterpolator = f2448J;
            boolean z8 = kVar4.f2977e;
            if (!z8) {
                kVar4.f2975c = accelerateInterpolator;
            }
            if (!z8) {
                kVar4.b = 250;
            }
            if (!z8) {
                kVar4.f2976d = i5;
            }
            this.D = kVar4;
            kVar4.b();
        }
    }

    public C0129K(Dialog dialog) {
        new ArrayList();
        h0(dialog.getWindow().getDecorView());
    }
}
