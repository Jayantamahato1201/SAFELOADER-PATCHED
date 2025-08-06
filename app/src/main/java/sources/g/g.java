package G;

import B0.f;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.util.Objects;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f242a;
    public final TextDirectionHeuristic b;

    /* renamed from: c  reason: collision with root package name */
    public final int f243c;

    /* renamed from: d  reason: collision with root package name */
    public final int f244d;

    public g(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            f.l(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
        }
        this.f242a = textPaint;
        this.b = textDirectionHeuristic;
        this.f243c = i2;
        this.f244d = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r3.getTextLocales().equals(r5.getTextLocales()) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (r3.getTextLocale().equals(r5.getTextLocale()) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0005
            goto L_0x00c3
        L_0x0005:
            boolean r1 = r8 instanceof G.g
            r2 = 0
            if (r1 != 0) goto L_0x000c
            goto L_0x00c4
        L_0x000c:
            G.g r8 = (G.g) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x0024
            int r3 = r8.f243c
            int r4 = r7.f243c
            if (r4 == r3) goto L_0x001c
            goto L_0x00b7
        L_0x001c:
            int r3 = r7.f244d
            int r4 = r8.f244d
            if (r3 == r4) goto L_0x0024
            goto L_0x00b7
        L_0x0024:
            android.text.TextPaint r3 = r7.f242a
            float r4 = r3.getTextSize()
            android.text.TextPaint r5 = r8.f242a
            float r5 = r5.getTextSize()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0036
            goto L_0x00b7
        L_0x0036:
            float r4 = r3.getTextScaleX()
            android.text.TextPaint r5 = r8.f242a
            float r6 = r5.getTextScaleX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0046
            goto L_0x00b7
        L_0x0046:
            float r4 = r3.getTextSkewX()
            float r6 = r5.getTextSkewX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0053
            goto L_0x00b7
        L_0x0053:
            float r4 = r3.getLetterSpacing()
            float r6 = r5.getLetterSpacing()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0060
            goto L_0x00b7
        L_0x0060:
            java.lang.String r4 = r3.getFontFeatureSettings()
            java.lang.String r6 = r5.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 != 0) goto L_0x006f
            goto L_0x00b7
        L_0x006f:
            int r4 = r3.getFlags()
            int r6 = r5.getFlags()
            if (r4 == r6) goto L_0x007a
            goto L_0x00b7
        L_0x007a:
            r4 = 24
            if (r1 < r4) goto L_0x008d
            android.os.LocaleList r1 = r3.getTextLocales()
            android.os.LocaleList r4 = r5.getTextLocales()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x009c
            goto L_0x00b7
        L_0x008d:
            java.util.Locale r1 = r3.getTextLocale()
            java.util.Locale r4 = r5.getTextLocale()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x009c
            goto L_0x00b7
        L_0x009c:
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 != 0) goto L_0x00a9
            android.graphics.Typeface r1 = r5.getTypeface()
            if (r1 == 0) goto L_0x00b9
            goto L_0x00b7
        L_0x00a9:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00b9
        L_0x00b7:
            r1 = 0
            goto L_0x00ba
        L_0x00b9:
            r1 = 1
        L_0x00ba:
            if (r1 != 0) goto L_0x00bd
            goto L_0x00c4
        L_0x00bd:
            android.text.TextDirectionHeuristic r1 = r7.b
            android.text.TextDirectionHeuristic r8 = r8.b
            if (r1 != r8) goto L_0x00c4
        L_0x00c3:
            return r0
        L_0x00c4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: G.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.b;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.f244d;
        int i4 = this.f243c;
        TextPaint textPaint = this.f242a;
        if (i2 >= 24) {
            return Objects.hash(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i4), Integer.valueOf(i3)});
        }
        return Objects.hash(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i4), Integer.valueOf(i3)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f242a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i2 >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.b);
        sb.append(", breakStrategy=" + this.f243c);
        sb.append(", hyphenationFrequency=" + this.f244d);
        sb.append("}");
        return sb.toString();
    }

    public g(PrecomputedText.Params params) {
        this.f242a = params.getTextPaint();
        this.b = params.getTextDirection();
        this.f243c = params.getBreakStrategy();
        this.f244d = params.getHyphenationFrequency();
    }
}
