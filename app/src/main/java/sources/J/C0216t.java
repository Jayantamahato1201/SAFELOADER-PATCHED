package j;

import C.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.fragment.app.C0049f;
import java.lang.reflect.Method;

/* renamed from: j.t  reason: case insensitive filesystem */
public final class C0216t extends C0049f implements MenuItem {

    /* renamed from: c  reason: collision with root package name */
    public final a f3160c;

    /* renamed from: d  reason: collision with root package name */
    public Method f3161d;

    public C0216t(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f3160c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f3160c.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f3160c.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        C0212p b = this.f3160c.b();
        if (b != null) {
            return b.f3155a;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f3160c.getActionView();
        if (actionView instanceof C0213q) {
            return (View) ((C0213q) actionView).f3157a;
        }
        return actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f3160c.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f3160c.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f3160c.getContentDescription();
    }

    public final int getGroupId() {
        return this.f3160c.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f3160c.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f3160c.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f3160c.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f3160c.getIntent();
    }

    public final int getItemId() {
        return this.f3160c.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f3160c.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f3160c.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f3160c.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f3160c.getOrder();
    }

    public final SubMenu getSubMenu() {
        return this.f3160c.getSubMenu();
    }

    public final CharSequence getTitle() {
        return this.f3160c.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f3160c.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f3160c.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f3160c.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f3160c.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f3160c.isCheckable();
    }

    public final boolean isChecked() {
        return this.f3160c.isChecked();
    }

    public final boolean isEnabled() {
        return this.f3160c.isEnabled();
    }

    public final boolean isVisible() {
        return this.f3160c.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        C0212p pVar = new C0212p(this, actionProvider);
        if (actionProvider == null) {
            pVar = null;
        }
        this.f3160c.a(pVar);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0213q(view);
        }
        this.f3160c.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f3160c.setAlphabeticShortcut(c2);
        return this;
    }

    public final MenuItem setCheckable(boolean z2) {
        this.f3160c.setCheckable(z2);
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        this.f3160c.setChecked(z2);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3160c.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        this.f3160c.setEnabled(z2);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f3160c.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3160c.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3160c.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f3160c.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.f3160c.setNumericShortcut(c2);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        C0214r rVar;
        if (onActionExpandListener != null) {
            rVar = new C0214r(this, onActionExpandListener);
        } else {
            rVar = null;
        }
        this.f3160c.setOnActionExpandListener(rVar);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        C0215s sVar;
        if (onMenuItemClickListener != null) {
            sVar = new C0215s(this, onMenuItemClickListener);
        } else {
            sVar = null;
        }
        this.f3160c.setOnMenuItemClickListener(sVar);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.f3160c.setShortcut(c2, c3);
        return this;
    }

    public final void setShowAsAction(int i2) {
        this.f3160c.setShowAsAction(i2);
    }

    public final MenuItem setShowAsActionFlags(int i2) {
        this.f3160c.setShowAsActionFlags(i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3160c.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3160c.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3160c.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        return this.f3160c.setVisible(z2);
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f3160c.setAlphabeticShortcut(c2, i2);
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.f3160c.setIcon(i2);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.f3160c.setNumericShortcut(c2, i2);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3160c.setShortcut(c2, c3, i2, i3);
        return this;
    }

    public final MenuItem setTitle(int i2) {
        this.f3160c.setTitle(i2);
        return this;
    }

    public final MenuItem setActionView(int i2) {
        a aVar = this.f3160c;
        aVar.setActionView(i2);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new C0213q(actionView));
        }
        return this;
    }
}
