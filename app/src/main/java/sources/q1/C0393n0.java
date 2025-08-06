package q1;

import android.telephony.TelephonyManager;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: q1.n0  reason: case insensitive filesystem */
public final class C0393n0 extends V4 {
    public static final C0393n0 b = new V4();

    public final void b() {
        C0 g0Var;
        ArrayList arrayList;
        C0 c02;
        S3 s3 = C0458y0.f4243c;
        this.f4021a = s3;
        C0412q1 c2 = C0388m1.c("phone", s3, (String) null);
        C0 c03 = C0.f3864a;
        Class<TelephonyManager> cls = TelephonyManager.class;
        if (c2 != null) {
            if (T4.f4003i || T4.f4010p) {
                try {
                    Field declaredField = cls.getDeclaredField("sITelephony");
                    declaredField.setAccessible(true);
                    if (!Modifier.isStatic(declaredField.getModifiers())) {
                        if (!declaredField.getType().isPrimitive()) {
                            c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                            c02.c((Object) null, (Object) null);
                        }
                    }
                    c02 = new C0351g0(declaredField, 2);
                } catch (Exception unused) {
                    c02 = c03;
                }
                c02.c((Object) null, (Object) null);
            }
            c2.a(new int[]{-1107875961, 1141893961, 666398025, 1057163518}, new C0357h0((Object) f5.b));
        }
        if (T4.f4001g) {
            C0413q2 q2Var = C0388m1.f4140a;
            C0388m1.c("ions", this.f4021a, (String) null);
        }
        C0413q2 q2Var2 = C0388m1.f4140a;
        C0412q1 c3 = C0388m1.c("isub", this.f4021a, (String) null);
        if (!(c3 == null || !T4.b || (arrayList = f5.f4096c) == null)) {
            c3.f4174a.b(-652029243, new C0357h0((Object) arrayList));
        }
        if (C0388m1.c("telephony.registry", this.f4021a, (String) null) != null && T4.f4002h) {
            C0452x0.c("android.telephony.TelephonyRegistryManager", "sRegistry").c((Object) null, (Object) null);
        }
        if (C0388m1.c("iphonesubinfo", this.f4021a, (String) null) == null) {
            return;
        }
        if (T4.f4002h || T4.f4010p) {
            try {
                Field declaredField2 = cls.getDeclaredField("sIPhoneSubInfo");
                declaredField2.setAccessible(true);
                if (!Modifier.isStatic(declaredField2.getModifiers())) {
                    if (!declaredField2.getType().isPrimitive()) {
                        g0Var = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField2));
                        c03 = g0Var;
                        c03.c((Object) null, (Object) null);
                    }
                }
                g0Var = new C0351g0(declaredField2, 2);
                c03 = g0Var;
            } catch (Exception unused2) {
            }
            c03.c((Object) null, (Object) null);
        }
    }
}
