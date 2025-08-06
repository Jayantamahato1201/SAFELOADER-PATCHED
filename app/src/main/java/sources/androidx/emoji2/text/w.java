package androidx.emoji2.text;

import E0.e;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

public final class w implements Spannable {
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public Spannable f1190g;

    public w(Spannable spannable) {
        this.f1190g = spannable;
    }

    public final void a() {
        e eVar;
        Spannable spannable = this.f1190g;
        if (!this.f) {
            if (Build.VERSION.SDK_INT < 28) {
                eVar = new e(18);
            } else {
                eVar = new e(18);
            }
            if (eVar.i(spannable)) {
                this.f1190g = new SpannableString(spannable);
            }
        }
        this.f = true;
    }

    public final char charAt(int i2) {
        return this.f1190g.charAt(i2);
    }

    public final IntStream chars() {
        return this.f1190g.chars();
    }

    public final IntStream codePoints() {
        return this.f1190g.codePoints();
    }

    public final int getSpanEnd(Object obj) {
        return this.f1190g.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f1190g.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f1190g.getSpanStart(obj);
    }

    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f1190g.getSpans(i2, i3, cls);
    }

    public final int length() {
        return this.f1190g.length();
    }

    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f1190g.nextSpanTransition(i2, i3, cls);
    }

    public final void removeSpan(Object obj) {
        a();
        this.f1190g.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i2, int i3, int i4) {
        a();
        this.f1190g.setSpan(obj, i2, i3, i4);
    }

    public final CharSequence subSequence(int i2, int i3) {
        return this.f1190g.subSequence(i2, i3);
    }

    public final String toString() {
        return this.f1190g.toString();
    }

    public w(CharSequence charSequence) {
        this.f1190g = new SpannableString(charSequence);
    }
}
