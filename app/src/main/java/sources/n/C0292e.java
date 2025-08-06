package n;

/* renamed from: n.e  reason: case insensitive filesystem */
public final class C0292e implements Cloneable {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f3685j = new Object();
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public long[] f3686g;

    /* renamed from: h  reason: collision with root package name */
    public Object[] f3687h;

    /* renamed from: i  reason: collision with root package name */
    public int f3688i;

    public C0292e() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f3686g = new long[i5];
        this.f3687h = new Object[i5];
    }

    public final void a(long j2, Long l2) {
        int i2 = this.f3688i;
        if (i2 == 0 || j2 > this.f3686g[i2 - 1]) {
            if (this.f && i2 >= this.f3686g.length) {
                d();
            }
            int i3 = this.f3688i;
            if (i3 >= this.f3686g.length) {
                int i4 = (i3 + 1) * 8;
                int i5 = 4;
                while (true) {
                    if (i5 >= 32) {
                        break;
                    }
                    int i6 = (1 << i5) - 12;
                    if (i4 <= i6) {
                        i4 = i6;
                        break;
                    }
                    i5++;
                }
                int i7 = i4 / 8;
                long[] jArr = new long[i7];
                Object[] objArr = new Object[i7];
                long[] jArr2 = this.f3686g;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f3687h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3686g = jArr;
                this.f3687h = objArr;
            }
            this.f3686g[i3] = j2;
            this.f3687h[i3] = l2;
            this.f3688i = i3 + 1;
            return;
        }
        f(j2, l2);
    }

    public final void b() {
        int i2 = this.f3688i;
        Object[] objArr = this.f3687h;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f3688i = 0;
        this.f = false;
    }

    /* renamed from: c */
    public final C0292e clone() {
        try {
            C0292e eVar = (C0292e) super.clone();
            eVar.f3686g = (long[]) this.f3686g.clone();
            eVar.f3687h = (Object[]) this.f3687h.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void d() {
        int i2 = this.f3688i;
        long[] jArr = this.f3686g;
        Object[] objArr = this.f3687h;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f3685j) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f = false;
        this.f3688i = i3;
    }

    public final Object e(long j2, Long l2) {
        Object obj;
        int b = C0291d.b(this.f3686g, this.f3688i, j2);
        if (b < 0 || (obj = this.f3687h[b]) == f3685j) {
            return l2;
        }
        return obj;
    }

    public final void f(long j2, Object obj) {
        int b = C0291d.b(this.f3686g, this.f3688i, j2);
        if (b >= 0) {
            this.f3687h[b] = obj;
            return;
        }
        int i2 = ~b;
        int i3 = this.f3688i;
        if (i2 < i3) {
            Object[] objArr = this.f3687h;
            if (objArr[i2] == f3685j) {
                this.f3686g[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f && i3 >= this.f3686g.length) {
            d();
            i2 = ~C0291d.b(this.f3686g, this.f3688i, j2);
        }
        int i4 = this.f3688i;
        if (i4 >= this.f3686g.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr2 = new Object[i8];
            long[] jArr2 = this.f3686g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3687h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3686g = jArr;
            this.f3687h = objArr2;
        }
        int i9 = this.f3688i - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f3686g;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.f3687h;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f3688i - i2);
        }
        this.f3686g[i2] = j2;
        this.f3687h[i2] = obj;
        this.f3688i++;
    }

    public final int g() {
        if (this.f) {
            d();
        }
        return this.f3688i;
    }

    public final Object h(int i2) {
        if (this.f) {
            d();
        }
        return this.f3687h[i2];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3688i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3688i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f) {
                d();
            }
            sb.append(this.f3686g[i2]);
            sb.append('=');
            Object h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
