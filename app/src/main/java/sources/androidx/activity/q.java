package androidx.activity;

import T0.a;
import T0.l;
import U0.i;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

public final class q implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f871a;
    public final /* synthetic */ l b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f872c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f873d;

    public q(l lVar, l lVar2, a aVar, a aVar2) {
        this.f871a = lVar;
        this.b = lVar2;
        this.f872c = aVar;
        this.f873d = aVar2;
    }

    public final void onBackCancelled() {
        this.f873d.a();
    }

    public final void onBackInvoked() {
        this.f872c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        i.e("backEvent", backEvent);
        this.b.e(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        i.e("backEvent", backEvent);
        this.f871a.e(new b(backEvent));
    }
}
