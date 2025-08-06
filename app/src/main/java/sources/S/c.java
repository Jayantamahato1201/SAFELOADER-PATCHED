package s;

import A.g;
import java.util.ArrayList;
import r.C0471c;
import r.C0472d;
import r.C0473e;

public final class c extends m {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f4448k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public int f4449l;

    public c(C0472d dVar, int i2) {
        super(dVar);
        C0472d dVar2;
        Object obj;
        int i3;
        Object obj2;
        this.f = i2;
        C0472d dVar3 = this.b;
        C0472d k2 = dVar3.k(i2);
        while (true) {
            C0472d dVar4 = k2;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            }
            k2 = dVar3.k(this.f);
        }
        this.b = dVar2;
        int i4 = this.f;
        if (i4 == 0) {
            obj = dVar2.f4316d;
        } else if (i4 == 1) {
            obj = dVar2.f4317e;
        } else {
            obj = null;
        }
        ArrayList arrayList = this.f4448k;
        arrayList.add(obj);
        C0472d j2 = dVar2.j(this.f);
        while (j2 != null) {
            int i5 = this.f;
            if (i5 == 0) {
                obj2 = j2.f4316d;
            } else if (i5 == 1) {
                obj2 = j2.f4317e;
            } else {
                obj2 = null;
            }
            arrayList.add(obj2);
            j2 = j2.j(this.f);
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj3 = arrayList.get(i6);
            i6++;
            m mVar = (m) obj3;
            int i7 = this.f;
            if (i7 == 0) {
                mVar.b.b = this;
            } else if (i7 == 1) {
                mVar.b.f4314c = this;
            }
        }
        if (this.f == 0 && ((C0473e) this.b.f4293I).f4341h0 && arrayList.size() > 1) {
            this.b = ((m) arrayList.get(arrayList.size() - 1)).b;
        }
        if (this.f == 0) {
            i3 = this.b.f4308X;
        } else {
            i3 = this.b.f4309Y;
        }
        this.f4449l = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x019f, code lost:
        if (r1 != r10) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01bf, code lost:
        if (r1 != r10) goto L_0x01c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(s.d r28) {
        /*
            r27 = this;
            r0 = r27
            s.f r1 = r0.f4476h
            boolean r2 = r1.f4463j
            if (r2 == 0) goto L_0x03d5
            s.f r2 = r0.f4477i
            boolean r3 = r2.f4463j
            if (r3 != 0) goto L_0x0010
            goto L_0x03d5
        L_0x0010:
            r.d r3 = r0.b
            r.d r3 = r3.f4293I
            if (r3 == 0) goto L_0x001f
            boolean r5 = r3 instanceof r.C0473e
            if (r5 == 0) goto L_0x001f
            r.e r3 = (r.C0473e) r3
            boolean r3 = r3.f4341h0
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            int r5 = r2.f4460g
            int r6 = r1.f4460g
            int r5 = r5 - r6
            java.util.ArrayList r6 = r0.f4448k
            int r7 = r6.size()
            r8 = 0
        L_0x002c:
            r9 = -1
            r10 = 8
            if (r8 >= r7) goto L_0x0040
            java.lang.Object r11 = r6.get(r8)
            s.m r11 = (s.m) r11
            r.d r11 = r11.b
            int r11 = r11.f4306V
            if (r11 != r10) goto L_0x0041
            int r8 = r8 + 1
            goto L_0x002c
        L_0x0040:
            r8 = -1
        L_0x0041:
            int r11 = r7 + -1
            r12 = r11
        L_0x0044:
            if (r12 < 0) goto L_0x0056
            java.lang.Object r13 = r6.get(r12)
            s.m r13 = (s.m) r13
            r.d r13 = r13.b
            int r13 = r13.f4306V
            if (r13 != r10) goto L_0x0055
            int r12 = r12 + -1
            goto L_0x0044
        L_0x0055:
            r9 = r12
        L_0x0056:
            r12 = 0
        L_0x0057:
            r28 = 0
            r14 = 2
            if (r12 >= r14) goto L_0x010a
            r4 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0064:
            if (r4 >= r7) goto L_0x00f4
            java.lang.Object r20 = r6.get(r4)
            r13 = r20
            s.m r13 = (s.m) r13
            r.d r15 = r13.b
            r22 = r3
            int r3 = r15.f4306V
            if (r3 != r10) goto L_0x007a
            r24 = r12
            goto L_0x00ea
        L_0x007a:
            int r18 = r18 + 1
            if (r4 <= 0) goto L_0x0085
            if (r4 < r8) goto L_0x0085
            s.f r3 = r13.f4476h
            int r3 = r3.f
            int r14 = r14 + r3
        L_0x0085:
            s.g r3 = r13.f4474e
            int r10 = r3.f4460g
            r23 = r10
            int r10 = r13.f4473d
            r24 = r12
            r12 = 3
            if (r10 == r12) goto L_0x0094
            r10 = 1
            goto L_0x0095
        L_0x0094:
            r10 = 0
        L_0x0095:
            if (r10 == 0) goto L_0x00b5
            int r3 = r0.f
            if (r3 != 0) goto L_0x00a5
            s.j r12 = r15.f4316d
            s.g r12 = r12.f4474e
            boolean r12 = r12.f4463j
            if (r12 != 0) goto L_0x00a5
            goto L_0x03d5
        L_0x00a5:
            r12 = 1
            if (r3 != r12) goto L_0x00b2
            s.l r3 = r15.f4317e
            s.g r3 = r3.f4474e
            boolean r3 = r3.f4463j
            if (r3 != 0) goto L_0x00b2
            goto L_0x03d5
        L_0x00b2:
            r25 = r10
            goto L_0x00cc
        L_0x00b5:
            r25 = r10
            r12 = 1
            int r10 = r13.f4471a
            if (r10 != r12) goto L_0x00c5
            if (r24 != 0) goto L_0x00c5
            int r10 = r3.f4466m
            int r17 = r17 + 1
        L_0x00c2:
            r25 = 1
            goto L_0x00ce
        L_0x00c5:
            boolean r3 = r3.f4463j
            if (r3 == 0) goto L_0x00cc
            r10 = r23
            goto L_0x00c2
        L_0x00cc:
            r10 = r23
        L_0x00ce:
            if (r25 != 0) goto L_0x00df
            int r17 = r17 + 1
            float[] r3 = r15.f4310Z
            int r10 = r0.f
            r3 = r3[r10]
            int r10 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r10 < 0) goto L_0x00e0
            float r19 = r19 + r3
            goto L_0x00e0
        L_0x00df:
            int r14 = r14 + r10
        L_0x00e0:
            if (r4 >= r11) goto L_0x00ea
            if (r4 >= r9) goto L_0x00ea
            s.f r3 = r13.f4477i
            int r3 = r3.f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00ea:
            int r4 = r4 + 1
            r3 = r22
            r12 = r24
            r10 = 8
            goto L_0x0064
        L_0x00f4:
            r22 = r3
            r24 = r12
            if (r14 < r5) goto L_0x0105
            if (r17 != 0) goto L_0x00fd
            goto L_0x0105
        L_0x00fd:
            int r12 = r24 + 1
            r3 = r22
            r10 = 8
            goto L_0x0057
        L_0x0105:
            r3 = r17
            r4 = r18
            goto L_0x0111
        L_0x010a:
            r22 = r3
            r3 = 0
            r4 = 0
            r14 = 0
            r19 = 0
        L_0x0111:
            int r1 = r1.f4460g
            if (r22 == 0) goto L_0x0117
            int r1 = r2.f4460g
        L_0x0117:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r5) goto L_0x012e
            r10 = 1073741824(0x40000000, float:2.0)
            if (r22 == 0) goto L_0x0127
            int r12 = r14 - r5
            float r12 = (float) r12
            float r12 = r12 / r10
            float r12 = r12 + r2
            int r10 = (int) r12
            int r1 = r1 + r10
            goto L_0x012e
        L_0x0127:
            int r12 = r14 - r5
            float r12 = (float) r12
            float r12 = r12 / r10
            float r12 = r12 + r2
            int r10 = (int) r12
            int r1 = r1 - r10
        L_0x012e:
            if (r3 <= 0) goto L_0x021c
            int r10 = r5 - r14
            float r10 = (float) r10
            float r12 = (float) r3
            float r12 = r10 / r12
            float r12 = r12 + r2
            int r12 = (int) r12
            r13 = 0
            r15 = 0
        L_0x013a:
            if (r13 >= r7) goto L_0x01d5
            java.lang.Object r17 = r6.get(r13)
            r18 = 1056964608(0x3f000000, float:0.5)
            r2 = r17
            s.m r2 = (s.m) r2
            r17 = r1
            r.d r1 = r2.b
            r23 = r3
            int r3 = r1.f4306V
            r24 = r10
            r10 = 8
            if (r3 != r10) goto L_0x015a
        L_0x0154:
            r25 = r12
            r26 = r13
            goto L_0x01c7
        L_0x015a:
            int r3 = r2.f4473d
            r10 = 3
            if (r3 != r10) goto L_0x0154
            s.g r3 = r2.f4474e
            boolean r10 = r3.f4463j
            if (r10 != 0) goto L_0x0154
            int r10 = (r19 > r28 ? 1 : (r19 == r28 ? 0 : -1))
            if (r10 <= 0) goto L_0x017b
            float[] r10 = r1.f4310Z
            r25 = r10
            int r10 = r0.f
            r10 = r25[r10]
            float r10 = r10 * r24
            float r10 = r10 / r19
            float r10 = r10 + r18
            int r10 = (int) r10
            r25 = r12
            goto L_0x017e
        L_0x017b:
            r10 = r12
            r25 = r10
        L_0x017e:
            int r12 = r0.f
            if (r12 != 0) goto L_0x01a2
            int r12 = r1.f4325n
            int r1 = r1.f4324m
            int r2 = r2.f4471a
            r26 = r13
            r13 = 1
            if (r2 != r13) goto L_0x0194
            int r2 = r3.f4466m
            int r2 = java.lang.Math.min(r10, r2)
            goto L_0x0195
        L_0x0194:
            r2 = r10
        L_0x0195:
            int r1 = java.lang.Math.max(r1, r2)
            if (r12 <= 0) goto L_0x019f
            int r1 = java.lang.Math.min(r12, r1)
        L_0x019f:
            if (r1 == r10) goto L_0x01c4
            goto L_0x01c1
        L_0x01a2:
            r26 = r13
            int r12 = r1.f4328q
            int r1 = r1.f4327p
            int r2 = r2.f4471a
            r13 = 1
            if (r2 != r13) goto L_0x01b4
            int r2 = r3.f4466m
            int r2 = java.lang.Math.min(r10, r2)
            goto L_0x01b5
        L_0x01b4:
            r2 = r10
        L_0x01b5:
            int r1 = java.lang.Math.max(r1, r2)
            if (r12 <= 0) goto L_0x01bf
            int r1 = java.lang.Math.min(r12, r1)
        L_0x01bf:
            if (r1 == r10) goto L_0x01c4
        L_0x01c1:
            int r15 = r15 + 1
            r10 = r1
        L_0x01c4:
            r3.d(r10)
        L_0x01c7:
            int r13 = r26 + 1
            r1 = r17
            r3 = r23
            r10 = r24
            r12 = r25
            r2 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013a
        L_0x01d5:
            r17 = r1
            r23 = r3
            r18 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= 0) goto L_0x020d
            int r3 = r23 - r15
            r1 = 0
            r14 = 0
        L_0x01e1:
            if (r1 >= r7) goto L_0x020f
            java.lang.Object r2 = r6.get(r1)
            s.m r2 = (s.m) r2
            r.d r10 = r2.b
            int r10 = r10.f4306V
            r12 = 8
            if (r10 != r12) goto L_0x01f2
            goto L_0x020a
        L_0x01f2:
            if (r1 <= 0) goto L_0x01fb
            if (r1 < r8) goto L_0x01fb
            s.f r10 = r2.f4476h
            int r10 = r10.f
            int r14 = r14 + r10
        L_0x01fb:
            s.g r10 = r2.f4474e
            int r10 = r10.f4460g
            int r14 = r14 + r10
            if (r1 >= r11) goto L_0x020a
            if (r1 >= r9) goto L_0x020a
            s.f r2 = r2.f4477i
            int r2 = r2.f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x020a:
            int r1 = r1 + 1
            goto L_0x01e1
        L_0x020d:
            r3 = r23
        L_0x020f:
            int r1 = r0.f4449l
            r2 = 2
            if (r1 != r2) goto L_0x021a
            if (r15 != 0) goto L_0x021a
            r1 = 0
            r0.f4449l = r1
            goto L_0x0224
        L_0x021a:
            r1 = 0
            goto L_0x0224
        L_0x021c:
            r17 = r1
            r23 = r3
            r1 = 0
            r2 = 2
            r18 = 1056964608(0x3f000000, float:0.5)
        L_0x0224:
            if (r14 <= r5) goto L_0x0228
            r0.f4449l = r2
        L_0x0228:
            if (r4 <= 0) goto L_0x0230
            if (r3 != 0) goto L_0x0230
            if (r8 != r9) goto L_0x0230
            r0.f4449l = r2
        L_0x0230:
            int r2 = r0.f4449l
            r13 = 1
            if (r2 != r13) goto L_0x02be
            if (r4 <= r13) goto L_0x023b
            int r5 = r5 - r14
            int r4 = r4 - r13
            int r5 = r5 / r4
            goto L_0x0244
        L_0x023b:
            if (r4 != r13) goto L_0x0243
            int r5 = r5 - r14
            r16 = 2
            int r5 = r5 / 2
            goto L_0x0244
        L_0x0243:
            r5 = 0
        L_0x0244:
            if (r3 <= 0) goto L_0x0247
            r5 = 0
        L_0x0247:
            r1 = r17
            r4 = 0
        L_0x024a:
            if (r4 >= r7) goto L_0x03d5
            if (r22 == 0) goto L_0x0253
            int r2 = r4 + 1
            int r2 = r7 - r2
            goto L_0x0254
        L_0x0253:
            r2 = r4
        L_0x0254:
            java.lang.Object r2 = r6.get(r2)
            s.m r2 = (s.m) r2
            r.d r3 = r2.b
            int r3 = r3.f4306V
            s.f r10 = r2.f4477i
            s.f r12 = r2.f4476h
            r13 = 8
            if (r3 != r13) goto L_0x026d
            r12.d(r1)
            r10.d(r1)
            goto L_0x02bb
        L_0x026d:
            if (r4 <= 0) goto L_0x0274
            if (r22 == 0) goto L_0x0273
            int r1 = r1 - r5
            goto L_0x0274
        L_0x0273:
            int r1 = r1 + r5
        L_0x0274:
            if (r4 <= 0) goto L_0x0281
            if (r4 < r8) goto L_0x0281
            if (r22 == 0) goto L_0x027e
            int r3 = r12.f
            int r1 = r1 - r3
            goto L_0x0281
        L_0x027e:
            int r3 = r12.f
            int r1 = r1 + r3
        L_0x0281:
            if (r22 == 0) goto L_0x0287
            r10.d(r1)
            goto L_0x028a
        L_0x0287:
            r12.d(r1)
        L_0x028a:
            s.g r3 = r2.f4474e
            int r13 = r3.f4460g
            int r14 = r2.f4473d
            r15 = 3
            if (r14 != r15) goto L_0x029a
            int r14 = r2.f4471a
            r15 = 1
            if (r14 != r15) goto L_0x029a
            int r13 = r3.f4466m
        L_0x029a:
            if (r22 == 0) goto L_0x029e
            int r1 = r1 - r13
            goto L_0x029f
        L_0x029e:
            int r1 = r1 + r13
        L_0x029f:
            if (r22 == 0) goto L_0x02a6
            r12.d(r1)
        L_0x02a4:
            r13 = 1
            goto L_0x02aa
        L_0x02a6:
            r10.d(r1)
            goto L_0x02a4
        L_0x02aa:
            r2.f4475g = r13
            if (r4 >= r11) goto L_0x02bb
            if (r4 >= r9) goto L_0x02bb
            if (r22 == 0) goto L_0x02b7
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 - r2
            goto L_0x02bb
        L_0x02b7:
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 + r2
        L_0x02bb:
            int r4 = r4 + 1
            goto L_0x024a
        L_0x02be:
            if (r2 != 0) goto L_0x033e
            int r5 = r5 - r14
            r21 = 1
            int r4 = r4 + 1
            int r5 = r5 / r4
            if (r3 <= 0) goto L_0x02c9
            r5 = 0
        L_0x02c9:
            r1 = r17
            r4 = 0
        L_0x02cc:
            if (r4 >= r7) goto L_0x03d5
            if (r22 == 0) goto L_0x02d5
            int r2 = r4 + 1
            int r2 = r7 - r2
            goto L_0x02d6
        L_0x02d5:
            r2 = r4
        L_0x02d6:
            java.lang.Object r2 = r6.get(r2)
            s.m r2 = (s.m) r2
            r.d r3 = r2.b
            int r3 = r3.f4306V
            s.f r10 = r2.f4477i
            s.f r12 = r2.f4476h
            r13 = 8
            if (r3 != r13) goto L_0x02ef
            r12.d(r1)
            r10.d(r1)
            goto L_0x033b
        L_0x02ef:
            if (r22 == 0) goto L_0x02f3
            int r1 = r1 - r5
            goto L_0x02f4
        L_0x02f3:
            int r1 = r1 + r5
        L_0x02f4:
            if (r4 <= 0) goto L_0x0301
            if (r4 < r8) goto L_0x0301
            if (r22 == 0) goto L_0x02fe
            int r3 = r12.f
            int r1 = r1 - r3
            goto L_0x0301
        L_0x02fe:
            int r3 = r12.f
            int r1 = r1 + r3
        L_0x0301:
            if (r22 == 0) goto L_0x0307
            r10.d(r1)
            goto L_0x030a
        L_0x0307:
            r12.d(r1)
        L_0x030a:
            s.g r3 = r2.f4474e
            int r13 = r3.f4460g
            int r14 = r2.f4473d
            r15 = 3
            if (r14 != r15) goto L_0x031e
            int r2 = r2.f4471a
            r15 = 1
            if (r2 != r15) goto L_0x031e
            int r2 = r3.f4466m
            int r13 = java.lang.Math.min(r13, r2)
        L_0x031e:
            if (r22 == 0) goto L_0x0322
            int r1 = r1 - r13
            goto L_0x0323
        L_0x0322:
            int r1 = r1 + r13
        L_0x0323:
            if (r22 == 0) goto L_0x0329
            r12.d(r1)
            goto L_0x032c
        L_0x0329:
            r10.d(r1)
        L_0x032c:
            if (r4 >= r11) goto L_0x033b
            if (r4 >= r9) goto L_0x033b
            if (r22 == 0) goto L_0x0337
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 - r2
            goto L_0x033b
        L_0x0337:
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 + r2
        L_0x033b:
            int r4 = r4 + 1
            goto L_0x02cc
        L_0x033e:
            r4 = 2
            if (r2 != r4) goto L_0x03d5
            int r2 = r0.f
            if (r2 != 0) goto L_0x034a
            r.d r2 = r0.b
            float r2 = r2.f4303S
            goto L_0x034e
        L_0x034a:
            r.d r2 = r0.b
            float r2 = r2.f4304T
        L_0x034e:
            if (r22 == 0) goto L_0x0354
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r4 - r2
        L_0x0354:
            int r5 = r5 - r14
            float r4 = (float) r5
            float r4 = r4 * r2
            float r4 = r4 + r18
            int r2 = (int) r4
            if (r2 < 0) goto L_0x035f
            if (r3 <= 0) goto L_0x0360
        L_0x035f:
            r2 = 0
        L_0x0360:
            if (r22 == 0) goto L_0x0365
            int r2 = r17 - r2
            goto L_0x0367
        L_0x0365:
            int r2 = r17 + r2
        L_0x0367:
            r4 = 0
        L_0x0368:
            if (r4 >= r7) goto L_0x03d5
            if (r22 == 0) goto L_0x0371
            int r1 = r4 + 1
            int r1 = r7 - r1
            goto L_0x0372
        L_0x0371:
            r1 = r4
        L_0x0372:
            java.lang.Object r1 = r6.get(r1)
            s.m r1 = (s.m) r1
            r.d r3 = r1.b
            int r3 = r3.f4306V
            s.f r5 = r1.f4477i
            s.f r10 = r1.f4476h
            r13 = 8
            if (r3 != r13) goto L_0x038d
            r10.d(r2)
            r5.d(r2)
            r14 = 1
            r15 = 3
            goto L_0x03d2
        L_0x038d:
            if (r4 <= 0) goto L_0x039a
            if (r4 < r8) goto L_0x039a
            if (r22 == 0) goto L_0x0397
            int r3 = r10.f
            int r2 = r2 - r3
            goto L_0x039a
        L_0x0397:
            int r3 = r10.f
            int r2 = r2 + r3
        L_0x039a:
            if (r22 == 0) goto L_0x03a0
            r5.d(r2)
            goto L_0x03a3
        L_0x03a0:
            r10.d(r2)
        L_0x03a3:
            s.g r3 = r1.f4474e
            int r12 = r3.f4460g
            int r14 = r1.f4473d
            r15 = 3
            if (r14 != r15) goto L_0x03b4
            int r1 = r1.f4471a
            r14 = 1
            if (r1 != r14) goto L_0x03b5
            int r12 = r3.f4466m
            goto L_0x03b5
        L_0x03b4:
            r14 = 1
        L_0x03b5:
            if (r22 == 0) goto L_0x03b9
            int r2 = r2 - r12
            goto L_0x03ba
        L_0x03b9:
            int r2 = r2 + r12
        L_0x03ba:
            if (r22 == 0) goto L_0x03c0
            r10.d(r2)
            goto L_0x03c3
        L_0x03c0:
            r5.d(r2)
        L_0x03c3:
            if (r4 >= r11) goto L_0x03d2
            if (r4 >= r9) goto L_0x03d2
            if (r22 == 0) goto L_0x03ce
            int r1 = r5.f
            int r1 = -r1
            int r2 = r2 - r1
            goto L_0x03d2
        L_0x03ce:
            int r1 = r5.f
            int r1 = -r1
            int r2 = r2 + r1
        L_0x03d2:
            int r4 = r4 + 1
            goto L_0x0368
        L_0x03d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.c.a(s.d):void");
    }

    public final void d() {
        ArrayList arrayList = this.f4448k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((m) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 >= 1) {
            C0472d dVar = ((m) arrayList.get(0)).b;
            C0472d dVar2 = ((m) arrayList.get(size2 - 1)).b;
            int i3 = this.f;
            f fVar = this.f4477i;
            f fVar2 = this.f4476h;
            if (i3 == 0) {
                C0471c cVar = dVar.f4335x;
                C0471c cVar2 = dVar2.f4337z;
                f i4 = m.i(cVar, 0);
                int c2 = cVar.c();
                C0472d m2 = m();
                if (m2 != null) {
                    c2 = m2.f4335x.c();
                }
                if (i4 != null) {
                    m.b(fVar2, i4, c2);
                }
                f i5 = m.i(cVar2, 0);
                int c3 = cVar2.c();
                C0472d n2 = n();
                if (n2 != null) {
                    c3 = n2.f4337z.c();
                }
                if (i5 != null) {
                    m.b(fVar, i5, -c3);
                }
            } else {
                C0471c cVar3 = dVar.f4336y;
                C0471c cVar4 = dVar2.f4286A;
                f i6 = m.i(cVar3, 1);
                int c4 = cVar3.c();
                C0472d m3 = m();
                if (m3 != null) {
                    c4 = m3.f4336y.c();
                }
                if (i6 != null) {
                    m.b(fVar2, i6, c4);
                }
                f i7 = m.i(cVar4, 1);
                int c5 = cVar4.c();
                C0472d n3 = n();
                if (n3 != null) {
                    c5 = n3.f4286A.c();
                }
                if (i7 != null) {
                    m.b(fVar, i7, -c5);
                }
            }
            fVar2.f4456a = this;
            fVar.f4456a = this;
        }
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4448k;
            if (i2 < arrayList.size()) {
                ((m) arrayList.get(i2)).e();
                i2++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        this.f4472c = null;
        ArrayList arrayList = this.f4448k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((m) obj).f();
        }
    }

    public final long j() {
        ArrayList arrayList = this.f4448k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = (m) arrayList.get(i2);
            j2 = ((long) mVar.f4477i.f) + mVar.j() + j2 + ((long) mVar.f4476h.f);
        }
        return j2;
    }

    public final boolean k() {
        ArrayList arrayList = this.f4448k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((m) arrayList.get(i2)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0472d m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4448k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C0472d dVar = ((m) arrayList.get(i2)).b;
            if (dVar.f4306V != 8) {
                return dVar;
            }
            i2++;
        }
    }

    public final C0472d n() {
        ArrayList arrayList = this.f4448k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0472d dVar = ((m) arrayList.get(size)).b;
            if (dVar.f4306V != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        String concat = "ChainRun ".concat(str);
        ArrayList arrayList = this.f4448k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String h2 = g.h(concat, "<");
            concat = g.h(h2 + ((m) obj), "> ");
        }
        return concat;
    }
}
