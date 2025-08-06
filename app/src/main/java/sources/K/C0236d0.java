package k;

import N.b;
import N.c;
import N.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import d.a;
import d1.n;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: k.d0  reason: case insensitive filesystem */
public final class C0236d0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f3446a;
    public n b;

    /* renamed from: c  reason: collision with root package name */
    public n f3447c;

    /* renamed from: d  reason: collision with root package name */
    public n f3448d;

    /* renamed from: e  reason: collision with root package name */
    public n f3449e;
    public n f;

    /* renamed from: g  reason: collision with root package name */
    public n f3450g;

    /* renamed from: h  reason: collision with root package name */
    public n f3451h;

    /* renamed from: i  reason: collision with root package name */
    public final C0259o0 f3452i;

    /* renamed from: j  reason: collision with root package name */
    public int f3453j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f3454k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f3455l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3456m;

    public C0236d0(TextView textView) {
        this.f3446a = textView;
        this.f3452i = new C0259o0(textView);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [d1.n, java.lang.Object] */
    public static n c(Context context, C0267t tVar, int i2) {
        ColorStateList i3;
        synchronized (tVar) {
            i3 = tVar.f3565a.i(context, i2);
        }
        if (i3 == null) {
            return null;
        }
        ? obj = new Object();
        obj.b = true;
        obj.f2338c = i3;
        return obj;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i2;
        int i3;
        CharSequence charSequence;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i4 >= 30) {
                b.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i4 >= 30) {
                b.a(editorInfo, text);
                return;
            }
            int i5 = editorInfo.initialSelStart;
            int i6 = editorInfo.initialSelEnd;
            if (i5 > i6) {
                i2 = i6;
            } else {
                i2 = i5;
            }
            if (i5 <= i6) {
                i5 = i6;
            }
            int length = text.length();
            if (i2 < 0 || i5 > length) {
                c.a(editorInfo, (CharSequence) null, 0, 0);
                return;
            }
            int i7 = editorInfo.inputType & 4095;
            if (i7 == 129 || i7 == 225 || i7 == 18) {
                c.a(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                c.a(editorInfo, text, i2, i5);
            } else {
                int i8 = i5 - i2;
                if (i8 > 1024) {
                    i3 = 0;
                } else {
                    i3 = i8;
                }
                int i9 = 2048 - i3;
                int min = Math.min(text.length() - i5, i9 - Math.min(i2, (int) (((double) i9) * 0.8d)));
                int min2 = Math.min(i2, i9 - min);
                int i10 = i2 - min2;
                if (Character.isLowSurrogate(text.charAt(i10))) {
                    i10++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i5 + min) - 1))) {
                    min--;
                }
                int i11 = min2 + i3;
                int i12 = i11 + min;
                if (i3 != i8) {
                    charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i10, i10 + min2), text.subSequence(i5, min + i5)});
                } else {
                    charSequence = text.subSequence(i10, i12 + i10);
                }
                c.a(editorInfo, charSequence, min2, i11);
            }
        }
    }

    public final void a(Drawable drawable, n nVar) {
        if (drawable != null && nVar != null) {
            C0267t.e(drawable, nVar, this.f3446a.getDrawableState());
        }
    }

    public final void b() {
        n nVar = this.b;
        TextView textView = this.f3446a;
        if (!(nVar == null && this.f3447c == null && this.f3448d == null && this.f3449e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.f3447c);
            a(compoundDrawables[2], this.f3448d);
            a(compoundDrawables[3], this.f3449e);
        }
        if (this.f != null || this.f3450g != null) {
            Drawable[] a2 = Y.a(textView);
            a(a2[0], this.f);
            a(a2[2], this.f3450g);
        }
    }

    public final ColorStateList d() {
        n nVar = this.f3451h;
        if (nVar != null) {
            return (ColorStateList) nVar.f2338c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        n nVar = this.f3451h;
        if (nVar != null) {
            return (PorterDuff.Mode) nVar.f2339d;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.util.AttributeSet r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            r4 = r30
            r6 = r31
            android.widget.TextView r1 = r0.f3446a
            android.content.Context r7 = r1.getContext()
            k.t r8 = k.C0267t.a()
            int[] r3 = d.a.f2198h
            N.g r9 = N.g.E(r7, r4, r3, r6)
            android.content.Context r2 = r1.getContext()
            java.lang.Object r5 = r9.f606c
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            I.O.o(r1, r2, r3, r4, r5, r6)
            r10 = r1
            java.lang.Object r1 = r9.f606c
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r11 = 0
            r12 = -1
            int r2 = r1.getResourceId(r11, r12)
            r13 = 3
            boolean r3 = r1.hasValue(r13)
            if (r3 == 0) goto L_0x003d
            int r3 = r1.getResourceId(r13, r11)
            d1.n r3 = c(r7, r8, r3)
            r0.b = r3
        L_0x003d:
            r14 = 1
            boolean r3 = r1.hasValue(r14)
            if (r3 == 0) goto L_0x004e
            int r3 = r1.getResourceId(r14, r11)
            d1.n r3 = c(r7, r8, r3)
            r0.f3447c = r3
        L_0x004e:
            r15 = 4
            boolean r3 = r1.hasValue(r15)
            if (r3 == 0) goto L_0x005f
            int r3 = r1.getResourceId(r15, r11)
            d1.n r3 = c(r7, r8, r3)
            r0.f3448d = r3
        L_0x005f:
            r3 = 2
            boolean r5 = r1.hasValue(r3)
            if (r5 == 0) goto L_0x0070
            int r5 = r1.getResourceId(r3, r11)
            d1.n r5 = c(r7, r8, r5)
            r0.f3449e = r5
        L_0x0070:
            int r5 = android.os.Build.VERSION.SDK_INT
            r14 = 5
            boolean r17 = r1.hasValue(r14)
            if (r17 == 0) goto L_0x0083
            int r3 = r1.getResourceId(r14, r11)
            d1.n r3 = c(r7, r8, r3)
            r0.f = r3
        L_0x0083:
            r3 = 6
            boolean r18 = r1.hasValue(r3)
            if (r18 == 0) goto L_0x0094
            int r1 = r1.getResourceId(r3, r11)
            d1.n r1 = c(r7, r8, r1)
            r0.f3450g = r1
        L_0x0094:
            r9.F()
            android.text.method.TransformationMethod r1 = r10.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            int[] r9 = d.a.f2213w
            r14 = 23
            r3 = 14
            r15 = 15
            if (r2 == r12) goto L_0x011e
            N.g r12 = new N.g
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r2, r9)
            r12.<init>((android.content.Context) r7, (android.content.res.TypedArray) r2)
            if (r1 != 0) goto L_0x00c1
            boolean r22 = r2.hasValue(r3)
            if (r22 == 0) goto L_0x00c1
            boolean r22 = r2.getBoolean(r3, r11)
            r23 = r22
            r22 = 1
            goto L_0x00c5
        L_0x00c1:
            r22 = 0
            r23 = 0
        L_0x00c5:
            r0.n(r7, r12)
            if (r5 >= r14) goto L_0x00f6
            boolean r24 = r2.hasValue(r13)
            if (r24 == 0) goto L_0x00d6
            android.content.res.ColorStateList r24 = r12.o(r13)
        L_0x00d4:
            r13 = 4
            goto L_0x00d9
        L_0x00d6:
            r24 = 0
            goto L_0x00d4
        L_0x00d9:
            boolean r20 = r2.hasValue(r13)
            if (r20 == 0) goto L_0x00e5
            android.content.res.ColorStateList r26 = r12.o(r13)
        L_0x00e3:
            r13 = 5
            goto L_0x00e8
        L_0x00e5:
            r26 = 0
            goto L_0x00e3
        L_0x00e8:
            boolean r18 = r2.hasValue(r13)
            if (r18 == 0) goto L_0x00f3
            android.content.res.ColorStateList r27 = r12.o(r13)
            goto L_0x00fb
        L_0x00f3:
            r27 = 0
            goto L_0x00fb
        L_0x00f6:
            r24 = 0
            r26 = 0
            goto L_0x00f3
        L_0x00fb:
            boolean r13 = r2.hasValue(r15)
            if (r13 == 0) goto L_0x0108
            java.lang.String r13 = r2.getString(r15)
        L_0x0105:
            r15 = 26
            goto L_0x010a
        L_0x0108:
            r13 = 0
            goto L_0x0105
        L_0x010a:
            if (r5 < r15) goto L_0x0119
            r15 = 13
            boolean r21 = r2.hasValue(r15)
            if (r21 == 0) goto L_0x0119
            java.lang.String r2 = r2.getString(r15)
            goto L_0x011a
        L_0x0119:
            r2 = 0
        L_0x011a:
            r12.F()
            goto L_0x012a
        L_0x011e:
            r2 = 0
            r13 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
        L_0x012a:
            N.g r12 = new N.g
            android.content.res.TypedArray r9 = r7.obtainStyledAttributes(r4, r9, r6, r11)
            r12.<init>((android.content.Context) r7, (android.content.res.TypedArray) r9)
            if (r1 != 0) goto L_0x0141
            boolean r15 = r9.hasValue(r3)
            if (r15 == 0) goto L_0x0141
            boolean r23 = r9.getBoolean(r3, r11)
            r22 = 1
        L_0x0141:
            r3 = r23
            if (r5 >= r14) goto L_0x0166
            r14 = 3
            boolean r15 = r9.hasValue(r14)
            if (r15 == 0) goto L_0x0150
            android.content.res.ColorStateList r24 = r12.o(r14)
        L_0x0150:
            r14 = 4
            boolean r15 = r9.hasValue(r14)
            if (r15 == 0) goto L_0x015b
            android.content.res.ColorStateList r26 = r12.o(r14)
        L_0x015b:
            r14 = 5
            boolean r15 = r9.hasValue(r14)
            if (r15 == 0) goto L_0x0166
            android.content.res.ColorStateList r27 = r12.o(r14)
        L_0x0166:
            r14 = r24
            r15 = r26
            r28 = r27
            r11 = 15
            boolean r24 = r9.hasValue(r11)
            if (r24 == 0) goto L_0x0178
            java.lang.String r13 = r9.getString(r11)
        L_0x0178:
            r11 = 26
            if (r5 < r11) goto L_0x0188
            r11 = 13
            boolean r19 = r9.hasValue(r11)
            if (r19 == 0) goto L_0x0188
            java.lang.String r2 = r9.getString(r11)
        L_0x0188:
            r11 = 28
            if (r5 < r11) goto L_0x01a1
            r11 = 0
            boolean r19 = r9.hasValue(r11)
            if (r19 == 0) goto L_0x01a1
            r19 = r1
            r1 = -1
            int r9 = r9.getDimensionPixelSize(r11, r1)
            if (r9 != 0) goto L_0x01a3
            r1 = 0
            r10.setTextSize(r11, r1)
            goto L_0x01a3
        L_0x01a1:
            r19 = r1
        L_0x01a3:
            r0.n(r7, r12)
            r12.F()
            if (r14 == 0) goto L_0x01ae
            r10.setTextColor(r14)
        L_0x01ae:
            if (r15 == 0) goto L_0x01b3
            r10.setHintTextColor(r15)
        L_0x01b3:
            r1 = r28
            if (r1 == 0) goto L_0x01ba
            r10.setLinkTextColor(r1)
        L_0x01ba:
            if (r19 != 0) goto L_0x01c1
            if (r22 == 0) goto L_0x01c1
            r10.setAllCaps(r3)
        L_0x01c1:
            android.graphics.Typeface r1 = r0.f3455l
            if (r1 == 0) goto L_0x01d3
            int r3 = r0.f3454k
            r9 = -1
            if (r3 != r9) goto L_0x01d0
            int r3 = r0.f3453j
            r10.setTypeface(r1, r3)
            goto L_0x01d3
        L_0x01d0:
            r10.setTypeface(r1)
        L_0x01d3:
            if (r2 == 0) goto L_0x01d8
            k.C0230b0.d(r10, r2)
        L_0x01d8:
            r9 = 24
            if (r13 == 0) goto L_0x01e5
            if (r5 < r9) goto L_0x01e7
            android.os.LocaleList r1 = k.C0227a0.a(r13)
            k.C0227a0.b(r10, r1)
        L_0x01e5:
            r11 = 0
            goto L_0x01f7
        L_0x01e7:
            java.lang.String r1 = ","
            java.lang.String[] r1 = r13.split(r1)
            r11 = 0
            r1 = r1[r11]
            java.util.Locale r1 = k.Z.a(r1)
            k.Y.c(r10, r1)
        L_0x01f7:
            int[] r3 = d.a.f2199i
            k.o0 r12 = r0.f3452i
            android.content.Context r13 = r12.f3543j
            android.content.res.TypedArray r5 = r13.obtainStyledAttributes(r4, r3, r6, r11)
            android.widget.TextView r1 = r12.f3542i
            android.content.Context r2 = r1.getContext()
            r14 = 2
            r15 = 6
            I.O.o(r1, r2, r3, r4, r5, r6)
            r1 = 5
            boolean r2 = r5.hasValue(r1)
            if (r2 == 0) goto L_0x0219
            int r1 = r5.getInt(r1, r11)
            r12.f3536a = r1
        L_0x0219:
            r1 = 4
            boolean r2 = r5.hasValue(r1)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L_0x0227
            float r1 = r5.getDimension(r1, r6)
            goto L_0x0229
        L_0x0227:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0229:
            boolean r2 = r5.hasValue(r14)
            if (r2 == 0) goto L_0x0235
            float r2 = r5.getDimension(r14, r6)
        L_0x0233:
            r11 = 1
            goto L_0x0238
        L_0x0235:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0233
        L_0x0238:
            boolean r16 = r5.hasValue(r11)
            if (r16 == 0) goto L_0x0244
            float r17 = r5.getDimension(r11, r6)
        L_0x0242:
            r11 = 3
            goto L_0x0247
        L_0x0244:
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0242
        L_0x0247:
            boolean r18 = r5.hasValue(r11)
            r31 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r18 == 0) goto L_0x0280
            r6 = 0
            int r9 = r5.getResourceId(r11, r6)
            if (r9 <= 0) goto L_0x0280
            android.content.res.Resources r6 = r5.getResources()
            android.content.res.TypedArray r6 = r6.obtainTypedArray(r9)
            int r9 = r6.length()
            int[] r11 = new int[r9]
            if (r9 <= 0) goto L_0x027d
            r15 = 0
        L_0x0267:
            if (r15 >= r9) goto L_0x0274
            r14 = -1
            int r20 = r6.getDimensionPixelSize(r15, r14)
            r11[r15] = r20
            int r15 = r15 + 1
            r14 = 2
            goto L_0x0267
        L_0x0274:
            int[] r9 = k.C0259o0.b(r11)
            r12.f = r9
            r12.i()
        L_0x027d:
            r6.recycle()
        L_0x0280:
            r5.recycle()
            boolean r5 = r12.j()
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x02c2
            int r5 = r12.f3536a
            r11 = 1
            if (r5 != r11) goto L_0x02c5
            boolean r5 = r12.f3540g
            if (r5 != 0) goto L_0x02be
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r9 = (r2 > r31 ? 1 : (r2 == r31 ? 0 : -1))
            if (r9 != 0) goto L_0x02a8
            r2 = 1094713344(0x41400000, float:12.0)
            r14 = 2
            float r2 = android.util.TypedValue.applyDimension(r14, r2, r5)
            goto L_0x02a9
        L_0x02a8:
            r14 = 2
        L_0x02a9:
            int r9 = (r17 > r31 ? 1 : (r17 == r31 ? 0 : -1))
            if (r9 != 0) goto L_0x02b3
            r9 = 1121976320(0x42e00000, float:112.0)
            float r17 = android.util.TypedValue.applyDimension(r14, r9, r5)
        L_0x02b3:
            r5 = r17
            int r9 = (r1 > r31 ? 1 : (r1 == r31 ? 0 : -1))
            if (r9 != 0) goto L_0x02bb
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x02bb:
            r12.k(r2, r5, r1)
        L_0x02be:
            r12.h()
            goto L_0x02c5
        L_0x02c2:
            r11 = 0
            r12.f3536a = r11
        L_0x02c5:
            boolean r1 = k.D1.b
            if (r1 == 0) goto L_0x02f6
            int r1 = r12.f3536a
            if (r1 == 0) goto L_0x02f6
            int[] r1 = r12.f
            int r2 = r1.length
            if (r2 <= 0) goto L_0x02f6
            int r2 = k.C0230b0.a(r10)
            float r2 = (float) r2
            int r2 = (r2 > r31 ? 1 : (r2 == r31 ? 0 : -1))
            if (r2 == 0) goto L_0x02f2
            float r1 = r12.f3538d
            int r1 = java.lang.Math.round(r1)
            float r2 = r12.f3539e
            int r2 = java.lang.Math.round(r2)
            float r5 = r12.f3537c
            int r5 = java.lang.Math.round(r5)
            r11 = 0
            k.C0230b0.b(r10, r1, r2, r5, r11)
            goto L_0x02f6
        L_0x02f2:
            r11 = 0
            k.C0230b0.c(r10, r1, r11)
        L_0x02f6:
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r4, r3)
            r2 = 8
            r14 = -1
            int r2 = r1.getResourceId(r2, r14)
            if (r2 == r14) goto L_0x030a
            android.graphics.drawable.Drawable r2 = r8.b(r7, r2)
        L_0x0307:
            r15 = 13
            goto L_0x030c
        L_0x030a:
            r2 = 0
            goto L_0x0307
        L_0x030c:
            int r3 = r1.getResourceId(r15, r14)
            if (r3 == r14) goto L_0x0317
            android.graphics.drawable.Drawable r3 = r8.b(r7, r3)
            goto L_0x0318
        L_0x0317:
            r3 = 0
        L_0x0318:
            r4 = 9
            int r4 = r1.getResourceId(r4, r14)
            if (r4 == r14) goto L_0x0326
            android.graphics.drawable.Drawable r4 = r8.b(r7, r4)
        L_0x0324:
            r15 = 6
            goto L_0x0328
        L_0x0326:
            r4 = 0
            goto L_0x0324
        L_0x0328:
            int r5 = r1.getResourceId(r15, r14)
            if (r5 == r14) goto L_0x0333
            android.graphics.drawable.Drawable r5 = r8.b(r7, r5)
            goto L_0x0334
        L_0x0333:
            r5 = 0
        L_0x0334:
            r9 = 10
            int r9 = r1.getResourceId(r9, r14)
            if (r9 == r14) goto L_0x0341
            android.graphics.drawable.Drawable r9 = r8.b(r7, r9)
            goto L_0x0342
        L_0x0341:
            r9 = 0
        L_0x0342:
            r11 = 7
            int r11 = r1.getResourceId(r11, r14)
            if (r11 == r14) goto L_0x034e
            android.graphics.drawable.Drawable r8 = r8.b(r7, r11)
            goto L_0x034f
        L_0x034e:
            r8 = 0
        L_0x034f:
            if (r9 != 0) goto L_0x03a6
            if (r8 == 0) goto L_0x0354
            goto L_0x03a6
        L_0x0354:
            if (r2 != 0) goto L_0x035c
            if (r3 != 0) goto L_0x035c
            if (r4 != 0) goto L_0x035c
            if (r5 == 0) goto L_0x03c9
        L_0x035c:
            android.graphics.drawable.Drawable[] r8 = k.Y.a(r10)
            r23 = 0
            r9 = r8[r23]
            if (r9 != 0) goto L_0x038f
            r19 = 2
            r11 = r8[r19]
            if (r11 == 0) goto L_0x036d
            goto L_0x038f
        L_0x036d:
            android.graphics.drawable.Drawable[] r8 = r10.getCompoundDrawables()
            if (r2 == 0) goto L_0x0374
            goto L_0x0376
        L_0x0374:
            r2 = r8[r23]
        L_0x0376:
            if (r3 == 0) goto L_0x0379
            goto L_0x037d
        L_0x0379:
            r16 = 1
            r3 = r8[r16]
        L_0x037d:
            if (r4 == 0) goto L_0x0380
            goto L_0x0384
        L_0x0380:
            r19 = 2
            r4 = r8[r19]
        L_0x0384:
            if (r5 == 0) goto L_0x0387
            goto L_0x038b
        L_0x0387:
            r25 = 3
            r5 = r8[r25]
        L_0x038b:
            r10.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r4, r5)
            goto L_0x03c9
        L_0x038f:
            if (r3 == 0) goto L_0x0394
        L_0x0391:
            r19 = 2
            goto L_0x0399
        L_0x0394:
            r16 = 1
            r3 = r8[r16]
            goto L_0x0391
        L_0x0399:
            r2 = r8[r19]
            if (r5 == 0) goto L_0x039e
            goto L_0x03a2
        L_0x039e:
            r25 = 3
            r5 = r8[r25]
        L_0x03a2:
            k.Y.b(r10, r9, r3, r2, r5)
            goto L_0x03c9
        L_0x03a6:
            android.graphics.drawable.Drawable[] r2 = k.Y.a(r10)
            if (r9 == 0) goto L_0x03ad
            goto L_0x03b1
        L_0x03ad:
            r23 = 0
            r9 = r2[r23]
        L_0x03b1:
            if (r3 == 0) goto L_0x03b4
            goto L_0x03b8
        L_0x03b4:
            r16 = 1
            r3 = r2[r16]
        L_0x03b8:
            if (r8 == 0) goto L_0x03bb
            goto L_0x03bf
        L_0x03bb:
            r19 = 2
            r8 = r2[r19]
        L_0x03bf:
            if (r5 == 0) goto L_0x03c2
            goto L_0x03c6
        L_0x03c2:
            r25 = 3
            r5 = r2[r25]
        L_0x03c6:
            k.Y.b(r10, r9, r3, r8, r5)
        L_0x03c9:
            r2 = 11
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x03fd
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x03e5
            r11 = 0
            int r3 = r1.getResourceId(r2, r11)
            if (r3 == 0) goto L_0x03e5
            android.content.res.ColorStateList r3 = t0.C0486a.g(r7, r3)
            if (r3 == 0) goto L_0x03e5
            goto L_0x03e9
        L_0x03e5:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L_0x03e9:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto L_0x03f3
            O.n.f(r10, r3)
            goto L_0x03fd
        L_0x03f3:
            boolean r2 = r10 instanceof O.t
            if (r2 == 0) goto L_0x03fd
            r2 = r10
            O.t r2 = (O.t) r2
            r2.setSupportCompoundDrawablesTintList(r3)
        L_0x03fd:
            r2 = 12
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0423
            r14 = -1
            int r2 = r1.getInt(r2, r14)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = k.C0268t0.b(r2, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x0419
            O.n.g(r10, r2)
            goto L_0x0423
        L_0x0419:
            boolean r3 = r10 instanceof O.t
            if (r3 == 0) goto L_0x0423
            r3 = r10
            O.t r3 = (O.t) r3
            r3.setSupportCompoundDrawablesTintMode(r2)
        L_0x0423:
            r11 = 15
            r14 = -1
            int r2 = r1.getDimensionPixelSize(r11, r14)
            r3 = 18
            int r3 = r1.getDimensionPixelSize(r3, r14)
            r4 = 19
            int r4 = r1.getDimensionPixelSize(r4, r14)
            r1.recycle()
            if (r2 == r14) goto L_0x043e
            A.i.m0(r10, r2)
        L_0x043e:
            if (r3 == r14) goto L_0x0443
            A.i.o0(r10, r3)
        L_0x0443:
            if (r4 == r14) goto L_0x0458
            A.i.j(r4)
            android.text.TextPaint r1 = r10.getPaint()
            r3 = 0
            int r1 = r1.getFontMetricsInt(r3)
            if (r4 == r1) goto L_0x0458
            int r4 = r4 - r1
            float r1 = (float) r4
            r10.setLineSpacing(r1, r6)
        L_0x0458:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0236d0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i2) {
        String string;
        ColorStateList o2;
        ColorStateList o3;
        ColorStateList o4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, a.f2213w);
        g gVar = new g(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f3446a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            if (obtainStyledAttributes.hasValue(3) && (o4 = gVar.o(3)) != null) {
                textView.setTextColor(o4);
            }
            if (obtainStyledAttributes.hasValue(5) && (o3 = gVar.o(5)) != null) {
                textView.setLinkTextColor(o3);
            }
            if (obtainStyledAttributes.hasValue(4) && (o2 = gVar.o(4)) != null) {
                textView.setHintTextColor(o2);
            }
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, gVar);
        if (i3 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            C0230b0.d(textView, string);
        }
        gVar.F();
        Typeface typeface = this.f3455l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3453j);
        }
    }

    public final void i(int i2, int i3, int i4, int i5) {
        C0259o0 o0Var = this.f3452i;
        if (o0Var.j()) {
            DisplayMetrics displayMetrics = o0Var.f3543j.getResources().getDisplayMetrics();
            o0Var.k(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (o0Var.h()) {
                o0Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i2) {
        C0259o0 o0Var = this.f3452i;
        if (o0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = o0Var.f3543j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                o0Var.f = C0259o0.b(iArr2);
                if (!o0Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                o0Var.f3540g = false;
            }
            if (o0Var.h()) {
                o0Var.a();
            }
        }
    }

    public final void k(int i2) {
        C0259o0 o0Var = this.f3452i;
        if (!o0Var.j()) {
            return;
        }
        if (i2 == 0) {
            o0Var.f3536a = 0;
            o0Var.f3538d = -1.0f;
            o0Var.f3539e = -1.0f;
            o0Var.f3537c = -1.0f;
            o0Var.f = new int[0];
            o0Var.b = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = o0Var.f3543j.getResources().getDisplayMetrics();
            o0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (o0Var.h()) {
                o0Var.a();
            }
        } else {
            throw new IllegalArgumentException(A.g.f(i2, "Unknown auto-size text type: "));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [d1.n, java.lang.Object] */
    public final void l(ColorStateList colorStateList) {
        boolean z2;
        if (this.f3451h == null) {
            this.f3451h = new Object();
        }
        n nVar = this.f3451h;
        nVar.f2338c = colorStateList;
        if (colorStateList != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        nVar.b = z2;
        this.b = nVar;
        this.f3447c = nVar;
        this.f3448d = nVar;
        this.f3449e = nVar;
        this.f = nVar;
        this.f3450g = nVar;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [d1.n, java.lang.Object] */
    public final void m(PorterDuff.Mode mode) {
        boolean z2;
        if (this.f3451h == null) {
            this.f3451h = new Object();
        }
        n nVar = this.f3451h;
        nVar.f2339d = mode;
        if (mode != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        nVar.f2337a = z2;
        this.b = nVar;
        this.f3447c = nVar;
        this.f3448d = nVar;
        this.f3449e = nVar;
        this.f = nVar;
        this.f3450g = nVar;
    }

    public final void n(Context context, g gVar) {
        String string;
        boolean z2;
        boolean z3;
        int i2 = this.f3453j;
        TypedArray typedArray = (TypedArray) gVar.f606c;
        this.f3453j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f3454k = i4;
            if (i4 != -1) {
                this.f3453j &= 2;
            }
        }
        int i5 = 10;
        boolean z4 = false;
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.f3455l = null;
            if (typedArray.hasValue(12)) {
                i5 = 12;
            }
            int i6 = this.f3454k;
            int i7 = this.f3453j;
            if (!context.isRestricted()) {
                try {
                    Typeface s2 = gVar.s(i5, this.f3453j, new W(this, i6, i7, new WeakReference(this.f3446a)));
                    if (s2 != null) {
                        if (i3 < 28 || this.f3454k == -1) {
                            this.f3455l = s2;
                        } else {
                            Typeface create = Typeface.create(s2, 0);
                            int i8 = this.f3454k;
                            if ((this.f3453j & 2) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.f3455l = C0233c0.a(create, i8, z3);
                        }
                    }
                    if (this.f3455l == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f3456m = z2;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f3455l == null && (string = typedArray.getString(i5)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f3454k == -1) {
                    this.f3455l = Typeface.create(string, this.f3453j);
                    return;
                }
                Typeface create2 = Typeface.create(string, 0);
                int i9 = this.f3454k;
                if ((this.f3453j & 2) != 0) {
                    z4 = true;
                }
                this.f3455l = C0233c0.a(create2, i9, z4);
            }
        } else if (typedArray.hasValue(1)) {
            this.f3456m = false;
            int i10 = typedArray.getInt(1, 1);
            if (i10 == 1) {
                this.f3455l = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f3455l = Typeface.SERIF;
            } else if (i10 == 3) {
                this.f3455l = Typeface.MONOSPACE;
            }
        }
    }
}
