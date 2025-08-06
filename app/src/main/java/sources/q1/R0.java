package q1;

import android.os.IBinder;

public final class R0 implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f3978a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ X0 f3979c;

    public R0(X0 x02, IBinder iBinder, boolean z2) {
        this.f3979c = x02;
        this.f3978a = iBinder;
        this.b = z2;
        try {
            iBinder.linkToDeath(this, 0);
        } catch (Exception unused) {
            binderDied();
        }
    }

    public final void binderDied() {
        try {
            this.f3979c.d(this.f3978a);
        } catch (Exception unused) {
        }
    }
}
