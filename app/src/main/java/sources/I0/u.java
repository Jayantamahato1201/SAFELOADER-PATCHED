package i0;

import android.content.SharedPreferences;
import e.C0137h;
import p1.a;

public final class u {
    public static u b = null;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f3010a;

    static {
        a.a(47551554325918674L);
        a.a(47551519966180306L);
    }

    public u(C0137h hVar) {
        this.f3010a = hVar.getSharedPreferences(hVar.getPackageName() + a.a(47551734714545106L), 0);
    }

    public final void a(String str, String str2) {
        this.f3010a.edit().putString(str, str2).apply();
    }
}
