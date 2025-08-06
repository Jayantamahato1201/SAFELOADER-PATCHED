package q1;

import android.os.Binder;
import android.os.Bundle;
import android.os.Process;

/* renamed from: q1.i1  reason: case insensitive filesystem */
public final class C0364i1 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    public static final C0364i1 f4115a;
    public static final Bundle b;

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Binder, q1.i1, android.os.IBinder] */
    static {
        ? binder = new Binder();
        f4115a = binder;
        Bundle bundle = new Bundle();
        bundle.putBinder("mundo_wm_service", C0339e0.b);
        bundle.putBinder("mundo_pm_service", K2.b);
        bundle.putBinder("mundo_am_service", C0330c3.b);
        bundle.putBinder("mundo_co_service", Z.b);
        bundle.putBinder("mundo_acc_service", C0395n2.b);
        bundle.putBinder("mundo_uid_binder", binder);
        bundle.putInt(Integer.TYPE.getName(), Process.myPid());
        b = bundle;
    }

    public final String getInterfaceDescriptor() {
        return "https://www.62v.net/jnative/binder";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r0 = 7001(0x1b59, float:9.81E-42)
            if (r3 != r0) goto L_0x0056
            long r3 = r4.readLong()     // Catch:{ Exception -> 0x0054 }
            r0 = -4294967296(0xffffffff00000000, double:NaN)
            long r0 = r0 & r3
            r6 = 32
            long r0 = r0 >>> r6
            int r6 = (int) r0     // Catch:{ Exception -> 0x0054 }
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            int r4 = (int) r3     // Catch:{ Exception -> 0x0054 }
            k.f0 r3 = q1.C0360h3.b     // Catch:{ Exception -> 0x0054 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0054 }
            java.lang.Object r0 = r3.f3459a     // Catch:{ all -> 0x0051 }
            q1.q2 r0 = (q1.C0413q2) r0     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r0.a(r4)     // Catch:{ all -> 0x0051 }
            monitor-exit(r3)     // Catch:{ all -> 0x0051 }
            q1.Q2 r4 = (q1.Q2) r4     // Catch:{ Exception -> 0x0054 }
            if (r4 == 0) goto L_0x004c
            java.lang.Object r3 = r3.e(r6)     // Catch:{ Exception -> 0x0054 }
            q1.Q2 r3 = (q1.Q2) r3     // Catch:{ Exception -> 0x0054 }
            if (r3 == 0) goto L_0x004c
            java.lang.String r6 = r3.f3962a     // Catch:{ Exception -> 0x0054 }
            int r6 = r6.hashCode()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r0 = r4.f3962a     // Catch:{ Exception -> 0x0054 }
            int r0 = r0.hashCode()     // Catch:{ Exception -> 0x0054 }
            if (r6 != r0) goto L_0x0042
            int r3 = q1.C0394n1.f4144c     // Catch:{ Exception -> 0x0054 }
            goto L_0x004a
        L_0x0042:
            int r4 = r4.f     // Catch:{ Exception -> 0x0054 }
            int r3 = r3.f     // Catch:{ Exception -> 0x0054 }
            if (r4 != r3) goto L_0x004d
            int r3 = q1.C0394n1.f4144c     // Catch:{ Exception -> 0x0054 }
        L_0x004a:
            r4 = r3
            goto L_0x004d
        L_0x004c:
            r4 = -1
        L_0x004d:
            r5.writeInt(r4)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0054
        L_0x0051:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x0054 }
            throw r4     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            r3 = 1
            return r3
        L_0x0056:
            boolean r3 = super.onTransact(r3, r4, r5, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0364i1.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
