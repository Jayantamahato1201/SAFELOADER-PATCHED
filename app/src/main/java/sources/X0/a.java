package X0;

import U0.i;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends W0.a {
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d("current()", current);
        return current;
    }
}
