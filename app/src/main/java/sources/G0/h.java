package g0;

import B.a;
import B.d;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public abstract class h extends Drawable implements d {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f2811a;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            a.a(drawable, theme);
        }
    }

    public final void clearColorFilter() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public final Drawable getCurrent() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public final int getMinimumHeight() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public final int[] getState() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public final Region getTransparentRegion() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public final void jumpToCurrentState() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        return super.onLevelChange(i2);
    }

    public final void setChangingConfigurations(int i2) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i2);
        } else {
            super.setChangingConfigurations(i2);
        }
    }

    public final void setColorFilter(int i2, PorterDuff.Mode mode) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.setColorFilter(i2, mode);
        } else {
            super.setColorFilter(i2, mode);
        }
    }

    public final void setFilterBitmap(boolean z2) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.setFilterBitmap(z2);
        }
    }

    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            a.e(drawable, f, f2);
        }
    }

    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            a.f(drawable, i2, i3, i4, i5);
        }
    }

    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
