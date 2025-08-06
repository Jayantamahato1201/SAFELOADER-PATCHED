package E;

import U0.i;
import android.os.Build;
import java.util.Locale;

public abstract class b {
    static {
        int i2 = Build.VERSION.SDK_INT;
        a aVar = a.f85a;
        if (i2 >= 30) {
            aVar.a(30);
        }
        if (i2 >= 30) {
            aVar.a(31);
        }
        if (i2 >= 30) {
            aVar.a(33);
        }
        if (i2 >= 30) {
            aVar.a(1000000);
        }
    }

    public static final boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return true;
        }
        if (i2 < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        i.d("CODENAME", str);
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        i.d("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase);
        String upperCase2 = "Tiramisu".toUpperCase(locale);
        i.d("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase2);
        if (upperCase.compareTo(upperCase2) >= 0) {
            return true;
        }
        return false;
    }
}
