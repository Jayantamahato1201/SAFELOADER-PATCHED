package F;

import A.g;
import I.b0;
import I.g0;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.C0051h;
import androidx.fragment.app.N;
import java.util.ArrayList;

public final class p implements Runnable {
    public final /* synthetic */ int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public Object f216g;

    /* renamed from: h  reason: collision with root package name */
    public Object f217h;

    /* renamed from: i  reason: collision with root package name */
    public Object f218i;

    public /* synthetic */ p() {
    }

    public final void run() {
        Object obj;
        switch (this.f) {
            case 0:
                try {
                    obj = ((h) this.f216g).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f218i).post(new a((Object) (i) this.f217h, 1, obj));
                return;
            case 1:
                b0.h((View) this.f216g, (c) this.f217h);
                ((ValueAnimator) this.f218i).start();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f216g;
                N n2 = (N) this.f217h;
                if (arrayList.contains(n2)) {
                    arrayList.remove(n2);
                    ((C0051h) this.f218i).getClass();
                    g.a(n2.f1267c.f1346E, n2.f1266a);
                    return;
                }
                return;
        }
    }

    public p(C0051h hVar, ArrayList arrayList, N n2) {
        this.f218i = hVar;
        this.f216g = arrayList;
        this.f217h = n2;
    }

    public p(View view, g0 g0Var, c cVar, ValueAnimator valueAnimator) {
        this.f216g = view;
        this.f217h = cVar;
        this.f218i = valueAnimator;
    }
}
