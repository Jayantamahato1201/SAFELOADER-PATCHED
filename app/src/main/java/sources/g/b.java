package G;

import android.text.SpannableStringBuilder;

public final class b {
    public static final String b = Character.toString(8206);

    /* renamed from: c  reason: collision with root package name */
    public static final String f237c = Character.toString(8207);

    /* renamed from: d  reason: collision with root package name */
    public static final b f238d = new b(false);

    /* renamed from: e  reason: collision with root package name */
    public static final b f239e = new b(true);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f240a;

    static {
        j jVar = k.f248c;
    }

    public b(boolean z2) {
        j jVar = k.f247a;
        this.f240a = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0085, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            G.a r0 = new G.a
            r0.<init>(r9)
            r9 = 0
            r0.f235c = r9
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000b:
            int r4 = r0.f235c
            int r5 = r0.b
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L_0x006e
            if (r1 != 0) goto L_0x006e
            java.lang.CharSequence r5 = r0.f234a
            char r4 = r5.charAt(r4)
            r0.f236d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L_0x0037
            int r4 = r0.f235c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f235c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f235c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L_0x004b
        L_0x0037:
            int r4 = r0.f235c
            int r4 = r4 + r6
            r0.f235c = r4
            char r4 = r0.f236d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L_0x0047
            byte[] r5 = G.a.f233e
            byte r4 = r5[r4]
            goto L_0x004b
        L_0x0047:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L_0x004b:
            if (r4 == 0) goto L_0x0069
            if (r4 == r6) goto L_0x0066
            r5 = 2
            if (r4 == r5) goto L_0x0066
            r5 = 9
            if (r4 == r5) goto L_0x000b
            switch(r4) {
                case 14: goto L_0x0062;
                case 15: goto L_0x0062;
                case 16: goto L_0x005e;
                case 17: goto L_0x005e;
                case 18: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x006c
        L_0x005a:
            int r3 = r3 + -1
            r2 = 0
            goto L_0x000b
        L_0x005e:
            int r3 = r3 + 1
            r2 = 1
            goto L_0x000b
        L_0x0062:
            int r3 = r3 + 1
            r2 = -1
            goto L_0x000b
        L_0x0066:
            if (r3 != 0) goto L_0x006c
            goto L_0x0085
        L_0x0069:
            if (r3 != 0) goto L_0x006c
            goto L_0x008b
        L_0x006c:
            r1 = r3
            goto L_0x000b
        L_0x006e:
            if (r1 != 0) goto L_0x0071
            goto L_0x008c
        L_0x0071:
            if (r2 == 0) goto L_0x0074
            return r2
        L_0x0074:
            int r2 = r0.f235c
            if (r2 <= 0) goto L_0x008c
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L_0x0089;
                case 15: goto L_0x0089;
                case 16: goto L_0x0083;
                case 17: goto L_0x0083;
                case 18: goto L_0x0080;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0074
        L_0x0080:
            int r3 = r3 + 1
            goto L_0x0074
        L_0x0083:
            if (r1 != r3) goto L_0x0086
        L_0x0085:
            return r6
        L_0x0086:
            int r3 = r3 + -1
            goto L_0x0074
        L_0x0089:
            if (r1 != r3) goto L_0x0086
        L_0x008b:
            return r7
        L_0x008c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: G.b.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r1 = r1 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            G.a r0 = new G.a
            r0.<init>(r6)
            int r6 = r0.b
            r0.f235c = r6
            r6 = 0
            r1 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.f235c
            if (r3 <= 0) goto L_0x0040
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0038
            r4 = 1
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002f;
                case 15: goto L_0x002f;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r2 != 0) goto L_0x000c
            goto L_0x003e
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0029:
            if (r2 != r1) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            int r1 = r1 + -1
            goto L_0x000c
        L_0x002f:
            if (r2 != r1) goto L_0x002c
            goto L_0x003a
        L_0x0032:
            if (r1 != 0) goto L_0x0035
        L_0x0034:
            return r4
        L_0x0035:
            if (r2 != 0) goto L_0x000c
            goto L_0x003e
        L_0x0038:
            if (r1 != 0) goto L_0x003c
        L_0x003a:
            r6 = -1
            return r6
        L_0x003c:
            if (r2 != 0) goto L_0x000c
        L_0x003e:
            r2 = r1
            goto L_0x000c
        L_0x0040:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: G.b.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        j jVar;
        String str;
        j jVar2;
        char c2;
        j jVar3 = k.f248c;
        if (charSequence == null) {
            return null;
        }
        boolean b2 = jVar3.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (b2) {
            jVar = k.b;
        } else {
            jVar = k.f247a;
        }
        boolean b3 = jVar.b(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f237c;
        String str4 = b;
        boolean z2 = this.f240a;
        if (!z2 && (b3 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z2 || (b3 && a(charSequence) != -1)) {
            str = str2;
        } else {
            str = str3;
        }
        spannableStringBuilder.append(str);
        if (b2 != z2) {
            if (b2) {
                c2 = 8235;
            } else {
                c2 = 8234;
            }
            spannableStringBuilder.append(c2);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b2) {
            jVar2 = k.b;
        } else {
            jVar2 = k.f247a;
        }
        boolean b4 = jVar2.b(charSequence, charSequence.length());
        if (!z2 && (b4 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z2 && (!b4 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }
}
