package F0;

import I.O;
import J.v;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final /* synthetic */ class b implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f221a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f221a = sideSheetBehavior;
        this.b = i2;
    }

    public final boolean a(View view) {
        String str;
        SideSheetBehavior sideSheetBehavior = this.f221a;
        sideSheetBehavior.getClass();
        int i2 = this.b;
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            if (i2 == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            sb.append(str);
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = sideSheetBehavior.f2070p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.r(i2);
            return true;
        }
        View view2 = (View) sideSheetBehavior.f2070p.get();
        c cVar = new c(sideSheetBehavior, i2, 0);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = O.f393a;
            if (view2.isAttachedToWindow()) {
                view2.post(cVar);
                return true;
            }
        }
        cVar.run();
        return true;
    }
}
