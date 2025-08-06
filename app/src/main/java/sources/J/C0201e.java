package j;

import A.j;

/* renamed from: j.e  reason: case insensitive filesystem */
public final class C0201e implements Runnable {
    public final /* synthetic */ C0202f f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0211o f3066g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0209m f3067h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ j f3068i;

    public C0201e(j jVar, C0202f fVar, C0211o oVar, C0209m mVar) {
        this.f3068i = jVar;
        this.f = fVar;
        this.f3066g = oVar;
        this.f3067h = mVar;
    }

    public final void run() {
        C0202f fVar = this.f;
        if (fVar != null) {
            j jVar = this.f3068i;
            ((C0203g) jVar.b).f3093z = true;
            fVar.b.c(false);
            ((C0203g) jVar.b).f3093z = false;
        }
        C0211o oVar = this.f3066g;
        if (oVar.isEnabled() && oVar.hasSubMenu()) {
            this.f3067h.q(oVar, (z) null, 4);
        }
    }
}
