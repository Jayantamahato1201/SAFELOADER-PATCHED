package y0;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

public final class h {

    /* renamed from: l  reason: collision with root package name */
    public static final int f4828l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f4829m;

    /* renamed from: n  reason: collision with root package name */
    public static Constructor f4830n;

    /* renamed from: o  reason: collision with root package name */
    public static TextDirectionHeuristic f4831o;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f4832a;
    public final TextPaint b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4833c;

    /* renamed from: d  reason: collision with root package name */
    public int f4834d;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f4835e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f4836g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public int f4837h = f4828l;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4838i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4839j;

    /* renamed from: k  reason: collision with root package name */
    public TextUtils.TruncateAt f4840k = null;

    static {
        int i2;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        f4828l = i2;
    }

    public h(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f4832a = charSequence;
        this.b = textPaint;
        this.f4833c = i2;
        this.f4834d = charSequence.length();
    }

    public final StaticLayout a() {
        char c2;
        boolean z2;
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2;
        if (this.f4832a == null) {
            this.f4832a = "";
        }
        int max = Math.max(0, this.f4833c);
        CharSequence charSequence = this.f4832a;
        int i2 = this.f;
        TextPaint textPaint = this.b;
        if (i2 == 1) {
            c2 = 9;
            charSequence = TextUtils.ellipsize(charSequence, textPaint, (float) max, this.f4840k);
        } else {
            c2 = 9;
        }
        int min = Math.min(charSequence.length(), this.f4834d);
        this.f4834d = min;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            if (this.f4839j && this.f == 1) {
                this.f4835e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder c3 = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
            c3.setAlignment(this.f4835e);
            c3.setIncludePad(this.f4838i);
            if (this.f4839j) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            c3.setTextDirection(textDirectionHeuristic2);
            TextUtils.TruncateAt truncateAt = this.f4840k;
            if (truncateAt != null) {
                c3.setEllipsize(truncateAt);
            }
            c3.setMaxLines(this.f);
            float f2 = this.f4836g;
            if (f2 != 1.0f) {
                c3.setLineSpacing(0.0f, f2);
            }
            if (this.f > 1) {
                c3.setHyphenationFrequency(this.f4837h);
            }
            return c3.build();
        }
        if (!f4829m) {
            try {
                if (!this.f4839j || i3 < 23) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                f4831o = textDirectionHeuristic;
                Class[] clsArr = new Class[13];
                clsArr[0] = CharSequence.class;
                Class cls = Integer.TYPE;
                clsArr[1] = cls;
                clsArr[2] = cls;
                clsArr[3] = TextPaint.class;
                clsArr[4] = cls;
                clsArr[5] = Layout.Alignment.class;
                clsArr[6] = TextDirectionHeuristic.class;
                Class cls2 = Float.TYPE;
                clsArr[7] = cls2;
                clsArr[8] = cls2;
                clsArr[c2] = Boolean.TYPE;
                clsArr[10] = TextUtils.TruncateAt.class;
                clsArr[11] = cls;
                clsArr[12] = cls;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(clsArr);
                f4830n = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f4829m = true;
            } catch (Exception e2) {
                throw new g(e2);
            }
        }
        try {
            Constructor constructor = f4830n;
            constructor.getClass();
            Integer valueOf = Integer.valueOf(this.f4834d);
            Integer valueOf2 = Integer.valueOf(max);
            Layout.Alignment alignment = this.f4835e;
            TextDirectionHeuristic textDirectionHeuristic3 = f4831o;
            textDirectionHeuristic3.getClass();
            Float valueOf3 = Float.valueOf(1.0f);
            Float valueOf4 = Float.valueOf(0.0f);
            Boolean valueOf5 = Boolean.valueOf(this.f4838i);
            Integer valueOf6 = Integer.valueOf(max);
            Integer valueOf7 = Integer.valueOf(this.f);
            Object[] objArr = new Object[13];
            objArr[0] = charSequence;
            objArr[1] = 0;
            objArr[2] = valueOf;
            objArr[3] = textPaint;
            objArr[4] = valueOf2;
            objArr[5] = alignment;
            objArr[6] = textDirectionHeuristic3;
            objArr[7] = valueOf3;
            objArr[8] = valueOf4;
            objArr[c2] = valueOf5;
            objArr[10] = null;
            objArr[11] = valueOf6;
            objArr[12] = valueOf7;
            return (StaticLayout) constructor.newInstance(objArr);
        } catch (Exception e3) {
            throw new g(e3);
        }
    }
}
