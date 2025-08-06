package E0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import w0.C0492a;

public class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public k f103a;
    public C0492a b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f104c = null;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f105d = null;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f106e = null;
    public PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    public Rect f107g = null;

    /* renamed from: h  reason: collision with root package name */
    public final float f108h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f109i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f110j;

    /* renamed from: k  reason: collision with root package name */
    public int f111k = 255;

    /* renamed from: l  reason: collision with root package name */
    public float f112l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f113m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public int f114n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f115o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Paint.Style f116p = Paint.Style.FILL_AND_STROKE;

    public f(k kVar) {
        this.f103a = kVar;
        this.b = null;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f121e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f103a = fVar.f103a;
        this.b = fVar.b;
        this.f110j = fVar.f110j;
        this.f104c = fVar.f104c;
        this.f105d = fVar.f105d;
        this.f = fVar.f;
        this.f106e = fVar.f106e;
        this.f111k = fVar.f111k;
        this.f108h = fVar.f108h;
        this.f115o = fVar.f115o;
        this.f109i = fVar.f109i;
        this.f112l = fVar.f112l;
        this.f113m = fVar.f113m;
        this.f114n = fVar.f114n;
        this.f116p = fVar.f116p;
        if (fVar.f107g != null) {
            this.f107g = new Rect(fVar.f107g);
        }
    }
}
