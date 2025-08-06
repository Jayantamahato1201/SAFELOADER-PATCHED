package q1;

import android.app.ActivityClient;
import android.app.ActivityTaskManager;
import android.app.ActivityThread;
import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.Method;

/* renamed from: q1.g1  reason: case insensitive filesystem */
public final class C0352g1 extends L3 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0352g1 f4099a = new Object();

    public final Object a(Object obj, Method method, Object[] objArr) {
        Intent intent;
        try {
            IBinder iBinder = objArr[0];
            if (H.f3895m && (iBinder instanceof IBinder)) {
                C0433u.b.getClass();
                ActivityThread.ActivityClientRecord activityClient = C0433u.f4192c.getActivityClient(iBinder);
                if (activityClient != null && (intent = (Intent) ((C0) C0447w1.f4228e.f4098c).a(activityClient)) != null && "android.intent.action.MAIN".equals(intent.getAction()) && intent.hasCategory("android.intent.category.LAUNCHER") && intent.getCategories().size() == 1 && intent.getData() == null && intent.getType() == null) {
                    if (T4.f4003i) {
                        ActivityClient.getInstance().moveActivityTaskToBack(iBinder, false);
                        return null;
                    }
                    ActivityTaskManager.getService().moveActivityTaskToBack(iBinder, false);
                    return null;
                }
            }
        } catch (Throwable unused) {
        }
        return method.invoke(obj, objArr);
    }
}
