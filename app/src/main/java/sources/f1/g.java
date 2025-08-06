package f1;

import H0.E;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import k1.a;
import o1.o;
import o1.p;
import o1.x;

public final class g implements Closeable, Flushable, AutoCloseable {

    /* renamed from: z  reason: collision with root package name */
    public static final Pattern f2713z = Pattern.compile("[a-z0-9_-]{1,120}");
    public final a f;

    /* renamed from: g  reason: collision with root package name */
    public final File f2714g;

    /* renamed from: h  reason: collision with root package name */
    public final File f2715h;

    /* renamed from: i  reason: collision with root package name */
    public final File f2716i;

    /* renamed from: j  reason: collision with root package name */
    public final File f2717j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2718k;

    /* renamed from: l  reason: collision with root package name */
    public final long f2719l;

    /* renamed from: m  reason: collision with root package name */
    public final int f2720m;

    /* renamed from: n  reason: collision with root package name */
    public long f2721n = 0;

    /* renamed from: o  reason: collision with root package name */
    public p f2722o;

    /* renamed from: p  reason: collision with root package name */
    public final LinkedHashMap f2723p = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: q  reason: collision with root package name */
    public int f2724q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2725r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2726s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2727t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2728u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2729v;

    /* renamed from: w  reason: collision with root package name */
    public long f2730w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final ThreadPoolExecutor f2731x;

    /* renamed from: y  reason: collision with root package name */
    public final E f2732y = new E(12, this);

    public g(File file, long j2, ThreadPoolExecutor threadPoolExecutor) {
        a aVar = a.f3630a;
        this.f = aVar;
        this.f2714g = file;
        this.f2718k = 201105;
        this.f2715h = new File(file, "journal");
        this.f2716i = new File(file, "journal.tmp");
        this.f2717j = new File(file, "journal.bkp");
        this.f2720m = 2;
        this.f2719l = j2;
        this.f2731x = threadPoolExecutor;
    }

