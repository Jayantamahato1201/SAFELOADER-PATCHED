package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: n.c  reason: case insensitive filesystem */
public final class C0290c implements Collection, Set {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f3675j = new int[0];

    /* renamed from: k  reason: collision with root package name */
    public static final Object[] f3676k = new Object[0];

    /* renamed from: l  reason: collision with root package name */
    public static Object[] f3677l;

    /* renamed from: m  reason: collision with root package name */
    public static int f3678m;

    /* renamed from: n  reason: collision with root package name */
    public static Object[] f3679n;

    /* renamed from: o  reason: collision with root package name */
    public static int f3680o;
    public int[] f = f3675j;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f3681g = f3676k;

    /* renamed from: h  reason: collision with root package name */
    public int f3682h = 0;

    /* renamed from: i  reason: collision with root package name */
    public C0288a f3683i;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C0290c.class) {
                try {
                    if (f3680o < 10) {
                        objArr[0] = f3679n;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f3679n = objArr;
                        f3680o++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0290c.class) {
                try {
                    if (f3678m < 10) {
                        objArr[0] = f3677l;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f3677l = objArr;
                        f3678m++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (C0290c.class) {
                try {
                    Object[] objArr = f3679n;
                    if (objArr != null) {
                        this.f3681g = objArr;
                        f3679n = (Object[]) objArr[0];
                        this.f = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3680o--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i2 == 4) {
            synchronized (C0290c.class) {
                try {
                    Object[] objArr2 = f3677l;
                    if (objArr2 != null) {
                        this.f3681g = objArr2;
                        f3677l = (Object[]) objArr2[0];
                        this.f = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3678m--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f = new int[i2];
        this.f3681g = new Object[i2];
    }

    public final boolean add(Object obj) {
        int i2;
        int i3;
        if (obj == null) {
            i3 = d();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            i3 = c(hashCode, obj);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f3682h;
        int[] iArr = this.f;
        if (i5 >= iArr.length) {
            int i6 = 8;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f3681g;
            a(i6);
            int[] iArr2 = this.f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3681g, 0, objArr.length);
            }
            b(iArr, objArr, this.f3682h);
        }
        int i7 = this.f3682h;
        if (i4 < i7) {
            int[] iArr3 = this.f;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f3681g;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f3682h - i4);
        }
        this.f[i4] = i2;
        this.f3681g[i4] = obj;
        this.f3682h++;
        return true;
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f3682h;
        int[] iArr = this.f;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3681g;
            a(size);
            int i2 = this.f3682h;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f, 0, i2);
                System.arraycopy(objArr, 0, this.f3681g, 0, this.f3682h);
            }
            b(iArr, objArr, this.f3682h);
        }
        for (Object add : collection) {
            z2 |= add(add);
        }
        return z2;
    }

    public final int c(int i2, Object obj) {
        int i3 = this.f3682h;
        if (i3 == 0) {
            return -1;
        }
        int a2 = C0291d.a(i3, i2, this.f);
        if (a2 < 0 || obj.equals(this.f3681g[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f[i4] == i2) {
            if (obj.equals(this.f3681g[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f[i5] == i2) {
            if (obj.equals(this.f3681g[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public final void clear() {
        int i2 = this.f3682h;
        if (i2 != 0) {
            b(this.f, this.f3681g, i2);
            this.f = f3675j;
            this.f3681g = f3676k;
            this.f3682h = 0;
        }
    }

    public final boolean contains(Object obj) {
        int i2;
        if (obj == null) {
            i2 = d();
        } else {
            i2 = c(obj.hashCode(), obj);
        }
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i2 = this.f3682h;
        if (i2 == 0) {
            return -1;
        }
        int a2 = C0291d.a(i2, 0, this.f);
        if (a2 < 0 || this.f3681g[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f[i3] == 0) {
            if (this.f3681g[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f[i4] == 0) {
            if (this.f3681g[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public final void e(int i2) {
        Object[] objArr = this.f3681g;
        Object obj = objArr[i2];
        int i3 = this.f3682h;
        if (i3 <= 1) {
            b(this.f, objArr, i3);
            this.f = f3675j;
            this.f3681g = f3676k;
            this.f3682h = 0;
            return;
        }
        int[] iArr = this.f;
        int i4 = 8;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i5 = i3 - 1;
            this.f3682h = i5;
            if (i2 < i5) {
                int i6 = i2 + 1;
                System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                Object[] objArr2 = this.f3681g;
                System.arraycopy(objArr2, i6, objArr2, i2, this.f3682h - i2);
            }
            this.f3681g[this.f3682h] = null;
            return;
        }
        if (i3 > 8) {
            i4 = i3 + (i3 >> 1);
        }
        a(i4);
        this.f3682h--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.f, 0, i2);
            System.arraycopy(objArr, 0, this.f3681g, 0, i2);
        }
        int i7 = this.f3682h;
        if (i2 < i7) {
            int i8 = i2 + 1;
            System.arraycopy(iArr, i8, this.f, i2, i7 - i2);
            System.arraycopy(objArr, i8, this.f3681g, i2, this.f3682h - i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f3682h != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f3682h) {
                try {
                    if (!set.contains(this.f3681g[i2])) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f;
        int i2 = this.f3682h;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final boolean isEmpty() {
        if (this.f3682h <= 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        if (this.f3683i == null) {
            this.f3683i = new C0288a(1, this);
        }
        C0288a aVar = this.f3683i;
        if (aVar.b == null) {
            aVar.b = new C0295h(aVar, 1);
        }
        return aVar.b.iterator();
    }

    public final boolean remove(Object obj) {
        int i2;
        if (obj == null) {
            i2 = d();
        } else {
            i2 = c(obj.hashCode(), obj);
        }
        if (i2 < 0) {
            return false;
        }
        e(i2);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z2 = false;
        for (Object remove : collection) {
            z2 |= remove(remove);
        }
        return z2;
    }

    public final boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i2 = this.f3682h - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f3681g[i2])) {
                e(i2);
                z2 = true;
            }
        }
        return z2;
    }

    public final int size() {
        return this.f3682h;
    }

    public final Object[] toArray() {
        int i2 = this.f3682h;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f3681g, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3682h * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3682h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3681g[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f3682h) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f3682h);
        }
        System.arraycopy(this.f3681g, 0, objArr, 0, this.f3682h);
        int length = objArr.length;
        int i2 = this.f3682h;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
