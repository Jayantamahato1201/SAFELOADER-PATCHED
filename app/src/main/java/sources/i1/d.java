package i1;

import e1.c;
import java.net.ProtocolException;
import o1.e;
import o1.k;
import o1.u;
import o1.x;

public final class d implements u, AutoCloseable {
    public final k f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3020g;

    /* renamed from: h  reason: collision with root package name */
    public long f3021h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g f3022i;

    public d(g gVar, long j2) {
        this.f3022i = gVar;
        this.f = new k(gVar.f3027d.f3759g.a());
        this.f3021h = j2;
    }

    public final x a() {
        return this.f;
    }

    public final void close() {
        if (!this.f3020g) {
            this.f3020g = true;
            if (this.f3021h <= 0) {
                g gVar = this.f3022i;
                gVar.getClass();
                k kVar = this.f;
                x xVar = kVar.f3750e;
                kVar.f3750e = x.f3772d;
                xVar.a();
                xVar.b();
                gVar.f3028e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }
    }

    public final void flush() {
        if (!this.f3020g) {
            this.f3022i.f3027d.flush();
        }
    }

    public final void g(e eVar, long j2) {
        if (!this.f3020g) {
            long j3 = eVar.f3745g;
            byte[] bArr = c.f2613a;
            if (j2 < 0 || 0 > j3 || j3 < j2) {
                throw new ArrayIndexOutOfBoundsException();
            } else if (j2 <= this.f3021h) {
                this.f3022i.f3027d.g(eVar, j2);
                this.f3021h -= j2;
            } else {
                throw new ProtocolException("expected " + this.f3021h + " bytes but received " + j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }
}
