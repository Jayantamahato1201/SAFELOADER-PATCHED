package k;

import A.i;
import I.O;
import N.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import com.cheatbox.R;
import d.a;

public final class I extends D {

    /* renamed from: e  reason: collision with root package name */
    public final H f3357e;
    public Drawable f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f3358g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f3359h = null;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3360i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3361j = false;

    public I(H h2) {
        super((AbsSeekBar) h2);
        this.f3357e = h2;
    }

    public final void b(AttributeSet attributeSet, int i2) {
        super.b(attributeSet, R.attr.MT_Bin);
        H h2 = this.f3357e;
        Context context = h2.getContext();
        int[] iArr = a.f2197g;
        g E2 = g.E(context, attributeSet, iArr, R.attr.MT_Bin);
        O.o(h2, h2.getContext(), iArr, attributeSet, (TypedArray) E2.f606c, R.attr.MT_Bin);
        Drawable r2 = E2.r(0);
        if (r2 != null) {
            h2.setThumb(r2);
        }
        Drawable p2 = E2.p(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f = p2;
        if (p2 != null) {
            p2.setCallback(h2);
            i.p0(p2, h2.getLayoutDirection());
            if (p2.isStateful()) {
                p2.setState(h2.getDrawableState());
            }
            f();
        }
        h2.invalidate();
        TypedArray typedArray = (TypedArray) E2.f606c;
        if (typedArray.hasValue(3)) {
            this.f3359h = C0268t0.b(typedArray.getInt(3, -1), this.f3359h);
            this.f3361j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f3358g = E2.o(2);
            this.f3360i = true;
        }
        E2.F();
        f();
    }

    public final void f() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return;
        }
        if (this.f3360i || this.f3361j) {
            Drawable y02 = i.y0(drawable.mutate());
            this.f = y02;
            if (this.f3360i) {
                B.a.h(y02, this.f3358g);
            }
            if (this.f3361j) {
                B.a.i(this.f, this.f3359h);
            }
            if (this.f.isStateful()) {
                this.f.setState(this.f3357e.getDrawableState());
            }
        }
    }

    public final void g(Canvas canvas) {
        int i2;
        if (this.f != null) {
            H h2 = this.f3357e;
            int max = h2.getMax();
            int i3 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f.getIntrinsicWidth();
                int intrinsicHeight = this.f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i2 = intrinsicWidth / 2;
                } else {
                    i2 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i3 = intrinsicHeight / 2;
                }
                this.f.setBounds(-i2, -i3, i2, i3);
                float width = ((float) ((h2.getWidth() - h2.getPaddingLeft()) - h2.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) h2.getPaddingLeft(), (float) (h2.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
