package e;

import java.util.concurrent.Executor;

/* renamed from: e.E  reason: case insensitive filesystem */
public final class C0123E implements Executor {
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
