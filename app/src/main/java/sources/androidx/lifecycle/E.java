package androidx.lifecycle;

import A.j;
import U0.i;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

public class E extends Fragment {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a  reason: collision with root package name */
    public j f1412a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final D Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            i.e("activity", activity);
            activity.registerActivityLifecycleCallbacks(new a());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            i.e("activity", activity);
        }

        public void onActivityDestroyed(Activity activity) {
            i.e("activity", activity);
        }

        public void onActivityPaused(Activity activity) {
            i.e("activity", activity);
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            i.e("activity", activity);
            int i2 = E.b;
            C.a(activity, C0070l.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            i.e("activity", activity);
            int i2 = E.b;
            C.a(activity, C0070l.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            i.e("activity", activity);
            int i2 = E.b;
            C.a(activity, C0070l.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            i.e("activity", activity);
            int i2 = E.b;
            C.a(activity, C0070l.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            i.e("activity", activity);
            int i2 = E.b;
            C.a(activity, C0070l.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            i.e("activity", activity);
            int i2 = E.b;
            C.a(activity, C0070l.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            i.e("activity", activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            i.e("activity", activity);
            i.e("bundle", bundle);
        }

        public void onActivityStarted(Activity activity) {
            i.e("activity", activity);
        }

        public void onActivityStopped(Activity activity) {
            i.e("activity", activity);
        }
    }

    public final void a(C0070l lVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            i.d("activity", activity);
            C.a(activity, lVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(C0070l.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(C0070l.ON_DESTROY);
        this.f1412a = null;
    }

    public final void onPause() {
        super.onPause();
        a(C0070l.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        j jVar = this.f1412a;
        if (jVar != null) {
            ((B) jVar.b).a();
        }
        a(C0070l.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        j jVar = this.f1412a;
        if (jVar != null) {
            B b2 = (B) jVar.b;
            int i2 = b2.f1404a + 1;
            b2.f1404a = i2;
            if (i2 == 1 && b2.f1406d) {
                b2.f.d(C0070l.ON_START);
                b2.f1406d = false;
            }
        }
        a(C0070l.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(C0070l.ON_STOP);
    }
}
