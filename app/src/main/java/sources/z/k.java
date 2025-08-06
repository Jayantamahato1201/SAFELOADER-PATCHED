package Z;

import android.os.Handler;
import android.os.Looper;

public abstract class k {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
