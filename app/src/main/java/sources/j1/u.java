package j1;

import A.g;
import e1.c;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o1.q;
import q.h;

public final class u implements Closeable, AutoCloseable {

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f3288j = Logger.getLogger(f.class.getName());
    public final q f;

    /* renamed from: g  reason: collision with root package name */
    public final t f3289g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3290h;

    /* renamed from: i  reason: collision with root package name */
    public final C0222c f3291i;

    public u(q qVar, boolean z2) {
        this.f = qVar;
        this.f3290h = z2;
        t tVar = new t(qVar);
        this.f3289g = tVar;
        this.f3291i = new C0222c(tVar);
    }

    public static int k(int i2, byte b, short s2) {
        if ((b & 8) != 0) {
            i2--;
        }
        if (s2 <= i2) {
            return (short) (i2 - s2);
        }
        f.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s2), Integer.valueOf(i2));
        throw null;
    }

    public static int r(q qVar) {
        return (qVar.n() & 255) | ((qVar.n() & 255) << 16) | ((qVar.n() & 255) << 8);
    }

    public final void close() {
        this.f.close();
    }

    public final boolean l(boolean z2, q qVar) {
        int i2;
        try {
            this.f.u(9);
            int r2 = r(this.f);
            if (r2 < 0 || r2 > 16384) {
                f.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(r2));
                throw null;
            }
            byte n2 = (byte) (this.f.n() & 255);
            if (!z2 || n2 == 4) {
                byte n3 = (byte) (this.f.n() & 255);
                int q2 = this.f.q();
                int i3 = Integer.MAX_VALUE & q2;
                Logger logger = f3288j;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f.a(true, i3, r2, n2, n3));
                }
                switch (n2) {
                    case 0:
                        n(qVar, r2, n3, i3);
                        return true;
                    case 1:
                        q(qVar, r2, n3, i3);
                        return true;
                    case 2:
                        if (r2 != 5) {
                            f.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(r2));
                            throw null;
                        } else if (i3 != 0) {
                            q qVar2 = this.f;
                            qVar2.q();
                            qVar2.n();
                            qVar.getClass();
                            return true;
                        } else {
                            f.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 3:
                        if (r2 != 4) {
                            f.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(r2));
                            throw null;
                        } else if (i3 != 0) {
                            int q3 = this.f.q();
                            int[] c2 = h.c(11);
                            int length = c2.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 < length) {
                                    i2 = c2[i4];
                                    if (g.d(i2) != q3) {
                                        i4++;
                                    }
                                } else {
                                    i2 = 0;
                                }
                            }
                            if (i2 != 0) {
                                s sVar = (s) qVar.f3260h;
                                sVar.getClass();
                                if (i3 == 0 || (q2 & 1) != 0) {
                                    y o2 = sVar.o(i3);
                                    if (o2 != null) {
                                        o2.j(i2);
                                        break;
                                    }
                                } else {
                                    sVar.f3271n.execute(new k(sVar, new Object[]{sVar.f3266i, Integer.valueOf(i3)}, i3, i2));
                                    return true;
                                }
                            } else {
                                f.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(q3));
                                throw null;
                            }
                        } else {
                            f.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        break;
                    case 4:
                        u(qVar, r2, n3, i3);
                        return true;
                    case 5:
                        t(qVar, r2, n3, i3);
                        return true;
                    case 6:
                        s(qVar, r2, n3, i3);
                        return true;
                    case 7:
                        o(qVar, r2, i3);
                        return true;
                    case 8:
                        if (r2 == 4) {
                            long q4 = ((long) this.f.q()) & 2147483647L;
                            int i5 = (q4 > 0 ? 1 : (q4 == 0 ? 0 : -1));
                            if (i5 == 0) {
                                f.c("windowSizeIncrement was 0", Long.valueOf(q4));
                                throw null;
                            } else if (i3 == 0) {
                                synchronized (((s) qVar.f3260h)) {
                                    s sVar2 = (s) qVar.f3260h;
                                    sVar2.f3275r += q4;
                                    sVar2.notifyAll();
                                }
                                return true;
                            } else {
                                y m2 = ((s) qVar.f3260h).m(i3);
                                if (m2 != null) {
                                    synchronized (m2) {
                                        m2.b += q4;
                                        if (i5 > 0) {
                                            m2.notifyAll();
                                        }
                                    }
                                    return true;
                                }
                            }
                        } else {
                            f.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(r2));
                            throw null;
                        }
                        break;
                    default:
                        this.f.v((long) r2);
                        return true;
                }
                return true;
            }
            f.c("Expected a SETTINGS frame but was %s", Byte.valueOf(n2));
            throw null;
        } catch (IOException unused) {
            return false;
        }
    }

    public final void m(q qVar) {
        if (!this.f3290h) {
            o1.h hVar = f.f3227a;
            o1.h o2 = this.f.o((long) hVar.f.length);
            Level level = Level.FINE;
            Logger logger = f3288j;
            if (logger.isLoggable(level)) {
                String h2 = o2.h();
                byte[] bArr = c.f2613a;
                Locale locale = Locale.US;
                logger.fine("<< CONNECTION " + h2);
            }
            if (!hVar.equals(o2)) {
                f.c("Expected a connection header but was %s", o2.o());
                throw null;
            }
        } else if (!l(true, qVar)) {
            f.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, o1.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0120, code lost:
        if (r8 == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0122, code lost:
        r4.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(j1.q r18, int r19, byte r20, int r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r20
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r21 == 0) goto L_0x0135
            r7 = r2 & 1
            if (r7 == 0) goto L_0x0012
            r8 = 1
            goto L_0x0013
        L_0x0012:
            r8 = 0
        L_0x0013:
            r7 = r2 & 32
            if (r7 != 0) goto L_0x012c
            r5 = r2 & 8
            if (r5 == 0) goto L_0x0028
            o1.q r5 = r1.f
            byte r5 = r5.n()
            r5 = r5 & 255(0xff, float:3.57E-43)
            short r5 = (short) r5
            r9 = r5
        L_0x0025:
            r5 = r19
            goto L_0x002a
        L_0x0028:
            r9 = 0
            goto L_0x0025
        L_0x002a:
            int r7 = k(r5, r2, r9)
            o1.q r2 = r1.f
            java.lang.Object r5 = r0.f3260h
            j1.s r5 = (j1.s) r5
            r5.getClass()
            if (r21 == 0) goto L_0x008f
            r5 = r21 & 1
            if (r5 != 0) goto L_0x008f
            java.lang.Object r0 = r0.f3260h
            j1.s r0 = (j1.s) r0
            r0.getClass()
            r10 = 0
            o1.e r6 = new o1.e
            r6.<init>()
            long r11 = (long) r7
            r2.u(r11)
            r2.f(r6, r11)
            long r13 = r6.f3745g
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0073
            java.util.concurrent.ThreadPoolExecutor r11 = r0.f3271n
            j1.l r2 = new j1.l
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            java.lang.String r12 = r0.f3266i
            r13 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r10] = r12
            r4[r13] = r5
            r5 = r21
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.execute(r2)
            goto L_0x0125
        L_0x0073:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = r6.f3745g
            r2.append(r3)
            java.lang.String r3 = " != "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x008f:
            r5 = r21
            r10 = 0
            r13 = 1
            java.lang.Object r4 = r0.f3260h
            j1.s r4 = (j1.s) r4
            j1.y r4 = r4.m(r5)
            if (r4 != 0) goto L_0x00aa
            java.lang.Object r0 = r0.f3260h
            j1.s r0 = (j1.s) r0
            r0.r(r5, r3)
            long r3 = (long) r7
            r2.v(r3)
            goto L_0x0125
        L_0x00aa:
            j1.w r0 = r4.f3306g
            long r5 = (long) r7
        L_0x00ad:
            r11 = 0
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x011d
            j1.y r3 = r0.f3299k
            monitor-enter(r3)
            boolean r7 = r0.f3298j     // Catch:{ all -> 0x011a }
            o1.e r14 = r0.f3295g     // Catch:{ all -> 0x011a }
            long r14 = r14.f3745g     // Catch:{ all -> 0x011a }
            long r14 = r14 + r5
            r18 = r11
            long r11 = r0.f3296h     // Catch:{ all -> 0x011a }
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 <= 0) goto L_0x00c7
            r11 = 1
            goto L_0x00c8
        L_0x00c7:
            r11 = 0
        L_0x00c8:
            monitor-exit(r3)     // Catch:{ all -> 0x011a }
            if (r11 == 0) goto L_0x00e0
            r2.v(r5)
            j1.y r0 = r0.f3299k
            r2 = 4
            boolean r3 = r0.d(r2)
            if (r3 != 0) goto L_0x00d8
            goto L_0x0120
        L_0x00d8:
            j1.s r3 = r0.f3304d
            int r0 = r0.f3303c
            r3.r(r0, r2)
            goto L_0x0120
        L_0x00e0:
            if (r7 == 0) goto L_0x00e6
            r2.v(r5)
            goto L_0x0120
        L_0x00e6:
            o1.e r3 = r0.f
            long r11 = r2.f(r3, r5)
            r14 = -1
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x0114
            long r5 = r5 - r11
            j1.y r3 = r0.f3299k
            monitor-enter(r3)
            o1.e r7 = r0.f3295g     // Catch:{ all -> 0x010e }
            long r11 = r7.f3745g     // Catch:{ all -> 0x010e }
            int r14 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r14 != 0) goto L_0x0100
            r11 = 1
            goto L_0x0101
        L_0x0100:
            r11 = 0
        L_0x0101:
            o1.e r12 = r0.f     // Catch:{ all -> 0x010e }
            r7.c(r12)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x0110
            j1.y r7 = r0.f3299k     // Catch:{ all -> 0x010e }
            r7.notifyAll()     // Catch:{ all -> 0x010e }
            goto L_0x0110
        L_0x010e:
            r0 = move-exception
            goto L_0x0112
        L_0x0110:
            monitor-exit(r3)     // Catch:{ all -> 0x010e }
            goto L_0x00ad
        L_0x0112:
            monitor-exit(r3)     // Catch:{ all -> 0x010e }
            throw r0
        L_0x0114:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x011a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x011a }
            throw r0
        L_0x011d:
            r0.getClass()
        L_0x0120:
            if (r8 == 0) goto L_0x0125
            r4.h()
        L_0x0125:
            o1.q r0 = r1.f
            long r2 = (long) r9
            r0.v(r2)
            return
        L_0x012c:
            r10 = 0
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.lang.Object[] r2 = new java.lang.Object[r10]
            j1.f.c(r0, r2)
            throw r5
        L_0x0135:
            r10 = 0
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r10]
            j1.f.c(r0, r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.u.n(j1.q, int, byte, int):void");
    }

    public final void o(q qVar, int i2, int i3) {
        int i4;
        y[] yVarArr;
        if (i2 < 8) {
            f.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int q2 = this.f.q();
            int q3 = this.f.q();
            int i5 = i2 - 8;
            int[] c2 = h.c(11);
            int length = c2.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    i4 = 0;
                    break;
                }
                i4 = c2[i6];
                if (g.d(i4) == q3) {
                    break;
                }
                i6++;
            }
            if (i4 != 0) {
                o1.h hVar = o1.h.f3747j;
                if (i5 > 0) {
                    hVar = this.f.o((long) i5);
                }
                qVar.getClass();
                hVar.l();
                synchronized (((s) qVar.f3260h)) {
                    yVarArr = (y[]) ((s) qVar.f3260h).f3265h.values().toArray(new y[((s) qVar.f3260h).f3265h.size()]);
                    ((s) qVar.f3260h).f3269l = true;
                }
                for (y yVar : yVarArr) {
                    if (yVar.f3303c > q2 && yVar.f()) {
                        yVar.j(5);
                        ((s) qVar.f3260h).o(yVar.f3303c);
                    }
                }
                return;
            }
            f.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(q3));
            throw null;
        } else {
            f.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        throw new java.io.IOException(A.g.f(r4, "Header index too large "));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList p(int r3, short r4, byte r5, int r6) {
        /*
            r2 = this;
            j1.t r0 = r2.f3289g
            r0.f3286j = r3
            r0.f3283g = r3
            r0.f3287k = r4
            r0.f3284h = r5
            r0.f3285i = r6
        L_0x000c:
            j1.c r3 = r2.f3291i
            o1.q r4 = r3.b
            boolean r5 = r4.k()
            java.util.ArrayList r6 = r3.f3214a
            if (r5 != 0) goto L_0x011d
            byte r4 = r4.n()
            r5 = r4 & 255(0xff, float:3.57E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r5 == r0) goto L_0x0115
            r1 = r4 & 128(0x80, float:1.794E-43)
            if (r1 != r0) goto L_0x005f
            r4 = 127(0x7f, float:1.78E-43)
            int r4 = r3.e(r5, r4)
            int r5 = r4 + -1
            if (r5 < 0) goto L_0x003d
            j1.b[] r0 = j1.C0224e.f3226a
            int r1 = r0.length
            int r1 = r1 + -1
            if (r5 > r1) goto L_0x003d
            r3 = r0[r5]
            r6.add(r3)
            goto L_0x000c
        L_0x003d:
            j1.b[] r0 = j1.C0224e.f3226a
            int r0 = r0.length
            int r5 = r5 - r0
            int r0 = r3.f
            int r0 = r0 + 1
            int r0 = r0 + r5
            if (r0 < 0) goto L_0x0053
            j1.b[] r3 = r3.f3217e
            int r5 = r3.length
            if (r0 >= r5) goto L_0x0053
            r3 = r3[r0]
            r6.add(r3)
            goto L_0x000c
        L_0x0053:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r5 = "Header index too large "
            java.lang.String r4 = A.g.f(r4, r5)
            r3.<init>(r4)
            throw r3
        L_0x005f:
            r0 = 64
            if (r5 != r0) goto L_0x0077
            o1.h r4 = r3.d()
            j1.C0224e.a(r4)
            o1.h r5 = r3.d()
            j1.b r6 = new j1.b
            r6.<init>((o1.h) r4, (o1.h) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x0077:
            r1 = r4 & 64
            if (r1 != r0) goto L_0x0095
            r4 = 63
            int r4 = r3.e(r5, r4)
            int r4 = r4 + -1
            o1.h r4 = r3.b(r4)
            o1.h r5 = r3.d()
            j1.b r6 = new j1.b
            r6.<init>((o1.h) r4, (o1.h) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x0095:
            r4 = r4 & 32
            r0 = 32
            if (r4 != r0) goto L_0x00df
            r4 = 31
            int r4 = r3.e(r5, r4)
            r3.f3216d = r4
            if (r4 < 0) goto L_0x00c9
            int r5 = r3.f3215c
            if (r4 > r5) goto L_0x00c9
            int r5 = r3.f3219h
            if (r4 >= r5) goto L_0x000c
            if (r4 != 0) goto L_0x00c3
            j1.b[] r4 = r3.f3217e
            r5 = 0
            java.util.Arrays.fill(r4, r5)
            j1.b[] r4 = r3.f3217e
            int r4 = r4.length
            int r4 = r4 + -1
            r3.f = r4
            r4 = 0
            r3.f3218g = r4
            r3.f3219h = r4
            goto L_0x000c
        L_0x00c3:
            int r5 = r5 - r4
            r3.a(r5)
            goto L_0x000c
        L_0x00c9:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid dynamic table size update "
            r5.<init>(r6)
            int r3 = r3.f3216d
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00df:
            r4 = 16
            if (r5 == r4) goto L_0x0100
            if (r5 != 0) goto L_0x00e6
            goto L_0x0100
        L_0x00e6:
            r4 = 15
            int r4 = r3.e(r5, r4)
            int r4 = r4 + -1
            o1.h r4 = r3.b(r4)
            o1.h r3 = r3.d()
            j1.b r5 = new j1.b
            r5.<init>((o1.h) r4, (o1.h) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x0100:
            o1.h r4 = r3.d()
            j1.C0224e.a(r4)
            o1.h r3 = r3.d()
            j1.b r5 = new j1.b
            r5.<init>((o1.h) r4, (o1.h) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x0115:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x011d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            r6.clear()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.u.p(int, short, byte, int):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c3, code lost:
        r13.i(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c6, code lost:
        if (r8 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        r13.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(j1.q r11, int r12, byte r13, int r14) {
        /*
            r10 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r14 == 0) goto L_0x00ce
            r3 = r13 & 1
            if (r3 == 0) goto L_0x000b
            r8 = 1
            goto L_0x000c
        L_0x000b:
            r8 = 0
        L_0x000c:
            r3 = r13 & 8
            if (r3 == 0) goto L_0x001a
            o1.q r3 = r10.f
            byte r3 = r3.n()
            r3 = r3 & 255(0xff, float:3.57E-43)
            short r3 = (short) r3
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            r4 = r13 & 32
            if (r4 == 0) goto L_0x002c
            o1.q r4 = r10.f
            r4.q()
            r4.n()
            r11.getClass()
            int r12 = r12 + -5
        L_0x002c:
            int r12 = k(r12, r13, r3)
            java.util.ArrayList r9 = r10.p(r12, r3, r13, r14)
            java.lang.Object r12 = r11.f3260h
            j1.s r12 = (j1.s) r12
            r12.getClass()
            if (r14 == 0) goto L_0x0064
            r12 = r14 & 1
            if (r12 != 0) goto L_0x0064
            java.lang.Object r11 = r11.f3260h
            r5 = r11
            j1.s r5 = (j1.s) r5
            r5.getClass()
            java.util.concurrent.ThreadPoolExecutor r11 = r5.f3271n     // Catch:{ RejectedExecutionException -> 0x00cb }
            j1.k r4 = new j1.k     // Catch:{ RejectedExecutionException -> 0x00cb }
            java.lang.String r12 = r5.f3266i     // Catch:{ RejectedExecutionException -> 0x00cb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ RejectedExecutionException -> 0x00cb }
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ RejectedExecutionException -> 0x00cb }
            r6[r2] = r12     // Catch:{ RejectedExecutionException -> 0x00cb }
            r6[r1] = r13     // Catch:{ RejectedExecutionException -> 0x00cb }
            r7 = r9
            r9 = r8
            r8 = r7
            r7 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ RejectedExecutionException -> 0x00cb }
            r11.execute(r4)     // Catch:{ RejectedExecutionException -> 0x00cb }
            return
        L_0x0064:
            r5 = r14
            java.lang.Object r12 = r11.f3260h
            j1.s r12 = (j1.s) r12
            monitor-enter(r12)
            java.lang.Object r13 = r11.f3260h     // Catch:{ all -> 0x007f }
            j1.s r13 = (j1.s) r13     // Catch:{ all -> 0x007f }
            j1.y r13 = r13.m(r5)     // Catch:{ all -> 0x007f }
            if (r13 != 0) goto L_0x00c2
            java.lang.Object r13 = r11.f3260h     // Catch:{ all -> 0x007f }
            r6 = r13
            j1.s r6 = (j1.s) r6     // Catch:{ all -> 0x007f }
            boolean r13 = r6.f3269l     // Catch:{ all -> 0x007f }
            if (r13 == 0) goto L_0x0082
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            return
        L_0x007f:
            r0 = move-exception
            r11 = r0
            goto L_0x00cc
        L_0x0082:
            int r13 = r6.f3267j     // Catch:{ all -> 0x007f }
            if (r5 > r13) goto L_0x0088
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            return
        L_0x0088:
            int r14 = r5 % 2
            int r13 = r6.f3268k     // Catch:{ all -> 0x007f }
            int r13 = r13 % r0
            if (r14 != r13) goto L_0x0091
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            return
        L_0x0091:
            j1.y r4 = new j1.y     // Catch:{ all -> 0x007f }
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007f }
            java.lang.Object r13 = r11.f3260h     // Catch:{ all -> 0x007f }
            j1.s r13 = (j1.s) r13     // Catch:{ all -> 0x007f }
            r13.f3267j = r5     // Catch:{ all -> 0x007f }
            java.util.LinkedHashMap r13 = r13.f3265h     // Catch:{ all -> 0x007f }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x007f }
            r13.put(r14, r4)     // Catch:{ all -> 0x007f }
            java.util.concurrent.ThreadPoolExecutor r13 = j1.s.f3263z     // Catch:{ all -> 0x007f }
            j1.q r14 = new j1.q     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r11.f3260h     // Catch:{ all -> 0x007f }
            j1.s r3 = (j1.s) r3     // Catch:{ all -> 0x007f }
            java.lang.String r3 = r3.f3266i     // Catch:{ all -> 0x007f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x007f }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x007f }
            r0[r2] = r3     // Catch:{ all -> 0x007f }
            r0[r1] = r5     // Catch:{ all -> 0x007f }
            r14.<init>((j1.q) r11, (java.lang.Object[]) r0, (j1.y) r4)     // Catch:{ all -> 0x007f }
            r13.execute(r14)     // Catch:{ all -> 0x007f }
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            return
        L_0x00c2:
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            r13.i(r9)
            if (r8 == 0) goto L_0x00cb
            r13.h()
        L_0x00cb:
            return
        L_0x00cc:
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            throw r11
        L_0x00ce:
            java.lang.String r11 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            j1.f.c(r11, r12)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.u.q(j1.q, int, byte, int):void");
    }

    public final void s(q qVar, int i2, byte b, int i3) {
        boolean z2;
        if (i2 != 8) {
            f.c("TYPE_PING length != 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int q2 = this.f.q();
            int q3 = this.f.q();
            if ((b & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            qVar.getClass();
            if (z2) {
                synchronized (((s) qVar.f3260h)) {
                    s sVar = (s) qVar.f3260h;
                    sVar.f3273p = false;
                    sVar.notifyAll();
                }
                return;
            }
            try {
                s sVar2 = (s) qVar.f3260h;
                sVar2.f3270m.execute(new p(sVar2, true, q2, q3));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            f.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    public final void t(q qVar, int i2, byte b, int i3) {
        short s2;
        if (i3 != 0) {
            if ((b & 8) != 0) {
                s2 = (short) (this.f.n() & 255);
            } else {
                s2 = 0;
            }
            int q2 = this.f.q() & Integer.MAX_VALUE;
            ArrayList p2 = p(k(i2 - 4, b, s2), s2, b, i3);
            s sVar = (s) qVar.f3260h;
            synchronized (sVar) {
                try {
                    if (sVar.f3282y.contains(Integer.valueOf(q2))) {
                        sVar.r(q2, 2);
                        return;
                    }
                    sVar.f3282y.add(Integer.valueOf(q2));
                    try {
                        sVar.f3271n.execute(new k(sVar, new Object[]{sVar.f3266i, Integer.valueOf(q2)}, q2, p2));
                    } catch (RejectedExecutionException unused) {
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        } else {
            f.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:38|39|(5:42|(1:44)(1:45)|(2:47|105)(2:48|104)|49|40)|50|51|52|53|(1:67)(4:56|(3:58|(1:60)|61)|64|(1:66))|68|69) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00c0 */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(j1.q r10, int r11, byte r12, int r13) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r13 != 0) goto L_0x015c
            r12 = r12 & r0
            if (r12 == 0) goto L_0x0016
            if (r11 != 0) goto L_0x000e
            r10.getClass()
            return
        L_0x000e:
            java.lang.String r10 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            j1.f.c(r10, r11)
            throw r2
        L_0x0016:
            int r12 = r11 % 6
            if (r12 != 0) goto L_0x014e
            j1.D r12 = new j1.D
            r12.<init>()
            r13 = 0
        L_0x0020:
            if (r13 >= r11) goto L_0x0078
            o1.q r3 = r9.f
            short r3 = r3.r()
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            o1.q r4 = r9.f
            int r4 = r4.q()
            r5 = 2
            if (r3 == r5) goto L_0x0065
            r5 = 3
            r6 = 4
            if (r3 == r5) goto L_0x0063
            if (r3 == r6) goto L_0x0057
            r5 = 5
            if (r3 == r5) goto L_0x003f
            goto L_0x0072
        L_0x003f:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L_0x0049
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L_0x0049
            goto L_0x0072
        L_0x0049:
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r1] = r11
            j1.f.c(r10, r12)
            throw r2
        L_0x0057:
            if (r4 < 0) goto L_0x005b
            r3 = 7
            goto L_0x0072
        L_0x005b:
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            j1.f.c(r10, r11)
            throw r2
        L_0x0063:
            r3 = 4
            goto L_0x0072
        L_0x0065:
            if (r4 == 0) goto L_0x0072
            if (r4 != r0) goto L_0x006a
            goto L_0x0072
        L_0x006a:
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            j1.f.c(r10, r11)
            throw r2
        L_0x0072:
            r12.b(r3, r4)
            int r13 = r13 + 6
            goto L_0x0020
        L_0x0078:
            java.lang.Object r11 = r10.f3260h
            r13 = r11
            j1.s r13 = (j1.s) r13
            monitor-enter(r13)
            java.lang.Object r11 = r10.f3260h     // Catch:{ all -> 0x00ee }
            j1.s r11 = (j1.s) r11     // Catch:{ all -> 0x00ee }
            j1.D r11 = r11.f3277t     // Catch:{ all -> 0x00ee }
            int r11 = r11.a()     // Catch:{ all -> 0x00ee }
            java.lang.Object r3 = r10.f3260h     // Catch:{ all -> 0x00ee }
            j1.s r3 = (j1.s) r3     // Catch:{ all -> 0x00ee }
            j1.D r3 = r3.f3277t     // Catch:{ all -> 0x00ee }
            r3.getClass()     // Catch:{ all -> 0x00ee }
            r4 = 0
        L_0x0092:
            r5 = 10
            if (r4 >= r5) goto L_0x00ac
            int r5 = r0 << r4
            int r6 = r12.b     // Catch:{ all -> 0x00ee }
            r5 = r5 & r6
            if (r5 == 0) goto L_0x009f
            r5 = 1
            goto L_0x00a0
        L_0x009f:
            r5 = 0
        L_0x00a0:
            if (r5 != 0) goto L_0x00a3
            goto L_0x00aa
        L_0x00a3:
            int[] r5 = r12.f3206a     // Catch:{ all -> 0x00ee }
            r5 = r5[r4]     // Catch:{ all -> 0x00ee }
            r3.b(r4, r5)     // Catch:{ all -> 0x00ee }
        L_0x00aa:
            int r4 = r4 + r0
            goto L_0x0092
        L_0x00ac:
            java.lang.Object r3 = r10.f3260h     // Catch:{ RejectedExecutionException -> 0x00c0 }
            j1.s r3 = (j1.s) r3     // Catch:{ RejectedExecutionException -> 0x00c0 }
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r3.f3270m     // Catch:{ RejectedExecutionException -> 0x00c0 }
            j1.q r5 = new j1.q     // Catch:{ RejectedExecutionException -> 0x00c0 }
            java.lang.String r3 = r3.f3266i     // Catch:{ RejectedExecutionException -> 0x00c0 }
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ RejectedExecutionException -> 0x00c0 }
            r6[r1] = r3     // Catch:{ RejectedExecutionException -> 0x00c0 }
            r5.<init>((j1.q) r10, (java.lang.Object[]) r6, (j1.D) r12)     // Catch:{ RejectedExecutionException -> 0x00c0 }
            r4.execute(r5)     // Catch:{ RejectedExecutionException -> 0x00c0 }
        L_0x00c0:
            java.lang.Object r12 = r10.f3260h     // Catch:{ all -> 0x00ee }
            j1.s r12 = (j1.s) r12     // Catch:{ all -> 0x00ee }
            j1.D r12 = r12.f3277t     // Catch:{ all -> 0x00ee }
            int r12 = r12.a()     // Catch:{ all -> 0x00ee }
            r3 = -1
            r4 = 0
            if (r12 == r3) goto L_0x0119
            if (r12 == r11) goto L_0x0119
            int r12 = r12 - r11
            long r11 = (long) r12     // Catch:{ all -> 0x00ee }
            java.lang.Object r3 = r10.f3260h     // Catch:{ all -> 0x00ee }
            j1.s r3 = (j1.s) r3     // Catch:{ all -> 0x00ee }
            boolean r6 = r3.f3278u     // Catch:{ all -> 0x00ee }
            if (r6 != 0) goto L_0x00f0
            long r6 = r3.f3275r     // Catch:{ all -> 0x00ee }
            long r6 = r6 + r11
            r3.f3275r = r6     // Catch:{ all -> 0x00ee }
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e7
            r3.notifyAll()     // Catch:{ all -> 0x00ee }
        L_0x00e7:
            java.lang.Object r3 = r10.f3260h     // Catch:{ all -> 0x00ee }
            j1.s r3 = (j1.s) r3     // Catch:{ all -> 0x00ee }
            r3.f3278u = r0     // Catch:{ all -> 0x00ee }
            goto L_0x00f0
        L_0x00ee:
            r10 = move-exception
            goto L_0x014c
        L_0x00f0:
            java.lang.Object r3 = r10.f3260h     // Catch:{ all -> 0x00ee }
            j1.s r3 = (j1.s) r3     // Catch:{ all -> 0x00ee }
            java.util.LinkedHashMap r3 = r3.f3265h     // Catch:{ all -> 0x00ee }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00ee }
            if (r3 != 0) goto L_0x011a
            java.lang.Object r2 = r10.f3260h     // Catch:{ all -> 0x00ee }
            j1.s r2 = (j1.s) r2     // Catch:{ all -> 0x00ee }
            java.util.LinkedHashMap r2 = r2.f3265h     // Catch:{ all -> 0x00ee }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00ee }
            java.lang.Object r3 = r10.f3260h     // Catch:{ all -> 0x00ee }
            j1.s r3 = (j1.s) r3     // Catch:{ all -> 0x00ee }
            java.util.LinkedHashMap r3 = r3.f3265h     // Catch:{ all -> 0x00ee }
            int r3 = r3.size()     // Catch:{ all -> 0x00ee }
            j1.y[] r3 = new j1.y[r3]     // Catch:{ all -> 0x00ee }
            java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ all -> 0x00ee }
            j1.y[] r2 = (j1.y[]) r2     // Catch:{ all -> 0x00ee }
            goto L_0x011a
        L_0x0119:
            r11 = r4
        L_0x011a:
            java.util.concurrent.ThreadPoolExecutor r3 = j1.s.f3263z     // Catch:{ all -> 0x00ee }
            j1.r r6 = new j1.r     // Catch:{ all -> 0x00ee }
            java.lang.Object r7 = r10.f3260h     // Catch:{ all -> 0x00ee }
            j1.s r7 = (j1.s) r7     // Catch:{ all -> 0x00ee }
            java.lang.String r7 = r7.f3266i     // Catch:{ all -> 0x00ee }
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ all -> 0x00ee }
            r8[r1] = r7     // Catch:{ all -> 0x00ee }
            r6.<init>(r10, r8)     // Catch:{ all -> 0x00ee }
            r3.execute(r6)     // Catch:{ all -> 0x00ee }
            monitor-exit(r13)     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x014b
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x014b
            int r13 = r2.length
        L_0x0136:
            if (r1 >= r13) goto L_0x014b
            r3 = r2[r1]
            monitor-enter(r3)
            long r4 = r3.b     // Catch:{ all -> 0x0148 }
            long r4 = r4 + r11
            r3.b = r4     // Catch:{ all -> 0x0148 }
            if (r10 <= 0) goto L_0x0145
            r3.notifyAll()     // Catch:{ all -> 0x0148 }
        L_0x0145:
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
            int r1 = r1 + r0
            goto L_0x0136
        L_0x0148:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
            throw r10
        L_0x014b:
            return
        L_0x014c:
            monitor-exit(r13)     // Catch:{ all -> 0x00ee }
            throw r10
        L_0x014e:
            java.lang.String r10 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r1] = r11
            j1.f.c(r10, r12)
            throw r2
        L_0x015c:
            java.lang.String r10 = "TYPE_SETTINGS streamId != 0"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            j1.f.c(r10, r11)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.u.u(j1.q, int, byte, int):void");
    }
}
