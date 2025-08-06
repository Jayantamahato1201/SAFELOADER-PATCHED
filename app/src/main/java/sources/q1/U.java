package q1;

import android.os.Binder;
import android.os.IBinder;

public abstract class U extends Binder implements C0345f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4011a = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v90, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v47, resolved type: q1.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "top.bienvenido.mundo.IMundoPackageManagerService"
            r1 = 1
            if (r5 < r1) goto L_0x000d
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            if (r5 > r2) goto L_0x000d
            r6.enforceInterface(r0)
        L_0x000d:
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r5 != r2) goto L_0x0016
            r7.writeString(r0)
            return r1
        L_0x0016:
            r0 = 0
            switch(r5) {
                case 1: goto L_0x03b8;
                case 2: goto L_0x03a7;
                case 3: goto L_0x0388;
                case 4: goto L_0x0369;
                case 5: goto L_0x034b;
                case 6: goto L_0x032d;
                case 7: goto L_0x030f;
                case 8: goto L_0x02f1;
                case 9: goto L_0x02d3;
                case 10: goto L_0x02b5;
                case 11: goto L_0x0285;
                case 12: goto L_0x0255;
                case 13: goto L_0x0237;
                case 14: goto L_0x0219;
                case 15: goto L_0x0207;
                case 16: goto L_0x01f5;
                case 17: goto L_0x01da;
                case 18: goto L_0x01c4;
                case 19: goto L_0x01b2;
                case 20: goto L_0x019b;
                case 21: goto L_0x0189;
                case 22: goto L_0x0177;
                case 23: goto L_0x0165;
                case 24: goto L_0x0153;
                case 25: goto L_0x0141;
                case 26: goto L_0x012b;
                case 27: goto L_0x011c;
                case 28: goto L_0x00f8;
                case 29: goto L_0x00bc;
                case 30: goto L_0x00b1;
                case 31: goto L_0x009f;
                case 32: goto L_0x0091;
                case 33: goto L_0x006f;
                case 34: goto L_0x005d;
                case 35: goto L_0x004b;
                case 36: goto L_0x0035;
                case 37: goto L_0x001f;
                default: goto L_0x001a;
            }
        L_0x001a:
            boolean r5 = super.onTransact(r5, r6, r7, r8)
            return r5
        L_0x001f:
            android.os.Parcelable$Creator r5 = android.content.ComponentName.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            int r5 = r6.o0(r5)
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x0035:
            android.os.Parcelable$Creator r5 = android.content.ComponentName.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            int r6 = r6.readInt()
            r8 = r4
            q1.K2 r8 = (q1.K2) r8
            r8.y0(r5, r6)
            r7.writeNoException()
            return r1
        L_0x004b:
            android.os.Parcelable$Creator r5 = android.content.pm.PackageManager.ComponentEnabledSetting.CREATOR
            java.util.ArrayList r5 = r6.createTypedArrayList(r5)
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            r6.O(r5)
            r7.writeNoException()
            return r1
        L_0x005d:
            java.lang.String r5 = r6.readString()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            boolean r5 = r6.u0(r5)
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x006f:
            int r5 = r6.readInt()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            if (r5 != 0) goto L_0x0087
            q1.q2 r5 = q1.O3.f3952a
            i0.l r5 = new i0.l
            r6 = 15
            r5.<init>(r6)
            java.util.concurrent.ExecutorService r6 = q1.d5.b
            r6.execute(r5)
            return r1
        L_0x0087:
            q1.q2 r5 = q1.O3.f3952a
            q1.q2 r5 = new q1.q2
            r5.<init>(r0)
            q1.O3.f3952a = r5
            return r1
        L_0x0091:
            r5 = r4
            q1.K2 r5 = (q1.K2) r5
            java.util.ArrayList r5 = q1.K2.U0()
            r7.writeNoException()
            r7.writeStringList(r5)
            return r1
        L_0x009f:
            java.lang.String r5 = r6.readString()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            boolean r5 = r6.T0(r5)
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x00b1:
            android.os.ConditionVariable r5 = q1.K2.f3931e
            r2 = 10000(0x2710, double:4.9407E-320)
            r5.block(r2)
            r7.writeNoException()
            return r1
        L_0x00bc:
            java.lang.String r5 = r6.readString()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            q1.E4 r6 = q1.K2.f3929c     // Catch:{ Exception -> 0x00ea }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x00ea }
            q1.X3 r6 = (q1.X3) r6     // Catch:{ Exception -> 0x00ea }
            if (r6 == 0) goto L_0x00ce
            goto L_0x00d7
        L_0x00ce:
            q1.E4 r6 = q1.K2.f3930d     // Catch:{ Exception -> 0x00ea }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ Exception -> 0x00ea }
            r6 = r5
            q1.z r6 = (q1.C0463z) r6     // Catch:{ Exception -> 0x00ea }
        L_0x00d7:
            if (r6 == 0) goto L_0x00ea
            q1.u2 r5 = r6.b     // Catch:{ Exception -> 0x00ea }
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x00ea }
            if (r6 != 0) goto L_0x00ea
            java.lang.String[] r6 = q1.H.f3888e     // Catch:{ Exception -> 0x00ea }
            java.lang.Object[] r5 = r5.toArray(r6)     // Catch:{ Exception -> 0x00ea }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ Exception -> 0x00ea }
            goto L_0x00f0
        L_0x00ea:
            java.lang.String r5 = "0"
            java.lang.String[] r5 = new java.lang.String[]{r5}
        L_0x00f0:
            r7.writeNoException()
            r7.writeStringArray(r5)
            goto L_0x01b1
        L_0x00f8:
            java.lang.String r5 = r6.readString()
            java.lang.String r6 = r6.readString()
            r7 = r4
            q1.K2 r7 = (q1.K2) r7
            if (r6 == 0) goto L_0x0118
            int r7 = r6.length()
            if (r7 != 0) goto L_0x010c
            goto L_0x0118
        L_0x010c:
            q1.J2 r7 = new q1.J2
            r8 = 2
            r7.<init>(r8, r5, r6)
            java.util.concurrent.ExecutorService r5 = q1.d5.f4080a
            r5.execute(r7)
            return r1
        L_0x0118:
            q1.K2.Z0(r5)
            return r1
        L_0x011c:
            java.lang.String r5 = r6.readString()
            java.lang.String r6 = r6.readString()
            r7 = r4
            q1.K2 r7 = (q1.K2) r7
            r7.d0(r5, r6)
            return r1
        L_0x012b:
            java.lang.String r5 = r6.readString()
            int r6 = r6.readInt()
            r8 = r4
            q1.K2 r8 = (q1.K2) r8
            int r5 = r8.y(r6, r5)
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x0141:
            java.lang.String r5 = r6.readString()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            int r5 = r6.a(r5)
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x0153:
            int[] r5 = r6.createIntArray()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            java.lang.String[] r5 = r6.X(r5)
            r7.writeNoException()
            r7.writeStringArray(r5)
            return r1
        L_0x0165:
            int r5 = r6.readInt()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            java.lang.String r5 = r6.g(r5)
            r7.writeNoException()
            r7.writeString(r5)
            return r1
        L_0x0177:
            int r5 = r6.readInt()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            java.lang.String[] r5 = r6.F0(r5)
            r7.writeNoException()
            r7.writeStringArray(r5)
            return r1
        L_0x0189:
            java.lang.String r5 = r6.readString()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            int r5 = r6.i0(r5)
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x019b:
            java.lang.String r5 = r6.readString()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            java.io.File r6 = q1.E0.f3872a
            if (r5 != 0) goto L_0x01a7
            goto L_0x01b1
        L_0x01a7:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01b1 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x01b1 }
            r6.mkdirs()     // Catch:{ Exception -> 0x01b1 }
            q1.E0.f3872a = r6     // Catch:{ Exception -> 0x01b1 }
        L_0x01b1:
            return r1
        L_0x01b2:
            java.lang.String r5 = r6.readString()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            java.lang.String r5 = r6.x0(r5)
            r7.writeNoException()
            r7.writeString(r5)
            return r1
        L_0x01c4:
            java.lang.String r5 = r6.readString()
            java.lang.String r6 = r6.readString()
            r8 = r4
            q1.K2 r8 = (q1.K2) r8
            java.util.ArrayList r5 = r8.P(r5, r6)
            r7.writeNoException()
            q1.H.l(r7, r5, r1)
            return r1
        L_0x01da:
            java.lang.String r5 = r6.readString()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            android.content.pm.ProviderInfo r5 = r6.w0(r5)
            r7.writeNoException()
            if (r5 == 0) goto L_0x01f1
            r7.writeInt(r1)
            r5.writeToParcel(r7, r1)
            return r1
        L_0x01f1:
            r7.writeInt(r0)
            return r1
        L_0x01f5:
            int r5 = r6.readInt()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            java.util.ArrayList r5 = r6.f0(r5)
            r7.writeNoException()
            q1.H.l(r7, r5, r1)
            return r1
        L_0x0207:
            int r5 = r6.readInt()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            java.util.ArrayList r5 = r6.U(r5)
            r7.writeNoException()
            q1.H.l(r7, r5, r1)
            return r1
        L_0x0219:
            android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.Intent r5 = (android.content.Intent) r5
            java.lang.String r8 = r6.readString()
            int r6 = r6.readInt()
            r0 = r4
            q1.K2 r0 = (q1.K2) r0
            java.util.List r5 = r0.d(r5, r8, r6)
            r7.writeNoException()
            q1.H.l(r7, r5, r1)
            return r1
        L_0x0237:
            android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.Intent r5 = (android.content.Intent) r5
            java.lang.String r8 = r6.readString()
            int r6 = r6.readInt()
            r0 = r4
            q1.K2 r0 = (q1.K2) r0
            java.util.List r5 = r0.b(r5, r8, r6)
            r7.writeNoException()
            q1.H.l(r7, r5, r1)
            return r1
        L_0x0255:
            android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.Intent r5 = (android.content.Intent) r5
            java.lang.String r8 = r6.readString()
            int r6 = r6.readInt()
            r2 = r4
            q1.K2 r2 = (q1.K2) r2
            java.util.List r5 = r2.c(r5, r8, r6)
            q1.H.n(r5)
            java.lang.Object r5 = M0.e.B0(r5)
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            r7.writeNoException()
            if (r5 == 0) goto L_0x0281
            r7.writeInt(r1)
            r5.writeToParcel(r7, r1)
            return r1
        L_0x0281:
            r7.writeInt(r0)
            return r1
        L_0x0285:
            android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.Intent r5 = (android.content.Intent) r5
            java.lang.String r8 = r6.readString()
            int r6 = r6.readInt()
            r2 = r4
            q1.K2 r2 = (q1.K2) r2
            java.util.List r5 = r2.b(r5, r8, r6)
            q1.H.n(r5)
            java.lang.Object r5 = M0.e.B0(r5)
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            r7.writeNoException()
            if (r5 == 0) goto L_0x02b1
            r7.writeInt(r1)
            r5.writeToParcel(r7, r1)
            return r1
        L_0x02b1:
            r7.writeInt(r0)
            return r1
        L_0x02b5:
            android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.Intent r5 = (android.content.Intent) r5
            java.lang.String r8 = r6.readString()
            int r6 = r6.readInt()
            r0 = r4
            q1.K2 r0 = (q1.K2) r0
            java.util.List r5 = r0.e(r5, r8, r6)
            r7.writeNoException()
            q1.H.l(r7, r5, r1)
            return r1
        L_0x02d3:
            android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.Intent r5 = (android.content.Intent) r5
            java.lang.String r8 = r6.readString()
            int r6 = r6.readInt()
            r0 = r4
            q1.K2 r0 = (q1.K2) r0
            java.util.List r5 = r0.c(r5, r8, r6)
            r7.writeNoException()
            q1.H.l(r7, r5, r1)
            return r1
        L_0x02f1:
            android.os.Parcelable$Creator r5 = android.content.ComponentName.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            android.content.pm.ComponentInfo r5 = q1.K2.S0(r5)
            android.content.pm.ProviderInfo r5 = (android.content.pm.ProviderInfo) r5
            r7.writeNoException()
            if (r5 == 0) goto L_0x030b
            r7.writeInt(r1)
            r5.writeToParcel(r7, r1)
            return r1
        L_0x030b:
            r7.writeInt(r0)
            return r1
        L_0x030f:
            android.os.Parcelable$Creator r5 = android.content.ComponentName.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            android.content.pm.ComponentInfo r5 = q1.K2.S0(r5)
            android.content.pm.ServiceInfo r5 = (android.content.pm.ServiceInfo) r5
            r7.writeNoException()
            if (r5 == 0) goto L_0x0329
            r7.writeInt(r1)
            r5.writeToParcel(r7, r1)
            return r1
        L_0x0329:
            r7.writeInt(r0)
            return r1
        L_0x032d:
            android.os.Parcelable$Creator r5 = android.content.ComponentName.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            android.content.pm.ComponentInfo r5 = q1.K2.S0(r5)
            android.content.pm.ActivityInfo r5 = (android.content.pm.ActivityInfo) r5
            r7.writeNoException()
            if (r5 == 0) goto L_0x0347
            r7.writeInt(r1)
            r5.writeToParcel(r7, r1)
            return r1
        L_0x0347:
            r7.writeInt(r0)
            return r1
        L_0x034b:
            android.os.Parcelable$Creator r5 = android.content.ComponentName.CREATOR
            java.lang.Object r5 = q1.H.f(r6, r5)
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            android.content.pm.ComponentInfo r5 = q1.K2.S0(r5)
            android.content.pm.ActivityInfo r5 = (android.content.pm.ActivityInfo) r5
            r7.writeNoException()
            if (r5 == 0) goto L_0x0365
            r7.writeInt(r1)
            r5.writeToParcel(r7, r1)
            return r1
        L_0x0365:
            r7.writeInt(r0)
            return r1
        L_0x0369:
            java.lang.String r5 = r6.readString()
            int r6 = r6.readInt()
            r8 = r4
            q1.K2 r8 = (q1.K2) r8
            android.content.pm.ApplicationInfo r5 = r8.I0(r6, r5)
            r7.writeNoException()
            if (r5 == 0) goto L_0x0384
            r7.writeInt(r1)
            r5.writeToParcel(r7, r1)
            return r1
        L_0x0384:
            r7.writeInt(r0)
            return r1
        L_0x0388:
            java.lang.String r5 = r6.readString()
            int r6 = r6.readInt()
            r8 = r4
            q1.K2 r8 = (q1.K2) r8
            android.content.pm.PackageInfo r5 = r8.R(r6, r5)
            r7.writeNoException()
            if (r5 == 0) goto L_0x03a3
            r7.writeInt(r1)
            r5.writeToParcel(r7, r1)
            return r1
        L_0x03a3:
            r7.writeInt(r0)
            return r1
        L_0x03a7:
            java.lang.String r5 = r6.readString()
            q1.E4 r6 = q1.K2.f3929c
            boolean r5 = r6.containsKey(r5)
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x03b8:
            java.lang.String r5 = r6.readString()
            r6 = r4
            q1.K2 r6 = (q1.K2) r6
            boolean r5 = r6.B0(r5)
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.U.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public final IBinder asBinder() {
        return this;
    }
}
