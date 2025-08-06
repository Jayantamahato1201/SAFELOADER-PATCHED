package E;

import android.os.LocaleList;
import java.util.Locale;

public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f92a;

    public k(Object obj) {
        this.f92a = j.h(obj);
    }

    public final Object a() {
        return this.f92a;
    }

    public final String b() {
        return this.f92a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return this.f92a.equals(((i) obj).a());
    }

    public final Locale get(int i2) {
        return this.f92a.get(i2);
    }

    public final int hashCode() {
        return this.f92a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f92a.isEmpty();
    }

    public final int size() {
        return this.f92a.size();
    }

    public final String toString() {
        return this.f92a.toString();
    }
}
