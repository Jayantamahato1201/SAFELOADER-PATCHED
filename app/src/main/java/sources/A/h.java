package A;

import android.graphics.Path;
import android.util.Log;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public char f8a;
    public final float[] b;

    public h(char c2, float[] fArr) {
        this.f8a = c2;
        this.b = fArr;
    }

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, boolean z3) {
        double d2;
        double d3;
        float f8 = f;
        float f9 = f3;
        float f10 = f7;
        double radians = Math.toRadians((double) f10);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d4 = (double) f8;
        float f11 = f2;
        double d5 = radians;
        double d6 = (double) f11;
        double d7 = (double) f5;
        double d8 = ((d6 * sin) + (d4 * cos)) / d7;
        double d9 = (double) f6;
        double d10 = ((d6 * cos) + (((double) (-f8)) * sin)) / d9;
        double d11 = d9;
        double d12 = (double) f4;
        double d13 = ((d12 * sin) + (((double) f9) * cos)) / d7;
        double d14 = ((d12 * cos) + (((double) (-f9)) * sin)) / d11;
        double d15 = d8 - d13;
        double d16 = d10 - d14;
        double d17 = (d8 + d13) / 2.0d;
        double d18 = (d10 + d14) / 2.0d;
        double d19 = d15;
        double d20 = (d16 * d16) + (d15 * d15);
        if (d20 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d20);
            float sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            a(path, f, f11, f9, f4, f5 * sqrt, sqrt * f6, f10, z2, z3);
            return;
        }
        boolean z4 = z3;
        double sqrt2 = Math.sqrt(d21);
        double d22 = sqrt2 * d19;
        double d23 = sqrt2 * d16;
        if (z2 == z4) {
            d3 = d17 - d23;
            d2 = d18 + d22;
        } else {
            d3 = d17 + d23;
            d2 = d18 - d22;
        }
        double atan2 = Math.atan2(d10 - d2, d8 - d3);
        double atan22 = Math.atan2(d14 - d2, d13 - d3) - atan2;
        int i2 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z4 != (i2 >= 0)) {
            atan22 = i2 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d3 * d7;
        double d25 = d2 * d11;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d5);
        double sin2 = Math.sin(d5);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d28 = d6;
        double d29 = -d7;
        double d30 = d29 * cos2;
        double d31 = d11 * sin2;
        double d32 = (d30 * sin3) - (d31 * cos3);
        double d33 = d29 * sin2;
        double d34 = d11 * cos2;
        double d35 = (cos3 * d34) + (sin3 * d33);
        double d36 = atan22 / ((double) ceil);
        double d37 = atan2;
        int i3 = 0;
        while (i3 < ceil) {
            double d38 = d37 + d36;
            double sin4 = Math.sin(d38);
            double cos4 = Math.cos(d38);
            int i4 = ceil;
            double d39 = (((d7 * cos2) * cos4) + d26) - (d31 * sin4);
            double d40 = d33;
            double d41 = (d34 * sin4) + (d7 * sin2 * cos4) + d27;
            double d42 = (d30 * sin4) - (d31 * cos4);
            double d43 = (cos4 * d34) + (sin4 * d40);
            double d44 = d38 - d37;
            double tan = Math.tan(d44 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d44)) / 3.0d;
            double d45 = (d32 * sqrt3) + d4;
            double d46 = (d35 * sqrt3) + d28;
            Path path2 = path;
            path2.rLineTo(0.0f, 0.0f);
            Path path3 = path2;
            path3.cubicTo((float) d45, (float) d46, (float) (d39 - (sqrt3 * d42)), (float) (d41 - (sqrt3 * d43)), (float) d39, (float) d41);
            i3++;
            d4 = d39;
            d28 = d41;
            d26 = d26;
            d37 = d38;
            cos2 = cos2;
            d35 = d43;
            d32 = d42;
            ceil = i4;
            d36 = d36;
            d33 = d40;
        }
    }

    public static void b(h[] hVarArr, Path path) {
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        h hVar;
        char c2;
        float f3;
        float f4;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        h hVar2;
        float f5;
        float f6;
        float f7;
        boolean z4;
        h hVar3;
        boolean z5;
        int i7;
        float f8;
        float f9;
        int i8;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        h[] hVarArr2 = hVarArr;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = hVarArr2.length;
        char c3 = 'm';
        char c4 = 0;
        char c5 = 'm';
        int i9 = 0;
        while (i9 < length) {
            h hVar4 = hVarArr2[i9];
            char c6 = hVar4.f8a;
            float f18 = fArr[c4];
            float f19 = fArr[1];
            float f20 = fArr[2];
            float f21 = fArr[3];
            float f22 = fArr[4];
            float f23 = fArr[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f22, f23);
                    f18 = f22;
                    f20 = f18;
                    f19 = f23;
                    f21 = f19;
                    break;
            }
            i2 = 2;
            float f24 = f19;
            float f25 = f22;
            float f26 = f23;
            float f27 = f18;
            int i10 = 0;
            while (true) {
                float[] fArr2 = hVar4.b;
                if (i10 < fArr2.length) {
                    if (c6 == 'A') {
                        i3 = i10;
                        float[] fArr3 = fArr2;
                        hVar = hVar4;
                        float f28 = f2;
                        float f29 = f24;
                        i4 = i9;
                        c2 = c6;
                        int i11 = i3 + 5;
                        float f30 = fArr3[i11];
                        int i12 = i3 + 6;
                        float f31 = fArr3[i12];
                        float f32 = fArr3[i3];
                        float f33 = fArr3[i3 + 1];
                        float f34 = fArr3[i3 + 2];
                        if (fArr3[i3 + 3] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fArr3[i3 + 4] != 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        a(path, f28, f29, f30, f31, f32, f33, f34, z2, z3);
                        f20 = fArr3[i11];
                        f3 = fArr3[i12];
                        f = f3;
                        f4 = f20;
                    } else if (c6 == 'C') {
                        i3 = i10;
                        float[] fArr4 = fArr2;
                        i4 = i9;
                        hVar = hVar4;
                        c2 = c6;
                        int i13 = i3 + 2;
                        int i14 = i3 + 3;
                        int i15 = i3 + 4;
                        int i16 = i3 + 5;
                        path2.cubicTo(fArr4[i3], fArr4[i3 + 1], fArr4[i13], fArr4[i14], fArr4[i15], fArr4[i16]);
                        float f35 = fArr4[i15];
                        float f36 = fArr4[i16];
                        f20 = fArr4[i13];
                        f = fArr4[i14];
                        f3 = f36;
                        f4 = f35;
                    } else if (c6 != 'H') {
                        if (c6 == 'Q') {
                            i5 = i10;
                            float[] fArr5 = fArr2;
                            i6 = i9;
                            hVar2 = hVar4;
                            c2 = c6;
                            int i17 = i5 + 1;
                            int i18 = i5 + 2;
                            int i19 = i5 + 3;
                            path2.quadTo(fArr5[i5], fArr5[i17], fArr5[i18], fArr5[i19]);
                            f5 = fArr5[i5];
                            float f37 = fArr5[i17];
                            f6 = fArr5[i18];
                            f = f37;
                            f7 = fArr5[i19];
                        } else if (c6 == 'V') {
                            i3 = i10;
                            float[] fArr6 = fArr2;
                            i4 = i9;
                            hVar = hVar4;
                            f4 = f2;
                            c2 = c6;
                            path2.lineTo(f4, fArr6[i3]);
                            f3 = fArr6[i3];
                        } else if (c6 != 'a') {
                            if (c6 == 'c') {
                                i7 = i10;
                                float[] fArr7 = fArr2;
                                int i20 = i7 + 2;
                                int i21 = i7 + 3;
                                int i22 = i7 + 4;
                                int i23 = i7 + 5;
                                path2.rCubicTo(fArr7[i7], fArr7[i7 + 1], fArr7[i20], fArr7[i21], fArr7[i22], fArr7[i23]);
                                float f38 = fArr7[i20] + f2;
                                float f39 = f24 + fArr7[i21];
                                f2 += fArr7[i22];
                                f24 += fArr7[i23];
                                f20 = f38;
                                f = f39;
                            } else if (c6 != 'h') {
                                if (c6 != 'q') {
                                    if (c6 != 'v') {
                                        if (c6 == 'L') {
                                            i3 = i10;
                                            float[] fArr8 = fArr2;
                                            int i24 = i3 + 1;
                                            path2.lineTo(fArr8[i3], fArr8[i24]);
                                            f4 = fArr8[i3];
                                            f3 = fArr8[i24];
                                        } else if (c6 == 'M') {
                                            i3 = i10;
                                            float[] fArr9 = fArr2;
                                            f4 = fArr9[i3];
                                            f3 = fArr9[i3 + 1];
                                            if (i3 > 0) {
                                                path2.lineTo(f4, f3);
                                            } else {
                                                path2.moveTo(f4, f3);
                                                f25 = f4;
                                                f26 = f3;
                                            }
                                        } else if (c6 == 'S') {
                                            i5 = i10;
                                            float[] fArr10 = fArr2;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f2 = (f2 * 2.0f) - f20;
                                                f24 = (f24 * 2.0f) - f;
                                            }
                                            float f40 = f2;
                                            float f41 = f24;
                                            int i25 = i5 + 1;
                                            int i26 = i5 + 2;
                                            int i27 = i5 + 3;
                                            path2.cubicTo(f40, f41, fArr10[i5], fArr10[i25], fArr10[i26], fArr10[i27]);
                                            f5 = fArr10[i5];
                                            float f42 = fArr10[i25];
                                            f6 = fArr10[i26];
                                            f = f42;
                                            f7 = fArr10[i27];
                                            i6 = i9;
                                            hVar2 = hVar4;
                                            c2 = c6;
                                        } else if (c6 == 'T') {
                                            i3 = i10;
                                            float[] fArr11 = fArr2;
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f2 = (f2 * 2.0f) - f20;
                                                f24 = (f24 * 2.0f) - f;
                                            }
                                            float f43 = f24;
                                            int i28 = i3 + 1;
                                            path2.quadTo(f2, f43, fArr11[i3], fArr11[i28]);
                                            f = f43;
                                            f4 = fArr11[i3];
                                            f3 = fArr11[i28];
                                            i4 = i9;
                                            hVar = hVar4;
                                            f20 = f2;
                                            c2 = c6;
                                        } else if (c6 == 'l') {
                                            i7 = i10;
                                            float[] fArr12 = fArr2;
                                            int i29 = i7 + 1;
                                            path2.rLineTo(fArr12[i7], fArr12[i29]);
                                            f2 += fArr12[i7];
                                            f13 = fArr12[i29];
                                        } else if (c6 == c3) {
                                            i7 = i10;
                                            float[] fArr13 = fArr2;
                                            float f44 = fArr13[i7];
                                            f2 += f44;
                                            float f45 = fArr13[i7 + 1];
                                            f24 += f45;
                                            if (i7 > 0) {
                                                path2.rLineTo(f44, f45);
                                            } else {
                                                path2.rMoveTo(f44, f45);
                                                hVar = hVar4;
                                                f8 = f2;
                                                f25 = f8;
                                                f9 = f24;
                                                f26 = f9;
                                                i4 = i9;
                                                c2 = c6;
                                            }
                                        } else if (c6 == 's') {
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f14 = f24 - f;
                                                f15 = f2 - f20;
                                            } else {
                                                f15 = 0.0f;
                                                f14 = 0.0f;
                                            }
                                            float[] fArr14 = fArr2;
                                            int i30 = i10 + 1;
                                            float[] fArr15 = fArr14;
                                            int i31 = i10 + 2;
                                            float[] fArr16 = fArr15;
                                            int i32 = i10 + 3;
                                            float[] fArr17 = fArr16;
                                            i8 = i10;
                                            float[] fArr18 = fArr17;
                                            path2.rCubicTo(f15, f14, fArr14[i10], fArr15[i30], fArr16[i31], fArr17[i32]);
                                            f10 = fArr18[i8] + f2;
                                            f11 = f24 + fArr18[i30];
                                            f2 += fArr18[i31];
                                            f12 = fArr18[i32];
                                        } else if (c6 != 't') {
                                            i7 = i10;
                                        } else {
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f16 = f2 - f20;
                                                f17 = f24 - f;
                                            } else {
                                                f17 = 0;
                                                f16 = 0;
                                            }
                                            int i33 = i10 + 1;
                                            path2.rQuadTo(f16, f17, fArr2[i10], fArr2[i33]);
                                            float f46 = f24 + f17;
                                            f24 += fArr2[i33];
                                            f = f46;
                                            i7 = i10;
                                            hVar = hVar4;
                                            f8 = f2 + fArr2[i10];
                                            f20 = f16 + f2;
                                            f9 = f24;
                                            i4 = i9;
                                            c2 = c6;
                                        }
                                        i4 = i9;
                                        hVar = hVar4;
                                        c2 = c6;
                                    } else {
                                        i7 = i10;
                                        float[] fArr19 = fArr2;
                                        path2.rLineTo(0.0f, fArr19[i7]);
                                        f13 = fArr19[i7];
                                    }
                                    f24 += f13;
                                } else {
                                    i8 = i10;
                                    float[] fArr20 = fArr2;
                                    int i34 = i8 + 1;
                                    int i35 = i8 + 2;
                                    int i36 = i8 + 3;
                                    path2.rQuadTo(fArr20[i8], fArr20[i34], fArr20[i35], fArr20[i36]);
                                    f10 = fArr20[i8] + f2;
                                    f11 = f24 + fArr20[i34];
                                    f2 += fArr20[i35];
                                    f12 = fArr20[i36];
                                }
                                f24 += f12;
                                f20 = f10;
                                f = f11;
                            } else {
                                i7 = i10;
                                float[] fArr21 = fArr2;
                                path2.rLineTo(fArr21[i7], 0.0f);
                                f2 += fArr21[i7];
                            }
                            hVar = hVar4;
                            f8 = f2;
                            f9 = f24;
                            i4 = i9;
                            c2 = c6;
                        } else {
                            i3 = i10;
                            float[] fArr22 = fArr2;
                            int i37 = i3 + 5;
                            float f47 = fArr22[i37] + f2;
                            int i38 = i3 + 6;
                            float f48 = fArr22[i38] + f24;
                            float f49 = fArr22[i3];
                            float f50 = fArr22[i3 + 1];
                            float f51 = fArr22[i3 + 2];
                            if (fArr22[i3 + 3] != 0.0f) {
                                hVar3 = hVar4;
                                z4 = true;
                            } else {
                                hVar3 = hVar4;
                                z4 = false;
                            }
                            hVar = hVar3;
                            float f52 = f2;
                            c2 = c6;
                            if (fArr22[i3 + 4] != 0.0f) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            float f53 = f24;
                            i4 = i9;
                            a(path, f52, f53, f47, f48, f49, f50, f51, z4, z5);
                            f4 = f52 + fArr22[i37];
                            f3 = f53 + fArr22[i38];
                            f20 = f4;
                            f = f3;
                        }
                        f20 = f5;
                        f4 = f6;
                    } else {
                        i3 = i10;
                        float[] fArr23 = fArr2;
                        hVar = hVar4;
                        c2 = c6;
                        f3 = f24;
                        i4 = i9;
                        path2.lineTo(fArr23[i3], f3);
                        f4 = fArr23[i3];
                    }
                    c6 = c2;
                    hVar4 = hVar;
                    i9 = i4;
                    c3 = 'm';
                    f27 = f4;
                    f24 = f3;
                    c5 = c6;
                    i10 = i3 + i2;
                    path2 = path;
                } else {
                    fArr[0] = f2;
                    fArr[1] = f24;
                    fArr[2] = f20;
                    fArr[3] = f;
                    fArr[4] = f25;
                    fArr[5] = f26;
                    c5 = hVar4.f8a;
                    i9++;
                    path2 = path;
                    c3 = 'm';
                    c4 = 0;
                }
            }
        }
    }

    public h(h hVar) {
        this.f8a = hVar.f8a;
        float[] fArr = hVar.b;
        this.b = i.q(fArr, fArr.length);
    }
}
