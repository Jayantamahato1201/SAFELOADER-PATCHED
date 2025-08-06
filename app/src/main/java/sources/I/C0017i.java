package I;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: I.i  reason: case insensitive filesystem */
public final class C0017i {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f434a;

    public C0017i(DisplayCutout displayCutout) {
        this.f434a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0017i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f434a, ((C0017i) obj).f434a);
    }

    public final int hashCode() {
        return this.f434a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f434a + "}";
    }
}
