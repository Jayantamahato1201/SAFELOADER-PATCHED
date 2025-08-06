package E0;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f95a;
    public final float b;

    public b(float f, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f95a;
            f += ((b) cVar).b;
        }
        this.f95a = cVar;
        this.b = f;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f95a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f95a.equals(bVar.f95a) || this.b != bVar.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f95a, Float.valueOf(this.b)});
    }
}
