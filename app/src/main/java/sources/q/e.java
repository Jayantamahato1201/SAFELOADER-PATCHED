package q;

import H.b;
import androidx.emoji2.text.r;
import java.util.Arrays;
import r.C0471c;

public final class e {

    /* renamed from: o  reason: collision with root package name */
    public static int f3816o = 1000;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f3817p = true;

    /* renamed from: a  reason: collision with root package name */
    public int f3818a;
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public int f3819c;

    /* renamed from: d  reason: collision with root package name */
    public int f3820d;

    /* renamed from: e  reason: collision with root package name */
    public c[] f3821e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f3822g;

    /* renamed from: h  reason: collision with root package name */
    public int f3823h;

    /* renamed from: i  reason: collision with root package name */
    public int f3824i;

    /* renamed from: j  reason: collision with root package name */
    public int f3825j;

    /* renamed from: k  reason: collision with root package name */
    public final r f3826k;

    /* renamed from: l  reason: collision with root package name */
    public i[] f3827l;

    /* renamed from: m  reason: collision with root package name */
    public int f3828m;

    /* renamed from: n  reason: collision with root package name */
    public c f3829n;

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, androidx.emoji2.text.r] */
    /* JADX WARNING: type inference failed for: r1v2, types: [q.c, q.g] */
    public e() {
        this.f3818a = 0;
        this.f3819c = 32;
        this.f3820d = 32;
        this.f3821e = null;
        this.f = false;
        this.f3822g = new boolean[32];
        this.f3823h = 1;
        this.f3824i = 0;
        this.f3825j = 32;
        this.f3827l = new i[f3816o];
        this.f3828m = 0;
        this.f3821e = new c[32];
        q();
        ? obj = new Object();
        obj.f1183a = new b();
        obj.b = new b();
        obj.f1184c = new b();
        obj.f1185d = new i[32];
        this.f3826k = obj;
        ? cVar = new c(obj);
        cVar.f = new i[128];
        cVar.f3831g = new i[128];
        cVar.f3832h = 0;
        cVar.f3833i = new f(cVar);
        this.b = cVar;
        if (f3817p) {
            this.f3829n = new d(obj);
        } else {
            this.f3829n = new c(obj);
        }
    }

    public static int m(Object obj) {
        i iVar = ((C0471c) obj).f4285g;
        if (iVar != null) {
            return (int) (iVar.f3838e + 0.5f);
        }
        return 0;
    }

    public final i a(int i2) {
        i iVar = (i) ((b) this.f3826k.f1184c).a();
        if (iVar == null) {
            iVar = new i(i2);
            iVar.f3844l = i2;
        } else {
            iVar.c();
            iVar.f3844l = i2;
        }
        int i3 = this.f3828m;
        int i4 = f3816o;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            f3816o = i5;
            this.f3827l = (i[]) Arrays.copyOf(this.f3827l, i5);
        }
        i[] iVarArr = this.f3827l;
        int i6 = this.f3828m;
        this.f3828m = i6 + 1;
        iVarArr[i6] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        c k2 = k();
        if (iVar2 == iVar3) {
            k2.f3814d.i(iVar, 1.0f);
            k2.f3814d.i(iVar4, 1.0f);
            k2.f3814d.i(iVar2, -2.0f);
        } else if (f2 == 0.5f) {
            k2.f3814d.i(iVar, 1.0f);
            k2.f3814d.i(iVar2, -1.0f);
            k2.f3814d.i(iVar3, -1.0f);
            k2.f3814d.i(iVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                k2.b = (float) ((-i2) + i3);
            }
        } else if (f2 <= 0.0f) {
            k2.f3814d.i(iVar, -1.0f);
            k2.f3814d.i(iVar2, 1.0f);
            k2.b = (float) i2;
        } else if (f2 >= 1.0f) {
            k2.f3814d.i(iVar4, -1.0f);
            k2.f3814d.i(iVar3, 1.0f);
            k2.b = (float) (-i3);
        } else {
            float f3 = 1.0f - f2;
            k2.f3814d.i(iVar, f3 * 1.0f);
            k2.f3814d.i(iVar2, f3 * -1.0f);
            k2.f3814d.i(iVar3, -1.0f * f2);
            k2.f3814d.i(iVar4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                k2.b = (((float) i3) * f2) + (((float) (-i2)) * f3);
            }
        }
        if (i4 != 8) {
            k2.a(this, i4);
        }
        c(k2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bc, code lost:
        if (r4.f3843k <= 1) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        if (r4.f3843k <= 1) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e1, code lost:
        if (r4.f3843k <= 1) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e5, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ef, code lost:
        if (r4.f3843k <= 1) goto L_0x00e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(q.c r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f3824i
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f3825j
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f3823h
            int r2 = r2 + r3
            int r4 = r0.f3820d
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r0.n()
        L_0x0016:
            boolean r2 = r1.f3815e
            if (r2 != 0) goto L_0x019d
            q.c[] r2 = r0.f3821e
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0070
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0070
            q.b r6 = r1.f3814d
            int r6 = r6.k()
            r7 = 0
        L_0x002b:
            java.util.ArrayList r8 = r1.f3813c
            if (r7 >= r6) goto L_0x0043
            q.b r9 = r1.f3814d
            q.i r9 = r9.e(r7)
            int r10 = r9.f3836c
            if (r10 != r5) goto L_0x003d
            boolean r10 = r9.f
            if (r10 == 0) goto L_0x0040
        L_0x003d:
            r8.add(r9)
        L_0x0040:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0043:
            int r6 = r8.size()
            if (r6 <= 0) goto L_0x006e
            int r6 = r8.size()
            r7 = 0
        L_0x004e:
            if (r7 >= r6) goto L_0x006a
            java.lang.Object r9 = r8.get(r7)
            int r7 = r7 + 1
            q.i r9 = (q.i) r9
            boolean r10 = r9.f
            if (r10 == 0) goto L_0x0060
            r1.g(r9, r3)
            goto L_0x004e
        L_0x0060:
            q.c[] r10 = r0.f3821e
            int r9 = r9.f3836c
            r9 = r10[r9]
            r1.h(r9, r3)
            goto L_0x004e
        L_0x006a:
            r8.clear()
            goto L_0x0022
        L_0x006e:
            r2 = 1
            goto L_0x0022
        L_0x0070:
            q.i r2 = r1.f3812a
            r6 = 0
            if (r2 != 0) goto L_0x0085
            float r2 = r1.b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0085
            q.b r2 = r1.f3814d
            int r2 = r2.k()
            if (r2 != 0) goto L_0x0085
            goto L_0x01a3
        L_0x0085:
            float r2 = r1.b
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0096
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.b = r2
            q.b r2 = r1.f3814d
            r2.j()
        L_0x0096:
            q.b r2 = r1.f3814d
            int r2 = r2.k()
            r7 = 0
            r9 = r7
            r10 = r9
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x00a4:
            if (r8 >= r2) goto L_0x00ff
            q.b r15 = r1.f3814d
            float r15 = r15.a(r8)
            q.b r4 = r1.f3814d
            q.i r4 = r4.e(r8)
            r16 = 0
            int r6 = r4.f3844l
            if (r6 != r3) goto L_0x00d7
            if (r9 != 0) goto L_0x00c4
            int r6 = r4.f3843k
            if (r6 > r3) goto L_0x00c0
        L_0x00be:
            r12 = 1
            goto L_0x00c1
        L_0x00c0:
            r12 = 0
        L_0x00c1:
            r9 = r4
            r11 = r15
            goto L_0x00fb
        L_0x00c4:
            int r6 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cd
            int r6 = r4.f3843k
            if (r6 > r3) goto L_0x00c0
            goto L_0x00be
        L_0x00cd:
            if (r12 != 0) goto L_0x00fb
            int r6 = r4.f3843k
            if (r6 > r3) goto L_0x00fb
            r9 = r4
            r11 = r15
            r12 = 1
            goto L_0x00fb
        L_0x00d7:
            if (r9 != 0) goto L_0x00fb
            int r6 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r6 >= 0) goto L_0x00fb
            if (r10 != 0) goto L_0x00e9
            int r6 = r4.f3843k
            if (r6 > r3) goto L_0x00e5
        L_0x00e3:
            r14 = 1
            goto L_0x00e6
        L_0x00e5:
            r14 = 0
        L_0x00e6:
            r10 = r4
            r13 = r15
            goto L_0x00fb
        L_0x00e9:
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f2
            int r6 = r4.f3843k
            if (r6 > r3) goto L_0x00e5
            goto L_0x00e3
        L_0x00f2:
            if (r14 != 0) goto L_0x00fb
            int r6 = r4.f3843k
            if (r6 > r3) goto L_0x00fb
            r10 = r4
            r13 = r15
            r14 = 1
        L_0x00fb:
            int r8 = r8 + 1
            r6 = 0
            goto L_0x00a4
        L_0x00ff:
            r16 = 0
            if (r9 == 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r9 = r10
        L_0x0105:
            if (r9 != 0) goto L_0x0109
            r2 = 1
            goto L_0x010d
        L_0x0109:
            r1.f(r9)
            r2 = 0
        L_0x010d:
            q.b r4 = r1.f3814d
            int r4 = r4.k()
            if (r4 != 0) goto L_0x0117
            r1.f3815e = r3
        L_0x0117:
            if (r2 == 0) goto L_0x018d
            int r2 = r0.f3823h
            int r2 = r2 + r3
            int r4 = r0.f3820d
            if (r2 < r4) goto L_0x0123
            r0.n()
        L_0x0123:
            r2 = 3
            q.i r2 = r0.a(r2)
            int r4 = r0.f3818a
            int r4 = r4 + r3
            r0.f3818a = r4
            int r6 = r0.f3823h
            int r6 = r6 + r3
            r0.f3823h = r6
            r2.b = r4
            androidx.emoji2.text.r r6 = r0.f3826k
            java.lang.Object r6 = r6.f1185d
            q.i[] r6 = (q.i[]) r6
            r6[r4] = r2
            r1.f3812a = r2
            r17.h(r18)
            q.c r4 = r0.f3829n
            r4.f3812a = r7
            q.b r6 = r4.f3814d
            r6.clear()
            r6 = 0
        L_0x014b:
            q.b r8 = r1.f3814d
            int r8 = r8.k()
            if (r6 >= r8) goto L_0x0167
            q.b r8 = r1.f3814d
            q.i r8 = r8.e(r6)
            q.b r9 = r1.f3814d
            float r9 = r9.a(r6)
            q.b r10 = r4.f3814d
            r10.b(r8, r9, r3)
            int r6 = r6 + 1
            goto L_0x014b
        L_0x0167:
            q.c r4 = r0.f3829n
            r0.p(r4)
            int r4 = r2.f3836c
            if (r4 != r5) goto L_0x018b
            q.i r4 = r1.f3812a
            if (r4 != r2) goto L_0x017d
            q.i r2 = r1.e(r7, r2)
            if (r2 == 0) goto L_0x017d
            r1.f(r2)
        L_0x017d:
            boolean r2 = r1.f3815e
            if (r2 != 0) goto L_0x0186
            q.i r2 = r1.f3812a
            r2.d(r1)
        L_0x0186:
            int r2 = r0.f3824i
            int r2 = r2 - r3
            r0.f3824i = r2
        L_0x018b:
            r4 = 1
            goto L_0x018e
        L_0x018d:
            r4 = 0
        L_0x018e:
            q.i r2 = r1.f3812a
            if (r2 == 0) goto L_0x01a3
            int r2 = r2.f3844l
            if (r2 == r3) goto L_0x019e
            float r2 = r1.b
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x01a3
            goto L_0x019e
        L_0x019d:
            r4 = 0
        L_0x019e:
            if (r4 != 0) goto L_0x01a3
            r17.h(r18)
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.c(q.c):void");
    }

    public final void d(i iVar, int i2) {
        int i3 = iVar.f3836c;
        if (i3 == -1) {
            iVar.f3838e = (float) i2;
            iVar.f = true;
            int i4 = iVar.f3842j;
            for (int i5 = 0; i5 < i4; i5++) {
                iVar.f3841i[i5].g(iVar, false);
            }
            iVar.f3842j = 0;
        } else if (i3 != -1) {
            c cVar = this.f3821e[i3];
            if (cVar.f3815e) {
                cVar.b = (float) i2;
            } else if (cVar.f3814d.k() == 0) {
                cVar.f3815e = true;
                cVar.b = (float) i2;
            } else {
                c k2 = k();
                if (i2 < 0) {
                    k2.b = (float) (i2 * -1);
                    k2.f3814d.i(iVar, 1.0f);
                } else {
                    k2.b = (float) i2;
                    k2.f3814d.i(iVar, -1.0f);
                }
                c(k2);
            }
        } else {
            c k3 = k();
            k3.f3812a = iVar;
            float f2 = (float) i2;
            iVar.f3838e = f2;
            k3.b = f2;
            k3.f3815e = true;
            c(k3);
        }
    }

    public final void e(i iVar, i iVar2, int i2, int i3) {
        boolean z2 = false;
        if (i3 == 8 && iVar2.f && iVar.f3836c == -1) {
            iVar.f3838e = iVar2.f3838e + ((float) i2);
            iVar.f = true;
            int i4 = iVar.f3842j;
            for (int i5 = 0; i5 < i4; i5++) {
                iVar.f3841i[i5].g(iVar, false);
            }
            iVar.f3842j = 0;
            return;
        }
        c k2 = k();
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            k2.b = (float) i2;
        }
        if (!z2) {
            k2.f3814d.i(iVar, -1.0f);
            k2.f3814d.i(iVar2, 1.0f);
        } else {
            k2.f3814d.i(iVar, 1.0f);
            k2.f3814d.i(iVar2, -1.0f);
        }
        if (i3 != 8) {
            k2.a(this, i3);
        }
        c(k2);
    }

    public final void f(i iVar, i iVar2, int i2, int i3) {
        c k2 = k();
        i l2 = l();
        l2.f3837d = 0;
        k2.b(iVar, iVar2, l2, i2);
        if (i3 != 8) {
            k2.f3814d.i(i(i3), (float) ((int) (k2.f3814d.c(l2) * -1.0f)));
        }
        c(k2);
    }

    public final void g(i iVar, i iVar2, int i2, int i3) {
        c k2 = k();
        i l2 = l();
        l2.f3837d = 0;
        k2.c(iVar, iVar2, l2, i2);
        if (i3 != 8) {
            k2.f3814d.i(i(i3), (float) ((int) (k2.f3814d.c(l2) * -1.0f)));
        }
        c(k2);
    }

    public final void h(c cVar) {
        boolean z2 = f3817p;
        r rVar = this.f3826k;
        if (z2) {
            c cVar2 = this.f3821e[this.f3824i];
            if (cVar2 != null) {
                ((b) rVar.f1183a).b(cVar2);
            }
        } else {
            c cVar3 = this.f3821e[this.f3824i];
            if (cVar3 != null) {
                ((b) rVar.b).b(cVar3);
            }
        }
        c[] cVarArr = this.f3821e;
        int i2 = this.f3824i;
        cVarArr[i2] = cVar;
        i iVar = cVar.f3812a;
        iVar.f3836c = i2;
        this.f3824i = i2 + 1;
        iVar.d(cVar);
    }

    public final i i(int i2) {
        if (this.f3823h + 1 >= this.f3820d) {
            n();
        }
        i a2 = a(4);
        int i3 = this.f3818a + 1;
        this.f3818a = i3;
        this.f3823h++;
        a2.b = i3;
        a2.f3837d = i2;
        ((i[]) this.f3826k.f1185d)[i3] = a2;
        g gVar = this.b;
        gVar.f3833i.f = a2;
        float[] fArr = a2.f3840h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.f3837d] = 1.0f;
        gVar.i(a2);
        return a2;
    }

    public final i j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f3823h + 1 >= this.f3820d) {
            n();
        }
        if (!(obj instanceof C0471c)) {
            return null;
        }
        C0471c cVar = (C0471c) obj;
        i iVar = cVar.f4285g;
        if (iVar == null) {
            cVar.i();
            iVar = cVar.f4285g;
        }
        int i2 = iVar.b;
        r rVar = this.f3826k;
        if (i2 != -1 && i2 <= this.f3818a && ((i[]) rVar.f1185d)[i2] != null) {
            return iVar;
        }
        if (i2 != -1) {
            iVar.c();
        }
        int i3 = this.f3818a + 1;
        this.f3818a = i3;
        this.f3823h++;
        iVar.b = i3;
        iVar.f3844l = 1;
        ((i[]) rVar.f1185d)[i3] = iVar;
        return iVar;
    }

    public final c k() {
        boolean z2 = f3817p;
        r rVar = this.f3826k;
        if (z2) {
            c cVar = (c) ((b) rVar.f1183a).a();
            if (cVar == null) {
                return new d(rVar);
            }
            cVar.f3812a = null;
            cVar.f3814d.clear();
            cVar.b = 0.0f;
            cVar.f3815e = false;
            return cVar;
        }
        c cVar2 = (c) ((b) rVar.b).a();
        if (cVar2 == null) {
            return new c(rVar);
        }
        cVar2.f3812a = null;
        cVar2.f3814d.clear();
        cVar2.b = 0.0f;
        cVar2.f3815e = false;
        return cVar2;
    }

    public final i l() {
        if (this.f3823h + 1 >= this.f3820d) {
            n();
        }
        i a2 = a(3);
        int i2 = this.f3818a + 1;
        this.f3818a = i2;
        this.f3823h++;
        a2.b = i2;
        ((i[]) this.f3826k.f1185d)[i2] = a2;
        return a2;
    }

    public final void n() {
        int i2 = this.f3819c * 2;
        this.f3819c = i2;
        this.f3821e = (c[]) Arrays.copyOf(this.f3821e, i2);
        r rVar = this.f3826k;
        rVar.f1185d = (i[]) Arrays.copyOf((i[]) rVar.f1185d, this.f3819c);
        int i3 = this.f3819c;
        this.f3822g = new boolean[i3];
        this.f3820d = i3;
        this.f3825j = i3;
    }

    public final void o(g gVar) {
        r rVar;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f3824i) {
                break;
            }
            c cVar = this.f3821e[i2];
            int i3 = 1;
            if (cVar.f3812a.f3844l != 1) {
                float f2 = 0.0f;
                if (cVar.b < 0.0f) {
                    boolean z2 = false;
                    int i4 = 0;
                    while (!z2) {
                        i4 += i3;
                        float f3 = Float.MAX_VALUE;
                        int i5 = 0;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        while (true) {
                            int i9 = this.f3824i;
                            rVar = this.f3826k;
                            if (i5 >= i9) {
                                break;
                            }
                            c cVar2 = this.f3821e[i5];
                            if (cVar2.f3812a.f3844l != i3 && !cVar2.f3815e && cVar2.b < f2) {
                                int i10 = 1;
                                while (i10 < this.f3823h) {
                                    i iVar = ((i[]) rVar.f1185d)[i10];
                                    float c2 = cVar2.f3814d.c(iVar);
                                    if (c2 > f2) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f4 = iVar.f3839g[i11] / c2;
                                            if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                                i8 = i11;
                                                f3 = f4;
                                                i6 = i5;
                                                i7 = i10;
                                            }
                                        }
                                    }
                                    i10++;
                                    f2 = 0.0f;
                                }
                            }
                            i5++;
                            f2 = 0.0f;
                            i3 = 1;
                        }
                        if (i6 != -1) {
                            c cVar3 = this.f3821e[i6];
                            cVar3.f3812a.f3836c = -1;
                            cVar3.f(((i[]) rVar.f1185d)[i7]);
                            i iVar2 = cVar3.f3812a;
                            iVar2.f3836c = i6;
                            iVar2.d(cVar3);
                        } else {
                            z2 = true;
                        }
                        if (i4 > this.f3823h / 2) {
                            z2 = true;
                        }
                        f2 = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        p(gVar);
        for (int i12 = 0; i12 < this.f3824i; i12++) {
            c cVar4 = this.f3821e[i12];
            cVar4.f3812a.f3838e = cVar4.b;
        }
    }

    public final void p(c cVar) {
        for (int i2 = 0; i2 < this.f3823h; i2++) {
            this.f3822g[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 < this.f3823h * 2) {
                i iVar = cVar.f3812a;
                if (iVar != null) {
                    this.f3822g[iVar.b] = true;
                }
                i d2 = cVar.d(this.f3822g);
                if (d2 != null) {
                    boolean[] zArr = this.f3822g;
                    int i4 = d2.b;
                    if (!zArr[i4]) {
                        zArr[i4] = true;
                    } else {
                        return;
                    }
                }
                if (d2 != null) {
                    float f2 = Float.MAX_VALUE;
                    int i5 = -1;
                    for (int i6 = 0; i6 < this.f3824i; i6++) {
                        c cVar2 = this.f3821e[i6];
                        if (cVar2.f3812a.f3844l != 1 && !cVar2.f3815e && cVar2.f3814d.g(d2)) {
                            float c2 = cVar2.f3814d.c(d2);
                            if (c2 < 0.0f) {
                                float f3 = (-cVar2.b) / c2;
                                if (f3 < f2) {
                                    i5 = i6;
                                    f2 = f3;
                                }
                            }
                        }
                    }
                    if (i5 > -1) {
                        c cVar3 = this.f3821e[i5];
                        cVar3.f3812a.f3836c = -1;
                        cVar3.f(d2);
                        i iVar2 = cVar3.f3812a;
                        iVar2.f3836c = i5;
                        iVar2.d(cVar3);
                    }
                } else {
                    z2 = true;
                }
            } else {
                return;
            }
        }
    }

    public final void q() {
        boolean z2 = f3817p;
        r rVar = this.f3826k;
        int i2 = 0;
        if (z2) {
            while (true) {
                c[] cVarArr = this.f3821e;
                if (i2 < cVarArr.length) {
                    c cVar = cVarArr[i2];
                    if (cVar != null) {
                        ((b) rVar.f1183a).b(cVar);
                    }
                    this.f3821e[i2] = null;
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                c[] cVarArr2 = this.f3821e;
                if (i2 < cVarArr2.length) {
                    c cVar2 = cVarArr2[i2];
                    if (cVar2 != null) {
                        ((b) rVar.b).b(cVar2);
                    }
                    this.f3821e[i2] = null;
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void r() {
        r rVar;
        int i2 = 0;
        while (true) {
            rVar = this.f3826k;
            i[] iVarArr = (i[]) rVar.f1185d;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.c();
            }
            i2++;
        }
        b bVar = (b) rVar.f1184c;
        i[] iVarArr2 = this.f3827l;
        int i3 = this.f3828m;
        bVar.getClass();
        if (i3 > iVarArr2.length) {
            i3 = iVarArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            i iVar2 = iVarArr2[i4];
            int i5 = bVar.f261c;
            Object[] objArr = bVar.b;
            if (i5 < objArr.length) {
                objArr[i5] = iVar2;
                bVar.f261c = i5 + 1;
            }
        }
        this.f3828m = 0;
        Arrays.fill((i[]) rVar.f1185d, (Object) null);
        this.f3818a = 0;
        g gVar = this.b;
        gVar.f3832h = 0;
        gVar.b = 0.0f;
        this.f3823h = 1;
        for (int i6 = 0; i6 < this.f3824i; i6++) {
            this.f3821e[i6].getClass();
        }
        q();
        this.f3824i = 0;
        if (f3817p) {
            this.f3829n = new d(rVar);
        } else {
            this.f3829n = new c(rVar);
        }
    }
}
