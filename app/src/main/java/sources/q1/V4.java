package q1;

public abstract class V4 {

    /* renamed from: a  reason: collision with root package name */
    public L3 f4021a = C0458y0.f4242a;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0019, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q1.C0412q1 a(java.lang.String r5, java.lang.Object r6) {
        /*
            r4 = this;
            q1.q2 r0 = q1.C0388m1.f4140a
            q1.L3 r0 = r4.f4021a
            r1 = 0
            java.util.Map r2 = q1.C0388m1.b     // Catch:{ Exception -> 0x0019 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0019 }
            android.os.IBinder r3 = android.os.ServiceManager.getService(r5)     // Catch:{ all -> 0x0016 }
            if (r3 != 0) goto L_0x0010
            monitor-exit(r2)     // Catch:{ Exception -> 0x0019 }
            return r1
        L_0x0010:
            monitor-exit(r2)     // Catch:{ Exception -> 0x0019 }
            q1.q1 r5 = q1.C0388m1.b(r5, r0, r3, r6)     // Catch:{ Exception -> 0x0019 }
            return r5
        L_0x0016:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x0019 }
            throw r5     // Catch:{ Exception -> 0x0019 }
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.V4.a(java.lang.String, java.lang.Object):q1.q1");
    }

    public abstract void b();

    public final void c(String... strArr) {
        C0413q2 q2Var = C0388m1.f4140a;
        L3 l3 = this.f4021a;
        try {
            for (String c2 : strArr) {
                C0388m1.c(c2, l3, (String) null);
            }
        } catch (Exception unused) {
        }
    }
}
