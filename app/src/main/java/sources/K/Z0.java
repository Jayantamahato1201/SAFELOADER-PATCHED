package k;

import P.c;
import android.database.Cursor;
import androidx.appcompat.widget.SearchView;

public final class Z0 implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ SearchView f3438g;

    public /* synthetic */ Z0(SearchView searchView, int i2) {
        this.f = i2;
        this.f3438g = searchView;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                this.f3438g.u();
                return;
            default:
                c cVar = this.f3438g.f997O;
                if (cVar instanceof k1) {
                    cVar.b((Cursor) null);
                    return;
                }
                return;
        }
    }
}
