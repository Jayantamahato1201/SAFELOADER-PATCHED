package t;

import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: t.f  reason: case insensitive filesystem */
public final class C0481f {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4613a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f4614c;

    /* renamed from: d  reason: collision with root package name */
    public int f4615d;

    /* renamed from: e  reason: collision with root package name */
    public int f4616e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f4617g;

    public C0481f(ConstraintLayout constraintLayout) {
        this.f4613a = constraintLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0157 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(r.C0472d r22, s.C0475b r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            int r3 = r1.f4306V
            r4 = 8
            r5 = 0
            if (r3 != r4) goto L_0x0017
            r2.f4443e = r5
            r2.f = r5
            r2.f4444g = r5
            return
        L_0x0017:
            int r3 = r2.f4440a
            int r4 = r2.b
            int r6 = r2.f4441c
            int r7 = r2.f4442d
            int r8 = r0.b
            int r9 = r0.f4614c
            int r8 = r8 + r9
            int r9 = r0.f4615d
            android.view.View r10 = r1.f4305U
            int r11 = q.h.b(r3)
            r.c r12 = r1.f4337z
            r.c r13 = r1.f4335x
            int[] r14 = r1.f4318g
            r15 = 1
            r16 = 0
            r5 = 2
            if (r11 == 0) goto L_0x00af
            if (r11 == r15) goto L_0x00a1
            if (r11 == r5) goto L_0x0061
            r6 = 3
            if (r11 == r6) goto L_0x0045
            r5 = 0
            r6 = 0
            r19 = 2
            goto L_0x00bb
        L_0x0045:
            int r6 = r0.f
            if (r13 == 0) goto L_0x004c
            int r11 = r13.f4284e
            goto L_0x004d
        L_0x004c:
            r11 = 0
        L_0x004d:
            if (r12 == 0) goto L_0x0055
            r19 = 2
            int r5 = r12.f4284e
            int r11 = r11 + r5
            goto L_0x0057
        L_0x0055:
            r19 = 2
        L_0x0057:
            int r9 = r9 + r11
            r5 = -1
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r5)
            r14[r19] = r5
        L_0x005f:
            r5 = 0
            goto L_0x00bb
        L_0x0061:
            r19 = 2
            int r5 = r0.f
            r6 = -2
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
            int r6 = r1.f4321j
            if (r6 != r15) goto L_0x0070
            r6 = 1
            goto L_0x0071
        L_0x0070:
            r6 = 0
        L_0x0071:
            r14[r19] = r16
            boolean r9 = r2.f4447j
            if (r9 == 0) goto L_0x0090
            if (r6 == 0) goto L_0x008a
            r17 = 3
            r9 = r14[r17]
            if (r9 == 0) goto L_0x008a
            r9 = r14[r16]
            int r11 = r1.l()
            if (r9 != r11) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r9 = 1
            goto L_0x008b
        L_0x008a:
            r9 = 0
        L_0x008b:
            if (r6 == 0) goto L_0x0093
            if (r9 == 0) goto L_0x0090
            goto L_0x0093
        L_0x0090:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x009e
        L_0x0093:
            int r5 = r1.l()
            r11 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L_0x005f
        L_0x009e:
            r6 = r5
            r5 = 1
            goto L_0x00bb
        L_0x00a1:
            r11 = 1073741824(0x40000000, float:2.0)
            r19 = 2
            int r5 = r0.f
            r6 = -2
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
            r14[r19] = r6
            goto L_0x009e
        L_0x00af:
            r11 = 1073741824(0x40000000, float:2.0)
            r19 = 2
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            r14[r19] = r6
            r6 = r5
            goto L_0x005f
        L_0x00bb:
            int r9 = q.h.b(r4)
            if (r9 == 0) goto L_0x0137
            if (r9 == r15) goto L_0x012a
            r7 = 2
            if (r9 == r7) goto L_0x00ea
            r7 = 3
            if (r9 == r7) goto L_0x00ce
            r7 = 0
        L_0x00ca:
            r8 = 3
        L_0x00cb:
            r9 = 0
            goto L_0x0142
        L_0x00ce:
            int r7 = r0.f4617g
            if (r13 == 0) goto L_0x00d7
            r.c r9 = r1.f4336y
            int r9 = r9.f4284e
            goto L_0x00d8
        L_0x00d7:
            r9 = 0
        L_0x00d8:
            if (r12 == 0) goto L_0x00df
            r.c r11 = r1.f4286A
            int r11 = r11.f4284e
            int r9 = r9 + r11
        L_0x00df:
            int r8 = r8 + r9
            r9 = -1
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
            r17 = 3
            r14[r17] = r9
            goto L_0x00ca
        L_0x00ea:
            r17 = 3
            int r7 = r0.f4617g
            r9 = -2
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
            int r8 = r1.f4322k
            if (r8 != r15) goto L_0x00f9
            r8 = 1
            goto L_0x00fa
        L_0x00f9:
            r8 = 0
        L_0x00fa:
            r14[r17] = r16
            boolean r9 = r2.f4447j
            if (r9 == 0) goto L_0x0119
            if (r8 == 0) goto L_0x0113
            r19 = 2
            r9 = r14[r19]
            if (r9 == 0) goto L_0x0113
            r9 = r14[r15]
            int r11 = r1.i()
            if (r9 != r11) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            r9 = 1
            goto L_0x0114
        L_0x0113:
            r9 = 0
        L_0x0114:
            if (r8 == 0) goto L_0x011c
            if (r9 == 0) goto L_0x0119
            goto L_0x011c
        L_0x0119:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0127
        L_0x011c:
            int r7 = r1.i()
            r11 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r11)
            goto L_0x00ca
        L_0x0127:
            r8 = 3
        L_0x0128:
            r9 = 1
            goto L_0x0142
        L_0x012a:
            r11 = 1073741824(0x40000000, float:2.0)
            int r7 = r0.f4617g
            r9 = -2
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
            r8 = 3
            r14[r8] = r9
            goto L_0x0128
        L_0x0137:
            r8 = 3
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r11)
            r14[r8] = r7
            r7 = r9
            goto L_0x00cb
        L_0x0142:
            if (r3 != r8) goto L_0x0146
            r11 = 1
            goto L_0x0147
        L_0x0146:
            r11 = 0
        L_0x0147:
            if (r4 != r8) goto L_0x014b
            r8 = 1
            goto L_0x014c
        L_0x014b:
            r8 = 0
        L_0x014c:
            r12 = 4
            if (r4 == r12) goto L_0x0154
            if (r4 != r15) goto L_0x0152
            goto L_0x0154
        L_0x0152:
            r4 = 0
            goto L_0x0155
        L_0x0154:
            r4 = 1
        L_0x0155:
            if (r3 == r12) goto L_0x015c
            if (r3 != r15) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r3 = 0
            goto L_0x015d
        L_0x015c:
            r3 = 1
        L_0x015d:
            r12 = 0
            if (r11 == 0) goto L_0x0168
            float r13 = r1.f4296L
            int r13 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r13 <= 0) goto L_0x0168
            r13 = 1
            goto L_0x0169
        L_0x0168:
            r13 = 0
        L_0x0169:
            if (r8 == 0) goto L_0x0175
            r18 = 0
            float r12 = r1.f4296L
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 <= 0) goto L_0x0175
            r12 = 1
            goto L_0x0176
        L_0x0175:
            r12 = 0
        L_0x0176:
            android.view.ViewGroup$LayoutParams r18 = r10.getLayoutParams()
            r20 = 1
            r15 = r18
            t.e r15 = (t.C0480e) r15
            boolean r0 = r2.f4447j
            if (r0 != 0) goto L_0x0197
            if (r11 == 0) goto L_0x0197
            int r0 = r1.f4321j
            if (r0 != 0) goto L_0x0197
            if (r8 == 0) goto L_0x0197
            int r0 = r1.f4322k
            if (r0 == 0) goto L_0x0191
            goto L_0x0197
        L_0x0191:
            r0 = -1
            r5 = 0
            r9 = 0
            r11 = 0
            goto L_0x0237
        L_0x0197:
            boolean r0 = r10 instanceof t.r
            if (r0 == 0) goto L_0x01a9
            boolean r0 = r1 instanceof r.g
            if (r0 == 0) goto L_0x01a9
            r0 = r1
            r.g r0 = (r.g) r0
            r8 = r10
            t.r r8 = (t.r) r8
            r8.h(r0, r6, r7)
            goto L_0x01ac
        L_0x01a9:
            r10.measure(r6, r7)
        L_0x01ac:
            int r0 = r10.getMeasuredWidth()
            int r8 = r10.getMeasuredHeight()
            int r11 = r10.getBaseline()
            if (r5 == 0) goto L_0x01c1
            r14[r16] = r0
            r19 = 2
            r14[r19] = r8
            goto L_0x01c7
        L_0x01c1:
            r19 = 2
            r14[r16] = r16
            r14[r19] = r16
        L_0x01c7:
            if (r9 == 0) goto L_0x01d0
            r14[r20] = r8
            r17 = 3
            r14[r17] = r0
            goto L_0x01d6
        L_0x01d0:
            r17 = 3
            r14[r20] = r16
            r14[r17] = r16
        L_0x01d6:
            int r5 = r1.f4324m
            if (r5 <= 0) goto L_0x01df
            int r5 = java.lang.Math.max(r5, r0)
            goto L_0x01e0
        L_0x01df:
            r5 = r0
        L_0x01e0:
            int r9 = r1.f4325n
            if (r9 <= 0) goto L_0x01e8
            int r5 = java.lang.Math.min(r9, r5)
        L_0x01e8:
            int r9 = r1.f4327p
            if (r9 <= 0) goto L_0x01f1
            int r9 = java.lang.Math.max(r9, r8)
            goto L_0x01f2
        L_0x01f1:
            r9 = r8
        L_0x01f2:
            int r14 = r1.f4328q
            if (r14 <= 0) goto L_0x01fa
            int r9 = java.lang.Math.min(r14, r9)
        L_0x01fa:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r13 == 0) goto L_0x0208
            if (r4 == 0) goto L_0x0208
            float r3 = r1.f4296L
            float r4 = (float) r9
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r5 = (int) r4
            goto L_0x0212
        L_0x0208:
            if (r12 == 0) goto L_0x0212
            if (r3 == 0) goto L_0x0212
            float r3 = r1.f4296L
            float r4 = (float) r5
            float r4 = r4 / r3
            float r4 = r4 + r14
            int r9 = (int) r4
        L_0x0212:
            if (r0 != r5) goto L_0x0219
            if (r8 == r9) goto L_0x0217
            goto L_0x0219
        L_0x0217:
            r0 = -1
            goto L_0x0237
        L_0x0219:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r0 == r5) goto L_0x0221
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
        L_0x0221:
            if (r8 == r9) goto L_0x0227
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
        L_0x0227:
            r10.measure(r6, r7)
            int r5 = r10.getMeasuredWidth()
            int r9 = r10.getMeasuredHeight()
            int r11 = r10.getBaseline()
            goto L_0x0217
        L_0x0237:
            if (r11 == r0) goto L_0x023b
            r0 = 1
            goto L_0x023c
        L_0x023b:
            r0 = 0
        L_0x023c:
            int r3 = r2.f4441c
            if (r5 != r3) goto L_0x0247
            int r3 = r2.f4442d
            if (r9 == r3) goto L_0x0245
            goto L_0x0247
        L_0x0245:
            r3 = 0
            goto L_0x0248
        L_0x0247:
            r3 = 1
        L_0x0248:
            r2.f4446i = r3
            boolean r3 = r15.f4576X
            if (r3 == 0) goto L_0x024f
            r0 = 1
        L_0x024f:
            if (r0 == 0) goto L_0x025b
            r3 = -1
            if (r11 == r3) goto L_0x025b
            int r1 = r1.f4300P
            if (r1 == r11) goto L_0x025b
            r1 = 1
            r2.f4446i = r1
        L_0x025b:
            r2.f4443e = r5
            r2.f = r9
            r2.f4445h = r0
            r2.f4444g = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0481f.a(r.d, s.b):void");
    }
}
