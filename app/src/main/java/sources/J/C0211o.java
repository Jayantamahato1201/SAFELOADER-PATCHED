package j;

import A.i;
import A.j;
import C.a;
import Q0.l;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: j.o  reason: case insensitive filesystem */
public final class C0211o implements a {

    /* renamed from: A  reason: collision with root package name */
    public C0212p f3128A;

    /* renamed from: B  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3129B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f3130C = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f3131a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3132c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3133d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f3134e;
    public CharSequence f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f3135g;

    /* renamed from: h  reason: collision with root package name */
    public char f3136h;

    /* renamed from: i  reason: collision with root package name */
    public int f3137i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f3138j;

    /* renamed from: k  reason: collision with root package name */
    public int f3139k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f3140l;

    /* renamed from: m  reason: collision with root package name */
    public int f3141m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final C0209m f3142n;

    /* renamed from: o  reason: collision with root package name */
    public C0196F f3143o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3144p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f3145q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f3146r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f3147s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f3148t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3149u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3150v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3151w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f3152x = 16;

    /* renamed from: y  reason: collision with root package name */
    public int f3153y;

    /* renamed from: z  reason: collision with root package name */
    public View f3154z;

    public C0211o(C0209m mVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f3142n = mVar;
        this.f3131a = i3;
        this.b = i2;
        this.f3132c = i4;
        this.f3133d = i5;
        this.f3134e = charSequence;
        this.f3153y = i6;
    }

