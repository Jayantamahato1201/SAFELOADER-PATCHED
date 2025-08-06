package q1;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;

/* renamed from: q1.b4  reason: case insensitive filesystem */
public interface C0325b4 extends IInterface {
    ComponentName A(Intent intent, String str);

    IBinder C0(String str, String str2, ProviderInfo[] providerInfoArr, String[] strArr, int i2);

    int H(Intent intent, String str);

    boolean K(IBinder iBinder, Intent intent, IBinder iBinder2);

    boolean R0(IBinder iBinder);

    int g0(Intent intent, String str, int i2);

    IBinder h(ComponentName componentName, String str);

    ArrayList l(int i2);

    void m(IBinder iBinder);

    boolean m0(String str, String str2);

    int n(Intent intent, IBinder iBinder, String str);

    boolean p0(ComponentName componentName, IBinder iBinder, int i2);

    void q0(int i2, IBinder iBinder, IntentFilter intentFilter);

    void v0(String str, String str2);
}
