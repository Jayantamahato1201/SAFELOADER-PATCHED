package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import r.C0472d;
import r.g;
import r.i;
import t.q;
import t.r;

public class Flow extends r {

    /* renamed from: i  reason: collision with root package name */
    public final g f1070i;

    /* JADX WARNING: type inference failed for: r9v1, types: [r.g, r.i] */
    /* JADX WARNING: type inference failed for: r2v0, types: [s.b, java.lang.Object] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4549a = new int[32];
        this.f = new HashMap();
        this.f4550c = context;
        super.e(attributeSet);
        ? iVar = new i();
        iVar.f4382f0 = 0;
        iVar.f4383g0 = 0;
        iVar.f4384h0 = 0;
        iVar.f4385i0 = 0;
        iVar.f4386j0 = 0;
        iVar.f4387k0 = 0;
        iVar.f4388l0 = false;
        iVar.f4389m0 = 0;
        iVar.n0 = 0;
        iVar.f4390o0 = new Object();
        iVar.f4391p0 = null;
        iVar.f4392q0 = -1;
        iVar.f4393r0 = -1;
        iVar.f4394s0 = -1;
        iVar.f4395t0 = -1;
        iVar.f4396u0 = -1;
        iVar.f4397v0 = -1;
        iVar.f4398w0 = 0.5f;
        iVar.f4399x0 = 0.5f;
        iVar.f4400y0 = 0.5f;
        iVar.z0 = 0.5f;
        iVar.f4367A0 = 0.5f;
        iVar.f4368B0 = 0.5f;
        iVar.f4369C0 = 0;
        iVar.f4370D0 = 0;
        iVar.f4371E0 = 2;
        iVar.f4372F0 = 2;
        iVar.f4373G0 = 0;
        iVar.f4374H0 = -1;
        iVar.f4375I0 = 0;
        iVar.f4376J0 = new ArrayList();
        iVar.f4377K0 = null;
        iVar.f4378L0 = null;
        iVar.f4379M0 = null;
        iVar.f4381O0 = 0;
        this.f1070i = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f1070i.f4375I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f1070i;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f4382f0 = dimensionPixelSize;
                    gVar.f4383g0 = dimensionPixelSize;
                    gVar.f4384h0 = dimensionPixelSize;
                    gVar.f4385i0 = dimensionPixelSize;
                } else if (index == 11) {
                    g gVar2 = this.f1070i;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f4384h0 = dimensionPixelSize2;
                    gVar2.f4386j0 = dimensionPixelSize2;
                    gVar2.f4387k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f1070i.f4385i0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1070i.f4386j0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1070i.f4382f0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1070i.f4387k0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1070i.f4383g0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f1070i.f4373G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f1070i.f4392q0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f1070i.f4393r0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f1070i.f4394s0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f1070i.f4396u0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f1070i.f4395t0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f1070i.f4397v0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f1070i.f4398w0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f1070i.f4400y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f1070i.f4367A0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f1070i.z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f1070i.f4368B0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f1070i.f4399x0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f1070i.f4371E0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f1070i.f4372F0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f1070i.f4369C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f1070i.f4370D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f1070i.f4374H0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f4551d = this.f1070i;
        g();
    }

    public final void f(C0472d dVar, boolean z2) {
        g gVar = this.f1070i;
        int i2 = gVar.f4384h0;
        if (i2 <= 0 && gVar.f4385i0 <= 0) {
            return;
        }
        if (z2) {
            gVar.f4386j0 = gVar.f4385i0;
            gVar.f4387k0 = i2;
            return;
        }
        gVar.f4386j0 = i2;
        gVar.f4387k0 = gVar.f4385i0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:296:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0566  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(r.g r36, int r37, int r38) {
        /*
            r35 = this;
            r2 = r36
            int r9 = android.view.View.MeasureSpec.getMode(r37)
            int r10 = android.view.View.MeasureSpec.getSize(r37)
            int r11 = android.view.View.MeasureSpec.getMode(r38)
            int r12 = android.view.View.MeasureSpec.getSize(r38)
            r13 = 0
            if (r2 == 0) goto L_0x0573
            int r1 = r2.e0
            r14 = 2
            r15 = 1
            r3 = 3
            if (r1 <= 0) goto L_0x0089
            r.d r1 = r2.f4293I
            if (r1 == 0) goto L_0x0025
            r.e r1 = (r.C0473e) r1
            t.f r1 = r1.f4340g0
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            if (r1 != 0) goto L_0x0030
            r2.f4389m0 = r13
            r2.n0 = r13
            r2.f4388l0 = r13
            goto L_0x0569
        L_0x0030:
            r5 = 0
        L_0x0031:
            int r6 = r2.e0
            if (r5 >= r6) goto L_0x0089
            r.d[] r6 = r2.f4405d0
            r6 = r6[r5]
            if (r6 != 0) goto L_0x003c
            goto L_0x0086
        L_0x003c:
            boolean r7 = r6 instanceof r.h
            if (r7 == 0) goto L_0x0041
            goto L_0x0086
        L_0x0041:
            int r7 = r6.h(r13)
            int r8 = r6.h(r15)
            if (r7 != r3) goto L_0x0056
            int r4 = r6.f4321j
            if (r4 == r15) goto L_0x0056
            if (r8 != r3) goto L_0x0056
            int r4 = r6.f4322k
            if (r4 == r15) goto L_0x0056
            goto L_0x0086
        L_0x0056:
            if (r7 != r3) goto L_0x0059
            r7 = 2
        L_0x0059:
            if (r8 != r3) goto L_0x005c
            r8 = 2
        L_0x005c:
            s.b r4 = r2.f4390o0
            r4.f4440a = r7
            r4.b = r8
            int r7 = r6.l()
            r4.f4441c = r7
            int r7 = r6.i()
            r4.f4442d = r7
            r1.a(r6, r4)
            int r7 = r4.f4443e
            r6.y(r7)
            int r7 = r4.f
            r6.v(r7)
            int r4 = r4.f4444g
            r6.f4300P = r4
            if (r4 <= 0) goto L_0x0083
            r4 = 1
            goto L_0x0084
        L_0x0083:
            r4 = 0
        L_0x0084:
            r6.f4334w = r4
        L_0x0086:
            int r5 = r5 + 1
            goto L_0x0031
        L_0x0089:
            int r1 = r2.f4386j0
            int r4 = r2.f4387k0
            int r5 = r2.f4382f0
            int r6 = r2.f4383g0
            int[] r7 = new int[r14]
            int r8 = r10 - r1
            int r8 = r8 - r4
            int r3 = r2.f4375I0
            if (r3 != r15) goto L_0x009d
            int r8 = r12 - r5
            int r8 = r8 - r6
        L_0x009d:
            r14 = -1
            if (r3 != 0) goto L_0x00ad
            int r3 = r2.f4392q0
            if (r3 != r14) goto L_0x00a6
            r2.f4392q0 = r13
        L_0x00a6:
            int r3 = r2.f4393r0
            if (r3 != r14) goto L_0x00b9
            r2.f4393r0 = r13
            goto L_0x00b9
        L_0x00ad:
            int r3 = r2.f4392q0
            if (r3 != r14) goto L_0x00b3
            r2.f4392q0 = r13
        L_0x00b3:
            int r3 = r2.f4393r0
            if (r3 != r14) goto L_0x00b9
            r2.f4393r0 = r13
        L_0x00b9:
            r.d[] r3 = r2.f4405d0
            r14 = 0
            r17 = 0
            r27 = 0
        L_0x00c0:
            int r13 = r2.e0
            r15 = 8
            if (r14 >= r13) goto L_0x00d4
            r.d[] r13 = r2.f4405d0
            r13 = r13[r14]
            int r13 = r13.f4306V
            if (r13 != r15) goto L_0x00d0
            int r17 = r17 + 1
        L_0x00d0:
            int r14 = r14 + 1
            r15 = 1
            goto L_0x00c0
        L_0x00d4:
            if (r17 <= 0) goto L_0x0100
            int r13 = r13 - r17
            r.d[] r3 = new r.C0472d[r13]
            r13 = 0
            r14 = 0
        L_0x00dc:
            int r15 = r2.e0
            if (r13 >= r15) goto L_0x00f9
            r.d[] r15 = r2.f4405d0
            r15 = r15[r13]
            r18 = r1
            int r1 = r15.f4306V
            r19 = r3
            r3 = 8
            if (r1 == r3) goto L_0x00f2
            r19[r14] = r15
            int r14 = r14 + 1
        L_0x00f2:
            int r13 = r13 + 1
            r1 = r18
            r3 = r19
            goto L_0x00dc
        L_0x00f9:
            r19 = r3
            r13 = r19
        L_0x00fd:
            r18 = r1
            goto L_0x0103
        L_0x0100:
            r14 = r13
            r13 = r3
            goto L_0x00fd
        L_0x0103:
            r2.f4380N0 = r13
            r2.f4381O0 = r14
            int r1 = r2.f4373G0
            java.util.ArrayList r15 = r2.f4376J0
            if (r1 == 0) goto L_0x04a5
            r3 = 1
            if (r1 == r3) goto L_0x02a8
            r3 = 2
            if (r1 == r3) goto L_0x0121
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r30 = r18
        L_0x011d:
            r28 = 1
            goto L_0x0528
        L_0x0121:
            int r1 = r2.f4375I0
            if (r1 != 0) goto L_0x014e
            int r3 = r2.f4374H0
            if (r3 > 0) goto L_0x014b
            r3 = 0
            r15 = 0
            r17 = 0
        L_0x012d:
            if (r3 >= r14) goto L_0x0149
            r19 = r3
            if (r3 <= 0) goto L_0x0136
            int r3 = r2.f4369C0
            int r15 = r15 + r3
        L_0x0136:
            r3 = r13[r19]
            if (r3 != 0) goto L_0x013b
            goto L_0x0146
        L_0x013b:
            int r3 = r2.D(r3, r8)
            int r3 = r3 + r15
            if (r3 <= r8) goto L_0x0143
            goto L_0x0149
        L_0x0143:
            int r17 = r17 + 1
            r15 = r3
        L_0x0146:
            int r3 = r19 + 1
            goto L_0x012d
        L_0x0149:
            r3 = r17
        L_0x014b:
            r17 = 0
            goto L_0x0177
        L_0x014e:
            int r3 = r2.f4374H0
            if (r3 > 0) goto L_0x0174
            r3 = 0
            r15 = 0
            r17 = 0
        L_0x0156:
            if (r3 >= r14) goto L_0x0172
            r19 = r3
            if (r3 <= 0) goto L_0x015f
            int r3 = r2.f4370D0
            int r15 = r15 + r3
        L_0x015f:
            r3 = r13[r19]
            if (r3 != 0) goto L_0x0164
            goto L_0x016f
        L_0x0164:
            int r3 = r2.C(r3, r8)
            int r3 = r3 + r15
            if (r3 <= r8) goto L_0x016c
            goto L_0x0172
        L_0x016c:
            int r17 = r17 + 1
            r15 = r3
        L_0x016f:
            int r3 = r19 + 1
            goto L_0x0156
        L_0x0172:
            r3 = 0
            goto L_0x0177
        L_0x0174:
            r17 = r3
            goto L_0x0172
        L_0x0177:
            int[] r15 = r2.f4379M0
            if (r15 != 0) goto L_0x0180
            r15 = 2
            int[] r15 = new int[r15]
            r2.f4379M0 = r15
        L_0x0180:
            if (r17 != 0) goto L_0x0185
            r15 = 1
            if (r1 == r15) goto L_0x0189
        L_0x0185:
            if (r3 != 0) goto L_0x018e
            if (r1 != 0) goto L_0x018e
        L_0x0189:
            r15 = r17
            r16 = 1
            goto L_0x0192
        L_0x018e:
            r15 = r17
            r16 = 0
        L_0x0192:
            if (r16 != 0) goto L_0x028d
            if (r1 != 0) goto L_0x01a6
            float r15 = (float) r14
            r17 = r4
            float r4 = (float) r3
            float r15 = r15 / r4
            r19 = r3
            double r3 = (double) r15
            double r3 = java.lang.Math.ceil(r3)
            int r15 = (int) r3
            r3 = r19
            goto L_0x01b1
        L_0x01a6:
            r17 = r4
            float r3 = (float) r14
            float r4 = (float) r15
            float r3 = r3 / r4
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
        L_0x01b1:
            r.d[] r4 = r2.f4378L0
            r20 = r5
            if (r4 == 0) goto L_0x01ba
            int r5 = r4.length
            if (r5 >= r3) goto L_0x01bc
        L_0x01ba:
            r5 = 0
            goto L_0x01c1
        L_0x01bc:
            r5 = 0
            java.util.Arrays.fill(r4, r5)
            goto L_0x01c5
        L_0x01c1:
            r.d[] r4 = new r.C0472d[r3]
            r2.f4378L0 = r4
        L_0x01c5:
            r.d[] r4 = r2.f4377K0
            if (r4 == 0) goto L_0x01d2
            int r5 = r4.length
            if (r5 >= r15) goto L_0x01cd
            goto L_0x01d2
        L_0x01cd:
            r5 = 0
            java.util.Arrays.fill(r4, r5)
            goto L_0x01d6
        L_0x01d2:
            r.d[] r4 = new r.C0472d[r15]
            r2.f4377K0 = r4
        L_0x01d6:
            r4 = 0
        L_0x01d7:
            if (r4 >= r3) goto L_0x0230
            r5 = 0
        L_0x01da:
            if (r5 >= r15) goto L_0x0229
            int r19 = r5 * r3
            int r19 = r19 + r4
            r21 = r4
            r4 = 1
            if (r1 != r4) goto L_0x01e9
            int r4 = r21 * r15
            int r19 = r4 + r5
        L_0x01e9:
            r22 = r1
            r4 = r19
            int r1 = r13.length
            if (r4 < r1) goto L_0x01f3
        L_0x01f0:
            r19 = r5
            goto L_0x0222
        L_0x01f3:
            r1 = r13[r4]
            if (r1 != 0) goto L_0x01f8
            goto L_0x01f0
        L_0x01f8:
            int r4 = r2.D(r1, r8)
            r19 = r5
            r.d[] r5 = r2.f4378L0
            r5 = r5[r21]
            if (r5 == 0) goto L_0x020a
            int r5 = r5.l()
            if (r5 >= r4) goto L_0x020e
        L_0x020a:
            r.d[] r4 = r2.f4378L0
            r4[r21] = r1
        L_0x020e:
            int r4 = r2.C(r1, r8)
            r.d[] r5 = r2.f4377K0
            r5 = r5[r19]
            if (r5 == 0) goto L_0x021e
            int r5 = r5.i()
            if (r5 >= r4) goto L_0x0222
        L_0x021e:
            r.d[] r4 = r2.f4377K0
            r4[r19] = r1
        L_0x0222:
            int r5 = r19 + 1
            r4 = r21
            r1 = r22
            goto L_0x01da
        L_0x0229:
            r22 = r1
            r21 = r4
            int r4 = r21 + 1
            goto L_0x01d7
        L_0x0230:
            r22 = r1
            r1 = 0
            r4 = 0
        L_0x0234:
            if (r1 >= r3) goto L_0x024c
            r.d[] r5 = r2.f4378L0
            r5 = r5[r1]
            r19 = r1
            if (r5 == 0) goto L_0x0249
            if (r1 <= 0) goto L_0x0243
            int r1 = r2.f4369C0
            int r4 = r4 + r1
        L_0x0243:
            int r1 = r2.D(r5, r8)
            int r1 = r1 + r4
            r4 = r1
        L_0x0249:
            int r1 = r19 + 1
            goto L_0x0234
        L_0x024c:
            r1 = 0
            r5 = 0
        L_0x024e:
            if (r1 >= r15) goto L_0x026a
            r19 = r1
            r.d[] r1 = r2.f4377K0
            r1 = r1[r19]
            r21 = r6
            if (r1 == 0) goto L_0x0265
            if (r19 <= 0) goto L_0x025f
            int r6 = r2.f4370D0
            int r5 = r5 + r6
        L_0x025f:
            int r1 = r2.C(r1, r8)
            int r1 = r1 + r5
            r5 = r1
        L_0x0265:
            int r1 = r19 + 1
            r6 = r21
            goto L_0x024e
        L_0x026a:
            r21 = r6
            r7[r27] = r4
            r1 = 1
            r7[r1] = r5
            if (r22 != 0) goto L_0x027d
            if (r4 <= r8) goto L_0x027a
            if (r3 <= r1) goto L_0x027a
            int r3 = r3 + -1
            goto L_0x0283
        L_0x027a:
            r16 = 1
            goto L_0x0283
        L_0x027d:
            if (r5 <= r8) goto L_0x027a
            if (r15 <= r1) goto L_0x027a
            int r15 = r15 + -1
        L_0x0283:
            r4 = r17
            r5 = r20
            r6 = r21
            r1 = r22
            goto L_0x0192
        L_0x028d:
            r19 = r3
            r17 = r4
            r20 = r5
            r21 = r6
            r1 = 1
            int[] r3 = r2.f4379M0
            r3[r27] = r19
            r3[r1] = r15
        L_0x029c:
            r34 = r7
            r31 = r17
            r30 = r18
            r32 = r20
            r33 = r21
            goto L_0x011d
        L_0x02a8:
            r17 = r4
            r20 = r5
            r21 = r6
            int r3 = r2.f4375I0
            if (r14 != 0) goto L_0x02b3
            goto L_0x029c
        L_0x02b3:
            r15.clear()
            r.f r1 = new r.f
            r.c r6 = r2.f4337z
            r4 = r7
            r.c r7 = r2.f4286A
            r5 = r4
            r.c r4 = r2.f4335x
            r19 = r5
            r.c r5 = r2.f4336y
            r29 = r13
            r31 = r17
            r30 = r18
            r34 = r19
            r32 = r20
            r33 = r21
            r13 = 3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r15.add(r1)
            if (r3 != 0) goto L_0x0346
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x02dc:
            if (r4 >= r14) goto L_0x03a9
            r7 = r29[r4]
            int r17 = r2.D(r7, r8)
            int[] r13 = r7.f4315c0
            r13 = r13[r27]
            r37 = r3
            r3 = 3
            if (r13 != r3) goto L_0x02ef
            int r5 = r5 + 1
        L_0x02ef:
            r13 = r5
            if (r6 == r8) goto L_0x02f9
            int r3 = r2.f4369C0
            int r3 = r3 + r6
            int r3 = r3 + r17
            if (r3 <= r8) goto L_0x02ff
        L_0x02f9:
            r.d r3 = r1.b
            if (r3 == 0) goto L_0x02ff
            r3 = 1
            goto L_0x0300
        L_0x02ff:
            r3 = 0
        L_0x0300:
            if (r3 != 0) goto L_0x030d
            if (r4 <= 0) goto L_0x030d
            int r5 = r2.f4374H0
            if (r5 <= 0) goto L_0x030d
            int r5 = r4 % r5
            if (r5 != 0) goto L_0x030d
            r3 = 1
        L_0x030d:
            if (r3 == 0) goto L_0x032f
            r.f r1 = new r.f
            r.c r6 = r2.f4337z
            r3 = r7
            r.c r7 = r2.f4286A
            r5 = r4
            r.c r4 = r2.f4335x
            r18 = r5
            r.c r5 = r2.f4336y
            r0 = r3
            r19 = r13
            r13 = r18
            r3 = r37
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.f4362n = r13
            r15.add(r1)
        L_0x032c:
            r6 = r17
            goto L_0x033d
        L_0x032f:
            r3 = r37
            r0 = r7
            r19 = r13
            r13 = r4
            if (r13 <= 0) goto L_0x032c
            int r4 = r2.f4369C0
            int r4 = r4 + r17
            int r4 = r4 + r6
            r6 = r4
        L_0x033d:
            r1.a(r0)
            int r4 = r13 + 1
            r5 = r19
            r13 = 3
            goto L_0x02dc
        L_0x0346:
            r0 = 0
            r4 = 0
            r5 = 0
        L_0x0349:
            if (r0 >= r14) goto L_0x03a8
            r13 = r29[r0]
            int r17 = r2.C(r13, r8)
            int[] r6 = r13.f4315c0
            r28 = 1
            r6 = r6[r28]
            r7 = 3
            if (r6 != r7) goto L_0x035c
            int r4 = r4 + 1
        L_0x035c:
            r18 = r4
            if (r5 == r8) goto L_0x0367
            int r4 = r2.f4370D0
            int r4 = r4 + r5
            int r4 = r4 + r17
            if (r4 <= r8) goto L_0x036d
        L_0x0367:
            r.d r4 = r1.b
            if (r4 == 0) goto L_0x036d
            r4 = 1
            goto L_0x036e
        L_0x036d:
            r4 = 0
        L_0x036e:
            if (r4 != 0) goto L_0x037b
            if (r0 <= 0) goto L_0x037b
            int r6 = r2.f4374H0
            if (r6 <= 0) goto L_0x037b
            int r6 = r0 % r6
            if (r6 != 0) goto L_0x037b
            r4 = 1
        L_0x037b:
            if (r4 == 0) goto L_0x0396
            r.f r1 = new r.f
            r.c r6 = r2.f4337z
            r4 = 3
            r.c r7 = r2.f4286A
            r5 = 3
            r.c r4 = r2.f4335x
            r19 = 3
            r.c r5 = r2.f4336y
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.f4362n = r0
            r15.add(r1)
        L_0x0393:
            r5 = r17
            goto L_0x03a0
        L_0x0396:
            r19 = 3
            if (r0 <= 0) goto L_0x0393
            int r4 = r2.f4370D0
            int r4 = r4 + r17
            int r4 = r4 + r5
            r5 = r4
        L_0x03a0:
            r1.a(r13)
            int r0 = r0 + 1
            r4 = r18
            goto L_0x0349
        L_0x03a8:
            r5 = r4
        L_0x03a9:
            int r0 = r15.size()
            int r1 = r2.f4386j0
            int r4 = r2.f4382f0
            int r6 = r2.f4387k0
            int r7 = r2.f4383g0
            int[] r13 = r2.f4315c0
            r14 = r13[r27]
            r17 = r1
            r1 = 2
            if (r14 == r1) goto L_0x03c7
            r28 = 1
            r13 = r13[r28]
            if (r13 != r1) goto L_0x03c5
            goto L_0x03c7
        L_0x03c5:
            r1 = 0
            goto L_0x03c8
        L_0x03c7:
            r1 = 1
        L_0x03c8:
            if (r5 <= 0) goto L_0x03ed
            if (r1 == 0) goto L_0x03ed
            r1 = 0
        L_0x03cd:
            if (r1 >= r0) goto L_0x03ed
            java.lang.Object r5 = r15.get(r1)
            r.f r5 = (r.f) r5
            if (r3 != 0) goto L_0x03e1
            int r13 = r5.d()
            int r13 = r8 - r13
            r5.e(r13)
            goto L_0x03ea
        L_0x03e1:
            int r13 = r5.c()
            int r13 = r8 - r13
            r5.e(r13)
        L_0x03ea:
            int r1 = r1 + 1
            goto L_0x03cd
        L_0x03ed:
            r.c r1 = r2.f4286A
            r.c r5 = r2.f4337z
            r.c r13 = r2.f4335x
            r.c r14 = r2.f4336y
            r21 = r1
            r23 = r4
            r20 = r5
            r24 = r6
            r25 = r7
            r18 = r13
            r19 = r14
            r22 = r17
            r4 = 0
            r6 = 0
            r7 = 0
        L_0x0408:
            if (r4 >= r0) goto L_0x049d
            java.lang.Object r13 = r15.get(r4)
            r.f r13 = (r.f) r13
            if (r3 != 0) goto L_0x0455
            int r14 = r0 + -1
            if (r4 >= r14) goto L_0x0427
            int r14 = r4 + 1
            java.lang.Object r14 = r15.get(r14)
            r.f r14 = (r.f) r14
            r.d r14 = r14.b
            r.c r14 = r14.f4336y
            r21 = r14
            r25 = 0
            goto L_0x042d
        L_0x0427:
            int r14 = r2.f4383g0
            r21 = r1
            r25 = r14
        L_0x042d:
            r.d r14 = r13.b
            r.c r14 = r14.f4286A
            r17 = r3
            r26 = r8
            r16 = r13
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r37 = r0
            int r0 = r13.d()
            int r0 = java.lang.Math.max(r6, r0)
            int r6 = r13.c()
            int r6 = r6 + r7
            if (r4 <= 0) goto L_0x044e
            int r7 = r2.f4370D0
            int r6 = r6 + r7
        L_0x044e:
            r7 = r6
            r19 = r14
            r23 = 0
            r6 = r0
            goto L_0x0497
        L_0x0455:
            r37 = r0
            int r0 = r37 + -1
            if (r4 >= r0) goto L_0x046c
            int r0 = r4 + 1
            java.lang.Object r0 = r15.get(r0)
            r.f r0 = (r.f) r0
            r.d r0 = r0.b
            r.c r0 = r0.f4335x
            r20 = r0
            r24 = 0
            goto L_0x0472
        L_0x046c:
            int r0 = r2.f4387k0
            r24 = r0
            r20 = r5
        L_0x0472:
            r.d r0 = r13.b
            r.c r0 = r0.f4337z
            r17 = r3
            r26 = r8
            r16 = r13
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r13 = r16.d()
            int r13 = r13 + r6
            int r6 = r16.c()
            int r6 = java.lang.Math.max(r7, r6)
            if (r4 <= 0) goto L_0x0491
            int r7 = r2.f4369C0
            int r13 = r13 + r7
        L_0x0491:
            r18 = r0
            r7 = r6
            r6 = r13
            r22 = 0
        L_0x0497:
            int r4 = r4 + 1
            r0 = r37
            goto L_0x0408
        L_0x049d:
            r34[r27] = r6
            r28 = 1
            r34[r28] = r7
            goto L_0x011d
        L_0x04a5:
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r29 = r13
            r30 = r18
            int r3 = r2.f4375I0
            if (r14 != 0) goto L_0x04b7
            goto L_0x011d
        L_0x04b7:
            int r0 = r15.size()
            if (r0 != 0) goto L_0x04ce
            r.f r1 = new r.f
            r.c r6 = r2.f4337z
            r.c r7 = r2.f4286A
            r.c r4 = r2.f4335x
            r.c r5 = r2.f4336y
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r15.add(r1)
            goto L_0x050d
        L_0x04ce:
            r17 = r3
            r0 = 0
            java.lang.Object r1 = r15.get(r0)
            r.f r1 = (r.f) r1
            r1.f4352c = r0
            r5 = 0
            r1.b = r5
            r1.f4360l = r0
            r1.f4361m = r0
            r1.f4362n = r0
            r1.f4363o = r0
            r1.f4364p = r0
            int r0 = r2.f4386j0
            int r3 = r2.f4382f0
            int r4 = r2.f4387k0
            int r5 = r2.f4383g0
            r.c r6 = r2.f4335x
            r.c r7 = r2.f4336y
            r.c r13 = r2.f4337z
            r.c r15 = r2.f4286A
            r22 = r0
            r16 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r18 = r6
            r19 = r7
            r26 = r8
            r20 = r13
            r21 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x050d:
            r0 = 0
        L_0x050e:
            if (r0 >= r14) goto L_0x0518
            r3 = r29[r0]
            r1.a(r3)
            int r0 = r0 + 1
            goto L_0x050e
        L_0x0518:
            int r0 = r1.d()
            r27 = 0
            r34[r27] = r0
            int r0 = r1.c()
            r28 = 1
            r34[r28] = r0
        L_0x0528:
            r0 = r34[r27]
            int r0 = r0 + r30
            int r0 = r0 + r31
            r1 = r34[r28]
            int r1 = r1 + r32
            int r1 = r1 + r33
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r9 != r4) goto L_0x053b
            goto L_0x0547
        L_0x053b:
            if (r9 != r3) goto L_0x0542
            int r10 = java.lang.Math.min(r0, r10)
            goto L_0x0547
        L_0x0542:
            if (r9 != 0) goto L_0x0546
            r10 = r0
            goto L_0x0547
        L_0x0546:
            r10 = 0
        L_0x0547:
            if (r11 != r4) goto L_0x054a
            goto L_0x0556
        L_0x054a:
            if (r11 != r3) goto L_0x0551
            int r12 = java.lang.Math.min(r1, r12)
            goto L_0x0556
        L_0x0551:
            if (r11 != 0) goto L_0x0555
            r12 = r1
            goto L_0x0556
        L_0x0555:
            r12 = 0
        L_0x0556:
            r2.f4389m0 = r10
            r2.n0 = r12
            r2.y(r10)
            r2.v(r12)
            int r0 = r2.e0
            if (r0 <= 0) goto L_0x0566
            r13 = 1
            goto L_0x0567
        L_0x0566:
            r13 = 0
        L_0x0567:
            r2.f4388l0 = r13
        L_0x0569:
            int r0 = r2.f4389m0
            int r1 = r2.n0
            r2 = r35
            r2.setMeasuredDimension(r0, r1)
            return
        L_0x0573:
            r0 = 0
            r2 = r35
            r2.setMeasuredDimension(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.h(r.g, int, int):void");
    }

    public final void onMeasure(int i2, int i3) {
        h(this.f1070i, i2, i3);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1070i.f4400y0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f1070i.f4394s0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1070i.z0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f1070i.f4395t0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f1070i.f4371E0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1070i.f4398w0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f1070i.f4369C0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f1070i.f4392q0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f1070i.f4374H0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f1070i.f4375I0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        g gVar = this.f1070i;
        gVar.f4382f0 = i2;
        gVar.f4383g0 = i2;
        gVar.f4384h0 = i2;
        gVar.f4385i0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f1070i.f4383g0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f1070i.f4386j0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f1070i.f4387k0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f1070i.f4382f0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f1070i.f4372F0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1070i.f4399x0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f1070i.f4370D0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f1070i.f4393r0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f1070i.f4373G0 = i2;
        requestLayout();
    }
}
