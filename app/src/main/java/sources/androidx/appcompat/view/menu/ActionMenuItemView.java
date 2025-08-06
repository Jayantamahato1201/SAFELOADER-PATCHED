package androidx.appcompat.view.menu;

import Q0.l;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import d.a;
import j.C0191A;
import j.C0198b;
import j.C0199c;
import j.C0208l;
import j.C0209m;
import j.C0211o;
import k.C0245h0;
import k.C0250k;

public class ActionMenuItemView extends C0245h0 implements C0191A, View.OnClickListener, C0250k {

    /* renamed from: h  reason: collision with root package name */
    public C0211o f885h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f886i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f887j;

    /* renamed from: k  reason: collision with root package name */
    public C0208l f888k;

    /* renamed from: l  reason: collision with root package name */
    public C0198b f889l;

    /* renamed from: m  reason: collision with root package name */
    public C0199c f890m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f891n = g();

    /* renamed from: o  reason: collision with root package name */
    public boolean f892o;

    /* renamed from: p  reason: collision with root package name */
    public final int f893p;

    /* renamed from: q  reason: collision with root package name */
    public int f894q;

    /* renamed from: r  reason: collision with root package name */
    public final int f895r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2194c, 0, 0);
        this.f893p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f895r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f894q = -1;
        setSaveEnabled(false);
    }

    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean b() {
        if (TextUtils.isEmpty(getText()) || this.f885h.getIcon() != null) {
            return false;
        }
        return true;
    }

    public final void d(C0211o oVar) {
        int i2;
        this.f885h = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f3131a);
        if (oVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f889l == null) {
            this.f889l = new C0198b(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 >= 480) {
            return true;
        }
        if ((i2 < 640 || i3 < 480) && configuration.orientation != 2) {
            return false;
        }
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C0211o getItemData() {
        return this.f885h;
    }

    public final void h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f886i);
        if (this.f887j != null && ((this.f885h.f3153y & 4) != 4 || (!this.f891n && !this.f892o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence3 = null;
        if (z4) {
            charSequence = this.f886i;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f885h.f3145q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z4) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f885h.f3134e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f885h.f3146r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z4) {
                charSequence3 = this.f885h.f3134e;
            }
            l.Z(this, charSequence3);
            return;
        }
        l.Z(this, charSequence5);
    }

    public final void onClick(View view) {
        C0208l lVar = this.f888k;
        if (lVar != null) {
            lVar.b(this.f885h);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f891n = g();
        h();
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i5 = this.f894q) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f893p;
        if (mode == Integer.MIN_VALUE) {
            i4 = Math.min(size, i6);
        } else {
            i4 = i6;
        }
        if (mode != 1073741824 && i6 > 0 && measuredWidth < i4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
        }
        if (isEmpty && this.f887j != null) {
            super.setPadding((getMeasuredWidth() - this.f887j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0198b bVar;
        if (!this.f885h.hasSubMenu() || (bVar = this.f889l) == null || !bVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f892o != z2) {
            this.f892o = z2;
            C0211o oVar = this.f885h;
            if (oVar != null) {
                C0209m mVar = oVar.f3142n;
                mVar.f3112k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f887j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f895r;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        h();
    }

    public void setItemInvoker(C0208l lVar) {
        this.f888k = lVar;
    }

    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f894q = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(C0199c cVar) {
        this.f890m = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f886i = charSequence;
        h();
    }
}
