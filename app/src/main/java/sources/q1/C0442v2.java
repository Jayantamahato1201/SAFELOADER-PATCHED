package q1;

import H0.C;
import java.util.Comparator;

/* renamed from: q1.v2  reason: case insensitive filesystem */
public final /* synthetic */ class C0442v2 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C f4221a;

    public /* synthetic */ C0442v2(C c2) {
        this.f4221a = c2;
    }

    public final int compare(Object obj, Object obj2) {
        return ((Number) this.f4221a.d(obj, obj2)).intValue();
    }
}
