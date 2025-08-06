package q;

import java.util.Arrays;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3835a;
    public int b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f3836c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f3837d = 0;

    /* renamed from: e  reason: collision with root package name */
    public float f3838e;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f3839g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f3840h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public c[] f3841i = new c[16];

    /* renamed from: j  reason: collision with root package name */
    public int f3842j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f3843k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f3844l;

    public i(int i2) {
        this.f3844l = i2;
    }

    public final void a(c cVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f3842j;
            if (i2 >= i3) {
                c[] cVarArr = this.f3841i;
                if (i3 >= cVarArr.length) {
                    this.f3841i = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f3841i;
                int i4 = this.f3842j;
                cVarArr2[i4] = cVar;
                this.f3842j = i4 + 1;
                return;
            } else if (this.f3841i[i2] != cVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(c cVar) {
        int i2 = this.f3842j;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f3841i[i3] == cVar) {
                while (i3 < i2 - 1) {
                    c[] cVarArr = this.f3841i;
                    int i4 = i3 + 1;
                    cVarArr[i3] = cVarArr[i4];
                    i3 = i4;
                }
                this.f3842j--;
                return;
            }
            i3++;
        }
    }

    public final void c() {
        this.f3844l = 5;
        this.f3837d = 0;
        this.b = -1;
        this.f3836c = -1;
        this.f3838e = 0.0f;
        this.f = false;
        int i2 = this.f3842j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3841i[i3] = null;
        }
        this.f3842j = 0;
        this.f3843k = 0;
        this.f3835a = false;
        Arrays.fill(this.f3840h, 0.0f);
    }

    public final void d(c cVar) {
        int i2 = this.f3842j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3841i[i3].h(cVar, false);
        }
        this.f3842j = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
