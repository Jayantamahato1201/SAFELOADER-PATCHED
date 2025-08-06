package E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public final class h implements i {

    /* renamed from: c  reason: collision with root package name */
    public static final Locale[] f90c = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f91a;
    public final String b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f91a = f90c;
            this.b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < localeArr.length) {
            Locale locale = localeArr[i2];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb.append('-');
                        sb.append(locale2.getCountry());
                    }
                    if (i2 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i2++;
            } else {
                throw new NullPointerException("list[" + i2 + "] is null");
            }
        }
        this.f91a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.b = sb.toString();
    }

    public final Object a() {
        return null;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Locale[] localeArr = ((h) obj).f91a;
        Locale[] localeArr2 = this.f91a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < localeArr2.length; i2++) {
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final Locale get(int i2) {
        if (i2 < 0) {
            return null;
        }
        Locale[] localeArr = this.f91a;
        if (i2 < localeArr.length) {
            return localeArr[i2];
        }
        return null;
    }

    public final int hashCode() {
        int i2 = 1;
        for (Locale hashCode : this.f91a) {
            i2 = (i2 * 31) + hashCode.hashCode();
        }
        return i2;
    }

    public final boolean isEmpty() {
        if (this.f91a.length == 0) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f91a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f91a;
            if (i2 < localeArr.length) {
                sb.append(localeArr[i2]);
                if (i2 < localeArr.length - 1) {
                    sb.append(',');
                }
                i2++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
