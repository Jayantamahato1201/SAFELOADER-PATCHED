package q1;

import android.app.ActivityThread;
import android.app.Application;
import android.app.LoadedApk;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class Q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0 f3960a;
    public static final Object b;

    static {
        C0 c02;
        Object obj;
        try {
            Field declaredField = BroadcastReceiver.class.getDeclaredField("mPendingResult");
            declaredField.setAccessible(true);
            if (!Modifier.isStatic(declaredField.getModifiers())) {
                if (!declaredField.getType().isPrimitive()) {
                    c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                    f3960a = c02;
                    obj = C0455x3.f4236a.allocateInstance(BroadcastReceiver.PendingResult.class);
                    ((C0) new C0351g0("mInitialStickyHint").f4098c).c(obj, Boolean.TRUE);
                    b = obj;
                }
            }
            c02 = new C0351g0(declaredField, 2);
        } catch (Exception unused) {
            c02 = C0.f3864a;
        }
        f3960a = c02;
        try {
            obj = C0455x3.f4236a.allocateInstance(BroadcastReceiver.PendingResult.class);
            ((C0) new C0351g0("mInitialStickyHint").f4098c).c(obj, Boolean.TRUE);
        } catch (Exception unused2) {
            obj = null;
        }
        b = obj;
    }

    public static final void a(LoadedApk loadedApk, Intent intent, String str) {
        BroadcastReceiver broadcastReceiver;
        try {
            C0433u.b.getClass();
            C0 c02 = C0433u.f4200l;
            Object[] objArr = {Boolean.FALSE, C0433u.f4192c.getInstrumentation()};
            ClassLoader classLoader = loadedApk.getClassLoader();
            intent.setExtrasClassLoader(classLoader);
            Context baseContext = ((Application) c02.b(loadedApk, objArr)).getBaseContext();
            if (T4.f) {
                broadcastReceiver = loadedApk.getAppFactory().instantiateReceiver(classLoader, str, intent);
            } else {
                Constructor<?> declaredConstructor = classLoader.loadClass(str).getDeclaredConstructor(H.f3886c);
                declaredConstructor.setAccessible(true);
                broadcastReceiver = (BroadcastReceiver) declaredConstructor.newInstance(H.f3887d);
            }
            f3960a.c(broadcastReceiver, b);
            broadcastReceiver.onReceive(baseContext, intent);
        } catch (Throwable unused) {
        }
    }

    public static final void b(Intent intent, String str) {
        try {
            if (H.f3895m) {
                if (intent.getComponent() == null) {
                    intent.setComponent(new ComponentName(H.f3896n, str));
                }
                C0433u.b.getClass();
                C0433u.f4193d.post(new P0((LoadedApk) C0433u.f4205q.a(), intent, str, 0));
            }
        } catch (Exception unused) {
        }
    }

    public static final void c(IBinder iBinder, Intent intent) {
        try {
            if (T4.f4005k) {
                C0433u.b.getClass();
                ActivityThread.ApplicationThread applicationThread = C0433u.f4192c.getApplicationThread();
                IIntentReceiver asInterface = IIntentReceiver.Stub.asInterface(iBinder);
                Bundle bundle = Bundle.EMPTY;
                int i2 = C0394n1.f4144c;
                applicationThread.scheduleRegisteredReceiver(asInterface, intent, -1, (String) null, bundle, false, false, true, i2, -1, i2, "android");
                return;
            }
            IIntentReceiver.Stub.asInterface(iBinder).performReceive(intent, -1, (String) null, Bundle.EMPTY, false, false, C0394n1.f4144c);
        } catch (Throwable unused) {
        }
    }
}
