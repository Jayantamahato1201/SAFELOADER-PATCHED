package androidx.activity;

import android.window.BackEvent;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f839a;
    public final float b;

    /* renamed from: c  reason: collision with root package name */
    public final float f840c;

    /* renamed from: d  reason: collision with root package name */
    public final int f841d;

    public b(BackEvent backEvent) {
        a aVar = a.f838a;
        float d2 = aVar.d(backEvent);
        float e2 = aVar.e(backEvent);
        float b2 = aVar.b(backEvent);
        int c2 = aVar.c(backEvent);
        this.f839a = d2;
        this.b = e2;
        this.f840c = b2;
        this.f841d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f839a + ", touchY=" + this.b + ", progress=" + this.f840c + ", swipeEdge=" + this.f841d + '}';
    }
}
