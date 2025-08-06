package b0;

public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public int f1696a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f1697c;

    /* renamed from: d  reason: collision with root package name */
    public int f1698d;

    /* renamed from: e  reason: collision with root package name */
    public int f1699e;

    public final boolean a() {
        int i2;
        int i3;
        int i4;
        int i5 = this.f1696a;
        int i6 = 2;
        if ((i5 & 7) != 0) {
            int i7 = this.f1698d;
            int i8 = this.b;
            if (i7 > i8) {
                i4 = 1;
            } else if (i7 == i8) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            if ((i4 & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 112) != 0) {
            int i9 = this.f1698d;
            int i10 = this.f1697c;
            if (i9 > i10) {
                i3 = 1;
            } else if (i9 == i10) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            if (((i3 << 4) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 1792) != 0) {
            int i11 = this.f1699e;
            int i12 = this.b;
            if (i11 > i12) {
                i2 = 1;
            } else if (i11 == i12) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            if (((i2 << 8) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 28672) != 0) {
            int i13 = this.f1699e;
            int i14 = this.f1697c;
            if (i13 > i14) {
                i6 = 1;
            } else if (i13 != i14) {
                i6 = 4;
            }
            if ((i5 & (i6 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
