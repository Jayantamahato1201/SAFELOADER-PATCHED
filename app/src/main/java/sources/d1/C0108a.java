package d1;

import A.g;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import n1.c;

/* renamed from: d1.a  reason: case insensitive filesystem */
public final class C0108a {

    /* renamed from: a  reason: collision with root package name */
    public final t f2272a;
    public final C0109b b;

    /* renamed from: c  reason: collision with root package name */
    public final SocketFactory f2273c;

    /* renamed from: d  reason: collision with root package name */
    public final C0109b f2274d;

    /* renamed from: e  reason: collision with root package name */
    public final List f2275e;
    public final List f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f2276g;

    /* renamed from: h  reason: collision with root package name */
    public final SSLSocketFactory f2277h;

    /* renamed from: i  reason: collision with root package name */
    public final c f2278i;

    /* renamed from: j  reason: collision with root package name */
    public final C0117j f2279j;

    public C0108a(String str, int i2, C0109b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, c cVar, C0117j jVar, C0109b bVar2, List list, List list2, ProxySelector proxySelector) {
        C0109b bVar3 = bVar2;
        ProxySelector proxySelector2 = proxySelector;
        s sVar = new s();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            sVar.f2359a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            sVar.f2359a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        if (str != null) {
            String b2 = e1.c.b(t.h(str, 0, str.length(), false));
            if (b2 != null) {
                sVar.f2361d = b2;
                if (i2 <= 0 || i2 > 65535) {
                    throw new IllegalArgumentException(g.f(i2, "unexpected port: "));
                }
                sVar.f2362e = i2;
                this.f2272a = sVar.a();
                if (bVar != null) {
                    this.b = bVar;
                    if (socketFactory != null) {
                        this.f2273c = socketFactory;
                        if (bVar3 != null) {
                            this.f2274d = bVar3;
                            if (list != null) {
                                this.f2275e = e1.c.l(list);
                                if (list2 != null) {
                                    this.f = e1.c.l(list2);
                                    if (proxySelector2 != null) {
                                        this.f2276g = proxySelector2;
                                        this.f2277h = sSLSocketFactory;
                                        this.f2278i = cVar;
                                        this.f2279j = jVar;
                                        return;
                                    }
                                    throw new NullPointerException("proxySelector == null");
                                }
                                throw new NullPointerException("connectionSpecs == null");
                            }
                            throw new NullPointerException("protocols == null");
                        }
                        throw new NullPointerException("proxyAuthenticator == null");
                    }
                    throw new NullPointerException("socketFactory == null");
                }
                throw new NullPointerException("dns == null");
            }
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        throw new NullPointerException("host == null");
    }

    public final boolean a(C0108a aVar) {
        if (!this.b.equals(aVar.b) || !this.f2274d.equals(aVar.f2274d) || !this.f2275e.equals(aVar.f2275e) || !this.f.equals(aVar.f) || !this.f2276g.equals(aVar.f2276g) || !e1.c.j((Object) null, (Object) null) || !e1.c.j(this.f2277h, aVar.f2277h) || !e1.c.j(this.f2278i, aVar.f2278i) || !e1.c.j(this.f2279j, aVar.f2279j) || this.f2272a.f2369e != aVar.f2272a.f2369e) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0108a)) {
            return false;
        }
        C0108a aVar = (C0108a) obj;
        if (!this.f2272a.equals(aVar.f2272a) || !a(aVar)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int hashCode = this.b.hashCode();
        int hashCode2 = this.f2274d.hashCode();
        int hashCode3 = this.f2275e.hashCode();
        int hashCode4 = this.f.hashCode();
        int hashCode5 = (this.f2276g.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f2272a.f2371h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961;
        int i4 = 0;
        SSLSocketFactory sSLSocketFactory = this.f2277h;
        if (sSLSocketFactory != null) {
            i2 = sSLSocketFactory.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode5 + i2) * 31;
        c cVar = this.f2278i;
        if (cVar != null) {
            i3 = cVar.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        C0117j jVar = this.f2279j;
        if (jVar != null) {
            i4 = jVar.hashCode();
        }
        return i6 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        t tVar = this.f2272a;
        sb.append(tVar.f2368d);
        sb.append(":");
        sb.append(tVar.f2369e);
        sb.append(", proxySelector=");
        sb.append(this.f2276g);
        sb.append("}");
        return sb.toString();
    }
}
