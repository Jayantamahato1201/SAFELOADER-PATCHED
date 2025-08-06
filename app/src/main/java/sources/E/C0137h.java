package e;

import A.j;
import E.b;
import E.g;
import F.c;
import Q0.l;
import U0.i;
import Z.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.k;
import androidx.fragment.app.C0058o;
import androidx.fragment.app.D;
import androidx.fragment.app.K;
import androidx.fragment.app.p;
import androidx.fragment.app.q;
import androidx.fragment.app.r;
import androidx.lifecycle.C0070l;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import c0.C0106d;
import com.cheatbox.R;
import i.C0179d;
import i.C0184i;
import i.C0186k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import k.B1;
import k.C0267t;
import k.w1;
import t0.C0486a;
import x.C0494b;
import z.C0503b;

/* renamed from: e.h  reason: case insensitive filesystem */
public abstract class C0137h extends k implements C0138i, C0494b {

    /* renamed from: p  reason: collision with root package name */
    public final j f2517p = new j(16, (Object) new r(this));

    /* renamed from: q  reason: collision with root package name */
    public final t f2518q = new t(this);

    /* renamed from: r  reason: collision with root package name */
    public boolean f2519r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2520s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2521t = true;

    /* renamed from: u  reason: collision with root package name */
    public x f2522u;

    public C0137h() {
        ((C0106d) this.f855e.f866c).e("android:support:fragments", new p(this, 0));
        g(new q(this, 0));
        ((C0106d) this.f855e.f866c).e("androidx:appcompat", new p(this, 1));
        g(new q(this, 1));
    }

