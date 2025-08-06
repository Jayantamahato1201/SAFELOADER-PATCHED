package I;

import A.j;
import B0.e;
import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

public abstract class K {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0014f b(View view, C0014f fVar) {
        ContentInfo k2 = fVar.f420a.k();
        Objects.requireNonNull(k2);
        ContentInfo h2 = e.h(k2);
        ContentInfo performReceiveContent = view.performReceiveContent(h2);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == h2) {
            return fVar;
        }
        return new C0014f(new j(performReceiveContent));
    }

    public static void c(View view, String[] strArr, C0025q qVar) {
        if (qVar == null) {
            view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
        } else {
            view.setOnReceiveContentListener(strArr, new L(qVar));
        }
    }
}
