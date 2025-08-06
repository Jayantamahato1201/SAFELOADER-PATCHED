package q1;

import java.util.AbstractSet;
import java.util.Iterator;

public final class H0 extends AbstractSet {
    public final /* synthetic */ C0418r2 f;

    public H0(C0418r2 r2Var) {
        this.f = r2Var;
    }

    public final Iterator iterator() {
        return new M0(this.f);
    }

    public final int size() {
        return ((E4) this.f.b).f3875h;
    }
}
