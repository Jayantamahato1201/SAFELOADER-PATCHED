package k;

import A.j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.cheatbox.R;
import j.C0191A;
import j.C0192B;
import j.C0196F;
import j.C0209m;
import j.C0211o;
import j.C0212p;
import j.C0217u;
import j.y;
import j.z;
import java.util.ArrayList;

/* renamed from: k.j  reason: case insensitive filesystem */
public final class C0248j implements z {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3475a;
    public Context b;

    /* renamed from: c  reason: collision with root package name */
    public C0209m f3476c;

    /* renamed from: d  reason: collision with root package name */
    public final LayoutInflater f3477d;

    /* renamed from: e  reason: collision with root package name */
    public y f3478e;
    public final int f = R.layout.MT_Bin;

    /* renamed from: g  reason: collision with root package name */
    public final int f3479g = R.layout.MT_Bin;

    /* renamed from: h  reason: collision with root package name */
    public C0192B f3480h;

    /* renamed from: i  reason: collision with root package name */
    public C0246i f3481i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f3482j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3483k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3484l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3485m;

    /* renamed from: n  reason: collision with root package name */
    public int f3486n;

    /* renamed from: o  reason: collision with root package name */
    public int f3487o;

    /* renamed from: p  reason: collision with root package name */
    public int f3488p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3489q;

    /* renamed from: r  reason: collision with root package name */
    public final SparseBooleanArray f3490r = new SparseBooleanArray();

    /* renamed from: s  reason: collision with root package name */
    public C0240f f3491s;

    /* renamed from: t  reason: collision with root package name */
    public C0240f f3492t;

    /* renamed from: u  reason: collision with root package name */
    public C0244h f3493u;

    /* renamed from: v  reason: collision with root package name */
    public C0242g f3494v;

    /* renamed from: w  reason: collision with root package name */
    public final j f3495w = new j(28, (Object) this);

    public C0248j(Context context) {
        this.f3475a = context;
        this.f3477d = LayoutInflater.from(context);
    }

    public final void a(C0209m mVar, boolean z2) {
        f();
        C0240f fVar = this.f3492t;
        if (fVar != null && fVar.b()) {
            fVar.f3170i.dismiss();
        }
        y yVar = this.f3478e;
        if (yVar != null) {
            yVar.a(mVar, z2);
        }
    }

