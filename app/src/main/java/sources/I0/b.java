package i0;

import A.g;
import E0.e;
import android.os.Build;
import com.cheatbox.LoginActivity;
import java.io.File;
import java.lang.Thread;
import java.util.Locale;
import p1.a;
import q.h;

public final class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: c  reason: collision with root package name */
    public static final String f2978c = new e(26).toString();

    /* renamed from: d  reason: collision with root package name */
    public static final String f2979d = a.a(47561024728806354L).concat(new e(27).toString());

    /* renamed from: a  reason: collision with root package name */
    public final LoginActivity f2980a;
    public final Thread.UncaughtExceptionHandler b = Thread.getDefaultUncaughtExceptionHandler();

    public b(LoginActivity loginActivity) {
        this.f2980a = loginActivity;
    }

    public static String a() {
        String str;
        String str2;
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            String a2 = a.a(47561329671484370L);
            StringBuilder sb = new StringBuilder();
            if (strArr.length > 0) {
                sb.append(strArr[0]);
                for (int i2 = 1; i2 < strArr.length; i2++) {
                    sb.append(a2);
                    sb.append(strArr[i2]);
                }
            }
            str = sb.toString();
        } else {
            str = a.a(47561316786582482L);
        }
        String d2 = d(a.a(47561282426844114L), a.a(47561230887236562L));
        String d3 = d(a.a(47561213707367378L), a.a(47561162167759826L));
        if (d2.equals(a.a(47561144987890642L))) {
            d2 = Build.HARDWARE;
        }
        StringBuilder a3 = h.a(d2);
        a3.append(a.a(47561127808021458L));
        a3.append(str);
        if (d3.equals(a.a(47561089153315794L))) {
            str2 = a.a(47561071973446610L);
        } else {
            str2 = a.a(47561067678479314L).concat(d3);
        }
        a3.append(str2);
        return a3.toString();
    }

    public static String b() {
        String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.getDefault());
        Build.BRAND.toLowerCase(Locale.getDefault());
        String d2 = d(a.a(47566861589361618L), a.a(47566758510146514L));
        String d3 = d(a.a(47566741330277330L), a.a(47566638251062226L));
        String d4 = d(a.a(47566621071193042L), a.a(47566496517141458L));
        String d5 = d(a.a(47566479337272274L), a.a(47566376258057170L));
        String d6 = d(a.a(47566359078187986L), a.a(47566247409038290L));
        String d7 = d(a.a(47566230229169106L), a.a(47566131444921298L));
        String d8 = d(a.a(47566114265052114L), a.a(47566032660673490L));
        String d9 = d(a.a(47566015480804306L), a.a(47565925286491090L));
        String d10 = d(a.a(47565908106621906L), a.a(47565809322374098L));
        String d11 = d(a.a(47565792142504914L), a.a(47565727717995474L));
        String d12 = d(a.a(47565710538126290L), a.a(47565641818649554L));
        String d13 = d(a.a(47565624638780370L), a.a(47565543034401746L));
        String d14 = d(a.a(47565525854532562L), a.a(47565444250153938L));
        String d15 = d(a.a(47565427070284754L), a.a(47565332581004242L));
        String str = lowerCase;
        String d16 = d(a.a(47565315401135058L), a.a(47565208026952658L));
        String str2 = d15;
        String d17 = d(a.a(47565190847083474L), a.a(47565109242704850L));
        String d18 = d(a.a(47565092062835666L), a.a(47565014753424338L));
        if (!d2.equals(a.a(47564997573555154L))) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.a(47564980393685970L));
            sb.append(d2);
            sb.append(a.a(47564954623882194L));
            sb.append(d3);
            sb.append(a.a(47564915969176530L));
            sb.append(d4);
            return g.g(47564873019503570L, sb);
        } else if (!d5.equals(a.a(47564864429568978L))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.a(47564847249699794L));
            sb2.append(d5);
            return g.g(47564804300026834L, sb2);
        } else if (!d6.equals(a.a(47564757055386578L))) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a.a(47564739875517394L));
            sb3.append(d6);
            return g.g(47564688335909842L, sb3);
        } else if (!d7.equals(a.a(47564615321465810L))) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a.a(47564598141596626L));
            sb4.append(d7);
            return g.g(47564559486890962L, sb4);
        } else if (!d9.equals(a.a(47564495062381522L))) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(a.a(47564477882512338L));
            sb5.append(d9);
            return g.g(47564434932839378L, sb5);
        } else if (!d8.equals(a.a(47564391983166418L))) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(a.a(47564374803297234L));
            sb6.append(d8);
            return g.g(47564323263689682L, sb6);
        } else if (!d16.equals(a.a(47564288903951314L))) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(a.a(47564271724082130L));
            sb7.append(d16);
            return g.g(47564228774409170L, sb7);
        } else if (!d10.equals(a.a(47564194414670802L))) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(a.a(47564177234801618L));
            sb8.append(d10);
            return g.g(47564147170030546L, sb8);
        } else if (!d11.equals(a.a(47564099925390290L))) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(a.a(47564082745521106L));
            sb9.append(d11);
            return g.g(47564061270684626L, sb9);
        } else if (!d12.equals(a.a(47564014026044370L))) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(a.a(47563996846175186L));
            sb10.append(d12);
            return g.g(47563971076371410L, sb10);
        } else if (!d13.equals(a.a(47563932421665746L))) {
            StringBuilder sb11 = new StringBuilder();
            sb11.append(a.a(47563915241796562L));
            sb11.append(d13);
            return g.g(47563885177025490L, sb11);
        } else if (!d14.equals(a.a(47563850817287122L))) {
            StringBuilder sb12 = new StringBuilder();
            sb12.append(a.a(47563833637417938L));
            sb12.append(d14);
            return g.g(47563786392777682L, sb12);
        } else {
            String str3 = str2;
            if (!str3.equals(a.a(47563752033039314L))) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(a.a(47563734853170130L));
                sb13.append(str3);
                return g.g(47563687608529874L, sb13);
            }
            String str4 = d17;
            if (!str4.equals(a.a(47563640363889618L))) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(a.a(47563623184020434L));
                sb14.append(str4);
                return g.g(47563584529314770L, sb14);
            } else if (!d18.equals(a.a(47563545874609106L))) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(a.a(47563528694739922L));
                sb15.append(d18);
                return g.g(47563490040034258L, sb15);
            } else {
                String str5 = str;
                if (str5.contains(a.a(47563451385328594L))) {
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append(a.a(47563417025590226L));
                    sb16.append(d(a.a(47563279586636754L), a.a(47563180802388946L)));
                    return g.g(47563163622519762L, sb16);
                } else if (str5.contains(a.a(47563155032585170L))) {
                    return a.a(47563120672846802L);
                } else {
                    if (str5.contains(a.a(47563030478533586L))) {
                        return a.a(47563004708729810L);
                    }
                    if (str5.contains(a.a(47562918809383890L))) {
                        return a.a(47562897334547410L);
                    }
                    if (str5.contains(a.a(47562815730168786L))) {
                        return a.a(47562785665397714L);
                    }
                    if (str5.contains(a.a(47562695471084498L))) {
                        return a.a(47562673996248018L);
                    }
                    if (str5.contains(a.a(47562588096902098L))) {
                        return a.a(47562566622065618L);
                    }
                    if (str5.contains(a.a(47562463542850514L))) {
                        return a.a(47562442068014034L);
                    }
                    if (str5.contains(a.a(47562283154224082L))) {
                        return a.a(47562253089453010L);
                    }
                    if (str5.contains(a.a(47562145715270610L))) {
                        return a.a(47562111355532242L);
                    }
                    if (str5.contains(a.a(47561999686382546L))) {
                        return a.a(47561978211546066L);
                    }
                    if (str5.contains(a.a(47561883722265554L))) {
                        return a.a(47561857952461778L);
                    }
                    if (str5.contains(a.a(47561759168213970L))) {
                        return a.a(47561733398410194L);
                    }
                    return a.a(47561634614162386L);
                }
            }
        }
    }

    public static int c(File file, String str) {
        File[] listFiles = file.listFiles();
        int i2 = 0;
        if (listFiles != null) {
            int length = listFiles.length;
            int i3 = 0;
            while (i2 < length) {
                File file2 = listFiles[i2];
                String name = file2.getName();
                if (name.startsWith(a.a(47567647568376786L) + str)) {
                    String[] split = file2.getName().replaceAll(a.a(47567600323736530L), a.a(47567570258965458L)).trim().split(a.a(47567561669030866L));
                    try {
                        i3 = Math.max(i3, Integer.parseInt(split[split.length - 1]));
                    } catch (NumberFormatException unused) {
                    }
                }
                i2++;
            }
            i2 = i3;
        }
        return i2 + 1;
    }

    public static String d(String str, String str2) {
        try {
            String str3 = (String) Class.forName(a.a(47561467110437842L)).getDeclaredMethod(a.a(47561346851353554L), new Class[]{String.class}).invoke((Object) null, new Object[]{str});
            if (str3 == null || str3.isEmpty()) {
                return str2;
            }
            return str3;
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r18, java.lang.Throwable r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = 0
            r3 = 1
            com.cheatbox.LoginActivity r4 = r0.f2980a
            r5 = 0
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0043 }
            java.io.File r7 = r4.getFilesDir()     // Catch:{ Exception -> 0x0043 }
            r8 = 47567669043213266(0xa8fe8b001d33d2, double:1.7796538370217062E-305)
            java.lang.String r8 = p1.a.a(r8)     // Catch:{ Exception -> 0x0043 }
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0043 }
            boolean r7 = r6.exists()     // Catch:{ Exception -> 0x0043 }
            if (r7 != 0) goto L_0x0022
            goto L_0x0048
        L_0x0022:
            java.io.File[] r6 = r6.listFiles()     // Catch:{ Exception -> 0x0043 }
            if (r6 == 0) goto L_0x0048
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0043 }
            int r9 = r6.length     // Catch:{ Exception -> 0x0043 }
            r10 = 0
        L_0x002e:
            if (r10 >= r9) goto L_0x0048
            r11 = r6[r10]     // Catch:{ Exception -> 0x0043 }
            long r12 = r11.lastModified()     // Catch:{ Exception -> 0x0043 }
            long r12 = r7 - r12
            r14 = 604800000(0x240c8400, double:2.988109026E-315)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x0046
            r11.delete()     // Catch:{ Exception -> 0x0043 }
            goto L_0x0046
        L_0x0043:
            goto L_0x01ce
        L_0x0046:
            int r10 = r10 + r3
            goto L_0x002e
        L_0x0048:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0043 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ Exception -> 0x0043 }
            r7 = 47568618230985682(0xa8ff68001d33d2, double:1.7798939450894455E-305)
            java.lang.String r7 = p1.a.a(r7)     // Catch:{ Exception -> 0x0043 }
            r6.<init>(r4, r7)     // Catch:{ Exception -> 0x0043 }
            boolean r4 = r6.exists()     // Catch:{ Exception -> 0x0043 }
            if (r4 != 0) goto L_0x0068
            boolean r4 = r6.mkdirs()     // Catch:{ Exception -> 0x0043 }
            if (r4 != 0) goto L_0x0068
            goto L_0x01ce
        L_0x0068:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0043 }
            r7 = 47568596756149202(0xa8ff63001d33d2, double:1.7798885127802206E-305)
            java.lang.String r7 = p1.a.a(r7)     // Catch:{ Exception -> 0x0043 }
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0043 }
            r4.<init>(r7, r8)     // Catch:{ Exception -> 0x0043 }
            java.util.Date r7 = new java.util.Date     // Catch:{ Exception -> 0x0043 }
            r7.<init>()     // Catch:{ Exception -> 0x0043 }
            java.lang.String r4 = r4.format(r7)     // Catch:{ Exception -> 0x0043 }
            int r7 = c(r6, r4)     // Catch:{ Exception -> 0x0043 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0043 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0043 }
            r9.<init>()     // Catch:{ Exception -> 0x0043 }
            r10 = 47568545216541650(0xa8ff57001d33d2, double:1.779875475238081E-305)
            java.lang.String r10 = p1.a.a(r10)     // Catch:{ Exception -> 0x0043 }
            r9.append(r10)     // Catch:{ Exception -> 0x0043 }
            r9.append(r4)     // Catch:{ Exception -> 0x0043 }
            r10 = 47568497971901394(0xa8ff4c001d33d2, double:1.7798635241577862E-305)
            java.lang.String r4 = p1.a.a(r10)     // Catch:{ Exception -> 0x0043 }
            r9.append(r4)     // Catch:{ Exception -> 0x0043 }
            r9.append(r7)     // Catch:{ Exception -> 0x0043 }
            r10 = 47568489381966802(0xa8ff4a001d33d2, double:1.7798613512340963E-305)
            java.lang.String r4 = p1.a.a(r10)     // Catch:{ Exception -> 0x0043 }
            r9.append(r4)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x0043 }
            r8.<init>(r6, r4)     // Catch:{ Exception -> 0x0043 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0043 }
            r4.<init>(r8, r3)     // Catch:{ Exception -> 0x0043 }
            java.io.PrintWriter r6 = new java.io.PrintWriter     // Catch:{ Exception -> 0x0043 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x0043 }
            r9 = 47568467907130322(0xa8ff45001d33d2, double:1.7798559189248714E-305)
            java.lang.String r7 = p1.a.a(r9)     // Catch:{ Exception -> 0x0043 }
            r6.println(r7)     // Catch:{ Exception -> 0x0043 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0043 }
            r7.<init>()     // Catch:{ Exception -> 0x0043 }
            r9 = 47568326173209554(0xa8ff24001d33d2, double:1.7798200656839872E-305)
            java.lang.String r9 = p1.a.a(r9)     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0043 }
            r10 = 47568283223536594(0xa8ff1a001d33d2, double:1.7798092010655375E-305)
            java.lang.String r10 = p1.a.a(r10)     // Catch:{ Exception -> 0x0043 }
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0043 }
            r9.<init>(r10, r11)     // Catch:{ Exception -> 0x0043 }
            java.util.Date r10 = new java.util.Date     // Catch:{ Exception -> 0x0043 }
            r10.<init>()     // Catch:{ Exception -> 0x0043 }
            java.lang.String r9 = r9.format(r10)     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0043 }
            r6.println(r7)     // Catch:{ Exception -> 0x0043 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0043 }
            r7.<init>()     // Catch:{ Exception -> 0x0043 }
            r9 = 47568197324190674(0xa8ff06001d33d2, double:1.779787471828638E-305)
            java.lang.String r9 = p1.a.a(r9)     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            r9 = 47568145784583122(0xa8fefa001d33d2, double:1.7797744342864983E-305)
            java.lang.String r9 = p1.a.a(r9)     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r9 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            r9 = 47568132899681234(0xa8fef7001d33d2, double:1.7797711749009634E-305)
            java.lang.String r9 = p1.a.a(r9)     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0043 }
            r6.println(r7)     // Catch:{ Exception -> 0x0043 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0043 }
            r7.<init>()     // Catch:{ Exception -> 0x0043 }
            r9 = 47568124309746642(0xa8fef5001d33d2, double:1.7797690019772735E-305)
            java.lang.String r9 = p1.a.a(r9)     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0043 }
            r6.println(r7)     // Catch:{ Exception -> 0x0043 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0043 }
            r7.<init>()     // Catch:{ Exception -> 0x0043 }
            r9 = 47568055590269906(0xa8fee5001d33d2, double:1.7797516185877539E-305)
            java.lang.String r9 = p1.a.a(r9)     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r9 = a()     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0043 }
            r6.println(r7)     // Catch:{ Exception -> 0x0043 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0043 }
            r7.<init>()     // Catch:{ Exception -> 0x0043 }
            r9 = 47568016935564242(0xa8fedc001d33d2, double:1.779741840431149E-305)
            java.lang.String r9 = p1.a.a(r9)     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r9 = b()     // Catch:{ Exception -> 0x0043 }
            r7.append(r9)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0043 }
            r6.println(r7)     // Catch:{ Exception -> 0x0043 }
            r9 = 47567956806022098(0xa8fece001d33d2, double:1.7797266299653195E-305)
            java.lang.String r7 = p1.a.a(r9)     // Catch:{ Exception -> 0x0043 }
            r6.println(r7)     // Catch:{ Exception -> 0x0043 }
            r9 = 47567862316741586(0xa8feb8001d33d2, double:1.77970272780473E-305)
            java.lang.String r7 = p1.a.a(r9)     // Catch:{ Exception -> 0x0043 }
            r6.println(r7)     // Catch:{ Exception -> 0x0043 }
            r1.printStackTrace(r6)     // Catch:{ Exception -> 0x0043 }
            r9 = 47567776417395666(0xa8fea4001d33d2, double:1.7796809985678305E-305)
            java.lang.String r7 = p1.a.a(r9)     // Catch:{ Exception -> 0x0043 }
            r6.println(r7)     // Catch:{ Exception -> 0x0043 }
            r6.close()     // Catch:{ Exception -> 0x0043 }
            r4.close()     // Catch:{ Exception -> 0x0043 }
            r5 = r8
        L_0x01ce:
            if (r5 == 0) goto L_0x01e2
            boolean r4 = r5.exists()
            if (r4 == 0) goto L_0x01e2
            i0.a r4 = new i0.a
            r4.<init>()
            java.io.File[] r3 = new java.io.File[r3]
            r3[r2] = r5
            r4.execute(r3)
        L_0x01e2:
            r2 = 3000(0xbb8, double:1.482E-320)
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x01e8 }
            goto L_0x01e9
        L_0x01e8:
        L_0x01e9:
            java.lang.Thread$UncaughtExceptionHandler r2 = r0.b
            if (r2 == 0) goto L_0x01f2
            r3 = r18
            r2.uncaughtException(r3, r1)
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
