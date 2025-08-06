package o1;

import java.io.EOFException;
import java.nio.ByteBuffer;

public final class q implements g, AutoCloseable {
    public final e f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final v f3761g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3762h;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, o1.e] */
    public q(v vVar) {
        if (vVar != null) {
            this.f3761g = vVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final x a() {
        return this.f3761g.a();
    }

    public final void close() {
        if (!this.f3762h) {
            this.f3762h = true;
            this.f3761g.close();
            this.f.k();
        }
    }

    public final long f(e eVar, long j2) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (!this.f3762h) {
            e eVar2 = this.f;
            if (eVar2.f3745g == 0 && this.f3761g.f(eVar2, 8192) == -1) {
                return -1;
            }
            return eVar2.f(eVar, Math.min(j2, eVar2.f3745g));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final boolean isOpen() {
        return !this.f3762h;
    }

    public final boolean k() {
        if (!this.f3762h) {
            e eVar = this.f;
            if (!eVar.m() || this.f3761g.f(eVar, 8192) != -1) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long l(byte r19, long r20, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r22
            boolean r3 = r0.f3762h
            if (r3 != 0) goto L_0x00fa
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x00e6
        L_0x000e:
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x00e3
            o1.e r7 = r0.f
            r7.getClass()
            r8 = 0
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x00bd
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x00bd
            long r10 = r7.f3745g
            int r12 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0029
            r12 = r10
            goto L_0x002a
        L_0x0029:
            r12 = r1
        L_0x002a:
            int r14 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0034
        L_0x002e:
            r9 = r19
            r20 = -1
            goto L_0x009d
        L_0x0034:
            o1.r r14 = r7.f
            if (r14 != 0) goto L_0x0039
            goto L_0x002e
        L_0x0039:
            long r15 = r10 - r3
            int r17 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r17 >= 0) goto L_0x004f
        L_0x003f:
            int r8 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x004d
            o1.r r14 = r14.f3767g
            int r8 = r14.f3764c
            int r9 = r14.b
            int r8 = r8 - r9
            long r8 = (long) r8
            long r10 = r10 - r8
            goto L_0x003f
        L_0x004d:
            r8 = r3
            goto L_0x0060
        L_0x004f:
            int r10 = r14.f3764c
            int r11 = r14.b
            int r10 = r10 - r11
            long r10 = (long) r10
            long r10 = r10 + r8
            int r15 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r15 >= 0) goto L_0x005e
            o1.r r14 = r14.f
            r8 = r10
            goto L_0x004f
        L_0x005e:
            r10 = r8
            goto L_0x004d
        L_0x0060:
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x002e
            byte[] r15 = r14.f3763a
            r20 = -1
            int r5 = r14.f3764c
            long r5 = (long) r5
            r16 = r8
            int r8 = r14.b
            long r8 = (long) r8
            long r8 = r8 + r12
            long r8 = r8 - r10
            long r5 = java.lang.Math.min(r5, r8)
            int r6 = (int) r5
            int r5 = r14.b
            long r8 = (long) r5
            long r8 = r8 + r16
            long r8 = r8 - r10
            int r5 = (int) r8
        L_0x007e:
            if (r5 >= r6) goto L_0x008f
            byte r8 = r15[r5]
            r9 = r19
            if (r8 != r9) goto L_0x008c
            int r6 = r14.b
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r10
            goto L_0x009f
        L_0x008c:
            int r5 = r5 + 1
            goto L_0x007e
        L_0x008f:
            r9 = r19
            int r5 = r14.f3764c
            int r6 = r14.b
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r10
            o1.r r14 = r14.f
            r8 = r5
            r10 = r8
            goto L_0x0060
        L_0x009d:
            r5 = -1
        L_0x009f:
            int r8 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r8 == 0) goto L_0x00a4
            return r5
        L_0x00a4:
            long r5 = r7.f3745g
            int r8 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x00e5
            o1.v r8 = r0.f3761g
            r10 = 8192(0x2000, double:4.0474E-320)
            long r7 = r8.f(r7, r10)
            int r10 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r10 != 0) goto L_0x00b7
            goto L_0x00e5
        L_0x00b7:
            long r3 = java.lang.Math.max(r3, r5)
            goto L_0x000e
        L_0x00bd:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            long r6 = r7.f3745g
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "size="
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = " fromIndex="
            r8.append(r6)
            r8.append(r3)
            java.lang.String r3 = " toIndex="
            r8.append(r3)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r5.<init>(r1)
            throw r5
        L_0x00e3:
            r20 = -1
        L_0x00e5:
            return r20
        L_0x00e6:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "fromIndex=0 toIndex="
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            throw r3
        L_0x00fa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.q.l(byte, long, long):long");
    }

    public final boolean m(long j2, h hVar) {
        byte[] bArr = hVar.f;
        int length = bArr.length;
        if (!this.f3762h) {
            if (j2 >= 0 && length >= 0 && bArr.length >= length) {
                int i2 = 0;
                while (i2 < length) {
                    long j3 = ((long) i2) + j2;
                    if (t(1 + j3) && this.f.n(j3) == hVar.f[i2]) {
                        i2++;
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    public final byte n() {
        u(1);
        return this.f.p();
    }

    public final h o(long j2) {
        u(j2);
        e eVar = this.f;
        eVar.getClass();
        return new h(eVar.q(j2));
    }

    public final void p(byte[] bArr) {
        e eVar = this.f;
        int i2 = 0;
        try {
            u((long) bArr.length);
            while (i2 < bArr.length) {
                int o2 = eVar.o(bArr, i2, bArr.length - i2);
                if (o2 != -1) {
                    i2 += o2;
                } else {
                    throw new EOFException();
                }
            }
        } catch (EOFException e2) {
            while (true) {
                long j2 = eVar.f3745g;
                if (j2 > 0) {
                    int o3 = eVar.o(bArr, i2, (int) j2);
                    if (o3 != -1) {
                        i2 += o3;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    public final int q() {
        u(4);
        return this.f.t();
    }

    public final short r() {
        u(2);
        return this.f.u();
    }

    public final int read(ByteBuffer byteBuffer) {
        e eVar = this.f;
        if (eVar.f3745g == 0 && this.f3761g.f(eVar, 8192) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [java.lang.Object, o1.e] */
    public final String s(long j2) {
        long j3;
        long j4 = j2;
        if (j4 >= 0) {
            if (j4 == Long.MAX_VALUE) {
                j3 = Long.MAX_VALUE;
            } else {
                j3 = j4 + 1;
            }
            long l2 = l((byte) 10, 0, j3);
            e eVar = this.f;
            if (l2 != -1) {
                return eVar.x(l2);
            }
            if (j3 < Long.MAX_VALUE && t(j3) && eVar.n(j3 - 1) == 13 && t(j3 + 1) && eVar.n(j3) == 10) {
                return eVar.x(j3);
            }
            ? obj = new Object();
            eVar.l(obj, 0, Math.min(32, eVar.f3745g));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(eVar.f3745g, j4));
            sb.append(" content=");
            try {
                sb.append(new h(obj.q(obj.f3745g)).h());
                sb.append(8230);
                throw new EOFException(sb.toString());
            } catch (EOFException e2) {
                throw new AssertionError(e2);
            }
        } else {
            throw new IllegalArgumentException("limit < 0: " + j4);
        }
    }

    public final boolean t(long j2) {
        e eVar;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (!this.f3762h) {
            do {
                eVar = this.f;
                if (eVar.f3745g >= j2) {
                    return true;
                }
            } while (this.f3761g.f(eVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final String toString() {
        return "buffer(" + this.f3761g + ")";
    }

    public final void u(long j2) {
        if (!t(j2)) {
            throw new EOFException();
        }
    }

    public final void v(long j2) {
        if (!this.f3762h) {
            while (j2 > 0) {
                e eVar = this.f;
                if (eVar.f3745g == 0 && this.f3761g.f(eVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, eVar.f3745g);
                eVar.y(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }
}
