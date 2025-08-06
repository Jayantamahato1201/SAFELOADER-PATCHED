package h1;

import Q0.l;
import d1.C;
import d1.F;
import d1.G;
import d1.I;
import d1.u;
import g1.f;
import java.net.ProtocolException;
import java.util.logging.Logger;
import o1.i;
import o1.o;
import o1.p;

public final class b implements u {
    public final G a(f fVar) {
        l lVar;
        long currentTimeMillis = System.currentTimeMillis();
        fVar.f2916h.getClass();
        c cVar = fVar.f2912c;
        C c2 = fVar.f;
        cVar.f(c2);
        boolean Q2 = l.Q(c2.b);
        f fVar2 = fVar.b;
        F f = null;
        if (Q2 && (lVar = c2.f2233d) != null) {
            if ("100-continue".equalsIgnoreCase(c2.f2232c.a("Expect"))) {
                cVar.d();
                f = cVar.e(true);
            }
            if (f == null) {
                i iVar = new i(cVar.a(c2, lVar.r()));
                Logger logger = o.f3758a;
                p pVar = new p(iVar);
                lVar.e0(pVar);
                pVar.close();
            } else if (fVar.f2913d.f2872h == null) {
                fVar2.e();
            }
        }
        cVar.b();
        if (f == null) {
            f = cVar.e(false);
        }
        f.f2240a = c2;
        f.f2243e = fVar2.a().f;
        f.f2248k = currentTimeMillis;
        f.f2249l = System.currentTimeMillis();
        G a2 = f.a();
        int i2 = a2.f2251h;
        if (i2 == 100) {
            F e2 = cVar.e(false);
            e2.f2240a = c2;
            e2.f2243e = fVar2.a().f;
            e2.f2248k = currentTimeMillis;
            e2.f2249l = System.currentTimeMillis();
            a2 = e2.a();
            i2 = a2.f2251h;
        }
        F m2 = a2.m();
        m2.f2244g = cVar.c(a2);
        G a3 = m2.a();
        if ("close".equalsIgnoreCase(a3.f.f2232c.a("Connection")) || "close".equalsIgnoreCase(a3.l("Connection"))) {
            fVar2.e();
        }
        if (i2 == 204 || i2 == 205) {
            I i3 = a3.f2255l;
            if (i3.k() > 0) {
                throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + i3.k());
            }
        }
        return a3;
    }
}
