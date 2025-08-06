package com.google.android.material.datepicker;

import O.k;
import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public final class p implements Comparable, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new k(11);
    public final Calendar f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2004g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2005h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2006i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2007j;

    /* renamed from: k  reason: collision with root package name */
    public final long f2008k;

    /* renamed from: l  reason: collision with root package name */
    public String f2009l;

    public p(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = x.a(calendar);
        this.f = a2;
        this.f2004g = a2.get(2);
        this.f2005h = a2.get(1);
        this.f2006i = a2.getMaximum(7);
        this.f2007j = a2.getActualMaximum(5);
        this.f2008k = a2.getTimeInMillis();
    }

    public static p a(int i2, int i3) {
        Calendar c2 = x.c((Calendar) null);
        c2.set(1, i2);
        c2.set(2, i3);
        return new p(c2);
    }

    public static p b(long j2) {
        Calendar c2 = x.c((Calendar) null);
        c2.setTimeInMillis(j2);
        return new p(c2);
    }

    public final String c() {
        String str;
        if (this.f2009l == null) {
            long timeInMillis = this.f.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                Locale locale = Locale.getDefault();
                AtomicReference atomicReference = x.f2021a;
                DateFormat c2 = DateFormat.getInstanceForSkeleton("yMMMM", locale);
                c2.setTimeZone(TimeZone.getTimeZone("UTC"));
                DisplayContext unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
                c2.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
                str = c2.format(new Date(timeInMillis));
            } else {
                str = DateUtils.formatDateTime((Context) null, timeInMillis, 8228);
            }
            this.f2009l = str;
        }
        return this.f2009l;
    }

    public final int compareTo(Object obj) {
        return this.f.compareTo(((p) obj).f);
    }

    public final int d(p pVar) {
        if (this.f instanceof GregorianCalendar) {
            return (pVar.f2004g - this.f2004g) + ((pVar.f2005h - this.f2005h) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (com.google.android.material.datepicker.p) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.material.datepicker.p
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.material.datepicker.p r5 = (com.google.android.material.datepicker.p) r5
            int r1 = r5.f2004g
            int r3 = r4.f2004g
            if (r3 != r1) goto L_0x0019
            int r1 = r4.f2005h
            int r5 = r5.f2005h
            if (r1 != r5) goto L_0x0019
            return r0
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.p.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2004g), Integer.valueOf(this.f2005h)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2005h);
        parcel.writeInt(this.f2004g);
    }
}
