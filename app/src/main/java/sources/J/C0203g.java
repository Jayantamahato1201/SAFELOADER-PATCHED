package j;

import A.j;
import H0.q;
import I.O;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.cheatbox.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0280z0;
import k.N0;
import k.R0;

/* renamed from: j.g  reason: case insensitive filesystem */
public final class C0203g extends C0217u implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3071c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3072d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3073e;
    public final Handler f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f3074g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f3075h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final C0200d f3076i = new C0200d(0, this);

    /* renamed from: j  reason: collision with root package name */
    public final q f3077j = new q(2, this);

    /* renamed from: k  reason: collision with root package name */
    public final j f3078k = new j(26, (Object) this);

    /* renamed from: l  reason: collision with root package name */
    public int f3079l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f3080m = 0;

    /* renamed from: n  reason: collision with root package name */
    public View f3081n;

    /* renamed from: o  reason: collision with root package name */
    public View f3082o;

    /* renamed from: p  reason: collision with root package name */
    public int f3083p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3084q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3085r;

    /* renamed from: s  reason: collision with root package name */
    public int f3086s;

    /* renamed from: t  reason: collision with root package name */
    public int f3087t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3088u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3089v;

    /* renamed from: w  reason: collision with root package name */
    public y f3090w;

    /* renamed from: x  reason: collision with root package name */
    public ViewTreeObserver f3091x;

    /* renamed from: y  reason: collision with root package name */
    public C0218v f3092y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3093z;

    public C0203g(Context context, View view, int i2, boolean z2) {
        int i3 = 0;
        this.b = context;
        this.f3081n = view;
        this.f3072d = i2;
        this.f3073e = z2;
        this.f3088u = false;
        WeakHashMap weakHashMap = O.f393a;
        this.f3083p = view.getLayoutDirection() != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.f3071c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Bin));
        this.f = new Handler();
    }

    public final void a(C0209m mVar, boolean z2) {
        int i2;
        ArrayList arrayList = this.f3075h;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (mVar == ((C0202f) arrayList.get(i3)).b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int i4 = i3 + 1;
            if (i4 < arrayList.size()) {
                ((C0202f) arrayList.get(i4)).b.c(false);
            }
            C0202f fVar = (C0202f) arrayList.remove(i3);
            fVar.b.r(this);
            boolean z3 = this.f3093z;
            R0 r02 = fVar.f3069a;
            if (z3) {
                if (Build.VERSION.SDK_INT >= 23) {
                    N0.b(r02.f3393z, (Transition) null);
                }
                r02.f3393z.setAnimationStyle(0);
            }
            r02.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.f3083p = ((C0202f) arrayList.get(size2 - 1)).f3070c;
            } else {
                View view = this.f3081n;
                WeakHashMap weakHashMap = O.f393a;
                if (view.getLayoutDirection() == 1) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                this.f3083p = i2;
            }
            if (size2 == 0) {
                dismiss();
                y yVar = this.f3090w;
                if (yVar != null) {
                    yVar.a(mVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f3091x;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f3091x.removeGlobalOnLayoutListener(this.f3076i);
                    }
                    this.f3091x = null;
                }
                this.f3082o.removeOnAttachStateChangeListener(this.f3077j);
                this.f3092y.onDismiss();
            } else if (z2) {
                ((C0202f) arrayList.get(0)).b.c(false);
            }
        }
    }

    public final boolean b() {
        ArrayList arrayList = this.f3075h;
        if (arrayList.size() <= 0 || !((C0202f) arrayList.get(0)).f3069a.f3393z.isShowing()) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        return false;
    }

    public final void dismiss() {
        ArrayList arrayList = this.f3075h;
        int size = arrayList.size();
        if (size > 0) {
            C0202f[] fVarArr = (C0202f[]) arrayList.toArray(new C0202f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0202f fVar = fVarArr[i2];
                if (fVar.f3069a.f3393z.isShowing()) {
                    fVar.f3069a.dismiss();
                }
            }
        }
    }

    public final void f() {
        if (!b()) {
            ArrayList arrayList = this.f3074g;
            int size = arrayList.size();
            boolean z2 = false;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                v((C0209m) obj);
            }
            arrayList.clear();
            View view = this.f3081n;
            this.f3082o = view;
            if (view != null) {
                if (this.f3091x == null) {
                    z2 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f3091x = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f3076i);
                }
                this.f3082o.addOnAttachStateChangeListener(this.f3077j);
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f3075h;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ListAdapter adapter = ((C0202f) obj).f3069a.f3371c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0206j) adapter).notifyDataSetChanged();
        }
    }

    public final void i(y yVar) {
        this.f3090w = yVar;
    }

    public final C0280z0 j() {
        ArrayList arrayList = this.f3075h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0202f) arrayList.get(arrayList.size() - 1)).f3069a.f3371c;
    }

    public final boolean k(C0196F f2) {
        ArrayList arrayList = this.f3075h;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            C0202f fVar = (C0202f) obj;
            if (f2 == fVar.b) {
                fVar.f3069a.f3371c.requestFocus();
                return true;
            }
        }
        if (!f2.hasVisibleItems()) {
            return false;
        }
        l(f2);
        y yVar = this.f3090w;
        if (yVar != null) {
            yVar.b(f2);
        }
        return true;
    }

    public final void l(C0209m mVar) {
        mVar.b(this, this.b);
        if (b()) {
            v(mVar);
        } else {
            this.f3074g.add(mVar);
        }
    }

    public final void n(View view) {
        if (this.f3081n != view) {
            this.f3081n = view;
            int i2 = this.f3079l;
            WeakHashMap weakHashMap = O.f393a;
            this.f3080m = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    public final void o(boolean z2) {
        this.f3088u = z2;
    }

    public final void onDismiss() {
        C0202f fVar;
        ArrayList arrayList = this.f3075h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                fVar = null;
                break;
            }
            fVar = (C0202f) arrayList.get(i2);
            if (!fVar.f3069a.f3393z.isShowing()) {
                break;
            }
            i2++;
        }
        if (fVar != null) {
            fVar.b.c(false);
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
        if (this.f3079l != i2) {
            this.f3079l = i2;
            View view = this.f3081n;
            WeakHashMap weakHashMap = O.f393a;
            this.f3080m = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    public final void q(int i2) {
        this.f3084q = true;
        this.f3086s = i2;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3092y = (C0218v) onDismissListener;
    }

    public final void s(boolean z2) {
        this.f3089v = z2;
    }

    public final void t(int i2) {
        this.f3085r = true;
        this.f3087t = i2;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [k.R0, k.L0] */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014f, code lost:
        if (((r3.getWidth() + r10[0]) + r6) > r9.right) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0154, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015b, code lost:
        if ((r10[0] - r6) < 0) goto L_0x0154;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(j.C0209m r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            android.content.Context r3 = r0.b
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r3)
            j.j r5 = new j.j
            boolean r6 = r0.f3073e
            r7 = 2131427339(0x7f0b000b, float:1.8476291E38)
            r5.<init>(r1, r4, r6, r7)
            boolean r6 = r0.b()
            r7 = 1
            if (r6 != 0) goto L_0x0022
            boolean r6 = r0.f3088u
            if (r6 == 0) goto L_0x0022
            r5.f3100c = r7
            goto L_0x002e
        L_0x0022:
            boolean r6 = r0.b()
            if (r6 == 0) goto L_0x002e
            boolean r6 = j.C0217u.u(r1)
            r5.f3100c = r6
        L_0x002e:
            int r6 = r0.f3071c
            int r6 = j.C0217u.m(r5, r3, r6)
            k.R0 r8 = new k.R0
            int r9 = r0.f3072d
            r10 = 0
            r8.<init>(r3, r10, r9)
            k.B r3 = r8.f3393z
            A.j r9 = r0.f3078k
            r8.D = r9
            r8.f3383p = r0
            r3.setOnDismissListener(r0)
            android.view.View r9 = r0.f3081n
            r8.f3382o = r9
            int r9 = r0.f3080m
            r8.f3379l = r9
            r8.f3392y = r7
            r3.setFocusable(r7)
            r9 = 2
            r3.setInputMethodMode(r9)
            r8.n(r5)
            r8.r(r6)
            int r5 = r0.f3080m
            r8.f3379l = r5
            java.util.ArrayList r5 = r0.f3075h
            int r11 = r5.size()
            if (r11 <= 0) goto L_0x00e9
            int r11 = r5.size()
            int r11 = r11 - r7
            java.lang.Object r11 = r5.get(r11)
            j.f r11 = (j.C0202f) r11
            j.m r12 = r11.b
            java.util.ArrayList r13 = r12.f
            int r13 = r13.size()
            r14 = 0
        L_0x007e:
            if (r14 >= r13) goto L_0x0094
            android.view.MenuItem r15 = r12.getItem(r14)
            boolean r16 = r15.hasSubMenu()
            if (r16 == 0) goto L_0x0091
            android.view.SubMenu r9 = r15.getSubMenu()
            if (r1 != r9) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            int r14 = r14 + r7
            r9 = 2
            goto L_0x007e
        L_0x0094:
            r15 = r10
        L_0x0095:
            if (r15 != 0) goto L_0x009d
            r2 = r10
            r17 = 0
            r18 = 1
            goto L_0x00ef
        L_0x009d:
            k.R0 r9 = r11.f3069a
            k.z0 r9 = r9.f3371c
            android.widget.ListAdapter r12 = r9.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto L_0x00b6
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            j.j r12 = (j.C0206j) r12
            goto L_0x00b9
        L_0x00b6:
            j.j r12 = (j.C0206j) r12
            r13 = 0
        L_0x00b9:
            int r14 = r12.getCount()
            r10 = 0
            r17 = 0
        L_0x00c0:
            r2 = -1
            r18 = 1
            if (r10 >= r14) goto L_0x00d0
            j.o r7 = r12.getItem(r10)
            if (r15 != r7) goto L_0x00cc
            goto L_0x00d1
        L_0x00cc:
            int r10 = r10 + 1
            r7 = 1
            goto L_0x00c0
        L_0x00d0:
            r10 = -1
        L_0x00d1:
            if (r10 != r2) goto L_0x00d5
        L_0x00d3:
            r2 = 0
            goto L_0x00ef
        L_0x00d5:
            int r10 = r10 + r13
            int r2 = r9.getFirstVisiblePosition()
            int r10 = r10 - r2
            if (r10 < 0) goto L_0x00d3
            int r2 = r9.getChildCount()
            if (r10 < r2) goto L_0x00e4
            goto L_0x00d3
        L_0x00e4:
            android.view.View r2 = r9.getChildAt(r10)
            goto L_0x00ef
        L_0x00e9:
            r17 = 0
            r18 = 1
            r2 = 0
            r11 = 0
        L_0x00ef:
            if (r2 == 0) goto L_0x01ca
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r7 > r9) goto L_0x010e
            java.lang.reflect.Method r7 = k.R0.f3407E
            if (r7 == 0) goto L_0x0112
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0106 }
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0106 }
            r10[r17] = r9     // Catch:{ Exception -> 0x0106 }
            r7.invoke(r3, r10)     // Catch:{ Exception -> 0x0106 }
            goto L_0x0112
        L_0x0106:
            java.lang.String r7 = "MenuPopupWindow"
            java.lang.String r9 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r7, r9)
            goto L_0x0112
        L_0x010e:
            r7 = 0
            k.O0.a(r3, r7)
        L_0x0112:
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r7 < r9) goto L_0x011c
            r9 = 0
            k.N0.a(r3, r9)
        L_0x011c:
            int r3 = r5.size()
            r18 = 1
            int r3 = r3 + -1
            java.lang.Object r3 = r5.get(r3)
            j.f r3 = (j.C0202f) r3
            k.R0 r3 = r3.f3069a
            k.z0 r3 = r3.f3371c
            r9 = 2
            int[] r10 = new int[r9]
            r3.getLocationOnScreen(r10)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            android.view.View r12 = r0.f3082o
            r12.getWindowVisibleDisplayFrame(r9)
            int r12 = r0.f3083p
            r13 = 1
            if (r12 != r13) goto L_0x0156
            r17 = 0
            r10 = r10[r17]
            int r3 = r3.getWidth()
            int r3 = r3 + r10
            int r3 = r3 + r6
            int r9 = r9.right
            if (r3 <= r9) goto L_0x0154
        L_0x0151:
            r3 = 0
        L_0x0152:
            r9 = 1
            goto L_0x015e
        L_0x0154:
            r3 = 1
            goto L_0x0152
        L_0x0156:
            r17 = 0
            r3 = r10[r17]
            int r3 = r3 - r6
            if (r3 >= 0) goto L_0x0151
            goto L_0x0154
        L_0x015e:
            if (r3 != r9) goto L_0x0162
            r9 = 1
            goto L_0x0163
        L_0x0162:
            r9 = 0
        L_0x0163:
            r0.f3083p = r3
            r3 = 26
            r10 = 5
            if (r7 < r3) goto L_0x016f
            r8.f3382o = r2
            r3 = 0
            r7 = 0
            goto L_0x01a7
        L_0x016f:
            r3 = 2
            int[] r7 = new int[r3]
            android.view.View r12 = r0.f3081n
            r12.getLocationOnScreen(r7)
            int[] r3 = new int[r3]
            r2.getLocationOnScreen(r3)
            int r12 = r0.f3080m
            r12 = r12 & 7
            r17 = 0
            if (r12 != r10) goto L_0x0198
            r12 = r7[r17]
            android.view.View r13 = r0.f3081n
            int r13 = r13.getWidth()
            int r13 = r13 + r12
            r7[r17] = r13
            r12 = r3[r17]
            int r13 = r2.getWidth()
            int r13 = r13 + r12
            r3[r17] = r13
        L_0x0198:
            r12 = r3[r17]
            r13 = r7[r17]
            int r12 = r12 - r13
            r18 = 1
            r3 = r3[r18]
            r7 = r7[r18]
            int r7 = r3 - r7
            r3 = r7
            r7 = r12
        L_0x01a7:
            int r12 = r0.f3080m
            r12 = r12 & r10
            if (r12 != r10) goto L_0x01b6
            if (r9 == 0) goto L_0x01b0
            int r7 = r7 + r6
            goto L_0x01bf
        L_0x01b0:
            int r2 = r2.getWidth()
            int r7 = r7 - r2
            goto L_0x01bf
        L_0x01b6:
            if (r9 == 0) goto L_0x01be
            int r2 = r2.getWidth()
            int r7 = r7 + r2
            goto L_0x01bf
        L_0x01be:
            int r7 = r7 - r6
        L_0x01bf:
            r8.f = r7
            r9 = 1
            r8.f3378k = r9
            r8.f3377j = r9
            r8.m(r3)
            goto L_0x01e8
        L_0x01ca:
            boolean r2 = r0.f3084q
            if (r2 == 0) goto L_0x01d2
            int r2 = r0.f3086s
            r8.f = r2
        L_0x01d2:
            boolean r2 = r0.f3085r
            if (r2 == 0) goto L_0x01db
            int r2 = r0.f3087t
            r8.m(r2)
        L_0x01db:
            android.graphics.Rect r2 = r0.f3162a
            if (r2 == 0) goto L_0x01e5
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>(r2)
            goto L_0x01e6
        L_0x01e5:
            r9 = 0
        L_0x01e6:
            r8.f3391x = r9
        L_0x01e8:
            j.f r2 = new j.f
            int r3 = r0.f3083p
            r2.<init>(r8, r1, r3)
            r5.add(r2)
            r8.f()
            k.z0 r2 = r8.f3371c
            r2.setOnKeyListener(r0)
            if (r11 != 0) goto L_0x0226
            boolean r3 = r0.f3089v
            if (r3 == 0) goto L_0x0226
            java.lang.CharSequence r3 = r1.f3114m
            if (r3 == 0) goto L_0x0226
            r3 = 2131427346(0x7f0b0012, float:1.8476306E38)
            r7 = 0
            android.view.View r3 = r4.inflate(r3, r2, r7)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.setEnabled(r7)
            java.lang.CharSequence r1 = r1.f3114m
            r4.setText(r1)
            r9 = 0
            r2.addHeaderView(r3, r9, r7)
            r8.f()
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0203g.v(j.m):void");
    }
}
