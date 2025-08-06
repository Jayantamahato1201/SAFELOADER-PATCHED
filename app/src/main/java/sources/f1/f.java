package f1;

import e1.c;
import java.io.Closeable;
import o1.v;

public final class f implements Closeable, AutoCloseable {
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final long f2710g;

    /* renamed from: h  reason: collision with root package name */
    public final v[] f2711h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g f2712i;

    public f(g gVar, String str, long j2, v[] vVarArr) {
        this.f2712i = gVar;
        this.f = str;
        this.f2710g = j2;
        this.f2711h = vVarArr;
    }

    public final void close() {
        for (v d2 : this.f2711h) {
            c.d(d2);
        }
    }
}
