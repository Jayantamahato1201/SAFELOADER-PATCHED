package n;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class k {

    /* renamed from: i  reason: collision with root package name */
    public static Object[] f3701i;

    /* renamed from: j  reason: collision with root package name */
    public static int f3702j;

    /* renamed from: k  reason: collision with root package name */
    public static Object[] f3703k;

    /* renamed from: l  reason: collision with root package name */
    public static int f3704l;
    public int[] f = C0291d.f3684a;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f3705g = C0291d.b;

    /* renamed from: h  reason: collision with root package name */
    public int f3706h = 0;

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                try {
                    if (f3704l < 10) {
                        objArr[0] = f3703k;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f3703k = objArr;
                        f3704l++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (k.class) {
                try {
                    if (f3702j < 10) {
                        objArr[0] = f3701i;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f3701i = objArr;
                        f3702j++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (k.class) {
                try {
                    Object[] objArr = f3703k;
                    if (objArr != null) {
                        this.f3705g = objArr;
                        f3703k = (Object[]) objArr[0];
                        this.f = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3704l--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i2 == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = f3701i;
                    if (objArr2 != null) {
                        this.f3705g = objArr2;
                        f3701i = (Object[]) objArr2[0];
                        this.f = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3702j--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f = new int[i2];
        this.f3705g = new Object[(i2 << 1)];
    }

    public final void b(int i2) {
        int i3 = this.f3706h;
        int[] iArr = this.f;
        if (iArr.length < i2) {
            Object[] objArr = this.f3705g;
            a(i2);
            if (this.f3706h > 0) {
                System.arraycopy(iArr, 0, this.f, 0, i3);
                System.arraycopy(objArr, 0, this.f3705g, 0, i3 << 1);
            }
            c(iArr, objArr, i3);
        }
        if (this.f3706h != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i2 = this.f3706h;
        if (i2 > 0) {
            int[] iArr = this.f;
            Object[] objArr = this.f3705g;
            this.f = C0291d.f3684a;
            this.f3705g = C0291d.b;
            this.f3706h = 0;
            c(iArr, objArr, i2);
        }
        if (this.f3706h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        if (e(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(int i2, Object obj) {
        int i3 = this.f3706h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a2 = C0291d.a(i3, i2, this.f);
            if (a2 < 0 || obj.equals(this.f3705g[a2 << 1])) {
                return a2;
            }
            int i4 = a2 + 1;
            while (i4 < i3 && this.f[i4] == i2) {
                if (obj.equals(this.f3705g[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            int i5 = a2 - 1;
            while (i5 >= 0 && this.f[i5] == i2) {
                if (obj.equals(this.f3705g[i5 << 1])) {
                    return i5;
                }
                i5--;
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        if (obj == null) {
            return f();
        }
        return d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f3706h != kVar.f3706h) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f3706h) {
                try {
                    Object h2 = h(i2);
                    Object j2 = j(i2);
                    Object orDefault = kVar.getOrDefault(h2, (Object) null);
                    if (j2 == null) {
                        if (orDefault != null || !kVar.containsKey(h2)) {
                            return false;
                        }
                    } else if (!j2.equals(orDefault)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f3706h != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f3706h) {
                try {
                    Object h3 = h(i3);
                    Object j3 = j(i3);
                    Object obj2 = map.get(h3);
                    if (j3 == null) {
                        if (obj2 != null || !map.containsKey(h3)) {
                            return false;
                        }
                    } else if (!j3.equals(obj2)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i2 = this.f3706h;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = C0291d.a(i2, 0, this.f);
            if (a2 < 0 || this.f3705g[a2 << 1] == null) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f[i3] == 0) {
                if (this.f3705g[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            int i4 = a2 - 1;
            while (i4 >= 0 && this.f[i4] == 0) {
                if (this.f3705g[i4 << 1] == null) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i2 = this.f3706h * 2;
        Object[] objArr = this.f3705g;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return this.f3705g[(e2 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i2) {
        return this.f3705g[i2 << 1];
    }

    public final int hashCode() {
        int i2;
        int[] iArr = this.f;
        Object[] objArr = this.f3705g;
        int i3 = this.f3706h;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            int i7 = iArr[i5];
            if (obj == null) {
                i2 = 0;
            } else {
                i2 = obj.hashCode();
            }
            i6 += i2 ^ i7;
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public final Object i(int i2) {
        Object[] objArr = this.f3705g;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f3706h;
        int i5 = 0;
        if (i4 <= 1) {
            c(this.f, objArr, i4);
            this.f = C0291d.f3684a;
            this.f3705g = C0291d.b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr2 = this.f3705g;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i3, i9 << 1);
                }
                Object[] objArr3 = this.f3705g;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                a(i7);
                if (i4 == this.f3706h) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.f, 0, i2);
                        System.arraycopy(objArr, 0, this.f3705g, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr, i11, this.f, i2, i12);
                        System.arraycopy(objArr, i11 << 1, this.f3705g, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.f3706h) {
            this.f3706h = i5;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean isEmpty() {
        if (this.f3706h <= 0) {
            return true;
        }
        return false;
    }

    public final Object j(int i2) {
        return this.f3705g[(i2 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int i3;
        int i4 = this.f3706h;
        if (obj == null) {
            i3 = f();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            i3 = d(hashCode, obj);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            Object[] objArr = this.f3705g;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~i3;
        int[] iArr = this.f;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            Object[] objArr2 = this.f3705g;
            a(i7);
            if (i4 == this.f3706h) {
                int[] iArr2 = this.f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f3705g, 0, objArr2.length);
                }
                c(iArr, objArr2, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.f;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.f3705g;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f3706h - i6) << 1);
        }
        int i9 = this.f3706h;
        if (i4 == i9) {
            int[] iArr4 = this.f;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr4 = this.f3705g;
                int i10 = i6 << 1;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.f3706h = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, (Object) null);
        if (orDefault == null) {
            return put(obj, obj2);
        }
        return orDefault;
    }

    public final Object remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return i(e2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return null;
        }
        int i2 = (e2 << 1) + 1;
        Object[] objArr = this.f3705g;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f3706h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3706h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3706h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j2 = j(i2);
            if (j2 != this) {
                sb.append(j2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object j2 = j(e2);
        if (obj2 != j2 && (obj2 == null || !obj2.equals(j2))) {
            return false;
        }
        i(e2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object j2 = j(e2);
        if (j2 != obj2 && (obj2 == null || !obj2.equals(j2))) {
            return false;
        }
        int i2 = (e2 << 1) + 1;
        Object[] objArr = this.f3705g;
        Object obj4 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
