package k;

import B.a;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: k.x0  reason: case insensitive filesystem */
public final class C0276x0 extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f3594a;
    public boolean b;

    public final void a(Canvas canvas) {
        this.f3594a.draw(canvas);
    }

    public final void b(float f, float f2) {
        a.e(this.f3594a, f, f2);
    }

    public final void c(int i2, int i3, int i4, int i5) {
        a.f(this.f3594a, i2, i3, i4, i5);
    }

    public final boolean d(boolean z2, boolean z3) {
        if (super.setVisible(z2, z3) || this.f3594a.setVisible(z2, z3)) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        if (this.b) {
            a(canvas);
        }
    }

    public final int getChangingConfigurations() {
        return this.f3594a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f3594a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f3594a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3594a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f3594a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f3594a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f3594a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f3594a.getPadding(rect);
    }

    public final int[] getState() {
        return this.f3594a.getState();
    }

    public final Region getTransparentRegion() {
        return this.f3594a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.f3594a.isAutoMirrored();
    }

    public final boolean isStateful() {
        return this.f3594a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f3594a.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f3594a.setBounds(rect);
    }

    public final boolean onLevelChange(int i2) {
        return this.f3594a.setLevel(i2);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public final void setAlpha(int i2) {
        this.f3594a.setAlpha(i2);
    }

    public final void setAutoMirrored(boolean z2) {
        this.f3594a.setAutoMirrored(z2);
    }

    public final void setChangingConfigurations(int i2) {
        this.f3594a.setChangingConfigurations(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3594a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z2) {
        this.f3594a.setDither(z2);
    }

    public final void setFilterBitmap(boolean z2) {
        this.f3594a.setFilterBitmap(z2);
    }

    public final void setHotspot(float f, float f2) {
        if (this.b) {
            b(f, f2);
        }
    }

    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        if (this.b) {
            c(i2, i3, i4, i5);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.b) {
            return this.f3594a.setState(iArr);
        }
        return false;
    }

    public final void setTint(int i2) {
        a.g(this.f3594a, i2);
    }

    public final void setTintList(ColorStateList colorStateList) {
        a.h(this.f3594a, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        a.i(this.f3594a, mode);
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        if (this.b) {
            return d(z2, z3);
        }
        return false;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
