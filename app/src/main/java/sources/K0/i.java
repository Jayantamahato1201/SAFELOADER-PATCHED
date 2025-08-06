package K0;

import android.os.Message;

public final class i implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Message f549g;

    public /* synthetic */ i(Message message, int i2) {
        this.f = i2;
        this.f549g = message;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                throw new AssertionError("Unknown handler message received: " + this.f549g.what);
            default:
                throw new AssertionError("Unhandled stats message." + this.f549g.what);
        }
    }
}
