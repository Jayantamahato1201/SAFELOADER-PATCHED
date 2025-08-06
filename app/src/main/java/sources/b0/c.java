package B0;

import A.i;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

public final class c extends i {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Context f56o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ TextPaint f57p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ i f58q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ d f59r;

    public c(d dVar, Context context, TextPaint textPaint, i iVar) {
        this.f59r = dVar;
        this.f56o = context;
        this.f57p = textPaint;
        this.f58q = iVar;
    }

    public final void d0(int i2) {
        this.f58q.d0(i2);
    }

    public final void e0(Typeface typeface, boolean z2) {
        this.f59r.g(this.f56o, this.f57p, typeface);
        this.f58q.e0(typeface, z2);
    }
}
