package j;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.C0;
import k.C0240f;
import k.C0242g;
import k.C0246i;
import k.C0248j;

/* renamed from: j.b  reason: case insensitive filesystem */
public final class C0198b extends C0 {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f3063j = 0;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ View f3064k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0198b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f3064k = actionMenuItemView;
    }

    public final C0194D b() {
        C0240f fVar;
        switch (this.f3063j) {
            case 0:
                C0199c cVar = ((ActionMenuItemView) this.f3064k).f890m;
                if (cVar == null || (fVar = ((C0242g) cVar).f3460a.f3492t) == null) {
                    return null;
                }
                return fVar.a();
            default:
                C0240f fVar2 = ((C0246i) this.f3064k).f3470d.f3491s;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    public final boolean c() {
        C0194D b;
        switch (this.f3063j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3064k;
                C0208l lVar = actionMenuItemView.f888k;
                if (lVar == null || !lVar.b(actionMenuItemView.f885h) || (b = b()) == null || !b.b()) {
                    return false;
                }
                return true;
            default:
                ((C0246i) this.f3064k).f3470d.l();
                return true;
        }
    }

    public boolean d() {
        switch (this.f3063j) {
            case 1:
                C0248j jVar = ((C0246i) this.f3064k).f3470d;
                if (jVar.f3493u != null) {
                    return false;
                }
                jVar.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0198b(C0246i iVar, C0246i iVar2) {
        super(iVar2);
        this.f3064k = iVar;
    }
}
