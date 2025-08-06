package o1;

import A.g;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class h implements Serializable, Comparable {

    /* renamed from: i  reason: collision with root package name */
    public static final char[] f3746i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: j  reason: collision with root package name */
    public static final h f3747j = i(new byte[0]);
    public final byte[] f;

    /* renamed from: g  reason: collision with root package name */
    public transient int f3748g;

    /* renamed from: h  reason: collision with root package name */
    public transient String f3749h;

    public h(byte[] bArr) {
        this.f = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0079, code lost:
        r5 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o1.h b(java.lang.String r15) {
        /*
            if (r15 == 0) goto L_0x00d9
            int r0 = r15.length()
        L_0x0006:
            r1 = 9
            r2 = 32
            r3 = 13
            r4 = 10
            if (r0 <= 0) goto L_0x0026
            int r5 = r0 + -1
            char r5 = r15.charAt(r5)
            r6 = 61
            if (r5 == r6) goto L_0x0023
            if (r5 == r4) goto L_0x0023
            if (r5 == r3) goto L_0x0023
            if (r5 == r2) goto L_0x0023
            if (r5 == r1) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            int r0 = r0 + -1
            goto L_0x0006
        L_0x0026:
            long r5 = (long) r0
            r7 = 6
            long r5 = r5 * r7
            r7 = 8
            long r5 = r5 / r7
            int r6 = (int) r5
            byte[] r5 = new byte[r6]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0036:
            r12 = 0
            if (r8 >= r0) goto L_0x00a0
            char r13 = r15.charAt(r8)
            r14 = 65
            if (r13 < r14) goto L_0x0048
            r14 = 90
            if (r13 > r14) goto L_0x0048
            int r13 = r13 + -65
            goto L_0x0080
        L_0x0048:
            r14 = 97
            if (r13 < r14) goto L_0x0053
            r14 = 122(0x7a, float:1.71E-43)
            if (r13 > r14) goto L_0x0053
            int r13 = r13 + -71
            goto L_0x0080
        L_0x0053:
            r14 = 48
            if (r13 < r14) goto L_0x005e
            r14 = 57
            if (r13 > r14) goto L_0x005e
            int r13 = r13 + 4
            goto L_0x0080
        L_0x005e:
            r14 = 43
            if (r13 == r14) goto L_0x007e
            r14 = 45
            if (r13 != r14) goto L_0x0067
            goto L_0x007e
        L_0x0067:
            r14 = 47
            if (r13 == r14) goto L_0x007b
            r14 = 95
            if (r13 != r14) goto L_0x0070
            goto L_0x007b
        L_0x0070:
            if (r13 == r4) goto L_0x009d
            if (r13 == r3) goto L_0x009d
            if (r13 == r2) goto L_0x009d
            if (r13 != r1) goto L_0x0079
            goto L_0x009d
        L_0x0079:
            r5 = r12
            goto L_0x00d0
        L_0x007b:
            r13 = 63
            goto L_0x0080
        L_0x007e:
            r13 = 62
        L_0x0080:
            int r10 = r10 << 6
            byte r12 = (byte) r13
            r10 = r10 | r12
            int r9 = r9 + 1
            int r12 = r9 % 4
            if (r12 != 0) goto L_0x009d
            int r12 = r11 + 1
            int r13 = r10 >> 16
            byte r13 = (byte) r13
            r5[r11] = r13
            int r13 = r11 + 2
            int r14 = r10 >> 8
            byte r14 = (byte) r14
            r5[r12] = r14
            int r11 = r11 + 3
            byte r12 = (byte) r10
            r5[r13] = r12
        L_0x009d:
            int r8 = r8 + 1
            goto L_0x0036
        L_0x00a0:
            int r9 = r9 % 4
            r15 = 1
            if (r9 != r15) goto L_0x00a6
            goto L_0x0079
        L_0x00a6:
            r15 = 2
            if (r9 != r15) goto L_0x00b4
            int r15 = r10 << 12
            int r0 = r11 + 1
            int r15 = r15 >> 16
            byte r15 = (byte) r15
            r5[r11] = r15
            r11 = r0
            goto L_0x00c7
        L_0x00b4:
            r15 = 3
            if (r9 != r15) goto L_0x00c7
            int r15 = r10 << 6
            int r0 = r11 + 1
            int r1 = r15 >> 16
            byte r1 = (byte) r1
            r5[r11] = r1
            int r11 = r11 + 2
            int r15 = r15 >> 8
            byte r15 = (byte) r15
            r5[r0] = r15
        L_0x00c7:
            if (r11 != r6) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            byte[] r15 = new byte[r11]
            java.lang.System.arraycopy(r5, r7, r15, r7, r11)
            r5 = r15
        L_0x00d0:
            if (r5 == 0) goto L_0x00d8
            o1.h r15 = new o1.h
            r15.<init>(r5)
            return r15
        L_0x00d8:
            return r12
        L_0x00d9:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "base64 == null"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.h.b(java.lang.String):o1.h");
    }

    public static void c(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) (d(str.charAt(i3 + 1)) + (d(str.charAt(i3)) << 4));
            }
            i(bArr);
            return;
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
    }

    public static int d(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static h f(String str) {
        if (str != null) {
            h hVar = new h(str.getBytes(y.f3775a));
            hVar.f3749h = str;
            return hVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static h i(byte... bArr) {
        if (bArr != null) {
            return new h((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        byte[] bArr = s.f3769c;
        byte[] bArr2 = this.f;
        byte[] bArr3 = new byte[(((bArr2.length + 2) / 3) * 4)];
        int length = bArr2.length - (bArr2.length % 3);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            bArr3[i2] = bArr[(bArr2[i3] & 255) >> 2];
            int i4 = i3 + 1;
            bArr3[i2 + 1] = bArr[((bArr2[i3] & 3) << 4) | ((bArr2[i4] & 255) >> 4)];
            int i5 = i2 + 3;
            int i6 = i3 + 2;
            bArr3[i2 + 2] = bArr[((bArr2[i4] & 15) << 2) | ((bArr2[i6] & 255) >> 6)];
            i2 += 4;
            bArr3[i5] = bArr[bArr2[i6] & 63];
        }
        int length2 = bArr2.length % 3;
        if (length2 == 1) {
            bArr3[i2] = bArr[(bArr2[length] & 255) >> 2];
            bArr3[i2 + 1] = bArr[(bArr2[length] & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i2] = bArr[(bArr2[length] & 255) >> 2];
            int i7 = length + 1;
            bArr3[i2 + 1] = bArr[((bArr2[i7] & 255) >> 4) | ((bArr2[length] & 3) << 4)];
            bArr3[i2 + 2] = bArr[(bArr2[i7] & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        int l2 = l();
        int l3 = hVar.l();
        int min = Math.min(l2, l3);
        int i2 = 0;
        while (i2 < min) {
            byte g2 = g(i2) & 255;
            byte g3 = hVar.g(i2) & 255;
            if (g2 == g3) {
                i2++;
            } else if (g2 < g3) {
                return -1;
            } else {
                return 1;
            }
        }
        if (l2 == l3) {
            return 0;
        }
        if (l2 < l3) {
            return -1;
        }
        return 1;
    }

    public final h e(String str) {
        try {
            return i(MessageDigest.getInstance(str).digest(this.f));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int l2 = hVar.l();
            byte[] bArr = this.f;
            if (l2 != bArr.length || !hVar.j(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public byte g(int i2) {
        return this.f[i2];
    }

    public String h() {
        byte[] bArr = this.f;
        char[] cArr = new char[(bArr.length * 2)];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = f3746i;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int hashCode() {
        int i2 = this.f3748g;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f);
        this.f3748g = hashCode;
        return hashCode;
    }

    public boolean j(int i2, byte[] bArr, int i3, int i4) {
        if (i2 >= 0) {
            byte[] bArr2 = this.f;
            if (i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4) {
                Charset charset = y.f3775a;
                int i5 = 0;
                while (i5 < i4) {
                    if (bArr2[i5 + i2] == bArr[i5 + i3]) {
                        i5++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean k(h hVar, int i2) {
        return hVar.j(0, this.f, 0, i2);
    }

    public int l() {
        return this.f.length;
    }

    public h m() {
        byte[] bArr = this.f;
        if (64 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + bArr.length + ")");
        } else if (64 == bArr.length) {
            return this;
        } else {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new h(bArr2);
        }
    }

    public h n() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b = bArr[i2];
            if (b < 65 || b > 90) {
                i2++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b2 = bArr2[i3];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i3] = (byte) (b2 + 32);
                    }
                }
                return new h(bArr2);
            }
        }
    }

    public String o() {
        String str = this.f3749h;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f, y.f3775a);
        this.f3749h = str2;
        return str2;
    }

    public void p(e eVar) {
        byte[] bArr = this.f;
        eVar.A(bArr, bArr.length);
    }

    public String toString() {
        byte[] bArr = this.f;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        String o2 = o();
        int length = o2.length();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = o2.length();
                break;
            } else if (i3 == 64) {
                break;
            } else {
                int codePointAt = o2.codePointAt(i2);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i3++;
                    i2 += Character.charCount(codePointAt);
                }
            }
        }
        i2 = -1;
        if (i2 != -1) {
            String replace = o2.substring(0, i2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i2 >= o2.length()) {
                return g.i("[text=", replace, "]");
            }
            return "[size=" + bArr.length + " text=" + replace + "…]";
        } else if (bArr.length <= 64) {
            return "[hex=" + h() + "]";
        } else {
            return "[size=" + bArr.length + " hex=" + m().h() + "…]";
        }
    }
}
