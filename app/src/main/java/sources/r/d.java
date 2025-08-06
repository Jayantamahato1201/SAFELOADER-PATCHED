package R;

import android.view.animation.Interpolator;

public final class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f685a;

    public /* synthetic */ d(int i2) {
        this.f685a = i2;
    }

    public final float getInterpolation(float f) {
        switch (this.f685a) {
            case 0:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            default:
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }
}
