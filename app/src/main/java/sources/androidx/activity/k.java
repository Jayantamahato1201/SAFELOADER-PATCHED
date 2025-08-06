package androidx.activity;

import F.c;
import H0.E;
import Q0.l;
import U0.i;
import X.a;
import a.C0041a;
import a.C0042b;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C;
import androidx.lifecycle.C0066h;
import androidx.lifecycle.F;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import c0.C0105c;
import c0.C0106d;
import c0.e;
import com.cheatbox.R;
import e.C0137h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m.b;
import m.f;
import x.g;

public abstract class k extends g implements L, C0066h, e {
    public final C0041a b = new C0041a();

    /* renamed from: c  reason: collision with root package name */
    public final c f853c;

    /* renamed from: d  reason: collision with root package name */
    public final t f854d;

    /* renamed from: e  reason: collision with root package name */
    public final l f855e;
    public K f;

    /* renamed from: g  reason: collision with root package name */
    public u f856g;

    /* renamed from: h  reason: collision with root package name */
    public final j f857h;

    /* renamed from: i  reason: collision with root package name */
    public final l f858i;

    /* renamed from: j  reason: collision with root package name */
    public final g f859j;

    /* renamed from: k  reason: collision with root package name */
    public final CopyOnWriteArrayList f860k;

    /* renamed from: l  reason: collision with root package name */
    public final CopyOnWriteArrayList f861l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArrayList f862m;

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList f863n;

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList f864o;

