package j;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import e.C0136g;

/* renamed from: j.n  reason: case insensitive filesystem */
public final class C0210n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, y {

    /* renamed from: a  reason: collision with root package name */
    public C0196F f3126a;
    public C0136g b;

    /* renamed from: c  reason: collision with root package name */
    public C0205i f3127c;

    public final void a(C0209m mVar, boolean z2) {
        C0136g gVar;
        if ((z2 || mVar == this.f3126a) && (gVar = this.b) != null) {
            gVar.dismiss();
        }
    }

    public final boolean b(C0209m mVar) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C0205i iVar = this.f3127c;
        if (iVar.f == null) {
            iVar.f = new C0204h(iVar);
        }
        this.f3126a.q(iVar.f.getItem(i2), (z) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3127c.a(this.f3126a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C0196F f = this.f3126a;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                f.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return f.performShortcut(i2, keyEvent, 0);
    }
}
