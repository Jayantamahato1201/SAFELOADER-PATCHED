package d1;

import A.j;
import f1.b;
import h1.c;
import h1.f;
import h1.g;
import java.io.IOException;
import java.util.ArrayList;

public final class B implements Cloneable {
    public final z f;

    /* renamed from: g  reason: collision with root package name */
    public final g f2227g;

    /* renamed from: h  reason: collision with root package name */
    public C0109b f2228h;

    /* renamed from: i  reason: collision with root package name */
    public final C f2229i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2230j;

    public B(z zVar, C c2) {
        this.f = zVar;
        this.f2229i = c2;
        this.f2227g = new g(zVar);
    }

    public final G a() {
        synchronized (this) {
            if (!this.f2230j) {
                this.f2230j = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f2227g.b = l1.g.f3649a.i();
        this.f2228h.getClass();
        try {
            this.f.f.t(this);
            G b = b();
            this.f.f.v(this);
            return b;
        } catch (IOException e2) {
            this.f2228h.getClass();
            throw e2;
        } catch (Throwable th) {
            this.f.f.v(this);
            throw th;
        }
    }

    public final G b() {
        j jVar;
        ArrayList arrayList = new ArrayList();
        z zVar = this.f;
        arrayList.addAll(zVar.f2410i);
        arrayList.add(this.f2227g);
        arrayList.add(new b(2, zVar.f2414m));
        C0115h hVar = zVar.f2415n;
        if (hVar != null) {
            jVar = hVar.f;
        } else {
            jVar = null;
        }
        arrayList.add(new b(0, jVar));
        arrayList.add(new b(1, zVar));
        arrayList.addAll(zVar.f2411j);
        arrayList.add(new Object());
        C0109b bVar = this.f2228h;
        C c2 = this.f2229i;
        z zVar2 = zVar;
        return new f(arrayList, (g1.f) null, (c) null, (g1.b) null, 0, c2, this, bVar, zVar2.f2405A, zVar2.f2406B, zVar2.f2407C).a(c2);
    }

    public final Object clone() {
        C c2 = this.f2229i;
        z zVar = this.f;
        B b = new B(zVar, c2);
        zVar.f2412k.getClass();
        b.f2228h = C0109b.f2282d;
        return b;
    }
}
