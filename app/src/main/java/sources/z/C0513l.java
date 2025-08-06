package z;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: z.l  reason: case insensitive filesystem */
public final class C0513l {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f4869a;
    public final Resources.Theme b;

    public C0513l(Resources resources, Resources.Theme theme) {
        this.f4869a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0513l.class == obj.getClass()) {
            C0513l lVar = (C0513l) obj;
            if (!this.f4869a.equals(lVar.f4869a) || !Objects.equals(this.b, lVar.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f4869a, this.b});
    }
}
