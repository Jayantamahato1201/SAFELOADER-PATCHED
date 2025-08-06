package H0;

import A.i;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: H0.f  reason: case insensitive filesystem */
public final class C0005f extends t {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f292e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0005f(s sVar, int i2) {
        super(sVar);
        this.f292e = i2;
    }

    public void r() {
        switch (this.f292e) {
            case 0:
                s sVar = this.b;
                sVar.f332o = null;
                CheckableImageButton checkableImageButton = sVar.f324g;
                checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
                i.n0(checkableImageButton, (View.OnLongClickListener) null);
                return;
            default:
                return;
        }
    }
}
