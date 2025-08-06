package j1;

import e1.a;
import java.io.IOException;
import java.util.ArrayList;

public final class k extends a {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f3243g = 2;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f3244h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ s f3245i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(s sVar, Object[] objArr, int i2, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f3245i = sVar;
        this.f3244h = i2;
    }

    private final void b() {
        this.f3245i.f3272o.getClass();
        try {
            this.f3245i.f3280w.q(this.f3244h, 6);
            synchronized (this.f3245i) {
                this.f3245i.f3282y.remove(Integer.valueOf(this.f3244h));
            }
        } catch (IOException unused) {
        }
    }

    private final void c() {
        this.f3245i.f3272o.getClass();
        try {
            this.f3245i.f3280w.q(this.f3244h, 6);
            synchronized (this.f3245i) {
                this.f3245i.f3282y.remove(Integer.valueOf(this.f3244h));
            }
        } catch (IOException unused) {
        }
    }

    public final void a() {
        switch (this.f3243g) {
            case 0:
                b();
                return;
            case 1:
                c();
                return;
            default:
                this.f3245i.f3272o.getClass();
                synchronized (this.f3245i) {
                    this.f3245i.f3282y.remove(Integer.valueOf(this.f3244h));
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(s sVar, Object[] objArr, int i2, ArrayList arrayList, boolean z2) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f3245i = sVar;
        this.f3244h = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(s sVar, Object[] objArr, int i2, int i3) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f3245i = sVar;
        this.f3244h = i2;
    }
}
