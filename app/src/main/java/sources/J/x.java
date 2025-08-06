package j;

import I.O;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.cheatbox.R;
import java.util.WeakHashMap;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3164a;
    public final C0209m b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3165c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3166d;

    /* renamed from: e  reason: collision with root package name */
    public View f3167e;
    public int f = 8388611;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3168g;

    /* renamed from: h  reason: collision with root package name */
    public y f3169h;

    /* renamed from: i  reason: collision with root package name */
    public C0217u f3170i;

    /* renamed from: j  reason: collision with root package name */
    public C0218v f3171j;

    /* renamed from: k  reason: collision with root package name */
    public final C0218v f3172k = new C0218v(this);

    public x(int i2, Context context, View view, C0209m mVar, boolean z2) {
        this.f3164a = context;
        this.b = mVar;
        this.f3167e = view;
        this.f3165c = z2;
        this.f3166d = i2;
    }

    public final C0217u a() {
        C0217u uVar;
        if (this.f3170i == null) {
            Context context = this.f3164a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            w.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.MT_Bin)) {
                uVar = new C0203g(context, this.f3167e, this.f3166d, this.f3165c);
            } else {
                View view = this.f3167e;
                Context context2 = this.f3164a;
                boolean z2 = this.f3165c;
                uVar = new C0195E(this.f3166d, context2, view, this.b, z2);
            }
            uVar.l(this.b);
            uVar.r(this.f3172k);
            uVar.n(this.f3167e);
            uVar.i(this.f3169h);
            uVar.o(this.f3168g);
            uVar.p(this.f);
            this.f3170i = uVar;
        }
        return this.f3170i;
    }

    public final boolean b() {
        C0217u uVar = this.f3170i;
        if (uVar == null || !uVar.b()) {
            return false;
        }
        return true;
    }

    public void c() {
        this.f3170i = null;
        C0218v vVar = this.f3171j;
        if (vVar != null) {
            vVar.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        C0217u a2 = a();
        a2.s(z3);
        if (z2) {
            int i4 = this.f;
            View view = this.f3167e;
            WeakHashMap weakHashMap = O.f393a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f3167e.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.f3164a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f3162a = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.f();
    }
}
