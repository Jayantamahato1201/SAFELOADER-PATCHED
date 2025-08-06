package f1;

import java.io.IOException;
import o1.a;
import o1.e;
import o1.i;

public final class c extends i {

    /* renamed from: g  reason: collision with root package name */
    public boolean f2698g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f2699h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f2700i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, a aVar, int i2) {
        super(aVar);
        this.f2699h = i2;
        this.f2700i = obj;
    }

    public final void close() {
        if (!this.f2698g) {
            try {
                super.close();
            } catch (IOException unused) {
                this.f2698g = true;
                k();
            }
        }
    }

    public final void flush() {
        if (!this.f2698g) {
            try {
                super.flush();
            } catch (IOException unused) {
                this.f2698g = true;
                k();
            }
        }
    }

    public final void g(e eVar, long j2) {
        if (this.f2698g) {
            eVar.y(j2);
            return;
        }
        try {
            super.g(eVar, j2);
        } catch (IOException unused) {
            this.f2698g = true;
            k();
        }
    }

    public final void k() {
        switch (this.f2699h) {
            case 0:
                ((g) this.f2700i).f2725r = true;
                return;
            default:
                synchronized (((d) this.f2700i).f2703d) {
                    ((d) this.f2700i).c();
                }
                return;
        }
    }
}
