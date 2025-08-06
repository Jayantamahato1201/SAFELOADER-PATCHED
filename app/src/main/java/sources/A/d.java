package A;

import android.graphics.Insets;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final d f3e = new d(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f4a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6d;

    public d(int i2, int i3, int i4, int i5) {
        this.f4a = i2;
        this.b = i3;
        this.f5c = i4;
        this.f6d = i5;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f4a, dVar2.f4a), Math.max(dVar.b, dVar2.b), Math.max(dVar.f5c, dVar2.f5c), Math.max(dVar.f6d, dVar2.f6d));
    }

    public static d b(int i2, int i3, int i4, int i5) {
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return f3e;
        }
        return new d(i2, i3, i4, i5);
    }

    public static d c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return c.a(this.f4a, this.b, this.f5c, this.f6d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f6d == dVar.f6d && this.f4a == dVar.f4a && this.f5c == dVar.f5c && this.b == dVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f4a * 31) + this.b) * 31) + this.f5c) * 31) + this.f6d;
    }

    public final String toString() {
        return "Insets{left=" + this.f4a + ", top=" + this.b + ", right=" + this.f5c + ", bottom=" + this.f6d + '}';
    }
}
