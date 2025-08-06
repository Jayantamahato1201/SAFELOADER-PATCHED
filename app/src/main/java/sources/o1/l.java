package o1;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class l implements v, AutoCloseable {
    public int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final q f3751g;

    /* renamed from: h  reason: collision with root package name */
    public final Inflater f3752h;

    /* renamed from: i  reason: collision with root package name */
    public final m f3753i;

    /* renamed from: j  reason: collision with root package name */
    public final CRC32 f3754j = new CRC32();

    public l(v vVar) {
        if (vVar != null) {
            Inflater inflater = new Inflater(true);
            this.f3752h = inflater;
            Logger logger = o.f3758a;
            q qVar = new q(vVar);
            this.f3751g = qVar;
            this.f3753i = new m(qVar, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public static void k(String str, int i2, int i3) {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}));
        }
    }

    public final x a() {
        return this.f3751g.f3761g.a();
    }

    public final void close() {
        this.f3753i.close();
    }

    public final long f(e eVar, long j2) {
        short s2;
        long j3;
        boolean z2;
        long j4;
        l lVar = this;
        e eVar2 = eVar;
        int i2 = lVar.f;
        CRC32 crc32 = lVar.f3754j;
        q qVar = lVar.f3751g;
        if (i2 == 0) {
            qVar.u(10);
            e eVar3 = qVar.f;
            byte n2 = eVar3.n(3);
            if (((n2 >> 1) & 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                lVar.l(eVar3, 0, 10);
            }
            k("ID1ID2", 8075, qVar.r());
            qVar.v(8);
            if (((n2 >> 2) & 1) == 1) {
                qVar.u(2);
                if (z2) {
                    j4 = 2;
                    s2 = 65280;
                    j3 = -1;
                    l(eVar3, 0, 2);
                } else {
                    j4 = 2;
                    s2 = 65280;
                    j3 = -1;
                }
                short u2 = eVar3.u();
                Charset charset = y.f3775a;
                long j5 = (long) ((short) (((u2 & 255) << 8) | ((u2 & s2) >>> 8)));
                qVar.u(j5);
                if (z2) {
                    l(eVar3, 0, j5);
                }
                qVar.v(j5);
            } else {
                j4 = 2;
                s2 = 65280;
                j3 = -1;
            }
            if (((n2 >> 3) & 1) == 1) {
                long l2 = qVar.l((byte) 0, 0, Long.MAX_VALUE);
                if (l2 != j3) {
                    if (z2) {
                        l(eVar3, 0, l2 + 1);
                    }
                    qVar.v(l2 + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (((n2 >> 4) & 1) == 1) {
                long l3 = qVar.l((byte) 0, 0, Long.MAX_VALUE);
                if (l3 != j3) {
                    if (z2) {
                        lVar = this;
                        lVar.l(eVar3, 0, l3 + 1);
                    } else {
                        lVar = this;
                    }
                    qVar.v(l3 + 1);
                } else {
                    throw new EOFException();
                }
            } else {
                lVar = this;
            }
            if (z2) {
                qVar.u(j4);
                short u3 = eVar3.u();
                Charset charset2 = y.f3775a;
                k("FHCRC", (short) (((u3 & 255) << 8) | ((u3 & s2) >>> 8)), (short) ((int) crc32.getValue()));
                crc32.reset();
            }
            lVar.f = 1;
        } else {
            s2 = 65280;
            j3 = -1;
        }
        if (lVar.f == 1) {
            long j6 = eVar2.f3745g;
            long f2 = lVar.f3753i.f(eVar2, 8192);
            if (f2 != j3) {
                lVar.l(eVar2, j6, f2);
                return f2;
            }
            lVar.f = 2;
        }
        if (lVar.f == 2) {
            qVar.u(4);
            e eVar4 = qVar.f;
            int t2 = eVar4.t();
            Charset charset3 = y.f3775a;
            k("CRC", ((t2 & 255) << 24) | ((t2 & -16777216) >>> 24) | ((t2 & 16711680) >>> 8) | ((t2 & s2) << 8), (int) crc32.getValue());
            qVar.u(4);
            int t3 = eVar4.t();
            k("ISIZE", ((t3 & 255) << 24) | ((t3 & -16777216) >>> 24) | ((t3 & 16711680) >>> 8) | ((t3 & s2) << 8), (int) lVar.f3752h.getBytesWritten());
            lVar.f = 3;
            if (!qVar.k()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return j3;
    }

    public final void l(e eVar, long j2, long j3) {
        r rVar = eVar.f;
        while (true) {
            int i2 = rVar.f3764c;
            int i3 = rVar.b;
            if (j2 < ((long) (i2 - i3))) {
                break;
            }
            j2 -= (long) (i2 - i3);
            rVar = rVar.f;
        }
        while (j3 > 0) {
            int i4 = (int) (((long) rVar.b) + j2);
            int min = (int) Math.min((long) (rVar.f3764c - i4), j3);
            this.f3754j.update(rVar.f3763a, i4, min);
            j3 -= (long) min;
            rVar = rVar.f;
            j2 = 0;
        }
    }
}
