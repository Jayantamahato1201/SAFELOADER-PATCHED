package androidx.emoji2.text;

import A.i;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class t extends SpannableStringBuilder {
    public final Class f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f1187g = new ArrayList();

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        i.k("watcherClass cannot be null", cls);
        this.f = cls;
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1187g;
            if (i2 < arrayList.size()) {
                ((s) arrayList.get(i2)).b.incrementAndGet();
                i2++;
            } else {
                return;
            }
        }
    }

    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1187g;
            if (i2 < arrayList.size()) {
                ((s) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
                i2++;
            } else {
                return;
            }
        }
    }

    public final s c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1187g;
            if (i2 >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i2);
            if (sVar.f1186a == obj) {
                return sVar;
            }
            i2++;
        }
    }

    public final boolean d(Object obj) {
        if (obj == null || this.f != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1187g;
            if (i2 < arrayList.size()) {
                ((s) arrayList.get(i2)).b.decrementAndGet();
                i2++;
            } else {
                return;
            }
        }
    }

    public final int getSpanEnd(Object obj) {
        s c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        s c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        s c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanStart(obj);
    }

    public final Object[] getSpans(int i2, int i3, Class cls) {
        if (this.f != cls) {
            return super.getSpans(i2, i3, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i2, i3, s.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, sVarArr.length);
        for (int i4 = 0; i4 < sVarArr.length; i4++) {
            objArr[i4] = sVarArr[i4].f1186a;
        }
        return objArr;
    }

    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    public final int nextSpanTransition(int i2, int i3, Class<s> cls) {
        if (cls == null || this.f == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    public final void removeSpan(Object obj) {
        s sVar;
        if (d(obj)) {
            sVar = c(obj);
            if (sVar != null) {
                obj = sVar;
            }
        } else {
            sVar = null;
        }
        super.removeSpan(obj);
        if (sVar != null) {
            this.f1187g.remove(sVar);
        }
    }

    public final void setSpan(Object obj, int i2, int i3, int i4) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.f1187g.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    public final CharSequence subSequence(int i2, int i3) {
        return new t(this.f, this, i2, i3);
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m1append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m6delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m7insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m4append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final Editable insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        a();
        super.replace(i2, i3, charSequence);
        e();
        return this;
    }

    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m8insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    public t(Class cls, t tVar, int i2, int i3) {
        super(tVar, i2, i3);
        i.k("watcherClass cannot be null", cls);
        this.f = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m0append(char c2) {
        super.append(c2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m3append(char c2) {
        super.append(c2);
        return this;
    }

    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        a();
        super.replace(i2, i3, charSequence, i4, i5);
        e();
        return this;
    }

    public final Editable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m2append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m5append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
