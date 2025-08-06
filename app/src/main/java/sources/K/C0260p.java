package k;

import A.i;
import O.t;
import Q0.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: k.p  reason: case insensitive filesystem */
public class C0260p extends Button implements t {

    /* renamed from: a  reason: collision with root package name */
    public final C0258o f3546a;
    public final C0236d0 b;

    /* renamed from: c  reason: collision with root package name */
    public C0273w f3547c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0260p(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        m1.a(context);
        l1.a(this, getContext());
        C0258o oVar = new C0258o(this);
        this.f3546a = oVar;
        oVar.d(attributeSet, i2);
        C0236d0 d0Var = new C0236d0(this);
        this.b = d0Var;
        d0Var.f(attributeSet, i2);
        d0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    private C0273w getEmojiTextViewHelper() {
        if (this.f3547c == null) {
            this.f3547c = new C0273w(this);
        }
        return this.f3547c;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0258o oVar = this.f3546a;
        if (oVar != null) {
            oVar.a();
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (D1.b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            return Math.round(d0Var.f3452i.f3539e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (D1.b) {
            return super.getAutoSizeMinTextSize();
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            return Math.round(d0Var.f3452i.f3538d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (D1.b) {
            return super.getAutoSizeStepGranularity();
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            return Math.round(d0Var.f3452i.f3537c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (D1.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            return d0Var.f3452i.f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!D1.b) {
            C0236d0 d0Var = this.b;
            if (d0Var != null) {
                return d0Var.f3452i.f3536a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.w0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0258o oVar = this.f3546a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0258o oVar = this.f3546a;
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

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0236d0 d0Var = this.b;
        if (d0Var != null && !D1.b) {
            d0Var.f3452i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0236d0 d0Var = this.b;
        if (d0Var != null && !D1.b) {
            C0259o0 o0Var = d0Var.f3452i;
            if (o0Var.f()) {
                o0Var.a();
            }
        }
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (D1.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.i(i2, i3, i4, i5);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (D1.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.j(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (D1.b) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.k(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0258o oVar = this.f3546a;
        if (oVar != null) {
            oVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0258o oVar = this.f3546a;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.z0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((l) getEmojiTextViewHelper().b.b).w(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.f3446a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0258o oVar = this.f3546a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0258o oVar = this.f3546a;
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

    public final void setTextSize(int i2, float f) {
        boolean z2 = D1.b;
        if (z2) {
            super.setTextSize(i2, f);
            return;
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null && !z2) {
            C0259o0 o0Var = d0Var.f3452i;
            if (!o0Var.f()) {
                o0Var.g(i2, f);
            }
        }
    }
}
