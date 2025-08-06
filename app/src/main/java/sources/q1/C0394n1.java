package q1;

import android.app.ActivityThread;
import android.content.Context;
import android.os.Build;
import android.os.Process;

/* renamed from: q1.n1  reason: case insensitive filesystem */
public abstract class C0394n1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Context f4143a;
    public static final String b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f4144c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f4145d;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            String[] strArr = {"L"};
            try {
                I0 i02 = new I0(Class.forName("dalvik.system.VMRuntime"));
                i02.a(i02.a((Object) null, "getRuntime", H.f3887d), "setHiddenApiExemptions", new String[][]{strArr});
            } catch (Throwable unused) {
            }
        }
        Context baseContext = ActivityThread.currentApplication().getBaseContext();
        f4143a = baseContext;
        b = baseContext.getPackageName();
        int myUid = Process.myUid();
        f4144c = myUid;
        f4145d = myUid / 100000;
    }
}
