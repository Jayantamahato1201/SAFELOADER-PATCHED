package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

public final class F0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3355a;
    public final /* synthetic */ Object b;

    public /* synthetic */ F0(int i2, Object obj) {
        this.f3355a = i2;
        this.b = obj;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        C0280z0 z0Var;
        switch (this.f3355a) {
            case 0:
                if (i2 != -1 && (z0Var = ((L0) this.b).f3371c) != null) {
                    z0Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.b).q(i2);
                return;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f3355a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