    public static boolean k(D d2) {
        C0137h hVar;
        boolean z2 = false;
        for (C0058o oVar : d2.f1200c.t()) {
            if (oVar != null) {
                r rVar = oVar.f1374s;
                if (rVar == null) {
                    hVar = null;
                } else {
                    hVar = rVar.f1388p;
                }
                if (hVar != null) {
                    z2 |= k(oVar.g());
                }
                K k2 = oVar.f1354M;
                m mVar = m.f1433i;
                if (k2 != null) {
                    k2.f();
                    if (k2.b.f1439c.compareTo(mVar) >= 0) {
                        oVar.f1354M.b.g();
                        z2 = true;
                    }
                }
                if (oVar.f1353L.f1439c.compareTo(mVar) >= 0) {
                    oVar.f1353L.g();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        x xVar = (x) i();
        xVar.w();
        ((ViewGroup) xVar.f2560A.findViewById(16908290)).addView(view, layoutParams);
        xVar.f2594m.a(xVar.f2593l.getCallback());
    }

    public final void attachBaseContext(Context context) {
        x xVar = (x) i();
        xVar.f2573O = true;
        int i2 = xVar.f2577S;
        if (i2 == -100) {
            i2 = C0141l.b;
        }
        int D = xVar.D(context, i2);
        if (C0141l.c(context) && C0141l.c(context)) {
            if (!b.a()) {
                synchronized (C0141l.f2529i) {
                    try {
                        g gVar = C0141l.f2524c;
                        if (gVar == null) {
                            if (C0141l.f2525d == null) {
                                C0141l.f2525d = g.b(l.V(context));
                            }
                            if (!C0141l.f2525d.f89a.isEmpty()) {
                                C0141l.f2524c = C0141l.f2525d;
                            }
                        } else if (!gVar.equals(C0141l.f2525d)) {
                            g gVar2 = C0141l.f2524c;
                            C0141l.f2525d = gVar2;
                            l.R(context, gVar2.f89a.b());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!C0141l.f) {
                C0141l.f2523a.execute(new h(context, 2));
            }
        }
        g p2 = x.p(context);
        Configuration configuration = null;
        if (x.f2559k0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(x.t(context, D, p2, (Configuration) null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0179d) {
            try {
                ((C0179d) context).a(x.t(context, D, p2, (Configuration) null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (x.f2558j0) {
            int i3 = Build.VERSION.SDK_INT;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i4 = configuration3.mcc;
                    int i5 = configuration4.mcc;
                    if (i4 != i5) {
                        configuration.mcc = i5;
                    }
                    int i6 = configuration3.mnc;
                    int i7 = configuration4.mnc;
                    if (i6 != i7) {
                        configuration.mnc = i7;
                    }
                    if (i3 >= 24) {
                        r.a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i8 = configuration3.touchscreen;
                    int i9 = configuration4.touchscreen;
                    if (i8 != i9) {
                        configuration.touchscreen = i9;
                    }
                    int i10 = configuration3.keyboard;
                    int i11 = configuration4.keyboard;
                    if (i10 != i11) {
                        configuration.keyboard = i11;
                    }
                    int i12 = configuration3.keyboardHidden;
                    int i13 = configuration4.keyboardHidden;
                    if (i12 != i13) {
                        configuration.keyboardHidden = i13;
                    }
                    int i14 = configuration3.navigation;
                    int i15 = configuration4.navigation;
                    if (i14 != i15) {
                        configuration.navigation = i15;
                    }
                    int i16 = configuration3.navigationHidden;
                    int i17 = configuration4.navigationHidden;
                    if (i16 != i17) {
                        configuration.navigationHidden = i17;
                    }
                    int i18 = configuration3.orientation;
                    int i19 = configuration4.orientation;
                    if (i18 != i19) {
                        configuration.orientation = i19;
                    }
                    int i20 = configuration3.screenLayout & 15;
                    int i21 = configuration4.screenLayout & 15;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 192;
                    int i23 = configuration4.screenLayout & 192;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 48;
                    int i25 = configuration4.screenLayout & 48;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 768;
                    int i27 = configuration4.screenLayout & 768;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    if (i3 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode = configuration.colorMode | (configuration4.colorMode & 3);
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode = configuration.colorMode | (configuration4.colorMode & 12);
                        }
                    }
                    int i28 = configuration3.uiMode & 15;
                    int i29 = configuration4.uiMode & 15;
                    if (i28 != i29) {
                        configuration.uiMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 48;
                    int i31 = configuration4.uiMode & 48;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.screenWidthDp;
                    int i33 = configuration4.screenWidthDp;
                    if (i32 != i33) {
                        configuration.screenWidthDp = i33;
                    }
                    int i34 = configuration3.screenHeightDp;
                    int i35 = configuration4.screenHeightDp;
                    if (i34 != i35) {
                        configuration.screenHeightDp = i35;
                    }
                    int i36 = configuration3.smallestScreenWidthDp;
                    int i37 = configuration4.smallestScreenWidthDp;
                    if (i36 != i37) {
                        configuration.smallestScreenWidthDp = i37;
                    }
                    int i38 = configuration3.densityDpi;
                    int i39 = configuration4.densityDpi;
                    if (i38 != i39) {
                        configuration.densityDpi = i39;
                    }
                }
            }
            Configuration t2 = x.t(context, D, p2, configuration, true);
            C0179d dVar = new C0179d(context, R.style.MT_Bin);
            dVar.a(t2);
            try {
                if (context.getTheme() != null) {
                    C0503b.l(dVar.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = dVar;
        }
        super.attachBaseContext(context);
    }

    public final void closeOptionsMenu() {
        ((x) i()).B();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((x) i()).B();
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2519r);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2520s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2521t);
        if (getApplication() != null) {
            new c((androidx.lifecycle.r) this, d()).r(str2, printWriter);
        }
        ((r) this.f2517p.b).f1387o.t(str, fileDescriptor, printWriter, strArr);
    }

    public final View findViewById(int i2) {
        x xVar = (x) i();
        xVar.w();
        return xVar.f2593l.findViewById(i2);
    }

    public final MenuInflater getMenuInflater() {
        Context context;
        x xVar = (x) i();
        if (xVar.f2597p == null) {
            xVar.B();
            C0129K k2 = xVar.f2596o;
            if (k2 != null) {
                context = k2.g0();
            } else {
                context = xVar.f2592k;
            }
            xVar.f2597p = new C0184i(context);
        }
        return xVar.f2597p;
    }

    public final Resources getResources() {
        int i2 = B1.f3326a;
        return super.getResources();
    }

    public final C0141l i() {
        if (this.f2522u == null) {
            C0122D d2 = C0141l.f2523a;
            this.f2522u = new x(this, (Window) null, this, this);
        }
        return this.f2522u;
    }

    public final void invalidateOptionsMenu() {
        i().b();
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        i.e("<this>", decorView);
        decorView.setTag(R.id.MT_Bin, this);
        View decorView2 = getWindow().getDecorView();
        i.e("<this>", decorView2);
        decorView2.setTag(R.id.MT_Bin, this);
        View decorView3 = getWindow().getDecorView();
        i.e("<this>", decorView3);
        decorView3.setTag(R.id.MT_Bin, this);
        View decorView4 = getWindow().getDecorView();
        i.e("<this>", decorView4);
        decorView4.setTag(R.id.MT_Bin, this);
    }

    public final void l(Configuration configuration) {
        j jVar = this.f2517p;
        jVar.z();
        super.onConfigurationChanged(configuration);
        ((r) jVar.b).f1387o.h();
    }

    public final void m() {
        super.onDestroy();
        ((r) this.f2517p.b).f1387o.k();
        this.f2518q.d(C0070l.ON_DESTROY);
    }

    public final boolean n(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        j jVar = this.f2517p;
        if (i2 == 0) {
            return ((r) jVar.b).f1387o.n();
        }
        if (i2 != 6) {
            return false;
        }
        return ((r) jVar.b).f1387o.i();
    }

    public final void o(int i2, Menu menu) {
        if (i2 == 0) {
            ((r) this.f2517p.b).f1387o.o();
        }
        super.onPanelClosed(i2, menu);
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        this.f2517p.z();
        super.onActivityResult(i2, i3, intent);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        l(configuration);
        x xVar = (x) i();
        if (xVar.f2564F && xVar.f2607z) {
            xVar.B();
            C0129K k2 = xVar.f2596o;
            if (k2 != null) {
                k2.j0(k2.f2458l.getResources().getBoolean(R.bool.MT_Bin));
            }
        }
        C0267t a2 = C0267t.a();
        Context context = xVar.f2592k;
        synchronized (a2) {
            a2.f3565a.l(context);
        }
        xVar.f2576R = new Configuration(xVar.f2592k.getResources().getConfiguration());
        xVar.n(false, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2518q.d(C0070l.ON_CREATE);
        D d2 = ((r) this.f2517p.b).f1387o;
        d2.f1221y = false;
        d2.f1222z = false;
        d2.f1197F.f1234h = false;
        d2.s(1);
    }

    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0) {
            super.onCreatePanelMenu(i2, menu);
            getMenuInflater();
            ((r) this.f2517p.b).f1387o.j();
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        return true;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((r) this.f2517p.b).f1387o.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public final void onDestroy() {
        m();
        i().g();
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    public final void onLowMemory() {
        super.onLowMemory();
        ((r) this.f2517p.b).f1387o.l();
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intent j2;
        if (!n(i2, menuItem)) {
            x xVar = (x) i();
            xVar.B();
            C0129K k2 = xVar.f2596o;
            if (menuItem.getItemId() != 16908332 || k2 == null || (((w1) k2.f2462p).b & 4) == 0 || (j2 = C0486a.j(this)) == null) {
                return false;
            }
            if (shouldUpRecreateTask(j2)) {
                ArrayList arrayList = new ArrayList();
                Intent j3 = C0486a.j(this);
                if (j3 == null) {
                    j3 = C0486a.j(this);
                }
                if (j3 != null) {
                    ComponentName component = j3.getComponent();
                    if (component == null) {
                        component = j3.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    try {
                        Intent k3 = C0486a.k(this, component);
                        while (k3 != null) {
                            arrayList.add(size, k3);
                            k3 = C0486a.k(this, k3.getComponent());
                        }
                        arrayList.add(j3);
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    startActivities(intentArr, (Bundle) null);
                    try {
                        finishAffinity();
                    } catch (IllegalStateException unused) {
                        finish();
                    }
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                }
            } else {
                navigateUpTo(j2);
                return true;
            }
        }
        return true;
    }

    public final void onMultiWindowModeChanged(boolean z2) {
        ((r) this.f2517p.b).f1387o.m();
    }

    public final void onNewIntent(Intent intent) {
        this.f2517p.z();
        super.onNewIntent(intent);
    }

    public final void onPanelClosed(int i2, Menu menu) {
        o(i2, menu);
    }

    public final void onPause() {
        super.onPause();
        this.f2520s = false;
        ((r) this.f2517p.b).f1387o.s(5);
        this.f2518q.d(C0070l.ON_PAUSE);
    }

    public final void onPictureInPictureModeChanged(boolean z2) {
        ((r) this.f2517p.b).f1387o.q();
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((x) i()).w();
    }

    public final void onPostResume() {
        p();
        x xVar = (x) i();
        xVar.B();
        C0129K k2 = xVar.f2596o;
        if (k2 != null) {
            k2.f2453E = true;
        }
    }

    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            super.onPreparePanel(0, view, menu);
            ((r) this.f2517p.b).f1387o.r();
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        return true;
    }

    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f2517p.z();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    public final void onResume() {
        j jVar = this.f2517p;
        jVar.z();
        super.onResume();
        this.f2520s = true;
        ((r) jVar.b).f1387o.w(true);
    }

    public final void onStart() {
        q();
        ((x) i()).n(true, false);
    }

    public final void onStateNotSaved() {
        this.f2517p.z();
    }

    public final void onStop() {
        r();
        x xVar = (x) i();
        xVar.B();
        C0129K k2 = xVar.f2596o;
        if (k2 != null) {
            k2.f2453E = false;
            C0186k kVar = k2.D;
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    public final void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        i().m(charSequence);
    }

    public final void openOptionsMenu() {
        ((x) i()).B();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        super.onPostResume();
        this.f2518q.d(C0070l.ON_RESUME);
        D d2 = ((r) this.f2517p.b).f1387o;
        d2.f1221y = false;
        d2.f1222z = false;
        d2.f1197F.f1234h = false;
        d2.s(7);
    }

    public final void q() {
        j jVar = this.f2517p;
        jVar.z();
        super.onStart();
        this.f2521t = false;
        boolean z2 = this.f2519r;
        r rVar = (r) jVar.b;
        if (!z2) {
            this.f2519r = true;
            D d2 = rVar.f1387o;
            d2.f1221y = false;
            d2.f1222z = false;
            d2.f1197F.f1234h = false;
            d2.s(4);
        }
        rVar.f1387o.w(true);
        this.f2518q.d(C0070l.ON_START);
        D d3 = rVar.f1387o;
        d3.f1221y = false;
        d3.f1222z = false;
        d3.f1197F.f1234h = false;
        d3.s(5);
    }

    public final void r() {
        j jVar;
        super.onStop();
        this.f2521t = true;
        do {
            jVar = this.f2517p;
        } while (k(((r) jVar.b).f1387o));
        D d2 = ((r) jVar.b).f1387o;
        d2.f1222z = true;
        d2.f1197F.f1234h = true;
        d2.s(4);
        this.f2518q.d(C0070l.ON_STOP);
    }

    public final void setContentView(int i2) {
        j();
        i().j(i2);
    }

    public final void setTheme(int i2) {
        super.setTheme(i2);
        ((x) i()).f2578T = i2;
    }

    public void setContentView(View view) {
        j();
        i().k(view);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((r) this.f2517p.b).f1387o.f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        i().l(view, layoutParams);
    }

    public final void onContentChanged() {
    }
}
