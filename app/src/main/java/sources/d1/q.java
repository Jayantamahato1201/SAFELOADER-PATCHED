package d1;

import e1.c;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final K f2355a;
    public final l b;

    /* renamed from: c  reason: collision with root package name */
    public final List f2356c;

    /* renamed from: d  reason: collision with root package name */
    public final List f2357d;

    public q(K k2, l lVar, List list, List list2) {
        this.f2355a = k2;
        this.b = lVar;
        this.f2356c = list;
        this.f2357d = list2;
    }

    public static q a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            l a2 = l.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                K a3 = K.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = c.m(certificateArr);
                } else {
                    list = Collections.EMPTY_LIST;
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = c.m(localCertificates);
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
                return new q(a3, a2, list, list2);
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f2355a.equals(qVar.f2355a) || !this.b.equals(qVar.b) || !this.f2356c.equals(qVar.f2356c) || !this.f2357d.equals(qVar.f2357d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.f2356c.hashCode();
        return this.f2357d.hashCode() + ((hashCode2 + ((hashCode + ((this.f2355a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
