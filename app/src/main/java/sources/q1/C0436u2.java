package q1;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: q1.u2  reason: case insensitive filesystem */
public final class C0436u2 extends AbstractCollection {
    public final C0413q2 f;

    public C0436u2(int i2) {
        this.f = new C0413q2(i2);
    }

    public final boolean add(Object obj) {
        return this.f.b(obj.hashCode(), obj);
    }

    public final void clear() {
        C0413q2 q2Var = this.f;
        q2Var.f4178c = 0;
        q2Var.f4177a = H.b;
        q2Var.b = H.f3887d;
    }

    public final boolean contains(Object obj) {
        int hashCode = obj.hashCode();
        C0413q2 q2Var = this.f;
        if (H.a(q2Var.f4178c, hashCode, q2Var.f4177a) >= 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        C0413q2 q2Var = this.f;
        q2Var.getClass();
        return new C0377k2(q2Var);
    }

    public final boolean remove(Object obj) {
        return this.f.c(obj.hashCode());
    }

    public final int size() {
        return this.f.f4178c;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [q1.q2, java.lang.Object] */
    public C0436u2(String str) {
        ? obj = new Object();
        obj.f4177a = new int[]{str.hashCode()};
        obj.b = new Object[]{str};
        obj.f4178c = 1;
        this.f = obj;
    }

    public C0436u2() {
        this.f = new C0413q2(0);
    }
}
