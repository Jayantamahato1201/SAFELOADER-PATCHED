package I;

import A.j;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: I.a  reason: case insensitive filesystem */
public final class C0009a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final C0010b f406a;

    public C0009a(C0010b bVar) {
        this.f406a = bVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f406a.a(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        j b = this.f406a.b(view);
        if (b != null) {
            return (AccessibilityNodeProvider) b.b;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f406a.c(view, accessibilityEvent);
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInitializeAccessibilityNodeInfo(android.view.View r19, android.view.accessibility.AccessibilityNodeInfo r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = 1
            J.l r3 = new J.l
            r3.<init>(r1)
            java.util.WeakHashMap r4 = I.O.f393a
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            r6 = 28
            r7 = 0
            if (r4 < r6) goto L_0x001e
            boolean r4 = I.H.d(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x002d
        L_0x001e:
            r4 = 2131231132(0x7f08019c, float:1.8078336E38)
            java.lang.Object r4 = r0.getTag(r4)
            boolean r8 = r5.isInstance(r4)
            if (r8 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r4 = r7
        L_0x002d:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r8 = 0
            if (r4 == 0) goto L_0x003a
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x003a
            r4 = 1
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r6) goto L_0x0043
            r1.setScreenReaderFocusable(r4)
            goto L_0x0046
        L_0x0043:
            r3.h(r2, r4)
        L_0x0046:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r6) goto L_0x0053
            boolean r4 = I.H.c(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0062
        L_0x0053:
            r4 = 2131231127(0x7f080197, float:1.8078326E38)
            java.lang.Object r4 = r0.getTag(r4)
            boolean r5 = r5.isInstance(r4)
            if (r5 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r4 = r7
        L_0x0062:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x006e
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x006e
            r4 = 1
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            if (r9 < r6) goto L_0x0075
            r1.setHeading(r4)
            goto L_0x0079
        L_0x0075:
            r5 = 2
            r3.h(r5, r4)
        L_0x0079:
            java.lang.CharSequence r4 = I.O.d(r0)
            if (r9 < r6) goto L_0x0083
            r1.setPaneTitle(r4)
            goto L_0x008c
        L_0x0083:
            android.os.Bundle r5 = r1.getExtras()
            java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
            r5.putCharSequence(r6, r4)
        L_0x008c:
            r4 = 30
            if (r9 < r4) goto L_0x0095
            java.lang.CharSequence r5 = I.J.b(r0)
            goto L_0x00a6
        L_0x0095:
            r5 = 2131231133(0x7f08019d, float:1.8078338E38)
            java.lang.Object r5 = r0.getTag(r5)
            java.lang.Class<java.lang.CharSequence> r6 = java.lang.CharSequence.class
            boolean r6 = r6.isInstance(r5)
            if (r6 == 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r5 = r7
        L_0x00a6:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r9 < r4) goto L_0x00b0
            J.h.c(r1, r5)
        L_0x00ad:
            r4 = r18
            goto L_0x00ba
        L_0x00b0:
            android.os.Bundle r4 = r1.getExtras()
            java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            r4.putCharSequence(r6, r5)
            goto L_0x00ad
        L_0x00ba:
            I.b r5 = r4.f406a
            r5.d(r0, r3)
            java.lang.CharSequence r5 = r1.getText()
            r6 = 26
            if (r9 >= r6) goto L_0x01e0
            android.os.Bundle r6 = r1.getExtras()
            java.lang.String r9 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            r6.remove(r9)
            android.os.Bundle r6 = r1.getExtras()
            java.lang.String r10 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
            r6.remove(r10)
            android.os.Bundle r6 = r1.getExtras()
            java.lang.String r11 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
            r6.remove(r11)
            android.os.Bundle r6 = r1.getExtras()
            java.lang.String r12 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
            r6.remove(r12)
            r6 = 2131231126(0x7f080196, float:1.8078324E38)
            java.lang.Object r13 = r0.getTag(r6)
            android.util.SparseArray r13 = (android.util.SparseArray) r13
            if (r13 == 0) goto L_0x0131
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r15 = 0
            r16 = 1
        L_0x00fe:
            int r2 = r13.size()
            if (r15 >= r2) goto L_0x011a
            java.lang.Object r2 = r13.valueAt(r15)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0117
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r14.add(r2)
        L_0x0117:
            int r15 = r15 + 1
            goto L_0x00fe
        L_0x011a:
            r2 = 0
        L_0x011b:
            int r15 = r14.size()
            if (r2 >= r15) goto L_0x0133
            java.lang.Object r15 = r14.get(r2)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r13.remove(r15)
            int r2 = r2 + 1
            goto L_0x011b
        L_0x0131:
            r16 = 1
        L_0x0133:
            boolean r2 = r5 instanceof android.text.Spanned
            if (r2 == 0) goto L_0x0147
            r2 = r5
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r7 = r5.length()
            java.lang.Class<android.text.style.ClickableSpan> r13 = android.text.style.ClickableSpan.class
            java.lang.Object[] r2 = r2.getSpans(r8, r7, r13)
            r7 = r2
            android.text.style.ClickableSpan[] r7 = (android.text.style.ClickableSpan[]) r7
        L_0x0147:
            if (r7 == 0) goto L_0x01e2
            int r2 = r7.length
            if (r2 <= 0) goto L_0x01e2
            android.os.Bundle r1 = r1.getExtras()
            java.lang.String r2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
            r13 = 2131230736(0x7f080010, float:1.8077533E38)
            r1.putInt(r2, r13)
            java.lang.Object r1 = r0.getTag(r6)
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            if (r1 != 0) goto L_0x0168
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.setTag(r6, r1)
        L_0x0168:
            r2 = 0
        L_0x0169:
            int r6 = r7.length
            if (r2 >= r6) goto L_0x01e2
            r6 = r7[r2]
            r13 = 0
        L_0x016f:
            int r14 = r1.size()
            if (r13 >= r14) goto L_0x018f
            java.lang.Object r14 = r1.valueAt(r13)
            java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
            java.lang.Object r14 = r14.get()
            android.text.style.ClickableSpan r14 = (android.text.style.ClickableSpan) r14
            boolean r14 = r6.equals(r14)
            if (r14 == 0) goto L_0x018c
            int r6 = r1.keyAt(r13)
            goto L_0x0195
        L_0x018c:
            int r13 = r13 + 1
            goto L_0x016f
        L_0x018f:
            int r6 = J.l.f489c
            int r13 = r6 + 1
            J.l.f489c = r13
        L_0x0195:
            java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
            r14 = r7[r2]
            r13.<init>(r14)
            r1.put(r6, r13)
            r13 = r7[r2]
            r14 = r5
            android.text.Spanned r14 = (android.text.Spanned) r14
            java.util.ArrayList r15 = r3.c(r9)
            int r17 = r14.getSpanStart(r13)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
            r15.add(r8)
            java.util.ArrayList r8 = r3.c(r10)
            int r15 = r14.getSpanEnd(r13)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r8.add(r15)
            java.util.ArrayList r8 = r3.c(r11)
            int r13 = r14.getSpanFlags(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8.add(r13)
            java.util.ArrayList r8 = r3.c(r12)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.add(r6)
            int r2 = r2 + 1
            r8 = 0
            goto L_0x0169
        L_0x01e0:
            r16 = 1
        L_0x01e2:
            r1 = 2131231125(0x7f080195, float:1.8078322E38)
            java.lang.Object r0 = r0.getTag(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x01ef
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L_0x01ef:
            r8 = 0
        L_0x01f0:
            int r1 = r0.size()
            if (r8 >= r1) goto L_0x0202
            java.lang.Object r1 = r0.get(r8)
            J.g r1 = (J.g) r1
            r3.b(r1)
            int r8 = r8 + 1
            goto L_0x01f0
        L_0x0202:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I.C0009a.onInitializeAccessibilityNodeInfo(android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f406a.e(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f406a.f(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return this.f406a.g(view, i2, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i2) {
        this.f406a.h(view, i2);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f406a.i(view, accessibilityEvent);
    }
}
