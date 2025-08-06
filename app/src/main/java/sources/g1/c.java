package g1;

import java.io.IOException;
import java.lang.reflect.Method;

public final class c extends RuntimeException {

    /* renamed from: g  reason: collision with root package name */
    public static final Method f2880g;
    public IOException f;

    static {
        Method method;
        Class<Throwable> cls = Throwable.class;
        try {
            method = cls.getDeclaredMethod("addSuppressed", new Class[]{cls});
        } catch (Exception unused) {
            method = null;
        }
        f2880g = method;
    }

    public c(IOException iOException) {
        super(iOException);
        this.f = iOException;
    }
}
