package com.cheatbox;

import android.content.Context;
import p1.a;

public class Native {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f1825a = {a.a(47551854973629394L), a.a(47551807728989138L), a.a(47551773369250770L)};

    static {
        System.loadLibrary(a.a(47551885038400466L));
    }

    public static native String AppName();

    public static native String Check(Context context, String str);

    public static native String ResellerLOGO();

    public static native String ResellerNAME();

    public static native String currGameVer();

    public static native String currPlugUrl();

    public static native String currPlugVer();

    public static native String getTime();

    public static native String licence();

    public static native String update();

    public static native String urlTg();
}
