package q1;

import T0.l;
import U0.h;
import android.os.IBinder;
import android.os.IInterface;

public final /* synthetic */ class A extends h implements l {

    /* renamed from: n  reason: collision with root package name */
    public static final A f3859n = new h(1, C0399o0.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoWindowManagerService;", 0);

    public final Object e(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i2 = C0399o0.f4149a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("top.bienvenido.mundo.IMundoWindowManagerService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof C0422s0)) {
            return new C0375k0(iBinder);
        }
        return (C0422s0) queryLocalInterface;
    }
}
