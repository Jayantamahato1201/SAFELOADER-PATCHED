package r1;

import android.content.DialogInterface;
import top.bienvenido.mundo.manifest.MundoIntermediary;

public final /* synthetic */ class c implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MundoIntermediary f4439a;

    public /* synthetic */ c(MundoIntermediary mundoIntermediary) {
        this.f4439a = mundoIntermediary;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        int i2 = MundoIntermediary.f4722a;
        MundoIntermediary mundoIntermediary = this.f4439a;
        if (!mundoIntermediary.isFinishing()) {
            mundoIntermediary.finish();
        }
    }
}
