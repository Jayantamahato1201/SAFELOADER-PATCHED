package b0;

import I.C0023o;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: b0.A  reason: case insensitive filesystem */
public final class C0071A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1567a;

    public /* synthetic */ C0071A(RecyclerView recyclerView) {
        this.f1567a = recyclerView;
    }

    public void a(C0077a aVar) {
        int i2 = aVar.f1646a;
        RecyclerView recyclerView = this.f1567a;
        if (i2 == 1) {
            recyclerView.f1524l.W(aVar.b, aVar.f1647c);
        } else if (i2 == 2) {
            recyclerView.f1524l.Z(aVar.b, aVar.f1647c);
        } else if (i2 == 4) {
            recyclerView.f1524l.a0(aVar.b, aVar.f1647c);
        } else if (i2 == 8) {
            recyclerView.f1524l.Y(aVar.b, aVar.f1647c);
        }
    }

    public Y b(int i2) {
        RecyclerView recyclerView = this.f1567a;
        int x2 = recyclerView.f1512e.x();
        int i3 = 0;
        Y y2 = null;
        while (true) {
            if (i3 >= x2) {
                break;
            }
            Y I2 = RecyclerView.I(recyclerView.f1512e.w(i3));
            if (I2 != null && !I2.h() && I2.f1629c == i2) {
                if (!((ArrayList) recyclerView.f1512e.f607d).contains(I2.f1628a)) {
                    y2 = I2;
                    break;
                }
                y2 = I2;
            }
            i3++;
        }
        if (y2 != null && !((ArrayList) recyclerView.f1512e.f607d).contains(y2.f1628a)) {
            return y2;
        }
        return null;
    }

    public void c(int i2, int i3) {
        int i4;
        int i5;
        RecyclerView recyclerView = this.f1567a;
        int x2 = recyclerView.f1512e.x();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < x2; i7++) {
            View w2 = recyclerView.f1512e.w(i7);
            Y I2 = RecyclerView.I(w2);
            if (I2 != null && !I2.o() && (i5 = I2.f1629c) >= i2 && i5 < i6) {
                I2.a(2);
                I2.a(1024);
                ((K) w2.getLayoutParams()).f1591c = true;
            }
        }
        P p2 = recyclerView.b;
        ArrayList arrayList = p2.f1598c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Y y2 = (Y) arrayList.get(size);
            if (y2 != null && (i4 = y2.f1629c) >= i2 && i4 < i6) {
                y2.a(2);
                p2.e(size);
            }
        }
        recyclerView.f1515g0 = true;
    }

    public void d(int i2, int i3) {
        RecyclerView recyclerView = this.f1567a;
        int x2 = recyclerView.f1512e.x();
        for (int i4 = 0; i4 < x2; i4++) {
            Y I2 = RecyclerView.I(recyclerView.f1512e.w(i4));
            if (I2 != null && !I2.o() && I2.f1629c >= i2) {
                I2.l(i3, false);
                recyclerView.f1509c0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.b.f1598c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Y y2 = (Y) arrayList.get(i5);
            if (y2 != null && y2.f1629c >= i2) {
                y2.l(i3, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1513f0 = true;
    }

    public void e(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f1567a;
        int x2 = recyclerView.f1512e.x();
        int i11 = -1;
        if (i2 < i3) {
            i6 = i2;
            i5 = i3;
            i4 = -1;
        } else {
            i5 = i2;
            i6 = i3;
            i4 = 1;
        }
        for (int i12 = 0; i12 < x2; i12++) {
            Y I2 = RecyclerView.I(recyclerView.f1512e.w(i12));
            if (I2 != null && (i10 = I2.f1629c) >= i6 && i10 <= i5) {
                if (i10 == i2) {
                    I2.l(i3 - i2, false);
                } else {
                    I2.l(i4, false);
                }
                recyclerView.f1509c0.f = true;
            }
        }
        P p2 = recyclerView.b;
        p2.getClass();
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
            i11 = 1;
        }
        ArrayList arrayList = p2.f1598c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Y y2 = (Y) arrayList.get(i13);
            if (y2 != null && (i9 = y2.f1629c) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    y2.l(i3 - i2, false);
                } else {
                    y2.l(i11, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1513f0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(b0.Y r9, I.C0023o r10, I.C0023o r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f1567a
            r0.getClass()
            r1 = 0
            r9.n(r1)
            b0.F r1 = r0.f1489H
            r2 = r1
            b0.i r2 = (b0.C0085i) r2
            if (r10 == 0) goto L_0x0020
            r2.getClass()
            int r4 = r10.f456a
            int r6 = r11.f456a
            if (r4 != r6) goto L_0x0022
            int r1 = r10.b
            int r3 = r11.b
            if (r1 == r3) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = r9
            goto L_0x002c
        L_0x0022:
            int r5 = r10.b
            int r7 = r11.b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L_0x003b
        L_0x002c:
            r2.l(r3)
            android.view.View r9 = r3.f1628a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f1703i
            r9.add(r3)
            r9 = 1
        L_0x003b:
            if (r9 == 0) goto L_0x0040
            r0.S()
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0071A.f(b0.Y, I.o, I.o):void");
    }

    public void g(Y y2, C0023o oVar, C0023o oVar2) {
        int i2;
        int i3;
        boolean z2;
        RecyclerView recyclerView = this.f1567a;
        recyclerView.b.j(y2);
        recyclerView.f(y2);
        y2.n(false);
        C0085i iVar = (C0085i) recyclerView.f1489H;
        iVar.getClass();
        int i4 = oVar.f456a;
        int i5 = oVar.b;
        View view = y2.f1628a;
        if (oVar2 == null) {
            i2 = view.getLeft();
        } else {
            i2 = oVar2.f456a;
        }
        int i6 = i2;
        if (oVar2 == null) {
            i3 = view.getTop();
        } else {
            i3 = oVar2.b;
        }
        int i7 = i3;
        if (y2.h() || (i4 == i6 && i5 == i7)) {
            Y y3 = y2;
            iVar.l(y3);
            iVar.f1702h.add(y3);
            z2 = true;
        } else {
            view.layout(i6, i7, view.getWidth() + i6, view.getHeight() + i7);
            z2 = iVar.g(y2, i4, i5, i6, i7);
        }
        if (z2) {
            recyclerView.S();
        }
    }

    public void h(int i2) {
        RecyclerView recyclerView = this.f1567a;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i2);
    }
}
