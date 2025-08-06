package androidx.lifecycle;

import U0.i;
import android.app.Activity;
import android.app.Application;

public abstract class z {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        i.e("activity", activity);
        i.e("callback", activityLifecycleCallbacks);
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
