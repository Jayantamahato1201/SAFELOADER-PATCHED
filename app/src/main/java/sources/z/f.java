package Z;

import A.g;
import E0.e;
import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import q.h;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f806a = new e(11);
    public static final byte[] b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f807c = {112, 114, 109, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f808d = {48, 49, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f809e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f810g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f811h = {48, 48, 49, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f812i = {48, 48, 49, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f813j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) {
        int i2 = 0;
        for (c cVar : cVarArr) {
            i2 += ((((cVar.f803g * 2) + 7) & -8) / 8) + (cVar.f802e * 2) + d(cVar.f799a, cVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f799a, cVar2.b, bArr));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.f804h;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    u(byteArrayOutputStream, i5 - i4);
                    i3++;
                    i4 = i5;
                }
                q(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                p(byteArrayOutputStream, cVar3, d(cVar3.f799a, cVar3.b, bArr));
            }
            for (c cVar4 : cVarArr) {
                r(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.f804h;
                int length2 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr2[i6];
                    u(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                q(byteArrayOutputStream, cVar4);
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z2 = true;
            for (File c2 : listFiles) {
                if (!c(c2) || !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            return z2;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        String str3;
        byte[] bArr2 = f811h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f810g;
        String str4 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            str3 = str4;
        } else {
            str3 = ":";
        }
        if (str.length() <= 0) {
            if (str4.equals(str3)) {
                return str2.replace(":", str4);
            }
            if (":".equals(str3)) {
                return str2.replace(str4, ":");
            }
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str4) || str2.contains(":")) {
                if (str4.equals(str3)) {
                    return str2.replace(":", str4);
                }
                if (":".equals(str3)) {
                    return str2.replace(str4, ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder a2 = h.a(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str4 = ":";
                }
                a2.append(str4);
                a2.append(str2);
                return a2.toString();
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] f(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                throw new IllegalStateException(g.f(i2, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) m(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
            }
            if (i4 != i2) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e2) {
            throw new IllegalStateException(e2.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f812i;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(f808d, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int m2 = (int) m(fileInputStream, 1);
                byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
                    try {
                        c[] j2 = j(byteArrayInputStream, m2, cVarArr);
                        byteArrayInputStream.close();
                        return j2;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, f813j)) {
            int m3 = (int) m(fileInputStream, 2);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h3);
                try {
                    c[] k2 = k(byteArrayInputStream2, bArr2, m3, cVarArr);
                    byteArrayInputStream2.close();
                    return k2;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i2, c[] cVarArr) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 == cVarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                int m2 = (int) m(byteArrayInputStream, 2);
                iArr[i4] = (int) m(byteArrayInputStream, 2);
                strArr[i4] = new String(f(byteArrayInputStream, m2), StandardCharsets.UTF_8);
            }
            while (i3 < i2) {
                c cVar = cVarArr[i3];
                if (cVar.b.equals(strArr[i3])) {
                    int i5 = iArr[i3];
                    cVar.f802e = i5;
                    cVar.f804h = g(byteArrayInputStream, i5);
                    i3++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, c[] cVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 == cVarArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m2 = m(byteArrayInputStream, 4);
                int m3 = (int) m(byteArrayInputStream, 2);
                c cVar = null;
                if (cVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= cVarArr.length) {
                            break;
                        } else if (cVarArr[i4].b.equals(str)) {
                            cVar = cVarArr[i4];
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                if (cVar != null) {
                    cVar.f801d = m2;
                    int[] g2 = g(byteArrayInputStream, m3);
                    if (Arrays.equals(bArr, f811h)) {
                        cVar.f802e = m3;
                        cVar.f804h = g2;
                    }
                    i3++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f809e)) {
            int m2 = (int) m(fileInputStream, 1);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
                try {
                    c[] n2 = n(byteArrayInputStream, str, m2);
                    byteArrayInputStream.close();
                    return n2;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static long m(InputStream inputStream, int i2) {
        byte[] f2 = f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (f2[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        int i3;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i4 = i2;
        if (byteArrayInputStream2.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int m2 = (int) m(byteArrayInputStream2, 2);
            long m3 = m(byteArrayInputStream2, 4);
            String str2 = str;
            int i6 = (int) m3;
            cVarArr[i5] = new c(str2, new String(f(byteArrayInputStream2, (int) m(byteArrayInputStream2, 2)), StandardCharsets.UTF_8), m(byteArrayInputStream2, 4), m2, i6, (int) m(byteArrayInputStream2, 4), new int[m2], new TreeMap());
        }
        int i7 = 0;
        while (i7 < i4) {
            c cVar = cVarArr[i7];
            int available = byteArrayInputStream2.available() - cVar.f;
            int i8 = 0;
            while (true) {
                int available2 = byteArrayInputStream2.available();
                treeMap = cVar.f805i;
                if (available2 <= available) {
                    break;
                }
                i8 += (int) m(byteArrayInputStream2, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                for (int m4 = (int) m(byteArrayInputStream2, 2); m4 > 0; m4--) {
                    m(byteArrayInputStream2, 2);
                    int m5 = (int) m(byteArrayInputStream2, 1);
                    if (!(m5 == 6 || m5 == 7)) {
                        while (m5 > 0) {
                            m(byteArrayInputStream2, 1);
                            for (int m6 = (int) m(byteArrayInputStream2, 1); m6 > 0; m6--) {
                                m(byteArrayInputStream2, 2);
                            }
                            m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream2.available() == available) {
                cVar.f804h = g(byteArrayInputStream2, cVar.f802e);
                int i9 = cVar.f803g;
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream2, (((i9 * 2) + 7) & -8) / 8));
                for (int i10 = 0; i10 < i9; i10++) {
                    if (valueOf.get(i10)) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    if (valueOf.get(i10 + i9)) {
                        i3 |= 4;
                    }
                    if (i3 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i10));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i10), Integer.valueOf(i3 | num.intValue()));
                    }
                }
                i7++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return cVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        long j2;
        ArrayList arrayList;
        int length;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        c[] cVarArr2 = cVarArr;
        byte[] bArr3 = f808d;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream5, cVarArr2.length);
                int i2 = 2;
                for (c cVar : cVarArr2) {
                    t(byteArrayOutputStream5, cVar.f800c, 4);
                    t(byteArrayOutputStream5, cVar.f801d, 4);
                    t(byteArrayOutputStream5, (long) cVar.f803g, 4);
                    String d2 = d(cVar.f799a, cVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d2.getBytes(charset).length;
                    u(byteArrayOutputStream5, length2);
                    i2 = i2 + 14 + length2;
                    byteArrayOutputStream5.write(d2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i2 == byteArray.length) {
                    o oVar = new o(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(oVar);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < cVarArr2.length) {
                        try {
                            c cVar2 = cVarArr2[i3];
                            u(byteArrayOutputStream6, i3);
                            u(byteArrayOutputStream6, cVar2.f802e);
                            i4 = i4 + 4 + (cVar2.f802e * 2);
                            int[] iArr = cVar2.f804h;
                            int length3 = iArr.length;
                            int i5 = 0;
                            int i6 = 0;
                            while (i5 < length3) {
                                int i7 = iArr[i5];
                                u(byteArrayOutputStream6, i7 - i6);
                                i5++;
                                i6 = i7;
                            }
                            i3++;
                        } catch (Throwable th6) {
                            th2.addSuppressed(th6);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i4 == byteArray2.length) {
                        o oVar2 = new o(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(oVar2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < cVarArr2.length) {
                            try {
                                c cVar3 = cVarArr2[i8];
                                int i10 = 0;
                                for (Map.Entry value : cVar3.f805i.entrySet()) {
                                    i10 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                q(byteArrayOutputStream2, cVar3);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream3, cVar3);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                u(byteArrayOutputStream7, i8);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i11 = i9 + 6;
                                ArrayList arrayList4 = arrayList3;
                                t(byteArrayOutputStream7, (long) length4, 4);
                                u(byteArrayOutputStream7, i10);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i9 = i11 + length4;
                                i8++;
                                arrayList3 = arrayList4;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i9 == byteArray5.length) {
                            o oVar3 = new o(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(oVar3);
                            long j3 = (long) 4;
                            long size = j3 + j3 + 4 + ((long) (arrayList2.size() * 16));
                            t(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i12 = 0;
                            while (i12 < arrayList2.size()) {
                                o oVar4 = (o) arrayList2.get(i12);
                                int i13 = oVar4.f823a;
                                if (i13 == 1) {
                                    j2 = 0;
                                } else if (i13 == 2) {
                                    j2 = 1;
                                } else if (i13 == 3) {
                                    j2 = 2;
                                } else if (i13 == 4) {
                                    j2 = 3;
                                } else if (i13 == 5) {
                                    j2 = 4;
                                } else {
                                    throw null;
                                }
                                t(byteArrayOutputStream4, j2, 4);
                                t(byteArrayOutputStream4, size, 4);
                                byte[] bArr4 = oVar4.b;
                                if (oVar4.f824c) {
                                    long length5 = (long) bArr4.length;
                                    byte[] a2 = a(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(a2);
                                    t(byteArrayOutputStream4, (long) a2.length, 4);
                                    t(byteArrayOutputStream4, length5, 4);
                                    length = a2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    t(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    t(byteArrayOutputStream4, 0, 4);
                                    length = bArr4.length;
                                }
                                size += (long) length;
                                i12++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i14));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i2 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th8) {
                th.addSuppressed(th8);
            }
        } else {
            byte[] bArr5 = f809e;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] b2 = b(cVarArr2, bArr5);
                t(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                t(byteArrayOutputStream4, (long) b2.length, 4);
                byte[] a3 = a(b2);
                t(byteArrayOutputStream4, (long) a3.length, 4);
                byteArrayOutputStream4.write(a3);
                return true;
            }
            byte[] bArr6 = f810g;
            if (Arrays.equals(bArr2, bArr6)) {
                t(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                for (c cVar4 : cVarArr2) {
                    String d3 = d(cVar4.f799a, cVar4.b, bArr6);
                    Charset charset2 = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream4, d3.getBytes(charset2).length);
                    u(byteArrayOutputStream4, cVar4.f804h.length);
                    t(byteArrayOutputStream4, (long) (cVar4.f805i.size() * 4), 4);
                    t(byteArrayOutputStream4, cVar4.f800c, 4);
                    byteArrayOutputStream4.write(d3.getBytes(charset2));
                    for (Integer intValue : cVar4.f805i.keySet()) {
                        u(byteArrayOutputStream4, intValue.intValue());
                        u(byteArrayOutputStream4, 0);
                    }
                    for (int u2 : cVar4.f804h) {
                        u(byteArrayOutputStream4, u2);
                    }
                }
                return true;
            }
            byte[] bArr7 = f;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] b3 = b(cVarArr2, bArr7);
                t(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                t(byteArrayOutputStream4, (long) b3.length, 4);
                byte[] a4 = a(b3);
                t(byteArrayOutputStream4, (long) a4.length, 4);
                byteArrayOutputStream4.write(a4);
                return true;
            }
            byte[] bArr8 = f811h;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            u(byteArrayOutputStream4, cVarArr2.length);
            for (c cVar5 : cVarArr2) {
                String d4 = d(cVar5.f799a, cVar5.b, bArr8);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream4, d4.getBytes(charset3).length);
                TreeMap treeMap = cVar5.f805i;
                u(byteArrayOutputStream4, treeMap.size());
                u(byteArrayOutputStream4, cVar5.f804h.length);
                t(byteArrayOutputStream4, cVar5.f800c, 4);
                byteArrayOutputStream4.write(d4.getBytes(charset3));
                for (Integer intValue2 : treeMap.keySet()) {
                    u(byteArrayOutputStream4, intValue2.intValue());
                }
                for (int u3 : cVar5.f804h) {
                    u(byteArrayOutputStream4, u3);
                }
            }
            return true;
        }
        throw th2;
        throw th5;
        throw th;
        throw th3;
        throw th4;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.f802e);
        t(byteArrayOutputStream, (long) cVar.f, 4);
        t(byteArrayOutputStream, cVar.f800c, 4);
        t(byteArrayOutputStream, (long) cVar.f803g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        byte[] bArr = new byte[((((cVar.f803g * 2) + 7) & -8) / 8)];
        for (Map.Entry entry : cVar.f805i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + cVar.f803g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i2 = 0;
        for (Map.Entry entry : cVar.f805i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i2);
                u(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0243, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0250, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:177:0x022f, B:193:0x024c] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x027c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f4 A[SYNTHETIC, Splitter:B:49:0x00f4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void s(android.content.Context r18, java.util.concurrent.Executor r19, Z.e r20, boolean r21) {
        /*
            r1 = r18
            r5 = r20
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 7
            r9 = 0
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0290 }
            java.io.File r11 = r1.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r12 = 0
            if (r21 != 0) goto L_0x008e
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r11, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L_0x0041
        L_0x003f:
            r0 = 0
            goto L_0x0071
        L_0x0041:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0064 }
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0064 }
            r14.<init>(r0)     // Catch:{ IOException -> 0x0064 }
            r7.<init>(r14)     // Catch:{ IOException -> 0x0064 }
            long r14 = r7.readLong()     // Catch:{ all -> 0x0066 }
            r7.close()     // Catch:{ IOException -> 0x0064 }
            r16 = r14
            long r13 = r10.lastUpdateTime
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r0 == 0) goto L_0x0071
            r7 = 2
            r5.h(r7, r12)
            goto L_0x0071
        L_0x0064:
            goto L_0x003f
        L_0x0066:
            r0 = move-exception
            r13 = r0
            r7.close()     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch:{ IOException -> 0x0064 }
        L_0x0070:
            throw r13     // Catch:{ IOException -> 0x0064 }
        L_0x0071:
            if (r0 != 0) goto L_0x0074
            goto L_0x008e
        L_0x0074:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r1.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            Z.n.c(r1, r9)
            goto L_0x0284
        L_0x008e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r0.<init>(r7)
            java.lang.String r7 = r1.getPackageName()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r7 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r13 = "/data/misc/profiles/cur/0"
            r3.<init>(r13, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r3, r2)
            Z.b r2 = new Z.b
            java.lang.String r13 = "dexopt/baseline.prof"
            r3 = r4
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            byte[] r4 = r2.f794c
            if (r4 != 0) goto L_0x00ca
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 3
            r2.b(r3, r0)
            goto L_0x00d4
        L_0x00ca:
            boolean r0 = r7.canWrite()
            r6 = 4
            if (r0 != 0) goto L_0x00d8
            r2.b(r6, r12)
        L_0x00d4:
            r6 = 0
            r7 = 1
            goto L_0x027a
        L_0x00d8:
            r7 = 1
            r2.f = r7
            byte[] r7 = b
            r14 = 6
            java.io.FileInputStream r0 = r2.a(r3, r13)     // Catch:{ FileNotFoundException -> 0x00e9, IOException -> 0x00e4 }
            r13 = r0
            goto L_0x00ee
        L_0x00e4:
            r0 = move-exception
            r5.h(r8, r0)
            goto L_0x00ed
        L_0x00e9:
            r0 = move-exception
            r5.h(r14, r0)
        L_0x00ed:
            r13 = r12
        L_0x00ee:
            java.lang.String r15 = "Invalid magic"
            r14 = 8
            if (r13 == 0) goto L_0x013e
            byte[] r0 = f(r13, r6)     // Catch:{ IOException -> 0x0117, IllegalStateException -> 0x0115 }
            boolean r0 = java.util.Arrays.equals(r7, r0)     // Catch:{ IOException -> 0x0117, IllegalStateException -> 0x0115 }
            if (r0 == 0) goto L_0x0119
            byte[] r0 = f(r13, r6)     // Catch:{ IOException -> 0x0117, IllegalStateException -> 0x0115 }
            java.lang.String r9 = r2.f796e     // Catch:{ IOException -> 0x0117, IllegalStateException -> 0x0115 }
            Z.c[] r9 = l(r13, r0, r9)     // Catch:{ IOException -> 0x0117, IllegalStateException -> 0x0115 }
            r13.close()     // Catch:{ IOException -> 0x010c }
            goto L_0x0132
        L_0x010c:
            r0 = move-exception
            r5.h(r8, r0)
            goto L_0x0132
        L_0x0111:
            r1 = r0
            goto L_0x0135
        L_0x0113:
            r0 = move-exception
            goto L_0x0111
        L_0x0115:
            r0 = move-exception
            goto L_0x011f
        L_0x0117:
            r0 = move-exception
            goto L_0x012b
        L_0x0119:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0117, IllegalStateException -> 0x0115 }
            r0.<init>(r15)     // Catch:{ IOException -> 0x0117, IllegalStateException -> 0x0115 }
            throw r0     // Catch:{ IOException -> 0x0117, IllegalStateException -> 0x0115 }
        L_0x011f:
            r5.h(r14, r0)     // Catch:{ all -> 0x0113 }
            r13.close()     // Catch:{ IOException -> 0x0126 }
            goto L_0x0131
        L_0x0126:
            r0 = move-exception
            r5.h(r8, r0)
            goto L_0x0131
        L_0x012b:
            r5.h(r8, r0)     // Catch:{ all -> 0x0113 }
            r13.close()     // Catch:{ IOException -> 0x0126 }
        L_0x0131:
            r9 = r12
        L_0x0132:
            r2.f797g = r9
            goto L_0x013e
        L_0x0135:
            r13.close()     // Catch:{ IOException -> 0x0139 }
            goto L_0x013d
        L_0x0139:
            r0 = move-exception
            r5.h(r8, r0)
        L_0x013d:
            throw r1
        L_0x013e:
            Z.c[] r0 = r2.f797g
            if (r0 == 0) goto L_0x01ad
            int r9 = android.os.Build.VERSION.SDK_INT
            r13 = 24
            if (r9 < r13) goto L_0x01ad
            r8 = 33
            if (r9 <= r8) goto L_0x014e
            goto L_0x01ad
        L_0x014e:
            if (r9 == r13) goto L_0x0158
            r8 = 25
            if (r9 == r8) goto L_0x0158
            switch(r9) {
                case 31: goto L_0x0158;
                case 32: goto L_0x0158;
                case 33: goto L_0x0158;
                default: goto L_0x0157;
            }
        L_0x0157:
            goto L_0x01ad
        L_0x0158:
            java.lang.String r8 = "dexopt/baseline.profm"
            java.io.FileInputStream r3 = r2.a(r3, r8)     // Catch:{ FileNotFoundException -> 0x0180, IOException -> 0x017d, IllegalStateException -> 0x017b }
            if (r3 == 0) goto L_0x0194
            byte[] r8 = f807c     // Catch:{ all -> 0x0182 }
            byte[] r9 = f(r3, r6)     // Catch:{ all -> 0x0182 }
            boolean r8 = java.util.Arrays.equals(r8, r9)     // Catch:{ all -> 0x0182 }
            if (r8 == 0) goto L_0x0185
            byte[] r6 = f(r3, r6)     // Catch:{ all -> 0x0182 }
            Z.c[] r0 = i(r3, r6, r4, r0)     // Catch:{ all -> 0x0182 }
            r2.f797g = r0     // Catch:{ all -> 0x0182 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0180, IOException -> 0x017d, IllegalStateException -> 0x017b }
            r0 = r2
            goto L_0x01aa
        L_0x017b:
            r0 = move-exception
            goto L_0x019a
        L_0x017d:
            r0 = move-exception
            r3 = 7
            goto L_0x01a0
        L_0x0180:
            r0 = move-exception
            goto L_0x01a4
        L_0x0182:
            r0 = move-exception
            r4 = r0
            goto L_0x018b
        L_0x0185:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0182 }
            r0.<init>(r15)     // Catch:{ all -> 0x0182 }
            throw r0     // Catch:{ all -> 0x0182 }
        L_0x018b:
            r3.close()     // Catch:{ all -> 0x018f }
            goto L_0x0193
        L_0x018f:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0180, IOException -> 0x017d, IllegalStateException -> 0x017b }
        L_0x0193:
            throw r4     // Catch:{ FileNotFoundException -> 0x0180, IOException -> 0x017d, IllegalStateException -> 0x017b }
        L_0x0194:
            if (r3 == 0) goto L_0x01a9
            r3.close()     // Catch:{ FileNotFoundException -> 0x0180, IOException -> 0x017d, IllegalStateException -> 0x017b }
            goto L_0x01a9
        L_0x019a:
            r2.f797g = r12
            r5.h(r14, r0)
            goto L_0x01a9
        L_0x01a0:
            r5.h(r3, r0)
            goto L_0x01a9
        L_0x01a4:
            r3 = 9
            r5.h(r3, r0)
        L_0x01a9:
            r0 = r12
        L_0x01aa:
            if (r0 == 0) goto L_0x01ad
            r2 = r0
        L_0x01ad:
            Z.e r3 = r2.b
            Z.c[] r0 = r2.f797g
            java.lang.String r4 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0204
            byte[] r5 = r2.f794c
            if (r5 != 0) goto L_0x01ba
            goto L_0x0204
        L_0x01ba:
            boolean r6 = r2.f
            if (r6 == 0) goto L_0x01fe
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
            r6.<init>()     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
            r6.write(r7)     // Catch:{ all -> 0x01de }
            r6.write(r5)     // Catch:{ all -> 0x01de }
            boolean r0 = o(r6, r5, r0)     // Catch:{ all -> 0x01de }
            if (r0 != 0) goto L_0x01e1
            r0 = 5
            r3.h(r0, r12)     // Catch:{ all -> 0x01de }
            r2.f797g = r12     // Catch:{ all -> 0x01de }
            r6.close()     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
            goto L_0x0204
        L_0x01d9:
            r0 = move-exception
            goto L_0x01f4
        L_0x01db:
            r0 = move-exception
            r5 = 7
            goto L_0x01f8
        L_0x01de:
            r0 = move-exception
            r5 = r0
            goto L_0x01eb
        L_0x01e1:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x01de }
            r2.f798h = r0     // Catch:{ all -> 0x01de }
            r6.close()     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
            goto L_0x01fb
        L_0x01eb:
            r6.close()     // Catch:{ all -> 0x01ef }
            goto L_0x01f3
        L_0x01ef:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
        L_0x01f3:
            throw r5     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
        L_0x01f4:
            r3.h(r14, r0)
            goto L_0x01fb
        L_0x01f8:
            r3.h(r5, r0)
        L_0x01fb:
            r2.f797g = r12
            goto L_0x0204
        L_0x01fe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0204:
            byte[] r0 = r2.f798h
            if (r0 != 0) goto L_0x020c
            r0 = 0
            r7 = 1
            goto L_0x0274
        L_0x020c:
            boolean r3 = r2.f
            if (r3 == 0) goto L_0x028a
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x0264, IOException -> 0x0261 }
            r3.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0264, IOException -> 0x0261 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0255 }
            java.io.File r0 = r2.f795d     // Catch:{ all -> 0x0255 }
            r4.<init>(r0)     // Catch:{ all -> 0x0255 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0249 }
        L_0x0220:
            int r5 = r3.read(r0)     // Catch:{ all -> 0x0249 }
            if (r5 <= 0) goto L_0x022b
            r6 = 0
            r4.write(r0, r6, r5)     // Catch:{ all -> 0x0249 }
            goto L_0x0220
        L_0x022b:
            r7 = 1
            r2.b(r7, r12)     // Catch:{ all -> 0x0246 }
            r4.close()     // Catch:{ all -> 0x0243 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0240, IOException -> 0x023d }
            r2.f798h = r12
            r2.f797g = r12
            r0 = 1
            goto L_0x0274
        L_0x023b:
            r0 = move-exception
            goto L_0x0285
        L_0x023d:
            r0 = move-exception
        L_0x023e:
            r3 = 7
            goto L_0x0267
        L_0x0240:
            r0 = move-exception
        L_0x0241:
            r3 = 6
            goto L_0x026f
        L_0x0243:
            r0 = move-exception
        L_0x0244:
            r4 = r0
            goto L_0x0258
        L_0x0246:
            r0 = move-exception
        L_0x0247:
            r5 = r0
            goto L_0x024c
        L_0x0249:
            r0 = move-exception
            r7 = 1
            goto L_0x0247
        L_0x024c:
            r4.close()     // Catch:{ all -> 0x0250 }
            goto L_0x0254
        L_0x0250:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch:{ all -> 0x0243 }
        L_0x0254:
            throw r5     // Catch:{ all -> 0x0243 }
        L_0x0255:
            r0 = move-exception
            r7 = 1
            goto L_0x0244
        L_0x0258:
            r3.close()     // Catch:{ all -> 0x025c }
            goto L_0x0260
        L_0x025c:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0240, IOException -> 0x023d }
        L_0x0260:
            throw r4     // Catch:{ FileNotFoundException -> 0x0240, IOException -> 0x023d }
        L_0x0261:
            r0 = move-exception
            r7 = 1
            goto L_0x023e
        L_0x0264:
            r0 = move-exception
            r7 = 1
            goto L_0x0241
        L_0x0267:
            r2.b(r3, r0)     // Catch:{ all -> 0x023b }
        L_0x026a:
            r2.f798h = r12
            r2.f797g = r12
            goto L_0x0273
        L_0x026f:
            r2.b(r3, r0)     // Catch:{ all -> 0x023b }
            goto L_0x026a
        L_0x0273:
            r0 = 0
        L_0x0274:
            if (r0 == 0) goto L_0x0279
            e(r10, r11)
        L_0x0279:
            r6 = r0
        L_0x027a:
            if (r6 == 0) goto L_0x0280
            if (r21 == 0) goto L_0x0280
            r9 = 1
            goto L_0x0281
        L_0x0280:
            r9 = 0
        L_0x0281:
            Z.n.c(r1, r9)
        L_0x0284:
            return
        L_0x0285:
            r2.f798h = r12
            r2.f797g = r12
            throw r0
        L_0x028a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0290:
            r0 = move-exception
            r3 = 7
            r5.h(r3, r0)
            r6 = 0
            Z.n.c(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.f.s(android.content.Context, java.util.concurrent.Executor, Z.e, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((int) ((j2 >> (i3 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        t(byteArrayOutputStream, (long) i2, 2);
    }
}
