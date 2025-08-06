package f1;

import d1.C0111d;
import e1.c;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o1.e;
import o1.g;
import o1.p;
import o1.v;
import o1.x;

public final class a implements v, AutoCloseable {
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ g f2694g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0111d f2695h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ p f2696i;

    public a(g gVar, C0111d dVar, p pVar) {
        this.f2694g = gVar;
        this.f2695h = dVar;
        this.f2696i = pVar;
    }

    public final x a() {
        return this.f2694g.a();
    }

    public final void close() {
        boolean z2;
        if (!this.f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                z2 = c.q(this, 100);
            } catch (IOException unused) {
                z2 = false;
            }
            if (!z2) {
                this.f = true;
                this.f2695h.a();
            }
        }
        this.f2694g.close();
    }

    public final long f(e eVar, long j2) {
        try {
            long f2 = this.f2694g.f(eVar, 8192);
            p pVar = this.f2696i;
            if (f2 == -1) {
                if (!this.f) {
                    this.f = true;
                    pVar.close();
                }
                return -1;
            }
            eVar.l(pVar.f, eVar.f3745g - f2, f2);
            pVar.k();
            return f2;
        } catch (IOException e2) {
            IOException iOException = e2;
            if (!this.f) {
                this.f = true;
                this.f2695h.a();
            }
            throw iOException;
        }
    }
}
