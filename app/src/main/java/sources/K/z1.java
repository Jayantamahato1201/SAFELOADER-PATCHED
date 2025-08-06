package k;

import I.O;
import I.Q;
import I.T;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.cheatbox.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class z1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k  reason: collision with root package name */
    public static z1 f3612k;

    /* renamed from: l  reason: collision with root package name */
    public static z1 f3613l;

    /* renamed from: a  reason: collision with root package name */
    public final View f3614a;
    public final CharSequence b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3615c;

    /* renamed from: d  reason: collision with root package name */
    public final y1 f3616d = new y1(this, 0);

    /* renamed from: e  reason: collision with root package name */
    public final y1 f3617e = new y1(this, 1);
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f3618g;

    /* renamed from: h  reason: collision with root package name */
    public A1 f3619h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3620i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3621j;

    public z1(View view, CharSequence charSequence) {
        int i2;
        this.f3614a = view;
        this.b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = T.f398a;
        if (Build.VERSION.SDK_INT >= 28) {
            i2 = Q.a(viewConfiguration);
        } else {
            i2 = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f3615c = i2;
        this.f3621j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(z1 z1Var) {
        z1 z1Var2 = f3612k;
        if (z1Var2 != null) {
            z1Var2.f3614a.removeCallbacks(z1Var2.f3616d);
        }
        f3612k = z1Var;
        if (z1Var != null) {
            z1Var.f3614a.postDelayed(z1Var.f3616d, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        z1 z1Var = f3613l;
        View view = this.f3614a;
        if (z1Var == this) {
            f3613l = null;
            A1 a12 = this.f3619h;
            if (a12 != null) {
                View view2 = a12.b;
                if (view2.getParent() != null) {
                    ((WindowManager) a12.f3320a.getSystemService("window")).removeView(view2);
                }
                this.f3619h = null;
                this.f3621j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3612k == this) {
            b((z1) null);
        }
        view.removeCallbacks(this.f3617e);
    }

    public final void c(boolean z2) {
        int i2;
        int i3;
        int i4;
        long j2;
        long longPressTimeout;
        long j3;
        int i5;
        int i6;
        char c2;
        int i7;
        int i8;
        WeakHashMap weakHashMap = O.f393a;
        View view = this.f3614a;
        if (view.isAttachedToWindow()) {
            b((z1) null);
            z1 z1Var = f3613l;
            if (z1Var != null) {
                z1Var.a();
            }
            f3613l = this;
            this.f3620i = z2;
            A1 a12 = new A1(view.getContext());
            this.f3619h = a12;
            int i9 = this.f;
            int i10 = this.f3618g;
            boolean z3 = this.f3620i;
            View view2 = a12.b;
            ViewParent parent = view2.getParent();
            Context context = a12.f3320a;
            if (!(parent == null || view2.getParent() == null)) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            a12.f3321c.setText(this.b);
            WindowManager.LayoutParams layoutParams = a12.f3322d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.MT_Bin);
            if (view.getWidth() < dimensionPixelOffset) {
                i9 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.MT_Bin);
                i2 = i10 + dimensionPixelOffset2;
                i3 = i10 - dimensionPixelOffset2;
            } else {
                i2 = view.getHeight();
                i3 = 0;
            }
            layoutParams.gravity = 49;
            Resources resources = context.getResources();
            if (z3) {
                i4 = R.dimen.MT_Bin;
            } else {
                i4 = R.dimen.MT_Bin;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i4);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    } else if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                Rect rect = a12.f3323e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i6 = i9;
                    i5 = i3;
                    i7 = 0;
                    c2 = 1;
                } else {
                    Resources resources2 = context.getResources();
                    c2 = 1;
                    i6 = i9;
                    i5 = i3;
                    int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i8 = resources2.getDimensionPixelSize(identifier);
                    } else {
                        i8 = 0;
                    }
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    i7 = 0;
                    rect.set(0, i8, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = a12.f3324g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = a12.f;
                view.getLocationOnScreen(iArr2);
                int i11 = iArr2[i7] - iArr[i7];
                iArr2[i7] = i11;
                iArr2[c2] = iArr2[c2] - iArr[c2];
                layoutParams.x = (i11 + i6) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, i7);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i12 = iArr2[c2];
                int i13 = ((i12 + i5) - dimensionPixelOffset3) - measuredHeight;
                int i14 = i12 + i2 + dimensionPixelOffset3;
                if (z3) {
                    if (i13 >= 0) {
                        layoutParams.y = i13;
                    } else {
                        layoutParams.y = i14;
                    }
                } else if (measuredHeight + i14 <= rect.height()) {
                    layoutParams.y = i14;
                } else {
                    layoutParams.y = i13;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f3620i) {
                j2 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j2 = j3 - longPressTimeout;
            }
            y1 y1Var = this.f3617e;
            view.removeCallbacks(y1Var);
            view.postDelayed(y1Var, j2);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i2;
        if (this.f3619h == null || !this.f3620i) {
            View view2 = this.f3614a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f3621j = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f3619h == null) {
                    int x2 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    if (this.f3621j || Math.abs(x2 - this.f) > (i2 = this.f3615c) || Math.abs(y2 - this.f3618g) > i2) {
                        this.f = x2;
                        this.f3618g = y2;
                        this.f3621j = false;
                        b(this);
                    }
                }
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.f3618g = view.getHeight() / 2;
        c(true);
        return true;
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    public final void onViewAttachedToWindow(View view) {
    }
}
