package q;

public final class f implements Comparable {
    public i f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ g f3830g;

    public f(g gVar) {
        this.f3830g = gVar;
    }

    public final int compareTo(Object obj) {
        return this.f.b - ((i) obj).b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f != null) {
            for (int i2 = 0; i2 < 9; i2++) {
                StringBuilder a2 = h.a(str);
                a2.append(this.f.f3840h[i2]);
                a2.append(" ");
                str = a2.toString();
            }
        }
        return str + "] " + this.f;
    }
}
