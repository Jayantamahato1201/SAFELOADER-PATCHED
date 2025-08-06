package n1;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3712a = new Object();

    public static ArrayList a(X509Certificate x509Certificate) {
        List b = b(x509Certificate, 7);
        List b2 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b2.size() + b.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    public static List b(X509Certificate x509Certificate, int i2) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i2 && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.lang.String r8, java.security.cert.X509Certificate r9) {
        /*
            java.util.regex.Pattern r0 = e1.c.f2617g
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r0 = r0.matches()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002b
            r0 = 7
            java.util.List r9 = b(r9, r0)
            int r0 = r9.size()
            r3 = 0
        L_0x0018:
            if (r3 >= r0) goto L_0x00e7
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0028
            goto L_0x00e6
        L_0x0028:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x002b:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r8 = r8.toLowerCase(r0)
            r0 = 2
            java.util.List r9 = b(r9, r0)
            java.util.Iterator r9 = r9.iterator()
        L_0x003a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r8 == 0) goto L_0x00b9
            int r3 = r8.length()
            if (r3 == 0) goto L_0x00b9
            java.lang.String r3 = "."
            boolean r4 = r8.startsWith(r3)
            if (r4 != 0) goto L_0x00b9
            java.lang.String r4 = ".."
            boolean r5 = r8.endsWith(r4)
            if (r5 == 0) goto L_0x005f
            goto L_0x00b9
        L_0x005f:
            if (r0 == 0) goto L_0x00b9
            int r5 = r0.length()
            if (r5 == 0) goto L_0x00b9
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto L_0x00b9
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L_0x0074
            goto L_0x00b9
        L_0x0074:
            boolean r4 = r8.endsWith(r3)
            if (r4 != 0) goto L_0x007f
            java.lang.String r4 = r8.concat(r3)
            goto L_0x0080
        L_0x007f:
            r4 = r8
        L_0x0080:
            boolean r5 = r0.endsWith(r3)
            if (r5 != 0) goto L_0x008a
            java.lang.String r0 = r0.concat(r3)
        L_0x008a:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "*"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x009d
            boolean r0 = r4.equals(r0)
            goto L_0x00e4
        L_0x009d:
            java.lang.String r3 = "*."
            boolean r5 = r0.startsWith(r3)
            if (r5 == 0) goto L_0x00b9
            r5 = 42
            int r5 = r0.indexOf(r5, r1)
            r6 = -1
            if (r5 == r6) goto L_0x00af
            goto L_0x00b9
        L_0x00af:
            int r5 = r4.length()
            int r7 = r0.length()
            if (r5 >= r7) goto L_0x00bb
        L_0x00b9:
            r0 = 0
            goto L_0x00e4
        L_0x00bb:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00c2
            goto L_0x00b9
        L_0x00c2:
            java.lang.String r0 = r0.substring(r1)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto L_0x00cd
            goto L_0x00b9
        L_0x00cd:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x00e3
            int r3 = r3 + -1
            r0 = 46
            int r0 = r4.lastIndexOf(r0, r3)
            if (r0 == r6) goto L_0x00e3
            goto L_0x00b9
        L_0x00e3:
            r0 = 1
        L_0x00e4:
            if (r0 == 0) goto L_0x003a
        L_0x00e6:
            return r1
        L_0x00e7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
