package J0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.cheatbox.R;
import i.C0179d;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f492a = {16842752, R.attr.MT_Bin};
    public static final int[] b = {R.attr.MT_Bin};

    public static Context a(Context context, AttributeSet attributeSet, int i2, int i3) {
        boolean z2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (!(context instanceof C0179d) || ((C0179d) context).f2926a != resourceId) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (resourceId == 0 || z2) {
            return context;
        }
        C0179d dVar = new C0179d(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f492a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            dVar.getTheme().applyStyle(resourceId2, true);
        }
        return dVar;
    }
}
