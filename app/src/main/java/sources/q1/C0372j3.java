package q1;

import android.util.LruCache;
import android.util.Pair;

/* renamed from: q1.j3  reason: case insensitive filesystem */
public final class C0372j3 extends LruCache {

    /* renamed from: a  reason: collision with root package name */
    public final E4 f4126a = new E4();
    public final E4 b = new E4();

    public C0372j3() {
        super(64000);
    }

    public final void entryRemoved(boolean z2, Object obj, Object obj2, Object obj3) {
        Z2 z22 = (Z2) obj;
        C0402o3 o3Var = (C0402o3) obj2;
        C0402o3 o3Var2 = (C0402o3) obj3;
        if (o3Var != null && o3Var2 == null) {
            C0336d3 d3Var = (C0336d3) this.f4126a.remove(new Pair(z22.f4044a.type, o3Var.f4151a));
            if (d3Var != null) {
                d3Var.a();
            }
        }
    }

    public final int sizeOf(Object obj, Object obj2) {
        Z2 z2 = (Z2) obj;
        return ((C0402o3) obj2).f4151a.length();
    }
}
