package q;

import b0.C0089m;
import java.util.Arrays;

public final class g extends c {
    public i[] f;

    /* renamed from: g  reason: collision with root package name */
    public i[] f3831g;

    /* renamed from: h  reason: collision with root package name */
    public int f3832h;

    /* renamed from: i  reason: collision with root package name */
    public f f3833i;

    public final i d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f3832h; i3++) {
            i[] iVarArr = this.f;
            i iVar = iVarArr[i3];
            if (!zArr[iVar.b]) {
                f fVar = this.f3833i;
                fVar.f = iVar;
                int i4 = 8;
                if (i2 != -1) {
                    i iVar2 = iVarArr[i2];
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f2 = iVar2.f3840h[i4];
                        float f3 = fVar.f.f3840h[i4];
                        if (f3 == f2) {
                            i4--;
                        } else if (f3 >= f2) {
                        }
                    }
                } else {
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f4 = fVar.f.f3840h[i4];
                        if (f4 > 0.0f) {
                            break;
                        } else if (f4 < 0.0f) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f[i2];
    }

    public final void h(c cVar, boolean z2) {
        c cVar2 = cVar;
        i iVar = cVar2.f3812a;
        if (iVar != null) {
            C0308b bVar = cVar2.f3814d;
            int k2 = bVar.k();
            for (int i2 = 0; i2 < k2; i2++) {
                i e2 = bVar.e(i2);
                float a2 = bVar.a(i2);
                f fVar = this.f3833i;
                fVar.f = e2;
                boolean z3 = e2.f3835a;
                float[] fArr = iVar.f3840h;
                if (z3) {
                    boolean z4 = true;
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr2 = fVar.f.f3840h;
                        float f2 = (fArr[i3] * a2) + fArr2[i3];
                        fArr2[i3] = f2;
                        if (Math.abs(f2) < 1.0E-4f) {
                            fVar.f.f3840h[i3] = 0.0f;
                        } else {
                            z4 = false;
                        }
                    }
                    if (z4) {
                        fVar.f3830g.j(fVar.f);
                    }
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f3 = fArr[i4];
                        if (f3 != 0.0f) {
                            float f4 = f3 * a2;
                            if (Math.abs(f4) < 1.0E-4f) {
                                f4 = 0.0f;
                            }
                            fVar.f.f3840h[i4] = f4;
                        } else {
                            fVar.f.f3840h[i4] = 0.0f;
                        }
                    }
                    i(e2);
                }
                this.b = (cVar2.b * a2) + this.b;
            }
            j(iVar);
        }
    }

    public final void i(i iVar) {
        int i2;
        int i3 = this.f3832h + 1;
        i[] iVarArr = this.f;
        if (i3 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f = iVarArr2;
            this.f3831g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f;
        int i4 = this.f3832h;
        iVarArr3[i4] = iVar;
        int i5 = i4 + 1;
        this.f3832h = i5;
        if (i5 > 1 && iVarArr3[i4].b > iVar.b) {
            int i6 = 0;
            while (true) {
                i2 = this.f3832h;
                if (i6 >= i2) {
                    break;
                }
                this.f3831g[i6] = this.f[i6];
                i6++;
            }
            Arrays.sort(this.f3831g, 0, i2, new C0089m(2));
            for (int i7 = 0; i7 < this.f3832h; i7++) {
                this.f[i7] = this.f3831g[i7];
            }
        }
        iVar.f3835a = true;
        iVar.a(this);
    }

    public final void j(i iVar) {
        int i2 = 0;
        while (i2 < this.f3832h) {
            if (this.f[i2] == iVar) {
                while (true) {
                    int i3 = this.f3832h;
                    if (i2 < i3 - 1) {
                        i[] iVarArr = this.f;
                        int i4 = i2 + 1;
                        iVarArr[i2] = iVarArr[i4];
                        i2 = i4;
                    } else {
                        this.f3832h = i3 - 1;
                        iVar.f3835a = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i2 = 0; i2 < this.f3832h; i2++) {
            i iVar = this.f[i2];
            f fVar = this.f3833i;
            fVar.f = iVar;
            str = str + fVar + " ";
        }
        return str;
    }
}
