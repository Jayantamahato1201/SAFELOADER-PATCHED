package I;

import A.j;
import B0.e;
import O.r;
import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

public final class L implements OnReceiveContentListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0025q f389a;

    public L(C0025q qVar) {
        this.f389a = qVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0014f fVar = new C0014f(new j(contentInfo));
        C0014f a2 = ((r) this.f389a).a(view, fVar);
        if (a2 == null) {
            return null;
        }
        if (a2 == fVar) {
            return contentInfo;
        }
        ContentInfo k2 = a2.f420a.k();
        Objects.requireNonNull(k2);
        return e.h(k2);
    }
}
