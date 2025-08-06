package androidx.lifecycle;

import A.j;
import F0.g;
import U0.i;
import android.os.Handler;

public final class B implements r {

    /* renamed from: i  reason: collision with root package name */
    public static final B f1403i = new B();

    /* renamed from: a  reason: collision with root package name */
    public int f1404a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1405c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1406d = true;

    /* renamed from: e  reason: collision with root package name */
    public Handler f1407e;
    public final t f = new t(this);

    /* renamed from: g  reason: collision with root package name */
    public final g f1408g = new g(8, this);

    /* renamed from: h  reason: collision with root package name */
    public final j f1409h = new j(18, (Object) this);

    public final void a() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 != 1) {
            return;
        }
        if (this.f1405c) {
            this.f.d(C0070l.ON_RESUME);
            this.f1405c = false;
            return;
        }
        Handler handler = this.f1407e;
        i.b(handler);
        handler.removeCallbacks(this.f1408g);
    }

    public final t e() {
        return this.f;
    }
}
