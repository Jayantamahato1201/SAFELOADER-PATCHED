package q1;

import android.os.Binder;

public final class Z extends C0380l {
    public static final Z b;

    /* renamed from: c  reason: collision with root package name */
    public static final X0 f4042c = new X0("");

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Binder, android.os.IInterface, q1.Z] */
    static {
        ? binder = new Binder();
        binder.attachInterface(binder, "top.bienvenido.mundo.IMundoContentService");
        b = binder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(android.net.Uri r3, android.os.IBinder r4, boolean r5) {
        /*
            r2 = this;
            if (r4 == 0) goto L_0x0011
            if (r3 != 0) goto L_0x0005
            goto L_0x0011
        L_0x0005:
            q1.X0 r0 = f4042c     // Catch:{ Exception -> 0x0011 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0011 }
            r1 = 0
            r0.a(r3, r1, r4, r5)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ Exception -> 0x0011 }
            return
        L_0x000e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x0011 }
            throw r3     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.Z.C(android.net.Uri, android.os.IBinder, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q0(android.os.IBinder r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0003
            goto L_0x000e
        L_0x0003:
            q1.X0 r0 = f4042c     // Catch:{ Exception -> 0x000e }
            monitor-enter(r0)     // Catch:{ Exception -> 0x000e }
            r0.d(r2)     // Catch:{ all -> 0x000b }
            monitor-exit(r0)     // Catch:{ Exception -> 0x000e }
            return
        L_0x000b:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x000e }
            throw r2     // Catch:{ Exception -> 0x000e }
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.Z.Q0(android.os.IBinder):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|3f|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        monitor-enter(f4042c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r4 = r12.b;
        r12 = r12.f3940a.f4032c;
        r5 = r12.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r6 < r5) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (((q1.R0) r12.get(r6)).f3978a == r4) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r12.remove(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r6 = r6 - 1;
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z(android.net.Uri r10, android.os.IBinder r11, boolean r12) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x006d }
            r7.<init>()     // Catch:{ all -> 0x006d }
            q1.X0 r2 = f4042c     // Catch:{ all -> 0x006d }
            monitor-enter(r2)     // Catch:{ all -> 0x006d }
            r4 = 0
            r3 = r10
            r5 = r11
            r6 = r12
            r2.b(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x006d }
            int r10 = r7.size()     // Catch:{ all -> 0x006d }
            r11 = 0
        L_0x0017:
            if (r11 >= r10) goto L_0x006d
            java.lang.Object r12 = r7.get(r11)     // Catch:{ all -> 0x006d }
            q1.N0 r12 = (q1.N0) r12     // Catch:{ all -> 0x006d }
            android.os.IBinder r2 = r12.b     // Catch:{ RemoteException -> 0x003d }
            android.database.IContentObserver r2 = android.database.IContentObserver.Stub.asInterface(r2)     // Catch:{ RemoteException -> 0x003d }
            boolean r4 = q1.T4.f4002h     // Catch:{ RemoteException -> 0x003d }
            if (r4 == 0) goto L_0x0035
            boolean r4 = r12.f3941c     // Catch:{ RemoteException -> 0x003d }
            android.net.Uri[] r5 = new android.net.Uri[r1]     // Catch:{ RemoteException -> 0x003d }
            r5[r0] = r3     // Catch:{ RemoteException -> 0x003d }
            int r6 = q1.C0394n1.f4145d     // Catch:{ RemoteException -> 0x003d }
            r2.onChangeEtc(r4, r5, r0, r6)     // Catch:{ RemoteException -> 0x003d }
            goto L_0x0065
        L_0x0035:
            boolean r4 = r12.f3941c     // Catch:{ RemoteException -> 0x003d }
            int r5 = q1.C0394n1.f4145d     // Catch:{ RemoteException -> 0x003d }
            r2.onChange(r4, r3, r5)     // Catch:{ RemoteException -> 0x003d }
            goto L_0x0065
        L_0x003d:
            q1.X0 r2 = f4042c     // Catch:{ all -> 0x006d }
            monitor-enter(r2)     // Catch:{ all -> 0x006d }
            android.os.IBinder r4 = r12.b     // Catch:{ all -> 0x005f }
            q1.X0 r12 = r12.f3940a     // Catch:{ all -> 0x005f }
            java.util.ArrayList r12 = r12.f4032c     // Catch:{ all -> 0x005f }
            int r5 = r12.size()     // Catch:{ all -> 0x005f }
            r6 = 0
        L_0x004b:
            if (r6 >= r5) goto L_0x0064
            java.lang.Object r8 = r12.get(r6)     // Catch:{ all -> 0x005f }
            q1.R0 r8 = (q1.R0) r8     // Catch:{ all -> 0x005f }
            android.os.IBinder r8 = r8.f3978a     // Catch:{ all -> 0x005f }
            if (r8 != r4) goto L_0x0062
            r12.remove(r6)     // Catch:{ all -> 0x005f }
            int r6 = r6 + -1
            int r5 = r5 + -1
            goto L_0x0062
        L_0x005f:
            r0 = move-exception
            r10 = r0
            goto L_0x0067
        L_0x0062:
            int r6 = r6 + r1
            goto L_0x004b
        L_0x0064:
            monitor-exit(r2)     // Catch:{ all -> 0x006d }
        L_0x0065:
            int r11 = r11 + r1
            goto L_0x0017
        L_0x0067:
            monitor-exit(r2)     // Catch:{ all -> 0x006d }
            throw r10     // Catch:{ all -> 0x006d }
        L_0x0069:
            r0 = move-exception
            r10 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x006d }
            throw r10     // Catch:{ all -> 0x006d }
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.Z.Z(android.net.Uri, android.os.IBinder, boolean):void");
    }
}
