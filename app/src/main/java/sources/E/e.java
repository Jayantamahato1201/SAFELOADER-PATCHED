package E;

import java.util.Locale;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Locale[] f88a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f88a;
            for (Locale equals : localeArr) {
                if (equals.equals(locale)) {
                    return false;
                }
            }
            for (Locale equals2 : localeArr) {
                if (equals2.equals(locale2)) {
                    return false;
                }
            }
            String a2 = G.e.a(locale);
            if (!a2.isEmpty()) {
                return a2.equals(G.e.a(locale2));
            }
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
        }
        return false;
    }
}
