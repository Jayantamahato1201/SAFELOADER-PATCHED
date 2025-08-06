package q1;

import android.app.job.IJobCallback;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.PersistableBundle;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* renamed from: q1.w3  reason: case insensitive filesystem */
public abstract class C0449w3 extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public final C0351g0 f4233a = new C0351g0("extras");
    public final C0 b;

    public C0449w3() {
        boolean z2 = T4.f4005k;
        C0 c02 = C0.f3864a;
        if (z2) {
            try {
                Field declaredField = JobParameters.class.getDeclaredField("callback");
                declaredField.setAccessible(true);
                if (!Modifier.isStatic(declaredField.getModifiers())) {
                    if (!declaredField.getType().isPrimitive()) {
                        c02 = new C0428t0(C0455x3.f4236a.objectFieldOffset(declaredField));
                    }
                }
                c02 = new C0351g0(declaredField, 2);
            } catch (Exception unused) {
            }
        }
        this.b = c02;
    }

    public final JobService a(JobParameters jobParameters) {
        C0 c02 = this.b;
        if (jobParameters == null) {
            return null;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null) {
                return null;
            }
            ComponentName unflattenFromString = ComponentName.unflattenFromString(extras.getString("mundo_base_string", ""));
            if (unflattenFromString == null) {
                return null;
            }
            PersistableBundle persistableBundle = extras.getPersistableBundle("mundo_base_bundle");
            if (persistableBundle == null) {
                return null;
            }
            if (T4.f4005k) {
                IBinder iBinder = (IBinder) c02.a(jobParameters);
                if (iBinder != null) {
                    IJobCallback asInterface = IJobCallback.Stub.asInterface(iBinder);
                    C0351g0 g0Var = C0367i4.f4118a;
                    c02.c(jobParameters, new O(iBinder, (IInterface) H.g(asInterface, C0383l2.f4137d)));
                }
            }
            JobService jobService = (JobService) T3.f3994c.d(new C0392n(1, unflattenFromString));
            if (jobService == null) {
                return null;
            }
            ((C0) this.f4233a.f4098c).c(jobParameters, persistableBundle);
            return jobService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void onNetworkChanged(JobParameters jobParameters) {
        JobService a2 = a(jobParameters);
        if (a2 != null) {
            a2.onNetworkChanged(jobParameters);
        }
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        Intent intent2;
        if (intent != null) {
            try {
                intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            } catch (Exception unused) {
                return 2;
            }
        } else {
            intent2 = null;
        }
        if (intent2 == null) {
            return 2;
        }
        C0330c3 c3Var = C0330c3.b;
        String stringExtra = intent2.getStringExtra("user");
        if (stringExtra == null) {
            stringExtra = "0";
        }
        c3Var.A(intent2, stringExtra);
        return 2;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        JobService a2 = a(jobParameters);
        if (a2 != null) {
            return a2.onStartJob(jobParameters);
        }
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        JobService a2 = a(jobParameters);
        if (a2 != null) {
            return a2.onStopJob(jobParameters);
        }
        return true;
    }
}
