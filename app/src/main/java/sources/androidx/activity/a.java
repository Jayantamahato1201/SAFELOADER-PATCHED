package androidx.activity;

import U0.i;
import android.window.BackEvent;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f838a = new Object();

    public final BackEvent a(float f, float f2, float f3, int i2) {
        return new BackEvent(f, f2, f3, i2);
    }

    public final float b(BackEvent backEvent) {
        i.e("backEvent", backEvent);
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        i.e("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        i.e("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        i.e("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
