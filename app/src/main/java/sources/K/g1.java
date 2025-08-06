package k;

import android.os.Build;
import java.lang.reflect.Method;

public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public Method f3461a;
    public Method b;

    /* renamed from: c  reason: collision with root package name */
    public Method f3462c;

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
