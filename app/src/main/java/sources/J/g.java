package J;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final g f478e = new g(16);
    public static final g f = new g(4096);

    /* renamed from: g  reason: collision with root package name */
    public static final g f479g = new g(8192);

    /* renamed from: h  reason: collision with root package name */
    public static final g f480h = new g(262144);

    /* renamed from: i  reason: collision with root package name */
    public static final g f481i = new g(524288);

    /* renamed from: j  reason: collision with root package name */
    public static final g f482j = new g(1048576);

    /* renamed from: k  reason: collision with root package name */
    public static final g f483k;

    /* renamed from: l  reason: collision with root package name */
    public static final g f484l;

    /* renamed from: a  reason: collision with root package name */
    public final Object f485a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f486c;

    /* renamed from: d  reason: collision with root package name */
    public final v f487d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        new g(1);
        new g(2);
        new g(4);
        new g(8);
        new g(32);
        new g(64);
        new g(128);
        Class<o> cls = o.class;
        new g(256, cls);
        new g(512, cls);
        Class<p> cls2 = p.class;
        new g(1024, cls2);
        new g(2048, cls2);
        new g(16384);
        new g(32768);
        new g(65536);
        new g(131072, t.class);
        new g(2097152, u.class);
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22 = null;
        if (i2 >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        new g(accessibilityAction, 16908342, (String) null, (v) null, (Class) null);
        if (i2 >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        new g(accessibilityAction2, 16908343, (String) null, (v) null, r.class);
        if (i2 >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        f483k = new g(accessibilityAction3, 16908344, (String) null, (v) null, (Class) null);
        if (i2 >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        new g(accessibilityAction4, 16908345, (String) null, (v) null, (Class) null);
        if (i2 >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        f484l = new g(accessibilityAction5, 16908346, (String) null, (v) null, (Class) null);
        if (i2 >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        new g(accessibilityAction6, 16908347, (String) null, (v) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction7 = null;
        }
        new g(accessibilityAction7, 16908358, (String) null, (v) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction8 = null;
        }
        new g(accessibilityAction8, 16908359, (String) null, (v) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        new g(accessibilityAction9, 16908360, (String) null, (v) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction10 = null;
        }
        new g(accessibilityAction10, 16908361, (String) null, (v) null, (Class) null);
        if (i2 >= 23) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction11 = null;
        }
        new g(accessibilityAction11, 16908348, (String) null, (v) null, (Class) null);
        if (i2 >= 24) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction12 = null;
        }
        new g(accessibilityAction12, 16908349, (String) null, (v) null, s.class);
        if (i2 >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        new g(accessibilityAction13, 16908354, (String) null, (v) null, q.class);
        if (i2 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction14 = null;
        }
        new g(accessibilityAction14, 16908356, (String) null, (v) null, (Class) null);
        if (i2 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction15 = null;
        }
        new g(accessibilityAction15, 16908357, (String) null, (v) null, (Class) null);
        if (i2 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction16 = null;
        }
        new g(accessibilityAction16, 16908362, (String) null, (v) null, (Class) null);
        if (i2 >= 30) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction17 = null;
        }
        new g(accessibilityAction17, 16908372, (String) null, (v) null, (Class) null);
        if (i2 >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction18 = null;
        }
        new g(accessibilityAction18, 16908373, (String) null, (v) null, (Class) null);
        if (i2 >= 32) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction19 = null;
        }
        new g(accessibilityAction19, 16908374, (String) null, (v) null, (Class) null);
        if (i2 >= 32) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction20 = null;
        }
        new g(accessibilityAction20, 16908375, (String) null, (v) null, (Class) null);
        if (i2 >= 33) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction21 = null;
        }
        new g(accessibilityAction21, 16908376, (String) null, (v) null, (Class) null);
        if (i2 >= 34) {
            accessibilityAction22 = j.a();
        }
        new g(accessibilityAction22, 16908382, (String) null, (v) null, (Class) null);
    }

    public g(int i2) {
        this((Object) null, i2, (String) null, (v) null, (Class) null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f485a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        Object obj2 = ((g) obj).f485a;
        Object obj3 = this.f485a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f485a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d2 = l.d(this.b);
        if (d2.equals("ACTION_UNKNOWN")) {
            Object obj = this.f485a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d2);
        return sb.toString();
    }

    public g(int i2, Class cls) {
        this((Object) null, i2, (String) null, (v) null, cls);
    }

    public g(Object obj, int i2, String str, v vVar, Class cls) {
        this.b = i2;
        this.f487d = vVar;
        if (obj == null) {
            this.f485a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f485a = obj;
        }
        this.f486c = cls;
    }
}
