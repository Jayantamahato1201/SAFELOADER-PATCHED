package j1;

import e1.a;
import java.io.IOException;

public final class p extends a {

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3255g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3256h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3257i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s f3258j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(s sVar, boolean z2, int i2, int i3) {
        super("OkHttp %s ping %08x%08x", sVar.f3266i, Integer.valueOf(i2), Integer.valueOf(i3));
        this.f3258j = sVar;
        this.f3255g = z2;
        this.f3256h = i2;
        this.f3257i = i3;
    }

    public final void a() {
        boolean z2;
        s sVar = this.f3258j;
        boolean z3 = this.f3255g;
        int i2 = this.f3256h;
        int i3 = this.f3257i;
        if (!z3) {
            synchronized (sVar) {
                z2 = sVar.f3273p;
                sVar.f3273p = true;
            }
            if (z2) {
                sVar.l();
                return;
            }
        } else {
            sVar.getClass();
        }
        try {
            sVar.f3280w.p(i2, i3, z3);
        } catch (IOException unused) {
            sVar.l();
        }
    }
}
