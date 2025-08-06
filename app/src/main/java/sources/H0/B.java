package H0;

import A.i;
import C0.c;
import C0.d;
import I.O;
import N.g;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.cheatbox.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import k.C0245h0;
import y0.l;

public final class B extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f265a;
    public final C0245h0 b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f266c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f267d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f268e;
    public PorterDuff.Mode f;

    /* renamed from: g  reason: collision with root package name */
    public int f269g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView.ScaleType f270h;

    /* renamed from: i  reason: collision with root package name */
    public View.OnLongClickListener f271i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f272j;

    public B(TextInputLayout textInputLayout, g gVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f265a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.MT_Bin, this, false);
        this.f267d = checkableImageButton;
        if (Build.VERSION.SDK_INT <= 22) {
            int[] iArr = d.f74a;
            checkableImageButton.setBackground(c.b(checkableImageButton.getContext(), (int) TypedValue.applyDimension(1, (float) 4, checkableImageButton.getContext().getResources().getDisplayMetrics())));
        }
        CharSequence charSequence = null;
        C0245h0 h0Var = new C0245h0(getContext(), (AttributeSet) null);
        this.b = h0Var;
        if (i.Y(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f271i;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        i.n0(checkableImageButton, onLongClickListener);
        this.f271i = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        i.n0(checkableImageButton, (View.OnLongClickListener) null);
        TypedArray typedArray = (TypedArray) gVar.f606c;
        if (typedArray.hasValue(69)) {
            this.f268e = i.G(getContext(), gVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f = l.g(typedArray.getInt(70, -1), (PorterDuff.Mode) null);
        }
        if (typedArray.hasValue(66)) {
            b(gVar.p(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.MT_Bin));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f269g) {
                this.f269g = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(68)) {
                ImageView.ScaleType p2 = i.p(typedArray.getInt(68, -1));
                this.f270h = p2;
                checkableImageButton.setScaleType(p2);
            }
            h0Var.setVisibility(8);
            h0Var.setId(R.id.MT_Bin);
            h0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = O.f393a;
            h0Var.setAccessibilityLiveRegion(1);
            i.s0(h0Var, typedArray.getResourceId(60, 0));
            if (typedArray.hasValue(61)) {
                h0Var.setTextColor(gVar.o(61));
            }
            CharSequence text2 = typedArray.getText(59);
            this.f266c = !TextUtils.isEmpty(text2) ? text2 : charSequence;
            h0Var.setText(text2);
            e();
            addView(checkableImageButton);
            addView(h0Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        int i2;
        CheckableImageButton checkableImageButton = this.f267d;
        if (checkableImageButton.getVisibility() == 0) {
            i2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i2 = 0;
        }
        WeakHashMap weakHashMap = O.f393a;
        return this.b.getPaddingStart() + getPaddingStart() + i2;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f267d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f268e;
            PorterDuff.Mode mode = this.f;
            TextInputLayout textInputLayout = this.f265a;
            i.e(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            i.g0(textInputLayout, checkableImageButton, this.f268e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f271i;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        i.n0(checkableImageButton, onLongClickListener);
        this.f271i = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        i.n0(checkableImageButton, (View.OnLongClickListener) null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription((CharSequence) null);
        }
    }

    public final void c(boolean z2) {
        boolean z3;
        CheckableImageButton checkableImageButton = this.f267d;
        int i2 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 != z2) {
            if (!z2) {
                i2 = 8;
            }
            checkableImageButton.setVisibility(i2);
            d();
            e();
        }
    }

    public final void d() {
        int i2;
        EditText editText = this.f265a.f2112d;
        if (editText != null) {
            if (this.f267d.getVisibility() == 0) {
                i2 = 0;
            } else {
                WeakHashMap weakHashMap = O.f393a;
                i2 = editText.getPaddingStart();
            }
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.MT_Bin);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap weakHashMap2 = O.f393a;
            this.b.setPaddingRelative(i2, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void e() {
        int i2;
        int i3 = 8;
        if (this.f266c == null || this.f272j) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (this.f267d.getVisibility() == 0 || i2 == 0) {
            i3 = 0;
        }
        setVisibility(i3);
        this.b.setVisibility(i2);
        this.f265a.q();
    }

    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        d();
    }
}
