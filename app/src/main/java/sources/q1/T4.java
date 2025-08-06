package q1;

import android.os.Build;
import java.lang.reflect.Method;

public abstract class T4 {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f3997a;
    public static final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3998c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3999d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f4000e;
    public static final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f4001g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f4002h;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f4003i;

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f4004j;

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f4005k;

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f4006l;

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f4007m;

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f4008n;

    /* renamed from: o  reason: collision with root package name */
    public static final boolean f4009o;

    /* renamed from: p  reason: collision with root package name */
    public static final boolean f4010p;

    static {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        C0 c02 = C0.f3864a;
        int i2 = Build.VERSION.SDK_INT;
        boolean z18 = false;
        if (i2 >= 22) {
            z2 = true;
        } else {
            z2 = false;
        }
        f3997a = z2;
        if (i2 >= 23) {
            z3 = true;
        } else {
            z3 = false;
        }
        b = z3;
        if (i2 >= 24) {
            z4 = true;
        } else {
            z4 = false;
        }
        f3998c = z4;
        if (i2 >= 25) {
            z5 = true;
        } else {
            z5 = false;
        }
        f3999d = z5;
        if (i2 >= 26) {
            z6 = true;
        } else {
            z6 = false;
        }
        f4000e = z6;
        if (i2 >= 28) {
            z7 = true;
        } else {
            z7 = false;
        }
        f = z7;
        if (i2 >= 29) {
            z8 = true;
        } else {
            z8 = false;
        }
        f4001g = z8;
        if (i2 >= 30) {
            z9 = true;
        } else {
            z9 = false;
        }
        f4002h = z9;
        if (i2 >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4003i = z10;
        if (i2 >= 33) {
            z11 = true;
        } else {
            z11 = false;
        }
        f4004j = z11;
        if (i2 >= 34) {
            z12 = true;
        } else {
            z12 = false;
        }
        f4005k = z12;
        if (i2 >= 35) {
            z13 = true;
        } else {
            z13 = false;
        }
        f4006l = z13;
        if (i2 >= 36) {
            z14 = true;
        } else {
            z14 = false;
        }
        f4007m = z14;
        Class<String> cls = String.class;
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{cls, cls});
            declaredMethod.setAccessible(true);
            c02 = new C0351g0(declaredMethod, 1);
        } catch (Exception unused) {
        }
        C0334d1 d1Var = new C0334d1(c02, 1);
        if (((Boolean) d1Var.e("ro.build.version.oplusrom")).booleanValue() || ((Boolean) d1Var.e("oplus.device.firstboot")).booleanValue()) {
            z15 = true;
        } else {
            z15 = false;
        }
        f4008n = z15;
        if (!z6 || !((Boolean) d1Var.e("ro.huawei.build.version.security_patch")).booleanValue()) {
            z16 = false;
        } else {
            z16 = true;
        }
        boolean booleanValue = ((Boolean) d1Var.e("ro.build.version.magic")).booleanValue();
        if (!booleanValue || z16) {
            z17 = false;
        } else {
            z17 = true;
        }
        f4009o = z17;
        if (booleanValue || z16 || ((Boolean) d1Var.e("ro.build.version.emui")).booleanValue()) {
            z18 = true;
        }
        f4010p = z18;
    }
}
