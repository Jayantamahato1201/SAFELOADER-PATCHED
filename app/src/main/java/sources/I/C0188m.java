package i;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: i.m  reason: case insensitive filesystem */
public abstract class C0188m {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i2) {
        callback.onProvideKeyboardShortcuts(list, menu, i2);
    }
}
