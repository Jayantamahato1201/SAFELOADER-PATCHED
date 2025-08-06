package y0;

import A.i;
import B0.a;
import G.j;
import G.k;
import I.O;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import k0.C0281a;

/* renamed from: y0.b  reason: case insensitive filesystem */
public final class C0500b {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f4767A;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f4768B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f4769C;
    public final boolean D = true;

    /* renamed from: E  reason: collision with root package name */
    public Bitmap f4770E;

    /* renamed from: F  reason: collision with root package name */
    public float f4771F;

    /* renamed from: G  reason: collision with root package name */
    public float f4772G;

    /* renamed from: H  reason: collision with root package name */
    public float f4773H;

    /* renamed from: I  reason: collision with root package name */
    public float f4774I;

    /* renamed from: J  reason: collision with root package name */
    public float f4775J;

    /* renamed from: K  reason: collision with root package name */
    public int f4776K;

    /* renamed from: L  reason: collision with root package name */
    public int[] f4777L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f4778M;

    /* renamed from: N  reason: collision with root package name */
    public final TextPaint f4779N;

    /* renamed from: O  reason: collision with root package name */
    public final TextPaint f4780O;

    /* renamed from: P  reason: collision with root package name */
    public LinearInterpolator f4781P;

    /* renamed from: Q  reason: collision with root package name */
    public LinearInterpolator f4782Q;

    /* renamed from: R  reason: collision with root package name */
    public float f4783R;

    /* renamed from: S  reason: collision with root package name */
    public float f4784S;

    /* renamed from: T  reason: collision with root package name */
    public float f4785T;

    /* renamed from: U  reason: collision with root package name */
    public ColorStateList f4786U;

    /* renamed from: V  reason: collision with root package name */
    public float f4787V;

    /* renamed from: W  reason: collision with root package name */
    public float f4788W;

    /* renamed from: X  reason: collision with root package name */
    public float f4789X;

    /* renamed from: Y  reason: collision with root package name */
    public StaticLayout f4790Y;

    /* renamed from: Z  reason: collision with root package name */
    public float f4791Z;

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f4792a;

    /* renamed from: a0  reason: collision with root package name */
    public float f4793a0;
    public float b;

    /* renamed from: b0  reason: collision with root package name */
    public float f4794b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4795c;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f4796c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f4797d;

    /* renamed from: d0  reason: collision with root package name */
    public final int f4798d0 = 1;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f4799e;
    public final float e0 = 1.0f;
    public int f = 16;

    /* renamed from: f0  reason: collision with root package name */
    public final int f4800f0 = h.f4828l;

    /* renamed from: g  reason: collision with root package name */
    public int f4801g = 16;

    /* renamed from: h  reason: collision with root package name */
    public float f4802h = 15.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f4803i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f4804j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f4805k;

    /* renamed from: l  reason: collision with root package name */
    public float f4806l;

    /* renamed from: m  reason: collision with root package name */
    public float f4807m;

    /* renamed from: n  reason: collision with root package name */
    public float f4808n;

    /* renamed from: o  reason: collision with root package name */
    public float f4809o;

    /* renamed from: p  reason: collision with root package name */
    public float f4810p;

    /* renamed from: q  reason: collision with root package name */
    public float f4811q;

    /* renamed from: r  reason: collision with root package name */
    public Typeface f4812r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f4813s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f4814t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f4815u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f4816v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f4817w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f4818x;

    /* renamed from: y  reason: collision with root package name */
    public a f4819y;

    /* renamed from: z  reason: collision with root package name */
    public final TextUtils.TruncateAt f4820z = TextUtils.TruncateAt.END;

