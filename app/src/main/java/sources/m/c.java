package m;

import java.util.Map;

public final class c implements Map.Entry {
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f3653g;

    /* renamed from: h  reason: collision with root package name */
    public c f3654h;

    /* renamed from: i  reason: collision with root package name */
    public c f3655i;

    public c(Object obj, Object obj2) {
        this.f = obj;
        this.f3653g = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f.equals(cVar.f) || !this.f3653g.equals(cVar.f3653g)) {
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.f;
    }

    public final Object getValue() {
        return this.f3653g;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ this.f3653g.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f + "=" + this.f3653g;
    }
}
