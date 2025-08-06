package l1;

import Q0.l;
import d1.A;
import d1.z;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import n1.a;
import n1.b;
import n1.d;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f3649a;
    public static final Logger b = Logger.getLogger(z.class.getName());

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: l1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: l1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: l1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: l1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: l1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: l1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: l1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: l1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: l1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: l1.g} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r0 != null) goto L_0x00f2;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 6
            r1 = 1
            r2 = 0
            java.lang.Class<javax.net.ssl.SSLSocket> r3 = javax.net.ssl.SSLSocket.class
            java.lang.Class<byte[]> r4 = byte[].class
            r5 = 0
            java.lang.String r6 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x000e }
            goto L_0x0013
        L_0x000e:
            java.lang.String r6 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0050 }
        L_0x0013:
            N.g r6 = new N.g     // Catch:{ ClassNotFoundException -> 0x0050 }
            java.lang.String r7 = "setUseSessionTickets"
            java.lang.Class[] r8 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0050 }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x0050 }
            r8[r2] = r9     // Catch:{ ClassNotFoundException -> 0x0050 }
            r6.<init>(r5, r7, r8, r0)     // Catch:{ ClassNotFoundException -> 0x0050 }
            N.g r7 = new N.g     // Catch:{ ClassNotFoundException -> 0x0050 }
            java.lang.String r8 = "setHostname"
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0050 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r2] = r10     // Catch:{ ClassNotFoundException -> 0x0050 }
            r7.<init>(r5, r8, r9, r0)     // Catch:{ ClassNotFoundException -> 0x0050 }
            java.lang.String r8 = "GMSCore_OpenSSL"
            java.security.Provider r8 = java.security.Security.getProvider(r8)     // Catch:{ ClassNotFoundException -> 0x0050 }
            if (r8 == 0) goto L_0x0036
            goto L_0x003b
        L_0x0036:
            java.lang.String r8 = "android.net.Network"
            java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x0052 }
        L_0x003b:
            N.g r8 = new N.g     // Catch:{ ClassNotFoundException -> 0x0050 }
            java.lang.String r9 = "getAlpnSelectedProtocol"
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0050 }
            r8.<init>(r4, r9, r10, r0)     // Catch:{ ClassNotFoundException -> 0x0050 }
            N.g r9 = new N.g     // Catch:{ ClassNotFoundException -> 0x0050 }
            java.lang.String r10 = "setAlpnProtocols"
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0050 }
            r11[r2] = r4     // Catch:{ ClassNotFoundException -> 0x0050 }
            r9.<init>(r5, r10, r11, r0)     // Catch:{ ClassNotFoundException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            goto L_0x005a
        L_0x0052:
            r8 = r5
            r9 = r8
        L_0x0054:
            l1.c r0 = new l1.c     // Catch:{ ClassNotFoundException -> 0x0050 }
            r0.<init>(r6, r7, r8, r9)     // Catch:{ ClassNotFoundException -> 0x0050 }
            goto L_0x005b
        L_0x005a:
            r0 = r5
        L_0x005b:
            if (r0 == 0) goto L_0x005f
            goto L_0x00f2
        L_0x005f:
            java.lang.String r0 = "okhttp.platform"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r4 = "conscrypt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006f
            r0 = 1
            goto L_0x007f
        L_0x006f:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = r4.equals(r0)
        L_0x007f:
            if (r0 == 0) goto L_0x0088
            l1.d r0 = l1.d.m()
            if (r0 == 0) goto L_0x0088
            goto L_0x00f2
        L_0x0088:
            java.lang.Class<javax.net.ssl.SSLParameters> r0 = javax.net.ssl.SSLParameters.class
            java.lang.String r4 = "setApplicationProtocols"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x00a3 }
            java.lang.Class<java.lang.String[]> r7 = java.lang.String[].class
            r6[r2] = r7     // Catch:{ NoSuchMethodException -> 0x00a3 }
            java.lang.reflect.Method r0 = r0.getMethod(r4, r6)     // Catch:{ NoSuchMethodException -> 0x00a3 }
            java.lang.String r4 = "getApplicationProtocol"
            java.lang.reflect.Method r4 = r3.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x00a3 }
            l1.e r6 = new l1.e     // Catch:{ NoSuchMethodException -> 0x00a3 }
            r6.<init>(r0, r4)     // Catch:{ NoSuchMethodException -> 0x00a3 }
            r0 = r6
            goto L_0x00a5
        L_0x00a3:
            r0 = r5
        L_0x00a5:
            if (r0 == 0) goto L_0x00a8
            goto L_0x00f2
        L_0x00a8:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r11 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r12 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            java.lang.String r6 = "put"
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            r7[r2] = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            r7[r1] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            java.lang.reflect.Method r8 = r0.getMethod(r6, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            java.lang.String r4 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            r6[r2] = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            java.lang.reflect.Method r9 = r0.getMethod(r4, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            java.lang.String r4 = "remove"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            r1[r2] = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            java.lang.reflect.Method r10 = r0.getMethod(r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            l1.c r7 = new l1.c     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e8 }
            r5 = r7
            goto L_0x00e9
        L_0x00e8:
        L_0x00e9:
            if (r5 == 0) goto L_0x00ed
            r0 = r5
            goto L_0x00f2
        L_0x00ed:
            l1.g r0 = new l1.g
            r0.<init>()
        L_0x00f2:
            f3649a = r0
            java.lang.Class<d1.z> r0 = d1.z.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.g.<clinit>():void");
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A a2 = (A) list.get(i2);
            if (a2 != A.f2221g) {
                arrayList.add(a2.f);
            }
        }
        return arrayList;
    }

    public l c(X509TrustManager x509TrustManager) {
        return new a(d(x509TrustManager));
    }

    public d d(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        socket.connect(inetSocketAddress, i2);
    }

    public SSLContext g() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public Object i() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean j(String str) {
        return true;
    }

    public void k(int i2, String str, Throwable th) {
        Level level;
        if (i2 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        b.log(level, str, th);
    }

    public void l(String str, Object obj) {
        if (obj == null) {
            str = A.g.h(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(5, str, (Throwable) obj);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
    }
}
