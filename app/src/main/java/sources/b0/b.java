package B0;

import A.i;
import android.graphics.Typeface;
import z.C0503b;

public final class b extends C0503b {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f54h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ d f55i;

    public b(d dVar, i iVar) {
        this.f55i = dVar;
        this.f54h = iVar;
    }

    public final void h(int i2) {
        this.f55i.f70m = true;
        this.f54h.d0(i2);
    }

    public final void i(Typeface typeface) {
        d dVar = this.f55i;
        dVar.f71n = Typeface.create(typeface, dVar.f61c);
        dVar.f70m = true;
        this.f54h.e0(dVar.f71n, false);
    }
}
