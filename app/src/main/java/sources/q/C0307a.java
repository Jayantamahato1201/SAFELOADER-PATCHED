package q;

import A.g;
import androidx.emoji2.text.r;
import java.util.Arrays;

/* renamed from: q.a  reason: case insensitive filesystem */
public final class C0307a implements C0308b {

    /* renamed from: a  reason: collision with root package name */
    public int f3804a = 0;
    public final c b;

    /* renamed from: c  reason: collision with root package name */
    public final r f3805c;

    /* renamed from: d  reason: collision with root package name */
    public int f3806d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f3807e = new int[8];
    public int[] f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f3808g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f3809h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f3810i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3811j = false;

    public C0307a(c cVar, r rVar) {
        this.b = cVar;
        this.f3805c = rVar;
    }

    public final float a(int i2) {
        int i3 = this.f3809h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f3804a) {
            if (i4 == i2) {
                return this.f3808g[i3];
            }
            i3 = this.f[i3];
            i4++;
        }
        return 0.0f;
    }

    public final void b(i iVar, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f3809h;
            c cVar = this.b;
            if (i2 == -1) {
                this.f3809h = 0;
                this.f3808g[0] = f2;
                this.f3807e[0] = iVar.b;
                this.f[0] = -1;
                iVar.f3843k++;
                iVar.a(cVar);
                this.f3804a++;
                if (!this.f3811j) {
                    int i3 = this.f3810i + 1;
                    this.f3810i = i3;
                    int[] iArr = this.f3807e;
                    if (i3 >= iArr.length) {
                        this.f3811j = true;
                        this.f3810i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.f3804a) {
                int i6 = this.f3807e[i2];
                int i7 = iVar.b;
                if (i6 == i7) {
                    float[] fArr = this.f3808g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f3809h) {
                            this.f3809h = this.f[i2];
                        } else {
                            int[] iArr2 = this.f;
                            iArr2[i5] = iArr2[i2];
                        }
                        if (z2) {
                            iVar.b(cVar);
                        }
                        if (this.f3811j) {
                            this.f3810i = i2;
                        }
                        iVar.f3843k--;
                        this.f3804a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i5 = i2;
                }
                i2 = this.f[i2];
                i4++;
            }
            int i8 = this.f3810i;
            int i9 = i8 + 1;
            if (this.f3811j) {
                int[] iArr3 = this.f3807e;
                if (iArr3[i8] != -1) {
                    i8 = iArr3.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr4 = this.f3807e;
            if (i8 >= iArr4.length && this.f3804a < iArr4.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr5 = this.f3807e;
                    if (i10 >= iArr5.length) {
                        break;
                    } else if (iArr5[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr6 = this.f3807e;
            if (i8 >= iArr6.length) {
                i8 = iArr6.length;
                int i11 = this.f3806d * 2;
                this.f3806d = i11;
                this.f3811j = false;
                this.f3810i = i8 - 1;
                this.f3808g = Arrays.copyOf(this.f3808g, i11);
                this.f3807e = Arrays.copyOf(this.f3807e, this.f3806d);
                this.f = Arrays.copyOf(this.f, this.f3806d);
            }
            this.f3807e[i8] = iVar.b;
            this.f3808g[i8] = f2;
            if (i5 != -1) {
                int[] iArr7 = this.f;
                iArr7[i8] = iArr7[i5];
                iArr7[i5] = i8;
            } else {
                this.f[i8] = this.f3809h;
                this.f3809h = i8;
            }
            iVar.f3843k++;
            iVar.a(cVar);
            this.f3804a++;
            if (!this.f3811j) {
                this.f3810i++;
            }
            int i12 = this.f3810i;
            int[] iArr8 = this.f3807e;
            if (i12 >= iArr8.length) {
                this.f3811j = true;
                this.f3810i = iArr8.length - 1;
            }
        }
    }

    public final float c(i iVar) {
        int i2 = this.f3809h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3804a) {
            if (this.f3807e[i2] == iVar.b) {
                return this.f3808g[i2];
            }
            i2 = this.f[i2];
            i3++;
        }
        return 0.0f;
    }

    public final void clear() {
        int i2 = this.f3809h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3804a) {
            i iVar = ((i[]) this.f3805c.f1185d)[this.f3807e[i2]];
            if (iVar != null) {
                iVar.b(this.b);
            }
            i2 = this.f[i2];
            i3++;
        }
        this.f3809h = -1;
        this.f3810i = -1;
        this.f3811j = false;
        this.f3804a = 0;
    }

    public final float d(c cVar, boolean z2) {
        float c2 = c(cVar.f3812a);
        f(cVar.f3812a, z2);
        C0308b bVar = cVar.f3814d;
        int k2 = bVar.k();
        for (int i2 = 0; i2 < k2; i2++) {
            i e2 = bVar.e(i2);
            b(e2, bVar.c(e2) * c2, z2);
        }
        return c2;
    }

    public final i e(int i2) {
        int i3 = this.f3809h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f3804a) {
            if (i4 == i2) {
                return ((i[]) this.f3805c.f1185d)[this.f3807e[i3]];
            }
            i3 = this.f[i3];
            i4++;
        }
        return null;
    }

    public final float f(i iVar, boolean z2) {
        int i2 = this.f3809h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f3804a) {
            if (this.f3807e[i2] == iVar.b) {
                if (i2 == this.f3809h) {
                    this.f3809h = this.f[i2];
                } else {
                    int[] iArr = this.f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    iVar.b(this.b);
                }
                iVar.f3843k--;
                this.f3804a--;
                this.f3807e[i2] = -1;
                if (this.f3811j) {
                    this.f3810i = i2;
                }
                return this.f3808g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    public final boolean g(i iVar) {
        int i2 = this.f3809h;
        if (i2 != -1) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.f3804a) {
                if (this.f3807e[i2] == iVar.b) {
                    return true;
                }
                i2 = this.f[i2];
                i3++;
            }
        }
        return false;
    }

    public final void h(float f2) {
        int i2 = this.f3809h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3804a) {
            float[] fArr = this.f3808g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f[i2];
            i3++;
        }
    }

    public final void i(i iVar, float f2) {
        if (f2 == 0.0f) {
            f(iVar, true);
            return;
        }
        int i2 = this.f3809h;
        c cVar = this.b;
        if (i2 == -1) {
            this.f3809h = 0;
            this.f3808g[0] = f2;
            this.f3807e[0] = iVar.b;
            this.f[0] = -1;
            iVar.f3843k++;
            iVar.a(cVar);
            this.f3804a++;
            if (!this.f3811j) {
                int i3 = this.f3810i + 1;
                this.f3810i = i3;
                int[] iArr = this.f3807e;
                if (i3 >= iArr.length) {
                    this.f3811j = true;
                    this.f3810i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.f3804a) {
            int i6 = this.f3807e[i2];
            int i7 = iVar.b;
            if (i6 == i7) {
                this.f3808g[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i5 = i2;
            }
            i2 = this.f[i2];
            i4++;
        }
        int i8 = this.f3810i;
        int i9 = i8 + 1;
        if (this.f3811j) {
            int[] iArr2 = this.f3807e;
            if (iArr2[i8] != -1) {
                i8 = iArr2.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr3 = this.f3807e;
        if (i8 >= iArr3.length && this.f3804a < iArr3.length) {
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.f3807e;
                if (i10 >= iArr4.length) {
                    break;
                } else if (iArr4[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr5 = this.f3807e;
        if (i8 >= iArr5.length) {
            i8 = iArr5.length;
            int i11 = this.f3806d * 2;
            this.f3806d = i11;
            this.f3811j = false;
            this.f3810i = i8 - 1;
            this.f3808g = Arrays.copyOf(this.f3808g, i11);
            this.f3807e = Arrays.copyOf(this.f3807e, this.f3806d);
            this.f = Arrays.copyOf(this.f, this.f3806d);
        }
        this.f3807e[i8] = iVar.b;
        this.f3808g[i8] = f2;
        if (i5 != -1) {
            int[] iArr6 = this.f;
            iArr6[i8] = iArr6[i5];
            iArr6[i5] = i8;
        } else {
            this.f[i8] = this.f3809h;
            this.f3809h = i8;
        }
        iVar.f3843k++;
        iVar.a(cVar);
        int i12 = this.f3804a + 1;
        this.f3804a = i12;
        if (!this.f3811j) {
            this.f3810i++;
        }
        int[] iArr7 = this.f3807e;
        if (i12 >= iArr7.length) {
            this.f3811j = true;
        }
        if (this.f3810i >= iArr7.length) {
            this.f3811j = true;
            this.f3810i = iArr7.length - 1;
        }
    }

    public final void j() {
        int i2 = this.f3809h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3804a) {
            float[] fArr = this.f3808g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f[i2];
            i3++;
        }
    }

    public final int k() {
        return this.f3804a;
    }

    public final String toString() {
        int i2 = this.f3809h;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3804a) {
            StringBuilder a2 = h.a(g.h(str, " -> "));
            a2.append(this.f3808g[i2]);
            a2.append(" : ");
            StringBuilder a3 = h.a(a2.toString());
            a3.append(((i[]) this.f3805c.f1185d)[this.f3807e[i2]]);
            str = a3.toString();
            i2 = this.f[i2];
            i3++;
        }
        return str;
    }
}
