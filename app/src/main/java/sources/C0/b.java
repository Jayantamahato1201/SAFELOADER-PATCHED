package C0;

import B.d;
import E0.k;
import E0.v;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class b extends Drawable implements v, d {

    /* renamed from: a  reason: collision with root package name */
    public a f73a;

    public b(a aVar) {
        this.f73a = aVar;
    }

    public final void draw(Canvas canvas) {
        a aVar = this.f73a;
        if (aVar.b) {
            aVar.f72a.draw(canvas);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f73a;
    }

    public final int getOpacity() {
        this.f73a.f72a.getClass();
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final Drawable mutate() {
        this.f73a = new a(this.f73a);
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f73a.f72a.setBounds(rect);
    }

    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f73a.f72a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b = d.b(iArr);
        a aVar = this.f73a;
        if (aVar.b == b) {
            return onStateChange;
        }
        aVar.b = b;
        return true;
    }

    public final void setAlpha(int i2) {
        this.f73a.f72a.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f73a.f72a.setColorFilter(colorFilter);
    }

    public final void setShapeAppearanceModel(k kVar) {
        this.f73a.f72a.setShapeAppearanceModel(kVar);
    }

    public final void setTint(int i2) {
        this.f73a.f72a.setTint(i2);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f73a.f72a.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f73a.f72a.setTintMode(mode);
    }
}
