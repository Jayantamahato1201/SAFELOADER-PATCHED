package q1;

import android.app.job.JobInfo;
import java.lang.reflect.Method;

public final class E1 extends S3 {
    public final Object a(Object obj, Method method, Object[] objArr) {
        if (H.f3895m) {
            try {
                JobInfo jobInfo = (JobInfo) L3.b(objArr, JobInfo.class);
                if (jobInfo != null) {
                    I1.b.getClass();
                    I1.d(jobInfo);
                }
            } catch (Throwable unused) {
            }
        }
        return super.a(obj, method, objArr);
    }
}
