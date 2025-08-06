package E;

import android.os.Build;
import java.util.Locale;

public final class g {
    public static final g b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public final i f89a;

    public g(i iVar) {
        this.f89a = iVar;
    }

    public static g a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new g(new k(f.a(localeArr)));
        }
        return new g(new h(localeArr));
    }

    public static g b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            localeArr[i2] = e.a(split[i2]);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.f89a.equals(((g) obj).f89a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f89a.hashCode();
    }

    public final String toString() {
        return this.f89a.toString();
    }
}
