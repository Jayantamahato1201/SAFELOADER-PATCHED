package j1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import o1.h;
import o1.o;
import o1.q;

/* renamed from: j1.c  reason: case insensitive filesystem */
public final class C0222c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3214a = new ArrayList();
    public final q b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3215c = 4096;

    /* renamed from: d  reason: collision with root package name */
    public int f3216d = 4096;

    /* renamed from: e  reason: collision with root package name */
    public C0221b[] f3217e = new C0221b[8];
    public int f = 7;

    /* renamed from: g  reason: collision with root package name */
    public int f3218g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f3219h = 0;

    public C0222c(t tVar) {
        Logger logger = o.f3758a;
        this.b = new q(tVar);
    }

    public final int a(int i2) {
        int i3;
        int i4 = 0;
        if (i2 > 0) {
            int length = this.f3217e.length;
            while (true) {
                length--;
                i3 = this.f;
                if (length < i3 || i2 <= 0) {
                    C0221b[] bVarArr = this.f3217e;
                    System.arraycopy(bVarArr, i3 + 1, bVarArr, i3 + 1 + i4, this.f3218g);
                    this.f += i4;
                } else {
                    int i5 = this.f3217e[length].f3213c;
                    i2 -= i5;
                    this.f3219h -= i5;
                    this.f3218g--;
                    i4++;
                }
            }
            C0221b[] bVarArr2 = this.f3217e;
            System.arraycopy(bVarArr2, i3 + 1, bVarArr2, i3 + 1 + i4, this.f3218g);
            this.f += i4;
        }
        return i4;
    }

    public final h b(int i2) {
        if (i2 >= 0) {
            C0221b[] bVarArr = C0224e.f3226a;
            if (i2 <= bVarArr.length - 1) {
                return bVarArr[i2].f3212a;
            }
        }
        int length = this.f + 1 + (i2 - C0224e.f3226a.length);
        if (length >= 0) {
            C0221b[] bVarArr2 = this.f3217e;
            if (length < bVarArr2.length) {
                return bVarArr2[length].f3212a;
            }
        }
        throw new IOException("Header index too large " + (i2 + 1));
    }

    public final void c(C0221b bVar) {
        this.f3214a.add(bVar);
        int i2 = this.f3216d;
        int i3 = bVar.f3213c;
        if (i3 > i2) {
            Arrays.fill(this.f3217e, (Object) null);
            this.f = this.f3217e.length - 1;
            this.f3218g = 0;
            this.f3219h = 0;
            return;
        }
        a((this.f3219h + i3) - i2);
        int i4 = this.f3218g + 1;
        C0221b[] bVarArr = this.f3217e;
        if (i4 > bVarArr.length) {
            C0221b[] bVarArr2 = new C0221b[(bVarArr.length * 2)];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f = this.f3217e.length - 1;
            this.f3217e = bVarArr2;
        }
        int i5 = this.f;
        this.f = i5 - 1;
        this.f3217e[i5] = bVar;
        this.f3218g++;
        this.f3219h += i3;
    }

    public final h d() {
        boolean z2;
        int i2;
        q qVar = this.b;
        byte n2 = qVar.n();
        byte b2 = n2 & 255;
        if ((n2 & 128) == 128) {
            z2 = true;
        } else {
            z2 = false;
        }
        int e2 = e(b2, 127);
        if (!z2) {
            return qVar.o((long) e2);
        }
        B b3 = B.f3203d;
        long j2 = (long) e2;
        qVar.u(j2);
        byte[] q2 = qVar.f.q(j2);
        b3.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        A a2 = b3.f3204a;
        A a3 = a2;
        byte b4 = 0;
        int i3 = 0;
        for (byte b5 : q2) {
            b4 = (b4 << 8) | (b5 & 255);
            i3 += 8;
            while (i3 >= 8) {
                a3 = ((A[]) a3.f3201c)[(b4 >>> (i3 - 8)) & 255];
                if (((A[]) a3.f3201c) == null) {
                    byteArrayOutputStream.write(a3.f3200a);
                    i3 -= a3.b;
                    a3 = a2;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            A a4 = ((A[]) a3.f3201c)[(b4 << (8 - i3)) & 255];
            if (((A[]) a4.f3201c) != null || (i2 = a4.b) > i3) {
                break;
            }
            byteArrayOutputStream.write(a4.f3200a);
            i3 -= i2;
            a3 = a2;
        }
        return h.i(byteArrayOutputStream.toByteArray());
    }

    public final int e(int i2, int i3) {
        int i4 = i2 & i3;
        if (i4 < i3) {
            return i4;
        }
        int i5 = 0;
        while (true) {
            byte n2 = this.b.n();
            byte b2 = n2 & 255;
            if ((n2 & 128) == 0) {
                return i3 + (b2 << i5);
            }
            i3 += (n2 & Byte.MAX_VALUE) << i5;
            i5 += 7;
        }
    }
}
