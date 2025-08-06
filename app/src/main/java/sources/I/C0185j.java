package i;

import A.i;
import k.w1;

/* renamed from: i.j  reason: case insensitive filesystem */
public final class C0185j extends i {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f2970o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2971p;

    /* renamed from: q  reason: collision with root package name */
    public int f2972q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f2973r;

    public C0185j(C0186k kVar) {
        this.f2973r = kVar;
        this.f2971p = false;
        this.f2972q = 0;
    }

    public final void a() {
        switch (this.f2970o) {
            case 0:
                int i2 = this.f2972q + 1;
                this.f2972q = i2;
                C0186k kVar = (C0186k) this.f2973r;
                if (i2 == kVar.f2974a.size()) {
                    i iVar = kVar.f2976d;
                    if (iVar != null) {
                        iVar.a();
                    }
                    this.f2972q = 0;
                    this.f2971p = false;
                    kVar.f2977e = false;
                    return;
                }
                return;
            default:
                if (!this.f2971p) {
                    ((w1) this.f2973r).f3579a.setVisibility(this.f2972q);
                    return;
                }
                return;
        }
    }

    public void b() {
        switch (this.f2970o) {
            case 1:
                this.f2971p = true;
                return;
            default:
                return;
        }
    }

    public final void c() {
        switch (this.f2970o) {
            case 0:
                if (!this.f2971p) {
                    this.f2971p = true;
                    i iVar = ((C0186k) this.f2973r).f2976d;
                    if (iVar != null) {
                        iVar.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((w1) this.f2973r).f3579a.setVisibility(0);
                return;
        }
    }

    public C0185j(w1 w1Var, int i2) {
        this.f2973r = w1Var;
        this.f2972q = i2;
        this.f2971p = false;
    }
}
