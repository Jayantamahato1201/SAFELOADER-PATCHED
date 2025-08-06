package I;

import L.a;
import android.view.View;
import android.view.autofill.AutofillId;
import com.cheatbox.R;
import java.util.Objects;
import n.k;

public abstract class H {
    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, M m2) {
        k kVar = (k) view.getTag(R.id.MT_Bin);
        if (kVar == null) {
            kVar = new k();
            view.setTag(R.id.MT_Bin, kVar);
        }
        Objects.requireNonNull(m2);
        ? obj = new Object();
        kVar.put(m2, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, M m2) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        k kVar = (k) view.getTag(R.id.MT_Bin);
        if (kVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(m2, (Object) null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i2) {
        return view.requireViewById(i2);
    }

    public static void g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, a aVar) {
        view.setAutofillId((AutofillId) null);
    }

    public static void j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
