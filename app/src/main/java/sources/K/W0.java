package k;

public final class W0 {

    /* renamed from: a  reason: collision with root package name */
    public int f3428a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f3429c;

    /* renamed from: d  reason: collision with root package name */
    public int f3430d;

    /* renamed from: e  reason: collision with root package name */
    public int f3431e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3432g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3433h;

    public final void a(int i2, int i3) {
        this.f3429c = i2;
        this.f3430d = i3;
        this.f3433h = true;
        if (this.f3432g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f3428a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3428a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.b = i3;
        }
    }
}
