package H0;

import I.C0010b;
import J.l;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import k.C0245h0;

public final class G extends C0010b {

    /* renamed from: d  reason: collision with root package name */
    public final TextInputLayout f277d;

    public G(TextInputLayout textInputLayout) {
        this.f277d = textInputLayout;
    }

    public final void d(View view, l lVar) {
        Editable editable;
        boolean z2;
        String str;
        l lVar2 = lVar;
        View.AccessibilityDelegate accessibilityDelegate = this.f409a;
        AccessibilityNodeInfo accessibilityNodeInfo = lVar2.f490a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f277d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(editable);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z3 = textInputLayout.f2144u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (!isEmpty3 || !TextUtils.isEmpty(counterOverflowDescription)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        B b = textInputLayout.b;
        C0245h0 h0Var = b.b;
        if (h0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(h0Var);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(h0Var);
            }
        } else if (Build.VERSION.SDK_INT >= 22) {
            accessibilityNodeInfo.setTraversalAfter(b.f267d);
        }
        if (!isEmpty) {
            lVar2.k(editable);
        } else if (!TextUtils.isEmpty(str)) {
            lVar2.k(str);
            if (!z3 && placeholderText != null) {
                lVar2.k(str + ", " + placeholderText);
            }
        } else if (placeholderText != null) {
            lVar2.k(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                lVar2.j(str);
            } else {
                if (!isEmpty) {
                    str = editable + ", " + str;
                }
                lVar2.k(str);
            }
            if (i2 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                lVar2.h(4, isEmpty);
            }
        }
        if (editable == null || editable.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0245h0 h0Var2 = textInputLayout.f2122j.f372y;
        if (h0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(h0Var2);
        }
        textInputLayout.f2110c.b().n(lVar2);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f277d.f2110c.b().o(accessibilityEvent);
    }
}
