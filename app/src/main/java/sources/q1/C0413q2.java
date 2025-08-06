package q1;

/* renamed from: q1.q2  reason: case insensitive filesystem */
public final class C0413q2 {

    /* renamed from: a  reason: collision with root package name */
    public int[] f4177a;
    public Object[] b;

    /* renamed from: c  reason: collision with root package name */
    public int f4178c;

    public C0413q2(int i2) {
        if (i2 == 0) {
            this.f4177a = H.b;
            this.b = H.f3887d;
        } else {
            this.b = new Object[i2];
            this.f4177a = new int[i2];
        }
        this.f4178c = 0;
    }

    public final Object a(int i2) {
        int a2 = H.a(this.f4178c, i2, this.f4177a);
        if (a2 < 0) {
            return null;
        }
        return this.b[a2];
    }

    public final boolean b(int i2, Object obj) {
        int[] iArr = this.f4177a;
        int i3 = this.f4178c;
        Object[] objArr = this.b;
        int a2 = H.a(i3, i2, iArr);
        if (a2 >= 0) {
            objArr[a2] = obj;
            return false;
        }
        int i4 = ~a2;
        this.f4177a = H.s(iArr, i3, i4, i2);
        int i5 = i3 + 1;
        if (i5 <= objArr.length) {
            System.arraycopy(objArr, i4, objArr, i4 + 1, i3 - i4);
            objArr[i4] = obj;
        } else {
            int i6 = 4;
            if (i3 >= 4) {
                i6 = i3 * 2;
            }
            Object[] objArr2 = new Object[i6];
            System.arraycopy(objArr, 0, objArr2, 0, i4);
            objArr2[i4] = obj;
            System.arraycopy(objArr, i4, objArr2, i4 + 1, objArr.length - i4);
            objArr = objArr2;
        }
        this.b = objArr;
        this.f4178c = i5;
        return true;
    }

    public final boolean c(int i2) {
        int[] iArr = this.f4177a;
        int i3 = this.f4178c;
        int a2 = H.a(i3, i2, iArr);
        if (a2 < 0) {
            return false;
        }
        Object[] objArr = this.b;
        if (i3 == 1) {
            this.f4178c = 0;
            this.f4177a = H.b;
            this.b = H.f3887d;
            return true;
        }
        int i4 = i3 - 1;
        int i5 = i4 - a2;
        int length = objArr.length;
        if (length <= 4 || i4 >= length / 3) {
            if (i5 != 0) {
                int i6 = a2 + 1;
                System.arraycopy(objArr, i6, objArr, a2, i5);
                System.arraycopy(iArr, i6, iArr, a2, i5);
            }
            objArr[i4] = null;
        } else {
            Object[] objArr2 = new Object[i4];
            int[] iArr2 = new int[i4];
            if (a2 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, a2);
                System.arraycopy(iArr, 0, iArr2, 0, a2);
            }
            if (i5 != 0) {
                int i7 = a2 + 1;
                System.arraycopy(objArr, i7, objArr2, a2, i5);
                System.arraycopy(iArr, i7, iArr2, a2, i5);
            }
            this.b = objArr2;
            this.f4177a = iArr2;
        }
        this.f4178c = i4;
        return true;
    }
}
