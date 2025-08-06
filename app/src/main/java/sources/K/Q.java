package k;

import H0.x;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.cheatbox.R;
import j.C0200d;

public final class Q extends L0 implements T {
    public CharSequence D;

    /* renamed from: E  reason: collision with root package name */
    public O f3399E;

    /* renamed from: F  reason: collision with root package name */
    public final Rect f3400F = new Rect();

    /* renamed from: G  reason: collision with root package name */
    public int f3401G;

    /* renamed from: H  reason: collision with root package name */
    public final /* synthetic */ U f3402H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q(U u2, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin);
        this.f3402H = u2;
        this.f3382o = u2;
        this.f3392y = true;
        this.f3393z.setFocusable(true);
        this.f3383p = new x(1, this);
    }

    public final void e(int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        B b = this.f3393z;
        boolean isShowing = b.isShowing();
        s();
        this.f3393z.setInputMethodMode(2);
        f();
        C0280z0 z0Var = this.f3371c;
        z0Var.setChoiceMode(1);
        L.d(z0Var, i2);
        L.c(z0Var, i3);
        U u2 = this.f3402H;
        int selectedItemPosition = u2.getSelectedItemPosition();
        C0280z0 z0Var2 = this.f3371c;
        if (b.isShowing() && z0Var2 != null) {
            z0Var2.setListSelectionHidden(false);
            z0Var2.setSelection(selectedItemPosition);
            if (z0Var2.getChoiceMode() != 0) {
                z0Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = u2.getViewTreeObserver()) != null) {
            C0200d dVar = new C0200d(3, this);
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
            this.f3393z.setOnDismissListener(new P(this, dVar));
        }
    }

    public final CharSequence i() {
        return this.D;
    }

    public final void k(CharSequence charSequence) {
        this.D = charSequence;
    }

    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f3399E = (O) listAdapter;
    }

    public final void o(int i2) {
        this.f3401G = i2;
    }

    public final void s() {
        int i2;
        int i3;
        B b = this.f3393z;
        Drawable background = b.getBackground();
        U u2 = this.f3402H;
        if (background != null) {
            background.getPadding(u2.f3415h);
            boolean a2 = D1.a(u2);
            Rect rect = u2.f3415h;
            if (a2) {
                i2 = rect.right;
            } else {
                i2 = -rect.left;
            }
        } else {
            Rect rect2 = u2.f3415h;
            rect2.right = 0;
            rect2.left = 0;
            i2 = 0;
        }
        int paddingLeft = u2.getPaddingLeft();
        int paddingRight = u2.getPaddingRight();
        int width = u2.getWidth();
        int i4 = u2.f3414g;
        if (i4 == -2) {
            int a3 = u2.a(this.f3399E, b.getBackground());
            int i5 = u2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = u2.f3415h;
            int i6 = (i5 - rect3.left) - rect3.right;
            if (a3 > i6) {
                a3 = i6;
            }
            r(Math.max(a3, (width - paddingLeft) - paddingRight));
        } else if (i4 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i4);
        }
        if (D1.a(u2)) {
            i3 = (((width - paddingRight) - this.f3373e) - this.f3401G) + i2;
        } else {
            i3 = paddingLeft + this.f3401G + i2;
        }
        this.f = i3;
    }
}
