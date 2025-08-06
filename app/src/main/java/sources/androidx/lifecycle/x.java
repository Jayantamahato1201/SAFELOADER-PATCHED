package androidx.lifecycle;

import A.g;
import A.j;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C0055l;
import androidx.fragment.app.D;
import java.util.Map;
import l.C0284a;
import m.c;
import m.d;
import m.f;

public class x {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1448j = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1449a = new Object();
    public final f b = new f();

    /* renamed from: c  reason: collision with root package name */
    public int f1450c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1451d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f1452e;
    public volatile Object f;

    /* renamed from: g  reason: collision with root package name */
    public int f1453g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1454h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1455i;

    public x() {
        Object obj = f1448j;
        this.f = obj;
        this.f1452e = obj;
        this.f1453g = -1;
    }

    public static void a(String str) {
        C0284a.f0().f3632l.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(g.i("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(w wVar) {
        if (wVar.b) {
            if (!wVar.e()) {
                wVar.c(false);
                return;
            }
            int i2 = wVar.f1446c;
            int i3 = this.f1453g;
            if (i2 < i3) {
                wVar.f1446c = i3;
                j jVar = wVar.f1445a;
                Object obj = this.f1452e;
                jVar.getClass();
                if (((r) obj) != null) {
                    C0055l lVar = (C0055l) jVar.b;
                    if (lVar.f1324W) {
                        View x2 = lVar.x();
                        if (x2.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        } else if (lVar.f1328a0 != null) {
                            if (D.D(3)) {
                                Log.d("FragmentManager", "DialogFragment " + jVar + " setting the content view on " + lVar.f1328a0);
                            }
                            lVar.f1328a0.setContentView(x2);
                        }
                    }
                }
            }
        }
    }

    public final void c(w wVar) {
        if (this.f1454h) {
            this.f1455i = true;
            return;
        }
        this.f1454h = true;
        do {
            this.f1455i = false;
            if (wVar == null) {
                f fVar = this.b;
                fVar.getClass();
                d dVar = new d(fVar);
                fVar.f3659h.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((w) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1455i) {
                        break;
                    }
                }
            } else {
                b(wVar);
                wVar = null;
            }
        } while (this.f1455i);
        this.f1454h = false;
    }

    public final void d(j jVar) {
        Object obj;
        a("observeForever");
        w wVar = new w(this, jVar);
        f fVar = this.b;
        c a2 = fVar.a(jVar);
        if (a2 != null) {
            obj = a2.f3653g;
        } else {
            c cVar = new c(jVar, wVar);
            fVar.f3660i++;
            c cVar2 = fVar.f3658g;
            if (cVar2 == null) {
                fVar.f = cVar;
                fVar.f3658g = cVar;
            } else {
                cVar2.f3654h = cVar;
                cVar.f3655i = cVar2;
                fVar.f3658g = cVar;
            }
            obj = null;
        }
        w wVar2 = (w) obj;
        if (wVar2 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (wVar2 == null) {
            wVar.c(true);
        }
    }

    public final void e(Object obj) {
        a("setValue");
        this.f1453g++;
        this.f1452e = obj;
        c((w) null);
    }
}
