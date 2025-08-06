package d1;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class J {

    /* renamed from: a  reason: collision with root package name */
    public final C0108a f2264a;
    public final Proxy b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f2265c;

    public J(C0108a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (inetSocketAddress != null) {
            this.f2264a = aVar;
            this.b = proxy;
            this.f2265c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof J)) {
            return false;
        }
        J j2 = (J) obj;
        if (!j2.f2264a.equals(this.f2264a) || !j2.b.equals(this.b) || !j2.f2265c.equals(this.f2265c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.f2265c.hashCode() + ((hashCode + ((this.f2264a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2265c + "}";
    }
}
