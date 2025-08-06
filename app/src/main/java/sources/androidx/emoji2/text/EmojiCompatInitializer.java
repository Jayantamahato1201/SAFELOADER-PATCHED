package androidx.emoji2.text;

import A.j;
import K0.C0038e;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0062d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import d0.C0107a;
import d0.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EmojiCompatInitializer implements b {
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.emoji2.text.g, androidx.emoji2.text.p] */
    public final Object b(Context context) {
        ? gVar = new g((i) new j(context, 13));
        gVar.f1153a = 1;
        if (j.f1156j == null) {
            synchronized (j.f1155i) {
                try {
                    if (j.f1156j == null) {
                        j.f1156j = new j(gVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        C0107a c2 = C0107a.c(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        c2.getClass();
        synchronized (C0107a.f2218e) {
            try {
                obj = c2.f2219a.get(cls);
                if (obj == null) {
                    obj = c2.b(cls, new HashSet());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        final t e2 = ((r) obj).e();
        e2.a(new C0062d() {
            public final void a() {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new C0038e(1), 500);
                e2.f(this);
            }
        });
    }
}
