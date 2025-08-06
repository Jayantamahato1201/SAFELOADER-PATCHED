package U0;

import Z0.a;
import java.io.Serializable;

public abstract class d implements a, Serializable {
    public transient a f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f763g;

    /* renamed from: h  reason: collision with root package name */
    public final Class f764h;

    /* renamed from: i  reason: collision with root package name */
    public final String f765i;

    /* renamed from: j  reason: collision with root package name */
    public final String f766j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f767k;

    public d(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f763g = obj;
        this.f764h = cls;
        this.f765i = str;
        this.f766j = str2;
        this.f767k = z2;
    }

    public abstract a f();

    public final e g() {
        Class cls = this.f764h;
        if (this.f767k) {
            m.f774a.getClass();
            return new l(cls);
        }
        m.f774a.getClass();
        return new f(cls);
    }
}
