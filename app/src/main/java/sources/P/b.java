package P;

import android.database.DataSetObserver;
import k.L0;
import k.k1;

public final class b extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f640a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f640a = i2;
        this.b = obj;
    }

    public final void onChanged() {
        switch (this.f640a) {
            case 0:
                k1 k1Var = (k1) this.b;
                k1Var.f641a = true;
                k1Var.notifyDataSetChanged();
                return;
            default:
                L0 l02 = (L0) this.b;
                if (l02.f3393z.isShowing()) {
                    l02.f();
                    return;
                }
                return;
        }
    }

    public final void onInvalidated() {
        switch (this.f640a) {
            case 0:
                k1 k1Var = (k1) this.b;
                k1Var.f641a = false;
                k1Var.notifyDataSetInvalidated();
                return;
            default:
                ((L0) this.b).dismiss();
                return;
        }
    }
}
