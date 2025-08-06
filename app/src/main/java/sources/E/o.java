package e;

import A.i;
import F.c;
import I.B;
import I.O;
import I.W;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

public final class o extends i {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f2532o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f2533p;

    public /* synthetic */ o(int i2, Object obj) {
        this.f2532o = i2;
        this.f2533p = obj;
    }

    public final void a() {
        Object obj = this.f2533p;
        switch (this.f2532o) {
            case 0:
                x xVar = ((m) obj).f2530g;
                xVar.f2603v.setAlpha(1.0f);
                xVar.f2606y.d((W) null);
                xVar.f2606y = null;
                return;
            case 1:
                x xVar2 = (x) obj;
                xVar2.f2603v.setAlpha(1.0f);
                xVar2.f2606y.d((W) null);
                xVar2.f2606y = null;
                return;
            default:
                c cVar = (c) obj;
                ((x) cVar.f194c).f2603v.setVisibility(8);
                x xVar3 = (x) cVar.f194c;
                PopupWindow popupWindow = xVar3.f2604w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (xVar3.f2603v.getParent() instanceof View) {
                    WeakHashMap weakHashMap = O.f393a;
                    B.c((View) xVar3.f2603v.getParent());
                }
                xVar3.f2603v.e();
                xVar3.f2606y.d((W) null);
                xVar3.f2606y = null;
                ViewGroup viewGroup = xVar3.f2560A;
                WeakHashMap weakHashMap2 = O.f393a;
                B.c(viewGroup);
                return;
        }
    }

    public void c() {
        Object obj = this.f2533p;
        switch (this.f2532o) {
            case 0:
                ((m) obj).f2530g.f2603v.setVisibility(0);
                return;
            case 1:
                x xVar = (x) obj;
                xVar.f2603v.setVisibility(0);
                if (xVar.f2603v.getParent() instanceof View) {
                    WeakHashMap weakHashMap = O.f393a;
                    B.c((View) xVar.f2603v.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
