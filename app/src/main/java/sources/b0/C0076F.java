package b0;

import I.C0023o;
import N.g;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: b0.F  reason: case insensitive filesystem */
public abstract class C0076F {

    /* renamed from: a  reason: collision with root package name */
    public C0071A f1569a;
    public ArrayList b;

    /* renamed from: c  reason: collision with root package name */
    public long f1570c;

    /* renamed from: d  reason: collision with root package name */
    public long f1571d;

    /* renamed from: e  reason: collision with root package name */
    public long f1572e;
    public long f;

    public static void b(Y y2) {
        RecyclerView recyclerView;
        int i2 = y2.f1635j;
        if (!y2.f() && (i2 & 4) == 0 && (recyclerView = y2.f1643r) != null) {
            recyclerView.F(y2);
        }
    }

    public abstract boolean a(Y y2, Y y3, C0023o oVar, C0023o oVar2);

    public final void c(Y y2) {
        C0071A a2 = this.f1569a;
        if (a2 != null) {
            boolean z2 = true;
            y2.n(true);
            if (y2.f1633h != null && y2.f1634i == null) {
                y2.f1633h = null;
            }
            y2.f1634i = null;
            if ((y2.f1635j & 16) == 0) {
                RecyclerView recyclerView = a2.f1567a;
                recyclerView.a0();
                g gVar = recyclerView.f1512e;
                C0071A a3 = (C0071A) gVar.b;
                RecyclerView recyclerView2 = a3.f1567a;
                View view = y2.f1628a;
                int indexOfChild = recyclerView2.indexOfChild(view);
                if (indexOfChild == -1) {
                    gVar.H(view);
                } else {
                    C0078b bVar = (C0078b) gVar.f606c;
                    if (bVar.d(indexOfChild)) {
                        bVar.f(indexOfChild);
                        gVar.H(view);
                        a3.h(indexOfChild);
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    Y I2 = RecyclerView.I(view);
                    P p2 = recyclerView.b;
                    p2.j(I2);
                    p2.g(I2);
                }
                recyclerView.b0(!z2);
                if (!z2 && y2.j()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public abstract void d(Y y2);

    public abstract void e();

    public abstract boolean f();
}
