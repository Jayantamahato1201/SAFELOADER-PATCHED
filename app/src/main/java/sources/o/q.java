package O;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class q implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final ActionMode.Callback f634a;
    public final TextView b;

    /* renamed from: c  reason: collision with root package name */
    public Class f635c;

    /* renamed from: d  reason: collision with root package name */
    public Method f636d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f637e;
    public boolean f = false;

    public q(ActionMode.Callback callback, TextView textView) {
        this.f634a = callback;
        this.b = textView;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f634a.onActionItemClicked(actionMode, menuItem);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f634a.onCreateActionMode(actionMode, menu);
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f634a.onDestroyActionMode(actionMode);
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method method;
        boolean z2;
        TextView textView = this.b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z3 = this.f;
        Class cls = Integer.TYPE;
        if (!z3) {
            this.f = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f635c = cls2;
                this.f636d = cls2.getDeclaredMethod("removeItemAt", new Class[]{cls});
                this.f637e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f635c = null;
                this.f636d = null;
                this.f637e = false;
            }
        }
        try {
            if (!this.f637e || !this.f635c.isInstance(menu)) {
                method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{cls});
            } else {
                method = this.f636d;
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    method.invoke(menu, new Object[]{Integer.valueOf(size)});
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo next : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(next.activityInfo.packageName)) {
                        ActivityInfo activityInfo = next.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (!(str == null || context.checkSelfPermission(str) == 0)) {
                            }
                        }
                    }
                    arrayList.add(next);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i2);
                MenuItem add = menu.add(0, 0, i2 + 100, resolveInfo.loadLabel(packageManager));
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z2);
                ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f634a.onPrepareActionMode(actionMode, menu);
    }
}
