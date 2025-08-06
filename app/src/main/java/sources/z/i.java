package Z;

import android.view.Choreographer;

public final /* synthetic */ class i implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f817a;

    public /* synthetic */ i(Runnable runnable) {
        this.f817a = runnable;
    }

    public final void doFrame(long j2) {
        this.f817a.run();
    }
}
