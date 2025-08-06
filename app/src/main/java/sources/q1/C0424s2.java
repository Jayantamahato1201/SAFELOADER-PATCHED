package q1;

import T0.l;
import U0.h;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: q1.s2  reason: case insensitive filesystem */
public final /* synthetic */ class C0424s2 extends h implements l {

    /* renamed from: n  reason: collision with root package name */
    public static final C0424s2 f4184n = new h(1, C0461y3.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoAccountManagerService;", 0);

    public final Object e(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i2 = C0461y3.f4252a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("top.bienvenido.mundo.IMundoAccountManagerService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof K3)) {
            return new C0431t3(iBinder);
        }
        return (K3) queryLocalInterface;
    }
}