    public static void c(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final a a(C0212p pVar) {
        this.f3154z = null;
        this.f3128A = pVar;
        this.f3142n.p(true);
        C0212p pVar2 = this.f3128A;
        if (pVar2 != null) {
            pVar2.f3156c = new j(27, (Object) this);
            pVar2.f3155a.setVisibilityListener(pVar2);
        }
        return this;
    }

    public final C0212p b() {
        return this.f3128A;
    }

    public final boolean collapseActionView() {
        if ((this.f3153y & 8) == 0) {
            return false;
        }
        if (this.f3154z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3129B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3142n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f3151w && (this.f3149u || this.f3150v)) {
            drawable = i.y0(drawable).mutate();
            if (this.f3149u) {
                B.a.h(drawable, this.f3147s);
            }
            if (this.f3150v) {
                B.a.i(drawable, this.f3148t);
            }
            this.f3151w = false;
        }
        return drawable;
    }

    public final boolean e() {
        C0212p pVar;
        if ((this.f3153y & 8) == 0) {
            return false;
        }
        if (this.f3154z == null && (pVar = this.f3128A) != null) {
            this.f3154z = pVar.a(this);
        }
        if (this.f3154z != null) {
            return true;
        }
        return false;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3129B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3142n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f3152x |= 32;
        } else {
            this.f3152x &= -33;
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f3154z;
        if (view != null) {
            return view;
        }
        C0212p pVar = this.f3128A;
        if (pVar == null) {
            return null;
        }
        View a2 = pVar.a(this);
        this.f3154z = a2;
        return a2;
    }

    public final int getAlphabeticModifiers() {
        return this.f3139k;
    }

    public final char getAlphabeticShortcut() {
        return this.f3138j;
    }

    public final CharSequence getContentDescription() {
        return this.f3145q;
    }

    public final int getGroupId() {
        return this.b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f3140l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.f3141m;
        if (i2 == 0) {
            return null;
        }
        Drawable v2 = l.v(this.f3142n.f3104a, i2);
        this.f3141m = 0;
        this.f3140l = v2;
        return d(v2);
    }

    public final ColorStateList getIconTintList() {
        return this.f3147s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f3148t;
    }

    public final Intent getIntent() {
        return this.f3135g;
    }

    public final int getItemId() {
        return this.f3131a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f3137i;
    }

    public final char getNumericShortcut() {
        return this.f3136h;
    }

    public final int getOrder() {
        return this.f3132c;
    }

    public final SubMenu getSubMenu() {
        return this.f3143o;
    }

    public final CharSequence getTitle() {
        return this.f3134e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f3134e;
    }

    public final CharSequence getTooltipText() {
        return this.f3146r;
    }

    public final boolean hasSubMenu() {
        if (this.f3143o != null) {
            return true;
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.f3130C;
    }

    public final boolean isCheckable() {
        if ((this.f3152x & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f3152x & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f3152x & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        C0212p pVar = this.f3128A;
        if (pVar == null || !pVar.f3155a.overridesItemVisibility()) {
            if ((this.f3152x & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f3152x & 8) != 0 || !this.f3128A.f3155a.isVisible()) {
            return false;
        } else {
            return true;
        }
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(View view) {
        int i2;
        this.f3154z = view;
        this.f3128A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f3131a) > 0) {
            view.setId(i2);
        }
        C0209m mVar = this.f3142n;
        mVar.f3112k = true;
        mVar.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f3138j == c2) {
            return this;
        }
        this.f3138j = Character.toLowerCase(c2);
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f3152x;
        boolean z3 = z2 | (i2 & true);
        this.f3152x = z3 ? 1 : 0;
        if (i2 != z3) {
            this.f3142n.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        boolean z3;
        int i2;
        int i3 = this.f3152x;
        int i4 = 2;
        if ((i3 & 4) != 0) {
            C0209m mVar = this.f3142n;
            mVar.getClass();
            ArrayList arrayList = mVar.f;
            int size = arrayList.size();
            mVar.w();
            for (int i5 = 0; i5 < size; i5++) {
                C0211o oVar = (C0211o) arrayList.get(i5);
                if (oVar.b == this.b && (oVar.f3152x & 4) != 0 && oVar.isCheckable()) {
                    if (oVar == this) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i6 = oVar.f3152x;
                    int i7 = i6 & -3;
                    if (z3) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    int i8 = i2 | i7;
                    oVar.f3152x = i8;
                    if (i6 != i8) {
                        oVar.f3142n.p(false);
                    }
                }
            }
            mVar.v();
            return this;
        }
        int i9 = i3 & -3;
        if (!z2) {
            i4 = 0;
        }
        int i10 = i9 | i4;
        this.f3152x = i10;
        if (i3 != i10) {
            this.f3142n.p(false);
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f3152x |= 16;
        } else {
            this.f3152x &= -17;
        }
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f3141m = 0;
        this.f3140l = drawable;
        this.f3151w = true;
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3147s = colorStateList;
        this.f3149u = true;
        this.f3151w = true;
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3148t = mode;
        this.f3150v = true;
        this.f3151w = true;
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f3135g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.f3136h == c2) {
            return this;
        }
        this.f3136h = c2;
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3129B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3144p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.f3136h = c2;
        this.f3138j = Character.toLowerCase(c3);
        this.f3142n.p(false);
        return this;
    }

    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.f3153y = i2;
            C0209m mVar = this.f3142n;
            mVar.f3112k = true;
            mVar.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3134e = charSequence;
        this.f3142n.p(false);
        C0196F f2 = this.f3143o;
        if (f2 != null) {
            f2.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        int i2;
        int i3 = this.f3152x;
        int i4 = i3 & -9;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        int i5 = i2 | i4;
        this.f3152x = i5;
        if (i3 != i5) {
            C0209m mVar = this.f3142n;
            mVar.f3109h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3134e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final a setContentDescription(CharSequence charSequence) {
        this.f3145q = charSequence;
        this.f3142n.p(false);
        return this;
    }

    public final a setTooltipText(CharSequence charSequence) {
        this.f3146r = charSequence;
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f3138j == c2 && this.f3139k == i2) {
            return this;
        }
        this.f3138j = Character.toLowerCase(c2);
        this.f3139k = KeyEvent.normalizeMetaState(i2);
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f3136h == c2 && this.f3137i == i2) {
            return this;
        }
        this.f3136h = c2;
        this.f3137i = KeyEvent.normalizeMetaState(i2);
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3136h = c2;
        this.f3137i = KeyEvent.normalizeMetaState(i2);
        this.f3138j = Character.toLowerCase(c3);
        this.f3139k = KeyEvent.normalizeMetaState(i3);
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.f3140l = null;
        this.f3141m = i2;
        this.f3151w = true;
        this.f3142n.p(false);
        return this;
    }

    public final MenuItem setTitle(int i2) {
        setTitle((CharSequence) this.f3142n.f3104a.getString(i2));
        return this;
    }

    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f3142n.f3104a;
        View inflate = LayoutInflater.from(context).inflate(i2, new LinearLayout(context), false);
        this.f3154z = inflate;
        this.f3128A = null;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f3131a) > 0) {
            inflate.setId(i3);
        }
        C0209m mVar = this.f3142n;
        mVar.f3112k = true;
        mVar.p(true);
        return this;
    }
}
