package q1;

import M0.e;
import T0.p;
import T0.r;
import U0.k;
import Z.a;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.ConditionVariable;
import i0.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class K2 extends U {
    public static final K2 b;

    /* renamed from: c  reason: collision with root package name */
    public static final E4 f3929c = new E4();

    /* renamed from: d  reason: collision with root package name */
    public static final E4 f3930d = new E4();

    /* renamed from: e  reason: collision with root package name */
    public static final ConditionVariable f3931e = new ConditionVariable();
    public static final C0413q2 f = new C0413q2(0);

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Binder, android.os.IInterface, q1.K2] */
    static {
        ? binder = new Binder();
        binder.attachInterface(binder, "top.bienvenido.mundo.IMundoPackageManagerService");
        b = binder;
        new Thread(new l(14)).start();
    }

    public static ComponentInfo S0(ComponentName componentName) {
        try {
            X3 x3 = (X3) f3929c.get(componentName.getPackageName());
            if (x3 != null) {
                return (ComponentInfo) x3.f.f4141a.a(componentName.getClassName().hashCode());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static ArrayList U0() {
        E4 e4 = f3929c;
        int i2 = e4.f3875h;
        E4 e42 = f3930d;
        ArrayList arrayList = new ArrayList(i2 + e42.f3875h);
        try {
            arrayList.addAll(e4.keySet());
            arrayList.addAll(e42.keySet());
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static List V0(Intent intent, String str, int i2, T0.l lVar, p pVar, r rVar) {
        ArrayList arrayList = new ArrayList();
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
                ComponentInfo componentInfo = (ComponentInfo) lVar.e(component);
                if (componentInfo != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    pVar.d(resolveInfo, componentInfo);
                    arrayList.add(resolveInfo);
                    return arrayList;
                }
            } else {
                String str2 = intent.getPackage();
                E4 e4 = f3929c;
                if (str2 != null) {
                    X3 x3 = (X3) e4.get(str2);
                    if (x3 != null) {
                        return (List) rVar.b(x3.f4036e, intent, str, Integer.valueOf(i2));
                    }
                } else {
                    for (X3 x32 : e4.values()) {
                        arrayList.addAll((Collection) rVar.b(x32.f4036e, intent, str, Integer.valueOf(i2)));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void W0(android.content.pm.PackageInfo r8) {
        /*
            r0 = 1
            r1 = 0
            android.content.pm.ProviderInfo[] r8 = r8.providers     // Catch:{ Exception -> 0x003b }
            if (r8 == 0) goto L_0x003b
            int r2 = r8.length     // Catch:{ Exception -> 0x003b }
            r3 = 0
        L_0x0008:
            if (r3 >= r2) goto L_0x003b
            r4 = r8[r3]     // Catch:{ Exception -> 0x003b }
            java.lang.String r5 = r4.authority     // Catch:{ Exception -> 0x003b }
            if (r5 == 0) goto L_0x0039
            char[] r6 = new char[r0]     // Catch:{ Exception -> 0x003b }
            r7 = 59
            r6[r1] = r7     // Catch:{ Exception -> 0x003b }
            java.util.List r5 = b1.i.i0(r5, r6)     // Catch:{ Exception -> 0x003b }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x003b }
        L_0x001e:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x003b }
            if (r6 == 0) goto L_0x0039
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x003b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x003b }
            q1.q2 r7 = f     // Catch:{ Exception -> 0x003b }
            monitor-enter(r7)     // Catch:{ Exception -> 0x003b }
            int r6 = r6.hashCode()     // Catch:{ all -> 0x0036 }
            r7.b(r6, r4)     // Catch:{ all -> 0x0036 }
            monitor-exit(r7)     // Catch:{ Exception -> 0x003b }
            goto L_0x001e
        L_0x0036:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ Exception -> 0x003b }
            throw r8     // Catch:{ Exception -> 0x003b }
        L_0x0039:
            int r3 = r3 + r0
            goto L_0x0008
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.K2.W0(android.content.pm.PackageInfo):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x017a A[LOOP:7: B:88:0x0178->B:89:0x017a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void X0() {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            boolean r3 = q1.F3.f3882a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.io.File r4 = q1.F3.b     // Catch:{ Exception -> 0x0035 }
            java.io.File[] r4 = r4.listFiles()     // Catch:{ Exception -> 0x0035 }
            if (r4 != 0) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            int r5 = r4.length     // Catch:{ Exception -> 0x0035 }
            r6 = 0
        L_0x0015:
            if (r6 >= r5) goto L_0x0035
            r7 = r4[r6]     // Catch:{ Exception -> 0x0035 }
            boolean r8 = r7.isDirectory()     // Catch:{ Exception -> 0x0035 }
            if (r8 == 0) goto L_0x0033
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0035 }
            java.lang.String r9 = "installation.bin"
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x0035 }
            boolean r9 = r8.exists()     // Catch:{ Exception -> 0x0035 }
            if (r9 == 0) goto L_0x0030
            r3.add(r8)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0033
        L_0x0030:
            q1.S1.a(r7)     // Catch:{ Exception -> 0x0035 }
        L_0x0033:
            int r6 = r6 + r2
            goto L_0x0015
        L_0x0035:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.size()
            r4.<init>(r5)
            int r5 = r3.size()
            r6 = 0
        L_0x0043:
            if (r6 >= r5) goto L_0x0095
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + r2
            java.io.File r7 = (java.io.File) r7
            byte[] r7 = Q0.k.g0(r7)
            android.os.Parcel r8 = android.os.Parcel.obtain()
            int r9 = r7.length     // Catch:{ all -> 0x0091 }
            r8.unmarshall(r7, r1, r9)     // Catch:{ all -> 0x0091 }
            r8.setDataPosition(r1)     // Catch:{ all -> 0x0091 }
            java.lang.Class<android.content.pm.PackageInfo> r7 = android.content.pm.PackageInfo.class
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ all -> 0x0091 }
            android.os.Parcelable r7 = r8.readParcelable(r7)     // Catch:{ all -> 0x0091 }
            android.content.pm.PackageInfo r7 = (android.content.pm.PackageInfo) r7     // Catch:{ all -> 0x0091 }
            if (r7 != 0) goto L_0x006e
            android.content.pm.PackageInfo r7 = new android.content.pm.PackageInfo     // Catch:{ all -> 0x0091 }
            r7.<init>()     // Catch:{ all -> 0x0091 }
        L_0x006e:
            q1.X3 r9 = new q1.X3     // Catch:{ all -> 0x0091 }
            android.content.pm.ApplicationInfo r10 = r7.applicationInfo     // Catch:{ all -> 0x0091 }
            if (r10 != 0) goto L_0x0079
            android.content.pm.ApplicationInfo r10 = new android.content.pm.ApplicationInfo     // Catch:{ all -> 0x0091 }
            r10.<init>()     // Catch:{ all -> 0x0091 }
        L_0x0079:
            r9.<init>(r7, r10)     // Catch:{ all -> 0x0091 }
            q1.j4 r7 = new q1.j4     // Catch:{ all -> 0x0091 }
            r7.<init>(r0, r9)     // Catch:{ all -> 0x0091 }
            java.util.concurrent.ExecutorService r10 = q1.d5.b     // Catch:{ all -> 0x0091 }
            java.util.concurrent.Future r7 = r10.submit(r7)     // Catch:{ all -> 0x0091 }
            r4.add(r7)     // Catch:{ all -> 0x0091 }
            q1.E4 r7 = f3929c     // Catch:{ all -> 0x0091 }
            java.lang.String r10 = r9.f4254a     // Catch:{ all -> 0x0091 }
            r7.put(r10, r9)     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r8.recycle()
            goto L_0x0043
        L_0x0095:
            java.io.File r3 = q1.U3.f4017a     // Catch:{ Exception -> 0x00b5 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b5 }
            r3.<init>()     // Catch:{ Exception -> 0x00b5 }
            java.io.File r5 = q1.U3.f4017a     // Catch:{ Exception -> 0x00b5 }
            java.io.File[] r5 = r5.listFiles()     // Catch:{ Exception -> 0x00b5 }
            if (r5 != 0) goto L_0x00a5
            goto L_0x00ba
        L_0x00a5:
            int r6 = r5.length     // Catch:{ Exception -> 0x00b5 }
            r7 = 0
        L_0x00a7:
            if (r7 >= r6) goto L_0x00ba
            r8 = r5[r7]     // Catch:{ Exception -> 0x00b5 }
            boolean r9 = r8.isDirectory()     // Catch:{ Exception -> 0x00b5 }
            if (r9 == 0) goto L_0x00b8
            r3.add(r8)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00b8
        L_0x00b5:
            goto L_0x0141
        L_0x00b8:
            int r7 = r7 + r2
            goto L_0x00a7
        L_0x00ba:
            int r5 = r3.size()     // Catch:{ Exception -> 0x00b5 }
            r6 = 0
        L_0x00bf:
            if (r6 >= r5) goto L_0x0141
            java.lang.Object r7 = r3.get(r6)     // Catch:{ Exception -> 0x00b5 }
            int r6 = r6 + r2
            java.io.File r7 = (java.io.File) r7     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r8 = r7.getName()     // Catch:{ Exception -> 0x00b5 }
            q1.E4 r9 = f3929c     // Catch:{ Exception -> 0x00b5 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ Exception -> 0x00b5 }
            q1.X3 r9 = (q1.X3) r9     // Catch:{ Exception -> 0x00b5 }
            if (r9 != 0) goto L_0x0124
            android.content.Context r9 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x00e3 }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ Exception -> 0x00e3 }
            r10 = 512(0x200, float:7.175E-43)
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r8, r10)     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00e4
        L_0x00e3:
            r9 = 0
        L_0x00e4:
            if (r9 != 0) goto L_0x00f1
            q1.x2 r7 = new q1.x2     // Catch:{ Exception -> 0x00b5 }
            r7.<init>(r0, r8)     // Catch:{ Exception -> 0x00b5 }
            java.util.concurrent.ExecutorService r8 = q1.d5.b     // Catch:{ Exception -> 0x00b5 }
            r8.execute(r7)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00bf
        L_0x00f1:
            q1.E4 r9 = f3930d     // Catch:{ Exception -> 0x00b5 }
            java.io.File[] r7 = r7.listFiles()     // Catch:{ Exception -> 0x00b5 }
            if (r7 == 0) goto L_0x0114
            q1.u2 r10 = new q1.u2     // Catch:{ Exception -> 0x00b5 }
            int r11 = r7.length     // Catch:{ Exception -> 0x00b5 }
            r10.<init>((int) r11)     // Catch:{ Exception -> 0x00b5 }
            int r11 = r7.length     // Catch:{ Exception -> 0x00b5 }
            r12 = 0
        L_0x0101:
            if (r12 >= r11) goto L_0x011b
            r13 = r7[r12]     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r13 = r13.getName()     // Catch:{ Exception -> 0x00b5 }
            q1.q2 r14 = r10.f     // Catch:{ Exception -> 0x00b5 }
            int r15 = r13.hashCode()     // Catch:{ Exception -> 0x00b5 }
            r14.b(r15, r13)     // Catch:{ Exception -> 0x00b5 }
            int r12 = r12 + r2
            goto L_0x0101
        L_0x0114:
            q1.u2 r10 = new q1.u2     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r7 = "0"
            r10.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x00b5 }
        L_0x011b:
            q1.z r7 = new q1.z     // Catch:{ Exception -> 0x00b5 }
            r7.<init>(r8, r10)     // Catch:{ Exception -> 0x00b5 }
            r9.put(r8, r7)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00bf
        L_0x0124:
            java.io.File[] r7 = r7.listFiles()     // Catch:{ Exception -> 0x00b5 }
            if (r7 == 0) goto L_0x00bf
            q1.u2 r8 = r9.b     // Catch:{ Exception -> 0x00b5 }
            int r9 = r7.length     // Catch:{ Exception -> 0x00b5 }
            r10 = 0
        L_0x012e:
            if (r10 >= r9) goto L_0x00bf
            r11 = r7[r10]     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r11 = r11.getName()     // Catch:{ Exception -> 0x00b5 }
            q1.q2 r12 = r8.f     // Catch:{ Exception -> 0x00b5 }
            int r13 = r11.hashCode()     // Catch:{ Exception -> 0x00b5 }
            r12.b(r13, r11)     // Catch:{ Exception -> 0x00b5 }
            int r10 = r10 + r2
            goto L_0x012e
        L_0x0141:
            int r0 = q1.C0360h3.f4114d
            if (r0 != 0) goto L_0x0174
            r0 = 1
        L_0x0146:
            r3 = 25
            if (r0 >= r3) goto L_0x0167
            k.f0 r3 = q1.C0360h3.f4112a     // Catch:{ Exception -> 0x0167 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0167 }
            java.lang.Object r5 = r3.f3459a     // Catch:{ all -> 0x0164 }
            q1.q2 r5 = (q1.C0413q2) r5     // Catch:{ all -> 0x0164 }
            int[] r6 = r5.f4177a     // Catch:{ all -> 0x0164 }
            int r5 = r5.f4178c     // Catch:{ all -> 0x0164 }
            int r5 = q1.H.a(r5, r0, r6)     // Catch:{ all -> 0x0164 }
            if (r5 < 0) goto L_0x015d
            r5 = 1
            goto L_0x015e
        L_0x015d:
            r5 = 0
        L_0x015e:
            monitor-exit(r3)     // Catch:{ all -> 0x0164 }
            if (r5 != 0) goto L_0x0162
            goto L_0x0168
        L_0x0162:
            int r0 = r0 + r2
            goto L_0x0146
        L_0x0164:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x0167 }
            throw r0     // Catch:{ Exception -> 0x0167 }
        L_0x0167:
            r0 = 0
        L_0x0168:
            q1.V2 r3 = new q1.V2
            r3.<init>(r0, r1)
            java.util.concurrent.ExecutorService r5 = q1.d5.b
            r5.execute(r3)
            q1.C0360h3.f4114d = r0
        L_0x0174:
            int r0 = r4.size()
        L_0x0178:
            if (r1 >= r0) goto L_0x0185
            java.lang.Object r3 = r4.get(r1)
            int r1 = r1 + r2
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r3.get()
            goto L_0x0178
        L_0x0185:
            q1.n2 r0 = q1.C0395n2.b
            r0.getClass()
            i0.l r0 = new i0.l
            r1 = 11
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r1 = q1.d5.b
            r1.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.K2.X0():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void Y0(android.content.pm.PackageInfo r7) {
        /*
            r0 = 1
            r1 = 0
            android.content.pm.ProviderInfo[] r7 = r7.providers     // Catch:{ Exception -> 0x003b }
            if (r7 == 0) goto L_0x003b
            int r2 = r7.length     // Catch:{ Exception -> 0x003b }
            r3 = 0
        L_0x0008:
            if (r3 >= r2) goto L_0x003b
            r4 = r7[r3]     // Catch:{ Exception -> 0x003b }
            java.lang.String r4 = r4.authority     // Catch:{ Exception -> 0x003b }
            if (r4 == 0) goto L_0x0039
            char[] r5 = new char[r0]     // Catch:{ Exception -> 0x003b }
            r6 = 59
            r5[r1] = r6     // Catch:{ Exception -> 0x003b }
            java.util.List r4 = b1.i.i0(r4, r5)     // Catch:{ Exception -> 0x003b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x003b }
        L_0x001e:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x003b }
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x003b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x003b }
            q1.q2 r6 = f     // Catch:{ Exception -> 0x003b }
            monitor-enter(r6)     // Catch:{ Exception -> 0x003b }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0036 }
            r6.c(r5)     // Catch:{ all -> 0x0036 }
            monitor-exit(r6)     // Catch:{ Exception -> 0x003b }
            goto L_0x001e
        L_0x0036:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ Exception -> 0x003b }
            throw r7     // Catch:{ Exception -> 0x003b }
        L_0x0039:
            int r3 = r3 + r0
            goto L_0x0008
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.K2.Y0(android.content.pm.PackageInfo):void");
    }

    public static void Z0(String str) {
        try {
            Q4 q4 = new Q4(str, 1, (X3) f3929c.remove(str));
            ExecutorService executorService = d5.b;
            executorService.execute(q4);
            executorService.execute(new C0454x2(3, str));
            executorService.execute(new C0454x2(1, str));
            C0463z zVar = (C0463z) f3930d.remove(str);
            C0395n2.b.getClass();
            executorService.execute(new l(11));
        } catch (Exception unused) {
        }
    }

    public final boolean B0(String str) {
        if (f3929c.containsKey(str) || f3930d.containsKey(str)) {
            return true;
        }
        return false;
    }

    public final ResolveInfo D0(Intent intent, String str, int i2) {
        List c2 = c(intent, str, i2);
        H.n(c2);
        return (ResolveInfo) e.B0(c2);
    }

    public final String[] F0(int i2) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = ((H0) f3929c.f3876i.f4181a).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((X3) entry.getValue()).f4035d.uid == i2) {
                    arrayList.add(entry.getKey());
                }
            }
        } catch (Exception unused) {
        }
        return (String[]) arrayList.toArray(H.f3888e);
    }

    public final ApplicationInfo I0(int i2, String str) {
        try {
            X3 x3 = (X3) f3929c.get(str);
            if (x3 != null) {
                return x3.f4035d;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final ProviderInfo L0(ComponentName componentName) {
        return (ProviderInfo) S0(componentName);
    }

    public final void O(List list) {
        try {
            if (!list.isEmpty()) {
                d5.b.execute(new C0373j4(3, list));
            }
        } catch (Throwable unused) {
        }
    }

    public final ActivityInfo O0(ComponentName componentName) {
        return (ActivityInfo) S0(componentName);
    }

    public final ArrayList P(String str, String str2) {
        try {
            ArrayList arrayList = new ArrayList();
            for (X3 x3 : f3929c.values()) {
                ProviderInfo[] providerInfoArr = x3.f4034c.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        if (providerInfo.authority != null) {
                            if (str == null || str.equals(providerInfo.processName)) {
                                if (str2 != null) {
                                    if (str2.length() != 0) {
                                        Bundle bundle = providerInfo.metaData;
                                        if (bundle != null) {
                                            if (!bundle.containsKey(str2)) {
                                            }
                                        }
                                    }
                                }
                                arrayList.add(providerInfo);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public final PackageInfo R(int i2, String str) {
        PackageInfo packageInfo;
        try {
            X3 x3 = (X3) f3929c.get(str);
            if (x3 == null || (packageInfo = x3.f4034c) == null) {
                return null;
            }
            return V.b(packageInfo, i2);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean T0(String str) {
        if (str == null) {
            try {
                new Thread(new l(13)).start();
                return true;
            } catch (Exception unused) {
                return false;
            }
        } else {
            boolean z2 = F3.f3882a;
            if (!new File(F3.b, str).exists()) {
                return false;
            }
            File a2 = F3.a(str);
            if (y(4, a2.getAbsolutePath()) < 0) {
                return false;
            }
            S1.a(a2);
            return true;
        }
    }

    public final ArrayList U(int i2) {
        E4 e4 = f3929c;
        ArrayList arrayList = new ArrayList(e4.f3875h);
        try {
            for (X3 x3 : e4.values()) {
                arrayList.add(V.b(x3.f4034c, i2));
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final boolean V(String str) {
        return f3929c.containsKey(str);
    }

    public final String[] X(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        String[] strArr = new String[iArr.length];
        int length = iArr.length;
        boolean z2 = false;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                String g2 = g(iArr[i2]);
                if (g2 != null) {
                    strArr[i2] = g2;
                    z2 = true;
                }
            } catch (Exception unused) {
            }
        }
        if (z2) {
            return strArr;
        }
        return null;
    }

    public final int a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            for (X3 x3 : f3929c.values()) {
                if (str.equals(x3.f4034c.sharedUserId)) {
                    return x3.f4035d.uid;
                }
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final List b(Intent intent, String str, int i2) {
        B b2 = new B(1, this, K2.class, "getServiceInfo", "getServiceInfo(Landroid/content/ComponentName;)Landroid/content/pm/ServiceInfo;", 0, 5);
        B b3 = b2;
        return V0(intent, str, i2, b3, new K(2, C0460y2.f4251m, k.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0, 6), D2.f3871n);
    }

    public final List c(Intent intent, String str, int i2) {
        B b2 = new B(1, this, K2.class, "getActivityInfo", "getActivityInfo(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;", 0, 2);
        B b3 = b2;
        return V0(intent, str, i2, b3, new K(2, C0441v1.f4220m, k.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0, 3), A1.f3861n);
    }

    public final List d(Intent intent, String str, int i2) {
        B b2 = new B(1, this, K2.class, "getProviderInfo", "getProviderInfo(Landroid/content/ComponentName;)Landroid/content/pm/ProviderInfo;", 0, 3);
        B b3 = b2;
        return V0(intent, str, i2, b3, new K(2, P1.f3956m, k.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0, 4), V1.f4018n);
    }

    public final void d0(String str, String str2) {
        d5.f4080a.execute(new J2(0, str, str2));
    }

    public final List e(Intent intent, String str, int i2) {
        B b2 = new B(1, this, K2.class, "getReceiverInfo", "getReceiverInfo(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;", 0, 4);
        B b3 = b2;
        return V0(intent, str, i2, b3, new K(2, C0365i2.f4116m, k.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0, 5), C0401o2.f4150n);
    }

    public final ResolveInfo e0(Intent intent, String str, int i2) {
        List b2 = b(intent, str, i2);
        H.n(b2);
        return (ResolveInfo) e.B0(b2);
    }

    public final ArrayList f0(int i2) {
        E4 e4 = f3929c;
        ArrayList arrayList = new ArrayList(e4.f3875h);
        try {
            for (X3 x3 : e4.values()) {
                arrayList.add(x3.f4035d);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final String g(int i2) {
        try {
            Iterator it = ((H0) f3929c.f3876i.f4181a).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((X3) entry.getValue()).f4035d.uid == i2) {
                    return (String) entry.getKey();
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int i0(String str) {
        try {
            X3 x3 = (X3) f3929c.get(str);
            if (x3 != null) {
                return x3.f4035d.uid;
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final ServiceInfo j(ComponentName componentName) {
        return (ServiceInfo) S0(componentName);
    }

    public final int o0(ComponentName componentName) {
        try {
            X3 x3 = (X3) f3929c.get(componentName.getPackageName());
            if (x3 == null) {
                return -1;
            }
            return x3.f4037g.a(componentName.getClassName());
        } catch (Exception unused) {
            return 0;
        }
    }

    public final ActivityInfo u(ComponentName componentName) {
        return (ActivityInfo) S0(componentName);
    }

    public final boolean u0(String str) {
        int i2;
        try {
            C0413q2 q2Var = O3.f3952a;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            if (H.a(q2Var.f4178c, i2, q2Var.f4177a) >= 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public final ProviderInfo w0(String str) {
        try {
            return (ProviderInfo) f.a(str.hashCode());
        } catch (Exception unused) {
            return null;
        }
    }

    public final String x0(String str) {
        File file = E0.f3872a;
        return new File(E0.f3872a, str).getAbsolutePath();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c A[SYNTHETIC, Splitter:B:10:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int y(int r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 49845(0xc2b5, float:6.9848E-41)
            r1 = 0
            r2 = 0
            java.lang.Object r0 = top.bienvenido.mundo.common.initialize.MNative.a(r0, r1)     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x000c
            goto L_0x0016
        L_0x000c:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0015 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0017
        L_0x0015:
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 != 0) goto L_0x001c
            r5 = -11
            return r5
        L_0x001c:
            q1.q r0 = new q1.q     // Catch:{ Exception -> 0x0094 }
            r1 = 3
            r0.<init>(r1, r6)     // Catch:{ Exception -> 0x0094 }
            q1.E4 r1 = f3929c
            if (r5 == 0) goto L_0x0068
            r3 = 1
            if (r5 == r3) goto L_0x005d
            r2 = 2
            if (r5 == r2) goto L_0x004b
            r6 = 3
            if (r5 == r6) goto L_0x0040
            r6 = 4
            if (r5 == r6) goto L_0x0035
            r5 = -10
            return r5
        L_0x0035:
            java.lang.Object r5 = r0.a()     // Catch:{ Exception -> 0x0094 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ Exception -> 0x0094 }
            L0.b r5 = q1.Z1.c(r5, r3)     // Catch:{ Exception -> 0x0094 }
            goto L_0x0072
        L_0x0040:
            java.lang.Object r5 = r0.a()     // Catch:{ Exception -> 0x0094 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ Exception -> 0x0094 }
            L0.b r5 = q1.Z1.a(r5, r3)     // Catch:{ Exception -> 0x0094 }
            goto L_0x0072
        L_0x004b:
            java.lang.Object r5 = r1.remove(r6)     // Catch:{ Exception -> 0x0094 }
            q1.X3 r5 = (q1.X3) r5     // Catch:{ Exception -> 0x0094 }
            q1.Q4 r0 = new q1.Q4     // Catch:{ Exception -> 0x0094 }
            r1 = 1
            r0.<init>(r6, r1, r5)     // Catch:{ Exception -> 0x0094 }
            java.util.concurrent.ExecutorService r5 = q1.d5.b     // Catch:{ Exception -> 0x0094 }
            r5.execute(r0)     // Catch:{ Exception -> 0x0094 }
            return r3
        L_0x005d:
            java.lang.Object r5 = r0.a()     // Catch:{ Exception -> 0x0094 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ Exception -> 0x0094 }
            L0.b r5 = q1.Z1.c(r5, r2)     // Catch:{ Exception -> 0x0094 }
            goto L_0x0072
        L_0x0068:
            java.lang.Object r5 = r0.a()     // Catch:{ Exception -> 0x0094 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ Exception -> 0x0094 }
            L0.b r5 = q1.Z1.a(r5, r2)     // Catch:{ Exception -> 0x0094 }
        L_0x0072:
            java.lang.Object r6 = r5.f586g     // Catch:{ Exception -> 0x0094 }
            q1.X3 r6 = (q1.X3) r6     // Catch:{ Exception -> 0x0094 }
            if (r6 == 0) goto L_0x008b
            java.lang.String r0 = r6.f4254a     // Catch:{ Exception -> 0x0094 }
            java.lang.Object r0 = r1.put(r0, r6)     // Catch:{ Exception -> 0x0094 }
            q1.X3 r0 = (q1.X3) r0     // Catch:{ Exception -> 0x0094 }
            q1.Q4 r1 = new q1.Q4     // Catch:{ Exception -> 0x0094 }
            r2 = 2
            r1.<init>(r6, r2, r0)     // Catch:{ Exception -> 0x0094 }
            java.util.concurrent.ExecutorService r6 = q1.d5.b     // Catch:{ Exception -> 0x0094 }
            r6.execute(r1)     // Catch:{ Exception -> 0x0094 }
        L_0x008b:
            java.lang.Object r5 = r5.f     // Catch:{ Exception -> 0x0094 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ Exception -> 0x0094 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0094 }
            return r5
        L_0x0094:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.K2.y(int, java.lang.String):int");
    }

    public final void y0(ComponentName componentName, int i2) {
        try {
            X3 x3 = (X3) f3929c.get(componentName.getPackageName());
            if (x3 != null) {
                d5.b.execute(new a(x3, componentName, i2, 2));
            }
        } catch (Exception unused) {
        }
    }
}
