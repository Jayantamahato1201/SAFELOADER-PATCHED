package g0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

public final class p extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f2857a;

    public p(Drawable.ConstantState constantState) {
        this.f2857a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f2857a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.f2857a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        q qVar = new q();
        qVar.f2811a = (VectorDrawable) this.f2857a.newDrawable();
        return qVar;
    }

    public final Drawable newDrawable(Resources resources) {
        q qVar = new q();
        qVar.f2811a = (VectorDrawable) this.f2857a.newDrawable(resources);
        return qVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        q qVar = new q();
        qVar.f2811a = (VectorDrawable) this.f2857a.newDrawable(resources, theme);
        return qVar;
    }
}
