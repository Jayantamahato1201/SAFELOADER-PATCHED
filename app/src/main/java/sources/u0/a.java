package U0;

import java.io.Serializable;
import q1.C0413q2;

public abstract class a implements Serializable {
    public final c f = c.f;

    /* renamed from: g  reason: collision with root package name */
    public final Class f756g = C0413q2.class;

    /* renamed from: h  reason: collision with root package name */
    public final String f757h = "<init>";

    /* renamed from: i  reason: collision with root package name */
    public final String f758i = "<init>(I)V";

    /* renamed from: j  reason: collision with root package name */
    public final boolean f759j = false;

    /* renamed from: k  reason: collision with root package name */
    public final int f760k = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (U0.a) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 != r3) goto L_0x0003
            goto L_0x003e
        L_0x0003:
            boolean r0 = r3 instanceof U0.a
            if (r0 != 0) goto L_0x0008
            goto L_0x0040
        L_0x0008:
            U0.a r3 = (U0.a) r3
            boolean r0 = r3.f759j
            boolean r1 = r2.f759j
            if (r1 != r0) goto L_0x0040
            int r0 = r2.f760k
            int r1 = r3.f760k
            if (r0 != r1) goto L_0x0040
            U0.c r0 = r2.f
            U0.c r1 = r3.f
            boolean r0 = U0.i.a(r0, r1)
            if (r0 == 0) goto L_0x0040
            java.lang.Class r0 = r2.f756g
            java.lang.Class r1 = r3.f756g
            boolean r0 = U0.i.a(r0, r1)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = r2.f757h
            java.lang.String r1 = r3.f757h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = r2.f758i
            java.lang.String r3 = r3.f758i
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0040
        L_0x003e:
            r3 = 1
            return r3
        L_0x0040:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = 0;
        c cVar = this.f;
        if (cVar != null) {
            i2 = cVar.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = i2 * 31;
        Class cls = this.f756g;
        if (cls != null) {
            i4 = cls.hashCode();
        }
        int hashCode = this.f757h.hashCode();
        int hashCode2 = (this.f758i.hashCode() + ((hashCode + ((i5 + i4) * 31)) * 31)) * 31;
        if (this.f759j) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        return ((hashCode2 + i3) * 961) + this.f760k;
    }

    public final String toString() {
        m.f774a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
