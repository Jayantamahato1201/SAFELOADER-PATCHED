package U0;

import T0.l;
import Z0.a;

public abstract class k extends d implements l, a {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f772l = false;

    public k(Class cls, String str, String str2) {
        super(c.f, cls, str, str2, false);
    }

    public final Object e(Object obj) {
        return i(obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (!g().equals(kVar.g()) || !this.f765i.equals(kVar.f765i) || !this.f766j.equals(kVar.f766j) || !i.a(this.f763g, kVar.f763g)) {
                return false;
            }
            return true;
        } else if (obj instanceof k) {
            return obj.equals(h());
        } else {
            return false;
        }
    }

    public final a f() {
        m.f774a.getClass();
        return this;
    }

    public final a h() {
        if (this.f772l) {
            return this;
        }
        a aVar = this.f;
        if (aVar != null) {
            return aVar;
        }
        f();
        this.f = this;
        return this;
    }

    public final int hashCode() {
        int hashCode = this.f765i.hashCode();
        return this.f766j.hashCode() + ((hashCode + (g().hashCode() * 31)) * 31);
    }

    public abstract Object i(Object obj);

    public abstract void j(Object obj, Object obj2);

    public final String toString() {
        a h2 = h();
        if (h2 != this) {
            return h2.toString();
        }
        return "property " + this.f765i + " (Kotlin reflection is not available)";
    }
}
