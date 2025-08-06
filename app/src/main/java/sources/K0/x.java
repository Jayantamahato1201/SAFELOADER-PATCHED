package K0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class x extends BitmapDrawable {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f582e = 0;

    /* renamed from: a  reason: collision with root package name */
    public Drawable f583a;
    public final long b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f584c;

    /* renamed from: d  reason: collision with root package name */
    public int f585d = 255;

    static {
        new Paint();
    }

    public x(Context context, Bitmap bitmap, Drawable drawable, int i2) {
        super(context.getResources(), bitmap);
        float f = context.getResources().getDisplayMetrics().density;
        if (i2 != 1) {
            this.f583a = drawable;
            this.f584c = true;
            this.b = SystemClock.uptimeMillis();
        }
    }

    public final void draw(Canvas canvas) {
        if (!this.f584c) {
            super.draw(canvas);
            return;
        }
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.b)) / 200.0f;
        if (uptimeMillis >= 1.0f) {
            this.f584c = false;
            this.f583a = null;
            super.draw(canvas);
            return;
        }
        Drawable drawable = this.f583a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        super.setAlpha((int) (((float) this.f585d) * uptimeMillis));
        super.draw(canvas);
        super.setAlpha(this.f585d);
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f583a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i2) {
        this.f585d = i2;
        Drawable drawable = this.f583a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        super.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f583a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
