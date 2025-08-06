package n;

import java.util.Collection;
import java.util.Iterator;

public final class j implements Collection {
    public final /* synthetic */ C0288a f;

    public j(C0288a aVar) {
        this.f = aVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f.a();
    }

    public final boolean contains(Object obj) {
        if (this.f.f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        if (this.f.d() == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C0294g(this.f, 1);
    }

    public final boolean remove(Object obj) {
        C0288a aVar = this.f;
        int f2 = aVar.f(obj);
        if (f2 < 0) {
            return false;
        }
        aVar.g(f2);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        C0288a aVar = this.f;
        int d2 = aVar.d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < d2) {
            if (collection.contains(aVar.b(i2, 1))) {
                aVar.g(i2);
                i2--;
                d2--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    public final boolean retainAll(Collection collection) {
        C0288a aVar = this.f;
        int d2 = aVar.d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < d2) {
            if (!collection.contains(aVar.b(i2, 1))) {
                aVar.g(i2);
                i2--;
                d2--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    public final int size() {
        return this.f.d();
    }

    public final Object[] toArray() {
        C0288a aVar = this.f;
        int d2 = aVar.d();
        Object[] objArr = new Object[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = aVar.b(i2, 1);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f.i(objArr, 1);
    }
}
