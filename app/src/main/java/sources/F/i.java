package F;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f205a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f205a = i2;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r0 >= r2.size()) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        ((F.i) r2.get(r0)).a(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f205a
            switch(r0) {
                case 0: goto L_0x003b;
                default: goto L_0x0005;
            }
        L_0x0005:
            F.j r5 = (F.j) r5
            java.lang.Object r0 = F.k.f208c
            monitor-enter(r0)
            n.k r1 = F.k.f209d     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r4.b     // Catch:{ all -> 0x001b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x001b }
            r3 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r3)     // Catch:{ all -> 0x001b }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            goto L_0x0038
        L_0x001b:
            r5 = move-exception
            goto L_0x0039
        L_0x001d:
            java.lang.Object r3 = r4.b     // Catch:{ all -> 0x001b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x001b }
            r1.remove(r3)     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            r0 = 0
        L_0x0026:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x0038
            java.lang.Object r1 = r2.get(r0)
            F.i r1 = (F.i) r1
            r1.a(r5)
            int r0 = r0 + 1
            goto L_0x0026
        L_0x0038:
            return
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r5
        L_0x003b:
            F.j r5 = (F.j) r5
            if (r5 != 0) goto L_0x0045
            F.j r5 = new F.j
            r0 = -3
            r5.<init>((int) r0)
        L_0x0045:
            java.lang.Object r0 = r4.b
            F.c r0 = (F.c) r0
            r0.F(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F.i.a(java.lang.Object):void");
    }
}
