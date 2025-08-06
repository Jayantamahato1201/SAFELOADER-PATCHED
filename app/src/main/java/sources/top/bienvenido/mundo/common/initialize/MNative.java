package top.bienvenido.mundo.common.initialize;

import java.io.Serializable;

public final class MNative {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4717a = 0;

    static {
        try {
            System.loadLibrary("vglcox1nqn3vgzgsvvra");
        } catch (Throwable unused) {
        }
    }

    public static Object a(int i2, Serializable serializable) {
        try {
            return ioctl(i2, serializable);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final native Object ioctl(int i2, Object obj);
}
