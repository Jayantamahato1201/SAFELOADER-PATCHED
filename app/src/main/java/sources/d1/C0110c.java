package d1;

import f1.d;
import o1.i;
import o1.u;

/* renamed from: d1.c  reason: case insensitive filesystem */
public final class C0110c extends i {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f2284g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0111d f2285h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0110c(C0111d dVar, u uVar, d dVar2) {
        super(uVar);
        this.f2285h = dVar;
        this.f2284g = dVar2;
    }

    public final void close() {
        synchronized (this.f2285h.f2289e) {
            try {
                C0111d dVar = this.f2285h;
                if (!dVar.f2288d) {
                    dVar.f2288d = true;
                    dVar.f2289e.getClass();
                    super.close();
                    this.f2284g.b();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
