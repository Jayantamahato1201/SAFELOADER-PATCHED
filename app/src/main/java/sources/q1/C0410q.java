package q1;

import T0.a;
import android.app.LoadedApk;
import android.window.WindowContainerToken;
import java.io.File;
import java.io.Serializable;
import top.bienvenido.mundo.common.initialize.MNative;

/* renamed from: q1.q  reason: case insensitive filesystem */
public final /* synthetic */ class C0410q implements a {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f4173g;

    public /* synthetic */ C0410q(int i2, Object obj) {
        this.f = i2;
        this.f4173g = obj;
    }

    private final Object b() {
        return (LoadedApk) this.f4173g;
    }

    private final Object c() {
        return (WindowContainerToken) this.f4173g;
    }

    public final Object a() {
        Class cls;
        Object obj = this.f4173g;
        switch (this.f) {
            case 0:
                return b();
            case 1:
                return c();
            case 2:
                return (Serializable) obj;
            default:
                try {
                    cls = (Class) MNative.a(49849, "8b0164314af78a192ac4bd8a");
                } catch (Throwable unused) {
                    cls = null;
                }
                if (cls != null) {
                    String str = (String) obj;
                    File file = (File) cls.getConstructor(new Class[]{str.getClass()}).newInstance(new Object[]{str});
                    if (file != null) {
                        return file;
                    }
                }
                throw new UnsupportedOperationException();
        }
    }
}
