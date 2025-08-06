package d1;

import Q0.l;
import e1.c;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import l1.g;

public final class z implements Cloneable {
    public static final List D = c.m(A.f2224j, A.f2222h);

    /* renamed from: E  reason: collision with root package name */
    public static final List f2404E = c.m(o.f2340e, o.f);

    /* renamed from: A  reason: collision with root package name */
    public final int f2405A;

    /* renamed from: B  reason: collision with root package name */
    public final int f2406B;

    /* renamed from: C  reason: collision with root package name */
    public final int f2407C;
    public final F.c f;

    /* renamed from: g  reason: collision with root package name */
    public final List f2408g;

    /* renamed from: h  reason: collision with root package name */
    public final List f2409h;

    /* renamed from: i  reason: collision with root package name */
    public final List f2410i;

    /* renamed from: j  reason: collision with root package name */
    public final List f2411j;

    /* renamed from: k  reason: collision with root package name */
    public final C0109b f2412k;

    /* renamed from: l  reason: collision with root package name */
    public final ProxySelector f2413l;

    /* renamed from: m  reason: collision with root package name */
    public final C0109b f2414m;

    /* renamed from: n  reason: collision with root package name */
    public final C0115h f2415n;

    /* renamed from: o  reason: collision with root package name */
    public final SocketFactory f2416o;

    /* renamed from: p  reason: collision with root package name */
    public final SSLSocketFactory f2417p;

    /* renamed from: q  reason: collision with root package name */
    public final l f2418q;

    /* renamed from: r  reason: collision with root package name */
    public final n1.c f2419r;

    /* renamed from: s  reason: collision with root package name */
    public final C0117j f2420s;

    /* renamed from: t  reason: collision with root package name */
    public final C0109b f2421t;

    /* renamed from: u  reason: collision with root package name */
    public final C0109b f2422u;

    /* renamed from: v  reason: collision with root package name */
    public final m f2423v;

    /* renamed from: w  reason: collision with root package name */
    public final C0109b f2424w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f2425x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f2426y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f2427z;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, d1.b] */
    static {
        C0109b.f2283e = new Object();
    }

    public z(y yVar) {
        boolean z2;
        this.f = yVar.f2384a;
        this.f2408g = yVar.b;
        List list = yVar.f2385c;
        this.f2409h = list;
        this.f2410i = c.l(yVar.f2386d);
        this.f2411j = c.l(yVar.f2387e);
        this.f2412k = yVar.f;
        this.f2413l = yVar.f2388g;
        this.f2414m = yVar.f2389h;
        this.f2415n = yVar.f2390i;
        this.f2416o = yVar.f2391j;
        Iterator it = list.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                o oVar = (o) it.next();
                if (z2 || oVar.f2341a) {
                    z2 = true;
                }
            }
        }
        if (!z2) {
            this.f2417p = null;
            this.f2418q = null;
        } else {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            g gVar = g.f3649a;
                            SSLContext g2 = gVar.g();
                            g2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                            this.f2417p = g2.getSocketFactory();
                            this.f2418q = gVar.c(x509TrustManager);
                        } catch (GeneralSecurityException e2) {
                            throw c.a("No System TLS", e2);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e3) {
                throw c.a("No System TLS", e3);
            }
        }
        this.f2419r = yVar.f2392k;
        l lVar = this.f2418q;
        C0117j jVar = yVar.f2393l;
        this.f2420s = !c.j(jVar.b, lVar) ? new C0117j(jVar.f2317a, lVar) : jVar;
        this.f2421t = yVar.f2394m;
        this.f2422u = yVar.f2395n;
        this.f2423v = yVar.f2396o;
        this.f2424w = yVar.f2397p;
        this.f2425x = yVar.f2398q;
        this.f2426y = yVar.f2399r;
        this.f2427z = yVar.f2400s;
        this.f2405A = yVar.f2401t;
        this.f2406B = yVar.f2402u;
        this.f2407C = yVar.f2403v;
        if (this.f2410i.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.f2410i);
        } else if (this.f2411j.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f2411j);
        }
    }
}
