package b0;

/* renamed from: b0.b  reason: case insensitive filesystem */
public final class C0078b {

    /* renamed from: a  reason: collision with root package name */
    public long f1650a = 0;
    public C0078b b;

    public final void a(int i2) {
        if (i2 >= 64) {
            C0078b bVar = this.b;
            if (bVar != null) {
                bVar.a(i2 - 64);
                return;
            }
            return;
        }
        this.f1650a &= ~(1 << i2);
    }

    public final int b(int i2) {
        C0078b bVar = this.b;
        if (bVar == null) {
            if (i2 >= 64) {
                return Long.bitCount(this.f1650a);
            }
            return Long.bitCount(this.f1650a & ((1 << i2) - 1));
        } else if (i2 < 64) {
            return Long.bitCount(this.f1650a & ((1 << i2) - 1));
        } else {
            return Long.bitCount(this.f1650a) + bVar.b(i2 - 64);
        }
    }

    public final void c() {
        if (this.b == null) {
            this.b = new C0078b();
        }
    }

    public final boolean d(int i2) {
        if (i2 >= 64) {
            c();
            return this.b.d(i2 - 64);
        } else if ((this.f1650a & (1 << i2)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void e(int i2, boolean z2) {
        boolean z3;
        if (i2 >= 64) {
            c();
            this.b.e(i2 - 64, z2);
            return;
        }
        long j2 = this.f1650a;
        if ((Long.MIN_VALUE & j2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j3 = (1 << i2) - 1;
        this.f1650a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            h(i2);
        } else {
            a(i2);
        }
        if (z3 || this.b != null) {
            c();
            this.b.e(0, z3);
        }
    }

    public final boolean f(int i2) {
        boolean z2;
        if (i2 >= 64) {
            c();
            return this.b.f(i2 - 64);
        }
        long j2 = 1 << i2;
        long j3 = this.f1650a;
        if ((j3 & j2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j4 = j3 & (~j2);
        this.f1650a = j4;
        long j5 = j2 - 1;
        this.f1650a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0078b bVar = this.b;
        if (bVar != null) {
            if (bVar.d(0)) {
                h(63);
            }
            this.b.f(0);
        }
        return z2;
    }

    public final void g() {
        this.f1650a = 0;
        C0078b bVar = this.b;
        if (bVar != null) {
            bVar.g();
        }
    }

    public final void h(int i2) {
        if (i2 >= 64) {
            c();
            this.b.h(i2 - 64);
            return;
        }
        this.f1650a |= 1 << i2;
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.f1650a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.f1650a);
    }
}
