package r;

import N.g;
import androidx.emoji2.text.r;
import java.util.ArrayList;
import java.util.Arrays;
import q.i;
import s.e;
import t.C0481f;

/* renamed from: r.e  reason: case insensitive filesystem */
public final class C0473e extends C0472d {

    /* renamed from: d0  reason: collision with root package name */
    public ArrayList f4338d0 = new ArrayList();
    public final g e0 = new g(this);

    /* renamed from: f0  reason: collision with root package name */
    public final e f4339f0;

    /* renamed from: g0  reason: collision with root package name */
    public C0481f f4340g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f4341h0;

    /* renamed from: i0  reason: collision with root package name */
    public final q.e f4342i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f4343j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f4344k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f4345l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f4346m0;
    public C0470b[] n0;

    /* renamed from: o0  reason: collision with root package name */
    public C0470b[] f4347o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f4348p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f4349q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f4350r0;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, s.e] */
    /* JADX WARNING: type inference failed for: r2v0, types: [s.b, java.lang.Object] */
    public C0473e() {
        ? obj = new Object();
        obj.b = true;
        obj.f4451c = true;
        obj.f4453e = new ArrayList();
        new ArrayList();
        obj.f = null;
        obj.f4454g = new Object();
        obj.f4455h = new ArrayList();
        obj.f4450a = this;
        obj.f4452d = this;
        this.f4339f0 = obj;
        this.f4340g0 = null;
        this.f4341h0 = false;
        this.f4342i0 = new q.e();
        this.f4345l0 = 0;
        this.f4346m0 = 0;
        this.n0 = new C0470b[4];
        this.f4347o0 = new C0470b[4];
        this.f4348p0 = 263;
        this.f4349q0 = false;
        this.f4350r0 = false;
    }

    public final void B(C0472d dVar, int i2) {
        if (i2 == 0) {
            int i3 = this.f4345l0 + 1;
            C0470b[] bVarArr = this.f4347o0;
            if (i3 >= bVarArr.length) {
                this.f4347o0 = (C0470b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            C0470b[] bVarArr2 = this.f4347o0;
            int i4 = this.f4345l0;
            bVarArr2[i4] = new C0470b(dVar, 0, this.f4341h0);
            this.f4345l0 = i4 + 1;
        } else if (i2 == 1) {
            int i5 = this.f4346m0 + 1;
            C0470b[] bVarArr3 = this.n0;
            if (i5 >= bVarArr3.length) {
                this.n0 = (C0470b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            C0470b[] bVarArr4 = this.n0;
            int i6 = this.f4346m0;
            bVarArr4[i6] = new C0470b(dVar, 1, this.f4341h0);
            this.f4346m0 = i6 + 1;
        }
    }

    public final void C(q.e eVar) {
        a(eVar);
        int size = this.f4338d0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0472d dVar = (C0472d) this.f4338d0.get(i2);
            boolean[] zArr = dVar.f4292H;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C0469a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                C0472d dVar2 = (C0472d) this.f4338d0.get(i3);
                if (dVar2 instanceof C0469a) {
                    C0469a aVar = (C0469a) dVar2;
                    for (int i4 = 0; i4 < aVar.e0; i4++) {
                        C0472d dVar3 = aVar.f4405d0[i4];
                        int i5 = aVar.f4263f0;
                        if (i5 == 0 || i5 == 1) {
                            dVar3.f4292H[0] = true;
                        } else if (i5 == 2 || i5 == 3) {
                            dVar3.f4292H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            C0472d dVar4 = (C0472d) this.f4338d0.get(i6);
            dVar4.getClass();
            if ((dVar4 instanceof g) || (dVar4 instanceof h)) {
                dVar4.a(eVar);
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            C0472d dVar5 = (C0472d) this.f4338d0.get(i7);
            if (dVar5 instanceof C0473e) {
                int[] iArr = dVar5.f4315c0;
                int i8 = iArr[0];
                int i9 = iArr[1];
                if (i8 == 2) {
                    dVar5.w(1);
                }
                if (i9 == 2) {
                    dVar5.x(1);
                }
                dVar5.a(eVar);
                if (i8 == 2) {
                    dVar5.w(i8);
                }
                if (i9 == 2) {
                    dVar5.x(i9);
                }
            } else {
                dVar5.f4319h = -1;
                dVar5.f4320i = -1;
                int[] iArr2 = this.f4315c0;
                int i10 = iArr2[0];
                int[] iArr3 = dVar5.f4315c0;
                if (i10 != 2 && iArr3[0] == 4) {
                    C0471c cVar = dVar5.f4335x;
                    int i11 = cVar.f4284e;
                    int l2 = l();
                    C0471c cVar2 = dVar5.f4337z;
                    int i12 = l2 - cVar2.f4284e;
                    cVar.f4285g = eVar.j(cVar);
                    cVar2.f4285g = eVar.j(cVar2);
                    eVar.d(cVar.f4285g, i11);
                    eVar.d(cVar2.f4285g, i12);
                    dVar5.f4319h = 2;
                    dVar5.f4298N = i11;
                    int i13 = i12 - i11;
                    dVar5.f4294J = i13;
                    int i14 = dVar5.f4301Q;
                    if (i13 < i14) {
                        dVar5.f4294J = i14;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    C0471c cVar3 = dVar5.f4336y;
                    int i15 = cVar3.f4284e;
                    int i16 = i();
                    C0471c cVar4 = dVar5.f4286A;
                    int i17 = i16 - cVar4.f4284e;
                    cVar3.f4285g = eVar.j(cVar3);
                    cVar4.f4285g = eVar.j(cVar4);
                    eVar.d(cVar3.f4285g, i15);
                    eVar.d(cVar4.f4285g, i17);
                    if (dVar5.f4300P > 0 || dVar5.f4306V == 8) {
                        C0471c cVar5 = dVar5.f4287B;
                        i j2 = eVar.j(cVar5);
                        cVar5.f4285g = j2;
                        eVar.d(j2, dVar5.f4300P + i15);
                    }
                    dVar5.f4320i = 2;
                    dVar5.f4299O = i15;
                    int i18 = i17 - i15;
                    dVar5.f4295K = i18;
                    int i19 = dVar5.f4302R;
                    if (i18 < i19) {
                        dVar5.f4295K = i19;
                    }
                }
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    dVar5.a(eVar);
                }
            }
        }
        if (this.f4345l0 > 0) {
            j.a(this, eVar, 0);
        }
        if (this.f4346m0 > 0) {
            j.a(this, eVar, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0117 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D(int r19, boolean r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r18
            s.e r2 = r1.f4339f0
            r.e r3 = r2.f4450a
            r4 = 0
            int r5 = r3.h(r4)
            r6 = 1
            int r7 = r3.h(r6)
            int r8 = r3.m()
            int r9 = r3.n()
            java.util.ArrayList r10 = r2.f4453e
            s.l r11 = r3.f4317e
            s.j r12 = r3.f4316d
            if (r20 == 0) goto L_0x007d
            r13 = 2
            if (r5 == r13) goto L_0x0027
            if (r7 != r13) goto L_0x007d
        L_0x0027:
            int r14 = r10.size()
            r15 = 0
        L_0x002c:
            if (r15 >= r14) goto L_0x0047
            java.lang.Object r16 = r10.get(r15)
            int r15 = r15 + 1
            r4 = r16
            s.m r4 = (s.m) r4
            int r6 = r4.f
            if (r6 != r0) goto L_0x0044
            boolean r4 = r4.k()
            if (r4 != 0) goto L_0x0044
            r4 = 0
            goto L_0x0049
        L_0x0044:
            r4 = 0
            r6 = 1
            goto L_0x002c
        L_0x0047:
            r4 = r20
        L_0x0049:
            if (r0 != 0) goto L_0x0065
            if (r4 == 0) goto L_0x007d
            if (r5 != r13) goto L_0x007d
            r6 = 1
            r3.w(r6)
            r4 = 0
            int r13 = r2.d(r3, r4)
            r3.y(r13)
            s.g r4 = r12.f4474e
            int r13 = r3.l()
            r4.d(r13)
            goto L_0x007d
        L_0x0065:
            r6 = 1
            if (r4 == 0) goto L_0x007d
            if (r7 != r13) goto L_0x007d
            r3.x(r6)
            int r4 = r2.d(r3, r6)
            r3.v(r4)
            s.g r4 = r11.f4474e
            int r6 = r3.i()
            r4.d(r6)
        L_0x007d:
            int[] r4 = r3.f4315c0
            r6 = 4
            if (r0 != 0) goto L_0x00a1
            r17 = 0
            r4 = r4[r17]
            r9 = 1
            if (r4 == r9) goto L_0x008e
            if (r4 != r6) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r8 = 1
            goto L_0x00ab
        L_0x008e:
            int r4 = r3.l()
            int r4 = r4 + r8
            s.f r6 = r12.f4477i
            r6.d(r4)
            s.g r6 = r12.f4474e
            int r4 = r4 - r8
            r6.d(r4)
            r6 = 1
            r8 = 1
            goto L_0x00be
        L_0x00a1:
            r8 = 1
            r17 = 0
            r4 = r4[r8]
            if (r4 == r8) goto L_0x00ad
            if (r4 != r6) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r6 = 0
            goto L_0x00be
        L_0x00ad:
            int r4 = r3.i()
            int r4 = r4 + r9
            s.f r6 = r11.f4477i
            r6.d(r4)
            s.g r6 = r11.f4474e
            int r4 = r4 - r9
            r6.d(r4)
            r6 = 1
        L_0x00be:
            r2.g()
            int r2 = r10.size()
            r4 = 0
        L_0x00c6:
            if (r4 >= r2) goto L_0x00e2
            java.lang.Object r9 = r10.get(r4)
            int r4 = r4 + 1
            s.m r9 = (s.m) r9
            int r11 = r9.f
            if (r11 == r0) goto L_0x00d5
            goto L_0x00c6
        L_0x00d5:
            r.d r11 = r9.b
            if (r11 != r3) goto L_0x00de
            boolean r11 = r9.f4475g
            if (r11 != 0) goto L_0x00de
            goto L_0x00c6
        L_0x00de:
            r9.e()
            goto L_0x00c6
        L_0x00e2:
            int r2 = r10.size()
            r4 = 0
        L_0x00e7:
            if (r4 >= r2) goto L_0x0117
            java.lang.Object r9 = r10.get(r4)
            int r4 = r4 + 1
            s.m r9 = (s.m) r9
            int r11 = r9.f
            if (r11 == r0) goto L_0x00f6
            goto L_0x00e7
        L_0x00f6:
            if (r6 != 0) goto L_0x00fd
            r.d r11 = r9.b
            if (r11 != r3) goto L_0x00fd
            goto L_0x00e7
        L_0x00fd:
            s.f r11 = r9.f4476h
            boolean r11 = r11.f4463j
            if (r11 != 0) goto L_0x0105
        L_0x0103:
            r4 = 0
            goto L_0x0118
        L_0x0105:
            s.f r11 = r9.f4477i
            boolean r11 = r11.f4463j
            if (r11 != 0) goto L_0x010c
            goto L_0x0103
        L_0x010c:
            boolean r11 = r9 instanceof s.c
            if (r11 != 0) goto L_0x00e7
            s.g r9 = r9.f4474e
            boolean r9 = r9.f4463j
            if (r9 != 0) goto L_0x00e7
            goto L_0x0103
        L_0x0117:
            r4 = 1
        L_0x0118:
            r3.w(r5)
            r3.x(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C0473e.D(int, boolean):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r2v8, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: type inference failed for: r17v3 */
    /* JADX WARNING: type inference failed for: r17v4 */
    /* JADX WARNING: type inference failed for: r17v5 */
    /* JADX WARNING: type inference failed for: r17v6 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=?, for r17v1, types: [boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E() {
        /*
            r21 = this;
            r1 = r21
            r2 = 0
            r1.f4298N = r2
            r1.f4299O = r2
            int r0 = r1.l()
            int r3 = java.lang.Math.max(r2, r0)
            int r0 = r1.i()
            int r4 = java.lang.Math.max(r2, r0)
            r1.f4349q0 = r2
            r1.f4350r0 = r2
            int r0 = r1.f4348p0
            r5 = r0 & 64
            r6 = 1
            r7 = 64
            if (r5 != r7) goto L_0x0026
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            if (r5 != 0) goto L_0x0031
            r5 = 128(0x80, float:1.794E-43)
            r0 = r0 & r5
            if (r0 != r5) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            q.e r5 = r1.f4342i0
            r5.getClass()
            r5.f = r2
            int r7 = r1.f4348p0
            if (r7 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x0041
            r5.f = r6
        L_0x0041:
            int[] r7 = r1.f4315c0
            r8 = r7[r6]
            r9 = r7[r2]
            java.util.ArrayList r10 = r1.f4338d0
            r11 = 2
            if (r9 == r11) goto L_0x0051
            if (r8 != r11) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r12 = 0
            goto L_0x0052
        L_0x0051:
            r12 = 1
        L_0x0052:
            r1.f4345l0 = r2
            r1.f4346m0 = r2
            int r13 = r10.size()
            r0 = 0
        L_0x005b:
            if (r0 >= r13) goto L_0x0071
            java.util.ArrayList r14 = r1.f4338d0
            java.lang.Object r14 = r14.get(r0)
            r.d r14 = (r.C0472d) r14
            boolean r15 = r14 instanceof r.C0473e
            if (r15 == 0) goto L_0x006e
            r.e r14 = (r.C0473e) r14
            r14.E()
        L_0x006e:
            int r0 = r0 + 1
            goto L_0x005b
        L_0x0071:
            r0 = 0
            r14 = 1
            r15 = 0
        L_0x0074:
            if (r14 == 0) goto L_0x01f3
            r16 = 1
            int r6 = r0 + 1
            r5.r()     // Catch:{ Exception -> 0x00d7 }
            r1.f4345l0 = r2     // Catch:{ Exception -> 0x00d7 }
            r1.f4346m0 = r2     // Catch:{ Exception -> 0x00d7 }
            r1.f(r5)     // Catch:{ Exception -> 0x00d7 }
            r0 = 0
        L_0x0085:
            if (r0 >= r13) goto L_0x009a
            r17 = 0
            java.util.ArrayList r2 = r1.f4338d0     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ Exception -> 0x0098 }
            r.d r2 = (r.C0472d) r2     // Catch:{ Exception -> 0x0098 }
            r2.f(r5)     // Catch:{ Exception -> 0x0098 }
            int r0 = r0 + 1
            r2 = 0
            goto L_0x0085
        L_0x0098:
            r0 = move-exception
            goto L_0x00da
        L_0x009a:
            r17 = 0
            r1.C(r5)     // Catch:{ Exception -> 0x0098 }
            q.g r0 = r5.b     // Catch:{ Exception -> 0x00d4 }
            boolean r2 = r5.f     // Catch:{ Exception -> 0x00d4 }
            if (r2 == 0) goto L_0x00cb
            r2 = 0
        L_0x00a6:
            int r14 = r5.f3824i     // Catch:{ Exception -> 0x00d4 }
            if (r2 >= r14) goto L_0x00b9
            q.c[] r14 = r5.f3821e     // Catch:{ Exception -> 0x00d4 }
            r14 = r14[r2]     // Catch:{ Exception -> 0x00d4 }
            boolean r14 = r14.f3815e     // Catch:{ Exception -> 0x00d4 }
            if (r14 != 0) goto L_0x00b6
            r5.o(r0)     // Catch:{ Exception -> 0x00d4 }
            goto L_0x00ce
        L_0x00b6:
            int r2 = r2 + 1
            goto L_0x00a6
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            int r2 = r5.f3824i     // Catch:{ Exception -> 0x00d4 }
            if (r0 >= r2) goto L_0x00ce
            q.c[] r2 = r5.f3821e     // Catch:{ Exception -> 0x00d4 }
            r2 = r2[r0]     // Catch:{ Exception -> 0x00d4 }
            q.i r14 = r2.f3812a     // Catch:{ Exception -> 0x00d4 }
            float r2 = r2.b     // Catch:{ Exception -> 0x00d4 }
            r14.f3838e = r2     // Catch:{ Exception -> 0x00d4 }
            int r0 = r0 + 1
            goto L_0x00ba
        L_0x00cb:
            r5.o(r0)     // Catch:{ Exception -> 0x00d4 }
        L_0x00ce:
            r19 = r7
            r14 = 1
            r18 = 2
            goto L_0x00f4
        L_0x00d4:
            r0 = move-exception
            r14 = 1
            goto L_0x00da
        L_0x00d7:
            r0 = move-exception
            r17 = 0
        L_0x00da:
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            r18 = 2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r19 = r7
            java.lang.String r7 = "EXCEPTION : "
            r11.<init>(r7)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r2.println(r0)
        L_0x00f4:
            boolean[] r0 = r.j.f4406a
            if (r14 == 0) goto L_0x0114
            r0[r18] = r17
            r1.A(r5)
            java.util.ArrayList r2 = r1.f4338d0
            int r2 = r2.size()
            r7 = 0
        L_0x0104:
            if (r7 >= r2) goto L_0x0128
            java.util.ArrayList r11 = r1.f4338d0
            java.lang.Object r11 = r11.get(r7)
            r.d r11 = (r.C0472d) r11
            r11.A(r5)
            int r7 = r7 + 1
            goto L_0x0104
        L_0x0114:
            r1.A(r5)
            r2 = 0
        L_0x0118:
            if (r2 >= r13) goto L_0x0128
            java.util.ArrayList r7 = r1.f4338d0
            java.lang.Object r7 = r7.get(r2)
            r.d r7 = (r.C0472d) r7
            r7.A(r5)
            int r2 = r2 + 1
            goto L_0x0118
        L_0x0128:
            if (r12 == 0) goto L_0x0187
            r2 = 8
            if (r6 >= r2) goto L_0x0187
            boolean r0 = r0[r18]
            if (r0 == 0) goto L_0x0187
            r0 = 0
            r2 = 0
            r7 = 0
        L_0x0135:
            if (r0 >= r13) goto L_0x0159
            java.util.ArrayList r11 = r1.f4338d0
            java.lang.Object r11 = r11.get(r0)
            r.d r11 = (r.C0472d) r11
            int r14 = r11.f4298N
            int r20 = r11.l()
            int r14 = r20 + r14
            int r2 = java.lang.Math.max(r2, r14)
            int r14 = r11.f4299O
            int r11 = r11.i()
            int r11 = r11 + r14
            int r7 = java.lang.Math.max(r7, r11)
            int r0 = r0 + 1
            goto L_0x0135
        L_0x0159:
            int r0 = r1.f4301Q
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r1.f4302R
            int r2 = java.lang.Math.max(r2, r7)
            r7 = 2
            if (r9 != r7) goto L_0x0176
            int r11 = r1.l()
            if (r11 >= r0) goto L_0x0176
            r1.y(r0)
            r19[r17] = r7
            r0 = 1
            r15 = 1
            goto L_0x0177
        L_0x0176:
            r0 = 0
        L_0x0177:
            if (r8 != r7) goto L_0x0188
            int r11 = r1.i()
            if (r11 >= r2) goto L_0x0188
            r1.v(r2)
            r19[r16] = r7
            r0 = 1
            r15 = 1
            goto L_0x0188
        L_0x0187:
            r0 = 0
        L_0x0188:
            int r2 = r1.f4301Q
            int r7 = r1.l()
            int r2 = java.lang.Math.max(r2, r7)
            int r7 = r1.l()
            if (r2 <= r7) goto L_0x019f
            r1.y(r2)
            r19[r17] = r16
            r0 = 1
            r15 = 1
        L_0x019f:
            int r2 = r1.f4302R
            int r7 = r1.i()
            int r2 = java.lang.Math.max(r2, r7)
            int r7 = r1.i()
            if (r2 <= r7) goto L_0x01b6
            r1.v(r2)
            r19[r16] = r16
            r0 = 1
            r15 = 1
        L_0x01b6:
            if (r15 != 0) goto L_0x01ea
            r2 = r19[r17]
            r7 = 2
            if (r2 != r7) goto L_0x01d0
            if (r3 <= 0) goto L_0x01d0
            int r2 = r1.l()
            if (r2 <= r3) goto L_0x01d0
            r2 = 1
            r1.f4349q0 = r2
            r19[r17] = r2
            r1.y(r3)
            r0 = 1
            r15 = 1
            goto L_0x01d1
        L_0x01d0:
            r2 = 1
        L_0x01d1:
            r7 = r19[r2]
            r11 = 2
            if (r7 != r11) goto L_0x01e8
            if (r4 <= 0) goto L_0x01e8
            int r7 = r1.i()
            if (r7 <= r4) goto L_0x01e8
            r1.f4350r0 = r2
            r19[r2] = r2
            r1.v(r4)
            r14 = 1
            r15 = 1
            goto L_0x01ec
        L_0x01e8:
            r14 = r0
            goto L_0x01ec
        L_0x01ea:
            r11 = 2
            goto L_0x01e8
        L_0x01ec:
            r0 = r6
            r7 = r19
            r2 = 0
            r6 = 1
            goto L_0x0074
        L_0x01f3:
            r19 = r7
            r17 = 0
            r1.f4338d0 = r10
            if (r15 == 0) goto L_0x0201
            r19[r17] = r9
            r16 = 1
            r19[r16] = r8
        L_0x0201:
            androidx.emoji2.text.r r0 = r5.f3826k
            r1.u(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C0473e.E():void");
    }

    public final void s() {
        this.f4342i0.r();
        this.f4343j0 = 0;
        this.f4344k0 = 0;
        this.f4338d0.clear();
        super.s();
    }

    public final void u(r rVar) {
        super.u(rVar);
        int size = this.f4338d0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0472d) this.f4338d0.get(i2)).u(rVar);
        }
    }

    public final void z(boolean z2, boolean z3) {
        super.z(z2, z3);
        int size = this.f4338d0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0472d) this.f4338d0.get(i2)).z(z2, z3);
        }
    }
}
