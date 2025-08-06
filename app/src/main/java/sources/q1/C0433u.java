package q1;

import A.j;
import M0.d;
import T0.a;
import U0.i;
import android.app.ActivityThread;
import android.app.Application;
import android.app.IActivityManager;
import android.app.Instrumentation;
import android.app.LoadedApk;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.security.net.config.NetworkSecurityConfigProvider;
import com.cheatbox.App;
import i0.l;
import i0.p;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: q1.u  reason: case insensitive filesystem */
public final class C0433u extends T2 {

    /* renamed from: A  reason: collision with root package name */
    public static final C0351g0 f4191A = new C0351g0("mProvider");
    public static final C0433u b;

    /* renamed from: c  reason: collision with root package name */
    public static final ActivityThread f4192c;

    /* renamed from: d  reason: collision with root package name */
    public static final Handler f4193d;

    /* renamed from: e  reason: collision with root package name */
    public static final C0 f4194e;
    public static final Object f;

    /* renamed from: g  reason: collision with root package name */
    public static final C0 f4195g;

    /* renamed from: h  reason: collision with root package name */
    public static final C0 f4196h;

    /* renamed from: i  reason: collision with root package name */
    public static final C0 f4197i;

    /* renamed from: j  reason: collision with root package name */
    public static final C0 f4198j;

    /* renamed from: k  reason: collision with root package name */
    public static final C0 f4199k;

    /* renamed from: l  reason: collision with root package name */
    public static final C0 f4200l;

    /* renamed from: m  reason: collision with root package name */
    public static final C0 f4201m = C0452x0.a(ActivityThread.class, "mInitialApplication");

    /* renamed from: n  reason: collision with root package name */
    public static final ConditionVariable f4202n = new ConditionVariable();

    /* renamed from: o  reason: collision with root package name */
    public static a f4203o = new C0421s(0);

    /* renamed from: p  reason: collision with root package name */
    public static final C0 f4204p;

    /* renamed from: q  reason: collision with root package name */
    public static a f4205q = new C0421s(1);

    /* renamed from: r  reason: collision with root package name */
    public static final Map f4206r;

    /* renamed from: s  reason: collision with root package name */
    public static final C0 f4207s;

    /* renamed from: t  reason: collision with root package name */
    public static final Class f4208t;

    /* renamed from: u  reason: collision with root package name */
    public static final C0 f4209u;

    /* renamed from: v  reason: collision with root package name */
    public static final C0 f4210v;

    /* renamed from: w  reason: collision with root package name */
    public static final C0 f4211w;

    /* renamed from: x  reason: collision with root package name */
    public static final C0 f4212x;

    /* renamed from: y  reason: collision with root package name */
    public static final Constructor f4213y;

    /* renamed from: z  reason: collision with root package name */
    public static final Map f4214z;

