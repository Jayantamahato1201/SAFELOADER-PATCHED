package B;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class g extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f48a;
    public Drawable.ConstantState b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f49c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f50d;

    public final int getChangingConfigurations() {
        int i2;
        int i3 = this.f48a;
        Drawable.ConstantState constantState = this.b;
        if (constantState != null) {
            i2 = constantState.getChangingConfigurations();
        } else {
            i2 = 0;
        }
        return i3 | i2;
    }

    public final Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [B.f, android.graphics.drawable.Drawable] */
    public final Drawable newDrawable(Resources resources) {
        ? drawable = new Drawable();
        drawable.f46d = this;
        Drawable.ConstantState constantState = this.b;
        if (constantState != null) {
            drawable.h(constantState.newDrawable(resources));
        }
        f.a();
        return drawable;
    }
}
