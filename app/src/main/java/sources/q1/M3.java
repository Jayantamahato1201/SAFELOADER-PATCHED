package q1;

import T0.l;
import U0.h;
import android.os.IBinder;
import android.os.IInterface;

public final /* synthetic */ class M3 extends h implements l {

    /* renamed from: n  reason: collision with root package name */
    public static final M3 f3938n = new h(1, W3.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoActivityManagerService;", 0);

    public final Object e(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i2 = W3.f4029a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("top.bienvenido.mundo.IMundoActivityManagerService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof C0325b4)) {
            return new R3(iBinder);
        }
        return (C0325b4) queryLocalInterface;
    }
}
