package B;

import A.i;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

public final class f extends Drawable implements Drawable.Callback, e, d {

    /* renamed from: g  reason: collision with root package name */
    public static final PorterDuff.Mode f42g = PorterDuff.Mode.SRC_IN;

    /* renamed from: h  reason: collision with root package name */
    public static Method f43h;

    /* renamed from: a  reason: collision with root package name */
    public int f44a;
    public PorterDuff.Mode b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f45c;

    /* renamed from: d  reason: collision with root package name */
    public g f46d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f47e;
    public Drawable f;

    public static void a() {
        if (f43h == null) {
            try {
                f43h = Drawable.class.getDeclaredMethod("isProjected", (Class[]) null);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, B.g] */
    public final g c() {
        g gVar = this.f46d;
        ? constantState = new Drawable.ConstantState();
        constantState.f49c = null;
        constantState.f50d = f42g;
        if (gVar != null) {
            constantState.f48a = gVar.f48a;
            constantState.b = gVar.b;
            constantState.f49c = gVar.f49c;
            constantState.f50d = gVar.f50d;
        }
        return constantState;
    }

    public final boolean d(int[] iArr) {
        boolean state = this.f.setState(iArr);
        if (i(iArr) || state) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        this.f.draw(canvas);
    }

    public final void e(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public final void f(ColorStateList colorStateList) {
        this.f46d.f49c = colorStateList;
        i(this.f.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.f46d.f50d = mode;
        i(this.f.getState());
    }

    public final int getChangingConfigurations() {
        int i2;
        int changingConfigurations = super.getChangingConfigurations();
        g gVar = this.f46d;
        if (gVar != null) {
            i2 = gVar.getChangingConfigurations();
        } else {
            i2 = 0;
        }
        return changingConfigurations | i2 | this.f.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        g gVar = this.f46d;
        if (gVar == null || gVar.b == null) {
            return null;
        }
        gVar.f48a = getChangingConfigurations();
        return this.f46d;
    }

    public final Drawable getCurrent() {
        return this.f.getCurrent();
    }

    public final Rect getDirtyBounds() {
        return this.f.getDirtyBounds();
    }

    public final int getIntrinsicHeight() {
        return this.f.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f.getIntrinsicWidth();
    }

    public final int getLayoutDirection() {
        return i.N(this.f);
    }

    public final int getMinimumHeight() {
        return this.f.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f.getOpacity();
    }

    public final void getOutline(Outline outline) {
        this.f.getOutline(outline);
    }

    public final boolean getPadding(Rect rect) {
        return this.f.getPadding(rect);
    }

    public final int[] getState() {
        return this.f.getState();
    }

    public final Region getTransparentRegion() {
        return this.f.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            g gVar = this.f46d;
            if (gVar != null) {
                gVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        if (b()) {
            g gVar = this.f46d;
            ColorStateList colorStateList = gVar.f49c;
            PorterDuff.Mode mode = gVar.f50d;
            if (colorStateList == null || mode == null) {
                this.f45c = false;
                clearColorFilter();
                return false;
            }
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f45c && colorForState == this.f44a && mode == this.b)) {
                setColorFilter(colorForState, mode);
                this.f44a = colorForState;
                this.b = mode;
                this.f45c = true;
                return true;
            }
        }
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.f.isAutoMirrored();
    }

    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f;
        if (drawable == null || (method = f43h) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, (Object[]) null)).booleanValue();
        } catch (Exception e2) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            return false;
        }
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        g gVar;
        if (!b() || (gVar = this.f46d) == null) {
            colorStateList = null;
        } else {
            colorStateList = gVar.f49c;
        }
        if ((colorStateList == null || !colorStateList.isStateful()) && !this.f.isStateful()) {
            return false;
        }
        return true;
    }

    public final void jumpToCurrentState() {
        this.f.jumpToCurrentState();
    }

    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f47e && super.mutate() == this) {
            this.f46d = c();
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.mutate();
            }
            g gVar = this.f46d;
            if (gVar != null) {
                Drawable drawable2 = this.f;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                gVar.b = constantState;
            }
            this.f47e = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int i2) {
        return i.p0(this.f, i2);
    }

    public final boolean onLevelChange(int i2) {
        return this.f.setLevel(i2);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public final void setAlpha(int i2) {
        this.f.setAlpha(i2);
    }

    public final void setAutoMirrored(boolean z2) {
        this.f.setAutoMirrored(z2);
    }

    public final void setChangingConfigurations(int i2) {
        this.f.setChangingConfigurations(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z2) {
        this.f.setDither(z2);
    }

    public final void setFilterBitmap(boolean z2) {
        this.f.setFilterBitmap(z2);
    }

    public final void setHotspot(float f2, float f3) {
        this.f.setHotspot(f2, f3);
    }

    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f.setHotspotBounds(i2, i3, i4, i5);
    }

    public final boolean setState(int[] iArr) {
        if (!d(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setTint(int i2) {
        if (b()) {
            e(i2);
        } else {
            this.f.setTint(i2);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.f.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.f.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        if (super.setVisible(z2, z3) || this.f.setVisible(z2, z3)) {
            return true;
        }
        return false;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
