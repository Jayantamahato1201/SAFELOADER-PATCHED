package q1;

import B0.f;
import L0.b;
import M0.d;
import Q0.k;
import U0.i;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageParser;
import android.content.pm.Signature;
import android.content.pm.SigningDetails;
import android.os.Build;
import android.os.Parcel;
import com.android.internal.content.NativeLibraryHelper;
import java.io.File;
import java.lang.reflect.Constructor;

public abstract class Z1 {
    public static b a(File file, boolean z2) {
        try {
            b g2 = g(file, z2);
            X3 x3 = (X3) g2.f586g;
            if (x3 == null) {
                return g2;
            }
            e(x3);
            return new b(1, x3);
        } catch (Exception unused) {
            return new b(-1, (Object) null);
        }
    }

    public static int b(File file, File file2) {
        try {
            NativeLibraryHelper.Handle create = NativeLibraryHelper.Handle.create(file);
            int findSupportedAbi = NativeLibraryHelper.findSupportedAbi(create, f());
            if (findSupportedAbi < 0) {
                return 0;
            }
            NativeLibraryHelper.copyNativeBinaries(create, file2, f()[findSupportedAbi]);
            return findSupportedAbi;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01bb, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        A.i.n(r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01bf, code lost:
        throw r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a0, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        A.i.n(r7, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a4, code lost:
        throw r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a7, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        A.i.n(r6, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ab, code lost:
        throw r15;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x01ca */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static L0.b c(java.io.File r14, boolean r15) {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            q1.E4 r3 = new q1.E4     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r3.<init>()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            boolean r4 = r14.isDirectory()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String r5 = ".apk"
            if (r4 == 0) goto L_0x004d
            java.io.File[] r14 = r14.listFiles()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r14 != 0) goto L_0x002d
            r14 = -3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            L0.b r15 = new L0.b     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r15.<init>(r14, r1)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            T0.l r14 = q1.S1.f3986a     // Catch:{ Exception -> 0x0029 }
            java.io.File r14 = q1.F3.b(r2)     // Catch:{ Exception -> 0x0029 }
            q1.S1.a(r14)     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            return r15
        L_0x002a:
            r14 = move-exception
            goto L_0x01c0
        L_0x002d:
            int r4 = r14.length     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r6 = 0
        L_0x002f:
            if (r6 >= r4) goto L_0x00b0
            r7 = r14[r6]     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String r8 = r7.getName()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            boolean r8 = b1.i.f0(r8, r5)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r8 == 0) goto L_0x004b
            android.content.pm.PackageParser$ApkLite r8 = android.content.pm.PackageParser.parseApkLite(r7, r2)     // Catch:{ all -> 0x004b }
            java.lang.String r9 = r8.splitName     // Catch:{ all -> 0x004b }
            L0.b r10 = new L0.b     // Catch:{ all -> 0x004b }
            r10.<init>(r7, r8)     // Catch:{ all -> 0x004b }
            r3.put(r9, r10)     // Catch:{ all -> 0x004b }
        L_0x004b:
            int r6 = r6 + r0
            goto L_0x002f
        L_0x004d:
            java.io.File r15 = q1.F3.b(r0)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            q1.S1.b(r15)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r4.<init>(r14)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.util.Enumeration r14 = r4.entries()     // Catch:{ all -> 0x009b }
        L_0x005d:
            boolean r6 = r14.hasMoreElements()     // Catch:{ all -> 0x009b }
            if (r6 == 0) goto L_0x00ac
            java.lang.Object r6 = r14.nextElement()     // Catch:{ all -> 0x009b }
            java.util.zip.ZipEntry r6 = (java.util.zip.ZipEntry) r6     // Catch:{ all -> 0x009b }
            java.lang.String r7 = r6.getName()     // Catch:{ all -> 0x009b }
            boolean r8 = b1.i.f0(r7, r5)     // Catch:{ all -> 0x009b }
            if (r8 == 0) goto L_0x005d
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x009b }
            r8.<init>(r15, r7)     // Catch:{ all -> 0x009b }
            java.io.InputStream r6 = r4.getInputStream(r6)     // Catch:{ all -> 0x009b }
            if (r6 == 0) goto L_0x005d
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a5 }
            r7.<init>(r8)     // Catch:{ all -> 0x00a5 }
            A.i.r(r6, r7)     // Catch:{ all -> 0x009e }
            r7.close()     // Catch:{ all -> 0x00a5 }
            r6.close()     // Catch:{ all -> 0x009b }
            android.content.pm.PackageParser$ApkLite r6 = android.content.pm.PackageParser.parseApkLite(r8, r2)     // Catch:{ Exception -> 0x005d }
            java.lang.String r7 = r6.splitName     // Catch:{ Exception -> 0x005d }
            L0.b r9 = new L0.b     // Catch:{ Exception -> 0x005d }
            r9.<init>(r8, r6)     // Catch:{ Exception -> 0x005d }
            r3.put(r7, r9)     // Catch:{ Exception -> 0x005d }
            goto L_0x005d
        L_0x009b:
            r14 = move-exception
            goto L_0x01ba
        L_0x009e:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r15 = move-exception
            A.i.n(r7, r14)     // Catch:{ all -> 0x00a5 }
            throw r15     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r15 = move-exception
            A.i.n(r6, r14)     // Catch:{ all -> 0x009b }
            throw r15     // Catch:{ all -> 0x009b }
        L_0x00ac:
            r4.close()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r15 = 1
        L_0x00b0:
            java.lang.Object r14 = r3.remove(r1)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            L0.b r14 = (L0.b) r14     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r14 != 0) goto L_0x00cc
            r14 = -4
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            L0.b r15 = new L0.b     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r15.<init>(r14, r1)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            T0.l r14 = q1.S1.f3986a     // Catch:{ Exception -> 0x00cb }
            java.io.File r14 = q1.F3.b(r2)     // Catch:{ Exception -> 0x00cb }
            q1.S1.a(r14)     // Catch:{ Exception -> 0x00cb }
        L_0x00cb:
            return r15
        L_0x00cc:
            java.lang.Object r14 = r14.f     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.io.File r14 = (java.io.File) r14     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            L0.b r14 = g(r14, r15)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.Object r4 = r14.f586g     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            q1.X3 r4 = (q1.X3) r4     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r4 != 0) goto L_0x00e4
            T0.l r15 = q1.S1.f3986a     // Catch:{ Exception -> 0x00e3 }
            java.io.File r15 = q1.F3.b(r2)     // Catch:{ Exception -> 0x00e3 }
            q1.S1.a(r15)     // Catch:{ Exception -> 0x00e3 }
        L_0x00e3:
            return r14
        L_0x00e4:
            android.content.pm.ApplicationInfo r14 = r4.f4035d     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String r7 = r14.nativeLibraryDir     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r6.<init>(r7)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r7.<init>()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.util.Collection r8 = r3.values()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
        L_0x00fa:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r9 == 0) goto L_0x0154
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            L0.b r9 = (L0.b) r9     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            boolean r10 = q1.F3.f3882a     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String r10 = r4.f4254a     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.Object r11 = r9.f586g     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            android.content.pm.PackageParser$ApkLite r11 = (android.content.pm.PackageParser.ApkLite) r11     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String r11 = r11.splitName     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r12.<init>()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String r13 = "split_"
            r12.append(r13)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r12.append(r11)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r12.append(r5)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String r11 = r12.toString()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.io.File r13 = q1.F3.b     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r12.<init>(r13, r10)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r12.mkdirs()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r10.<init>(r12, r11)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String r11 = r10.getAbsolutePath()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r7.add(r11)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.Object r9 = r9.f     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.io.File r9 = (java.io.File) r9     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            b(r9, r6)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r15 == 0) goto L_0x0149
            boolean r11 = r9.renameTo(r10)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r11 != 0) goto L_0x014c
        L_0x0149:
            Q0.k.f0(r9, r10)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
        L_0x014c:
            boolean r9 = q1.T4.f4005k     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r9 == 0) goto L_0x00fa
            r10.setReadOnly()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            goto L_0x00fa
        L_0x0154:
            java.lang.String[] r15 = q1.H.f3888e     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.Object[] r15 = r7.toArray(r15)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String[] r15 = (java.lang.String[]) r15     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r14.splitSourceDirs = r15     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r14.splitPublicSourceDirs = r15     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            android.content.pm.PackageInfo r15 = r4.f4034c     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.util.Set r5 = r3.keySet()     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.Object[] r5 = r5.toArray(r6)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r15.splitNames = r5     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            boolean r15 = q1.T4.f3997a     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r15 == 0) goto L_0x0199
            android.content.pm.PackageInfo r15 = r4.f4034c     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String[] r5 = r15.splitNames     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            int r6 = r5.length     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            int[] r7 = new int[r6]     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r8 = 0
        L_0x017c:
            if (r8 >= r6) goto L_0x0196
            r9 = r5[r8]     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.Object r9 = r3.get(r9)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            L0.b r9 = (L0.b) r9     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r9 == 0) goto L_0x0191
            java.lang.Object r9 = r9.f586g     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            android.content.pm.PackageParser$ApkLite r9 = (android.content.pm.PackageParser.ApkLite) r9     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r9 == 0) goto L_0x0191
            int r9 = r9.revisionCode     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            goto L_0x0192
        L_0x0191:
            r9 = 0
        L_0x0192:
            r7[r8] = r9     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            int r8 = r8 + r0
            goto L_0x017c
        L_0x0196:
            r15.splitRevisionCodes = r7     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
        L_0x0199:
            boolean r15 = q1.T4.f4000e     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            if (r15 == 0) goto L_0x01a4
            android.content.pm.PackageInfo r15 = r4.f4034c     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.String[] r15 = r15.splitNames     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r14.splitNames = r15     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
        L_0x01a4:
            e(r4)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            L0.b r15 = new L0.b     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            r15.<init>(r14, r4)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            T0.l r14 = q1.S1.f3986a     // Catch:{ Exception -> 0x01b9 }
            java.io.File r14 = q1.F3.b(r2)     // Catch:{ Exception -> 0x01b9 }
            q1.S1.a(r14)     // Catch:{ Exception -> 0x01b9 }
        L_0x01b9:
            return r15
        L_0x01ba:
            throw r14     // Catch:{ all -> 0x01bb }
        L_0x01bb:
            r15 = move-exception
            A.i.n(r4, r14)     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
            throw r15     // Catch:{ Exception -> 0x01ca, all -> 0x002a }
        L_0x01c0:
            T0.l r15 = q1.S1.f3986a     // Catch:{ Exception -> 0x01c9 }
            java.io.File r15 = q1.F3.b(r2)     // Catch:{ Exception -> 0x01c9 }
            q1.S1.a(r15)     // Catch:{ Exception -> 0x01c9 }
        L_0x01c9:
            throw r14
        L_0x01ca:
            T0.l r14 = q1.S1.f3986a     // Catch:{ Exception -> 0x01d3 }
            java.io.File r14 = q1.F3.b(r2)     // Catch:{ Exception -> 0x01d3 }
            q1.S1.a(r14)     // Catch:{ Exception -> 0x01d3 }
        L_0x01d3:
            r14 = -1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            L0.b r15 = new L0.b
            r15.<init>(r14, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.Z1.c(java.io.File, boolean):L0.b");
    }

    public static PackageInfo d(File file) {
        b bVar;
        Class cls;
        SigningDetails signingDetails;
        try {
            PackageInfo packageInfo = new PackageInfo();
            PackageParser.Package parsePackage = new PackageParser().parsePackage(file, 0);
            String str = parsePackage.packageName;
            packageInfo.packageName = str;
            packageInfo.lastUpdateTime = System.currentTimeMillis();
            packageInfo.firstInstallTime = System.currentTimeMillis();
            ApplicationInfo applicationInfo = parsePackage.applicationInfo;
            if (applicationInfo != null) {
                packageInfo.applicationInfo = applicationInfo;
                applicationInfo.dataDir = "/dev/null";
            }
            boolean z2 = T4.f3997a;
            int[] iArr = H.b;
            if (z2) {
                packageInfo.baseRevisionCode = parsePackage.baseRevisionCode;
                packageInfo.splitRevisionCodes = iArr;
            }
            boolean z3 = T4.f;
            if (z3) {
                int i2 = parsePackage.mVersionCodeMajor;
                packageInfo.setLongVersionCode((((long) parsePackage.mVersionCode) & 4294967295L) | (((long) i2) << 32));
            } else {
                packageInfo.versionCode = parsePackage.mVersionCode;
            }
            packageInfo.splitNames = H.f3888e;
            packageInfo.versionName = parsePackage.mVersionName;
            packageInfo.sharedUserLabel = parsePackage.mSharedUserLabel;
            packageInfo.sharedUserId = parsePackage.mSharedUserId;
            packageInfo.installLocation = parsePackage.installLocation;
            packageInfo.gids = iArr;
            try {
                if (d.A0(H.f3890h, str.hashCode()) || i.a(parsePackage.mSigningDetails, PackageParser.SigningDetails.UNKNOWN)) {
                    bVar = new b(new Signature[]{new Signature("308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a")}, 2);
                } else if (z3) {
                    PackageParser.SigningDetails signingDetails2 = parsePackage.mSigningDetails;
                    bVar = new b(signingDetails2.signatures, Integer.valueOf(signingDetails2.signatureSchemeVersion));
                } else {
                    bVar = new b(parsePackage.mSignatures, 0);
                }
                if (z3) {
                    Class s2 = f.s();
                    boolean z4 = T4.f4004j;
                    if (z4) {
                        cls = SigningDetails.class;
                    } else {
                        cls = PackageParser.SigningDetails.class;
                    }
                    Constructor declaredConstructor = s2.getDeclaredConstructor(new Class[]{cls});
                    declaredConstructor.setAccessible(true);
                    if (z4) {
                        signingDetails = new SigningDetails((Signature[]) bVar.f, ((Number) bVar.f586g).intValue());
                    } else {
                        signingDetails = new PackageParser.SigningDetails((Signature[]) bVar.f, ((Number) bVar.f586g).intValue());
                    }
                    packageInfo.signingInfo = Y1.a(declaredConstructor.newInstance(new Object[]{signingDetails}));
                }
                packageInfo.signatures = (Signature[]) bVar.f;
            } catch (Throwable unused) {
            }
            return packageInfo;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void e(X3 x3) {
        try {
            boolean z2 = F3.f3882a;
            File d2 = H.d(F3.b, x3.f4254a, "installation.bin");
            Parcel obtain = Parcel.obtain();
            obtain.writeParcelable(x3.f4034c, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            k.h0(d2, marshall);
        } catch (Exception unused) {
        }
    }

    public static String[] f() {
        if (F3.f3882a) {
            return Build.SUPPORTED_64_BIT_ABIS;
        }
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        if (strArr.length == 0) {
            return new String[]{"armeabi-v7a", "armeabi"};
        }
        return strArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e2 A[Catch:{ all -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fb A[Catch:{ all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0107 A[Catch:{ all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0137 A[Catch:{ all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014d A[Catch:{ all -> 0x0176 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static L0.b g(java.io.File r9, boolean r10) {
        /*
            java.lang.Class<android.content.pm.ApplicationInfo> r0 = android.content.pm.ApplicationInfo.class
            r1 = 0
            boolean r2 = q1.H.p()     // Catch:{ all -> 0x0176 }
            if (r2 != 0) goto L_0x0014
            r9 = -3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0176 }
            L0.b r10 = new L0.b     // Catch:{ all -> 0x0176 }
            r10.<init>(r9, r1)     // Catch:{ all -> 0x0176 }
            return r10
        L_0x0014:
            android.content.Context r2 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x002e }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ Exception -> 0x002e }
            java.lang.String r3 = r9.getAbsolutePath()     // Catch:{ Exception -> 0x002e }
            boolean r4 = q1.T4.f     // Catch:{ Exception -> 0x002e }
            if (r4 == 0) goto L_0x0026
            r4 = -2013265856(0xffffffff88000040, float:-3.8518893E-34)
            goto L_0x0029
        L_0x0026:
            r4 = -2147483584(0xffffffff80000040, float:-9.0E-44)
        L_0x0029:
            android.content.pm.PackageInfo r2 = r2.getPackageArchiveInfo(r3, r4)     // Catch:{ Exception -> 0x002e }
            goto L_0x0030
        L_0x002e:
            r2 = r1
        L_0x0030:
            if (r2 != 0) goto L_0x0036
            android.content.pm.PackageInfo r2 = d(r9)     // Catch:{ all -> 0x0176 }
        L_0x0036:
            r3 = -2
            if (r2 != 0) goto L_0x0043
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0176 }
            L0.b r10 = new L0.b     // Catch:{ all -> 0x0176 }
            r10.<init>(r9, r1)     // Catch:{ all -> 0x0176 }
            return r10
        L_0x0043:
            android.content.pm.ApplicationInfo r4 = r2.applicationInfo     // Catch:{ all -> 0x0176 }
            if (r4 != 0) goto L_0x0051
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0176 }
            L0.b r10 = new L0.b     // Catch:{ all -> 0x0176 }
            r10.<init>(r9, r1)     // Catch:{ all -> 0x0176 }
            return r10
        L_0x0051:
            java.lang.String r3 = r2.packageName     // Catch:{ all -> 0x0176 }
            q1.c3 r5 = q1.C0330c3.b     // Catch:{ all -> 0x0176 }
            r5.v0(r3, r1)     // Catch:{ all -> 0x0176 }
            q1.K2 r5 = q1.K2.b     // Catch:{ all -> 0x0176 }
            r5.getClass()     // Catch:{ all -> 0x0176 }
            q1.E4 r5 = q1.K2.f3929c     // Catch:{ all -> 0x0176 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0176 }
            q1.X3 r5 = (q1.X3) r5     // Catch:{ all -> 0x0176 }
            if (r5 == 0) goto L_0x0069
            r6 = r5
            goto L_0x0071
        L_0x0069:
            q1.E4 r6 = q1.K2.f3930d     // Catch:{ all -> 0x0176 }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ all -> 0x0176 }
            q1.z r6 = (q1.C0463z) r6     // Catch:{ all -> 0x0176 }
        L_0x0071:
            if (r6 == 0) goto L_0x0076
            q1.u2 r6 = r6.b     // Catch:{ all -> 0x0176 }
            goto L_0x007d
        L_0x0076:
            q1.u2 r6 = new q1.u2     // Catch:{ all -> 0x0176 }
            java.lang.String r7 = "0"
            r6.<init>((java.lang.String) r7)     // Catch:{ all -> 0x0176 }
        L_0x007d:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0176 }
            r2.lastUpdateTime = r7     // Catch:{ all -> 0x0176 }
            if (r5 == 0) goto L_0x008c
            android.content.pm.PackageInfo r5 = r5.f4034c     // Catch:{ all -> 0x0176 }
            long r7 = r5.firstInstallTime     // Catch:{ all -> 0x0176 }
            r2.firstInstallTime = r7     // Catch:{ all -> 0x0176 }
            goto L_0x008e
        L_0x008c:
            r2.firstInstallTime = r7     // Catch:{ all -> 0x0176 }
        L_0x008e:
            java.lang.String[] r5 = q1.H.f3888e     // Catch:{ all -> 0x0176 }
            r2.splitNames = r5     // Catch:{ all -> 0x0176 }
            boolean r5 = q1.F3.f3882a     // Catch:{ all -> 0x0176 }
            T0.l r5 = q1.S1.f3986a     // Catch:{ all -> 0x0176 }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0176 }
            java.io.File r7 = q1.F3.b     // Catch:{ all -> 0x0176 }
            r5.<init>(r7, r3)     // Catch:{ all -> 0x0176 }
            q1.S1.a(r5)     // Catch:{ all -> 0x0176 }
            java.lang.String r5 = "base.apk"
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0176 }
            r8.<init>(r7, r3)     // Catch:{ all -> 0x0176 }
            r8.mkdirs()     // Catch:{ all -> 0x0176 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0176 }
            r7.<init>(r8, r5)     // Catch:{ all -> 0x0176 }
            if (r10 == 0) goto L_0x00b7
            boolean r10 = r9.renameTo(r7)     // Catch:{ all -> 0x0176 }
            if (r10 != 0) goto L_0x00ba
        L_0x00b7:
            Q0.k.f0(r9, r7)     // Catch:{ all -> 0x0176 }
        L_0x00ba:
            java.lang.String r9 = r7.getCanonicalPath()     // Catch:{ all -> 0x0176 }
            java.lang.String r10 = "920f672206fba15f1e"
            r5 = 49847(0xc2b7, float:6.985E-41)
            java.lang.Object r10 = top.bienvenido.mundo.common.initialize.MNative.a(r5, r10)     // Catch:{ all -> 0x00ce }
            if (r10 == 0) goto L_0x00ce
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00ce }
            goto L_0x00cf
        L_0x00ce:
            r10 = r1
        L_0x00cf:
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0176 }
            q1.C0 r10 = q1.C0452x0.a(r0, r10)     // Catch:{ all -> 0x0176 }
            r10.c(r4, r9)     // Catch:{ all -> 0x0176 }
            java.lang.String r10 = "9115703c0cfdb65919dfb28aa68579"
            java.lang.Object r10 = top.bienvenido.mundo.common.initialize.MNative.a(r5, r10)     // Catch:{ all -> 0x00e7 }
            if (r10 == 0) goto L_0x00e7
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00e7 }
            goto L_0x00e8
        L_0x00e7:
            r10 = r1
        L_0x00e8:
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0176 }
            q1.C0 r10 = q1.C0452x0.a(r0, r10)     // Catch:{ all -> 0x0176 }
            r10.c(r4, r9)     // Catch:{ all -> 0x0176 }
            java.lang.String r9 = "/dev/null"
            r4.dataDir = r9     // Catch:{ all -> 0x0176 }
            boolean r9 = q1.T4.f3998c     // Catch:{ all -> 0x0176 }
            if (r9 == 0) goto L_0x00fe
            r4.deviceProtectedDataDir = "/dev/null"     // Catch:{ all -> 0x0176 }
        L_0x00fe:
            q1.X3 r9 = new q1.X3     // Catch:{ all -> 0x0176 }
            r9.<init>(r2, r4, r6)     // Catch:{ all -> 0x0176 }
            boolean r10 = q1.T4.f     // Catch:{ all -> 0x0176 }
            if (r10 == 0) goto L_0x0125
            boolean r10 = q1.T4.f4002h     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = "/system/framework/org.apache.http.legacy.jar"
            if (r10 == 0) goto L_0x0114
            java.lang.String r10 = "/system/framework/android.test.base.jar"
            java.lang.String[] r10 = new java.lang.String[]{r0, r10}     // Catch:{ all -> 0x0176 }
            goto L_0x0123
        L_0x0114:
            boolean r10 = q1.T4.f4001g     // Catch:{ all -> 0x0176 }
            if (r10 == 0) goto L_0x011d
            java.lang.String[] r10 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0176 }
            goto L_0x0123
        L_0x011d:
            java.lang.String r10 = "/system/framework/org.apache.http.legacy.boot.jar"
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch:{ all -> 0x0176 }
        L_0x0123:
            r4.sharedLibraryFiles = r10     // Catch:{ all -> 0x0176 }
        L_0x0125:
            java.io.File r10 = q1.F3.c(r3)     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ all -> 0x0176 }
            r4.nativeLibraryDir = r0     // Catch:{ all -> 0x0176 }
            q1.g0 r0 = q1.C0447w1.f4226c     // Catch:{ all -> 0x0176 }
            java.lang.String r2 = r7.getParent()     // Catch:{ all -> 0x0176 }
            if (r2 != 0) goto L_0x0139
            java.lang.String r2 = "/"
        L_0x0139:
            q1.g0 r5 = q1.C0447w1.f4227d     // Catch:{ all -> 0x0176 }
            java.lang.Object r5 = r5.f4098c     // Catch:{ all -> 0x0176 }
            q1.C0 r5 = (q1.C0) r5     // Catch:{ all -> 0x0176 }
            r5.c(r4, r2)     // Catch:{ all -> 0x0176 }
            java.lang.Object r0 = r0.f4098c     // Catch:{ all -> 0x0176 }
            q1.C0 r0 = (q1.C0) r0     // Catch:{ all -> 0x0176 }
            r0.c(r4, r2)     // Catch:{ all -> 0x0176 }
            boolean r0 = q1.T4.f4005k     // Catch:{ all -> 0x0176 }
            if (r0 == 0) goto L_0x0150
            r7.setReadOnly()     // Catch:{ all -> 0x0176 }
        L_0x0150:
            q1.g0 r0 = q1.C0447w1.b     // Catch:{ all -> 0x0176 }
            java.lang.String[] r2 = f()     // Catch:{ all -> 0x0176 }
            int r10 = b(r7, r10)     // Catch:{ all -> 0x0176 }
            r10 = r2[r10]     // Catch:{ all -> 0x0176 }
            java.lang.Object r0 = r0.f4098c     // Catch:{ all -> 0x0176 }
            q1.C0 r0 = (q1.C0) r0     // Catch:{ all -> 0x0176 }
            r0.c(r4, r10)     // Catch:{ all -> 0x0176 }
            q1.E4 r10 = q1.K2.f3930d     // Catch:{ all -> 0x0176 }
            java.lang.Object r10 = r10.remove(r3)     // Catch:{ all -> 0x0176 }
            q1.z r10 = (q1.C0463z) r10     // Catch:{ all -> 0x0176 }
            r10 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0176 }
            L0.b r0 = new L0.b     // Catch:{ all -> 0x0176 }
            r0.<init>(r10, r9)     // Catch:{ all -> 0x0176 }
            return r0
        L_0x0176:
            r9 = -1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            L0.b r10 = new L0.b
            r10.<init>(r9, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.Z1.g(java.io.File, boolean):L0.b");
    }
}
