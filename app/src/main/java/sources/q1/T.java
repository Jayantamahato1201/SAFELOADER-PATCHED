package q1;

import T0.l;
import U0.h;
import android.os.IBinder;
import android.os.IInterface;

public final /* synthetic */ class T extends h implements l {

    /* renamed from: n  reason: collision with root package name */
    public static final T f3991n = new h(1, C0380l.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoContentService;", 0);

    public final Object e(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i2 = C0380l.f4131a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("top.bienvenido.mundo.IMundoContentService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof C0451x)) {
            return new C0350g(iBinder);
        }
        return (C0451x) queryLocalInterface;
    }
}
