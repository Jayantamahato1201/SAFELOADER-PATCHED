package j1;

import q1.H;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    public int[] f3206a;
    public int b;

    public D(int i2) {
        if (i2 == 0) {
            this.f3206a = H.b;
        } else {
            this.f3206a = new int[i2];
        }
        this.b = 0;
    }

    public int a() {
        if ((this.b & 128) != 0) {
            return this.f3206a[7];
        }
        return 65535;
    }

    public void b(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f3206a;
            if (i2 < iArr.length) {
                this.b = (1 << i2) | this.b;
                iArr[i2] = i3;
            }
        }
    }

    public boolean c(int i2) {
        int a2 = H.a(this.b, i2, this.f3206a);
        if (a2 >= 0) {
            return false;
        }
        int i3 = this.b;
        int[] iArr = this.f3206a;
        int i4 = ~a2;
        int i5 = i3 + 1;
        if (i5 <= iArr.length) {
            System.arraycopy(iArr, i4, iArr, i4 + 1, i3 - i4);
            iArr[i4] = i2;
        } else {
            int i6 = 4;
            if (i3 >= 4) {
                i6 = i3 * 2;
            }
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            iArr2[i4] = i2;
            System.arraycopy(iArr, i4, iArr2, i4 + 1, iArr.length - i4);
            iArr = iArr2;
        }
        this.f3206a = iArr;
        this.b = i5;
        return true;
    }

    public D() {
        this.f3206a = new int[10];
    }
}
