package b0;

import android.view.View;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1573a;
    public final /* synthetic */ J b;

    public /* synthetic */ H(J j2, int i2) {
        this.f1573a = i2;
        this.b = j2;
    }

    public final int a(View view) {
        switch (this.f1573a) {
            case 0:
                this.b.getClass();
                return view.getRight() + ((K) view.getLayoutParams()).b.right + ((K) view.getLayoutParams()).rightMargin;
            default:
                this.b.getClass();
                return view.getBottom() + ((K) view.getLayoutParams()).b.bottom + ((K) view.getLayoutParams()).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f1573a) {
            case 0:
                this.b.getClass();
                return (view.getLeft() - ((K) view.getLayoutParams()).b.left) - ((K) view.getLayoutParams()).leftMargin;
            default:
                this.b.getClass();
                return (view.getTop() - ((K) view.getLayoutParams()).b.top) - ((K) view.getLayoutParams()).topMargin;
        }
    }

    public final int c() {
        switch (this.f1573a) {
            case 0:
                J j2 = this.b;
                return j2.f1588n - j2.F();
            default:
                J j3 = this.b;
                return j3.f1589o - j3.D();
        }
    }

    public final int d() {
        switch (this.f1573a) {
            case 0:
                return this.b.E();
            default:
                return this.b.G();
        }
    }
}
