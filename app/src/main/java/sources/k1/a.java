package k1;

import java.io.File;
import java.io.IOException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3630a = new Object();

    public final void a(File file) {
        if (!file.delete() && file.exists()) {
            throw new IOException("failed to delete " + file);
        }
    }

    public final void b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File file2 = listFiles[i2];
                if (file2.isDirectory()) {
                    b(file2);
                }
                if (file2.delete()) {
                    i2++;
                } else {
                    throw new IOException("failed to delete " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public final void c(File file, File file2) {
        a(file2);
        if (!file.renameTo(file2)) {
            throw new IOException("failed to rename " + file + " to " + file2);
        }
    }
}
