package o1;

public abstract class j implements v, AutoCloseable {
    public final v f;

    public j(v vVar) {
        if (vVar != null) {
            this.f = vVar;
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

    public long f(e eVar, long j2) {
        return this.f.f(eVar, 8192);
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f.toString() + ")";
    }
}
