package androidx.fragment.app;

import C.a;
import E.d;
import K0.l;
import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import e.x;
import j.C0216t;
import java.util.HashSet;
import n.k;

/* renamed from: androidx.fragment.app.f  reason: case insensitive filesystem */
public abstract class C0049f {

    /* renamed from: a  reason: collision with root package name */
    public Object f1310a;
    public Object b;

    public C0049f(Context context) {
        this.f1310a = context;
    }

    public void c() {
        l lVar = (l) this.f1310a;
        if (lVar != null) {
            try {
                ((x) this.b).f2592k.unregisterReceiver(lVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1310a = null;
        }
    }

    public void d() {
        N n2 = (N) this.f1310a;
        HashSet hashSet = n2.f1269e;
        if (hashSet.remove((d) this.b) && hashSet.isEmpty()) {
            n2.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof a)) {
            return menuItem;
        }
        a aVar = (a) menuItem;
        if (((k) this.b) == null) {
            this.b = new k();
        }
        MenuItem menuItem2 = (MenuItem) ((k) this.b).getOrDefault(aVar, (Object) null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0216t tVar = new C0216t((Context) this.f1310a, aVar);
        ((k) this.b).put(aVar, tVar);
        return tVar;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() != 0) {
            if (((l) this.f1310a) == null) {
                this.f1310a = new l(this);
            }
            ((x) this.b).f2592k.registerReceiver((l) this.f1310a, e2);
        }
    }

    public C0049f(N n2, d dVar) {
        this.f1310a = n2;
        this.b = dVar;
    }

    public C0049f(x xVar) {
        this.b = xVar;
    }
}
