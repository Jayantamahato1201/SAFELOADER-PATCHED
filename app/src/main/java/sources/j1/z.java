package j1;

import A.g;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import o1.e;
import o1.p;
import o1.r;

public final class z implements Closeable, AutoCloseable {

    /* renamed from: l  reason: collision with root package name */
    public static final Logger f3311l = Logger.getLogger(f.class.getName());
    public final p f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3312g;

    /* renamed from: h  reason: collision with root package name */
    public final e f3313h;

    /* renamed from: i  reason: collision with root package name */
    public int f3314i = 16384;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3315j;

    /* renamed from: k  reason: collision with root package name */
    public final C0223d f3316k;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, o1.e] */
    public z(p pVar, boolean z2) {
        this.f = pVar;
        this.f3312g = z2;
        ? obj = new Object();
        this.f3313h = obj;
        this.f3316k = new C0223d(obj);
    }

    public final synchronized void close() {
        this.f3315j = true;
        this.f.close();
    }

    public final synchronized void flush() {
        if (!this.f3315j) {
            this.f.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(D d2) {
        int i2;
        try {
            if (!this.f3315j) {
                int i3 = this.f3314i;
                int i4 = d2.b;
                if ((i4 & 32) != 0) {
                    i3 = d2.f3206a[5];
                }
                this.f3314i = i3;
                int i5 = -1;
                if ((i4 & 2) != 0) {
                    i2 = d2.f3206a[1];
                } else {
                    i2 = -1;
                }
                if (i2 != -1) {
                    C0223d dVar = this.f3316k;
                    if ((i4 & 2) != 0) {
                        i5 = d2.f3206a[1];
                    }
                    int min = Math.min(i5, 16384);
                    int i6 = dVar.f3222d;
                    if (i6 != min) {
                        if (min < i6) {
                            dVar.b = Math.min(dVar.b, min);
                        }
                        dVar.f3221c = true;
                        dVar.f3222d = min;
                        int i7 = dVar.f3225h;
                        if (min < i7) {
                            if (min == 0) {
                                Arrays.fill(dVar.f3223e, (Object) null);
                                dVar.f = dVar.f3223e.length - 1;
                                dVar.f3224g = 0;
                                dVar.f3225h = 0;
                            } else {
                                dVar.a(i7 - min);
                            }
                        }
                    }
                }
                m(0, 0, (byte) 4, (byte) 1);
                this.f.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void l(boolean z2, int i2, e eVar, int i3) {
        byte b;
        if (!this.f3315j) {
            if (z2) {
                b = (byte) 1;
            } else {
                b = 0;
            }
            m(i2, i3, (byte) 0, b);
            if (i3 > 0) {
                this.f.g(eVar, (long) i3);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void m(int i2, int i3, byte b, byte b2) {
        Level level = Level.FINE;
        Logger logger = f3311l;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i2, i3, b, b2));
        }
        int i4 = this.f3314i;
        if (i3 > i4) {
            f.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            throw null;
        } else if ((Integer.MIN_VALUE & i2) == 0) {
            p pVar = this.f;
            pVar.j((i3 >>> 16) & 255);
            pVar.j((i3 >>> 8) & 255);
            pVar.j(i3 & 255);
            pVar.j(b & 255);
            pVar.j(b2 & 255);
            pVar.l(i2 & Integer.MAX_VALUE);
        } else {
            f.b("reserved bit set: %s", Integer.valueOf(i2));
            throw null;
        }
    }

    public final synchronized void n(byte[] bArr, int i2, int i3) {
        try {
            if (this.f3315j) {
                throw new IOException("closed");
            } else if (g.d(i3) != -1) {
                m(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f.l(i2);
                this.f.l(g.d(i3));
                if (bArr.length > 0) {
                    this.f.b(bArr);
                }
                this.f.flush();
            } else {
                f.b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(boolean r18, int r19, java.util.ArrayList r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r0.f3315j
            if (r2 != 0) goto L_0x0145
            j1.d r2 = r0.f3316k
            boolean r3 = r2.f3221c
            r4 = 0
            if (r3 == 0) goto L_0x0028
            int r3 = r2.b
            int r5 = r2.f3222d
            r6 = 32
            r7 = 31
            if (r3 >= r5) goto L_0x001c
            r2.d(r3, r7, r6)
        L_0x001c:
            r2.f3221c = r4
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.b = r3
            int r3 = r2.f3222d
            r2.d(r3, r7, r6)
        L_0x0028:
            int r3 = r20.size()
            r5 = 0
        L_0x002d:
            r6 = 1
            if (r5 >= r3) goto L_0x00ff
            r7 = r20
            java.lang.Object r8 = r7.get(r5)
            j1.b r8 = (j1.C0221b) r8
            o1.h r9 = r8.f3212a
            o1.h r9 = r9.n()
            java.util.Map r10 = j1.C0224e.b
            java.lang.Object r10 = r10.get(r9)
            java.lang.Integer r10 = (java.lang.Integer) r10
            r11 = -1
            o1.h r12 = r8.b
            if (r10 == 0) goto L_0x007a
            int r10 = r10.intValue()
            int r13 = r10 + 1
            if (r13 <= r6) goto L_0x0077
            r14 = 8
            if (r13 >= r14) goto L_0x0077
            j1.b[] r14 = j1.C0224e.f3226a
            r15 = r14[r10]
            o1.h r15 = r15.b
            boolean r15 = e1.c.j(r15, r12)
            if (r15 == 0) goto L_0x0065
            r10 = r13
            goto L_0x007c
        L_0x0065:
            r14 = r14[r13]
            o1.h r14 = r14.b
            boolean r14 = e1.c.j(r14, r12)
            if (r14 == 0) goto L_0x0077
            int r10 = r10 + 2
            r16 = r13
            r13 = r10
            r10 = r16
            goto L_0x007c
        L_0x0077:
            r10 = r13
        L_0x0078:
            r13 = -1
            goto L_0x007c
        L_0x007a:
            r10 = -1
            goto L_0x0078
        L_0x007c:
            if (r13 != r11) goto L_0x00b4
            int r14 = r2.f
            int r14 = r14 + r6
            j1.b[] r6 = r2.f3223e
            int r6 = r6.length
        L_0x0084:
            if (r14 >= r6) goto L_0x00b4
            j1.b[] r15 = r2.f3223e
            r15 = r15[r14]
            o1.h r15 = r15.f3212a
            boolean r15 = e1.c.j(r15, r9)
            if (r15 == 0) goto L_0x00b1
            j1.b[] r15 = r2.f3223e
            r15 = r15[r14]
            o1.h r15 = r15.b
            boolean r15 = e1.c.j(r15, r12)
            if (r15 == 0) goto L_0x00a7
            int r6 = r2.f
            int r14 = r14 - r6
            j1.b[] r6 = j1.C0224e.f3226a
            int r6 = r6.length
            int r13 = r14 + r6
            goto L_0x00b4
        L_0x00a7:
            if (r10 != r11) goto L_0x00b1
            int r10 = r2.f
            int r10 = r14 - r10
            j1.b[] r15 = j1.C0224e.f3226a
            int r15 = r15.length
            int r10 = r10 + r15
        L_0x00b1:
            int r14 = r14 + 1
            goto L_0x0084
        L_0x00b4:
            if (r13 == r11) goto L_0x00be
            r6 = 127(0x7f, float:1.78E-43)
            r8 = 128(0x80, float:1.794E-43)
            r2.d(r13, r6, r8)
            goto L_0x00fb
        L_0x00be:
            r6 = 64
            if (r10 != r11) goto L_0x00d1
            o1.e r10 = r2.f3220a
            r10.B(r6)
            r2.c(r9)
            r2.c(r12)
            r2.b(r8)
            goto L_0x00fb
        L_0x00d1:
            o1.h r11 = j1.C0221b.f3207d
            r9.getClass()
            byte[] r13 = r11.f
            int r13 = r13.length
            boolean r11 = r9.k(r11, r13)
            if (r11 == 0) goto L_0x00f0
            o1.h r11 = j1.C0221b.f3211i
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x00f0
            r6 = 15
            r2.d(r10, r6, r4)
            r2.c(r12)
            goto L_0x00fb
        L_0x00f0:
            r9 = 63
            r2.d(r10, r9, r6)
            r2.c(r12)
            r2.b(r8)
        L_0x00fb:
            int r5 = r5 + 1
            goto L_0x002d
        L_0x00ff:
            o1.e r2 = r0.f3313h
            long r7 = r2.f3745g
            int r3 = r0.f3314i
            long r9 = (long) r3
            long r9 = java.lang.Math.min(r9, r7)
            int r3 = (int) r9
            long r9 = (long) r3
            r5 = 4
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0113
            r12 = 4
            goto L_0x0114
        L_0x0113:
            r12 = 0
        L_0x0114:
            if (r18 == 0) goto L_0x0119
            r12 = r12 | 1
            byte r12 = (byte) r12
        L_0x0119:
            r0.m(r1, r3, r6, r12)
            o1.p r3 = r0.f
            r3.g(r2, r9)
            if (r11 <= 0) goto L_0x0144
            long r7 = r7 - r9
        L_0x0124:
            r9 = 0
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0144
            int r6 = r0.f3314i
            long r11 = (long) r6
            long r11 = java.lang.Math.min(r11, r7)
            int r6 = (int) r11
            long r11 = (long) r6
            long r7 = r7 - r11
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x013a
            r9 = 4
            goto L_0x013b
        L_0x013a:
            r9 = 0
        L_0x013b:
            r10 = 9
            r0.m(r1, r6, r10, r9)
            r3.g(r2, r11)
            goto L_0x0124
        L_0x0144:
            return
        L_0x0145:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.z.o(boolean, int, java.util.ArrayList):void");
    }

    public final synchronized void p(int i2, int i3, boolean z2) {
        if (!this.f3315j) {
            m(0, 8, (byte) 6, z2 ? (byte) 1 : 0);
            this.f.l(i2);
            this.f.l(i3);
            this.f.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void q(int i2, int i3) {
        if (this.f3315j) {
            throw new IOException("closed");
        } else if (g.d(i3) != -1) {
            m(i2, 4, (byte) 3, (byte) 0);
            this.f.l(g.d(i3));
            this.f.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void r(D d2) {
        int i2;
        try {
            if (!this.f3315j) {
                m(0, Integer.bitCount(d2.b) * 6, (byte) 4, (byte) 0);
                for (int i3 = 0; i3 < 10; i3++) {
                    boolean z2 = true;
                    if (((1 << i3) & d2.b) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        if (i3 == 4) {
                            i2 = 3;
                        } else if (i3 == 7) {
                            i2 = 4;
                        } else {
                            i2 = i3;
                        }
                        p pVar = this.f;
                        if (!pVar.f3760h) {
                            e eVar = pVar.f;
                            r z3 = eVar.z(2);
                            int i4 = z3.f3764c;
                            byte[] bArr = z3.f3763a;
                            bArr[i4] = (byte) ((i2 >>> 8) & 255);
                            bArr[i4 + 1] = (byte) (i2 & 255);
                            z3.f3764c = i4 + 2;
                            eVar.f3745g += 2;
                            pVar.k();
                            this.f.l(d2.f3206a[i3]);
                        } else {
                            throw new IllegalStateException("closed");
                        }
                    }
                }
                this.f.flush();
            } else {
                throw new IOException("closed");
            }
        } finally {
        }
    }

    public final synchronized void s(boolean z2, int i2, ArrayList arrayList) {
        if (!this.f3315j) {
            o(z2, i2, arrayList);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void t(int i2, long j2) {
        if (this.f3315j) {
            throw new IOException("closed");
        } else if (j2 == 0 || j2 > 2147483647L) {
            f.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            throw null;
        } else {
            m(i2, 4, (byte) 8, (byte) 0);
            this.f.l((int) j2);
            this.f.flush();
        }
    }
}
