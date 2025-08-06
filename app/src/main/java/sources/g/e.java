package G;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f241a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f241a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.c(d.a(d.b(locale)));
        }
        try {
            return c.a((Locale) f241a.invoke((Object) null, new Object[]{locale}));
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
            return c.a(locale);
        } catch (IllegalAccessException e3) {
            Log.w("ICUCompat", e3);
            return c.a(locale);
        }
    }
}
