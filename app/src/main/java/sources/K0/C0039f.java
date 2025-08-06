package K0;

import A.j;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import o1.d;
import o1.e;
import o1.o;
import o1.q;
import o1.v;
import q.h;

/* renamed from: K0.f  reason: case insensitive filesystem */
public final class C0039f implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public static final C0037d f526A = new Object();

    /* renamed from: x  reason: collision with root package name */
    public static final Object f527x = new Object();

    /* renamed from: y  reason: collision with root package name */
    public static final C0036c f528y = new C0036c(0);

    /* renamed from: z  reason: collision with root package name */
    public static final AtomicInteger f529z = new AtomicInteger();
    public final int f = f529z.incrementAndGet();

    /* renamed from: g  reason: collision with root package name */
    public final w f530g;

    /* renamed from: h  reason: collision with root package name */
    public final m f531h;

    /* renamed from: i  reason: collision with root package name */
    public final j f532i;

    /* renamed from: j  reason: collision with root package name */
    public final D f533j;

    /* renamed from: k  reason: collision with root package name */
    public final String f534k;

    /* renamed from: l  reason: collision with root package name */
    public final A f535l;

    /* renamed from: m  reason: collision with root package name */
    public int f536m;

    /* renamed from: n  reason: collision with root package name */
    public final C f537n;

    /* renamed from: o  reason: collision with root package name */
    public n f538o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f539p;

    /* renamed from: q  reason: collision with root package name */
    public Bitmap f540q;

    /* renamed from: r  reason: collision with root package name */
    public Future f541r;

    /* renamed from: s  reason: collision with root package name */
    public int f542s;

    /* renamed from: t  reason: collision with root package name */
    public Exception f543t;

    /* renamed from: u  reason: collision with root package name */
    public int f544u;

    /* renamed from: v  reason: collision with root package name */
    public int f545v;

    /* renamed from: w  reason: collision with root package name */
    public int f546w;

    public C0039f(w wVar, m mVar, j jVar, D d2, n nVar, C c2) {
        this.f530g = wVar;
        this.f531h = mVar;
        this.f532i = jVar;
        this.f533j = d2;
        this.f538o = nVar;
        this.f534k = nVar.f565d;
        A a2 = nVar.b;
        this.f535l = a2;
        this.f546w = a2.f494c;
        this.f536m = 0;
        this.f537n = c2;
        this.f545v = c2.b();
    }

    public static Bitmap b(v vVar, A a2) {
        boolean z2;
        Logger logger = o.f3758a;
        q qVar = new q(vVar);
        if (!qVar.m(0, G.b) || !qVar.m(8, G.f521c)) {
            z2 = false;
        } else {
            z2 = true;
        }
        a2.getClass();
        if (!z2) {
            Bitmap decodeStream = BitmapFactory.decodeStream(new d(qVar, 1), (Rect) null, (BitmapFactory.Options) null);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        e eVar = qVar.f;
        eVar.c(vVar);
        try {
            byte[] q2 = eVar.q(eVar.f3745g);
            return BitmapFactory.decodeByteArray(q2, 0, q2.length, (BitmapFactory.Options) null);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void e(A a2) {
        String str;
        Uri uri = a2.f493a;
        if (uri != null) {
            str = String.valueOf(uri.getPath());
        } else {
            str = Integer.toHexString(0);
        }
        StringBuilder sb = (StringBuilder) f528y.get();
        sb.ensureCapacity(str.length() + 8);
        sb.replace(8, sb.length(), str);
        Thread.currentThread().setName(sb.toString());
    }

    public final boolean a() {
        ArrayList arrayList;
        Future future;
        if (this.f538o != null || (((arrayList = this.f539p) != null && !arrayList.isEmpty()) || (future = this.f541r) == null || !future.cancel(false))) {
            return false;
        }
        return true;
    }

    public final void c(n nVar) {
        boolean z2;
        boolean z3;
        int i2 = 1;
        if (this.f538o == nVar) {
            this.f538o = null;
            z2 = true;
        } else {
            ArrayList arrayList = this.f539p;
            if (arrayList != null) {
                z2 = arrayList.remove(nVar);
            } else {
                z2 = false;
            }
        }
        if (z2) {
            A a2 = nVar.b;
            if (a2.f494c == this.f546w) {
                ArrayList arrayList2 = this.f539p;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                n nVar2 = this.f538o;
                if (nVar2 != null || z3) {
                    if (nVar2 != null) {
                        i2 = nVar2.b.f494c;
                    }
                    if (z3) {
                        int size = this.f539p.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            int i4 = ((n) this.f539p.get(i3)).b.f494c;
                            if (h.b(i4) > h.b(i2)) {
                                i2 = i4;
                            }
                        }
                    }
                }
                this.f546w = i2;
            }
        }
        this.f530g.getClass();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:76|77|78|79) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0108 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap d() {
        /*
            r12 = this;
            r0 = 0
            A.j r1 = r12.f532i
            java.lang.String r2 = r12.f534k
            java.lang.Object r1 = r1.b
            K0.o r1 = (K0.o) r1
            java.lang.Object r1 = r1.get(r2)
            K0.p r1 = (K0.p) r1
            r2 = 0
            if (r1 == 0) goto L_0x0015
            android.graphics.Bitmap r1 = r1.f568a
            goto L_0x0016
        L_0x0015:
            r1 = r2
        L_0x0016:
            r3 = 1
            if (r1 == 0) goto L_0x0028
            K0.D r2 = r12.f533j
            K0.j r2 = r2.b
            r2.sendEmptyMessage(r0)
            r12.f542s = r3
            K0.w r0 = r12.f530g
            r0.getClass()
            return r1
        L_0x0028:
            int r4 = r12.f545v
            r5 = 4
            if (r4 != 0) goto L_0x002f
            r4 = 4
            goto L_0x0031
        L_0x002f:
            int r4 = r12.f536m
        L_0x0031:
            r12.f536m = r4
            K0.C r6 = r12.f537n
            K0.A r7 = r12.f535l
            H0.r r4 = r6.c(r7, r4)
            if (r4 == 0) goto L_0x0060
            int r1 = r4.f317a
            r12.f542s = r1
            int r1 = r4.b
            r12.f544u = r1
            java.lang.Object r1 = r4.f318c
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 != 0) goto L_0x0060
            java.lang.Object r1 = r4.f319d
            o1.v r1 = (o1.v) r1
            K0.A r4 = r12.f535l     // Catch:{ all -> 0x005b }
            android.graphics.Bitmap r4 = b(r1, r4)     // Catch:{ all -> 0x005b }
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x0061
        L_0x0059:
            goto L_0x0061
        L_0x005b:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            throw r0
        L_0x0060:
            r4 = r1
        L_0x0061:
            if (r4 == 0) goto L_0x0162
            K0.w r1 = r12.f530g
            r1.getClass()
            K0.D r1 = r12.f533j
            r1.getClass()
            java.lang.StringBuilder r6 = K0.G.f520a
            int r6 = r4.getAllocationByteCount()
            if (r6 < 0) goto L_0x014e
            K0.j r1 = r1.b
            r7 = 2
            android.os.Message r6 = r1.obtainMessage(r7, r6, r0)
            r1.sendMessage(r6)
            K0.A r1 = r12.f535l
            r1.getClass()
            java.util.List r1 = r1.b
            if (r1 == 0) goto L_0x0089
            goto L_0x008d
        L_0x0089:
            int r1 = r12.f544u
            if (r1 == 0) goto L_0x0162
        L_0x008d:
            java.lang.Object r1 = f527x
            monitor-enter(r1)
            K0.A r6 = r12.f535l     // Catch:{ all -> 0x00ed }
            r6.getClass()     // Catch:{ all -> 0x00ed }
            int r6 = r12.f544u     // Catch:{ all -> 0x00ed }
            if (r6 == 0) goto L_0x00ef
            K0.A r8 = r12.f535l     // Catch:{ all -> 0x00ed }
            r9 = 2
            int r7 = r4.getWidth()     // Catch:{ all -> 0x00ed }
            r10 = r8
            int r8 = r4.getHeight()     // Catch:{ all -> 0x00ed }
            r10.getClass()     // Catch:{ all -> 0x00ed }
            r10 = 2
            android.graphics.Matrix r9 = new android.graphics.Matrix     // Catch:{ all -> 0x00ed }
            r9.<init>()     // Catch:{ all -> 0x00ed }
            if (r6 == 0) goto L_0x00da
            if (r6 == 0) goto L_0x00da
            switch(r6) {
                case 3: goto L_0x00bd;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00ba;
                case 6: goto L_0x00ba;
                case 7: goto L_0x00b7;
                case 8: goto L_0x00b7;
                default: goto L_0x00b5;
            }     // Catch:{ all -> 0x00ed }
        L_0x00b5:
            r11 = 0
            goto L_0x00bf
        L_0x00b7:
            r11 = 270(0x10e, float:3.78E-43)
            goto L_0x00bf
        L_0x00ba:
            r11 = 90
            goto L_0x00bf
        L_0x00bd:
            r11 = 180(0xb4, float:2.52E-43)
        L_0x00bf:
            if (r6 == r10) goto L_0x00cb
            r10 = 7
            if (r6 == r10) goto L_0x00cb
            if (r6 == r5) goto L_0x00cb
            r5 = 5
            if (r6 == r5) goto L_0x00cb
            r5 = 1
            goto L_0x00cc
        L_0x00cb:
            r5 = -1
        L_0x00cc:
            if (r11 == 0) goto L_0x00d2
            float r6 = (float) r11     // Catch:{ all -> 0x00ed }
            r9.preRotate(r6)     // Catch:{ all -> 0x00ed }
        L_0x00d2:
            if (r5 == r3) goto L_0x00da
            float r5 = (float) r5     // Catch:{ all -> 0x00ed }
            r6 = 1065353216(0x3f800000, float:1.0)
            r9.postScale(r5, r6)     // Catch:{ all -> 0x00ed }
        L_0x00da:
            r10 = 1
            r6 = 0
            r5 = 0
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00ed }
            if (r5 == r4) goto L_0x00e7
            r4.recycle()     // Catch:{ all -> 0x00ed }
            r4 = r5
        L_0x00e7:
            K0.w r5 = r12.f530g     // Catch:{ all -> 0x00ed }
            r5.getClass()     // Catch:{ all -> 0x00ed }
            goto L_0x00ef
        L_0x00ed:
            r0 = move-exception
            goto L_0x014c
        L_0x00ef:
            K0.A r5 = r12.f535l     // Catch:{ all -> 0x00ed }
            java.util.List r5 = r5.b     // Catch:{ all -> 0x00ed }
            if (r5 == 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r3 = 0
        L_0x00f7:
            if (r3 == 0) goto L_0x011f
            int r3 = r5.size()     // Catch:{ all -> 0x00ed }
            if (r3 > 0) goto L_0x0101
            r2 = r4
            goto L_0x0112
        L_0x0101:
            java.lang.Object r3 = r5.get(r0)     // Catch:{ all -> 0x00ed }
            if (r3 != 0) goto L_0x0119
            throw r2     // Catch:{ RuntimeException -> 0x0108 }
        L_0x0108:
            K0.u r3 = K0.w.f574i     // Catch:{ all -> 0x00ed }
            K0.e r4 = new K0.e     // Catch:{ all -> 0x00ed }
            r4.<init>(r0)     // Catch:{ all -> 0x00ed }
            r3.post(r4)     // Catch:{ all -> 0x00ed }
        L_0x0112:
            K0.w r3 = r12.f530g     // Catch:{ all -> 0x00ed }
            r3.getClass()     // Catch:{ all -> 0x00ed }
            r4 = r2
            goto L_0x011f
        L_0x0119:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch:{ all -> 0x00ed }
            r0.<init>()     // Catch:{ all -> 0x00ed }
            throw r0     // Catch:{ all -> 0x00ed }
        L_0x011f:
            monitor-exit(r1)     // Catch:{ all -> 0x00ed }
            if (r4 == 0) goto L_0x0162
            K0.D r1 = r12.f533j
            r1.getClass()
            int r2 = r4.getAllocationByteCount()
            if (r2 < 0) goto L_0x0138
            K0.j r1 = r1.b
            r3 = 3
            android.os.Message r0 = r1.obtainMessage(r3, r2, r0)
            r1.sendMessage(r0)
            goto L_0x0162
        L_0x0138:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Negative size: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x014c:
            monitor-exit(r1)     // Catch:{ all -> 0x00ed }
            throw r0
        L_0x014e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Negative size: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0162:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.C0039f.d():android.graphics.Bitmap");
    }

    public final void run() {
        m mVar = this.f531h;
        try {
            e(this.f535l);
            this.f530g.getClass();
            Bitmap d2 = d();
            this.f540q = d2;
            if (d2 == null) {
                j jVar = mVar.f557h;
                jVar.sendMessage(jVar.obtainMessage(6, this));
            } else {
                mVar.b(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
            return;
        } catch (s e2) {
            this.f543t = e2;
            j jVar2 = mVar.f557h;
            jVar2.sendMessage(jVar2.obtainMessage(6, this));
        } catch (IOException e3) {
            this.f543t = e3;
            j jVar3 = mVar.f557h;
            jVar3.sendMessageDelayed(jVar3.obtainMessage(5, this), 500);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.f533j.a().a(new PrintWriter(stringWriter));
            this.f543t = new RuntimeException(stringWriter.toString(), e4);
            j jVar4 = mVar.f557h;
            jVar4.sendMessage(jVar4.obtainMessage(6, this));
        } catch (Exception e5) {
            this.f543t = e5;
            j jVar5 = mVar.f557h;
            jVar5.sendMessage(jVar5.obtainMessage(6, this));
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }
}
