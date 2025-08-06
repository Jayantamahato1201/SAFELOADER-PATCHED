package q1;

import F.c;
import Q0.h;
import T0.l;
import android.system.Os;
import java.io.File;

public abstract class U3 {

    /* renamed from: a  reason: collision with root package name */
    public static final File f4017a = C0394n1.f4143a.getDir("data_anon", 0);

    public static void a(String str, String str2) {
        File file;
        File file2 = f4017a;
        if (str2 == null || str2.length() == 0) {
            file = H.d(file2, str);
        } else {
            file = H.d(file2, str, str2);
        }
        if (file.exists()) {
            c cVar = new c(file);
            l lVar = S1.f3986a;
            h hVar = new h(cVar);
            while (hVar.hasNext()) {
                try {
                    Os.chmod(((File) hVar.next()).getAbsolutePath(), 493);
                } catch (Exception unused) {
                }
            }
            S1.a(file);
        }
    }
}
