package U;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f725a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f726c;

    public b(byte[] bArr, int i2, int i3) {
        this.f725a = i2;
        this.b = i3;
        this.f726c = bArr;
    }

    public static b a(long j2, ByteOrder byteOrder) {
        long[] jArr = {j2};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[e.f738q[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new b(wrap.array(), 4, 1);
    }

    public static b b(d dVar, ByteOrder byteOrder) {
        d[] dVarArr = {dVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[e.f738q[5]]);
        wrap.order(byteOrder);
        d dVar2 = dVarArr[0];
        wrap.putInt((int) dVar2.f730a);
        wrap.putInt((int) dVar2.b);
        return new b(wrap.array(), 5, 1);
    }

    public static b c(int i2, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[e.f738q[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i2}[0]);
        return new b(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Serializable g2 = g(byteOrder);
        if (g2 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        } else if (g2 instanceof String) {
            return Double.parseDouble((String) g2);
        } else {
            if (g2 instanceof long[]) {
                long[] jArr = (long[]) g2;
                if (jArr.length == 1) {
                    return (double) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g2 instanceof int[]) {
                int[] iArr = (int[]) g2;
                if (iArr.length == 1) {
                    return (double) iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g2 instanceof double[]) {
                double[] dArr = (double[]) g2;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g2 instanceof d[]) {
                d[] dVarArr = (d[]) g2;
                if (dVarArr.length == 1) {
                    d dVar = dVarArr[0];
                    return ((double) dVar.f730a) / ((double) dVar.b);
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
    }

    public final int e(ByteOrder byteOrder) {
        Serializable g2 = g(byteOrder);
        if (g2 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (g2 instanceof String) {
            return Integer.parseInt((String) g2);
        } else {
            if (g2 instanceof long[]) {
                long[] jArr = (long[]) g2;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g2 instanceof int[]) {
                int[] iArr = (int[]) g2;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    public final String f(ByteOrder byteOrder) {
        Serializable g2 = g(byteOrder);
        if (g2 == null) {
            return null;
        }
        if (g2 instanceof String) {
            return (String) g2;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (g2 instanceof long[]) {
            long[] jArr = (long[]) g2;
            while (i2 < jArr.length) {
                sb.append(jArr[i2]);
                i2++;
                if (i2 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (g2 instanceof int[]) {
            int[] iArr = (int[]) g2;
            while (i2 < iArr.length) {
                sb.append(iArr[i2]);
                i2++;
                if (i2 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (g2 instanceof double[]) {
            double[] dArr = (double[]) g2;
            while (i2 < dArr.length) {
                sb.append(dArr[i2]);
                i2++;
                if (i2 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(g2 instanceof d[])) {
            return null;
        } else {
            d[] dVarArr = (d[]) g2;
            while (i2 < dVarArr.length) {
                sb.append(dVarArr[i2].f730a);
                sb.append('/');
                sb.append(dVarArr[i2].b);
                i2++;
                if (i2 != dVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v23, types: [long[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v24, types: [U.d[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v27, types: [U.d[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0167 A[SYNTHETIC, Splitter:B:159:0x0167] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x016d A[SYNTHETIC, Splitter:B:163:0x016d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable g(java.nio.ByteOrder r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            byte[] r2 = r14.f726c
            java.lang.String r3 = "IOException occurred while closing InputStream"
            java.lang.String r4 = "ExifInterface"
            r5 = 0
            U.a r6 = new U.a     // Catch:{ IOException -> 0x015e, all -> 0x015c }
            r6.<init>((byte[]) r2)     // Catch:{ IOException -> 0x015e, all -> 0x015c }
            r6.f722g = r15     // Catch:{ IOException -> 0x0036 }
            int r15 = r14.f725a     // Catch:{ IOException -> 0x0036 }
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r9 = r14.b
            switch(r15) {
                case 1: goto L_0x012e;
                case 2: goto L_0x00f0;
                case 3: goto L_0x00db;
                case 4: goto L_0x00c4;
                case 5: goto L_0x00a2;
                case 6: goto L_0x012e;
                case 7: goto L_0x00f0;
                case 8: goto L_0x008d;
                case 9: goto L_0x0078;
                case 10: goto L_0x0058;
                case 11: goto L_0x0042;
                case 12: goto L_0x0026;
                default: goto L_0x001c;
            }
        L_0x001c:
            r6.close()     // Catch:{ IOException -> 0x0020 }
            return r5
        L_0x0020:
            r15 = move-exception
            android.util.Log.e(r4, r3, r15)
            goto L_0x016a
        L_0x0026:
            double[] r15 = new double[r9]     // Catch:{ IOException -> 0x0036 }
        L_0x0028:
            if (r0 >= r9) goto L_0x0039
            double r7 = r6.readDouble()     // Catch:{ IOException -> 0x0036 }
            r15[r0] = r7     // Catch:{ IOException -> 0x0036 }
            int r0 = r0 + r1
            goto L_0x0028
        L_0x0032:
            r15 = move-exception
            r5 = r6
            goto L_0x016b
        L_0x0036:
            r15 = move-exception
            goto L_0x0160
        L_0x0039:
            r6.close()     // Catch:{ IOException -> 0x003d }
            return r15
        L_0x003d:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
            return r15
        L_0x0042:
            double[] r15 = new double[r9]     // Catch:{ IOException -> 0x0036 }
        L_0x0044:
            if (r0 >= r9) goto L_0x004f
            float r2 = r6.readFloat()     // Catch:{ IOException -> 0x0036 }
            double r7 = (double) r2     // Catch:{ IOException -> 0x0036 }
            r15[r0] = r7     // Catch:{ IOException -> 0x0036 }
            int r0 = r0 + r1
            goto L_0x0044
        L_0x004f:
            r6.close()     // Catch:{ IOException -> 0x0053 }
            return r15
        L_0x0053:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
            return r15
        L_0x0058:
            U.d[] r15 = new U.d[r9]     // Catch:{ IOException -> 0x0036 }
        L_0x005a:
            if (r0 >= r9) goto L_0x006f
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0036 }
            long r7 = (long) r2     // Catch:{ IOException -> 0x0036 }
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0036 }
            long r10 = (long) r2     // Catch:{ IOException -> 0x0036 }
            U.d r2 = new U.d     // Catch:{ IOException -> 0x0036 }
            r2.<init>(r7, r10)     // Catch:{ IOException -> 0x0036 }
            r15[r0] = r2     // Catch:{ IOException -> 0x0036 }
            int r0 = r0 + r1
            goto L_0x005a
        L_0x006f:
            r6.close()     // Catch:{ IOException -> 0x0073 }
            return r15
        L_0x0073:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
            return r15
        L_0x0078:
            int[] r15 = new int[r9]     // Catch:{ IOException -> 0x0036 }
        L_0x007a:
            if (r0 >= r9) goto L_0x0084
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0036 }
            r15[r0] = r2     // Catch:{ IOException -> 0x0036 }
            int r0 = r0 + r1
            goto L_0x007a
        L_0x0084:
            r6.close()     // Catch:{ IOException -> 0x0088 }
            return r15
        L_0x0088:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
            return r15
        L_0x008d:
            int[] r15 = new int[r9]     // Catch:{ IOException -> 0x0036 }
        L_0x008f:
            if (r0 >= r9) goto L_0x0099
            short r2 = r6.readShort()     // Catch:{ IOException -> 0x0036 }
            r15[r0] = r2     // Catch:{ IOException -> 0x0036 }
            int r0 = r0 + r1
            goto L_0x008f
        L_0x0099:
            r6.close()     // Catch:{ IOException -> 0x009d }
            return r15
        L_0x009d:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
            return r15
        L_0x00a2:
            U.d[] r15 = new U.d[r9]     // Catch:{ IOException -> 0x0036 }
        L_0x00a4:
            if (r0 >= r9) goto L_0x00bb
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0036 }
            long r10 = (long) r2     // Catch:{ IOException -> 0x0036 }
            long r10 = r10 & r7
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0036 }
            long r12 = (long) r2     // Catch:{ IOException -> 0x0036 }
            long r12 = r12 & r7
            U.d r2 = new U.d     // Catch:{ IOException -> 0x0036 }
            r2.<init>(r10, r12)     // Catch:{ IOException -> 0x0036 }
            r15[r0] = r2     // Catch:{ IOException -> 0x0036 }
            int r0 = r0 + r1
            goto L_0x00a4
        L_0x00bb:
            r6.close()     // Catch:{ IOException -> 0x00bf }
            return r15
        L_0x00bf:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
            return r15
        L_0x00c4:
            long[] r15 = new long[r9]     // Catch:{ IOException -> 0x0036 }
        L_0x00c6:
            if (r0 >= r9) goto L_0x00d2
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0036 }
            long r10 = (long) r2     // Catch:{ IOException -> 0x0036 }
            long r10 = r10 & r7
            r15[r0] = r10     // Catch:{ IOException -> 0x0036 }
            int r0 = r0 + r1
            goto L_0x00c6
        L_0x00d2:
            r6.close()     // Catch:{ IOException -> 0x00d6 }
            return r15
        L_0x00d6:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
            return r15
        L_0x00db:
            int[] r15 = new int[r9]     // Catch:{ IOException -> 0x0036 }
        L_0x00dd:
            if (r0 >= r9) goto L_0x00e7
            int r2 = r6.readUnsignedShort()     // Catch:{ IOException -> 0x0036 }
            r15[r0] = r2     // Catch:{ IOException -> 0x0036 }
            int r0 = r0 + r1
            goto L_0x00dd
        L_0x00e7:
            r6.close()     // Catch:{ IOException -> 0x00eb }
            return r15
        L_0x00eb:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
            return r15
        L_0x00f0:
            byte[] r15 = U.e.f739r     // Catch:{ IOException -> 0x0036 }
            int r15 = r15.length     // Catch:{ IOException -> 0x0036 }
            if (r9 < r15) goto L_0x0105
            r15 = 0
        L_0x00f6:
            byte[] r7 = U.e.f739r     // Catch:{ IOException -> 0x0036 }
            int r8 = r7.length     // Catch:{ IOException -> 0x0036 }
            if (r15 >= r8) goto L_0x0104
            byte r8 = r2[r15]     // Catch:{ IOException -> 0x0036 }
            byte r7 = r7[r15]     // Catch:{ IOException -> 0x0036 }
            if (r8 == r7) goto L_0x0102
            goto L_0x0105
        L_0x0102:
            int r15 = r15 + r1
            goto L_0x00f6
        L_0x0104:
            int r0 = r7.length     // Catch:{ IOException -> 0x0036 }
        L_0x0105:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0036 }
            r15.<init>()     // Catch:{ IOException -> 0x0036 }
        L_0x010a:
            if (r0 >= r9) goto L_0x0121
            byte r7 = r2[r0]     // Catch:{ IOException -> 0x0036 }
            if (r7 != 0) goto L_0x0111
            goto L_0x0121
        L_0x0111:
            r8 = 32
            if (r7 < r8) goto L_0x011a
            char r7 = (char) r7     // Catch:{ IOException -> 0x0036 }
            r15.append(r7)     // Catch:{ IOException -> 0x0036 }
            goto L_0x011f
        L_0x011a:
            r7 = 63
            r15.append(r7)     // Catch:{ IOException -> 0x0036 }
        L_0x011f:
            int r0 = r0 + r1
            goto L_0x010a
        L_0x0121:
            java.lang.String r15 = r15.toString()     // Catch:{ IOException -> 0x0036 }
            r6.close()     // Catch:{ IOException -> 0x0129 }
            return r15
        L_0x0129:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
            return r15
        L_0x012e:
            int r15 = r2.length     // Catch:{ IOException -> 0x0036 }
            if (r15 != r1) goto L_0x014c
            byte r15 = r2[r0]     // Catch:{ IOException -> 0x0036 }
            if (r15 < 0) goto L_0x014c
            if (r15 > r1) goto L_0x014c
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0036 }
            int r15 = r15 + 48
            char r15 = (char) r15     // Catch:{ IOException -> 0x0036 }
            char[] r1 = new char[r1]     // Catch:{ IOException -> 0x0036 }
            r1[r0] = r15     // Catch:{ IOException -> 0x0036 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0036 }
            r6.close()     // Catch:{ IOException -> 0x0147 }
            return r2
        L_0x0147:
            r15 = move-exception
            android.util.Log.e(r4, r3, r15)
            return r2
        L_0x014c:
            java.lang.String r15 = new java.lang.String     // Catch:{ IOException -> 0x0036 }
            java.nio.charset.Charset r0 = U.e.f747z     // Catch:{ IOException -> 0x0036 }
            r15.<init>(r2, r0)     // Catch:{ IOException -> 0x0036 }
            r6.close()     // Catch:{ IOException -> 0x0157 }
            return r15
        L_0x0157:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
            return r15
        L_0x015c:
            r15 = move-exception
            goto L_0x016b
        L_0x015e:
            r15 = move-exception
            r6 = r5
        L_0x0160:
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r4, r0, r15)     // Catch:{ all -> 0x0032 }
            if (r6 == 0) goto L_0x016a
            r6.close()     // Catch:{ IOException -> 0x0020 }
        L_0x016a:
            return r5
        L_0x016b:
            if (r5 == 0) goto L_0x0175
            r5.close()     // Catch:{ IOException -> 0x0171 }
            goto L_0x0175
        L_0x0171:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x0175:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: U.b.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        return "(" + e.f737p[this.f725a] + ", data length:" + this.f726c.length + ")";
    }
}
