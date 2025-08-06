package androidx.fragment.app;

import X.a;
import X.b;
import androidx.activity.l;
import androidx.lifecycle.C0066h;
import androidx.lifecycle.C0070l;
import androidx.lifecycle.L;
import androidx.lifecycle.t;
import c0.C0106d;
import c0.e;

public final class K implements C0066h, e, L {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.K f1261a;
    public t b = null;

    /* renamed from: c  reason: collision with root package name */
    public l f1262c = null;

    public K(androidx.lifecycle.K k2) {
        this.f1261a = k2;
    }

    public final b a() {
        return a.b;
    }

    public final C0106d b() {
        f();
        return (C0106d) this.f1262c.f866c;
    }

    public final void c(C0070l lVar) {
        this.b.d(lVar);
    }

    public final androidx.lifecycle.K d() {
        f();
        return this.f1261a;
    }

    public final t e() {
        f();
        return this.b;
    }

    public final void f() {
        if (this.b == null) {
            this.b = new t(this);
            this.f1262c = new l(this);
        }
    }
}
