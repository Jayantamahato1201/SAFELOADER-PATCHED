package H0;

import E0.f;
import E0.g;
import E0.k;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: H0.g  reason: case insensitive filesystem */
public final class C0006g extends f {

    /* renamed from: q  reason: collision with root package name */
    public final RectF f293q;

    public C0006g(k kVar, RectF rectF) {
        super(kVar);
        this.f293q = rectF;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [H0.h, E0.g, android.graphics.drawable.Drawable] */
    public final Drawable newDrawable() {
        ? gVar = new g((f) this);
        gVar.f295x = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public C0006g(C0006g gVar) {
        super((f) gVar);
        this.f293q = gVar.f293q;
    }
}
