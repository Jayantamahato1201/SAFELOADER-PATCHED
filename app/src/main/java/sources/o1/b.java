package o1;

import j1.x;
import java.io.IOException;
import java.io.InputStream;

public final class b implements v, AutoCloseable {
    public final /* synthetic */ int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3736g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3737h;

    public b(x xVar, InputStream inputStream) {
        this.f3736g = xVar;
        this.f3737h = inputStream;
    }

    public final x a() {
        switch (this.f) {
            case 0:
                return (x) this.f3737h;
            default:
                return (x) this.f3736g;
        }
    }

    public final void close() {
        switch (this.f) {
            case 0:
                x xVar = (x) this.f3737h;
                try {
                    ((b) this.f3736g).close();
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
                ((InputStream) this.f3737h).close();
                return;
        }
    }

    public final long f(e eVar, long j2) {
        switch (this.f) {
            case 0:
                x xVar = (x) this.f3737h;
                xVar.i();
                try {
                    long f2 = ((b) this.f3736g).f(eVar, 8192);
                    xVar.j(true);
                    return f2;
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
                try {
                    ((x) this.f3736g).f();
                    r z2 = eVar.z(1);
                    int read = ((InputStream) this.f3737h).read(z2.f3763a, z2.f3764c, (int) Math.min(8192, (long) (8192 - z2.f3764c)));
                    if (read == -1) {
                        return -1;
                    }
                    z2.f3764c += read;
                    long j3 = (long) read;
                    eVar.f3745g += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (e3.getCause() == null || e3.getMessage() == null || !e3.getMessage().contains("getsockname failed")) {
                        throw e3;
                    }
                    throw new IOException(e3);
                }
        }
    }

    public final String toString() {
        switch (this.f) {
            case 0:
                return "AsyncTimeout.source(" + ((b) this.f3736g) + ")";
            default:
                return "source(" + ((InputStream) this.f3737h) + ")";
        }
    }

    public b(x xVar, b bVar) {
        this.f3737h = xVar;
        this.f3736g = bVar;
    }
}
