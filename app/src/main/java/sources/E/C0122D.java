package e;

import Z.g;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: e.D  reason: case insensitive filesystem */
public final class C0122D implements Executor {
    public final Object f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f2435g = new ArrayDeque();

    /* renamed from: h  reason: collision with root package name */
    public final C0123E f2436h;

    /* renamed from: i  reason: collision with root package name */
    public Runnable f2437i;

    public C0122D(C0123E e2) {
        this.f2436h = e2;
    }

    public final void a() {
        synchronized (this.f) {
            try {
                Runnable runnable = (Runnable) this.f2435g.poll();
                this.f2437i = runnable;
                if (runnable != null) {
                    this.f2436h.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f) {
            try {
                this.f2435g.add(new g(this, 1, runnable));
                if (this.f2437i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
