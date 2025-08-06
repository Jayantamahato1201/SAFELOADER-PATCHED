package q1;

import android.media.session.MediaSession;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* renamed from: q1.e1  reason: case insensitive filesystem */
public final class C0340e1 extends V4 {
    public static final C0340e1 b = new V4();

    public final void b() {
        C0 c02;
        Class<MediaSession.Token> cls = MediaSession.Token.class;
        S3 s3 = C0458y0.f4243c;
        this.f4021a = s3;
        C0412q1 c2 = C0388m1.c("media_session", s3, (String) null);
        if (c2 != null) {
            c2.f4174a.b(-63461894, new C0376k1(3));
            try {
                Field declaredField = cls.getDeclaredField("mBinder");
                declaredField.setAccessible(true);
                if (!Modifier.isStatic(declaredField.getModifiers())) {
                    if (!declaredField.getType().isPrimitive()) {
                        c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                        E.a(cls, MediaSession.Token.CREATOR, new C0334d1(c02, 0));
                    }
                }
                c02 = new C0351g0(declaredField, 2);
            } catch (Exception unused) {
                c02 = C0.f3864a;
            }
            E.a(cls, MediaSession.Token.CREATOR, new C0334d1(c02, 0));
        }
    }
}
