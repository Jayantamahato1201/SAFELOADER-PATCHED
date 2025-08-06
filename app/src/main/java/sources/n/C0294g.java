package n;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n.g  reason: case insensitive filesystem */
public final class C0294g implements Iterator {
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public int f3693g;

    /* renamed from: h  reason: collision with root package name */
    public int f3694h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3695i = false;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ C0288a f3696j;

    public C0294g(C0288a aVar, int i2) {
        this.f3696j = aVar;
        this.f = i2;
        this.f3693g = aVar.d();
    }

    public final boolean hasNext() {
        if (this.f3694h < this.f3693g) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (hasNext()) {
            Object b = this.f3696j.b(this.f3694h, this.f);
            this.f3694h++;
            this.f3695i = true;
            return b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f3695i) {
            int i2 = this.f3694h - 1;
            this.f3694h = i2;
            this.f3693g--;
            this.f3695i = false;
            this.f3696j.g(i2);
            return;
        }
        throw new IllegalStateException();
    }
}
