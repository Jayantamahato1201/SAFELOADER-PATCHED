package n1;

import Q0.l;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class a extends l {

    /* renamed from: l  reason: collision with root package name */
    public final d f3710l;

    public a(d dVar) {
        this.f3710l = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a) || !((a) obj).f3710l.equals(this.f3710l)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3710l.hashCode();
    }

    public final List m(String str, List list) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z2 = false;
        for (int i2 = 0; i2 < 9; i2++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a2 = this.f3710l.a(x509Certificate);
            if (a2 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(a2)) {
                    arrayList.add(a2);
                }
                if (a2.getIssuerDN().equals(a2.getSubjectDN())) {
                    try {
                        a2.verify(a2.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z2 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
                if (!z2) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
