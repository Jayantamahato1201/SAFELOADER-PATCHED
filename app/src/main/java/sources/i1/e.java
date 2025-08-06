package i1;

import e1.c;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public final class e extends a {

    /* renamed from: j  reason: collision with root package name */
    public long f3023j;

    public final void close() {
        boolean z2;
        if (!this.f3011g) {
            if (this.f3023j != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                try {
                    z2 = c.q(this, 100);
                } catch (IOException unused) {
                    z2 = false;
                }
                if (!z2) {
                    k(false, (IOException) null);
                }
            }
            this.f3011g = true;
        }
    }

    public final long f(o1.e eVar, long j2) {
        if (!this.f3011g) {
            long j3 = this.f3023j;
            if (j3 == 0) {
                return -1;
            }
            long f = super.f(eVar, Math.min(j3, 8192));
            if (f != -1) {
                long j4 = this.f3023j - f;
                this.f3023j = j4;
                if (j4 == 0) {
                    k(true, (IOException) null);
                }
                return f;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            k(false, protocolException);
            throw protocolException;
        }
        throw new IllegalStateException("closed");
    }
}
