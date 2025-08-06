package O;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f609a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public float f610c;

    /* renamed from: d  reason: collision with root package name */
    public float f611d;

    /* renamed from: e  reason: collision with root package name */
    public long f612e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f613g;

    /* renamed from: h  reason: collision with root package name */
    public float f614h;

    /* renamed from: i  reason: collision with root package name */
    public int f615i;

    public final float a(long j2) {
        long j3 = this.f612e;
        if (j2 < j3) {
            return 0.0f;
        }
        long j4 = this.f613g;
        if (j4 < 0 || j2 < j4) {
            return g.b(((float) (j2 - j3)) / ((float) this.f609a), 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f614h;
        return (g.b(((float) (j2 - j4)) / ((float) this.f615i), 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
