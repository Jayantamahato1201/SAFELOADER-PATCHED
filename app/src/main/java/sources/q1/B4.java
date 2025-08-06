package q1;

import T0.l;
import android.app.servertransaction.ClientTransaction;
import java.lang.reflect.Method;
import java.util.List;

public final class B4 implements l {
    public final C0 f;

    public B4() {
        C0 c02;
        try {
            Method declaredMethod = ClientTransaction.class.getDeclaredMethod("getCallbacks", H.f3886c);
            declaredMethod.setAccessible(true);
            c02 = new C0351g0(declaredMethod, 1);
        } catch (Exception unused) {
            c02 = C0.f3864a;
        }
        this.f = c02;
    }

    public final Object e(Object obj) {
        return (List) this.f.b((ClientTransaction) obj, new Object[0]);
    }
}
