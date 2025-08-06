package q1;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final /* synthetic */ class N3 implements Runnable {
    public final /* synthetic */ boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f3944g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3945h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ApplicationInfo f3946i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ C0413q2 f3947j;

    public /* synthetic */ N3(boolean z2, Context context, String str, ApplicationInfo applicationInfo, C0413q2 q2Var) {
        this.f = z2;
        this.f3944g = context;
        this.f3945h = str;
        this.f3946i = applicationInfo;
        this.f3947j = q2Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            r0 = 0
            boolean r1 = r8.f
            android.content.Context r2 = r8.f3944g
            java.lang.String r3 = r8.f3945h
            android.content.pm.ApplicationInfo r4 = r8.f3946i
            q1.q2 r5 = r8.f3947j
            if (r1 != 0) goto L_0x0013
            r0 = 3
            android.content.Context r0 = r2.createPackageContext(r3, r0)     // Catch:{ Exception -> 0x003b }
            goto L_0x0027
        L_0x0013:
            q1.C0 r1 = q1.O3.b     // Catch:{ Exception -> 0x003b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x003b }
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x003b }
            r7[r0] = r4     // Catch:{ Exception -> 0x003b }
            r0 = 1
            r7[r0] = r6     // Catch:{ Exception -> 0x003b }
            java.lang.Object r0 = r1.b(r2, r7)     // Catch:{ Exception -> 0x003b }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ Exception -> 0x003b }
        L_0x0027:
            q1.H3 r0 = q1.O3.a(r0)     // Catch:{ Exception -> 0x003b }
            if (r0 != 0) goto L_0x002e
            goto L_0x003b
        L_0x002e:
            monitor-enter(r5)     // Catch:{ Exception -> 0x003b }
            int r1 = r3.hashCode()     // Catch:{ all -> 0x0038 }
            r5.b(r1, r0)     // Catch:{ all -> 0x0038 }
            monitor-exit(r5)     // Catch:{ Exception -> 0x003b }
            return
        L_0x0038:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x003b }
            throw r0     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.N3.run():void");
    }
}
