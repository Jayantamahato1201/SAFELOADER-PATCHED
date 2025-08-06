package j1;

import java.util.logging.Level;
import java.util.logging.Logger;
import o1.e;
import o1.q;
import o1.v;
import o1.x;

public final class t implements v, AutoCloseable {
    public final q f;

    /* renamed from: g  reason: collision with root package name */
    public int f3283g;

    /* renamed from: h  reason: collision with root package name */
    public byte f3284h;

    /* renamed from: i  reason: collision with root package name */
    public int f3285i;

    /* renamed from: j  reason: collision with root package name */
    public int f3286j;

    /* renamed from: k  reason: collision with root package name */
    public short f3287k;

    public t(q qVar) {
        this.f = qVar;
    }

    public final x a() {
        return this.f.f3761g.a();
    }

    public final long f(e eVar, long j2) {
        int i2;
        int q2;
        do {
            int i3 = this.f3286j;
            q qVar = this.f;
            if (i3 == 0) {
                qVar.v((long) this.f3287k);
                this.f3287k = 0;
                if ((this.f3284h & 4) == 0) {
                    i2 = this.f3285i;
                    int r2 = u.r(qVar);
                    this.f3286j = r2;
                    this.f3283g = r2;
                    byte n2 = (byte) (qVar.n() & 255);
                    this.f3284h = (byte) (qVar.n() & 255);
                    Logger logger = u.f3288j;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(f.a(true, this.f3285i, this.f3283g, n2, this.f3284h));
                    }
                    q2 = qVar.q() & Integer.MAX_VALUE;
                    this.f3285i = q2;
                    if (n2 != 9) {
                        f.c("%s != TYPE_CONTINUATION", Byte.valueOf(n2));
                        throw null;
                    }
                }
            } else {
                long f2 = qVar.f(eVar, Math.min(8192, (long) i3));
                if (f2 != -1) {
                    this.f3286j = (int) (((long) this.f3286j) - f2);
                    return f2;
                }
            }
            return -1;
        } while (q2 == i2);
        f.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    public final void close() {
    }
}
