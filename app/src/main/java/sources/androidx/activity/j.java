package androidx.activity;

import F0.g;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import e.C0137h;
import java.util.concurrent.Executor;

public final class j implements Executor, ViewTreeObserver.OnDrawListener, Runnable {
    public final long f = (SystemClock.uptimeMillis() + 10000);

    /* renamed from: g  reason: collision with root package name */
    public Runnable f850g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f851h = false;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ C0137h f852i;

    public j(C0137h hVar) {
        this.f852i = hVar;
    }

    public final void execute(Runnable runnable) {
        this.f850g = runnable;
        View decorView = this.f852i.getWindow().getDecorView();
        if (!this.f851h) {
            decorView.postOnAnimation(new g(5, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f850g;
        if (runnable != null) {
            runnable.run();
            this.f850g = null;
            l lVar = this.f852i.f858i;
            synchronized (lVar.b) {
                z2 = lVar.f865a;
            }
            if (z2) {
                this.f851h = false;
                this.f852i.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.f) {
            this.f851h = false;
            this.f852i.getWindow().getDecorView().post(this);
        }
    }

    public final void run() {
        this.f852i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
