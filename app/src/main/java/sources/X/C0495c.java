package x;

import F.a;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: x.c  reason: case insensitive filesystem */
public final class C0495c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Object f4753a;
    public Activity b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4754c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4755d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4756e = false;
    public boolean f = false;

    public C0495c(Activity activity) {
        this.b = activity;
        this.f4754c = activity.hashCode();
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.b == activity) {
            this.b = null;
            this.f4756e = true;
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f4756e && !this.f && !this.f4755d) {
            Object obj = this.f4753a;
            try {
                Object obj2 = C0496d.f4758c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f4754c) {
                    C0496d.f4761g.postAtFrontOfQueue(new a(C0496d.b.get(activity), 5, obj2));
                    this.f = true;
                    this.f4753a = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.b == activity) {
            this.f4755d = true;
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
