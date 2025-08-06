package g;

import Q0.l;
import android.graphics.drawable.Animatable;
import g0.C0169e;

/* renamed from: g.a  reason: case insensitive filesystem */
public final class C0158a extends l {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f2733l;

    /* renamed from: m  reason: collision with root package name */
    public final Animatable f2734m;

    public /* synthetic */ C0158a(Animatable animatable, int i2) {
        this.f2733l = i2;
        this.f2734m = animatable;
    }

    public final void a0() {
        switch (this.f2733l) {
            case 0:
                this.f2734m.start();
                return;
            default:
                ((C0169e) this.f2734m).start();
                return;
        }
    }

    public final void b0() {
        switch (this.f2733l) {
            case 0:
                this.f2734m.stop();
                return;
            default:
                ((C0169e) this.f2734m).stop();
                return;
        }
    }
}
