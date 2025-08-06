package androidx.lifecycle;

import A.g;
import U0.i;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.E;

public abstract class C {
    public static void a(Activity activity, C0070l lVar) {
        i.e("event", lVar);
        if (activity instanceof r) {
            t e2 = ((r) activity).e();
            if (g.k(e2)) {
                e2.d(lVar);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            E.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new E.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
