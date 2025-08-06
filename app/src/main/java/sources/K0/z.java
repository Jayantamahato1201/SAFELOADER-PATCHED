package K0;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public final class z extends ThreadPoolExecutor {
    public final void a(int i2) {
        setCorePoolSize(i2);
        setMaximumPoolSize(i2);
    }

    public final Future submit(Runnable runnable) {
        y yVar = new y((C0039f) runnable);
        execute(yVar);
        return yVar;
    }
}
