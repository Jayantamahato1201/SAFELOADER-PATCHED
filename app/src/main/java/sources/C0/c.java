package C0;

import A.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.cheatbox.R;
import t0.C0486a;

public abstract class c {
    /* access modifiers changed from: private */
    public static Drawable b(Context context, int i2) {
        ColorStateList colorStateList;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable(gradientDrawable, i2, i2, i2, i2);
        ColorStateList valueOf = ColorStateList.valueOf(0);
        TypedValue h02 = i.h0(context, R.attr.MT_Bin);
        if (h02 != null) {
            int i3 = h02.resourceId;
            if (i3 != 0) {
                colorStateList = C0486a.g(context, i3);
            } else {
                colorStateList = ColorStateList.valueOf(h02.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            valueOf = colorStateList;
        }
        return new RippleDrawable(valueOf, (Drawable) null, insetDrawable);
    }
}
