package k;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.cheatbox.R;

/* renamed from: k.b1  reason: case insensitive filesystem */
public final class C0231b1 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3443a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0231b1(int i2, Object obj) {
        this.f3443a = i2;
        this.b = obj;
    }

    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        switch (this.f3443a) {
            case 0:
                SearchView searchView = (SearchView) this.b;
                View view2 = searchView.f1019x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f1013r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = D1.a(searchView);
                    if (searchView.f995M) {
                        i10 = resources.getDimensionPixelSize(R.dimen.MT_Bin) + resources.getDimensionPixelSize(R.dimen.MT_Bin);
                    } else {
                        i10 = 0;
                    }
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f1011p;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (a2) {
                        i11 = -rect.left;
                    } else {
                        i11 = paddingLeft - (rect.left + i10);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i11);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i10) - paddingLeft);
                    return;
                }
                return;
            default:
                throw null;
        }
    }
}
