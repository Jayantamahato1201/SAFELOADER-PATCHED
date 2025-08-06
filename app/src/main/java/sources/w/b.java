package W;

import android.view.animation.Interpolator;

public abstract class b implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f779a;
    public final float b;

    public b(float[] fArr) {
        this.f779a = fArr;
        this.b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f779a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.b;
        float f3 = fArr[min];
        return ((fArr[min + 1] - f3) * ((f - (((float) min) * f2)) / f2)) + f3;
    }
}
