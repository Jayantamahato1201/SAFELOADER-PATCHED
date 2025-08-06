package q1;

import java.util.ArrayList;

/* renamed from: q1.d3  reason: case insensitive filesystem */
public final class C0336d3 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4079a = new ArrayList();
    public final /* synthetic */ C0372j3 b;

    public C0336d3(C0372j3 j3Var) {
        this.b = j3Var;
    }

    public final void a() {
        ArrayList arrayList = this.f4079a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            this.b.remove((Z2) obj);
        }
    }
}
