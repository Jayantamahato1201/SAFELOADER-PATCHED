package j;

import C.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.fragment.app.C0049f;
import n.k;

/* renamed from: j.C  reason: case insensitive filesystem */
public class C0193C extends C0049f implements Menu {

    /* renamed from: c  reason: collision with root package name */
    public final C0209m f3029c;

    public C0193C(Context context, C0209m mVar) {
        super(context);
        if (mVar != null) {
            this.f3029c = mVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return g(this.f3029c.a(0, 0, 0, charSequence));
    }

    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr4 = menuItemArr2;
        int addIntentOptions = this.f3029c.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr4);
        if (menuItemArr4 != null) {
            int length = menuItemArr4.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr3[i6] = g(menuItemArr4[i6]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f3029c.addSubMenu(0, 0, 0, charSequence);
    }

    public final void clear() {
        k kVar = (k) this.b;
        if (kVar != null) {
            kVar.clear();
        }
        this.f3029c.clear();
    }

    public final void close() {
        this.f3029c.close();
    }

    public final MenuItem findItem(int i2) {
        return g(this.f3029c.findItem(i2));
    }

    public final MenuItem getItem(int i2) {
        return g(this.f3029c.getItem(i2));
    }

    public final boolean hasVisibleItems() {
        return this.f3029c.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f3029c.isShortcutKey(i2, keyEvent);
    }

    public final boolean performIdentifierAction(int i2, int i3) {
        return this.f3029c.performIdentifierAction(i2, i3);
    }

    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f3029c.performShortcut(i2, keyEvent, i3);
    }

    public final void removeGroup(int i2) {
        if (((k) this.b) != null) {
            int i3 = 0;
            while (true) {
                k kVar = (k) this.b;
                if (i3 >= kVar.f3706h) {
                    break;
                }
                if (((a) kVar.h(i3)).getGroupId() == i2) {
                    ((k) this.b).i(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.f3029c.removeGroup(i2);
    }

    public final void removeItem(int i2) {
        if (((k) this.b) != null) {
            int i3 = 0;
            while (true) {
                k kVar = (k) this.b;
                if (i3 >= kVar.f3706h) {
                    break;
                } else if (((a) kVar.h(i3)).getItemId() == i2) {
                    ((k) this.b).i(i3);
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f3029c.removeItem(i2);
    }

    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        this.f3029c.setGroupCheckable(i2, z2, z3);
    }

    public final void setGroupEnabled(int i2, boolean z2) {
        this.f3029c.setGroupEnabled(i2, z2);
    }

    public final void setGroupVisible(int i2, boolean z2) {
        this.f3029c.setGroupVisible(i2, z2);
    }

    public final void setQwertyMode(boolean z2) {
        this.f3029c.setQwertyMode(z2);
    }

    public final int size() {
        return this.f3029c.size();
    }

    public final SubMenu addSubMenu(int i2) {
        return this.f3029c.addSubMenu(i2);
    }

    public final MenuItem add(int i2) {
        return g(this.f3029c.add(i2));
    }

    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return this.f3029c.addSubMenu(i2, i3, i4, charSequence);
    }

    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return g(this.f3029c.a(i2, i3, i4, charSequence));
    }

    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return this.f3029c.addSubMenu(i2, i3, i4, i5);
    }

    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return g(this.f3029c.add(i2, i3, i4, i5));
    }
}
