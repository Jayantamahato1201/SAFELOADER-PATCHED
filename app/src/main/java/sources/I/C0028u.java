package I;

import android.view.VelocityTracker;

/* renamed from: I.u  reason: case insensitive filesystem */
public abstract class C0028u {
    public static float a(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getAxisVelocity(i2);
    }

    public static float b(VelocityTracker velocityTracker, int i2, int i3) {
        return velocityTracker.getAxisVelocity(i2, i3);
    }

    public static boolean c(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.isAxisSupported(i2);
    }
}
