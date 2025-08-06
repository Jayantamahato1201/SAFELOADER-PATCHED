package g0;

import A.i;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import z.C0503b;

/* renamed from: g0.a  reason: case insensitive filesystem */
public abstract class C0165a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f2791a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2792c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2793d = {16842755, 16843781, 16844062};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2794e = {16843161};
    public static final int[] f = {16842755, 16843213};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f2795g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f2796h = {16843490};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f2797i = {16843486, 16843487, 16843488, 16843489};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f2798j = {16842788, 16843073, 16843488, 16843992};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f2799k = {16843489, 16843781, 16843892, 16843893};

    /* JADX WARNING: Removed duplicated region for block: B:136:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0379  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator a(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) {
        /*
            r7 = r31
            int r8 = r29.getDepth()
            r0 = 0
            r10 = 0
        L_0x0008:
            int r1 = r29.next()
            r11 = 0
            r2 = 3
            if (r1 != r2) goto L_0x001a
            int r3 = r29.getDepth()
            if (r3 <= r8) goto L_0x0017
            goto L_0x001a
        L_0x0017:
            r1 = 0
            goto L_0x039d
        L_0x001a:
            r3 = 1
            if (r1 == r3) goto L_0x0017
            r4 = 2
            if (r1 == r4) goto L_0x0021
            goto L_0x0008
        L_0x0021:
            java.lang.String r1 = r29.getName()
            java.lang.String r5 = "objectAnimator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0044
            android.animation.ObjectAnimator r4 = new android.animation.ObjectAnimator
            r4.<init>()
            r0 = r26
            r1 = r27
            r2 = r28
            r5 = r29
            r3 = r30
            d(r0, r1, r2, r3, r4, r5)
        L_0x003f:
            r0 = r4
        L_0x0040:
            r20 = r8
            goto L_0x0373
        L_0x0044:
            java.lang.String r5 = "animator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x005f
            r4 = 0
            r0 = r26
            r1 = r27
            r2 = r28
            r5 = r29
            r3 = r30
            android.animation.ValueAnimator r4 = d(r0, r1, r2, r3, r4, r5)
            r6 = r2
            r12 = r5
            r5 = r1
            goto L_0x003f
        L_0x005f:
            r5 = r27
            r6 = r28
            r12 = r29
            java.lang.String r13 = "set"
            boolean r13 = r1.equals(r13)
            java.lang.String r14 = "http://schemas.android.com/apk/res/android"
            if (r13 == 0) goto L_0x00a2
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            int[] r1 = f2796h
            r3 = r30
            android.content.res.TypedArray r13 = z.C0503b.g(r5, r6, r3, r1)
            java.lang.String r1 = "ordering"
            java.lang.String r1 = r12.getAttributeValue(r14, r1)
            if (r1 == 0) goto L_0x0091
            int r1 = r13.getInt(r11, r11)
            r2 = r6
            r6 = r1
            r4 = r3
            r3 = r12
            r1 = r5
        L_0x008d:
            r5 = r0
            r0 = r26
            goto L_0x0097
        L_0x0091:
            r2 = r6
            r6 = 0
            r4 = r3
            r1 = r5
            r3 = r12
            goto L_0x008d
        L_0x0097:
            a(r0, r1, r2, r3, r4, r5, r6)
            r6 = r2
            r12 = r3
            r0 = r5
            r5 = r1
            r13.recycle()
            goto L_0x0040
        L_0x00a2:
            java.lang.String r13 = "propertyValuesHolder"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0385
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r12)
            r15 = 0
        L_0x00af:
            int r9 = r12.getEventType()
            if (r9 == r2) goto L_0x034b
            if (r9 == r3) goto L_0x034b
            if (r9 == r4) goto L_0x00bd
            r12.next()
            goto L_0x00af
        L_0x00bd:
            java.lang.String r9 = r12.getName()
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x032b
            int[] r9 = f2797i
            android.content.res.TypedArray r9 = z.C0503b.g(r5, r6, r1, r9)
            java.lang.String r11 = "propertyName"
            java.lang.String r11 = z.C0503b.c(r9, r12, r11, r2)
            java.lang.String r3 = "valueType"
            java.lang.String r3 = r12.getAttributeValue(r14, r3)
            if (r3 == 0) goto L_0x00dd
            r3 = 1
            goto L_0x00de
        L_0x00dd:
            r3 = 0
        L_0x00de:
            r2 = 4
            if (r3 != 0) goto L_0x00e3
            r3 = 4
            goto L_0x00e7
        L_0x00e3:
            int r3 = r9.getInt(r4, r2)
        L_0x00e7:
            r18 = r1
            r1 = r3
            r4 = 0
            r17 = 2
        L_0x00ed:
            int r2 = r12.next()
            r20 = r8
            r8 = 3
            if (r2 == r8) goto L_0x01f2
            r8 = 1
            if (r2 == r8) goto L_0x01f2
            java.lang.String r2 = r12.getName()
            java.lang.String r8 = "keyframe"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x01e4
            int[] r2 = f2798j
            java.lang.String r8 = "value"
            r22 = r13
            r13 = 4
            if (r1 != r13) goto L_0x0136
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r12)
            android.content.res.TypedArray r1 = z.C0503b.g(r5, r6, r1, r2)
            boolean r13 = z.C0503b.d(r12, r8)
            if (r13 != 0) goto L_0x011e
            r13 = 0
            goto L_0x0125
        L_0x011e:
            r13 = 0
            android.util.TypedValue r23 = r1.peekValue(r13)
            r13 = r23
        L_0x0125:
            if (r13 == 0) goto L_0x0131
            int r13 = r13.type
            boolean r13 = c(r13)
            if (r13 == 0) goto L_0x0131
            r13 = 3
            goto L_0x0132
        L_0x0131:
            r13 = 0
        L_0x0132:
            r1.recycle()
            r1 = r13
        L_0x0136:
            android.util.AttributeSet r13 = android.util.Xml.asAttributeSet(r12)
            android.content.res.TypedArray r2 = z.C0503b.g(r5, r6, r13, r2)
            java.lang.String r13 = "fraction"
            boolean r13 = z.C0503b.d(r12, r13)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r13 != 0) goto L_0x0149
            goto L_0x014e
        L_0x0149:
            r13 = 3
            float r5 = r2.getFloat(r13, r5)
        L_0x014e:
            boolean r13 = z.C0503b.d(r12, r8)
            if (r13 != 0) goto L_0x0156
            r13 = 0
            goto L_0x015d
        L_0x0156:
            r13 = 0
            android.util.TypedValue r23 = r2.peekValue(r13)
            r13 = r23
        L_0x015d:
            if (r13 == 0) goto L_0x0163
            r19 = 1
        L_0x0161:
            r6 = 4
            goto L_0x0166
        L_0x0163:
            r19 = 0
            goto L_0x0161
        L_0x0166:
            if (r1 != r6) goto L_0x0176
            if (r19 == 0) goto L_0x0174
            int r13 = r13.type
            boolean r13 = c(r13)
            if (r13 == 0) goto L_0x0174
            r13 = 3
            goto L_0x0177
        L_0x0174:
            r13 = 0
            goto L_0x0177
        L_0x0176:
            r13 = r1
        L_0x0177:
            if (r19 == 0) goto L_0x01ab
            if (r13 == 0) goto L_0x0198
            r6 = 1
            if (r13 == r6) goto L_0x0183
            r6 = 3
            if (r13 == r6) goto L_0x0183
            r5 = 0
            goto L_0x01b6
        L_0x0183:
            java.lang.String r6 = r12.getAttributeValue(r14, r8)
            if (r6 == 0) goto L_0x0191
            r13 = 0
            int r16 = r2.getInt(r13, r13)
            r6 = r16
            goto L_0x0193
        L_0x0191:
            r13 = 0
            r6 = 0
        L_0x0193:
            android.animation.Keyframe r5 = android.animation.Keyframe.ofInt(r5, r6)
            goto L_0x01b6
        L_0x0198:
            r13 = 0
            java.lang.String r6 = r12.getAttributeValue(r14, r8)
            if (r6 == 0) goto L_0x01a5
            r6 = 0
            float r8 = r2.getFloat(r13, r6)
            goto L_0x01a6
        L_0x01a5:
            r8 = 0
        L_0x01a6:
            android.animation.Keyframe r5 = android.animation.Keyframe.ofFloat(r5, r8)
            goto L_0x01b6
        L_0x01ab:
            if (r13 != 0) goto L_0x01b2
            android.animation.Keyframe r5 = android.animation.Keyframe.ofFloat(r5)
            goto L_0x01b6
        L_0x01b2:
            android.animation.Keyframe r5 = android.animation.Keyframe.ofInt(r5)
        L_0x01b6:
            java.lang.String r6 = "interpolator"
            java.lang.String r6 = r12.getAttributeValue(r14, r6)
            if (r6 == 0) goto L_0x01c5
            r6 = 1
            r13 = 0
            int r8 = r2.getResourceId(r6, r13)
            goto L_0x01c6
        L_0x01c5:
            r8 = 0
        L_0x01c6:
            r6 = r26
            if (r8 <= 0) goto L_0x01d1
            android.view.animation.Interpolator r8 = android.view.animation.AnimationUtils.loadInterpolator(r6, r8)
            r5.setInterpolator(r8)
        L_0x01d1:
            r2.recycle()
            if (r5 == 0) goto L_0x01e0
            if (r4 != 0) goto L_0x01dd
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x01dd:
            r4.add(r5)
        L_0x01e0:
            r12.next()
            goto L_0x01e8
        L_0x01e4:
            r6 = r26
            r22 = r13
        L_0x01e8:
            r5 = r27
            r6 = r28
            r8 = r20
            r13 = r22
            goto L_0x00ed
        L_0x01f2:
            r6 = r26
            r22 = r13
            if (r4 == 0) goto L_0x0311
            int r2 = r4.size()
            if (r2 <= 0) goto L_0x0311
            r13 = 0
            java.lang.Object r5 = r4.get(r13)
            android.animation.Keyframe r5 = (android.animation.Keyframe) r5
            int r8 = r2 + -1
            java.lang.Object r8 = r4.get(r8)
            android.animation.Keyframe r8 = (android.animation.Keyframe) r8
            float r13 = r8.getFraction()
            r19 = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Class r6 = java.lang.Float.TYPE
            r12 = 1065353216(0x3f800000, float:1.0)
            int r23 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r23 >= 0) goto L_0x0226
            r21 = 0
            int r13 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r13 >= 0) goto L_0x0229
            r8.setFraction(r12)
        L_0x0226:
            r23 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0250
        L_0x0229:
            int r13 = r4.size()
            r23 = 1065353216(0x3f800000, float:1.0)
            java.lang.Class r12 = r8.getType()
            if (r12 != r6) goto L_0x023a
            android.animation.Keyframe r8 = android.animation.Keyframe.ofFloat(r23)
            goto L_0x0249
        L_0x023a:
            java.lang.Class r8 = r8.getType()
            if (r8 != r2) goto L_0x0245
            android.animation.Keyframe r8 = android.animation.Keyframe.ofInt(r23)
            goto L_0x0249
        L_0x0245:
            android.animation.Keyframe r8 = android.animation.Keyframe.ofObject(r23)
        L_0x0249:
            r4.add(r13, r8)
            int r8 = r19 + 1
            r19 = r8
        L_0x0250:
            float r8 = r5.getFraction()
            r12 = 0
            int r13 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r13 == 0) goto L_0x0282
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x0261
            r5.setFraction(r12)
            goto L_0x0282
        L_0x0261:
            java.lang.Class r8 = r5.getType()
            if (r8 != r6) goto L_0x026d
            android.animation.Keyframe r2 = android.animation.Keyframe.ofFloat(r12)
        L_0x026b:
            r13 = 0
            goto L_0x027d
        L_0x026d:
            java.lang.Class r5 = r5.getType()
            if (r5 != r2) goto L_0x0278
            android.animation.Keyframe r2 = android.animation.Keyframe.ofInt(r12)
            goto L_0x026b
        L_0x0278:
            android.animation.Keyframe r2 = android.animation.Keyframe.ofObject(r12)
            goto L_0x026b
        L_0x027d:
            r4.add(r13, r2)
            int r19 = r19 + 1
        L_0x0282:
            r2 = r19
            android.animation.Keyframe[] r5 = new android.animation.Keyframe[r2]
            r4.toArray(r5)
            r13 = 0
        L_0x028a:
            if (r13 >= r2) goto L_0x0304
            r4 = r5[r13]
            float r6 = r4.getFraction()
            r12 = 0
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x029c
            if (r13 != 0) goto L_0x02a1
            r4.setFraction(r12)
        L_0x029c:
            r24 = r2
            r21 = 0
            goto L_0x02fd
        L_0x02a1:
            int r6 = r2 + -1
            if (r13 != r6) goto L_0x02ab
            r8 = 1065353216(0x3f800000, float:1.0)
            r4.setFraction(r8)
            goto L_0x029c
        L_0x02ab:
            r8 = 1065353216(0x3f800000, float:1.0)
            int r4 = r13 + 1
            r12 = r13
        L_0x02b0:
            if (r4 >= r6) goto L_0x02c7
            r19 = r5[r4]
            float r19 = r19.getFraction()
            r21 = 0
            int r19 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r19 < 0) goto L_0x02bf
            goto L_0x02c9
        L_0x02bf:
            int r12 = r4 + 1
            r25 = r12
            r12 = r4
            r4 = r25
            goto L_0x02b0
        L_0x02c7:
            r21 = 0
        L_0x02c9:
            int r4 = r12 + 1
            r4 = r5[r4]
            float r4 = r4.getFraction()
            int r6 = r13 + -1
            r6 = r5[r6]
            float r6 = r6.getFraction()
            float r4 = r4 - r6
            int r6 = r12 - r13
            int r6 = r6 + 2
            float r6 = (float) r6
            float r4 = r4 / r6
            r6 = r13
        L_0x02e1:
            if (r6 > r12) goto L_0x02fb
            r8 = r5[r6]
            int r19 = r6 + -1
            r19 = r5[r19]
            float r19 = r19.getFraction()
            r24 = r2
            float r2 = r19 + r4
            r8.setFraction(r2)
            int r6 = r6 + 1
            r2 = r24
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02e1
        L_0x02fb:
            r24 = r2
        L_0x02fd:
            int r13 = r13 + 1
            r2 = r24
            r23 = 1065353216(0x3f800000, float:1.0)
            goto L_0x028a
        L_0x0304:
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofKeyframe(r11, r5)
            r13 = 3
            if (r1 != r13) goto L_0x0313
            g0.g r1 = g0.g.f2810a
            r2.setEvaluator(r1)
            goto L_0x0313
        L_0x0311:
            r13 = 3
            r2 = 0
        L_0x0313:
            r1 = 0
            r6 = 1
            if (r2 != 0) goto L_0x031b
            android.animation.PropertyValuesHolder r2 = b(r9, r3, r1, r6, r11)
        L_0x031b:
            if (r2 == 0) goto L_0x0327
            if (r15 != 0) goto L_0x0324
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x0324:
            r15.add(r2)
        L_0x0327:
            r9.recycle()
            goto L_0x0336
        L_0x032b:
            r18 = r1
            r20 = r8
            r22 = r13
            r1 = 0
            r6 = 1
            r13 = 3
            r17 = 2
        L_0x0336:
            r29.next()
            r5 = r27
            r6 = r28
            r12 = r29
            r1 = r18
            r8 = r20
            r13 = r22
            r2 = 3
            r3 = 1
            r4 = 2
            r11 = 0
            goto L_0x00af
        L_0x034b:
            r20 = r8
            r1 = 0
            r6 = 1
            if (r15 == 0) goto L_0x0365
            int r2 = r15.size()
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[r2]
            r11 = 0
        L_0x0358:
            if (r11 >= r2) goto L_0x0366
            java.lang.Object r1 = r15.get(r11)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r3[r11] = r1
            int r11 = r11 + 1
            goto L_0x0358
        L_0x0365:
            r3 = 0
        L_0x0366:
            if (r3 == 0) goto L_0x0372
            boolean r1 = r0 instanceof android.animation.ValueAnimator
            if (r1 == 0) goto L_0x0372
            r1 = r0
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            r1.setValues(r3)
        L_0x0372:
            r11 = 1
        L_0x0373:
            if (r7 == 0) goto L_0x0381
            if (r11 != 0) goto L_0x0381
            if (r10 != 0) goto L_0x037e
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x037e:
            r10.add(r0)
        L_0x0381:
            r8 = r20
            goto L_0x0008
        L_0x0385:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown animator name: "
            r1.<init>(r2)
            java.lang.String r2 = r29.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x039d:
            if (r7 == 0) goto L_0x03c5
            if (r10 == 0) goto L_0x03c5
            int r2 = r10.size()
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            int r3 = r10.size()
            r11 = 0
        L_0x03ac:
            if (r1 >= r3) goto L_0x03bc
            java.lang.Object r4 = r10.get(r1)
            int r1 = r1 + 1
            android.animation.Animator r4 = (android.animation.Animator) r4
            int r5 = r11 + 1
            r2[r11] = r4
            r11 = r5
            goto L_0x03ac
        L_0x03bc:
            if (r32 != 0) goto L_0x03c2
            r7.playTogether(r2)
            return r0
        L_0x03c2:
            r7.playSequentially(r2)
        L_0x03c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C0165a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r11v26, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder b(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            r0 = 2
            android.util.TypedValue r1 = r11.peekValue(r13)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000b
            r4 = 1
            goto L_0x000c
        L_0x000b:
            r4 = 0
        L_0x000c:
            if (r4 == 0) goto L_0x0011
            int r1 = r1.type
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            android.util.TypedValue r5 = r11.peekValue(r14)
            if (r5 == 0) goto L_0x001a
            r6 = 1
            goto L_0x001b
        L_0x001a:
            r6 = 0
        L_0x001b:
            if (r6 == 0) goto L_0x0020
            int r5 = r5.type
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            r7 = 4
            r8 = 3
            if (r12 != r7) goto L_0x0038
            if (r4 == 0) goto L_0x002d
            boolean r12 = c(r1)
            if (r12 != 0) goto L_0x0035
        L_0x002d:
            if (r6 == 0) goto L_0x0037
            boolean r12 = c(r5)
            if (r12 == 0) goto L_0x0037
        L_0x0035:
            r12 = 3
            goto L_0x0038
        L_0x0037:
            r12 = 0
        L_0x0038:
            if (r12 != 0) goto L_0x003c
            r7 = 1
            goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            r9 = 0
            if (r12 != r0) goto L_0x00a4
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            A.h[] r13 = A.i.z(r12)
            A.h[] r14 = A.i.z(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x00a3
        L_0x0054:
            if (r13 == 0) goto L_0x0093
            g0.f r1 = new g0.f
            r1.<init>()
            if (r14 == 0) goto L_0x008a
            boolean r4 = A.i.h(r13, r14)
            if (r4 == 0) goto L_0x006e
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r3] = r13
            r11[r2] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r11)
            return r11
        L_0x006e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = " Can't morph from "
            r14.<init>(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008a:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r3] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r11)
            return r11
        L_0x0093:
            if (r14 == 0) goto L_0x00a3
            g0.f r11 = new g0.f
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r3] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            return r11
        L_0x00a3:
            return r9
        L_0x00a4:
            if (r12 != r8) goto L_0x00a9
            g0.g r12 = g0.g.f2810a
            goto L_0x00aa
        L_0x00a9:
            r12 = r9
        L_0x00aa:
            r8 = 5
            r10 = 0
            if (r7 == 0) goto L_0x00f2
            if (r4 == 0) goto L_0x00de
            if (r1 != r8) goto L_0x00b7
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00bb
        L_0x00b7:
            float r13 = r11.getFloat(r13, r10)
        L_0x00bb:
            if (r6 == 0) goto L_0x00d5
            if (r5 != r8) goto L_0x00c4
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00c8
        L_0x00c4:
            float r11 = r11.getFloat(r14, r10)
        L_0x00c8:
            float[] r14 = new float[r0]
            r14[r3] = r13
            r14[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
        L_0x00d2:
            r9 = r11
            goto L_0x0157
        L_0x00d5:
            float[] r11 = new float[r2]
            r11[r3] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x00d2
        L_0x00de:
            if (r5 != r8) goto L_0x00e5
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00e9
        L_0x00e5:
            float r11 = r11.getFloat(r14, r10)
        L_0x00e9:
            float[] r13 = new float[r2]
            r13[r3] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L_0x00d2
        L_0x00f2:
            if (r4 == 0) goto L_0x0136
            if (r1 != r8) goto L_0x00fc
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x010b
        L_0x00fc:
            boolean r0 = c(r1)
            if (r0 == 0) goto L_0x0107
            int r13 = r11.getColor(r13, r3)
            goto L_0x010b
        L_0x0107:
            int r13 = r11.getInt(r13, r3)
        L_0x010b:
            if (r6 == 0) goto L_0x012d
            if (r5 != r8) goto L_0x0115
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0124
        L_0x0115:
            boolean r0 = c(r5)
            if (r0 == 0) goto L_0x0120
            int r11 = r11.getColor(r14, r3)
            goto L_0x0124
        L_0x0120:
            int r11 = r11.getInt(r14, r3)
        L_0x0124:
            int[] r11 = new int[]{r13, r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x0157
        L_0x012d:
            int[] r11 = new int[]{r13}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x0157
        L_0x0136:
            if (r6 == 0) goto L_0x0157
            if (r5 != r8) goto L_0x0140
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x014f
        L_0x0140:
            boolean r13 = c(r5)
            if (r13 == 0) goto L_0x014b
            int r11 = r11.getColor(r14, r3)
            goto L_0x014f
        L_0x014b:
            int r11 = r11.getInt(r14, r3)
        L_0x014f:
            int[] r11 = new int[]{r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
        L_0x0157:
            if (r9 == 0) goto L_0x015e
            if (r12 == 0) goto L_0x015e
            r9.setEvaluator(r12)
        L_0x015e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C0165a.b(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    public static boolean c(int i2) {
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int i8 = 0;
        TypedArray g2 = C0503b.g(resources2, theme2, attributeSet2, f2795g);
        TypedArray g3 = C0503b.g(resources2, theme2, attributeSet2, f2799k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        int i9 = 300;
        if (C0503b.d(xmlResourceParser2, "duration")) {
            i9 = g2.getInt(1, 300);
        }
        long j2 = (long) i9;
        if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i2 = 0;
        } else {
            i2 = g2.getInt(2, 0);
        }
        long j3 = (long) i2;
        if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            i3 = 4;
        } else {
            i3 = g2.getInt(7, 4);
        }
        if (!(xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") == null || xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") == null)) {
            if (i3 == 4) {
                TypedValue peekValue = g2.peekValue(5);
                if (peekValue != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    i6 = peekValue.type;
                } else {
                    i6 = 0;
                }
                TypedValue peekValue2 = g2.peekValue(6);
                if (peekValue2 != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    i7 = peekValue2.type;
                } else {
                    i7 = 0;
                }
                if ((!z4 || !c(i6)) && (!z5 || !c(i7))) {
                    i3 = 0;
                } else {
                    i3 = 3;
                }
            }
            PropertyValuesHolder b2 = b(g2, i3, 5, 6, "");
            if (b2 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{b2});
            }
        }
        valueAnimator.setDuration(j2);
        valueAnimator.setStartDelay(j3);
        if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null) {
            i4 = g2.getInt(3, 0);
        } else {
            i4 = 0;
        }
        valueAnimator.setRepeatCount(i4);
        if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null) {
            i5 = g2.getInt(4, 1);
        } else {
            i5 = 1;
        }
        valueAnimator.setRepeatMode(i5);
        if (g3 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String c2 = C0503b.c(g3, xmlResourceParser2, "pathData", 1);
            if (c2 != null) {
                String c3 = C0503b.c(g3, xmlResourceParser2, "propertyXName", 2);
                String c4 = C0503b.c(g3, xmlResourceParser2, "propertyYName", 3);
                if (i3 != 2) {
                }
                if (c3 == null && c4 == null) {
                    throw new InflateException(g3.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path A2 = i.A(c2);
                PathMeasure pathMeasure = new PathMeasure(A2, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f2 = 0.0f;
                do {
                    f2 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f2));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(A2, false);
                int min = Math.min(100, ((int) (f2 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                valueAnimator2 = valueAnimator;
                float f3 = f2 / ((float) (min - 1));
                float f4 = 0.0f;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    propertyValuesHolder = null;
                    if (i10 >= min) {
                        break;
                    }
                    int i12 = i10;
                    pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i11)).floatValue(), fArr3, (float[]) null);
                    fArr[i12] = fArr3[0];
                    fArr2[i12] = fArr3[1];
                    int i13 = i11 + 1;
                    f4 += f3;
                    if (i13 < arrayList.size() && f4 > ((Float) arrayList.get(i13)).floatValue()) {
                        pathMeasure2.nextContour();
                        i11 = i13;
                    }
                    i10 = i12 + 1;
                }
                if (c3 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(c3, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (c4 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(c4, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                } else if (propertyValuesHolder == null) {
                    objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder2});
                } else {
                    objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder2, propertyValuesHolder});
                }
                i8 = 0;
            } else {
                valueAnimator2 = valueAnimator;
                i8 = 0;
                objectAnimator2.setPropertyName(C0503b.c(g3, xmlResourceParser2, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
        }
        if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            i8 = g2.getResourceId(i8, i8);
        }
        if (i8 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i8));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        g2.recycle();
        if (g3 != null) {
            g3.recycle();
        }
        return valueAnimator3;
    }
}
