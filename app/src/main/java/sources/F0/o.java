package f0;

import java.util.ArrayList;
import n.C0289b;

public final class o extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0289b f2685a;
    public final /* synthetic */ p b;

    public o(p pVar, C0289b bVar) {
        this.b = pVar;
        this.f2685a = bVar;
    }

    public final void e(m mVar) {
        ((ArrayList) this.f2685a.getOrDefault(this.b.b, (Object) null)).remove(mVar);
        mVar.x(this);
    }
}
