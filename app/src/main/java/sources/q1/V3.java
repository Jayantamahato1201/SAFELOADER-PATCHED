package q1;

import com.android.internal.net.VpnConfig;
import java.lang.reflect.Method;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

public final class V3 extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public static final V3 f4020d = new C0376k1(3);

    public final Object a(Object obj, Method method, Object[] objArr) {
        try {
            VpnConfig vpnConfig = (VpnConfig) L3.b(objArr, VpnConfig.class);
            if (vpnConfig != null) {
                vpnConfig.user = MundoService$Companion$STUB.class.getName();
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}
