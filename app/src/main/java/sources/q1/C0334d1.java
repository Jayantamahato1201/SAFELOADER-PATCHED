package q1;

import L0.e;
import T0.l;
import android.media.session.MediaSession;

/* renamed from: q1.d1  reason: case insensitive filesystem */
public final /* synthetic */ class C0334d1 implements l {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0 f4074g;

    public /* synthetic */ C0334d1(C0 c02, int i2) {
        this.f = i2;
        this.f4074g = c02;
    }

    public final Object e(Object obj) {
        boolean z2 = true;
        boolean z3 = false;
        C0 c02 = this.f4074g;
        switch (this.f) {
            case 0:
                MediaSession.Token token = (MediaSession.Token) obj;
                e eVar = e.f591c;
                try {
                    Object a2 = c02.a(token);
                    if (a2 != null) {
                        c02.c(token, H.g(a2, C0458y0.f4243c));
                    }
                } catch (Exception unused) {
                }
                return eVar;
            default:
                Boolean bool = null;
                try {
                    Object b = c02.b((Object) null, (String) obj, "");
                    if (b != null) {
                        if (b.toString().length() <= 0) {
                            z2 = false;
                        }
                        bool = Boolean.valueOf(z2);
                    }
                } catch (Exception unused2) {
                }
                if (bool != null) {
                    z3 = bool.booleanValue();
                }
                return Boolean.valueOf(z3);
        }
    }
}
