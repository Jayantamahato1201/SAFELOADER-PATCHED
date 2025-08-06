package n;

public final class l implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f3707i = new Object();
    public int[] f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f3708g;

    /* renamed from: h  reason: collision with root package name */
    public int f3709h;

    public l() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f = new int[i5];
        this.f3708g = new Object[i5];
    }

    public final void a(int i2, Object obj) {
        int i3 = this.f3709h;
        if (i3 == 0 || i2 > this.f[i3 - 1]) {
            if (i3 >= this.f.length) {
                int i4 = (i3 + 1) * 4;
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
                int i7 = i4 / 4;
                int[] iArr = new int[i7];
                Object[] objArr = new Object[i7];
                int[] iArr2 = this.f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f3708g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f = iArr;
                this.f3708g = objArr;
            }
            this.f[i3] = i2;
            this.f3708g[i3] = obj;
            this.f3709h = i3 + 1;
            return;
        }
        d(i2, obj);
    }

    /* renamed from: b */
    public final l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f = (int[]) this.f.clone();
            lVar.f3708g = (Object[]) this.f3708g.clone();
            return lVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final Object c(int i2, Integer num) {
        Object obj;
        int a2 = C0291d.a(this.f3709h, i2, this.f);
        if (a2 < 0 || (obj = this.f3708g[a2]) == f3707i) {
            return num;
        }
        return obj;
    }

    public final void d(int i2, Object obj) {
        int a2 = C0291d.a(this.f3709h, i2, this.f);
        if (a2 >= 0) {
            this.f3708g[a2] = obj;
            return;
        }
        int i3 = ~a2;
        int i4 = this.f3709h;
        if (i3 < i4) {
            Object[] objArr = this.f3708g;
            if (objArr[i3] == f3707i) {
                this.f[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.f.length) {
            int i5 = (i4 + 1) * 4;
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
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3708g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f = iArr;
            this.f3708g = objArr2;
        }
        int i9 = this.f3709h - i3;
        if (i9 != 0) {
            int[] iArr3 = this.f;
            int i10 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i10, i9);
            Object[] objArr4 = this.f3708g;
            System.arraycopy(objArr4, i3, objArr4, i10, this.f3709h - i3);
        }
        this.f[i3] = i2;
        this.f3708g[i3] = obj;
        this.f3709h++;
    }

    public final String toString() {
        int i2 = this.f3709h;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f3709h; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f[i3]);
            sb.append('=');
            Object obj = this.f3708g[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
