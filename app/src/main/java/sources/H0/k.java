package H0;

import android.widget.AutoCompleteTextView;

public final /* synthetic */ class k implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f298a;

    public /* synthetic */ k(n nVar) {
        this.f298a = nVar;
    }

    public final void onDismiss() {
        n nVar = this.f298a;
        nVar.f308m = true;
        nVar.f310o = System.currentTimeMillis();
        nVar.t(false);
    }
}
