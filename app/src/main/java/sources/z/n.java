package Z;

import E0.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import o.C0302g;
import o.C0303h;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final C0303h f821a = new Object();
    public static final Object b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static e f822c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return l.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static e b() {
        e eVar = new e(14);
        f822c = eVar;
        C0303h hVar = f821a;
        hVar.getClass();
        if (C0302g.f3725k.i(hVar, (Object) null, eVar)) {
            C0302g.b(hVar);
        }
        return f822c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:37|38|39|40|85) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0086 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x00cd */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            if (r19 != 0) goto L_0x0008
            E0.e r0 = f822c
            if (r0 == 0) goto L_0x0008
            goto L_0x00d6
        L_0x0008:
            java.lang.Object r1 = b
            monitor-enter(r1)
            if (r19 != 0) goto L_0x0016
            E0.e r0 = f822c     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0016
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r0 = move-exception
            goto L_0x00dc
        L_0x0016:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0013 }
            r2 = 28
            if (r0 < r2) goto L_0x00d7
            r2 = 30
            if (r0 != r2) goto L_0x0022
            goto L_0x00d7
        L_0x0022:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0013 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0013 }
            java.lang.String r3 = "/data/misc/profiles/ref/"
            java.lang.String r4 = r18.getPackageName()     // Catch:{ all -> 0x0013 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0013 }
            java.lang.String r3 = "primary.prof"
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0013 }
            long r2 = r0.length()     // Catch:{ all -> 0x0013 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0013 }
            r4 = 0
            r5 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0048
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0048
            r0 = 1
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0013 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0013 }
            java.lang.String r10 = "/data/misc/profiles/cur/0/"
            java.lang.String r11 = r18.getPackageName()     // Catch:{ all -> 0x0013 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0013 }
            java.lang.String r10 = "primary.prof"
            r8.<init>(r9, r10)     // Catch:{ all -> 0x0013 }
            long r16 = r8.length()     // Catch:{ all -> 0x0013 }
            boolean r8 = r8.exists()     // Catch:{ all -> 0x0013 }
            if (r8 == 0) goto L_0x006b
            int r8 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x006b
            r5 = 1
            goto L_0x006c
        L_0x006b:
            r5 = 0
        L_0x006c:
            long r14 = a(r18)     // Catch:{ NameNotFoundException -> 0x00d2 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0013 }
            java.io.File r8 = r18.getFilesDir()     // Catch:{ all -> 0x0013 }
            java.lang.String r9 = "profileInstalled"
            r6.<init>(r8, r9)     // Catch:{ all -> 0x0013 }
            boolean r8 = r6.exists()     // Catch:{ all -> 0x0013 }
            if (r8 == 0) goto L_0x008b
            Z.m r8 = Z.m.a(r6)     // Catch:{ IOException -> 0x0086 }
            goto L_0x008c
        L_0x0086:
            b()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x00d6
        L_0x008b:
            r8 = 0
        L_0x008c:
            r9 = 2
            if (r8 == 0) goto L_0x009c
            long r10 = r8.f819c     // Catch:{ all -> 0x0013 }
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x009c
            int r10 = r8.b     // Catch:{ all -> 0x0013 }
            if (r10 != r9) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r4 = r10
            goto L_0x00a3
        L_0x009c:
            if (r0 == 0) goto L_0x00a0
            r4 = 1
            goto L_0x00a3
        L_0x00a0:
            if (r5 == 0) goto L_0x00a3
            r4 = 2
        L_0x00a3:
            if (r19 == 0) goto L_0x00aa
            if (r5 == 0) goto L_0x00aa
            if (r4 == r7) goto L_0x00aa
            r4 = 2
        L_0x00aa:
            if (r8 == 0) goto L_0x00bb
            int r0 = r8.b     // Catch:{ all -> 0x0013 }
            if (r0 != r9) goto L_0x00bb
            if (r4 != r7) goto L_0x00bb
            long r9 = r8.f820d     // Catch:{ all -> 0x0013 }
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bb
            r4 = 3
            r13 = 3
            goto L_0x00bc
        L_0x00bb:
            r13 = r4
        L_0x00bc:
            Z.m r11 = new Z.m     // Catch:{ all -> 0x0013 }
            r12 = 1
            r11.<init>(r12, r13, r14, r16)     // Catch:{ all -> 0x0013 }
            if (r8 == 0) goto L_0x00ca
            boolean r0 = r8.equals(r11)     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x00cd
        L_0x00ca:
            r11.b(r6)     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            b()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x00d6
        L_0x00d2:
            b()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
        L_0x00d6:
            return
        L_0x00d7:
            b()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            return
        L_0x00dc:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.n.c(android.content.Context, boolean):void");
    }
}
