package L0;

import U0.i;
import androidx.activity.n;
import java.io.Serializable;

public final class c implements Serializable {
    public n f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Object f587g = e.b;

    /* renamed from: h  reason: collision with root package name */
    public final Object f588h = this;

    public c(n nVar) {
        this.f = nVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f587g;
        e eVar = e.b;
        if (obj2 != eVar) {
            return obj2;
        }
        synchronized (this.f588h) {
            obj = this.f587g;
            if (obj == eVar) {
                n nVar = this.f;
                i.b(nVar);
                obj = nVar.a();
                this.f587g = obj;
                this.f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f587g != e.b) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
