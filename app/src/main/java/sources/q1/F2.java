package q1;

import android.os.storage.StorageManager;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class F2 extends V4 {
    public static final F2 b = new V4();

    public final void b() {
        String str;
        S3 s3 = C0458y0.f4243c;
        this.f4021a = s3;
        boolean z2 = T4.f4000e;
        if (z2) {
            str = null;
        } else {
            str = "android.os.storage.IMountService$Stub";
        }
        C0412q1 c2 = C0388m1.c("mount", s3, str);
        if (c2 != null) {
            C0 c02 = C0.f3864a;
            C0413q2 q2Var = c2.f4174a;
            Class<StorageManager> cls = StorageManager.class;
            if (z2) {
                try {
                    Field declaredField = cls.getDeclaredField("sStorageManager");
                    declaredField.setAccessible(true);
                    if (!Modifier.isStatic(declaredField.getModifiers())) {
                        if (!declaredField.getType().isPrimitive()) {
                            c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                            c02.c((Object) null, (Object) null);
                        }
                    }
                    c02 = new C0351g0(declaredField, 2);
                } catch (Exception unused) {
                }
                c02.c((Object) null, (Object) null);
            } else {
                if (T4.f3998c) {
                    try {
                        Field declaredField2 = cls.getDeclaredField("sMountService");
                        declaredField2.setAccessible(true);
                        if (!Modifier.isStatic(declaredField2.getModifiers())) {
                            if (!declaredField2.getType().isPrimitive()) {
                                c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField2));
                                c02.c((Object) null, (Object) null);
                            }
                        }
                        c02 = new C0351g0(declaredField2, 2);
                    } catch (Exception unused2) {
                    }
                    c02.c((Object) null, (Object) null);
                }
                q2Var.b(-1526098847, new C0357h0((Object) "mounted"));
            }
            q2Var.b(-123808234, new C0376k1(3));
            q2Var.b(-1850562866, Q3.f3974d);
            if (T4.f4010p) {
                Class<?> cls2 = Class.forName("android.common.HwFrameworkFactory");
                if (!B2.a(cls2, "sFactory")) {
                    B2.a(cls2, "obj");
                }
            }
        }
    }
}
