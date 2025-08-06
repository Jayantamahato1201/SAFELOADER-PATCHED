package com.google.android.material.internal;

import I.O;
import Q.b;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.cheatbox.R;
import com.google.android.material.datepicker.i;
import k.C0275x;
import y0.C0499a;

public class CheckableImageButton extends C0275x implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f2042g = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public boolean f2043d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2044e = true;
    public boolean f = true;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin);
        O.p(this, new i(2, this));
    }

    public final boolean isChecked() {
        return this.f2043d;
    }

    public final int[] onCreateDrawableState(int i2) {
        if (this.f2043d) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f2042g);
        }
        return super.onCreateDrawableState(i2);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0499a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0499a aVar = (C0499a) parcelable;
        super.onRestoreInstanceState(aVar.f);
        setChecked(aVar.f4766h);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, Q.b, y0.a] */
    public final Parcelable onSaveInstanceState() {
        ? bVar = new b(super.onSaveInstanceState());
        bVar.f4766h = this.f2043d;
        return bVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f2044e != z2) {
            this.f2044e = z2;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z2) {
        if (this.f2044e && this.f2043d != z2) {
            this.f2043d = z2;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z2) {
        this.f = z2;
    }

    public void setPressed(boolean z2) {
        if (this.f) {
            super.setPressed(z2);
        }
    }

    public final void toggle() {
        setChecked(!this.f2043d);
    }
}
