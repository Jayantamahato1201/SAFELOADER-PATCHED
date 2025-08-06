package q1;

import L0.e;
import T0.a;
import i0.l;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import top.bienvenido.mundo.common.initialize.MNative;

/* renamed from: q1.s  reason: case insensitive filesystem */
public final /* synthetic */ class C0421s implements a {
    public final /* synthetic */ int f;

    public /* synthetic */ C0421s(int i2) {
        this.f = i2;
    }

    public final Object a() {
        Object obj;
        switch (this.f) {
            case 0:
                C0433u.f4203o = new C0421s(2);
                try {
                    l lVar = new l(4);
                    ExecutorService executorService = d5.b;
                    C0433u.f4193d.post(new C0373j4(1, new Future[]{executorService.submit(lVar), executorService.submit(new l(5)), executorService.submit(new l(6)), executorService.submit(new l(7)), executorService.submit(new l(1))}));
                } catch (Exception unused) {
                }
                return e.f591c;
            case 1:
                return C0433u.S0();
            case 2:
                C0433u uVar = C0433u.b;
                return e.f591c;
            case 3:
                try {
                    obj = MNative.a(49852, "4d8d125516ece52706cca78ecc806a3e59c67b37a3fa3e4083320f8e339bf70d048479191ac12ca7c01207ae20665f");
                } catch (Throwable unused2) {
                    obj = null;
                }
                Serializable serializable = (Serializable) obj;
                if (serializable == null) {
                    return new WeakReference((Object) null);
                }
                C0339e0.f4085g = new C0410q(2, serializable);
                return serializable;
            default:
                return C0339e0.d1();
        }
    }
}
