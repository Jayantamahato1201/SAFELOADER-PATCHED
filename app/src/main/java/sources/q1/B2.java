package q1;

public abstract class B2 {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.Class r5, java.lang.String r6) {
        /*
            r0 = 1
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ Exception -> 0x0030 }
            r5.setAccessible(r0)     // Catch:{ Exception -> 0x0030 }
            int r6 = r5.getModifiers()     // Catch:{ Exception -> 0x0030 }
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)     // Catch:{ Exception -> 0x0030 }
            if (r6 != 0) goto L_0x0029
            java.lang.Class r6 = r5.getType()     // Catch:{ Exception -> 0x0030 }
            boolean r6 = r6.isPrimitive()     // Catch:{ Exception -> 0x0030 }
            if (r6 == 0) goto L_0x001d
            goto L_0x0029
        L_0x001d:
            sun.misc.Unsafe r6 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x0030 }
            long r5 = r6.objectFieldOffset(r5)     // Catch:{ Exception -> 0x0030 }
            q1.t0 r1 = new q1.t0     // Catch:{ Exception -> 0x0030 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0032
        L_0x0029:
            q1.g0 r1 = new q1.g0     // Catch:{ Exception -> 0x0030 }
            r6 = 2
            r1.<init>(r5, r6)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0032
        L_0x0030:
            q1.C0 r1 = q1.C0.f3864a
        L_0x0032:
            r5 = 0
            java.lang.Object r6 = r1.a(r5)
            if (r6 == 0) goto L_0x0060
            q1.q1 r2 = new q1.q1
            q1.L3 r3 = q1.C0458y0.f4242a
            r2.<init>(r6, r3)
            q1.h0 r6 = new q1.h0
            r3 = 1
            r6.<init>((int) r3)
            q1.q2 r3 = r2.f4174a
            r4 = -89840621(0xfffffffffaa52413, float:-4.2873033E35)
            r3.b(r4, r6)
            q1.h0 r6 = new q1.h0
            r4 = 2
            r6.<init>((int) r4)
            r4 = -1315692475(0xffffffffb1942045, float:-4.3110355E-9)
            r3.b(r4, r6)
            java.lang.Object r6 = r2.f4176d
            r1.c(r5, r6)
            return r0
        L_0x0060:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.B2.a(java.lang.Class, java.lang.String):boolean");
    }
}
