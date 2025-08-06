package M0;

import U0.i;
import java.util.Collection;

public abstract class g extends f {
    public static int A0(Iterable iterable) {
        i.e("<this>", iterable);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
