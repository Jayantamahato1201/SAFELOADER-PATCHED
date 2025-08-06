package j;

import I.Q;
import I.T;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import y.C0498a;

/* renamed from: j.m  reason: case insensitive filesystem */
public class C0209m implements Menu {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f3103y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f3104a;
    public final Resources b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3105c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3106d;

    /* renamed from: e  reason: collision with root package name */
    public C0207k f3107e;
    public final ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f3108g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3109h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f3110i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f3111j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3112k;

    /* renamed from: l  reason: collision with root package name */
    public int f3113l = 0;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f3114m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f3115n;

    /* renamed from: o  reason: collision with root package name */
    public View f3116o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3117p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3118q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3119r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3120s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f3121t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList f3122u = new CopyOnWriteArrayList();

    /* renamed from: v  reason: collision with root package name */
    public C0211o f3123v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3124w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3125x;

    public C0209m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f3104a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.f3108g = new ArrayList();
        this.f3109h = true;
        this.f3110i = new ArrayList();
        this.f3111j = new ArrayList();
        this.f3112k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = T.f398a;
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = Q.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier == 0 || !resources2.getBoolean(identifier)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f3106d = z3;
    }

    public final C0211o a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = (-65536 & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f3103y[i6] << 16) | (65535 & i4);
        C0211o oVar = new C0211o(this, i2, i3, i4, i7, charSequence, this.f3113l);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            } else if (((C0211o) arrayList.get(size)).f3133d <= i7) {
                i5 = size + 1;
                break;
            } else {
                size--;
            }
        }
        arrayList.add(i5, oVar);
        p(true);
        return oVar;
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f3104a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            j.o r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.f3135g = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0209m.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(z zVar, Context context) {
        this.f3122u.add(new WeakReference(zVar));
        zVar.c(context, this);
        this.f3112k = true;
    }

    public final void c(boolean z2) {
        if (!this.f3120s) {
            this.f3120s = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3122u;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zVar.a(this, z2);
                }
            }
            this.f3120s = false;
        }
    }

    public final void clear() {
        C0211o oVar = this.f3123v;
        if (oVar != null) {
            d(oVar);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f3115n = null;
        this.f3114m = null;
        this.f3116o = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(C0211o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3122u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3123v == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = zVar.h(oVar);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f3123v = null;
            }
        }
        return z2;
    }

    public boolean e(C0209m mVar, MenuItem menuItem) {
        C0207k kVar = this.f3107e;
        if (kVar == null || !kVar.f(mVar, menuItem)) {
            return false;
        }
        return true;
    }

    public boolean f(C0211o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3122u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = zVar.e(oVar);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f3123v = oVar;
        }
        return z2;
    }

    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0211o oVar = (C0211o) arrayList.get(i3);
            if (oVar.f3131a == i2) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f3143o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0211o g(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList arrayList = this.f3121t;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0211o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i3 = 0; i3 < size; i3++) {
            C0211o oVar = (C0211o) arrayList.get(i3);
            if (n2) {
                c2 = oVar.f3138j;
            } else {
                c2 = oVar.f3136h;
            }
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == 8 && i2 == 67))) {
                return oVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f.get(i2);
    }

    public final void h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        char c2;
        int i3;
        ArrayList arrayList2 = arrayList;
        int i4 = i2;
        KeyEvent keyEvent2 = keyEvent;
        boolean n2 = n();
        int modifiers = keyEvent2.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent2.getKeyData(keyData) || i4 == 67) {
            ArrayList arrayList3 = this.f;
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                C0211o oVar = (C0211o) arrayList3.get(i5);
                if (oVar.hasSubMenu()) {
                    oVar.f3143o.h(arrayList2, i4, keyEvent2);
                }
                if (n2) {
                    c2 = oVar.f3138j;
                } else {
                    c2 = oVar.f3136h;
                }
                if (n2) {
                    i3 = oVar.f3139k;
                } else {
                    i3 = oVar.f3137i;
                }
                if ((modifiers & 69647) == (i3 & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n2 && c2 == 8 && i4 == 67)) && oVar.isEnabled()) {
                        arrayList2.add(oVar);
                    }
                }
            }
            return;
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f3125x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0211o) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f3112k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3122u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= zVar.d();
                }
            }
            ArrayList arrayList = this.f3110i;
            ArrayList arrayList2 = this.f3111j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0211o oVar = (C0211o) l2.get(i2);
                    if ((oVar.f3152x & 32) == 32) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f3112k = false;
        }
    }

    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        if (g(i2, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z2 = this.f3109h;
        ArrayList arrayList = this.f3108g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0211o oVar = (C0211o) arrayList2.get(i2);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.f3109h = false;
        this.f3112k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f3124w;
    }

    public boolean n() {
        return this.f3105c;
    }

    public boolean o() {
        return this.f3106d;
    }

    public final void p(boolean z2) {
        if (!this.f3117p) {
            if (z2) {
                this.f3109h = true;
                this.f3112k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3122u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    z zVar = (z) weakReference.get();
                    if (zVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        zVar.g();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f3118q = true;
        if (z2) {
            this.f3119r = true;
        }
    }

    public final boolean performIdentifierAction(int i2, int i3) {
        return q(findItem(i2), (z) null, i3);
    }

    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        boolean z2;
        C0211o g2 = g(i2, keyEvent);
        if (g2 != null) {
            z2 = q(g2, (z) null, i3);
        } else {
            z2 = false;
        }
        if ((i3 & 2) != 0) {
            c(true);
        }
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MenuItem r7, j.z r8, int r9) {
        /*
            r6 = this;
            j.o r7 = (j.C0211o) r7
            r0 = 0
            if (r7 == 0) goto L_0x00d4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00d4
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f3144p
            r2 = 1
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r1 = 1
            goto L_0x0043
        L_0x001a:
            j.m r1 = r7.f3142n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L_0x0023
            goto L_0x0018
        L_0x0023:
            android.content.Intent r3 = r7.f3135g
            if (r3 == 0) goto L_0x0035
            android.content.Context r1 = r1.f3104a     // Catch:{ ActivityNotFoundException -> 0x002d }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x002d }
            goto L_0x0018
        L_0x002d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0035:
            j.p r1 = r7.f3128A
            if (r1 == 0) goto L_0x0042
            android.view.ActionProvider r1 = r1.f3155a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L_0x0042
            goto L_0x0018
        L_0x0042:
            r1 = 0
        L_0x0043:
            j.p r3 = r7.f3128A
            if (r3 == 0) goto L_0x0051
            android.view.ActionProvider r4 = r3.f3155a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x0064
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00d3
            r6.c(r2)
            goto L_0x00d3
        L_0x0064:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0075
            if (r4 == 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00d3
            r6.c(r2)
            goto L_0x00d3
        L_0x0075:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x007c
            r6.c(r0)
        L_0x007c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0090
            j.F r9 = new j.F
            android.content.Context r5 = r6.f3104a
            r9.<init>(r5, r6, r7)
            r7.f3143o = r9
            java.lang.CharSequence r5 = r7.f3134e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0090:
            j.F r7 = r7.f3143o
            if (r4 == 0) goto L_0x009b
            j.t r9 = r3.b
            android.view.ActionProvider r9 = r3.f3155a
            r9.onPrepareSubMenu(r7)
        L_0x009b:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f3122u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x00a4
            goto L_0x00cd
        L_0x00a4:
            if (r8 == 0) goto L_0x00aa
            boolean r0 = r8.k(r7)
        L_0x00aa:
            java.util.Iterator r8 = r9.iterator()
        L_0x00ae:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00cd
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            j.z r4 = (j.z) r4
            if (r4 != 0) goto L_0x00c6
            r9.remove(r3)
            goto L_0x00ae
        L_0x00c6:
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r4.k(r7)
            goto L_0x00ae
        L_0x00cd:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00d3
            r6.c(r2)
        L_0x00d3:
            return r1
        L_0x00d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0209m.q(android.view.MenuItem, j.z, int):boolean");
    }

    public final void r(z zVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3122u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar2 = (z) weakReference.get();
            if (zVar2 == null || zVar2 == zVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((C0211o) arrayList.get(i4)).b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((C0211o) arrayList.get(i4)).b != i2) {
                    p(true);
                } else {
                    if (i4 >= 0) {
                        ArrayList arrayList2 = this.f;
                        if (i4 < arrayList2.size()) {
                            arrayList2.remove(i4);
                        }
                    }
                    i3 = i5;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0211o) arrayList.get(i3)).f3131a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i3 < arrayList2.size()) {
                arrayList2.remove(i3);
                p(true);
            }
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0196F) item.getSubMenu()).s(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int i3;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0211o oVar = (C0211o) arrayList.get(i4);
            if (oVar.b == i2) {
                int i5 = oVar.f3152x & -5;
                if (z3) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                oVar.f3152x = i5 | i3;
                oVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.f3124w = z2;
    }

    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0211o oVar = (C0211o) arrayList.get(i3);
            if (oVar.b == i2) {
                oVar.setEnabled(z2);
            }
        }
    }

    public final void setGroupVisible(int i2, boolean z2) {
        int i3;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C0211o oVar = (C0211o) arrayList.get(i4);
            if (oVar.b == i2) {
                int i5 = oVar.f3152x;
                int i6 = i5 & -9;
                if (z2) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                int i7 = i6 | i3;
                oVar.f3152x = i7;
                if (i5 != i7) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.f3105c = z2;
        p(false);
    }

    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0196F) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.f3116o = view;
            this.f3114m = null;
            this.f3115n = null;
        } else {
            if (i2 > 0) {
                this.f3114m = this.b.getText(i2);
            } else if (charSequence != null) {
                this.f3114m = charSequence;
            }
            if (i3 > 0) {
                this.f3115n = C0498a.b(this.f3104a, i3);
            } else if (drawable != null) {
                this.f3115n = drawable;
            }
            this.f3116o = null;
        }
        p(false);
    }

    public final void v() {
        this.f3117p = false;
        if (this.f3118q) {
            this.f3118q = false;
            p(this.f3119r);
        }
    }

    public final void w() {
        if (!this.f3117p) {
            this.f3117p = true;
            this.f3118q = false;
            this.f3119r = false;
        }
    }

    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.b.getString(i2));
    }

    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.b.getString(i2));
    }

    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C0211o a2 = a(i2, i3, i4, charSequence);
        C0196F f2 = new C0196F(this.f3104a, this, a2);
        a2.f3143o = f2;
        f2.setHeaderTitle(a2.f3134e);
        return f2;
    }

    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.b.getString(i5));
    }

    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.b.getString(i5));
    }

    public C0209m k() {
        return this;
    }
}
