package e;

import A.i;
import F.c;
import I.B;
import I.O;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: e.I  reason: case insensitive filesystem */
public final class C0127I extends i {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f2442o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ C0129K f2443p;

    public /* synthetic */ C0127I(C0129K k2, int i2) {
        this.f2442o = i2;
        this.f2443p = k2;
    }

    public final void a() {
        View view;
        C0129K k2 = this.f2443p;
        switch (this.f2442o) {
            case 0:
                if (k2.f2472z && (view = k2.f2464r) != null) {
                    view.setTranslationY(0.0f);
                    k2.f2461o.setTranslationY(0.0f);
                }
                k2.f2461o.setVisibility(8);
                k2.f2461o.setTransitioning(false);
                k2.D = null;
                c cVar = k2.f2468v;
                if (cVar != null) {
                    cVar.D(k2.f2467u);
                    k2.f2467u = null;
                    k2.f2468v = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2460n;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = O.f393a;
                    B.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                k2.D = null;
                k2.f2461o.requestLayout();
                return;
        }
    }
}
