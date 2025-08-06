package j1;

import java.util.Arrays;
import o1.e;

/* renamed from: j1.d  reason: case insensitive filesystem */
public final class C0223d {

    /* renamed from: a  reason: collision with root package name */
    public final e f3220a;
    public int b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3221c;

    /* renamed from: d  reason: collision with root package name */
    public int f3222d = 4096;

    /* renamed from: e  reason: collision with root package name */
    public C0221b[] f3223e = new C0221b[8];
    public int f = 7;

    /* renamed from: g  reason: collision with root package name */
    public int f3224g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f3225h = 0;

    public C0223d(e eVar) {
        this.f3220a = eVar;
    }

    public final void a(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.f3223e.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.f;
                if (length < i3 || i2 <= 0) {
                    C0221b[] bVarArr = this.f3223e;
                    int i5 = i3 + 1;
                    System.arraycopy(bVarArr, i5, bVarArr, i5 + i4, this.f3224g);
                    C0221b[] bVarArr2 = this.f3223e;
                    int i6 = this.f + 1;
                    Arrays.fill(bVarArr2, i6, i6 + i4, (Object) null);
                    this.f += i4;
                } else {
                    int i7 = this.f3223e[length].f3213c;
                    i2 -= i7;
                    this.f3225h -= i7;
                    this.f3224g--;
                    i4++;
                    length--;
                }
            }
            C0221b[] bVarArr3 = this.f3223e;
            int i52 = i3 + 1;
            System.arraycopy(bVarArr3, i52, bVarArr3, i52 + i4, this.f3224g);
            C0221b[] bVarArr22 = this.f3223e;
            int i62 = this.f + 1;
            Arrays.fill(bVarArr22, i62, i62 + i4, (Object) null);
            this.f += i4;
        }
    }

    public final void b(C0221b bVar) {
        int i2 = this.f3222d;
        int i3 = bVar.f3213c;
        if (i3 > i2) {
            Arrays.fill(this.f3223e, (Object) null);
            this.f = this.f3223e.length - 1;
            this.f3224g = 0;
            this.f3225h = 0;
            return;
        }
        a((this.f3225h + i3) - i2);
        int i4 = this.f3224g + 1;
        C0221b[] bVarArr = this.f3223e;
        if (i4 > bVarArr.length) {
            C0221b[] bVarArr2 = new C0221b[(bVarArr.length * 2)];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f = this.f3223e.length - 1;
            this.f3223e = bVarArr2;
        }
        int i5 = this.f;
        this.f = i5 - 1;
        this.f3223e[i5] = bVar;
        this.f3224g++;
        this.f3225h += i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, o1.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(o1.h r12) {
        /*
            r11 = this;
            j1.B r0 = j1.B.f3203d
            r0.getClass()
            r0 = 0
            r2 = 0
            r4 = r0
            r3 = 0
        L_0x000a:
            int r6 = r12.l()
            r7 = 255(0xff, float:3.57E-43)
            if (r3 >= r6) goto L_0x0020
            byte r6 = r12.g(r3)
            r6 = r6 & r7
            byte[] r7 = j1.B.f3202c
            byte r6 = r7[r6]
            long r6 = (long) r6
            long r4 = r4 + r6
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0020:
            r8 = 7
            long r4 = r4 + r8
            r3 = 3
            long r3 = r4 >> r3
            int r4 = (int) r3
            int r3 = r12.l()
            o1.e r5 = r11.f3220a
            r6 = 127(0x7f, float:1.78E-43)
            if (r4 >= r3) goto L_0x008c
            o1.e r3 = new o1.e
            r3.<init>()
            j1.B r4 = j1.B.f3203d
            r4.getClass()
            r4 = 0
        L_0x003c:
            int r8 = r12.l()
            if (r2 >= r8) goto L_0x0063
            byte r8 = r12.g(r2)
            r8 = r8 & r7
            int[] r9 = j1.B.b
            r9 = r9[r8]
            byte[] r10 = j1.B.f3202c
            byte r8 = r10[r8]
            long r0 = r0 << r8
            long r9 = (long) r9
            long r0 = r0 | r9
            int r4 = r4 + r8
        L_0x0053:
            r8 = 8
            if (r4 < r8) goto L_0x0060
            int r4 = r4 + -8
            long r8 = r0 >> r4
            int r9 = (int) r8
            r3.B(r9)
            goto L_0x0053
        L_0x0060:
            int r2 = r2 + 1
            goto L_0x003c
        L_0x0063:
            if (r4 <= 0) goto L_0x0070
            int r12 = 8 - r4
            long r0 = r0 << r12
            int r12 = r7 >>> r4
            long r7 = (long) r12
            long r0 = r0 | r7
            int r12 = (int) r0
            r3.B(r12)
        L_0x0070:
            o1.h r12 = new o1.h
            long r0 = r3.f3745g     // Catch:{ EOFException -> 0x0085 }
            byte[] r0 = r3.q(r0)     // Catch:{ EOFException -> 0x0085 }
            r12.<init>(r0)
            int r0 = r0.length
            r1 = 128(0x80, float:1.794E-43)
            r11.d(r0, r6, r1)
            r12.p(r5)
            return
        L_0x0085:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        L_0x008c:
            int r0 = r12.l()
            r11.d(r0, r6, r2)
            r12.p(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C0223d.c(o1.h):void");
    }

    public final void d(int i2, int i3, int i4) {
        e eVar = this.f3220a;
        if (i2 < i3) {
            eVar.B(i2 | i4);
            return;
        }
        eVar.B(i4 | i3);
        int i5 = i2 - i3;
        while (i5 >= 128) {
            eVar.B(128 | (i5 & 127));
            i5 >>>= 7;
        }
        eVar.B(i5);
    }
}
