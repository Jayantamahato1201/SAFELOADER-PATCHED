package j1;

import e1.a;
import java.io.IOException;
import o1.e;

public final class l extends a {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f3246g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e f3247h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f3248i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s f3249j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(s sVar, Object[] objArr, int i2, e eVar, int i3, boolean z2) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f3249j = sVar;
        this.f3246g = i2;
        this.f3247h = eVar;
        this.f3248i = i3;
    }

    public final void a() {
        try {
            C c2 = this.f3249j.f3272o;
            e eVar = this.f3247h;
            int i2 = this.f3248i;
            c2.getClass();
            eVar.y((long) i2);
            this.f3249j.f3280w.q(this.f3246g, 6);
            synchronized (this.f3249j) {
                this.f3249j.f3282y.remove(Integer.valueOf(this.f3246g));
            }
        } catch (IOException unused) {
        }
    }
}
