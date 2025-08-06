package d1;

import A.j;
import e1.c;
import h1.e;
import h1.h;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import l1.g;
import o1.d;
import o1.o;
import o1.p;
import o1.q;
import o1.u;
import o1.v;

/* renamed from: d1.g  reason: case insensitive filesystem */
public final class C0114g {

    /* renamed from: k  reason: collision with root package name */
    public static final String f2293k = "OkHttp-Sent-Millis";

    /* renamed from: l  reason: collision with root package name */
    public static final String f2294l = "OkHttp-Received-Millis";

    /* renamed from: a  reason: collision with root package name */
    public final String f2295a;
    public final r b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2296c;

    /* renamed from: d  reason: collision with root package name */
    public final A f2297d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2298e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final r f2299g;

    /* renamed from: h  reason: collision with root package name */
    public final q f2300h;

    /* renamed from: i  reason: collision with root package name */
    public final long f2301i;

    /* renamed from: j  reason: collision with root package name */
    public final long f2302j;

    static {
        g gVar = g.f3649a;
        gVar.getClass();
        gVar.getClass();
    }

    public C0114g(v vVar) {
        K k2;
        try {
            Logger logger = o.f3758a;
            q qVar = new q(vVar);
            this.f2295a = qVar.s(Long.MAX_VALUE);
            this.f2296c = qVar.s(Long.MAX_VALUE);
            j jVar = new j(23);
            int k3 = C0115h.k(qVar);
            for (int i2 = 0; i2 < k3; i2++) {
                jVar.s(qVar.s(Long.MAX_VALUE));
            }
            this.b = new r(jVar);
            h c2 = h.c(qVar.s(Long.MAX_VALUE));
            this.f2297d = (A) c2.f2923c;
            this.f2298e = c2.b;
            this.f = (String) c2.f2924d;
            j jVar2 = new j(23);
            int k4 = C0115h.k(qVar);
            for (int i3 = 0; i3 < k4; i3++) {
                jVar2.s(qVar.s(Long.MAX_VALUE));
            }
            String str = f2293k;
            String y2 = jVar2.y(str);
            String str2 = f2294l;
            String y3 = jVar2.y(str2);
            jVar2.C(str);
            jVar2.C(str2);
            long j2 = 0;
            this.f2301i = y2 != null ? Long.parseLong(y2) : 0;
            this.f2302j = y3 != null ? Long.parseLong(y3) : j2;
            this.f2299g = new r(jVar2);
            if (this.f2295a.startsWith("https://")) {
                String s2 = qVar.s(Long.MAX_VALUE);
                if (s2.length() <= 0) {
                    l a2 = l.a(qVar.s(Long.MAX_VALUE));
                    List a3 = a(qVar);
                    List a4 = a(qVar);
                    if (!qVar.k()) {
                        k2 = K.a(qVar.s(Long.MAX_VALUE));
                    } else {
                        k2 = K.f2270k;
                    }
                    this.f2300h = new q(k2, a2, c.l(a3), c.l(a4));
                } else {
                    throw new IOException("expected \"\" but was \"" + s2 + "\"");
                }
            } else {
                this.f2300h = null;
            }
        } finally {
            vVar.close();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [o1.g, java.lang.Object, o1.e] */
    public static List a(q qVar) {
        int k2 = C0115h.k(qVar);
        if (k2 == -1) {
            return Collections.EMPTY_LIST;
        }
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(k2);
            int i2 = 0;
            while (i2 < k2) {
                String s2 = qVar.s(Long.MAX_VALUE);
                ? obj = new Object();
                o1.h b2 = o1.h.b(s2);
                if (b2 != null) {
                    b2.p(obj);
                    arrayList.add(instance.generateCertificate(new d(obj, 0)));
                    i2++;
                } else {
                    throw new IllegalArgumentException("byteString == null");
                }
            }
            return arrayList;
        } catch (CertificateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static void b(p pVar, List list) {
        try {
            pVar.i((long) list.size());
            pVar.j(10);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                pVar.h(o1.h.i(((Certificate) list.get(i2)).getEncoded()).a());
                pVar.j(10);
            }
        } catch (CertificateEncodingException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public final void c(f1.d dVar) {
        String str;
        u d2 = dVar.d(0);
        Logger logger = o.f3758a;
        p pVar = new p(d2);
        String str2 = this.f2295a;
        pVar.h(str2);
        pVar.j(10);
        pVar.h(this.f2296c);
        pVar.j(10);
        r rVar = this.b;
        pVar.i((long) rVar.d());
        pVar.j(10);
        int d3 = rVar.d();
        for (int i2 = 0; i2 < d3; i2++) {
            pVar.h(rVar.b(i2));
            pVar.h(": ");
            pVar.h(rVar.e(i2));
            pVar.j(10);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2297d == A.f2221g) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.f2298e);
        String str3 = this.f;
        if (str3 != null) {
            sb.append(' ');
            sb.append(str3);
        }
        pVar.h(sb.toString());
        pVar.j(10);
        r rVar2 = this.f2299g;
        pVar.i((long) (rVar2.d() + 2));
        pVar.j(10);
        int d4 = rVar2.d();
        for (int i3 = 0; i3 < d4; i3++) {
            pVar.h(rVar2.b(i3));
            pVar.h(": ");
            pVar.h(rVar2.e(i3));
            pVar.j(10);
        }
        pVar.h(f2293k);
        pVar.h(": ");
        pVar.i(this.f2301i);
        pVar.j(10);
        pVar.h(f2294l);
        pVar.h(": ");
        pVar.i(this.f2302j);
        pVar.j(10);
        if (str2.startsWith("https://")) {
            pVar.j(10);
            q qVar = this.f2300h;
            pVar.h(qVar.b.f2331a);
            pVar.j(10);
            b(pVar, qVar.f2356c);
            b(pVar, qVar.f2357d);
            pVar.h(qVar.f2355a.f);
            pVar.j(10);
        }
        pVar.close();
    }

    public C0114g(G g2) {
        r rVar;
        C c2 = g2.f;
        this.f2295a = c2.f2231a.f2371h;
        int i2 = e.f2910a;
        r rVar2 = g2.f2256m.f.f2232c;
        r rVar3 = g2.f2254k;
        Set f2 = e.f(rVar3);
        if (f2.isEmpty()) {
            rVar = new r(new j(23));
        } else {
            j jVar = new j(23);
            int d2 = rVar2.d();
            for (int i3 = 0; i3 < d2; i3++) {
                String b2 = rVar2.b(i3);
                if (f2.contains(b2)) {
                    String e2 = rVar2.e(i3);
                    j.u(b2, e2);
                    jVar.t(b2, e2);
                }
            }
            rVar = new r(jVar);
        }
        this.b = rVar;
        this.f2296c = c2.b;
        this.f2297d = g2.f2250g;
        this.f2298e = g2.f2251h;
        this.f = g2.f2252i;
        this.f2299g = rVar3;
        this.f2300h = g2.f2253j;
        this.f2301i = g2.f2259p;
        this.f2302j = g2.f2260q;
    }
}
