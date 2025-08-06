package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class L extends Writer implements AutoCloseable {
    public final String f = "FragmentManager";

    /* renamed from: g  reason: collision with root package name */
    public final StringBuilder f1263g = new StringBuilder(128);

    public final void close() {
        k();
    }

    public final void flush() {
        k();
    }

    public final void k() {
        StringBuilder sb = this.f1263g;
        if (sb.length() > 0) {
            Log.d(this.f, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    public final void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == 10) {
                k();
            } else {
                this.f1263g.append(c2);
            }
        }
    }
}
