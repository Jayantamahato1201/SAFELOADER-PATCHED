package z;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: z.i  reason: case insensitive filesystem */
public abstract class C0510i {
    public static Drawable a(Resources resources, int i2, Resources.Theme theme) {
        return resources.getDrawable(i2, theme);
    }

    public static Drawable b(Resources resources, int i2, int i3, Resources.Theme theme) {
        return resources.getDrawableForDensity(i2, i3, theme);
    }
}
