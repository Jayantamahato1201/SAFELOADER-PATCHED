package com.google.android.material.snackbar;

import I.O;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cheatbox.R;
import java.util.WeakHashMap;
import k0.C0281a;
import t0.C0486a;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f2078a;
    public Button b;

    /* renamed from: c  reason: collision with root package name */
    public int f2079c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0486a.r(context, R.attr.MT_Bin, C0281a.b);
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f2078a.getPaddingTop() == i3 && this.f2078a.getPaddingBottom() == i4) {
            return z2;
        }
        TextView textView = this.f2078a;
        WeakHashMap weakHashMap = O.f393a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.f2078a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2078a = (TextView) findViewById(R.id.MT_Bin);
        this.b = (Button) findViewById(R.id.MT_Bin);
    }

    public final void onMeasure(int i2, int i3) {
        boolean z2;
        super.onMeasure(i2, i3);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.MT_Bin);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.MT_Bin);
            Layout layout = this.f2078a.getLayout();
            if (layout == null || layout.getLineCount() <= 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || this.f2079c <= 0 || this.b.getMeasuredWidth() <= this.f2079c) {
                if (!z2) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i2, i3);
        }
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f2079c = i2;
    }
}
