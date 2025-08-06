package H0;

import E0.g;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: H0.h  reason: case insensitive filesystem */
public final class C0007h extends g {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f294y = 0;

    /* renamed from: x  reason: collision with root package name */
    public C0006g f295x;

    public final void e(Canvas canvas) {
        if (this.f295x.f293q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f295x.f293q);
        } else {
            canvas.clipRect(this.f295x.f293q, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }

    public final Drawable mutate() {
        this.f295x = new C0006g(this.f295x);
        return this;
    }

    public final void n(float f, float f2, float f3, float f4) {
        RectF rectF = this.f295x.f293q;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
