package q;

import androidx.emoji2.text.r;
import java.util.ArrayList;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public i f3812a = null;
    public float b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f3813c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public C0308b f3814d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3815e = false;

    public c(r rVar) {
        this.f3814d = new C0307a(this, rVar);
    }

    public final void a(e eVar, int i2) {
        this.f3814d.i(eVar.i(i2), 1.0f);
        this.f3814d.i(eVar.i(i2), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.b = (float) i2;
        }
        if (!z2) {
            this.f3814d.i(iVar, -1.0f);
            this.f3814d.i(iVar2, 1.0f);
            this.f3814d.i(iVar3, 1.0f);
            return;
        }
        this.f3814d.i(iVar, 1.0f);
        this.f3814d.i(iVar2, -1.0f);
        this.f3814d.i(iVar3, -1.0f);
    }

    public final void c(i iVar, i iVar2, i iVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.b = (float) i2;
        }
        if (!z2) {
            this.f3814d.i(iVar, -1.0f);
            this.f3814d.i(iVar2, 1.0f);
            this.f3814d.i(iVar3, -1.0f);
            return;
        }
        this.f3814d.i(iVar, 1.0f);
        this.f3814d.i(iVar2, -1.0f);
        this.f3814d.i(iVar3, 1.0f);
    }

    public i d(boolean[] zArr) {
        return e(zArr, (i) null);
    }

    public final i e(boolean[] zArr, i iVar) {
        int i2;
        int k2 = this.f3814d.k();
        i iVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < k2; i3++) {
            float a2 = this.f3814d.a(i3);
            if (a2 < 0.0f) {
                i e2 = this.f3814d.e(i3);
                if ((zArr == null || !zArr[e2.b]) && e2 != iVar && (((i2 = e2.f3844l) == 3 || i2 == 4) && a2 < f)) {
                    f = a2;
                    iVar2 = e2;
                }
            }
        }
        return iVar2;
    }

    public final void f(i iVar) {
        i iVar2 = this.f3812a;
        if (iVar2 != null) {
            this.f3814d.i(iVar2, -1.0f);
            this.f3812a = null;
        }
        float f = this.f3814d.f(iVar, true) * -1.0f;
        this.f3812a = iVar;
        if (f != 1.0f) {
            this.b /= f;
            this.f3814d.h(f);
        }
    }

    public final void g(i iVar, boolean z2) {
        if (iVar.f) {
            float c2 = this.f3814d.c(iVar);
            this.b = (iVar.f3838e * c2) + this.b;
            this.f3814d.f(iVar, z2);
            if (z2) {
                iVar.b(this);
            }
        }
    }

    public void h(c cVar, boolean z2) {
        float d2 = this.f3814d.d(cVar, z2);
        this.b = (cVar.b * d2) + this.b;
        if (z2) {
            cVar.f3812a.b(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        r7 = r10.f3814d.a(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            q.i r0 = r10.f3812a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0017
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            q.i r1 = r10.f3812a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0017:
            java.lang.String r1 = " = "
            java.lang.String r0 = A.g.h(r0, r1)
            float r1 = r10.b
            r2 = 1
            r3 = 0
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0035
            java.lang.StringBuilder r0 = q.h.a(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            q.b r5 = r10.f3814d
            int r5 = r5.k()
        L_0x003c:
            if (r3 >= r5) goto L_0x009d
            q.b r6 = r10.f3814d
            q.i r6 = r6.e(r3)
            if (r6 != 0) goto L_0x0047
            goto L_0x009a
        L_0x0047:
            q.b r7 = r10.f3814d
            float r7 = r7.a(r3)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0052
            goto L_0x009a
        L_0x0052:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0067
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0077
            java.lang.String r1 = "- "
            java.lang.String r0 = A.g.h(r0, r1)
        L_0x0064:
            float r7 = r7 * r9
            goto L_0x0077
        L_0x0067:
            if (r8 <= 0) goto L_0x0070
            java.lang.String r1 = " + "
            java.lang.String r0 = A.g.h(r0, r1)
            goto L_0x0077
        L_0x0070:
            java.lang.String r1 = " - "
            java.lang.String r0 = A.g.h(r0, r1)
            goto L_0x0064
        L_0x0077:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0082
            java.lang.String r0 = A.g.h(r0, r6)
            goto L_0x0099
        L_0x0082:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x0099:
            r1 = 1
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x003c
        L_0x009d:
            if (r1 != 0) goto L_0x00a5
            java.lang.String r1 = "0.0"
            java.lang.String r0 = A.g.h(r0, r1)
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.c.toString():java.lang.String");
    }
}
