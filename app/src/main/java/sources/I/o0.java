package I;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

public class o0 extends n0 {
    public o0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
    }

    public t0 a() {
        return t0.g((View) null, this.f451c.consumeDisplayCutout());
    }

    public C0017i e() {
        DisplayCutout o2 = this.f451c.getDisplayCutout();
        if (o2 == null) {
            return null;
        }
        return new C0017i(o2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (!Objects.equals(this.f451c, o0Var.f451c) || !Objects.equals(this.f454g, o0Var.f454g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f451c.hashCode();
    }
}
