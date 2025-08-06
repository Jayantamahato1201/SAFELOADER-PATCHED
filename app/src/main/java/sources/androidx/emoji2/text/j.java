package androidx.emoji2.text;

import A.i;
import F.b;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n.C0290c;

public final class j {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f1155i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static volatile j f1156j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f1157a;
    public final C0290c b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1158c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1159d;

    /* renamed from: e  reason: collision with root package name */
    public final f f1160e;
    public final i f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1161g;

    /* renamed from: h  reason: collision with root package name */
    public final d f1162h;

    public j(p pVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1157a = reentrantReadWriteLock;
        i iVar = (i) pVar.b;
        this.f = iVar;
        int i2 = pVar.f1153a;
        this.f1161g = i2;
        this.f1162h = (d) pVar.f1154c;
        this.f1159d = new Handler(Looper.getMainLooper());
        this.b = new C0290c();
        f fVar = new f(this);
        this.f1160e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f1158c = 0;
            } catch (Throwable th) {
                this.f1157a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.l(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        boolean z2;
        synchronized (f1155i) {
            try {
                jVar = f1156j;
                if (jVar != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public final int b() {
        this.f1157a.readLock().lock();
        try {
            return this.f1158c;
        } finally {
            this.f1157a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z2;
        if (this.f1161g == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        } else if (b() != 1) {
            this.f1157a.writeLock().lock();
            try {
                if (this.f1158c != 0) {
                    this.f1158c = 0;
                    this.f1157a.writeLock().unlock();
                    f fVar = this.f1160e;
                    j jVar = fVar.f1151a;
                    try {
                        jVar.f.l(new e(fVar));
                    } catch (Throwable th) {
                        jVar.d(th);
                    }
                }
            } finally {
                this.f1157a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1157a.writeLock().lock();
        try {
            this.f1158c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f1157a.writeLock().unlock();
            this.f1159d.post(new b((List) arrayList, this.f1158c, th));
        } catch (Throwable th2) {
            this.f1157a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0171, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0172, code lost:
        if (r4 == false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0169, code lost:
        if (r4 != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016b, code lost:
        ((androidx.emoji2.text.t) r12).b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094 A[Catch:{ all -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b4 A[Catch:{ all -> 0x0076 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence e(java.lang.CharSequence r12, int r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.b()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 == 0) goto L_0x018e
            if (r13 < 0) goto L_0x0186
            if (r14 < 0) goto L_0x017e
            if (r13 > r14) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            java.lang.String r3 = "start should be <= than end"
            A.i.i(r3, r0)
            r0 = 0
            if (r12 != 0) goto L_0x001f
            return r0
        L_0x001f:
            int r3 = r12.length()
            if (r13 > r3) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            java.lang.String r4 = "start should be < than charSequence length"
            A.i.i(r4, r3)
            int r3 = r12.length()
            if (r14 > r3) goto L_0x0035
            r3 = 1
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            java.lang.String r4 = "end should be < than charSequence length"
            A.i.i(r4, r3)
            int r3 = r12.length()
            if (r3 == 0) goto L_0x017d
            if (r13 != r14) goto L_0x0045
            goto L_0x017d
        L_0x0045:
            androidx.emoji2.text.f r3 = r11.f1160e
            F.c r3 = r3.b
            r3.getClass()
            boolean r4 = r12 instanceof androidx.emoji2.text.t
            if (r4 == 0) goto L_0x0056
            r5 = r12
            androidx.emoji2.text.t r5 = (androidx.emoji2.text.t) r5
            r5.a()
        L_0x0056:
            java.lang.Class<androidx.emoji2.text.u> r5 = androidx.emoji2.text.u.class
            if (r4 != 0) goto L_0x0079
            boolean r6 = r12 instanceof android.text.Spannable     // Catch:{ all -> 0x0076 }
            if (r6 == 0) goto L_0x005f
            goto L_0x0079
        L_0x005f:
            boolean r6 = r12 instanceof android.text.Spanned     // Catch:{ all -> 0x0076 }
            if (r6 == 0) goto L_0x0081
            r6 = r12
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch:{ all -> 0x0076 }
            int r7 = r13 + -1
            int r8 = r14 + 1
            int r6 = r6.nextSpanTransition(r7, r8, r5)     // Catch:{ all -> 0x0076 }
            if (r6 > r14) goto L_0x0081
            androidx.emoji2.text.w r0 = new androidx.emoji2.text.w     // Catch:{ all -> 0x0076 }
            r0.<init>((java.lang.CharSequence) r12)     // Catch:{ all -> 0x0076 }
            goto L_0x0081
        L_0x0076:
            r13 = move-exception
            goto L_0x0175
        L_0x0079:
            androidx.emoji2.text.w r0 = new androidx.emoji2.text.w     // Catch:{ all -> 0x0076 }
            r6 = r12
            android.text.Spannable r6 = (android.text.Spannable) r6     // Catch:{ all -> 0x0076 }
            r0.<init>((android.text.Spannable) r6)     // Catch:{ all -> 0x0076 }
        L_0x0081:
            if (r0 == 0) goto L_0x00b2
            android.text.Spannable r6 = r0.f1190g     // Catch:{ all -> 0x0076 }
            java.lang.Object[] r5 = r6.getSpans(r13, r14, r5)     // Catch:{ all -> 0x0076 }
            androidx.emoji2.text.u[] r5 = (androidx.emoji2.text.u[]) r5     // Catch:{ all -> 0x0076 }
            if (r5 == 0) goto L_0x00b2
            int r6 = r5.length     // Catch:{ all -> 0x0076 }
            if (r6 <= 0) goto L_0x00b2
            int r6 = r5.length     // Catch:{ all -> 0x0076 }
            r7 = 0
        L_0x0092:
            if (r7 >= r6) goto L_0x00b2
            r8 = r5[r7]     // Catch:{ all -> 0x0076 }
            android.text.Spannable r9 = r0.f1190g     // Catch:{ all -> 0x0076 }
            int r9 = r9.getSpanStart(r8)     // Catch:{ all -> 0x0076 }
            android.text.Spannable r10 = r0.f1190g     // Catch:{ all -> 0x0076 }
            int r10 = r10.getSpanEnd(r8)     // Catch:{ all -> 0x0076 }
            if (r9 == r14) goto L_0x00a7
            r0.removeSpan(r8)     // Catch:{ all -> 0x0076 }
        L_0x00a7:
            int r13 = java.lang.Math.min(r9, r13)     // Catch:{ all -> 0x0076 }
            int r14 = java.lang.Math.max(r10, r14)     // Catch:{ all -> 0x0076 }
            int r7 = r7 + 1
            goto L_0x0092
        L_0x00b2:
            if (r13 == r14) goto L_0x0172
            int r5 = r12.length()     // Catch:{ all -> 0x0076 }
            if (r13 < r5) goto L_0x00bc
            goto L_0x0172
        L_0x00bc:
            androidx.emoji2.text.n r5 = new androidx.emoji2.text.n     // Catch:{ all -> 0x0076 }
            java.lang.Object r6 = r3.b     // Catch:{ all -> 0x0076 }
            androidx.emoji2.text.r r6 = (androidx.emoji2.text.r) r6     // Catch:{ all -> 0x0076 }
            java.lang.Object r6 = r6.f1184c     // Catch:{ all -> 0x0076 }
            androidx.emoji2.text.q r6 = (androidx.emoji2.text.q) r6     // Catch:{ all -> 0x0076 }
            r5.<init>(r6)     // Catch:{ all -> 0x0076 }
            int r6 = java.lang.Character.codePointAt(r12, r13)     // Catch:{ all -> 0x0076 }
            r1 = r0
            r7 = r6
            r6 = 0
        L_0x00d0:
            r0 = r13
        L_0x00d1:
            r8 = 33
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 2
            if (r13 >= r14) goto L_0x012a
            if (r6 >= r9) goto L_0x012a
            int r9 = r5.a(r7)     // Catch:{ all -> 0x0076 }
            if (r9 == r2) goto L_0x0118
            if (r9 == r10) goto L_0x010c
            r10 = 3
            if (r9 == r10) goto L_0x00e7
            goto L_0x00d1
        L_0x00e7:
            androidx.emoji2.text.q r9 = r5.f1173d     // Catch:{ all -> 0x0076 }
            androidx.emoji2.text.m r9 = r9.b     // Catch:{ all -> 0x0076 }
            boolean r9 = r3.x(r12, r0, r13, r9)     // Catch:{ all -> 0x0076 }
            if (r9 != 0) goto L_0x00d0
            if (r1 != 0) goto L_0x00fd
            androidx.emoji2.text.w r1 = new androidx.emoji2.text.w     // Catch:{ all -> 0x0076 }
            android.text.SpannableString r9 = new android.text.SpannableString     // Catch:{ all -> 0x0076 }
            r9.<init>(r12)     // Catch:{ all -> 0x0076 }
            r1.<init>((android.text.Spannable) r9)     // Catch:{ all -> 0x0076 }
        L_0x00fd:
            androidx.emoji2.text.q r9 = r5.f1173d     // Catch:{ all -> 0x0076 }
            androidx.emoji2.text.m r9 = r9.b     // Catch:{ all -> 0x0076 }
            androidx.emoji2.text.u r10 = new androidx.emoji2.text.u     // Catch:{ all -> 0x0076 }
            r10.<init>(r9)     // Catch:{ all -> 0x0076 }
            r1.setSpan(r10, r0, r13, r8)     // Catch:{ all -> 0x0076 }
            int r6 = r6 + 1
            goto L_0x00d0
        L_0x010c:
            int r8 = java.lang.Character.charCount(r7)     // Catch:{ all -> 0x0076 }
            int r13 = r13 + r8
            if (r13 >= r14) goto L_0x00d1
            int r7 = java.lang.Character.codePointAt(r12, r13)     // Catch:{ all -> 0x0076 }
            goto L_0x00d1
        L_0x0118:
            int r13 = java.lang.Character.codePointAt(r12, r0)     // Catch:{ all -> 0x0076 }
            int r13 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x0076 }
            int r0 = r0 + r13
            if (r0 >= r14) goto L_0x0128
            int r13 = java.lang.Character.codePointAt(r12, r0)     // Catch:{ all -> 0x0076 }
            r7 = r13
        L_0x0128:
            r13 = r0
            goto L_0x00d1
        L_0x012a:
            int r14 = r5.f1171a     // Catch:{ all -> 0x0076 }
            if (r14 != r10) goto L_0x015d
            androidx.emoji2.text.q r14 = r5.f1172c     // Catch:{ all -> 0x0076 }
            androidx.emoji2.text.m r14 = r14.b     // Catch:{ all -> 0x0076 }
            if (r14 == 0) goto L_0x015d
            int r14 = r5.f     // Catch:{ all -> 0x0076 }
            if (r14 > r2) goto L_0x013e
            boolean r14 = r5.c()     // Catch:{ all -> 0x0076 }
            if (r14 == 0) goto L_0x015d
        L_0x013e:
            if (r6 >= r9) goto L_0x015d
            androidx.emoji2.text.q r14 = r5.f1172c     // Catch:{ all -> 0x0076 }
            androidx.emoji2.text.m r14 = r14.b     // Catch:{ all -> 0x0076 }
            boolean r14 = r3.x(r12, r0, r13, r14)     // Catch:{ all -> 0x0076 }
            if (r14 != 0) goto L_0x015d
            if (r1 != 0) goto L_0x0151
            androidx.emoji2.text.w r1 = new androidx.emoji2.text.w     // Catch:{ all -> 0x0076 }
            r1.<init>((java.lang.CharSequence) r12)     // Catch:{ all -> 0x0076 }
        L_0x0151:
            androidx.emoji2.text.q r14 = r5.f1172c     // Catch:{ all -> 0x0076 }
            androidx.emoji2.text.m r14 = r14.b     // Catch:{ all -> 0x0076 }
            androidx.emoji2.text.u r2 = new androidx.emoji2.text.u     // Catch:{ all -> 0x0076 }
            r2.<init>(r14)     // Catch:{ all -> 0x0076 }
            r1.setSpan(r2, r0, r13, r8)     // Catch:{ all -> 0x0076 }
        L_0x015d:
            if (r1 == 0) goto L_0x0169
            android.text.Spannable r13 = r1.f1190g     // Catch:{ all -> 0x0076 }
            if (r4 == 0) goto L_0x0168
            androidx.emoji2.text.t r12 = (androidx.emoji2.text.t) r12
            r12.b()
        L_0x0168:
            return r13
        L_0x0169:
            if (r4 == 0) goto L_0x017d
        L_0x016b:
            r13 = r12
            androidx.emoji2.text.t r13 = (androidx.emoji2.text.t) r13
            r13.b()
            return r12
        L_0x0172:
            if (r4 == 0) goto L_0x017d
            goto L_0x016b
        L_0x0175:
            if (r4 == 0) goto L_0x017c
            androidx.emoji2.text.t r12 = (androidx.emoji2.text.t) r12
            r12.b()
        L_0x017c:
            throw r13
        L_0x017d:
            return r12
        L_0x017e:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "end cannot be negative"
            r12.<init>(r13)
            throw r12
        L_0x0186:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "start cannot be negative"
            r12.<init>(r13)
            throw r12
        L_0x018e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Not initialized yet"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.j.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(h hVar) {
        i.k("initCallback cannot be null", hVar);
        this.f1157a.writeLock().lock();
        try {
            if (this.f1158c != 1) {
                if (this.f1158c != 2) {
                    this.b.add(hVar);
                }
            }
            this.f1159d.post(new b(Arrays.asList(new h[]{hVar}), this.f1158c, (Throwable) null));
        } finally {
            this.f1157a.writeLock().unlock();
        }
    }
}
