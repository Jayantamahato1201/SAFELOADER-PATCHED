package B0;

import A.i;
import android.graphics.Typeface;
import k.C0241f0;
import y0.C0500b;

public final class a extends i {

    /* renamed from: o  reason: collision with root package name */
    public final Typeface f51o;

    /* renamed from: p  reason: collision with root package name */
    public final C0241f0 f52p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f53q;

    public a(C0241f0 f0Var, Typeface typeface) {
        this.f51o = typeface;
        this.f52p = f0Var;
    }

    public final void d0(int i2) {
        if (!this.f53q) {
            C0500b bVar = (C0500b) this.f52p.f3459a;
            if (bVar.j(this.f51o)) {
                bVar.h(false);
            }
        }
    }

    public final void e0(Typeface typeface, boolean z2) {
        if (!this.f53q) {
            C0500b bVar = (C0500b) this.f52p.f3459a;
            if (bVar.j(typeface)) {
                bVar.h(false);
            }
        }
    }
}
