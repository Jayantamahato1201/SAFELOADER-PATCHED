package j;

import H0.q;
import I.O;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cheatbox.R;
import java.util.WeakHashMap;
import k.C0280z0;
import k.L0;
import k.R0;

/* renamed from: j.E  reason: case insensitive filesystem */
public final class C0195E extends C0217u implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context b;

    /* renamed from: c  reason: collision with root package name */
    public final C0209m f3030c;

    /* renamed from: d  reason: collision with root package name */
    public final C0206j f3031d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3032e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3033g;

    /* renamed from: h  reason: collision with root package name */
    public final R0 f3034h;

    /* renamed from: i  reason: collision with root package name */
    public final C0200d f3035i = new C0200d(1, this);

    /* renamed from: j  reason: collision with root package name */
    public final q f3036j = new q(3, this);

    /* renamed from: k  reason: collision with root package name */
    public C0218v f3037k;

    /* renamed from: l  reason: collision with root package name */
    public View f3038l;

    /* renamed from: m  reason: collision with root package name */
    public View f3039m;

    /* renamed from: n  reason: collision with root package name */
    public y f3040n;

    /* renamed from: o  reason: collision with root package name */
    public ViewTreeObserver f3041o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3042p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3043q;

    /* renamed from: r  reason: collision with root package name */
    public int f3044r;

    /* renamed from: s  reason: collision with root package name */
    public int f3045s = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3046t;

    /* JADX WARNING: type inference failed for: r6v1, types: [k.R0, k.L0] */
    public C0195E(int i2, Context context, View view, C0209m mVar, boolean z2) {
        this.b = context;
        this.f3030c = mVar;
        this.f3032e = z2;
        this.f3031d = new C0206j(mVar, LayoutInflater.from(context), z2, R.layout.MT_Bin);
        this.f3033g = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Bin));
        this.f3038l = view;
        this.f3034h = new L0(context, (AttributeSet) null, i2);
        mVar.b(this, context);
    }

    public final void a(C0209m mVar, boolean z2) {
        if (mVar == this.f3030c) {
            dismiss();
            y yVar = this.f3040n;
            if (yVar != null) {
                yVar.a(mVar, z2);
            }
        }
    }

    public final boolean b() {
        if (this.f3042p || !this.f3034h.f3393z.isShowing()) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        return false;
    }

    public final void dismiss() {
        if (b()) {
            this.f3034h.dismiss();
        }
    }

    public final void f() {
        View view;
        boolean z2;
        Rect rect;
        if (!b()) {
            if (this.f3042p || (view = this.f3038l) == null) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            this.f3039m = view;
            R0 r02 = this.f3034h;
            r02.f3393z.setOnDismissListener(this);
            r02.f3383p = this;
            r02.f3392y = true;
            r02.f3393z.setFocusable(true);
            View view2 = this.f3039m;
            if (this.f3041o == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f3041o = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3035i);
            }
            view2.addOnAttachStateChangeListener(this.f3036j);
            r02.f3382o = view2;
            r02.f3379l = this.f3045s;
            boolean z3 = this.f3043q;
            Context context = this.b;
            C0206j jVar = this.f3031d;
            if (!z3) {
                this.f3044r = C0217u.m(jVar, context, this.f);
                this.f3043q = true;
            }
            r02.r(this.f3044r);
            r02.f3393z.setInputMethodMode(2);
            Rect rect2 = this.f3162a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            r02.f3391x = rect;
            r02.f();
            C0280z0 z0Var = r02.f3371c;
            z0Var.setOnKeyListener(this);
            if (this.f3046t) {
                C0209m mVar = this.f3030c;
                if (mVar.f3114m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.MT_Bin, z0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(mVar.f3114m);
                    }
                    frameLayout.setEnabled(false);
                    z0Var.addHeaderView(frameLayout, (Object) null, false);
                }
            }
            r02.n(jVar);
            r02.f();
        }
    }

    public final void g() {
        this.f3043q = false;
        C0206j jVar = this.f3031d;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    public final void i(y yVar) {
        this.f3040n = yVar;
    }

    public final C0280z0 j() {
        return this.f3034h.f3371c;
    }

    public final boolean k(C0196F f2) {
        if (f2.hasVisibleItems()) {
            View view = this.f3039m;
            C0196F f3 = f2;
            x xVar = new x(this.f3033g, this.b, view, f3, this.f3032e);
            y yVar = this.f3040n;
            xVar.f3169h = yVar;
            C0217u uVar = xVar.f3170i;
            if (uVar != null) {
                uVar.i(yVar);
            }
            boolean u2 = C0217u.u(f3);
            xVar.f3168g = u2;
            C0217u uVar2 = xVar.f3170i;
            if (uVar2 != null) {
                uVar2.o(u2);
            }
            xVar.f3171j = this.f3037k;
            this.f3037k = null;
            this.f3030c.c(false);
            R0 r02 = this.f3034h;
            int i2 = r02.f;
            int g2 = r02.g();
            int i3 = this.f3045s;
            View view2 = this.f3038l;
            WeakHashMap weakHashMap = O.f393a;
            if ((Gravity.getAbsoluteGravity(i3, view2.getLayoutDirection()) & 7) == 5) {
                i2 += this.f3038l.getWidth();
            }
            if (!xVar.b()) {
                if (xVar.f3167e != null) {
                    xVar.d(i2, g2, true, true);
                }
            }
            y yVar2 = this.f3040n;
            if (yVar2 != null) {
                yVar2.b(f3);
            }
            return true;
        }
        return false;
    }

    public final void n(View view) {
        this.f3038l = view;
    }

    public final void o(boolean z2) {
        this.f3031d.f3100c = z2;
    }

    public final void onDismiss() {
        this.f3042p = true;
        this.f3030c.c(true);
        ViewTreeObserver viewTreeObserver = this.f3041o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3041o = this.f3039m.getViewTreeObserver();
            }
            this.f3041o.removeGlobalOnLayoutListener(this.f3035i);
            this.f3041o = null;
        }
        this.f3039m.removeOnAttachStateChangeListener(this.f3036j);
        C0218v vVar = this.f3037k;
        if (vVar != null) {
            vVar.onDismiss();
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i2) {
        this.f3045s = i2;
    }

    public final void q(int i2) {
        this.f3034h.f = i2;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3037k = (C0218v) onDismissListener;
    }

    public final void s(boolean z2) {
        this.f3046t = z2;
    }

    public final void t(int i2) {
        this.f3034h.m(i2);
    }

    public final void l(C0209m mVar) {
    }
}
