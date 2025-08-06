package q1;

import android.system.Os;
import i0.l;
import java.io.File;

public final /* synthetic */ class J2 implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3921g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3922h;

    public /* synthetic */ J2(int i2, String str, String str2) {
        this.f = i2;
        this.f3921g = str;
        this.f3922h = str2;
    }

    public final void run() {
        String str = this.f3922h;
        String str2 = this.f3921g;
        switch (this.f) {
            case 0:
                try {
                    K2.b.getClass();
                    C0463z zVar = (X3) K2.f3929c.get(str2);
                    E4 e4 = K2.f3930d;
                    if (zVar == null) {
                        zVar = (C0463z) e4.get(str2);
                    }
                    if (zVar != null) {
                        zVar.b.f.b(str.hashCode(), str);
                    } else {
                        e4.put(str2, new C0463z(str2, new C0436u2(str)));
                        C0395n2.b.getClass();
                        d5.b.execute(new l(11));
                    }
                    File d2 = H.d(U3.f4017a, str2, str);
                    if (d2.mkdirs()) {
                        T0.l lVar = S1.f3986a;
                        Os.chmod(d2.getAbsolutePath(), 493);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                try {
                    C0330c3.b.v0(str2, str);
                    U3.a(str2, str);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            default:
                try {
                    K2.b.getClass();
                    C0463z zVar2 = (X3) K2.f3929c.get(str2);
                    if (zVar2 == null) {
                        zVar2 = (C0463z) K2.f3930d.get(str2);
                    }
                    if (zVar2 != null) {
                        zVar2.b.f.c(str.hashCode());
                    }
                    d5.b.execute(new J2(1, str2, str));
                    return;
                } catch (Exception unused3) {
                    return;
                }
        }
    }
}
