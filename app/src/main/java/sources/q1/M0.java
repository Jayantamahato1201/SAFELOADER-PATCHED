package q1;

import java.util.Iterator;
import java.util.Map;

public final class M0 implements Iterator, Map.Entry {
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public int f3935g = -1;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0418r2 f3936h;

    public M0(C0418r2 r2Var) {
        this.f3936h = r2Var;
        this.f = ((E4) r2Var.b).f3875h - 1;
    }

    public final Object getKey() {
        return ((E4) this.f3936h.b).f3874g[this.f3935g << 1];
    }

    public final Object getValue() {
        return ((E4) this.f3936h.b).f3874g[(this.f3935g << 1) + 1];
    }

    public final boolean hasNext() {
        if (this.f3935g < this.f) {
            return true;
        }
        return false;
    }

    public final Object next() {
        this.f3935g++;
        return this;
    }

    public final Object setValue(Object obj) {
        int i2 = (this.f3935g << 1) + 1;
        Object[] objArr = ((E4) this.f3936h.b).f3874g;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
