package q1;

import T0.l;
import android.os.Process;
import android.system.Os;
import b1.i;
import java.io.File;

public abstract class F3 {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f3882a;
    public static final File b = C0394n1.f4143a.getDir("interior", 0);

    static {
        boolean z2;
        try {
            if (T4.b) {
                z2 = Process.is64Bit();
            } else {
                z2 = ((Boolean) J3.f3926e.b(J3.f3923a, new Object[0])).booleanValue();
            }
        } catch (Throwable unused) {
            z2 = true;
        }
        f3882a = z2;
    }

    public static File a(String str) {
        File file = new File(C0394n1.f4143a.getCodeCacheDir(), str);
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            File[] listFiles = new File(b, str).listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isFile() && i.f0(file2.getName(), ".apk")) {
                        file2.renameTo(new File(file, file2.getName()));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return file;
    }

    public static File b(boolean z2) {
        File file = new File(C0394n1.f4143a.getCodeCacheDir(), "apks");
        if (z2) {
            file.mkdirs();
        }
        return file;
    }

    public static File c(String str) {
        String str2;
        File d2 = H.d(b, str, "lib");
        d2.mkdirs();
        if (f3882a) {
            str2 = "arm64";
        } else {
            str2 = "arm";
        }
        File file = new File(d2, str2);
        if (file.exists()) {
            return file;
        }
        l lVar = S1.f3986a;
        try {
            Os.symlink(d2.getAbsolutePath(), file.getAbsolutePath());
            return file;
        } catch (Exception unused) {
            return d2;
        }
    }
}
