package Q0;

public abstract class k extends l {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        A.i.n(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0058, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005c, code lost:
        A.i.n(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005f, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f0(java.io.File r2, java.io.File r3) {
        /*
            java.lang.String r0 = "<this>"
            U0.i.e(r0, r2)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0060
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r3.delete()
            if (r0 == 0) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            Q0.b r0 = new Q0.b
            java.lang.String r1 = "Tried to overwrite the destination, but failed to delete it."
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x0020:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0035
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L_0x002d
            return
        L_0x002d:
            Q0.c r0 = new Q0.c
            java.lang.String r1 = "Failed to create target directory."
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x0035:
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L_0x003e
            r0.mkdirs()
        L_0x003e:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0059 }
            r2.<init>(r3)     // Catch:{ all -> 0x0059 }
            A.i.r(r0, r2)     // Catch:{ all -> 0x0052 }
            r2.close()     // Catch:{ all -> 0x0059 }
            r0.close()
            return
        L_0x0052:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            A.i.n(r2, r3)     // Catch:{ all -> 0x0059 }
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x005b }
        L_0x005b:
            r3 = move-exception
            A.i.n(r0, r2)
            throw r3
        L_0x0060:
            Q0.b r3 = new Q0.b
            r0 = 0
            java.lang.String r1 = "The source file doesn't exist."
            r3.<init>(r2, r0, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.k.f0(java.io.File, java.io.File):void");
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, Q0.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        A.i.n(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] g0(java.io.File r9) {
        /*
            java.lang.String r0 = "<this>"
            U0.i.e(r0, r9)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            long r1 = r9.length()     // Catch:{ all -> 0x0028 }
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r5 = "File "
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0083
            int r2 = (int) r1
            byte[] r1 = new byte[r2]     // Catch:{ all -> 0x0028 }
            r3 = 0
            r4 = r2
            r6 = 0
        L_0x001d:
            if (r4 <= 0) goto L_0x002b
            int r7 = r0.read(r1, r6, r4)     // Catch:{ all -> 0x0028 }
            if (r7 < 0) goto L_0x002b
            int r4 = r4 - r7
            int r6 = r6 + r7
            goto L_0x001d
        L_0x0028:
            r9 = move-exception
            goto L_0x00a2
        L_0x002b:
            java.lang.String r7 = "copyOf(this, newSize)"
            if (r4 <= 0) goto L_0x0037
            byte[] r1 = java.util.Arrays.copyOf(r1, r6)     // Catch:{ all -> 0x0028 }
            U0.i.d(r7, r1)     // Catch:{ all -> 0x0028 }
            goto L_0x0065
        L_0x0037:
            int r4 = r0.read()     // Catch:{ all -> 0x0028 }
            r6 = -1
            if (r4 != r6) goto L_0x003f
            goto L_0x0065
        L_0x003f:
            Q0.a r6 = new Q0.a     // Catch:{ all -> 0x0028 }
            r8 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r8)     // Catch:{ all -> 0x0028 }
            r6.write(r4)     // Catch:{ all -> 0x0028 }
            A.i.r(r0, r6)     // Catch:{ all -> 0x0028 }
            int r4 = r6.size()     // Catch:{ all -> 0x0028 }
            int r4 = r4 + r2
            if (r4 < 0) goto L_0x0069
            byte[] r9 = r6.k()     // Catch:{ all -> 0x0028 }
            byte[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch:{ all -> 0x0028 }
            U0.i.d(r7, r1)     // Catch:{ all -> 0x0028 }
            int r4 = r6.size()     // Catch:{ all -> 0x0028 }
            java.lang.System.arraycopy(r9, r3, r1, r2, r4)     // Catch:{ all -> 0x0028 }
        L_0x0065:
            r0.close()
            return r1
        L_0x0069:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r2.<init>()     // Catch:{ all -> 0x0028 }
            r2.append(r5)     // Catch:{ all -> 0x0028 }
            r2.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = " is too big to fit in memory."
            r2.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r9)     // Catch:{ all -> 0x0028 }
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0083:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r4.<init>(r5)     // Catch:{ all -> 0x0028 }
            r4.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = " is too big ("
            r4.append(r9)     // Catch:{ all -> 0x0028 }
            r4.append(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = " bytes) to fit in memory."
            r4.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x0028 }
            r3.<init>(r9)     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x00a2:
            throw r9     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            A.i.n(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.k.g0(java.io.File):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        A.i.n(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h0(java.io.File r1, byte[] r2) {
        /*
            java.lang.String r0 = "<this>"
            U0.i.e(r0, r1)
            java.lang.String r0 = "array"
            U0.i.e(r0, r2)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0016 }
            r0.close()
            return
        L_0x0016:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r2 = move-exception
            A.i.n(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.k.h0(java.io.File, byte[]):void");
    }
}
