package E0;

import android.graphics.RectF;
import java.util.Arrays;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f138a;

    public h(float f) {
        this.f138a = f;
    }

    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f138a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f138a == ((h) obj).f138a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f138a)});
    }
}
