package j1;

import e1.a;
import java.io.IOException;

public final class j extends a {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f3240g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f3241h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ s f3242i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(s sVar, Object[] objArr, int i2, long j2) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f3242i = sVar;
        this.f3240g = i2;
        this.f3241h = j2;
    }

    public final void a() {
        s sVar = this.f3242i;
        try {
            sVar.f3280w.t(this.f3240g, this.f3241h);
        } catch (IOException unused) {
            sVar.l();
        }
    }
}
