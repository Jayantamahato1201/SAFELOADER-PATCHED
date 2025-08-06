package H;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public final Object f262d = new Object();

    public c() {
        super(12);
    }

    public final Object a() {
        Object a2;
        synchronized (this.f262d) {
            a2 = super.a();
        }
        return a2;
    }

    public final boolean c(Object obj) {
        boolean c2;
        synchronized (this.f262d) {
            c2 = super.c(obj);
        }
        return c2;
    }
}
