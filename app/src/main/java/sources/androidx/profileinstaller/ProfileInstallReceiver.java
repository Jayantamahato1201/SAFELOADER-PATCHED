package androidx.profileinstaller;

import A.j;
import Z.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.Serializable;

public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARNING: type inference failed for: r7v16, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File file;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                f.s(context, new Object(), new j(12, (Object) this), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        j jVar = new j(12, (Object) this);
                        try {
                            f.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            jVar.h(10, (Serializable) null);
                        } catch (PackageManager.NameNotFoundException e2) {
                            jVar.h(7, e2);
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                j jVar2 = new j(12, (Object) this);
                if (Build.VERSION.SDK_INT >= 24) {
                    Process.sendSignal(Process.myPid(), 10);
                    jVar2.h(12, (Serializable) null);
                    return;
                }
                jVar2.h(13, (Serializable) null);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                j jVar3 = new j(12, (Object) this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 24) {
                        file = context.createDeviceProtectedStorageContext().getCodeCacheDir();
                    } else if (i2 >= 23) {
                        file = context.getCodeCacheDir();
                    } else {
                        file = context.getCacheDir();
                    }
                    if (f.c(file)) {
                        jVar3.h(14, (Serializable) null);
                    } else {
                        jVar3.h(15, (Serializable) null);
                    }
                } else {
                    jVar3.h(16, (Serializable) null);
                }
            }
        }
    }
}
