package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class o<S> extends u {

    /* renamed from: S  reason: collision with root package name */
    public int f2002S;

    /* renamed from: T  reason: collision with root package name */
    public b f2003T;

    public final void m(Bundle bundle) {
        super.m(bundle);
        if (bundle == null) {
            bundle = this.f;
        }
        this.f2002S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f2003T = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            return;
        }
        throw new ClassCastException();
    }

    public final View n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.f2002S));
        throw null;
    }

    public final void r(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2002S);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2003T);
    }
}
