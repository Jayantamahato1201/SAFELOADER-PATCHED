package i1;

import g1.f;
import java.io.IOException;
import o1.e;
import o1.k;
import o1.v;
import o1.x;

public abstract class a implements v {
    public final k f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3011g;

    /* renamed from: h  reason: collision with root package name */
    public long f3012h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g f3013i;

    public a(g gVar) {
        this.f3013i = gVar;
        this.f = new k(gVar.f3026c.f3761g.a());
    }

    public final x a() {
        return this.f;
    }

    public long f(e eVar, long j2) {
        try {
            long f2 = this.f3013i.f3026c.f(eVar, j2);
            if (f2 <= 0) {
                return f2;
            }
            this.f3012h += f2;
            return f2;
        } catch (IOException e2) {
            k(false, e2);
            throw e2;
        }
    }

    public final void k(boolean z2, IOException iOException) {
        g gVar = this.f3013i;
        int i2 = gVar.f3028e;
        if (i2 != 6) {
            if (i2 == 5) {
                k kVar = this.f;
                x xVar = kVar.f3750e;
                kVar.f3750e = x.f3772d;
                xVar.a();
                xVar.b();
                gVar.f3028e = 6;
                f fVar = gVar.b;
                if (fVar != null) {
                    fVar.h(!z2, gVar, iOException);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + gVar.f3028e);
        }
    }
}
