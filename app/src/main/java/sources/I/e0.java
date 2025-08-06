package I;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

public final class e0 extends f0 {

    /* renamed from: e  reason: collision with root package name */
    public final WindowInsetsAnimation f419e;

    public e0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.f419e = windowInsetsAnimation;
    }

    public final long a() {
        return this.f419e.getDurationMillis();
    }

    public final float b() {
        return this.f419e.getInterpolatedFraction();
    }

    public final int c() {
        return this.f419e.getTypeMask();
    }

    public final void d(float f) {
        this.f419e.setFraction(f);
    }
}
