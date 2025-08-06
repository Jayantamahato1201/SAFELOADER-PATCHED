package k;

import I.O;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public abstract class D1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f3337a;
    public static final boolean b;

    static {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 27) {
            z2 = true;
        } else {
            z2 = false;
        }
        b = z2;
        try {
            Class<Rect> cls = Rect.class;
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
            f3337a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap weakHashMap = O.f393a;
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
