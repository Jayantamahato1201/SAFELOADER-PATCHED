package e;

import E.g;
import android.content.res.Configuration;
import android.os.LocaleList;

public abstract class r {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList f = configuration.getLocales();
        LocaleList f2 = configuration2.getLocales();
        if (!f.equals(f2)) {
            configuration3.setLocales(f2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static g b(Configuration configuration) {
        return g.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(g gVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f89a.b()));
    }

    public static void d(Configuration configuration, g gVar) {
        configuration.setLocales(LocaleList.forLanguageTags(gVar.f89a.b()));
    }
}
