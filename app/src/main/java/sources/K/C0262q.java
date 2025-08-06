package k;

import O.s;
import O.t;
import Q0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import c0.C0106d;

/* renamed from: k.q  reason: case insensitive filesystem */
public class C0262q extends CheckBox implements s, t {

    /* renamed from: a  reason: collision with root package name */
    public final C0106d f3551a;
    public final C0258o b;

    /* renamed from: c  reason: collision with root package name */
    public final C0236d0 f3552c;

    /* renamed from: d  reason: collision with root package name */
    public C0273w f3553d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0262q(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        m1.a(context);
        l1.a(this, getContext());
        C0106d dVar = new C0106d(this);
        this.f3551a = dVar;
        dVar.d(attributeSet, i2);
        C0258o oVar = new C0258o(this);
        this.b = oVar;
        oVar.d(attributeSet, i2);
        C0236d0 d0Var = new C0236d0(this);
        this.f3552c = d0Var;
        d0Var.f(attributeSet, i2);
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    private C0273w getEmojiTextViewHelper() {
        if (this.f3553d == null) {
            this.f3553d = new C0273w(this);
        }
        return this.f3553d;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0258o oVar = this.b;
        if (oVar != null) {
            oVar.a();
        }
        C0236d0 d0Var = this.f3552c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0106d dVar = this.f3551a;
        if (dVar != null) {
            dVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0258o oVar = this.b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0258o oVar = this.b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0106d dVar = this.f3551a;
        if (dVar != null) {
            return (ColorStateList) dVar.f1813e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0106d dVar = this.f3551a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3552c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3552c.e();
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0258o oVar = this.b;
        if (oVar != null) {
            oVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0258o oVar = this.b;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0106d dVar = this.f3551a;
        if (dVar == null) {
            return;
        }
        if (dVar.f1811c) {
            dVar.f1811c = false;
            return;
        }
        dVar.f1811c = true;
        dVar.a();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0236d0 d0Var = this.f3552c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0236d0 d0Var = this.f3552c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((l) getEmojiTextViewHelper().b.b).w(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0258o oVar = this.b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0258o oVar = this.b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0106d dVar = this.f3551a;
        if (dVar != null) {
            dVar.f1813e = colorStateList;
            dVar.f1810a = true;
            dVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0106d dVar = this.f3551a;
        if (dVar != null) {
            dVar.f = mode;
            dVar.b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0236d0 d0Var = this.f3552c;
        d0Var.l(colorStateList);
        d0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0236d0 d0Var = this.f3552c;
        d0Var.m(mode);
        d0Var.b();
    }

    public void setButtonDrawable(int i2) {
        setButtonDrawable(l.v(getContext(), i2));
    }
}
