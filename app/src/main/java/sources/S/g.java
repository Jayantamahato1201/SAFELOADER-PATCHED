package s;

import java.util.ArrayList;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f4466m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f4459e = 2;
        } else {
            this.f4459e = 3;
        }
    }

    public final void d(int i2) {
        if (!this.f4463j) {
            this.f4463j = true;
            this.f4460g = i2;
            ArrayList arrayList = this.f4464k;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                d dVar = (d) obj;
                dVar.a(dVar);
            }
        }
    }
}
