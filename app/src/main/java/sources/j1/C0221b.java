package j1;

import e1.c;
import java.util.Locale;
import o1.h;

/* renamed from: j1.b  reason: case insensitive filesystem */
public final class C0221b {

    /* renamed from: d  reason: collision with root package name */
    public static final h f3207d = h.f(":");

    /* renamed from: e  reason: collision with root package name */
    public static final h f3208e = h.f(":status");
    public static final h f = h.f(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final h f3209g = h.f(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final h f3210h = h.f(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final h f3211i = h.f(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final h f3212a;
    public final h b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3213c;

    public C0221b(String str, String str2) {
        this(h.f(str), h.f(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0221b) {
            C0221b bVar = (C0221b) obj;
            if (!this.f3212a.equals(bVar.f3212a) || !this.b.equals(bVar.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f3212a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String o2 = this.f3212a.o();
        String o3 = this.b.o();
        byte[] bArr = c.f2613a;
        Locale locale = Locale.US;
        return o2 + ": " + o3;
    }

    public C0221b(h hVar, String str) {
        this(hVar, h.f(str));
    }

    public C0221b(h hVar, h hVar2) {
        this.f3212a = hVar;
        this.b = hVar2;
        this.f3213c = hVar2.l() + hVar.l() + 32;
    }
}
