package q1;

import M0.d;
import U0.i;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;

/* renamed from: q1.l3  reason: case insensitive filesystem */
public final class C0384l3 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        int C02;
        try {
            Class[] parameterTypes = method.getParameterTypes();
            Class<IBinder> cls = IBinder.class;
            i.e("<this>", parameterTypes);
            int i2 = -1;
            int length = parameterTypes.length - 1;
            if (length >= 0) {
                while (true) {
                    int i3 = length - 1;
                    if (cls.equals(parameterTypes[length])) {
                        i2 = length;
                        break;
                    } else if (i3 < 0) {
                        break;
                    } else {
                        length = i3;
                    }
                }
            }
            if (i2 >= 0 && (C02 = d.C0(Intent.class, parameterTypes)) >= 0) {
                Intent intent = (Intent) objArr[C02];
                IBinder iBinder = (IBinder) objArr[i2];
                Intent intent2 = new Intent();
                if (intent != null) {
                    intent2.putExtra("mundo_base_bundle", intent);
                }
                if (iBinder != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBinder("mundo_am_service", iBinder);
                    intent2.putExtras(bundle);
                }
                objArr[C02] = intent2;
            }
        } catch (Exception unused) {
        }
        return super.a(obj, method, objArr);
    }
}
