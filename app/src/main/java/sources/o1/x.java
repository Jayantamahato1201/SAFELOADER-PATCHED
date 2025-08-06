package o1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class x {

    /* renamed from: d  reason: collision with root package name */
    public static final w f3772d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f3773a;
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public long f3774c;

    public x a() {
        this.f3773a = false;
        return this;
    }

    public x b() {
        this.f3774c = 0;
        return this;
    }

    public long c() {
        if (this.f3773a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j2) {
        this.f3773a = true;
        this.b = j2;
        return this;
    }

    public boolean e() {
        return this.f3773a;
    }

    public void f() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f3773a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j2);
        } else if (timeUnit != null) {
            this.f3774c = timeUnit.toNanos(j2);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }
}
