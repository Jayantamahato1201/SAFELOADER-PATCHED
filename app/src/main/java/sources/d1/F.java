package d1;

import A.j;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    public C f2240a;
    public A b;

    /* renamed from: c  reason: collision with root package name */
    public int f2241c = -1;

    /* renamed from: d  reason: collision with root package name */
    public String f2242d;

    /* renamed from: e  reason: collision with root package name */
    public q f2243e;
    public j f = new j(23);

    /* renamed from: g  reason: collision with root package name */
    public I f2244g;

    /* renamed from: h  reason: collision with root package name */
    public G f2245h;

    /* renamed from: i  reason: collision with root package name */
    public G f2246i;

    /* renamed from: j  reason: collision with root package name */
    public G f2247j;

    /* renamed from: k  reason: collision with root package name */
    public long f2248k;

    /* renamed from: l  reason: collision with root package name */
    public long f2249l;

    public static void b(String str, G g2) {
        if (g2.f2255l != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        } else if (g2.f2256m != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        } else if (g2.f2257n != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        } else if (g2.f2258o != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    public final G a() {
        if (this.f2240a == null) {
            throw new IllegalStateException("request == null");
        } else if (this.b == null) {
            throw new IllegalStateException("protocol == null");
        } else if (this.f2241c < 0) {
            throw new IllegalStateException("code < 0: " + this.f2241c);
        } else if (this.f2242d != null) {
            return new G(this);
        } else {
            throw new IllegalStateException("message == null");
        }
    }
}
