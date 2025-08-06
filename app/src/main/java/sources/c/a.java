package C;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import j.C0212p;

public interface a extends MenuItem {
    a a(C0212p pVar);

    C0212p b();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    MenuItem setAlphabeticShortcut(char c2, int i2);

    a setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c2, int i2);

    MenuItem setShortcut(char c2, char c3, int i2, int i3);

    a setTooltipText(CharSequence charSequence);
}
