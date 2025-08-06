package L0;

import U0.i;
import java.io.Serializable;

public final class d implements Serializable {
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f589g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f590h;

    public d(Object obj, Object obj2, Object obj3) {
        this.f = obj;
        this.f589g = obj2;
        this.f590h = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (i.a(this.f, dVar.f) && i.a(this.f589g, dVar.f589g) && i.a(this.f590h, dVar.f590h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = 0;
        Object obj = this.f;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        int i5 = i2 * 31;
        Object obj2 = this.f589g;
        if (obj2 == null) {
            i3 = 0;
        } else {
            i3 = obj2.hashCode();
        }
        int i6 = (i5 + i3) * 31;
        Object obj3 = this.f590h;
        if (obj3 != null) {
            i4 = obj3.hashCode();
        }
        return i6 + i4;
    }

    public final String toString() {
        return "(" + this.f + ", " + this.f589g + ", " + this.f590h + ')';
    }
}
