package k;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import i.C0177b;
import j.C0196F;
import j.C0209m;
import j.C0211o;
import j.z;
import java.util.ArrayList;

public final class r1 implements z {

    /* renamed from: a  reason: collision with root package name */
    public C0209m f3557a;
    public C0211o b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Toolbar f3558c;

    public r1(Toolbar toolbar) {
        this.f3558c = toolbar;
    }

    public final void c(Context context, C0209m mVar) {
        C0211o oVar;
        C0209m mVar2 = this.f3557a;
        if (!(mVar2 == null || (oVar = this.b) == null)) {
            mVar2.d(oVar);
        }
        this.f3557a = mVar;
    }

    public final boolean d() {
        return false;
    }

    public final boolean e(C0211o oVar) {
        Toolbar toolbar = this.f3558c;
        toolbar.c();
        ViewParent parent = toolbar.f1046h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1046h);
            }
            toolbar.addView(toolbar.f1046h);
        }
        View actionView = oVar.getActionView();
        toolbar.f1047i = actionView;
        this.b = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1047i);
            }
            s1 h2 = Toolbar.h();
            h2.f3563a = (toolbar.f1052n & 112) | 8388611;
            h2.b = 2;
            toolbar.f1047i.setLayoutParams(h2);
            toolbar.addView(toolbar.f1047i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (!(((s1) childAt.getLayoutParams()).b == 2 || childAt == toolbar.f1041a)) {
                toolbar.removeViewAt(childCount);
                toolbar.f1028E.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.f3130C = true;
        oVar.f3142n.p(false);
        View view = toolbar.f1047i;
        if (view instanceof C0177b) {
            ((C0177b) view).c();
        }
        toolbar.u();
        return true;
    }

    public final void g() {
        if (this.b != null) {
            C0209m mVar = this.f3557a;
            if (mVar != null) {
                int size = mVar.f.size();
                int i2 = 0;
                while (i2 < size) {
                    if (this.f3557a.getItem(i2) != this.b) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
            h(this.b);
        }
    }

    public final boolean h(C0211o oVar) {
        Toolbar toolbar = this.f3558c;
        View view = toolbar.f1047i;
        if (view instanceof C0177b) {
            ((C0177b) view).e();
        }
        toolbar.removeView(toolbar.f1047i);
        toolbar.removeView(toolbar.f1046h);
        toolbar.f1047i = null;
        ArrayList arrayList = toolbar.f1028E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        oVar.f3130C = false;
        oVar.f3142n.p(false);
        toolbar.u();
        return true;
    }

    public final boolean k(C0196F f) {
        return false;
    }

    public final void a(C0209m mVar, boolean z2) {
    }
}