    /* JADX WARNING: type inference failed for: r1v6, types: [androidx.activity.ImmLeaksCleaner, androidx.lifecycle.q, java.lang.Object] */
    public k() {
        C0137h hVar = (C0137h) this;
        this.f853c = new c((Runnable) new F0.g(4, hVar));
        t tVar = new t(this);
        this.f854d = tVar;
        l lVar = new l(this);
        this.f855e = lVar;
        C0105c cVar = null;
        this.f856g = null;
        j jVar = new j(hVar);
        this.f857h = jVar;
        this.f858i = new l(jVar, new d(hVar));
        new AtomicInteger();
        this.f859j = new g();
        this.f860k = new CopyOnWriteArrayList();
        this.f861l = new CopyOnWriteArrayList();
        this.f862m = new CopyOnWriteArrayList();
        this.f863n = new CopyOnWriteArrayList();
        this.f864o = new CopyOnWriteArrayList();
        tVar.a(new ComponentActivity$2(hVar));
        tVar.a(new ComponentActivity$3(hVar));
        tVar.a(new ComponentActivity$4(hVar));
        lVar.a();
        m mVar = tVar.f1439c;
        if (mVar == m.f1431g || mVar == m.f1432h) {
            C0106d dVar = (C0106d) lVar.f866c;
            dVar.getClass();
            Iterator it = ((f) dVar.f1812d).iterator();
            while (true) {
                b bVar = (b) it;
                if (!bVar.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) bVar.next();
                i.d("components", entry);
                C0105c cVar2 = (C0105c) entry.getValue();
                if (i.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    cVar = cVar2;
                    break;
                }
            }
            if (cVar == null) {
                G g2 = new G((C0106d) this.f855e.f866c, this);
                ((C0106d) this.f855e.f866c).e("androidx.lifecycle.internal.SavedStateHandlesProvider", g2);
                this.f854d.a(new SavedStateHandleAttacher(g2));
            }
            if (Build.VERSION.SDK_INT <= 23) {
                t tVar2 = this.f854d;
                ? obj = new Object();
                obj.f834a = this;
                tVar2.a(obj);
            }
            ((C0106d) this.f855e.f866c).e("android:support:activity-result", new e(hVar));
            g(new f(hVar));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final X.b a() {
        a aVar = a.b;
        i.e("initialExtras", aVar);
        X.b bVar = new X.b();
        bVar.f781a.putAll(aVar.f781a);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = bVar.f781a;
        if (application != null) {
            linkedHashMap.put(J.f1420a, getApplication());
        }
        linkedHashMap.put(F.f1413a, this);
        linkedHashMap.put(F.b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            linkedHashMap.put(F.f1414c, getIntent().getExtras());
        }
        return bVar;
    }

    public final C0106d b() {
        return (C0106d) this.f855e.f866c;
    }

    public final K d() {
        if (getApplication() != null) {
            if (this.f == null) {
                i iVar = (i) getLastNonConfigurationInstance();
                if (iVar != null) {
                    this.f = iVar.f849a;
                }
                if (this.f == null) {
                    this.f = new K();
                }
            }
            return this.f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final t e() {
        return this.f854d;
    }

    public final void g(C0042b bVar) {
        C0041a aVar = this.b;
        aVar.getClass();
        if (aVar.b != null) {
            bVar.a();
        }
        aVar.f825a.add(bVar);
    }

    public final u h() {
        if (this.f856g == null) {
            this.f856g = new u(new E(4, this));
            this.f854d.a(new ComponentActivity$6(this));
        }
        return this.f856g;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.f859j.a(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public final void onBackPressed() {
        h().b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f860k.iterator();
        while (it.hasNext()) {
            ((F.i) it.next()).a(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f855e.b(bundle);
        C0041a aVar = this.b;
        aVar.getClass();
        aVar.b = this;
        Iterator it = aVar.f825a.iterator();
        while (it.hasNext()) {
            ((C0042b) it.next()).a();
        }
        super.onCreate(bundle);
        int i2 = androidx.lifecycle.E.b;
        C.b(this);
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f853c.f194c).iterator();
        if (!it.hasNext()) {
            return true;
        }
        throw A.g.e(it);
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f853c.f194c).iterator();
        if (!it.hasNext()) {
            return false;
        }
        throw A.g.e(it);
    }

    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        super.onMultiWindowModeChanged(z2, configuration);
        Iterator it = this.f863n.iterator();
        while (it.hasNext()) {
            i.e("newConfig", configuration);
            ((F.i) it.next()).a(new Object());
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f862m.iterator();
        while (it.hasNext()) {
            ((F.i) it.next()).a(intent);
        }
    }

    public void onPanelClosed(int i2, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f853c.f194c).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i2, menu);
            return;
        }
        throw A.g.e(it);
    }

    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        super.onPictureInPictureModeChanged(z2, configuration);
        Iterator it = this.f864o.iterator();
        while (it.hasNext()) {
            i.e("newConfig", configuration);
            ((F.i) it.next()).a(new Object());
        }
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f853c.f194c).iterator();
        if (!it.hasNext()) {
            return true;
        }
        throw A.g.e(it);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (!this.f859j.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, androidx.activity.i] */
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        K k2 = this.f;
        if (k2 == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            k2 = iVar.f849a;
        }
        if (k2 == null) {
            return null;
        }
        ? obj = new Object();
        obj.f849a = k2;
        return obj;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        t tVar = this.f854d;
        if (tVar != null) {
            tVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.f855e.c(bundle);
    }

    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.f861l.iterator();
        while (it.hasNext()) {
            ((F.i) it.next()).a(Integer.valueOf(i2));
        }
    }

    public final void reportFullyDrawn() {
        try {
            if (l.C()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            l lVar = this.f858i;
            synchronized (lVar.b) {
                lVar.f865a = true;
                ArrayList arrayList = (ArrayList) lVar.f866c;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((T0.a) obj).a();
                }
                ((ArrayList) lVar.f866c).clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
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
        View decorView5 = getWindow().getDecorView();
        i.e("<this>", decorView5);
        decorView5.setTag(R.id.MT_Bin, this);
        View decorView6 = getWindow().getDecorView();
        j jVar = this.f857h;
        if (!jVar.f851h) {
            jVar.f851h = true;
            decorView6.getViewTreeObserver().addOnDrawListener(jVar);
        }
        super.setContentView(view);
    }
}
