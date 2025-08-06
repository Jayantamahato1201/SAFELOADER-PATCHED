package n;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class i implements Iterator, Map.Entry {
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f3698g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3699h = false;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ C0288a f3700i;

    public i(C0288a aVar) {
        this.f3700i = aVar;
        this.f = aVar.d() - 1;
        this.f3698g = -1;
    }

    public final boolean equals(Object obj) {
        if (!this.f3699h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i2 = this.f3698g;
            C0288a aVar = this.f3700i;
            Object b = aVar.b(i2, 0);
            if (key != b && (key == null || !key.equals(b))) {
                return false;
            }
            Object value = entry.getValue();
            Object b2 = aVar.b(this.f3698g, 1);
            if (value == b2 || (value != null && value.equals(b2))) {
                return true;
            }
            return false;
        }
    }

    public final Object getKey() {
        if (this.f3699h) {
            return this.f3700i.b(this.f3698g, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f3699h) {
            return this.f3700i.b(this.f3698g, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        if (this.f3698g < this.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        if (this.f3699h) {
            int i3 = this.f3698g;
            C0288a aVar = this.f3700i;
            int i4 = 0;
            Object b = aVar.b(i3, 0);
            Object b2 = aVar.b(this.f3698g, 1);
            if (b == null) {
                i2 = 0;
            } else {
                i2 = b.hashCode();
            }
            if (b2 != null) {
                i4 = b2.hashCode();
            }
            return i2 ^ i4;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object next() {
        if (hasNext()) {
            this.f3698g++;
            this.f3699h = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f3699h) {
            this.f3700i.g(this.f3698g);
            this.f3698g--;
            this.f--;
            this.f3699h = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f3699h) {
            C0288a aVar = this.f3700i;
            int i2 = this.f3698g;
            switch (aVar.f3672d) {
                case 0:
                    int i3 = (i2 << 1) + 1;
                    Object[] objArr = ((C0289b) aVar.f3673e).f3705g;
                    Object obj2 = objArr[i3];
                    objArr[i3] = obj;
                    return obj2;
                default:
                    throw new UnsupportedOperationException("not a map");
            }
        } else {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
