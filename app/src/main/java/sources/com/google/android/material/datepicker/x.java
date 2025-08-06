package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f2021a = new AtomicReference();

    public static Calendar a(Calendar calendar) {
        Calendar c2 = c(calendar);
        Calendar c3 = c((Calendar) null);
        c3.set(c2.get(1), c2.get(2), c2.get(5));
        return c3;
    }

    public static Calendar b() {
        w wVar = (w) f2021a.get();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar c(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
            return instance;
        }
        instance.setTimeInMillis(calendar.getTimeInMillis());
        return instance;
    }
}
