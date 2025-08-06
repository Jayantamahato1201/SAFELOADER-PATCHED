package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f1068a;

    public a(SearchView searchView) {
        this.f1068a = searchView;
    }

    public final void onClick(View view) {
        String str;
        SearchView searchView = this.f1068a;
        ImageView imageView = searchView.f1015t;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f1011p;
        if (view == imageView) {
            searchView.y(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f994L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
            }
        } else if (view == searchView.f1017v) {
            searchView.o();
        } else if (view == searchView.f1016u) {
            searchView.s();
        } else if (view == searchView.f1018w) {
            SearchableInfo searchableInfo = searchView.f1007b0;
            if (searchableInfo != null) {
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.f990H);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        if (searchActivity == null) {
                            str = null;
                        } else {
                            str = searchActivity.flattenToShortString();
                        }
                        intent.putExtra("calling_package", str);
                        searchView.getContext().startActivity(intent);
                    } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m(searchView.f991I, searchableInfo));
                    }
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        } else if (view == searchAutoComplete) {
            searchView.n();
        }
    }
}
