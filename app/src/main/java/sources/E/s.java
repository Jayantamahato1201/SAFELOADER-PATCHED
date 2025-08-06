package e;

import J.f;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.o;
import java.util.Objects;

public abstract class s {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, x xVar) {
        Objects.requireNonNull(xVar);
        o oVar = new o(1, xVar);
        f.j(obj).registerOnBackInvokedCallback(1000000, oVar);
        return oVar;
    }

    public static void c(Object obj, Object obj2) {
        f.j(obj).unregisterOnBackInvokedCallback(f.f(obj2));
    }
}
