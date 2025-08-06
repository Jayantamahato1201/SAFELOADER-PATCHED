package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.cheatbox.R;
import g0.q;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n.C0292e;
import n.C0293f;
import n.k;
import n.l;
import y.C0498a;

public final class U0 {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f3416h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    public static U0 f3417i;

    /* renamed from: j  reason: collision with root package name */
    public static final S0 f3418j = new C0293f(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f3419a;
    public k b;

    /* renamed from: c  reason: collision with root package name */
    public l f3420c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f3421d = new WeakHashMap(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f3422e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public C0265s f3423g;

    public static synchronized U0 d() {
        U0 u02;
        synchronized (U0.class) {
            try {
                if (f3417i == null) {
                    U0 u03 = new U0();
                    f3417i = u03;
                    j(u03);
                }
                u02 = f3417i;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return u02;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (U0.class) {
            S0 s02 = f3418j;
            s02.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) s02.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) s02.b(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(U0 u02) {
        if (Build.VERSION.SDK_INT < 24) {
            u02.a("vector", new T0(3));
            u02.a("animated-vector", new T0(2));
            u02.a("animated-selector", new T0(1));
            u02.a("drawable", new T0(0));
        }
    }

    public final void a(String str, T0 t02) {
        if (this.b == null) {
            this.b = new k();
        }
        this.b.put(str, t02);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C0292e eVar = (C0292e) this.f3421d.get(context);
                if (eVar == null) {
                    eVar = new C0292e();
                    this.f3421d.put(context, eVar);
                }
                eVar.f(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final Drawable c(Context context, int i2) {
        if (this.f3422e == null) {
            this.f3422e = new TypedValue();
        }
        TypedValue typedValue = this.f3422e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        LayerDrawable layerDrawable = null;
        if (this.f3423g != null) {
            if (i2 == R.drawable.MT_Bin) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.MT_Bin), f(context, R.drawable.MT_Bin)});
            } else if (i2 == R.drawable.MT_Bin) {
                layerDrawable = C0265s.c(this, context, R.dimen.MT_Bin);
            } else if (i2 == R.drawable.MT_Bin) {
                layerDrawable = C0265s.c(this, context, R.dimen.MT_Bin);
            } else if (i2 == R.drawable.MT_Bin) {
                layerDrawable = C0265s.c(this, context, R.dimen.MT_Bin);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r5 = r0.f3687h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable e(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.f3421d     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0028 }
            n.e r0 = (n.C0292e) r0     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.e(r5, r1)     // Catch:{ all -> 0x0028 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x0043
        L_0x002a:
            long[] r4 = r0.f3686g     // Catch:{ all -> 0x0028 }
            int r2 = r0.f3688i     // Catch:{ all -> 0x0028 }
            int r4 = n.C0291d.b(r4, r2, r5)     // Catch:{ all -> 0x0028 }
            if (r4 < 0) goto L_0x0041
            java.lang.Object[] r5 = r0.f3687h     // Catch:{ all -> 0x0028 }
            r6 = r5[r4]     // Catch:{ all -> 0x0028 }
            java.lang.Object r2 = n.C0292e.f3685j     // Catch:{ all -> 0x0028 }
            if (r6 == r2) goto L_0x0041
            r5[r4] = r2     // Catch:{ all -> 0x0028 }
            r4 = 1
            r0.f = r4     // Catch:{ all -> 0x0028 }
        L_0x0041:
            monitor-exit(r3)
            return r1
        L_0x0043:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.U0.e(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    public final synchronized Drawable g(Context context, int i2, boolean z2) {
        Drawable k2;
        try {
            if (!this.f) {
                this.f = true;
                Drawable f2 = f(context, R.drawable.MT_Bin);
                if (f2 == null || (!(f2 instanceof q) && !"android.graphics.drawable.VectorDrawable".equals(f2.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k2 = k(context, i2);
            if (k2 == null) {
                k2 = c(context, i2);
            }
            if (k2 == null) {
                k2 = C0498a.b(context, i2);
            }
            if (k2 != null) {
                k2 = n(context, i2, z2, k2);
            }
            if (k2 != null) {
                C0268t0.a(k2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k2;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        l lVar;
        WeakHashMap weakHashMap = this.f3419a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (lVar = (l) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            colorStateList = (ColorStateList) lVar.c(i2, (Integer) null);
        }
        if (colorStateList == null) {
            C0265s sVar = this.f3423g;
            if (sVar != null) {
                colorStateList2 = sVar.d(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f3419a == null) {
                    this.f3419a = new WeakHashMap();
                }
                l lVar2 = (l) this.f3419a.get(context);
                if (lVar2 == null) {
                    lVar2 = new l();
                    this.f3419a.put(context, lVar2);
                }
                lVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r11.b.getOrDefault(r0, (java.lang.Object) null) != null) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3 A[Catch:{ Exception -> 0x0096 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable k(android.content.Context r12, int r13) {
        /*
            r11 = this;
            n.k r0 = r11.b
            r1 = 0
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ba
            n.l r0 = r11.f3420c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r0.c(r13, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x00ba
            if (r0 == 0) goto L_0x0030
            n.k r3 = r11.b
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L_0x0030
            goto L_0x00ba
        L_0x0029:
            n.l r0 = new n.l
            r0.<init>()
            r11.f3420c = r0
        L_0x0030:
            android.util.TypedValue r0 = r11.f3422e
            if (r0 != 0) goto L_0x003b
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r11.f3422e = r0
        L_0x003b:
            android.util.TypedValue r0 = r11.f3422e
            android.content.res.Resources r3 = r12.getResources()
            r4 = 1
            r3.getValue(r13, r0, r4)
            int r5 = r0.assetCookie
            long r5 = (long) r5
            r7 = 32
            long r5 = r5 << r7
            int r7 = r0.data
            long r7 = (long) r7
            long r5 = r5 | r7
            android.graphics.drawable.Drawable r7 = r11.e(r12, r5)
            if (r7 == 0) goto L_0x0056
            return r7
        L_0x0056:
            java.lang.CharSequence r8 = r0.string
            if (r8 == 0) goto L_0x00b2
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = ".xml"
            boolean r8 = r8.endsWith(r9)
            if (r8 == 0) goto L_0x00b2
            android.content.res.XmlResourceParser r3 = r3.getXml(r13)     // Catch:{ Exception -> 0x0096 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r3)     // Catch:{ Exception -> 0x0096 }
        L_0x006e:
            int r9 = r3.next()     // Catch:{ Exception -> 0x0096 }
            r10 = 2
            if (r9 == r10) goto L_0x0078
            if (r9 == r4) goto L_0x0078
            goto L_0x006e
        L_0x0078:
            if (r9 != r10) goto L_0x00a3
            java.lang.String r4 = r3.getName()     // Catch:{ Exception -> 0x0096 }
            n.l r9 = r11.f3420c     // Catch:{ Exception -> 0x0096 }
            r9.a(r13, r4)     // Catch:{ Exception -> 0x0096 }
            n.k r9 = r11.b     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r1 = r9.getOrDefault(r4, r1)     // Catch:{ Exception -> 0x0096 }
            k.T0 r1 = (k.T0) r1     // Catch:{ Exception -> 0x0096 }
            if (r1 == 0) goto L_0x0098
            android.content.res.Resources$Theme r4 = r12.getTheme()     // Catch:{ Exception -> 0x0096 }
            android.graphics.drawable.Drawable r7 = r1.a(r12, r3, r8, r4)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0098
        L_0x0096:
            r12 = move-exception
            goto L_0x00ab
        L_0x0098:
            if (r7 == 0) goto L_0x00b2
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x0096 }
            r7.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x0096 }
            r11.b(r12, r5, r7)     // Catch:{ Exception -> 0x0096 }
            goto L_0x00b2
        L_0x00a3:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0096 }
            java.lang.String r0 = "No start tag found"
            r12.<init>(r0)     // Catch:{ Exception -> 0x0096 }
            throw r12     // Catch:{ Exception -> 0x0096 }
        L_0x00ab:
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r12)
        L_0x00b2:
            if (r7 != 0) goto L_0x00b9
            n.l r12 = r11.f3420c
            r12.a(r13, r2)
        L_0x00b9:
            return r7
        L_0x00ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k.U0.k(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized void l(Context context) {
        C0292e eVar = (C0292e) this.f3421d.get(context);
        if (eVar != null) {
            eVar.b();
        }
    }

    public final synchronized void m(C0265s sVar) {
        this.f3423g = sVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable n(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            r9 = this;
            r0 = 2130903266(0x7f0300e2, float:1.7413345E38)
            r1 = 2130903264(0x7f0300e0, float:1.7413341E38)
            android.content.res.ColorStateList r2 = r9.i(r10, r11)
            r3 = 0
            if (r2 == 0) goto L_0x002c
            int[] r10 = k.C0268t0.f3566a
            android.graphics.drawable.Drawable r10 = r13.mutate()
            android.graphics.drawable.Drawable r10 = A.i.y0(r10)
            B.a.h(r10, r2)
            k.s r12 = r9.f3423g
            if (r12 != 0) goto L_0x001f
            goto L_0x0026
        L_0x001f:
            r12 = 2131165289(0x7f070069, float:1.794479E38)
            if (r11 != r12) goto L_0x0026
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x0026:
            if (r3 == 0) goto L_0x002b
            B.a.i(r10, r3)
        L_0x002b:
            return r10
        L_0x002c:
            k.s r2 = r9.f3423g
            if (r2 == 0) goto L_0x009a
            r2 = 2131165284(0x7f070064, float:1.794478E38)
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r11 != r2) goto L_0x0064
            r11 = r13
            android.graphics.drawable.LayerDrawable r11 = (android.graphics.drawable.LayerDrawable) r11
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r6)
            int r2 = k.l1.c(r10, r0)
            android.graphics.PorterDuff$Mode r3 = k.C0267t.b
            k.C0265s.e(r12, r2, r3)
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r5)
            int r0 = k.l1.c(r10, r0)
            k.C0265s.e(r12, r0, r3)
            android.graphics.drawable.Drawable r11 = r11.findDrawableByLayerId(r4)
            int r10 = k.l1.c(r10, r1)
            k.C0265s.e(r11, r10, r3)
            return r13
        L_0x0064:
            r2 = 2131165275(0x7f07005b, float:1.7944763E38)
            if (r11 == r2) goto L_0x0073
            r2 = 2131165274(0x7f07005a, float:1.794476E38)
            if (r11 == r2) goto L_0x0073
            r2 = 2131165276(0x7f07005c, float:1.7944765E38)
            if (r11 != r2) goto L_0x009a
        L_0x0073:
            r11 = r13
            android.graphics.drawable.LayerDrawable r11 = (android.graphics.drawable.LayerDrawable) r11
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r6)
            int r0 = k.l1.b(r10, r0)
            android.graphics.PorterDuff$Mode r2 = k.C0267t.b
            k.C0265s.e(r12, r0, r2)
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r5)
            int r0 = k.l1.c(r10, r1)
            k.C0265s.e(r12, r0, r2)
            android.graphics.drawable.Drawable r11 = r11.findDrawableByLayerId(r4)
            int r10 = k.l1.c(r10, r1)
            k.C0265s.e(r11, r10, r2)
            return r13
        L_0x009a:
            k.s r2 = r9.f3423g
            r4 = 0
            if (r2 == 0) goto L_0x00ff
            android.graphics.PorterDuff$Mode r5 = k.C0267t.b
            int[] r6 = r2.f3559a
            boolean r6 = k.C0265s.a(r6, r11)
            r7 = 1
            r8 = -1
            if (r6 == 0) goto L_0x00ae
            r11 = -1
        L_0x00ac:
            r1 = 1
            goto L_0x00e6
        L_0x00ae:
            int[] r0 = r2.f3560c
            boolean r0 = k.C0265s.a(r0, r11)
            if (r0 == 0) goto L_0x00bb
            r11 = -1
            r0 = 2130903264(0x7f0300e0, float:1.7413341E38)
            goto L_0x00ac
        L_0x00bb:
            int[] r0 = r2.f3561d
            boolean r0 = k.C0265s.a(r0, r11)
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L_0x00cd
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x00c8:
            r11 = -1
            r0 = 16842801(0x1010031, float:2.3693695E-38)
            goto L_0x00ac
        L_0x00cd:
            r0 = 2131165261(0x7f07004d, float:1.7944734E38)
            if (r11 != r0) goto L_0x00dd
            r11 = 1109603123(0x42233333, float:40.8)
            int r11 = java.lang.Math.round(r11)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            goto L_0x00ac
        L_0x00dd:
            r0 = 2131165243(0x7f07003b, float:1.7944698E38)
            if (r11 != r0) goto L_0x00e3
            goto L_0x00c8
        L_0x00e3:
            r11 = -1
            r0 = 0
            r1 = 0
        L_0x00e6:
            if (r1 == 0) goto L_0x00ff
            int[] r1 = k.C0268t0.f3566a
            android.graphics.drawable.Drawable r1 = r13.mutate()
            int r10 = k.l1.c(r10, r0)
            android.graphics.PorterDuffColorFilter r10 = k.C0267t.c(r10, r5)
            r1.setColorFilter(r10)
            if (r11 == r8) goto L_0x00fe
            r1.setAlpha(r11)
        L_0x00fe:
            r4 = 1
        L_0x00ff:
            if (r4 != 0) goto L_0x0104
            if (r12 == 0) goto L_0x0104
            return r3
        L_0x0104:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k.U0.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
