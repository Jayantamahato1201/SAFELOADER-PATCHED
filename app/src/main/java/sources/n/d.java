package N;

import A.j;
import H0.l;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f601a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, l lVar) {
        super(inputConnection, false);
        this.f601a = lVar;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        j jVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            jVar = new j(8, (Object) new f(inputContentInfo));
        }
        if (this.f601a.a(jVar, i2, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
