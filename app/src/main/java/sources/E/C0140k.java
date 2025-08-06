package e;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: e.k  reason: case insensitive filesystem */
public abstract class C0140k {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
