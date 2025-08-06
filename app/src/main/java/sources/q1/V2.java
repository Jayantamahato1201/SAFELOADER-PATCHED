package q1;

import L0.d;
import android.os.IBinder;

public final /* synthetic */ class V2 implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f4019g;

    public /* synthetic */ V2(int i2, int i3) {
        this.f = i3;
        this.f4019g = i2;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                int i2 = this.f4019g;
                try {
                    H.j(i2, false, new X2(i2));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    d dVar = H.f3894l;
                    if (dVar != null) {
                        int intValue = ((Number) dVar.f).intValue();
                        int i3 = this.f4019g;
                        if (intValue == i3) {
                            IBinder asBinder = ((C0318a3) dVar.f589g).asBinder();
                            if (!asBinder.isBinderAlive() || !asBinder.pingBinder()) {
                                H.f3894l = null;
                                d5.b.execute(new V2(i3, 0));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
