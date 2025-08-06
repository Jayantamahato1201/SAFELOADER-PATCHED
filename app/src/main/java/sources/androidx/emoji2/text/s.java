package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

public final class s implements TextWatcher, SpanWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1186a;
    public final AtomicInteger b = new AtomicInteger(0);

    public s(Object obj) {
        this.f1186a = obj;
    }

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f1186a).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        ((TextWatcher) this.f1186a).beforeTextChanged(charSequence, i2, i3, i4);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
        if (this.b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f1186a).onSpanAdded(spannable, obj, i2, i3);
        }
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (this.b.get() <= 0 || !(obj instanceof u)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i2 > i3) {
                    i2 = 0;
                }
                if (i4 > i5) {
                    i7 = i2;
                    i6 = 0;
                    ((SpanWatcher) this.f1186a).onSpanChanged(spannable, obj, i7, i3, i6, i5);
                }
            }
            i7 = i2;
            i6 = i4;
            ((SpanWatcher) this.f1186a).onSpanChanged(spannable, obj, i7, i3, i6, i5);
        }
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
        if (this.b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f1186a).onSpanRemoved(spannable, obj, i2, i3);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        ((TextWatcher) this.f1186a).onTextChanged(charSequence, i2, i3, i4);
    }
}
