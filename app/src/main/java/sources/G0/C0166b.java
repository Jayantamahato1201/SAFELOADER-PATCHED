package g0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import r0.a;
import r0.c;

/* renamed from: g0.b  reason: case insensitive filesystem */
public final class C0166b extends Animatable2.AnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f2800a;

    public C0166b(a aVar) {
        this.f2800a = aVar;
    }

    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f2800a.b.f4421o;
        if (colorStateList != null) {
            B.a.h(drawable, colorStateList);
        }
    }

    public final void onAnimationStart(Drawable drawable) {
        c cVar = this.f2800a.b;
        ColorStateList colorStateList = cVar.f4421o;
        if (colorStateList != null) {
            B.a.g(drawable, colorStateList.getColorForState(cVar.f4425s, colorStateList.getDefaultColor()));
        }
    }
}
