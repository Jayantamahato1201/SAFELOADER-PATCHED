package q1;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/* renamed from: q1.s0  reason: case insensitive filesystem */
public interface C0422s0 extends IInterface {
    ComponentName E0(IBinder iBinder);

    void G0(IBinder iBinder, IBinder iBinder2);

    Intent[] J(IBinder iBinder, Intent[] intentArr, int i2);

    List M0(int i2, long j2);

    Intent N0(IBinder iBinder, Intent intent, int i2);

    void Q(Intent intent, String str);

    void T(IBinder iBinder, String str, String str2, String str3, int i2);

    void a(String str);

    List k(long j2);

    Intent l0(long j2, Intent intent);

    void n0(String str);

    boolean p(String str, String str2);

    boolean w();

    String x();

    String z(IBinder iBinder);

    void z0(IBinder iBinder);
}
