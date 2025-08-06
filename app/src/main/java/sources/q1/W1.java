package q1;

import T0.l;
import T0.r;
import U0.h;
import U0.k;

public final class W1 extends T0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4027a;
    public final h b;

    /* renamed from: c  reason: collision with root package name */
    public final k f4028c;

    public W1(int i2) {
        this.f4027a = i2;
        switch (i2) {
            case 1:
                this.b = C0430t2.f4189n;
                this.f4028c = C0407p2.f4164m;
                return;
            case 2:
                this.b = Y2.f4041n;
                this.f4028c = R2.f3980m;
                return;
            case 3:
                this.b = C0425s3.f4185n;
                this.f4028c = C0396n3.f4147m;
                return;
            default:
                this.b = Q1.f3961n;
                this.f4028c = K1.f3928m;
                return;
        }
    }

    public final l d() {
        switch (this.f4027a) {
            case 0:
                return (K1) this.f4028c;
            case 1:
                return (C0407p2) this.f4028c;
            case 2:
                return (R2) this.f4028c;
            default:
                return (C0396n3) this.f4028c;
        }
    }

    public final r e() {
        switch (this.f4027a) {
            case 0:
                return (Q1) this.b;
            case 1:
                return (C0430t2) this.b;
            case 2:
                return (Y2) this.b;
            default:
                return (C0425s3) this.b;
        }
    }
}
