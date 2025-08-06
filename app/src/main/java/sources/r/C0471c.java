package r;

import A.g;
import java.util.HashSet;
import java.util.Iterator;
import q.h;
import q.i;

/* renamed from: r.c  reason: case insensitive filesystem */
public final class C0471c {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f4281a = null;
    public final C0472d b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4282c;

    /* renamed from: d  reason: collision with root package name */
    public C0471c f4283d;

    /* renamed from: e  reason: collision with root package name */
    public int f4284e = 0;
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public i f4285g;

    public C0471c(C0472d dVar, int i2) {
        this.b = dVar;
        this.f4282c = i2;
    }

    public final void a(C0471c cVar, int i2) {
        b(cVar, i2, -1, false);
    }

    public final boolean b(C0471c cVar, int i2, int i3, boolean z2) {
        if (cVar == null) {
            h();
            return true;
        } else if (!z2 && !g(cVar)) {
            return false;
        } else {
            this.f4283d = cVar;
            if (cVar.f4281a == null) {
                cVar.f4281a = new HashSet();
            }
            this.f4283d.f4281a.add(this);
            if (i2 > 0) {
                this.f4284e = i2;
            } else {
                this.f4284e = 0;
            }
            this.f = i3;
            return true;
        }
    }

    public final int c() {
        C0471c cVar;
        if (this.b.f4306V == 8) {
            return 0;
        }
        int i2 = this.f;
        if (i2 <= -1 || (cVar = this.f4283d) == null || cVar.b.f4306V != 8) {
            return this.f4284e;
        }
        return i2;
    }

    public final C0471c d() {
        int i2 = this.f4282c;
        int b2 = h.b(i2);
        C0472d dVar = this.b;
        switch (b2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f4337z;
            case 2:
                return dVar.f4286A;
            case 3:
                return dVar.f4335x;
            case 4:
                return dVar.f4336y;
            default:
                throw new AssertionError(g.l(i2));
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f4281a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0471c) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.f4283d != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x005d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(r.C0471c r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            goto L_0x005f
        L_0x0004:
            r1 = 6
            int r2 = r8.f4282c
            r3 = 1
            r.d r4 = r9.b
            int r9 = r9.f4282c
            if (r9 != r2) goto L_0x001b
            if (r2 != r1) goto L_0x005d
            boolean r9 = r4.f4334w
            if (r9 == 0) goto L_0x005f
            r.d r9 = r8.b
            boolean r9 = r9.f4334w
            if (r9 != 0) goto L_0x005d
            goto L_0x005f
        L_0x001b:
            int r5 = q.h.b(r2)
            r6 = 8
            r7 = 9
            switch(r5) {
                case 0: goto L_0x005f;
                case 1: goto L_0x004b;
                case 2: goto L_0x0037;
                case 3: goto L_0x004b;
                case 4: goto L_0x0037;
                case 5: goto L_0x005f;
                case 6: goto L_0x0030;
                case 7: goto L_0x005f;
                case 8: goto L_0x005f;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r0 = A.g.l(r2)
            r9.<init>(r0)
            throw r9
        L_0x0030:
            if (r9 == r1) goto L_0x005f
            if (r9 == r6) goto L_0x005f
            if (r9 == r7) goto L_0x005f
            goto L_0x005d
        L_0x0037:
            r1 = 3
            if (r9 == r1) goto L_0x0040
            r1 = 5
            if (r9 != r1) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r1 = 0
            goto L_0x0041
        L_0x0040:
            r1 = 1
        L_0x0041:
            boolean r2 = r4 instanceof r.h
            if (r2 == 0) goto L_0x004a
            if (r1 != 0) goto L_0x005d
            if (r9 != r7) goto L_0x005f
            goto L_0x005d
        L_0x004a:
            return r1
        L_0x004b:
            r1 = 2
            if (r9 == r1) goto L_0x0054
            r1 = 4
            if (r9 != r1) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r1 = 0
            goto L_0x0055
        L_0x0054:
            r1 = 1
        L_0x0055:
            boolean r2 = r4 instanceof r.h
            if (r2 == 0) goto L_0x005e
            if (r1 != 0) goto L_0x005d
            if (r9 != r6) goto L_0x005f
        L_0x005d:
            return r3
        L_0x005e:
            return r1
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C0471c.g(r.c):boolean");
    }

    public final void h() {
        HashSet hashSet;
        C0471c cVar = this.f4283d;
        if (!(cVar == null || (hashSet = cVar.f4281a) == null)) {
            hashSet.remove(this);
        }
        this.f4283d = null;
        this.f4284e = 0;
        this.f = -1;
    }

    public final void i() {
        i iVar = this.f4285g;
        if (iVar == null) {
            this.f4285g = new i(1);
        } else {
            iVar.c();
        }
    }

    public final String toString() {
        return this.b.f4307W + ":" + g.l(this.f4282c);
    }
}
