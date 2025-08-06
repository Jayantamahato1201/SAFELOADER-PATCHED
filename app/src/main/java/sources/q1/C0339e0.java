package q1;

import H0.C;
import L0.b;
import T0.a;
import T0.l;
import T0.p;
import android.app.ActivityClient;
import android.app.ActivityManager;
import android.app.ActivityTaskManager;
import android.app.IActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.window.WindowContainerToken;
import f0.C0143B;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k.C0241f0;
import top.bienvenido.mundo.common.initialize.MNative;
import top.bienvenido.mundo.manifest.MundoIntermediary;

/* renamed from: q1.e0  reason: case insensitive filesystem */
public final class C0339e0 extends C0399o0 {
    public static final C0339e0 b;

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap f4082c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final C0241f0 f4083d = new C0241f0(3);

    /* renamed from: e  reason: collision with root package name */
    public static final ActivityManager f4084e = ((ActivityManager) C0394n1.f4143a.getSystemService("activity"));
    public static final l f;

    /* renamed from: g  reason: collision with root package name */
    public static a f4085g = new C0421s(3);

    /* renamed from: h  reason: collision with root package name */
    public static final l f4086h;

    /* renamed from: i  reason: collision with root package name */
    public static a f4087i = new C0421s(4);

    /* renamed from: j  reason: collision with root package name */
    public static final C0 f4088j;

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Binder, android.os.IInterface, q1.e0] */
    static {
        C0326c cVar;
        C0326c cVar2;
        ? binder = new Binder();
        binder.attachInterface(binder, "top.bienvenido.mundo.IMundoWindowManagerService");
        b = binder;
        boolean z2 = T4.f4003i;
        if (z2) {
            cVar = new C0326c(1);
        } else if (T4.f4001g) {
            cVar = new C0326c(2);
        } else if (T4.f3998c) {
            cVar = new C0326c(3);
        } else {
            cVar = new C0326c(4);
        }
        f = cVar;
        if (z2) {
            cVar2 = new C0326c(5);
        } else if (T4.f4001g) {
            cVar2 = new C0326c(6);
        } else {
            cVar2 = new C0326c(7);
        }
        f4086h = cVar2;
        boolean z3 = T4.f4002h;
        C0 c02 = C0.f3864a;
        if (z3) {
            try {
                Field declaredField = C0143B.d().getDeclaredField("token");
                declaredField.setAccessible(true);
                if (!Modifier.isStatic(declaredField.getModifiers())) {
                    if (!declaredField.getType().isPrimitive()) {
                        c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                    }
                }
                c02 = new C0351g0(declaredField, 2);
            } catch (Exception unused) {
            }
        }
        f4088j = c02;
    }

    public static final void S0(IBinder iBinder) {
        ActivityTaskManager.getService().finishActivity(iBinder, 0, (Intent) null, 0);
    }

    public static final int T0(IBinder iBinder) {
        return ActivityTaskManager.getService().getTaskForActivity(iBinder, false);
    }

    public static final void U0(IBinder iBinder) {
        ((IActivityManager) P2.f3957a.get()).finishActivity(iBinder, 0, (Intent) null, false);
    }

    public static b V0(Intent intent) {
        List<ResolveInfo> list;
        try {
            ComponentName component = intent.getComponent();
            if (component == null) {
                Intent selector = intent.getSelector();
                if (selector != null) {
                    component = selector.getComponent();
                } else {
                    component = null;
                }
            }
            if (component != null) {
                K2.b.getClass();
                ActivityInfo activityInfo = (ActivityInfo) K2.S0(component);
                if (activityInfo == null) {
                    if (K2.f3930d.containsKey(component.getPackageName())) {
                        try {
                            activityInfo = C0394n1.f4143a.getPackageManager().getActivityInfo(component, 512);
                        } catch (Exception unused) {
                        }
                    }
                    activityInfo = null;
                }
                if (activityInfo != null) {
                    return new b(activityInfo, Boolean.FALSE);
                }
                return null;
            }
            List c2 = K2.b.c(intent, (String) null, 65536);
            boolean isEmpty = c2.isEmpty();
            C0339e0 e0Var = b;
            if (!isEmpty) {
                H.n(c2);
                e0Var.getClass();
                ResolveInfo resolveInfo = (ResolveInfo) c2.get(0);
                if (c2.size() > 1) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) c2.get(1);
                    if (resolveInfo.priority == resolveInfo2.priority && resolveInfo.isDefault == resolveInfo2.isDefault) {
                        return new b(resolveInfo.activityInfo, Boolean.TRUE);
                    }
                }
                return new b(resolveInfo.activityInfo, Boolean.FALSE);
            }
            try {
                list = C0394n1.f4143a.getPackageManager().queryIntentActivities(intent, 65536);
            } catch (Exception unused2) {
                list = null;
            }
            if (list != null) {
                if (!list.isEmpty()) {
                    Iterator<ResolveInfo> it = list.iterator();
                    while (it.hasNext()) {
                        K2 k2 = K2.b;
                        String str = it.next().activityInfo.packageName;
                        k2.getClass();
                        if (!K2.f3930d.containsKey(str)) {
                            it.remove();
                        }
                    }
                    if (!list.isEmpty()) {
                        e0Var.getClass();
                        ResolveInfo resolveInfo3 = list.get(0);
                        if (list.size() > 1) {
                            ResolveInfo resolveInfo4 = list.get(1);
                            if (resolveInfo3.priority == resolveInfo4.priority && resolveInfo3.isDefault == resolveInfo4.isDefault) {
                                return new b(resolveInfo3.activityInfo, Boolean.TRUE);
                            }
                        }
                        return new b(resolveInfo3.activityInfo, Boolean.FALSE);
                    }
                }
            }
            return null;
        } catch (Exception unused3) {
        }
    }

    public static ActivityManager.RecentTaskInfo W0(Deque deque) {
        ActivityManager.RecentTaskInfo recentTaskInfo = new ActivityManager.RecentTaskInfo();
        C0354g3 g3Var = (C0354g3) deque.peekFirst();
        int i2 = g3Var.f;
        recentTaskInfo.id = i2;
        recentTaskInfo.persistentId = i2;
        recentTaskInfo.baseIntent = g3Var.f4103d;
        recentTaskInfo.affiliatedTaskId = i2;
        if (T4.b) {
            recentTaskInfo.numActivities = 0;
            recentTaskInfo.numActivities = deque.size();
            ActivityInfo activityInfo = g3Var.f4101a;
            recentTaskInfo.baseActivity = new ComponentName(activityInfo.packageName, activityInfo.name);
            ActivityInfo activityInfo2 = ((C0354g3) deque.peekLast()).f4101a;
            recentTaskInfo.topActivity = new ComponentName(activityInfo2.packageName, activityInfo2.name);
        }
        if (T4.f4002h) {
            f4088j.c(recentTaskInfo, f4087i.a());
        }
        return recentTaskInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent X0(android.content.Intent r6, java.lang.String r7, android.os.IBinder r8, android.content.pm.ActivityInfo r9) {
        /*
            r0 = 1
            r1 = 0
            r2 = 49845(0xc2b5, float:6.9848E-41)
            r3 = 0
            java.lang.Object r2 = top.bienvenido.mundo.common.initialize.MNative.a(r2, r3)     // Catch:{ all -> 0x0016 }
            if (r2 != 0) goto L_0x000d
            goto L_0x0017
        L_0x000d:
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0016 }
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch:{ all -> 0x0016 }
            goto L_0x0018
        L_0x0016:
        L_0x0017:
            r2 = 0
        L_0x0018:
            if (r2 != 0) goto L_0x001b
            return r3
        L_0x001b:
            java.lang.String r2 = "4d8d125513ece5290dc3b59d8d856f7e5d87572ca9f82f0f9d9201bdd03a028183f200512ea746d1a17e72cb58165e44be5f3d3f"
            r4 = 49852(0xc2bc, float:6.9858E-41)
            java.lang.Object r2 = top.bienvenido.mundo.common.initialize.MNative.a(r4, r2)     // Catch:{ all -> 0x0025 }
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ Exception -> 0x0081 }
            if (r2 == 0) goto L_0x0081
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0081 }
            r5[r1] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch:{ Exception -> 0x0081 }
            if (r9 != 0) goto L_0x0044
            q1.e0 r9 = b     // Catch:{ Exception -> 0x0081 }
            r9.getClass()     // Catch:{ Exception -> 0x0081 }
            L0.b r9 = V0(r6)     // Catch:{ Exception -> 0x0081 }
            if (r9 != 0) goto L_0x0040
            return r3
        L_0x0040:
            java.lang.Object r9 = r9.f     // Catch:{ Exception -> 0x0081 }
            android.content.pm.ActivityInfo r9 = (android.content.pm.ActivityInfo) r9     // Catch:{ Exception -> 0x0081 }
        L_0x0044:
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0081 }
            r5[r1] = r9     // Catch:{ Exception -> 0x0081 }
            java.lang.Object r9 = r2.newInstance(r5)     // Catch:{ Exception -> 0x0081 }
            android.content.pm.ActivityInfo r9 = (android.content.pm.ActivityInfo) r9     // Catch:{ Exception -> 0x0081 }
            if (r9 == 0) goto L_0x0081
            k.f0 r2 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = r9.packageName     // Catch:{ Exception -> 0x0081 }
            java.lang.String r5 = r9.processName     // Catch:{ Exception -> 0x0081 }
            q1.Q2 r7 = q1.C0360h3.e(r2, r5, r7)     // Catch:{ Exception -> 0x0081 }
            if (r7 != 0) goto L_0x005d
            return r3
        L_0x005d:
            java.lang.String r2 = "4d8d125513ece5200dc3b59d8d856f7e5d87572ca9f82f0fa4915b99dd3a6bf7ea86791840c129d1a10602"
            java.lang.Object r2 = top.bienvenido.mundo.common.initialize.MNative.a(r4, r2)     // Catch:{ all -> 0x0064 }
            goto L_0x0065
        L_0x0064:
            r2 = r3
        L_0x0065:
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ Exception -> 0x0081 }
            if (r2 != 0) goto L_0x006a
            return r3
        L_0x006a:
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0081 }
            r4[r1] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch:{ Exception -> 0x0081 }
            android.content.Intent r6 = Z0(r8, r6, r7, r9)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0081 }
            r7[r1] = r6     // Catch:{ Exception -> 0x0081 }
            java.lang.Object r6 = r2.newInstance(r7)     // Catch:{ Exception -> 0x0081 }
            android.content.Intent r6 = (android.content.Intent) r6     // Catch:{ Exception -> 0x0081 }
            return r6
        L_0x0081:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0339e0.X0(android.content.Intent, java.lang.String, android.os.IBinder, android.content.pm.ActivityInfo):android.content.Intent");
    }

    public static Intent Y0(IBinder iBinder, Intent intent, Q2 q2) {
        try {
            b V02 = V0(intent);
            if (V02 == null) {
                return null;
            }
            if (!((Boolean) V02.f586g).booleanValue()) {
                return Z0(iBinder, intent, q2, (ActivityInfo) V02.f);
            }
            String str = q2.f3963c;
            Intent intent2 = new Intent(C0394n1.f4143a, MundoIntermediary.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.intent.extra.INTENT", intent);
            if (str != null) {
                bundle.putString(String.class.getName(), str);
            }
            return intent2.putExtras(bundle);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: q1.g3} */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02cb, code lost:
        if ((r3.flags & 1) == 0) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0118, code lost:
        if (q1.H.q(r9, 268468224) == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x011a, code lost:
        r6 = f4083d;
        r0 = r4.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x011e, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        ((q1.C0413q2) r6.f3459a).c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0126, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r14.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x012e, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x017a A[Catch:{ Exception -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x017c A[Catch:{ Exception -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0199 A[Catch:{ Exception -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x019e A[Catch:{ Exception -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0295 A[Catch:{ Exception -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02e8 A[Catch:{ Exception -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02f5 A[Catch:{ Exception -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02f8 A[Catch:{ Exception -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02fe A[Catch:{ Exception -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x030e A[Catch:{ Exception -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0313 A[Catch:{ Exception -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x031e A[Catch:{ Exception -> 0x032b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent Z0(android.os.IBinder r18, android.content.Intent r19, q1.Q2 r20, android.content.pm.ActivityInfo r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 1
            r5 = 0
            r6 = 2
            r7 = 0
            if (r0 == 0) goto L_0x0017
            java.util.concurrent.ConcurrentHashMap r8 = f4082c     // Catch:{ Exception -> 0x032b }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ Exception -> 0x032b }
            q1.g3 r8 = (q1.C0354g3) r8     // Catch:{ Exception -> 0x032b }
            goto L_0x0018
        L_0x0017:
            r8 = r7
        L_0x0018:
            java.lang.String r9 = "4d8d125513ece52b0dc3b59d8d856f7e5d87572ca9f82f0fae90428cdc200e999ec8187525c129d1a17e72cb58165e44c62f"
            r10 = 49852(0xc2bc, float:6.9858E-41)
            java.lang.Object r9 = top.bienvenido.mundo.common.initialize.MNative.a(r10, r9)     // Catch:{ all -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r9 = r7
        L_0x0023:
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ Exception -> 0x032b }
            if (r9 == 0) goto L_0x0046
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x032b }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10[r5] = r11     // Catch:{ Exception -> 0x032b }
            r10[r4] = r11     // Catch:{ Exception -> 0x032b }
            java.lang.reflect.Constructor r9 = r9.getConstructor(r10)     // Catch:{ Exception -> 0x032b }
            if (r9 == 0) goto L_0x0046
            java.lang.String r10 = r3.packageName     // Catch:{ Exception -> 0x032b }
            java.lang.String r11 = r3.name     // Catch:{ Exception -> 0x032b }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x032b }
            r12[r5] = r10     // Catch:{ Exception -> 0x032b }
            r12[r4] = r11     // Catch:{ Exception -> 0x032b }
            java.lang.Object r9 = r9.newInstance(r12)     // Catch:{ Exception -> 0x032b }
            android.content.ComponentName r9 = (android.content.ComponentName) r9     // Catch:{ Exception -> 0x032b }
            goto L_0x0047
        L_0x0046:
            r9 = r7
        L_0x0047:
            r1.setComponent(r9)     // Catch:{ Exception -> 0x032b }
            int r9 = r1.getFlags()     // Catch:{ Exception -> 0x032b }
            if (r0 != 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            int r10 = r3.launchMode     // Catch:{ Exception -> 0x032b }
            r11 = 4
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            if (r10 == r11) goto L_0x0064
            r10 = 524288(0x80000, float:7.34684E-40)
            boolean r10 = q1.H.q(r9, r10)     // Catch:{ Exception -> 0x032b }
            if (r10 == 0) goto L_0x0067
            if (r0 == 0) goto L_0x0067
        L_0x0064:
            r1.addFlags(r12)     // Catch:{ Exception -> 0x032b }
        L_0x0067:
            boolean r0 = q1.H.q(r9, r12)     // Catch:{ Exception -> 0x032b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x032b }
            T0.a r10 = f4085g     // Catch:{ Exception -> 0x032b }
            java.lang.Object r10 = r10.a()     // Catch:{ Exception -> 0x032b }
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x032b }
            if (r0 == 0) goto L_0x0086
            int r0 = r3.documentLaunchMode     // Catch:{ Exception -> 0x032b }
            if (r0 != r6) goto L_0x0084
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1.addFlags(r0)     // Catch:{ Exception -> 0x032b }
        L_0x0084:
            r0 = r7
            goto L_0x0087
        L_0x0086:
            r0 = r8
        L_0x0087:
            r10 = 268468224(0x10008000, float:2.5342157E-29)
            r11 = 5
            if (r0 != 0) goto L_0x00af
            r12 = 402653184(0x18000000, float:1.6543612E-24)
            boolean r12 = q1.H.q(r9, r12)     // Catch:{ Exception -> 0x032b }
            if (r12 == 0) goto L_0x00b3
            int r12 = r3.launchMode     // Catch:{ Exception -> 0x032b }
            if (r6 > r12) goto L_0x009d
            if (r12 >= r11) goto L_0x009d
            r12 = 1
            goto L_0x009e
        L_0x009d:
            r12 = 0
        L_0x009e:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x032b }
            T0.a r13 = f4085g     // Catch:{ Exception -> 0x032b }
            java.lang.Object r13 = r13.a()     // Catch:{ Exception -> 0x032b }
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x032b }
            if (r12 == 0) goto L_0x00af
            goto L_0x00b3
        L_0x00af:
            r17 = 1
            goto L_0x0134
        L_0x00b3:
            int r12 = r3.launchMode     // Catch:{ Exception -> 0x032b }
            r13 = 3
            if (r12 != r13) goto L_0x00bb
            java.lang.String r12 = r3.name     // Catch:{ Exception -> 0x032b }
            goto L_0x00c7
        L_0x00bb:
            java.lang.String r12 = r3.taskAffinity     // Catch:{ Exception -> 0x032b }
            if (r12 != 0) goto L_0x00c7
            android.content.pm.ApplicationInfo r12 = r3.applicationInfo     // Catch:{ Exception -> 0x032b }
            java.lang.String r12 = r12.taskAffinity     // Catch:{ Exception -> 0x032b }
            if (r12 != 0) goto L_0x00c7
            java.lang.String r12 = r3.packageName     // Catch:{ Exception -> 0x032b }
        L_0x00c7:
            k.f0 r14 = f4083d     // Catch:{ Exception -> 0x032b }
            r14.getClass()     // Catch:{ Exception -> 0x032b }
            U0.b r15 = new U0.b     // Catch:{ Exception -> 0x032b }
            r15.<init>((k.C0241f0) r14)     // Catch:{ Exception -> 0x032b }
        L_0x00d1:
            boolean r14 = r15.hasNext()     // Catch:{ Exception -> 0x032b }
            if (r14 == 0) goto L_0x00af
            java.lang.Object r14 = r15.next()     // Catch:{ Exception -> 0x032b }
            java.util.Deque r14 = (java.util.Deque) r14     // Catch:{ Exception -> 0x032b }
            java.lang.Object r16 = r14.peekFirst()     // Catch:{ Exception -> 0x032b }
            r17 = 1
            r4 = r16
            q1.g3 r4 = (q1.C0354g3) r4     // Catch:{ Exception -> 0x032b }
            if (r4 != 0) goto L_0x00eb
            r4 = 1
            goto L_0x00d1
        L_0x00eb:
            q1.Q2 r11 = r4.f4102c     // Catch:{ Exception -> 0x032b }
            java.lang.String r11 = r11.f3963c     // Catch:{ Exception -> 0x032b }
            java.lang.String r6 = r2.f3963c     // Catch:{ Exception -> 0x032b }
            boolean r6 = U0.i.a(r11, r6)     // Catch:{ Exception -> 0x032b }
            if (r6 == 0) goto L_0x0130
            android.content.pm.ActivityInfo r6 = r4.f4101a     // Catch:{ Exception -> 0x032b }
            int r11 = r6.launchMode     // Catch:{ Exception -> 0x032b }
            if (r11 != r13) goto L_0x0100
            java.lang.String r6 = r6.name     // Catch:{ Exception -> 0x032b }
            goto L_0x010e
        L_0x0100:
            java.lang.String r11 = r6.taskAffinity     // Catch:{ Exception -> 0x032b }
            if (r11 != 0) goto L_0x010d
            android.content.pm.ApplicationInfo r11 = r6.applicationInfo     // Catch:{ Exception -> 0x032b }
            java.lang.String r11 = r11.taskAffinity     // Catch:{ Exception -> 0x032b }
            if (r11 != 0) goto L_0x010d
            java.lang.String r6 = r6.packageName     // Catch:{ Exception -> 0x032b }
            goto L_0x010e
        L_0x010d:
            r6 = r11
        L_0x010e:
            boolean r6 = U0.i.a(r6, r12)     // Catch:{ Exception -> 0x032b }
            if (r6 == 0) goto L_0x0130
            boolean r0 = q1.H.q(r9, r10)     // Catch:{ Exception -> 0x032b }
            if (r0 == 0) goto L_0x012e
            k.f0 r6 = f4083d     // Catch:{ Exception -> 0x032b }
            int r0 = r4.f     // Catch:{ Exception -> 0x032b }
            monitor-enter(r6)     // Catch:{ Exception -> 0x032b }
            java.lang.Object r11 = r6.f3459a     // Catch:{ all -> 0x012b }
            q1.q2 r11 = (q1.C0413q2) r11     // Catch:{ all -> 0x012b }
            r11.c(r0)     // Catch:{ all -> 0x012b }
            monitor-exit(r6)     // Catch:{ all -> 0x012b }
            r14.clear()     // Catch:{ Exception -> 0x032b }
            goto L_0x012e
        L_0x012b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ Exception -> 0x032b }
            throw r0     // Catch:{ Exception -> 0x032b }
        L_0x012e:
            r0 = r4
            goto L_0x0134
        L_0x0130:
            r4 = 1
            r6 = 2
            r11 = 5
            goto L_0x00d1
        L_0x0134:
            T0.a r4 = f4085g     // Catch:{ Exception -> 0x032b }
            java.lang.Object r4 = r4.a()     // Catch:{ Exception -> 0x032b }
            if (r0 != 0) goto L_0x013e
            r6 = 1
            goto L_0x013f
        L_0x013e:
            r6 = 0
        L_0x013f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x032b }
            boolean r4 = U0.i.a(r4, r6)     // Catch:{ Exception -> 0x032b }
            r6 = 1386577920(0x52a58000, float:3.55408544E11)
            if (r4 == 0) goto L_0x01ad
            T0.a r0 = f4085g     // Catch:{ Exception -> 0x032b }
            java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x032b }
            java.lang.String r4 = r2.f3962a     // Catch:{ Exception -> 0x032b }
            java.lang.String r10 = r3.packageName     // Catch:{ Exception -> 0x032b }
            boolean r4 = U0.i.a(r4, r10)     // Catch:{ Exception -> 0x032b }
            if (r4 != 0) goto L_0x015d
            goto L_0x016d
        L_0x015d:
            java.lang.String r4 = r2.b     // Catch:{ Exception -> 0x032b }
            java.lang.String r10 = r3.processName     // Catch:{ Exception -> 0x032b }
            boolean r4 = U0.i.a(r4, r10)     // Catch:{ Exception -> 0x032b }
            if (r4 != 0) goto L_0x016f
            int r4 = r3.flags     // Catch:{ Exception -> 0x032b }
            r4 = r4 & 1
            if (r4 != 0) goto L_0x016f
        L_0x016d:
            r4 = 0
            goto L_0x0170
        L_0x016f:
            r4 = 1
        L_0x0170:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x032b }
            boolean r0 = U0.i.a(r0, r4)     // Catch:{ Exception -> 0x032b }
            if (r0 == 0) goto L_0x017c
            r0 = r2
            goto L_0x018c
        L_0x017c:
            k.f0 r0 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x032b }
            java.lang.String r0 = r3.packageName     // Catch:{ Exception -> 0x032b }
            java.lang.String r4 = r3.processName     // Catch:{ Exception -> 0x032b }
            java.lang.String r2 = r2.f3963c     // Catch:{ Exception -> 0x032b }
            q1.Q2 r0 = q1.C0360h3.e(r0, r4, r2)     // Catch:{ Exception -> 0x032b }
            if (r0 != 0) goto L_0x018c
            goto L_0x032b
        L_0x018c:
            int r2 = r0.f3965e     // Catch:{ Exception -> 0x032b }
            q1.g3 r4 = new q1.g3     // Catch:{ Exception -> 0x032b }
            r4.<init>(r3, r7, r0, r1)     // Catch:{ Exception -> 0x032b }
            boolean r0 = c1(r3)     // Catch:{ Exception -> 0x032b }
            if (r8 == 0) goto L_0x019e
            q1.Q2 r3 = r8.f4102c     // Catch:{ Exception -> 0x032b }
            java.lang.String r3 = r3.f3962a     // Catch:{ Exception -> 0x032b }
            goto L_0x019f
        L_0x019e:
            r3 = r7
        L_0x019f:
            android.content.Intent r0 = q1.H4.b(r1, r2, r4, r0, r3)     // Catch:{ Exception -> 0x032b }
            r1 = r9 & r6
            r2 = 405274624(0x18280000, float:2.1713491E-24)
            r1 = r1 | r2
            android.content.Intent r0 = r0.addFlags(r1)     // Catch:{ Exception -> 0x032b }
            return r0
        L_0x01ad:
            if (r0 != 0) goto L_0x01b1
            goto L_0x032b
        L_0x01b1:
            T0.a r4 = f4085g     // Catch:{ Exception -> 0x032b }
            java.lang.Object r4 = r4.a()     // Catch:{ Exception -> 0x032b }
            if (r8 == 0) goto L_0x01c1
            int r11 = r8.f     // Catch:{ Exception -> 0x032b }
            int r12 = r0.f     // Catch:{ Exception -> 0x032b }
            if (r11 != r12) goto L_0x01c1
            r11 = 0
            goto L_0x01c2
        L_0x01c1:
            r11 = 1
        L_0x01c2:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x032b }
            boolean r4 = U0.i.a(r4, r11)     // Catch:{ Exception -> 0x032b }
            if (r4 == 0) goto L_0x01d3
            android.app.ActivityManager r4 = f4084e     // Catch:{ Exception -> 0x032b }
            int r11 = r0.f     // Catch:{ Exception -> 0x032b }
            r4.moveTaskToFront(r11, r5)     // Catch:{ Exception -> 0x032b }
        L_0x01d3:
            java.util.Deque r4 = r0.f4105g     // Catch:{ Exception -> 0x032b }
            if (r4 == 0) goto L_0x01de
            java.lang.Object r11 = r4.peekLast()     // Catch:{ Exception -> 0x032b }
            q1.g3 r11 = (q1.C0354g3) r11     // Catch:{ Exception -> 0x032b }
            goto L_0x01df
        L_0x01de:
            r11 = r7
        L_0x01df:
            if (r11 == 0) goto L_0x01e3
            r12 = 1
            goto L_0x01e4
        L_0x01e3:
            r12 = 0
        L_0x01e4:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x032b }
            T0.a r13 = f4085g     // Catch:{ Exception -> 0x032b }
            java.lang.Object r13 = r13.a()     // Catch:{ Exception -> 0x032b }
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x032b }
            if (r12 == 0) goto L_0x02b0
            int r12 = r3.launchMode     // Catch:{ Exception -> 0x032b }
            r13 = 2
            if (r13 > r12) goto L_0x01fd
            r13 = 5
            if (r12 >= r13) goto L_0x01fd
            r5 = 1
        L_0x01fd:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x032b }
            T0.a r12 = f4085g     // Catch:{ Exception -> 0x032b }
            java.lang.Object r12 = r12.a()     // Catch:{ Exception -> 0x032b }
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x032b }
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            if (r5 != 0) goto L_0x023b
            int r5 = r1.getFlags()     // Catch:{ Exception -> 0x032b }
            r13 = 67239936(0x4020000, float:1.5281427E-36)
            r5 = r5 & r13
            if (r5 == 0) goto L_0x0219
            goto L_0x023b
        L_0x0219:
            int r4 = r3.launchMode     // Catch:{ Exception -> 0x032b }
            r5 = 1
            if (r4 == r5) goto L_0x0224
            boolean r4 = q1.H.q(r9, r12)     // Catch:{ Exception -> 0x032b }
            if (r4 == 0) goto L_0x0292
        L_0x0224:
            android.content.pm.ActivityInfo r4 = r11.f4101a     // Catch:{ Exception -> 0x032b }
            java.lang.String r5 = r4.packageName     // Catch:{ Exception -> 0x032b }
            java.lang.String r13 = r3.packageName     // Catch:{ Exception -> 0x032b }
            boolean r5 = U0.i.a(r5, r13)     // Catch:{ Exception -> 0x032b }
            if (r5 == 0) goto L_0x0292
            java.lang.String r4 = r4.name     // Catch:{ Exception -> 0x032b }
            java.lang.String r5 = r3.name     // Catch:{ Exception -> 0x032b }
            boolean r4 = U0.i.a(r4, r5)     // Catch:{ Exception -> 0x032b }
            if (r4 == 0) goto L_0x0292
            goto L_0x0293
        L_0x023b:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x032b }
            int r11 = r4.size()     // Catch:{ Exception -> 0x032b }
            r5.<init>(r11)     // Catch:{ Exception -> 0x032b }
            java.util.Iterator r4 = r4.descendingIterator()     // Catch:{ Exception -> 0x032b }
        L_0x0248:
            boolean r11 = r4.hasNext()     // Catch:{ Exception -> 0x032b }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x032b }
            T0.a r13 = f4085g     // Catch:{ Exception -> 0x032b }
            java.lang.Object r13 = r13.a()     // Catch:{ Exception -> 0x032b }
            boolean r11 = r11.equals(r13)     // Catch:{ Exception -> 0x032b }
            if (r11 == 0) goto L_0x0292
            java.lang.Object r11 = r4.next()     // Catch:{ Exception -> 0x032b }
            q1.g3 r11 = (q1.C0354g3) r11     // Catch:{ Exception -> 0x032b }
            android.content.pm.ActivityInfo r13 = r11.f4101a     // Catch:{ Exception -> 0x032b }
            java.lang.String r14 = r13.packageName     // Catch:{ Exception -> 0x032b }
            java.lang.String r15 = r3.packageName     // Catch:{ Exception -> 0x032b }
            boolean r14 = U0.i.a(r14, r15)     // Catch:{ Exception -> 0x032b }
            if (r14 == 0) goto L_0x028e
            java.lang.String r13 = r13.name     // Catch:{ Exception -> 0x032b }
            java.lang.String r14 = r3.name     // Catch:{ Exception -> 0x032b }
            boolean r13 = U0.i.a(r13, r14)     // Catch:{ Exception -> 0x032b }
            if (r13 == 0) goto L_0x028e
            int r4 = r3.launchMode     // Catch:{ Exception -> 0x032b }
            if (r4 != 0) goto L_0x028a
            int r4 = r1.getFlags()     // Catch:{ Exception -> 0x032b }
            r13 = 537001984(0x20020000, float:1.1011428E-19)
            r4 = r4 & r13
            if (r4 == 0) goto L_0x0286
            goto L_0x028a
        L_0x0286:
            r5.add(r11)     // Catch:{ Exception -> 0x032b }
            r11 = r7
        L_0x028a:
            b1(r5)     // Catch:{ Exception -> 0x032b }
            goto L_0x0293
        L_0x028e:
            r5.add(r11)     // Catch:{ Exception -> 0x032b }
            goto L_0x0248
        L_0x0292:
            r11 = r7
        L_0x0293:
            if (r11 == 0) goto L_0x02b0
            q1.Q2 r0 = r11.f4102c     // Catch:{ Exception -> 0x032b }
            int r0 = r0.f3965e     // Catch:{ Exception -> 0x032b }
            boolean r2 = c1(r3)     // Catch:{ Exception -> 0x032b }
            if (r8 == 0) goto L_0x02a4
            q1.Q2 r3 = r8.f4102c     // Catch:{ Exception -> 0x032b }
            java.lang.String r3 = r3.f3962a     // Catch:{ Exception -> 0x032b }
            goto L_0x02a5
        L_0x02a4:
            r3 = r7
        L_0x02a5:
            android.content.Intent r0 = q1.H4.b(r1, r0, r11, r2, r3)     // Catch:{ Exception -> 0x032b }
            r1 = r9 & r6
            r1 = r1 | r12
            r0.setFlags(r1)     // Catch:{ Exception -> 0x032b }
            return r0
        L_0x02b0:
            java.lang.String r4 = r2.f3962a     // Catch:{ Exception -> 0x032b }
            java.lang.String r5 = r3.packageName     // Catch:{ Exception -> 0x032b }
            boolean r4 = U0.i.a(r4, r5)     // Catch:{ Exception -> 0x032b }
            if (r4 != 0) goto L_0x02bb
            goto L_0x02cd
        L_0x02bb:
            java.lang.String r4 = r2.b     // Catch:{ Exception -> 0x032b }
            java.lang.String r5 = r3.processName     // Catch:{ Exception -> 0x032b }
            boolean r4 = U0.i.a(r4, r5)     // Catch:{ Exception -> 0x032b }
            if (r4 != 0) goto L_0x02dc
            int r4 = r3.flags     // Catch:{ Exception -> 0x032b }
            r17 = 1
            r4 = r4 & 1
            if (r4 != 0) goto L_0x02dc
        L_0x02cd:
            k.f0 r4 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x032b }
            java.lang.String r4 = r3.packageName     // Catch:{ Exception -> 0x032b }
            java.lang.String r5 = r3.processName     // Catch:{ Exception -> 0x032b }
            java.lang.String r2 = r2.f3963c     // Catch:{ Exception -> 0x032b }
            q1.Q2 r2 = q1.C0360h3.e(r4, r5, r2)     // Catch:{ Exception -> 0x032b }
            if (r2 != 0) goto L_0x02dc
            goto L_0x032b
        L_0x02dc:
            int r4 = r2.f3965e     // Catch:{ Exception -> 0x032b }
            if (r8 == 0) goto L_0x02f5
            r5 = 33554432(0x2000000, float:9.403955E-38)
            boolean r5 = q1.H.q(r9, r5)     // Catch:{ Exception -> 0x032b }
            if (r5 == 0) goto L_0x02f5
            java.lang.ref.WeakReference r5 = r8.b     // Catch:{ Exception -> 0x032b }
            if (r5 == 0) goto L_0x02f3
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x032b }
            q1.g3 r5 = (q1.C0354g3) r5     // Catch:{ Exception -> 0x032b }
            goto L_0x02f6
        L_0x02f3:
            r5 = r7
            goto L_0x02f6
        L_0x02f5:
            r5 = r8
        L_0x02f6:
            if (r5 == 0) goto L_0x02fe
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x032b }
            r11.<init>(r5)     // Catch:{ Exception -> 0x032b }
            goto L_0x02ff
        L_0x02fe:
            r11 = r7
        L_0x02ff:
            q1.g3 r5 = new q1.g3     // Catch:{ Exception -> 0x032b }
            r5.<init>(r3, r11, r2, r1)     // Catch:{ Exception -> 0x032b }
            int r0 = r0.f     // Catch:{ Exception -> 0x032b }
            r5.f = r0     // Catch:{ Exception -> 0x032b }
            boolean r0 = c1(r3)     // Catch:{ Exception -> 0x032b }
            if (r8 == 0) goto L_0x0313
            q1.Q2 r2 = r8.f4102c     // Catch:{ Exception -> 0x032b }
            java.lang.String r2 = r2.f3962a     // Catch:{ Exception -> 0x032b }
            goto L_0x0314
        L_0x0313:
            r2 = r7
        L_0x0314:
            android.content.Intent r0 = q1.H4.b(r1, r4, r5, r0, r2)     // Catch:{ Exception -> 0x032b }
            boolean r1 = q1.H.q(r9, r10)     // Catch:{ Exception -> 0x032b }
            if (r1 != 0) goto L_0x0325
            int r1 = r3.launchMode     // Catch:{ Exception -> 0x032b }
            if (r1 != 0) goto L_0x0323
            goto L_0x0325
        L_0x0323:
            r6 = 1118109696(0x42a50000, float:82.5)
        L_0x0325:
            r1 = r9 & r6
            r0.setFlags(r1)     // Catch:{ Exception -> 0x032b }
            return r0
        L_0x032b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0339e0.Z0(android.os.IBinder, android.content.Intent, q1.Q2, android.content.pm.ActivityInfo):android.content.Intent");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList a1(int r6, boolean r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            k.f0 r1 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x0063 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r2 = r1.f3459a     // Catch:{ all -> 0x0060 }
            q1.q2 r2 = (q1.C0413q2) r2     // Catch:{ all -> 0x0060 }
            java.lang.Object r6 = r2.a(r6)     // Catch:{ all -> 0x0060 }
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            q1.Q2 r6 = (q1.Q2) r6     // Catch:{ Exception -> 0x0063 }
            if (r6 != 0) goto L_0x0016
            goto L_0x0063
        L_0x0016:
            k.f0 r1 = f4083d     // Catch:{ Exception -> 0x0063 }
            r1.getClass()     // Catch:{ Exception -> 0x0063 }
            U0.b r2 = new U0.b     // Catch:{ Exception -> 0x0063 }
            r2.<init>((k.C0241f0) r1)     // Catch:{ Exception -> 0x0063 }
        L_0x0020:
            boolean r1 = r2.hasNext()     // Catch:{ Exception -> 0x0063 }
            if (r1 == 0) goto L_0x0063
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0063 }
            java.util.Deque r1 = (java.util.Deque) r1     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r3 = r1.peekFirst()     // Catch:{ Exception -> 0x0063 }
            q1.g3 r3 = (q1.C0354g3) r3     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x0020
            java.lang.String r4 = r6.f3963c     // Catch:{ Exception -> 0x0063 }
            q1.Q2 r5 = r3.f4102c     // Catch:{ Exception -> 0x0063 }
            java.lang.String r5 = r5.f3963c     // Catch:{ Exception -> 0x0063 }
            boolean r4 = U0.i.a(r4, r5)     // Catch:{ Exception -> 0x0063 }
            if (r4 != 0) goto L_0x0041
            goto L_0x0020
        L_0x0041:
            java.lang.String r4 = r6.f3962a     // Catch:{ Exception -> 0x0063 }
            q1.Q2 r5 = r3.f4102c     // Catch:{ Exception -> 0x0063 }
            java.lang.String r5 = r5.f3962a     // Catch:{ Exception -> 0x0063 }
            boolean r4 = U0.i.a(r4, r5)     // Catch:{ Exception -> 0x0063 }
            if (r4 != 0) goto L_0x004e
            goto L_0x0020
        L_0x004e:
            if (r7 != 0) goto L_0x005c
            android.content.Intent r3 = r3.f4103d     // Catch:{ Exception -> 0x0063 }
            int r3 = r3.getFlags()     // Catch:{ Exception -> 0x0063 }
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x005c
            goto L_0x0020
        L_0x005c:
            r0.add(r1)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0020
        L_0x0060:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0063 }
            throw r6     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0339e0.a1(int, boolean):java.util.ArrayList");
    }

    public static void b1(ArrayList arrayList) {
        try {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                f.e(((C0354g3) obj).f4104e);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean c1(ActivityInfo activityInfo) {
        int i2 = activityInfo.screenOrientation;
        if (i2 == 0 || i2 == 6 || i2 == 8 || i2 == 11) {
            return true;
        }
        return false;
    }

    public static final WindowContainerToken d1() {
        try {
            WindowContainerToken windowContainerToken = new WindowContainerToken(new C0445w());
            f4087i = new C0410q(1, windowContainerToken);
            return windowContainerToken;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void e1(IBinder iBinder) {
        ((IActivityManager) P2.f3957a.get()).finishActivity(iBinder, 0, (Intent) null, 0);
    }

    public static final int f1(IBinder iBinder) {
        return ActivityClient.getInstance().getTaskForActivity(iBinder, false);
    }

    public static final void g1(IBinder iBinder) {
        ActivityClient.getInstance().finishActivity(iBinder, 0, (Intent) null, 0);
    }

    public static ActivityManager.RunningTaskInfo h1(Deque deque) {
        ActivityManager.RunningTaskInfo runningTaskInfo = new ActivityManager.RunningTaskInfo();
        C0354g3 g3Var = (C0354g3) deque.peekFirst();
        runningTaskInfo.id = g3Var.f;
        ActivityInfo activityInfo = g3Var.f4101a;
        runningTaskInfo.baseActivity = new ComponentName(activityInfo.packageName, activityInfo.name);
        ActivityInfo activityInfo2 = ((C0354g3) deque.peekLast()).f4101a;
        runningTaskInfo.topActivity = new ComponentName(activityInfo2.packageName, activityInfo2.name);
        runningTaskInfo.numActivities = deque.size();
        runningTaskInfo.numRunning = deque.size();
        if (T4.f4001g) {
            runningTaskInfo.taskId = g3Var.f;
            runningTaskInfo.baseIntent = g3Var.f4103d;
        }
        if (T4.f4002h) {
            f4088j.c(runningTaskInfo, f4087i.a());
        }
        return runningTaskInfo;
    }

    public static final int i1(IBinder iBinder) {
        return ((IActivityManager) P2.f3957a.get()).getTaskForActivity(iBinder, false);
    }

    public static boolean m0(String str, String str2) {
        boolean z2;
        try {
            ActivityInfo c2 = H.c(str);
            if (c2 == null) {
                return false;
            }
            C0241f0 f0Var = C0360h3.f4112a;
            String str3 = c2.processName;
            C0241f0 f0Var2 = C0360h3.f4113c;
            int hashCode = str2.hashCode() + str3.hashCode();
            synchronized (f0Var2) {
                C0413q2 q2Var = (C0413q2) f0Var2.f3459a;
                if (H.a(q2Var.f4178c, hashCode, q2Var.f4177a) >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            return z2;
        } catch (Exception unused) {
        }
    }

    public final ComponentName E0(IBinder iBinder) {
        WeakReference weakReference;
        C0354g3 g3Var;
        try {
            C0354g3 g3Var2 = (C0354g3) f4082c.get(iBinder);
            if (!(g3Var2 == null || (weakReference = g3Var2.b) == null || (g3Var = (C0354g3) weakReference.get()) == null)) {
                ActivityInfo activityInfo = g3Var.f4101a;
                return new ComponentName(activityInfo.packageName, activityInfo.name);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void G0(IBinder iBinder, IBinder iBinder2) {
        if (iBinder2 instanceof C0354g3) {
            d5.f4080a.execute(new C0327c0(iBinder2, iBinder, 0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent[] J(android.os.IBinder r7, android.content.Intent[] r8, int r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            k.f0 r1 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x003a }
            monitor-enter(r1)     // Catch:{ Exception -> 0x003a }
            java.lang.Object r2 = r1.f3459a     // Catch:{ all -> 0x0037 }
            q1.q2 r2 = (q1.C0413q2) r2     // Catch:{ all -> 0x0037 }
            java.lang.Object r9 = r2.a(r9)     // Catch:{ all -> 0x0037 }
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            q1.Q2 r9 = (q1.Q2) r9     // Catch:{ Exception -> 0x003a }
            if (r9 != 0) goto L_0x0015
            return r0
        L_0x0015:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x003a }
            int r2 = r8.length     // Catch:{ Exception -> 0x003a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x003a }
            int r2 = r8.length     // Catch:{ Exception -> 0x003a }
            r3 = 0
            r4 = 0
        L_0x001e:
            if (r4 >= r2) goto L_0x002e
            r5 = r8[r4]     // Catch:{ Exception -> 0x003a }
            android.content.Intent r5 = Y0(r7, r5, r9)     // Catch:{ Exception -> 0x003a }
            if (r5 == 0) goto L_0x002b
            r1.add(r5)     // Catch:{ Exception -> 0x003a }
        L_0x002b:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x002e:
            android.content.Intent[] r7 = new android.content.Intent[r3]     // Catch:{ Exception -> 0x003a }
            java.lang.Object[] r7 = r1.toArray(r7)     // Catch:{ Exception -> 0x003a }
            android.content.Intent[] r7 = (android.content.Intent[]) r7     // Catch:{ Exception -> 0x003a }
            return r7
        L_0x0037:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x003a }
            throw r7     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0339e0.J(android.os.IBinder, android.content.Intent[], int):android.content.Intent[]");
    }

    public final List M0(int i2, long j2) {
        boolean z2;
        int i3 = (int) ((-4294967296L & j2) >>> 32);
        if ((8388608 & ((int) (j2 & 4294967295L))) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            ArrayList a12 = a1(i2, z2);
            int size = a12.size();
            if (size <= i3) {
                i3 = size;
            }
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList.add(W0((Deque) a12.get(i4)));
            }
            return arrayList;
        } catch (Exception unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public final Intent N0(IBinder iBinder, Intent intent, int i2) {
        Object a2;
        C0241f0 f0Var = C0360h3.f4112a;
        synchronized (f0Var) {
            a2 = ((C0413q2) f0Var.f3459a).a(i2);
        }
        Q2 q2 = (Q2) a2;
        if (q2 == null) {
            return null;
        }
        return Y0(iBinder, intent, q2);
    }

    public final void Q(Intent intent, String str) {
        d5.f4080a.execute(new C0315a0(intent, str, 0));
    }

    public final void T(IBinder iBinder, String str, String str2, String str3, int i2) {
        Object a2;
        C0318a3 a3Var;
        try {
            C0241f0 f0Var = C0360h3.f4112a;
            synchronized (f0Var) {
                a2 = ((C0413q2) f0Var.f3459a).a(i2);
            }
            if (a2 == null) {
                int callingPid = Binder.getCallingPid();
                K2.b.getClass();
                boolean containsKey = K2.f3929c.containsKey(str);
                String str4 = str2;
                String str5 = str3;
                int i3 = i2;
                Q2 q2 = new Q2(str, str4, str5, containsKey, i3, H.b(str, containsKey));
                iBinder.linkToDeath(new C0320b(iBinder, q2, 1), 0);
                f0Var.f(i3, q2);
                q2.f3968i = callingPid;
                C0360h3.b.f(callingPid, q2);
                C0360h3.f4113c.f(str5.hashCode() + str4.hashCode(), q2);
                q2.f3969j.open();
                IInterface queryLocalInterface = iBinder.queryLocalInterface("top.bienvenido.mundo.IApplicationThread");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C0318a3)) {
                    a3Var = new N2(iBinder);
                } else {
                    a3Var = (C0318a3) queryLocalInterface;
                }
                q2.f3967h = a3Var;
                if (C0360h3.f4114d == i3) {
                    C0360h3.f4114d = 0;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(String str) {
        d5.f4080a.execute(new C0321b0((ActivityInfo) null, str, "0"));
    }

    public final List k(long j2) {
        int i2 = (int) ((-4294967296L & j2) >>> 32);
        try {
            ArrayList a12 = a1((int) (j2 & 4294967295L), true);
            int size = a12.size();
            if (size <= i2) {
                i2 = size;
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(h1((Deque) a12.get(i3)));
            }
            return arrayList;
        } catch (Exception unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public final Intent l0(long j2, Intent intent) {
        Object a2;
        p pVar;
        String str;
        int i2 = (int) ((-4294967296L & j2) >>> 32);
        int i3 = (int) (j2 & 4294967295L);
        try {
            C0241f0 f0Var = C0360h3.f4112a;
            synchronized (f0Var) {
                a2 = ((C0413q2) f0Var.f3459a).a(i3);
            }
            Q2 q2 = (Q2) a2;
            if (i2 == 1) {
                pVar = new K(2, H4.f3904a, H4.class, "toStubReceiver", "toStubReceiver(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/Intent;", 0, 2);
            } else if (i2 == 2) {
                pVar = new K(2, H4.f3904a, H4.class, "intentToDelegateIntermediary", "intentToDelegateIntermediary(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/Intent;", 0, 0);
            } else if (i2 == 4 || i2 == 5) {
                pVar = new K(2, H4.f3904a, H4.class, "toStubService", "toStubService(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/Intent;", 0, 1);
            } else {
                pVar = new C(8);
            }
            if (q2 != null) {
                str = q2.f3963c;
            } else {
                str = null;
            }
            return (Intent) pVar.d(intent, str);
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void n0(String str) {
        if (str != null && str.length() != 0) {
            new Thread(new C0454x2(0, str)).start();
        }
    }

    public final boolean p(String str, String str2) {
        boolean z2;
        try {
            ActivityInfo c2 = H.c(str);
            if (c2 != null) {
                C0241f0 f0Var = C0360h3.f4112a;
                String str3 = c2.processName;
                try {
                    C0241f0 f0Var2 = C0360h3.f4113c;
                    int hashCode = str2.hashCode() + str3.hashCode();
                    synchronized (f0Var2) {
                        C0413q2 q2Var = (C0413q2) f0Var2.f3459a;
                        if (H.a(q2Var.f4178c, hashCode, q2Var.f4177a) >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                } catch (Exception unused) {
                    z2 = false;
                }
                if (z2) {
                    d5.f4080a.execute(new C0321b0(c2, str, str2));
                    return true;
                }
                d5.f4080a.execute(new C0321b0(str, c2, str2));
            }
        } catch (Exception unused2) {
        }
        return false;
    }

    public final boolean w() {
        try {
            Object a2 = MNative.a(49845, (Serializable) null);
            if (a2 == null) {
                return false;
            }
            return Boolean.parseBoolean(a2.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public final String x() {
        try {
            return String.valueOf(MNative.a(49850, (Serializable) null));
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String z(IBinder iBinder) {
        WeakReference weakReference;
        C0354g3 g3Var;
        try {
            C0354g3 g3Var2 = (C0354g3) f4082c.get(iBinder);
            if (!(g3Var2 == null || (weakReference = g3Var2.b) == null || (g3Var = (C0354g3) weakReference.get()) == null)) {
                return g3Var.f4102c.f3962a;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void z0(IBinder iBinder) {
        d5.f4080a.execute(new C0427t(iBinder, 1));
    }
}
