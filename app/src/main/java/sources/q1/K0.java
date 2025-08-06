package q1;

import android.content.IClipboardManagerExt;
import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;
import system.ext.loader.core.ExtCreator;
import system.ext.loader.core.ExtRegistry;

public final class K0 extends V4 {
    public static final K0 b = new V4();

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, java.lang.reflect.InvocationHandler] */
    public final void b() {
        if (T4.f4004j) {
            Class<IClipboardManagerExt> cls = IClipboardManagerExt.class;
            ExtRegistry.registerExt(cls, (ExtCreator) Proxy.newProxyInstance(IClipboardManagerExt.class.getClassLoader(), new Class[]{ExtCreator.class}, new Object()));
            return;
        }
        Object a2 = C0452x0.c("android.content.ClipboardManagerExtPlugin", "constructor").a((Object) null);
        Constructor<C0328c1> declaredConstructor = C0328c1.class.getDeclaredConstructor(H.f3886c);
        declaredConstructor.setAccessible(true);
        ((C0) new C0351g0("ctor").f4098c).c(a2, declaredConstructor);
    }
}
