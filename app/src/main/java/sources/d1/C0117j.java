package d1;

import A.g;
import Q0.l;
import e1.c;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import o1.h;

/* renamed from: d1.j  reason: case insensitive filesystem */
public final class C0117j {

    /* renamed from: c  reason: collision with root package name */
    public static final C0117j f2316c = new C0117j(new LinkedHashSet(new ArrayList()), (l) null);

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f2317a;
    public final l b;

    public C0117j(LinkedHashSet linkedHashSet, l lVar) {
        this.f2317a = linkedHashSet;
        this.b = lVar;
    }

    public static String b(X509Certificate x509Certificate) {
        if (g.k(x509Certificate)) {
            return "sha256/" + h.i(x509Certificate.getPublicKey().getEncoded()).e("SHA-256").a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public final void a(String str, List list) {
        List list2 = Collections.EMPTY_LIST;
        Iterator it = this.f2317a.iterator();
        if (it.hasNext()) {
            throw g.e(it);
        } else if (!list2.isEmpty()) {
            l lVar = this.b;
            if (lVar != null) {
                list = lVar.m(str, list);
            }
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i3);
                if (list2.size() <= 0) {
                    i3++;
                } else {
                    list2.get(0).getClass();
                    throw new ClassCastException();
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i4);
                sb.append("\n    ");
                sb.append(b(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = list2.size();
            while (i2 < size3) {
                if (list2.get(i2) == null) {
                    sb.append("\n    null");
                    i2++;
                } else {
                    throw new ClassCastException();
                }
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0117j)) {
            return false;
        }
        C0117j jVar = (C0117j) obj;
        if (!c.j(this.b, jVar.b) || !this.f2317a.equals(jVar.f2317a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        l lVar = this.b;
        if (lVar != null) {
            i2 = lVar.hashCode();
        } else {
            i2 = 0;
        }
        return this.f2317a.hashCode() + (i2 * 31);
    }
}
