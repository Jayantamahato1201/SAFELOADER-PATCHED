package k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

public final class w1 implements C0266s0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f3579a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public View f3580c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f3581d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f3582e;
    public Drawable f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3583g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f3584h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f3585i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f3586j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f3587k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3588l;

    /* renamed from: m  reason: collision with root package name */
    public C0248j f3589m;

    /* renamed from: n  reason: collision with root package name */
    public int f3590n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f3591o;

    public final void a(int i2) {
        View view;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i4 = this.b & 4;
                Toolbar toolbar = this.f3579a;
                if (i4 != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.f3591o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f3579a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f3584h);
                    toolbar2.setSubtitle(this.f3585i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.f3580c) != null) {
                if ((i2 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f3586j);
            Toolbar toolbar = this.f3579a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f3590n);
            } else {
                toolbar.setNavigationContentDescription(this.f3586j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f3582e;
            if (drawable == null) {
                drawable = this.f3581d;
            }
        } else {
            drawable = this.f3581d;
        }
        this.f3579a.setLogo(drawable);
    }
}
