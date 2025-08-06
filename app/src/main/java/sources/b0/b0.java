package b0;

import androidx.recyclerview.widget.RecyclerView;

public final class b0 extends M {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1651a = false;
    public final /* synthetic */ C0101z b;

    public b0(C0101z zVar) {
        this.b = zVar;
    }

    public final void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0 && this.f1651a) {
            this.f1651a = false;
            this.b.f();
        }
    }

    public final void b(RecyclerView recyclerView, int i2, int i3) {
        if (i2 != 0 || i3 != 0) {
            this.f1651a = true;
        }
    }
}
