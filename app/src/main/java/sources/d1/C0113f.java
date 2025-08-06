package d1;

import f1.f;
import java.util.logging.Logger;
import o1.g;
import o1.o;
import o1.q;

/* renamed from: d1.f  reason: case insensitive filesystem */
public final class C0113f extends I {
    public final f f;

    /* renamed from: g  reason: collision with root package name */
    public final q f2291g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2292h;

    public C0113f(f fVar, String str) {
        this.f = fVar;
        this.f2292h = str;
        C0112e eVar = new C0112e(fVar.f2711h[1], fVar);
        Logger logger = o.f3758a;
        this.f2291g = new q(eVar);
    }

    public final long k() {
        try {
            String str = this.f2292h;
            if (str != null) {
                return Long.parseLong(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final g l() {
        return this.f2291g;
    }
}
