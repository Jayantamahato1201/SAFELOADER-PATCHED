package androidx.appcompat.widget;

import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

public final class b implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f1069a;

    public b(SearchView searchView) {
        this.f1069a = searchView;
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        int i3;
        SearchView searchView = this.f1069a;
        if (searchView.f1007b0 != null) {
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1011p;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.l("android.intent.action.SEARCH", (Uri) null, (String) null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.f1007b0 != null && searchView.f997O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i2 == 66 || i2 == 84 || i2 == 61) {
                    searchView.p(searchAutoComplete.getListSelection());
                    return true;
                } else if (i2 == 21 || i2 == 22) {
                    if (i2 == 21) {
                        i3 = 0;
                    } else {
                        i3 = searchAutoComplete.length();
                    }
                    searchAutoComplete.setSelection(i3);
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                    return true;
                } else if (i2 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
