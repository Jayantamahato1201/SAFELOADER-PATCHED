package androidx.fragment.app;

import U0.i;
import X.a;
import X.b;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.l;
import androidx.lifecycle.C0066h;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.x;
import c0.C0106d;
import c0.e;
import com.cheatbox.R;
import e.C0137h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.fragment.app.o  reason: case insensitive filesystem */
public abstract class C0058o implements ComponentCallbacks, View.OnCreateContextMenuListener, r, L, C0066h, e {

    /* renamed from: Q  reason: collision with root package name */
    public static final Object f1342Q = new Object();

    /* renamed from: A  reason: collision with root package name */
    public boolean f1343A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f1344B = true;

    /* renamed from: C  reason: collision with root package name */
    public boolean f1345C;
    public ViewGroup D;

    /* renamed from: E  reason: collision with root package name */
    public View f1346E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f1347F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f1348G = true;

    /* renamed from: H  reason: collision with root package name */
    public C0057n f1349H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f1350I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f1351J;

    /* renamed from: K  reason: collision with root package name */
    public m f1352K = m.f1434j;

    /* renamed from: L  reason: collision with root package name */
    public t f1353L;

    /* renamed from: M  reason: collision with root package name */
    public K f1354M;

    /* renamed from: N  reason: collision with root package name */
    public final x f1355N = new x();

    /* renamed from: O  reason: collision with root package name */
    public l f1356O;

    /* renamed from: P  reason: collision with root package name */
    public final ArrayList f1357P;

    /* renamed from: a  reason: collision with root package name */
    public int f1358a = -1;
    public Bundle b;

    /* renamed from: c  reason: collision with root package name */
    public SparseArray f1359c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f1360d;

    /* renamed from: e  reason: collision with root package name */
    public String f1361e = UUID.randomUUID().toString();
    public Bundle f;

    /* renamed from: g  reason: collision with root package name */
    public C0058o f1362g;

    /* renamed from: h  reason: collision with root package name */
    public String f1363h = null;

    /* renamed from: i  reason: collision with root package name */
    public int f1364i;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f1365j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1366k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1367l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1368m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1369n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1370o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1371p;

    /* renamed from: q  reason: collision with root package name */
    public int f1372q;

    /* renamed from: r  reason: collision with root package name */
    public D f1373r;

    /* renamed from: s  reason: collision with root package name */
    public r f1374s;

    /* renamed from: t  reason: collision with root package name */
    public D f1375t = new D();

    /* renamed from: u  reason: collision with root package name */
    public C0058o f1376u;

    /* renamed from: v  reason: collision with root package name */
    public int f1377v;

    /* renamed from: w  reason: collision with root package name */
    public int f1378w;

    /* renamed from: x  reason: collision with root package name */
    public String f1379x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1380y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1381z;

    public C0058o() {
        new AtomicInteger();
        this.f1357P = new ArrayList();
        this.f1353L = new t(this);
        this.f1356O = new l(this);
    }

    public final b a() {
        return a.b;
    }

    public final C0106d b() {
        return (C0106d) this.f1356O.f866c;
    }

    public Q0.l c() {
        return new C0056m(this);
    }

