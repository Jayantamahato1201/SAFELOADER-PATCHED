package i0;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.cheatbox.MainActivity;
import com.cheatbox.Native;
import p1.a;

public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2994a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ m(MainActivity mainActivity, int i2) {
        this.f2994a = i2;
        this.b = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        MainActivity mainActivity = this.b;
        switch (this.f2994a) {
            case 0:
                int i3 = MainActivity.f1818B;
                mainActivity.finish();
                return;
            case 1:
                int i4 = MainActivity.f1818B;
                mainActivity.getClass();
                mainActivity.startActivity(new Intent(a.a(47552786981532626L), Uri.parse(Native.urlTg())));
                return;
            default:
                int i5 = MainActivity.f1818B;
                mainActivity.finish();
                return;
        }
    }
}
