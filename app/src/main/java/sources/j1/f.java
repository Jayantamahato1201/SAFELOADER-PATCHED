package j1;

import e1.c;
import java.io.IOException;
import java.util.Locale;
import o1.h;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final h f3227a = h.f("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f3228c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f3229d = new String[256];

    static {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = f3229d;
            if (i3 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i3)};
            byte[] bArr = c.f2613a;
            strArr[i3] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = f3228c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = strArr2[i4] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            int i7 = iArr[0];
            String[] strArr3 = f3228c;
            int i8 = i7 | i6;
            strArr3[i8] = strArr3[i7] + '|' + strArr3[i6];
            strArr3[i8 | 8] = strArr3[i7] + '|' + strArr3[i6] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f3228c;
            if (i2 < strArr4.length) {
                if (strArr4[i2] == null) {
                    strArr4[i2] = f3229d[i2];
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public static String a(boolean z2, int i2, int i3, byte b2, byte b3) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = b;
        if (b2 < strArr.length) {
            str = strArr[b2];
        } else {
            Object[] objArr = {Byte.valueOf(b2)};
            byte[] bArr = c.f2613a;
            str = String.format(Locale.US, "0x%02x", objArr);
        }
        if (b3 == 0) {
            str2 = "";
        } else {
            String[] strArr2 = f3229d;
            if (!(b2 == 2 || b2 == 3)) {
                if (b2 == 4 || b2 == 6) {
                    if (b3 == 1) {
                        str2 = "ACK";
                    } else {
                        str2 = strArr2[b3];
                    }
                } else if (!(b2 == 7 || b2 == 8)) {
                    String[] strArr3 = f3228c;
                    if (b3 < strArr3.length) {
                        str4 = strArr3[b3];
                    } else {
                        str4 = strArr2[b3];
                    }
                    if (b2 == 5 && (b3 & 4) != 0) {
                        str2 = str4.replace("HEADERS", "PUSH_PROMISE");
                    } else if (b2 != 0 || (b3 & 32) == 0) {
                        str2 = str4;
                    } else {
                        str2 = str4.replace("PRIORITY", "COMPRESSED");
                    }
                }
            }
            str2 = strArr2[b3];
        }
        if (z2) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        Object[] objArr2 = {str3, Integer.valueOf(i2), Integer.valueOf(i3), str, str2};
        byte[] bArr2 = c.f2613a;
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", objArr2);
    }

    public static void b(String str, Object... objArr) {
        byte[] bArr = c.f2613a;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static void c(String str, Object... objArr) {
        byte[] bArr = c.f2613a;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
