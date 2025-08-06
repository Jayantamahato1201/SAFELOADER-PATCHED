package g0;

import A.i;
import B.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import n.C0289b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z.C0503b;
import z.C0504c;

public final class q extends h {

    /* renamed from: j  reason: collision with root package name */
    public static final PorterDuff.Mode f2858j = PorterDuff.Mode.SRC_IN;
    public o b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuffColorFilter f2859c;

    /* renamed from: d  reason: collision with root package name */
    public ColorFilter f2860d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2861e;
    public boolean f = true;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f2862g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public final Matrix f2863h = new Matrix();

    /* renamed from: i  reason: collision with root package name */
    public final Rect f2864i = new Rect();

    /* JADX WARNING: type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, g0.o] */
    public q() {
        ? constantState = new Drawable.ConstantState();
        constantState.f2848c = null;
        constantState.f2849d = f2858j;
        constantState.b = new n();
        this.b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f2811a;
        if (drawable == null) {
            return false;
        }
        a.b(drawable);
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.draw(canvas2);
            return;
        }
        Rect rect = this.f2864i;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f2860d;
            if (colorFilter == null) {
                colorFilter = this.f2859c;
            }
            Matrix matrix = this.f2863h;
            canvas2.getMatrix(matrix);
            float[] fArr = this.f2862g;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas2.save();
                canvas2.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && i.N(this) == 1) {
                    canvas2.translate((float) rect.width(), 0.0f);
                    canvas2.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                o oVar = this.b;
                Bitmap bitmap = oVar.f;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == oVar.f.getHeight())) {
                    oVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    oVar.f2855k = true;
                }
                if (!this.f) {
                    o oVar2 = this.b;
                    oVar2.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(oVar2.f);
                    n nVar = oVar2.b;
                    nVar.a(nVar.f2838g, n.f2833p, canvas3, min, min2);
                } else {
                    int i2 = min;
                    int i3 = min2;
                    o oVar3 = this.b;
                    if (!(!oVar3.f2855k && oVar3.f2851g == oVar3.f2848c && oVar3.f2852h == oVar3.f2849d && oVar3.f2854j == oVar3.f2850e && oVar3.f2853i == oVar3.b.getRootAlpha())) {
                        o oVar4 = this.b;
                        oVar4.f.eraseColor(0);
                        Canvas canvas4 = new Canvas(oVar4.f);
                        n nVar2 = oVar4.b;
                        nVar2.a(nVar2.f2838g, n.f2833p, canvas4, i2, i3);
                        o oVar5 = this.b;
                        oVar5.f2851g = oVar5.f2848c;
                        oVar5.f2852h = oVar5.f2849d;
                        oVar5.f2853i = oVar5.b.getRootAlpha();
                        oVar5.f2854j = oVar5.f2850e;
                        oVar5.f2855k = false;
                    }
                }
                o oVar6 = this.b;
                if (oVar6.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (oVar6.f2856l == null) {
                        Paint paint2 = new Paint();
                        oVar6.f2856l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    oVar6.f2856l.setAlpha(oVar6.b.getRootAlpha());
                    oVar6.f2856l.setColorFilter(colorFilter);
                    paint = oVar6.f2856l;
                }
                canvas2.drawBitmap(oVar6.f, (Rect) null, rect, paint);
                canvas2.restoreToCount(save);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.b.b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return a.c(drawable);
        }
        return this.f2860d;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f2811a != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f2811a.getConstantState());
        }
        this.b.f2847a = getChangingConfigurations();
        return this.b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.b.b.f2840i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.b.b.f2839h;
    }

    public final int getOpacity() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.b.f2850e;
    }

    public final boolean isStateful() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        o oVar = this.b;
        if (oVar == null) {
            return false;
        }
        n nVar = oVar.b;
        if (nVar.f2845n == null) {
            nVar.f2845n = Boolean.valueOf(nVar.f2838g.a());
        }
        if (nVar.f2845n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.f2848c;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, g0.o] */
    public final Drawable mutate() {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2861e && super.mutate() == this) {
            o oVar = this.b;
            ? constantState = new Drawable.ConstantState();
            constantState.f2848c = null;
            constantState.f2849d = f2858j;
            if (oVar != null) {
                constantState.f2847a = oVar.f2847a;
                n nVar = new n(oVar.b);
                constantState.b = nVar;
                if (oVar.b.f2837e != null) {
                    nVar.f2837e = new Paint(oVar.b.f2837e);
                }
                if (oVar.b.f2836d != null) {
                    constantState.b.f2836d = new Paint(oVar.b.f2836d);
                }
                constantState.f2848c = oVar.f2848c;
                constantState.f2849d = oVar.f2849d;
                constantState.f2850e = oVar.f2850e;
            }
            this.b = constantState;
            this.f2861e = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.b;
        ColorStateList colorStateList = oVar.f2848c;
        if (colorStateList == null || (mode = oVar.f2849d) == null) {
            z2 = false;
        } else {
            this.f2859c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        n nVar = oVar.b;
        if (nVar.f2845n == null) {
            nVar.f2845n = Boolean.valueOf(nVar.f2838g.a());
        }
        if (nVar.f2845n.booleanValue()) {
            boolean b2 = oVar.b.f2838g.b(iArr);
            oVar.f2855k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.b.b.getRootAlpha() != i2) {
            this.b.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.b.f2850e = z2;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f2860d = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i2) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            i.t0(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            a.h(drawable, colorStateList);
            return;
        }
        o oVar = this.b;
        if (oVar.f2848c != colorStateList) {
            oVar.f2848c = colorStateList;
            this.f2859c = a(colorStateList, oVar.f2849d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            a.i(drawable, mode);
            return;
        }
        o oVar = this.b;
        if (oVar.f2849d != mode) {
            oVar.f2849d = mode;
            this.f2859c = a(oVar.f2848c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        return super.setVisible(z2, z3);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARNING: type inference failed for: r9v19, types: [g0.m, g0.j, java.lang.Object] */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i3;
        n nVar;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.f2811a;
        if (drawable != null) {
            a.d(drawable, resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        o oVar = this.b;
        oVar.b = new n();
        TypedArray g2 = C0503b.g(resources2, theme2, attributeSet2, C0165a.f2791a);
        o oVar2 = this.b;
        n nVar2 = oVar2.b;
        if (!C0503b.d(xmlPullParser2, "tintMode")) {
            i2 = -1;
        } else {
            i2 = g2.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f2849d = mode;
        ColorStateList colorStateList = null;
        if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            g2.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i5 < 28 || i5 > 31) {
                Resources resources3 = g2.getResources();
                int resourceId = g2.getResourceId(1, 0);
                ThreadLocal threadLocal = C0504c.f4858a;
                try {
                    colorStateList = C0504c.a(resources3, resources3.getXml(resourceId), theme2);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            oVar2.f2848c = colorStateList2;
        }
        boolean z2 = oVar2.f2850e;
        if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z2 = g2.getBoolean(5, z2);
        }
        oVar2.f2850e = z2;
        float f2 = nVar2.f2841j;
        if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f2 = g2.getFloat(7, f2);
        }
        nVar2.f2841j = f2;
        float f3 = nVar2.f2842k;
        if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f3 = g2.getFloat(8, f3);
        }
        nVar2.f2842k = f3;
        if (nVar2.f2841j <= 0.0f) {
            throw new XmlPullParserException(g2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f3 > 0.0f) {
            nVar2.f2839h = g2.getDimension(3, nVar2.f2839h);
            float dimension = g2.getDimension(2, nVar2.f2840i);
            nVar2.f2840i = dimension;
            if (nVar2.f2839h <= 0.0f) {
                throw new XmlPullParserException(g2.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = nVar2.getAlpha();
                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = g2.getFloat(4, alpha);
                }
                nVar2.setAlpha(alpha);
                String string = g2.getString(0);
                if (string != null) {
                    nVar2.f2844m = string;
                    nVar2.f2846o.put(string, nVar2);
                }
                g2.recycle();
                oVar.f2847a = getChangingConfigurations();
                oVar.f2855k = true;
                o oVar3 = this.b;
                n nVar3 = oVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nVar3.f2838g);
                int eventType = xmlPullParser2.getEventType();
                int depth = xmlPullParser2.getDepth() + 1;
                boolean z3 = true;
                for (int i6 = 1; eventType != i6 && (xmlPullParser2.getDepth() >= depth || eventType != 3); i6 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser2.getName();
                        k kVar = (k) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i3 = depth;
                        C0289b bVar = nVar3.f2846o;
                        if (equals) {
                            ? mVar = new m();
                            mVar.f2813e = 0.0f;
                            mVar.f2814g = 1.0f;
                            mVar.f2815h = 1.0f;
                            nVar = nVar3;
                            mVar.f2816i = 0.0f;
                            mVar.f2817j = 1.0f;
                            mVar.f2818k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            mVar.f2819l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            mVar.f2820m = join2;
                            Paint.Join join3 = join2;
                            mVar.f2821n = 4.0f;
                            TypedArray g3 = C0503b.g(resources2, theme2, attributeSet2, C0165a.f2792c);
                            if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                Paint.Cap cap3 = cap2;
                                String string2 = g3.getString(0);
                                if (string2 != null) {
                                    mVar.b = string2;
                                }
                                String string3 = g3.getString(2);
                                if (string3 != null) {
                                    mVar.f2831a = i.z(string3);
                                }
                                mVar.f = C0503b.b(g3, xmlPullParser2, theme2, "fillColor", 1);
                                float f4 = mVar.f2815h;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f4 = g3.getFloat(12, f4);
                                }
                                mVar.f2815h = f4;
                                int i7 = xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? g3.getInt(8, -1) : -1;
                                Paint.Cap cap4 = mVar.f2819l;
                                if (i7 != 0) {
                                    cap = i7 != 1 ? i7 != 2 ? cap4 : Paint.Cap.SQUARE : Paint.Cap.ROUND;
                                } else {
                                    cap = cap3;
                                }
                                mVar.f2819l = cap;
                                int i8 = xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? g3.getInt(9, -1) : -1;
                                Paint.Join join4 = mVar.f2820m;
                                if (i8 != 0) {
                                    join = i8 != 1 ? i8 != 2 ? join4 : Paint.Join.BEVEL : Paint.Join.ROUND;
                                } else {
                                    join = join3;
                                }
                                mVar.f2820m = join;
                                float f5 = mVar.f2821n;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f5 = g3.getFloat(10, f5);
                                }
                                mVar.f2821n = f5;
                                mVar.f2812d = C0503b.b(g3, xmlPullParser2, theme2, "strokeColor", 3);
                                float f6 = mVar.f2814g;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f6 = g3.getFloat(11, f6);
                                }
                                mVar.f2814g = f6;
                                float f7 = mVar.f2813e;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f7 = g3.getFloat(4, f7);
                                }
                                mVar.f2813e = f7;
                                float f8 = mVar.f2817j;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f8 = g3.getFloat(6, f8);
                                }
                                mVar.f2817j = f8;
                                float f9 = mVar.f2818k;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f9 = g3.getFloat(7, f9);
                                }
                                mVar.f2818k = f9;
                                float f10 = mVar.f2816i;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f10 = g3.getFloat(5, f10);
                                }
                                mVar.f2816i = f10;
                                int i9 = mVar.f2832c;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i9 = g3.getInt(13, i9);
                                }
                                mVar.f2832c = i9;
                            }
                            g3.recycle();
                            kVar.b.add(mVar);
                            if (mVar.getPathName() != null) {
                                bVar.put(mVar.getPathName(), mVar);
                            }
                            oVar3.f2847a = oVar3.f2847a;
                            z3 = false;
                        } else {
                            nVar = nVar3;
                            if ("clip-path".equals(name)) {
                                m mVar2 = new m();
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray g4 = C0503b.g(resources2, theme2, attributeSet2, C0165a.f2793d);
                                    String string4 = g4.getString(0);
                                    if (string4 != null) {
                                        mVar2.b = string4;
                                    }
                                    String string5 = g4.getString(1);
                                    if (string5 != null) {
                                        mVar2.f2831a = i.z(string5);
                                    }
                                    if (!C0503b.d(xmlPullParser2, "fillType")) {
                                        i4 = 0;
                                    } else {
                                        i4 = g4.getInt(2, 0);
                                    }
                                    mVar2.f2832c = i4;
                                    g4.recycle();
                                }
                                kVar.b.add(mVar2);
                                if (mVar2.getPathName() != null) {
                                    bVar.put(mVar2.getPathName(), mVar2);
                                }
                                oVar3.f2847a = oVar3.f2847a;
                            } else if ("group".equals(name)) {
                                k kVar2 = new k();
                                TypedArray g5 = C0503b.g(resources2, theme2, attributeSet2, C0165a.b);
                                float f11 = kVar2.f2823c;
                                if (C0503b.d(xmlPullParser2, "rotation")) {
                                    f11 = g5.getFloat(5, f11);
                                }
                                kVar2.f2823c = f11;
                                kVar2.f2824d = g5.getFloat(1, kVar2.f2824d);
                                kVar2.f2825e = g5.getFloat(2, kVar2.f2825e);
                                float f12 = kVar2.f;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f12 = g5.getFloat(3, f12);
                                }
                                kVar2.f = f12;
                                float f13 = kVar2.f2826g;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f13 = g5.getFloat(4, f13);
                                }
                                kVar2.f2826g = f13;
                                float f14 = kVar2.f2827h;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f14 = g5.getFloat(6, f14);
                                }
                                kVar2.f2827h = f14;
                                float f15 = kVar2.f2828i;
                                if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f15 = g5.getFloat(7, f15);
                                }
                                kVar2.f2828i = f15;
                                String string6 = g5.getString(0);
                                if (string6 != null) {
                                    kVar2.f2830k = string6;
                                }
                                kVar2.c();
                                g5.recycle();
                                kVar.b.add(kVar2);
                                arrayDeque.push(kVar2);
                                if (kVar2.getGroupName() != null) {
                                    bVar.put(kVar2.getGroupName(), kVar2);
                                }
                                oVar3.f2847a = oVar3.f2847a;
                            }
                        }
                    } else {
                        nVar = nVar3;
                        i3 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser2.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser2.next();
                    nVar3 = nVar;
                    depth = i3;
                }
                if (!z3) {
                    this.f2859c = a(oVar.f2848c, oVar.f2849d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(g2.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(g2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public q(o oVar) {
        this.b = oVar;
        this.f2859c = a(oVar.f2848c, oVar.f2849d);
    }
}
