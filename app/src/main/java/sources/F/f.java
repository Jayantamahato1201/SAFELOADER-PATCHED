package F;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final d f196a = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:94:0x01df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static F.l a(android.content.Context r19, F.g r20) {
        /*
            r0 = r19
            r1 = r20
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object r4 = r1.b
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            android.content.pm.ProviderInfo r6 = r2.resolveContentProvider(r4, r5)
            if (r6 == 0) goto L_0x0202
            java.lang.String r7 = r6.packageName
            java.lang.Object r8 = r1.f198c
            java.lang.String r8 = (java.lang.String) r8
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x01e6
            java.lang.String r4 = r6.packageName
            r7 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r4, r7)
            android.content.pm.Signature[] r2 = r2.signatures
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r7 = r2.length
            r8 = 0
        L_0x0034:
            if (r8 >= r7) goto L_0x0042
            r9 = r2[r8]
            byte[] r9 = r9.toByteArray()
            r4.add(r9)
            int r8 = r8 + 1
            goto L_0x0034
        L_0x0042:
            F.d r2 = f196a
            java.util.Collections.sort(r4, r2)
            java.lang.Object r7 = r1.f
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            java.util.List r7 = z.C0503b.k(r3, r5)
        L_0x0052:
            r3 = 0
        L_0x0053:
            int r8 = r7.size()
            r9 = 0
            if (r3 >= r8) goto L_0x0092
            java.util.ArrayList r8 = new java.util.ArrayList
            java.lang.Object r10 = r7.get(r3)
            java.util.Collection r10 = (java.util.Collection) r10
            r8.<init>(r10)
            java.util.Collections.sort(r8, r2)
            int r10 = r4.size()
            int r11 = r8.size()
            if (r10 == r11) goto L_0x0073
            goto L_0x008c
        L_0x0073:
            r10 = 0
        L_0x0074:
            int r11 = r4.size()
            if (r10 >= r11) goto L_0x0093
            java.lang.Object r11 = r4.get(r10)
            byte[] r11 = (byte[]) r11
            java.lang.Object r12 = r8.get(r10)
            byte[] r12 = (byte[]) r12
            boolean r11 = java.util.Arrays.equals(r11, r12)
            if (r11 != 0) goto L_0x008f
        L_0x008c:
            int r3 = r3 + 1
            goto L_0x0053
        L_0x008f:
            int r10 = r10 + 1
            goto L_0x0074
        L_0x0092:
            r6 = r9
        L_0x0093:
            r2 = 1
            if (r6 != 0) goto L_0x009c
            F.l r0 = new F.l
            r0.<init>((int) r2, (F.m[]) r9)
            return r0
        L_0x009c:
            java.lang.String r3 = r6.authority
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            java.lang.String r7 = "content"
            android.net.Uri$Builder r6 = r6.scheme(r7)
            android.net.Uri$Builder r6 = r6.authority(r3)
            android.net.Uri r11 = r6.build()
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            android.net.Uri$Builder r6 = r6.scheme(r7)
            android.net.Uri$Builder r3 = r6.authority(r3)
            java.lang.String r6 = "file"
            android.net.Uri$Builder r3 = r3.appendPath(r6)
            android.net.Uri r3 = r3.build()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 24
            if (r6 >= r7) goto L_0x00da
            F.e r6 = new F.e
            r7 = 0
            r6.<init>(r0, r11, r7)
            goto L_0x00e0
        L_0x00da:
            F.e r6 = new F.e
            r7 = 1
            r6.<init>(r0, r11, r7)
        L_0x00e0:
            java.lang.String r12 = "_id"
            java.lang.String r13 = "file_id"
            java.lang.String r14 = "font_ttc_index"
            java.lang.String r15 = "font_variation_settings"
            java.lang.String r16 = "font_weight"
            java.lang.String r17 = "font_italic"
            java.lang.String r18 = "result_code"
            java.lang.String[] r12 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18}     // Catch:{ all -> 0x0173 }
            java.lang.Object r0 = r1.f199d     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0173 }
            java.lang.String[] r14 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0173 }
            int r0 = r6.f195a     // Catch:{ all -> 0x0173 }
            switch(r0) {
                case 0: goto L_0x0119;
                default: goto L_0x00ff;
            }     // Catch:{ all -> 0x0173 }
        L_0x00ff:
            java.lang.String r13 = "query = ?"
            r1 = 0
            android.content.ContentProviderClient r10 = r6.b     // Catch:{ all -> 0x0173 }
            if (r10 != 0) goto L_0x0107
            goto L_0x0117
        L_0x0107:
            r15 = 0
            r16 = 0
            android.database.Cursor r1 = r10.query(r11, r12, r13, r14, r15, r16)     // Catch:{ RemoteException -> 0x010f }
            goto L_0x0117
        L_0x010f:
            r0 = move-exception
            java.lang.String r7 = "FontsProvider"
            java.lang.String r8 = "Unable to query the content provider"
            android.util.Log.w(r7, r8, r0)     // Catch:{ all -> 0x0173 }
        L_0x0117:
            r9 = r1
            goto L_0x0132
        L_0x0119:
            java.lang.String r13 = "query = ?"
            r1 = 0
            android.content.ContentProviderClient r10 = r6.b     // Catch:{ all -> 0x0173 }
            if (r10 != 0) goto L_0x0121
            goto L_0x0117
        L_0x0121:
            r15 = 0
            r16 = 0
            android.database.Cursor r1 = r10.query(r11, r12, r13, r14, r15, r16)     // Catch:{ RemoteException -> 0x0129 }
            goto L_0x0117
        L_0x0129:
            r0 = move-exception
            java.lang.String r7 = "FontsProvider"
            java.lang.String r8 = "Unable to query the content provider"
            android.util.Log.w(r7, r8, r0)     // Catch:{ all -> 0x0173 }
            goto L_0x0117
        L_0x0132:
            if (r9 == 0) goto L_0x01c4
            int r0 = r9.getCount()     // Catch:{ all -> 0x0173 }
            if (r0 <= 0) goto L_0x01c4
            java.lang.String r0 = "result_code"
            int r0 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0173 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0173 }
            r4.<init>()     // Catch:{ all -> 0x0173 }
            java.lang.String r1 = "_id"
            int r1 = r9.getColumnIndex(r1)     // Catch:{ all -> 0x0173 }
            java.lang.String r7 = "file_id"
            int r7 = r9.getColumnIndex(r7)     // Catch:{ all -> 0x0173 }
            java.lang.String r8 = "font_ttc_index"
            int r8 = r9.getColumnIndex(r8)     // Catch:{ all -> 0x0173 }
            java.lang.String r10 = "font_weight"
            int r10 = r9.getColumnIndex(r10)     // Catch:{ all -> 0x0173 }
            java.lang.String r12 = "font_italic"
            int r12 = r9.getColumnIndex(r12)     // Catch:{ all -> 0x0173 }
        L_0x0163:
            boolean r13 = r9.moveToNext()     // Catch:{ all -> 0x0173 }
            if (r13 == 0) goto L_0x01c4
            r13 = -1
            if (r0 == r13) goto L_0x0178
            int r14 = r9.getInt(r0)     // Catch:{ all -> 0x0173 }
            r18 = r14
            goto L_0x017a
        L_0x0173:
            r0 = move-exception
            r19 = r6
            goto L_0x01dd
        L_0x0178:
            r18 = 0
        L_0x017a:
            if (r8 == r13) goto L_0x0182
            int r14 = r9.getInt(r8)     // Catch:{ all -> 0x0173 }
            r15 = r14
            goto L_0x0183
        L_0x0182:
            r15 = 0
        L_0x0183:
            if (r7 != r13) goto L_0x0193
            r19 = r6
            long r5 = r9.getLong(r1)     // Catch:{ all -> 0x0191 }
            android.net.Uri r5 = android.content.ContentUris.withAppendedId(r11, r5)     // Catch:{ all -> 0x0191 }
        L_0x018f:
            r14 = r5
            goto L_0x019e
        L_0x0191:
            r0 = move-exception
            goto L_0x01dd
        L_0x0193:
            r19 = r6
            long r5 = r9.getLong(r7)     // Catch:{ all -> 0x0191 }
            android.net.Uri r5 = android.content.ContentUris.withAppendedId(r3, r5)     // Catch:{ all -> 0x0191 }
            goto L_0x018f
        L_0x019e:
            if (r10 == r13) goto L_0x01a7
            int r5 = r9.getInt(r10)     // Catch:{ all -> 0x0191 }
            r16 = r5
            goto L_0x01ab
        L_0x01a7:
            r5 = 400(0x190, float:5.6E-43)
            r16 = 400(0x190, float:5.6E-43)
        L_0x01ab:
            if (r12 == r13) goto L_0x01b6
            int r5 = r9.getInt(r12)     // Catch:{ all -> 0x0191 }
            if (r5 != r2) goto L_0x01b6
            r17 = 1
            goto L_0x01b8
        L_0x01b6:
            r17 = 0
        L_0x01b8:
            F.m r13 = new F.m     // Catch:{ all -> 0x0191 }
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0191 }
            r4.add(r13)     // Catch:{ all -> 0x0191 }
            r5 = 0
            r6 = r19
            goto L_0x0163
        L_0x01c4:
            r19 = r6
            if (r9 == 0) goto L_0x01cb
            r9.close()
        L_0x01cb:
            r19.a()
            r1 = 0
            F.m[] r0 = new F.m[r1]
            java.lang.Object[] r0 = r4.toArray(r0)
            F.m[] r0 = (F.m[]) r0
            F.l r2 = new F.l
            r2.<init>((int) r1, (F.m[]) r0)
            return r2
        L_0x01dd:
            if (r9 == 0) goto L_0x01e2
            r9.close()
        L_0x01e2:
            r19.a()
            throw r0
        L_0x01e6:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Found content provider "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ", but package was not "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0202:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No package found for authority: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F.f.a(android.content.Context, F.g):F.l");
    }
}
