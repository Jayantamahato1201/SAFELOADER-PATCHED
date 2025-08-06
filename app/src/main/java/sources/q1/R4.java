package q1;

import U0.i;
import android.content.IIntentReceiver;
import android.content.IntentFilter;
import java.lang.reflect.Method;

public final class R4 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        try {
            if (H.f3895m) {
                Class[] parameterTypes = method.getParameterTypes();
                int length = objArr.length - 1;
                if (T4.f4004j) {
                    Number number = objArr[length];
                    if ((number instanceof Integer) && (number.intValue() & 2) == 0 && (number.intValue() & 4) == 0) {
                        objArr[length] = Integer.valueOf(number.intValue() | 2);
                    }
                }
                while (true) {
                    if (length <= 0) {
                        break;
                    }
                    int i2 = length - 1;
                    if (i.a(parameterTypes[length], String.class)) {
                        objArr[length] = null;
                        break;
                    }
                    length = i2;
                }
                IntentFilter intentFilter = (IntentFilter) L3.b(objArr, IntentFilter.class);
                IIntentReceiver iIntentReceiver = (IIntentReceiver) L3.b(objArr, IIntentReceiver.class);
                if (!(intentFilter == null || iIntentReceiver == null)) {
                    d5.f4080a.execute(new Q4(iIntentReceiver, 0, intentFilter));
                }
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}
