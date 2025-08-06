package k;

import A.i;
import N.g;
import O.t;
import Q0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.cheatbox.R;

/* renamed from: k.n  reason: case insensitive filesystem */
public class C0256n extends AutoCompleteTextView implements t {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3527d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final C0258o f3528a;
    public final C0236d0 b;

    /* renamed from: c  reason: collision with root package name */
    public final D f3529c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0256n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin);
        m1.a(context);
        l1.a(this, getContext());
        g E2 = g.E(getContext(), attributeSet, f3527d, R.attr.MT_Bin);
        if (((TypedArray) E2.f606c).hasValue(0)) {
            setDropDownBackgroundDrawable(E2.p(0));
        }
        E2.F();
        C0258o oVar = new C0258o(this);
        this.f3528a = oVar;
        oVar.d(attributeSet, R.attr.MT_Bin);
        C0236d0 d0Var = new C0236d0(this);
        this.b = d0Var;
        d0Var.f(attributeSet, R.attr.MT_Bin);
        d0Var.b();
        D d2 = new D((EditText) this);
        this.f3529c = d2;
        d2.b(attributeSet, R.attr.MT_Bin);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a2 = d2.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0258o oVar = this.f3528a;
        if (oVar != null) {
            oVar.a();
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.w0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0258o oVar = this.f3528a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0258o oVar = this.f3528a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.G(editorInfo, onCreateInputConnection, this);
        return this.f3529c.c(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0258o oVar = this.f3528a;
        if (oVar != null) {
            oVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0258o oVar = this.f3528a;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.z0(callback, this));
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(l.v(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3529c.d(z2);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3529c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0258o oVar = this.f3528a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0258o oVar = this.f3528a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0236d0 d0Var = this.b;
        d0Var.l(colorStateList);
        d0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0236d0 d0Var = this.b;
        d0Var.m(mode);
        d0Var.b();
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.g(context, i2);
        }
    }
}
