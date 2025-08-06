package Y0;

public final class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final c f789i = new a(1, 0, 1);

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        if (this.f == cVar.f && this.f784g == cVar.f784g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f * 31) + this.f784g;
    }

    public final boolean isEmpty() {
        if (this.f > this.f784g) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f + ".." + this.f784g;
    }
}
