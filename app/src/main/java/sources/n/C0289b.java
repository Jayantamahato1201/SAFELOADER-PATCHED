package n;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: n.b  reason: case insensitive filesystem */
public final class C0289b extends k implements Map {

    /* renamed from: m  reason: collision with root package name */
    public C0288a f3674m;

    public C0289b(k kVar) {
        int i2 = kVar.f3706h;
        b(i2);
        if (this.f3706h != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(kVar.h(i3), kVar.j(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(kVar.f, 0, this.f, 0, i2);
            System.arraycopy(kVar.f3705g, 0, this.f3705g, 0, i2 << 1);
            this.f3706h = i2;
        }
    }

    public final Set entrySet() {
        if (this.f3674m == null) {
            this.f3674m = new C0288a(0, this);
        }
        C0288a aVar = this.f3674m;
        if (aVar.f3670a == null) {
            aVar.f3670a = new C0295h(aVar, 0);
        }
        return aVar.f3670a;
    }

    public final Set keySet() {
        if (this.f3674m == null) {
            this.f3674m = new C0288a(0, this);
        }
        C0288a aVar = this.f3674m;
        if (aVar.b == null) {
            aVar.b = new C0295h(aVar, 1);
        }
        return aVar.b;
    }

    public final void putAll(Map map) {
        b(map.size() + this.f3706h);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        if (this.f3674m == null) {
            this.f3674m = new C0288a(0, this);
        }
        C0288a aVar = this.f3674m;
        if (aVar.f3671c == null) {
            aVar.f3671c = new j(aVar);
        }
        return aVar.f3671c;
    }
}
