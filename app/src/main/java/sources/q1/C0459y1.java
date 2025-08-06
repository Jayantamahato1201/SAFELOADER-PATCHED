package q1;

import T0.l;
import android.content.pm.ParceledListSlice;
import java.util.List;

/* renamed from: q1.y1  reason: case insensitive filesystem */
public abstract class C0459y1 {

    /* renamed from: a  reason: collision with root package name */
    public static final l f4250a;

    static {
        l lVar;
        if (T4.f) {
            lVar = C0429t1.f4188n;
        } else {
            lVar = new C0453x1();
        }
        f4250a = lVar;
    }

    public static ParceledListSlice a(List list) {
        try {
            return new ParceledListSlice(list);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List b(Object obj) {
        try {
            if (!(obj instanceof ParceledListSlice)) {
                return (List) obj;
            }
            return (List) f4250a.e(obj);
        } catch (Throwable unused) {
            return null;
        }
    }
}