    public final K d() {
        if (this.f1373r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (i() != 1) {
            HashMap hashMap = this.f1373r.f1197F.f1232e;
            K k2 = (K) hashMap.get(this.f1361e);
            if (k2 != null) {
                return k2;
            }
            K k3 = new K();
            hashMap.put(this.f1361e, k3);
            return k3;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final t e() {
        return this.f1353L;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.fragment.app.n, java.lang.Object] */
    public final C0057n f() {
        if (this.f1349H == null) {
            ? obj = new Object();
            Object obj2 = f1342Q;
            obj.f1337g = obj2;
            obj.f1338h = obj2;
            obj.f1339i = obj2;
            obj.f1340j = 1.0f;
            obj.f1341k = null;
            this.f1349H = obj;
        }
        return this.f1349H;
    }

    public final D g() {
        if (this.f1374s != null) {
            return this.f1375t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        r rVar = this.f1374s;
        if (rVar == null) {
            return null;
        }
        return rVar.f1385m;
    }

    public final int i() {
        m mVar = this.f1352K;
        if (mVar == m.f1431g || this.f1376u == null) {
            return mVar.ordinal();
        }
        return Math.min(mVar.ordinal(), this.f1376u.i());
    }

    public final D j() {
        D d2 = this.f1373r;
        if (d2 != null) {
            return d2;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k(int i2, int i3, Intent intent) {
        if (D.D(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void l(C0137h hVar) {
        C0137h hVar2;
        this.f1345C = true;
        r rVar = this.f1374s;
        if (rVar == null) {
            hVar2 = null;
        } else {
            hVar2 = rVar.f1384l;
        }
        if (hVar2 != null) {
            this.f1345C = true;
        }
    }

    public void m(Bundle bundle) {
        Parcelable parcelable;
        this.f1345C = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.f1375t.N(parcelable);
            D d2 = this.f1375t;
            d2.f1221y = false;
            d2.f1222z = false;
            d2.f1197F.f1234h = false;
            d2.s(1);
        }
        D d3 = this.f1375t;
        if (d3.f1209m < 1) {
            d3.f1221y = false;
            d3.f1222z = false;
            d3.f1197F.f1234h = false;
            d3.s(1);
        }
    }

    public View n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void o() {
        this.f1345C = true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f1345C = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0137h hVar;
        r rVar = this.f1374s;
        if (rVar == null) {
            hVar = null;
        } else {
            hVar = rVar.f1384l;
        }
        if (hVar != null) {
            hVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final void onLowMemory() {
        this.f1345C = true;
    }

    public void p() {
        this.f1345C = true;
    }

    public LayoutInflater q(Bundle bundle) {
        r rVar = this.f1374s;
        if (rVar != null) {
            C0137h hVar = rVar.f1388p;
            LayoutInflater cloneInContext = hVar.getLayoutInflater().cloneInContext(hVar);
            cloneInContext.setFactory2(this.f1375t.f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public abstract void r(Bundle bundle);

    public void s() {
        this.f1345C = true;
    }

    public void t() {
        this.f1345C = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1361e);
        if (this.f1377v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1377v));
        }
        if (this.f1379x != null) {
            sb.append(" tag=");
            sb.append(this.f1379x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(Bundle bundle) {
        this.f1345C = true;
    }

    public void v(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1375t.I();
        this.f1371p = true;
        this.f1354M = new K(d());
        View n2 = n(layoutInflater, viewGroup);
        this.f1346E = n2;
        if (n2 != null) {
            this.f1354M.f();
            View view = this.f1346E;
            K k2 = this.f1354M;
            i.e("<this>", view);
            view.setTag(R.id.MT_Bin, k2);
            View view2 = this.f1346E;
            K k3 = this.f1354M;
            i.e("<this>", view2);
            view2.setTag(R.id.MT_Bin, k3);
            View view3 = this.f1346E;
            K k4 = this.f1354M;
            i.e("<this>", view3);
            view3.setTag(R.id.MT_Bin, k4);
            this.f1355N.e(this.f1354M);
        } else if (this.f1354M.b == null) {
            this.f1354M = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final Context w() {
        Context h2 = h();
        if (h2 != null) {
            return h2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View x() {
        View view = this.f1346E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void y(int i2, int i3, int i4, int i5) {
        if (this.f1349H != null || i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
            f().b = i2;
            f().f1334c = i3;
            f().f1335d = i4;
            f().f1336e = i5;
        }
    }

    public final void z(Bundle bundle) {
        D d2 = this.f1373r;
        if (d2 == null || (!d2.f1221y && !d2.f1222z)) {
            this.f = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }
}
