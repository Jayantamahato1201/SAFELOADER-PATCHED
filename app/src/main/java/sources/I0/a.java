package I0;

import A.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.cheatbox.R;
import j0.C0219a;
import k.C0245h0;

public final class a extends C0245h0 {
    public static int g(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < iArr.length && i2 < 0; i3++) {
            int i4 = iArr[i3];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i4, typedValue) || typedValue.type != 2) {
                i2 = typedArray.getDimensionPixelSize(i4, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i2 = dimensionPixelSize;
            }
        }
        return i2;
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (i.i0(context, R.attr.MT_Bin, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i2, C0219a.f3190q);
            int g2 = g(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g2 >= 0) {
                setLineHeight(g2);
            }
        }
    }
}
