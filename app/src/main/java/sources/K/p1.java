package k;

import A.g;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import j.C0207k;
import j.C0209m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class p1 implements C0254m, C0207k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Toolbar f3550a;

    public /* synthetic */ p1(Toolbar toolbar) {
        this.f3550a = toolbar;
    }

    public void e(C0209m mVar) {
        Toolbar toolbar = this.f3550a;
        C0248j jVar = toolbar.f1041a.f967t;
        if (jVar == null || !jVar.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1030G.f194c).iterator();
            if (it.hasNext()) {
                throw g.e(it);
            }
        }
    }

    public boolean f(C0209m mVar, MenuItem menuItem) {
        this.f3550a.getClass();
        return false;
    }
}
