package f0;

import E0.e;
import android.view.View;

/* renamed from: f0.A  reason: case insensitive filesystem */
public class C0142A extends e {

    /* renamed from: j  reason: collision with root package name */
    public static boolean f2618j = true;

    public void m(View view, int i2, int i3, int i4, int i5) {
        if (f2618j) {
            try {
                z.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f2618j = false;
            }
        }
    }
}
