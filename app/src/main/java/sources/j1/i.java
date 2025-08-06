package j1;

import e1.a;
import java.io.IOException;

public final class i extends a {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f3237g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f3238h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ s f3239i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(s sVar, Object[] objArr, int i2, int i3) {
        super("OkHttp %s stream %d", objArr);
        this.f3239i = sVar;
        this.f3237g = i2;
        this.f3238h = i3;
    }

    public final void a() {
        s sVar = this.f3239i;
        try {
            sVar.f3280w.q(this.f3237g, this.f3238h);
        } catch (IOException unused) {
            sVar.l();
        }
    }
}
