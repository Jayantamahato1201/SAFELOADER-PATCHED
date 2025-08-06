package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: k.c  reason: case insensitive filesystem */
public final class C0232c implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3444g;

    public /* synthetic */ C0232c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f = i2;
        this.f3444g = actionBarOverlayLayout;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3444g;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f959w = actionBarOverlayLayout.f941d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f960x);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3444g;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f959w = actionBarOverlayLayout2.f941d.animate().translationY((float) (-actionBarOverlayLayout2.f941d.getHeight())).setListener(actionBarOverlayLayout2.f960x);
                return;
        }
    }
}
