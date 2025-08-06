package e1;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2612a;
    public final /* synthetic */ boolean b;

    public b(String str, boolean z2) {
        this.f2612a = str;
        this.b = z2;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f2612a);
        thread.setDaemon(this.b);
        return thread;
    }
}
