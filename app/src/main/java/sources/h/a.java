package H;

import android.graphics.Rect;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f259a;
    public final Rect b;

    public a(Rect rect, Rect rect2) {
        this.f259a = rect;
        this.b = rect2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!aVar.f259a.equals(this.f259a) || !aVar.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f259a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return "Pair{" + this.f259a + " " + this.b + "}";
    }
}
