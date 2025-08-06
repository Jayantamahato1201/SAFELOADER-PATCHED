package androidx.emoji2.text;

import A.i;
import S.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

public final class u extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f1188a = new Paint.FontMetricsInt();
    public final m b;

    /* renamed from: c  reason: collision with root package name */
    public float f1189c = 1.0f;

    public u(m mVar) {
        i.k("metadata cannot be null", mVar);
        this.b = mVar;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
        j.a().getClass();
        float f2 = (float) i5;
        m mVar = this.b;
        r rVar = mVar.b;
        Typeface typeface = paint.getTypeface();
        paint.setTypeface((Typeface) rVar.f1185d);
        canvas.drawText((char[]) rVar.b, mVar.f1169a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        short s2;
        Paint.FontMetricsInt fontMetricsInt2 = this.f1188a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        m mVar = this.b;
        a b2 = mVar.b();
        int a2 = b2.a(14);
        short s3 = 0;
        if (a2 != 0) {
            s2 = ((ByteBuffer) b2.f386d).getShort(a2 + b2.f384a);
        } else {
            s2 = 0;
        }
        this.f1189c = abs / ((float) s2);
        a b3 = mVar.b();
        int a3 = b3.a(14);
        if (a3 != 0) {
            ((ByteBuffer) b3.f386d).getShort(a3 + b3.f384a);
        }
        a b4 = mVar.b();
        int a4 = b4.a(12);
        if (a4 != 0) {
            s3 = ((ByteBuffer) b4.f386d).getShort(a4 + b4.f384a);
        }
        short s4 = (short) ((int) (((float) s3) * this.f1189c));
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s4;
    }
}