    /* JADX WARNING: type inference failed for: r7v0, types: [android.os.Binder, q1.u, android.os.IInterface] */
    static {
        Handler handler;
        String str;
        Class cls;
        Constructor<?> constructor;
        C0 c02;
        Class cls2 = String.class;
        Class cls3 = Context.class;
        C0 c03 = C0.f3864a;
        ? binder = new Binder();
        binder.attachInterface(binder, "top.bienvenido.mundo.IApplicationThread");
        b = binder;
        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
        f4192c = currentActivityThread;
        try {
            if (T4.f4003i) {
                handler = currentActivityThread.getHandler();
            } else {
                try {
                    Field declaredField = ActivityThread.class.getDeclaredField("mH");
                    declaredField.setAccessible(true);
                    if (!Modifier.isStatic(declaredField.getModifiers())) {
                        if (!declaredField.getType().isPrimitive()) {
                            c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                            handler = (Handler) c02.a(currentActivityThread);
                        }
                    }
                    c02 = new C0351g0(declaredField, 2);
                } catch (Exception unused) {
                    c02 = c03;
                }
                handler = (Handler) c02.a(currentActivityThread);
            }
        } catch (Throwable unused2) {
            handler = new Handler(Looper.getMainLooper());
        }
        f4193d = handler;
        f4194e = C0452x0.b(ActivityThread.class, "installContentProviders", new Class[]{cls3, List.class});
        ActivityThread activityThread = f4192c;
        Object a2 = ((C0) new C0351g0("mBoundApplication").f4098c).a(activityThread);
        f = a2;
        Class<?> cls4 = a2.getClass();
        f4195g = C0452x0.a(cls4, "providers");
        f4196h = C0452x0.a(cls4, "restrictedBackupMode");
        f4197i = C0452x0.a(cls4, "appInfo");
        f4198j = C0452x0.a(cls4, "info");
        f4199k = C0452x0.a(cls4, "processName");
        Class<LoadedApk> cls5 = LoadedApk.class;
        if (T4.f4004j) {
            str = "makeApplicationInner";
        } else {
            str = "makeApplication";
        }
        f4200l = C0452x0.b(cls5, str, new Class[]{Boolean.TYPE, Instrumentation.class});
        f4204p = C0452x0.b(Process.class, "setArgV0", new Class[]{cls2});
        f4206r = (Map) C0452x0.a(ActivityThread.class, "mServices").a(activityThread);
        Class<Service> cls6 = Service.class;
        f4207s = C0452x0.b(cls6, "attach", new Class[]{cls3, ActivityThread.class, cls2, IBinder.class, Application.class, Object.class});
        try {
            cls = Class.forName("android.app.ContextImpl");
        } catch (Exception unused3) {
            cls = cls3;
        }
        f4208t = cls;
        f4209u = C0452x0.b(cls, "createAppContext", new Class[]{ActivityThread.class, LoadedApk.class});
        f4210v = C0452x0.b(cls, "setOuterContext", new Class[]{cls3});
        f4211w = C0452x0.b(cls, "scheduleFinalCleanup", new Class[]{cls2, cls2});
        f4212x = C0452x0.a(cls6, "mToken");
        try {
            constructor = Class.forName(ActivityThread.class.getName().concat("$ProviderKey")).getDeclaredConstructor(new Class[]{cls2, Integer.TYPE});
            constructor.setAccessible(true);
        } catch (Exception unused4) {
            constructor = null;
        }
        f4213y = constructor;
        try {
            Field declaredField2 = ActivityThread.class.getDeclaredField("mProviderMap");
            declaredField2.setAccessible(true);
            if (!Modifier.isStatic(declaredField2.getModifiers())) {
                if (!declaredField2.getType().isPrimitive()) {
                    c03 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField2));
                    f4214z = (Map) c03.a(f4192c);
                }
            }
            c03 = new C0351g0(declaredField2, 2);
        } catch (Exception unused5) {
        }
        f4214z = (Map) c03.a(f4192c);
    }

    public static final LoadedApk S0() {
        Context createPackageContext = C0394n1.f4143a.createPackageContext(H.f3896n, 3);
        LoadedApk loadedApk = (LoadedApk) ((C0) new C0351g0("mPackageInfo").f4098c).a(createPackageContext);
        f4205q = new C0410q(0, loadedApk);
        if (T4.f) {
            try {
                NetworkSecurityConfigProvider.install(createPackageContext);
            } catch (Throwable unused) {
            }
        }
        return loadedApk;
    }

    public static final void T0() {
        boolean z2;
        Application currentApplication;
        try {
            if (d.C0(H.f3896n, H.f) >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (currentApplication = ActivityThread.currentApplication()) != null) {
                ClassLoader classLoader = currentApplication.getClassLoader();
                if (classLoader != null) {
                    Class<?> loadClass = classLoader.loadClass("com.facebook.login.LoginBehavior");
                    Field declaredField = loadClass.getDeclaredField("NATIVE_WITH_FALLBACK");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get((Object) null);
                    Field declaredField2 = loadClass.getDeclaredField("allowsGetTokenAuth");
                    declaredField2.setAccessible(true);
                    Boolean bool = Boolean.FALSE;
                    declaredField2.set(obj, bool);
                    Field declaredField3 = loadClass.getDeclaredField("allowsKatanaAuth");
                    declaredField3.setAccessible(true);
                    declaredField3.set(obj, bool);
                    Field declaredField4 = loadClass.getDeclaredField("allowsFacebookLiteAuth");
                    declaredField4.setAccessible(true);
                    declaredField4.set(obj, bool);
                    Field declaredField5 = loadClass.getDeclaredField("allowsInstagramAppAuth");
                    declaredField5.setAccessible(true);
                    declaredField5.set(obj, bool);
                }
            }
            j jVar = H.f3893k;
            if (jVar != null) {
                ((App) jVar.b).a(H.f3896n, H.f3897o);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|12) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:58|59|60|61|62|63|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5 = q1.C0394n1.f4143a;
        r5.startService(new android.content.Intent(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2 = q1.C0394n1.f4143a;
        r2.startService(new android.content.Intent(r2, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0105, code lost:
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0131 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void U0() {
        /*
            r0 = 0
            r1 = 1
            java.util.concurrent.ExecutorService r2 = q1.d5.f4080a     // Catch:{ all -> 0x0138 }
            q1.q2 r2 = q1.T1.f3992a     // Catch:{ all -> 0x0138 }
            i0.l r2 = new i0.l     // Catch:{ all -> 0x0138 }
            r3 = 3
            r2.<init>(r3)     // Catch:{ all -> 0x0138 }
            java.util.concurrent.ExecutorService r3 = q1.d5.b     // Catch:{ all -> 0x0138 }
            r3.execute(r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = q1.H.f3897o     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = q1.H.f3896n     // Catch:{ all -> 0x0138 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0138 }
            r4.<init>()     // Catch:{ all -> 0x0138 }
            boolean r5 = q1.H.f3900r     // Catch:{ all -> 0x0138 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r6 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r7 = 0
            if (r5 == 0) goto L_0x0041
            q1.l1 r5 = q1.C0382l1.f4134c     // Catch:{ all -> 0x0138 }
            r5.getClass()     // Catch:{ all -> 0x0138 }
            android.os.IInterface r5 = r5.b()     // Catch:{ Exception -> 0x0033 }
            q1.f0 r5 = (q1.C0345f0) r5     // Catch:{ Exception -> 0x0033 }
            r8 = 8
            android.content.pm.PackageInfo r5 = r5.R(r8, r3)     // Catch:{ Exception -> 0x0033 }
            goto L_0x004d
        L_0x0033:
            android.content.Context r5 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x003e }
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x003e }
            r8.<init>(r5, r6)     // Catch:{ Exception -> 0x003e }
            r5.startService(r8)     // Catch:{ Exception -> 0x003e }
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            r5 = r7
            goto L_0x004d
        L_0x0041:
            android.content.Context r5 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x003e }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ Exception -> 0x003e }
            r8 = 520(0x208, float:7.29E-43)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r3, r8)     // Catch:{ Exception -> 0x003e }
        L_0x004d:
            if (r5 == 0) goto L_0x009d
            android.content.pm.ApplicationInfo r8 = r5.applicationInfo     // Catch:{ all -> 0x0138 }
            q1.C0 r9 = q1.J3.f3924c     // Catch:{ all -> 0x0138 }
            java.lang.Object r10 = q1.J3.f3923a     // Catch:{ all -> 0x0138 }
            int r11 = r8.targetSdkVersion     // Catch:{ all -> 0x0138 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0138 }
            java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch:{ all -> 0x0138 }
            r12[r0] = r11     // Catch:{ all -> 0x0138 }
            r9.b(r10, r12)     // Catch:{ all -> 0x0138 }
            android.content.pm.ProviderInfo[] r5 = r5.providers     // Catch:{ all -> 0x0138 }
            if (r5 == 0) goto L_0x009d
            q1.C0444v4.b(r8)     // Catch:{ all -> 0x0138 }
            int r9 = r5.length     // Catch:{ all -> 0x0138 }
            r10 = 0
        L_0x006b:
            if (r10 >= r9) goto L_0x0089
            r11 = r5[r10]     // Catch:{ all -> 0x0138 }
            java.lang.String r12 = r11.authority     // Catch:{ all -> 0x0138 }
            if (r12 == 0) goto L_0x0087
            java.lang.String r12 = r11.processName     // Catch:{ all -> 0x0138 }
            boolean r12 = U0.i.a(r12, r2)     // Catch:{ all -> 0x0138 }
            if (r12 == 0) goto L_0x0087
            boolean r12 = r11.isEnabled()     // Catch:{ all -> 0x0138 }
            if (r12 != 0) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            r11.applicationInfo = r8     // Catch:{ all -> 0x0138 }
            r4.add(r11)     // Catch:{ all -> 0x0138 }
        L_0x0087:
            int r10 = r10 + r1
            goto L_0x006b
        L_0x0089:
            int r5 = r4.size()     // Catch:{ all -> 0x0138 }
            if (r5 <= r1) goto L_0x009d
            q1.i r5 = new q1.i     // Catch:{ all -> 0x0138 }
            r5.<init>()     // Catch:{ all -> 0x0138 }
            int r8 = r4.size()     // Catch:{ all -> 0x0138 }
            if (r8 <= r1) goto L_0x009d
            java.util.Collections.sort(r4, r5)     // Catch:{ all -> 0x0138 }
        L_0x009d:
            q1.C0 r5 = f4195g     // Catch:{ all -> 0x0138 }
            java.lang.Object r8 = f     // Catch:{ all -> 0x0138 }
            r5.c(r8, r4)     // Catch:{ all -> 0x0138 }
            q1.C0 r4 = f4199k     // Catch:{ all -> 0x0138 }
            r4.c(r8, r2)     // Catch:{ all -> 0x0138 }
            q1.C0 r4 = f4204p     // Catch:{ all -> 0x0138 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0138 }
            r5[r0] = r2     // Catch:{ all -> 0x0138 }
            r4.b(r7, r5)     // Catch:{ all -> 0x0138 }
            boolean r4 = q1.T4.f4002h     // Catch:{ all -> 0x0138 }
            if (r4 == 0) goto L_0x00bc
            int r4 = q1.C0394n1.f4145d     // Catch:{ all -> 0x0138 }
            android.ddm.DdmHandleAppName.setAppName(r2, r3, r4)     // Catch:{ all -> 0x0138 }
            goto L_0x00c1
        L_0x00bc:
            int r4 = q1.C0394n1.f4145d     // Catch:{ all -> 0x0138 }
            android.ddm.DdmHandleAppName.setAppName(r2, r4)     // Catch:{ all -> 0x0138 }
        L_0x00c1:
            q1.C0 r2 = f4201m     // Catch:{ all -> 0x0138 }
            android.app.ActivityThread r4 = f4192c     // Catch:{ all -> 0x0138 }
            r2.c(r4, r7)     // Catch:{ all -> 0x0138 }
            boolean r2 = q1.T4.f     // Catch:{ all -> 0x0138 }
            if (r2 == 0) goto L_0x00e5
            q1.C0 r2 = q1.J3.b     // Catch:{ all -> 0x0138 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0138 }
            r4[r0] = r3     // Catch:{ all -> 0x0138 }
            r2.b(r7, r4)     // Catch:{ all -> 0x0138 }
            boolean r2 = q1.T4.f4001g     // Catch:{ all -> 0x0138 }
            if (r2 == 0) goto L_0x0138
            q1.C0 r2 = q1.J3.f3925d     // Catch:{ all -> 0x0138 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = q1.H.f3899q     // Catch:{ all -> 0x0138 }
            r1[r0] = r3     // Catch:{ all -> 0x0138 }
            r2.b(r7, r1)     // Catch:{ all -> 0x0138 }
            return
        L_0x00e5:
            boolean r2 = q1.T4.b     // Catch:{ all -> 0x0138 }
            if (r2 != 0) goto L_0x0138
            q1.l1 r2 = q1.C0382l1.f4134c     // Catch:{ all -> 0x0138 }
            r2.getClass()     // Catch:{ all -> 0x0138 }
            android.os.IInterface r2 = r2.b()     // Catch:{ Exception -> 0x00f9 }
            q1.f0 r2 = (q1.C0345f0) r2     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r2 = r2.x0(r3)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0106
        L_0x00f9:
            android.content.Context r2 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0104 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0104 }
            r3.<init>(r2, r6)     // Catch:{ Exception -> 0x0104 }
            r2.startService(r3)     // Catch:{ Exception -> 0x0104 }
            goto L_0x0105
        L_0x0104:
        L_0x0105:
            r2 = r7
        L_0x0106:
            if (r2 == 0) goto L_0x0138
            int r3 = r2.length()     // Catch:{ all -> 0x0138 }
            if (r3 != 0) goto L_0x010f
            goto L_0x0138
        L_0x010f:
            java.lang.String r3 = "EXTERNAL_STORAGE"
            android.system.Os.setenv(r3, r2, r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = "EMULATED_STORAGE_TARGET"
            android.system.Os.unsetenv(r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = "SECONDARY_STORAGE"
            android.system.Os.unsetenv(r2)     // Catch:{ all -> 0x0138 }
            java.lang.Class<android.os.Environment> r2 = android.os.Environment.class
            java.lang.String r3 = "initForCurrentUser"
            java.lang.Class[] r4 = q1.H.f3886c     // Catch:{ all -> 0x0138 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ Exception -> 0x0131 }
            r2.setAccessible(r1)     // Catch:{ Exception -> 0x0131 }
            q1.g0 r3 = new q1.g0     // Catch:{ Exception -> 0x0131 }
            r3.<init>(r2, r1)     // Catch:{ Exception -> 0x0131 }
            goto L_0x0133
        L_0x0131:
            q1.C0 r3 = q1.C0.f3864a     // Catch:{ all -> 0x0138 }
        L_0x0133:
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0138 }
            r3.b(r7, r0)     // Catch:{ all -> 0x0138 }
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0433u.U0():void");
    }

    public static void V0(Application application) {
        List list;
        C0 c02 = f4196h;
        Object obj = f;
        if (!i.a(c02.a(obj), Boolean.TRUE) && (list = (List) f4195g.a(obj)) != null && !list.isEmpty()) {
            f4194e.b(f4192c, application, list);
        }
    }

    public static final void X0(String str, Intent intent, IBinder iBinder, int i2) {
        Service service;
        try {
            LoadedApk loadedApk = (LoadedApk) f4205q.a();
            C0 c02 = f4200l;
            ActivityThread activityThread = f4192c;
            Object b2 = c02.b(loadedApk, Boolean.FALSE, activityThread.getInstrumentation());
            ClassLoader classLoader = loadedApk.getClassLoader();
            if (T4.f) {
                service = loadedApk.getAppFactory().instantiateService(classLoader, str, intent);
            } else {
                Constructor<?> declaredConstructor = classLoader.loadClass(str).getDeclaredConstructor(H.f3886c);
                declaredConstructor.setAccessible(true);
                service = (Service) declaredConstructor.newInstance(H.f3887d);
            }
            Object b3 = f4209u.b((Object) null, activityThread, loadedApk);
            f4210v.b(b3, service);
            f4207s.b(service, b3, activityThread, str, iBinder, b2, (IActivityManager) P2.f3957a.get());
            service.onCreate();
            f4206r.put(iBinder, service);
            if (i2 > 0 && intent != null) {
                b.getClass();
                f4193d.post(new Z.a(iBinder, intent, i2, 1));
            }
        } catch (Throwable unused) {
        }
    }

    public final void A0(Intent intent, IBinder iBinder, String str) {
        if (str != null) {
            C0 c02 = Q0.f3960a;
            d5.b.execute(new C0315a0(intent, str, 1));
            return;
        }
        C0 c03 = Q0.f3960a;
        d5.b.execute(new C0404p(iBinder, intent, 2));
    }

    public final void N(IBinder iBinder, Intent intent) {
        f4193d.post(new C0404p(iBinder, intent, 0));
    }

    public final void W(String str, Intent intent, IBinder iBinder, int i2) {
        Handler handler = f4193d;
        try {
            if (H.f3895m) {
                if (f4206r.containsKey(iBinder)) {
                    if (i2 > 0 && intent != null) {
                        handler.post(new Z.a(iBinder, intent, i2, 1));
                        return;
                    }
                    return;
                }
                handler.post(new p(str, intent, iBinder, i2));
            }
        } catch (Exception unused) {
        }
    }

    public final void W0() {
        ConditionVariable conditionVariable = f4202n;
        try {
            Future<?> submit = d5.b.submit(new r(this, 1));
            LoadedApk loadedApk = (LoadedApk) f4205q.a();
            C0 c02 = f4197i;
            Object obj = f;
            c02.c(obj, loadedApk.getApplicationInfo());
            f4198j.c(obj, loadedApk);
            submit.get();
            Application application = (Application) f4200l.b(loadedApk, Boolean.FALSE, null);
            C0 c03 = f4201m;
            ActivityThread activityThread = f4192c;
            c03.c(activityThread, application);
            V0(application);
            Instrumentation instrumentation = activityThread.getInstrumentation();
            try {
                instrumentation.callApplicationOnCreate(application);
            } catch (Throwable th) {
                instrumentation.onException(application, th);
            }
            d5.b.execute(new l(2));
        } catch (Exception unused) {
        } catch (Throwable th2) {
            conditionVariable.open();
            throw th2;
        }
        conditionVariable.open();
    }

    public final IBinder Y(String str) {
        IInterface iInterface;
        try {
            f4202n.block(10000);
            C0351g0 g0Var = f4191A;
            Object obj = f4214z.get(f4213y.newInstance(new Object[]{str, Integer.valueOf(C0394n1.f4145d)}));
            if (obj == null || (iInterface = (IInterface) ((C0) g0Var.f4098c).a(obj)) == null) {
                return null;
            }
            return iInterface.asBinder();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void h0(IBinder iBinder) {
        f4193d.post(new C0427t(iBinder, 0));
    }

    public final void j0() {
        Process.killProcess(Process.myPid());
    }

    public final void k0(IBinder iBinder, Intent intent) {
        f4193d.post(new C0404p(iBinder, intent, 1));
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) {
        /*
            r0 = this;
            q1.H.f3896n = r1     // Catch:{ Exception -> 0x0037 }
            q1.H.f3897o = r2     // Catch:{ Exception -> 0x0037 }
            q1.H.f3898p = r3     // Catch:{ Exception -> 0x0037 }
            q1.H.f3900r = r4     // Catch:{ Exception -> 0x0037 }
            java.io.File r2 = q1.U3.f4017a     // Catch:{ Exception -> 0x0037 }
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}     // Catch:{ Exception -> 0x0037 }
            java.io.File r1 = q1.H.d(r2, r1)     // Catch:{ Exception -> 0x0037 }
            boolean r2 = r1.mkdirs()     // Catch:{ Exception -> 0x0037 }
            if (r2 == 0) goto L_0x0023
            T0.l r2 = q1.S1.f3986a     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0023 }
            r3 = 493(0x1ed, float:6.91E-43)
            android.system.Os.chmod(r2, r3)     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0037 }
            q1.H.f3899q = r1     // Catch:{ Exception -> 0x0037 }
            r1 = 1
            q1.H.f3895m = r1     // Catch:{ Exception -> 0x0037 }
            android.os.Handler r1 = f4193d     // Catch:{ Exception -> 0x0037 }
            q1.r r2 = new q1.r     // Catch:{ Exception -> 0x0037 }
            r3 = 0
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x0037 }
            r1.post(r2)     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0433u.r(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
