package y;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: y.a  reason: case insensitive filesystem */
public abstract class C0498a {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i2) {
        return context.getDrawable(i2);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
