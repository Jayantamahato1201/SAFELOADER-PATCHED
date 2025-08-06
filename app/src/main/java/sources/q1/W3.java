package q1;

import android.os.Binder;
import android.os.IBinder;

public abstract class W3 extends Binder implements C0325b4 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4029a = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: android.content.IntentFilter} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "top.bienvenido.mundo.IMundoActivityManagerService"
            r1 = 1
            if (r9 < r1) goto L_0x000d
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            if (r9 > r2) goto L_0x000d
            r10.enforceInterface(r0)
        L_0x000d:
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r9 != r2) goto L_0x0016
            r11.writeString(r0)
            return r1
        L_0x0016:
            r0 = 0
            r2 = 0
            switch(r9) {
                case 1: goto L_0x01f4;
                case 2: goto L_0x01cb;
                case 3: goto L_0x01ab;
                case 4: goto L_0x0187;
                case 5: goto L_0x0163;
                case 6: goto L_0x0151;
                case 7: goto L_0x012d;
                case 8: goto L_0x010d;
                case 9: goto L_0x00df;
                case 10: goto L_0x00a2;
                case 11: goto L_0x0085;
                case 12: goto L_0x007a;
                case 13: goto L_0x0057;
                case 14: goto L_0x0048;
                case 15: goto L_0x0030;
                case 16: goto L_0x0020;
                default: goto L_0x001b;
            }
        L_0x001b:
            boolean r9 = super.onTransact(r9, r10, r11, r12)
            return r9
        L_0x0020:
            int r9 = q1.C0360h3.f4114d
            if (r9 == 0) goto L_0x010c
            q1.V2 r10 = new q1.V2
            r11 = 1
            r10.<init>(r9, r11)
            java.util.concurrent.ExecutorService r9 = q1.d5.b
            r9.execute(r10)
            return r1
        L_0x0030:
            java.lang.String r9 = r10.readString()
            java.lang.String r10 = r10.readString()
            q1.e0 r12 = q1.C0339e0.b
            r12.getClass()
            boolean r9 = q1.C0339e0.m0(r9, r10)
            r11.writeNoException()
            r11.writeInt(r9)
            return r1
        L_0x0048:
            java.lang.String r9 = r10.readString()
            java.lang.String r10 = r10.readString()
            r11 = r8
            q1.c3 r11 = (q1.C0330c3) r11
            r11.v0(r9, r10)
            return r1
        L_0x0057:
            int r9 = r10.readInt()
            android.os.Parcelable$Creator r12 = android.content.Intent.CREATOR
            int r3 = r10.readInt()
            if (r3 == 0) goto L_0x0067
            java.lang.Object r2 = r12.createFromParcel(r10)
        L_0x0067:
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.String r10 = r10.readString()
            r12 = r8
            q1.c3 r12 = (q1.C0330c3) r12
            r12.g0(r2, r10, r9)
            r11.writeNoException()
            r11.writeInt(r0)
            return r1
        L_0x007a:
            android.os.IBinder r9 = r10.readStrongBinder()
            r10 = r8
            q1.c3 r10 = (q1.C0330c3) r10
            r10.m(r9)
            return r1
        L_0x0085:
            int r9 = r10.readInt()
            android.os.IBinder r11 = r10.readStrongBinder()
            android.os.Parcelable$Creator r12 = android.content.IntentFilter.CREATOR
            int r0 = r10.readInt()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r2 = r12.createFromParcel(r10)
        L_0x0099:
            android.content.IntentFilter r2 = (android.content.IntentFilter) r2
            r10 = r8
            q1.c3 r10 = (q1.C0330c3) r10
            r10.q0(r9, r11, r2)
            return r1
        L_0x00a2:
            int r9 = r10.readInt()
            r10 = r8
            q1.c3 r10 = (q1.C0330c3) r10
            r10 = 3
            java.lang.String[] r12 = new java.lang.String[r10]
            r2 = 0
        L_0x00ad:
            if (r2 >= r10) goto L_0x00b6
            java.lang.String r3 = ""
            r12[r2] = r3
            int r2 = r2 + 1
            goto L_0x00ad
        L_0x00b6:
            k.f0 r10 = q1.C0360h3.b     // Catch:{ Exception -> 0x00d8 }
            monitor-enter(r10)     // Catch:{ Exception -> 0x00d8 }
            java.lang.Object r2 = r10.f3459a     // Catch:{ all -> 0x00d4 }
            q1.q2 r2 = (q1.C0413q2) r2     // Catch:{ all -> 0x00d4 }
            java.lang.Object r9 = r2.a(r9)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r10)     // Catch:{ all -> 0x00d4 }
            q1.Q2 r9 = (q1.Q2) r9     // Catch:{ Exception -> 0x00d8 }
            if (r9 == 0) goto L_0x00d8
            java.lang.String r10 = r9.f3962a     // Catch:{ Exception -> 0x00d8 }
            r12[r0] = r10     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r10 = r9.b     // Catch:{ Exception -> 0x00d8 }
            r12[r1] = r10     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r9 = r9.f3963c     // Catch:{ Exception -> 0x00d8 }
            r10 = 2
            r12[r10] = r9     // Catch:{ Exception -> 0x00d8 }
            goto L_0x00d8
        L_0x00d4:
            r0 = move-exception
            r9 = r0
            monitor-exit(r10)     // Catch:{ Exception -> 0x00d8 }
            throw r9     // Catch:{ Exception -> 0x00d8 }
        L_0x00d8:
            r11.writeNoException()
            r11.writeStringArray(r12)
            goto L_0x010c
        L_0x00df:
            int r9 = r10.readInt()
            r10 = r8
            q1.c3 r10 = (q1.C0330c3) r10
            java.util.ArrayList r9 = r10.l(r9)
            r11.writeNoException()
            int r10 = r9.size()
            r11.writeInt(r10)
            r12 = 0
        L_0x00f5:
            if (r12 >= r10) goto L_0x010c
            java.lang.Object r2 = r9.get(r12)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            if (r2 == 0) goto L_0x0106
            r11.writeInt(r1)
            r2.writeToParcel(r11, r1)
            goto L_0x0109
        L_0x0106:
            r11.writeInt(r0)
        L_0x0109:
            int r12 = r12 + 1
            goto L_0x00f5
        L_0x010c:
            return r1
        L_0x010d:
            android.os.Parcelable$Creator r9 = android.content.ComponentName.CREATOR
            int r12 = r10.readInt()
            if (r12 == 0) goto L_0x0119
            java.lang.Object r2 = r9.createFromParcel(r10)
        L_0x0119:
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            java.lang.String r9 = r10.readString()
            r10 = r8
            q1.c3 r10 = (q1.C0330c3) r10
            android.os.IBinder r9 = r10.h(r2, r9)
            r11.writeNoException()
            r11.writeStrongBinder(r9)
            return r1
        L_0x012d:
            android.os.IBinder r9 = r10.readStrongBinder()
            android.os.Parcelable$Creator r12 = android.content.Intent.CREATOR
            int r0 = r10.readInt()
            if (r0 == 0) goto L_0x013d
            java.lang.Object r2 = r12.createFromParcel(r10)
        L_0x013d:
            android.content.Intent r2 = (android.content.Intent) r2
            android.os.IBinder r10 = r10.readStrongBinder()
            r12 = r8
            q1.c3 r12 = (q1.C0330c3) r12
            boolean r9 = r12.K(r9, r2, r10)
            r11.writeNoException()
            r11.writeInt(r9)
            return r1
        L_0x0151:
            android.os.IBinder r9 = r10.readStrongBinder()
            r10 = r8
            q1.c3 r10 = (q1.C0330c3) r10
            boolean r9 = r10.R0(r9)
            r11.writeNoException()
            r11.writeInt(r9)
            return r1
        L_0x0163:
            android.os.Parcelable$Creator r9 = android.content.Intent.CREATOR
            int r12 = r10.readInt()
            if (r12 == 0) goto L_0x016f
            java.lang.Object r2 = r9.createFromParcel(r10)
        L_0x016f:
            android.content.Intent r2 = (android.content.Intent) r2
            android.os.IBinder r9 = r10.readStrongBinder()
            java.lang.String r10 = r10.readString()
            r12 = r8
            q1.c3 r12 = (q1.C0330c3) r12
            int r9 = r12.n(r2, r9, r10)
            r11.writeNoException()
            r11.writeInt(r9)
            return r1
        L_0x0187:
            android.os.Parcelable$Creator r9 = android.content.ComponentName.CREATOR
            int r12 = r10.readInt()
            if (r12 == 0) goto L_0x0193
            java.lang.Object r2 = r9.createFromParcel(r10)
        L_0x0193:
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            android.os.IBinder r9 = r10.readStrongBinder()
            int r10 = r10.readInt()
            r12 = r8
            q1.c3 r12 = (q1.C0330c3) r12
            boolean r9 = r12.p0(r2, r9, r10)
            r11.writeNoException()
            r11.writeInt(r9)
            return r1
        L_0x01ab:
            android.os.Parcelable$Creator r9 = android.content.Intent.CREATOR
            int r12 = r10.readInt()
            if (r12 == 0) goto L_0x01b7
            java.lang.Object r2 = r9.createFromParcel(r10)
        L_0x01b7:
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.String r9 = r10.readString()
            r10 = r8
            q1.c3 r10 = (q1.C0330c3) r10
            int r9 = r10.H(r2, r9)
            r11.writeNoException()
            r11.writeInt(r9)
            return r1
        L_0x01cb:
            android.os.Parcelable$Creator r9 = android.content.Intent.CREATOR
            int r12 = r10.readInt()
            if (r12 == 0) goto L_0x01d7
            java.lang.Object r2 = r9.createFromParcel(r10)
        L_0x01d7:
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.String r9 = r10.readString()
            r10 = r8
            q1.c3 r10 = (q1.C0330c3) r10
            android.content.ComponentName r9 = r10.A(r2, r9)
            r11.writeNoException()
            if (r9 == 0) goto L_0x01f0
            r11.writeInt(r1)
            r9.writeToParcel(r11, r1)
            return r1
        L_0x01f0:
            r11.writeInt(r0)
            return r1
        L_0x01f4:
            java.lang.String r3 = r10.readString()
            java.lang.String r4 = r10.readString()
            int r9 = r10.readInt()
            if (r9 >= 0) goto L_0x0204
            r5 = r2
            goto L_0x0207
        L_0x0204:
            android.content.pm.ProviderInfo[] r9 = new android.content.pm.ProviderInfo[r9]
            r5 = r9
        L_0x0207:
            int r9 = r10.readInt()
            if (r9 >= 0) goto L_0x020f
        L_0x020d:
            r6 = r2
            goto L_0x0212
        L_0x020f:
            java.lang.String[] r2 = new java.lang.String[r9]
            goto L_0x020d
        L_0x0212:
            int r7 = r10.readInt()
            r2 = r8
            q1.c3 r2 = (q1.C0330c3) r2
            android.os.IBinder r9 = r2.C0(r3, r4, r5, r6, r7)
            r11.writeNoException()
            r11.writeStrongBinder(r9)
            r11.writeTypedArray(r5, r1)
            r11.writeStringArray(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.W3.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public final IBinder asBinder() {
        return this;
    }
}
