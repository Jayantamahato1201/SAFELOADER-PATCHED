package z;

import A.a;
import android.graphics.Color;

/* renamed from: z.a  reason: case insensitive filesystem */
public final class C0502a {

    /* renamed from: a  reason: collision with root package name */
    public final float f4849a;
    public final float b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4850c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4851d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4852e;
    public final float f;

    public C0502a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f4849a = f2;
        this.b = f3;
        this.f4850c = f4;
        this.f4851d = f5;
        this.f4852e = f6;
        this.f = f7;
    }

    public static C0502a a(int i2) {
        float f2;
        C0516o oVar = C0516o.f4872k;
        float f3 = C0503b.f(Color.red(i2));
        float f4 = C0503b.f(Color.green(i2));
        float f5 = C0503b.f(Color.blue(i2));
        float[][] fArr = C0503b.f4855d;
        float[] fArr2 = fArr[0];
        float f6 = fArr2[1] * f4;
        float f7 = (fArr2[2] * f5) + f6 + (fArr2[0] * f3);
        float[] fArr3 = fArr[1];
        float f8 = fArr3[1] * f4;
        float f9 = (fArr3[2] * f5) + f8 + (fArr3[0] * f3);
        float[] fArr4 = fArr[2];
        float f10 = (f5 * fArr4[2]) + (f4 * fArr4[1]) + (f3 * fArr4[0]);
        float[][] fArr5 = C0503b.f4853a;
        float[] fArr6 = fArr5[0];
        float f11 = fArr6[1] * f9;
        float f12 = (fArr6[2] * f10) + f11 + (fArr6[0] * f7);
        float[] fArr7 = fArr5[1];
        float f13 = fArr7[1] * f9;
        float f14 = fArr7[2] * f10;
        float[] fArr8 = fArr5[2];
        float f15 = f7 * fArr8[0];
        float f16 = f10 * fArr8[2];
        float[] fArr9 = oVar.f4877g;
        float f17 = fArr9[0] * f12;
        float f18 = fArr9[1] * (f14 + f13 + (fArr7[0] * f7));
        float f19 = fArr9[2] * (f16 + (f9 * fArr8[1]) + f15);
        float abs = Math.abs(f17);
        float f20 = oVar.f4878h;
        float pow = (float) Math.pow(((double) (abs * f20)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f18) * f20)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f19) * f20)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f17) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f18) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f19) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = (double) signum3;
        float f21 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d2)) / 11.0f;
        float f22 = ((float) (((double) (signum + signum2)) - (d2 * 2.0d))) / 9.0f;
        float f23 = signum2 * 20.0f;
        float f24 = ((21.0f * signum3) + ((signum * 20.0f) + f23)) / 20.0f;
        float f25 = (((signum * 40.0f) + f23) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f22, (double) f21)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f26 = atan2;
        float f27 = (3.1415927f * f26) / 180.0f;
        float f28 = f25 * oVar.b;
        float f29 = oVar.f4873a;
        float f30 = oVar.f4875d;
        float pow4 = ((float) Math.pow((double) (f28 / f29), (double) (oVar.f4880j * f30))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        float f31 = f29 + 4.0f;
        if (((double) f26) < 20.14d) {
            f2 = f26 + 360.0f;
        } else {
            f2 = f26;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) oVar.f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.f4876e) * oVar.f4874c) * ((float) Math.sqrt((double) ((f22 * f22) + (f21 * f21))))) / (f24 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        Math.sqrt((double) ((pow5 * f30) / f31));
        float f32 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((oVar.f4879i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d3 = (double) f27;
        return new C0502a(f26, sqrt, pow4, f32, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public static C0502a b(float f2, float f3, float f4) {
        C0516o oVar = C0516o.f4872k;
        float f5 = oVar.f4875d;
        double d2 = ((double) f2) / 100.0d;
        Math.sqrt(d2);
        Math.sqrt((double) (((f3 / ((float) Math.sqrt(d2))) * oVar.f4875d) / (oVar.f4873a + 4.0f)));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((((double) (oVar.f4879i * f3)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f4) / 180.0f);
        return new C0502a(f4, f3, f2, f6, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public final int c(C0516o oVar) {
        float f2;
        C0516o oVar2 = oVar;
        float f3 = this.b;
        float f4 = this.f4850c;
        if (((double) f3) != 0.0d) {
            double d2 = (double) f4;
            if (d2 != 0.0d) {
                f2 = f3 / ((float) Math.sqrt(d2 / 100.0d));
                float pow = (float) Math.pow(((double) f2) / Math.pow(1.64d - Math.pow(0.29d, (double) oVar2.f), 0.73d), 1.1111111111111112d);
                double d3 = (double) ((this.f4849a * 3.1415927f) / 180.0f);
                float pow2 = oVar2.f4873a * ((float) Math.pow(((double) f4) / 100.0d, (1.0d / ((double) oVar2.f4875d)) / ((double) oVar2.f4880j)));
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f * 3846.1538f * oVar2.f4876e * oVar2.f4874c;
                float f5 = pow2 / oVar2.b;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f6 = 11.0f * pow * cos2;
                float f7 = (((0.305f + f5) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f6 + (cos * 23.0f)));
                float f8 = cos2 * f7;
                float f9 = f7 * sin;
                float f10 = f5 * 460.0f;
                float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
                float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
                float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
                float signum = Math.signum(f11);
                float f14 = 100.0f / oVar2.f4878h;
                float pow3 = signum * f14 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11))))), 2.380952380952381d));
                float signum2 = Math.signum(f12) * f14 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12))))), 2.380952380952381d));
                float[] fArr = oVar2.f4877g;
                float f15 = pow3 / fArr[0];
                float f16 = signum2 / fArr[1];
                float signum3 = ((Math.signum(f13) * f14) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = C0503b.b;
                float[] fArr3 = fArr2[0];
                float f17 = fArr3[1] * f16;
                float f18 = (fArr3[2] * signum3) + f17 + (fArr3[0] * f15);
                float[] fArr4 = fArr2[1];
                float f19 = fArr4[1] * f16;
                float f20 = fArr4[2] * signum3;
                float[] fArr5 = fArr2[2];
                float f21 = f15 * fArr5[0];
                return a.a((double) f18, (double) (f20 + f19 + (fArr4[0] * f15)), (double) ((signum3 * fArr5[2]) + (f16 * fArr5[1]) + f21));
            }
        }
        f2 = 0.0f;
        float pow4 = (float) Math.pow(((double) f2) / Math.pow(1.64d - Math.pow(0.29d, (double) oVar2.f), 0.73d), 1.1111111111111112d);
        double d32 = (double) ((this.f4849a * 3.1415927f) / 180.0f);
        float pow22 = oVar2.f4873a * ((float) Math.pow(((double) f4) / 100.0d, (1.0d / ((double) oVar2.f4875d)) / ((double) oVar2.f4880j)));
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f * 3846.1538f * oVar2.f4876e * oVar2.f4874c;
        float f52 = pow22 / oVar2.b;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f62 = 11.0f * pow4 * cos22;
        float f72 = (((0.305f + f52) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f62 + (cos3 * 23.0f)));
        float f82 = cos22 * f72;
        float f92 = f72 * sin2;
        float f102 = f52 * 460.0f;
        float f112 = ((288.0f * f92) + ((451.0f * f82) + f102)) / 1403.0f;
        float f122 = ((f102 - (891.0f * f82)) - (261.0f * f92)) / 1403.0f;
        float f132 = ((f102 - (f82 * 220.0f)) - (f92 * 6300.0f)) / 1403.0f;
        float signum4 = Math.signum(f112);
        float f142 = 100.0f / oVar2.f4878h;
        float pow32 = signum4 * f142 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f112)) * 27.13d) / (400.0d - ((double) Math.abs(f112))))), 2.380952380952381d));
        float signum22 = Math.signum(f122) * f142 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f122)) * 27.13d) / (400.0d - ((double) Math.abs(f122))))), 2.380952380952381d));
        float[] fArr6 = oVar2.f4877g;
        float f152 = pow32 / fArr6[0];
        float f162 = signum22 / fArr6[1];
        float signum32 = ((Math.signum(f132) * f142) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f132)) * 27.13d) / (400.0d - ((double) Math.abs(f132))))), 2.380952380952381d))) / fArr6[2];
        float[][] fArr22 = C0503b.b;
        float[] fArr32 = fArr22[0];
        float f172 = fArr32[1] * f162;
        float f182 = (fArr32[2] * signum32) + f172 + (fArr32[0] * f152);
        float[] fArr42 = fArr22[1];
        float f192 = fArr42[1] * f162;
        float f202 = fArr42[2] * signum32;
        float[] fArr52 = fArr22[2];
        float f212 = f152 * fArr52[0];
        return a.a((double) f182, (double) (f202 + f192 + (fArr42[0] * f152)), (double) ((signum32 * fArr52[2]) + (f162 * fArr52[1]) + f212));
    }
}
