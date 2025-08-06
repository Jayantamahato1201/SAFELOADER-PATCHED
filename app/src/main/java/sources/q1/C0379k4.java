package q1;

import android.content.IIntentReceiver;
import java.lang.reflect.Method;

/* renamed from: q1.k4  reason: case insensitive filesystem */
public final class C0379k4 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        IIntentReceiver iIntentReceiver;
        try {
            if (H.f3895m && (iIntentReceiver = (IIntentReceiver) L3.b(objArr, IIntentReceiver.class)) != null) {
                d5.f4080a.execute(new C0373j4(0, iIntentReceiver));
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}
