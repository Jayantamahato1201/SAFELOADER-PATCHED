package d1;

import A.j;
import java.io.Closeable;

public final class G implements Closeable, AutoCloseable {
    public final C f;

    /* renamed from: g  reason: collision with root package name */
    public final A f2250g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2251h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2252i;

    /* renamed from: j  reason: collision with root package name */
    public final q f2253j;

    /* renamed from: k  reason: collision with root package name */
    public final r f2254k;

    /* renamed from: l  reason: collision with root package name */
    public final I f2255l;

    /* renamed from: m  reason: collision with root package name */
    public final G f2256m;

    /* renamed from: n  reason: collision with root package name */
    public final G f2257n;

    /* renamed from: o  reason: collision with root package name */
    public final G f2258o;

    /* renamed from: p  reason: collision with root package name */
    public final long f2259p;

    /* renamed from: q  reason: collision with root package name */
    public final long f2260q;

    /* renamed from: r  reason: collision with root package name */
    public volatile C0116i f2261r;

    public G(F f2) {
        this.f = f2.f2240a;
        this.f2250g = f2.b;
        this.f2251h = f2.f2241c;
        this.f2252i = f2.f2242d;
        this.f2253j = f2.f2243e;
        j jVar = f2.f;
        jVar.getClass();
        this.f2254k = new r(jVar);
        this.f2255l = f2.f2244g;
        this.f2256m = f2.f2245h;
        this.f2257n = f2.f2246i;
        this.f2258o = f2.f2247j;
        this.f2259p = f2.f2248k;
        this.f2260q = f2.f2249l;
    }

    public final void close() {
        I i2 = this.f2255l;
        if (i2 != null) {
            i2.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final C0116i k() {
        C0116i iVar = this.f2261r;
        if (iVar != null) {
            return iVar;
        }
        C0116i a2 = C0116i.a(this.f2254k);
        this.f2261r = a2;
        return a2;
    }

    public final String l(String str) {
        String a2 = this.f2254k.a(str);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, d1.F] */
    public final F m() {
        ? obj = new Object();
        obj.f2240a = this.f;
        obj.b = this.f2250g;
        obj.f2241c = this.f2251h;
        obj.f2242d = this.f2252i;
        obj.f2243e = this.f2253j;
        obj.f = this.f2254k.c();
        obj.f2244g = this.f2255l;
        obj.f2245h = this.f2256m;
        obj.f2246i = this.f2257n;
        obj.f2247j = this.f2258o;
        obj.f2248k = this.f2259p;
        obj.f2249l = this.f2260q;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2250g + ", code=" + this.f2251h + ", message=" + this.f2252i + ", url=" + this.f.f2231a + '}';
    }
}
