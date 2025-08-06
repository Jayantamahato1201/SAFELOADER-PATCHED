package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import d.a;
import t0.C0486a;

public abstract class l1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f3521a = new ThreadLocal();
    public static final int[] b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f3522c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3523d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f3524e = {16842912};
    public static final int[] f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f3525g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.f2200j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList d2 = d(context, i2);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = f3521a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int c2 = c(context, i2);
        return A.a.d(c2, Math.round(((float) Color.alpha(c2)) * f2));
    }

    public static int c(Context context, int i2) {
        int[] iArr = f3525g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f3525g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C0486a.g(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
