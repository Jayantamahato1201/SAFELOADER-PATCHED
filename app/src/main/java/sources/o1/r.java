package o1;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3763a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f3764c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3765d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3766e;
    public r f;

    /* renamed from: g  reason: collision with root package name */
    public r f3767g;

    public r() {
        this.f3763a = new byte[8192];
        this.f3766e = true;
        this.f3765d = false;
    }

    public final r a() {
        r rVar;
        r rVar2 = this.f;
        if (rVar2 != this) {
            rVar = rVar2;
        } else {
            rVar = null;
        }
        r rVar3 = this.f3767g;
        rVar3.f = rVar2;
        this.f.f3767g = rVar3;
        this.f = null;
        this.f3767g = null;
        return rVar;
    }

    public final void b(r rVar) {
        rVar.f3767g = this;
        rVar.f = this.f;
        this.f.f3767g = rVar;
        this.f = rVar;
    }

    public final r c() {
        this.f3765d = true;
        return new r(this.f3763a, this.b, this.f3764c);
    }

    public final void d(r rVar, int i2) {
        if (rVar.f3766e) {
            int i3 = rVar.f3764c;
            int i4 = i3 + i2;
            byte[] bArr = rVar.f3763a;
            if (i4 > 8192) {
                if (!rVar.f3765d) {
                    int i5 = rVar.b;
                    if (i4 - i5 <= 8192) {
                        System.arraycopy(bArr, i5, bArr, 0, i3 - i5);
                        rVar.f3764c -= rVar.b;
                        rVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f3763a, this.b, bArr, rVar.f3764c, i2);
            rVar.f3764c += i2;
            this.b += i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public r(byte[] bArr, int i2, int i3) {
        this.f3763a = bArr;
        this.b = i2;
        this.f3764c = i3;
        this.f3765d = true;
        this.f3766e = false;
    }
}
