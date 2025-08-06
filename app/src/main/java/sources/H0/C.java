package H0;

import T0.p;
import T0.q;
import f0.k;
import f0.l;
import f0.m;
import java.lang.reflect.Method;
import q1.Q3;

public final /* synthetic */ class C implements H, l, p, q {
    public final /* synthetic */ int f;

    public /* synthetic */ C(int i2) {
        this.f = i2;
    }

    public void a(k kVar, m mVar) {
        switch (this.f) {
            case 3:
                kVar.b(mVar);
                return;
            case 4:
                kVar.c(mVar);
                return;
            case 5:
                kVar.f(mVar);
                return;
            case 6:
                kVar.d();
                return;
            default:
                kVar.g();
                return;
        }
    }

    public Object c(Object obj, Object obj2, Object obj3) {
        return Q3.d(obj, (Method) obj2, (Object[]) obj3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r0 > r1) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r5 != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.f
            switch(r0) {
                case 8: goto L_0x0024;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            int r0 = r5.priority
            int r1 = r6.priority
            r2 = 1
            r3 = -1
            if (r0 == r1) goto L_0x0015
            if (r0 <= r1) goto L_0x001f
        L_0x0013:
            r2 = -1
            goto L_0x001f
        L_0x0015:
            boolean r5 = r5.isDefault
            boolean r6 = r6.isDefault
            if (r5 == r6) goto L_0x001e
            if (r5 == 0) goto L_0x001f
            goto L_0x0013
        L_0x001e:
            r2 = 0
        L_0x001f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            return r5
        L_0x0024:
            android.content.Intent r5 = (android.content.Intent) r5
            java.lang.String r6 = (java.lang.String) r6
            q1.e0 r5 = q1.C0339e0.b
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C.d(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
