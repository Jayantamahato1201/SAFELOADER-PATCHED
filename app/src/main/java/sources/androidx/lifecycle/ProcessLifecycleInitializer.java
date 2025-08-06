package androidx.lifecycle;

import M0.m;
import U0.i;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import d0.C0107a;
import d0.b;
import java.util.List;

public final class ProcessLifecycleInitializer implements b {
    public final List a() {
        return m.f;
    }

    public final Object b(Context context) {
        i.e("context", context);
        C0107a c2 = C0107a.c(context);
        i.d("getInstance(context)", c2);
        if (c2.b.contains(ProcessLifecycleInitializer.class)) {
            if (!o.f1436a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                i.c("null cannot be cast to non-null type android.app.Application", applicationContext);
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
            }
            B b = B.f1403i;
            b.getClass();
            b.f1407e = new Handler();
            b.f.d(C0070l.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            i.c("null cannot be cast to non-null type android.app.Application", applicationContext2);
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new A(b));
            return b;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
