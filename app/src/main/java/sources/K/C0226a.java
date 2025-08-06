package k;

import I.W;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: k.a  reason: case insensitive filesystem */
public final class C0226a implements W {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3439a = false;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f3440c;

    public C0226a(ActionBarContextView actionBarContextView) {
        this.f3440c = actionBarContextView;
    }

    public final void a() {
        if (!this.f3439a) {
            ActionBarContextView actionBarContextView = this.f3440c;
            actionBarContextView.f = null;
            C0226a.super.setVisibility(this.b);
        }
    }

    public final void b() {
        this.f3439a = true;
    }

    public final void c() {
        C0226a.super.setVisibility(0);
        this.f3439a = false;
    }
}
