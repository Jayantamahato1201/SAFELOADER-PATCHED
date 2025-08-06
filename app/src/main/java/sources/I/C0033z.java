package I;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: I.z  reason: case insensitive filesystem */
public final class C0033z implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap f474a = new WeakHashMap();

    public final void onGlobalLayout() {
        boolean z2;
        int i2;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f474a.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (!view.isShown() || view.getWindowVisibility() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (booleanValue != z2) {
                    if (z2) {
                        i2 = 16;
                    } else {
                        i2 = 32;
                    }
                    O.i(view, i2);
                    entry.setValue(Boolean.valueOf(z2));
                }
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
