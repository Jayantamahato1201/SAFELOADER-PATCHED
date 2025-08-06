package o1;

public abstract class i implements u, AutoCloseable {
    public final u f;

    public i(u uVar) {
        if (uVar != null) {
            this.f = uVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final x a() {
        return this.f.a();
    }

    public void close() {
        this.f.close();
    }

    public void flush() {
        this.f.flush();
    }

    public void g(e eVar, long j2) {
        this.f.g(eVar, j2);
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f.toString() + ")";
    }
}
