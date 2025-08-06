package l1;

import e1.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import n1.d;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f3639a;
    public final Method b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.b = method;
        this.f3639a = x509TrustManager;
    }

    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.f3639a, new Object[]{x509Certificate});
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException e2) {
            throw c.a("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f3639a.equals(bVar.f3639a) || !this.b.equals(bVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.f3639a.hashCode();
    }
}
