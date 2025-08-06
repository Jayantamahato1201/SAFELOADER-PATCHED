package i1;

import o1.e;
import o1.k;
import o1.p;
import o1.u;
import o1.x;

public final class b implements u, AutoCloseable {
    public final k f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3014g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g f3015h;

    public b(g gVar) {
        this.f3015h = gVar;
        this.f = new k(gVar.f3027d.f3759g.a());
    }

    public final x a() {
        return this.f;
    }

    public final synchronized void close() {
        if (!this.f3014g) {
            this.f3014g = true;
            this.f3015h.f3027d.h("0\r\n\r\n");
            g gVar = this.f3015h;
            k kVar = this.f;
            gVar.getClass();
            x xVar = kVar.f3750e;
            kVar.f3750e = x.f3772d;
            xVar.a();
            xVar.b();
            this.f3015h.f3028e = 3;
        }
    }

    public final synchronized void flush() {
        if (!this.f3014g) {
            this.f3015h.f3027d.flush();
        }
    }

    public final void g(e eVar, long j2) {
        if (this.f3014g) {
            throw new IllegalStateException("closed");
        } else if (j2 != 0) {
            g gVar = this.f3015h;
            p pVar = gVar.f3027d;
            if (!pVar.f3760h) {
                pVar.f.D(j2);
                pVar.k();
                p pVar2 = gVar.f3027d;
                pVar2.h("\r\n");
                pVar2.g(eVar, j2);
                pVar2.h("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }
}
