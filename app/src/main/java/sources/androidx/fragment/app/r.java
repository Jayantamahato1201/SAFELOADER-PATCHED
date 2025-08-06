package androidx.fragment.app;

import Q0.l;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.t;
import e.C0137h;

public final class r extends l implements L, androidx.lifecycle.r, G {

    /* renamed from: l  reason: collision with root package name */
    public final C0137h f1384l;

    /* renamed from: m  reason: collision with root package name */
    public final C0137h f1385m;

    /* renamed from: n  reason: collision with root package name */
    public final Handler f1386n;

    /* renamed from: o  reason: collision with root package name */
    public final D f1387o = new D();

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ C0137h f1388p;

    public r(C0137h hVar) {
        this.f1388p = hVar;
        Handler handler = new Handler();
        this.f1384l = hVar;
        this.f1385m = hVar;
        this.f1386n = handler;
    }

    public final View I(int i2) {
        return this.f1388p.findViewById(i2);
    }

    public final boolean J() {
        Window window = this.f1388p.getWindow();
        if (window == null || window.peekDecorView() == null) {
            return false;
        }
        return true;
    }

    public final K d() {
        return this.f1388p.d();
    }

    public final t e() {
        return this.f1388p.f2518q;
    }

    public final void a() {
    }
}
