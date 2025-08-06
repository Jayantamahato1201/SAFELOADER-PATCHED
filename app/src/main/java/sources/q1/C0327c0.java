package q1;

import android.os.IBinder;

/* renamed from: q1.c0  reason: case insensitive filesystem */
public final /* synthetic */ class C0327c0 implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ IBinder f4066g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ IBinder f4067h;

    public /* synthetic */ C0327c0(IBinder iBinder, IBinder iBinder2, int i2) {
        this.f = i2;
        this.f4066g = iBinder;
        this.f4067h = iBinder2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f
            switch(r0) {
                case 0: goto L_0x0025;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.os.IBinder r0 = r10.f4066g
            android.os.IBinder r1 = r10.f4067h
            q1.F r2 = q1.F.f3877c
            r2.getClass()
            android.os.IInterface r2 = r2.b()     // Catch:{ Exception -> 0x0018 }
            q1.s0 r2 = (q1.C0422s0) r2     // Catch:{ Exception -> 0x0018 }
            r2.G0(r0, r1)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0024
        L_0x0018:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0024 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0024 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r2 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0024 }
            r0.startService(r1)     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            return
        L_0x0025:
            android.os.IBinder r0 = r10.f4066g
            android.os.IBinder r1 = r10.f4067h
            r2 = r0
            q1.g3 r2 = (q1.C0354g3) r2     // Catch:{ all -> 0x00de }
            q1.Q2 r2 = r2.f4102c     // Catch:{ all -> 0x00de }
            q1.u2 r2 = r2.f3973n     // Catch:{ all -> 0x00de }
            q1.q2 r2 = r2.f     // Catch:{ all -> 0x00de }
            int r3 = r0.hashCode()     // Catch:{ all -> 0x00de }
            r2.b(r3, r0)     // Catch:{ all -> 0x00de }
            r2 = 0
            if (r1 == 0) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00de }
            T0.a r4 = q1.C0339e0.f4085g     // Catch:{ all -> 0x00de }
            java.lang.Object r4 = r4.a()     // Catch:{ all -> 0x00de }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00de }
            if (r3 == 0) goto L_0x00de
            r3 = r0
            q1.g3 r3 = (q1.C0354g3) r3     // Catch:{ all -> 0x00de }
            r3.f4104e = r1     // Catch:{ all -> 0x00de }
            java.util.concurrent.ConcurrentHashMap r3 = q1.C0339e0.f4082c     // Catch:{ all -> 0x00de }
            if (r1 != 0) goto L_0x005a
            goto L_0x00de
        L_0x005a:
            r3.put(r1, r0)     // Catch:{ all -> 0x00de }
            r3 = r0
            q1.g3 r3 = (q1.C0354g3) r3     // Catch:{ all -> 0x00de }
            int r3 = r3.f     // Catch:{ all -> 0x00de }
            r4 = -1
            if (r3 != r4) goto L_0x0081
            r3 = r0
            q1.g3 r3 = (q1.C0354g3) r3     // Catch:{ all -> 0x00de }
            T0.l r5 = q1.C0339e0.f4086h     // Catch:{ all -> 0x00de }
            java.lang.Object r1 = r5.e(r1)     // Catch:{ all -> 0x00de }
            r5 = r1
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x00de }
            int r5 = r5.intValue()     // Catch:{ all -> 0x00de }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x00de }
            int r1 = r1.intValue()     // Catch:{ all -> 0x00de }
            r3.f = r1     // Catch:{ all -> 0x00de }
            if (r5 != r4) goto L_0x0080
            goto L_0x00de
        L_0x0080:
            r3 = r5
        L_0x0081:
            k.f0 r1 = q1.C0339e0.f4083d     // Catch:{ all -> 0x00de }
            monitor-enter(r1)     // Catch:{ all -> 0x00de }
            java.lang.Object r4 = r1.f3459a     // Catch:{ all -> 0x0097 }
            q1.q2 r4 = (q1.C0413q2) r4     // Catch:{ all -> 0x0097 }
            int[] r5 = r4.f4177a     // Catch:{ all -> 0x0097 }
            int r6 = r4.f4178c     // Catch:{ all -> 0x0097 }
            java.lang.Object[] r7 = r4.b     // Catch:{ all -> 0x0097 }
            int r8 = q1.H.a(r6, r3, r5)     // Catch:{ all -> 0x0097 }
            if (r8 < 0) goto L_0x0099
            r2 = r7[r8]     // Catch:{ all -> 0x0097 }
            goto L_0x00cd
        L_0x0097:
            r0 = move-exception
            goto L_0x00dc
        L_0x0099:
            int r8 = ~r8     // Catch:{ all -> 0x0097 }
            int[] r3 = q1.H.s(r5, r6, r8, r3)     // Catch:{ all -> 0x0097 }
            r4.f4177a = r3     // Catch:{ all -> 0x0097 }
            int r3 = r6 + 1
            r4.f4178c = r3     // Catch:{ all -> 0x0097 }
            java.util.concurrent.ConcurrentLinkedDeque r5 = new java.util.concurrent.ConcurrentLinkedDeque     // Catch:{ all -> 0x0097 }
            r5.<init>()     // Catch:{ all -> 0x0097 }
            int r9 = r7.length     // Catch:{ all -> 0x0097 }
            if (r3 > r9) goto L_0x00b5
            int r2 = r8 + 1
            int r6 = r6 - r8
            java.lang.System.arraycopy(r7, r8, r7, r2, r6)     // Catch:{ all -> 0x0097 }
            r7[r8] = r5     // Catch:{ all -> 0x0097 }
            goto L_0x00ca
        L_0x00b5:
            r3 = 4
            if (r6 >= r3) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            int r3 = r6 * 2
        L_0x00bb:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0097 }
            java.lang.System.arraycopy(r7, r2, r3, r2, r8)     // Catch:{ all -> 0x0097 }
            r3[r8] = r5     // Catch:{ all -> 0x0097 }
            int r2 = r8 + 1
            int r6 = r7.length     // Catch:{ all -> 0x0097 }
            int r6 = r6 - r8
            java.lang.System.arraycopy(r7, r8, r3, r2, r6)     // Catch:{ all -> 0x0097 }
            r7 = r3
        L_0x00ca:
            r4.b = r7     // Catch:{ all -> 0x0097 }
            r2 = r5
        L_0x00cd:
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            r1 = r2
            java.util.Deque r1 = (java.util.Deque) r1     // Catch:{ all -> 0x00de }
            r3 = r0
            q1.g3 r3 = (q1.C0354g3) r3     // Catch:{ all -> 0x00de }
            r3.f4105g = r1     // Catch:{ all -> 0x00de }
            java.util.Deque r2 = (java.util.Deque) r2     // Catch:{ all -> 0x00de }
            r2.addLast(r0)     // Catch:{ all -> 0x00de }
            goto L_0x00de
        L_0x00dc:
            monitor-exit(r1)     // Catch:{ all -> 0x00de }
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0327c0.run():void");
    }
}
