package e1;

import A.g;
import b0.C0089m;
import d1.H;
import d1.t;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o1.h;
import o1.v;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f2613a;
    public static final String[] b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final H f2614c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f2615d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f2616e = TimeZone.getTimeZone("GMT");
    public static final C0089m f = new C0089m(1);

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f2617g = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* JADX WARNING: type inference failed for: r2v1, types: [o1.g, java.lang.Object, o1.e] */
    static {
        byte[] bArr = new byte[0];
        f2613a = bArr;
        ? obj = new Object();
        obj.A(bArr, 0);
        long j2 = (long) 0;
        f2614c = new H(j2, obj, 0);
        if (j2 < 0 || j2 > j2 || 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        h.c("efbbbf");
        h.c("feff");
        h.c("fffe");
        h.c("0000ffff");
        h.c("ffff0000");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARNING: type inference failed for: r8v12, types: [java.lang.Object, o1.e] */
    public static String b(String str) {
        InetAddress inetAddress;
        int i2 = -1;
        int i3 = 0;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = g(str, 0, str.length());
            } else {
                inetAddress = g(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i2 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                ? obj = new Object();
                while (i3 < address.length) {
                    if (i3 == i2) {
                        obj.B(58);
                        i3 += i5;
                        if (i3 == 16) {
                            obj.B(58);
                        }
                    } else {
                        if (i3 > 0) {
                            obj.B(58);
                        }
                        obj.D((long) (((address[i3] & 255) << 8) | (address[i3 + 1] & 255)));
                        i3 += 2;
                    }
                }
                return obj.w();
            }
            throw new AssertionError(g.i("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            while (i3 < lowerCase.length()) {
                char charAt = lowerCase.charAt(i3);
                if (charAt <= 31) {
                    return null;
                }
                if (charAt >= 127) {
                    return null;
                }
                if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                    return null;
                }
                i3++;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int c(long j2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("timeout too large.");
            } else if (millis != 0 || i2 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException("timeout too small.");
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void e(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!o(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static int f(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    public static InetAddress g(String str, int i2, int i3) {
        String str2 = str;
        int i4 = i3;
        byte[] bArr = new byte[16];
        int i5 = i2;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            if (i5 >= i4) {
                break;
            } else if (i6 == 16) {
                return null;
            } else {
                int i9 = i5 + 2;
                if (i9 > i4 || !str2.regionMatches(i5, "::", 0, 2)) {
                    if (i6 != 0) {
                        if (str2.regionMatches(i5, ":", 0, 1)) {
                            i5++;
                        } else if (!str2.regionMatches(i5, ".", 0, 1)) {
                            return null;
                        } else {
                            int i10 = i6 - 2;
                            int i11 = i10;
                            while (i8 < i4) {
                                if (i11 == 16) {
                                    return null;
                                }
                                if (i11 != i10) {
                                    if (str2.charAt(i8) != '.') {
                                        return null;
                                    }
                                    i8++;
                                }
                                int i12 = i8;
                                int i13 = 0;
                                while (i12 < i4) {
                                    char charAt = str2.charAt(i12);
                                    if (charAt < '0' || charAt > '9') {
                                        break;
                                    } else if ((i13 == 0 && i8 != i12) || ((i13 * 10) + charAt) - 48 > 255) {
                                        return null;
                                    } else {
                                        i12++;
                                    }
                                }
                                if (i12 - i8 == 0) {
                                    return null;
                                }
                                bArr[i11] = (byte) i13;
                                i11++;
                                i8 = i12;
                            }
                            if (i11 != i6 + 2) {
                                return null;
                            }
                            i6 += 2;
                        }
                    }
                    i8 = i5;
                } else if (i7 != -1) {
                    return null;
                } else {
                    i6 += 2;
                    i7 = i6;
                    if (i9 == i4) {
                        break;
                    }
                    i8 = i9;
                }
                i5 = i8;
                int i14 = 0;
                while (i5 < i4) {
                    int f2 = f(str2.charAt(i5));
                    if (f2 == -1) {
                        break;
                    }
                    i14 = (i14 << 4) + f2;
                    i5++;
                }
                int i15 = i5 - i8;
                if (i15 == 0 || i15 > 4) {
                    return null;
                }
                int i16 = i6 + 1;
                bArr[i6] = (byte) (255 & (i14 >>> 8));
                i6 += 2;
                bArr[i16] = (byte) (i14 & 255);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i17 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i17, i17);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int h(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int i(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static String k(t tVar, boolean z2) {
        boolean contains = tVar.f2368d.contains(":");
        String str = tVar.f2368d;
        if (contains) {
            str = g.i("[", str, "]");
        }
        int i2 = tVar.f2369e;
        if (!z2 && i2 == t.b(tVar.f2366a)) {
            return str;
        }
        return str + ":" + i2;
    }

    public static List l(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static List m(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static String[] n(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean o(AssertionError assertionError) {
        if (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) {
            return false;
        }
        return true;
    }

    public static boolean p(Comparator comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r13v3, types: [java.lang.Object, o1.e] */
    public static boolean q(v vVar, int i2) {
        long j2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long nanoTime = System.nanoTime();
        if (vVar.a().e()) {
            j2 = vVar.a().c() - nanoTime;
        } else {
            j2 = Long.MAX_VALUE;
        }
        vVar.a().d(Math.min(j2, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            ? obj = new Object();
            while (vVar.f(obj, 8192) != -1) {
                obj.k();
            }
            if (j2 == Long.MAX_VALUE) {
                vVar.a().a();
                return true;
            }
            vVar.a().d(nanoTime + j2);
            return true;
        } catch (InterruptedIOException unused) {
            if (j2 == Long.MAX_VALUE) {
                vVar.a().a();
                return false;
            }
            vVar.a().d(nanoTime + j2);
            return false;
        } catch (Throwable th) {
            if (j2 == Long.MAX_VALUE) {
                vVar.a().a();
            } else {
                vVar.a().d(nanoTime + j2);
            }
            throw th;
        }
    }

    public static int r(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int s(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }
}
