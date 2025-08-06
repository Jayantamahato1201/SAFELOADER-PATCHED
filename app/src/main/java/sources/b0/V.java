package b0;

public final class V {

    /* renamed from: a  reason: collision with root package name */
    public int f1609a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f1610c;

    /* renamed from: d  reason: collision with root package name */
    public int f1611d;

    /* renamed from: e  reason: collision with root package name */
    public int f1612e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1613g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1614h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1615i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1616j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1617k;

    /* renamed from: l  reason: collision with root package name */
    public int f1618l;

    /* renamed from: m  reason: collision with root package name */
    public long f1619m;

    /* renamed from: n  reason: collision with root package name */
    public int f1620n;

    public final void a(int i2) {
        if ((this.f1611d & i2) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f1611d));
        }
    }

    public final int b() {
        if (this.f1613g) {
            return this.b - this.f1610c;
        }
        return this.f1612e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1609a + ", mData=null, mItemCount=" + this.f1612e + ", mIsMeasuring=" + this.f1615i + ", mPreviousLayoutItemCount=" + this.b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1610c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.f1613g + ", mRunSimpleAnimations=" + this.f1616j + ", mRunPredictiveAnimations=" + this.f1617k + '}';
    }
}
