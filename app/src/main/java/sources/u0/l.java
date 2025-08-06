package U0;

public final class l implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Class f773a;

    public l(Class cls) {
        this.f773a = cls;
    }

    public final Class a() {
        return this.f773a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (i.a(this.f773a, ((l) obj).f773a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f773a.hashCode();
    }

    public final String toString() {
        return this.f773a.toString() + " (Kotlin reflection is not available)";
    }
}
