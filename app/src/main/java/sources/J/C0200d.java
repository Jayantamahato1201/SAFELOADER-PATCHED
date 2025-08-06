package j;

import I.O;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.K;
import k.L;
import k.Q;
import k.R0;
import k.U;

/* renamed from: j.d  reason: case insensitive filesystem */
public final class C0200d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3065a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0200d(int i2, Object obj) {
        this.f3065a = i2;
        this.b = obj;
    }

    public final void onGlobalLayout() {
        Object obj = this.b;
        switch (this.f3065a) {
            case 0:
                C0203g gVar = (C0203g) obj;
                if (gVar.b()) {
                    ArrayList arrayList = gVar.f3075h;
                    if (arrayList.size() > 0) {
                        int i2 = 0;
                        if (!((C0202f) arrayList.get(0)).f3069a.f3392y) {
                            View view = gVar.f3082o;
                            if (view == null || !view.isShown()) {
                                gVar.dismiss();
                                return;
                            }
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((C0202f) obj2).f3069a.f();
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C0195E e2 = (C0195E) obj;
                if (e2.b()) {
                    R0 r02 = e2.f3034h;
                    if (!r02.f3392y) {
                        View view2 = e2.f3039m;
                        if (view2 == null || !view2.isShown()) {
                            e2.dismiss();
                            return;
                        } else {
                            r02.f();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                U u2 = (U) obj;
                if (!u2.getInternalPopup().b()) {
                    u2.f.e(L.b(u2), L.a(u2));
                }
                ViewTreeObserver viewTreeObserver = u2.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    K.a(viewTreeObserver, this);
                    return;
                }
                return;
            default:
                Q q2 = (Q) obj;
                U u3 = q2.f3402H;
                q2.getClass();
                WeakHashMap weakHashMap = O.f393a;
                if (!u3.isAttachedToWindow() || !u3.getGlobalVisibleRect(q2.f3400F)) {
                    q2.dismiss();
                    return;
                }
                q2.s();
                q2.f();
                return;
        }
    }
}
