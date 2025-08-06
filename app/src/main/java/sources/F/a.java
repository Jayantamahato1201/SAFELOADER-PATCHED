package F;

import A.j;
import I.O;
import R.e;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import x.C0495c;
import x.C0496d;
import z.C0503b;

public final class a implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f189g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f190h;

    public /* synthetic */ a(Object obj, int i2, Object obj2) {
        this.f = i2;
        this.f189g = obj;
        this.f190h = obj2;
    }

    public final void run() {
        Object obj = this.f189g;
        Object obj2 = this.f190h;
        switch (this.f) {
            case 0:
                C0503b bVar = (C0503b) ((j) obj).b;
                if (bVar != null) {
                    bVar.i((Typeface) obj2);
                    return;
                }
                return;
            case 1:
                ((i) obj).a(obj2);
                return;
            case 2:
                e eVar = ((SwipeDismissBehavior) obj2).f1841a;
                if (eVar != null && eVar.f()) {
                    WeakHashMap weakHashMap = O.f393a;
                    ((View) obj).postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ((C0495c) obj).f4753a = obj2;
                return;
            case 4:
                ((Application) obj).unregisterActivityLifecycleCallbacks((C0495c) obj2);
                return;
            default:
                try {
                    Method method = C0496d.f4759d;
                    if (method != null) {
                        method.invoke(obj, new Object[]{obj2, Boolean.FALSE, "AppCompat recreation"});
                        return;
                    }
                    C0496d.f4760e.invoke(obj, new Object[]{obj2, Boolean.FALSE});
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
        }
    }

    public a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f = 2;
        this.f190h = swipeDismissBehavior;
        this.f189g = view;
    }
}
