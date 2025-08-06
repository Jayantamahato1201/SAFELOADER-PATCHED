package I;

import android.view.animation.Interpolator;

public abstract class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f421a;
    public float b;

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f422c;

    /* renamed from: d  reason: collision with root package name */
    public final long f423d;

    public f0(int i2, Interpolator interpolator, long j2) {
        this.f421a = i2;
        this.f422c = interpolator;
        this.f423d = j2;
    }

    public long a() {
        return this.f423d;
    }

    public float b() {
        Interpolator interpolator = this.f422c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.b);
        }
        return this.b;
    }

    public int c() {
        return this.f421a;
    }

    public void d(float f) {
        this.b = f;
    }
}
