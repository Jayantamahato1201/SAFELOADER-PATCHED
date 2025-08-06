package H0;

import I.B;
import I.O;
import J.b;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import j.C0195E;
import j.C0203g;
import java.util.WeakHashMap;

public final class q implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f316a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(int i2, Object obj) {
        this.f316a = i2;
        this.b = obj;
    }

    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.b;
        switch (this.f316a) {
            case 0:
                s sVar = (s) obj;
                if (sVar.f338u != null && (accessibilityManager = sVar.f337t) != null) {
                    WeakHashMap weakHashMap = O.f393a;
                    if (sVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new b(sVar.f338u));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = O.f393a;
                B.c(view2);
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f316a) {
            case 0:
                s sVar = (s) this.b;
                l lVar = sVar.f338u;
                if (lVar != null && (accessibilityManager = sVar.f337t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new b(lVar));
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                C0203g gVar = (C0203g) this.b;
                ViewTreeObserver viewTreeObserver = gVar.f3091x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f3091x = view.getViewTreeObserver();
                    }
                    gVar.f3091x.removeGlobalOnLayoutListener(gVar.f3076i);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                C0195E e2 = (C0195E) this.b;
                ViewTreeObserver viewTreeObserver2 = e2.f3041o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        e2.f3041o = view.getViewTreeObserver();
                    }
                    e2.f3041o.removeGlobalOnLayoutListener(e2.f3035i);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
