package q1;

import T0.l;

/* renamed from: q1.v3  reason: case insensitive filesystem */
public final /* synthetic */ class C0443v3 implements l {
    public final /* synthetic */ C0376k1 f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object[] f4222g;

    public /* synthetic */ C0443v3(C0376k1 k1Var, Object[] objArr) {
        this.f = k1Var;
        this.f4222g = objArr;
    }

    public final Object e(Object obj) {
        int i2;
        C0422s0 s0Var = (C0422s0) obj;
        this.f.getClass();
        Integer num = (Integer) L3.b(this.f4222g, Integer.TYPE);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        return s0Var.k((((long) H.f3901s) & 4294967295L) | ((((long) i2) << 32) & -4294967296L));
    }
}
