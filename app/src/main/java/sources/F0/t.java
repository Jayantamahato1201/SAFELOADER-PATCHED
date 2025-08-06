package f0;

import android.os.Build;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f2690a;

    static {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 28) {
            z2 = true;
        } else {
            z2 = false;
        }
        f2690a = z2;
    }
}
