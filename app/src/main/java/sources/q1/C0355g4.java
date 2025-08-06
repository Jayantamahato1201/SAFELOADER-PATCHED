package q1;

import android.content.ContentResolver;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* renamed from: q1.g4  reason: case insensitive filesystem */
public final class C0355g4 extends V4 {
    public static final C0355g4 b = new V4();

    public final void b() {
        C0 c02;
        S3 s3 = C0458y0.f4243c;
        this.f4021a = s3;
        C0412q1 c2 = C0388m1.c("content", s3, (String) null);
        if (c2 != null) {
            try {
                Field declaredField = ContentResolver.class.getDeclaredField("sContentService");
                declaredField.setAccessible(true);
                if (!Modifier.isStatic(declaredField.getModifiers())) {
                    if (!declaredField.getType().isPrimitive()) {
                        c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                        c02.c((Object) null, c2.f4176d);
                        C0376k1 k1Var = new C0376k1(3);
                        C0413q2 q2Var = c2.f4174a;
                        q2Var.b(1429369164, k1Var);
                        q2Var.b(133236371, new C0376k1(3));
                        q2Var.b(1000160345, new C0376k1(3));
                    }
                }
                c02 = new C0351g0(declaredField, 2);
            } catch (Exception unused) {
                c02 = C0.f3864a;
            }
            c02.c((Object) null, c2.f4176d);
            C0376k1 k1Var2 = new C0376k1(3);
            C0413q2 q2Var2 = c2.f4174a;
            q2Var2.b(1429369164, k1Var2);
            q2Var2.b(133236371, new C0376k1(3));
            q2Var2.b(1000160345, new C0376k1(3));
        }
    }
}
