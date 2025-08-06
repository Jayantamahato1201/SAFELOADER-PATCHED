package e;

import E.g;
import E.i;
import I.D;
import I.O;
import I.V;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0049f;
import com.cheatbox.R;
import d.a;
import i.C0176a;
import i.C0179d;
import i.C0184i;
import j.C0207k;
import j.C0209m;
import j.C0211o;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0240f;
import k.C0248j;
import k.C0264r0;
import k.C0266s0;
import k.C0267t;
import k.D1;
import k.r1;
import k.w1;
import n.k;
import t0.C0486a;

public final class x extends C0141l implements C0207k, LayoutInflater.Factory2 {

    /* renamed from: h0  reason: collision with root package name */
    public static final k f2556h0 = new k();

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f2557i0 = {16842836};

    /* renamed from: j0  reason: collision with root package name */
    public static final boolean f2558j0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: k0  reason: collision with root package name */
    public static final boolean f2559k0 = true;

    /* renamed from: A  reason: collision with root package name */
    public ViewGroup f2560A;

    /* renamed from: B  reason: collision with root package name */
    public TextView f2561B;

    /* renamed from: C  reason: collision with root package name */
    public View f2562C;
    public boolean D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f2563E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f2564F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f2565G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f2566H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f2567I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f2568J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f2569K;

    /* renamed from: L  reason: collision with root package name */
    public w[] f2570L;

    /* renamed from: M  reason: collision with root package name */
    public w f2571M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f2572N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f2573O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f2574P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f2575Q;

    /* renamed from: R  reason: collision with root package name */
    public Configuration f2576R;

    /* renamed from: S  reason: collision with root package name */
    public final int f2577S = -100;

    /* renamed from: T  reason: collision with root package name */
    public int f2578T;

    /* renamed from: U  reason: collision with root package name */
    public int f2579U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f2580V;

    /* renamed from: W  reason: collision with root package name */
    public u f2581W;

    /* renamed from: X  reason: collision with root package name */
    public u f2582X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f2583Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f2584Z;

    /* renamed from: a0  reason: collision with root package name */
    public final m f2585a0 = new m(this, 0);

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2586b0;

    /* renamed from: c0  reason: collision with root package name */
    public Rect f2587c0;

    /* renamed from: d0  reason: collision with root package name */
    public Rect f2588d0;
    public C0119A e0;

    /* renamed from: f0  reason: collision with root package name */
    public OnBackInvokedDispatcher f2589f0;

    /* renamed from: g0  reason: collision with root package name */
    public OnBackInvokedCallback f2590g0;

    /* renamed from: j  reason: collision with root package name */
    public final Object f2591j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f2592k;

    /* renamed from: l  reason: collision with root package name */
    public Window f2593l;

    /* renamed from: m  reason: collision with root package name */
    public t f2594m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f2595n;

    /* renamed from: o  reason: collision with root package name */
    public C0129K f2596o;

    /* renamed from: p  reason: collision with root package name */
    public C0184i f2597p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f2598q;

    /* renamed from: r  reason: collision with root package name */
    public C0264r0 f2599r;

    /* renamed from: s  reason: collision with root package name */
    public n f2600s;

    /* renamed from: t  reason: collision with root package name */
    public n f2601t;

    /* renamed from: u  reason: collision with root package name */
    public C0176a f2602u;

    /* renamed from: v  reason: collision with root package name */
    public ActionBarContextView f2603v;

    /* renamed from: w  reason: collision with root package name */
    public PopupWindow f2604w;

    /* renamed from: x  reason: collision with root package name */
    public m f2605x;

    /* renamed from: y  reason: collision with root package name */
    public V f2606y = null;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2607z;

