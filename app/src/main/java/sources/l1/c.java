package l1;

import N.g;
import Q0.l;
import android.os.Build;
import android.util.Log;
import d1.A;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k.g1;
import n1.d;

public final class c extends g {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3640c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3641d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3642e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f3643g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f3644h;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, k.g1] */
    public c(g gVar, g gVar2, g gVar3, g gVar4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", (Class[]) null);
            method2 = cls.getMethod("open", new Class[]{String.class});
            method = cls.getMethod("warnIfOpen", (Class[]) null);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        ? obj = new Object();
        obj.f3461a = method3;
        obj.b = method2;
        obj.f3462c = method;
        this.f3644h = obj;
        this.f3641d = gVar;
        this.f3642e = gVar2;
        this.f = gVar3;
        this.f3643g = gVar4;
    }

    public static boolean m(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", (Class[]) null).invoke(obj, (Object[]) null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    public void a(SSLSocket sSLSocket) {
        switch (this.f3640c) {
            case 1:
                try {
                    ((Method) this.f).invoke((Object) null, new Object[]{sSLSocket});
                    return;
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw e1.c.a("unable to remove alpn", e2);
                }
            default:
                return;
        }
    }

    public l c(X509TrustManager x509TrustManager) {
        switch (this.f3640c) {
            case 0:
                try {
                    Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
                    Class<String> cls2 = String.class;
                    return new a(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls2, cls2}));
                } catch (Exception unused) {
                    return super.c(x509TrustManager);
                }
            default:
                return super.c(x509TrustManager);
        }
    }

    public d d(X509TrustManager x509TrustManager) {
        switch (this.f3640c) {
            case 0:
                try {
                    Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
                    declaredMethod.setAccessible(true);
                    return new b(x509TrustManager, declaredMethod);
                } catch (NoSuchMethodException unused) {
                    return super.d(x509TrustManager);
                }
            default:
                return super.d(x509TrustManager);
        }
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [java.lang.Object, o1.e] */
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object obj = this.f3641d;
        Object obj2 = this.f3643g;
        switch (this.f3640c) {
            case 0:
                if (str != null) {
                    ((g) obj).A(sSLSocket, Boolean.TRUE);
                    ((g) this.f3642e).A(sSLSocket, str);
                }
                g gVar = (g) obj2;
                if (gVar != null && gVar.u(sSLSocket.getClass()) != null) {
                    ? obj3 = new Object();
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        A a2 = (A) list.get(i2);
                        if (a2 != A.f2221g) {
                            obj3.B(a2.f.length());
                            String str2 = a2.f;
                            obj3.E(str2, 0, str2.length());
                        }
                    }
                    try {
                        try {
                            gVar.z(sSLSocket, obj3.q(obj3.f3745g));
                            return;
                        } catch (InvocationTargetException e2) {
                            Throwable targetException = e2.getTargetException();
                            if (targetException instanceof RuntimeException) {
                                throw ((RuntimeException) targetException);
                            }
                            AssertionError assertionError = new AssertionError("Unexpected exception");
                            assertionError.initCause(targetException);
                            throw assertionError;
                        }
                    } catch (EOFException e3) {
                        throw new AssertionError(e3);
                    }
                } else {
                    return;
                }
            default:
                ArrayList b = g.b(list);
                try {
                    ((Method) obj).invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{(Class) obj2, (Class) this.f3644h}, new f(b))});
                    return;
                } catch (IllegalAccessException | InvocationTargetException e4) {
                    throw e1.c.a("unable to set alpn", e4);
                }
        }
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        switch (this.f3640c) {
            case 0:
                try {
                    socket.connect(inetSocketAddress, i2);
                    return;
                } catch (AssertionError e2) {
                    if (e1.c.o(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                } catch (SecurityException e3) {
                    IOException iOException = new IOException("Exception in connect");
                    iOException.initCause(e3);
                    throw iOException;
                } catch (ClassCastException e4) {
                    if (Build.VERSION.SDK_INT == 26) {
                        IOException iOException2 = new IOException("Exception in connect");
                        iOException2.initCause(e4);
                        throw iOException2;
                    }
                    throw e4;
                }
            default:
                super.f(socket, inetSocketAddress, i2);
                return;
        }
    }

    public final String h(SSLSocket sSLSocket) {
        switch (this.f3640c) {
            case 0:
                g gVar = (g) this.f;
                if (gVar == null || gVar.u(sSLSocket.getClass()) == null) {
                    return null;
                }
                try {
                    byte[] bArr = (byte[]) gVar.z(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, e1.c.f2615d);
                    }
                    return null;
                } catch (InvocationTargetException e2) {
                    Throwable targetException = e2.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    AssertionError assertionError = new AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            default:
                try {
                    f fVar = (f) Proxy.getInvocationHandler(((Method) this.f3642e).invoke((Object) null, new Object[]{sSLSocket}));
                    boolean z2 = fVar.b;
                    if (!z2 && fVar.f3648c == null) {
                        g.f3649a.k(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                        return null;
                    } else if (z2) {
                        return null;
                    } else {
                        return fVar.f3648c;
                    }
                } catch (InvocationTargetException e3) {
                    e = e3;
                    throw e1.c.a("unable to get selected protocol", e);
                } catch (IllegalAccessException e4) {
                    e = e4;
                    throw e1.c.a("unable to get selected protocol", e);
                }
        }
    }

    public Object i() {
        switch (this.f3640c) {
            case 0:
                g1 g1Var = (g1) this.f3644h;
                Method method = g1Var.f3461a;
                if (method == null) {
                    return null;
                }
                try {
                    Object invoke = method.invoke((Object) null, (Object[]) null);
                    g1Var.b.invoke(invoke, new Object[]{"response.body().close()"});
                    return invoke;
                } catch (Exception unused) {
                    return null;
                }
            default:
                return super.i();
        }
    }

    public boolean j(String str) {
        switch (this.f3640c) {
            case 0:
                try {
                    Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                    return m(str, cls, cls.getMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null));
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    return true;
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    throw e1.c.a("unable to determine cleartext support", e2);
                }
            default:
                return super.j(str);
        }
    }

    public void k(int i2, String str, Throwable th) {
        switch (this.f3640c) {
            case 0:
                int i3 = 5;
                if (i2 != 5) {
                    i3 = 3;
                }
                if (th != null) {
                    str = str + 10 + Log.getStackTraceString(th);
                }
                int length = str.length();
                int i4 = 0;
                while (i4 < length) {
                    int indexOf = str.indexOf(10, i4);
                    if (indexOf == -1) {
                        indexOf = length;
                    }
                    while (true) {
                        int min = Math.min(indexOf, i4 + 4000);
                        Log.println(i3, "OkHttp", str.substring(i4, min));
                        if (min >= indexOf) {
                            i4 = min + 1;
                        } else {
                            i4 = min;
                        }
                    }
                }
                return;
            default:
                super.k(i2, str, th);
                return;
        }
    }

    public void l(String str, Object obj) {
        switch (this.f3640c) {
            case 0:
                g1 g1Var = (g1) this.f3644h;
                g1Var.getClass();
                if (obj != null) {
                    try {
                        g1Var.f3462c.invoke(obj, (Object[]) null);
                        return;
                    } catch (Exception unused) {
                    }
                }
                k(5, str, (Throwable) null);
                return;
            default:
                super.l(str, obj);
                return;
        }
    }

    public c(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f3641d = method;
        this.f3642e = method2;
        this.f = method3;
        this.f3643g = cls;
        this.f3644h = cls2;
    }
}
