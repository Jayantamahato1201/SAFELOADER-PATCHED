package q1;

import T0.l;
import T0.q;
import T0.r;

public abstract class Y0 extends L3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4040a;

    public /* synthetic */ Y0(int i2) {
        this.f4040a = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.content.pm.ResolveInfo} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = q1.C0394n1.f4143a;
        r0.startService(new android.content.Intent(r0, top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.Object r8, java.lang.reflect.Method r9, java.lang.Object[] r10) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            int r3 = r7.f4040a
            switch(r3) {
                case 0: goto L_0x0077;
                default: goto L_0x0008;
            }
        L_0x0008:
            r3 = r10[r2]     // Catch:{ Exception -> 0x0072 }
            boolean r4 = r3 instanceof java.lang.String     // Catch:{ Exception -> 0x0072 }
            if (r4 == 0) goto L_0x0072
            java.lang.String r4 = q1.C0394n1.b     // Catch:{ Exception -> 0x0072 }
            boolean r4 = U0.i.a(r3, r4)     // Catch:{ Exception -> 0x0072 }
            if (r4 != 0) goto L_0x0072
            boolean r4 = q1.H.f3900r     // Catch:{ Exception -> 0x0072 }
            if (r4 != 0) goto L_0x0034
            java.lang.String r4 = q1.H.f3896n     // Catch:{ Exception -> 0x0072 }
            boolean r4 = U0.i.a(r3, r4)     // Catch:{ Exception -> 0x0072 }
            if (r4 == 0) goto L_0x0034
            q1.L3.c(r10, r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.Object r0 = r9.invoke(r8, r10)     // Catch:{ Exception -> 0x0072 }
            if (r0 == 0) goto L_0x0076
            T0.l r1 = r7.d()     // Catch:{ Exception -> 0x0072 }
            r1.e(r0)     // Catch:{ Exception -> 0x0072 }
            r1 = r0
            goto L_0x0076
        L_0x0034:
            q1.l1 r4 = q1.C0382l1.f4134c     // Catch:{ Exception -> 0x0072 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0072 }
            r4.getClass()     // Catch:{ Exception -> 0x0072 }
            android.os.IInterface r4 = r4.b()     // Catch:{ Exception -> 0x005a }
            q1.f0 r4 = (q1.C0345f0) r4     // Catch:{ Exception -> 0x005a }
            T0.q r5 = r7.e()     // Catch:{ Exception -> 0x005a }
            r0 = r10[r0]     // Catch:{ Exception -> 0x005a }
            boolean r6 = r0 instanceof java.lang.Number     // Catch:{ Exception -> 0x005a }
            if (r6 == 0) goto L_0x0051
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x005a }
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x005a }
        L_0x0051:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x005a }
            java.lang.Object r1 = r5.c(r4, r3, r0)     // Catch:{ Exception -> 0x005a }
            goto L_0x0068
        L_0x005a:
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0067 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0067 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r3 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x0067 }
            r0.startService(r2)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0068
        L_0x0067:
        L_0x0068:
            if (r1 == 0) goto L_0x0072
            T0.l r0 = r7.d()     // Catch:{ Exception -> 0x0072 }
            r0.e(r1)     // Catch:{ Exception -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            java.lang.Object r1 = r9.invoke(r8, r10)
        L_0x0076:
            return r1
        L_0x0077:
            r2 = r10[r2]     // Catch:{ Exception -> 0x00b1 }
            boolean r3 = r2 instanceof android.content.Intent     // Catch:{ Exception -> 0x00b1 }
            if (r3 == 0) goto L_0x008d
            q1.l1 r3 = q1.C0382l1.f4134c     // Catch:{ Exception -> 0x00b1 }
            q1.S0 r4 = new q1.S0     // Catch:{ Exception -> 0x00b1 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ Exception -> 0x00b1 }
            r4.<init>(r7, r2, r10, r0)     // Catch:{ Exception -> 0x00b1 }
            java.lang.Object r0 = r3.d(r4)     // Catch:{ Exception -> 0x00b1 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ Exception -> 0x00b1 }
            goto L_0x008e
        L_0x008d:
            r0 = r1
        L_0x008e:
            if (r0 != 0) goto L_0x009b
            r0 = 2
            q1.L3.c(r10, r0)     // Catch:{ Exception -> 0x00b1 }
            java.lang.Object r8 = r9.invoke(r8, r10)     // Catch:{ Exception -> 0x00b1 }
            r0 = r8
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ Exception -> 0x00b1 }
        L_0x009b:
            if (r0 == 0) goto L_0x00b1
            q1.v4 r8 = q1.C0444v4.f4223a     // Catch:{ Exception -> 0x00b1 }
            T0.l r8 = r7.d()     // Catch:{ Exception -> 0x00b1 }
            U0.k r8 = (U0.k) r8     // Catch:{ Exception -> 0x00b1 }
            java.lang.Object r8 = r8.i(r0)     // Catch:{ Exception -> 0x00b1 }
            android.content.pm.ComponentInfo r8 = (android.content.pm.ComponentInfo) r8     // Catch:{ Exception -> 0x00b1 }
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo     // Catch:{ Exception -> 0x00b1 }
            q1.C0444v4.b(r8)     // Catch:{ Exception -> 0x00b1 }
            r1 = r0
        L_0x00b1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.Y0.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public abstract l d();

    public abstract q e();

    public abstract r f();
}
