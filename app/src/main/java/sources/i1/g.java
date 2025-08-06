package i1;

import A.j;
import d1.A;
import d1.C;
import d1.C0109b;
import d1.F;
import d1.G;
import d1.H;
import d1.r;
import d1.t;
import d1.z;
import g1.f;
import h1.c;
import h1.e;
import h1.h;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;
import o1.o;
import o1.p;
import o1.q;
import o1.u;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public final z f3025a;
    public final f b;

    /* renamed from: c  reason: collision with root package name */
    public final q f3026c;

    /* renamed from: d  reason: collision with root package name */
    public final p f3027d;

    /* renamed from: e  reason: collision with root package name */
    public int f3028e = 0;
    public long f = 262144;

    public g(z zVar, f fVar, q qVar, p pVar) {
        this.f3025a = zVar;
        this.b = fVar;
        this.f3026c = qVar;
        this.f3027d = pVar;
    }

    public final u a(C c2, long j2) {
        if ("chunked".equalsIgnoreCase(c2.f2232c.a("Transfer-Encoding"))) {
            if (this.f3028e == 1) {
                this.f3028e = 2;
                return new b(this);
            }
            throw new IllegalStateException("state: " + this.f3028e);
        } else if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f3028e == 1) {
            this.f3028e = 2;
            return new d(this, j2);
        } else {
            throw new IllegalStateException("state: " + this.f3028e);
        }
    }

    public final void b() {
        this.f3027d.flush();
    }

    public final H c(G g2) {
        f fVar = this.b;
        fVar.f2890e.getClass();
        g2.l("Content-Type");
        if (!e.b(g2)) {
            e g3 = g(0);
            Logger logger = o.f3758a;
            return new H(0, new q(g3), 1);
        } else if ("chunked".equalsIgnoreCase(g2.l("Transfer-Encoding"))) {
            t tVar = g2.f.f2231a;
            if (this.f3028e == 4) {
                this.f3028e = 5;
                c cVar = new c(this, tVar);
                Logger logger2 = o.f3758a;
                return new H(-1, new q(cVar), 1);
            }
            throw new IllegalStateException("state: " + this.f3028e);
        } else {
            long a2 = e.a(g2);
            if (a2 != -1) {
                e g4 = g(a2);
                Logger logger3 = o.f3758a;
                return new H(a2, new q(g4), 1);
            } else if (this.f3028e == 4) {
                this.f3028e = 5;
                fVar.e();
                a aVar = new a(this);
                Logger logger4 = o.f3758a;
                return new H(-1, new q(aVar), 1);
            } else {
                throw new IllegalStateException("state: " + this.f3028e);
            }
        }
    }

    public final void d() {
        this.f3027d.flush();
    }

    public final F e(boolean z2) {
        q qVar = this.f3026c;
        int i2 = this.f3028e;
        if (i2 == 1 || i2 == 3) {
            try {
                String s2 = qVar.s(this.f);
                this.f -= (long) s2.length();
                h c2 = h.c(s2);
                int i3 = c2.b;
                F f2 = new F();
                f2.b = (A) c2.f2923c;
                f2.f2241c = i3;
                f2.f2242d = (String) c2.f2924d;
                j jVar = new j(23);
                while (true) {
                    String s3 = qVar.s(this.f);
                    this.f -= (long) s3.length();
                    if (s3.length() == 0) {
                        break;
                    }
                    C0109b.f2283e.getClass();
                    jVar.s(s3);
                }
                ArrayList arrayList = (ArrayList) jVar.b;
                j jVar2 = new j(23);
                Collections.addAll((ArrayList) jVar2.b, (String[]) arrayList.toArray(new String[arrayList.size()]));
                f2.f = jVar2;
                if (z2 && i3 == 100) {
                    return null;
                }
                if (i3 == 100) {
                    this.f3028e = 3;
                    return f2;
                }
                this.f3028e = 4;
                return f2;
            } catch (EOFException e2) {
                IOException iOException = new IOException("unexpected end of stream on " + this.b);
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f3028e);
        }
    }

    public final void f(C c2) {
        Proxy.Type type = this.b.a().f2868c.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(c2.b);
        sb.append(' ');
        t tVar = c2.f2231a;
        if (tVar.f2366a.equals("https") || type != Proxy.Type.HTTP) {
            String str = tVar.f2371h;
            int indexOf = str.indexOf(47, tVar.f2366a.length() + 3);
            String substring = str.substring(indexOf, e1.c.i(str, indexOf, str.length(), "?#"));
            String e2 = tVar.e();
            if (e2 != null) {
                substring = substring + '?' + e2;
            }
            sb.append(substring);
        } else {
            sb.append(tVar);
        }
        sb.append(" HTTP/1.1");
        h(c2.f2232c, sb.toString());
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [i1.a, i1.e] */
    public final e g(long j2) {
        if (this.f3028e == 4) {
            this.f3028e = 5;
            ? aVar = new a(this);
            aVar.f3023j = j2;
            if (j2 == 0) {
                aVar.k(true, (IOException) null);
            }
            return aVar;
        }
        throw new IllegalStateException("state: " + this.f3028e);
    }

    public final void h(r rVar, String str) {
        if (this.f3028e == 0) {
            p pVar = this.f3027d;
            pVar.h(str);
            pVar.h("\r\n");
            int d2 = rVar.d();
            for (int i2 = 0; i2 < d2; i2++) {
                pVar.h(rVar.b(i2));
                pVar.h(": ");
                pVar.h(rVar.e(i2));
                pVar.h("\r\n");
            }
            pVar.h("\r\n");
            this.f3028e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f3028e);
    }
}
