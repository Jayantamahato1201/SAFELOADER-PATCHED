package k;

import A.i;
import A.k;
import G.g;
import G.h;
import O.n;
import O.t;
import Q0.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: k.h0  reason: case insensitive filesystem */
public class C0245h0 extends TextView implements t {

    /* renamed from: a  reason: collision with root package name */
    public final C0258o f3464a;
    public final C0236d0 b;

    /* renamed from: c  reason: collision with root package name */
    public final D f3465c;

    /* renamed from: d  reason: collision with root package name */
    public C0273w f3466d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3467e;
    public C0241f0 f;

    /* renamed from: g  reason: collision with root package name */
    public Future f3468g;

    public C0245h0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private C0273w getEmojiTextViewHelper() {
        if (this.f3466d == null) {
            this.f3466d = new C0273w(this);
        }
        return this.f3466d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0258o oVar = this.f3464a;
        if (oVar != null) {
            oVar.a();
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void f() {
        Future future = this.f3468g;
        if (future != null) {
            try {
                this.f3468g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                } else if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                } else {
                    i.U(this);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
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

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public C0239e0 getSuperCaller() {
        if (this.f == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                this.f = new C0243g0(this);
            } else if (i2 >= 26) {
                this.f = new C0241f0((Object) this);
            }
        }
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0258o oVar = this.f3464a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0258o oVar = this.f3464a;
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

    public CharSequence getText() {
        f();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        D d2;
        if (Build.VERSION.SDK_INT >= 28 || (d2 = this.f3465c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) d2.f3336c;
        if (textClassifier == null) {
            return V.a((TextView) d2.b);
        }
        return textClassifier;
    }

    public g getTextMetricsParamsCompat() {
        return i.U(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        C0236d0.h(editorInfo, onCreateInputConnection, this);
        l.G(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0236d0 d0Var = this.b;
        if (d0Var != null && !D1.b) {
            d0Var.f3452i.a();
        }
    }

    public void onMeasure(int i2, int i3) {
        f();
        super.onMeasure(i2, i3);
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
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
        C0258o oVar = this.f3464a;
        if (oVar != null) {
            oVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0258o oVar = this.f3464a;
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

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
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

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i2);
        } else {
            i.m0(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i2);
        } else {
            i.o0(this, i2);
        }
    }

    public void setLineHeight(int i2) {
        i.j(i2);
        int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i2 != fontMetricsInt) {
            setLineSpacing((float) (i2 - fontMetricsInt), 1.0f);
        }
    }

    public void setPrecomputedText(h hVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        i.U(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0258o oVar = this.f3464a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0258o oVar = this.f3464a;
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

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.g(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        D d2;
        if (Build.VERSION.SDK_INT >= 28 || (d2 = this.f3465c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            d2.f3336c = textClassifier;
        }
    }

    public void setTextFuture(Future<h> future) {
        this.f3468g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(g gVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = gVar.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (!(textDirectionHeuristic2 == textDirectionHeuristic3 || textDirectionHeuristic2 == (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR))) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        int i3 = Build.VERSION.SDK_INT;
        TextPaint textPaint = gVar.f242a;
        if (i3 < 23) {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(textPaint);
        n.e(this, gVar.f243c);
        n.h(this, gVar.f244d);
    }

    public final void setTextSize(int i2, float f2) {
        boolean z2 = D1.b;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null && !z2) {
            C0259o0 o0Var = d0Var.f3452i;
            if (!o0Var.f()) {
                o0Var.g(i2, f2);
            }
        }
    }

    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (!this.f3467e) {
            if (typeface == null || i2 <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                i iVar = k.f23a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i2);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f3467e = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i2);
            } finally {
                this.f3467e = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0245h0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        m1.a(context);
        this.f3467e = false;
        this.f = null;
        l1.a(this, getContext());
        C0258o oVar = new C0258o(this);
        this.f3464a = oVar;
        oVar.d(attributeSet, i2);
        C0236d0 d0Var = new C0236d0(this);
        this.b = d0Var;
        d0Var.f(attributeSet, i2);
        d0Var.b();
        D d2 = new D();
        d2.b = this;
        this.f3465c = d2;
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable v2 = i2 != 0 ? l.v(context, i2) : null;
        Drawable v3 = i3 != 0 ? l.v(context, i3) : null;
        Drawable v4 = i4 != 0 ? l.v(context, i4) : null;
        if (i5 != 0) {
            drawable = l.v(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(v2, v3, v4, drawable);
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable v2 = i2 != 0 ? l.v(context, i2) : null;
        Drawable v3 = i3 != 0 ? l.v(context, i3) : null;
        Drawable v4 = i4 != 0 ? l.v(context, i4) : null;
        if (i5 != 0) {
            drawable = l.v(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(v2, v3, v4, drawable);
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }
}
