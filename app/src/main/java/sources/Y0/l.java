package y0;

import A.g;
import I.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import b0.C0089m;
import com.cheatbox.R;
import com.google.android.material.appbar.MaterialToolbar;
import j0.C0219a;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f4845a = {R.attr.MT_Bin};
    public static final int[] b = {R.attr.MT_Bin};

    /* renamed from: c  reason: collision with root package name */
    public static final C0089m f4846c = new C0089m(4);

    public static void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0219a.f3175C, i2, i3);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.MT_Bin, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, b, "Theme.MaterialComponents");
            }
        }
        c(context, f4845a, "Theme.AppCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = j0.C0219a.f3175C
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0012
            r0.recycle()
            return
        L_0x0012:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L_0x001f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L_0x003a
        L_0x001d:
            r2 = 1
            goto L_0x003a
        L_0x001f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = 0
        L_0x0025:
            if (r7 >= r6) goto L_0x0036
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L_0x0033
            r5.recycle()
            goto L_0x003a
        L_0x0033:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x0036:
            r5.recycle()
            goto L_0x001d
        L_0x003a:
            r0.recycle()
            if (r2 == 0) goto L_0x0040
            return
        L_0x0040:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.l.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int i2 = 0;
        while (i2 < iArr.length) {
            if (obtainStyledAttributes.hasValue(i2)) {
                i2++;
            } else {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(g.i("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static ArrayList d(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean e(View view) {
        WeakHashMap weakHashMap = O.f393a;
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static TypedArray f(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        a(context, attributeSet, i2, i3);
        b(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
