package l;

import Q0.l;

/* renamed from: l.a  reason: case insensitive filesystem */
public final class C0284a extends l {

    /* renamed from: m  reason: collision with root package name */
    public static volatile C0284a f3631m;

    /* renamed from: l  reason: collision with root package name */
    public final c f3632l = new c();

    public static C0284a f0() {
        if (f3631m != null) {
            return f3631m;
        }
        synchronized (C0284a.class) {
            try {
                if (f3631m == null) {
                    f3631m = new C0284a();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f3631m;
    }
}
