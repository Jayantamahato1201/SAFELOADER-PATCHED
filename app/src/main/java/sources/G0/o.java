package g0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class o extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f2847a;
    public n b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f2848c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f2849d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2850e;
    public Bitmap f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2851g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f2852h;

    /* renamed from: i  reason: collision with root package name */
    public int f2853i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2854j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2855k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f2856l;

    public int getChangingConfigurations() {
        return this.f2847a;
    }

    public final Drawable newDrawable() {
        return new q(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
