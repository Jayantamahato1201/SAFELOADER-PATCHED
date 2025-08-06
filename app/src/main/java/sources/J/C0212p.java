package j;

import A.j;
import android.view.ActionProvider;
import android.view.View;

/* renamed from: j.p  reason: case insensitive filesystem */
public final class C0212p implements ActionProvider.VisibilityListener {

    /* renamed from: a  reason: collision with root package name */
    public final ActionProvider f3155a;
    public final /* synthetic */ C0216t b;

    /* renamed from: c  reason: collision with root package name */
    public j f3156c;

    public C0212p(C0216t tVar, ActionProvider actionProvider) {
        this.b = tVar;
        this.f3155a = actionProvider;
    }

    public final View a(C0211o oVar) {
        return this.f3155a.onCreateActionView(oVar);
    }

    public final void onActionProviderVisibilityChanged(boolean z2) {
        j jVar = this.f3156c;
        if (jVar != null) {
            C0209m mVar = ((C0211o) jVar.b).f3142n;
            mVar.f3109h = true;
            mVar.p(true);
        }
    }
}
