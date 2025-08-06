package o1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class p implements f, AutoCloseable {
    public final e f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final u f3759g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3760h;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, o1.e] */
    public p(u uVar) {
        if (uVar != null) {
            this.f3759g = uVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public final x a() {
        return this.f3759g.a();
    }

    public final f b(byte[] bArr) {
        if (!this.f3760h) {
            e eVar = this.f;
            if (bArr != null) {
                eVar.A(bArr, bArr.length);
                k();
                return this;
            }
            throw new IllegalArgumentException("source == null");
        }
        throw new IllegalStateException("closed");
    }

    public final long c(v vVar) {
        long j2 = 0;
        while (true) {
            long f2 = ((b) vVar).f(this.f, 8192);
            if (f2 == -1) {
                return j2;
            }
            j2 += f2;
            k();
        }
    }

    public final void close() {
        u uVar = this.f3759g;
        if (!this.f3760h) {
            try {
                e eVar = this.f;
                long j2 = eVar.f3745g;
                if (j2 > 0) {
                    uVar.g(eVar, j2);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                uVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f3760h = true;
            if (th != null) {
                Charset charset = y.f3775a;
                throw th;
            }
        }
    }

    public final f d(h hVar) {
        if (!this.f3760h) {
            e eVar = this.f;
            if (hVar != null) {
                hVar.p(eVar);
                k();
                return this;
            }
            throw new IllegalArgumentException("byteString == null");
        }
        throw new IllegalStateException("closed");
    }

    public final f e(byte[] bArr, int i2) {
        if (!this.f3760h) {
            this.f.A(bArr, i2);
            k();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.f3760h) {
            e eVar = this.f;
            long j2 = eVar.f3745g;
            u uVar = this.f3759g;
            if (j2 > 0) {
                uVar.g(eVar, j2);
            }
            uVar.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void g(e eVar, long j2) {
        if (!this.f3760h) {
            this.f.g(eVar, j2);
            k();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final f h(String str) {
        if (!this.f3760h) {
            this.f.E(str, 0, str.length());
            k();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f i(long j2) {
        if (!this.f3760h) {
            this.f.C(j2);
            k();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f3760h;
    }

    public final f j(int i2) {
        if (!this.f3760h) {
            this.f.B(i2);
            k();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f k() {
        if (!this.f3760h) {
            e eVar = this.f;
            long j2 = eVar.f3745g;
            if (j2 == 0) {
                j2 = 0;
            } else {
                r rVar = eVar.f.f3767g;
                int i2 = rVar.f3764c;
                if (i2 < 8192 && rVar.f3766e) {
                    j2 -= (long) (i2 - rVar.b);
                }
            }
            if (j2 > 0) {
                this.f3759g.g(eVar, j2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f l(int i2) {
        if (!this.f3760h) {
            e eVar = this.f;
            r z2 = eVar.z(4);
            int i3 = z2.f3764c;
            byte[] bArr = z2.f3763a;
            bArr[i3] = (byte) ((i2 >>> 24) & 255);
            bArr[i3 + 1] = (byte) ((i2 >>> 16) & 255);
            bArr[i3 + 2] = (byte) ((i2 >>> 8) & 255);
            bArr[i3 + 3] = (byte) (i2 & 255);
            z2.f3764c = i3 + 4;
            eVar.f3745g += 4;
            k();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        return "buffer(" + this.f3759g + ")";
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.f3760h) {
            int write = this.f.write(byteBuffer);
            k();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
