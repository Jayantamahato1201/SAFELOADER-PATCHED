package z;

/* renamed from: z.o  reason: case insensitive filesystem */
public final class C0516o {

    /* renamed from: k  reason: collision with root package name */
    public static final C0516o f4872k;

    /* renamed from: a  reason: collision with root package name */
    public final float f4873a;
    public final float b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4874c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4875d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4876e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f4877g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4878h;

    /* renamed from: i  reason: collision with root package name */
    public final float f4879i;

    /* renamed from: j  reason: collision with root package name */
    public final float f4880j;

    static {
        float f2;
        float[] fArr = C0503b.f4854c;
        float n2 = (float) ((((double) C0503b.n()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C0503b.f4853a;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + (fArr3[0] * f3);
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = fArr4[1] * f4;
        float f9 = (fArr4[2] * f6) + f8 + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f10 = f3 * fArr5[0];
        float f11 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + f10;
        if (((double) 1.0f) >= 0.9d) {
            f2 = 0.69f;
        } else {
            f2 = 0.655f;
        }
        float exp = (1.0f - (((float) Math.exp((double) (((-n2) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d2 = (double) exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * n2) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(((double) n2) * 5.0d))) + (f13 * n2);
        float n3 = C0503b.n() / fArr[1];
        double d3 = (double) n3;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f9)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * cbrt) * f11)) / 100.0d, 0.42d)};
        float f15 = fArr7[0];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[1];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr7[2];
        float[] fArr8 = {f16, f18, (400.0f * f19) / (f19 + 27.13f)};
        float[] fArr9 = fArr6;
        float f20 = cbrt;
        f4872k = new C0516o(n3, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f2, 1.0f, fArr9, f20, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public C0516o(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f = f2;
        this.f4873a = f3;
        this.b = f4;
        this.f4874c = f5;
        this.f4875d = f6;
        this.f4876e = f7;
        this.f4877g = fArr;
        this.f4878h = f8;
        this.f4879i = f9;
        this.f4880j = f10;
    }
}
