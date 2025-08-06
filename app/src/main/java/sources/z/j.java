package Z;

import android.view.Choreographer;

public abstract class j {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new i(runnable));
    }
}
