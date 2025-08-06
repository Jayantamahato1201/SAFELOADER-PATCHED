package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: g0.d  reason: case insensitive filesystem */
public final class C0168d extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f2804a;

    public C0168d(Drawable.ConstantState constantState) {
        this.f2804a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f2804a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.f2804a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        C0169e eVar = new C0169e((Context) null);
        Drawable newDrawable = this.f2804a.newDrawable();
        eVar.f2811a = newDrawable;
        newDrawable.setCallback(eVar.f);
        return eVar;
    }

    public final Drawable newDrawable(Resources resources) {
        C0169e eVar = new C0169e((Context) null);
        Drawable newDrawable = this.f2804a.newDrawable(resources);
        eVar.f2811a = newDrawable;
        newDrawable.setCallback(eVar.f);
        return eVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0169e eVar = new C0169e((Context) null);
        Drawable newDrawable = this.f2804a.newDrawable(resources, theme);
        eVar.f2811a = newDrawable;
        newDrawable.setCallback(eVar.f);
        return eVar;
    }
}
