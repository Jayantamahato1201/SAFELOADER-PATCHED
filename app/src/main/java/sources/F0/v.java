package f0;

import android.view.ViewGroup;

public abstract class v {
    public static int a(ViewGroup viewGroup, int i2) {
        return viewGroup.getChildDrawingOrder(i2);
    }

    public static void b(ViewGroup viewGroup, boolean z2) {
        viewGroup.suppressLayout(z2);
    }
}
