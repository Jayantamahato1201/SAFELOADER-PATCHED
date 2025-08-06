package g1;

import d1.C0109b;
import d1.C0118k;
import d1.l;
import d1.n;
import d1.o;
import e1.c;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List f2865a;
    public int b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2866c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2867d;

    public a(List list) {
        this.f2865a = list;
    }

    public final o a(SSLSocket sSLSocket) {
        o oVar;
        boolean z2;
        String[] strArr;
        String[] strArr2;
        int i2 = this.b;
        List list = this.f2865a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                oVar = null;
                break;
            }
            oVar = (o) list.get(i2);
            if (oVar.a(sSLSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (oVar != null) {
            int i3 = this.b;
            while (true) {
                if (i3 >= list.size()) {
                    z2 = false;
                    break;
                } else if (((o) list.get(i3)).a(sSLSocket)) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            this.f2866c = z2;
            C0109b bVar = C0109b.f2283e;
            boolean z3 = this.f2867d;
            bVar.getClass();
            String[] strArr3 = oVar.f2342c;
            if (strArr3 != null) {
                strArr = c.n(l.b, sSLSocket.getEnabledCipherSuites(), strArr3);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr4 = oVar.f2343d;
            if (strArr4 != null) {
                strArr2 = c.n(c.f, sSLSocket.getEnabledProtocols(), strArr4);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            C0118k kVar = l.b;
            byte[] bArr = c.f2613a;
            int length = supportedCipherSuites.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i4 = -1;
                    break;
                } else if (kVar.compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                } else {
                    i4++;
                }
            }
            if (z3 && i4 != -1) {
                String str = supportedCipherSuites[i4];
                int length2 = strArr.length;
                String[] strArr5 = new String[(1 + length2)];
                System.arraycopy(strArr, 0, strArr5, 0, strArr.length);
                strArr5[length2] = str;
                strArr = strArr5;
            }
            n nVar = new n(oVar);
            nVar.a(strArr);
            nVar.c(strArr2);
            o oVar2 = new o(nVar);
            String[] strArr6 = oVar2.f2343d;
            if (strArr6 != null) {
                sSLSocket.setEnabledProtocols(strArr6);
            }
            String[] strArr7 = oVar2.f2342c;
            if (strArr7 != null) {
                sSLSocket.setEnabledCipherSuites(strArr7);
            }
            return oVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f2867d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}
