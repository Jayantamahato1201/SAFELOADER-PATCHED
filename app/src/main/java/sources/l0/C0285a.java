package l0;

import I.O;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.m;
import v.C0489a;

/* renamed from: l0.a  reason: case insensitive filesystem */
public abstract class C0285a extends C0489a {

    /* renamed from: a  reason: collision with root package name */
    public m f3636a;

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        r(coordinatorLayout, view, i2);
        if (this.f3636a == null) {
            this.f3636a = new m(view);
        }
        m mVar = this.f3636a;
        View view2 = mVar.f1979a;
        mVar.b = view2.getTop();
        mVar.f1980c = view2.getLeft();
        m mVar2 = this.f3636a;
        View view3 = mVar2.f1979a;
        O.k(view3, 0 - (view3.getTop() - mVar2.b));
        O.j(view3, 0 - (view3.getLeft() - mVar2.f1980c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.q(view, i2);
    }
}
