package q1;

import T0.l;
import android.os.IBinder;

/* renamed from: q1.s4  reason: case insensitive filesystem */
public final /* synthetic */ class C0426s4 implements l {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ IBinder f4186g;

    public /* synthetic */ C0426s4(IBinder iBinder, int i2) {
        this.f = i2;
        this.f4186g = iBinder;
    }

    public final Object e(Object obj) {
        C0422s0 s0Var = (C0422s0) obj;
        switch (this.f) {
            case 0:
                return s0Var.z(this.f4186g);
            default:
                return s0Var.E0(this.f4186g);
        }
    }
}
