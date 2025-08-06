package o1;

import j1.x;
import java.io.IOException;
import java.io.OutputStream;

public final class a implements u, AutoCloseable {
    public final /* synthetic */ int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3734g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3735h;

    public a(x xVar, OutputStream outputStream) {
        this.f3734g = xVar;
        this.f3735h = outputStream;
    }

    public final x a() {
        switch (this.f) {
            case 0:
                return (x) this.f3735h;
            default:
                return (x) this.f3734g;
        }
    }

    public final void close() {
        switch (this.f) {
            case 0:
                x xVar = (x) this.f3735h;
                xVar.i();
                try {
                    ((a) this.f3734g).close();
                    xVar.j(true);
                    return;
                } catch (IOException e2) {
                    e = e2;
                    if (xVar.k()) {
                        e = xVar.l(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    xVar.j(false);
                    throw th;
                }
            default:
                ((OutputStream) this.f3735h).close();
                return;
        }
    }

    public final void flush() {
        switch (this.f) {
            case 0:
                x xVar = (x) this.f3735h;
                xVar.i();
                try {
                    ((a) this.f3734g).flush();
                    xVar.j(true);
                    return;
                } catch (IOException e2) {
                    e = e2;
                    if (xVar.k()) {
                        e = xVar.l(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    xVar.j(false);
                    throw th;
                }
            default:
                ((OutputStream) this.f3735h).flush();
                return;
        }
    }

    public final void g(e eVar, long j2) {
        switch (this.f) {
            case 0:
                long j3 = j2;
                y.a(eVar.f3745g, 0, j3);
                long j4 = j3;
                while (true) {
                    long j5 = 0;
                    if (j4 > 0) {
                        r rVar = eVar.f;
                        while (true) {
                            if (j5 < 65536) {
                                j5 += (long) (rVar.f3764c - rVar.b);
                                if (j5 >= j4) {
                                    j5 = j4;
                                } else {
                                    rVar = rVar.f;
                                }
                            }
                        }
                        x xVar = (x) this.f3735h;
                        xVar.i();
                        try {
                            ((a) this.f3734g).g(eVar, j5);
                            j4 -= j5;
                            xVar.j(true);
                        } catch (IOException e2) {
                            IOException iOException = e2;
                            if (xVar.k()) {
                                iOException = xVar.l(iOException);
                            }
                            throw iOException;
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            xVar.j(false);
                            throw th2;
                        }
                    } else {
                        return;
                    }
                }
            default:
                y.a(eVar.f3745g, 0, j2);
                while (j2 > 0) {
                    ((x) this.f3734g).f();
                    r rVar2 = eVar.f;
                    int min = (int) Math.min(j2, (long) (rVar2.f3764c - rVar2.b));
                    ((OutputStream) this.f3735h).write(rVar2.f3763a, rVar2.b, min);
                    int i2 = rVar2.b + min;
                    rVar2.b = i2;
                    long j6 = (long) min;
                    j2 -= j6;
                    eVar.f3745g -= j6;
                    if (i2 == rVar2.f3764c) {
                        eVar.f = rVar2.a();
                        s.a(rVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f) {
            case 0:
                return "AsyncTimeout.sink(" + ((a) this.f3734g) + ")";
            default:
                return "sink(" + ((OutputStream) this.f3735h) + ")";
        }
    }

    public a(x xVar, a aVar) {
        this.f3735h = xVar;
        this.f3734g = aVar;
    }
}
