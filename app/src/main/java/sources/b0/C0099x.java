package b0;

import android.graphics.Rect;
import android.view.View;
import androidx.emoji2.text.g;

/* renamed from: b0.x  reason: case insensitive filesystem */
public final class C0099x extends g {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1799d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0099x(J j2, int i2) {
        super(j2);
        this.f1799d = i2;
    }

    public final int b(View view) {
        switch (this.f1799d) {
            case 0:
                ((J) this.b).getClass();
                return view.getRight() + ((K) view.getLayoutParams()).b.right + ((K) view.getLayoutParams()).rightMargin;
            default:
                ((J) this.b).getClass();
                return view.getBottom() + ((K) view.getLayoutParams()).b.bottom + ((K) view.getLayoutParams()).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.f1799d) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                ((J) this.b).getClass();
                return J.A(view) + k2.leftMargin + k2.rightMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                ((J) this.b).getClass();
                return J.z(view) + k3.topMargin + k3.bottomMargin;
        }
    }

    public final int d(View view) {
        switch (this.f1799d) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                ((J) this.b).getClass();
                return J.z(view) + k2.topMargin + k2.bottomMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                ((J) this.b).getClass();
                return J.A(view) + k3.leftMargin + k3.rightMargin;
        }
    }

    public final int e(View view) {
        switch (this.f1799d) {
            case 0:
                ((J) this.b).getClass();
                return (view.getLeft() - ((K) view.getLayoutParams()).b.left) - ((K) view.getLayoutParams()).leftMargin;
            default:
                ((J) this.b).getClass();
                return (view.getTop() - ((K) view.getLayoutParams()).b.top) - ((K) view.getLayoutParams()).topMargin;
        }
    }

    public final int f() {
        switch (this.f1799d) {
            case 0:
                return ((J) this.b).f1588n;
            default:
                return ((J) this.b).f1589o;
        }
    }

    public final int g() {
        switch (this.f1799d) {
            case 0:
                J j2 = (J) this.b;
                return j2.f1588n - j2.F();
            default:
                J j3 = (J) this.b;
                return j3.f1589o - j3.D();
        }
    }

    public final int h() {
        switch (this.f1799d) {
            case 0:
                return ((J) this.b).F();
            default:
                return ((J) this.b).D();
        }
    }

    public final int i() {
        switch (this.f1799d) {
            case 0:
                return ((J) this.b).f1586l;
            default:
                return ((J) this.b).f1587m;
        }
    }

    public final int j() {
        switch (this.f1799d) {
            case 0:
                return ((J) this.b).f1587m;
            default:
                return ((J) this.b).f1586l;
        }
    }

    public final int k() {
        switch (this.f1799d) {
            case 0:
                return ((J) this.b).E();
            default:
                return ((J) this.b).G();
        }
    }

    public final int l() {
        switch (this.f1799d) {
            case 0:
                J j2 = (J) this.b;
                return (j2.f1588n - j2.E()) - j2.F();
            default:
                J j3 = (J) this.b;
                return (j3.f1589o - j3.G()) - j3.D();
        }
    }

    public final int m(View view) {
        switch (this.f1799d) {
            case 0:
                Rect rect = (Rect) this.f1154c;
                ((J) this.b).K(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f1154c;
                ((J) this.b).K(view, rect2);
                return rect2.bottom;
        }
    }

    public final int n(View view) {
        switch (this.f1799d) {
            case 0:
                Rect rect = (Rect) this.f1154c;
                ((J) this.b).K(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f1154c;
                ((J) this.b).K(view, rect2);
                return rect2.top;
        }
    }

    public final void o(int i2) {
        switch (this.f1799d) {
            case 0:
                ((J) this.b).O(i2);
                return;
            default:
                ((J) this.b).P(i2);
                return;
        }
    }
}
