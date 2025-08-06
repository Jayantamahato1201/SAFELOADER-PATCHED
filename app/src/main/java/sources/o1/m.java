package o1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class m implements v, AutoCloseable {
    public final q f;

    /* renamed from: g  reason: collision with root package name */
    public final Inflater f3755g;

    /* renamed from: h  reason: collision with root package name */
    public int f3756h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3757i;

    public m(q qVar, Inflater inflater) {
        this.f = qVar;
        this.f3755g = inflater;
    }

    public final x a() {
        return this.f.f3761g.a();
    }

    public final void close() {
        if (!this.f3757i) {
            this.f3755g.end();
            this.f3757i = true;
            this.f.close();
        }
    }

    public final long f(e eVar, long j2) {
        Inflater inflater;
        q qVar;
        r z2;
        if (!this.f3757i) {
            while (true) {
                inflater = this.f3755g;
                boolean needsInput = inflater.needsInput();
                qVar = this.f;
                boolean z3 = false;
                if (needsInput) {
                    int i2 = this.f3756h;
                    if (i2 != 0) {
                        int remaining = i2 - inflater.getRemaining();
                        this.f3756h -= remaining;
                        qVar.v((long) remaining);
                    }
                    if (inflater.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (qVar.k()) {
                        z3 = true;
                    } else {
                        r rVar = qVar.f.f;
                        int i3 = rVar.f3764c;
                        int i4 = rVar.b;
                        int i5 = i3 - i4;
                        this.f3756h = i5;
                        inflater.setInput(rVar.f3763a, i4, i5);
                    }
                }
                try {
                    z2 = eVar.z(1);
                    int inflate = inflater.inflate(z2.f3763a, z2.f3764c, (int) Math.min(8192, (long) (8192 - z2.f3764c)));
                    if (inflate > 0) {
                        z2.f3764c += inflate;
                        long j3 = (long) inflate;
                        eVar.f3745g += j3;
                        return j3;
                    } else if (inflater.finished()) {
                        break;
                    } else if (inflater.needsDictionary()) {
                        break;
                    } else if (z3) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            int i6 = this.f3756h;
            if (i6 != 0) {
                int remaining2 = i6 - inflater.getRemaining();
                this.f3756h -= remaining2;
                qVar.v((long) remaining2);
            }
            if (z2.b != z2.f3764c) {
                return -1;
            }
            eVar.f = z2.a();
            s.a(z2);
            return -1;
        }
        throw new IllegalStateException("closed");
    }
}
