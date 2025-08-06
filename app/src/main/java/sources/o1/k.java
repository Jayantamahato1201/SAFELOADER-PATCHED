package o1;

import java.util.concurrent.TimeUnit;

public final class k extends x {

    /* renamed from: e  reason: collision with root package name */
    public x f3750e;

    public k(x xVar) {
        if (xVar != null) {
            this.f3750e = xVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final x a() {
        return this.f3750e.a();
    }

    public final x b() {
        return this.f3750e.b();
    }

    public final long c() {
        return this.f3750e.c();
    }

    public final x d(long j2) {
        return this.f3750e.d(j2);
    }

    public final boolean e() {
        return this.f3750e.e();
    }

    public final void f() {
        this.f3750e.f();
    }

    public final x g(long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return this.f3750e.g(j2);
    }
}
