package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

public final class e extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    public static final int f1955d;

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f1956a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1957c;

    static {
        int i2;
        if (Build.VERSION.SDK_INT >= 26) {
            i2 = 4;
        } else {
            i2 = 1;
        }
        f1955d = i2;
    }

    public e() {
        Calendar c2 = x.c((Calendar) null);
        this.f1956a = c2;
        this.b = c2.getMaximum(7);
        this.f1957c = c2.getFirstDayOfWeek();
    }

    public final int getCount() {
        return this.b;
    }

    public final Object getItem(int i2) {
        int i3 = this.b;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.f1957c;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    public final long getItemId(int i2) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r6 != 0) goto L_0x0018
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r1 = 2131427405(0x7f0b004d, float:1.8476425E38)
            android.view.View r6 = r6.inflate(r1, r7, r0)
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0018:
            int r6 = r4.f1957c
            int r5 = r5 + r6
            int r6 = r4.b
            if (r5 <= r6) goto L_0x0020
            int r5 = r5 - r6
        L_0x0020:
            java.util.Calendar r6 = r4.f1956a
            r2 = 7
            r6.set(r2, r5)
            android.content.res.Resources r5 = r1.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            int r3 = f1955d
            java.lang.String r5 = r6.getDisplayName(r2, r3, r5)
            r1.setText(r5)
            android.content.Context r5 = r7.getContext()
            r7 = 2131689634(0x7f0f00a2, float:1.9008289E38)
            java.lang.String r5 = r5.getString(r7)
            r7 = 2
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r6
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r1.setContentDescription(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public e(int i2) {
        Calendar c2 = x.c((Calendar) null);
        this.f1956a = c2;
        this.b = c2.getMaximum(7);
        this.f1957c = i2;
    }
}
