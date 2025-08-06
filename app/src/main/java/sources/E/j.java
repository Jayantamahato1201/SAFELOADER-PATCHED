package E;

import android.os.Build;
import android.os.LocaleList;
import android.os.storage.StorageVolume;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ LocaleList h(Object obj) {
        return (LocaleList) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return StorageVolume.class;
    }

    public static /* synthetic */ void x(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z2 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        executorService.shutdownNow();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
