package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: k.o0  reason: case insensitive filesystem */
public final class C0259o0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f3534l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap f3535m = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f3536a = 0;
    public boolean b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f3537c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f3538d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f3539e = -1.0f;
    public int[] f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f3540g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f3541h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f3542i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f3543j;

    /* renamed from: k  reason: collision with root package name */
    public final C0257n0 f3544k;

    static {
        new ConcurrentHashMap();
    }

    public C0259o0(TextView textView) {
        this.f3542i = textView;
        this.f3543j = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f3544k = new C0255m0();
        } else if (i2 >= 23) {
            this.f3544k = new C0253l0();
        } else {
            this.f3544k = new C0257n0();
        }
    }

    public static int[] b(int[] iArr) {
        if (r0 != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (r0 != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f3535m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, (Class[]) null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r3 + "() method", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object e(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
        /*
            java.lang.reflect.Method r0 = d(r3)     // Catch:{ Exception -> 0x000a, all -> 0x000c }
            r1 = 0
            java.lang.Object r2 = r0.invoke(r2, r1)     // Catch:{ Exception -> 0x000a, all -> 0x000c }
            return r2
        L_0x000a:
            r2 = move-exception
            goto L_0x000e
        L_0x000c:
            r2 = move-exception
            throw r2
        L_0x000e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to invoke TextView#"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "() method"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ACTVAutoSizeHelper"
            android.util.Log.w(r0, r3, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0259o0.e(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public final void a() {
        int i2;
        if (f()) {
            if (this.b) {
                if (this.f3542i.getMeasuredHeight() > 0 && this.f3542i.getMeasuredWidth() > 0) {
                    if (this.f3544k.b(this.f3542i)) {
                        i2 = 1048576;
                    } else {
                        i2 = (this.f3542i.getMeasuredWidth() - this.f3542i.getTotalPaddingLeft()) - this.f3542i.getTotalPaddingRight();
                    }
                    int height = (this.f3542i.getHeight() - this.f3542i.getCompoundPaddingBottom()) - this.f3542i.getCompoundPaddingTop();
                    if (i2 > 0 && height > 0) {
                        RectF rectF = f3534l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) i2;
                                rectF.bottom = (float) height;
                                float c2 = (float) c(rectF);
                                if (c2 != this.f3542i.getTextSize()) {
                                    g(0, c2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        StaticLayout staticLayout;
        CharSequence transformation;
        RectF rectF2 = rectF;
        int length = this.f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                int i6 = this.f[i5];
                TextView textView = this.f3542i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) {
                    charSequence = text;
                } else {
                    charSequence = transformation;
                }
                int i7 = Build.VERSION.SDK_INT;
                int b2 = C0247i0.b(textView);
                TextPaint textPaint = this.f3541h;
                if (textPaint == null) {
                    this.f3541h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f3541h.set(textView.getPaint());
                this.f3541h.setTextSize((float) i6);
                Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF2.right);
                if (i7 >= 23) {
                    staticLayout = C0251k0.a(charSequence, alignment, round, b2, this.f3542i, this.f3541h, this.f3544k);
                } else {
                    staticLayout = C0247i0.a(charSequence, alignment, round, textView, this.f3541h);
                }
                if ((b2 == -1 || (staticLayout.getLineCount() <= b2 && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == charSequence.length())) && ((float) staticLayout.getHeight()) <= rectF2.bottom) {
                    int i8 = i5 + 1;
                    i4 = i3;
                    i3 = i8;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (!j() || this.f3536a == 0) {
            return false;
        }
        return true;
    }

    public final void g(int i2, float f2) {
        Resources resources;
        Context context = this.f3543j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics());
        TextView textView = this.f3542i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a2 = C0249j0.a(textView);
            if (textView.getLayout() != null) {
                this.b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(textView, (Object[]) null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!a2) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (!j() || this.f3536a != 1) {
            this.b = false;
        } else {
            if (!this.f3540g || this.f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f3539e - this.f3538d) / this.f3537c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((((float) i2) * this.f3537c) + this.f3538d);
                }
                this.f = b(iArr);
            }
            this.b = true;
        }
        return this.b;
    }

    public final boolean i() {
        boolean z2;
        int[] iArr = this.f;
        int length = iArr.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f3540g = z2;
        if (z2) {
            this.f3536a = 1;
            this.f3538d = (float) iArr[0];
            this.f3539e = (float) iArr[length - 1];
            this.f3537c = -1.0f;
        }
        return z2;
    }

    public final boolean j() {
        return !(this.f3542i instanceof C0271v);
    }

    public final void k(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.f3536a = 1;
            this.f3538d = f2;
            this.f3539e = f3;
            this.f3537c = f4;
            this.f3540g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }
}
