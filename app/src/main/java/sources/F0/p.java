package f0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public m f2686a;
    public ViewGroup b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: f0.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01fc A[EDGE_INSN: B:134:0x01fc->B:90:0x01fc ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r19 = this;
            r0 = r19
            android.view.ViewGroup r1 = r0.b
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.removeOnPreDrawListener(r0)
            r1.removeOnAttachStateChangeListener(r0)
            java.util.ArrayList r1 = f0.q.f2688c
            android.view.ViewGroup r3 = r0.b
            boolean r1 = r1.remove(r3)
            r8 = 1
            if (r1 != 0) goto L_0x001a
            return r8
        L_0x001a:
            n.b r1 = f0.q.b()
            r2 = 0
            java.lang.Object r4 = r1.getOrDefault(r3, r2)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L_0x0031
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.put(r3, r4)
        L_0x002f:
            r5 = r2
            goto L_0x003c
        L_0x0031:
            int r5 = r4.size()
            if (r5 <= 0) goto L_0x002f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
        L_0x003c:
            f0.m r6 = r0.f2686a
            r4.add(r6)
            f0.o r4 = new f0.o
            r4.<init>(r0, r1)
            r6.a(r4)
            r1 = 0
            r6.h(r3, r1)
            if (r5 == 0) goto L_0x0062
            int r4 = r5.size()
            r7 = 0
        L_0x0054:
            if (r7 >= r4) goto L_0x0062
            java.lang.Object r9 = r5.get(r7)
            int r7 = r7 + 1
            f0.m r9 = (f0.m) r9
            r9.y(r3)
            goto L_0x0054
        L_0x0062:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.f2674p = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.f2675q = r4
            androidx.emoji2.text.r r4 = r6.f2670l
            androidx.emoji2.text.r r5 = r6.f2671m
            n.b r7 = new n.b
            java.lang.Object r9 = r4.f1183a
            n.b r9 = (n.C0289b) r9
            r7.<init>(r9)
            n.b r9 = new n.b
            java.lang.Object r10 = r5.f1183a
            n.b r10 = (n.C0289b) r10
            r9.<init>(r10)
            r10 = 0
        L_0x0087:
            int[] r11 = r6.f2673o
            int r12 = r11.length
            if (r10 >= r12) goto L_0x01fc
            r11 = r11[r10]
            if (r11 == r8) goto L_0x01b8
            r12 = 2
            if (r11 == r12) goto L_0x0164
            r12 = 3
            if (r11 == r12) goto L_0x010a
            r12 = 4
            if (r11 == r12) goto L_0x009e
        L_0x0099:
            r15 = r9
            r16 = 1
            goto L_0x01f2
        L_0x009e:
            java.lang.Object r11 = r4.f1184c
            n.e r11 = (n.C0292e) r11
            int r12 = r11.g()
            r13 = 0
        L_0x00a7:
            if (r13 >= r12) goto L_0x0099
            java.lang.Object r14 = r11.h(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0100
            boolean r15 = r6.t(r14)
            if (r15 == 0) goto L_0x0100
            boolean r15 = r11.f
            if (r15 == 0) goto L_0x00be
            r11.d()
        L_0x00be:
            long[] r15 = r11.f3686g
            r17 = r9
            r16 = 1
            r8 = r15[r13]
            java.lang.Object r15 = r5.f1184c
            n.e r15 = (n.C0292e) r15
            java.lang.Object r8 = r15.e(r8, r2)
            android.view.View r8 = (android.view.View) r8
            if (r8 == 0) goto L_0x00fd
            boolean r9 = r6.t(r8)
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r7.getOrDefault(r14, r2)
            f0.u r9 = (f0.u) r9
            r15 = r17
            java.lang.Object r17 = r15.getOrDefault(r8, r2)
            r1 = r17
            f0.u r1 = (f0.u) r1
            if (r9 == 0) goto L_0x0103
            if (r1 == 0) goto L_0x0103
            java.util.ArrayList r2 = r6.f2674p
            r2.add(r9)
            java.util.ArrayList r2 = r6.f2675q
            r2.add(r1)
            r7.remove(r14)
            r15.remove(r8)
            goto L_0x0103
        L_0x00fd:
            r15 = r17
            goto L_0x0103
        L_0x0100:
            r15 = r9
            r16 = 1
        L_0x0103:
            int r13 = r13 + 1
            r9 = r15
            r1 = 0
            r2 = 0
            r8 = 1
            goto L_0x00a7
        L_0x010a:
            r15 = r9
            r16 = 1
            java.lang.Object r1 = r4.b
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            java.lang.Object r2 = r5.b
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            int r8 = r1.size()
            r9 = 0
        L_0x011a:
            if (r9 >= r8) goto L_0x01f2
            java.lang.Object r11 = r1.valueAt(r9)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x015f
            boolean r12 = r6.t(r11)
            if (r12 == 0) goto L_0x015f
            int r12 = r1.keyAt(r9)
            java.lang.Object r12 = r2.get(r12)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x015f
            boolean r13 = r6.t(r12)
            if (r13 == 0) goto L_0x015f
            r13 = 0
            java.lang.Object r14 = r7.getOrDefault(r11, r13)
            f0.u r14 = (f0.u) r14
            java.lang.Object r18 = r15.getOrDefault(r12, r13)
            r13 = r18
            f0.u r13 = (f0.u) r13
            if (r14 == 0) goto L_0x015f
            if (r13 == 0) goto L_0x015f
            java.util.ArrayList r0 = r6.f2674p
            r0.add(r14)
            java.util.ArrayList r0 = r6.f2675q
            r0.add(r13)
            r7.remove(r11)
            r15.remove(r12)
        L_0x015f:
            int r9 = r9 + 1
            r0 = r19
            goto L_0x011a
        L_0x0164:
            r15 = r9
            r16 = 1
            java.lang.Object r0 = r4.f1185d
            n.b r0 = (n.C0289b) r0
            int r1 = r0.f3706h
            r2 = 0
        L_0x016e:
            if (r2 >= r1) goto L_0x01f2
            java.lang.Object r8 = r0.j(r2)
            android.view.View r8 = (android.view.View) r8
            if (r8 == 0) goto L_0x01b5
            boolean r9 = r6.t(r8)
            if (r9 == 0) goto L_0x01b5
            java.lang.Object r9 = r0.h(r2)
            java.lang.Object r11 = r5.f1185d
            n.b r11 = (n.C0289b) r11
            r13 = 0
            java.lang.Object r9 = r11.getOrDefault(r9, r13)
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L_0x01b5
            boolean r11 = r6.t(r9)
            if (r11 == 0) goto L_0x01b5
            java.lang.Object r11 = r7.getOrDefault(r8, r13)
            f0.u r11 = (f0.u) r11
            java.lang.Object r12 = r15.getOrDefault(r9, r13)
            f0.u r12 = (f0.u) r12
            if (r11 == 0) goto L_0x01b5
            if (r12 == 0) goto L_0x01b5
            java.util.ArrayList r13 = r6.f2674p
            r13.add(r11)
            java.util.ArrayList r11 = r6.f2675q
            r11.add(r12)
            r7.remove(r8)
            r15.remove(r9)
        L_0x01b5:
            int r2 = r2 + 1
            goto L_0x016e
        L_0x01b8:
            r15 = r9
            r16 = 1
            int r0 = r7.f3706h
            int r0 = r0 + -1
        L_0x01bf:
            if (r0 < 0) goto L_0x01f2
            java.lang.Object r1 = r7.h(r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x01ef
            boolean r2 = r6.t(r1)
            if (r2 == 0) goto L_0x01ef
            java.lang.Object r1 = r15.remove(r1)
            f0.u r1 = (f0.u) r1
            if (r1 == 0) goto L_0x01ef
            android.view.View r2 = r1.b
            boolean r2 = r6.t(r2)
            if (r2 == 0) goto L_0x01ef
            java.lang.Object r2 = r7.i(r0)
            f0.u r2 = (f0.u) r2
            java.util.ArrayList r8 = r6.f2674p
            r8.add(r2)
            java.util.ArrayList r2 = r6.f2675q
            r2.add(r1)
        L_0x01ef:
            int r0 = r0 + -1
            goto L_0x01bf
        L_0x01f2:
            int r10 = r10 + 1
            r0 = r19
            r9 = r15
            r1 = 0
            r2 = 0
            r8 = 1
            goto L_0x0087
        L_0x01fc:
            r15 = r9
            r16 = 1
            r0 = 0
        L_0x0200:
            int r1 = r7.f3706h
            if (r0 >= r1) goto L_0x0220
            java.lang.Object r1 = r7.j(r0)
            f0.u r1 = (f0.u) r1
            android.view.View r2 = r1.b
            boolean r2 = r6.t(r2)
            if (r2 == 0) goto L_0x021d
            java.util.ArrayList r2 = r6.f2674p
            r2.add(r1)
            java.util.ArrayList r1 = r6.f2675q
            r13 = 0
            r1.add(r13)
        L_0x021d:
            int r0 = r0 + 1
            goto L_0x0200
        L_0x0220:
            r1 = 0
        L_0x0221:
            int r0 = r15.f3706h
            if (r1 >= r0) goto L_0x0241
            java.lang.Object r0 = r15.j(r1)
            f0.u r0 = (f0.u) r0
            android.view.View r2 = r0.b
            boolean r2 = r6.t(r2)
            if (r2 == 0) goto L_0x023e
            java.util.ArrayList r2 = r6.f2675q
            r2.add(r0)
            java.util.ArrayList r0 = r6.f2674p
            r13 = 0
            r0.add(r13)
        L_0x023e:
            int r1 = r1 + 1
            goto L_0x0221
        L_0x0241:
            n.b r0 = f0.m.p()
            int r1 = r0.f3706h
            android.view.WindowId r2 = r3.getWindowId()
            int r1 = r1 + -1
        L_0x024d:
            if (r1 < 0) goto L_0x02b9
            java.lang.Object r4 = r0.h(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x02b3
            r13 = 0
            java.lang.Object r5 = r0.getOrDefault(r4, r13)
            f0.j r5 = (f0.j) r5
            if (r5 == 0) goto L_0x02b3
            android.view.View r7 = r5.f2653a
            if (r7 == 0) goto L_0x02b3
            android.view.WindowId r8 = r5.f2655d
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x02b3
            r8 = 1
            f0.u r9 = r6.r(r7, r8)
            f0.u r10 = r6.n(r7, r8)
            if (r9 != 0) goto L_0x0288
            if (r10 != 0) goto L_0x0288
            androidx.emoji2.text.r r8 = r6.f2671m
            java.lang.Object r8 = r8.f1183a
            n.b r8 = (n.C0289b) r8
            r13 = 0
            java.lang.Object r7 = r8.getOrDefault(r7, r13)
            r10 = r7
            f0.u r10 = (f0.u) r10
            goto L_0x0289
        L_0x0288:
            r13 = 0
        L_0x0289:
            if (r9 != 0) goto L_0x028d
            if (r10 == 0) goto L_0x02b4
        L_0x028d:
            f0.u r7 = r5.f2654c
            f0.m r5 = r5.f2656e
            boolean r7 = r5.s(r7, r10)
            if (r7 == 0) goto L_0x02b4
            f0.m r5 = r5.o()
            r5.getClass()
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x02af
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x02ab
            goto L_0x02af
        L_0x02ab:
            r0.remove(r4)
            goto L_0x02b4
        L_0x02af:
            r4.cancel()
            goto L_0x02b4
        L_0x02b3:
            r13 = 0
        L_0x02b4:
            int r1 = r1 + -1
            r16 = 1
            goto L_0x024d
        L_0x02b9:
            androidx.emoji2.text.r r4 = r6.f2670l
            androidx.emoji2.text.r r5 = r6.f2671m
            java.util.ArrayList r0 = r6.f2674p
            java.util.ArrayList r7 = r6.f2675q
            r2 = r6
            r6 = r0
            r2.l(r3, r4, r5, r6, r7)
            r2.z()
            r16 = 1
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.p.onPreDraw():boolean");
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = q.f2688c;
        ViewGroup viewGroup2 = this.b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) q.b().getOrDefault(viewGroup2, (Object) null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                ((m) obj).y(viewGroup2);
            }
        }
        this.f2686a.i(true);
    }

    public final void onViewAttachedToWindow(View view) {
    }
}
