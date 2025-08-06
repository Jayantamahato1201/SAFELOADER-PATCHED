package b0;

import android.view.View;
import androidx.emoji2.text.g;

/* renamed from: b0.s  reason: case insensitive filesystem */
public final class C0094s {

    /* renamed from: a  reason: collision with root package name */
    public g f1766a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f1767c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1768d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1769e;

    public C0094s() {
        d();
    }

    public final void a() {
        int i2;
        if (this.f1768d) {
            i2 = this.f1766a.g();
        } else {
            i2 = this.f1766a.k();
        }
        this.f1767c = i2;
    }

    public final void b(View view, int i2) {
        int i3;
        if (this.f1768d) {
            int b2 = this.f1766a.b(view);
            g gVar = this.f1766a;
            if (Integer.MIN_VALUE == gVar.f1153a) {
                i3 = 0;
            } else {
                i3 = gVar.l() - gVar.f1153a;
            }
            this.f1767c = i3 + b2;
        } else {
            this.f1767c = this.f1766a.e(view);
        }
        this.b = i2;
    }

    public final void c(View view, int i2) {
        int i3;
        g gVar = this.f1766a;
        if (Integer.MIN_VALUE == gVar.f1153a) {
            i3 = 0;
        } else {
            i3 = gVar.l() - gVar.f1153a;
        }
        if (i3 >= 0) {
            b(view, i2);
            return;
        }
        this.b = i2;
        if (this.f1768d) {
            int g2 = (this.f1766a.g() - i3) - this.f1766a.b(view);
            this.f1767c = this.f1766a.g() - g2;
            if (g2 > 0) {
                int c2 = this.f1767c - this.f1766a.c(view);
                int k2 = this.f1766a.k();
                int min = c2 - (Math.min(this.f1766a.e(view) - k2, 0) + k2);
                if (min < 0) {
                    this.f1767c = Math.min(g2, -min) + this.f1767c;
                    return;
                }
                return;
            }
            return;
        }
        int e2 = this.f1766a.e(view);
        int k3 = e2 - this.f1766a.k();
        this.f1767c = e2;
        if (k3 > 0) {
            int g3 = (this.f1766a.g() - Math.min(0, (this.f1766a.g() - i3) - this.f1766a.b(view))) - (this.f1766a.c(view) + e2);
            if (g3 < 0) {
                this.f1767c -= Math.min(k3, -g3);
            }
        }
    }

    public final void d() {
        this.b = -1;
        this.f1767c = Integer.MIN_VALUE;
        this.f1768d = false;
        this.f1769e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.f1767c + ", mLayoutFromEnd=" + this.f1768d + ", mValid=" + this.f1769e + '}';
    }
}
