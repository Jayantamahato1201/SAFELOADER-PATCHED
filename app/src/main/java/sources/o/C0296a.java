package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.a  reason: case insensitive filesystem */
public final class C0296a {
    public static final C0296a b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0296a f3713c;

    /* renamed from: a  reason: collision with root package name */
    public final CancellationException f3714a;

    static {
        if (C0302g.f3723i) {
            f3713c = null;
            b = null;
            return;
        }
        f3713c = new C0296a(false, (CancellationException) null);
        b = new C0296a(true, (CancellationException) null);
    }

    public C0296a(boolean z2, CancellationException cancellationException) {
        this.f3714a = cancellationException;
    }
}
