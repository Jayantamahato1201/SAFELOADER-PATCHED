package t;

import android.view.ViewGroup;
import r.C0472d;
import r.h;

/* renamed from: t.e  reason: case insensitive filesystem */
public final class C0480e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A  reason: collision with root package name */
    public float f4554A;

    /* renamed from: B  reason: collision with root package name */
    public String f4555B;

    /* renamed from: C  reason: collision with root package name */
    public int f4556C;
    public float D;

    /* renamed from: E  reason: collision with root package name */
    public float f4557E;

    /* renamed from: F  reason: collision with root package name */
    public int f4558F;

    /* renamed from: G  reason: collision with root package name */
    public int f4559G;

    /* renamed from: H  reason: collision with root package name */
    public int f4560H;

    /* renamed from: I  reason: collision with root package name */
    public int f4561I;

    /* renamed from: J  reason: collision with root package name */
    public int f4562J;

    /* renamed from: K  reason: collision with root package name */
    public int f4563K;

    /* renamed from: L  reason: collision with root package name */
    public int f4564L;

    /* renamed from: M  reason: collision with root package name */
    public int f4565M;

    /* renamed from: N  reason: collision with root package name */
    public float f4566N;

    /* renamed from: O  reason: collision with root package name */
    public float f4567O;

    /* renamed from: P  reason: collision with root package name */
    public int f4568P;

    /* renamed from: Q  reason: collision with root package name */
    public int f4569Q;

    /* renamed from: R  reason: collision with root package name */
    public int f4570R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f4571S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f4572T;

    /* renamed from: U  reason: collision with root package name */
    public String f4573U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f4574V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f4575W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f4576X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f4577Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f4578Z;

    /* renamed from: a  reason: collision with root package name */
    public int f4579a;

    /* renamed from: a0  reason: collision with root package name */
    public int f4580a0;
    public int b;

    /* renamed from: b0  reason: collision with root package name */
    public int f4581b0;

    /* renamed from: c  reason: collision with root package name */
    public float f4582c;

    /* renamed from: c0  reason: collision with root package name */
    public int f4583c0;

    /* renamed from: d  reason: collision with root package name */
    public int f4584d;

    /* renamed from: d0  reason: collision with root package name */
    public int f4585d0;

    /* renamed from: e  reason: collision with root package name */
    public int f4586e;
    public int e0;
    public int f;

    /* renamed from: f0  reason: collision with root package name */
    public int f4587f0;

    /* renamed from: g  reason: collision with root package name */
    public int f4588g;

    /* renamed from: g0  reason: collision with root package name */
    public float f4589g0;

    /* renamed from: h  reason: collision with root package name */
    public int f4590h;

    /* renamed from: h0  reason: collision with root package name */
    public int f4591h0;

    /* renamed from: i  reason: collision with root package name */
    public int f4592i;

    /* renamed from: i0  reason: collision with root package name */
    public int f4593i0;

    /* renamed from: j  reason: collision with root package name */
    public int f4594j;

    /* renamed from: j0  reason: collision with root package name */
    public float f4595j0;

    /* renamed from: k  reason: collision with root package name */
    public int f4596k;

    /* renamed from: k0  reason: collision with root package name */
    public C0472d f4597k0;

    /* renamed from: l  reason: collision with root package name */
    public int f4598l;

    /* renamed from: m  reason: collision with root package name */
    public int f4599m;

    /* renamed from: n  reason: collision with root package name */
    public int f4600n;

    /* renamed from: o  reason: collision with root package name */
    public float f4601o;

    /* renamed from: p  reason: collision with root package name */
    public int f4602p;

    /* renamed from: q  reason: collision with root package name */
    public int f4603q;

    /* renamed from: r  reason: collision with root package name */
    public int f4604r;

    /* renamed from: s  reason: collision with root package name */
    public int f4605s;

    /* renamed from: t  reason: collision with root package name */
    public int f4606t;

    /* renamed from: u  reason: collision with root package name */
    public int f4607u;

    /* renamed from: v  reason: collision with root package name */
    public int f4608v;

    /* renamed from: w  reason: collision with root package name */
    public int f4609w;

    /* renamed from: x  reason: collision with root package name */
    public int f4610x;

    /* renamed from: y  reason: collision with root package name */
    public int f4611y;

    /* renamed from: z  reason: collision with root package name */
    public float f4612z;

    public final void a() {
        this.f4577Y = false;
        this.f4574V = true;
        this.f4575W = true;
        int i2 = this.width;
        if (i2 == -2 && this.f4571S) {
            this.f4574V = false;
            if (this.f4560H == 0) {
                this.f4560H = 1;
            }
        }
        int i3 = this.height;
        if (i3 == -2 && this.f4572T) {
            this.f4575W = false;
            if (this.f4561I == 0) {
                this.f4561I = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f4574V = false;
            if (i2 == 0 && this.f4560H == 1) {
                this.width = -2;
                this.f4571S = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.f4575W = false;
            if (i3 == 0 && this.f4561I == 1) {
                this.height = -2;
                this.f4572T = true;
            }
        }
        if (this.f4582c != -1.0f || this.f4579a != -1 || this.b != -1) {
            this.f4577Y = true;
            this.f4574V = true;
            this.f4575W = true;
            if (!(this.f4597k0 instanceof h)) {
                this.f4597k0 = new h();
            }
            ((h) this.f4597k0).B(this.f4570R);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resolveLayoutDirection(int r10) {
        /*
            r9 = this;
            int r0 = r9.leftMargin
            int r1 = r9.rightMargin
            super.resolveLayoutDirection(r10)
            int r10 = r9.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r3 != r10) goto L_0x0011
            r10 = 1
            goto L_0x0012
        L_0x0011:
            r10 = 0
        L_0x0012:
            r4 = -1
            r9.f4583c0 = r4
            r9.f4585d0 = r4
            r9.f4580a0 = r4
            r9.f4581b0 = r4
            int r5 = r9.f4606t
            r9.e0 = r5
            int r5 = r9.f4608v
            r9.f4587f0 = r5
            float r5 = r9.f4612z
            r9.f4589g0 = r5
            int r6 = r9.f4579a
            r9.f4591h0 = r6
            int r7 = r9.b
            r9.f4593i0 = r7
            float r8 = r9.f4582c
            r9.f4595j0 = r8
            if (r10 == 0) goto L_0x008e
            int r10 = r9.f4602p
            if (r10 == r4) goto L_0x003d
            r9.f4583c0 = r10
        L_0x003b:
            r2 = 1
            goto L_0x0044
        L_0x003d:
            int r10 = r9.f4603q
            if (r10 == r4) goto L_0x0044
            r9.f4585d0 = r10
            goto L_0x003b
        L_0x0044:
            int r10 = r9.f4604r
            if (r10 == r4) goto L_0x004b
            r9.f4581b0 = r10
            r2 = 1
        L_0x004b:
            int r10 = r9.f4605s
            if (r10 == r4) goto L_0x0052
            r9.f4580a0 = r10
            r2 = 1
        L_0x0052:
            int r10 = r9.f4610x
            if (r10 == r4) goto L_0x0058
            r9.f4587f0 = r10
        L_0x0058:
            int r10 = r9.f4611y
            if (r10 == r4) goto L_0x005e
            r9.e0 = r10
        L_0x005e:
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0066
            float r2 = r10 - r5
            r9.f4589g0 = r2
        L_0x0066:
            boolean r2 = r9.f4577Y
            if (r2 == 0) goto L_0x00b2
            int r2 = r9.f4570R
            if (r2 != r3) goto L_0x00b2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x007c
            float r10 = r10 - r8
            r9.f4595j0 = r10
            r9.f4591h0 = r4
            r9.f4593i0 = r4
            goto L_0x00b2
        L_0x007c:
            if (r6 == r4) goto L_0x0085
            r9.f4593i0 = r6
            r9.f4591h0 = r4
            r9.f4595j0 = r2
            goto L_0x00b2
        L_0x0085:
            if (r7 == r4) goto L_0x00b2
            r9.f4591h0 = r7
            r9.f4593i0 = r4
            r9.f4595j0 = r2
            goto L_0x00b2
        L_0x008e:
            int r10 = r9.f4602p
            if (r10 == r4) goto L_0x0094
            r9.f4581b0 = r10
        L_0x0094:
            int r10 = r9.f4603q
            if (r10 == r4) goto L_0x009a
            r9.f4580a0 = r10
        L_0x009a:
            int r10 = r9.f4604r
            if (r10 == r4) goto L_0x00a0
            r9.f4583c0 = r10
        L_0x00a0:
            int r10 = r9.f4605s
            if (r10 == r4) goto L_0x00a6
            r9.f4585d0 = r10
        L_0x00a6:
            int r10 = r9.f4610x
            if (r10 == r4) goto L_0x00ac
            r9.e0 = r10
        L_0x00ac:
            int r10 = r9.f4611y
            if (r10 == r4) goto L_0x00b2
            r9.f4587f0 = r10
        L_0x00b2:
            int r10 = r9.f4604r
            if (r10 != r4) goto L_0x00fc
            int r10 = r9.f4605s
            if (r10 != r4) goto L_0x00fc
            int r10 = r9.f4603q
            if (r10 != r4) goto L_0x00fc
            int r10 = r9.f4602p
            if (r10 != r4) goto L_0x00fc
            int r10 = r9.f
            if (r10 == r4) goto L_0x00d1
            r9.f4583c0 = r10
            int r10 = r9.rightMargin
            if (r10 > 0) goto L_0x00df
            if (r1 <= 0) goto L_0x00df
            r9.rightMargin = r1
            goto L_0x00df
        L_0x00d1:
            int r10 = r9.f4588g
            if (r10 == r4) goto L_0x00df
            r9.f4585d0 = r10
            int r10 = r9.rightMargin
            if (r10 > 0) goto L_0x00df
            if (r1 <= 0) goto L_0x00df
            r9.rightMargin = r1
        L_0x00df:
            int r10 = r9.f4584d
            if (r10 == r4) goto L_0x00ee
            r9.f4580a0 = r10
            int r10 = r9.leftMargin
            if (r10 > 0) goto L_0x00fc
            if (r0 <= 0) goto L_0x00fc
            r9.leftMargin = r0
            return
        L_0x00ee:
            int r10 = r9.f4586e
            if (r10 == r4) goto L_0x00fc
            r9.f4581b0 = r10
            int r10 = r9.leftMargin
            if (r10 > 0) goto L_0x00fc
            if (r0 <= 0) goto L_0x00fc
            r9.leftMargin = r0
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0480e.resolveLayoutDirection(int):void");
    }
}
