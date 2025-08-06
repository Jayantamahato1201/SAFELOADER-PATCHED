package q1;

import L0.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Service;
import android.os.ServiceWithMetadata;
import java.util.Map;

/* renamed from: q1.m1  reason: case insensitive filesystem */
public abstract class C0388m1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0413q2 f4140a = new C0413q2(0);
    public static final Map b;

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = q1.C0.f3864a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r0 = new q1.E4();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003c */
    static {
        /*
            q1.q2 r0 = new q1.q2
            r1 = 0
            r0.<init>(r1)
            f4140a = r0
            java.lang.Class<android.os.ServiceManager> r0 = android.os.ServiceManager.class
            java.lang.String r1 = "sCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x003c }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ Exception -> 0x003c }
            int r1 = r0.getModifiers()     // Catch:{ Exception -> 0x003c }
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch:{ Exception -> 0x003c }
            if (r1 != 0) goto L_0x0035
            java.lang.Class r1 = r0.getType()     // Catch:{ Exception -> 0x003c }
            boolean r1 = r1.isPrimitive()     // Catch:{ Exception -> 0x003c }
            if (r1 == 0) goto L_0x0029
            goto L_0x0035
        L_0x0029:
            sun.misc.Unsafe r1 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x003c }
            long r0 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x003c }
            q1.t0 r2 = new q1.t0     // Catch:{ Exception -> 0x003c }
            r2.<init>(r0)     // Catch:{ Exception -> 0x003c }
            goto L_0x003e
        L_0x0035:
            q1.g0 r2 = new q1.g0     // Catch:{ Exception -> 0x003c }
            r1 = 2
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x003c }
            goto L_0x003e
        L_0x003c:
            q1.C0 r2 = q1.C0.f3864a     // Catch:{ Exception -> 0x0046 }
        L_0x003e:
            r0 = 0
            java.lang.Object r0 = r2.a(r0)     // Catch:{ Exception -> 0x0046 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0046 }
            goto L_0x004b
        L_0x0046:
            q1.E4 r0 = new q1.E4
            r0.<init>()
        L_0x004b:
            b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0388m1.<clinit>():void");
    }

    public static final Service a(O o2) {
        ServiceWithMetadata serviceWithMetadata = new ServiceWithMetadata();
        serviceWithMetadata.service = o2;
        return Service.serviceWithMetadata(serviceWithMetadata);
    }

    public static C0412q1 b(String str, L3 l3, IBinder iBinder, Object obj) {
        C0412q1 q1Var = new C0412q1(obj, l3);
        O o2 = new O(iBinder, (IInterface) q1Var.f4176d);
        C0413q2 q2Var = f4140a;
        synchronized (q2Var) {
            q2Var.b(str.hashCode(), new b(o2, q1Var));
        }
        Map map = b;
        synchronized (map) {
            map.put(str, o2);
        }
        return q1Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|(2:25|31)(2:26|27)) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r10 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        r10 = r6.getInterfaceDescriptor();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        if (r10 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        r10 = r10.concat("$Stub");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (r10 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10 = java.lang.Class.forName(r10).getDeclaredMethod("asInterface", new java.lang.Class[]{android.os.IBinder.class});
        r10.setAccessible(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r2 = new q1.C0351g0(r10, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r10 = r2.b((java.lang.Object) null, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r10 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        return b(r8, r9, r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static q1.C0412q1 c(java.lang.String r8, q1.L3 r9, java.lang.String r10) {
        /*
            r0 = 0
            r1 = 1
            q1.C0 r2 = q1.C0.f3864a
            java.lang.String r3 = "$Stub"
            r4 = 0
            java.util.Map r5 = b     // Catch:{ Exception -> 0x0050 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x0050 }
            android.os.IBinder r6 = android.os.ServiceManager.getService(r8)     // Catch:{ all -> 0x004d }
            if (r6 != 0) goto L_0x0012
            monitor-exit(r5)     // Catch:{ Exception -> 0x0050 }
            return r4
        L_0x0012:
            monitor-exit(r5)     // Catch:{ Exception -> 0x0050 }
            if (r10 != 0) goto L_0x0024
            java.lang.String r10 = r6.getInterfaceDescriptor()     // Catch:{ Exception -> 0x0050 }
            if (r10 == 0) goto L_0x0020
            java.lang.String r10 = r10.concat(r3)     // Catch:{ Exception -> 0x0050 }
            goto L_0x0021
        L_0x0020:
            r10 = r4
        L_0x0021:
            if (r10 != 0) goto L_0x0024
            goto L_0x0050
        L_0x0024:
            java.lang.String r3 = "asInterface"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0050 }
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            r5[r0] = r7     // Catch:{ Exception -> 0x0050 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ Exception -> 0x003d }
            java.lang.reflect.Method r10 = r10.getDeclaredMethod(r3, r5)     // Catch:{ Exception -> 0x003d }
            r10.setAccessible(r1)     // Catch:{ Exception -> 0x003d }
            q1.g0 r3 = new q1.g0     // Catch:{ Exception -> 0x003d }
            r3.<init>(r10, r1)     // Catch:{ Exception -> 0x003d }
            r2 = r3
        L_0x003d:
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0050 }
            r10[r0] = r6     // Catch:{ Exception -> 0x0050 }
            java.lang.Object r10 = r2.b(r4, r10)     // Catch:{ Exception -> 0x0050 }
            if (r10 != 0) goto L_0x0048
            goto L_0x0050
        L_0x0048:
            q1.q1 r8 = b(r8, r9, r6, r10)     // Catch:{ Exception -> 0x0050 }
            return r8
        L_0x004d:
            r8 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x0050 }
            throw r8     // Catch:{ Exception -> 0x0050 }
        L_0x0050:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0388m1.c(java.lang.String, q1.L3, java.lang.String):q1.q1");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = q1.C0.f3864a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041 A[Catch:{ Exception -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042 A[Catch:{ Exception -> 0x007b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d() {
        /*
            java.lang.Class<android.os.ServiceManager> r0 = android.os.ServiceManager.class
            java.lang.String r1 = "sServiceManager"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x0034 }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ Exception -> 0x0034 }
            int r1 = r0.getModifiers()     // Catch:{ Exception -> 0x0034 }
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch:{ Exception -> 0x0034 }
            if (r1 != 0) goto L_0x002d
            java.lang.Class r1 = r0.getType()     // Catch:{ Exception -> 0x0034 }
            boolean r1 = r1.isPrimitive()     // Catch:{ Exception -> 0x0034 }
            if (r1 == 0) goto L_0x0021
            goto L_0x002d
        L_0x0021:
            sun.misc.Unsafe r1 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x0034 }
            long r0 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0034 }
            q1.t0 r2 = new q1.t0     // Catch:{ Exception -> 0x0034 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0036
        L_0x002d:
            q1.g0 r2 = new q1.g0     // Catch:{ Exception -> 0x0034 }
            r1 = 2
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0036
        L_0x0034:
            q1.C0 r2 = q1.C0.f3864a     // Catch:{ Exception -> 0x007b }
        L_0x0036:
            q1.q1 r0 = new q1.q1     // Catch:{ Exception -> 0x007b }
            q1.L3 r1 = q1.C0458y0.f4242a     // Catch:{ Exception -> 0x007b }
            r3 = 0
            java.lang.Object r4 = r2.a(r3)     // Catch:{ Exception -> 0x007b }
            if (r4 != 0) goto L_0x0042
            goto L_0x007b
        L_0x0042:
            r0.<init>(r4, r1)     // Catch:{ Exception -> 0x007b }
            q1.q2 r1 = r0.f4174a     // Catch:{ Exception -> 0x007b }
            q1.k1 r4 = new q1.k1     // Catch:{ Exception -> 0x007b }
            r5 = 1
            r4.<init>(r5)     // Catch:{ Exception -> 0x007b }
            r5 = -1273953665(0xffffffffb411027f, float:-1.3505085E-7)
            r1.b(r5, r4)     // Catch:{ Exception -> 0x007b }
            boolean r4 = q1.T4.f4006l     // Catch:{ Exception -> 0x007b }
            if (r4 == 0) goto L_0x0076
            boolean r4 = q1.T4.f4007m     // Catch:{ Exception -> 0x007b }
            if (r4 == 0) goto L_0x0063
            q1.c r4 = new q1.c     // Catch:{ Exception -> 0x007b }
            r5 = 8
            r4.<init>(r5)     // Catch:{ Exception -> 0x007b }
            goto L_0x006a
        L_0x0063:
            q1.c r4 = new q1.c     // Catch:{ Exception -> 0x007b }
            r5 = 9
            r4.<init>(r5)     // Catch:{ Exception -> 0x007b }
        L_0x006a:
            q1.h1 r5 = new q1.h1     // Catch:{ Exception -> 0x007b }
            r6 = 0
            r5.<init>(r6, r4)     // Catch:{ Exception -> 0x007b }
            r4 = -837857901(0xffffffffce0f4d93, float:-6.0105645E8)
            r1.b(r4, r5)     // Catch:{ Exception -> 0x007b }
        L_0x0076:
            java.lang.Object r0 = r0.f4176d     // Catch:{ Exception -> 0x007b }
            r2.c(r3, r0)     // Catch:{ Exception -> 0x007b }
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0388m1.d():void");
    }

    public static final Service e(O o2) {
        return Service.binder(o2);
    }
}
