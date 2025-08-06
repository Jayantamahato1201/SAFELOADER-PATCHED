package b0;

import android.util.SparseArray;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f1596a;
    public int b;

    public final N a(int i2) {
        SparseArray sparseArray = this.f1596a;
        N n2 = (N) sparseArray.get(i2);
        if (n2 != null) {
            return n2;
        }
        N n3 = new N();
        sparseArray.put(i2, n3);
        return n3;
    }
}
