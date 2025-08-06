package k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: k.b  reason: case insensitive filesystem */
public final class C0229b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f3442a;

    public C0229b(ActionBarContainer actionBarContainer) {
        this.f3442a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3442a;
        if (actionBarContainer.f916g) {
            Drawable drawable = actionBarContainer.f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f914d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f915e;
        if (drawable3 != null && actionBarContainer.f917h) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f3442a;
        if (!actionBarContainer.f916g) {
            Drawable drawable = actionBarContainer.f914d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        } else if (actionBarContainer.f != null) {
            actionBarContainer.f914d.getOutline(outline);
        }
    }

    public final void setAlpha(int i2) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
