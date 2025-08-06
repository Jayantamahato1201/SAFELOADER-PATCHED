package E0;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f94a;

    public a(float f) {
        this.f94a = f;
    }

    public final float a(RectF rectF) {
        return this.f94a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f94a == ((a) obj).f94a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f94a)});
    }
}
