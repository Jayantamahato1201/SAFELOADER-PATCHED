package k;

import A.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.cheatbox.R;
import t0.C0486a;

/* renamed from: k.s  reason: case insensitive filesystem */
public final class C0265s {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f3559a = {R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin};
    public final int[] b = {R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin};

    /* renamed from: c  reason: collision with root package name */
    public final int[] f3560c = {R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin};

    /* renamed from: d  reason: collision with root package name */
    public final int[] f3561d = {R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin};

    /* renamed from: e  reason: collision with root package name */
    public final int[] f3562e = {R.drawable.MT_Bin, R.drawable.MT_Bin};
    public final int[] f = {R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin, R.drawable.MT_Bin};

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i2) {
        int c2 = l1.c(context, R.attr.MT_Bin);
        int b2 = l1.b(context, R.attr.MT_Bin);
        int b3 = a.b(c2, i2);
        int b4 = a.b(c2, i2);
        return new ColorStateList(new int[][]{l1.b, l1.f3523d, l1.f3522c, l1.f}, new int[]{b2, b3, b4, i2});
    }

    public static LayerDrawable c(U0 u02, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable f2 = u02.f(context, R.drawable.MT_Bin);
        Drawable f3 = u02.f(context, R.drawable.MT_Bin);
        if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) f2;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f2.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((f3 instanceof BitmapDrawable) && f3.getIntrinsicWidth() == dimensionPixelSize && f3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f3;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f3.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
        int[] iArr = C0268t0.f3566a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0267t.b;
        }
        mutate.setColorFilter(C0267t.c(i2, mode));
    }

    public final ColorStateList d(Context context, int i2) {
        if (i2 == R.drawable.MT_Bin) {
            return C0486a.g(context, R.color.MT_Bin);
        }
        if (i2 == R.drawable.MT_Bin) {
            return C0486a.g(context, R.color.MT_Bin);
        }
        if (i2 == R.drawable.MT_Bin) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d2 = l1.d(context, R.attr.MT_Bin);
            if (d2 == null || !d2.isStateful()) {
                iArr[0] = l1.b;
                iArr2[0] = l1.b(context, R.attr.MT_Bin);
                iArr[1] = l1.f3524e;
                iArr2[1] = l1.c(context, R.attr.MT_Bin);
                iArr[2] = l1.f;
                iArr2[2] = l1.c(context, R.attr.MT_Bin);
            } else {
                int[] iArr3 = l1.b;
                iArr[0] = iArr3;
                iArr2[0] = d2.getColorForState(iArr3, 0);
                iArr[1] = l1.f3524e;
                iArr2[1] = l1.c(context, R.attr.MT_Bin);
                iArr[2] = l1.f;
                iArr2[2] = d2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i2 == R.drawable.MT_Bin) {
            return b(context, l1.c(context, R.attr.MT_Bin));
        } else {
            if (i2 == R.drawable.MT_Bin) {
                return b(context, 0);
            }
            if (i2 == R.drawable.MT_Bin) {
                return b(context, l1.c(context, R.attr.MT_Bin));
            }
            if (i2 == R.drawable.MT_Bin || i2 == R.drawable.MT_Bin) {
                return C0486a.g(context, R.color.MT_Bin);
            }
            if (a(this.b, i2)) {
                return l1.d(context, R.attr.MT_Bin);
            }
            if (a(this.f3562e, i2)) {
                return C0486a.g(context, R.color.MT_Bin);
            }
            if (a(this.f, i2)) {
                return C0486a.g(context, R.color.MT_Bin);
            }
            if (i2 == R.drawable.MT_Bin) {
                return C0486a.g(context, R.color.MT_Bin);
            }
            return null;
        }
    }
}
