package q1;

import H0.C;
import T0.q;
import java.lang.reflect.Method;

public final class Q3 extends S3 {

    /* renamed from: d  reason: collision with root package name */
    public static final Q3 f3974d = new C0376k1(3);

    /* renamed from: e  reason: collision with root package name */
    public static q f3975e = new C(10);

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r9 = q1.C0.f3864a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[Catch:{ all -> 0x0074 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            q1.Q3 r0 = f3974d
            java.lang.Object r7 = super.a(r7, r8, r9)
            boolean r8 = q1.H.f3895m     // Catch:{ all -> 0x0074 }
            if (r8 == 0) goto L_0x0074
            boolean r8 = r7 instanceof java.lang.Object[]     // Catch:{ all -> 0x0074 }
            if (r8 == 0) goto L_0x0074
            r8 = r7
            android.os.storage.StorageVolume[] r8 = (android.os.storage.StorageVolume[]) r8     // Catch:{ all -> 0x0074 }
            int r9 = r8.length     // Catch:{ all -> 0x0074 }
            if (r9 != 0) goto L_0x0015
            return r7
        L_0x0015:
            java.lang.Class r9 = E.j.k()     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "mPath"
            r1 = 1
            java.lang.reflect.Field r9 = r9.getDeclaredField(r0)     // Catch:{ Exception -> 0x004c }
            r9.setAccessible(r1)     // Catch:{ Exception -> 0x004c }
            int r0 = r9.getModifiers()     // Catch:{ Exception -> 0x004c }
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch:{ Exception -> 0x004c }
            if (r0 != 0) goto L_0x0044
            java.lang.Class r0 = r9.getType()     // Catch:{ Exception -> 0x004c }
            boolean r0 = r0.isPrimitive()     // Catch:{ Exception -> 0x004c }
            if (r0 == 0) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            sun.misc.Unsafe r0 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x004c }
            long r2 = r0.objectFieldOffset(r9)     // Catch:{ Exception -> 0x004c }
            q1.t0 r9 = new q1.t0     // Catch:{ Exception -> 0x004c }
            r9.<init>(r2)     // Catch:{ Exception -> 0x004c }
            goto L_0x004e
        L_0x0044:
            q1.g0 r0 = new q1.g0     // Catch:{ Exception -> 0x004c }
            r2 = 2
            r0.<init>(r9, r2)     // Catch:{ Exception -> 0x004c }
            r9 = r0
            goto L_0x004e
        L_0x004c:
            q1.C0 r9 = q1.C0.f3864a     // Catch:{ all -> 0x0074 }
        L_0x004e:
            int r0 = r8.length     // Catch:{ all -> 0x0074 }
            r2 = 0
            r3 = 0
        L_0x0051:
            if (r3 >= r0) goto L_0x0074
            r4 = r8[r3]     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = r4.getState()     // Catch:{ all -> 0x0074 }
            java.lang.String r6 = "mounted"
            boolean r5 = U0.i.a(r5, r6)     // Catch:{ all -> 0x0074 }
            if (r5 == 0) goto L_0x0071
            android.os.storage.StorageVolume[] r8 = new android.os.storage.StorageVolume[r1]     // Catch:{ all -> 0x0074 }
            r8[r2] = r4     // Catch:{ all -> 0x0074 }
            q1.l1 r0 = q1.C0382l1.f4134c     // Catch:{ all -> 0x0074 }
            q1.S0 r1 = new q1.S0     // Catch:{ all -> 0x0074 }
            r2 = 2
            r1.<init>(r9, r4, r8, r2)     // Catch:{ all -> 0x0074 }
            r0.d(r1)     // Catch:{ all -> 0x0074 }
            return r8
        L_0x0071:
            int r3 = r3 + 1
            goto L_0x0051
        L_0x0074:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.Q3.d(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        return f3975e.c(obj, method, objArr);
    }
}