    public static void y(String str) {
        if (!f2713z.matcher(str).matches()) {
            throw new IllegalArgumentException(A.g.i("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final synchronized void close() {
        try {
            if (this.f2726s) {
                if (!this.f2727t) {
                    for (e eVar : (e[]) this.f2723p.values().toArray(new e[this.f2723p.size()])) {
                        d dVar = eVar.f;
                        if (dVar != null) {
                            dVar.a();
                        }
                    }
                    x();
                    this.f2722o.close();
                    this.f2722o = null;
                    this.f2727t = true;
                    return;
                }
            }
            this.f2727t = true;
        } finally {
            while (true) {
            }
        }
    }

    public final synchronized void flush() {
        if (this.f2726s) {
            k();
            x();
            this.f2722o.flush();
        }
    }

    public final synchronized void k() {
        if (p()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void l(f1.d r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            f1.e r0 = r9.f2701a     // Catch:{ all -> 0x002d }
            f1.d r1 = r0.f     // Catch:{ all -> 0x002d }
            if (r1 != r9) goto L_0x010d
            r1 = 0
            if (r10 == 0) goto L_0x004d
            boolean r2 = r0.f2707e     // Catch:{ all -> 0x002d }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x000f:
            int r3 = r8.f2720m     // Catch:{ all -> 0x002d }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r9.b     // Catch:{ all -> 0x002d }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0033
            k1.a r3 = r8.f     // Catch:{ all -> 0x002d }
            java.io.File[] r4 = r0.f2706d     // Catch:{ all -> 0x002d }
            r4 = r4[r2]     // Catch:{ all -> 0x002d }
            r3.getClass()     // Catch:{ all -> 0x002d }
            boolean r3 = r4.exists()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x0030
            r9.a()     // Catch:{ all -> 0x002d }
            monitor-exit(r8)
            return
        L_0x002d:
            r9 = move-exception
            goto L_0x0113
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0033:
            r9.a()     // Catch:{ all -> 0x002d }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002d }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r10.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x002d }
            r10.append(r2)     // Catch:{ all -> 0x002d }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x002d }
            r9.<init>(r10)     // Catch:{ all -> 0x002d }
            throw r9     // Catch:{ all -> 0x002d }
        L_0x004d:
            r9 = 0
        L_0x004e:
            int r2 = r8.f2720m     // Catch:{ all -> 0x002d }
            if (r9 >= r2) goto L_0x008c
            java.io.File[] r2 = r0.f2706d     // Catch:{ all -> 0x002d }
            r2 = r2[r9]     // Catch:{ all -> 0x002d }
            if (r10 == 0) goto L_0x0084
            k1.a r3 = r8.f     // Catch:{ all -> 0x002d }
            r3.getClass()     // Catch:{ all -> 0x002d }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0089
            java.io.File[] r3 = r0.f2705c     // Catch:{ all -> 0x002d }
            r3 = r3[r9]     // Catch:{ all -> 0x002d }
            k1.a r4 = r8.f     // Catch:{ all -> 0x002d }
            r4.c(r2, r3)     // Catch:{ all -> 0x002d }
            long[] r2 = r0.b     // Catch:{ all -> 0x002d }
            r4 = r2[r9]     // Catch:{ all -> 0x002d }
            k1.a r2 = r8.f     // Catch:{ all -> 0x002d }
            r2.getClass()     // Catch:{ all -> 0x002d }
            long r2 = r3.length()     // Catch:{ all -> 0x002d }
            long[] r6 = r0.b     // Catch:{ all -> 0x002d }
            r6[r9] = r2     // Catch:{ all -> 0x002d }
            long r6 = r8.f2721n     // Catch:{ all -> 0x002d }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.f2721n = r6     // Catch:{ all -> 0x002d }
            goto L_0x0089
        L_0x0084:
            k1.a r3 = r8.f     // Catch:{ all -> 0x002d }
            r3.a(r2)     // Catch:{ all -> 0x002d }
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x004e
        L_0x008c:
            int r9 = r8.f2724q     // Catch:{ all -> 0x002d }
            r2 = 1
            int r9 = r9 + r2
            r8.f2724q = r9     // Catch:{ all -> 0x002d }
            r9 = 0
            r0.f = r9     // Catch:{ all -> 0x002d }
            boolean r9 = r0.f2707e     // Catch:{ all -> 0x002d }
            r9 = r9 | r10
            r3 = 32
            r4 = 10
            if (r9 == 0) goto L_0x00d4
            r0.f2707e = r2     // Catch:{ all -> 0x002d }
            o1.p r9 = r8.f2722o     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "CLEAN"
            r9.h(r2)     // Catch:{ all -> 0x002d }
            r9.j(r3)     // Catch:{ all -> 0x002d }
            o1.p r9 = r8.f2722o     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r0.f2704a     // Catch:{ all -> 0x002d }
            r9.h(r2)     // Catch:{ all -> 0x002d }
            o1.p r9 = r8.f2722o     // Catch:{ all -> 0x002d }
            long[] r2 = r0.b     // Catch:{ all -> 0x002d }
            int r5 = r2.length     // Catch:{ all -> 0x002d }
        L_0x00b6:
            if (r1 >= r5) goto L_0x00c3
            r6 = r2[r1]     // Catch:{ all -> 0x002d }
            r9.j(r3)     // Catch:{ all -> 0x002d }
            r9.i(r6)     // Catch:{ all -> 0x002d }
            int r1 = r1 + 1
            goto L_0x00b6
        L_0x00c3:
            o1.p r9 = r8.f2722o     // Catch:{ all -> 0x002d }
            r9.j(r4)     // Catch:{ all -> 0x002d }
            if (r10 == 0) goto L_0x00f1
            long r9 = r8.f2730w     // Catch:{ all -> 0x002d }
            r1 = 1
            long r1 = r1 + r9
            r8.f2730w = r1     // Catch:{ all -> 0x002d }
            r0.f2708g = r9     // Catch:{ all -> 0x002d }
            goto L_0x00f1
        L_0x00d4:
            java.util.LinkedHashMap r9 = r8.f2723p     // Catch:{ all -> 0x002d }
            java.lang.String r10 = r0.f2704a     // Catch:{ all -> 0x002d }
            r9.remove(r10)     // Catch:{ all -> 0x002d }
            o1.p r9 = r8.f2722o     // Catch:{ all -> 0x002d }
            java.lang.String r10 = "REMOVE"
            r9.h(r10)     // Catch:{ all -> 0x002d }
            r9.j(r3)     // Catch:{ all -> 0x002d }
            o1.p r9 = r8.f2722o     // Catch:{ all -> 0x002d }
            java.lang.String r10 = r0.f2704a     // Catch:{ all -> 0x002d }
            r9.h(r10)     // Catch:{ all -> 0x002d }
            o1.p r9 = r8.f2722o     // Catch:{ all -> 0x002d }
            r9.j(r4)     // Catch:{ all -> 0x002d }
        L_0x00f1:
            o1.p r9 = r8.f2722o     // Catch:{ all -> 0x002d }
            r9.flush()     // Catch:{ all -> 0x002d }
            long r9 = r8.f2721n     // Catch:{ all -> 0x002d }
            long r0 = r8.f2719l     // Catch:{ all -> 0x002d }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0104
            boolean r9 = r8.q()     // Catch:{ all -> 0x002d }
            if (r9 == 0) goto L_0x010b
        L_0x0104:
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f2731x     // Catch:{ all -> 0x002d }
            H0.E r10 = r8.f2732y     // Catch:{ all -> 0x002d }
            r9.execute(r10)     // Catch:{ all -> 0x002d }
        L_0x010b:
            monitor-exit(r8)
            return
        L_0x010d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002d }
            r9.<init>()     // Catch:{ all -> 0x002d }
            throw r9     // Catch:{ all -> 0x002d }
        L_0x0113:
            monitor-exit(r8)     // Catch:{ all -> 0x002d }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.l(f1.d, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized f1.d m(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.o()     // Catch:{ all -> 0x0022 }
            r5.k()     // Catch:{ all -> 0x0022 }
            y(r6)     // Catch:{ all -> 0x0022 }
            java.util.LinkedHashMap r0 = r5.f2723p     // Catch:{ all -> 0x0022 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0022 }
            f1.e r0 = (f1.e) r0     // Catch:{ all -> 0x0022 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0024
            long r1 = r0.f2708g     // Catch:{ all -> 0x0022 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0026
            goto L_0x0024
        L_0x0022:
            r6 = move-exception
            goto L_0x0074
        L_0x0024:
            monitor-exit(r5)
            return r3
        L_0x0026:
            if (r0 == 0) goto L_0x002e
            f1.d r7 = r0.f     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x002e
            monitor-exit(r5)
            return r3
        L_0x002e:
            boolean r7 = r5.f2728u     // Catch:{ all -> 0x0022 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f2729v     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x0037
            goto L_0x006b
        L_0x0037:
            o1.p r7 = r5.f2722o     // Catch:{ all -> 0x0022 }
            java.lang.String r8 = "DIRTY"
            r7.h(r8)     // Catch:{ all -> 0x0022 }
            r8 = 32
            r7.j(r8)     // Catch:{ all -> 0x0022 }
            r7.h(r6)     // Catch:{ all -> 0x0022 }
            r8 = 10
            r7.j(r8)     // Catch:{ all -> 0x0022 }
            o1.p r7 = r5.f2722o     // Catch:{ all -> 0x0022 }
            r7.flush()     // Catch:{ all -> 0x0022 }
            boolean r7 = r5.f2725r     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            f1.e r0 = new f1.e     // Catch:{ all -> 0x0022 }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x0022 }
            java.util.LinkedHashMap r7 = r5.f2723p     // Catch:{ all -> 0x0022 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0022 }
        L_0x0062:
            f1.d r6 = new f1.d     // Catch:{ all -> 0x0022 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0022 }
            r0.f = r6     // Catch:{ all -> 0x0022 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.ThreadPoolExecutor r6 = r5.f2731x     // Catch:{ all -> 0x0022 }
            H0.E r7 = r5.f2732y     // Catch:{ all -> 0x0022 }
            r6.execute(r7)     // Catch:{ all -> 0x0022 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            monitor-exit(r5)     // Catch:{ all -> 0x0022 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.m(java.lang.String, long):f1.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized f1.f n(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.o()     // Catch:{ all -> 0x004a }
            r3.k()     // Catch:{ all -> 0x004a }
            y(r4)     // Catch:{ all -> 0x004a }
            java.util.LinkedHashMap r0 = r3.f2723p     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004a }
            f1.e r0 = (f1.e) r0     // Catch:{ all -> 0x004a }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f2707e     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            f1.f r0 = r0.a()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f2724q     // Catch:{ all -> 0x004a }
            int r1 = r1 + 1
            r3.f2724q = r1     // Catch:{ all -> 0x004a }
            o1.p r1 = r3.f2722o     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "READ"
            r1.h(r2)     // Catch:{ all -> 0x004a }
            r2 = 32
            r1.j(r2)     // Catch:{ all -> 0x004a }
            r1.h(r4)     // Catch:{ all -> 0x004a }
            r4 = 10
            r1.j(r4)     // Catch:{ all -> 0x004a }
            boolean r4 = r3.q()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.ThreadPoolExecutor r4 = r3.f2731x     // Catch:{ all -> 0x004a }
            H0.E r1 = r3.f2732y     // Catch:{ all -> 0x004a }
            r4.execute(r1)     // Catch:{ all -> 0x004a }
            goto L_0x004c
        L_0x004a:
            r4 = move-exception
            goto L_0x0050
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.n(java.lang.String):f1.f");
    }

    public final synchronized void o() {
        try {
            if (!this.f2726s) {
                a aVar = this.f;
                File file = this.f2717j;
                aVar.getClass();
                if (file.exists()) {
                    a aVar2 = this.f;
                    File file2 = this.f2715h;
                    aVar2.getClass();
                    if (file2.exists()) {
                        this.f.a(this.f2717j);
                    } else {
                        this.f.c(this.f2717j, this.f2715h);
                    }
                }
                a aVar3 = this.f;
                File file3 = this.f2715h;
                aVar3.getClass();
                if (file3.exists()) {
                    t();
                    s();
                    this.f2726s = true;
                    return;
                }
                v();
                this.f2726s = true;
            }
        } catch (IOException e2) {
            l1.g gVar = l1.g.f3649a;
            gVar.k(5, "DiskLruCache " + this.f2714g + " is corrupt: " + e2.getMessage() + ", removing", e2);
            close();
            this.f.b(this.f2714g);
            this.f2727t = false;
        } catch (Throwable th) {
            this.f2727t = false;
            throw th;
        }
    }

    public final synchronized boolean p() {
        return this.f2727t;
    }

    public final boolean q() {
        int i2 = this.f2724q;
        if (i2 < 2000 || i2 < this.f2723p.size()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, o1.x] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, o1.x] */
    public final p r() {
        o1.a aVar;
        File file = this.f2715h;
        this.f.getClass();
        try {
            Logger logger = o.f3758a;
            if (file != null) {
                aVar = new o1.a((x) new Object(), (OutputStream) new FileOutputStream(file, true));
                return new p(new c(this, aVar, 0));
            }
            throw new IllegalArgumentException("file == null");
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = o.f3758a;
            aVar = new o1.a((x) new Object(), (OutputStream) new FileOutputStream(file, true));
        }
    }

    public final void s() {
        File file = this.f2716i;
        a aVar = this.f;
        aVar.a(file);
        Iterator it = this.f2723p.values().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            d dVar = eVar.f;
            int i2 = this.f2720m;
            int i3 = 0;
            if (dVar == null) {
                while (i3 < i2) {
                    this.f2721n += eVar.b[i3];
                    i3++;
                }
            } else {
                eVar.f = null;
                while (i3 < i2) {
                    aVar.a(eVar.f2705c[i3]);
                    aVar.a(eVar.f2706d[i3]);
                    i3++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|(1:20)(1:21)|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r11.f2724q = r0 - r11.f2723p.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r3.k() == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        r11.f2722o = r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x006a */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0087=Splitter:B:24:0x0087, B:17:0x006a=Splitter:B:17:0x006a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            java.io.File r2 = r11.f2715h
            k1.a r3 = r11.f
            r3.getClass()
            o1.b r2 = o1.o.b(r2)
            o1.q r3 = new o1.q
            r3.<init>(r2)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r2 = r3.s(r4)     // Catch:{ all -> 0x0068 }
            java.lang.String r6 = r3.s(r4)     // Catch:{ all -> 0x0068 }
            java.lang.String r7 = r3.s(r4)     // Catch:{ all -> 0x0068 }
            java.lang.String r8 = r3.s(r4)     // Catch:{ all -> 0x0068 }
            java.lang.String r9 = r3.s(r4)     // Catch:{ all -> 0x0068 }
            java.lang.String r10 = "libcore.io.DiskLruCache"
            boolean r10 = r10.equals(r2)     // Catch:{ all -> 0x0068 }
            if (r10 == 0) goto L_0x0087
            java.lang.String r10 = "1"
            boolean r10 = r10.equals(r6)     // Catch:{ all -> 0x0068 }
            if (r10 == 0) goto L_0x0087
            int r10 = r11.f2718k     // Catch:{ all -> 0x0068 }
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ all -> 0x0068 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0087
            int r7 = r11.f2720m     // Catch:{ all -> 0x0068 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0068 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0087
            java.lang.String r7 = ""
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0087
            r0 = 0
        L_0x005e:
            java.lang.String r1 = r3.s(r4)     // Catch:{ EOFException -> 0x006a }
            r11.u(r1)     // Catch:{ EOFException -> 0x006a }
            int r0 = r0 + 1
            goto L_0x005e
        L_0x0068:
            r0 = move-exception
            goto L_0x00b0
        L_0x006a:
            java.util.LinkedHashMap r1 = r11.f2723p     // Catch:{ all -> 0x0068 }
            int r1 = r1.size()     // Catch:{ all -> 0x0068 }
            int r0 = r0 - r1
            r11.f2724q = r0     // Catch:{ all -> 0x0068 }
            boolean r0 = r3.k()     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x007d
            r11.v()     // Catch:{ all -> 0x0068 }
            goto L_0x0083
        L_0x007d:
            o1.p r0 = r11.r()     // Catch:{ all -> 0x0068 }
            r11.f2722o = r0     // Catch:{ all -> 0x0068 }
        L_0x0083:
            e1.c.d(r3)
            return
        L_0x0087:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r5.<init>(r1)     // Catch:{ all -> 0x0068 }
            r5.append(r2)     // Catch:{ all -> 0x0068 }
            r5.append(r0)     // Catch:{ all -> 0x0068 }
            r5.append(r6)     // Catch:{ all -> 0x0068 }
            r5.append(r0)     // Catch:{ all -> 0x0068 }
            r5.append(r8)     // Catch:{ all -> 0x0068 }
            r5.append(r0)     // Catch:{ all -> 0x0068 }
            r5.append(r9)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "]"
            r5.append(r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0068 }
            r4.<init>(r0)     // Catch:{ all -> 0x0068 }
            throw r4     // Catch:{ all -> 0x0068 }
        L_0x00b0:
            e1.c.d(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.t():void");
    }

    public final void u(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            LinkedHashMap linkedHashMap = this.f2723p;
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            e eVar = (e) linkedHashMap.get(str2);
            if (eVar == null) {
                eVar = new e(this, str2);
                linkedHashMap.put(str2, eVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                eVar.f2707e = true;
                eVar.f = null;
                if (split.length == eVar.f2709h.f2720m) {
                    int i3 = 0;
                    while (i3 < split.length) {
                        try {
                            eVar.b[i3] = Long.parseLong(split[i3]);
                            i3++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                eVar.f = new d(this, eVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        } else {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, o1.x] */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.lang.Object, o1.x] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.getParentFile().mkdirs();
        r0 = o1.o.f3758a;
        r3 = new o1.a((o1.x) new java.lang.Object(), (java.io.OutputStream) new java.io.FileOutputStream(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fc, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void v() {
        /*
            r9 = this;
            monitor-enter(r9)
            o1.p r0 = r9.f2722o     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x000c
            r0.close()     // Catch:{ all -> 0x0009 }
            goto L_0x000c
        L_0x0009:
            r0 = move-exception
            goto L_0x00fd
        L_0x000c:
            k1.a r0 = r9.f     // Catch:{ all -> 0x0009 }
            java.io.File r1 = r9.f2716i     // Catch:{ all -> 0x0009 }
            r0.getClass()     // Catch:{ all -> 0x0009 }
            java.util.logging.Logger r0 = o1.o.f3758a     // Catch:{ FileNotFoundException -> 0x002f }
            if (r1 == 0) goto L_0x0027
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002f }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x002f }
            o1.x r2 = new o1.x     // Catch:{ FileNotFoundException -> 0x002f }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x002f }
            o1.a r3 = new o1.a     // Catch:{ FileNotFoundException -> 0x002f }
            r3.<init>((o1.x) r2, (java.io.OutputStream) r0)     // Catch:{ FileNotFoundException -> 0x002f }
            goto L_0x0047
        L_0x0027:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ FileNotFoundException -> 0x002f }
            java.lang.String r2 = "file == null"
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x002f }
            throw r0     // Catch:{ FileNotFoundException -> 0x002f }
        L_0x002f:
            java.io.File r0 = r1.getParentFile()     // Catch:{ all -> 0x0009 }
            r0.mkdirs()     // Catch:{ all -> 0x0009 }
            java.util.logging.Logger r0 = o1.o.f3758a     // Catch:{ all -> 0x0009 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0009 }
            r0.<init>(r1)     // Catch:{ all -> 0x0009 }
            o1.x r1 = new o1.x     // Catch:{ all -> 0x0009 }
            r1.<init>()     // Catch:{ all -> 0x0009 }
            o1.a r3 = new o1.a     // Catch:{ all -> 0x0009 }
            r3.<init>((o1.x) r1, (java.io.OutputStream) r0)     // Catch:{ all -> 0x0009 }
        L_0x0047:
            o1.p r0 = new o1.p     // Catch:{ all -> 0x0009 }
            r0.<init>(r3)     // Catch:{ all -> 0x0009 }
            java.lang.String r1 = "libcore.io.DiskLruCache"
            r0.h(r1)     // Catch:{ all -> 0x00a1 }
            r1 = 10
            r0.j(r1)     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "1"
            r0.h(r2)     // Catch:{ all -> 0x00a1 }
            r0.j(r1)     // Catch:{ all -> 0x00a1 }
            int r2 = r9.f2718k     // Catch:{ all -> 0x00a1 }
            long r2 = (long) r2     // Catch:{ all -> 0x00a1 }
            r0.i(r2)     // Catch:{ all -> 0x00a1 }
            r0.j(r1)     // Catch:{ all -> 0x00a1 }
            int r2 = r9.f2720m     // Catch:{ all -> 0x00a1 }
            long r2 = (long) r2     // Catch:{ all -> 0x00a1 }
            r0.i(r2)     // Catch:{ all -> 0x00a1 }
            r0.j(r1)     // Catch:{ all -> 0x00a1 }
            r0.j(r1)     // Catch:{ all -> 0x00a1 }
            java.util.LinkedHashMap r2 = r9.f2723p     // Catch:{ all -> 0x00a1 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00a1 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a1 }
        L_0x007d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a1 }
            r4 = 0
            if (r3 == 0) goto L_0x00c4
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a1 }
            f1.e r3 = (f1.e) r3     // Catch:{ all -> 0x00a1 }
            f1.d r5 = r3.f     // Catch:{ all -> 0x00a1 }
            r6 = 32
            if (r5 == 0) goto L_0x00a3
            java.lang.String r4 = "DIRTY"
            r0.h(r4)     // Catch:{ all -> 0x00a1 }
            r0.j(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r3 = r3.f2704a     // Catch:{ all -> 0x00a1 }
            r0.h(r3)     // Catch:{ all -> 0x00a1 }
            r0.j(r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x007d
        L_0x00a1:
            r1 = move-exception
            goto L_0x00f9
        L_0x00a3:
            java.lang.String r5 = "CLEAN"
            r0.h(r5)     // Catch:{ all -> 0x00a1 }
            r0.j(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = r3.f2704a     // Catch:{ all -> 0x00a1 }
            r0.h(r5)     // Catch:{ all -> 0x00a1 }
            long[] r3 = r3.b     // Catch:{ all -> 0x00a1 }
            int r5 = r3.length     // Catch:{ all -> 0x00a1 }
        L_0x00b3:
            if (r4 >= r5) goto L_0x00c0
            r7 = r3[r4]     // Catch:{ all -> 0x00a1 }
            r0.j(r6)     // Catch:{ all -> 0x00a1 }
            r0.i(r7)     // Catch:{ all -> 0x00a1 }
            int r4 = r4 + 1
            goto L_0x00b3
        L_0x00c0:
            r0.j(r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x007d
        L_0x00c4:
            r0.close()     // Catch:{ all -> 0x0009 }
            k1.a r0 = r9.f     // Catch:{ all -> 0x0009 }
            java.io.File r1 = r9.f2715h     // Catch:{ all -> 0x0009 }
            r0.getClass()     // Catch:{ all -> 0x0009 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x00dd
            k1.a r0 = r9.f     // Catch:{ all -> 0x0009 }
            java.io.File r1 = r9.f2715h     // Catch:{ all -> 0x0009 }
            java.io.File r2 = r9.f2717j     // Catch:{ all -> 0x0009 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0009 }
        L_0x00dd:
            k1.a r0 = r9.f     // Catch:{ all -> 0x0009 }
            java.io.File r1 = r9.f2716i     // Catch:{ all -> 0x0009 }
            java.io.File r2 = r9.f2715h     // Catch:{ all -> 0x0009 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0009 }
            k1.a r0 = r9.f     // Catch:{ all -> 0x0009 }
            java.io.File r1 = r9.f2717j     // Catch:{ all -> 0x0009 }
            r0.a(r1)     // Catch:{ all -> 0x0009 }
            o1.p r0 = r9.r()     // Catch:{ all -> 0x0009 }
            r9.f2722o = r0     // Catch:{ all -> 0x0009 }
            r9.f2725r = r4     // Catch:{ all -> 0x0009 }
            r9.f2729v = r4     // Catch:{ all -> 0x0009 }
            monitor-exit(r9)
            return
        L_0x00f9:
            r0.close()     // Catch:{ all -> 0x0009 }
            throw r1     // Catch:{ all -> 0x0009 }
        L_0x00fd:
            monitor-exit(r9)     // Catch:{ all -> 0x0009 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.v():void");
    }

    public final void w(e eVar) {
        d dVar = eVar.f;
        if (dVar != null) {
            dVar.c();
        }
        for (int i2 = 0; i2 < this.f2720m; i2++) {
            this.f.a(eVar.f2705c[i2]);
            long j2 = this.f2721n;
            long[] jArr = eVar.b;
            this.f2721n = j2 - jArr[i2];
            jArr[i2] = 0;
        }
        this.f2724q++;
        p pVar = this.f2722o;
        pVar.h("REMOVE");
        pVar.j(32);
        String str = eVar.f2704a;
        pVar.h(str);
        pVar.j(10);
        this.f2723p.remove(str);
        if (q()) {
            this.f2731x.execute(this.f2732y);
        }
    }

    public final void x() {
        while (this.f2721n > this.f2719l) {
            w((e) this.f2723p.values().iterator().next());
        }
        this.f2728u = false;
    }
}