    public x(Context context, Window window, C0138i iVar, Object obj) {
        C0137h hVar;
        this.f2592k = context;
        this.f2595n = iVar;
        this.f2591j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof C0137h)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        hVar = (C0137h) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            hVar = null;
            if (hVar != null) {
                this.f2577S = ((x) hVar.i()).f2577S;
            }
        }
        if (this.f2577S == -100) {
            k kVar = f2556h0;
            Integer num = (Integer) kVar.getOrDefault(this.f2591j.getClass().getName(), (Object) null);
            if (num != null) {
                this.f2577S = num.intValue();
                kVar.remove(this.f2591j.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        C0267t.d();
    }

    public static g p(Context context) {
        g gVar;
        g gVar2;
        Locale locale;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 || (gVar = C0141l.f2524c) == null) {
            return null;
        }
        g z2 = z(context.getApplicationContext().getResources().getConfiguration());
        i iVar = gVar.f89a;
        int i3 = 0;
        if (i2 >= 24) {
            if (iVar.isEmpty()) {
                gVar2 = g.b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (true) {
                    if (i3 >= z2.f89a.size() + iVar.size()) {
                        break;
                    }
                    if (i3 < iVar.size()) {
                        locale = iVar.get(i3);
                    } else {
                        locale = z2.f89a.get(i3 - iVar.size());
                    }
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                    i3++;
                }
                gVar2 = g.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (iVar.isEmpty()) {
            gVar2 = g.b;
        } else {
            gVar2 = g.b(iVar.get(0).toString());
        }
        if (gVar2.f89a.isEmpty()) {
            return z2;
        }
        return gVar2;
    }

    public static Configuration t(Context context, int i2, g gVar, Configuration configuration, boolean z2) {
        int i3;
        if (i2 == 1) {
            i3 = 16;
        } else if (i2 == 2) {
            i3 = 32;
        } else if (z2) {
            i3 = 0;
        } else {
            i3 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        if (gVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                r.d(configuration2, gVar);
                return configuration2;
            }
            i iVar = gVar.f89a;
            p.b(configuration2, iVar.get(0));
            p.a(configuration2, iVar.get(0));
        }
        return configuration2;
    }

    public static g z(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return r.b(configuration);
        }
        return g.b(q.a(configuration.locale));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: e.w[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: e.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: e.w[]} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, e.w] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.w A(int r5) {
        /*
            r4 = this;
            e.w[] r0 = r4.f2570L
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.length
            if (r2 > r5) goto L_0x0015
        L_0x0008:
            int r2 = r5 + 1
            e.w[] r2 = new e.w[r2]
            if (r0 == 0) goto L_0x0012
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L_0x0012:
            r4.f2570L = r2
            r0 = r2
        L_0x0015:
            r2 = r0[r5]
            if (r2 != 0) goto L_0x0024
            e.w r2 = new e.w
            r2.<init>()
            r2.f2542a = r5
            r2.f2553n = r1
            r0[r5] = r2
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.x.A(int):e.w");
    }

    public final void B() {
        w();
        if (this.f2564F && this.f2596o == null) {
            Object obj = this.f2591j;
            if (obj instanceof Activity) {
                this.f2596o = new C0129K((Activity) obj, this.f2565G);
            } else if (obj instanceof Dialog) {
                this.f2596o = new C0129K((Dialog) obj);
            }
            C0129K k2 = this.f2596o;
            if (k2 != null) {
                k2.i0(this.f2586b0);
            }
        }
    }

    public final void C(int i2) {
        this.f2584Z = (1 << i2) | this.f2584Z;
        if (!this.f2583Y) {
            View decorView = this.f2593l.getDecorView();
            m mVar = this.f2585a0;
            WeakHashMap weakHashMap = O.f393a;
            decorView.postOnAnimation(mVar);
            this.f2583Y = true;
        }
    }

    public final int D(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (!(i2 == 1 || i2 == 2)) {
                        if (i2 == 3) {
                            if (this.f2582X == null) {
                                this.f2582X = new u(this, context);
                            }
                            return this.f2582X.f();
                        }
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return y(context).f();
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean E() {
        C0266s0 s0Var;
        r1 r1Var;
        C0211o oVar;
        boolean z2 = this.f2572N;
        this.f2572N = false;
        w A2 = A(0);
        if (!A2.f2552m) {
            C0176a aVar = this.f2602u;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            B();
            C0129K k2 = this.f2596o;
            if (k2 == null || (s0Var = k2.f2462p) == null || (r1Var = ((w1) s0Var).f3579a.f1035L) == null || r1Var.b == null) {
                return false;
            }
            r1 r1Var2 = ((w1) s0Var).f3579a.f1035L;
            if (r1Var2 == null) {
                oVar = null;
            } else {
                oVar = r1Var2.b;
            }
            if (oVar != null) {
                oVar.collapseActionView();
            }
        } else if (!z2) {
            s(A2, true);
            return true;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0156, code lost:
        if (r3 != null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0176, code lost:
        if (r3.f.getCount() > 0) goto L_0x0178;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(e.w r18, android.view.KeyEvent r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.f2552m
            if (r2 != 0) goto L_0x01d9
            boolean r2 = r0.f2575Q
            if (r2 == 0) goto L_0x000e
            goto L_0x01d9
        L_0x000e:
            int r2 = r1.f2542a
            android.content.Context r3 = r0.f2592k
            if (r2 != 0) goto L_0x0025
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L_0x0025
            goto L_0x01d9
        L_0x0025:
            android.view.Window r4 = r0.f2593l
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L_0x003a
            j.m r6 = r1.f2547h
            boolean r4 = r4.onMenuOpened(r2, r6)
            if (r4 != 0) goto L_0x003a
            r0.s(r1, r5)
            return
        L_0x003a:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L_0x0046
            goto L_0x01d9
        L_0x0046:
            boolean r6 = r17.H(r18, r19)
            if (r6 != 0) goto L_0x004e
            goto L_0x01d9
        L_0x004e:
            e.v r6 = r1.f2545e
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L_0x006b
            boolean r9 = r1.f2553n
            if (r9 == 0) goto L_0x0059
            goto L_0x006b
        L_0x0059:
            android.view.View r3 = r1.f2546g
            if (r3 == 0) goto L_0x01b1
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x01b1
            int r3 = r3.width
            r6 = -1
            if (r3 != r6) goto L_0x01b1
            r10 = -1
            goto L_0x01b2
        L_0x006b:
            if (r6 != 0) goto L_0x00e6
            r0.B()
            e.K r6 = r0.f2596o
            if (r6 == 0) goto L_0x0079
            android.content.Context r6 = r6.g0()
            goto L_0x007a
        L_0x0079:
            r6 = 0
        L_0x007a:
            if (r6 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r3 = r6
        L_0x007e:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r3.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r3.getTheme()
            r9.setTo(r10)
            r10 = 2130903042(0x7f030002, float:1.741289E38)
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L_0x009f
            r9.applyStyle(r10, r5)
        L_0x009f:
            r10 = 2130903863(0x7f030337, float:1.7414556E38)
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto L_0x00ad
            r9.applyStyle(r6, r5)
            goto L_0x00b3
        L_0x00ad:
            r6 = 2131755532(0x7f10020c, float:1.9141946E38)
            r9.applyStyle(r6, r5)
        L_0x00b3:
            i.d r6 = new i.d
            r6.<init>(r3, r7)
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.setTo(r9)
            r1.f2549j = r6
            int[] r3 = d.a.f2200j
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r3)
            r6 = 86
            int r6 = r3.getResourceId(r6, r7)
            r1.b = r6
            int r6 = r3.getResourceId(r5, r7)
            r1.f2544d = r6
            r3.recycle()
            e.v r3 = new e.v
            i.d r6 = r1.f2549j
            r3.<init>(r0, r6)
            r1.f2545e = r3
            r3 = 81
            r1.f2543c = r3
            goto L_0x00f5
        L_0x00e6:
            boolean r3 = r1.f2553n
            if (r3 == 0) goto L_0x00f5
            int r3 = r6.getChildCount()
            if (r3 <= 0) goto L_0x00f5
            e.v r3 = r1.f2545e
            r3.removeAllViews()
        L_0x00f5:
            android.view.View r3 = r1.f2546g
            if (r3 == 0) goto L_0x00fc
            r1.f = r3
            goto L_0x0158
        L_0x00fc:
            j.m r3 = r1.f2547h
            if (r3 != 0) goto L_0x0102
            goto L_0x01d7
        L_0x0102:
            e.n r3 = r0.f2601t
            if (r3 != 0) goto L_0x010e
            e.n r3 = new e.n
            r6 = 3
            r3.<init>(r0, r6)
            r0.f2601t = r3
        L_0x010e:
            e.n r3 = r0.f2601t
            j.i r6 = r1.f2548i
            if (r6 != 0) goto L_0x0126
            j.i r6 = new j.i
            i.d r9 = r1.f2549j
            r6.<init>(r9)
            r1.f2548i = r6
            r6.f3098e = r3
            j.m r3 = r1.f2547h
            android.content.Context r9 = r3.f3104a
            r3.b(r6, r9)
        L_0x0126:
            j.i r3 = r1.f2548i
            e.v r6 = r1.f2545e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r3.f3097d
            if (r9 != 0) goto L_0x0152
            android.view.LayoutInflater r9 = r3.b
            r10 = 2131427341(0x7f0b000d, float:1.8476296E38)
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r3.f3097d = r6
            j.h r6 = r3.f
            if (r6 != 0) goto L_0x0146
            j.h r6 = new j.h
            r6.<init>(r3)
            r3.f = r6
        L_0x0146:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.f3097d
            j.h r9 = r3.f
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.f3097d
            r6.setOnItemClickListener(r3)
        L_0x0152:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r3.f3097d
            r1.f = r3
            if (r3 == 0) goto L_0x01d7
        L_0x0158:
            android.view.View r3 = r1.f
            if (r3 != 0) goto L_0x015e
            goto L_0x01d7
        L_0x015e:
            android.view.View r3 = r1.f2546g
            if (r3 == 0) goto L_0x0163
            goto L_0x0178
        L_0x0163:
            j.i r3 = r1.f2548i
            j.h r6 = r3.f
            if (r6 != 0) goto L_0x0170
            j.h r6 = new j.h
            r6.<init>(r3)
            r3.f = r6
        L_0x0170:
            j.h r3 = r3.f
            int r3 = r3.getCount()
            if (r3 <= 0) goto L_0x01d7
        L_0x0178:
            android.view.View r3 = r1.f
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x0185
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r8, r8)
        L_0x0185:
            int r6 = r1.b
            e.v r9 = r1.f2545e
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x019d
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f
            r6.removeView(r9)
        L_0x019d:
            e.v r6 = r1.f2545e
            android.view.View r9 = r1.f
            r6.addView(r9, r3)
            android.view.View r3 = r1.f
            boolean r3 = r3.hasFocus()
            if (r3 != 0) goto L_0x01b1
            android.view.View r3 = r1.f
            r3.requestFocus()
        L_0x01b1:
            r10 = -2
        L_0x01b2:
            r1.f2551l = r7
            android.view.WindowManager$LayoutParams r9 = new android.view.WindowManager$LayoutParams
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r11 = -2
            r12 = 0
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r3 = r1.f2543c
            r9.gravity = r3
            int r3 = r1.f2544d
            r9.windowAnimations = r3
            e.v r3 = r1.f2545e
            r4.addView(r3, r9)
            r1.f2552m = r5
            if (r2 != 0) goto L_0x01d9
            r0.J()
            return
        L_0x01d7:
            r1.f2553n = r5
        L_0x01d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.x.F(e.w, android.view.KeyEvent):void");
    }

    public final boolean G(w wVar, int i2, KeyEvent keyEvent) {
        C0209m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((wVar.f2550k || H(wVar, keyEvent)) && (mVar = wVar.f2547h) != null) {
            return mVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cd, code lost:
        if (r13.f2547h == null) goto L_0x0113;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H(e.w r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r12.f2575Q
            r1 = 0
            if (r0 == 0) goto L_0x0007
            goto L_0x0113
        L_0x0007:
            boolean r0 = r13.f2550k
            r2 = 1
            if (r0 == 0) goto L_0x000d
            return r2
        L_0x000d:
            e.w r0 = r12.f2571M
            if (r0 == 0) goto L_0x0016
            if (r0 == r13) goto L_0x0016
            r12.s(r0, r1)
        L_0x0016:
            android.view.Window r0 = r12.f2593l
            android.view.Window$Callback r0 = r0.getCallback()
            int r3 = r13.f2542a
            if (r0 == 0) goto L_0x0026
            android.view.View r4 = r0.onCreatePanelView(r3)
            r13.f2546g = r4
        L_0x0026:
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == 0) goto L_0x002f
            if (r3 != r4) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r5 = 0
            goto L_0x0030
        L_0x002f:
            r5 = 1
        L_0x0030:
            if (r5 == 0) goto L_0x0041
            k.r0 r6 = r12.f2599r
            if (r6 == 0) goto L_0x0041
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            k.s0 r6 = r6.f942e
            k.w1 r6 = (k.w1) r6
            r6.f3588l = r2
        L_0x0041:
            android.view.View r6 = r13.f2546g
            if (r6 != 0) goto L_0x0162
            j.m r6 = r13.f2547h
            r7 = 0
            if (r6 == 0) goto L_0x004e
            boolean r8 = r13.f2554o
            if (r8 == 0) goto L_0x0116
        L_0x004e:
            if (r6 != 0) goto L_0x00d0
            android.content.Context r6 = r12.f2592k
            if (r3 == 0) goto L_0x0056
            if (r3 != r4) goto L_0x00ad
        L_0x0056:
            k.r0 r4 = r12.f2599r
            if (r4 == 0) goto L_0x00ad
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r8 = r6.getTheme()
            r9 = 2130903049(0x7f030009, float:1.7412905E38)
            r8.resolveAttribute(r9, r4, r2)
            int r9 = r4.resourceId
            r10 = 2130903050(0x7f03000a, float:1.7412907E38)
            if (r9 == 0) goto L_0x0084
            android.content.res.Resources r9 = r6.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            r9.setTo(r8)
            int r11 = r4.resourceId
            r9.applyStyle(r11, r2)
            r9.resolveAttribute(r10, r4, r2)
            goto L_0x0088
        L_0x0084:
            r8.resolveAttribute(r10, r4, r2)
            r9 = r7
        L_0x0088:
            int r10 = r4.resourceId
            if (r10 == 0) goto L_0x009e
            if (r9 != 0) goto L_0x0099
            android.content.res.Resources r9 = r6.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            r9.setTo(r8)
        L_0x0099:
            int r4 = r4.resourceId
            r9.applyStyle(r4, r2)
        L_0x009e:
            if (r9 == 0) goto L_0x00ad
            i.d r4 = new i.d
            r4.<init>(r6, r1)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r9)
            r6 = r4
        L_0x00ad:
            j.m r4 = new j.m
            r4.<init>(r6)
            r4.f3107e = r12
            j.m r6 = r13.f2547h
            if (r4 != r6) goto L_0x00b9
            goto L_0x00cb
        L_0x00b9:
            if (r6 == 0) goto L_0x00c0
            j.i r8 = r13.f2548i
            r6.r(r8)
        L_0x00c0:
            r13.f2547h = r4
            j.i r6 = r13.f2548i
            if (r6 == 0) goto L_0x00cb
            android.content.Context r8 = r4.f3104a
            r4.b(r6, r8)
        L_0x00cb:
            j.m r4 = r13.f2547h
            if (r4 != 0) goto L_0x00d0
            goto L_0x0113
        L_0x00d0:
            if (r5 == 0) goto L_0x00eb
            k.r0 r4 = r12.f2599r
            if (r4 == 0) goto L_0x00eb
            e.n r6 = r12.f2600s
            if (r6 != 0) goto L_0x00e2
            e.n r6 = new e.n
            r8 = 2
            r6.<init>(r12, r8)
            r12.f2600s = r6
        L_0x00e2:
            j.m r6 = r13.f2547h
            e.n r8 = r12.f2600s
            androidx.appcompat.widget.ActionBarOverlayLayout r4 = (androidx.appcompat.widget.ActionBarOverlayLayout) r4
            r4.l(r6, r8)
        L_0x00eb:
            j.m r4 = r13.f2547h
            r4.w()
            j.m r4 = r13.f2547h
            boolean r3 = r0.onCreatePanelMenu(r3, r4)
            if (r3 != 0) goto L_0x0114
            j.m r14 = r13.f2547h
            if (r14 != 0) goto L_0x00fd
            goto L_0x0106
        L_0x00fd:
            if (r14 == 0) goto L_0x0104
            j.i r0 = r13.f2548i
            r14.r(r0)
        L_0x0104:
            r13.f2547h = r7
        L_0x0106:
            if (r5 == 0) goto L_0x0113
            k.r0 r13 = r12.f2599r
            if (r13 == 0) goto L_0x0113
            e.n r14 = r12.f2600s
            androidx.appcompat.widget.ActionBarOverlayLayout r13 = (androidx.appcompat.widget.ActionBarOverlayLayout) r13
            r13.l(r7, r14)
        L_0x0113:
            return r1
        L_0x0114:
            r13.f2554o = r1
        L_0x0116:
            j.m r3 = r13.f2547h
            r3.w()
            android.os.Bundle r3 = r13.f2555p
            if (r3 == 0) goto L_0x0126
            j.m r4 = r13.f2547h
            r4.s(r3)
            r13.f2555p = r7
        L_0x0126:
            android.view.View r3 = r13.f2546g
            j.m r4 = r13.f2547h
            boolean r0 = r0.onPreparePanel(r1, r3, r4)
            if (r0 != 0) goto L_0x0143
            if (r5 == 0) goto L_0x013d
            k.r0 r14 = r12.f2599r
            if (r14 == 0) goto L_0x013d
            e.n r0 = r12.f2600s
            androidx.appcompat.widget.ActionBarOverlayLayout r14 = (androidx.appcompat.widget.ActionBarOverlayLayout) r14
            r14.l(r7, r0)
        L_0x013d:
            j.m r13 = r13.f2547h
            r13.v()
            return r1
        L_0x0143:
            if (r14 == 0) goto L_0x014a
            int r14 = r14.getDeviceId()
            goto L_0x014b
        L_0x014a:
            r14 = -1
        L_0x014b:
            android.view.KeyCharacterMap r14 = android.view.KeyCharacterMap.load(r14)
            int r14 = r14.getKeyboardType()
            if (r14 == r2) goto L_0x0157
            r14 = 1
            goto L_0x0158
        L_0x0157:
            r14 = 0
        L_0x0158:
            j.m r0 = r13.f2547h
            r0.setQwertyMode(r14)
            j.m r14 = r13.f2547h
            r14.v()
        L_0x0162:
            r13.f2550k = r2
            r13.f2551l = r1
            r12.f2571M = r13
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.x.H(e.w, android.view.KeyEvent):boolean");
    }

    public final void I() {
        if (this.f2607z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2589f0 != null && (A(0).f2552m || this.f2602u != null)) {
                z2 = true;
            }
            if (z2 && this.f2590g0 == null) {
                this.f2590g0 = s.b(this.f2589f0, this);
            } else if (!z2 && (onBackInvokedCallback = this.f2590g0) != null) {
                s.c(this.f2589f0, onBackInvokedCallback);
            }
        }
    }

    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2592k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof x)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void b() {
        if (this.f2596o != null) {
            B();
            this.f2596o.getClass();
            C(0);
        }
    }

    public final void d() {
        String str;
        this.f2573O = true;
        n(false, true);
        x();
        Object obj = this.f2591j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                str = C0486a.l(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalArgumentException(e2);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C0129K k2 = this.f2596o;
                if (k2 == null) {
                    this.f2586b0 = true;
                } else {
                    k2.i0(true);
                }
            }
            synchronized (C0141l.f2528h) {
                C0141l.h(this);
                C0141l.f2527g.add(new WeakReference(this));
            }
        }
        this.f2576R = new Configuration(this.f2592k.getResources().getConfiguration());
        this.f2574P = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r6.j() != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(j.C0209m r6) {
        /*
            r5 = this;
            k.r0 r6 = r5.f2599r
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x00e8
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            k.s0 r6 = r6.f942e
            k.w1 r6 = (k.w1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f3579a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto L_0x00e8
            androidx.appcompat.widget.ActionMenuView r6 = r6.f1041a
            if (r6 == 0) goto L_0x00e8
            boolean r6 = r6.f966s
            if (r6 == 0) goto L_0x00e8
            android.content.Context r6 = r5.f2592k
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L_0x004a
            k.r0 r6 = r5.f2599r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            k.s0 r6 = r6.f942e
            k.w1 r6 = (k.w1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f3579a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f1041a
            if (r6 == 0) goto L_0x00e8
            k.j r6 = r6.f967t
            if (r6 == 0) goto L_0x00e8
            k.h r2 = r6.f3493u
            if (r2 != 0) goto L_0x004a
            boolean r6 = r6.j()
            if (r6 == 0) goto L_0x00e8
        L_0x004a:
            android.view.Window r6 = r5.f2593l
            android.view.Window$Callback r6 = r6.getCallback()
            k.r0 r2 = r5.f2599r
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            k.s0 r2 = r2.f942e
            k.w1 r2 = (k.w1) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f3579a
            androidx.appcompat.widget.ActionMenuView r2 = r2.f1041a
            if (r2 == 0) goto L_0x006d
            k.j r2 = r2.f967t
            if (r2 == 0) goto L_0x006d
            boolean r2 = r2.j()
            if (r2 == 0) goto L_0x006d
            r2 = 1
            goto L_0x006e
        L_0x006d:
            r2 = 0
        L_0x006e:
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L_0x0099
            k.r0 r1 = r5.f2599r
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = (androidx.appcompat.widget.ActionBarOverlayLayout) r1
            r1.k()
            k.s0 r1 = r1.f942e
            k.w1 r1 = (k.w1) r1
            androidx.appcompat.widget.Toolbar r1 = r1.f3579a
            androidx.appcompat.widget.ActionMenuView r1 = r1.f1041a
            if (r1 == 0) goto L_0x008b
            k.j r1 = r1.f967t
            if (r1 == 0) goto L_0x008b
            boolean r1 = r1.f()
        L_0x008b:
            boolean r1 = r5.f2575Q
            if (r1 != 0) goto L_0x00e7
            e.w r0 = r5.A(r0)
            j.m r0 = r0.f2547h
            r6.onPanelClosed(r3, r0)
            return
        L_0x0099:
            if (r6 == 0) goto L_0x00e7
            boolean r2 = r5.f2575Q
            if (r2 != 0) goto L_0x00e7
            boolean r2 = r5.f2583Y
            if (r2 == 0) goto L_0x00b6
            int r2 = r5.f2584Z
            r1 = r1 & r2
            if (r1 == 0) goto L_0x00b6
            android.view.Window r1 = r5.f2593l
            android.view.View r1 = r1.getDecorView()
            e.m r2 = r5.f2585a0
            r1.removeCallbacks(r2)
            r2.run()
        L_0x00b6:
            e.w r1 = r5.A(r0)
            j.m r2 = r1.f2547h
            if (r2 == 0) goto L_0x00e7
            boolean r4 = r1.f2554o
            if (r4 != 0) goto L_0x00e7
            android.view.View r4 = r1.f2546g
            boolean r0 = r6.onPreparePanel(r0, r4, r2)
            if (r0 == 0) goto L_0x00e7
            j.m r0 = r1.f2547h
            r6.onMenuOpened(r3, r0)
            k.r0 r6 = r5.f2599r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            k.s0 r6 = r6.f942e
            k.w1 r6 = (k.w1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f3579a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f1041a
            if (r6 == 0) goto L_0x00e7
            k.j r6 = r6.f967t
            if (r6 == 0) goto L_0x00e7
            r6.l()
        L_0x00e7:
            return
        L_0x00e8:
            e.w r6 = r5.A(r0)
            r6.f2553n = r1
            r5.s(r6, r0)
            r0 = 0
            r5.F(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.x.e(j.m):void");
    }

    public final boolean f(C0209m mVar, MenuItem menuItem) {
        int i2;
        w wVar;
        Window.Callback callback = this.f2593l.getCallback();
        if (callback != null && !this.f2575Q) {
            C0209m k2 = mVar.k();
            w[] wVarArr = this.f2570L;
            if (wVarArr != null) {
                i2 = wVarArr.length;
            } else {
                i2 = 0;
            }
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    wVar = wVarArr[i3];
                    if (wVar != null && wVar.f2547h == k2) {
                        break;
                    }
                    i3++;
                } else {
                    wVar = null;
                    break;
                }
            }
            if (wVar != null) {
                return callback.onMenuItemSelected(wVar.f2542a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2591j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = e.C0141l.f2528h
            monitor-enter(r0)
            e.C0141l.h(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f2583Y
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f2593l
            android.view.View r0 = r0.getDecorView()
            e.m r1 = r3.f2585a0
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.f2575Q = r0
            int r0 = r3.f2577S
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f2591j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            n.k r0 = f2556h0
            java.lang.Object r1 = r3.f2591j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f2577S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            n.k r0 = f2556h0
            java.lang.Object r1 = r3.f2591j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            e.u r0 = r3.f2581W
            if (r0 == 0) goto L_0x0063
            r0.c()
        L_0x0063:
            e.u r0 = r3.f2582X
            if (r0 == 0) goto L_0x006a
            r0.c()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.x.g():void");
    }

    public final boolean i(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f2568J && i2 == 108) {
            return false;
        }
        if (this.f2564F && i2 == 1) {
            this.f2564F = false;
        }
        if (i2 == 1) {
            I();
            this.f2568J = true;
            return true;
        } else if (i2 == 2) {
            I();
            this.D = true;
            return true;
        } else if (i2 == 5) {
            I();
            this.f2563E = true;
            return true;
        } else if (i2 == 10) {
            I();
            this.f2566H = true;
            return true;
        } else if (i2 == 108) {
            I();
            this.f2564F = true;
            return true;
        } else if (i2 != 109) {
            return this.f2593l.requestFeature(i2);
        } else {
            I();
            this.f2565G = true;
            return true;
        }
    }

    public final void j(int i2) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f2560A.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2592k).inflate(i2, viewGroup);
        this.f2594m.a(this.f2593l.getCallback());
    }

    public final void k(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f2560A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2594m.a(this.f2593l.getCallback());
    }

    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f2560A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2594m.a(this.f2593l.getCallback());
    }

    public final void m(CharSequence charSequence) {
        this.f2598q = charSequence;
        C0264r0 r0Var = this.f2599r;
        if (r0Var != null) {
            r0Var.setWindowTitle(charSequence);
            return;
        }
        C0129K k2 = this.f2596o;
        if (k2 != null) {
            w1 w1Var = (w1) k2.f2462p;
            if (!w1Var.f3583g) {
                w1Var.f3584h = charSequence;
                if ((w1Var.b & 8) != 0) {
                    Toolbar toolbar = w1Var.f3579a;
                    toolbar.setTitle(charSequence);
                    if (w1Var.f3583g) {
                        O.q(toolbar.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.f2561B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01c7 A[SYNTHETIC, Splitter:B:134:0x01c7] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01f4 A[SYNTHETIC, Splitter:B:155:0x01f4] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ef A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(boolean r17, boolean r18) {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = r1.f2575Q
            r2 = 0
            if (r0 == 0) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r1.f2577S
            r3 = -100
            if (r0 == r3) goto L_0x0010
        L_0x000e:
            r3 = r0
            goto L_0x0013
        L_0x0010:
            int r0 = e.C0141l.b
            goto L_0x000e
        L_0x0013:
            android.content.Context r4 = r1.f2592k
            int r0 = r1.D(r4, r3)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 33
            r7 = 0
            if (r5 >= r6) goto L_0x0025
            E.g r6 = p(r4)
            goto L_0x0026
        L_0x0025:
            r6 = r7
        L_0x0026:
            if (r18 != 0) goto L_0x0036
            if (r6 == 0) goto L_0x0036
            android.content.res.Resources r6 = r4.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            E.g r6 = z(r6)
        L_0x0036:
            android.content.res.Configuration r8 = t(r4, r0, r6, r7, r2)
            boolean r0 = r1.f2580V
            java.lang.Object r9 = r1.f2591j
            r10 = 24
            r11 = 1
            if (r0 != 0) goto L_0x007a
            boolean r0 = r9 instanceof android.app.Activity
            if (r0 == 0) goto L_0x007a
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            if (r0 != 0) goto L_0x004f
            r0 = 0
            goto L_0x007e
        L_0x004f:
            r12 = 29
            if (r5 < r12) goto L_0x0056
            r5 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x005c
        L_0x0056:
            if (r5 < r10) goto L_0x005b
            r5 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            android.content.ComponentName r12 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0070 }
            java.lang.Class r13 = r9.getClass()     // Catch:{ NameNotFoundException -> 0x0070 }
            r12.<init>(r4, r13)     // Catch:{ NameNotFoundException -> 0x0070 }
            android.content.pm.ActivityInfo r0 = r0.getActivityInfo(r12, r5)     // Catch:{ NameNotFoundException -> 0x0070 }
            if (r0 == 0) goto L_0x007a
            int r0 = r0.configChanges     // Catch:{ NameNotFoundException -> 0x0070 }
            r1.f2579U = r0     // Catch:{ NameNotFoundException -> 0x0070 }
            goto L_0x007a
        L_0x0070:
            r0 = move-exception
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r12 = "Exception while getting ActivityInfo"
            android.util.Log.d(r5, r12, r0)
            r1.f2579U = r2
        L_0x007a:
            r1.f2580V = r11
            int r0 = r1.f2579U
        L_0x007e:
            android.content.res.Configuration r5 = r1.f2576R
            if (r5 != 0) goto L_0x008a
            android.content.res.Resources r5 = r4.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
        L_0x008a:
            int r12 = r5.uiMode
            r12 = r12 & 48
            int r13 = r8.uiMode
            r13 = r13 & 48
            E.g r5 = z(r5)
            if (r6 != 0) goto L_0x009a
            r6 = r7
            goto L_0x009e
        L_0x009a:
            E.g r6 = z(r8)
        L_0x009e:
            if (r12 == r13) goto L_0x00a3
            r8 = 512(0x200, float:7.175E-43)
            goto L_0x00a4
        L_0x00a3:
            r8 = 0
        L_0x00a4:
            if (r6 == 0) goto L_0x00ae
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x00ae
            r8 = r8 | 8196(0x2004, float:1.1485E-41)
        L_0x00ae:
            int r5 = ~r0
            r5 = r5 & r8
            r12 = 28
            if (r5 == 0) goto L_0x00ec
            if (r17 == 0) goto L_0x00ec
            boolean r5 = r1.f2573O
            if (r5 == 0) goto L_0x00ec
            boolean r5 = f2558j0
            if (r5 != 0) goto L_0x00c2
            boolean r5 = r1.f2574P
            if (r5 == 0) goto L_0x00ec
        L_0x00c2:
            boolean r5 = r9 instanceof android.app.Activity
            if (r5 == 0) goto L_0x00ec
            r5 = r9
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r14 = r5.isChild()
            if (r14 != 0) goto L_0x00ec
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r12) goto L_0x00d7
            r5.recreate()
            goto L_0x00ea
        L_0x00d7:
            android.os.Handler r14 = new android.os.Handler
            android.os.Looper r15 = r5.getMainLooper()
            r14.<init>(r15)
            F0.g r15 = new F0.g
            r11 = 13
            r15.<init>(r11, r5)
            r14.post(r15)
        L_0x00ea:
            r5 = 1
            goto L_0x00ed
        L_0x00ec:
            r5 = 0
        L_0x00ed:
            if (r5 != 0) goto L_0x024c
            if (r8 == 0) goto L_0x024c
            r0 = r0 & r8
            if (r0 != r8) goto L_0x00f6
            r5 = 1
            goto L_0x00f7
        L_0x00f6:
            r5 = 0
        L_0x00f7:
            android.content.res.Resources r11 = r4.getResources()
            android.content.res.Configuration r14 = new android.content.res.Configuration
            android.content.res.Configuration r0 = r11.getConfiguration()
            r14.<init>(r0)
            android.content.res.Configuration r0 = r11.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & -49
            r0 = r0 | r13
            r14.uiMode = r0
            if (r6 == 0) goto L_0x0129
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r10) goto L_0x0119
            e.r.d(r14, r6)
            goto L_0x0129
        L_0x0119:
            E.i r0 = r6.f89a
            java.util.Locale r13 = r0.get(r2)
            e.p.b(r14, r13)
            java.util.Locale r0 = r0.get(r2)
            e.p.a(r14, r0)
        L_0x0129:
            r11.updateConfiguration(r14, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r13 = 26
            r15 = 23
            if (r0 >= r13) goto L_0x0206
            if (r0 < r12) goto L_0x0138
            goto L_0x0206
        L_0x0138:
            java.lang.String r12 = "mDrawableCache"
            java.lang.Class<android.content.res.Resources> r13 = android.content.res.Resources.class
            java.lang.String r7 = "ResourcesFlusher"
            if (r0 < r10) goto L_0x01a5
            boolean r0 = Q0.l.f665h
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r13.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0152 }
            Q0.l.f664g = r0     // Catch:{ NoSuchFieldException -> 0x0152 }
            r13 = 1
            r0.setAccessible(r13)     // Catch:{ NoSuchFieldException -> 0x0152 }
        L_0x0150:
            r13 = 1
            goto L_0x0159
        L_0x0152:
            r0 = move-exception
            java.lang.String r13 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r7, r13, r0)
            goto L_0x0150
        L_0x0159:
            Q0.l.f665h = r13
        L_0x015b:
            java.lang.reflect.Field r0 = Q0.l.f664g
            if (r0 != 0) goto L_0x0161
            goto L_0x0206
        L_0x0161:
            java.lang.Object r0 = r0.get(r11)     // Catch:{ IllegalAccessException -> 0x0167 }
            r11 = r0
            goto L_0x016e
        L_0x0167:
            r0 = move-exception
            java.lang.String r11 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r7, r11, r0)
            r11 = 0
        L_0x016e:
            if (r11 != 0) goto L_0x0172
            goto L_0x0206
        L_0x0172:
            boolean r0 = Q0.l.b
            if (r0 != 0) goto L_0x018f
            java.lang.Class r0 = r11.getClass()     // Catch:{ NoSuchFieldException -> 0x0186 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r12)     // Catch:{ NoSuchFieldException -> 0x0186 }
            Q0.l.f660a = r0     // Catch:{ NoSuchFieldException -> 0x0186 }
            r13 = 1
            r0.setAccessible(r13)     // Catch:{ NoSuchFieldException -> 0x0186 }
        L_0x0184:
            r13 = 1
            goto L_0x018d
        L_0x0186:
            r0 = move-exception
            java.lang.String r12 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r7, r12, r0)
            goto L_0x0184
        L_0x018d:
            Q0.l.b = r13
        L_0x018f:
            java.lang.reflect.Field r0 = Q0.l.f660a
            if (r0 == 0) goto L_0x019e
            java.lang.Object r7 = r0.get(r11)     // Catch:{ IllegalAccessException -> 0x0198 }
            goto L_0x019f
        L_0x0198:
            r0 = move-exception
            java.lang.String r11 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r7, r11, r0)
        L_0x019e:
            r7 = 0
        L_0x019f:
            if (r7 == 0) goto L_0x0206
            Q0.l.u(r7)
            goto L_0x0206
        L_0x01a5:
            java.lang.String r2 = "Could not retrieve value from Resources#mDrawableCache"
            java.lang.String r10 = "Could not retrieve Resources#mDrawableCache field"
            if (r0 < r15) goto L_0x01d8
            boolean r0 = Q0.l.b
            if (r0 != 0) goto L_0x01c3
            java.lang.reflect.Field r0 = r13.getDeclaredField(r12)     // Catch:{ NoSuchFieldException -> 0x01bc }
            Q0.l.f660a = r0     // Catch:{ NoSuchFieldException -> 0x01bc }
            r13 = 1
            r0.setAccessible(r13)     // Catch:{ NoSuchFieldException -> 0x01ba }
            goto L_0x01c1
        L_0x01ba:
            r0 = move-exception
            goto L_0x01be
        L_0x01bc:
            r0 = move-exception
            r13 = 1
        L_0x01be:
            android.util.Log.e(r7, r10, r0)
        L_0x01c1:
            Q0.l.b = r13
        L_0x01c3:
            java.lang.reflect.Field r0 = Q0.l.f660a
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r7 = r0.get(r11)     // Catch:{ IllegalAccessException -> 0x01cc }
            goto L_0x01d1
        L_0x01cc:
            r0 = move-exception
            android.util.Log.e(r7, r2, r0)
        L_0x01d0:
            r7 = 0
        L_0x01d1:
            if (r7 != 0) goto L_0x01d4
            goto L_0x0206
        L_0x01d4:
            Q0.l.u(r7)
            goto L_0x0206
        L_0x01d8:
            boolean r0 = Q0.l.b
            if (r0 != 0) goto L_0x01f0
            java.lang.reflect.Field r0 = r13.getDeclaredField(r12)     // Catch:{ NoSuchFieldException -> 0x01e9 }
            Q0.l.f660a = r0     // Catch:{ NoSuchFieldException -> 0x01e9 }
            r13 = 1
            r0.setAccessible(r13)     // Catch:{ NoSuchFieldException -> 0x01e7 }
            goto L_0x01ee
        L_0x01e7:
            r0 = move-exception
            goto L_0x01eb
        L_0x01e9:
            r0 = move-exception
            r13 = 1
        L_0x01eb:
            android.util.Log.e(r7, r10, r0)
        L_0x01ee:
            Q0.l.b = r13
        L_0x01f0:
            java.lang.reflect.Field r0 = Q0.l.f660a
            if (r0 == 0) goto L_0x0206
            java.lang.Object r0 = r0.get(r11)     // Catch:{ IllegalAccessException -> 0x01fc }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IllegalAccessException -> 0x01fc }
            r7 = r0
            goto L_0x0201
        L_0x01fc:
            r0 = move-exception
            android.util.Log.e(r7, r2, r0)
            r7 = 0
        L_0x0201:
            if (r7 == 0) goto L_0x0206
            r7.clear()
        L_0x0206:
            int r0 = r1.f2578T
            if (r0 == 0) goto L_0x021c
            r4.setTheme(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r15) goto L_0x021c
            android.content.res.Resources$Theme r0 = r4.getTheme()
            int r2 = r1.f2578T
            r13 = 1
            r0.applyStyle(r2, r13)
            goto L_0x021d
        L_0x021c:
            r13 = 1
        L_0x021d:
            if (r5 == 0) goto L_0x024a
            boolean r0 = r9 instanceof android.app.Activity
            if (r0 == 0) goto L_0x024a
            r0 = r9
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r0 instanceof androidx.lifecycle.r
            if (r2 == 0) goto L_0x023f
            r2 = r0
            androidx.lifecycle.r r2 = (androidx.lifecycle.r) r2
            androidx.lifecycle.t r2 = r2.e()
            androidx.lifecycle.m r2 = r2.f1439c
            androidx.lifecycle.m r5 = androidx.lifecycle.m.f1432h
            int r2 = r2.compareTo(r5)
            if (r2 < 0) goto L_0x024a
            r0.onConfigurationChanged(r14)
            goto L_0x024a
        L_0x023f:
            boolean r2 = r1.f2574P
            if (r2 == 0) goto L_0x024a
            boolean r2 = r1.f2575Q
            if (r2 != 0) goto L_0x024a
            r0.onConfigurationChanged(r14)
        L_0x024a:
            r11 = 1
            goto L_0x024d
        L_0x024c:
            r11 = r5
        L_0x024d:
            if (r11 == 0) goto L_0x0260
            boolean r0 = r9 instanceof e.C0137h
            if (r0 == 0) goto L_0x0260
            r0 = r8 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x025a
            r0 = r9
            e.h r0 = (e.C0137h) r0
        L_0x025a:
            r0 = r8 & 4
            if (r0 == 0) goto L_0x0260
            e.h r9 = (e.C0137h) r9
        L_0x0260:
            if (r11 == 0) goto L_0x0284
            if (r6 == 0) goto L_0x0284
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            E.g r0 = z(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r2 < r5) goto L_0x027a
            e.r.c(r0)
            goto L_0x0284
        L_0x027a:
            E.i r0 = r0.f89a
            r2 = 0
            java.util.Locale r0 = r0.get(r2)
            java.util.Locale.setDefault(r0)
        L_0x0284:
            if (r3 != 0) goto L_0x028e
            androidx.fragment.app.f r0 = r1.y(r4)
            r0.i()
            goto L_0x0295
        L_0x028e:
            e.u r0 = r1.f2581W
            if (r0 == 0) goto L_0x0295
            r0.c()
        L_0x0295:
            r0 = 3
            if (r3 != r0) goto L_0x02a9
            e.u r0 = r1.f2582X
            if (r0 != 0) goto L_0x02a3
            e.u r0 = new e.u
            r0.<init>((e.x) r1, (android.content.Context) r4)
            r1.f2582X = r0
        L_0x02a3:
            e.u r0 = r1.f2582X
            r0.i()
            goto L_0x02b0
        L_0x02a9:
            e.u r0 = r1.f2582X
            if (r0 == 0) goto L_0x02b0
            r0.c()
        L_0x02b0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e.x.n(boolean, boolean):boolean");
    }

    public final void o(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2593l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof t)) {
                t tVar = new t(this, callback);
                this.f2594m = tVar;
                window.setCallback(tVar);
                int[] iArr = f2557i0;
                Context context = this.f2592k;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    C0267t a2 = C0267t.a();
                    synchronized (a2) {
                        drawable = a2.f3565a.g(context, resourceId, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f2593l = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f2589f0) == null) {
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f2590g0) == null)) {
                        s.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f2590g0 = null;
                    }
                    Object obj = this.f2591j;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f2589f0 = s.a(activity);
                            J();
                            return;
                        }
                    }
                    this.f2589f0 = null;
                    J();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Class[], java.lang.Object[], java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0111, code lost:
        if (r2.equals("ImageButton") == false) goto L_0x009a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = 3
            r6 = -1
            r7 = 4
            r8 = 1
            e.A r0 = r1.e0
            r9 = 0
            if (r0 != 0) goto L_0x005e
            int[] r0 = d.a.f2200j
            android.content.Context r10 = r1.f2592k
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0)
            r11 = 116(0x74, float:1.63E-43)
            java.lang.String r11 = r0.getString(r11)
            if (r11 != 0) goto L_0x0029
            e.A r0 = new e.A
            r0.<init>()
            r1.e0 = r0
            goto L_0x005e
        L_0x0029:
            java.lang.ClassLoader r0 = r10.getClassLoader()     // Catch:{ all -> 0x003e }
            java.lang.Class r0 = r0.loadClass(r11)     // Catch:{ all -> 0x003e }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r9)     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r0.newInstance(r9)     // Catch:{ all -> 0x003e }
            e.A r0 = (e.C0119A) r0     // Catch:{ all -> 0x003e }
            r1.e0 = r0     // Catch:{ all -> 0x003e }
            goto L_0x005e
        L_0x003e:
            r0 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "Failed to instantiate custom view inflater "
            r10.<init>(r12)
            r10.append(r11)
            java.lang.String r11 = ". Falling back to default."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "AppCompatDelegate"
            android.util.Log.i(r11, r10, r0)
            e.A r0 = new e.A
            r0.<init>()
            r1.e0 = r0
        L_0x005e:
            e.A r0 = r1.e0
            int r10 = k.B1.f3326a
            r0.getClass()
            int[] r10 = d.a.f2215y
            r14 = 0
            android.content.res.TypedArray r10 = r3.obtainStyledAttributes(r4, r10, r14, r14)
            int r11 = r10.getResourceId(r7, r14)
            if (r11 == 0) goto L_0x0079
            java.lang.String r12 = "AppCompatViewInflater"
            java.lang.String r13 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r12, r13)
        L_0x0079:
            r10.recycle()
            if (r11 == 0) goto L_0x008f
            boolean r10 = r3 instanceof i.C0179d
            if (r10 == 0) goto L_0x0089
            r10 = r3
            i.d r10 = (i.C0179d) r10
            int r10 = r10.f2926a
            if (r10 == r11) goto L_0x008f
        L_0x0089:
            i.d r10 = new i.d
            r10.<init>(r3, r11)
            goto L_0x0090
        L_0x008f:
            r10 = r3
        L_0x0090:
            r2.getClass()
            int r11 = r2.hashCode()
            switch(r11) {
                case -1946472170: goto L_0x0138;
                case -1455429095: goto L_0x012c;
                case -1346021293: goto L_0x0120;
                case -938935918: goto L_0x0114;
                case -937446323: goto L_0x010b;
                case -658531749: goto L_0x0100;
                case -339785223: goto L_0x00f5;
                case 776382189: goto L_0x00ea;
                case 799298502: goto L_0x00de;
                case 1125864064: goto L_0x00d1;
                case 1413872058: goto L_0x00c4;
                case 1601505219: goto L_0x00b7;
                case 1666676343: goto L_0x00aa;
                case 2001146706: goto L_0x009d;
                default: goto L_0x009a;
            }
        L_0x009a:
            r7 = -1
            goto L_0x0143
        L_0x009d:
            java.lang.String r7 = "Button"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00a6
            goto L_0x009a
        L_0x00a6:
            r7 = 13
            goto L_0x0143
        L_0x00aa:
            java.lang.String r7 = "EditText"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00b3
            goto L_0x009a
        L_0x00b3:
            r7 = 12
            goto L_0x0143
        L_0x00b7:
            java.lang.String r7 = "CheckBox"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00c0
            goto L_0x009a
        L_0x00c0:
            r7 = 11
            goto L_0x0143
        L_0x00c4:
            java.lang.String r7 = "AutoCompleteTextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00cd
            goto L_0x009a
        L_0x00cd:
            r7 = 10
            goto L_0x0143
        L_0x00d1:
            java.lang.String r7 = "ImageView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00da
            goto L_0x009a
        L_0x00da:
            r7 = 9
            goto L_0x0143
        L_0x00de:
            java.lang.String r7 = "ToggleButton"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00e7
            goto L_0x009a
        L_0x00e7:
            r7 = 8
            goto L_0x0143
        L_0x00ea:
            java.lang.String r7 = "RadioButton"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00f3
            goto L_0x009a
        L_0x00f3:
            r7 = 7
            goto L_0x0143
        L_0x00f5:
            java.lang.String r7 = "Spinner"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00fe
            goto L_0x009a
        L_0x00fe:
            r7 = 6
            goto L_0x0143
        L_0x0100:
            java.lang.String r7 = "SeekBar"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x0109
            goto L_0x009a
        L_0x0109:
            r7 = 5
            goto L_0x0143
        L_0x010b:
            java.lang.String r11 = "ImageButton"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto L_0x0143
            goto L_0x009a
        L_0x0114:
            java.lang.String r7 = "TextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x011e
            goto L_0x009a
        L_0x011e:
            r7 = 3
            goto L_0x0143
        L_0x0120:
            java.lang.String r7 = "MultiAutoCompleteTextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x012a
            goto L_0x009a
        L_0x012a:
            r7 = 2
            goto L_0x0143
        L_0x012c:
            java.lang.String r7 = "CheckedTextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x0136
            goto L_0x009a
        L_0x0136:
            r7 = 1
            goto L_0x0143
        L_0x0138:
            java.lang.String r7 = "RatingBar"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x0142
            goto L_0x009a
        L_0x0142:
            r7 = 0
        L_0x0143:
            switch(r7) {
                case 0: goto L_0x0194;
                case 1: goto L_0x018e;
                case 2: goto L_0x0188;
                case 3: goto L_0x0183;
                case 4: goto L_0x017a;
                case 5: goto L_0x0174;
                case 6: goto L_0x016e;
                case 7: goto L_0x0169;
                case 8: goto L_0x0163;
                case 9: goto L_0x015d;
                case 10: goto L_0x0158;
                case 11: goto L_0x0153;
                case 12: goto L_0x014d;
                case 13: goto L_0x0148;
                default: goto L_0x0146;
            }
        L_0x0146:
            r7 = r9
            goto L_0x0199
        L_0x0148:
            k.p r7 = r0.b(r10, r4)
            goto L_0x0199
        L_0x014d:
            k.v r7 = new k.v
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x0153:
            k.q r7 = r0.c(r10, r4)
            goto L_0x0199
        L_0x0158:
            k.n r7 = r0.a(r10, r4)
            goto L_0x0199
        L_0x015d:
            k.z r7 = new k.z
            r7.<init>(r10, r4, r14)
            goto L_0x0199
        L_0x0163:
            k.p0 r7 = new k.p0
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x0169:
            k.E r7 = r0.d(r10, r4)
            goto L_0x0199
        L_0x016e:
            k.U r7 = new k.U
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x0174:
            k.H r7 = new k.H
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x017a:
            k.x r7 = new k.x
            r11 = 2130903571(0x7f030213, float:1.7413964E38)
            r7.<init>(r10, r4, r11)
            goto L_0x0199
        L_0x0183:
            k.h0 r7 = r0.e(r10, r4)
            goto L_0x0199
        L_0x0188:
            k.A r7 = new k.A
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x018e:
            k.r r7 = new k.r
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x0194:
            k.F r7 = new k.F
            r7.<init>(r10, r4)
        L_0x0199:
            if (r7 != 0) goto L_0x01e9
            if (r3 == r10) goto L_0x01e9
            java.lang.Object[] r3 = r0.f2433a
            java.lang.String r7 = "view"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x01ad
            java.lang.String r2 = "class"
            java.lang.String r2 = r4.getAttributeValue(r9, r2)
        L_0x01ad:
            r3[r14] = r10     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            r3[r8] = r4     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            r7 = 46
            int r7 = r2.indexOf(r7)     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            if (r6 != r7) goto L_0x01d5
            r6 = 0
        L_0x01ba:
            java.lang.String[] r7 = e.C0119A.f2431g     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            if (r6 >= r5) goto L_0x01d0
            r7 = r7[r6]     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            android.view.View r7 = r0.f(r10, r2, r7)     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            if (r7 == 0) goto L_0x01cc
            r3[r14] = r9
            r3[r8] = r9
            r9 = r7
            goto L_0x01e8
        L_0x01cc:
            int r6 = r6 + r8
            goto L_0x01ba
        L_0x01ce:
            r0 = move-exception
            goto L_0x01df
        L_0x01d0:
            r3[r14] = r9
            r3[r8] = r9
            goto L_0x01e8
        L_0x01d5:
            android.view.View r0 = r0.f(r10, r2, r9)     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            r3[r14] = r9
            r3[r8] = r9
            r9 = r0
            goto L_0x01e8
        L_0x01df:
            r3[r14] = r9
            r3[r8] = r9
            throw r0
        L_0x01e4:
            r3[r14] = r9
            r3[r8] = r9
        L_0x01e8:
            r7 = r9
        L_0x01e9:
            if (r7 == 0) goto L_0x027e
            android.content.Context r0 = r7.getContext()
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0213
            java.util.WeakHashMap r2 = I.O.f393a
            boolean r2 = r7.hasOnClickListeners()
            if (r2 != 0) goto L_0x01fc
            goto L_0x0213
        L_0x01fc:
            int[] r2 = e.C0119A.f2428c
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r4, r2)
            java.lang.String r2 = r0.getString(r14)
            if (r2 == 0) goto L_0x0210
            e.z r3 = new e.z
            r3.<init>(r7, r2)
            r7.setOnClickListener(r3)
        L_0x0210:
            r0.recycle()
        L_0x0213:
            int r0 = android.os.Build.VERSION.SDK_INT
            r15 = 28
            if (r0 <= r15) goto L_0x021a
            goto L_0x027e
        L_0x021a:
            int[] r0 = e.C0119A.f2429d
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r4, r0)
            boolean r2 = r0.hasValue(r14)
            java.lang.Class<java.lang.Boolean> r13 = java.lang.Boolean.class
            if (r2 == 0) goto L_0x023f
            boolean r2 = r0.getBoolean(r14, r14)
            java.util.WeakHashMap r3 = I.O.f393a
            I.y r11 = new I.y
            r12 = 2131231127(0x7f080197, float:1.8078326E38)
            r16 = 2
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r11.d(r7, r2)
        L_0x023f:
            r0.recycle()
            int[] r0 = e.C0119A.f2430e
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r4, r0)
            boolean r2 = r0.hasValue(r14)
            if (r2 == 0) goto L_0x0255
            java.lang.String r2 = r0.getString(r14)
            I.O.q(r7, r2)
        L_0x0255:
            r0.recycle()
            int[] r0 = e.C0119A.f
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r4, r0)
            boolean r2 = r0.hasValue(r14)
            if (r2 == 0) goto L_0x027b
            boolean r2 = r0.getBoolean(r14, r14)
            java.util.WeakHashMap r3 = I.O.f393a
            I.y r11 = new I.y
            r12 = 2131231132(0x7f08019c, float:1.8078336E38)
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r11.d(r7, r2)
        L_0x027b:
            r0.recycle()
        L_0x027e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.x.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX INFO: finally extract failed */
    public final void q(int i2, w wVar, C0209m mVar) {
        if (mVar == null) {
            if (wVar == null && i2 >= 0) {
                w[] wVarArr = this.f2570L;
                if (i2 < wVarArr.length) {
                    wVar = wVarArr[i2];
                }
            }
            if (wVar != null) {
                mVar = wVar.f2547h;
            }
        }
        if ((wVar == null || wVar.f2552m) && !this.f2575Q) {
            t tVar = this.f2594m;
            Window.Callback callback = this.f2593l.getCallback();
            tVar.getClass();
            try {
                tVar.f2536d = true;
                callback.onPanelClosed(i2, mVar);
                tVar.f2536d = false;
            } catch (Throwable th) {
                tVar.f2536d = false;
                throw th;
            }
        }
    }

    public final void r(C0209m mVar) {
        C0248j jVar;
        if (!this.f2569K) {
            this.f2569K = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2599r;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((w1) actionBarOverlayLayout.f942e).f3579a.f1041a;
            if (!(actionMenuView == null || (jVar = actionMenuView.f967t) == null)) {
                jVar.f();
                C0240f fVar = jVar.f3492t;
                if (fVar != null && fVar.b()) {
                    fVar.f3170i.dismiss();
                }
            }
            Window.Callback callback = this.f2593l.getCallback();
            if (callback != null && !this.f2575Q) {
                callback.onPanelClosed(108, mVar);
            }
            this.f2569K = false;
        }
    }

    public final void s(w wVar, boolean z2) {
        v vVar;
        C0264r0 r0Var;
        C0248j jVar;
        if (z2 && wVar.f2542a == 0 && (r0Var = this.f2599r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) r0Var;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((w1) actionBarOverlayLayout.f942e).f3579a.f1041a;
            if (!(actionMenuView == null || (jVar = actionMenuView.f967t) == null || !jVar.j())) {
                r(wVar.f2547h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2592k.getSystemService("window");
        if (!(windowManager == null || !wVar.f2552m || (vVar = wVar.f2545e) == null)) {
            windowManager.removeView(vVar);
            if (z2) {
                q(wVar.f2542a, wVar, (C0209m) null);
            }
        }
        wVar.f2550k = false;
        wVar.f2551l = false;
        wVar.f2552m = false;
        wVar.f = null;
        wVar.f2553n = true;
        if (this.f2571M == wVar) {
            this.f2571M = null;
        }
        if (wVar.f2542a == 0) {
            J();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r4 != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00dc, code lost:
        if (r7.f() != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0102, code lost:
        if (r7.l() != false) goto L_0x0123;
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2591j
            boolean r1 = r0 instanceof I.C0018j
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof e.C0136g
            if (r0 == 0) goto L_0x001b
        L_0x000b:
            android.view.Window r0 = r6.f2593l
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001b
            boolean r0 = A.i.C(r0, r7)
            if (r0 == 0) goto L_0x001b
            goto L_0x014d
        L_0x001b:
            int r0 = r7.getKeyCode()
            r1 = 0
            r3 = 82
            if (r0 != r3) goto L_0x003f
            e.t r0 = r6.f2594m
            android.view.Window r4 = r6.f2593l
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f2535c = r2     // Catch:{ all -> 0x003b }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x003b }
            r0.f2535c = r1
            if (r4 == 0) goto L_0x003f
            goto L_0x014d
        L_0x003b:
            r7 = move-exception
            r0.f2535c = r1
            throw r7
        L_0x003f:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L_0x006f
            if (r0 == r5) goto L_0x0062
            if (r0 == r3) goto L_0x0050
            goto L_0x014e
        L_0x0050:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x014d
            e.w r0 = r6.A(r1)
            boolean r1 = r0.f2552m
            if (r1 != 0) goto L_0x014d
            r6.H(r0, r7)
            return r2
        L_0x0062:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            r6.f2572N = r2
            return r1
        L_0x006f:
            if (r0 == r5) goto L_0x0147
            if (r0 == r3) goto L_0x0075
            goto L_0x014e
        L_0x0075:
            i.a r0 = r6.f2602u
            if (r0 == 0) goto L_0x007b
            goto L_0x014d
        L_0x007b:
            e.w r0 = r6.A(r1)
            k.r0 r3 = r6.f2599r
            android.content.Context r4 = r6.f2592k
            if (r3 == 0) goto L_0x0105
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            k.s0 r3 = r3.f942e
            k.w1 r3 = (k.w1) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f3579a
            int r5 = r3.getVisibility()
            if (r5 != 0) goto L_0x0105
            androidx.appcompat.widget.ActionMenuView r3 = r3.f1041a
            if (r3 == 0) goto L_0x0105
            boolean r3 = r3.f966s
            if (r3 == 0) goto L_0x0105
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r4)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 != 0) goto L_0x0105
            k.r0 r3 = r6.f2599r
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            k.s0 r3 = r3.f942e
            k.w1 r3 = (k.w1) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f3579a
            androidx.appcompat.widget.ActionMenuView r3 = r3.f1041a
            if (r3 == 0) goto L_0x00df
            k.j r3 = r3.f967t
            if (r3 == 0) goto L_0x00df
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x00df
            k.r0 r7 = r6.f2599r
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            k.s0 r7 = r7.f942e
            k.w1 r7 = (k.w1) r7
            androidx.appcompat.widget.Toolbar r7 = r7.f3579a
            androidx.appcompat.widget.ActionMenuView r7 = r7.f1041a
            if (r7 == 0) goto L_0x0125
            k.j r7 = r7.f967t
            if (r7 == 0) goto L_0x0125
            boolean r7 = r7.f()
            if (r7 == 0) goto L_0x0125
        L_0x00de:
            goto L_0x0123
        L_0x00df:
            boolean r3 = r6.f2575Q
            if (r3 != 0) goto L_0x0125
            boolean r7 = r6.H(r0, r7)
            if (r7 == 0) goto L_0x0125
            k.r0 r7 = r6.f2599r
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            k.s0 r7 = r7.f942e
            k.w1 r7 = (k.w1) r7
            androidx.appcompat.widget.Toolbar r7 = r7.f3579a
            androidx.appcompat.widget.ActionMenuView r7 = r7.f1041a
            if (r7 == 0) goto L_0x0125
            k.j r7 = r7.f967t
            if (r7 == 0) goto L_0x0125
            boolean r7 = r7.l()
            if (r7 == 0) goto L_0x0125
            goto L_0x00de
        L_0x0105:
            boolean r3 = r0.f2552m
            if (r3 != 0) goto L_0x0127
            boolean r5 = r0.f2551l
            if (r5 == 0) goto L_0x010e
            goto L_0x0127
        L_0x010e:
            boolean r3 = r0.f2550k
            if (r3 == 0) goto L_0x0125
            boolean r3 = r0.f2554o
            if (r3 == 0) goto L_0x011d
            r0.f2550k = r1
            boolean r3 = r6.H(r0, r7)
            goto L_0x011e
        L_0x011d:
            r3 = 1
        L_0x011e:
            if (r3 == 0) goto L_0x0125
            r6.F(r0, r7)
        L_0x0123:
            r7 = 1
            goto L_0x012b
        L_0x0125:
            r7 = 0
            goto L_0x012b
        L_0x0127:
            r6.s(r0, r2)
            r7 = r3
        L_0x012b:
            if (r7 == 0) goto L_0x014d
            android.content.Context r7 = r4.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x013f
            r7.playSoundEffect(r1)
            return r2
        L_0x013f:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            return r2
        L_0x0147:
            boolean r7 = r6.E()
            if (r7 == 0) goto L_0x014e
        L_0x014d:
            return r2
        L_0x014e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.x.u(android.view.KeyEvent):boolean");
    }

    public final void v(int i2) {
        w A2 = A(i2);
        if (A2.f2547h != null) {
            Bundle bundle = new Bundle();
            A2.f2547h.t(bundle);
            if (bundle.size() > 0) {
                A2.f2555p = bundle;
            }
            A2.f2547h.w();
            A2.f2547h.clear();
        }
        A2.f2554o = true;
        A2.f2553n = true;
        if ((i2 == 108 || i2 == 0) && this.f2599r != null) {
            w A3 = A(0);
            A3.f2550k = false;
            H(A3, (KeyEvent) null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f2607z) {
            int[] iArr = a.f2200j;
            Context context2 = this.f2592k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    i(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    i(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    i(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    i(10);
                }
                this.f2567I = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                x();
                this.f2593l.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (this.f2568J) {
                    viewGroup = this.f2566H ? (ViewGroup) from.inflate(R.layout.MT_Bin, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.MT_Bin, (ViewGroup) null);
                } else if (this.f2567I) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.MT_Bin, (ViewGroup) null);
                    this.f2565G = false;
                    this.f2564F = false;
                } else if (this.f2564F) {
                    TypedValue typedValue = new TypedValue();
                    context2.getTheme().resolveAttribute(R.attr.MT_Bin, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C0179d(context2, typedValue.resourceId);
                    } else {
                        context = context2;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.MT_Bin, (ViewGroup) null);
                    C0264r0 r0Var = (C0264r0) viewGroup.findViewById(R.id.MT_Bin);
                    this.f2599r = r0Var;
                    r0Var.setWindowCallback(this.f2593l.getCallback());
                    if (this.f2565G) {
                        ((ActionBarOverlayLayout) this.f2599r).j(109);
                    }
                    if (this.D) {
                        ((ActionBarOverlayLayout) this.f2599r).j(2);
                    }
                    if (this.f2563E) {
                        ((ActionBarOverlayLayout) this.f2599r).j(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    n nVar = new n(this, 0);
                    WeakHashMap weakHashMap = O.f393a;
                    D.u(viewGroup, nVar);
                    if (this.f2599r == null) {
                        this.f2561B = (TextView) viewGroup.findViewById(R.id.MT_Bin);
                    }
                    Method method = D1.f3337a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", (Class[]) null);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, (Object[]) null);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    } catch (IllegalAccessException e3) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.MT_Bin);
                    ViewGroup viewGroup2 = (ViewGroup) this.f2593l.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f2593l.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new n(this, 1));
                    this.f2560A = viewGroup;
                    Object obj = this.f2591j;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f2598q;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        C0264r0 r0Var2 = this.f2599r;
                        if (r0Var2 != null) {
                            r0Var2.setWindowTitle(charSequence);
                        } else {
                            C0129K k2 = this.f2596o;
                            if (k2 != null) {
                                w1 w1Var = (w1) k2.f2462p;
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
                            } else {
                                TextView textView = this.f2561B;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2560A.findViewById(16908290);
                    View decorView = this.f2593l.getDecorView();
                    contentFrameLayout2.f981g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = O.f393a;
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f2607z = true;
                    w A2 = A(0);
                    if (!this.f2575Q && A2.f2547h == null) {
                        C(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2564F + ", windowActionBarOverlay: " + this.f2565G + ", android:windowIsFloating: " + this.f2567I + ", windowActionModeOverlay: " + this.f2566H + ", windowNoTitle: " + this.f2568J + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void x() {
        if (this.f2593l == null) {
            Object obj = this.f2591j;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.f2593l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final C0049f y(Context context) {
        if (this.f2581W == null) {
            if (N.g.f604e == null) {
                Context applicationContext = context.getApplicationContext();
                N.g.f604e = new N.g(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2581W = new u(this, N.g.f604e);
        }
        return this.f2581W;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