    public final View b(C0211o oVar, View view, ViewGroup viewGroup) {
        C0191A a2;
        View actionView = oVar.getActionView();
        int i2 = 0;
        if (actionView == null || oVar.e()) {
            if (view instanceof C0191A) {
                a2 = (C0191A) view;
            } else {
                a2 = (C0191A) this.f3477d.inflate(this.f3479g, viewGroup, false);
            }
            a2.d(oVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) a2;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f3480h);
            if (this.f3494v == null) {
                this.f3494v = new C0242g(this);
            }
            actionMenuItemView.setPopupCallback(this.f3494v);
            actionView = (View) a2;
        }
        if (oVar.f3130C) {
            i2 = 8;
        }
        actionView.setVisibility(i2);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0252l)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public final void c(Context context, C0209m mVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.f3476c = mVar;
        Resources resources = context.getResources();
        if (!this.f3485m) {
            this.f3484l = true;
        }
        int i2 = 2;
        this.f3486n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f3488p = i2;
        int i5 = this.f3486n;
        if (this.f3484l) {
            if (this.f3481i == null) {
                C0246i iVar = new C0246i(this, this.f3475a);
                this.f3481i = iVar;
                if (this.f3483k) {
                    iVar.setImageDrawable(this.f3482j);
                    this.f3482j = null;
                    this.f3483k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3481i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f3481i.getMeasuredWidth();
        } else {
            this.f3481i = null;
        }
        this.f3487o = i5;
        float f2 = resources.getDisplayMetrics().density;
    }

    public final boolean d() {
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C0248j jVar = this;
        C0209m mVar = jVar.f3476c;
        if (mVar != null) {
            arrayList = mVar.l();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i4 = jVar.f3488p;
        int i5 = jVar.f3487o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) jVar.f3480h;
        int i6 = 0;
        boolean z6 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            C0211o oVar = (C0211o) arrayList.get(i6);
            int i9 = oVar.f3153y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z6 = true;
            }
            if (jVar.f3489q && oVar.f3130C) {
                i4 = 0;
            }
            i6++;
        }
        if (jVar.f3484l && (z6 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = jVar.f3490r;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            C0211o oVar2 = (C0211o) arrayList.get(i11);
            int i13 = oVar2.f3153y;
            if ((i13 & 2) == i3) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i14 = oVar2.b;
            if (z3) {
                View b2 = jVar.b(oVar2, (View) null, viewGroup);
                b2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                oVar2.f(z2);
            } else if ((i13 & true) == z2) {
                boolean z7 = sparseBooleanArray.get(i14);
                if ((i10 > 0 || z7) && i5 > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    View b3 = jVar.b(oVar2, (View) null, viewGroup);
                    b3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b3.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    if (i5 + i12 > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z4 &= z5;
                }
                if (z4 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z7) {
                    sparseBooleanArray.put(i14, false);
                    int i15 = 0;
                    while (i15 < i11) {
                        C0211o oVar3 = (C0211o) arrayList.get(i15);
                        if (oVar3.b == i14) {
                            if ((oVar3.f3152x & 32) == 32) {
                                i10++;
                            }
                            oVar3.f(false);
                        }
                        i15++;
                    }
                }
                if (z4) {
                    i10--;
                }
                oVar2.f(z4);
            } else {
                oVar2.f(false);
                i11++;
                i3 = 2;
                jVar = this;
                z2 = true;
            }
            i11++;
            i3 = 2;
            jVar = this;
            z2 = true;
        }
        return true;
    }

    public final boolean e(C0211o oVar) {
        return false;
    }

    public final boolean f() {
        C0192B b2;
        C0244h hVar = this.f3493u;
        if (hVar == null || (b2 = this.f3480h) == null) {
            C0240f fVar = this.f3491s;
            if (fVar == null) {
                return false;
            }
            if (fVar.b()) {
                fVar.f3170i.dismiss();
            }
            return true;
        }
        ((View) b2).removeCallbacks(hVar);
        this.f3493u = null;
        return true;
    }

    public final void g() {
        C0192B b2;
        int i2;
        C0211o oVar;
        ViewGroup viewGroup = (ViewGroup) this.f3480h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            C0209m mVar = this.f3476c;
            if (mVar != null) {
                mVar.i();
                ArrayList l2 = this.f3476c.l();
                int size = l2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0211o oVar2 = (C0211o) l2.get(i3);
                    if ((oVar2.f3152x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof C0191A) {
                            oVar = ((C0191A) childAt).getItemData();
                        } else {
                            oVar = null;
                        }
                        View b3 = b(oVar2, childAt, viewGroup);
                        if (oVar2 != oVar) {
                            b3.setPressed(false);
                            b3.jumpDrawablesToCurrentState();
                        }
                        if (b3 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b3.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b3);
                            }
                            ((ViewGroup) this.f3480h).addView(b3, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f3481i) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.f3480h).requestLayout();
        C0209m mVar2 = this.f3476c;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f3110i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C0212p pVar = ((C0211o) arrayList2.get(i4)).f3128A;
            }
        }
        C0209m mVar3 = this.f3476c;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f3111j;
        }
        if (this.f3484l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0211o) arrayList.get(0)).f3130C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f3481i == null) {
                this.f3481i = new C0246i(this, this.f3475a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f3481i.getParent();
            if (viewGroup3 != this.f3480h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f3481i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f3480h;
                C0246i iVar = this.f3481i;
                actionMenuView.getClass();
                C0252l l3 = ActionMenuView.l();
                l3.f3517a = true;
                actionMenuView.addView(iVar, l3);
            }
        } else {
            C0246i iVar2 = this.f3481i;
            if (iVar2 != null && iVar2.getParent() == (b2 = this.f3480h)) {
                ((ViewGroup) b2).removeView(this.f3481i);
            }
        }
        ((ActionMenuView) this.f3480h).setOverflowReserved(this.f3484l);
    }

    public final boolean h(C0211o oVar) {
        return false;
    }

    public final void i(y yVar) {
        throw null;
    }

    public final boolean j() {
        C0240f fVar = this.f3491s;
        if (fVar == null || !fVar.b()) {
            return false;
        }
        return true;
    }

    public final boolean k(C0196F f2) {
        boolean z2;
        if (f2.hasVisibleItems()) {
            C0196F f3 = f2;
            while (true) {
                C0209m mVar = f3.f3048z;
                if (mVar == this.f3476c) {
                    break;
                }
                f3 = mVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f3480h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof C0191A) && ((C0191A) childAt).getItemData() == f3.f3047A) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view != null) {
                f2.f3047A.getClass();
                int size = f2.f.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = f2.getItem(i3);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                C0240f fVar = new C0240f(this, this.b, f2, view);
                this.f3492t = fVar;
                fVar.f3168g = z2;
                C0217u uVar = fVar.f3170i;
                if (uVar != null) {
                    uVar.o(z2);
                }
                C0240f fVar2 = this.f3492t;
                if (!fVar2.b()) {
                    if (fVar2.f3167e != null) {
                        fVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                y yVar = this.f3478e;
                if (yVar != null) {
                    yVar.b(f2);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        C0209m mVar;
        if (!this.f3484l || j() || (mVar = this.f3476c) == null || this.f3480h == null || this.f3493u != null) {
            return false;
        }
        mVar.i();
        if (mVar.f3111j.isEmpty()) {
            return false;
        }
        C0244h hVar = new C0244h(this, new C0240f(this, this.b, this.f3476c, (View) this.f3481i));
        this.f3493u = hVar;
        ((View) this.f3480h).post(hVar);
        return true;
    }
}
