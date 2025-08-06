package m;

import java.util.HashMap;

/* renamed from: m.a  reason: case insensitive filesystem */
public final class C0286a extends f {

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f3650j = new HashMap();

    public final c a(Object obj) {
        return (c) this.f3650j.get(obj);
    }

    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.f3650j.remove(obj);
        return b;
    }
}
