package d1;

import e1.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLSocket;

public final class o {

    /* renamed from: e  reason: collision with root package name */
    public static final o f2340e;
    public static final o f = new o(new n(false));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2341a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f2342c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f2343d;

    static {
        l[] lVarArr = {l.f2325k, l.f2327m, l.f2326l, l.f2328n, l.f2330p, l.f2329o, l.f2323i, l.f2324j, l.f2321g, l.f2322h, l.f2320e, l.f, l.f2319d};
        n nVar = new n(true);
        String[] strArr = new String[13];
        for (int i2 = 0; i2 < 13; i2++) {
            strArr[i2] = lVarArr[i2].f2331a;
        }
        nVar.a(strArr);
        K k2 = K.f2269j;
        nVar.b(K.f2266g, K.f2267h, K.f2268i, k2);
        if (nVar.f2337a) {
            nVar.b = true;
            o oVar = new o(nVar);
            f2340e = oVar;
            n nVar2 = new n(oVar);
            nVar2.b(k2);
            if (nVar2.f2337a) {
                nVar2.b = true;
                new o(nVar2);
                return;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public o(n nVar) {
        this.f2341a = nVar.f2337a;
        this.f2342c = (String[]) nVar.f2338c;
        this.f2343d = (String[]) nVar.f2339d;
        this.b = nVar.b;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f2341a) {
            return false;
        }
        String[] strArr = this.f2343d;
        if (strArr != null && !c.p(c.f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f2342c;
        if (strArr2 == null || c.p(l.b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        o oVar = (o) obj;
        boolean z2 = oVar.f2341a;
        boolean z3 = this.f2341a;
        if (z3 != z2) {
            return false;
        }
        if (!z3) {
            return true;
        }
        if (Arrays.equals(this.f2342c, oVar.f2342c) && Arrays.equals(this.f2343d, oVar.f2343d) && this.b == oVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2341a) {
            return ((((527 + Arrays.hashCode(this.f2342c)) * 31) + Arrays.hashCode(this.f2343d)) * 31) + (this.b ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.f2341a) {
            return "ConnectionSpec()";
        }
        String str2 = "[all enabled]";
        String[] strArr = this.f2342c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String a2 : strArr) {
                arrayList.add(l.a(a2));
            }
            str = Collections.unmodifiableList(arrayList).toString();
        } else {
            str = str2;
        }
        String[] strArr2 = this.f2343d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String a3 : strArr2) {
                arrayList2.add(K.a(a3));
            }
            str2 = Collections.unmodifiableList(arrayList2).toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.b + ")";
    }
}
