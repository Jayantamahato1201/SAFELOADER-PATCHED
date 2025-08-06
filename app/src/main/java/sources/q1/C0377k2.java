package q1;

import V0.a;
import java.util.Iterator;

/* renamed from: q1.k2  reason: case insensitive filesystem */
public final class C0377k2 implements Iterator, a {
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0413q2 f4130g;

    public C0377k2(C0413q2 q2Var) {
        this.f4130g = q2Var;
    }

    public final boolean hasNext() {
        if (this.f < this.f4130g.f4178c) {
            return true;
        }
        return false;
    }

    public final Object next() {
        Object[] objArr = this.f4130g.b;
        int i2 = this.f;
        this.f = i2 + 1;
        return objArr[i2];
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
