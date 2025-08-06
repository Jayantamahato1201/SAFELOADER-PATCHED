package B0;

import A.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import j0.C0219a;
import z.C0503b;
import z.C0515n;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f60a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final int f61c;

    /* renamed from: d  reason: collision with root package name */
    public final int f62d;

    /* renamed from: e  reason: collision with root package name */
    public final float f63e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final float f64g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f65h;

    /* renamed from: i  reason: collision with root package name */
    public final float f66i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f67j;

    /* renamed from: k  reason: collision with root package name */
    public float f68k;

    /* renamed from: l  reason: collision with root package name */
    public final int f69l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f70m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f71n;

    public d(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, C0219a.f3199z);
        this.f68k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f67j = i.H(context, obtainStyledAttributes, 3);
        i.H(context, obtainStyledAttributes, 4);
        i.H(context, obtainStyledAttributes, 5);
        this.f61c = obtainStyledAttributes.getInt(2, 0);
        this.f62d = obtainStyledAttributes.getInt(1, 1);
        int i3 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f69l = obtainStyledAttributes.getResourceId(i3, 0);
        this.b = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.f60a = i.H(context, obtainStyledAttributes, 6);
        this.f63e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f64g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, C0219a.f3190q);
        this.f65h = obtainStyledAttributes2.hasValue(0);
        this.f66i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f71n;
        int i2 = this.f61c;
        if (typeface == null && (str = this.b) != null) {
            this.f71n = Typeface.create(str, i2);
        }
        if (this.f71n == null) {
            int i3 = this.f62d;
            if (i3 == 1) {
                this.f71n = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f71n = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f71n = Typeface.DEFAULT;
            } else {
                this.f71n = Typeface.MONOSPACE;
            }
            this.f71n = Typeface.create(this.f71n, i2);
        }
    }

    public final Typeface b(Context context) {
        if (this.f70m) {
            return this.f71n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b2 = C0515n.b(context, this.f69l);
                this.f71n = b2;
                if (b2 != null) {
                    this.f71n = Typeface.create(b2, this.f61c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.b, e2);
            }
        }
        a();
        this.f70m = true;
        return this.f71n;
    }

    public final void c(Context context, i iVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i2 = this.f69l;
        if (i2 == 0) {
            this.f70m = true;
        }
        if (this.f70m) {
            iVar.e0(this.f71n, true);
            return;
        }
        try {
            b bVar = new b(this, iVar);
            ThreadLocal threadLocal = C0515n.f4870a;
            if (context.isRestricted()) {
                bVar.a(-4);
                return;
            }
            C0515n.c(context, i2, new TypedValue(), 0, bVar, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f70m = true;
            iVar.d0(1);
        } catch (Exception e2) {
            Exception exc = e2;
            Log.d("TextAppearance", "Error loading font " + this.b, exc);
            this.f70m = true;
            iVar.d0(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i2 = this.f69l;
        if (i2 != 0) {
            ThreadLocal threadLocal = C0515n.f4870a;
            if (!context.isRestricted()) {
                typeface = C0515n.c(context, i2, new TypedValue(), 0, (C0503b) null, false, true);
            }
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public final void e(Context context, TextPaint textPaint, i iVar) {
        int i2;
        int i3;
        f(context, textPaint, iVar);
        ColorStateList colorStateList = this.f67j;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i2 = -16777216;
        }
        textPaint.setColor(i2);
        ColorStateList colorStateList2 = this.f60a;
        if (colorStateList2 != null) {
            i3 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i3 = 0;
        }
        textPaint.setShadowLayer(this.f64g, this.f63e, this.f, i3);
    }

    public final void f(Context context, TextPaint textPaint, i iVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f71n);
        c(context, new c(this, context, textPaint, iVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z2;
        float f2;
        Typeface b02 = i.b0(context.getResources().getConfiguration(), typeface);
        if (b02 != null) {
            typeface = b02;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f61c;
        if ((i2 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        textPaint.setFakeBoldText(z2);
        if ((i2 & 2) != 0) {
            f2 = -0.25f;
        } else {
            f2 = 0.0f;
        }
        textPaint.setTextSkewX(f2);
        textPaint.setTextSize(this.f68k);
        if (this.f65h) {
            textPaint.setLetterSpacing(this.f66i);
        }
    }
}
