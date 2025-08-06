package b0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: b0.c  reason: case insensitive filesystem */
public final class C0079c implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1652g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0085i f1653h;

    public /* synthetic */ C0079c(C0085i iVar, ArrayList arrayList, int i2) {
        this.f = i2;
        this.f1653h = iVar;
        this.f1652g = arrayList;
    }

    public final void run() {
        View view;
        switch (this.f) {
            case 0:
                ArrayList arrayList = this.f1652g;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    C0085i iVar = this.f1653h;
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        C0084h hVar = (C0084h) obj;
                        Y y2 = hVar.f1692a;
                        iVar.getClass();
                        View view2 = y2.f1628a;
                        int i3 = hVar.f1694d - hVar.b;
                        int i4 = hVar.f1695e - hVar.f1693c;
                        if (i3 != 0) {
                            view2.animate().translationX(0.0f);
                        }
                        if (i4 != 0) {
                            view2.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        iVar.f1710p.add(y2);
                        animate.setDuration(iVar.f1572e).setListener(new C0081e(iVar, y2, i3, view2, i4, animate)).start();
                    } else {
                        arrayList.clear();
                        iVar.f1707m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f1652g;
                int size2 = arrayList2.size();
                int i5 = 0;
                while (true) {
                    C0085i iVar2 = this.f1653h;
                    if (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        C0083g gVar = (C0083g) obj2;
                        iVar2.getClass();
                        Y y3 = gVar.f1684a;
                        View view3 = null;
                        if (y3 == null) {
                            view = null;
                        } else {
                            view = y3.f1628a;
                        }
                        Y y4 = gVar.b;
                        if (y4 != null) {
                            view3 = y4.f1628a;
                        }
                        View view4 = view3;
                        ArrayList arrayList3 = iVar2.f1712r;
                        long j2 = iVar2.f;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j2);
                            arrayList3.add(gVar.f1684a);
                            duration.translationX((float) (gVar.f1687e - gVar.f1685c));
                            duration.translationY((float) (gVar.f - gVar.f1686d));
                            duration.alpha(0.0f).setListener(new C0082f(iVar2, gVar, duration, view, 0)).start();
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator animate2 = view4.animate();
                            arrayList3.add(gVar.b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0082f(iVar2, gVar, animate2, view4, 1)).start();
                        }
                    } else {
                        arrayList2.clear();
                        iVar2.f1708n.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.f1652g;
                int size3 = arrayList4.size();
                int i6 = 0;
                while (true) {
                    C0085i iVar3 = this.f1653h;
                    if (i6 < size3) {
                        Object obj3 = arrayList4.get(i6);
                        i6++;
                        Y y5 = (Y) obj3;
                        iVar3.getClass();
                        View view5 = y5.f1628a;
                        ViewPropertyAnimator animate3 = view5.animate();
                        iVar3.f1709o.add(y5);
                        animate3.alpha(1.0f).setDuration(iVar3.f1570c).setListener(new C0080d(iVar3, y5, view5, animate3)).start();
                    } else {
                        arrayList4.clear();
                        iVar3.f1706l.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}
