package H0;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import k.L0;
import k.Q;
import k.U;

public final class x implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f374a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(int i2, Object obj) {
        this.f374a = i2;
        this.b = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        Object obj;
        switch (this.f374a) {
            case 0:
                View view2 = null;
                z zVar = (z) this.b;
                if (i2 < 0) {
                    L0 l02 = zVar.f377e;
                    if (!l02.f3393z.isShowing()) {
                        obj = null;
                    } else {
                        obj = l02.f3371c.getSelectedItem();
                    }
                } else {
                    obj = zVar.getAdapter().getItem(i2);
                }
                z.a(zVar, obj);
                AdapterView.OnItemClickListener onItemClickListener = zVar.getOnItemClickListener();
                L0 l03 = zVar.f377e;
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        if (l03.f3393z.isShowing()) {
                            view2 = l03.f3371c.getSelectedView();
                        }
                        view = view2;
                        if (!l03.f3393z.isShowing()) {
                            i2 = -1;
                        } else {
                            i2 = l03.f3371c.getSelectedItemPosition();
                        }
                        if (!l03.f3393z.isShowing()) {
                            j2 = Long.MIN_VALUE;
                        } else {
                            j2 = l03.f3371c.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(l03.f3371c, view, i2, j2);
                }
                l03.dismiss();
                return;
            case 1:
                Q q2 = (Q) this.b;
                q2.f3402H.setSelection(i2);
                U u2 = q2.f3402H;
                if (u2.getOnItemClickListener() != null) {
                    u2.performItemClick(view, i2, q2.f3399E.getItemId(i2));
                }
                q2.dismiss();
                return;
            default:
                ((SearchView) this.b).p(i2);
                return;
        }
    }
}
