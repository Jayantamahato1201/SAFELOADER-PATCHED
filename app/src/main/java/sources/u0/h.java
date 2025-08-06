package U0;

import A.g;
import Z0.a;

public abstract class h extends d implements a {

    /* renamed from: l  reason: collision with root package name */
    public final int f769l;

    /* renamed from: m  reason: collision with root package name */
    public final int f770m;

    public h(int i2, Class cls, String str, String str2, int i3) {
        this(i2, c.f, cls, str, str2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (!this.f765i.equals(hVar.f765i) || !this.f766j.equals(hVar.f766j) || this.f770m != hVar.f770m || this.f769l != hVar.f769l || !i.a(this.f763g, hVar.f763g) || !g().equals(hVar.g())) {
                return false;
            }
            return true;
        } else if (!(obj instanceof h)) {
            return false;
        } else {
            a aVar = this.f;
            if (aVar == null) {
                f();
                this.f = this;
                aVar = this;
            }
            return obj.equals(aVar);
        }
    }

    public final a f() {
        m.f774a.getClass();
        return this;
    }

    public final int hashCode() {
        g();
        int hashCode = this.f765i.hashCode();
        return this.f766j.hashCode() + ((hashCode + (g().hashCode() * 31)) * 31);
    }

    public final String toString() {
        a aVar = this.f;
        if (aVar == null) {
            f();
            this.f = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f765i;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return g.i("function ", str, " (Kotlin reflection is not available)");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f769l = i2;
        this.f770m = 0;
    }
}
