package f0;

import E0.e;
import Q0.l;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.r;
import java.util.ArrayList;

/* renamed from: f0.a  reason: case insensitive filesystem */
public final class C0150a extends m {

    /* renamed from: F  reason: collision with root package name */
    public ArrayList f2632F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f2633G;

    /* renamed from: H  reason: collision with root package name */
    public int f2634H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f2635I;

    /* renamed from: J  reason: collision with root package name */
    public int f2636J;

    public final void A(long j2) {
        ArrayList arrayList;
        this.f2666h = j2;
        if (j2 >= 0 && (arrayList = this.f2632F) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((m) this.f2632F.get(i2)).A(j2);
            }
        }
    }

    public final void B(l lVar) {
        this.f2636J |= 8;
        int size = this.f2632F.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f2632F.get(i2)).B(lVar);
        }
    }

    public final void C(TimeInterpolator timeInterpolator) {
        this.f2636J |= 1;
        ArrayList arrayList = this.f2632F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((m) this.f2632F.get(i2)).C(timeInterpolator);
            }
        }
        this.f2667i = timeInterpolator;
    }

    public final void D(e eVar) {
        super.D(eVar);
        this.f2636J |= 4;
        if (this.f2632F != null) {
            for (int i2 = 0; i2 < this.f2632F.size(); i2++) {
                ((m) this.f2632F.get(i2)).D(eVar);
            }
        }
    }

    public final void E() {
        this.f2636J |= 2;
        int size = this.f2632F.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f2632F.get(i2)).E();
        }
    }

    public final void F(long j2) {
        this.f2665g = j2;
    }

    public final String H(String str) {
        String H2 = super.H(str);
        for (int i2 = 0; i2 < this.f2632F.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((m) this.f2632F.get(i2)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(m mVar) {
        this.f2632F.add(mVar);
        mVar.f2672n = this;
        long j2 = this.f2666h;
        if (j2 >= 0) {
            mVar.A(j2);
        }
        if ((this.f2636J & 1) != 0) {
            mVar.C(this.f2667i);
        }
        if ((this.f2636J & 2) != 0) {
            mVar.E();
        }
        if ((this.f2636J & 4) != 0) {
            mVar.D(this.f2664A);
        }
        if ((this.f2636J & 8) != 0) {
            mVar.B((l) null);
        }
    }

    public final void c() {
        super.c();
        int size = this.f2632F.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f2632F.get(i2)).c();
        }
    }

    public final void d(u uVar) {
        if (t(uVar.b)) {
            ArrayList arrayList = this.f2632F;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                m mVar = (m) obj;
                if (mVar.t(uVar.b)) {
                    mVar.d(uVar);
                    uVar.f2692c.add(mVar);
                }
            }
        }
    }

    public final void f(u uVar) {
        int size = this.f2632F.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f2632F.get(i2)).f(uVar);
        }
    }

    public final void g(u uVar) {
        if (t(uVar.b)) {
            ArrayList arrayList = this.f2632F;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                m mVar = (m) obj;
                if (mVar.t(uVar.b)) {
                    mVar.g(uVar);
                    uVar.f2692c.add(mVar);
                }
            }
        }
    }

    /* renamed from: j */
    public final m clone() {
        C0150a aVar = (C0150a) super.clone();
        aVar.f2632F = new ArrayList();
        int size = this.f2632F.size();
        for (int i2 = 0; i2 < size; i2++) {
            m j2 = ((m) this.f2632F.get(i2)).clone();
            aVar.f2632F.add(j2);
            j2.f2672n = aVar;
        }
        return aVar;
    }

    public final void l(ViewGroup viewGroup, r rVar, r rVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f2665g;
        int size = this.f2632F.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = (m) this.f2632F.get(i2);
            if (j2 > 0 && (this.f2633G || i2 == 0)) {
                long j3 = mVar.f2665g;
                if (j3 > 0) {
                    mVar.F(j3 + j2);
                } else {
                    mVar.F(j2);
                }
            }
            mVar.l(viewGroup, rVar, rVar2, arrayList, arrayList2);
        }
    }

    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f2632F.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f2632F.get(i2)).w(viewGroup);
        }
    }

    public final m x(k kVar) {
        super.x(kVar);
        return this;
    }

    public final void y(View view) {
        super.y(view);
        int size = this.f2632F.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f2632F.get(i2)).y(view);
        }
    }

    public final void z() {
        if (this.f2632F.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.b = this;
        ArrayList arrayList = this.f2632F;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((m) obj).a(rVar);
        }
        this.f2634H = this.f2632F.size();
        if (!this.f2633G) {
            for (int i4 = 1; i4 < this.f2632F.size(); i4++) {
                ((m) this.f2632F.get(i4 - 1)).a(new r((m) this.f2632F.get(i4)));
            }
            m mVar = (m) this.f2632F.get(0);
            if (mVar != null) {
                mVar.z();
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.f2632F;
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((m) obj2).z();
        }
    }
}
