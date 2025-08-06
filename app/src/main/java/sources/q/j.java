package q;

import A.g;
import androidx.emoji2.text.r;
import java.util.Arrays;

public final class j implements C0308b {

    /* renamed from: a  reason: collision with root package name */
    public int f3845a = 16;
    public final int[] b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public int[] f3846c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    public int[] f3847d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    public float[] f3848e = new float[16];
    public int[] f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    public int[] f3849g = new int[16];

    /* renamed from: h  reason: collision with root package name */
    public int f3850h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f3851i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final d f3852j;

    /* renamed from: k  reason: collision with root package name */
    public final r f3853k;

    public j(d dVar, r rVar) {
        this.f3852j = dVar;
        this.f3853k = rVar;
        clear();
    }

    public final float a(int i2) {
        int i3 = this.f3850h;
        int i4 = this.f3851i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f3848e[i4];
            }
            i4 = this.f3849g[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public final void b(i iVar, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int n2 = n(iVar);
            if (n2 == -1) {
                i(iVar, f2);
                return;
            }
            float[] fArr = this.f3848e;
            float f3 = fArr[n2] + f2;
            fArr[n2] = f3;
            if (f3 > -0.001f && f3 < 0.001f) {
                fArr[n2] = 0.0f;
                f(iVar, z2);
            }
        }
    }

    public final float c(i iVar) {
        int n2 = n(iVar);
        if (n2 != -1) {
            return this.f3848e[n2];
        }
        return 0.0f;
    }

    public final void clear() {
        int i2 = this.f3850h;
        for (int i3 = 0; i3 < i2; i3++) {
            i e2 = e(i3);
            if (e2 != null) {
                e2.b(this.f3852j);
            }
        }
        for (int i4 = 0; i4 < this.f3845a; i4++) {
            this.f3847d[i4] = -1;
            this.f3846c[i4] = -1;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            this.b[i5] = -1;
        }
        this.f3850h = 0;
        this.f3851i = -1;
    }

