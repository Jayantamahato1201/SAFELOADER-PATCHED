package K0;

import A.j;
import F.g;
import H0.r;
import android.net.NetworkInfo;
import b0.C0095t;
import d1.B;
import d1.C;
import d1.C0109b;
import d1.C0116i;
import d1.G;
import d1.I;
import d1.z;
import java.io.IOException;
import o1.v;

public final class t extends C {

    /* renamed from: a  reason: collision with root package name */
    public final j f571a;
    public final D b;

    public t(j jVar, D d2) {
        this.f571a = jVar;
        this.b = d2;
    }

    public final boolean a(A a2) {
        String scheme = a2.f493a.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return true;
        }
        return false;
    }

    public final int b() {
        return 2;
    }

    public final r c(A a2, int i2) {
        C0116i iVar;
        int i3;
        boolean z2 = true;
        if (i2 == 0) {
            iVar = null;
        } else if ((i2 & 4) != 0) {
            iVar = C0116i.f2304n;
        } else {
            C0095t tVar = new C0095t();
            if ((i2 & 1) != 0) {
                tVar.f1770a = true;
            }
            if ((i2 & 2) != 0) {
                tVar.b = true;
            }
            iVar = new C0116i(tVar);
        }
        g gVar = new g();
        gVar.o(a2.f493a.toString());
        if (iVar != null) {
            String iVar2 = iVar.toString();
            if (iVar2.isEmpty()) {
                ((j) gVar.f199d).C("Cache-Control");
            } else {
                gVar.h("Cache-Control", iVar2);
            }
        }
        C a3 = gVar.a();
        z zVar = (z) this.f571a.b;
        zVar.getClass();
        B b2 = new B(zVar, a3);
        zVar.f2412k.getClass();
        b2.f2228h = C0109b.f2282d;
        G a4 = b2.a();
        int i4 = a4.f2251h;
        if (i4 < 200 || i4 >= 300) {
            z2 = false;
        }
        I i5 = a4.f2255l;
        if (z2) {
            if (a4.f2257n == null) {
                i3 = 3;
            } else {
                i3 = 2;
            }
            if (i3 == 2 && i5.k() == 0) {
                i5.close();
                throw new IOException("Received response with 0 content-length header.");
            }
            if (i3 == 3 && i5.k() > 0) {
                long k2 = i5.k();
                D d2 = this.b;
                Long valueOf = Long.valueOf(k2);
                j jVar = d2.b;
                jVar.sendMessage(jVar.obtainMessage(4, valueOf));
            }
            return new r((v) i5.l(), i3);
        }
        i5.close();
        throw new IOException(A.g.f(i4, "HTTP "));
    }

    public final boolean d(NetworkInfo networkInfo) {
        if (networkInfo == null || networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