    public C0500b(TextInputLayout textInputLayout) {
        this.f4792a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f4779N = textPaint;
        this.f4780O = new TextPaint(textPaint);
        this.f4797d = new Rect();
        this.f4795c = new Rect();
        this.f4799e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((((float) Color.alpha(i3)) * f2) + (((float) Color.alpha(i2)) * f3)), Math.round((((float) Color.red(i3)) * f2) + (((float) Color.red(i2)) * f3)), Math.round((((float) Color.green(i3)) * f2) + (((float) Color.green(i2)) * f3)), Math.round((((float) Color.blue(i3)) * f2) + (((float) Color.blue(i2)) * f3)));
    }

    public static float f(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return C0281a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        j jVar;
        WeakHashMap weakHashMap = O.f393a;
        boolean z2 = true;
        if (this.f4792a.getLayoutDirection() != 1) {
            z2 = false;
        }
        if (!this.D) {
            return z2;
        }
        if (z2) {
            jVar = k.f249d;
        } else {
            jVar = k.f248c;
        }
        return jVar.b(charSequence, charSequence.length());
    }

    public final void c(float f2, boolean z2) {
        boolean z3;
        float f3;
        float f4;
        Typeface typeface;
        boolean z4;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        if (this.f4767A != null) {
            float width = (float) this.f4797d.width();
            float width2 = (float) this.f4795c.width();
            if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                f4 = this.f4803i;
                f3 = this.f4787V;
                this.f4771F = 1.0f;
                typeface = this.f4812r;
            } else {
                float f5 = this.f4802h;
                float f6 = this.f4788W;
                Typeface typeface2 = this.f4815u;
                if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                    this.f4771F = 1.0f;
                } else {
                    this.f4771F = f(this.f4802h, this.f4803i, f2, this.f4782Q) / this.f4802h;
                }
                float f7 = this.f4803i / this.f4802h;
                float f8 = width2 * f7;
                if (z2 || f8 <= width) {
                    width = width2;
                } else {
                    width = Math.min(width / f7, width2);
                }
                f4 = f5;
                f3 = f6;
                typeface = typeface2;
            }
            TextPaint textPaint = this.f4779N;
            if (width > 0.0f) {
                if (this.f4772G != f4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.f4789X != f3) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (this.f4818x != typeface) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                StaticLayout staticLayout2 = this.f4790Y;
                if (staticLayout2 == null || width == ((float) staticLayout2.getWidth())) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (z5 || z6 || z8 || z7 || this.f4778M) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f4772G = f4;
                this.f4789X = f3;
                this.f4818x = typeface;
                this.f4778M = false;
                if (this.f4771F != 1.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                textPaint.setLinearText(z9);
            } else {
                z4 = false;
            }
            if (this.f4768B == null || z4) {
                textPaint.setTextSize(this.f4772G);
                textPaint.setTypeface(this.f4818x);
                textPaint.setLetterSpacing(this.f4789X);
                boolean b2 = b(this.f4767A);
                this.f4769C = b2;
                int i2 = this.f4798d0;
                if (i2 <= 1 || b2) {
                    i2 = 1;
                }
                if (i2 == 1) {
                    try {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } catch (g e2) {
                        Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                        staticLayout = null;
                    }
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f, b2 ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        if (this.f4769C) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.f4769C) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                }
                h hVar = new h(this.f4767A, textPaint, (int) width);
                hVar.f4840k = this.f4820z;
                hVar.f4839j = b2;
                hVar.f4835e = alignment;
                hVar.f4838i = false;
                hVar.f = i2;
                hVar.f4836g = this.e0;
                hVar.f4837h = this.f4800f0;
                staticLayout = hVar.a();
                staticLayout.getClass();
                this.f4790Y = staticLayout;
                this.f4768B = staticLayout.getText();
            }
        }
    }

    public final float d() {
        TextPaint textPaint = this.f4780O;
        textPaint.setTextSize(this.f4803i);
        textPaint.setTypeface(this.f4812r);
        textPaint.setLetterSpacing(this.f4787V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f4777L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f4814t;
            if (typeface != null) {
                this.f4813s = i.b0(configuration, typeface);
            }
            Typeface typeface2 = this.f4817w;
            if (typeface2 != null) {
                this.f4816v = i.b0(configuration, typeface2);
            }
            Typeface typeface3 = this.f4813s;
            if (typeface3 == null) {
                typeface3 = this.f4814t;
            }
            this.f4812r = typeface3;
            Typeface typeface4 = this.f4816v;
            if (typeface4 == null) {
                typeface4 = this.f4817w;
            }
            this.f4815u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float f2;
        float f3;
        StaticLayout staticLayout;
        boolean z3 = z2;
        TextInputLayout textInputLayout = this.f4792a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z3) {
            c(1.0f, z3);
            CharSequence charSequence = this.f4768B;
            TextPaint textPaint = this.f4779N;
            if (!(charSequence == null || (staticLayout = this.f4790Y) == null)) {
                this.f4796c0 = TextUtils.ellipsize(charSequence, textPaint, (float) staticLayout.getWidth(), this.f4820z);
            }
            CharSequence charSequence2 = this.f4796c0;
            if (charSequence2 != null) {
                this.f4791Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f4791Z = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f4801g, this.f4769C ? 1 : 0);
            int i2 = absoluteGravity & 112;
            Rect rect = this.f4797d;
            if (i2 == 48) {
                this.f4807m = (float) rect.top;
            } else if (i2 != 80) {
                this.f4807m = ((float) rect.centerY()) - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                this.f4807m = textPaint.ascent() + ((float) rect.bottom);
            }
            int i3 = absoluteGravity & 8388615;
            if (i3 == 1) {
                this.f4809o = ((float) rect.centerX()) - (this.f4791Z / 2.0f);
            } else if (i3 != 5) {
                this.f4809o = (float) rect.left;
            } else {
                this.f4809o = ((float) rect.right) - this.f4791Z;
            }
            c(0.0f, z3);
            StaticLayout staticLayout2 = this.f4790Y;
            if (staticLayout2 != null) {
                f2 = (float) staticLayout2.getHeight();
            } else {
                f2 = 0.0f;
            }
            StaticLayout staticLayout3 = this.f4790Y;
            if (staticLayout3 == null || this.f4798d0 <= 1) {
                CharSequence charSequence3 = this.f4768B;
                if (charSequence3 != null) {
                    f3 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f3 = 0.0f;
                }
            } else {
                f3 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.f4790Y;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.f4769C ? 1 : 0);
            int i4 = absoluteGravity2 & 112;
            Rect rect2 = this.f4795c;
            if (i4 == 48) {
                this.f4806l = (float) rect2.top;
            } else if (i4 != 80) {
                this.f4806l = ((float) rect2.centerY()) - (f2 / 2.0f);
            } else {
                this.f4806l = textPaint.descent() + (((float) rect2.bottom) - f2);
            }
            int i5 = absoluteGravity2 & 8388615;
            if (i5 == 1) {
                this.f4808n = ((float) rect2.centerX()) - (f3 / 2.0f);
            } else if (i5 != 5) {
                this.f4808n = (float) rect2.left;
            } else {
                this.f4808n = ((float) rect2.right) - f3;
            }
            Bitmap bitmap = this.f4770E;
            if (bitmap != null) {
                bitmap.recycle();
                this.f4770E = null;
            }
            l(this.b);
            float f4 = this.b;
            float f5 = f((float) rect2.left, (float) rect.left, f4, this.f4781P);
            RectF rectF = this.f4799e;
            rectF.left = f5;
            rectF.top = f(this.f4806l, this.f4807m, f4, this.f4781P);
            rectF.right = f((float) rect2.right, (float) rect.right, f4, this.f4781P);
            rectF.bottom = f((float) rect2.bottom, (float) rect.bottom, f4, this.f4781P);
            this.f4810p = f(this.f4808n, this.f4809o, f4, this.f4781P);
            this.f4811q = f(this.f4806l, this.f4807m, f4, this.f4781P);
            l(f4);
            W.a aVar = C0281a.b;
            this.f4793a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f4, aVar);
            WeakHashMap weakHashMap = O.f393a;
            textInputLayout.postInvalidateOnAnimation();
            this.f4794b0 = f(1.0f, 0.0f, f4, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f4805k;
            ColorStateList colorStateList2 = this.f4804j;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f4805k), f4));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f6 = this.f4787V;
            float f7 = this.f4788W;
            if (f6 != f7) {
                textPaint.setLetterSpacing(f(f7, f6, f4, aVar));
            } else {
                textPaint.setLetterSpacing(f6);
            }
            this.f4773H = C0281a.a(0.0f, this.f4783R, f4);
            this.f4774I = C0281a.a(0.0f, this.f4784S, f4);
            this.f4775J = C0281a.a(0.0f, this.f4785T, f4);
            int a2 = a(0, e(this.f4786U), f4);
            this.f4776K = a2;
            textPaint.setShadowLayer(this.f4773H, this.f4774I, this.f4775J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f4805k != colorStateList || this.f4804j != colorStateList) {
            this.f4805k = colorStateList;
            this.f4804j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        a aVar = this.f4819y;
        if (aVar != null) {
            aVar.f53q = true;
        }
        if (this.f4814t == typeface) {
            return false;
        }
        this.f4814t = typeface;
        Typeface b02 = i.b0(this.f4792a.getContext().getResources().getConfiguration(), typeface);
        this.f4813s = b02;
        if (b02 == null) {
            b02 = this.f4814t;
        }
        this.f4812r = b02;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.b) {
            this.b = f2;
            Rect rect = this.f4795c;
            Rect rect2 = this.f4797d;
            float f3 = f((float) rect.left, (float) rect2.left, f2, this.f4781P);
            RectF rectF = this.f4799e;
            rectF.left = f3;
            rectF.top = f(this.f4806l, this.f4807m, f2, this.f4781P);
            rectF.right = f((float) rect.right, (float) rect2.right, f2, this.f4781P);
            rectF.bottom = f((float) rect.bottom, (float) rect2.bottom, f2, this.f4781P);
            this.f4810p = f(this.f4808n, this.f4809o, f2, this.f4781P);
            this.f4811q = f(this.f4806l, this.f4807m, f2, this.f4781P);
            l(f2);
            W.a aVar = C0281a.b;
            this.f4793a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
            WeakHashMap weakHashMap = O.f393a;
            TextInputLayout textInputLayout = this.f4792a;
            textInputLayout.postInvalidateOnAnimation();
            this.f4794b0 = f(1.0f, 0.0f, f2, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f4805k;
            ColorStateList colorStateList2 = this.f4804j;
            TextPaint textPaint = this.f4779N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f4805k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f4 = this.f4787V;
            float f5 = this.f4788W;
            if (f4 != f5) {
                textPaint.setLetterSpacing(f(f5, f4, f2, aVar));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            this.f4773H = C0281a.a(0.0f, this.f4783R, f2);
            this.f4774I = C0281a.a(0.0f, this.f4784S, f2);
            this.f4775J = C0281a.a(0.0f, this.f4785T, f2);
            int a2 = a(0, e(this.f4786U), f2);
            this.f4776K = a2;
            textPaint.setShadowLayer(this.f4773H, this.f4774I, this.f4775J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = O.f393a;
        this.f4792a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f4817w != typeface) {
            this.f4817w = typeface;
            Typeface b02 = i.b0(this.f4792a.getContext().getResources().getConfiguration(), typeface);
            this.f4816v = b02;
            if (b02 == null) {
                b02 = this.f4817w;
            }
            this.f4815u = b02;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
