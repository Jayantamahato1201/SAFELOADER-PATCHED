package k;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

public final class Y0 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f3437a;

    public Y0(SearchView searchView) {
        this.f3437a = searchView;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        SearchView searchView = this.f3437a;
        Editable text = searchView.f1011p.getText();
        searchView.f1004V = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.x(!isEmpty);
        int i5 = 8;
        if (searchView.f1003U && !searchView.f996N && isEmpty) {
            searchView.f1016u.setVisibility(8);
            i5 = 0;
        }
        searchView.f1018w.setVisibility(i5);
        searchView.t();
        searchView.w();
        charSequence.toString();
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
