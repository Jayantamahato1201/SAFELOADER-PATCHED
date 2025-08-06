package com.cheatbox;

import A.j;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import p1.a;
import q1.H;

public class App extends Application {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f1814a = {a.a(47569266771047378L), a.a(47569193756603346L), a.a(47569129332093906L)};

    public final void a(String str, String str2) {
        try {
            String[] strArr = this.f1814a;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str3 = strArr[i2];
                if (!str3.equals(str) || !str3.equals(str2)) {
                    i2++;
                } else if (str3.equals(a.a(47569052022682578L))) {
                    File file = new File(getFilesDir(), a.a(47568979008238546L));
                    if (file.exists()) {
                        System.load(file.getAbsolutePath());
                    }
                }
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
        String AppName = Native.AppName();
        try {
            String charSequence = getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(getPackageName(), 0)).toString();
            if (!AppName.equals(charSequence)) {
                throw new SecurityException(a.a(47568940353532882L) + AppName + a.a(47568772849808338L) + charSequence);
            }
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException(a.a(47568729900135378L), e3);
        }
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        H.f3893k = new j(20, (Object) this);
    }
}