    public final float d(c cVar, boolean z2) {
        float c2 = c(cVar.f3812a);
        f(cVar.f3812a, z2);
        j jVar = (j) cVar.f3814d;
        int i2 = jVar.f3850h;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = jVar.f3847d[i4];
            if (i5 != -1) {
                b(((i[]) this.f3853k.f1185d)[i5], jVar.f3848e[i4] * c2, z2);
                i3++;
            }
            i4++;
        }
        return c2;
    }

    public final i e(int i2) {
        int i3 = this.f3850h;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f3851i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return ((i[]) this.f3853k.f1185d)[this.f3847d[i4]];
            }
            i4 = this.f3849g[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    public final float f(i iVar, boolean z2) {
        int[] iArr;
        int i2;
        int n2 = n(iVar);
        if (n2 == -1) {
            return 0.0f;
        }
        int i3 = iVar.b;
        int i4 = i3 % 16;
        int[] iArr2 = this.b;
        int i5 = iArr2[i4];
        if (i5 != -1) {
            if (this.f3847d[i5] == i3) {
                int[] iArr3 = this.f3846c;
                iArr2[i4] = iArr3[i5];
                iArr3[i5] = -1;
            } else {
                while (true) {
                    iArr = this.f3846c;
                    i2 = iArr[i5];
                    if (i2 != -1 && this.f3847d[i2] != i3) {
                        i5 = i2;
                    } else if (i2 != -1 && this.f3847d[i2] == i3) {
                        iArr[i5] = iArr[i2];
                        iArr[i2] = -1;
                    }
                }
                iArr[i5] = iArr[i2];
                iArr[i2] = -1;
            }
        }
        float f2 = this.f3848e[n2];
        if (this.f3851i == n2) {
            this.f3851i = this.f3849g[n2];
        }
        this.f3847d[n2] = -1;
        int[] iArr4 = this.f;
        int i6 = iArr4[n2];
        if (i6 != -1) {
            int[] iArr5 = this.f3849g;
            iArr5[i6] = iArr5[n2];
        }
        int i7 = this.f3849g[n2];
        if (i7 != -1) {
            iArr4[i7] = iArr4[n2];
        }
        this.f3850h--;
        iVar.f3843k--;
        if (z2) {
            iVar.b(this.f3852j);
        }
        return f2;
    }

    public final boolean g(i iVar) {
        if (n(iVar) != -1) {
            return true;
        }
        return false;
    }

    public final void h(float f2) {
        int i2 = this.f3850h;
        int i3 = this.f3851i;
        int i4 = 0;
        while (i4 < i2) {
            float[] fArr = this.f3848e;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f3849g[i3];
            if (i3 != -1) {
                i4++;
            } else {
                return;
            }
        }
    }

    public final void i(i iVar, float f2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = 0;
            if (this.f3850h == 0) {
                m(0, iVar, f2);
                l(iVar, 0);
                this.f3851i = 0;
                return;
            }
            int n2 = n(iVar);
            if (n2 != -1) {
                this.f3848e[n2] = f2;
                return;
            }
            int i3 = this.f3850h + 1;
            int i4 = this.f3845a;
            if (i3 >= i4) {
                int i5 = i4 * 2;
                this.f3847d = Arrays.copyOf(this.f3847d, i5);
                this.f3848e = Arrays.copyOf(this.f3848e, i5);
                this.f = Arrays.copyOf(this.f, i5);
                this.f3849g = Arrays.copyOf(this.f3849g, i5);
                this.f3846c = Arrays.copyOf(this.f3846c, i5);
                for (int i6 = this.f3845a; i6 < i5; i6++) {
                    this.f3847d[i6] = -1;
                    this.f3846c[i6] = -1;
                }
                this.f3845a = i5;
            }
            int i7 = this.f3850h;
            int i8 = this.f3851i;
            int i9 = -1;
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = this.f3847d[i8];
                int i12 = iVar.b;
                if (i11 == i12) {
                    this.f3848e[i8] = f2;
                    return;
                }
                if (i11 < i12) {
                    i9 = i8;
                }
                i8 = this.f3849g[i8];
                if (i8 == -1) {
                    break;
                }
            }
            while (true) {
                if (i2 >= this.f3845a) {
                    i2 = -1;
                    break;
                } else if (this.f3847d[i2] == -1) {
                    break;
                } else {
                    i2++;
                }
            }
            m(i2, iVar, f2);
            if (i9 != -1) {
                this.f[i2] = i9;
                int[] iArr = this.f3849g;
                iArr[i2] = iArr[i9];
                iArr[i9] = i2;
            } else {
                this.f[i2] = -1;
                if (this.f3850h > 0) {
                    this.f3849g[i2] = this.f3851i;
                    this.f3851i = i2;
                } else {
                    this.f3849g[i2] = -1;
                }
            }
            int i13 = this.f3849g[i2];
            if (i13 != -1) {
                this.f[i13] = i2;
            }
            l(iVar, i2);
            return;
        }
        f(iVar, true);
    }

    public final void j() {
        int i2 = this.f3850h;
        int i3 = this.f3851i;
        int i4 = 0;
        while (i4 < i2) {
            float[] fArr = this.f3848e;
            fArr[i3] = fArr[i3] * -1.0f;
            i3 = this.f3849g[i3];
            if (i3 != -1) {
                i4++;
            } else {
                return;
            }
        }
    }

    public final int k() {
        return this.f3850h;
    }

    public final void l(i iVar, int i2) {
        int[] iArr;
        int i3 = iVar.b % 16;
        int[] iArr2 = this.b;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f3846c;
                int i5 = iArr[i4];
                if (i5 == -1) {
                    break;
                }
                i4 = i5;
            }
            iArr[i4] = i2;
        }
        this.f3846c[i2] = -1;
    }

    public final void m(int i2, i iVar, float f2) {
        this.f3847d[i2] = iVar.b;
        this.f3848e[i2] = f2;
        this.f[i2] = -1;
        this.f3849g[i2] = -1;
        iVar.a(this.f3852j);
        iVar.f3843k++;
        this.f3850h++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n(q.i r4) {
        /*
            r3 = this;
            int r0 = r3.f3850h
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r4 = r4.b
            int r0 = r4 % 16
            int[] r2 = r3.b
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0011
            return r1
        L_0x0011:
            int[] r2 = r3.f3847d
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0018
            return r0
        L_0x0018:
            int[] r2 = r3.f3846c
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0025
            int[] r2 = r3.f3847d
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0025
            goto L_0x0018
        L_0x0025:
            if (r0 != r1) goto L_0x0028
            return r1
        L_0x0028:
            int[] r2 = r3.f3847d
            r2 = r2[r0]
            if (r2 != r4) goto L_0x002f
            return r0
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.j.n(q.i):int");
    }

    public final String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i2 = this.f3850h;
        for (int i3 = 0; i3 < i2; i3++) {
            i e2 = e(i3);
            if (e2 != null) {
                String str4 = str3 + e2 + " = " + a(i3) + " ";
                int n2 = n(e2);
                String h2 = g.h(str4, "[p: ");
                int i4 = this.f[n2];
                r rVar = this.f3853k;
                if (i4 != -1) {
                    StringBuilder a2 = h.a(h2);
                    a2.append(((i[]) rVar.f1185d)[this.f3847d[this.f[n2]]]);
                    str = a2.toString();
                } else {
                    str = g.h(h2, "none");
                }
                String h3 = g.h(str, ", n: ");
                if (this.f3849g[n2] != -1) {
                    StringBuilder a3 = h.a(h3);
                    a3.append(((i[]) rVar.f1185d)[this.f3847d[this.f3849g[n2]]]);
                    str2 = a3.toString();
                } else {
                    str2 = g.h(h3, "none");
                }
                str3 = g.h(str2, "]");
            }
        }
        return g.h(str3, " }");
    }
}
