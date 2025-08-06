package g;

import android.graphics.drawable.Drawable;
import g0.C0169e;

/* renamed from: g.f  reason: case insensitive filesystem */
public final class C0163f implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2779a = 0;
    public Object b;

    public /* synthetic */ C0163f() {
    }

    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f2779a) {
            case 0:
                return;
            default:
                ((C0169e) this.b).invalidateSelf();
                return;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        switch (this.f2779a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j2);
                    return;
                }
                return;
            default:
                ((C0169e) this.b).scheduleSelf(runnable, j2);
                return;
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f2779a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((C0169e) this.b).unscheduleSelf(runnable);
                return;
        }
    }

    public C0163f(C0169e eVar) {
        this.b = eVar;
    }

    private final void a(Drawable drawable) {
    }
}
