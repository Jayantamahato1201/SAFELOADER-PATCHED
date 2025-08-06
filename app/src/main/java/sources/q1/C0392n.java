package q1;

import L0.e;
import T0.l;
import android.app.job.JobService;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: q1.n  reason: case insensitive filesystem */
public final /* synthetic */ class C0392n implements l {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f4142g;

    public /* synthetic */ C0392n(int i2, Object obj) {
        this.f = i2;
        this.f4142g = obj;
    }

    public final Object e(Object obj) {
        switch (this.f) {
            case 0:
                C0398o oVar = (C0398o) this.f4142g;
                IBinder binder = ((Bundle) obj).getBinder(oVar.e());
                if (binder != null) {
                    IInterface iInterface = (IInterface) oVar.c().e(binder);
                    if (iInterface != null) {
                        binder.linkToDeath(new C0320b(binder, oVar, 0), 0);
                    } else {
                        iInterface = null;
                    }
                    oVar.f4148a = iInterface;
                }
                return e.f591c;
            default:
                IBinder h2 = ((C0325b4) obj).h((ComponentName) this.f4142g, H.f3898p);
                if (h2 != null) {
                    C0433u.b.getClass();
                    Object obj2 = C0433u.f4206r.get(h2);
                    if (obj2 instanceof JobService) {
                        return (JobService) obj2;
                    }
                }
                return null;
        }
    }
}
