package e;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: e.c  reason: case insensitive filesystem */
public final class C0132c implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0135f f2477a;
    public final /* synthetic */ C0133d b;

    public C0132c(C0133d dVar, C0135f fVar) {
        this.b = dVar;
        this.f2477a = fVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        C0133d dVar = this.b;
        DialogInterface.OnClickListener onClickListener = dVar.f2486k;
        C0135f fVar = this.f2477a;
        onClickListener.onClick(fVar.b, i2);
        if (!dVar.f2487l) {
            fVar.b.dismiss();
        }
    }
}
