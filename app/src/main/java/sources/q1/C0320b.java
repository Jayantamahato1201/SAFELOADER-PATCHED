package q1;

import android.os.IBinder;
import java.util.concurrent.ExecutorService;

/* renamed from: q1.b  reason: case insensitive filesystem */
public final class C0320b implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4058a;
    public final /* synthetic */ IBinder b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4059c;

    public /* synthetic */ C0320b(IBinder iBinder, Object obj, int i2) {
        this.f4058a = i2;
        this.b = iBinder;
        this.f4059c = obj;
    }

    public final void binderDied() {
        IBinder iBinder = this.b;
        Object obj = this.f4059c;
        switch (this.f4058a) {
            case 0:
                try {
                    iBinder.unlinkToDeath(this, 0);
                    C0398o oVar = (C0398o) obj;
                    oVar.f4148a = null;
                    oVar.a();
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ExecutorService executorService = d5.f4080a;
                d5.b.execute(new P0(iBinder, this, (Q2) obj, 5));
                return;
        }
    }
}
