package q1;

import T0.l;
import T0.r;
import U0.h;
import U0.k;

/* renamed from: q1.j2  reason: case insensitive filesystem */
public final class C0371j2 extends Y0 {
    public final /* synthetic */ int b;

    /* renamed from: c  reason: collision with root package name */
    public final h f4124c;

    /* renamed from: d  reason: collision with root package name */
    public final k f4125d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0371j2(int i2) {
        super(0);
        this.b = i2;
        switch (i2) {
            case 1:
                super(0);
                this.f4124c = E2.f3873n;
                this.f4125d = C0466z2.f4257m;
                return;
            default:
                this.f4124c = C0353g2.f4100n;
                this.f4125d = C0323b2.f4063m;
                return;
        }
    }

    public final l d() {
        switch (this.b) {
            case 0:
                return (C0323b2) this.f4125d;
            default:
                return (C0466z2) this.f4125d;
        }
    }

    public final r f() {
        switch (this.b) {
            case 0:
                return (C0353g2) this.f4124c;
            default:
                return (E2) this.f4124c;
        }
    }
}
