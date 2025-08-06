package d1;

import Q0.l;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final r f2375a;
    public final l b;

    public w(r rVar, l lVar) {
        this.f2375a = rVar;
        this.b = lVar;
    }

    public static w a(String str, String str2, l lVar) {
        StringBuilder sb = new StringBuilder("form-data; name=");
        x.f0(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            x.f0(sb, str2);
        }
        String[] strArr = (String[]) new String[]{"Content-Disposition", sb.toString()}.clone();
        int i2 = 0;
        while (i2 < strArr.length) {
            String str3 = strArr[i2];
            if (str3 != null) {
                strArr[i2] = str3.trim();
                i2++;
            } else {
                throw new IllegalArgumentException("Headers cannot be null");
            }
        }
        int i3 = 0;
        while (i3 < strArr.length) {
            String str4 = strArr[i3];
            String str5 = strArr[i3 + 1];
            if (str4.length() != 0 && str4.indexOf(0) == -1 && str5.indexOf(0) == -1) {
                i3 += 2;
            } else {
                throw new IllegalArgumentException("Unexpected header: " + str4 + ": " + str5);
            }
        }
        r rVar = new r(strArr);
        if (rVar.a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        } else if (rVar.a("Content-Length") == null) {
            return new w(rVar, lVar);
        } else {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
    }
}
