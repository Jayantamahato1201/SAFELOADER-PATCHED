package androidx.lifecycle;

import U0.i;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public final class A extends C0064f {
    final /* synthetic */ B this$0;

    public static final class a extends C0064f {
        final /* synthetic */ B this$0;

        public a(B b) {
            this.this$0 = b;
        }

        public void onActivityPostResumed(Activity activity) {
            i.e("activity", activity);
            this.this$0.a();
        }

        public void onActivityPostStarted(Activity activity) {
            i.e("activity", activity);
            B b = this.this$0;
            int i2 = b.f1404a + 1;
            b.f1404a = i2;
            if (i2 == 1 && b.f1406d) {
                b.f.d(C0070l.ON_START);
                b.f1406d = false;
            }
        }
    }

    public A(B b) {
        this.this$0 = b;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        i.e("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = E.b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            i.c("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", findFragmentByTag);
            ((E) findFragmentByTag).f1412a = this.this$0.f1409h;
        }
    }

    public void onActivityPaused(Activity activity) {
        i.e("activity", activity);
        B b = this.this$0;
        int i2 = b.b - 1;
        b.b = i2;
        if (i2 == 0) {
            Handler handler = b.f1407e;
            i.b(handler);
            handler.postDelayed(b.f1408g, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        i.e("activity", activity);
        z.a(activity, new a(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        i.e("activity", activity);
        B b = this.this$0;
        int i2 = b.f1404a - 1;
        b.f1404a = i2;
        if (i2 == 0 && b.f1405c) {
            b.f.d(C0070l.ON_STOP);
            b.f1406d = true;
        }
    }
}
