package androidx.activity;

import L0.e;
import M0.c;
import T0.l;
import U0.i;
import U0.j;
import androidx.fragment.app.w;
import java.util.ListIterator;

public final class m extends j implements l {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f867g;

    public /* synthetic */ m(u uVar, int i2) {
        this.f = i2;
        this.f867g = uVar;
    }

    public final Object e(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f) {
            case 0:
                i.e("backEvent", (b) obj);
                u uVar = this.f867g;
                c cVar = uVar.b;
                ListIterator listIterator = cVar.listIterator(cVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((w) obj2).f1396a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                uVar.f880c = (w) obj2;
                return e.f591c;
            default:
                i.e("backEvent", (b) obj);
                c cVar2 = this.f867g.b;
                ListIterator listIterator2 = cVar2.listIterator(cVar2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj3 = listIterator2.previous();
                        if (((w) obj3).f1396a) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                w wVar = (w) obj3;
                return e.f591c;
        }
    }
}
