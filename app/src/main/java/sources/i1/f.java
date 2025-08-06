package i1;

import java.io.IOException;
import o1.e;

public final class f extends a {

    /* renamed from: j  reason: collision with root package name */
    public boolean f3024j;

    public final void close() {
        if (!this.f3011g) {
            if (!this.f3024j) {
                k(false, (IOException) null);
            }
            this.f3011g = true;
        }
    }

    public final long f(e eVar, long j2) {
        if (this.f3011g) {
            throw new IllegalStateException("closed");
        } else if (this.f3024j) {
            return -1;
        } else {
            long f = super.f(eVar, 8192);
            if (f != -1) {
                return f;
            }
            this.f3024j = true;
            k(true, (IOException) null);
            return -1;
        }
    }
}
