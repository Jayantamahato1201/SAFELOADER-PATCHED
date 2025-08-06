package q1;

public final class Y extends C0 {
    public final /* synthetic */ String b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0351g0 f4039c;

    public Y(String str, C0351g0 g0Var) {
        this.b = str;
        this.f4039c = g0Var;
    }

    public final Object a(Object obj) {
        C0 d2 = d(obj);
        if (d2 != null) {
            return d2.a(obj);
        }
        return null;
    }

    public final void c(Object obj, Object obj2) {
        C0 d2 = d(obj);
        if (d2 != null) {
            d2.c(obj, obj2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|(1:27)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001b */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0021 A[EDGE_INSN: B:27:0x0021->B:11:0x0021 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q1.C0 d(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            goto L_0x0051
        L_0x0004:
            java.lang.String r1 = r4.b     // Catch:{ all -> 0x0051 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x0051 }
        L_0x000a:
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x0021
            java.lang.reflect.Field r2 = r5.getDeclaredField(r1)     // Catch:{ Exception -> 0x001b }
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ Exception -> 0x001b }
            goto L_0x0022
        L_0x001b:
            java.lang.Class r5 = r5.getSuperclass()     // Catch:{ all -> 0x0051 }
            if (r5 != 0) goto L_0x000a
        L_0x0021:
            r2 = r0
        L_0x0022:
            if (r2 != 0) goto L_0x0025
            goto L_0x0051
        L_0x0025:
            int r5 = r2.getModifiers()     // Catch:{ all -> 0x0051 }
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch:{ all -> 0x0051 }
            if (r5 != 0) goto L_0x0046
            java.lang.Class r5 = r2.getType()     // Catch:{ all -> 0x0051 }
            boolean r5 = r5.isPrimitive()     // Catch:{ all -> 0x0051 }
            if (r5 == 0) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            sun.misc.Unsafe r5 = q1.C0455x3.f4236a     // Catch:{ all -> 0x0051 }
            long r1 = r5.objectFieldOffset(r2)     // Catch:{ all -> 0x0051 }
            q1.t0 r5 = new q1.t0     // Catch:{ all -> 0x0051 }
            r5.<init>(r1)     // Catch:{ all -> 0x0051 }
            goto L_0x004c
        L_0x0046:
            q1.g0 r5 = new q1.g0     // Catch:{ all -> 0x0051 }
            r1 = 2
            r5.<init>(r2, r1)     // Catch:{ all -> 0x0051 }
        L_0x004c:
            q1.g0 r1 = r4.f4039c     // Catch:{ all -> 0x0051 }
            r1.f4098c = r5     // Catch:{ all -> 0x0051 }
            return r5
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.Y.d(java.lang.Object):q1.C0");
    }
}
