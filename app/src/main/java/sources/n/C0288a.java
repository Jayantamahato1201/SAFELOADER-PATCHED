package n;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: n.a  reason: case insensitive filesystem */
public final class C0288a {

    /* renamed from: a  reason: collision with root package name */
    public C0295h f3670a;
    public C0295h b;

    /* renamed from: c  reason: collision with root package name */
    public j f3671c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3672d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3673e;

    public /* synthetic */ C0288a(int i2, Object obj) {
        this.f3672d = i2;
        this.f3673e = obj;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                return false;
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final void a() {
        switch (this.f3672d) {
            case 0:
                ((C0289b) this.f3673e).clear();
                return;
            default:
                ((C0290c) this.f3673e).clear();
                return;
        }
    }

    public final Object b(int i2, int i3) {
        switch (this.f3672d) {
            case 0:
                return ((C0289b) this.f3673e).f3705g[(i2 << 1) + i3];
            default:
                return ((C0290c) this.f3673e).f3681g[i2];
        }
    }

    public final Map c() {
        switch (this.f3672d) {
            case 0:
                return (C0289b) this.f3673e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.f3672d) {
            case 0:
                return ((C0289b) this.f3673e).f3706h;
            default:
                return ((C0290c) this.f3673e).f3682h;
        }
    }

    public final int e(Object obj) {
        switch (this.f3672d) {
            case 0:
                return ((C0289b) this.f3673e).e(obj);
            default:
                C0290c cVar = (C0290c) this.f3673e;
                if (obj == null) {
                    return cVar.d();
                }
                return cVar.c(obj.hashCode(), obj);
        }
    }

    public final int f(Object obj) {
        switch (this.f3672d) {
            case 0:
                return ((C0289b) this.f3673e).g(obj);
            default:
                C0290c cVar = (C0290c) this.f3673e;
                if (obj == null) {
                    return cVar.d();
                }
                return cVar.c(obj.hashCode(), obj);
        }
    }

    public final void g(int i2) {
        switch (this.f3672d) {
            case 0:
                ((C0289b) this.f3673e).i(i2);
                return;
            default:
                ((C0290c) this.f3673e).e(i2);
                return;
        }
    }

    public final Object[] i(Object[] objArr, int i2) {
        int d2 = d();
        if (objArr.length < d2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d2);
        }
        for (int i3 = 0; i3 < d2; i3++) {
            objArr[i3] = b(i3, i2);
        }
        if (objArr.length > d2) {
            objArr[d2] = null;
        }
        return objArr;
    }
}
