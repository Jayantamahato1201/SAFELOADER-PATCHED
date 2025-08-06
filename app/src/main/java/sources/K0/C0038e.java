package K0;

import E.l;
import android.os.Trace;
import androidx.emoji2.text.j;

/* renamed from: K0.e  reason: case insensitive filesystem */
public final class C0038e implements Runnable {
    public final /* synthetic */ int f;

    public /* synthetic */ C0038e(int i2) {
        this.f = i2;
    }

    public final void run() {
        boolean z2;
        switch (this.f) {
            case 0:
                throw null;
            default:
                try {
                    int i2 = l.f93a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j.f1156j != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        j.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i3 = l.f93a;
                    Trace.endSection();
                    throw th;
                }
        }
    }
}
