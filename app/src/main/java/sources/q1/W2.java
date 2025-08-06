package q1;

import L0.e;
import T0.p;
import T0.q;
import android.os.storage.StorageVolume;
import java.lang.reflect.Method;
import k.C0241f0;

public final /* synthetic */ class W2 implements p, q {
    public final /* synthetic */ Object f;

    public /* synthetic */ W2(Object obj) {
        this.f = obj;
    }

    public Object c(Object obj, Object obj2, Object obj3) {
        Method method = (Method) obj2;
        Object[] objArr = (Object[]) obj3;
        return (StorageVolume[]) this.f;
    }

    public Object d(Object obj, Object obj2) {
        boolean z2;
        Q2 q2 = (Q2) this.f;
        int intValue = ((Integer) obj2).intValue();
        q2.f3967h = (C0318a3) obj;
        q2.f3968i = intValue;
        H.o(q2);
        if (C0360h3.f4114d == 0) {
            int i2 = 1;
            while (true) {
                if (i2 >= 25) {
                    break;
                }
                try {
                    C0241f0 f0Var = C0360h3.f4112a;
                    synchronized (f0Var) {
                        C0413q2 q2Var = (C0413q2) f0Var.f3459a;
                        if (H.a(q2Var.f4178c, i2, q2Var.f4177a) >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                    i2++;
                } catch (Exception unused) {
                }
            }
            i2 = 0;
            d5.b.execute(new V2(i2, 0));
            C0360h3.f4114d = i2;
        }
        return e.f591c;
    }
}
