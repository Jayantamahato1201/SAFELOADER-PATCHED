package E0;

import A.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import j0.C0219a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public i f149a = new Object();
    public i b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public i f150c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public i f151d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public c f152e = new a(0.0f);
    public c f = new a(0.0f);

    /* renamed from: g  reason: collision with root package name */
    public c f153g = new a(0.0f);

    /* renamed from: h  reason: collision with root package name */
    public c f154h = new a(0.0f);

    /* renamed from: i  reason: collision with root package name */
    public e f155i = new e(0);

    /* renamed from: j  reason: collision with root package name */
    public e f156j = new e(0);

    /* renamed from: k  reason: collision with root package name */
    public e f157k = new e(0);

    /* renamed from: l  reason: collision with root package name */
    public e f158l = new e(0);

    public static j a(Context context, int i2, int i3, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C0219a.f3195v);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            c c2 = c(obtainStyledAttributes, 5, aVar);
            c c3 = c(obtainStyledAttributes, 8, c2);
            c c4 = c(obtainStyledAttributes, 9, c2);
            c c5 = c(obtainStyledAttributes, 7, c2);
            c c6 = c(obtainStyledAttributes, 6, c2);
            j jVar = new j();
            i u2 = i.u(i5);
            jVar.f139a = u2;
            j.b(u2);
            jVar.f142e = c3;
            i u3 = i.u(i6);
            jVar.b = u3;
            j.b(u3);
            jVar.f = c4;
            i u4 = i.u(i7);
            jVar.f140c = u4;
            j.b(u4);
            jVar.f143g = c5;
            i u5 = i.u(i8);
            jVar.f141d = u5;
            j.b(u5);
            jVar.f144h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0219a.f3189p, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            int i3 = peekValue.type;
            if (i3 == 5) {
                return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i3 == 6) {
                return new h(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z2;
        boolean z3;
        boolean z4;
        Class<e> cls = e.class;
        if (!this.f158l.getClass().equals(cls) || !this.f156j.getClass().equals(cls) || !this.f155i.getClass().equals(cls) || !this.f157k.getClass().equals(cls)) {
            z2 = false;
        } else {
            z2 = true;
        }
        float a2 = this.f152e.a(rectF);
        if (this.f.a(rectF) == a2 && this.f154h.a(rectF) == a2 && this.f153g.a(rectF) == a2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(this.b instanceof i) || !(this.f149a instanceof i) || !(this.f150c instanceof i) || !(this.f151d instanceof i)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [E0.j, java.lang.Object] */
    public final j e() {
        ? obj = new Object();
        obj.f139a = this.f149a;
        obj.b = this.b;
        obj.f140c = this.f150c;
        obj.f141d = this.f151d;
        obj.f142e = this.f152e;
        obj.f = this.f;
        obj.f143g = this.f153g;
        obj.f144h = this.f154h;
        obj.f145i = this.f155i;
        obj.f146j = this.f156j;
        obj.f147k = this.f157k;
        obj.f148l = this.f158l;
        return obj;
    }
}
