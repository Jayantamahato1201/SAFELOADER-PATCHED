package androidx.profileinstaller;

import E0.e;
import Z.g;
import Z.j;
import android.content.Context;
import android.os.Build;
import d0.b;
import java.util.Collections;
import java.util.List;

public class ProfileInstallerInitializer implements b {
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new e(13);
        }
        j.a(new g(this, 0, context.getApplicationContext()));
        return new e(13);
    }
}
