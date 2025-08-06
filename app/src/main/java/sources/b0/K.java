package b0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class K extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public Y f1590a;
    public final Rect b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public boolean f1591c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1592d = false;

    public K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public K(int i2, int i3) {
        super(i2, i3);
    }

    public K(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public K(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public K(K k2) {
        super(k2);
    }
}
