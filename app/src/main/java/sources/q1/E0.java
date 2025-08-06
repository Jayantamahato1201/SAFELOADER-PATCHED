package q1;

import android.content.Context;
import java.io.File;

public abstract class E0 {

    /* renamed from: a  reason: collision with root package name */
    public static File f3872a;

    static {
        Context context = C0394n1.f4143a;
        File obbDir = context.getObbDir();
        if (obbDir == null) {
            obbDir = context.getCodeCacheDir();
        }
        f3872a = new File(obbDir, "scopedStorage");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086 A[Catch:{ Exception -> 0x00ca }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
            android.content.Context r0 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x00ca }
            java.lang.String r1 = "storage"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x00ca }
            android.os.storage.StorageManager r1 = (android.os.storage.StorageManager) r1     // Catch:{ Exception -> 0x00ca }
            java.io.File[] r0 = r0.getObbDirs()     // Catch:{ Exception -> 0x00ca }
            boolean r2 = q1.T4.f3998c     // Catch:{ Exception -> 0x00ca }
            q1.C0 r3 = q1.C0.f3864a
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x001b
            java.util.List r1 = r1.getStorageVolumes()     // Catch:{ Exception -> 0x00ca }
            goto L_0x0046
        L_0x001b:
            java.lang.Class<android.os.storage.StorageManager> r2 = android.os.storage.StorageManager.class
            java.lang.String r6 = "getVolumeList"
            java.lang.Class[] r7 = q1.H.f3886c     // Catch:{ Exception -> 0x00ca }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x002f }
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x002f }
            q1.g0 r6 = new q1.g0     // Catch:{ Exception -> 0x002f }
            r7 = 1
            r6.<init>(r2, r7)     // Catch:{ Exception -> 0x002f }
            goto L_0x0030
        L_0x002f:
            r6 = r3
        L_0x0030:
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00ca }
            java.lang.Object r1 = r6.b(r1, r2)     // Catch:{ Exception -> 0x00ca }
            android.os.storage.StorageVolume[] r1 = (android.os.storage.StorageVolume[]) r1     // Catch:{ Exception -> 0x00ca }
            java.lang.String r2 = "<this>"
            U0.i.e(r2, r1)     // Catch:{ Exception -> 0x00ca }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r2 = "asList(this)"
            U0.i.d(r2, r1)     // Catch:{ Exception -> 0x00ca }
        L_0x0046:
            java.lang.Class r2 = E.j.k()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r6 = "mPath"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r6)     // Catch:{ Exception -> 0x007c }
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x007c }
            int r4 = r2.getModifiers()     // Catch:{ Exception -> 0x007c }
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch:{ Exception -> 0x007c }
            if (r4 != 0) goto L_0x0075
            java.lang.Class r4 = r2.getType()     // Catch:{ Exception -> 0x007c }
            boolean r4 = r4.isPrimitive()     // Catch:{ Exception -> 0x007c }
            if (r4 == 0) goto L_0x0068
            goto L_0x0075
        L_0x0068:
            sun.misc.Unsafe r4 = q1.C0455x3.f4236a     // Catch:{ Exception -> 0x007c }
            long r6 = r4.objectFieldOffset(r2)     // Catch:{ Exception -> 0x007c }
            q1.t0 r2 = new q1.t0     // Catch:{ Exception -> 0x007c }
            r2.<init>(r6)     // Catch:{ Exception -> 0x007c }
            r3 = r2
            goto L_0x007c
        L_0x0075:
            q1.g0 r4 = new q1.g0     // Catch:{ Exception -> 0x007c }
            r6 = 2
            r4.<init>(r2, r6)     // Catch:{ Exception -> 0x007c }
            r3 = r4
        L_0x007c:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00ca }
        L_0x0080:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00ca }
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00ca }
            android.os.storage.StorageVolume r2 = q1.D0.a(r2)     // Catch:{ Exception -> 0x00ca }
            boolean r4 = r2.isRemovable()     // Catch:{ Exception -> 0x00ca }
            if (r4 == 0) goto L_0x0080
            java.lang.String r4 = r2.getState()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r6 = "mounted"
            boolean r4 = U0.i.a(r4, r6)     // Catch:{ Exception -> 0x00ca }
            if (r4 == 0) goto L_0x0080
            java.lang.Object r2 = r3.a(r2)     // Catch:{ Exception -> 0x00ca }
            java.io.File r2 = (java.io.File) r2     // Catch:{ Exception -> 0x00ca }
            if (r2 != 0) goto L_0x00a9
            goto L_0x0080
        L_0x00a9:
            int r4 = r0.length     // Catch:{ Exception -> 0x00ca }
            r6 = 0
        L_0x00ab:
            if (r6 >= r4) goto L_0x0080
            r7 = r0[r6]     // Catch:{ Exception -> 0x00ca }
            java.lang.String r8 = r7.getAbsolutePath()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r9 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x00ca }
            boolean r8 = b1.i.j0(r8, r9)     // Catch:{ Exception -> 0x00ca }
            if (r8 == 0) goto L_0x00c7
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00ca }
            java.lang.String r1 = "scopedStorage"
            r0.<init>(r7, r1)     // Catch:{ Exception -> 0x00ca }
            f3872a = r0     // Catch:{ Exception -> 0x00ca }
            goto L_0x00ca
        L_0x00c7:
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.E0.a():void");
    }
}
