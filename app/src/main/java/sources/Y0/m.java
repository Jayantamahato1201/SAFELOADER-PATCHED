package y0;

import I.B;
import I.O;
import android.view.View;
import java.util.WeakHashMap;

public final class m implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = O.f393a;
        B.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
