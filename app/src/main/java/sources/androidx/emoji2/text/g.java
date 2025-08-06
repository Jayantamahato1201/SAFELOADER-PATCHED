package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import b0.C0099x;
import b0.J;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public int f1153a;
    public final Object b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1154c;

    public g(J j2) {
        this.f1153a = Integer.MIN_VALUE;
        this.f1154c = new Rect();
        this.b = j2;
    }

    public static g a(J j2, int i2) {
        if (i2 == 0) {
            return new C0099x(j2, 0);
        }
        if (i2 == 1) {
            return new C0099x(j2, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i2);

    public g(i iVar) {
        this.f1153a = 0;
        this.f1154c = new d();
        this.b = iVar;
    }
}
