package j;

import A.i;
import C.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import y.C0498a;

/* renamed from: j.a  reason: case insensitive filesystem */
public final class C0197a implements a {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f3049a;
    public CharSequence b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f3050c;

    /* renamed from: d  reason: collision with root package name */
    public char f3051d;

    /* renamed from: e  reason: collision with root package name */
    public int f3052e;
    public char f;

    /* renamed from: g  reason: collision with root package name */
    public int f3053g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f3054h;

    /* renamed from: i  reason: collision with root package name */
    public Context f3055i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f3056j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f3057k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3058l;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f3059m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3060n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3061o;

    /* renamed from: p  reason: collision with root package name */
    public int f3062p;

    public final a a(C0212p pVar) {
        throw new UnsupportedOperationException();
    }

    public final C0212p b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f3054h;
        if (drawable == null) {
            return;
        }
        if (this.f3060n || this.f3061o) {
            Drawable y02 = i.y0(drawable);
            this.f3054h = y02;
            Drawable mutate = y02.mutate();
            this.f3054h = mutate;
            if (this.f3060n) {
                B.a.h(mutate, this.f3058l);
            }
            if (this.f3061o) {
                B.a.i(this.f3054h, this.f3059m);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f3053g;
    }

    public final char getAlphabeticShortcut() {
        return this.f;
    }

    public final CharSequence getContentDescription() {
        return this.f3056j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f3054h;
    }

    public final ColorStateList getIconTintList() {
        return this.f3058l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f3059m;
    }

    public final Intent getIntent() {
        return this.f3050c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f3052e;
    }

    public final char getNumericShortcut() {
        return this.f3051d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f3049a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f3049a;
    }

    public final CharSequence getTooltipText() {
        return this.f3057k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        if ((this.f3062p & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f3062p & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f3062p & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        if ((this.f3062p & 8) == 0) {
            return true;
        }
        return false;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setCheckable(boolean z2) {
        this.f3062p = z2 | (this.f3062p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        int i2;
        int i3 = this.f3062p & -3;
        if (z2) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.f3062p = i2 | i3;
        return this;
    }

    public final a setContentDescription(CharSequence charSequence) {
        this.f3056j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        int i2;
        int i3 = this.f3062p & -17;
        if (z2) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        this.f3062p = i2 | i3;
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f3054h = drawable;
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3058l = colorStateList;
        this.f3060n = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3059m = mode;
        this.f3061o = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f3050c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.f3051d = c2;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.f3051d = c2;
        this.f = Character.toLowerCase(c3);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3049a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public final a setTooltipText(CharSequence charSequence) {
        this.f3057k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        int i2 = 8;
        int i3 = this.f3062p & 8;
        if (z2) {
            i2 = 0;
        }
        this.f3062p = i3 | i2;
        return this;
    }

    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f = Character.toLowerCase(c2);
        this.f3053g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final MenuItem m10setContentDescription(CharSequence charSequence) {
        this.f3056j = charSequence;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.f3051d = c2;
        this.f3052e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setTitle(int i2) {
        this.f3049a = this.f3055i.getResources().getString(i2);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final MenuItem m11setTooltipText(CharSequence charSequence) {
        this.f3057k = charSequence;
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.f3054h = C0498a.b(this.f3055i, i2);
        c();
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3051d = c2;
        this.f3052e = KeyEvent.normalizeMetaState(i2);
        this.f = Character.toLowerCase(c3);
        this.f3053g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final void setShowAsAction(int i2) {
    }

    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }
}
