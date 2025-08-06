package o1;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class t extends h {

    /* renamed from: k  reason: collision with root package name */
    public final transient byte[][] f3770k;

    /* renamed from: l  reason: collision with root package name */
    public final transient int[] f3771l;

    public t(e eVar, int i2) {
        super((byte[]) null);
        y.a(eVar.f3745g, 0, (long) i2);
        r rVar = eVar.f;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = rVar.f3764c;
            int i7 = rVar.b;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                rVar = rVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f3770k = new byte[i5][];
        this.f3771l = new int[(i5 * 2)];
        r rVar2 = eVar.f;
        int i8 = 0;
        while (i3 < i2) {
            byte[][] bArr = this.f3770k;
            bArr[i8] = rVar2.f3763a;
            int i9 = rVar2.f3764c;
            int i10 = rVar2.b;
            int i11 = (i9 - i10) + i3;
            if (i11 > i2) {
                i3 = i2;
            } else {
                i3 = i11;
            }
            int[] iArr = this.f3771l;
            iArr[i8] = i3;
            iArr[bArr.length + i8] = i10;
            rVar2.f3765d = true;
            i8++;
            rVar2 = rVar2.f;
        }
    }

    public final String a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (hVar.l() != l() || !k(hVar, l())) {
            return false;
        }
        return true;
    }

    public final byte g(int i2) {
        int i3;
        byte[][] bArr = this.f3770k;
        int[] iArr = this.f3771l;
        y.a((long) iArr[bArr.length - 1], (long) i2, 1);
        int q2 = q(i2);
        if (q2 == 0) {
            i3 = 0;
        } else {
            i3 = iArr[q2 - 1];
        }
        return bArr[q2][(i2 - i3) + iArr[bArr.length + q2]];
    }

    public final String h() {
        return r().h();
    }

    public final int hashCode() {
        int i2 = this.f3748g;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f3770k;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < length) {
            byte[] bArr2 = bArr[i3];
            int[] iArr = this.f3771l;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i4) + i6;
            while (i6 < i8) {
                i5 = (i5 * 31) + bArr2[i6];
                i6++;
            }
            i3++;
            i4 = i7;
        }
        this.f3748g = i5;
        return i5;
    }

    public final boolean j(int i2, byte[] bArr, int i3, int i4) {
        int i5;
        if (i2 >= 0 && i2 <= l() - i4 && i3 >= 0 && i3 <= bArr.length - i4) {
            int q2 = q(i2);
            while (i4 > 0) {
                int[] iArr = this.f3771l;
                if (q2 == 0) {
                    i5 = 0;
                } else {
                    i5 = iArr[q2 - 1];
                }
                int min = Math.min(i4, ((iArr[q2] - i5) + i5) - i2);
                byte[][] bArr2 = this.f3770k;
                int i6 = (i2 - i5) + iArr[bArr2.length + q2];
                byte[] bArr3 = bArr2[q2];
                Charset charset = y.f3775a;
                int i7 = 0;
                while (i7 < min) {
                    if (bArr3[i7 + i6] == bArr[i7 + i3]) {
                        i7++;
                    }
                }
                i2 += min;
                i3 += min;
                i4 -= min;
                q2++;
            }
            return true;
        }
        return false;
    }

    public final boolean k(h hVar, int i2) {
        int i3;
        if (l() - i2 >= 0) {
            int q2 = q(0);
            int i4 = 0;
            int i5 = 0;
            while (i2 > 0) {
                int[] iArr = this.f3771l;
                if (q2 == 0) {
                    i3 = 0;
                } else {
                    i3 = iArr[q2 - 1];
                }
                int min = Math.min(i2, ((iArr[q2] - i3) + i3) - i4);
                byte[][] bArr = this.f3770k;
                if (hVar.j(i5, bArr[q2], (i4 - i3) + iArr[bArr.length + q2], min)) {
                    i4 += min;
                    i5 += min;
                    i2 -= min;
                    q2++;
                }
            }
            return true;
        }
        return false;
    }

    public final int l() {
        return this.f3771l[this.f3770k.length - 1];
    }

    public final h m() {
        return r().m();
    }

    public final h n() {
        return r().n();
    }

    public final String o() {
        return r().o();
    }

    public final void p(e eVar) {
        byte[][] bArr = this.f3770k;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f3771l;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            r rVar = new r(bArr[i2], i4, (i4 + i5) - i3);
            r rVar2 = eVar.f;
            if (rVar2 == null) {
                rVar.f3767g = rVar;
                rVar.f = rVar;
                eVar.f = rVar;
            } else {
                rVar2.f3767g.b(rVar);
            }
            i2++;
            i3 = i5;
        }
        eVar.f3745g += (long) i3;
    }

    public final int q(int i2) {
        int binarySearch = Arrays.binarySearch(this.f3771l, 0, this.f3770k.length, i2 + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final h r() {
        byte[][] bArr = this.f3770k;
        int[] iArr = this.f3771l;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            System.arraycopy(bArr[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return new h(bArr2);
    }

    public final String toString() {
        return r().toString();
    }
}
