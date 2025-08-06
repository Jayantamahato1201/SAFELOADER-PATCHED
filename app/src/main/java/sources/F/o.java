package F;

import K0.F;
import java.util.concurrent.ThreadFactory;

public final class o implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f215a;

    public /* synthetic */ o(int i2) {
        this.f215a = i2;
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.f215a) {
            case 0:
                return new n(runnable);
            default:
                return new F(runnable);
        }
    }
}
