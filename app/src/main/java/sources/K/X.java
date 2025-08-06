package k;

import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.cheatbox.LoginActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class X implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f3434g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3435h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f3436i;

    public /* synthetic */ X(Object obj, Object obj2, int i2, int i3) {
        this.f = i3;
        this.f3435h = obj;
        this.f3436i = obj2;
        this.f3434g = i2;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                int i2 = this.f3434g;
                ((TextView) this.f3435h).setTypeface((Typeface) this.f3436i, i2);
                return;
            case 1:
                ((BottomSheetBehavior) this.f3436i).E((View) this.f3435h, this.f3434g, false);
                return;
            default:
                String[] strArr = (String[]) this.f3435h;
                int[] iArr = new int[strArr.length];
                LoginActivity loginActivity = (LoginActivity) this.f3436i;
                PackageManager packageManager = loginActivity.getPackageManager();
                String packageName = loginActivity.getPackageName();
                int length = strArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = packageManager.checkPermission(strArr[i3], packageName);
                }
                loginActivity.onRequestPermissionsResult(this.f3434g, strArr, iArr);
                return;
        }
    }

    public X(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        this.f = 1;
        this.f3436i = bottomSheetBehavior;
        this.f3435h = view;
        this.f3434g = i2;
    }
}
