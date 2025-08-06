package g1;

import A.j;
import F.l;
import d1.B;
import d1.C0108a;
import d1.C0109b;
import d1.J;
import d1.t;
import e1.c;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final C0108a f2881a;
    public final j b;

    /* renamed from: c  reason: collision with root package name */
    public final C0109b f2882c;

    /* renamed from: d  reason: collision with root package name */
    public final List f2883d;

    /* renamed from: e  reason: collision with root package name */
    public int f2884e;
    public List f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f2885g = new ArrayList();

    public d(C0108a aVar, j jVar, B b2, C0109b bVar) {
        List list;
        List list2 = Collections.EMPTY_LIST;
        this.f2883d = list2;
        this.f = list2;
        this.f2881a = aVar;
        this.b = jVar;
        this.f2882c = bVar;
        List<Proxy> select = aVar.f2276g.select(aVar.f2272a.l());
        if (select == null || select.isEmpty()) {
            list = c.m(Proxy.NO_PROXY);
        } else {
            list = c.l(select);
        }
        this.f2883d = list;
        this.f2884e = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f2881a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(d1.J r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.net.Proxy r0 = r4.b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L_0x001f
            d1.a r0 = r3.f2881a
            java.net.ProxySelector r1 = r0.f2276g
            if (r1 == 0) goto L_0x001f
            d1.t r0 = r0.f2272a
            java.net.URI r0 = r0.l()
            java.net.Proxy r2 = r4.b
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L_0x001f:
            A.j r5 = r3.b
            monitor-enter(r5)
            java.lang.Object r0 = r5.b     // Catch:{ all -> 0x002b }
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0     // Catch:{ all -> 0x002b }
            r0.add(r4)     // Catch:{ all -> 0x002b }
            monitor-exit(r5)
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.d.a(d1.J, java.io.IOException):void");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [F.l, java.lang.Object] */
    public final l b() {
        boolean z2;
        String str;
        int i2;
        boolean contains;
        if (this.f2884e >= this.f2883d.size() && this.f2885g.isEmpty()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f2884e < this.f2883d.size()) {
            if (this.f2884e < this.f2883d.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C0108a aVar = this.f2881a;
            if (z2) {
                List list = this.f2883d;
                int i3 = this.f2884e;
                this.f2884e = i3 + 1;
                Proxy proxy = (Proxy) list.get(i3);
                this.f = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    t tVar = aVar.f2272a;
                    str = tVar.f2368d;
                    i2 = tVar.f2369e;
                } else {
                    SocketAddress address = proxy.address();
                    if (address instanceof InetSocketAddress) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        InetAddress address2 = inetSocketAddress.getAddress();
                        if (address2 == null) {
                            str = inetSocketAddress.getHostName();
                        } else {
                            str = address2.getHostAddress();
                        }
                        i2 = inetSocketAddress.getPort();
                    } else {
                        throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
                    }
                }
                if (i2 >= 1 && i2 <= 65535) {
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        this.f.add(InetSocketAddress.createUnresolved(str, i2));
                    } else {
                        this.f2882c.getClass();
                        aVar.b.getClass();
                        if (str != null) {
                            try {
                                List asList = Arrays.asList(InetAddress.getAllByName(str));
                                if (!asList.isEmpty()) {
                                    int size = asList.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        this.f.add(new InetSocketAddress((InetAddress) asList.get(i4), i2));
                                    }
                                } else {
                                    throw new UnknownHostException(aVar.b + " returned no addresses for " + str);
                                }
                            } catch (NullPointerException e2) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                unknownHostException.initCause(e2);
                                throw unknownHostException;
                            }
                        } else {
                            throw new UnknownHostException("hostname == null");
                        }
                    }
                    int size2 = this.f.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        J j2 = new J(this.f2881a, proxy, (InetSocketAddress) this.f.get(i5));
                        j jVar = this.b;
                        synchronized (jVar) {
                            contains = ((LinkedHashSet) jVar.b).contains(j2);
                        }
                        if (contains) {
                            this.f2885g.add(j2);
                        } else {
                            arrayList.add(j2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                } else {
                    throw new SocketException("No route to " + str + ":" + i2 + "; port is out of range");
                }
            } else {
                throw new SocketException("No route to " + aVar.f2272a.f2368d + "; exhausted proxy configurations: " + this.f2883d);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f2885g);
            this.f2885g.clear();
        }
        ? obj = new Object();
        obj.f210a = 0;
        obj.b = arrayList;
        return obj;
    }
}
