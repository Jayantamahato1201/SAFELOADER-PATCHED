package k0;

import W.a;
import W.b;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: k0.a  reason: case insensitive filesystem */
public abstract class C0281a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f3622a = new LinearInterpolator();
    public static final a b = new b(a.f777d);

    /* renamed from: c  reason: collision with root package name */
    public static final a f3623c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final a f3624d = new b(a.f778e);

    /* JADX WARNING: type inference failed for: r0v1, types: [W.b, W.a] */
    /* JADX WARNING: type inference failed for: r0v3, types: [W.b, W.a] */
    static {
        new DecelerateInterpolator();
    }

    public static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i2, int i3, float f) {
        return Math.round(f * ((float) (i3 - i2))) + i2;
    }
}
