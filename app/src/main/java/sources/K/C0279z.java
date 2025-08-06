package k;

import Q0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import d1.n;

/* renamed from: k.z  reason: case insensitive filesystem */
public class C0279z extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public final C0258o f3600a;
    public final C0277y b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3601c = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0279z(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        m1.a(context);
        l1.a(this, getContext());
        C0258o oVar = new C0258o(this);
        this.f3600a = oVar;
        oVar.d(attributeSet, i2);
        C0277y yVar = new C0277y(this);
        this.b = yVar;
        yVar.b(attributeSet, i2);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0258o oVar = this.f3600a;
        if (oVar != null) {
            oVar.a();
        }
        C0277y yVar = this.b;
        if (yVar != null) {
            yVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0258o oVar = this.f3600a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0258o oVar = this.f3600a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        n nVar;
        C0277y yVar = this.b;
        if (yVar == null || (nVar = yVar.b) == null) {
            return null;
        }
        return (ColorStateList) nVar.f2338c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar;
        C0277y yVar = this.b;
        if (yVar == null || (nVar = yVar.b) == null) {
            return null;
        }
        return (PorterDuff.Mode) nVar.f2339d;
    }

    public final boolean hasOverlappingRendering() {
        if ((this.b.f3595a.getBackground() instanceof RippleDrawable) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0258o oVar = this.f3600a;
        if (oVar != null) {
            oVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0258o oVar = this.f3600a;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0277y yVar = this.b;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C0277y yVar = this.b;
        if (!(yVar == null || drawable == null || this.f3601c)) {
            yVar.f3597d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (yVar != null) {
            yVar.a();
            if (!this.f3601c) {
                ImageView imageView = yVar.f3595a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(yVar.f3597d);
                }
            }
        }
    }

    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f3601c = true;
    }

    public void setImageResource(int i2) {
        C0277y yVar = this.b;
        if (yVar != null) {
            ImageView imageView = yVar.f3595a;
            if (i2 != 0) {
                Drawable v2 = l.v(imageView.getContext(), i2);
                if (v2 != null) {
                    C0268t0.a(v2);
                }
                imageView.setImageDrawable(v2);
            } else {
                imageView.setImageDrawable((Drawable) null);
            }
            yVar.a();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0277y yVar = this.b;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0258o oVar = this.f3600a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0258o oVar = this.f3600a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [d1.n, java.lang.Object] */
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0277y yVar = this.b;
        if (yVar != null) {
            if (yVar.b == null) {
                yVar.b = new Object();
            }
            n nVar = yVar.b;
            nVar.f2338c = colorStateList;
            nVar.b = true;
            yVar.a();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [d1.n, java.lang.Object] */
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0277y yVar = this.b;
        if (yVar != null) {
            if (yVar.b == null) {
                yVar.b = new Object();
            }
            n nVar = yVar.b;
            nVar.f2339d = mode;
            nVar.f2337a = true;
            yVar.a();
        }
    }
}
