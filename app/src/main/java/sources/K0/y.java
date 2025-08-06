package K0;

import java.util.concurrent.FutureTask;
import q.h;

public final class y extends FutureTask implements Comparable {
    public final C0039f f;

    public y(C0039f fVar) {
        super(fVar, (Object) null);
        this.f = fVar;
    }

    public final int compareTo(Object obj) {
        C0039f fVar = this.f;
        int i2 = fVar.f546w;
        C0039f fVar2 = ((y) obj).f;
        int i3 = fVar2.f546w;
        if (i2 == i3) {
            return fVar.f - fVar2.f;
        }
        return h.b(i3) - h.b(i2);
    }
}
