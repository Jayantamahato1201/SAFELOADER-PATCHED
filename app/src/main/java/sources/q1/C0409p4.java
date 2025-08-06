package q1;

/* renamed from: q1.p4  reason: case insensitive filesystem */
public abstract class C0409p4 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0376k1 f4172a = new C0376k1(20);
    public static Object b;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2 = q1.C0.f3864a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043 A[Catch:{ all -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
            java.lang.Object r0 = b
            if (r0 == 0) goto L_0x0005
            goto L_0x0062
        L_0x0005:
            java.lang.Class<android.app.ActivityClient> r0 = android.app.ActivityClient.class
            java.lang.String r1 = "INTERFACE_SINGLETON"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x0039 }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ Exception -> 0x0039 }
            int r1 = r0.getModifiers()     // Catch:{ Exception -> 0x0039 }
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch:{ Exception -> 0x0039 }
            if (r1 != 0) goto L_0x0032
            java.lang.Class r1 = r0.getType()     // Catch:{ Exception -> 0x0039 }
            boolean r1 = r1.isPrimitive()     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x0026
            goto L_0x0032
        L_0x0026:
            sun.misc.Unsafe r1 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x0039 }
            long r0 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0039 }
            q1.t0 r2 = new q1.t0     // Catch:{ Exception -> 0x0039 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0039 }
            goto L_0x003b
        L_0x0032:
            q1.g0 r2 = new q1.g0     // Catch:{ Exception -> 0x0039 }
            r1 = 2
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0039 }
            goto L_0x003b
        L_0x0039:
            q1.C0 r2 = q1.C0.f3864a     // Catch:{ all -> 0x0062 }
        L_0x003b:
            r0 = 0
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            java.lang.String r1 = "mKnownInstance"
            q1.g0 r2 = new q1.g0     // Catch:{ all -> 0x0062 }
            r2.<init>(r1)     // Catch:{ all -> 0x0062 }
            java.lang.Object r1 = r2.f4098c     // Catch:{ all -> 0x0062 }
            q1.C0 r1 = (q1.C0) r1     // Catch:{ all -> 0x0062 }
            java.lang.Object r1 = r1.a(r0)     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0055
            goto L_0x0062
        L_0x0055:
            java.lang.Object r1 = c(r1)     // Catch:{ all -> 0x0062 }
            b = r1     // Catch:{ all -> 0x0062 }
            java.lang.Object r2 = r2.f4098c     // Catch:{ all -> 0x0062 }
            q1.C0 r2 = (q1.C0) r2     // Catch:{ all -> 0x0062 }
            r2.c(r0, r1)     // Catch:{ all -> 0x0062 }
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0409p4.a():void");
    }

    public static void b(Object obj) {
        if (b == null) {
            try {
                C0351g0 g0Var = new C0351g0("mActivityClientController");
                Object a2 = ((C0) g0Var.f4098c).a(obj);
                if (a2 != null) {
                    Object c2 = c(a2);
                    b = c2;
                    ((C0) g0Var.f4098c).c(obj, c2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static Object c(Object obj) {
        C0412q1 q1Var = new C0412q1(obj, C0458y0.b);
        C0376k1 k1Var = f4172a;
        C0413q2 q2Var = q1Var.f4174a;
        q2Var.b(463520714, k1Var);
        q2Var.b(1293072352, C0458y0.f4247h);
        q2Var.b(-1666360360, H.f3891i);
        q2Var.b(1770569149, H.f3892j);
        q2Var.b(1349683719, C0376k1.b);
        q2Var.b(-1111243300, C0352g1.f4099a);
        return q1Var.f4176d;
    }
}
