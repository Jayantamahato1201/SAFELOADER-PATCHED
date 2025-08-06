package F;

import android.os.Process;

public final class n extends Thread {
    public final int f = 10;

    public n(Runnable runnable) {
        super(runnable, "fonts-androidx");
    }

    public final void run() {
        Process.setThreadPriority(this.f);
        super.run();
    }
}
