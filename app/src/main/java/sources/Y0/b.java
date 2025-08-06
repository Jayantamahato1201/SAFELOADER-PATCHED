package Y0;

import V0.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator, a {
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f786g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f787h;

    /* renamed from: i  reason: collision with root package name */
    public int f788i;

    public b(int i2, int i3, int i4) {
        this.f = i4;
        this.f786g = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f787h = z2;
        this.f788i = !z2 ? i3 : i2;
    }

    public final int a() {
        int i2 = this.f788i;
        if (i2 != this.f786g) {
            this.f788i = this.f + i2;
            return i2;
        } else if (this.f787h) {
            this.f787h = false;
            return i2;
        } else {
            throw new NoSuchElementException();
        }
    }

    public final boolean hasNext() {
        return this.f787h;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
