package m1;

import e1.c;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o1.l;
import o1.o;
import o1.q;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f3664e = {42};
    public static final String[] f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f3665g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    public static final a f3666h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f3667a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f3668c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f3669d;

    public static String a(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z2;
        byte b2;
        int i4;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr3[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i3 = i7 + i8;
                if (bArr3[i3] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i3 - i7;
            int i10 = i2;
            boolean z3 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z3) {
                    b2 = 46;
                    z2 = false;
                } else {
                    z2 = z3;
                    b2 = bArr4[i10][i11] & 255;
                }
                i4 = b2 - (bArr3[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (bArr4[i10].length != i11) {
                        z3 = z2;
                    } else if (i10 == bArr4.length - 1) {
                        break;
                    } else {
                        i10++;
                        z3 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr4[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr3, i7, i9, c.f2615d);
                        }
                    }
                }
                i5 = i3 + 1;
            }
            length = i6;
        }
        return null;
    }

    public final void b() {
        InputStream resourceAsStream = a.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            q qVar = new q(new l(o.c(resourceAsStream)));
            try {
                byte[] bArr = new byte[qVar.q()];
                qVar.p(bArr);
                byte[] bArr2 = new byte[qVar.q()];
                qVar.p(bArr2);
                synchronized (this) {
                    this.f3668c = bArr;
                    this.f3669d = bArr2;
                }
                this.b.countDown();
            } finally {
                c.d(qVar);
            }
        }
    }
}
