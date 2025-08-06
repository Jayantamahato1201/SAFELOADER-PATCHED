package com.google.android.material.datepicker;

import O.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new k(9);
    public final p f;

    /* renamed from: g  reason: collision with root package name */
    public final p f1948g;

    /* renamed from: h  reason: collision with root package name */
    public final d f1949h;

    /* renamed from: i  reason: collision with root package name */
    public final p f1950i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1951j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1952k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1953l;

    public b(p pVar, p pVar2, d dVar, p pVar3, int i2) {
        Objects.requireNonNull(pVar, "start cannot be null");
        Objects.requireNonNull(pVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f = pVar;
        this.f1948g = pVar2;
        this.f1950i = pVar3;
        this.f1951j = i2;
        this.f1949h = dVar;
        if (pVar3 != null && pVar.f.compareTo(pVar3.f) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (pVar3 != null && pVar3.f.compareTo(pVar2.f) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i2 < 0 || i2 > x.c((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.f1953l = pVar.d(pVar2) + 1;
            this.f1952k = (pVar2.f2005h - pVar.f2005h) + 1;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f.equals(bVar.f) || !this.f1948g.equals(bVar.f1948g) || !Objects.equals(this.f1950i, bVar.f1950i) || this.f1951j != bVar.f1951j || !this.f1949h.equals(bVar.f1949h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f1951j);
        d dVar = this.f1949h;
        return Arrays.hashCode(new Object[]{this.f, this.f1948g, this.f1950i, valueOf, dVar});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.f1948g, 0);
        parcel.writeParcelable(this.f1950i, 0);
        parcel.writeParcelable(this.f1949h, 0);
        parcel.writeInt(this.f1951j);
    }
}
