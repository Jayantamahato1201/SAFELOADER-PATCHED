package I;

import android.text.TextUtils;
import android.view.View;

/* renamed from: I.y  reason: case insensitive filesystem */
public final class C0032y extends A {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f473e;

    public C0032y(int i2, Class cls, int i3, int i4, int i5) {
        this.f473e = i5;
        this.f384a = i2;
        this.f386d = cls;
        this.f385c = i3;
        this.b = i4;
    }

    public final Object b(View view) {
        switch (this.f473e) {
            case 0:
                return Boolean.valueOf(H.d(view));
            case 1:
                return H.b(view);
            default:
                return Boolean.valueOf(H.c(view));
        }
    }

    public final void c(View view, Object obj) {
        switch (this.f473e) {
            case 0:
                H.j(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                H.h(view, (CharSequence) obj);
                return;
            default:
                H.g(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    public final boolean e(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        switch (this.f473e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z6 = false;
                if (bool == null || !bool.booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (bool2 == null || !bool2.booleanValue()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z2 == z3) {
                    z6 = true;
                }
                return !z6;
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z7 = false;
                if (bool3 == null || !bool3.booleanValue()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (bool4 == null || !bool4.booleanValue()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z4 == z5) {
                    z7 = true;
                }
                return !z7;
        }
    }
}
