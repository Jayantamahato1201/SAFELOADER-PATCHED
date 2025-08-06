package e;

import android.content.res.Configuration;
import java.util.Locale;

public abstract class p {
    public static void a(Configuration configuration, Locale locale) {
        configuration.setLayoutDirection(locale);
    }

    public static void b(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }
}
