package L0;

import U0.i;
import java.io.Serializable;

public final class b implements Serializable {
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f586g;

    public b(Object obj, Object obj2) {
        this.f = obj;
        this.f586g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (i.a(this.f, bVar.f) && i.a(this.f586g, bVar.f586g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3 = 0;
        Object obj = this.f;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        int i4 = i2 * 31;
        Object obj2 = this.f586g;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        return "(" + this.f + ", " + this.f586g + ')';
    }
}
