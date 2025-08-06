package k;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: k.a1  reason: case insensitive filesystem */
public final class C0228a1 implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f3441a;

    public C0228a1(SearchView searchView) {
        this.f3441a = searchView;
    }

    public final void onFocusChange(View view, boolean z2) {
        SearchView searchView = this.f3441a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f993K;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z2);
        }
    }
}
