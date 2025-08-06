package b0;

import I.C0023o;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: b0.i  reason: case insensitive filesystem */
public final class C0085i extends C0076F {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f1700s;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1701g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f1702h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f1703i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f1704j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f1705k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f1706l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f1707m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f1708n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f1709o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f1710p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f1711q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f1712r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Y) arrayList.get(size)).f1628a.animate().cancel();
        }
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, b0.g] */
    public final boolean a(Y y2, Y y3, C0023o oVar, C0023o oVar2) {
        int i2;
        int i3;
        int i4 = oVar.f456a;
        int i5 = oVar.b;
        if (y3.o()) {
            int i6 = oVar.f456a;
            i2 = oVar.b;
            i3 = i6;
        } else {
            i3 = oVar2.f456a;
            i2 = oVar2.b;
        }
        if (y2 == y3) {
            return g(y2, i4, i5, i3, i2);
        }
        Y y4 = y2;
        View view = y4.f1628a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(y4);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(y3);
        View view2 = y3.f1628a;
        view2.setTranslationX((float) (-((int) (((float) (i3 - i4)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i2 - i5)) - translationY))));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f1705k;
        ? obj = new Object();
        obj.f1684a = y4;
        obj.b = y3;
        obj.f1685c = i4;
        obj.f1686d = i5;
        obj.f1687e = i3;
        obj.f = i2;
        arrayList.add(obj);
        return true;
    }

    public final void d(Y y2) {
        View view = y2.f1628a;
        view.animate().cancel();
        ArrayList arrayList = this.f1704j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0084h) arrayList.get(size)).f1692a == y2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(y2);
                arrayList.remove(size);
            }
        }
        j(this.f1705k, y2);
        if (this.f1702h.remove(y2)) {
            view.setAlpha(1.0f);
            c(y2);
        }
        if (this.f1703i.remove(y2)) {
            view.setAlpha(1.0f);
            c(y2);
        }
        ArrayList arrayList2 = this.f1708n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, y2);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f1707m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0084h) arrayList5.get(size4)).f1692a == y2) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(y2);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f1706l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(y2)) {
                view.setAlpha(1.0f);
                c(y2);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f1711q.remove(y2);
        this.f1709o.remove(y2);
        this.f1712r.remove(y2);
        this.f1710p.remove(y2);
        i();
    }

    public final void e() {
        ArrayList arrayList = this.f1704j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0084h hVar = (C0084h) arrayList.get(size);
            View view = hVar.f1692a.f1628a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(hVar.f1692a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f1702h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((Y) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f1703i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            Y y2 = (Y) arrayList3.get(size3);
            y2.f1628a.setAlpha(1.0f);
            c(y2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f1705k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0083g gVar = (C0083g) arrayList4.get(size4);
            Y y3 = gVar.f1684a;
            if (y3 != null) {
                k(gVar, y3);
            }
            Y y4 = gVar.b;
            if (y4 != null) {
                k(gVar, y4);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f1707m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0084h hVar2 = (C0084h) arrayList6.get(size6);
                    View view2 = hVar2.f1692a.f1628a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(hVar2.f1692a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f1706l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    Y y5 = (Y) arrayList8.get(size8);
                    y5.f1628a.setAlpha(1.0f);
                    c(y5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f1708n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0083g gVar2 = (C0083g) arrayList10.get(size10);
                    Y y6 = gVar2.f1684a;
                    if (y6 != null) {
                        k(gVar2, y6);
                    }
                    Y y7 = gVar2.b;
                    if (y7 != null) {
                        k(gVar2, y7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f1711q);
            h(this.f1710p);
            h(this.f1709o);
            h(this.f1712r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public final boolean f() {
        if (!this.f1703i.isEmpty() || !this.f1705k.isEmpty() || !this.f1704j.isEmpty() || !this.f1702h.isEmpty() || !this.f1710p.isEmpty() || !this.f1711q.isEmpty() || !this.f1709o.isEmpty() || !this.f1712r.isEmpty() || !this.f1707m.isEmpty() || !this.f1706l.isEmpty() || !this.f1708n.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [b0.h, java.lang.Object] */
    public final boolean g(Y y2, int i2, int i3, int i4, int i5) {
        View view = y2.f1628a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) y2.f1628a.getTranslationY());
        l(y2);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            c(y2);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        ArrayList arrayList = this.f1704j;
        ? obj = new Object();
        obj.f1692a = y2;
        obj.b = translationX;
        obj.f1693c = translationY;
        obj.f1694d = i4;
        obj.f1695e = i5;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void j(ArrayList arrayList, Y y2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0083g gVar = (C0083g) arrayList.get(size);
            if (k(gVar, y2) && gVar.f1684a == null && gVar.b == null) {
                arrayList.remove(gVar);
            }
        }
    }

    public final boolean k(C0083g gVar, Y y2) {
        if (gVar.b == y2) {
            gVar.b = null;
        } else if (gVar.f1684a != y2) {
            return false;
        } else {
            gVar.f1684a = null;
        }
        y2.f1628a.setAlpha(1.0f);
        View view = y2.f1628a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(y2);
        return true;
    }

    public final void l(Y y2) {
        if (f1700s == null) {
            f1700s = new ValueAnimator().getInterpolator();
        }
        y2.f1628a.animate().setInterpolator(f1700s);
        d(y2);
    }
}
