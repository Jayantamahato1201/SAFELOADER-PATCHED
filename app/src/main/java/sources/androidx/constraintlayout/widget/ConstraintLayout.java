package androidx.constraintlayout.widget;

import F.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import q.e;
import r.C0472d;
import r.C0473e;
import r.h;
import t.C0478c;
import t.C0479d;
import t.C0480e;
import t.C0481f;
import t.m;
import t.n;
import t.o;
import t.q;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f1071a = new SparseArray();
    public final ArrayList b = new ArrayList(4);

    /* renamed from: c  reason: collision with root package name */
    public final C0473e f1072c = new C0473e();

    /* renamed from: d  reason: collision with root package name */
    public int f1073d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1074e = 0;
    public int f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public int f1075g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1076h = true;

    /* renamed from: i  reason: collision with root package name */
    public int f1077i = 263;

    /* renamed from: j  reason: collision with root package name */
    public m f1078j = null;

    /* renamed from: k  reason: collision with root package name */
    public c f1079k = null;

    /* renamed from: l  reason: collision with root package name */
    public int f1080l = -1;

    /* renamed from: m  reason: collision with root package name */
    public HashMap f1081m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    public final SparseArray f1082n = new SparseArray();

    /* renamed from: o  reason: collision with root package name */
    public final C0481f f1083o = new C0481f(this);

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet, 0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, t.e] */
    public static C0480e a() {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f4579a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.f4582c = -1.0f;
        marginLayoutParams.f4584d = -1;
        marginLayoutParams.f4586e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.f4588g = -1;
        marginLayoutParams.f4590h = -1;
        marginLayoutParams.f4592i = -1;
        marginLayoutParams.f4594j = -1;
        marginLayoutParams.f4596k = -1;
        marginLayoutParams.f4598l = -1;
        marginLayoutParams.f4599m = -1;
        marginLayoutParams.f4600n = 0;
        marginLayoutParams.f4601o = 0.0f;
        marginLayoutParams.f4602p = -1;
        marginLayoutParams.f4603q = -1;
        marginLayoutParams.f4604r = -1;
        marginLayoutParams.f4605s = -1;
        marginLayoutParams.f4606t = -1;
        marginLayoutParams.f4607u = -1;
        marginLayoutParams.f4608v = -1;
        marginLayoutParams.f4609w = -1;
        marginLayoutParams.f4610x = -1;
        marginLayoutParams.f4611y = -1;
        marginLayoutParams.f4612z = 0.5f;
        marginLayoutParams.f4554A = 0.5f;
        marginLayoutParams.f4555B = null;
        marginLayoutParams.f4556C = 1;
        marginLayoutParams.D = -1.0f;
        marginLayoutParams.f4557E = -1.0f;
        marginLayoutParams.f4558F = 0;
        marginLayoutParams.f4559G = 0;
        marginLayoutParams.f4560H = 0;
        marginLayoutParams.f4561I = 0;
        marginLayoutParams.f4562J = 0;
        marginLayoutParams.f4563K = 0;
        marginLayoutParams.f4564L = 0;
        marginLayoutParams.f4565M = 0;
        marginLayoutParams.f4566N = 1.0f;
        marginLayoutParams.f4567O = 1.0f;
        marginLayoutParams.f4568P = -1;
        marginLayoutParams.f4569Q = -1;
        marginLayoutParams.f4570R = -1;
        marginLayoutParams.f4571S = false;
        marginLayoutParams.f4572T = false;
        marginLayoutParams.f4573U = null;
        marginLayoutParams.f4574V = true;
        marginLayoutParams.f4575W = true;
        marginLayoutParams.f4576X = false;
        marginLayoutParams.f4577Y = false;
        marginLayoutParams.f4578Z = false;
        marginLayoutParams.f4580a0 = -1;
        marginLayoutParams.f4581b0 = -1;
        marginLayoutParams.f4583c0 = -1;
        marginLayoutParams.f4585d0 = -1;
        marginLayoutParams.e0 = -1;
        marginLayoutParams.f4587f0 = -1;
        marginLayoutParams.f4589g0 = 0.5f;
        marginLayoutParams.f4597k0 = new C0472d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public final C0472d b(View view) {
        if (view == this) {
            return this.f1072c;
        }
        if (view == null) {
            return null;
        }
        return ((C0480e) view.getLayoutParams()).f4597k0;
    }

    public final void c(AttributeSet attributeSet, int i2) {
        C0473e eVar = this.f1072c;
        eVar.f4305U = this;
        C0481f fVar = this.f1083o;
        eVar.f4340g0 = fVar;
        eVar.f4339f0.f = fVar;
        this.f1071a.put(getId(), this);
        this.f1078j = null;
        boolean z2 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.b, i2, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.f1073d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1073d);
                } else if (index == 10) {
                    this.f1074e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1074e);
                } else if (index == 7) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 8) {
                    this.f1075g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1075g);
                } else if (index == 89) {
                    this.f1077i = obtainStyledAttributes.getInt(index, this.f1077i);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1079k = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        m mVar = new m();
                        this.f1078j = mVar;
                        mVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1078j = null;
                    }
                    this.f1080l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i4 = this.f1077i;
        eVar.f4348p0 = i4;
        if ((i4 & 256) == 256) {
            z2 = true;
        }
        e.f3817p = z2;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0480e;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(int r10) {
        /*
            r9 = this;
            F.c r0 = new F.c
            android.content.Context r1 = r9.getContext()
            r2 = 19
            r3 = 0
            r0.<init>((int) r2, (boolean) r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.b = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f194c = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            r3 = 0
        L_0x0027:
            r4 = 1
            if (r2 == r4) goto L_0x00cb
            if (r2 == 0) goto L_0x00bb
            r5 = 2
            if (r2 == r5) goto L_0x0031
            goto L_0x00be
        L_0x0031:
            java.lang.String r2 = r10.getName()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            int r6 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L_0x006d;
                case 80204913: goto L_0x0063;
                case 1382829617: goto L_0x0059;
                case 1657696882: goto L_0x004f;
                case 1901439077: goto L_0x003f;
                default: goto L_0x003e;
            }     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
        L_0x003e:
            goto L_0x0077
        L_0x003f:
            java.lang.String r6 = "Variant"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            if (r6 == 0) goto L_0x0077
            r6 = 3
            goto L_0x0078
        L_0x0049:
            r10 = move-exception
            goto L_0x00c4
        L_0x004c:
            r10 = move-exception
            goto L_0x00c8
        L_0x004f:
            java.lang.String r6 = "layoutDescription"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            if (r6 == 0) goto L_0x0077
            r6 = 0
            goto L_0x0078
        L_0x0059:
            java.lang.String r6 = "StateSet"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            if (r6 == 0) goto L_0x0077
            r6 = 1
            goto L_0x0078
        L_0x0063:
            java.lang.String r6 = "State"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            if (r6 == 0) goto L_0x0077
            r6 = 2
            goto L_0x0078
        L_0x006d:
            java.lang.String r6 = "ConstraintSet"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            if (r6 == 0) goto L_0x0077
            r6 = 4
            goto L_0x0078
        L_0x0077:
            r6 = -1
        L_0x0078:
            if (r6 == 0) goto L_0x00be
            if (r6 == r4) goto L_0x00be
            if (r6 == r5) goto L_0x00ac
            if (r6 == r8) goto L_0x009d
            if (r6 == r7) goto L_0x0099
            java.lang.String r4 = "ConstraintLayoutStates"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            java.lang.String r6 = "unknown tag "
            r5.append(r6)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            r5.append(r2)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            java.lang.String r2 = r5.toString()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            android.util.Log.v(r4, r2)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            goto L_0x00be
        L_0x0099:
            r0.G(r1, r10)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            goto L_0x00be
        L_0x009d:
            t.g r2 = new t.g     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            r2.<init>(r1, r10)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            if (r3 == 0) goto L_0x00be
            java.lang.Object r4 = r3.f3201c     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            r4.add(r2)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            goto L_0x00be
        L_0x00ac:
            j1.A r3 = new j1.A     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            r3.<init>((android.content.Context) r1, (android.content.res.XmlResourceParser) r10)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            java.lang.Object r2 = r0.b     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            int r4 = r3.f3200a     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            r2.put(r4, r3)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            goto L_0x00be
        L_0x00bb:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
        L_0x00be:
            int r2 = r10.next()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x0049 }
            goto L_0x0027
        L_0x00c4:
            r10.printStackTrace()
            goto L_0x00cb
        L_0x00c8:
            r10.printStackTrace()
        L_0x00cb:
            r9.f1079k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.d(int):void");
    }

    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((C0478c) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i5 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = (float) i4;
                        float f3 = (float) i5;
                        float f4 = (float) (i4 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        canvas2.drawLine(f2, f3, f4, f3, paint);
                        float f5 = f2;
                        float parseInt4 = (float) (i5 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f6 = f4;
                        canvas2.drawLine(f6, f3, f4, parseInt4, paint);
                        float f7 = f3;
                        float f8 = parseInt4;
                        float f9 = f5;
                        canvas2.drawLine(f6, f8, f9, parseInt4, paint);
                        float f10 = f6;
                        float f11 = f9;
                        float f12 = f7;
                        canvas2.drawLine(f11, f8, f9, f12, paint);
                        float f13 = f12;
                        float f14 = f8;
                        float f15 = f13;
                        paint.setColor(-16711936);
                        float f16 = f10;
                        canvas2.drawLine(f11, f15, f16, f14, paint);
                        canvas2.drawLine(f11, f14, f16, f15, paint);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0420 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0372 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d2 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(r.C0473e r27, int r28, int r29, int r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            int r3 = android.view.View.MeasureSpec.getMode(r29)
            int r4 = android.view.View.MeasureSpec.getSize(r29)
            int r5 = android.view.View.MeasureSpec.getMode(r30)
            int r6 = android.view.View.MeasureSpec.getSize(r30)
            int r7 = r0.getPaddingTop()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r0.getPaddingBottom()
            int r9 = java.lang.Math.max(r8, r9)
            int r10 = r7 + r9
            int r11 = r0.getPaddingWidth()
            t.f r12 = r0.f1083o
            r12.b = r7
            r12.f4614c = r9
            r12.f4615d = r11
            r12.f4616e = r10
            r9 = r29
            r12.f = r9
            r9 = r30
            r12.f4617g = r9
            int r9 = r0.getPaddingStart()
            int r9 = java.lang.Math.max(r8, r9)
            int r13 = r0.getPaddingEnd()
            int r13 = java.lang.Math.max(r8, r13)
            r14 = 1
            if (r9 > 0) goto L_0x005e
            if (r13 <= 0) goto L_0x0055
            goto L_0x005e
        L_0x0055:
            int r9 = r0.getPaddingLeft()
            int r9 = java.lang.Math.max(r8, r9)
            goto L_0x0075
        L_0x005e:
            android.content.Context r15 = r0.getContext()
            android.content.pm.ApplicationInfo r15 = r15.getApplicationInfo()
            int r15 = r15.flags
            r16 = 4194304(0x400000, float:5.877472E-39)
            r15 = r15 & r16
            if (r15 == 0) goto L_0x0075
            int r15 = r0.getLayoutDirection()
            if (r14 != r15) goto L_0x0075
            r9 = r13
        L_0x0075:
            int r4 = r4 - r11
            int r6 = r6 - r10
            int r10 = r12.f4616e
            int r11 = r12.f4615d
            int r12 = r0.getChildCount()
            r15 = 1073741824(0x40000000, float:2.0)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r13) goto L_0x00a5
            if (r3 == 0) goto L_0x0097
            if (r3 == r15) goto L_0x008c
        L_0x0089:
            r17 = 0
            goto L_0x00b1
        L_0x008c:
            int r14 = r0.f
            int r14 = r14 - r11
            int r14 = java.lang.Math.min(r14, r4)
            r17 = r14
            r14 = 1
            goto L_0x00b1
        L_0x0097:
            if (r12 != 0) goto L_0x00a3
            int r14 = r0.f1073d
            int r14 = java.lang.Math.max(r8, r14)
        L_0x009f:
            r17 = r14
        L_0x00a1:
            r14 = 2
            goto L_0x00b1
        L_0x00a3:
            r14 = 2
            goto L_0x0089
        L_0x00a5:
            if (r12 != 0) goto L_0x00ae
            int r14 = r0.f1073d
            int r14 = java.lang.Math.max(r8, r14)
            goto L_0x009f
        L_0x00ae:
            r17 = r4
            goto L_0x00a1
        L_0x00b1:
            if (r5 == r13) goto L_0x00d1
            if (r5 == 0) goto L_0x00c4
            if (r5 == r15) goto L_0x00ba
            r12 = 1
        L_0x00b8:
            r13 = 0
            goto L_0x00dc
        L_0x00ba:
            int r12 = r0.f1075g
            int r12 = r12 - r10
            int r12 = java.lang.Math.min(r12, r6)
            r13 = r12
            r12 = 1
            goto L_0x00dc
        L_0x00c4:
            if (r12 != 0) goto L_0x00cf
            int r12 = r0.f1074e
            int r12 = java.lang.Math.max(r8, r12)
        L_0x00cc:
            r13 = r12
        L_0x00cd:
            r12 = 2
            goto L_0x00dc
        L_0x00cf:
            r12 = 2
            goto L_0x00b8
        L_0x00d1:
            if (r12 != 0) goto L_0x00da
            int r12 = r0.f1074e
            int r12 = java.lang.Math.max(r8, r12)
            goto L_0x00cc
        L_0x00da:
            r13 = r6
            goto L_0x00cd
        L_0x00dc:
            int r15 = r1.l()
            s.e r8 = r1.f4339f0
            r19 = r10
            r10 = r17
            if (r10 != r15) goto L_0x00ee
            int r15 = r1.i()
            if (r13 == r15) goto L_0x00f0
        L_0x00ee:
            r15 = 1
            goto L_0x00f2
        L_0x00f0:
            r15 = 0
            goto L_0x00f5
        L_0x00f2:
            r8.f4451c = r15
            goto L_0x00f0
        L_0x00f5:
            r1.f4298N = r15
            r1.f4299O = r15
            r18 = 0
            int r15 = r0.f
            int r15 = r15 - r11
            r17 = r11
            int[] r11 = r1.f4332u
            r11[r18] = r15
            int r15 = r0.f1075g
            int r15 = r15 - r19
            r20 = 1
            r11[r20] = r15
            r15 = 0
            r1.f4301Q = r15
            r1.f4302R = r15
            r1.w(r14)
            r1.y(r10)
            r1.x(r12)
            r1.v(r13)
            int r10 = r0.f1073d
            int r10 = r10 - r17
            if (r10 >= 0) goto L_0x0126
            r1.f4301Q = r15
            goto L_0x0128
        L_0x0126:
            r1.f4301Q = r10
        L_0x0128:
            int r10 = r0.f1074e
            int r10 = r10 - r19
            if (r10 >= 0) goto L_0x0131
            r1.f4302R = r15
            goto L_0x0133
        L_0x0131:
            r1.f4302R = r10
        L_0x0133:
            r1.f4343j0 = r9
            r1.f4344k0 = r7
            N.g r7 = r1.e0
            r7.getClass()
            t.f r9 = r1.f4340g0
            java.util.ArrayList r10 = r1.f4338d0
            int r10 = r10.size()
            int r12 = r1.l()
            int r13 = r1.i()
            r14 = r2 & 128(0x80, float:1.794E-43)
            r15 = 128(0x80, float:1.794E-43)
            if (r14 != r15) goto L_0x0154
            r14 = 1
            goto L_0x0155
        L_0x0154:
            r14 = 0
        L_0x0155:
            if (r14 != 0) goto L_0x015f
            r15 = 64
            r2 = r2 & r15
            if (r2 != r15) goto L_0x015d
            goto L_0x015f
        L_0x015d:
            r2 = 0
            goto L_0x0160
        L_0x015f:
            r2 = 1
        L_0x0160:
            if (r2 == 0) goto L_0x01ca
            r15 = 0
        L_0x0163:
            if (r15 >= r10) goto L_0x01ca
            java.util.ArrayList r0 = r1.f4338d0
            java.lang.Object r0 = r0.get(r15)
            r.d r0 = (r.C0472d) r0
            r17 = r2
            int[] r2 = r0.f4315c0
            r19 = r2
            r18 = 0
            r2 = r19[r18]
            r20 = r10
            r10 = 3
            if (r2 != r10) goto L_0x0181
            r22 = 1
        L_0x017e:
            r21 = 1
            goto L_0x0184
        L_0x0181:
            r22 = 0
            goto L_0x017e
        L_0x0184:
            r2 = r19[r21]
            if (r2 != r10) goto L_0x018a
            r2 = 1
            goto L_0x018b
        L_0x018a:
            r2 = 0
        L_0x018b:
            if (r22 == 0) goto L_0x0198
            if (r2 == 0) goto L_0x0198
            float r2 = r0.f4296L
            r10 = 0
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0198
            r2 = 1
            goto L_0x0199
        L_0x0198:
            r2 = 0
        L_0x0199:
            boolean r10 = r0.q()
            if (r10 == 0) goto L_0x01a6
            if (r2 == 0) goto L_0x01a6
        L_0x01a1:
            r0 = 1073741824(0x40000000, float:2.0)
            r17 = 0
            goto L_0x01d0
        L_0x01a6:
            boolean r10 = r0.r()
            if (r10 == 0) goto L_0x01af
            if (r2 == 0) goto L_0x01af
            goto L_0x01a1
        L_0x01af:
            boolean r2 = r0 instanceof r.g
            if (r2 == 0) goto L_0x01b4
            goto L_0x01a1
        L_0x01b4:
            boolean r2 = r0.q()
            if (r2 != 0) goto L_0x01a1
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x01c1
            goto L_0x01a1
        L_0x01c1:
            int r15 = r15 + 1
            r0 = r26
            r2 = r17
            r10 = r20
            goto L_0x0163
        L_0x01ca:
            r17 = r2
            r20 = r10
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x01d0:
            if (r3 != r0) goto L_0x01d4
            if (r5 == r0) goto L_0x01d6
        L_0x01d4:
            if (r14 == 0) goto L_0x01d8
        L_0x01d6:
            r0 = 1
            goto L_0x01d9
        L_0x01d8:
            r0 = 0
        L_0x01d9:
            r0 = r17 & r0
            if (r0 == 0) goto L_0x0412
            r18 = 0
            r0 = r11[r18]
            int r0 = java.lang.Math.min(r0, r4)
            r15 = 1
            r4 = r11[r15]
            int r4 = java.lang.Math.min(r4, r6)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r3 != r6) goto L_0x01fd
            int r10 = r1.l()
            if (r10 == r0) goto L_0x01fd
            r1.y(r0)
            s.e r0 = r1.f4339f0
            r0.b = r15
        L_0x01fd:
            if (r5 != r6) goto L_0x020c
            int r0 = r1.i()
            if (r0 == r4) goto L_0x020c
            r1.v(r4)
            s.e r0 = r1.f4339f0
            r0.b = r15
        L_0x020c:
            if (r3 != r6) goto L_0x037f
            if (r5 != r6) goto L_0x037f
            boolean r0 = r8.b
            r.e r4 = r8.f4450a
            if (r0 != 0) goto L_0x021d
            boolean r0 = r8.f4451c
            if (r0 == 0) goto L_0x021b
            goto L_0x021d
        L_0x021b:
            r15 = 0
            goto L_0x024b
        L_0x021d:
            java.util.ArrayList r0 = r4.f4338d0
            int r6 = r0.size()
            r10 = 0
        L_0x0224:
            if (r10 >= r6) goto L_0x023c
            java.lang.Object r11 = r0.get(r10)
            int r10 = r10 + 1
            r.d r11 = (r.C0472d) r11
            r15 = 0
            r11.f4311a = r15
            s.j r2 = r11.f4316d
            r2.n()
            s.l r2 = r11.f4317e
            r2.m()
            goto L_0x0224
        L_0x023c:
            r15 = 0
            r4.f4311a = r15
            s.j r0 = r4.f4316d
            r0.n()
            s.l r0 = r4.f4317e
            r0.m()
            r8.f4451c = r15
        L_0x024b:
            r.e r0 = r8.f4452d
            r8.b(r0)
            r4.f4298N = r15
            r4.f4299O = r15
            int r0 = r4.h(r15)
            r15 = 1
            int r2 = r4.h(r15)
            boolean r6 = r8.b
            if (r6 == 0) goto L_0x0264
            r8.c()
        L_0x0264:
            int r6 = r4.m()
            int r10 = r4.n()
            s.j r11 = r4.f4316d
            s.f r15 = r11.f4476h
            r15.d(r6)
            s.l r15 = r4.f4317e
            r19 = r6
            s.f r6 = r15.f4476h
            r6.d(r10)
            r8.g()
            java.util.ArrayList r6 = r8.f4453e
            r21 = r10
            s.g r10 = r11.f4474e
            r22 = r9
            s.g r9 = r15.f4474e
            r23 = r12
            r12 = 2
            if (r0 == r12) goto L_0x0295
            if (r2 != r12) goto L_0x0291
            goto L_0x0295
        L_0x0291:
            r24 = r13
        L_0x0293:
            r13 = 1
            goto L_0x02e1
        L_0x0295:
            if (r14 == 0) goto L_0x02b0
            int r12 = r6.size()
            r24 = r13
            r13 = 0
        L_0x029e:
            if (r13 >= r12) goto L_0x02b2
            java.lang.Object r25 = r6.get(r13)
            int r13 = r13 + 1
            s.m r25 = (s.m) r25
            boolean r25 = r25.k()
            if (r25 != 0) goto L_0x029e
            r14 = 0
            goto L_0x02b2
        L_0x02b0:
            r24 = r13
        L_0x02b2:
            if (r14 == 0) goto L_0x02ca
            r12 = 2
            if (r0 != r12) goto L_0x02ca
            r13 = 1
            r4.w(r13)
            r13 = 0
            int r12 = r8.d(r4, r13)
            r4.y(r12)
            int r12 = r4.l()
            r10.d(r12)
        L_0x02ca:
            if (r14 == 0) goto L_0x0293
            r12 = 2
            if (r2 != r12) goto L_0x0293
            r13 = 1
            r4.x(r13)
            int r12 = r8.d(r4, r13)
            r4.v(r12)
            int r12 = r4.i()
            r9.d(r12)
        L_0x02e1:
            int[] r12 = r4.f4315c0
            r18 = 0
            r14 = r12[r18]
            if (r14 == r13) goto L_0x02ef
            r13 = 4
            if (r14 != r13) goto L_0x02ed
            goto L_0x02ef
        L_0x02ed:
            r8 = 0
            goto L_0x031e
        L_0x02ef:
            int r13 = r4.l()
            int r13 = r13 + r19
            s.f r11 = r11.f4477i
            r11.d(r13)
            int r13 = r13 - r19
            r10.d(r13)
            r8.g()
            r13 = 1
            r10 = r12[r13]
            if (r10 == r13) goto L_0x030a
            r13 = 4
            if (r10 != r13) goto L_0x031a
        L_0x030a:
            int r10 = r4.i()
            int r10 = r10 + r21
            s.f r11 = r15.f4477i
            r11.d(r10)
            int r10 = r10 - r21
            r9.d(r10)
        L_0x031a:
            r8.g()
            r8 = 1
        L_0x031e:
            int r9 = r6.size()
            r10 = 0
        L_0x0323:
            if (r10 >= r9) goto L_0x033a
            java.lang.Object r11 = r6.get(r10)
            int r10 = r10 + 1
            s.m r11 = (s.m) r11
            r.d r12 = r11.b
            if (r12 != r4) goto L_0x0336
            boolean r12 = r11.f4475g
            if (r12 != 0) goto L_0x0336
            goto L_0x0323
        L_0x0336:
            r11.e()
            goto L_0x0323
        L_0x033a:
            int r9 = r6.size()
            r10 = 0
        L_0x033f:
            if (r10 >= r9) goto L_0x0372
            java.lang.Object r11 = r6.get(r10)
            int r10 = r10 + 1
            s.m r11 = (s.m) r11
            if (r8 != 0) goto L_0x0350
            r.d r12 = r11.b
            if (r12 != r4) goto L_0x0350
            goto L_0x033f
        L_0x0350:
            s.f r12 = r11.f4476h
            boolean r12 = r12.f4463j
            if (r12 != 0) goto L_0x0358
        L_0x0356:
            r6 = 0
            goto L_0x0373
        L_0x0358:
            s.f r12 = r11.f4477i
            boolean r12 = r12.f4463j
            if (r12 != 0) goto L_0x0363
            boolean r12 = r11 instanceof s.h
            if (r12 != 0) goto L_0x0363
            goto L_0x0356
        L_0x0363:
            s.g r12 = r11.f4474e
            boolean r12 = r12.f4463j
            if (r12 != 0) goto L_0x033f
            boolean r12 = r11 instanceof s.c
            if (r12 != 0) goto L_0x033f
            boolean r11 = r11 instanceof s.h
            if (r11 != 0) goto L_0x033f
            goto L_0x0356
        L_0x0372:
            r6 = 1
        L_0x0373:
            r4.w(r0)
            r4.x(r2)
            r4 = r6
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = 2
            goto L_0x0402
        L_0x037f:
            r22 = r9
            r23 = r12
            r24 = r13
            boolean r0 = r8.b
            r.e r2 = r8.f4450a
            if (r0 == 0) goto L_0x03d3
            java.util.ArrayList r0 = r2.f4338d0
            int r4 = r0.size()
            r6 = 0
        L_0x0392:
            if (r6 >= r4) goto L_0x03b6
            java.lang.Object r9 = r0.get(r6)
            int r6 = r6 + 1
            r.d r9 = (r.C0472d) r9
            r15 = 0
            r9.f4311a = r15
            s.j r10 = r9.f4316d
            s.g r11 = r10.f4474e
            r11.f4463j = r15
            r10.f4475g = r15
            r10.n()
            s.l r9 = r9.f4317e
            s.g r10 = r9.f4474e
            r10.f4463j = r15
            r9.f4475g = r15
            r9.m()
            goto L_0x0392
        L_0x03b6:
            r15 = 0
            r2.f4311a = r15
            s.j r0 = r2.f4316d
            s.g r4 = r0.f4474e
            r4.f4463j = r15
            r0.f4475g = r15
            r0.n()
            s.l r0 = r2.f4317e
            s.g r4 = r0.f4474e
            r4.f4463j = r15
            r0.f4475g = r15
            r0.m()
            r8.c()
            goto L_0x03d4
        L_0x03d3:
            r15 = 0
        L_0x03d4:
            r.e r0 = r8.f4452d
            r8.b(r0)
            r2.f4298N = r15
            r2.f4299O = r15
            s.j r0 = r2.f4316d
            s.f r0 = r0.f4476h
            r0.d(r15)
            s.l r0 = r2.f4317e
            s.f r0 = r0.f4476h
            r0.d(r15)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 != r0) goto L_0x03f6
            boolean r2 = r1.D(r15, r14)
            r4 = r2
            r2 = 1
            goto L_0x03f8
        L_0x03f6:
            r2 = 0
            r4 = 1
        L_0x03f8:
            if (r5 != r0) goto L_0x0402
            r13 = 1
            boolean r6 = r1.D(r13, r14)
            r4 = r4 & r6
            int r2 = r2 + 1
        L_0x0402:
            if (r4 == 0) goto L_0x041a
            if (r3 != r0) goto L_0x0408
            r3 = 1
            goto L_0x0409
        L_0x0408:
            r3 = 0
        L_0x0409:
            if (r5 != r0) goto L_0x040d
            r0 = 1
            goto L_0x040e
        L_0x040d:
            r0 = 0
        L_0x040e:
            r1.z(r3, r0)
            goto L_0x041a
        L_0x0412:
            r22 = r9
            r23 = r12
            r24 = r13
            r2 = 0
            r4 = 0
        L_0x041a:
            if (r4 == 0) goto L_0x0421
            r12 = 2
            if (r2 == r12) goto L_0x0420
            goto L_0x0421
        L_0x0420:
            return
        L_0x0421:
            if (r20 <= 0) goto L_0x0492
            java.util.ArrayList r0 = r1.f4338d0
            int r0 = r0.size()
            t.f r2 = r1.f4340g0
            r15 = 0
        L_0x042c:
            if (r15 >= r0) goto L_0x046c
            java.util.ArrayList r3 = r1.f4338d0
            java.lang.Object r3 = r3.get(r15)
            r.d r3 = (r.C0472d) r3
            boolean r4 = r3 instanceof r.h
            if (r4 == 0) goto L_0x043c
        L_0x043a:
            r10 = 3
            goto L_0x0469
        L_0x043c:
            s.j r4 = r3.f4316d
            s.g r4 = r4.f4474e
            boolean r4 = r4.f4463j
            if (r4 == 0) goto L_0x044d
            s.l r4 = r3.f4317e
            s.g r4 = r4.f4474e
            boolean r4 = r4.f4463j
            if (r4 == 0) goto L_0x044d
            goto L_0x043a
        L_0x044d:
            r13 = 0
            int r4 = r3.h(r13)
            r13 = 1
            int r5 = r3.h(r13)
            r10 = 3
            if (r4 != r10) goto L_0x0465
            int r4 = r3.f4321j
            if (r4 == r13) goto L_0x0465
            if (r5 != r10) goto L_0x0465
            int r4 = r3.f4322k
            if (r4 == r13) goto L_0x0465
            goto L_0x0469
        L_0x0465:
            r13 = 0
            r7.D(r2, r3, r13)
        L_0x0469:
            int r15 = r15 + 1
            goto L_0x042c
        L_0x046c:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f4613a
            int r2 = r0.getChildCount()
            r15 = 0
        L_0x0473:
            if (r15 >= r2) goto L_0x047b
            r0.getChildAt(r15)
            int r15 = r15 + 1
            goto L_0x0473
        L_0x047b:
            java.util.ArrayList r0 = r0.b
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0492
            r15 = 0
        L_0x0484:
            if (r15 >= r2) goto L_0x0492
            java.lang.Object r3 = r0.get(r15)
            t.c r3 = (t.C0478c) r3
            r3.getClass()
            int r15 = r15 + 1
            goto L_0x0484
        L_0x0492:
            int r0 = r1.f4348p0
            java.lang.Object r2 = r7.b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = r23
            r5 = r24
            if (r20 <= 0) goto L_0x04a5
            r7.G(r1, r4, r5)
        L_0x04a5:
            if (r3 <= 0) goto L_0x0677
            int[] r6 = r1.f4315c0
            r18 = 0
            r8 = r6[r18]
            r12 = 2
            if (r8 != r12) goto L_0x04b3
            r15 = 1
        L_0x04b1:
            r13 = 1
            goto L_0x04b5
        L_0x04b3:
            r15 = 0
            goto L_0x04b1
        L_0x04b5:
            r6 = r6[r13]
            if (r6 != r12) goto L_0x04bb
            r6 = 1
            goto L_0x04bc
        L_0x04bb:
            r6 = 0
        L_0x04bc:
            int r8 = r1.l()
            java.lang.Object r9 = r7.f607d
            r.e r9 = (r.C0473e) r9
            int r10 = r9.f4301Q
            int r8 = java.lang.Math.max(r8, r10)
            int r10 = r1.i()
            int r9 = r9.f4302R
            int r9 = java.lang.Math.max(r10, r9)
            r10 = 0
            r11 = 0
        L_0x04d6:
            if (r10 >= r3) goto L_0x0567
            java.lang.Object r13 = r2.get(r10)
            r.d r13 = (r.C0472d) r13
            boolean r14 = r13 instanceof r.g
            if (r14 != 0) goto L_0x04ea
            r16 = r6
            r19 = r10
            r10 = r22
            goto L_0x055e
        L_0x04ea:
            int r14 = r13.l()
            int r12 = r13.i()
            r16 = r6
            r19 = r10
            r10 = r22
            r6 = 1
            boolean r20 = r7.D(r10, r13, r6)
            r6 = r11 | r20
            int r11 = r13.l()
            r20 = r6
            int r6 = r13.i()
            if (r11 == r14) goto L_0x0530
            r13.y(r11)
            if (r15 == 0) goto L_0x052e
            int r11 = r13.m()
            int r14 = r13.f4294J
            int r11 = r11 + r14
            if (r11 <= r8) goto L_0x052e
            int r11 = r13.m()
            int r14 = r13.f4294J
            int r11 = r11 + r14
            r14 = 4
            r.c r20 = r13.g(r14)
            int r14 = r20.c()
            int r14 = r14 + r11
            int r8 = java.lang.Math.max(r8, r14)
        L_0x052e:
            r20 = 1
        L_0x0530:
            if (r6 == r12) goto L_0x0557
            r13.v(r6)
            if (r16 == 0) goto L_0x0555
            int r6 = r13.n()
            int r11 = r13.f4295K
            int r6 = r6 + r11
            if (r6 <= r9) goto L_0x0555
            int r6 = r13.n()
            int r11 = r13.f4295K
            int r6 = r6 + r11
            r11 = 5
            r.c r11 = r13.g(r11)
            int r11 = r11.c()
            int r11 = r11 + r6
            int r9 = java.lang.Math.max(r9, r11)
        L_0x0555:
            r20 = 1
        L_0x0557:
            r.g r13 = (r.g) r13
            boolean r6 = r13.f4388l0
            r6 = r20 | r6
            r11 = r6
        L_0x055e:
            int r6 = r19 + 1
            r22 = r10
            r10 = r6
            r6 = r16
            goto L_0x04d6
        L_0x0567:
            r16 = r6
            r6 = 0
        L_0x056a:
            r10 = r22
            r12 = 2
            if (r6 >= r12) goto L_0x0656
            r13 = r11
            r11 = 0
        L_0x0571:
            if (r11 >= r3) goto L_0x063b
            java.lang.Object r14 = r2.get(r11)
            r.d r14 = (r.C0472d) r14
            boolean r12 = r14 instanceof r.i
            if (r12 == 0) goto L_0x0585
            boolean r12 = r14 instanceof r.g
            if (r12 == 0) goto L_0x0582
            goto L_0x0585
        L_0x0582:
            r19 = r2
            goto L_0x05a8
        L_0x0585:
            boolean r12 = r14 instanceof r.h
            if (r12 == 0) goto L_0x058a
            goto L_0x0582
        L_0x058a:
            int r12 = r14.f4306V
            r19 = r2
            r2 = 8
            if (r12 != r2) goto L_0x0593
            goto L_0x05a8
        L_0x0593:
            s.j r2 = r14.f4316d
            s.g r2 = r2.f4474e
            boolean r2 = r2.f4463j
            if (r2 == 0) goto L_0x05a4
            s.l r2 = r14.f4317e
            s.g r2 = r2.f4474e
            boolean r2 = r2.f4463j
            if (r2 == 0) goto L_0x05a4
            goto L_0x05a8
        L_0x05a4:
            boolean r2 = r14 instanceof r.g
            if (r2 == 0) goto L_0x05b2
        L_0x05a8:
            r20 = r3
            r21 = r6
            r22 = r10
            r6 = 4
            r10 = 5
            goto L_0x062e
        L_0x05b2:
            int r2 = r14.l()
            int r12 = r14.i()
            r20 = r3
            int r3 = r14.f4300P
            r21 = r6
            r6 = 1
            boolean r22 = r7.D(r10, r14, r6)
            r13 = r13 | r22
            int r6 = r14.l()
            r22 = r10
            int r10 = r14.i()
            if (r6 == r2) goto L_0x05fa
            r14.y(r6)
            if (r15 == 0) goto L_0x05f7
            int r2 = r14.m()
            int r6 = r14.f4294J
            int r2 = r2 + r6
            if (r2 <= r8) goto L_0x05f7
            int r2 = r14.m()
            int r6 = r14.f4294J
            int r2 = r2 + r6
            r6 = 4
            r.c r13 = r14.g(r6)
            int r13 = r13.c()
            int r13 = r13 + r2
            int r8 = java.lang.Math.max(r8, r13)
            goto L_0x05f8
        L_0x05f7:
            r6 = 4
        L_0x05f8:
            r13 = 1
            goto L_0x05fb
        L_0x05fa:
            r6 = 4
        L_0x05fb:
            if (r10 == r12) goto L_0x0624
            r14.v(r10)
            if (r16 == 0) goto L_0x0621
            int r2 = r14.n()
            int r10 = r14.f4295K
            int r2 = r2 + r10
            if (r2 <= r9) goto L_0x0621
            int r2 = r14.n()
            int r10 = r14.f4295K
            int r2 = r2 + r10
            r10 = 5
            r.c r12 = r14.g(r10)
            int r12 = r12.c()
            int r12 = r12 + r2
            int r9 = java.lang.Math.max(r9, r12)
            goto L_0x0622
        L_0x0621:
            r10 = 5
        L_0x0622:
            r13 = 1
            goto L_0x0625
        L_0x0624:
            r10 = 5
        L_0x0625:
            boolean r2 = r14.f4334w
            if (r2 == 0) goto L_0x062e
            int r2 = r14.f4300P
            if (r3 == r2) goto L_0x062e
            r13 = 1
        L_0x062e:
            int r11 = r11 + 1
            r2 = r19
            r3 = r20
            r6 = r21
            r10 = r22
            r12 = 2
            goto L_0x0571
        L_0x063b:
            r19 = r2
            r20 = r3
            r21 = r6
            r22 = r10
            r6 = 4
            r10 = 5
            if (r13 == 0) goto L_0x064c
            r7.G(r1, r4, r5)
            r11 = 0
            goto L_0x064d
        L_0x064c:
            r11 = r13
        L_0x064d:
            int r2 = r21 + 1
            r6 = r2
            r2 = r19
            r3 = r20
            goto L_0x056a
        L_0x0656:
            if (r11 == 0) goto L_0x0679
            r7.G(r1, r4, r5)
            int r2 = r1.l()
            if (r2 >= r8) goto L_0x0666
            r1.y(r8)
            r15 = 1
            goto L_0x0667
        L_0x0666:
            r15 = 0
        L_0x0667:
            int r2 = r1.i()
            if (r2 >= r9) goto L_0x0671
            r1.v(r9)
            r15 = 1
        L_0x0671:
            if (r15 == 0) goto L_0x0679
            r7.G(r1, r4, r5)
            goto L_0x0679
        L_0x0677:
            r18 = 0
        L_0x0679:
            r1.f4348p0 = r0
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0682
            r8 = 1
            goto L_0x0683
        L_0x0682:
            r8 = 0
        L_0x0683:
            q.e.f3817p = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.e(r.e, int, int, int):void");
    }

    public final void forceLayout() {
        this.f1076h = true;
        super.forceLayout();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, t.e] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i2;
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f4579a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.f4582c = -1.0f;
        marginLayoutParams.f4584d = -1;
        marginLayoutParams.f4586e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.f4588g = -1;
        marginLayoutParams.f4590h = -1;
        marginLayoutParams.f4592i = -1;
        marginLayoutParams.f4594j = -1;
        marginLayoutParams.f4596k = -1;
        marginLayoutParams.f4598l = -1;
        marginLayoutParams.f4599m = -1;
        marginLayoutParams.f4600n = 0;
        marginLayoutParams.f4601o = 0.0f;
        marginLayoutParams.f4602p = -1;
        marginLayoutParams.f4603q = -1;
        marginLayoutParams.f4604r = -1;
        marginLayoutParams.f4605s = -1;
        marginLayoutParams.f4606t = -1;
        marginLayoutParams.f4607u = -1;
        marginLayoutParams.f4608v = -1;
        marginLayoutParams.f4609w = -1;
        marginLayoutParams.f4610x = -1;
        marginLayoutParams.f4611y = -1;
        marginLayoutParams.f4612z = 0.5f;
        marginLayoutParams.f4554A = 0.5f;
        marginLayoutParams.f4555B = null;
        marginLayoutParams.f4556C = 1;
        marginLayoutParams.D = -1.0f;
        marginLayoutParams.f4557E = -1.0f;
        marginLayoutParams.f4558F = 0;
        marginLayoutParams.f4559G = 0;
        marginLayoutParams.f4560H = 0;
        marginLayoutParams.f4561I = 0;
        marginLayoutParams.f4562J = 0;
        marginLayoutParams.f4563K = 0;
        marginLayoutParams.f4564L = 0;
        marginLayoutParams.f4565M = 0;
        marginLayoutParams.f4566N = 1.0f;
        marginLayoutParams.f4567O = 1.0f;
        marginLayoutParams.f4568P = -1;
        marginLayoutParams.f4569Q = -1;
        marginLayoutParams.f4570R = -1;
        marginLayoutParams.f4571S = false;
        marginLayoutParams.f4572T = false;
        marginLayoutParams.f4573U = null;
        marginLayoutParams.f4574V = true;
        marginLayoutParams.f4575W = true;
        marginLayoutParams.f4576X = false;
        marginLayoutParams.f4577Y = false;
        marginLayoutParams.f4578Z = false;
        marginLayoutParams.f4580a0 = -1;
        marginLayoutParams.f4581b0 = -1;
        marginLayoutParams.f4583c0 = -1;
        marginLayoutParams.f4585d0 = -1;
        marginLayoutParams.e0 = -1;
        marginLayoutParams.f4587f0 = -1;
        marginLayoutParams.f4589g0 = 0.5f;
        marginLayoutParams.f4597k0 = new C0472d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            int i4 = C0479d.f4553a.get(index);
            switch (i4) {
                case 1:
                    marginLayoutParams.f4570R = obtainStyledAttributes.getInt(index, marginLayoutParams.f4570R);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4599m);
                    marginLayoutParams.f4599m = resourceId;
                    if (resourceId != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4599m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 3:
                    marginLayoutParams.f4600n = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4600n);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4601o) % 360.0f;
                    marginLayoutParams.f4601o = f2;
                    if (f2 >= 0.0f) {
                        break;
                    } else {
                        marginLayoutParams.f4601o = (360.0f - f2) % 360.0f;
                        break;
                    }
                case 5:
                    marginLayoutParams.f4579a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f4579a);
                    break;
                case 6:
                    marginLayoutParams.b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.b);
                    break;
                case 7:
                    marginLayoutParams.f4582c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4582c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4584d);
                    marginLayoutParams.f4584d = resourceId2;
                    if (resourceId2 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4584d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4586e);
                    marginLayoutParams.f4586e = resourceId3;
                    if (resourceId3 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4586e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f);
                    marginLayoutParams.f = resourceId4;
                    if (resourceId4 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4588g);
                    marginLayoutParams.f4588g = resourceId5;
                    if (resourceId5 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4588g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4590h);
                    marginLayoutParams.f4590h = resourceId6;
                    if (resourceId6 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4590h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4592i);
                    marginLayoutParams.f4592i = resourceId7;
                    if (resourceId7 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4592i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4594j);
                    marginLayoutParams.f4594j = resourceId8;
                    if (resourceId8 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4594j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4596k);
                    marginLayoutParams.f4596k = resourceId9;
                    if (resourceId9 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4596k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4598l);
                    marginLayoutParams.f4598l = resourceId10;
                    if (resourceId10 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4598l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4602p);
                    marginLayoutParams.f4602p = resourceId11;
                    if (resourceId11 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4602p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4603q);
                    marginLayoutParams.f4603q = resourceId12;
                    if (resourceId12 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4603q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4604r);
                    marginLayoutParams.f4604r = resourceId13;
                    if (resourceId13 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4604r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4605s);
                    marginLayoutParams.f4605s = resourceId14;
                    if (resourceId14 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4605s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 21:
                    marginLayoutParams.f4606t = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4606t);
                    break;
                case 22:
                    marginLayoutParams.f4607u = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4607u);
                    break;
                case 23:
                    marginLayoutParams.f4608v = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4608v);
                    break;
                case 24:
                    marginLayoutParams.f4609w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4609w);
                    break;
                case 25:
                    marginLayoutParams.f4610x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4610x);
                    break;
                case 26:
                    marginLayoutParams.f4611y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4611y);
                    break;
                case 27:
                    marginLayoutParams.f4571S = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f4571S);
                    break;
                case 28:
                    marginLayoutParams.f4572T = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f4572T);
                    break;
                case 29:
                    marginLayoutParams.f4612z = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4612z);
                    break;
                case 30:
                    marginLayoutParams.f4554A = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4554A);
                    break;
                case 31:
                    int i5 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f4560H = i5;
                    if (i5 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    }
                case 32:
                    int i6 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f4561I = i6;
                    if (i6 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.f4562J = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4562J);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4562J) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f4562J = -2;
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f4564L = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4564L);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4564L) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f4564L = -2;
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f4566N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f4566N));
                    marginLayoutParams.f4560H = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.f4563K = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4563K);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4563K) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f4563K = -2;
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f4565M = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4565M);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4565M) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f4565M = -2;
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.f4567O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f4567O));
                    marginLayoutParams.f4561I = 2;
                    break;
                default:
                    switch (i4) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            marginLayoutParams.f4555B = string;
                            marginLayoutParams.f4556C = -1;
                            if (string == null) {
                                break;
                            } else {
                                int length = string.length();
                                int indexOf = marginLayoutParams.f4555B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i2 = 0;
                                } else {
                                    String substring = marginLayoutParams.f4555B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        marginLayoutParams.f4556C = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        marginLayoutParams.f4556C = 1;
                                    }
                                    i2 = indexOf + 1;
                                }
                                int indexOf2 = marginLayoutParams.f4555B.indexOf(58);
                                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                    String substring2 = marginLayoutParams.f4555B.substring(i2, indexOf2);
                                    String substring3 = marginLayoutParams.f4555B.substring(indexOf2 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring2);
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (marginLayoutParams.f4556C != 1) {
                                                    Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                } else {
                                                    Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String substring4 = marginLayoutParams.f4555B.substring(i2);
                                    if (substring4.length() <= 0) {
                                        break;
                                    } else {
                                        Float.parseFloat(substring4);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 45:
                            marginLayoutParams.D = obtainStyledAttributes.getFloat(index, marginLayoutParams.D);
                            break;
                        case 46:
                            marginLayoutParams.f4557E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4557E);
                            break;
                        case 47:
                            marginLayoutParams.f4558F = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.f4559G = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.f4568P = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f4568P);
                            break;
                        case 50:
                            marginLayoutParams.f4569Q = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f4569Q);
                            break;
                        case 51:
                            marginLayoutParams.f4573U = obtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.f1075g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.f1074e;
    }

    public int getMinWidth() {
        return this.f1073d;
    }

    public int getOptimizationLevel() {
        return this.f1072c.f4348p0;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C0480e eVar = (C0480e) childAt.getLayoutParams();
            C0472d dVar = eVar.f4597k0;
            if (childAt.getVisibility() != 8 || eVar.f4577Y || eVar.f4578Z || isInEditMode) {
                int m2 = dVar.m();
                int n2 = dVar.n();
                childAt.layout(m2, n2, dVar.l() + m2, dVar.i() + n2);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((C0478c) arrayList.get(i7)).getClass();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x053c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r35, int r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r36
            android.content.Context r3 = r0.getContext()
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.flags
            r4 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 & r4
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x001f
            int r3 = r0.getLayoutDirection()
            if (r5 != r3) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            r.e r6 = r0.f1072c
            r6.f4341h0 = r3
            boolean r3 = r0.f1076h
            if (r3 == 0) goto L_0x05ec
            r0.f1076h = r4
            int r3 = r0.getChildCount()
            r7 = 0
        L_0x002f:
            if (r7 >= r3) goto L_0x0040
            android.view.View r8 = r0.getChildAt(r7)
            boolean r8 = r8.isLayoutRequested()
            if (r8 == 0) goto L_0x003d
            r3 = 1
            goto L_0x0041
        L_0x003d:
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0040:
            r3 = 0
        L_0x0041:
            if (r3 == 0) goto L_0x05af
            boolean r9 = r0.isInEditMode()
            int r10 = r0.getChildCount()
            r11 = 0
        L_0x004c:
            if (r11 >= r10) goto L_0x005f
            android.view.View r12 = r0.getChildAt(r11)
            r.d r12 = r0.b(r12)
            if (r12 != 0) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            r12.s()
        L_0x005c:
            int r11 = r11 + 1
            goto L_0x004c
        L_0x005f:
            android.util.SparseArray r11 = r0.f1071a
            r13 = -1
            if (r9 == 0) goto L_0x00f5
            r14 = 0
        L_0x0065:
            if (r14 >= r10) goto L_0x00f5
            android.view.View r15 = r0.getChildAt(r14)
            android.content.res.Resources r8 = r0.getResources()     // Catch:{ NotFoundException -> 0x00ee }
            int r7 = r15.getId()     // Catch:{ NotFoundException -> 0x00ee }
            java.lang.String r7 = r8.getResourceName(r7)     // Catch:{ NotFoundException -> 0x00ee }
            int r8 = r15.getId()     // Catch:{ NotFoundException -> 0x00ee }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x00ee }
            if (r7 == 0) goto L_0x0084
            r16 = 1
            goto L_0x0086
        L_0x0084:
            r16 = 0
        L_0x0086:
            if (r16 == 0) goto L_0x00ab
            r16 = 1
            java.util.HashMap r5 = r0.f1081m     // Catch:{ NotFoundException -> 0x00f0 }
            if (r5 != 0) goto L_0x0095
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ NotFoundException -> 0x00f0 }
            r5.<init>()     // Catch:{ NotFoundException -> 0x00f0 }
            r0.f1081m = r5     // Catch:{ NotFoundException -> 0x00f0 }
        L_0x0095:
            java.lang.String r5 = "/"
            int r5 = r7.indexOf(r5)     // Catch:{ NotFoundException -> 0x00f0 }
            if (r5 == r13) goto L_0x00a4
            int r5 = r5 + 1
            java.lang.String r5 = r7.substring(r5)     // Catch:{ NotFoundException -> 0x00f0 }
            goto L_0x00a5
        L_0x00a4:
            r5 = r7
        L_0x00a5:
            java.util.HashMap r12 = r0.f1081m     // Catch:{ NotFoundException -> 0x00f0 }
            r12.put(r5, r8)     // Catch:{ NotFoundException -> 0x00f0 }
            goto L_0x00ad
        L_0x00ab:
            r16 = 1
        L_0x00ad:
            r5 = 47
            int r5 = r7.indexOf(r5)     // Catch:{ NotFoundException -> 0x00f0 }
            if (r5 == r13) goto L_0x00bb
            int r5 = r5 + 1
            java.lang.String r7 = r7.substring(r5)     // Catch:{ NotFoundException -> 0x00f0 }
        L_0x00bb:
            int r5 = r15.getId()     // Catch:{ NotFoundException -> 0x00f0 }
            if (r5 != 0) goto L_0x00c3
        L_0x00c1:
            r5 = r6
            goto L_0x00eb
        L_0x00c3:
            java.lang.Object r8 = r11.get(r5)     // Catch:{ NotFoundException -> 0x00f0 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ NotFoundException -> 0x00f0 }
            if (r8 != 0) goto L_0x00dc
            android.view.View r8 = r0.findViewById(r5)     // Catch:{ NotFoundException -> 0x00f0 }
            if (r8 == 0) goto L_0x00dc
            if (r8 == r0) goto L_0x00dc
            android.view.ViewParent r5 = r8.getParent()     // Catch:{ NotFoundException -> 0x00f0 }
            if (r5 != r0) goto L_0x00dc
            r0.onViewAdded(r8)     // Catch:{ NotFoundException -> 0x00f0 }
        L_0x00dc:
            if (r8 != r0) goto L_0x00df
            goto L_0x00c1
        L_0x00df:
            if (r8 != 0) goto L_0x00e3
            r5 = 0
            goto L_0x00eb
        L_0x00e3:
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()     // Catch:{ NotFoundException -> 0x00f0 }
            t.e r5 = (t.C0480e) r5     // Catch:{ NotFoundException -> 0x00f0 }
            r.d r5 = r5.f4597k0     // Catch:{ NotFoundException -> 0x00f0 }
        L_0x00eb:
            r5.f4307W = r7     // Catch:{ NotFoundException -> 0x00f0 }
            goto L_0x00f0
        L_0x00ee:
            r16 = 1
        L_0x00f0:
            int r14 = r14 + 1
            r5 = 1
            goto L_0x0065
        L_0x00f5:
            r16 = 1
            int r5 = r0.f1080l
            if (r5 == r13) goto L_0x0108
            r5 = 0
        L_0x00fc:
            if (r5 >= r10) goto L_0x0108
            android.view.View r7 = r0.getChildAt(r5)
            r7.getId()
            int r5 = r5 + 1
            goto L_0x00fc
        L_0x0108:
            t.m r5 = r0.f1078j
            if (r5 == 0) goto L_0x010f
            r5.a(r0)
        L_0x010f:
            java.util.ArrayList r5 = r6.f4338d0
            r5.clear()
            java.util.ArrayList r5 = r0.b
            int r7 = r5.size()
            if (r7 <= 0) goto L_0x01c8
            r12 = 0
        L_0x011d:
            if (r12 >= r7) goto L_0x01c8
            java.lang.Object r14 = r5.get(r12)
            t.c r14 = (t.C0478c) r14
            boolean r15 = r14.isInEditMode()
            if (r15 == 0) goto L_0x0130
            java.lang.String r15 = r14.f4552e
            r14.setIds(r15)
        L_0x0130:
            r.i r15 = r14.f4551d
            if (r15 != 0) goto L_0x013a
            r19 = r3
            r17 = 2
            goto L_0x01c0
        L_0x013a:
            r15.e0 = r4
            r.d[] r15 = r15.f4405d0
            r8 = 0
            r17 = 2
            java.util.Arrays.fill(r15, r8)
            r8 = 0
        L_0x0145:
            int r15 = r14.b
            if (r8 >= r15) goto L_0x01b9
            int[] r15 = r14.f4549a
            r15 = r15[r8]
            android.util.SparseArray r13 = r0.f1071a
            java.lang.Object r13 = r13.get(r15)
            android.view.View r13 = (android.view.View) r13
            if (r13 != 0) goto L_0x0180
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.util.HashMap r4 = r14.f
            java.lang.Object r15 = r4.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            r19 = r3
            int r3 = r14.d(r0, r15)
            if (r3 == 0) goto L_0x0182
            int[] r13 = r14.f4549a
            r13[r8] = r3
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r4.put(r13, r15)
            android.util.SparseArray r4 = r0.f1071a
            java.lang.Object r3 = r4.get(r3)
            r13 = r3
            android.view.View r13 = (android.view.View) r13
            goto L_0x0182
        L_0x0180:
            r19 = r3
        L_0x0182:
            if (r13 == 0) goto L_0x01b2
            r.i r3 = r14.f4551d
            r.d r4 = r0.b(r13)
            r3.getClass()
            if (r4 == r3) goto L_0x01b2
            if (r4 != 0) goto L_0x0192
            goto L_0x01b2
        L_0x0192:
            int r13 = r3.e0
            int r13 = r13 + 1
            r.d[] r15 = r3.f4405d0
            r20 = r4
            int r4 = r15.length
            if (r13 <= r4) goto L_0x01a8
            int r4 = r15.length
            int r4 = r4 * 2
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r15, r4)
            r.d[] r4 = (r.C0472d[]) r4
            r3.f4405d0 = r4
        L_0x01a8:
            r.d[] r4 = r3.f4405d0
            int r13 = r3.e0
            r4[r13] = r20
            int r13 = r13 + 1
            r3.e0 = r13
        L_0x01b2:
            int r8 = r8 + 1
            r3 = r19
            r4 = 0
            r13 = -1
            goto L_0x0145
        L_0x01b9:
            r19 = r3
            r.i r3 = r14.f4551d
            r3.B()
        L_0x01c0:
            int r12 = r12 + 1
            r3 = r19
            r4 = 0
            r13 = -1
            goto L_0x011d
        L_0x01c8:
            r19 = r3
            r17 = 2
            r3 = 0
        L_0x01cd:
            if (r3 >= r10) goto L_0x01d5
            r0.getChildAt(r3)
            int r3 = r3 + 1
            goto L_0x01cd
        L_0x01d5:
            android.util.SparseArray r3 = r0.f1082n
            r3.clear()
            r4 = 0
            r3.put(r4, r6)
            int r4 = r0.getId()
            r3.put(r4, r6)
            r4 = 0
        L_0x01e6:
            if (r4 >= r10) goto L_0x01fa
            android.view.View r5 = r0.getChildAt(r4)
            r.d r7 = r0.b(r5)
            int r5 = r5.getId()
            r3.put(r5, r7)
            int r4 = r4 + 1
            goto L_0x01e6
        L_0x01fa:
            r4 = 0
        L_0x01fb:
            if (r4 >= r10) goto L_0x05b1
            android.view.View r5 = r0.getChildAt(r4)
            r.d r7 = r0.b(r5)
            if (r7 != 0) goto L_0x020f
        L_0x0207:
            r26 = r4
            r32 = r9
            r4 = 2
            r9 = -1
            goto L_0x05a4
        L_0x020f:
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
            t.e r8 = (t.C0480e) r8
            java.util.ArrayList r12 = r6.f4338d0
            r12.add(r7)
            r.d r12 = r7.f4293I
            if (r12 == 0) goto L_0x0229
            r.e r12 = (r.C0473e) r12
            java.util.ArrayList r12 = r12.f4338d0
            r12.remove(r7)
            r12 = 0
            r7.f4293I = r12
            goto L_0x022a
        L_0x0229:
            r12 = 0
        L_0x022a:
            r7.f4293I = r6
            r8.a()
            int r13 = r5.getVisibility()
            r7.f4306V = r13
            r7.f4305U = r5
            boolean r13 = r5 instanceof t.C0478c
            if (r13 == 0) goto L_0x0242
            t.c r5 = (t.C0478c) r5
            boolean r13 = r6.f4341h0
            r5.f(r7, r13)
        L_0x0242:
            boolean r5 = r8.f4577Y
            if (r5 == 0) goto L_0x0275
            r.h r7 = (r.h) r7
            int r5 = r8.f4591h0
            int r13 = r8.f4593i0
            float r8 = r8.f4595j0
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r15 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r15 == 0) goto L_0x025e
            if (r15 <= 0) goto L_0x0207
            r7.f4401d0 = r8
            r8 = -1
            r7.e0 = r8
            r7.f4402f0 = r8
            goto L_0x0207
        L_0x025e:
            r8 = -1
            if (r5 == r8) goto L_0x026a
            if (r5 <= r8) goto L_0x0207
            r7.f4401d0 = r14
            r7.e0 = r5
            r7.f4402f0 = r8
            goto L_0x0207
        L_0x026a:
            if (r13 == r8) goto L_0x0207
            if (r13 <= r8) goto L_0x0207
            r7.f4401d0 = r14
            r7.e0 = r8
            r7.f4402f0 = r13
            goto L_0x0207
        L_0x0275:
            int r5 = r8.f4580a0
            int r13 = r8.f4581b0
            int r14 = r8.f4583c0
            int r15 = r8.f4585d0
            int r12 = r8.e0
            r26 = r4
            int r4 = r8.f4587f0
            r27 = r4
            float r4 = r8.f4589g0
            r20 = r7
            int r7 = r8.f4599m
            r28 = 4
            r29 = 2
            r30 = 5
            r31 = 3
            r32 = r9
            r9 = -1
            r33 = 0
            if (r7 == r9) goto L_0x02bd
            java.lang.Object r4 = r3.get(r7)
            r25 = r4
            r.d r25 = (r.C0472d) r25
            if (r25 == 0) goto L_0x02b8
            float r4 = r8.f4601o
            int r5 = r8.f4600n
            r21 = 7
            r24 = 0
            r22 = r21
            r23 = r5
            r20.o(r21, r22, r23, r24, r25)
            r7 = r20
            r7.f4333v = r4
            goto L_0x02ba
        L_0x02b8:
            r7 = r20
        L_0x02ba:
            r12 = r7
            goto L_0x040d
        L_0x02bd:
            r7 = r20
            if (r5 == r9) goto L_0x02e4
            java.lang.Object r5 = r3.get(r5)
            r25 = r5
            r.d r25 = (r.C0472d) r25
            if (r25 == 0) goto L_0x02db
            int r5 = r8.leftMargin
            r22 = r29
            r23 = r5
            r20 = r7
            r24 = r12
            r21 = 2
            r20.o(r21, r22, r23, r24, r25)
            goto L_0x02df
        L_0x02db:
            r20 = r7
            r21 = 2
        L_0x02df:
            r21 = 4
            r22 = 2
            goto L_0x0300
        L_0x02e4:
            r20 = r7
            r24 = r12
            r21 = 2
            if (r13 == r9) goto L_0x02df
            java.lang.Object r5 = r3.get(r13)
            r25 = r5
            r.d r25 = (r.C0472d) r25
            if (r25 == 0) goto L_0x02df
            int r5 = r8.leftMargin
            r23 = r5
            r22 = 4
            r20.o(r21, r22, r23, r24, r25)
            goto L_0x02df
        L_0x0300:
            if (r14 == r9) goto L_0x0318
            java.lang.Object r5 = r3.get(r14)
            r25 = r5
            r.d r25 = (r.C0472d) r25
            if (r25 == 0) goto L_0x0315
            int r5 = r8.rightMargin
            r23 = r5
            r24 = r27
            r20.o(r21, r22, r23, r24, r25)
        L_0x0315:
            r5 = 2
        L_0x0316:
            r7 = 4
            goto L_0x0331
        L_0x0318:
            r24 = r27
            r5 = 2
            if (r15 == r9) goto L_0x0316
            java.lang.Object r7 = r3.get(r15)
            r25 = r7
            r.d r25 = (r.C0472d) r25
            if (r25 == 0) goto L_0x0316
            int r7 = r8.rightMargin
            r22 = r21
            r23 = r7
            r20.o(r21, r22, r23, r24, r25)
            goto L_0x0316
        L_0x0331:
            int r12 = r8.f4590h
            if (r12 == r9) goto L_0x0357
            java.lang.Object r9 = r3.get(r12)
            r25 = r9
            r.d r25 = (r.C0472d) r25
            if (r25 == 0) goto L_0x034f
            int r9 = r8.topMargin
            int r12 = r8.f4607u
            r22 = r31
            r23 = r9
            r24 = r12
            r21 = 3
            r20.o(r21, r22, r23, r24, r25)
            goto L_0x0351
        L_0x034f:
            r21 = 3
        L_0x0351:
            r12 = -1
        L_0x0352:
            r21 = 5
            r22 = 3
            goto L_0x0376
        L_0x0357:
            r21 = 3
            int r9 = r8.f4592i
            r12 = -1
            if (r9 == r12) goto L_0x0352
            java.lang.Object r9 = r3.get(r9)
            r25 = r9
            r.d r25 = (r.C0472d) r25
            if (r25 == 0) goto L_0x0352
            int r9 = r8.topMargin
            int r13 = r8.f4607u
            r23 = r9
            r24 = r13
            r22 = 5
            r20.o(r21, r22, r23, r24, r25)
            goto L_0x0352
        L_0x0376:
            int r9 = r8.f4594j
            if (r9 == r12) goto L_0x0394
            java.lang.Object r9 = r3.get(r9)
            r25 = r9
            r.d r25 = (r.C0472d) r25
            if (r25 == 0) goto L_0x038f
            int r9 = r8.bottomMargin
            int r13 = r8.f4609w
            r23 = r9
            r24 = r13
            r20.o(r21, r22, r23, r24, r25)
        L_0x038f:
            r9 = 3
        L_0x0390:
            r12 = r20
            r13 = 5
            goto L_0x03b1
        L_0x0394:
            r9 = 3
            int r13 = r8.f4596k
            if (r13 == r12) goto L_0x0390
            java.lang.Object r12 = r3.get(r13)
            r25 = r12
            r.d r25 = (r.C0472d) r25
            if (r25 == 0) goto L_0x0390
            int r12 = r8.bottomMargin
            int r13 = r8.f4609w
            r22 = r21
            r23 = r12
            r24 = r13
            r20.o(r21, r22, r23, r24, r25)
            goto L_0x0390
        L_0x03b1:
            int r14 = r8.f4598l
            r15 = -1
            if (r14 == r15) goto L_0x03ff
            java.lang.Object r14 = r11.get(r14)
            android.view.View r14 = (android.view.View) r14
            int r15 = r8.f4598l
            java.lang.Object r15 = r3.get(r15)
            r.d r15 = (r.C0472d) r15
            if (r15 == 0) goto L_0x03ff
            if (r14 == 0) goto L_0x03ff
            android.view.ViewGroup$LayoutParams r7 = r14.getLayoutParams()
            boolean r7 = r7 instanceof t.C0480e
            if (r7 == 0) goto L_0x03ff
            android.view.ViewGroup$LayoutParams r7 = r14.getLayoutParams()
            t.e r7 = (t.C0480e) r7
            r14 = 1
            r8.f4576X = r14
            r7.f4576X = r14
            r5 = 6
            r.c r13 = r12.g(r5)
            r.c r5 = r15.g(r5)
            r9 = -1
            r15 = 0
            r13.b(r5, r15, r9, r14)
            r12.f4334w = r14
            r.d r5 = r7.f4597k0
            r5.f4334w = r14
            r9 = 3
            r.c r5 = r12.g(r9)
            r5.h()
            r13 = 5
            r.c r5 = r12.g(r13)
            r5.h()
        L_0x03ff:
            int r5 = (r4 > r33 ? 1 : (r4 == r33 ? 0 : -1))
            if (r5 < 0) goto L_0x0405
            r12.f4303S = r4
        L_0x0405:
            float r4 = r8.f4554A
            int r5 = (r4 > r33 ? 1 : (r4 == r33 ? 0 : -1))
            if (r5 < 0) goto L_0x040d
            r12.f4304T = r4
        L_0x040d:
            if (r32 == 0) goto L_0x041e
            int r4 = r8.f4568P
            r9 = -1
            if (r4 != r9) goto L_0x0418
            int r5 = r8.f4569Q
            if (r5 == r9) goto L_0x041e
        L_0x0418:
            int r5 = r8.f4569Q
            r12.f4298N = r4
            r12.f4299O = r5
        L_0x041e:
            boolean r4 = r8.f4574V
            r5 = -2
            if (r4 != 0) goto L_0x0453
            int r4 = r8.width
            r9 = -1
            if (r4 != r9) goto L_0x044a
            boolean r4 = r8.f4571S
            if (r4 == 0) goto L_0x0432
            r4 = 3
            r12.w(r4)
        L_0x0430:
            r7 = 2
            goto L_0x0438
        L_0x0432:
            r4 = 3
            r7 = 4
            r12.w(r7)
            goto L_0x0430
        L_0x0438:
            r.c r7 = r12.g(r7)
            int r9 = r8.leftMargin
            r7.f4284e = r9
            r7 = 4
            r.c r7 = r12.g(r7)
            int r9 = r8.rightMargin
            r7.f4284e = r9
            goto L_0x0464
        L_0x044a:
            r4 = 3
            r12.w(r4)
            r15 = 0
            r12.y(r15)
            goto L_0x0464
        L_0x0453:
            r14 = 1
            r12.w(r14)
            int r4 = r8.width
            r12.y(r4)
            int r4 = r8.width
            if (r4 != r5) goto L_0x0464
            r4 = 2
            r12.w(r4)
        L_0x0464:
            boolean r4 = r8.f4575W
            if (r4 != 0) goto L_0x0498
            int r4 = r8.height
            r9 = -1
            if (r4 != r9) goto L_0x048f
            boolean r4 = r8.f4572T
            if (r4 == 0) goto L_0x0477
            r4 = 3
            r12.x(r4)
        L_0x0475:
            r5 = 3
            goto L_0x047d
        L_0x0477:
            r4 = 3
            r7 = 4
            r12.x(r7)
            goto L_0x0475
        L_0x047d:
            r.c r5 = r12.g(r5)
            int r7 = r8.topMargin
            r5.f4284e = r7
            r13 = 5
            r.c r5 = r12.g(r13)
            int r7 = r8.bottomMargin
            r5.f4284e = r7
            goto L_0x04aa
        L_0x048f:
            r4 = 3
            r12.x(r4)
            r15 = 0
            r12.v(r15)
            goto L_0x04aa
        L_0x0498:
            r9 = -1
            r14 = 1
            r12.x(r14)
            int r4 = r8.height
            r12.v(r4)
            int r4 = r8.height
            if (r4 != r5) goto L_0x04aa
            r4 = 2
            r12.x(r4)
        L_0x04aa:
            java.lang.String r4 = r8.f4555B
            if (r4 == 0) goto L_0x04b4
            int r5 = r4.length()
            if (r5 != 0) goto L_0x04b7
        L_0x04b4:
            r4 = 0
            goto L_0x0541
        L_0x04b7:
            int r5 = r4.length()
            r7 = 44
            int r7 = r4.indexOf(r7)
            if (r7 <= 0) goto L_0x04e4
            int r13 = r5 + -1
            if (r7 >= r13) goto L_0x04e4
            r15 = 0
            java.lang.String r13 = r4.substring(r15, r7)
            java.lang.String r14 = "W"
            boolean r14 = r13.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x04d6
            r13 = 0
            goto L_0x04e1
        L_0x04d6:
            java.lang.String r14 = "H"
            boolean r13 = r13.equalsIgnoreCase(r14)
            if (r13 == 0) goto L_0x04e0
            r13 = 1
            goto L_0x04e1
        L_0x04e0:
            r13 = -1
        L_0x04e1:
            int r7 = r7 + 1
            goto L_0x04e6
        L_0x04e4:
            r7 = 0
            r13 = -1
        L_0x04e6:
            r14 = 58
            int r14 = r4.indexOf(r14)
            if (r14 < 0) goto L_0x0527
            int r5 = r5 + -1
            if (r14 >= r5) goto L_0x0527
            java.lang.String r5 = r4.substring(r7, r14)
            int r14 = r14 + 1
            java.lang.String r4 = r4.substring(r14)
            int r7 = r5.length()
            if (r7 <= 0) goto L_0x0537
            int r7 = r4.length()
            if (r7 <= 0) goto L_0x0537
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x0536 }
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x0536 }
            int r7 = (r5 > r33 ? 1 : (r5 == r33 ? 0 : -1))
            if (r7 <= 0) goto L_0x0537
            int r7 = (r4 > r33 ? 1 : (r4 == r33 ? 0 : -1))
            if (r7 <= 0) goto L_0x0537
            r14 = 1
            if (r13 != r14) goto L_0x0521
            float r4 = r4 / r5
            float r4 = java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x0536 }
            goto L_0x0538
        L_0x0521:
            float r5 = r5 / r4
            float r4 = java.lang.Math.abs(r5)     // Catch:{ NumberFormatException -> 0x0536 }
            goto L_0x0538
        L_0x0527:
            java.lang.String r4 = r4.substring(r7)
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x0537
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x0536 }
            goto L_0x0538
        L_0x0536:
        L_0x0537:
            r4 = 0
        L_0x0538:
            int r5 = (r4 > r33 ? 1 : (r4 == r33 ? 0 : -1))
            if (r5 <= 0) goto L_0x0543
            r12.f4296L = r4
            r12.f4297M = r13
            goto L_0x0543
        L_0x0541:
            r12.f4296L = r4
        L_0x0543:
            float r4 = r8.D
            float[] r5 = r12.f4310Z
            r18 = 0
            r5[r18] = r4
            float r4 = r8.f4557E
            r16 = 1
            r5[r16] = r4
            int r4 = r8.f4558F
            r12.f4308X = r4
            int r4 = r8.f4559G
            r12.f4309Y = r4
            int r4 = r8.f4560H
            int r5 = r8.f4562J
            int r7 = r8.f4564L
            float r13 = r8.f4566N
            r12.f4321j = r4
            r12.f4324m = r5
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r5) goto L_0x056b
            r7 = 0
        L_0x056b:
            r12.f4325n = r7
            r12.f4326o = r13
            r7 = 1065353216(0x3f800000, float:1.0)
            r33 = 0
            int r14 = (r13 > r33 ? 1 : (r13 == r33 ? 0 : -1))
            if (r14 <= 0) goto L_0x0580
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 >= 0) goto L_0x0580
            if (r4 != 0) goto L_0x0580
            r4 = 2
            r12.f4321j = r4
        L_0x0580:
            int r4 = r8.f4561I
            int r13 = r8.f4563K
            int r14 = r8.f4565M
            float r8 = r8.f4567O
            r12.f4322k = r4
            r12.f4327p = r13
            if (r14 != r5) goto L_0x058f
            r14 = 0
        L_0x058f:
            r12.f4328q = r14
            r12.f4329r = r8
            r33 = 0
            int r5 = (r8 > r33 ? 1 : (r8 == r33 ? 0 : -1))
            if (r5 <= 0) goto L_0x05a3
            int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x05a3
            if (r4 != 0) goto L_0x05a3
            r4 = 2
            r12.f4322k = r4
            goto L_0x05a4
        L_0x05a3:
            r4 = 2
        L_0x05a4:
            int r5 = r26 + 1
            r4 = r5
            r9 = r32
            r16 = 1
            r17 = 2
            goto L_0x01fb
        L_0x05af:
            r19 = r3
        L_0x05b1:
            if (r19 == 0) goto L_0x05ec
            N.g r3 = r6.e0
            java.lang.Object r3 = r3.b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.util.ArrayList r4 = r6.f4338d0
            int r4 = r4.size()
            r5 = 0
        L_0x05c3:
            if (r5 >= r4) goto L_0x05e7
            java.util.ArrayList r7 = r6.f4338d0
            java.lang.Object r7 = r7.get(r5)
            r.d r7 = (r.C0472d) r7
            int[] r8 = r7.f4315c0
            r18 = 0
            r9 = r8[r18]
            r10 = 3
            r11 = 4
            if (r9 == r10) goto L_0x05e1
            if (r9 == r11) goto L_0x05e1
            r16 = 1
            r8 = r8[r16]
            if (r8 == r10) goto L_0x05e1
            if (r8 != r11) goto L_0x05e4
        L_0x05e1:
            r3.add(r7)
        L_0x05e4:
            int r5 = r5 + 1
            goto L_0x05c3
        L_0x05e7:
            s.e r3 = r6.f4339f0
            r14 = 1
            r3.b = r14
        L_0x05ec:
            int r3 = r0.f1077i
            r0.e(r6, r3, r1, r2)
            int r3 = r6.l()
            int r4 = r6.i()
            boolean r5 = r6.f4349q0
            boolean r6 = r6.f4350r0
            t.f r7 = r0.f1083o
            int r8 = r7.f4616e
            int r7 = r7.f4615d
            int r3 = r3 + r7
            int r4 = r4 + r8
            r15 = 0
            int r1 = android.view.View.resolveSizeAndState(r3, r1, r15)
            int r2 = android.view.View.resolveSizeAndState(r4, r2, r15)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.f
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.f1075g
            int r2 = java.lang.Math.min(r3, r2)
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            if (r5 == 0) goto L_0x0624
            r1 = r1 | r3
        L_0x0624:
            if (r6 == 0) goto L_0x0627
            r2 = r2 | r3
        L_0x0627:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0472d b2 = b(view);
        if ((view instanceof o) && !(b2 instanceof h)) {
            C0480e eVar = (C0480e) view.getLayoutParams();
            h hVar = new h();
            eVar.f4597k0 = hVar;
            eVar.f4577Y = true;
            hVar.B(eVar.f4570R);
        }
        if (view instanceof C0478c) {
            C0478c cVar = (C0478c) view;
            cVar.g();
            ((C0480e) view.getLayoutParams()).f4578Z = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f1071a.put(view.getId(), view);
        this.f1076h = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1071a.remove(view.getId());
        C0472d b2 = b(view);
        this.f1072c.f4338d0.remove(b2);
        b2.f4293I = null;
        this.b.remove(view);
        this.f1076h = true;
    }

    public final void requestLayout() {
        this.f1076h = true;
        super.requestLayout();
    }

    public void setConstraintSet(m mVar) {
        this.f1078j = mVar;
    }

    public void setId(int i2) {
        int id = getId();
        SparseArray sparseArray = this.f1071a;
        sparseArray.remove(id);
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.f1075g) {
            this.f1075g = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.f) {
            this.f = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.f1074e) {
            this.f1074e = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.f1073d) {
            this.f1073d = i2;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(n nVar) {
        c cVar = this.f1079k;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        boolean z2;
        this.f1077i = i2;
        this.f1072c.f4348p0 = i2;
        if ((i2 & 256) == 256) {
            z2 = true;
        } else {
            z2 = false;
        }
        e.f3817p = z2;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c(attributeSet, i2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, t.e] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f4579a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.f4582c = -1.0f;
        marginLayoutParams.f4584d = -1;
        marginLayoutParams.f4586e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.f4588g = -1;
        marginLayoutParams.f4590h = -1;
        marginLayoutParams.f4592i = -1;
        marginLayoutParams.f4594j = -1;
        marginLayoutParams.f4596k = -1;
        marginLayoutParams.f4598l = -1;
        marginLayoutParams.f4599m = -1;
        marginLayoutParams.f4600n = 0;
        marginLayoutParams.f4601o = 0.0f;
        marginLayoutParams.f4602p = -1;
        marginLayoutParams.f4603q = -1;
        marginLayoutParams.f4604r = -1;
        marginLayoutParams.f4605s = -1;
        marginLayoutParams.f4606t = -1;
        marginLayoutParams.f4607u = -1;
        marginLayoutParams.f4608v = -1;
        marginLayoutParams.f4609w = -1;
        marginLayoutParams.f4610x = -1;
        marginLayoutParams.f4611y = -1;
        marginLayoutParams.f4612z = 0.5f;
        marginLayoutParams.f4554A = 0.5f;
        marginLayoutParams.f4555B = null;
        marginLayoutParams.f4556C = 1;
        marginLayoutParams.D = -1.0f;
        marginLayoutParams.f4557E = -1.0f;
        marginLayoutParams.f4558F = 0;
        marginLayoutParams.f4559G = 0;
        marginLayoutParams.f4560H = 0;
        marginLayoutParams.f4561I = 0;
        marginLayoutParams.f4562J = 0;
        marginLayoutParams.f4563K = 0;
        marginLayoutParams.f4564L = 0;
        marginLayoutParams.f4565M = 0;
        marginLayoutParams.f4566N = 1.0f;
        marginLayoutParams.f4567O = 1.0f;
        marginLayoutParams.f4568P = -1;
        marginLayoutParams.f4569Q = -1;
        marginLayoutParams.f4570R = -1;
        marginLayoutParams.f4571S = false;
        marginLayoutParams.f4572T = false;
        marginLayoutParams.f4573U = null;
        marginLayoutParams.f4574V = true;
        marginLayoutParams.f4575W = true;
        marginLayoutParams.f4576X = false;
        marginLayoutParams.f4577Y = false;
        marginLayoutParams.f4578Z = false;
        marginLayoutParams.f4580a0 = -1;
        marginLayoutParams.f4581b0 = -1;
        marginLayoutParams.f4583c0 = -1;
        marginLayoutParams.f4585d0 = -1;
        marginLayoutParams.e0 = -1;
        marginLayoutParams.f4587f0 = -1;
        marginLayoutParams.f4589g0 = 0.5f;
        marginLayoutParams.f4597k0 = new C0472d();
        return marginLayoutParams;
    }
}
