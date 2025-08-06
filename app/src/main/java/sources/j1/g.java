package j1;

import java.io.IOException;
import o1.e;
import o1.j;
import o1.v;

public final class g extends j {

    /* renamed from: g  reason: collision with root package name */
    public boolean f3230g = false;

    /* renamed from: h  reason: collision with root package name */
    public long f3231h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ h f3232i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, v vVar) {
        super(vVar);
        this.f3232i = hVar;
    }

    public final void close() {
        super.close();
        if (!this.f3230g) {
            this.f3230g = true;
            h hVar = this.f3232i;
            hVar.b.h(false, hVar, (IOException) null);
        }
    }

    public final long f(e eVar, long j2) {
        try {
            long f = this.f.f(eVar, 8192);
            if (f <= 0) {
                return f;
            }
            this.f3231h += f;
            return f;
        } catch (IOException e2) {
            if (!this.f3230g) {
                this.f3230g = true;
                h hVar = this.f3232i;
                hVar.b.h(false, hVar, e2);
            }
            throw e2;
        }
    }
}
