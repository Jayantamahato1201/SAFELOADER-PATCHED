package H0;

public final class E implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f275g;

    public /* synthetic */ E(int i2, Object obj) {
        this.f = i2;
        this.f275g = obj;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, o1.u] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = (f1.g) r5.f275g;
        r1.f2729v = true;
        r2 = o1.o.f3758a;
        r1.f2722o = new o1.p(new java.lang.Object());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f275g
            f1.g r0 = (f1.g) r0
            monitor-enter(r0)
            java.lang.Object r1 = r5.f275g     // Catch:{ all -> 0x0014 }
            f1.g r1 = (f1.g) r1     // Catch:{ all -> 0x0014 }
            boolean r2 = r1.f2726s     // Catch:{ all -> 0x0014 }
            r3 = 1
            r2 = r2 ^ r3
            boolean r4 = r1.f2727t     // Catch:{ all -> 0x0014 }
            r2 = r2 | r4
            if (r2 == 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            return
        L_0x0014:
            r1 = move-exception
            goto L_0x004f
        L_0x0016:
            r1.x()     // Catch:{ IOException -> 0x001a }
            goto L_0x0020
        L_0x001a:
            java.lang.Object r1 = r5.f275g     // Catch:{ all -> 0x0014 }
            f1.g r1 = (f1.g) r1     // Catch:{ all -> 0x0014 }
            r1.f2728u = r3     // Catch:{ all -> 0x0014 }
        L_0x0020:
            java.lang.Object r1 = r5.f275g     // Catch:{ IOException -> 0x0039 }
            f1.g r1 = (f1.g) r1     // Catch:{ IOException -> 0x0039 }
            boolean r1 = r1.q()     // Catch:{ IOException -> 0x0039 }
            if (r1 == 0) goto L_0x004d
            java.lang.Object r1 = r5.f275g     // Catch:{ IOException -> 0x0039 }
            f1.g r1 = (f1.g) r1     // Catch:{ IOException -> 0x0039 }
            r1.v()     // Catch:{ IOException -> 0x0039 }
            java.lang.Object r1 = r5.f275g     // Catch:{ IOException -> 0x0039 }
            f1.g r1 = (f1.g) r1     // Catch:{ IOException -> 0x0039 }
            r2 = 0
            r1.f2724q = r2     // Catch:{ IOException -> 0x0039 }
            goto L_0x004d
        L_0x0039:
            java.lang.Object r1 = r5.f275g     // Catch:{ all -> 0x0014 }
            f1.g r1 = (f1.g) r1     // Catch:{ all -> 0x0014 }
            r1.f2729v = r3     // Catch:{ all -> 0x0014 }
            java.util.logging.Logger r2 = o1.o.f3758a     // Catch:{ all -> 0x0014 }
            o1.n r2 = new o1.n     // Catch:{ all -> 0x0014 }
            r2.<init>()     // Catch:{ all -> 0x0014 }
            o1.p r3 = new o1.p     // Catch:{ all -> 0x0014 }
            r3.<init>(r2)     // Catch:{ all -> 0x0014 }
            r1.f2722o = r3     // Catch:{ all -> 0x0014 }
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            return
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.E.a():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x008a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            r2 = -1
            r4 = 0
            r6 = 2
            r7 = 1
            r8 = 0
            int r9 = r1.f
            switch(r9) {
                case 0: goto L_0x02e0;
                case 1: goto L_0x02d6;
                case 2: goto L_0x023d;
                case 3: goto L_0x0234;
                case 4: goto L_0x020c;
                case 5: goto L_0x01fb;
                case 6: goto L_0x01ef;
                case 7: goto L_0x01e6;
                case 8: goto L_0x01ae;
                case 9: goto L_0x0096;
                case 10: goto L_0x008e;
                case 11: goto L_0x005c;
                case 12: goto L_0x0058;
                case 13: goto L_0x004d;
                case 14: goto L_0x0042;
                case 15: goto L_0x0032;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.Object r0 = r1.f275g
            F0.h r0 = (F0.h) r0
            r0.f230c = r8
            v.a r2 = r0.f232e
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            R.e r3 = r2.f1857M
            if (r3 == 0) goto L_0x0028
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x0028
            int r2 = r0.b
            r0.a(r2)
            goto L_0x0031
        L_0x0028:
            int r3 = r2.f1856L
            if (r3 != r6) goto L_0x0031
            int r0 = r0.b
            r2.C(r0)
        L_0x0031:
            return
        L_0x0032:
            java.lang.Object r0 = r1.f275g
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1041a
            if (r0 == 0) goto L_0x0041
            k.j r0 = r0.f967t
            if (r0 == 0) goto L_0x0041
            r0.l()
        L_0x0041:
            return
        L_0x0042:
            r0 = 0
            java.lang.Object r2 = r1.f275g
            k.z0 r2 = (k.C0280z0) r2
            r2.f3611l = r0
            r2.drawableStateChanged()
            return
        L_0x004d:
            java.lang.Object r0 = r1.f275g
            g.e r0 = (g.C0162e) r0
            r0.a(r7)
            r0.invalidateSelf()
            return
        L_0x0058:
            r1.a()
            return
        L_0x005c:
            java.lang.Object r0 = r1.f275g
            d1.m r0 = (d1.m) r0
            long r6 = java.lang.System.nanoTime()
            long r6 = r0.a(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            return
        L_0x006d:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r6 / r8
            long r8 = r8 * r10
            long r6 = r6 - r8
            java.lang.Object r0 = r1.f275g
            r8 = r0
            d1.m r8 = (d1.m) r8
            monitor-enter(r8)
            java.lang.Object r0 = r1.f275g     // Catch:{ InterruptedException -> 0x008a }
            d1.m r0 = (d1.m) r0     // Catch:{ InterruptedException -> 0x008a }
            int r7 = (int) r6     // Catch:{ InterruptedException -> 0x008a }
            r0.wait(r10, r7)     // Catch:{ InterruptedException -> 0x008a }
            goto L_0x008a
        L_0x0088:
            r0 = move-exception
            goto L_0x008c
        L_0x008a:
            monitor-exit(r8)     // Catch:{ all -> 0x0088 }
            goto L_0x005c
        L_0x008c:
            monitor-exit(r8)     // Catch:{ all -> 0x0088 }
            throw r0
        L_0x008e:
            java.lang.Object r0 = r1.f275g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            r0.A0()
            return
        L_0x0096:
            java.lang.Object r2 = r1.f275g
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            b0.F r3 = r2.f1489H
            if (r3 == 0) goto L_0x01aa
            b0.i r3 = (b0.C0085i) r3
            java.util.ArrayList r9 = r3.f1702h
            boolean r10 = r9.isEmpty()
            java.util.ArrayList r11 = r3.f1704j
            boolean r12 = r11.isEmpty()
            java.util.ArrayList r13 = r3.f1705k
            boolean r14 = r13.isEmpty()
            java.util.ArrayList r15 = r3.f1703i
            boolean r16 = r15.isEmpty()
            if (r10 == 0) goto L_0x00c2
            if (r12 == 0) goto L_0x00c2
            if (r16 == 0) goto L_0x00c2
            if (r14 == 0) goto L_0x00c2
            goto L_0x01aa
        L_0x00c2:
            r17 = r4
            int r4 = r9.size()
            r5 = 0
            r19 = 1
        L_0x00cb:
            long r6 = r3.f1571d
            if (r5 >= r4) goto L_0x0103
            java.lang.Object r20 = r9.get(r5)
            int r5 = r5 + 1
            r8 = r20
            b0.Y r8 = (b0.Y) r8
            android.view.View r0 = r8.f1628a
            r22 = r4
            android.view.ViewPropertyAnimator r4 = r0.animate()
            r23 = r5
            java.util.ArrayList r5 = r3.f1711q
            r5.add(r8)
            android.view.ViewPropertyAnimator r5 = r4.setDuration(r6)
            r6 = 0
            android.view.ViewPropertyAnimator r5 = r5.alpha(r6)
            b0.d r6 = new b0.d
            r6.<init>((b0.C0085i) r3, (b0.Y) r8, (android.view.ViewPropertyAnimator) r4, (android.view.View) r0)
            android.view.ViewPropertyAnimator r0 = r5.setListener(r6)
            r0.start()
            r4 = r22
            r5 = r23
            r8 = 0
            goto L_0x00cb
        L_0x0103:
            r9.clear()
            if (r12 != 0) goto L_0x0133
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.addAll(r11)
            java.util.ArrayList r4 = r3.f1707m
            r4.add(r0)
            r11.clear()
            b0.c r4 = new b0.c
            r5 = 0
            r4.<init>(r3, r0, r5)
            if (r10 != 0) goto L_0x0130
            java.lang.Object r0 = r0.get(r5)
            b0.h r0 = (b0.C0084h) r0
            b0.Y r0 = r0.f1692a
            android.view.View r0 = r0.f1628a
            java.util.WeakHashMap r5 = I.O.f393a
            r0.postOnAnimationDelayed(r4, r6)
            goto L_0x0133
        L_0x0130:
            r4.run()
        L_0x0133:
            if (r14 != 0) goto L_0x0161
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.addAll(r13)
            java.util.ArrayList r4 = r3.f1708n
            r4.add(r0)
            r13.clear()
            b0.c r4 = new b0.c
            r5 = 1
            r4.<init>(r3, r0, r5)
            if (r10 != 0) goto L_0x015e
            r5 = 0
            java.lang.Object r0 = r0.get(r5)
            b0.g r0 = (b0.C0083g) r0
            b0.Y r0 = r0.f1684a
            android.view.View r0 = r0.f1628a
            java.util.WeakHashMap r5 = I.O.f393a
            r0.postOnAnimationDelayed(r4, r6)
            goto L_0x0161
        L_0x015e:
            r4.run()
        L_0x0161:
            if (r16 != 0) goto L_0x01aa
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.addAll(r15)
            java.util.ArrayList r4 = r3.f1706l
            r4.add(r0)
            r15.clear()
            b0.c r4 = new b0.c
            r5 = 2
            r4.<init>(r3, r0, r5)
            if (r10 == 0) goto L_0x0184
            if (r12 == 0) goto L_0x0184
            if (r14 != 0) goto L_0x0180
            goto L_0x0184
        L_0x0180:
            r4.run()
            goto L_0x01aa
        L_0x0184:
            if (r10 != 0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r6 = r17
        L_0x0189:
            if (r12 != 0) goto L_0x018e
            long r8 = r3.f1572e
            goto L_0x0190
        L_0x018e:
            r8 = r17
        L_0x0190:
            if (r14 != 0) goto L_0x0195
            long r10 = r3.f
            goto L_0x0197
        L_0x0195:
            r10 = r17
        L_0x0197:
            long r8 = java.lang.Math.max(r8, r10)
            long r8 = r8 + r6
            r5 = 0
            java.lang.Object r0 = r0.get(r5)
            b0.Y r0 = (b0.Y) r0
            android.view.View r0 = r0.f1628a
            java.util.WeakHashMap r3 = I.O.f393a
            r0.postOnAnimationDelayed(r4, r8)
        L_0x01aa:
            r5 = 0
            r2.f1519i0 = r5
            return
        L_0x01ae:
            java.lang.Object r0 = r1.f275g
            b0.l r0 = (b0.C0088l) r0
            int r2 = r0.f1719A
            android.animation.ValueAnimator r3 = r0.f1744z
            r5 = 1
            if (r2 == r5) goto L_0x01bd
            r5 = 2
            if (r2 == r5) goto L_0x01c1
            goto L_0x01e5
        L_0x01bd:
            r5 = 2
            r3.cancel()
        L_0x01c1:
            r2 = 3
            r0.f1719A = r2
            java.lang.Object r0 = r3.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float[] r2 = new float[r5]
            r21 = 0
            r2[r21] = r0
            r5 = 1
            r20 = 0
            r2[r5] = r20
            r3.setFloatValues(r2)
            r0 = 500(0x1f4, float:7.0E-43)
            long r4 = (long) r0
            r3.setDuration(r4)
            r3.start()
        L_0x01e5:
            return
        L_0x01e6:
            r5 = 1
            java.lang.Object r0 = r1.f275g
            androidx.fragment.app.D r0 = (androidx.fragment.app.D) r0
            r0.w(r5)
            return
        L_0x01ef:
            java.lang.Object r0 = r1.f275g
            androidx.fragment.app.l r0 = (androidx.fragment.app.C0055l) r0
            androidx.fragment.app.j r2 = r0.f1320S
            android.app.Dialog r0 = r0.f1328a0
            r2.onDismiss(r0)
            return
        L_0x01fb:
            java.lang.Object r0 = r1.f275g
            androidx.fragment.app.d r0 = (androidx.fragment.app.C0047d) r0
            android.view.ViewGroup r2 = r0.f1305a
            android.view.View r3 = r0.b
            r2.endViewTransition(r3)
            androidx.fragment.app.e r0 = r0.f1306c
            r0.d()
            return
        L_0x020c:
            java.lang.Object r0 = r1.f275g     // Catch:{ IllegalStateException -> 0x0216, NullPointerException -> 0x0214 }
            androidx.activity.k r0 = (androidx.activity.k) r0     // Catch:{ IllegalStateException -> 0x0216, NullPointerException -> 0x0214 }
            H0.E.super.onBackPressed()     // Catch:{ IllegalStateException -> 0x0216, NullPointerException -> 0x0214 }
            goto L_0x0232
        L_0x0214:
            r0 = move-exception
            goto L_0x0218
        L_0x0216:
            r0 = move-exception
            goto L_0x0226
        L_0x0218:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0225
            goto L_0x0232
        L_0x0225:
            throw r0
        L_0x0226:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "Can not perform this action after onSaveInstanceState"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0233
        L_0x0232:
            return
        L_0x0233:
            throw r0
        L_0x0234:
            java.lang.Object r0 = r1.f275g
            R.e r0 = (R.e) r0
            r5 = 0
            r0.n(r5)
            return
        L_0x023d:
            r17 = r4
            r5 = 0
            java.lang.Object r0 = r1.f275g
            O.g r0 = (O.g) r0
            boolean r4 = r0.f629o
            if (r4 != 0) goto L_0x024a
            goto L_0x02cd
        L_0x024a:
            boolean r4 = r0.f627m
            O.a r6 = r0.f617a
            if (r4 == 0) goto L_0x0260
            r0.f627m = r5
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r6.f612e = r4
            r6.f613g = r2
            r6.f = r4
            r2 = 1056964608(0x3f000000, float:0.5)
            r6.f614h = r2
        L_0x0260:
            long r2 = r6.f613g
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x0276
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r4 = r6.f613g
            int r7 = r6.f615i
            long r7 = (long) r7
            long r4 = r4 + r7
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0276
        L_0x0274:
            r5 = 0
            goto L_0x027d
        L_0x0276:
            boolean r2 = r0.e()
            if (r2 != 0) goto L_0x0280
            goto L_0x0274
        L_0x027d:
            r0.f629o = r5
            goto L_0x02cd
        L_0x0280:
            r5 = 0
            boolean r2 = r0.f628n
            android.widget.ListView r3 = r0.f618c
            if (r2 == 0) goto L_0x029c
            r0.f628n = r5
            long r7 = android.os.SystemClock.uptimeMillis()
            r13 = 0
            r14 = 0
            r11 = 3
            r12 = 0
            r9 = r7
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r7, r9, r11, r12, r13, r14)
            r3.onTouchEvent(r2)
            r2.recycle()
        L_0x029c:
            long r4 = r6.f
            int r2 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x02ce
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r2 = r6.a(r4)
            r7 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r7 = r7 * r2
            float r7 = r7 * r2
            r8 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 * r8
            float r2 = r2 + r7
            long r7 = r6.f
            long r7 = r4 - r7
            r6.f = r4
            float r4 = (float) r7
            float r4 = r4 * r2
            float r2 = r6.f611d
            float r4 = r4 * r2
            int r2 = (int) r4
            k.z0 r0 = r0.f631q
            r0.scrollListBy(r2)
            java.util.WeakHashMap r0 = I.O.f393a
            r3.postOnAnimation(r1)
        L_0x02cd:
            return
        L_0x02ce:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot compute scroll delta before calling start()"
            r0.<init>(r2)
            throw r0
        L_0x02d6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Object r2 = r1.f275g
            java.lang.Exception r2 = (java.lang.Exception) r2
            r0.<init>(r2)
            throw r0
        L_0x02e0:
            java.lang.Object r0 = r1.f275g
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            H0.s r0 = r0.f2110c
            com.google.android.material.internal.CheckableImageButton r0 = r0.f324g
            r0.performClick()
            r0.jumpDrawablesToCurrentState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.E.run():void");
    }
}
