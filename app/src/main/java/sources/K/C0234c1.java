package k;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: k.c1  reason: case insensitive filesystem */
public final class C0234c1 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f3445a;

    public C0234c1(SearchView searchView) {
        this.f3445a = searchView;
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        this.f3445a.s();
        return true;
    }
}
