package G;

import android.app.NotificationChannel;
import android.content.pm.SharedLibraryInfo;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof NotificationChannel;
    }

    public static /* bridge */ /* synthetic */ NotificationChannel b(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* bridge */ /* synthetic */ SharedLibraryInfo c(Object obj) {
        return (SharedLibraryInfo) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return SharedLibraryInfo.class;
    }

    public static /* bridge */ /* synthetic */ boolean y(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
