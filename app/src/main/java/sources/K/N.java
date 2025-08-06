package k;

import F.l;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import e.C0133d;
import e.C0136g;

public final class N implements T, DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public C0136g f3394a;
    public O b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f3395c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ U f3396d;

    public N(U u2) {
        this.f3396d = u2;
    }

    public final void a(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public final boolean b() {
        C0136g gVar = this.f3394a;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    public final int d() {
        return 0;
    }

    public final void dismiss() {
        C0136g gVar = this.f3394a;
        if (gVar != null) {
            gVar.dismiss();
            this.f3394a = null;
        }
    }

    public final void e(int i2, int i3) {
        if (this.b != null) {
            U u2 = this.f3396d;
            l lVar = new l(u2.getPopupContext());
            CharSequence charSequence = this.f3395c;
            C0133d dVar = (C0133d) lVar.b;
            if (charSequence != null) {
                dVar.f2480d = charSequence;
            }
            O o2 = this.b;
            int selectedItemPosition = u2.getSelectedItemPosition();
            dVar.f2485j = o2;
            dVar.f2486k = this;
            dVar.f2488m = selectedItemPosition;
            dVar.f2487l = true;
            C0136g b2 = lVar.b();
            this.f3394a = b2;
            AlertController$RecycleListView alertController$RecycleListView = b2.f.f;
            L.d(alertController$RecycleListView, i2);
            L.c(alertController$RecycleListView, i3);
            this.f3394a.show();
        }
    }

    public final int g() {
        return 0;
    }

    public final Drawable h() {
        return null;
    }

    public final CharSequence i() {
        return this.f3395c;
    }

    public final void k(CharSequence charSequence) {
        this.f3395c = charSequence;
    }

    public final void l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public final void m(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public final void n(ListAdapter listAdapter) {
        this.b = (O) listAdapter;
    }

    public final void o(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        U u2 = this.f3396d;
        u2.setSelection(i2);
        if (u2.getOnItemClickListener() != null) {
            u2.performItemClick((View) null, i2, this.b.getItemId(i2));
        }
        dismiss();
    }
}
