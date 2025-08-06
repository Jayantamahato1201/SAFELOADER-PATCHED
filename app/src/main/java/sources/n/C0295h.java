package n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: n.h  reason: case insensitive filesystem */
public final class C0295h implements Set {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0288a f3697g;

    public /* synthetic */ C0295h(C0288a aVar, int i2) {
        this.f = i2;
        this.f3697g = aVar;
    }

    public final boolean add(Object obj) {
        switch (this.f) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.f) {
            case 0:
                C0288a aVar = this.f3697g;
                int d2 = aVar.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (aVar.f3672d) {
                        case 0:
                            ((C0289b) aVar.f3673e).put(key, value);
                            break;
                        default:
                            ((C0290c) aVar.f3673e).add(key);
                            break;
                    }
                }
                if (d2 != aVar.d()) {
                    return true;
                }
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        switch (this.f) {
            case 0:
                this.f3697g.a();
                return;
            default:
                this.f3697g.a();
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r5 = (java.util.Map.Entry) r5;
        r0 = r5.getKey();
        r2 = r4.f3697g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f
            switch(r0) {
                case 0: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            n.a r0 = r4.f3697g
            int r5 = r0.e(r5)
            if (r5 < 0) goto L_0x000f
            r5 = 1
            goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            return r5
        L_0x0011:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            n.a r2 = r4.f3697g
            int r0 = r2.e(r0)
            if (r0 >= 0) goto L_0x0026
            goto L_0x003a
        L_0x0026:
            r3 = 1
            java.lang.Object r0 = r2.b(r0, r3)
            java.lang.Object r5 = r5.getValue()
            if (r0 == r5) goto L_0x0039
            if (r0 == 0) goto L_0x003a
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0295h.contains(java.lang.Object):boolean");
    }

    public final boolean containsAll(Collection collection) {
        switch (this.f) {
            case 0:
                for (Object contains : collection) {
                    if (!contains(contains)) {
                        return false;
                    }
                }
                return true;
            default:
                Map c2 = this.f3697g.c();
                for (Object containsKey : collection) {
                    if (!c2.containsKey(containsKey)) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f) {
            case 0:
                return C0288a.h(this, obj);
            default:
                return C0288a.h(this, obj);
        }
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        switch (this.f) {
            case 0:
                C0288a aVar = this.f3697g;
                int i5 = 0;
                for (int d2 = aVar.d() - 1; d2 >= 0; d2--) {
                    Object b = aVar.b(d2, 0);
                    Object b2 = aVar.b(d2, 1);
                    if (b == null) {
                        i2 = 0;
                    } else {
                        i2 = b.hashCode();
                    }
                    if (b2 == null) {
                        i3 = 0;
                    } else {
                        i3 = b2.hashCode();
                    }
                    i5 += i2 ^ i3;
                }
                return i5;
            default:
                C0288a aVar2 = this.f3697g;
                int i6 = 0;
                for (int d3 = aVar2.d() - 1; d3 >= 0; d3--) {
                    Object b3 = aVar2.b(d3, 0);
                    if (b3 == null) {
                        i4 = 0;
                    } else {
                        i4 = b3.hashCode();
                    }
                    i6 += i4;
                }
                return i6;
        }
    }

    public final boolean isEmpty() {
        switch (this.f) {
            case 0:
                if (this.f3697g.d() == 0) {
                    return true;
                }
                return false;
            default:
                if (this.f3697g.d() == 0) {
                    return true;
                }
                return false;
        }
    }

    public final Iterator iterator() {
        switch (this.f) {
            case 0:
                return new i(this.f3697g);
            default:
                return new C0294g(this.f3697g, 0);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0288a aVar = this.f3697g;
                int e2 = aVar.e(obj);
                if (e2 < 0) {
                    return false;
                }
                aVar.g(e2);
                return true;
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c2 = this.f3697g.c();
                int size = c2.size();
                for (Object remove : collection) {
                    c2.remove(remove);
                }
                if (size != c2.size()) {
                    return true;
                }
                return false;
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c2 = this.f3697g.c();
                int size = c2.size();
                Iterator it = c2.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                if (size != c2.size()) {
                    return true;
                }
                return false;
        }
    }

    public final int size() {
        switch (this.f) {
            case 0:
                return this.f3697g.d();
            default:
                return this.f3697g.d();
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f3697g.i(objArr, 0);
        }
    }

    public final Object[] toArray() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0288a aVar = this.f3697g;
                int d2 = aVar.d();
                Object[] objArr = new Object[d2];
                for (int i2 = 0; i2 < d2; i2++) {
                    objArr[i2] = aVar.b(i2, 0);
                }
                return objArr;
        }
    }
}
