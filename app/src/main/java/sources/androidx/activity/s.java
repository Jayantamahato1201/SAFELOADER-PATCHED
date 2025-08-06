package androidx.activity;

import M0.c;
import U0.i;
import androidx.fragment.app.w;

public final class s implements c {

    /* renamed from: a  reason: collision with root package name */
    public final w f877a;
    public final /* synthetic */ u b;

    public s(u uVar, w wVar) {
        i.e("onBackPressedCallback", wVar);
        this.b = uVar;
        this.f877a = wVar;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [U0.h, T0.a] */
    public final void cancel() {
        u uVar = this.b;
        c cVar = uVar.b;
        w wVar = this.f877a;
        cVar.remove((Object) wVar);
        if (i.a(uVar.f880c, wVar)) {
            wVar.getClass();
            uVar.f880c = null;
        }
        wVar.b.remove(this);
        ? r02 = wVar.f1397c;
        if (r02 != 0) {
            r02.a();
        }
        wVar.f1397c = null;
    }
}
