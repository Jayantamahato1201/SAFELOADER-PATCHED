package q1;

public final class I3 extends L3 {
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = q1.C0394n1.f4143a;
        r0.startService(new android.content.Intent(r0, top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            r6 = this;
            q1.l1 r0 = q1.C0382l1.f4134c     // Catch:{ Exception -> 0x004e }
            r0.getClass()     // Catch:{ Exception -> 0x004e }
            r1 = 0
            r2 = 0
            android.os.IInterface r0 = r0.b()     // Catch:{ Exception -> 0x0027 }
            q1.f0 r0 = (q1.C0345f0) r0     // Catch:{ Exception -> 0x0027 }
            r3 = r9[r1]     // Catch:{ Exception -> 0x0027 }
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0027 }
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            r4 = 3
            r4 = r9[r4]     // Catch:{ Exception -> 0x0027 }
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0027 }
            goto L_0x0022
        L_0x0021:
            r4 = r2
        L_0x0022:
            java.util.ArrayList r0 = r0.P(r3, r4)     // Catch:{ Exception -> 0x0027 }
            goto L_0x0036
        L_0x0027:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0034 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0034 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r4 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r3.<init>(r0, r4)     // Catch:{ Exception -> 0x0034 }
            r0.startService(r3)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r0 == 0) goto L_0x0050
            int r3 = r0.size()     // Catch:{ Exception -> 0x004e }
        L_0x003c:
            if (r1 >= r3) goto L_0x0051
            java.lang.Object r4 = r0.get(r1)     // Catch:{ Exception -> 0x004e }
            int r1 = r1 + 1
            android.content.pm.ProviderInfo r4 = (android.content.pm.ProviderInfo) r4     // Catch:{ Exception -> 0x004e }
            q1.v4 r5 = q1.C0444v4.f4223a     // Catch:{ Exception -> 0x004e }
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch:{ Exception -> 0x004e }
            q1.C0444v4.b(r4)     // Catch:{ Exception -> 0x004e }
            goto L_0x003c
        L_0x004e:
            goto L_0x0096
        L_0x0050:
            r0 = r2
        L_0x0051:
            java.lang.Object r7 = r8.invoke(r7, r9)     // Catch:{ Exception -> 0x004e }
            java.util.List r7 = q1.C0459y1.b(r7)     // Catch:{ Exception -> 0x004e }
            if (r7 == 0) goto L_0x0074
            q1.v4 r9 = q1.C0444v4.f4223a     // Catch:{ Exception -> 0x004e }
            java.util.Iterator r9 = r7.iterator()     // Catch:{ Exception -> 0x004e }
        L_0x0061:
            boolean r1 = r9.hasNext()     // Catch:{ Exception -> 0x004e }
            if (r1 == 0) goto L_0x0073
            java.lang.Object r1 = r9.next()     // Catch:{ Exception -> 0x004e }
            android.content.pm.ComponentInfo r1 = (android.content.pm.ComponentInfo) r1     // Catch:{ Exception -> 0x004e }
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch:{ Exception -> 0x004e }
            q1.C0444v4.b(r1)     // Catch:{ Exception -> 0x004e }
            goto L_0x0061
        L_0x0073:
            r2 = r7
        L_0x0074:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x004e }
            r7.<init>()     // Catch:{ Exception -> 0x004e }
            if (r0 == 0) goto L_0x007e
            r7.addAll(r0)     // Catch:{ Exception -> 0x004e }
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            r7.addAll(r2)     // Catch:{ Exception -> 0x004e }
        L_0x0083:
            T0.l r9 = q1.C0459y1.f4250a     // Catch:{ Exception -> 0x004e }
            java.lang.Class<android.content.pm.ParceledListSlice> r9 = android.content.pm.ParceledListSlice.class
            java.lang.Class r0 = r8.getReturnType()     // Catch:{ Exception -> 0x004e }
            boolean r9 = r9.isAssignableFrom(r0)     // Catch:{ Exception -> 0x004e }
            if (r9 == 0) goto L_0x0095
            android.content.pm.ParceledListSlice r7 = q1.C0459y1.a(r7)     // Catch:{ Exception -> 0x004e }
        L_0x0095:
            return r7
        L_0x0096:
            T0.l r7 = q1.C0459y1.f4250a
            java.lang.Class r7 = r8.getReturnType()
            java.lang.Class<android.content.pm.ParceledListSlice> r8 = android.content.pm.ParceledListSlice.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L_0x00a7
            android.content.pm.ParceledListSlice r7 = q1.M1.f3937a
            goto L_0x00a9
        L_0x00a7:
            java.util.List r7 = java.util.Collections.EMPTY_LIST
        L_0x00a9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.I3.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
