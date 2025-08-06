package androidx.emoji2.text;

import android.util.SparseArray;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f1182a;
    public m b;

    public q(int i2) {
        this.f1182a = new SparseArray(i2);
    }

    public final void a(m mVar, int i2, int i3) {
        q qVar;
        int a2 = mVar.a(i2);
        SparseArray sparseArray = this.f1182a;
        if (sparseArray == null) {
            qVar = null;
        } else {
            qVar = (q) sparseArray.get(a2);
        }
        if (qVar == null) {
            qVar = new q(1);
            sparseArray.put(mVar.a(i2), qVar);
        }
        if (i3 > i2) {
            qVar.a(mVar, i2 + 1, i3);
        } else {
            qVar.b = mVar;
        }
    }
}
