package d1;

import e1.c;
import java.io.Closeable;
import o1.g;

public abstract class I implements Closeable, AutoCloseable {
    public final void close() {
        c.d(l());
    }

    public abstract long k();

    public abstract g l();
}
