package j1;

import e1.a;

public final class q extends a {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f3259g = 1;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3260h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f3261i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(s sVar, u uVar) {
        super("OkHttp %s", sVar.f3266i);
        this.f3260h = sVar;
        this.f3261i = uVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r7 = this;
            r0 = 2
            java.lang.Object r1 = r7.f3261i
            java.lang.Object r2 = r7.f3260h
            int r3 = r7.f3259g
            switch(r3) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0030;
                default: goto L_0x000a;
            }
        L_0x000a:
            j1.s r2 = (j1.s) r2
            j1.u r1 = (j1.u) r1
            r1.m(r7)     // Catch:{ IOException -> 0x002b, all -> 0x0022 }
        L_0x0011:
            r3 = 0
            boolean r3 = r1.l(r3, r7)     // Catch:{ IOException -> 0x002b, all -> 0x0022 }
            if (r3 == 0) goto L_0x0019
            goto L_0x0011
        L_0x0019:
            r0 = 1
            r3 = 6
            r2.k(r0, r3)     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            e1.c.d(r1)
            goto L_0x002f
        L_0x0022:
            r0 = move-exception
            r3 = 3
            r2.k(r3, r3)     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            e1.c.d(r1)
            throw r0
        L_0x002b:
            r2.k(r0, r0)     // Catch:{ IOException -> 0x001e }
            goto L_0x001e
        L_0x002f:
            return
        L_0x0030:
            j1.q r2 = (j1.q) r2
            java.lang.Object r0 = r2.f3260h     // Catch:{ IOException -> 0x003e }
            j1.s r0 = (j1.s) r0     // Catch:{ IOException -> 0x003e }
            j1.z r0 = r0.f3280w     // Catch:{ IOException -> 0x003e }
            j1.D r1 = (j1.D) r1     // Catch:{ IOException -> 0x003e }
            r0.k(r1)     // Catch:{ IOException -> 0x003e }
            goto L_0x0047
        L_0x003e:
            java.lang.Object r0 = r2.f3260h
            j1.s r0 = (j1.s) r0
            java.util.concurrent.ThreadPoolExecutor r1 = j1.s.f3263z
            r0.l()
        L_0x0047:
            return
        L_0x0048:
            j1.y r1 = (j1.y) r1
            j1.q r2 = (j1.q) r2
            java.lang.Object r3 = r2.f3260h     // Catch:{ IOException -> 0x0056 }
            j1.s r3 = (j1.s) r3     // Catch:{ IOException -> 0x0056 }
            j1.o r3 = r3.f3264g     // Catch:{ IOException -> 0x0056 }
            r3.b(r1)     // Catch:{ IOException -> 0x0056 }
            goto L_0x0074
        L_0x0056:
            r3 = move-exception
            l1.g r4 = l1.g.f3649a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Http2Connection.Listener failure for "
            r5.<init>(r6)
            java.lang.Object r2 = r2.f3260h
            j1.s r2 = (j1.s) r2
            java.lang.String r2 = r2.f3266i
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r5 = 4
            r4.k(r5, r2, r3)
            r1.c(r0)     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.q.a():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(q qVar, Object[] objArr, y yVar) {
        super("OkHttp %s stream %d", objArr);
        this.f3260h = qVar;
        this.f3261i = yVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(q qVar, Object[] objArr, D d2) {
        super("OkHttp %s ACK Settings", objArr);
        this.f3260h = qVar;
        this.f3261i = d2;
    }
}
