package M0;

import U0.i;
import V0.a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class c extends AbstractList implements List, a {

    /* renamed from: i  reason: collision with root package name */
    public static final Object[] f593i = new Object[0];
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f594g = f593i;

    /* renamed from: h  reason: collision with root package name */
    public int f595h;

    public final void a(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f594g.length;
        while (i2 < length && it.hasNext()) {
            this.f594g[i2] = it.next();
            i2++;
        }
        int i3 = this.f;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f594g[i4] = it.next();
        }
        this.f595h = collection.size() + this.f595h;
    }

    public final void add(int i2, Object obj) {
        int i3;
        int i4 = this.f595h;
        if (i2 < 0 || i2 > i4) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i4);
        } else if (i2 == i4) {
            addLast(obj);
        } else if (i2 == 0) {
            addFirst(obj);
        } else {
            b(i4 + 1);
            int d2 = d(this.f + i2);
            int i5 = this.f595h;
            if (i2 < ((i5 + 1) >> 1)) {
                if (d2 == 0) {
                    Object[] objArr = this.f594g;
                    i.e("<this>", objArr);
                    d2 = objArr.length;
                }
                int i6 = d2 - 1;
                int i7 = this.f;
                if (i7 == 0) {
                    Object[] objArr2 = this.f594g;
                    i.e("<this>", objArr2);
                    i3 = objArr2.length - 1;
                } else {
                    i3 = i7 - 1;
                }
                int i8 = this.f;
                if (i6 >= i8) {
                    Object[] objArr3 = this.f594g;
                    objArr3[i3] = objArr3[i8];
                    d.B0(objArr3, objArr3, i8, i8 + 1, i6 + 1);
                } else {
                    Object[] objArr4 = this.f594g;
                    d.B0(objArr4, objArr4, i8 - 1, i8, objArr4.length);
                    Object[] objArr5 = this.f594g;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    d.B0(objArr5, objArr5, 0, 1, i6 + 1);
                }
                this.f594g[i6] = obj;
                this.f = i3;
            } else {
                int d3 = d(this.f + i5);
                if (d2 < d3) {
                    Object[] objArr6 = this.f594g;
                    d.B0(objArr6, objArr6, d2 + 1, d2, d3);
                } else {
                    Object[] objArr7 = this.f594g;
                    d.B0(objArr7, objArr7, 1, 0, d3);
                    Object[] objArr8 = this.f594g;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    d.B0(objArr8, objArr8, d2 + 1, d2, objArr8.length - 1);
                }
                this.f594g[d2] = obj;
            }
            this.f595h++;
        }
    }

    public final boolean addAll(int i2, Collection collection) {
        i.e("elements", collection);
        int i3 = this.f595h;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        } else if (collection.isEmpty()) {
            return false;
        } else {
            int i4 = this.f595h;
            if (i2 == i4) {
                return addAll(collection);
            }
            b(collection.size() + i4);
            int d2 = d(this.f + this.f595h);
            int d3 = d(this.f + i2);
            int size = collection.size();
            if (i2 < ((this.f595h + 1) >> 1)) {
                int i5 = this.f;
                int i6 = i5 - size;
                if (d3 < i5) {
                    Object[] objArr = this.f594g;
                    d.B0(objArr, objArr, i6, i5, objArr.length);
                    if (size >= d3) {
                        Object[] objArr2 = this.f594g;
                        d.B0(objArr2, objArr2, objArr2.length - size, 0, d3);
                    } else {
                        Object[] objArr3 = this.f594g;
                        d.B0(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f594g;
                        d.B0(objArr4, objArr4, 0, size, d3);
                    }
                } else if (i6 >= 0) {
                    Object[] objArr5 = this.f594g;
                    d.B0(objArr5, objArr5, i6, i5, d3);
                } else {
                    Object[] objArr6 = this.f594g;
                    i6 += objArr6.length;
                    int i7 = d3 - i5;
                    int length = objArr6.length - i6;
                    if (length >= i7) {
                        d.B0(objArr6, objArr6, i6, i5, d3);
                    } else {
                        d.B0(objArr6, objArr6, i6, i5, i5 + length);
                        Object[] objArr7 = this.f594g;
                        d.B0(objArr7, objArr7, 0, this.f + length, d3);
                    }
                }
                this.f = i6;
                int i8 = d3 - size;
                if (i8 < 0) {
                    i8 += this.f594g.length;
                }
                a(i8, collection);
                return true;
            }
            int i9 = d3 + size;
            if (d3 < d2) {
                int i10 = size + d2;
                Object[] objArr8 = this.f594g;
                if (i10 <= objArr8.length) {
                    d.B0(objArr8, objArr8, i9, d3, d2);
                } else if (i9 >= objArr8.length) {
                    d.B0(objArr8, objArr8, i9 - objArr8.length, d3, d2);
                } else {
                    int length2 = d2 - (i10 - objArr8.length);
                    d.B0(objArr8, objArr8, 0, length2, d2);
                    Object[] objArr9 = this.f594g;
                    d.B0(objArr9, objArr9, i9, d3, length2);
                }
            } else {
                Object[] objArr10 = this.f594g;
                d.B0(objArr10, objArr10, size, 0, d2);
                Object[] objArr11 = this.f594g;
                if (i9 >= objArr11.length) {
                    d.B0(objArr11, objArr11, i9 - objArr11.length, d3, objArr11.length);
                } else {
                    d.B0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f594g;
                    d.B0(objArr12, objArr12, i9, d3, objArr12.length - size);
                }
            }
            a(d3, collection);
            return true;
        }
    }

    public final void addFirst(Object obj) {
        b(this.f595h + 1);
        int i2 = this.f;
        if (i2 == 0) {
            Object[] objArr = this.f594g;
            i.e("<this>", objArr);
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f = i3;
        this.f594g[i3] = obj;
        this.f595h++;
    }

    public final void addLast(Object obj) {
        b(this.f595h + 1);
        this.f594g[d(this.f + this.f595h)] = obj;
        this.f595h++;
    }

    public final void b(int i2) {
        if (i2 >= 0) {
            Object[] objArr = this.f594g;
            if (i2 > objArr.length) {
                if (objArr == f593i) {
                    if (i2 < 10) {
                        i2 = 10;
                    }
                    this.f594g = new Object[i2];
                    return;
                }
                int length = objArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                if (i3 - 2147483639 > 0) {
                    if (i2 > 2147483639) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i3 = 2147483639;
                    }
                }
                Object[] objArr2 = new Object[i3];
                d.B0(objArr, objArr2, 0, this.f, objArr.length);
                Object[] objArr3 = this.f594g;
                int length2 = objArr3.length;
                int i4 = this.f;
                d.B0(objArr3, objArr2, length2 - i4, 0, i4);
                this.f = 0;
                this.f594g = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int c(int i2) {
        Object[] objArr = this.f594g;
        i.e("<this>", objArr);
        if (i2 == objArr.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    public final void clear() {
        int d2 = d(this.f + this.f595h);
        int i2 = this.f;
        if (i2 < d2) {
            Object[] objArr = this.f594g;
            i.e("<this>", objArr);
            Arrays.fill(objArr, i2, d2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f594g;
            Arrays.fill(objArr2, this.f, objArr2.length, (Object) null);
            Object[] objArr3 = this.f594g;
            i.e("<this>", objArr3);
            Arrays.fill(objArr3, 0, d2, (Object) null);
        }
        this.f = 0;
        this.f595h = 0;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i2) {
        Object[] objArr = this.f594g;
        if (i2 >= objArr.length) {
            return i2 - objArr.length;
        }
        return i2;
    }

    public final Object get(int i2) {
        int i3 = this.f595h;
        if (i2 >= 0 && i2 < i3) {
            return this.f594g[d(this.f + i2)];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }

    public final int indexOf(Object obj) {
        int i2;
        int d2 = d(this.f + this.f595h);
        int i3 = this.f;
        if (i3 < d2) {
            while (i3 < d2) {
                if (i.a(obj, this.f594g[i3])) {
                    i2 = this.f;
                } else {
                    i3++;
                }
            }
            return -1;
        } else if (i3 < d2) {
            return -1;
        } else {
            int length = this.f594g.length;
            while (true) {
                if (i3 >= length) {
                    int i4 = 0;
                    while (i4 < d2) {
                        if (i.a(obj, this.f594g[i4])) {
                            i3 = i4 + this.f594g.length;
                            i2 = this.f;
                        } else {
                            i4++;
                        }
                    }
                    return -1;
                } else if (i.a(obj, this.f594g[i3])) {
                    i2 = this.f;
                    break;
                } else {
                    i3++;
                }
            }
        }
        return i3 - i2;
    }

    public final boolean isEmpty() {
        if (this.f595h == 0) {
            return true;
        }
        return false;
    }

    public final int lastIndexOf(Object obj) {
        int i2;
        int i3;
        int d2 = d(this.f + this.f595h);
        int i4 = this.f;
        if (i4 < d2) {
            i2 = d2 - 1;
            if (i4 <= i2) {
                while (!i.a(obj, this.f594g[i2])) {
                    if (i2 != i4) {
                        i2--;
                    }
                }
                i3 = this.f;
            }
            return -1;
        }
        if (i4 > d2) {
            int i5 = d2 - 1;
            while (true) {
                if (-1 >= i5) {
                    Object[] objArr = this.f594g;
                    i.e("<this>", objArr);
                    int length = objArr.length - 1;
                    int i6 = this.f;
                    if (i6 <= length) {
                        while (!i.a(obj, this.f594g[i2])) {
                            if (i2 != i6) {
                                length = i2 - 1;
                            }
                        }
                        i3 = this.f;
                    }
                } else if (i.a(obj, this.f594g[i5])) {
                    i2 = i5 + this.f594g.length;
                    i3 = this.f;
                    break;
                } else {
                    i5--;
                }
            }
        }
        return -1;
        return i2 - i3;
    }

    public final Object remove(int i2) {
        int i3 = this.f595h;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        } else if (i2 == i3 - 1) {
            return removeLast();
        } else {
            if (i2 == 0) {
                return removeFirst();
            }
            int d2 = d(this.f + i2);
            Object[] objArr = this.f594g;
            Object obj = objArr[d2];
            int i4 = this.f595h;
            if (i2 < (i4 >> 1)) {
                int i5 = this.f;
                if (d2 >= i5) {
                    d.B0(objArr, objArr, i5 + 1, i5, d2);
                } else {
                    d.B0(objArr, objArr, 1, 0, d2);
                    Object[] objArr2 = this.f594g;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i6 = this.f;
                    d.B0(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
                }
                Object[] objArr3 = this.f594g;
                int i7 = this.f;
                objArr3[i7] = null;
                this.f = c(i7);
            } else {
                int d3 = d((i4 - 1) + this.f);
                if (d2 <= d3) {
                    Object[] objArr4 = this.f594g;
                    d.B0(objArr4, objArr4, d2, d2 + 1, d3 + 1);
                } else {
                    Object[] objArr5 = this.f594g;
                    d.B0(objArr5, objArr5, d2, d2 + 1, objArr5.length);
                    Object[] objArr6 = this.f594g;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    d.B0(objArr6, objArr6, 0, 1, d3 + 1);
                }
                this.f594g[d3] = null;
            }
            this.f595h--;
            return obj;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            U0.i.e(r0, r12)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f594g
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0093
        L_0x0013:
            int r0 = r11.f
            int r2 = r11.f595h
            int r0 = r0 + r2
            int r0 = r11.d(r0)
            int r2 = r11.f
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0046
            r5 = r2
        L_0x0023:
            if (r2 >= r0) goto L_0x003b
            java.lang.Object[] r6 = r11.f594g
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L_0x0037
            java.lang.Object[] r7 = r11.f594g
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0038
        L_0x0037:
            r1 = 1
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003b:
            java.lang.Object[] r12 = r11.f594g
            java.lang.String r2 = "<this>"
            U0.i.e(r2, r12)
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L_0x0086
        L_0x0046:
            java.lang.Object[] r5 = r11.f594g
            int r5 = r5.length
            r6 = r2
            r7 = 0
        L_0x004b:
            if (r2 >= r5) goto L_0x0065
            java.lang.Object[] r8 = r11.f594g
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L_0x0061
            java.lang.Object[] r8 = r11.f594g
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0062
        L_0x0061:
            r7 = 1
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0065:
            int r2 = r11.d(r6)
            r5 = r2
        L_0x006a:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r2 = r11.f594g
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L_0x0081
            java.lang.Object[] r2 = r11.f594g
            r2[r5] = r6
            int r5 = r11.c(r5)
            goto L_0x0082
        L_0x0081:
            r7 = 1
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x006a
        L_0x0085:
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f
            int r5 = r5 - r12
            if (r5 >= 0) goto L_0x0091
            java.lang.Object[] r12 = r11.f594g
            int r12 = r12.length
            int r5 = r5 + r12
        L_0x0091:
            r11.f595h = r5
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.c.removeAll(java.util.Collection):boolean");
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f594g;
            int i2 = this.f;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.f = c(i2);
            this.f595h--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            int d2 = d((this.f595h - 1) + this.f);
            Object[] objArr = this.f594g;
            Object obj = objArr[d2];
            objArr[d2] = null;
            this.f595h--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            U0.i.e(r0, r12)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f594g
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0093
        L_0x0013:
            int r0 = r11.f
            int r2 = r11.f595h
            int r0 = r0 + r2
            int r0 = r11.d(r0)
            int r2 = r11.f
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0046
            r5 = r2
        L_0x0023:
            if (r2 >= r0) goto L_0x003b
            java.lang.Object[] r6 = r11.f594g
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0037
            java.lang.Object[] r7 = r11.f594g
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0038
        L_0x0037:
            r1 = 1
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003b:
            java.lang.Object[] r12 = r11.f594g
            java.lang.String r2 = "<this>"
            U0.i.e(r2, r12)
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L_0x0086
        L_0x0046:
            java.lang.Object[] r5 = r11.f594g
            int r5 = r5.length
            r6 = r2
            r7 = 0
        L_0x004b:
            if (r2 >= r5) goto L_0x0065
            java.lang.Object[] r8 = r11.f594g
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0061
            java.lang.Object[] r8 = r11.f594g
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0062
        L_0x0061:
            r7 = 1
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0065:
            int r2 = r11.d(r6)
            r5 = r2
        L_0x006a:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r2 = r11.f594g
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x0081
            java.lang.Object[] r2 = r11.f594g
            r2[r5] = r6
            int r5 = r11.c(r5)
            goto L_0x0082
        L_0x0081:
            r7 = 1
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x006a
        L_0x0085:
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f
            int r5 = r5 - r12
            if (r5 >= 0) goto L_0x0091
            java.lang.Object[] r12 = r11.f594g
            int r12 = r12.length
            int r5 = r5 + r12
        L_0x0091:
            r11.f595h = r5
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.c.retainAll(java.util.Collection):boolean");
    }

    public final Object set(int i2, Object obj) {
        int i3 = this.f595h;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        int d2 = d(this.f + i2);
        Object[] objArr = this.f594g;
        Object obj2 = objArr[d2];
        objArr[d2] = obj;
        return obj2;
    }

    public final int size() {
        return this.f595h;
    }

    public final Object[] toArray() {
        return toArray(new Object[this.f595h]);
    }

    public final Object[] toArray(Object[] objArr) {
        i.e("array", objArr);
        int length = objArr.length;
        int i2 = this.f595h;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            i.c("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", newInstance);
            objArr = (Object[]) newInstance;
        }
        int d2 = d(this.f + this.f595h);
        int i3 = this.f;
        if (i3 < d2) {
            d.B0(this.f594g, objArr, 0, i3, d2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f594g;
            d.B0(objArr2, objArr, 0, this.f, objArr2.length);
            Object[] objArr3 = this.f594g;
            d.B0(objArr3, objArr, objArr3.length - this.f, 0, d2);
        }
        int length2 = objArr.length;
        int i4 = this.f595h;
        if (length2 > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        i.e("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        b(collection.size() + this.f595h);
        a(d(this.f + this.f595h), collection);
        return true;
    }
}
