package k0;

import android.animation.TimeInterpolator;

/* renamed from: k0.c  reason: case insensitive filesystem */
public final class C0283c {

    /* renamed from: a  reason: collision with root package name */
    public long f3626a;
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f3627c;

    /* renamed from: d  reason: collision with root package name */
    public int f3628d;

    /* renamed from: e  reason: collision with root package name */
    public int f3629e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3627c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return C0281a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0283c)) {
            return false;
        }
        C0283c cVar = (C0283c) obj;
        if (this.f3626a == cVar.f3626a && this.b == cVar.b && this.f3628d == cVar.f3628d && this.f3629e == cVar.f3629e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3626a;
        long j3 = this.b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f3628d) * 31) + this.f3629e;
    }

    public final String toString() {
        return "\n" + C0283c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3626a + " duration: " + this.b + " interpolator: " + a().getClass() + " repeatCount: " + this.f3628d + " repeatMode: " + this.f3629e + "}\n";
    }
}
