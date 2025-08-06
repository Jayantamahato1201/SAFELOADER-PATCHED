package K0;

public final class F extends Thread {
    public final /* synthetic */ int f = 0;

    public /* synthetic */ F(Runnable runnable) {
        super(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.m();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            int r0 = r3.f
            switch(r0) {
                case 0: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<o1.c> r0 = o1.c.class
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0005 }
            o1.c r1 = o1.c.h()     // Catch:{ all -> 0x0010 }
            if (r1 != 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            goto L_0x0005
        L_0x0010:
            r1 = move-exception
            goto L_0x0020
        L_0x0012:
            o1.c r2 = o1.c.f3740j     // Catch:{ all -> 0x0010 }
            if (r1 != r2) goto L_0x001b
            r1 = 0
            o1.c.f3740j = r1     // Catch:{ all -> 0x0010 }
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            r1.m()     // Catch:{ InterruptedException -> 0x0005 }
            goto L_0x0005
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r1     // Catch:{ InterruptedException -> 0x0005 }
        L_0x0022:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.F.run():void");
    }

    public /* synthetic */ F(String str) {
        super(str);
    }
}
