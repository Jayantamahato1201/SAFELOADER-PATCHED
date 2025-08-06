package q1;

import java.util.ArrayList;

public abstract class f5 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4095a;
    public static final String b;

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f4096c;

    /* JADX WARNING: Can't wrap try/catch for region: R(12:26|27|28|29|(1:31)|50|32|(2:34|(2:36|37))|38|39|42|43) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0138 */
    static {
        /*
            r0 = 5
            r1 = 2
            r2 = 1
            java.lang.String r3 = "blackeji.62v.net"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.security.SecureRandom r5 = new java.security.SecureRandom
            r5.<init>()
            r6 = 0
            r7 = 0
        L_0x0011:
            r8 = 16
            if (r7 >= r8) goto L_0x0026
            r8 = 36
            int r8 = r5.nextInt(r8)
            java.lang.String r9 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
            char r8 = r9.charAt(r8)
            r4.append(r8)
            int r7 = r7 + r2
            goto L_0x0011
        L_0x0026:
            java.lang.String r4 = r4.toString()
            f4095a = r4
            java.lang.String r11 = "35619596"
            java.lang.String r12 = "86415006"
            java.lang.String r7 = "35133133"
            java.lang.String r8 = "86576905"
            java.lang.String r9 = "86811305"
            java.lang.String r10 = "86538206"
            java.lang.String r13 = "86953506"
            java.lang.String r14 = "86866106"
            java.lang.String[] r4 = new java.lang.String[]{r7, r8, r9, r10, r11, r12, r13, r14}
            java.security.SecureRandom r5 = new java.security.SecureRandom
            r5.<init>()
            r7 = 8
            int r7 = r5.nextInt(r7)
            r4 = r4[r7]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r4)
            r4 = 0
        L_0x0053:
            r8 = 6
            r9 = 10
            if (r4 >= r8) goto L_0x0061
            int r8 = r5.nextInt(r9)
            r7.append(r8)
            int r4 = r4 + r2
            goto L_0x0053
        L_0x0061:
            java.lang.String r4 = r7.toString()
            r5 = 0
            r8 = 0
            r10 = 0
        L_0x0068:
            r11 = 14
            r12 = 48
            if (r5 >= r11) goto L_0x008a
            int r11 = r5 % 2
            if (r11 != 0) goto L_0x007a
            char r11 = r4.charAt(r5)
            int r11 = r11 + r8
            int r8 = r11 + -48
            goto L_0x0088
        L_0x007a:
            char r11 = r4.charAt(r5)
            int r11 = r11 - r12
            int r11 = r11 * 2
            if (r11 >= r9) goto L_0x0085
            int r10 = r10 + r11
            goto L_0x0088
        L_0x0085:
            int r10 = r10 + r2
            int r10 = r10 + r11
            int r10 = r10 - r9
        L_0x0088:
            int r5 = r5 + r2
            goto L_0x0068
        L_0x008a:
            int r8 = r8 + r10
            int r8 = r8 % r9
            if (r8 != 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            int r4 = 58 - r8
            char r12 = (char) r4
        L_0x0092:
            r7.append(r12)
            java.lang.String r4 = r7.toString()
            b = r4
            boolean r4 = q1.T4.b     // Catch:{ all -> 0x0145 }
            if (r4 == 0) goto L_0x0145
            android.telephony.SubscriptionInfo[] r4 = new android.telephony.SubscriptionInfo[r2]     // Catch:{ all -> 0x0145 }
            sun.misc.Unsafe r5 = q1.C0455x3.f4236a     // Catch:{ all -> 0x0145 }
            java.lang.Class r7 = J.c.c()     // Catch:{ all -> 0x0145 }
            java.lang.Object r5 = r5.allocateInstance(r7)     // Catch:{ all -> 0x0145 }
            android.telephony.SubscriptionInfo r5 = J.c.b(r5)     // Catch:{ all -> 0x0145 }
            java.lang.String r7 = "mDisplayName"
            L0.b r8 = new L0.b     // Catch:{ Exception -> 0x0138 }
            r8.<init>(r7, r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = "mIccId"
            java.lang.String r9 = f4095a     // Catch:{ Exception -> 0x0138 }
            L0.b r10 = new L0.b     // Catch:{ Exception -> 0x0138 }
            r10.<init>(r7, r9)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = "mCarrierName"
            L0.b r11 = new L0.b     // Catch:{ Exception -> 0x0138 }
            r11.<init>(r7, r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = "mNumber"
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x0138 }
            L0.b r12 = new L0.b     // Catch:{ Exception -> 0x0138 }
            r12.<init>(r3, r7)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = "mCountryIso"
            java.lang.String r7 = "826"
            L0.b r13 = new L0.b     // Catch:{ Exception -> 0x0138 }
            r13.<init>(r3, r7)     // Catch:{ Exception -> 0x0138 }
            L0.b[] r3 = new L0.b[r0]     // Catch:{ Exception -> 0x0138 }
            r3[r6] = r8     // Catch:{ Exception -> 0x0138 }
            r3[r2] = r10     // Catch:{ Exception -> 0x0138 }
            r3[r1] = r11     // Catch:{ Exception -> 0x0138 }
            r7 = 3
            r3[r7] = r12     // Catch:{ Exception -> 0x0138 }
            r7 = 4
            r3[r7] = r13     // Catch:{ Exception -> 0x0138 }
            r7 = 0
        L_0x00ed:
            if (r7 >= r0) goto L_0x0105
            r8 = r3[r7]     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r10 = r8.f     // Catch:{ Exception -> 0x0138 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r8 = r8.f586g     // Catch:{ Exception -> 0x0138 }
            q1.g0 r11 = new q1.g0     // Catch:{ Exception -> 0x0138 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r10 = r11.f4098c     // Catch:{ Exception -> 0x0138 }
            q1.C0 r10 = (q1.C0) r10     // Catch:{ Exception -> 0x0138 }
            r10.c(r5, r8)     // Catch:{ Exception -> 0x0138 }
            int r7 = r7 + r2
            goto L_0x00ed
        L_0x0105:
            boolean r0 = q1.T4.f4001g     // Catch:{ Exception -> 0x0138 }
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = "mGroupOwner"
            java.lang.String r3 = ""
            L0.b r7 = new L0.b     // Catch:{ Exception -> 0x0138 }
            r7.<init>(r0, r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r0 = "mCardString"
            L0.b r3 = new L0.b     // Catch:{ Exception -> 0x0138 }
            r3.<init>(r0, r9)     // Catch:{ Exception -> 0x0138 }
            L0.b[] r0 = new L0.b[r1]     // Catch:{ Exception -> 0x0138 }
            r0[r6] = r7     // Catch:{ Exception -> 0x0138 }
            r0[r2] = r3     // Catch:{ Exception -> 0x0138 }
            r3 = 0
        L_0x0120:
            if (r3 >= r1) goto L_0x0138
            r7 = r0[r3]     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r8 = r7.f     // Catch:{ Exception -> 0x0138 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r7 = r7.f586g     // Catch:{ Exception -> 0x0138 }
            q1.g0 r9 = new q1.g0     // Catch:{ Exception -> 0x0138 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r8 = r9.f4098c     // Catch:{ Exception -> 0x0138 }
            q1.C0 r8 = (q1.C0) r8     // Catch:{ Exception -> 0x0138 }
            r8.c(r5, r7)     // Catch:{ Exception -> 0x0138 }
            int r3 = r3 + r2
            goto L_0x0120
        L_0x0138:
            r4[r6] = r5     // Catch:{ all -> 0x0145 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0145 }
            M0.b r1 = new M0.b     // Catch:{ all -> 0x0145 }
            r1.<init>(r4)     // Catch:{ all -> 0x0145 }
            r0.<init>(r1)     // Catch:{ all -> 0x0145 }
            goto L_0x0146
        L_0x0145:
            r0 = 0
        L_0x0146:
            f4096c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.f5.<clinit>():void");
    }
}
