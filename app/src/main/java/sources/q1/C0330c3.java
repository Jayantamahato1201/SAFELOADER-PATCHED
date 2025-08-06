package q1;

import L0.b;
import M0.e;
import U0.i;
import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import i0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k.C0241f0;

/* renamed from: q1.c3  reason: case insensitive filesystem */
public final class C0330c3 extends W3 {
    public static final C0330c3 b;

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap f4069c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final U2 f4070d = new U0();

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap f4071e = new ConcurrentHashMap();

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Binder, q1.c3, android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [q1.U2, q1.U0] */
    static {
        ? binder = new Binder();
        binder.attachInterface(binder, "top.bienvenido.mundo.IMundoActivityManagerService");
        b = binder;
    }

    public static ServiceInfo S0(Intent intent) {
        ResolveInfo resolveInfo;
        List b2 = K2.b.b(intent, (String) null, 0);
        H.n(b2);
        ResolveInfo resolveInfo2 = (ResolveInfo) e.B0(b2);
        if (resolveInfo2 != null) {
            return resolveInfo2.serviceInfo;
        }
        try {
            resolveInfo = C0394n1.f4143a.getPackageManager().resolveService(intent, 512);
        } catch (Exception unused) {
            resolveInfo = null;
        }
        if (resolveInfo != null) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (K2.f3930d.containsKey(serviceInfo.packageName)) {
                return serviceInfo;
            }
        }
        return null;
    }

    public static final void T0(IBinder iBinder, Intent intent, IBinder iBinder2, IBinder iBinder3) {
        try {
            ((C3) iBinder).f3867c = new b(intent, iBinder2);
            IServiceConnection asInterface = IServiceConnection.Stub.asInterface(iBinder3);
            if (T4.f4000e) {
                ServiceInfo serviceInfo = ((C3) iBinder).b;
                asInterface.connected(new ComponentName(serviceInfo.packageName, serviceInfo.name), iBinder2, false);
                return;
            }
            ServiceInfo serviceInfo2 = ((C3) iBinder).b;
            asInterface.connected(new ComponentName(serviceInfo2.packageName, serviceInfo2.name), iBinder2);
        } catch (Throwable unused) {
        }
    }

    public static final void U0(IBinder iBinder, C3 c3, b bVar) {
        try {
            IServiceConnection asInterface = IServiceConnection.Stub.asInterface(iBinder);
            ServiceInfo serviceInfo = c3.b;
            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            if (T4.f4000e) {
                asInterface.connected(componentName, (IBinder) bVar.f586g, false);
            } else {
                asInterface.connected(componentName, (IBinder) bVar.f586g);
            }
        } catch (Throwable unused) {
        }
    }

    public final ComponentName A(Intent intent, String str) {
        try {
            ServiceInfo S0 = S0(intent);
            if (S0 == null) {
                return null;
            }
            C0241f0 f0Var = C0360h3.f4112a;
            Q2 e2 = C0360h3.e(S0.packageName, S0.processName, str);
            if (e2 == null) {
                return null;
            }
            d5.b.execute(new P0(e2, S0, intent));
            return new ComponentName(S0.packageName, S0.name);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028 A[Catch:{ Exception -> 0x008d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.IBinder C0(java.lang.String r6, java.lang.String r7, android.content.pm.ProviderInfo[] r8, java.lang.String[] r9, int r10) {
        /*
            r5 = this;
            r0 = 0
            q1.K2 r1 = q1.K2.b     // Catch:{ Exception -> 0x008d }
            android.content.pm.ProviderInfo r1 = r1.w0(r6)     // Catch:{ Exception -> 0x008d }
            if (r1 != 0) goto L_0x0029
            android.content.Context r1 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0016 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x0016 }
            r2 = 512(0x200, float:7.175E-43)
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r6, r2)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0018
        L_0x0016:
            r1 = r0
        L_0x0018:
            if (r1 == 0) goto L_0x0025
            java.lang.String r2 = r1.packageName     // Catch:{ Exception -> 0x008d }
            q1.E4 r3 = q1.K2.f3930d     // Catch:{ Exception -> 0x008d }
            boolean r2 = r3.containsKey(r2)     // Catch:{ Exception -> 0x008d }
            if (r2 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = r0
        L_0x0026:
            if (r1 != 0) goto L_0x0029
            goto L_0x008d
        L_0x0029:
            k.f0 r2 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x008d }
            monitor-enter(r2)     // Catch:{ Exception -> 0x008d }
            java.lang.Object r3 = r2.f3459a     // Catch:{ all -> 0x008a }
            q1.q2 r3 = (q1.C0413q2) r3     // Catch:{ all -> 0x008a }
            java.lang.Object r10 = r3.a(r10)     // Catch:{ all -> 0x008a }
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
            q1.Q2 r10 = (q1.Q2) r10     // Catch:{ Exception -> 0x008d }
            r2 = 0
            if (r10 == 0) goto L_0x0055
            java.lang.String r3 = r10.f3962a     // Catch:{ Exception -> 0x008d }
            java.lang.String r4 = r1.packageName     // Catch:{ Exception -> 0x008d }
            boolean r3 = U0.i.a(r3, r4)     // Catch:{ Exception -> 0x008d }
            if (r3 == 0) goto L_0x0055
            java.lang.String r10 = r10.b     // Catch:{ Exception -> 0x008d }
            java.lang.String r3 = r1.processName     // Catch:{ Exception -> 0x008d }
            boolean r10 = U0.i.a(r10, r3)     // Catch:{ Exception -> 0x008d }
            if (r10 != 0) goto L_0x0052
            boolean r10 = r1.multiprocess     // Catch:{ Exception -> 0x008d }
            if (r10 == 0) goto L_0x0055
        L_0x0052:
            r8[r2] = r1     // Catch:{ Exception -> 0x008d }
            goto L_0x008d
        L_0x0055:
            java.lang.String r8 = r1.packageName     // Catch:{ Exception -> 0x008d }
            java.lang.String r10 = r1.processName     // Catch:{ Exception -> 0x008d }
            q1.Q2 r7 = q1.C0360h3.e(r8, r10, r7)     // Catch:{ Exception -> 0x008d }
            if (r7 != 0) goto L_0x0060
            goto L_0x008d
        L_0x0060:
            java.lang.String r8 = r1.authority     // Catch:{ Exception -> 0x008d }
            r10 = 1
            r9[r10] = r8     // Catch:{ Exception -> 0x008d }
            q1.a3 r8 = r7.f3967h     // Catch:{ Exception -> 0x008d }
            if (r8 == 0) goto L_0x008d
            android.os.IBinder r6 = r8.Y(r6)     // Catch:{ Exception -> 0x008d }
            if (r6 == 0) goto L_0x008d
            java.lang.String r8 = q1.C0394n1.b     // Catch:{ Exception -> 0x008d }
            int r7 = r7.f3965e     // Catch:{ Exception -> 0x008d }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008d }
            r10.<init>()     // Catch:{ Exception -> 0x008d }
            r10.append(r8)     // Catch:{ Exception -> 0x008d }
            java.lang.String r8 = ".provider.stub"
            r10.append(r8)     // Catch:{ Exception -> 0x008d }
            r10.append(r7)     // Catch:{ Exception -> 0x008d }
            java.lang.String r7 = r10.toString()     // Catch:{ Exception -> 0x008d }
            r9[r2] = r7     // Catch:{ Exception -> 0x008d }
            return r6
        L_0x008a:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x008d }
            throw r6     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0330c3.C0(java.lang.String, java.lang.String, android.content.pm.ProviderInfo[], java.lang.String[], int):android.os.IBinder");
    }

    public final int H(Intent intent, String str) {
        try {
            ServiceInfo S0 = S0(intent);
            if (S0 == null) {
                return -1;
            }
            C0241f0 f0Var = C0360h3.f4112a;
            Q2 a2 = C0360h3.a(S0.processName, str);
            if (a2 != null) {
                C3 c3 = (C3) a2.f3971l.a(S0.name.hashCode());
                if (c3 != null) {
                    c3.f3868d = 0;
                    if (c3.f.isEmpty()) {
                        d5.b.execute(new P0(a2, c3, S0, 4));
                        return 1;
                    }
                }
            }
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final boolean K(IBinder iBinder, Intent intent, IBinder iBinder2) {
        try {
            if (!(iBinder instanceof C3)) {
                return false;
            }
            IBinder iBinder3 = (IBinder) ((C3) iBinder).f3869e.remove(new Intent.FilterComparison(intent));
            if (iBinder3 == null) {
                return false;
            }
            d5.b.execute(new d(iBinder, intent, iBinder2, iBinder3, 4));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean R0(IBinder iBinder) {
        try {
            C3 c3 = (C3) f4069c.remove(iBinder);
            if (c3 == null) {
                return false;
            }
            d5.b.execute(new Q4(c3, 3, iBinder));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void V0(Q2 q2) {
        try {
            Iterator it = q2.f3970k.iterator();
            while (true) {
                C0377k2 k2Var = (C0377k2) it;
                if (!k2Var.hasNext()) {
                    break;
                }
                f4069c.remove((IBinder) k2Var.next());
            }
            for (IBinder m2 : (IBinder[]) q2.f3972m.toArray(new IBinder[0])) {
                m(m2);
            }
        } catch (Exception unused) {
        }
    }

    public final int g0(Intent intent, String str, int i2) {
        List<ResolveInfo> list;
        if (!H.q(intent.getFlags(), 1073741824)) {
            List<ResolveInfo> e2 = K2.b.e(intent, (String) null, 0);
            try {
                list = C0394n1.f4143a.getPackageManager().queryBroadcastReceivers(intent, 0);
            } catch (Exception unused) {
                list = null;
            }
            if (list != null) {
                e2.addAll(list);
            }
            if (!e2.isEmpty()) {
                for (ResolveInfo resolveInfo : e2) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (str != null) {
                        if (str.length() != 0) {
                            C0241f0 f0Var = C0360h3.f4112a;
                            Q2 a2 = C0360h3.a(activityInfo.processName, str);
                            if (a2 != null) {
                                String str2 = activityInfo.name;
                                try {
                                    C0318a3 a3Var = a2.f3967h;
                                    if (a3Var != null) {
                                        a3Var.A0(intent, (IBinder) null, str2);
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                    try {
                        C0241f0 f0Var2 = C0360h3.f4112a;
                        f0Var2.getClass();
                        U0.b bVar = new U0.b(f0Var2);
                        while (bVar.hasNext()) {
                            Q2 q2 = (Q2) bVar.next();
                            if (i.a(q2.f3962a, activityInfo.packageName) && i.a(q2.b, activityInfo.processName)) {
                                String str3 = activityInfo.name;
                                try {
                                    C0318a3 a3Var2 = q2.f3967h;
                                    if (a3Var2 != null) {
                                        a3Var2.A0(intent, (IBinder) null, str3);
                                    }
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    } catch (Exception unused4) {
                    }
                }
            }
            if (intent.getComponent() != null) {
                return 0;
            }
        }
        ArrayList b2 = f4070d.b(intent, (String) null, false, 0);
        if (!b2.isEmpty()) {
            int size = b2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = b2.get(i3);
                i3++;
                C0450w4 w4Var = (C0450w4) obj;
                if (str != null) {
                    if (str.length() != 0) {
                        if (!i.a(w4Var.f.f3860g.f3963c, str)) {
                        }
                    }
                }
                A0 a02 = w4Var.f;
                Q2 q22 = a02.f3860g;
                IBinder iBinder = a02.f;
                try {
                    C0318a3 a3Var3 = q22.f3967h;
                    if (a3Var3 != null) {
                        a3Var3.A0(intent, iBinder, (String) null);
                    }
                } catch (Exception unused5) {
                }
            }
        }
        return 0;
    }

    public final IBinder h(ComponentName componentName, String str) {
        try {
            K2.b.getClass();
            ServiceInfo serviceInfo = (ServiceInfo) K2.S0(componentName);
            if (serviceInfo == null) {
                try {
                    serviceInfo = C0394n1.f4143a.getPackageManager().getServiceInfo(componentName, 512);
                } catch (Exception unused) {
                    serviceInfo = null;
                }
                if (serviceInfo == null) {
                    return null;
                }
            }
            C0241f0 f0Var = C0360h3.f4112a;
            Q2 a2 = C0360h3.a(serviceInfo.processName, str);
            if (a2 == null) {
                return null;
            }
            return (IBinder) a2.f3971l.a(serviceInfo.name.hashCode());
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        return new java.util.ArrayList(0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList l(int r6) {
        /*
            r5 = this;
            k.f0 r0 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x005f }
            monitor-enter(r0)     // Catch:{ Exception -> 0x005f }
            java.lang.Object r1 = r0.f3459a     // Catch:{ all -> 0x005c }
            q1.q2 r1 = (q1.C0413q2) r1     // Catch:{ all -> 0x005c }
            java.lang.Object r6 = r1.a(r6)     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            q1.Q2 r6 = (q1.Q2) r6     // Catch:{ Exception -> 0x005f }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x005f }
            r1.<init>()     // Catch:{ Exception -> 0x005f }
            U0.b r2 = new U0.b     // Catch:{ Exception -> 0x005f }
            r2.<init>((k.C0241f0) r0)     // Catch:{ Exception -> 0x005f }
        L_0x0018:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x005f }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x005f }
            q1.Q2 r0 = (q1.Q2) r0     // Catch:{ Exception -> 0x005f }
            if (r6 == 0) goto L_0x003a
            java.lang.String r3 = r6.f3963c     // Catch:{ Exception -> 0x005f }
            java.lang.String r4 = r0.f3963c     // Catch:{ Exception -> 0x005f }
            boolean r3 = U0.i.a(r3, r4)     // Catch:{ Exception -> 0x005f }
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = r6.f3962a     // Catch:{ Exception -> 0x005f }
            java.lang.String r4 = r0.f3962a     // Catch:{ Exception -> 0x005f }
            boolean r3 = U0.i.a(r3, r4)     // Catch:{ Exception -> 0x005f }
            if (r3 == 0) goto L_0x0018
        L_0x003a:
            android.app.ActivityManager$RunningAppProcessInfo r3 = new android.app.ActivityManager$RunningAppProcessInfo     // Catch:{ Exception -> 0x005f }
            r3.<init>()     // Catch:{ Exception -> 0x005f }
            java.lang.String r4 = r0.b     // Catch:{ Exception -> 0x005f }
            r3.processName = r4     // Catch:{ Exception -> 0x005f }
            int r4 = r0.f3968i     // Catch:{ Exception -> 0x005f }
            r3.pid = r4     // Catch:{ Exception -> 0x005f }
            java.lang.String r0 = r0.f3962a     // Catch:{ Exception -> 0x005f }
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x005f }
            r3.pkgList = r0     // Catch:{ Exception -> 0x005f }
            int r0 = q1.C0394n1.f4144c     // Catch:{ Exception -> 0x005f }
            r3.uid = r0     // Catch:{ Exception -> 0x005f }
            r0 = 100
            r3.importance = r0     // Catch:{ Exception -> 0x005f }
            r1.add(r3)     // Catch:{ Exception -> 0x005f }
            goto L_0x0018
        L_0x005b:
            return r1
        L_0x005c:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x005f }
            throw r6     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 0
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0330c3.l(int):java.util.ArrayList");
    }

    public final void m(IBinder iBinder) {
        try {
            A0 a02 = (A0) f4071e.remove(iBinder);
            if (a02 != null) {
                a02.f3860g.f3972m.f.c(iBinder.hashCode());
                int size = a02.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = a02.get(i2);
                    i2++;
                    f4070d.f((C0450w4) obj);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final boolean m0(String str, String str2) {
        C0339e0.b.getClass();
        return C0339e0.m0(str, str2);
    }

    public final int n(Intent intent, IBinder iBinder, String str) {
        try {
            ServiceInfo S0 = S0(intent);
            if (S0 == null) {
                return -1;
            }
            C0241f0 f0Var = C0360h3.f4112a;
            Q2 e2 = C0360h3.e(S0.packageName, S0.processName, str);
            if (e2 != null) {
                C0413q2 q2Var = e2.f3971l;
                C3 c3 = (C3) q2Var.a(S0.name.hashCode());
                if (c3 == null) {
                    c3 = new C3(e2, S0);
                    q2Var.b(S0.name.hashCode(), c3);
                    C0318a3 a3Var = e2.f3967h;
                    if (a3Var != null) {
                        a3Var.W(S0.name, (Intent) null, c3, 0);
                    }
                }
                C3 c32 = c3;
                C0436u2 u2Var = c32.f;
                ConcurrentHashMap concurrentHashMap = f4069c;
                if (!concurrentHashMap.containsKey(iBinder)) {
                    int i2 = u2Var.f.f4178c;
                    if (i2 <= 3000) {
                        e2.f3970k.f.b(iBinder.hashCode(), iBinder);
                        u2Var.f.b(iBinder.hashCode(), iBinder);
                        concurrentHashMap.put(iBinder, c32);
                        if (i2 > 500) {
                            d5.b.execute(new P0(c32, e2, iBinder, 1));
                        }
                    }
                }
                b bVar = c32.f3867c;
                if (bVar == null || !((Intent) bVar.f).filterEquals(intent)) {
                    d5.b.execute(new d(c32, intent, iBinder, e2, 3));
                    return 1;
                }
                d5.b.execute(new P0(iBinder, c32, bVar, 2));
                return 1;
            }
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final boolean p0(ComponentName componentName, IBinder iBinder, int i2) {
        try {
            if (!(iBinder instanceof C3)) {
                return false;
            }
            if (componentName == null || i.a(componentName.getClassName(), ((C3) iBinder).b.name)) {
                if (i2 < 0 || ((C3) iBinder).f3868d == i2) {
                    if (((C3) iBinder).f.isEmpty()) {
                        d5.b.execute(new C0427t(iBinder, 2));
                        return true;
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q0(int r4, android.os.IBinder r5, android.content.IntentFilter r6) {
        /*
            r3 = this;
            k.f0 r0 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x0053 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0053 }
            java.lang.Object r1 = r0.f3459a     // Catch:{ all -> 0x0050 }
            q1.q2 r1 = (q1.C0413q2) r1     // Catch:{ all -> 0x0050 }
            java.lang.Object r4 = r1.a(r4)     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            q1.Q2 r4 = (q1.Q2) r4     // Catch:{ Exception -> 0x0053 }
            if (r4 != 0) goto L_0x0011
            goto L_0x0053
        L_0x0011:
            q1.u2 r0 = r4.f3972m     // Catch:{ Exception -> 0x0053 }
            q1.q2 r0 = r0.f     // Catch:{ Exception -> 0x0053 }
            int r0 = r0.f4178c     // Catch:{ Exception -> 0x0053 }
            r1 = 100
            if (r0 < r1) goto L_0x001c
            goto L_0x0053
        L_0x001c:
            java.util.concurrent.ConcurrentHashMap r0 = f4071e     // Catch:{ Exception -> 0x0053 }
            java.lang.Object r1 = r0.get(r5)     // Catch:{ Exception -> 0x0053 }
            q1.A0 r1 = (q1.A0) r1     // Catch:{ Exception -> 0x0053 }
            if (r1 != 0) goto L_0x0039
            q1.A0 r1 = new q1.A0     // Catch:{ Exception -> 0x0053 }
            r1.<init>(r5, r4)     // Catch:{ Exception -> 0x0053 }
            r0.put(r5, r1)     // Catch:{ Exception -> 0x0053 }
            q1.u2 r0 = r4.f3972m     // Catch:{ Exception -> 0x0053 }
            q1.q2 r0 = r0.f     // Catch:{ Exception -> 0x0053 }
            int r2 = r5.hashCode()     // Catch:{ Exception -> 0x0053 }
            r0.b(r2, r5)     // Catch:{ Exception -> 0x0053 }
        L_0x0039:
            boolean r5 = r1.a(r6)     // Catch:{ Exception -> 0x0053 }
            if (r5 == 0) goto L_0x0040
            goto L_0x0053
        L_0x0040:
            q1.w4 r5 = new q1.w4     // Catch:{ Exception -> 0x0053 }
            java.lang.String r4 = r4.f3962a     // Catch:{ Exception -> 0x0053 }
            r5.<init>(r6, r1, r4)     // Catch:{ Exception -> 0x0053 }
            r1.add(r5)     // Catch:{ Exception -> 0x0053 }
            q1.U2 r4 = f4070d     // Catch:{ Exception -> 0x0053 }
            r4.d(r5)     // Catch:{ Exception -> 0x0053 }
            return
        L_0x0050:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x0053 }
            throw r4     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0330c3.q0(int, android.os.IBinder, android.content.IntentFilter):void");
    }

    public final void v0(String str, String str2) {
        try {
            C0241f0 f0Var = C0360h3.f4112a;
            f0Var.getClass();
            U0.b bVar = new U0.b(f0Var);
            while (bVar.hasNext()) {
                Q2 q2 = (Q2) bVar.next();
                if (str != null) {
                    if (str.length() != 0) {
                        if (!i.a(q2.f3962a, str)) {
                        }
                    }
                }
                if (str2 != null) {
                    if (str2.length() != 0) {
                        if (!i.a(q2.f3963c, str2)) {
                        }
                    }
                }
                try {
                    int i2 = q2.f3968i;
                    if (i2 > 0) {
                        Process.killProcess(i2);
                    } else {
                        C0318a3 a3Var = q2.f3967h;
                        if (a3Var != null) {
                            a3Var.j0();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }
}
