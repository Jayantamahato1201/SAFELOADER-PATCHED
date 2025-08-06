package I;

import android.os.Build;
import android.view.animation.Interpolator;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public f0 f430a;

    public g0(int i2, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f430a = new e0(c0.i(i2, interpolator, j2));
        } else {
            this.f430a = new f0(i2, interpolator, j2);
        }
    }
}
