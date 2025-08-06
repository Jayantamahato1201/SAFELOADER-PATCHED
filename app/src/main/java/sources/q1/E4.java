package q1;

import java.util.AbstractMap;
import java.util.Set;

public final class E4 extends AbstractMap {
    public int[] f = H.b;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f3874g = H.f3887d;

    /* renamed from: h  reason: collision with root package name */
    public int f3875h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final C0418r2 f3876i = new C0418r2(this);

    public final void clear() {
        this.f = H.b;
        this.f3874g = H.f3887d;
        this.f3875h = 0;
    }

    public final boolean containsKey(Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        if (H.a(this.f3875h, i2, this.f) >= 0) {
            return true;
        }
        return false;
    }

    public final Set entrySet() {
        return (H0) this.f3876i.f4181a;
    }

    public final Object get(Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int a2 = H.a(this.f3875h, i2, this.f);
        if (a2 >= 0) {
            return this.f3874g[(a2 << 1) + 1];
        }
        return null;
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int i3 = this.f3875h;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        int a2 = H.a(this.f3875h, i2, this.f);
        if (a2 >= 0) {
            int i4 = (a2 << 1) + 1;
            Object[] objArr = this.f3874g;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~a2;
        int[] iArr = this.f;
        if (i3 >= iArr.length) {
            Object[] objArr2 = this.f3874g;
            int i6 = 4;
            if (i3 >= 4) {
                i6 = i3 * 2;
            }
            int[] iArr2 = new int[i6];
            this.f = iArr2;
            this.f3874g = new Object[(i6 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            System.arraycopy(objArr2, 0, this.f3874g, 0, objArr2.length);
        }
        Object[] objArr3 = this.f3874g;
        int[] iArr3 = this.f;
        if (i5 < i3) {
            int i7 = i5 + 1;
            int i8 = i3 - i5;
            System.arraycopy(iArr3, i5, iArr3, i7, i8);
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, i8 << 1);
        }
        iArr3[i5] = i2;
        int i9 = i5 << 1;
        objArr3[i9] = obj;
        objArr3[i9 + 1] = obj2;
        this.f3875h = i3 + 1;
        return null;
    }

    public final Object remove(Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int a2 = H.a(this.f3875h, i2, this.f);
        if (a2 < 0) {
            return null;
        }
        Object[] objArr = this.f3874g;
        int i3 = a2 << 1;
        Object obj2 = objArr[i3 + 1];
        int i4 = this.f3875h;
        if (i4 <= 1) {
            clear();
            return obj2;
        }
        int i5 = i4 - 1;
        int[] iArr = this.f;
        int length = iArr.length;
        if (length <= 4 || i5 >= length / 3) {
            if (a2 < i5) {
                int i6 = a2 + 1;
                int i7 = i5 - a2;
                System.arraycopy(iArr, i6, iArr, a2, i7);
                System.arraycopy(objArr, i6 << 1, objArr, i3, i7 << 1);
            }
            int i8 = i5 << 1;
            objArr[i8] = null;
            objArr[i8 + 1] = null;
        } else {
            int[] iArr2 = new int[i5];
            this.f = iArr2;
            this.f3874g = new Object[(i5 << 1)];
            if (a2 > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, a2);
                System.arraycopy(objArr, 0, this.f3874g, 0, i3);
            }
            if (a2 < i5) {
                int i9 = a2 + 1;
                int i10 = i5 - a2;
                System.arraycopy(iArr, i9, this.f, a2, i10);
                System.arraycopy(objArr, i9 << 1, this.f3874g, i3, i10 << 1);
            }
        }
        this.f3875h = i5;
        return obj2;
    }

    public final int size() {
        return this.f3875h;
    }
}
