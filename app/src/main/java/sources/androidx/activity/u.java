package androidx.activity;

import M0.c;
import U0.i;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.D;
import androidx.fragment.app.w;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import com.cheatbox.MainActivity;
import java.util.Iterator;
import java.util.ListIterator;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f879a;
    public final c b = new c();

    /* renamed from: c  reason: collision with root package name */
    public w f880c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f881d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f882e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f883g;

    public u(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f879a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            if (i2 >= 34) {
                onBackInvokedCallback = r.f874a.a(new m(this, 0), new m(this, 1), new n(0, this), new n(1, this));
            } else {
                onBackInvokedCallback = p.f870a.a(new n(2, this));
            }
            this.f881d = onBackInvokedCallback;
        }
    }

    public final void a(r rVar, w wVar) {
        i.e("onBackPressedCallback", wVar);
        t e2 = rVar.e();
        if (e2.f1439c != m.f) {
            wVar.b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, e2, wVar));
            d();
            wVar.f1397c = new t(0, this, u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
        }
    }

    public final void b() {
        Object obj;
        c cVar = this.b;
        cVar.getClass();
        ListIterator listIterator = cVar.listIterator(cVar.f595h);
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((w) obj).f1396a) {
                break;
            }
        }
        w wVar = (w) obj;
        this.f880c = null;
        if (wVar != null) {
            switch (wVar.f1398d) {
                case 0:
                    D d2 = (D) wVar.f1399e;
                    d2.w(true);
                    if (d2.f1204h.f1396a) {
                        d2.J();
                        return;
                    } else {
                        d2.f1203g.b();
                        return;
                    }
                default:
                    int i2 = MainActivity.f1818B;
                    ((MainActivity) wVar.f1399e).getClass();
                    throw null;
            }
        } else {
            this.f879a.run();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f882e;
        OnBackInvokedCallback onBackInvokedCallback = this.f881d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            p pVar = p.f870a;
            if (z2 && !this.f) {
                pVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else if (!z2 && this.f) {
                pVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final void d() {
        boolean z2;
        boolean z3 = this.f883g;
        boolean z4 = false;
        c cVar = this.b;
        if (cVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !cVar.isEmpty()) {
            Iterator it = cVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((w) it.next()).f1396a) {
                        z4 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f883g = z4;
        if (z4 != z3 && Build.VERSION.SDK_INT >= 33) {
            c(z4);
        }
    }
}
