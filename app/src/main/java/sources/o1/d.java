package o1;

import java.io.IOException;
import java.io.InputStream;

public final class d extends InputStream implements AutoCloseable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ g f3743g;

    public /* synthetic */ d(g gVar, int i2) {
        this.f = i2;
        this.f3743g = gVar;
    }

    public final int available() {
        switch (this.f) {
            case 0:
                return (int) Math.min(((e) this.f3743g).f3745g, 2147483647L);
            default:
                q qVar = (q) this.f3743g;
                if (!qVar.f3762h) {
                    return (int) Math.min(qVar.f.f3745g, 2147483647L);
                }
                throw new IOException("closed");
        }
    }

    public final void close() {
        switch (this.f) {
            case 0:
                return;
            default:
                ((q) this.f3743g).close();
                return;
        }
    }

    public final int read() {
        switch (this.f) {
            case 0:
                e eVar = (e) this.f3743g;
                if (eVar.f3745g > 0) {
                    return eVar.p() & 255;
                }
                return -1;
            default:
                q qVar = (q) this.f3743g;
                if (!qVar.f3762h) {
                    e eVar2 = qVar.f;
                    if (eVar2.f3745g == 0 && qVar.f3761g.f(eVar2, 8192) == -1) {
                        return -1;
                    }
                    return eVar2.p() & 255;
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        switch (this.f) {
            case 0:
                return ((e) this.f3743g) + ".inputStream()";
            default:
                return ((q) this.f3743g) + ".inputStream()";
        }
    }

    public final int read(byte[] bArr, int i2, int i3) {
        switch (this.f) {
            case 0:
                return ((e) this.f3743g).o(bArr, i2, i3);
            default:
                q qVar = (q) this.f3743g;
                if (!qVar.f3762h) {
                    y.a((long) bArr.length, (long) i2, (long) i3);
                    e eVar = qVar.f;
                    if (eVar.f3745g == 0 && qVar.f3761g.f(eVar, 8192) == -1) {
                        return -1;
                    }
                    return eVar.o(bArr, i2, i3);
                }
                throw new IOException("closed");
        }
    }

    private final void k() {
    }
}
