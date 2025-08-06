package U0;

import V0.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k.C0241f0;
import q1.C0413q2;

public final class b implements Iterator, a {
    public final /* synthetic */ int f = 1;

    /* renamed from: g  reason: collision with root package name */
    public final Object[] f761g;

    /* renamed from: h  reason: collision with root package name */
    public int f762h;

    public b(C0241f0 f0Var) {
        Object[] copyOf;
        synchronized (f0Var) {
            C0413q2 q2Var = (C0413q2) f0Var.f3459a;
            copyOf = Arrays.copyOf(q2Var.b, q2Var.f4178c);
        }
        this.f761g = copyOf;
    }

    public final boolean hasNext() {
        switch (this.f) {
            case 0:
                if (this.f762h < this.f761g.length) {
                    return true;
                }
                return false;
            default:
                if (this.f762h < this.f761g.length) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        switch (this.f) {
            case 0:
                try {
                    Object[] objArr = this.f761g;
                    int i2 = this.f762h;
                    this.f762h = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f762h--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            default:
                int i3 = this.f762h;
                this.f762h = i3 + 1;
                return this.f761g[i3];
        }
    }

    public final void remove() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Object[] objArr) {
        this.f761g = objArr;
    }
}
