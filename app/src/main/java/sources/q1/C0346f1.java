package q1;

import T0.l;
import U0.h;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: q1.f1  reason: case insensitive filesystem */
public final /* synthetic */ class C0346f1 extends h implements l {

    /* renamed from: n  reason: collision with root package name */
    public static final C0346f1 f4092n = new h(1, U.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoPackageManagerService;", 0);

    public final Object e(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i2 = U.f4011a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("top.bienvenido.mundo.IMundoPackageManagerService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof C0345f0)) {
            return new Q(iBinder);
        }
        return (C0345f0) queryLocalInterface;
    }
}
