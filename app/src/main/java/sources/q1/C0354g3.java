package q1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Binder;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.Deque;

/* renamed from: q1.g3  reason: case insensitive filesystem */
public final class C0354g3 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    public final ActivityInfo f4101a;
    public final WeakReference b;

    /* renamed from: c  reason: collision with root package name */
    public final Q2 f4102c;

    /* renamed from: d  reason: collision with root package name */
    public final Intent f4103d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f4104e;
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public Deque f4105g;

    public C0354g3(ActivityInfo activityInfo, WeakReference weakReference, Q2 q2, Intent intent) {
        this.f4101a = activityInfo;
        this.b = weakReference;
        this.f4102c = q2;
        this.f4103d = intent;
    }
}
