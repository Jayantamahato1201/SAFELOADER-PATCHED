package q1;

import T0.l;
import java.io.File;

public abstract class S1 {

    /* renamed from: a  reason: collision with root package name */
    public static final l f3986a;

    static {
        C0326c cVar;
        if (T4.f4000e) {
            cVar = new C0326c(10);
        } else {
            cVar = new C0326c(11);
        }
        f3986a = cVar;
    }

    public static boolean a(File file) {
        try {
            if (!file.exists()) {
                return true;
            }
            if (!file.isDirectory()) {
                return file.delete();
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.isFile()) {
                            if (!file2.delete()) {
                                file2.toString();
                                return false;
                            }
                        } else if (!file2.isDirectory()) {
                            file2.toString();
                            file2.delete();
                        } else if (!((Boolean) f3986a.e(file2)).booleanValue()) {
                            file2.toString();
                            return false;
                        }
                    }
                }
            }
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void b(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            if (file2.isFile()) {
                                file2.delete();
                            } else {
                                a(file2);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
