package d1;

import e1.c;
import f1.d;
import java.io.IOException;
import o1.u;

/* renamed from: d1.d  reason: case insensitive filesystem */
public final class C0111d {

    /* renamed from: a  reason: collision with root package name */
    public final d f2286a;
    public final u b;

    /* renamed from: c  reason: collision with root package name */
    public final C0110c f2287c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2288d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0115h f2289e;

    public C0111d(C0115h hVar, d dVar) {
        this.f2289e = hVar;
        this.f2286a = dVar;
        u d2 = dVar.d(1);
        this.b = d2;
        this.f2287c = new C0110c(this, d2, dVar);
    }

    public final void a() {
        synchronized (this.f2289e) {
            try {
                if (!this.f2288d) {
                    this.f2288d = true;
                    this.f2289e.getClass();
                    c.d(this.b);
                    try {
                        this.f2286a.a();
                    } catch (IOException unused) {
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
