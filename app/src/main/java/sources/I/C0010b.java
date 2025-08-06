package I;

import A.j;
import J.l;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: I.b  reason: case insensitive filesystem */
public class C0010b {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f408c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f409a;
    public final C0009a b;

    public C0010b() {
        this(f408c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f409a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public j b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f409a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new j(5, (Object) accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f409a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, l lVar) {
        this.f409a.onInitializeAccessibilityNodeInfo(view, lVar.f490a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f409a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f409a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARNING: type inference failed for: r9v10, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.View r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            r0 = 2131231125(0x7f080195, float:1.8078322E38)
            java.lang.Object r0 = r7.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x000d
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L_0x000d:
            r1 = 0
            r2 = 0
        L_0x000f:
            int r3 = r0.size()
            r4 = 0
            if (r2 >= r3) goto L_0x0055
            java.lang.Object r3 = r0.get(r2)
            J.g r3 = (J.g) r3
            int r5 = r3.a()
            if (r5 != r8) goto L_0x0052
            J.v r0 = r3.f487d
            if (r0 == 0) goto L_0x0055
            java.lang.Class r2 = r3.f486c
            if (r2 != 0) goto L_0x002b
            goto L_0x004d
        L_0x002b:
            java.lang.reflect.Constructor r3 = r2.getDeclaredConstructor(r4)     // Catch:{ Exception -> 0x0036 }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ Exception -> 0x0036 }
            if (r3 != 0) goto L_0x0038
            throw r4     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            r3 = move-exception
            goto L_0x003e
        L_0x0038:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException     // Catch:{ Exception -> 0x0036 }
            r3.<init>()     // Catch:{ Exception -> 0x0036 }
            throw r3     // Catch:{ Exception -> 0x0036 }
        L_0x003e:
            java.lang.String r2 = r2.getName()
            java.lang.String r5 = "Failed to execute command with argument class ViewCommandArgument: "
            java.lang.String r2 = r5.concat(r2)
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r2, r3)
        L_0x004d:
            boolean r0 = r0.a(r7)
            goto L_0x0056
        L_0x0052:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 != 0) goto L_0x005e
            android.view.View$AccessibilityDelegate r0 = r6.f409a
            boolean r0 = r0.performAccessibilityAction(r7, r8, r9)
        L_0x005e:
            if (r0 != 0) goto L_0x00bc
            r2 = 2131230736(0x7f080010, float:1.8077533E38)
            if (r8 != r2) goto L_0x00bc
            if (r9 == 0) goto L_0x00bc
            java.lang.String r8 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r0 = -1
            int r8 = r9.getInt(r8, r0)
            r9 = 2131231126(0x7f080196, float:1.8078324E38)
            java.lang.Object r9 = r7.getTag(r9)
            android.util.SparseArray r9 = (android.util.SparseArray) r9
            if (r9 == 0) goto L_0x00bb
            java.lang.Object r8 = r9.get(r8)
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8
            if (r8 == 0) goto L_0x00bb
            java.lang.Object r8 = r8.get()
            android.text.style.ClickableSpan r8 = (android.text.style.ClickableSpan) r8
            if (r8 == 0) goto L_0x00bb
            android.view.accessibility.AccessibilityNodeInfo r9 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r9 = r9.getText()
            boolean r0 = r9 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x00a5
            r0 = r9
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r9 = r9.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            java.lang.Object[] r9 = r0.getSpans(r1, r9, r2)
            r4 = r9
            android.text.style.ClickableSpan[] r4 = (android.text.style.ClickableSpan[]) r4
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r4 == 0) goto L_0x00bb
            int r0 = r4.length
            if (r9 >= r0) goto L_0x00bb
            r0 = r4[r9]
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00b8
            r8.onClick(r7)
            r1 = 1
            goto L_0x00bb
        L_0x00b8:
            int r9 = r9 + 1
            goto L_0x00a6
        L_0x00bb:
            r0 = r1
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I.C0010b.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public void h(View view, int i2) {
        this.f409a.sendAccessibilityEvent(view, i2);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f409a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0010b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f409a = accessibilityDelegate;
        this.b = new C0009a(this);
    }
}
