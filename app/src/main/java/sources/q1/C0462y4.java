package q1;

import android.bluetooth.IBluetoothManagerCallback;
import java.lang.reflect.Method;

/* renamed from: q1.y4  reason: case insensitive filesystem */
public final class C0462y4 extends L3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ E4 f4253a;
    public final /* synthetic */ L3 b;

    public C0462y4(E4 e4, L3 l3) {
        this.f4253a = e4;
        this.b = l3;
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        L3 l3 = this.b;
        E4 e4 = this.f4253a;
        try {
            IBluetoothManagerCallback iBluetoothManagerCallback = objArr[0];
            if (iBluetoothManagerCallback instanceof IBluetoothManagerCallback) {
                Object obj2 = e4.get(iBluetoothManagerCallback);
                if (obj2 == null) {
                    obj2 = new S4(iBluetoothManagerCallback, l3);
                    e4.put(iBluetoothManagerCallback, obj2);
                }
                objArr[0] = obj2;
            }
        } catch (Throwable unused) {
        }
        Object invoke = method.invoke(obj, objArr);
        if (invoke == null) {
            return null;
        }
        return H.g(invoke, l3);
    }
}
