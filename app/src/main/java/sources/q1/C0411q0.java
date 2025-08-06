package q1;

import G.f;
import T0.l;
import android.app.NotificationChannel;
import android.content.pm.ParceledListSlice;
import android.net.Uri;
import android.provider.Settings;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: q1.q0  reason: case insensitive filesystem */
public final class C0411q0 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        Object obj2;
        List<Object> b;
        try {
            if (!(!H.f3895m || (obj2 = objArr[1]) == null || (b = C0459y1.b(obj2)) == null)) {
                for (Object b2 : b) {
                    NotificationChannel b3 = f.b(b2);
                    C0351g0 g0Var = C0367i4.f4118a;
                    String str = H.f3896n;
                    C0351g0 g0Var2 = C0367i4.f4118a;
                    ((C0) g0Var2.f4098c).c(b3, C0367i4.a(str, b3.getId()));
                    if (b3.getSound() != null) {
                        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                        b3.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, b3.getAudioAttributes());
                    }
                }
                l lVar = C0459y1.f4250a;
                if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                    C0459y1.a(b);
                }
            }
        } catch (Throwable unused) {
        }
        return super.a(obj, method, objArr);
    }
}
