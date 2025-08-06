package o1;

import K0.F;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class c extends x {

    /* renamed from: h  reason: collision with root package name */
    public static final long f3738h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f3739i;

    /* renamed from: j  reason: collision with root package name */
    public static c f3740j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3741e;
    public c f;

    /* renamed from: g  reason: collision with root package name */
    public long f3742g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f3738h = millis;
        f3739i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static c h() {
        c cVar = f3740j.f;
        Class<c> cls = c.class;
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(f3738h);
            if (f3740j.f != null || System.nanoTime() - nanoTime < f3739i) {
                return null;
            }
            return f3740j;
        }
        long nanoTime2 = cVar.f3742g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j2 = nanoTime2 / 1000000;
            cls.wait(j2, (int) (nanoTime2 - (1000000 * j2)));
            return null;
        }
        f3740j.f = cVar.f;
        cVar.f = null;
        return cVar;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [o1.c, java.lang.Object] */
    public final void i() {
        c cVar;
        if (!this.f3741e) {
            long j2 = this.f3774c;
            boolean z2 = this.f3773a;
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 != 0 || z2) {
                this.f3741e = true;
                synchronized (c.class) {
                    try {
                        if (f3740j == null) {
                            f3740j = new Object();
                            F f2 = new F("Okio Watchdog");
                            f2.setDaemon(true);
                            f2.start();
                        }
                        long nanoTime = System.nanoTime();
                        if (i2 != 0 && z2) {
                            this.f3742g = Math.min(j2, c() - nanoTime) + nanoTime;
                        } else if (i2 != 0) {
                            this.f3742g = j2 + nanoTime;
                        } else if (z2) {
                            this.f3742g = c();
                        } else {
                            throw new AssertionError();
                        }
                        long j3 = this.f3742g - nanoTime;
                        c cVar2 = f3740j;
                        while (true) {
                            cVar = cVar2.f;
                            if (cVar == null) {
                                break;
                            } else if (j3 < cVar.f3742g - nanoTime) {
                                break;
                            } else {
                                cVar2 = cVar;
                            }
                        }
                        this.f = cVar;
                        cVar2.f = this;
                        if (cVar2 == f3740j) {
                            c.class.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final void j(boolean z2) {
        if (k() && z2) {
            throw l((IOException) null);
        }
    }

    public final boolean k() {
        if (!this.f3741e) {
            return false;
        }
        this.f3741e = false;
        synchronized (c.class) {
            c cVar = f3740j;
            while (cVar != null) {
                c cVar2 = cVar.f;
                if (cVar2 == this) {
                    cVar.f = this.f;
                    this.f = null;
                    return false;
                }
                cVar = cVar2;
            }
            return true;
        }
    }

    public IOException l(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void m() {
    }
}
