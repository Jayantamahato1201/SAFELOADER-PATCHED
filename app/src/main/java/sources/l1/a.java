package l1;

import Q0.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class a extends l {

    /* renamed from: l  reason: collision with root package name */
    public final Object f3637l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f3638m;

    public a(Object obj, Method method) {
        this.f3637l = obj;
        this.f3638m = method;
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    public final int hashCode() {
        return 0;
    }

    public final List m(String str, List list) {
        try {
            return (List) this.f3638m.invoke(this.f3637l, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
