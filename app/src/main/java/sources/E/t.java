package e;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import i.C0187l;
import i.C0188m;
import i.C0189n;
import j.C0209m;
import java.util.ArrayList;
import java.util.List;

public final class t implements Window.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Window.Callback f2534a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2535c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2536d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x f2537e;

    public t(x xVar, Window.Callback callback) {
        this.f2537e = xVar;
        if (callback != null) {
            this.f2534a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* JADX INFO: finally extract failed */
    public final void a(Window.Callback callback) {
        try {
            this.b = true;
            callback.onContentChanged();
            this.b = false;
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final boolean b(int i2, Menu menu) {
        return this.f2534a.onMenuOpened(i2, menu);
    }

    public final void c(int i2, Menu menu) {
        this.f2534a.onPanelClosed(i2, menu);
    }

    public final void d(List list, Menu menu, int i2) {
        C0188m.a(this.f2534a, list, menu, i2);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2534a.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2535c;
        Window.Callback callback = this.f2534a;
        if (z2) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (this.f2537e.u(keyEvent) || callback.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r0 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r7 != false) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f2534a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L_0x006f
            int r0 = r7.getKeyCode()
            e.x r2 = r6.f2537e
            r2.B()
            e.K r3 = r2.f2596o
            r4 = 0
            if (r3 == 0) goto L_0x003d
            e.J r3 = r3.f2466t
            if (r3 != 0) goto L_0x001d
        L_0x001b:
            r0 = 0
            goto L_0x0039
        L_0x001d:
            j.m r3 = r3.f2445d
            if (r3 == 0) goto L_0x001b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L_0x0031
            r5 = 1
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L_0x0039:
            if (r0 == 0) goto L_0x003d
        L_0x003b:
            r7 = 1
            goto L_0x006b
        L_0x003d:
            e.w r0 = r2.f2571M
            if (r0 == 0) goto L_0x0052
            int r3 = r7.getKeyCode()
            boolean r0 = r2.G(r0, r3, r7)
            if (r0 == 0) goto L_0x0052
            e.w r7 = r2.f2571M
            if (r7 == 0) goto L_0x003b
            r7.f2551l = r1
            goto L_0x003b
        L_0x0052:
            e.w r0 = r2.f2571M
            if (r0 != 0) goto L_0x006a
            e.w r0 = r2.A(r4)
            r2.H(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.G(r0, r3, r7)
            r0.f2550k = r4
            if (r7 == 0) goto L_0x006a
            goto L_0x003b
        L_0x006a:
            r7 = 0
        L_0x006b:
            if (r7 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            return r4
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.t.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2534a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2534a.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2534a.dispatchTrackballEvent(motionEvent);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, androidx.emoji2.text.r] */
    /* JADX WARNING: type inference failed for: r4v10, types: [i.e, j.k, java.lang.Object, i.a] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.C0181f e(android.view.ActionMode.Callback r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            androidx.emoji2.text.r r2 = new androidx.emoji2.text.r
            e.x r3 = r9.f2537e
            android.content.Context r4 = r3.f2592k
            r2.<init>()
            r2.b = r4
            r2.f1183a = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r2.f1184c = r10
            n.k r10 = new n.k
            r10.<init>()
            r2.f1185d = r10
            i.a r10 = r3.f2602u
            if (r10 == 0) goto L_0x0024
            r10.a()
        L_0x0024:
            F.c r10 = new F.c
            r4 = 17
            r10.<init>(r3, r2, r4, r0)
            r3.B()
            e.K r4 = r3.f2596o
            r5 = 0
            if (r4 == 0) goto L_0x007a
            e.J r6 = r4.f2466t
            if (r6 == 0) goto L_0x003a
            r6.a()
        L_0x003a:
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r4.f2460n
            r6.setHideOnContentScrollEnabled(r0)
            androidx.appcompat.widget.ActionBarContextView r6 = r4.f2463q
            r6.e()
            e.J r6 = new e.J
            androidx.appcompat.widget.ActionBarContextView r7 = r4.f2463q
            android.content.Context r7 = r7.getContext()
            r6.<init>(r4, r7, r10)
            j.m r7 = r6.f2445d
            r7.w()
            F.c r8 = r6.f2446e     // Catch:{ all -> 0x0075 }
            java.lang.Object r8 = r8.b     // Catch:{ all -> 0x0075 }
            androidx.emoji2.text.r r8 = (androidx.emoji2.text.r) r8     // Catch:{ all -> 0x0075 }
            boolean r8 = r8.d(r6, r7)     // Catch:{ all -> 0x0075 }
            r7.v()
            if (r8 == 0) goto L_0x0071
            r4.f2466t = r6
            r6.i()
            androidx.appcompat.widget.ActionBarContextView r7 = r4.f2463q
            r7.c(r6)
            r4.f0(r1)
            goto L_0x0072
        L_0x0071:
            r6 = r5
        L_0x0072:
            r3.f2602u = r6
            goto L_0x007a
        L_0x0075:
            r10 = move-exception
            r7.v()
            throw r10
        L_0x007a:
            i.a r4 = r3.f2602u
            if (r4 != 0) goto L_0x01f1
            I.V r4 = r3.f2606y
            if (r4 == 0) goto L_0x0085
            r4.b()
        L_0x0085:
            i.a r4 = r3.f2602u
            if (r4 == 0) goto L_0x008c
            r4.a()
        L_0x008c:
            androidx.appcompat.widget.ActionBarContextView r4 = r3.f2603v
            if (r4 != 0) goto L_0x0140
            boolean r4 = r3.f2567I
            android.content.Context r6 = r3.f2592k
            if (r4 == 0) goto L_0x0113
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r7 = r6.getTheme()
            r8 = 2130903049(0x7f030009, float:1.7412905E38)
            r7.resolveAttribute(r8, r4, r1)
            int r8 = r4.resourceId
            if (r8 == 0) goto L_0x00c6
            android.content.res.Resources r8 = r6.getResources()
            android.content.res.Resources$Theme r8 = r8.newTheme()
            r8.setTo(r7)
            int r7 = r4.resourceId
            r8.applyStyle(r7, r1)
            i.d r7 = new i.d
            r7.<init>(r6, r0)
            android.content.res.Resources$Theme r6 = r7.getTheme()
            r6.setTo(r8)
            r6 = r7
        L_0x00c6:
            androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
            r7.<init>(r6, r5)
            r3.f2603v = r7
            android.widget.PopupWindow r7 = new android.widget.PopupWindow
            r8 = 2130903064(0x7f030018, float:1.7412935E38)
            r7.<init>(r6, r5, r8)
            r3.f2604w = r7
            r8 = 2
            A.i.u0(r7, r8)
            android.widget.PopupWindow r7 = r3.f2604w
            androidx.appcompat.widget.ActionBarContextView r8 = r3.f2603v
            r7.setContentView(r8)
            android.widget.PopupWindow r7 = r3.f2604w
            r8 = -1
            r7.setWidth(r8)
            android.content.res.Resources$Theme r7 = r6.getTheme()
            r8 = 2130903043(0x7f030003, float:1.7412893E38)
            r7.resolveAttribute(r8, r4, r1)
            int r4 = r4.data
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r4 = android.util.TypedValue.complexToDimensionPixelSize(r4, r6)
            androidx.appcompat.widget.ActionBarContextView r6 = r3.f2603v
            r6.setContentHeight(r4)
            android.widget.PopupWindow r4 = r3.f2604w
            r6 = -2
            r4.setHeight(r6)
            e.m r4 = new e.m
            r4.<init>(r3, r1)
            r3.f2605x = r4
            goto L_0x0140
        L_0x0113:
            android.view.ViewGroup r4 = r3.f2560A
            r7 = 2131230783(0x7f08003f, float:1.8077629E38)
            android.view.View r4 = r4.findViewById(r7)
            androidx.appcompat.widget.ViewStubCompat r4 = (androidx.appcompat.widget.ViewStubCompat) r4
            if (r4 == 0) goto L_0x0140
            r3.B()
            e.K r7 = r3.f2596o
            if (r7 == 0) goto L_0x012c
            android.content.Context r7 = r7.g0()
            goto L_0x012d
        L_0x012c:
            r7 = r5
        L_0x012d:
            if (r7 != 0) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r6 = r7
        L_0x0131:
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r4.setLayoutInflater(r6)
            android.view.View r4 = r4.a()
            androidx.appcompat.widget.ActionBarContextView r4 = (androidx.appcompat.widget.ActionBarContextView) r4
            r3.f2603v = r4
        L_0x0140:
            androidx.appcompat.widget.ActionBarContextView r4 = r3.f2603v
            if (r4 == 0) goto L_0x01ea
            I.V r4 = r3.f2606y
            if (r4 == 0) goto L_0x014b
            r4.b()
        L_0x014b:
            androidx.appcompat.widget.ActionBarContextView r4 = r3.f2603v
            r4.e()
            i.e r4 = new i.e
            androidx.appcompat.widget.ActionBarContextView r6 = r3.f2603v
            android.content.Context r6 = r6.getContext()
            androidx.appcompat.widget.ActionBarContextView r7 = r3.f2603v
            r4.<init>()
            r4.f2930c = r6
            r4.f2931d = r7
            r4.f2932e = r10
            j.m r6 = new j.m
            android.content.Context r7 = r7.getContext()
            r6.<init>(r7)
            r6.f3113l = r1
            r4.f2934h = r6
            r6.f3107e = r4
            java.lang.Object r10 = r10.b
            androidx.emoji2.text.r r10 = (androidx.emoji2.text.r) r10
            boolean r10 = r10.d(r4, r6)
            if (r10 == 0) goto L_0x01e8
            r4.i()
            androidx.appcompat.widget.ActionBarContextView r10 = r3.f2603v
            r10.c(r4)
            r3.f2602u = r4
            boolean r10 = r3.f2607z
            if (r10 == 0) goto L_0x0198
            android.view.ViewGroup r10 = r3.f2560A
            if (r10 == 0) goto L_0x0198
            java.util.WeakHashMap r4 = I.O.f393a
            boolean r10 = r10.isLaidOut()
            if (r10 == 0) goto L_0x0198
            r10 = 1
            goto L_0x0199
        L_0x0198:
            r10 = 0
        L_0x0199:
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x01b7
            androidx.appcompat.widget.ActionBarContextView r10 = r3.f2603v
            r0 = 0
            r10.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r10 = r3.f2603v
            I.V r10 = I.O.a(r10)
            r10.a(r4)
            r3.f2606y = r10
            e.o r0 = new e.o
            r0.<init>(r1, r3)
            r10.d(r0)
            goto L_0x01d8
        L_0x01b7:
            androidx.appcompat.widget.ActionBarContextView r10 = r3.f2603v
            r10.setAlpha(r4)
            androidx.appcompat.widget.ActionBarContextView r10 = r3.f2603v
            r10.setVisibility(r0)
            androidx.appcompat.widget.ActionBarContextView r10 = r3.f2603v
            android.view.ViewParent r10 = r10.getParent()
            boolean r10 = r10 instanceof android.view.View
            if (r10 == 0) goto L_0x01d8
            androidx.appcompat.widget.ActionBarContextView r10 = r3.f2603v
            android.view.ViewParent r10 = r10.getParent()
            android.view.View r10 = (android.view.View) r10
            java.util.WeakHashMap r0 = I.O.f393a
            I.B.c(r10)
        L_0x01d8:
            android.widget.PopupWindow r10 = r3.f2604w
            if (r10 == 0) goto L_0x01ea
            android.view.Window r10 = r3.f2593l
            android.view.View r10 = r10.getDecorView()
            e.m r0 = r3.f2605x
            r10.post(r0)
            goto L_0x01ea
        L_0x01e8:
            r3.f2602u = r5
        L_0x01ea:
            r3.J()
            i.a r10 = r3.f2602u
            r3.f2602u = r10
        L_0x01f1:
            r3.J()
            i.a r10 = r3.f2602u
            if (r10 == 0) goto L_0x01fd
            i.f r10 = r2.b(r10)
            return r10
        L_0x01fd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.t.e(android.view.ActionMode$Callback):i.f");
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2534a.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2534a.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f2534a.onAttachedToWindow();
    }

    public final void onContentChanged() {
        if (this.b) {
            this.f2534a.onContentChanged();
        }
    }

    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0 || (menu instanceof C0209m)) {
            return this.f2534a.onCreatePanelMenu(i2, menu);
        }
        return false;
    }

    public final View onCreatePanelView(int i2) {
        return this.f2534a.onCreatePanelView(i2);
    }

    public final void onDetachedFromWindow() {
        this.f2534a.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f2534a.onMenuItemSelected(i2, menuItem);
    }

    public final boolean onMenuOpened(int i2, Menu menu) {
        b(i2, menu);
        x xVar = this.f2537e;
        if (i2 == 108) {
            xVar.B();
            C0129K k2 = xVar.f2596o;
            if (!(k2 == null || true == k2.f2469w)) {
                k2.f2469w = true;
                ArrayList arrayList = k2.f2470x;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
            return true;
        }
        xVar.getClass();
        return true;
    }

    public final void onPanelClosed(int i2, Menu menu) {
        if (this.f2536d) {
            this.f2534a.onPanelClosed(i2, menu);
            return;
        }
        c(i2, menu);
        x xVar = this.f2537e;
        if (i2 == 108) {
            xVar.B();
            C0129K k2 = xVar.f2596o;
            if (k2 != null && k2.f2469w) {
                k2.f2469w = false;
                ArrayList arrayList = k2.f2470x;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else if (i2 == 0) {
            w A2 = xVar.A(i2);
            if (A2.f2552m) {
                xVar.s(A2, false);
            }
        } else {
            xVar.getClass();
        }
    }

    public final void onPointerCaptureChanged(boolean z2) {
        C0189n.a(this.f2534a, z2);
    }

    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        C0209m mVar;
        if (menu instanceof C0209m) {
            mVar = (C0209m) menu;
        } else {
            mVar = null;
        }
        if (i2 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f3125x = true;
        }
        boolean onPreparePanel = this.f2534a.onPreparePanel(i2, view, menu);
        if (mVar != null) {
            mVar.f3125x = false;
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        C0209m mVar = this.f2537e.A(0).f2547h;
        if (mVar != null) {
            d(list, mVar, i2);
        } else {
            d(list, menu, i2);
        }
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return C0187l.a(this.f2534a, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2534a.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z2) {
        this.f2534a.onWindowFocusChanged(z2);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        this.f2537e.getClass();
        if (i2 != 0) {
            return C0187l.b(this.f2534a, callback, i2);
        }
        return e(callback);
    }

    public final boolean onSearchRequested() {
        return this.f2534a.onSearchRequested();
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        this.f2537e.getClass();
        return e(callback);
    }
}
