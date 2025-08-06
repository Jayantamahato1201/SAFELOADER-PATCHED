package o1;

import A.g;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class e implements g, f, Cloneable, ByteChannel, AutoCloseable {

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f3744h = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public r f;

    /* renamed from: g  reason: collision with root package name */
    public long f3745g;

    public final void A(byte[] bArr, int i2) {
        if (bArr != null) {
            int i3 = 0;
            long j2 = (long) i2;
            y.a((long) bArr.length, (long) 0, j2);
            while (i3 < i2) {
                r z2 = z(1);
                int min = Math.min(i2 - i3, 8192 - z2.f3764c);
                System.arraycopy(bArr, i3, z2.f3763a, z2.f3764c, min);
                i3 += min;
                z2.f3764c += min;
            }
            this.f3745g += j2;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void B(int i2) {
        r z2 = z(1);
        int i3 = z2.f3764c;
        z2.f3764c = i3 + 1;
        z2.f3763a[i3] = (byte) i2;
        this.f3745g++;
    }

    public final void C(long j2) {
        byte[] bArr;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 == 0) {
            B(48);
            return;
        }
        int i3 = 1;
        boolean z2 = false;
        if (i2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                E("-9223372036854775808", 0, 20);
                return;
            }
            z2 = true;
        }
        if (j2 < 100000000) {
            if (j2 < 10000) {
                if (j2 < 100) {
                    if (j2 >= 10) {
                        i3 = 2;
                    }
                } else if (j2 < 1000) {
                    i3 = 3;
                } else {
                    i3 = 4;
                }
            } else if (j2 < 1000000) {
                if (j2 < 100000) {
                    i3 = 5;
                } else {
                    i3 = 6;
                }
            } else if (j2 < 10000000) {
                i3 = 7;
            } else {
                i3 = 8;
            }
        } else if (j2 < 1000000000000L) {
            if (j2 < 10000000000L) {
                if (j2 < 1000000000) {
                    i3 = 9;
                } else {
                    i3 = 10;
                }
            } else if (j2 < 100000000000L) {
                i3 = 11;
            } else {
                i3 = 12;
            }
        } else if (j2 < 1000000000000000L) {
            if (j2 < 10000000000000L) {
                i3 = 13;
            } else if (j2 < 100000000000000L) {
                i3 = 14;
            } else {
                i3 = 15;
            }
        } else if (j2 < 100000000000000000L) {
            if (j2 < 10000000000000000L) {
                i3 = 16;
            } else {
                i3 = 17;
            }
        } else if (j2 < 1000000000000000000L) {
            i3 = 18;
        } else {
            i3 = 19;
        }
        if (z2) {
            i3++;
        }
        r z3 = z(i3);
        int i4 = z3.f3764c + i3;
        while (true) {
            bArr = z3.f3763a;
            if (j2 == 0) {
                break;
            }
            i4--;
            bArr[i4] = f3744h[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z2) {
            bArr[i4 - 1] = 45;
        }
        z3.f3764c += i3;
        this.f3745g += (long) i3;
    }

    public final void D(long j2) {
        if (j2 == 0) {
            B(48);
            return;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        r z2 = z(numberOfTrailingZeros);
        int i2 = z2.f3764c;
        for (int i3 = (i2 + numberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            z2.f3763a[i3] = f3744h[(int) (15 & j2)];
            j2 >>>= 4;
        }
        z2.f3764c += numberOfTrailingZeros;
        this.f3745g += (long) numberOfTrailingZeros;
    }

    public final void E(String str, int i2, int i3) {
        char c2;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i2 < 0) {
            throw new IllegalArgumentException(g.f(i2, "beginIndex < 0: "));
        } else if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        } else if (i3 <= str.length()) {
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    r z2 = z(1);
                    int i4 = z2.f3764c - i2;
                    int min = Math.min(i3, 8192 - i4);
                    int i5 = i2 + 1;
                    byte[] bArr = z2.f3763a;
                    bArr[i2 + i4] = (byte) charAt;
                    while (i5 < min) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i5 + i4] = (byte) charAt2;
                        i5++;
                    }
                    int i6 = z2.f3764c;
                    int i7 = (i4 + i5) - i6;
                    z2.f3764c = i6 + i7;
                    this.f3745g += (long) i7;
                    i2 = i5;
                } else {
                    if (charAt < 2048) {
                        B((charAt >> 6) | 192);
                        B((charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        B((charAt >> 12) | 224);
                        B(((charAt >> 6) & 63) | 128);
                        B((charAt & '?') | 128);
                    } else {
                        int i8 = i2 + 1;
                        if (i8 < i3) {
                            c2 = str.charAt(i8);
                        } else {
                            c2 = 0;
                        }
                        if (charAt > 56319 || c2 < 56320 || c2 > 57343) {
                            B(63);
                            i2 = i8;
                        } else {
                            int i9 = (((charAt & 10239) << 10) | (9215 & c2)) + 0;
                            B((i9 >> 18) | 240);
                            B(((i9 >> 12) & 63) | 128);
                            B(((i9 >> 6) & 63) | 128);
                            B((i9 & 63) | 128);
                            i2 += 2;
                        }
                    }
                    i2++;
                }
            }
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        }
    }

    public final void F(int i2) {
        if (i2 < 128) {
            B(i2);
        } else if (i2 < 2048) {
            B((i2 >> 6) | 192);
            B((i2 & 63) | 128);
        } else if (i2 < 65536) {
            if (i2 < 55296 || i2 > 57343) {
                B((i2 >> 12) | 224);
                B(((i2 >> 6) & 63) | 128);
                B((i2 & 63) | 128);
                return;
            }
            B(63);
        } else if (i2 <= 1114111) {
            B((i2 >> 18) | 240);
            B(((i2 >> 12) & 63) | 128);
            B(((i2 >> 6) & 63) | 128);
            B((i2 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i2));
        }
    }

    public final x a() {
        return x.f3772d;
    }

    public final f b(byte[] bArr) {
        if (bArr != null) {
            A(bArr, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long c(v vVar) {
        if (vVar != null) {
            long j2 = 0;
            while (true) {
                long f2 = vVar.f(this, 8192);
                if (f2 == -1) {
                    return j2;
                }
                j2 += f2;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, o1.e] */
    public final Object clone() {
        ? obj = new Object();
        if (this.f3745g == 0) {
            return obj;
        }
        r c2 = this.f.c();
        obj.f = c2;
        c2.f3767g = c2;
        c2.f = c2;
        r rVar = this.f;
        while (true) {
            rVar = rVar.f;
            if (rVar != this.f) {
                obj.f.f3767g.b(rVar.c());
            } else {
                obj.f3745g = this.f3745g;
                return obj;
            }
        }
    }

    public final f d(h hVar) {
        if (hVar != null) {
            hVar.p(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public final /* bridge */ /* synthetic */ f e(byte[] bArr, int i2) {
        A(bArr, i2);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        long j2 = this.f3745g;
        if (j2 != eVar.f3745g) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        r rVar = this.f;
        r rVar2 = eVar.f;
        int i2 = rVar.b;
        int i3 = rVar2.b;
        while (j3 < this.f3745g) {
            long min = (long) Math.min(rVar.f3764c - i2, rVar2.f3764c - i3);
            int i4 = 0;
            while (((long) i4) < min) {
                int i5 = i2 + 1;
                int i6 = i3 + 1;
                if (rVar.f3763a[i2] != rVar2.f3763a[i3]) {
                    return false;
                }
                i4++;
                i2 = i5;
                i3 = i6;
            }
            if (i2 == rVar.f3764c) {
                rVar = rVar.f;
                i2 = rVar.b;
            }
            if (i3 == rVar2.f3764c) {
                rVar2 = rVar2.f;
                i3 = rVar2.b;
            }
            j3 += min;
        }
        return true;
    }

    public final long f(e eVar, long j2) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 >= 0) {
            long j3 = this.f3745g;
            if (j3 == 0) {
                return -1;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            eVar.g(this, j2);
            return j2;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
    }

    public final void g(e eVar, long j2) {
        r rVar;
        r rVar2;
        int i2;
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (eVar != this) {
            y.a(eVar.f3745g, 0, j2);
            while (j2 > 0) {
                r rVar3 = eVar.f;
                int i3 = rVar3.f3764c - rVar3.b;
                int i4 = 0;
                if (j2 < ((long) i3)) {
                    r rVar4 = this.f;
                    if (rVar4 != null) {
                        rVar = rVar4.f3767g;
                    } else {
                        rVar = null;
                    }
                    if (rVar != null && rVar.f3766e) {
                        long j3 = ((long) rVar.f3764c) + j2;
                        if (rVar.f3765d) {
                            i2 = 0;
                        } else {
                            i2 = rVar.b;
                        }
                        if (j3 - ((long) i2) <= 8192) {
                            rVar3.d(rVar, (int) j2);
                            eVar.f3745g -= j2;
                            this.f3745g += j2;
                            return;
                        }
                    }
                    int i5 = (int) j2;
                    if (i5 <= 0 || i5 > i3) {
                        throw new IllegalArgumentException();
                    }
                    if (i5 >= 1024) {
                        rVar2 = rVar3.c();
                    } else {
                        rVar2 = s.b();
                        System.arraycopy(rVar3.f3763a, rVar3.b, rVar2.f3763a, 0, i5);
                    }
                    rVar2.f3764c = rVar2.b + i5;
                    rVar3.b += i5;
                    rVar3.f3767g.b(rVar2);
                    eVar.f = rVar2;
                }
                r rVar5 = eVar.f;
                long j4 = (long) (rVar5.f3764c - rVar5.b);
                eVar.f = rVar5.a();
                r rVar6 = this.f;
                if (rVar6 == null) {
                    this.f = rVar5;
                    rVar5.f3767g = rVar5;
                    rVar5.f = rVar5;
                } else {
                    rVar6.f3767g.b(rVar5);
                    r rVar7 = rVar5.f3767g;
                    if (rVar7 == rVar5) {
                        throw new IllegalStateException();
                    } else if (rVar7.f3766e) {
                        int i6 = rVar5.f3764c - rVar5.b;
                        int i7 = 8192 - rVar7.f3764c;
                        if (!rVar7.f3765d) {
                            i4 = rVar7.b;
                        }
                        if (i6 <= i7 + i4) {
                            rVar5.d(rVar7, i6);
                            rVar5.a();
                            s.a(rVar5);
                        }
                    }
                }
                eVar.f3745g -= j4;
                this.f3745g += j4;
                j2 -= j4;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final f h(String str) {
        E(str, 0, str.length());
        return this;
    }

    public final int hashCode() {
        r rVar = this.f;
        if (rVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = rVar.f3764c;
            for (int i4 = rVar.b; i4 < i3; i4++) {
                i2 = (i2 * 31) + rVar.f3763a[i4];
            }
            rVar = rVar.f;
        } while (rVar != this.f);
        return i2;
    }

    public final /* bridge */ /* synthetic */ f i(long j2) {
        C(j2);
        return this;
    }

    public final boolean isOpen() {
        return true;
    }

    public final /* bridge */ /* synthetic */ f j(int i2) {
        B(i2);
        return this;
    }

    public final void k() {
        try {
            y(this.f3745g);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void l(e eVar, long j2, long j3) {
        if (eVar != null) {
            long j4 = j2;
            long j5 = j3;
            y.a(this.f3745g, j4, j5);
            if (j5 != 0) {
                eVar.f3745g += j5;
                r rVar = this.f;
                while (true) {
                    long j6 = (long) (rVar.f3764c - rVar.b);
                    if (j4 < j6) {
                        break;
                    }
                    j4 -= j6;
                    rVar = rVar.f;
                }
                r rVar2 = rVar;
                long j7 = j5;
                while (j7 > 0) {
                    r c2 = rVar2.c();
                    int i2 = (int) (((long) c2.b) + j4);
                    c2.b = i2;
                    c2.f3764c = Math.min(i2 + ((int) j7), c2.f3764c);
                    r rVar3 = eVar.f;
                    if (rVar3 == null) {
                        c2.f3767g = c2;
                        c2.f = c2;
                        eVar.f = c2;
                    } else {
                        rVar3.f3767g.b(c2);
                    }
                    j7 -= (long) (c2.f3764c - c2.b);
                    rVar2 = rVar2.f;
                    j4 = 0;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final boolean m() {
        if (this.f3745g == 0) {
            return true;
        }
        return false;
    }

    public final byte n(long j2) {
        int i2;
        long j3 = j2;
        y.a(this.f3745g, j3, 1);
        long j4 = this.f3745g;
        if (j4 - j3 > j3) {
            r rVar = this.f;
            while (true) {
                int i3 = rVar.f3764c;
                int i4 = rVar.b;
                long j5 = (long) (i3 - i4);
                if (j3 < j5) {
                    return rVar.f3763a[i4 + ((int) j3)];
                }
                j3 -= j5;
                rVar = rVar.f;
            }
        } else {
            long j6 = j3 - j4;
            r rVar2 = this.f;
            do {
                rVar2 = rVar2.f3767g;
                int i5 = rVar2.f3764c;
                i2 = rVar2.b;
                j6 += (long) (i5 - i2);
            } while (j6 < 0);
            return rVar2.f3763a[i2 + ((int) j6)];
        }
    }

    public final int o(byte[] bArr, int i2, int i3) {
        y.a((long) bArr.length, (long) i2, (long) i3);
        r rVar = this.f;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(i3, rVar.f3764c - rVar.b);
        System.arraycopy(rVar.f3763a, rVar.b, bArr, i2, min);
        int i4 = rVar.b + min;
        rVar.b = i4;
        this.f3745g -= (long) min;
        if (i4 == rVar.f3764c) {
            this.f = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    public final byte p() {
        long j2 = this.f3745g;
        if (j2 != 0) {
            r rVar = this.f;
            int i2 = rVar.b;
            int i3 = rVar.f3764c;
            int i4 = i2 + 1;
            byte b = rVar.f3763a[i2];
            this.f3745g = j2 - 1;
            if (i4 == i3) {
                this.f = rVar.a();
                s.a(rVar);
                return b;
            }
            rVar.b = i4;
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public final byte[] q(long j2) {
        long j3 = j2;
        y.a(this.f3745g, 0, j3);
        if (j3 <= 2147483647L) {
            int i2 = (int) j3;
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int o2 = o(bArr, i3, i2 - i3);
                if (o2 != -1) {
                    i3 += o2;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j3);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, o1.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r2 != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r1.p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.w()));
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b A[EDGE_INSN: B:49:0x008b->B:29:0x008b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long r() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f3745g
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00aa
            r1 = 0
            r5 = -7
            r6 = r5
            r2 = 0
            r4 = r3
            r3 = 0
        L_0x0011:
            o1.r r8 = r0.f
            byte[] r9 = r8.f3763a
            int r10 = r8.b
            int r11 = r8.f3764c
        L_0x0019:
            if (r10 >= r11) goto L_0x008b
            byte r12 = r9[r10]
            r13 = 48
            if (r12 < r13) goto L_0x005f
            r13 = 57
            if (r12 > r13) goto L_0x005f
            int r13 = 48 - r12
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x003f
            if (r16 != 0) goto L_0x0038
            long r14 = (long) r13
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            r14 = 10
            long r4 = r4 * r14
            long r12 = (long) r13
            long r4 = r4 + r12
            goto L_0x006a
        L_0x003f:
            o1.e r1 = new o1.e
            r1.<init>()
            r1.C(r4)
            r1.B(r12)
            if (r2 != 0) goto L_0x004f
            r1.p()
        L_0x004f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.w()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x005f:
            r13 = 45
            r14 = 1
            if (r12 != r13) goto L_0x006f
            if (r1 != 0) goto L_0x006f
            r12 = 1
            long r6 = r6 - r12
            r2 = 1
        L_0x006a:
            int r10 = r10 + 1
            int r1 = r1 + 1
            goto L_0x0019
        L_0x006f:
            if (r1 == 0) goto L_0x0073
            r3 = 1
            goto L_0x008b
        L_0x0073:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.<init>(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r12)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x008b:
            if (r10 != r11) goto L_0x0097
            o1.r r9 = r8.a()
            r0.f = r9
            o1.s.a(r8)
            goto L_0x0099
        L_0x0097:
            r8.b = r10
        L_0x0099:
            if (r3 != 0) goto L_0x009f
            o1.r r8 = r0.f
            if (r8 != 0) goto L_0x0011
        L_0x009f:
            long r6 = r0.f3745g
            long r8 = (long) r1
            long r6 = r6 - r8
            r0.f3745g = r6
            if (r2 == 0) goto L_0x00a8
            return r4
        L_0x00a8:
            long r1 = -r4
            return r1
        L_0x00aa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.e.r():long");
    }

    public final int read(ByteBuffer byteBuffer) {
        r rVar = this.f;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), rVar.f3764c - rVar.b);
        byteBuffer.put(rVar.f3763a, rVar.b, min);
        int i2 = rVar.b + min;
        rVar.b = i2;
        this.f3745g -= (long) min;
        if (i2 == rVar.f3764c) {
            this.f = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, o1.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        if (r8 != r9) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        r15.f = r6.a();
        o1.s.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        r6.b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (r1 != false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0066 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long s() {
        /*
            r15 = this;
            long r0 = r15.f3745g
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0099
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            o1.r r6 = r15.f
            byte[] r7 = r6.f3763a
            int r8 = r6.b
            int r9 = r6.f3764c
        L_0x0013:
            if (r8 >= r9) goto L_0x007e
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x0037
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002d
            int r11 = r10 + -87
            goto L_0x0037
        L_0x002d:
            r11 = 65
            if (r10 < r11) goto L_0x0062
            r11 = 70
            if (r10 > r11) goto L_0x0062
            int r11 = r10 + -55
        L_0x0037:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0047
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0047:
            o1.e r0 = new o1.e
            r0.<init>()
            r0.D(r4)
            r0.B(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.w()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0062:
            if (r0 == 0) goto L_0x0066
            r1 = 1
            goto L_0x007e
        L_0x0066:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x007e:
            if (r8 != r9) goto L_0x008a
            o1.r r7 = r6.a()
            r15.f = r7
            o1.s.a(r6)
            goto L_0x008c
        L_0x008a:
            r6.b = r8
        L_0x008c:
            if (r1 != 0) goto L_0x0092
            o1.r r6 = r15.f
            if (r6 != 0) goto L_0x000b
        L_0x0092:
            long r1 = r15.f3745g
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f3745g = r1
            return r4
        L_0x0099:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.e.s():long");
    }

    public final int t() {
        long j2 = this.f3745g;
        if (j2 >= 4) {
            r rVar = this.f;
            int i2 = rVar.b;
            int i3 = rVar.f3764c;
            if (i3 - i2 < 4) {
                return ((p() & 255) << 24) | ((p() & 255) << 16) | ((p() & 255) << 8) | (p() & 255);
            }
            byte[] bArr = rVar.f3763a;
            byte b = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24);
            int i4 = i2 + 3;
            int i5 = i2 + 4;
            byte b2 = b | ((bArr[i2 + 2] & 255) << 8) | (bArr[i4] & 255);
            this.f3745g = j2 - 4;
            if (i5 == i3) {
                this.f = rVar.a();
                s.a(rVar);
                return b2;
            }
            rVar.b = i5;
            return b2;
        }
        throw new IllegalStateException("size < 4: " + this.f3745g);
    }

    public final String toString() {
        h hVar;
        long j2 = this.f3745g;
        if (j2 <= 2147483647L) {
            int i2 = (int) j2;
            if (i2 == 0) {
                hVar = h.f3747j;
            } else {
                hVar = new t(this, i2);
            }
            return hVar.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f3745g);
    }

    public final short u() {
        long j2 = this.f3745g;
        if (j2 >= 2) {
            r rVar = this.f;
            int i2 = rVar.b;
            int i3 = rVar.f3764c;
            if (i3 - i2 < 2) {
                return (short) (((p() & 255) << 8) | (p() & 255));
            }
            int i4 = i2 + 1;
            byte[] bArr = rVar.f3763a;
            int i5 = i2 + 2;
            byte b = (bArr[i4] & 255) | ((bArr[i2] & 255) << 8);
            this.f3745g = j2 - 2;
            if (i5 == i3) {
                this.f = rVar.a();
                s.a(rVar);
            } else {
                rVar.b = i5;
            }
            return (short) b;
        }
        throw new IllegalStateException("size < 2: " + this.f3745g);
    }

    public final String v(long j2, Charset charset) {
        long j3 = j2;
        y.a(this.f3745g, 0, j3);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j3 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j3);
        } else if (j3 == 0) {
            return "";
        } else {
            r rVar = this.f;
            int i2 = rVar.b;
            if (((long) i2) + j3 > ((long) rVar.f3764c)) {
                return new String(q(j3), charset);
            }
            String str = new String(rVar.f3763a, i2, (int) j3, charset);
            int i3 = (int) (((long) rVar.b) + j3);
            rVar.b = i3;
            this.f3745g -= j3;
            if (i3 == rVar.f3764c) {
                this.f = rVar.a();
                s.a(rVar);
            }
            return str;
        }
    }

    public final String w() {
        try {
            return v(this.f3745g, y.f3775a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i2 = remaining;
            while (i2 > 0) {
                r z2 = z(1);
                int min = Math.min(i2, 8192 - z2.f3764c);
                byteBuffer.get(z2.f3763a, z2.f3764c, min);
                i2 -= min;
                z2.f3764c += min;
            }
            this.f3745g += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final String x(long j2) {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (n(j3) == 13) {
                String v2 = v(j3, y.f3775a);
                y(2);
                return v2;
            }
        }
        String v3 = v(j2, y.f3775a);
        y(1);
        return v3;
    }

    public final void y(long j2) {
        while (j2 > 0) {
            r rVar = this.f;
            if (rVar != null) {
                int min = (int) Math.min(j2, (long) (rVar.f3764c - rVar.b));
                long j3 = (long) min;
                this.f3745g -= j3;
                j2 -= j3;
                r rVar2 = this.f;
                int i2 = rVar2.b + min;
                rVar2.b = i2;
                if (i2 == rVar2.f3764c) {
                    this.f = rVar2.a();
                    s.a(rVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final r z(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException();
        }
        r rVar = this.f;
        if (rVar == null) {
            r b = s.b();
            this.f = b;
            b.f3767g = b;
            b.f = b;
            return b;
        }
        r rVar2 = rVar.f3767g;
        if (rVar2.f3764c + i2 <= 8192 && rVar2.f3766e) {
            return rVar2;
        }
        r b2 = s.b();
        rVar2.b(b2);
        return b2;
    }

    public final void close() {
    }

    public final void flush() {
    }
}
