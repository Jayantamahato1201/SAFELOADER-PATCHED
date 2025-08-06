package q1;

import android.content.IntentFilter;
import b1.i;
import java.util.Iterator;

public abstract class U0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0413q2 f4012a = new C0413q2(0);
    public final C0413q2 b = new C0413q2(0);

    /* renamed from: c  reason: collision with root package name */
    public final C0413q2 f4013c = new C0413q2(0);

    /* renamed from: d  reason: collision with root package name */
    public final C0413q2 f4014d = new C0413q2(0);

    /* renamed from: e  reason: collision with root package name */
    public final C0413q2 f4015e = new C0413q2(0);
    public final C0413q2 f = new C0413q2(0);

    public static void e(C0413q2 q2Var, String str, C0450w4 w4Var) {
        int hashCode = str.hashCode();
        C0413q2 q2Var2 = (C0413q2) q2Var.a(hashCode);
        if (q2Var2 != null && q2Var2.c(w4Var.hashCode()) && q2Var2.f4178c == 0) {
            q2Var.c(hashCode);
        }
    }

    public abstract Object a(IntentFilter intentFilter, int i2, int i3);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: q1.q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: q1.q2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList b(android.content.Intent r14, java.lang.String r15, boolean r16, int r17) {
        /*
            r13 = this;
            java.lang.String r5 = r14.getScheme()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r0 = r14.getAction()
            r1 = 0
            if (r15 == 0) goto L_0x0072
            int r2 = b1.i.g0(r15)
            if (r2 <= 0) goto L_0x0072
            r3 = 0
            r4 = 1
            r6 = 42
            if (r2 != r4) goto L_0x0034
            char r8 = r15.charAt(r3)
            if (r8 == r6) goto L_0x0023
            goto L_0x0034
        L_0x0023:
            if (r0 == 0) goto L_0x0072
            q1.q2 r2 = r13.f
            int r3 = r0.hashCode()
            java.lang.Object r2 = r2.a(r3)
            q1.q2 r2 = (q1.C0413q2) r2
            r10 = r1
        L_0x0032:
            r11 = r10
            goto L_0x0075
        L_0x0034:
            java.lang.String r3 = r15.substring(r3, r2)
            int r3 = r3.hashCode()
            int r8 = r15.length()
            int r9 = r2 + 2
            if (r8 != r9) goto L_0x0055
            int r2 = r2 + r4
            char r2 = r15.charAt(r2)
            if (r2 == r6) goto L_0x004c
            goto L_0x0055
        L_0x004c:
            q1.q2 r2 = r13.b
            java.lang.Object r2 = r2.a(r3)
            q1.q2 r2 = (q1.C0413q2) r2
            goto L_0x0061
        L_0x0055:
            q1.q2 r2 = r13.f4012a
            int r4 = r15.hashCode()
            java.lang.Object r2 = r2.a(r4)
            q1.q2 r2 = (q1.C0413q2) r2
        L_0x0061:
            q1.q2 r4 = r13.f4013c
            java.lang.Object r3 = r4.a(r3)
            q1.q2 r3 = (q1.C0413q2) r3
            java.lang.Object r4 = r4.a(r6)
            q1.q2 r4 = (q1.C0413q2) r4
            r10 = r3
            r11 = r4
            goto L_0x0075
        L_0x0072:
            r2 = r1
            r10 = r2
            goto L_0x0032
        L_0x0075:
            if (r5 == 0) goto L_0x0087
            q1.q2 r0 = r13.f4014d
            int r1 = r5.hashCode()
            java.lang.Object r0 = r0.a(r1)
            r1 = r0
            q1.q2 r1 = (q1.C0413q2) r1
        L_0x0084:
            r12 = r1
            r6 = r2
            goto L_0x0099
        L_0x0087:
            if (r15 != 0) goto L_0x0084
            if (r0 == 0) goto L_0x0084
            q1.q2 r2 = r13.f4015e
            int r0 = r0.hashCode()
            java.lang.Object r0 = r2.a(r0)
            r2 = r0
            q1.q2 r2 = (q1.C0413q2) r2
            goto L_0x0084
        L_0x0099:
            java.util.Set r2 = r14.getCategories()
            j1.D r9 = new j1.D
            r0 = 8
            r9.<init>(r0)
            if (r6 == 0) goto L_0x00b0
            r0 = r13
            r1 = r14
            r4 = r15
            r3 = r16
            r8 = r17
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00b0:
            if (r10 == 0) goto L_0x00bd
            r0 = r13
            r1 = r14
            r4 = r15
            r3 = r16
            r8 = r17
            r6 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00bd:
            if (r11 == 0) goto L_0x00ca
            r0 = r13
            r1 = r14
            r4 = r15
            r3 = r16
            r8 = r17
            r6 = r11
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00ca:
            if (r12 == 0) goto L_0x00d7
            r0 = r13
            r1 = r14
            r4 = r15
            r3 = r16
            r8 = r17
            r6 = r12
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00d7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.U0.b(android.content.Intent, java.lang.String, boolean, int):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        r13 = h(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Intent r17, java.util.Set r18, boolean r19, java.lang.String r20, java.lang.String r21, q1.C0413q2 r22, java.util.ArrayList r23, int r24, j1.D r25) {
        /*
            r16 = this;
            r0 = r16
            r1 = r22
            r2 = r25
            java.lang.String r4 = r17.getAction()
            android.net.Uri r7 = r17.getData()
            java.lang.String r10 = r17.getPackage()
            r11 = 0
            r3 = 0
        L_0x0014:
            int r5 = r1.f4178c
            if (r3 >= r5) goto L_0x008d
            java.lang.Object[] r5 = r1.b
            int r12 = r3 + 1
            r3 = r5[r3]
            android.content.IntentFilter r3 = (android.content.IntentFilter) r3
            boolean r5 = r0.g(r10, r3)
            if (r5 != 0) goto L_0x002b
        L_0x0026:
            r6 = r23
            r5 = r24
            goto L_0x008b
        L_0x002b:
            int r13 = r0.h(r3)
            int[] r5 = r2.f3206a
            int r6 = r2.b
            int r14 = q1.H.a(r6, r13, r5)
            if (r14 < 0) goto L_0x003a
            goto L_0x0026
        L_0x003a:
            if (r19 == 0) goto L_0x0044
            java.lang.String r5 = "android.intent.category.DEFAULT"
            boolean r5 = r3.hasCategory(r5)
            if (r5 == 0) goto L_0x0026
        L_0x0044:
            java.lang.String r9 = "62v.net"
            r8 = r18
            r5 = r20
            r6 = r21
            int r9 = r3.match(r4, r5, r6, r7, r8, r9)
            if (r9 < 0) goto L_0x0026
            r5 = r24
            java.lang.Object r3 = r0.a(r3, r9, r5)
            r6 = r23
            if (r3 == 0) goto L_0x008b
            r6.add(r3)
            int r3 = r2.b
            int[] r8 = r2.f3206a
            int r9 = ~r14
            int r14 = r3 + 1
            int r15 = r8.length
            if (r14 > r15) goto L_0x0072
            int r15 = r9 + 1
            int r3 = r3 - r9
            java.lang.System.arraycopy(r8, r9, r8, r15, r3)
            r8[r9] = r13
            goto L_0x0087
        L_0x0072:
            r15 = 4
            if (r3 >= r15) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            int r15 = r3 * 2
        L_0x0078:
            int[] r3 = new int[r15]
            java.lang.System.arraycopy(r8, r11, r3, r11, r9)
            r3[r9] = r13
            int r13 = r9 + 1
            int r15 = r8.length
            int r15 = r15 - r9
            java.lang.System.arraycopy(r8, r9, r3, r13, r15)
            r8 = r3
        L_0x0087:
            r2.f3206a = r8
            r2.b = r14
        L_0x008b:
            r3 = r12
            goto L_0x0014
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.U0.c(android.content.Intent, java.util.Set, boolean, java.lang.String, java.lang.String, q1.q2, java.util.ArrayList, int, j1.D):void");
    }

    public void d(IntentFilter intentFilter) {
        Iterator<String> actionsIterator;
        Object obj;
        int i2;
        Iterator<String> actionsIterator2;
        Object obj2;
        int i3;
        String str;
        Object obj3;
        Object obj4;
        int i4;
        Object obj5;
        int i5;
        int i6;
        Object obj6;
        int i7;
        IntentFilter intentFilter2 = intentFilter;
        Iterator<String> schemesIterator = intentFilter2.schemesIterator();
        int i8 = 0;
        int i9 = 0;
        if (schemesIterator != null) {
            while (schemesIterator.hasNext()) {
                i9++;
                int hashCode = schemesIterator.next().hashCode();
                L0 l02 = L0.f3934l;
                C0413q2 q2Var = this.f4014d;
                int[] iArr = q2Var.f4177a;
                int i10 = q2Var.f4178c;
                Object[] objArr = q2Var.b;
                int a2 = H.a(i10, hashCode, iArr);
                if (a2 >= 0) {
                    obj6 = objArr[a2];
                } else {
                    int i11 = ~a2;
                    q2Var.f4177a = H.s(iArr, i10, i11, hashCode);
                    int i12 = i10 + 1;
                    q2Var.f4178c = i12;
                    Object a3 = l02.a();
                    if (i12 <= objArr.length) {
                        System.arraycopy(objArr, i11, objArr, i11 + 1, i10 - i11);
                        objArr[i11] = a3;
                    } else {
                        if (i10 < 4) {
                            i7 = 4;
                        } else {
                            i7 = i10 * 2;
                        }
                        Object[] objArr2 = new Object[i7];
                        System.arraycopy(objArr, 0, objArr2, 0, i11);
                        objArr2[i11] = a3;
                        System.arraycopy(objArr, i11, objArr2, i11 + 1, objArr.length - i11);
                        objArr = objArr2;
                    }
                    q2Var.b = objArr;
                    obj6 = a3;
                }
                ((C0413q2) obj6).b(intentFilter2.hashCode(), intentFilter2);
            }
        }
        Iterator<String> typesIterator = intentFilter2.typesIterator();
        int i13 = 0;
        if (typesIterator != null) {
            while (typesIterator.hasNext()) {
                String next = typesIterator.next();
                i13++;
                int g02 = i.g0(next);
                if (g02 > 0) {
                    str = next.substring(i8, g02).intern();
                } else {
                    str = next;
                    next = next.concat("/*");
                }
                int hashCode2 = next.hashCode();
                L0 l03 = L0.f3934l;
                C0413q2 q2Var2 = this.f4012a;
                int[] iArr2 = q2Var2.f4177a;
                int i14 = q2Var2.f4178c;
                Object[] objArr3 = q2Var2.b;
                int a4 = H.a(i14, hashCode2, iArr2);
                if (a4 >= 0) {
                    obj3 = objArr3[a4];
                } else {
                    int i15 = ~a4;
                    q2Var2.f4177a = H.s(iArr2, i14, i15, hashCode2);
                    int i16 = i14 + 1;
                    q2Var2.f4178c = i16;
                    Object a5 = l03.a();
                    if (i16 <= objArr3.length) {
                        System.arraycopy(objArr3, i15, objArr3, i15 + 1, i14 - i15);
                        objArr3[i15] = a5;
                    } else {
                        if (i14 < 4) {
                            i6 = 4;
                        } else {
                            i6 = i14 * 2;
                        }
                        Object[] objArr4 = new Object[i6];
                        System.arraycopy(objArr3, 0, objArr4, 0, i15);
                        objArr4[i15] = a5;
                        System.arraycopy(objArr3, i15, objArr4, i15 + 1, objArr3.length - i15);
                        objArr3 = objArr4;
                    }
                    q2Var2.b = objArr3;
                    obj3 = a5;
                }
                ((C0413q2) obj3).b(intentFilter2.hashCode(), intentFilter2);
                if (g02 > 0) {
                    int hashCode3 = str.hashCode();
                    C0413q2 q2Var3 = this.b;
                    int[] iArr3 = q2Var3.f4177a;
                    int i17 = q2Var3.f4178c;
                    Object[] objArr5 = q2Var3.b;
                    int a6 = H.a(i17, hashCode3, iArr3);
                    if (a6 >= 0) {
                        obj5 = objArr5[a6];
                    } else {
                        int i18 = ~a6;
                        q2Var3.f4177a = H.s(iArr3, i17, i18, hashCode3);
                        int i19 = i17 + 1;
                        q2Var3.f4178c = i19;
                        Object a7 = l03.a();
                        if (i19 <= objArr5.length) {
                            System.arraycopy(objArr5, i18, objArr5, i18 + 1, i17 - i18);
                            objArr5[i18] = a7;
                        } else {
                            if (i17 < 4) {
                                i5 = 4;
                            } else {
                                i5 = i17 * 2;
                            }
                            Object[] objArr6 = new Object[i5];
                            System.arraycopy(objArr5, 0, objArr6, 0, i18);
                            objArr6[i18] = a7;
                            System.arraycopy(objArr5, i18, objArr6, i18 + 1, objArr5.length - i18);
                            objArr5 = objArr6;
                        }
                        q2Var3.b = objArr5;
                        obj5 = a7;
                    }
                    ((C0413q2) obj5).b(intentFilter2.hashCode(), intentFilter2);
                } else {
                    int hashCode4 = str.hashCode();
                    C0413q2 q2Var4 = this.f4013c;
                    int[] iArr4 = q2Var4.f4177a;
                    int i20 = q2Var4.f4178c;
                    Object[] objArr7 = q2Var4.b;
                    int a8 = H.a(i20, hashCode4, iArr4);
                    if (a8 >= 0) {
                        obj4 = objArr7[a8];
                    } else {
                        int i21 = ~a8;
                        q2Var4.f4177a = H.s(iArr4, i20, i21, hashCode4);
                        int i22 = i20 + 1;
                        q2Var4.f4178c = i22;
                        Object a9 = l03.a();
                        if (i22 <= objArr7.length) {
                            System.arraycopy(objArr7, i21, objArr7, i21 + 1, i20 - i21);
                            objArr7[i21] = a9;
                        } else {
                            if (i20 < 4) {
                                i4 = 4;
                            } else {
                                i4 = i20 * 2;
                            }
                            Object[] objArr8 = new Object[i4];
                            System.arraycopy(objArr7, 0, objArr8, 0, i21);
                            objArr8[i21] = a9;
                            System.arraycopy(objArr7, i21, objArr8, i21 + 1, objArr7.length - i21);
                            objArr7 = objArr8;
                        }
                        q2Var4.b = objArr7;
                        obj4 = a9;
                    }
                    ((C0413q2) obj4).b(intentFilter2.hashCode(), intentFilter2);
                }
                i8 = 0;
            }
        }
        if (i9 == 0 && i13 == 0 && (actionsIterator2 = intentFilter2.actionsIterator()) != null) {
            while (actionsIterator2.hasNext()) {
                int hashCode5 = actionsIterator2.next().hashCode();
                L0 l04 = L0.f3934l;
                C0413q2 q2Var5 = this.f4015e;
                int[] iArr5 = q2Var5.f4177a;
                int i23 = q2Var5.f4178c;
                Object[] objArr9 = q2Var5.b;
                int a10 = H.a(i23, hashCode5, iArr5);
                if (a10 >= 0) {
                    obj2 = objArr9[a10];
                } else {
                    int i24 = ~a10;
                    q2Var5.f4177a = H.s(iArr5, i23, i24, hashCode5);
                    int i25 = i23 + 1;
                    q2Var5.f4178c = i25;
                    Object a11 = l04.a();
                    if (i25 <= objArr9.length) {
                        System.arraycopy(objArr9, i24, objArr9, i24 + 1, i23 - i24);
                        objArr9[i24] = a11;
                    } else {
                        if (i23 < 4) {
                            i3 = 4;
                        } else {
                            i3 = i23 * 2;
                        }
                        Object[] objArr10 = new Object[i3];
                        System.arraycopy(objArr9, 0, objArr10, 0, i24);
                        objArr10[i24] = a11;
                        System.arraycopy(objArr9, i24, objArr10, i24 + 1, objArr9.length - i24);
                        objArr9 = objArr10;
                    }
                    q2Var5.b = objArr9;
                    obj2 = a11;
                }
                ((C0413q2) obj2).b(intentFilter2.hashCode(), intentFilter2);
            }
        }
        if (i13 != 0 && (actionsIterator = intentFilter2.actionsIterator()) != null) {
            while (actionsIterator.hasNext()) {
                int hashCode6 = actionsIterator.next().hashCode();
                L0 l05 = L0.f3934l;
                C0413q2 q2Var6 = this.f;
                int[] iArr6 = q2Var6.f4177a;
                int i26 = q2Var6.f4178c;
                Object[] objArr11 = q2Var6.b;
                int a12 = H.a(i26, hashCode6, iArr6);
                if (a12 >= 0) {
                    obj = objArr11[a12];
                } else {
                    int i27 = ~a12;
                    q2Var6.f4177a = H.s(iArr6, i26, i27, hashCode6);
                    int i28 = i26 + 1;
                    q2Var6.f4178c = i28;
                    Object a13 = l05.a();
                    if (i28 <= objArr11.length) {
                        System.arraycopy(objArr11, i27, objArr11, i27 + 1, i26 - i27);
                        objArr11[i27] = a13;
                    } else {
                        if (i26 < 4) {
                            i2 = 4;
                        } else {
                            i2 = i26 * 2;
                        }
                        Object[] objArr12 = new Object[i2];
                        System.arraycopy(objArr11, 0, objArr12, 0, i27);
                        objArr12[i27] = a13;
                        System.arraycopy(objArr11, i27, objArr12, i27 + 1, objArr11.length - i27);
                        objArr11 = objArr12;
                    }
                    q2Var6.b = objArr11;
                    obj = a13;
                }
                ((C0413q2) obj).b(intentFilter2.hashCode(), intentFilter2);
            }
        }
    }

    public void f(C0450w4 w4Var) {
        Iterator<String> actionsIterator;
        Iterator<String> actionsIterator2;
        String str;
        Iterator<String> schemesIterator = w4Var.schemesIterator();
        int i2 = 0;
        int i3 = 0;
        if (schemesIterator != null) {
            while (schemesIterator.hasNext()) {
                i3++;
                e(this.f4014d, schemesIterator.next(), w4Var);
            }
        }
        Iterator<String> typesIterator = w4Var.typesIterator();
        if (typesIterator != null) {
            int i4 = 0;
            while (typesIterator.hasNext()) {
                String next = typesIterator.next();
                i4++;
                int g02 = i.g0(next);
                if (g02 > 0) {
                    str = next.substring(0, g02).intern();
                } else {
                    str = next;
                    next = next.concat("/*");
                }
                e(this.f4012a, next, w4Var);
                if (g02 > 0) {
                    e(this.b, str, w4Var);
                } else {
                    e(this.f4013c, str, w4Var);
                }
            }
            i2 = i4;
        }
        if (i3 == 0 && i2 == 0 && (actionsIterator2 = w4Var.actionsIterator()) != null) {
            while (actionsIterator2.hasNext()) {
                e(this.f4015e, actionsIterator2.next(), w4Var);
            }
        }
        if (i2 != 0 && (actionsIterator = w4Var.actionsIterator()) != null) {
            while (actionsIterator.hasNext()) {
                e(this.f, actionsIterator.next(), w4Var);
            }
        }
    }

    public boolean g(String str, IntentFilter intentFilter) {
        return true;
    }

    public abstract int h(IntentFilter intentFilter);
}
