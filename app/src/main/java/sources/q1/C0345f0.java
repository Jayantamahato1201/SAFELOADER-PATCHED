package q1;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q1.f0  reason: case insensitive filesystem */
public interface C0345f0 extends IInterface {
    boolean B0(String str);

    ResolveInfo D0(Intent intent, String str, int i2);

    String[] F0(int i2);

    ApplicationInfo I0(int i2, String str);

    ProviderInfo L0(ComponentName componentName);

    void O(List list);

    ActivityInfo O0(ComponentName componentName);

    ArrayList P(String str, String str2);

    PackageInfo R(int i2, String str);

    ArrayList U(int i2);

    boolean V(String str);

    String[] X(int[] iArr);

    int a(String str);

    List b(Intent intent, String str, int i2);

    List c(Intent intent, String str, int i2);

    List d(Intent intent, String str, int i2);

    void d0(String str, String str2);

    List e(Intent intent, String str, int i2);

    ResolveInfo e0(Intent intent, String str, int i2);

    ArrayList f0(int i2);

    String g(int i2);

    int i0(String str);

    ServiceInfo j(ComponentName componentName);

    int o0(ComponentName componentName);

    ActivityInfo u(ComponentName componentName);

    boolean u0(String str);

    ProviderInfo w0(String str);

    String x0(String str);

    int y(int i2, String str);

    void y0(ComponentName componentName, int i2);
}
