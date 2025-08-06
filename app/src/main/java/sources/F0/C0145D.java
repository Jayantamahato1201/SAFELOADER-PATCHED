package f0;

import android.os.Build;
import android.view.View;

/* renamed from: f0.D  reason: case insensitive filesystem */
public class C0145D extends C0142A {

    /* renamed from: k  reason: collision with root package name */
    public static boolean f2619k = true;

    public void o(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.o(view, i2);
        } else if (f2619k) {
            try {
                C0144C.a(view, i2);
            } catch (NoSuchMethodError unused) {
                f2619k = false;
            }
        }
    }
}
