package androidx.fragment.app;

import Q0.l;
import android.view.View;

/* renamed from: androidx.fragment.app.m  reason: case insensitive filesystem */
public final class C0056m extends l {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ C0058o f1332l;

    public C0056m(C0058o oVar) {
        this.f1332l = oVar;
    }

    public final View I(int i2) {
        C0058o oVar = this.f1332l;
        View view = oVar.f1346E;
        if (view != null) {
            return view.findViewById(i2);
        }
        throw new IllegalStateException("Fragment " + oVar + " does not have a view");
    }

    public final boolean J() {
        if (this.f1332l.f1346E != null) {
            return true;
        }
        return false;
    }
}
