package M0;

import U0.i;
import V0.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class b implements Collection, a {
    public final Object[] f;

    public b(Object[] objArr) {
        this.f = objArr;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (d.C0(obj, this.f) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        i.e("elements", collection);
        if (collection.isEmpty()) {
            return true;
        }
        for (Object C02 : collection) {
            if (d.C0(C02, this.f) < 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        if (this.f.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new U0.b(this.f);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.f;
        Class<Object[]> cls = Object[].class;
        if (objArr.getClass().equals(cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        i.d("copyOf(this, this.size, Array<Any?>::class.java)", copyOf);
        return copyOf;
    }

    public final Object[] toArray(Object[] objArr) {
        i.e("array", objArr);
        return i.h(this, objArr);
    }
}
