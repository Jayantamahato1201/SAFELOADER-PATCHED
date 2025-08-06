package q1;

import U0.i;
import android.app.AppCompatCallbacks;
import android.graphics.Compatibility;
import android.os.StrictMode;
import dalvik.system.ZipPathValidator;
import f0.C0143B;
import java.security.Security;
import java.util.Arrays;

public abstract class M2 {
    public static void a() {
        try {
            if (T4.f3998c) {
                C0452x0.b(StrictMode.class, "disableDeathOnFileUriExposure", H.f3886c).b((Object) null, new Object[0]);
                if (T4.f) {
                    Security.removeProvider("AndroidNSSP");
                    if (T4.f4001g) {
                        C0452x0.a(C0143B.p(), "MAX_BITMAP_SIZE").c((Object) null, Integer.MAX_VALUE);
                        if (T4.f4002h) {
                            b();
                            if (T4.f4003i) {
                                Compatibility.setTargetSdkVersion(3);
                                if (T4.f4005k) {
                                    ZipPathValidator.clearCallback();
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void b() {
        try {
            C0351g0 g0Var = new C0351g0("disabledCompatChanges");
            C0433u.b.getClass();
            Object obj = C0433u.f;
            long[] jArr = (long[]) ((C0) g0Var.f4098c).a(obj);
            if (jArr != null) {
                int length = jArr.length;
                long[] copyOf = Arrays.copyOf(jArr, length + 12);
                System.arraycopy(new long[]{218865702, 154726397, 241104082, 255371817, 160794467, 148963590, 171317480, 144027538, 148964793, 169887240, 147798919, 309578419}, 0, copyOf, length, 12);
                i.d("result", copyOf);
                ((C0) g0Var.f4098c).c(obj, copyOf);
                if (T4.f4006l) {
                    AppCompatCallbacks.install(copyOf, (long[]) ((C0) new C0351g0("mLoggableCompatChanges").f4098c).a(obj));
                } else {
                    AppCompatCallbacks.install(copyOf);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
